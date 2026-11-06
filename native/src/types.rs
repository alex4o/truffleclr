use dotnetdll::prelude::*;
use serde_json::{Value, json};

pub struct Encoder<'r, 'a> {
    pub res: &'r Resolution<'a>,
    pub methods: &'r [MethodIndex],
}

impl Encoder<'_, '_> {
    pub fn user_type(&self, t: UserType) -> Value {
        let r = self.res;
        match t {
            UserType::Definition(i) => {
                let d = &r[i];
                json!({"kind":"named", "scope":{"kind":"current_module"},
                    "namespace":d.namespace, "name":d.name,
                    "encloser":d.encloser.map(|p| self.user_type(p.into()))})
            }
            UserType::Reference(i) => {
                let d = &r[i];
                let (scope, encloser) = match d.scope {
                    ResolutionScope::CurrentModule => {
                        (json!({"kind":"current_module"}), Value::Null)
                    }
                    ResolutionScope::Assembly(a) => {
                        (json!({"kind":"assembly","name":r[a].name}), Value::Null)
                    }
                    ResolutionScope::ExternalModule(m) => {
                        (json!({"kind":"module","name":r[m].name}), Value::Null)
                    }
                    ResolutionScope::Nested(p) => {
                        let parent = self.user_type(p.into());
                        (parent["scope"].clone(), parent)
                    }
                    ResolutionScope::Exported => (json!({"kind":"exported"}), Value::Null),
                };
                json!({"kind":"named","scope":scope,"namespace":d.namespace,"name":d.name,"encloser":encloser})
            }
        }
    }

    pub fn source<T>(&self, s: &TypeSource<T>, encode: impl Fn(&T) -> Value) -> Value {
        match s {
            TypeSource::User(u) => self.user_type(*u),
            TypeSource::Generic { base, parameters } => {
                json!({"kind":"generic", "base":self.user_type(*base),
                "arguments":parameters.iter().map(encode).collect::<Vec<_>>() })
            }
        }
    }

    pub fn modifiers(&self, m: &[CustomTypeModifier]) -> Value {
        json!(
            m.iter()
                .map(|m| match m {
                    CustomTypeModifier::Optional(t) =>
                        json!({"required":false,"type":self.user_type(*t)}),
                    CustomTypeModifier::Required(t) =>
                        json!({"required":true,"type":self.user_type(*t)}),
                })
                .collect::<Vec<_>>()
        )
    }

    pub fn member_type(&self, t: &MemberType) -> Value {
        match t {
            MemberType::Base(b) => self.base(b, |t| self.member_type(t)),
            MemberType::TypeGeneric(i) => json!({"kind":"type_generic","index":i}),
        }
    }

    pub fn method_type(&self, t: &MethodType) -> Value {
        match t {
            MethodType::Base(b) => self.base(b, |t| self.method_type(t)),
            MethodType::TypeGeneric(i) => json!({"kind":"type_generic","index":i}),
            MethodType::MethodGeneric(i) => json!({"kind":"method_generic","index":i}),
        }
    }

    fn base<T>(&self, b: &BaseType<T>, encode: impl Fn(&T) -> Value) -> Value {
        use BaseType::*;
        let kind = match b {
            Boolean => "Boolean",
            Char => "Char",
            Int8 => "Int8",
            UInt8 => "UInt8",
            Int16 => "Int16",
            UInt16 => "UInt16",
            Int32 => "Int32",
            UInt32 => "UInt32",
            Int64 => "Int64",
            UInt64 => "UInt64",
            Float32 => "Float32",
            Float64 => "Float64",
            IntPtr => "IntPtr",
            UIntPtr => "UIntPtr",
            Object => "Object",
            String => "String",
            Type { value_kind, source } => {
                let mut v = self.source(source, encode);
                v["value_kind"] = match value_kind {
                    None => Value::Null,
                    Some(ValueKind::Class) => json!("class"),
                    Some(ValueKind::ValueType) => json!("value_type"),
                };
                return v;
            }
            Vector(m, t) => {
                return json!({"kind":"vector","element":encode(t),"modifiers":self.modifiers(m)});
            }
            Array(t, s) => {
                return json!({"kind":"array","element":encode(t),"rank":s.rank,
                "sizes":s.sizes,"lower_bounds":s.lower_bounds});
            }
            ValuePointer(m, t) => {
                return json!({"kind":"pointer","element":t.as_ref().map(encode),"modifiers":self.modifiers(m)});
            }
            FunctionPointer(s) => {
                return json!({"kind":"function_pointer","signature":self.signature(s, encode, standalone_convention)});
            }
        };
        json!({"kind":kind})
    }

    fn parameter<T>(&self, p: &ParameterType<T>, encode: &impl Fn(&T) -> Value) -> Value {
        match p {
            ParameterType::Value(t) => json!({"kind":"value","type":encode(t)}),
            ParameterType::Ref(t) => json!({"kind":"by_ref","type":encode(t)}),
            ParameterType::TypedReference => json!({"kind":"typed_reference"}),
        }
    }

    pub fn signature<C, T>(
        &self,
        s: &MethodSignature<C, T>,
        encode: impl Fn(&T) -> Value,
        convention: impl Fn(&C) -> Value,
    ) -> Value {
        let parameter = |p: &Parameter<T>| {
            let mut v = self.parameter(&p.1, &encode);
            v["modifiers"] = self.modifiers(&p.0);
            v
        };
        let mut ret = s
            .return_type
            .1
            .as_ref()
            .map(|p| self.parameter(p, &encode))
            .unwrap_or(json!({"kind":"void"}));
        ret["modifiers"] = self.modifiers(&s.return_type.0);
        json!({"instance":s.instance,"explicit_this":s.explicit_this,"calling_convention":convention(&s.calling_convention),
            "parameters":s.parameters.iter().map(&parameter).collect::<Vec<_>>(), "return_type":ret,
            "varargs":s.varargs.as_ref().map(|v| v.iter().map(parameter).collect::<Vec<_>>())})
    }

    pub fn managed_signature(&self, s: &ManagedMethod<MethodType>) -> Value {
        self.signature(
            s,
            |t| self.method_type(t),
            |c| match c {
                CallingConvention::Default => json!({"kind":"default"}),
                CallingConvention::Vararg => json!({"kind":"vararg"}),
                CallingConvention::Generic(n) => json!({"kind":"generic","arity":n}),
            },
        )
    }

    pub fn local(&self, l: &LocalVariable) -> Value {
        match l {
            LocalVariable::TypedReference => json!({"kind":"typed_reference"}),
            LocalVariable::Variable {
                custom_modifiers,
                pinned,
                by_ref,
                var_type,
            } => json!({
                "kind":"variable","type":self.method_type(var_type),"pinned":pinned,"by_ref":by_ref,
                "modifiers":self.modifiers(custom_modifiers)}),
        }
    }
}

pub fn standalone_convention(c: &StandAloneCallingConvention) -> Value {
    use StandAloneCallingConvention::*;
    json!({"kind": match c {
        DefaultManaged => "default_managed", DefaultUnmanaged => "default_unmanaged",
        Cdecl => "cdecl", Stdcall => "stdcall", Thiscall => "thiscall", Fastcall => "fastcall", Vararg => "vararg",
    }})
}

use crate::types::Encoder;
use dotnetdll::prelude::*;
use serde_json::{Value, json};

// Include semantic methods moved out of TypeDefinition.methods by the resolver.
pub fn method_indices(r: &Resolution<'_>) -> Vec<MethodIndex> {
    let mut methods = Vec::new();
    for (t, _) in r.enumerate_type_definitions() {
        methods.extend(r.enumerate_methods(t).map(|(i, _)| i));
        for (p, property) in r.enumerate_properties(t) {
            methods.extend(r.property_getter_index(p));
            methods.extend(r.property_setter_index(p));
            methods.extend((0..property.other.len()).filter_map(|i| r.property_other_index(p, i)));
        }
        for (e, event) in r.enumerate_events(t) {
            methods.push(r.event_add_index(e));
            methods.push(r.event_remove_index(e));
            methods.extend(r.event_raise_index(e));
            methods.extend((0..event.other.len()).filter_map(|i| r.event_other_index(e, i)));
        }
    }
    methods
}

impl Encoder<'_, '_> {
    pub fn method_id(&self, i: MethodIndex) -> usize {
        self.method_ids[&i]
    }

    pub fn user_method(&self, m: UserMethod) -> Value {
        let r = self.res;
        match m {
            UserMethod::Definition(i) => {
                let m = &r[i];
                json!({"kind":"method","id":self.method_id(i),"owner":self.user_type(i.parent_type().into()),
                    "name":m.name,"signature":self.managed_signature(&m.signature)})
            }
            UserMethod::Reference(i) => {
                let m = &r[i];
                let owner = match &m.parent {
                    MethodReferenceParent::Type(t) => self.method_type(t),
                    MethodReferenceParent::Module(i) => json!({"kind":"module","name":r[*i].name}),
                    MethodReferenceParent::VarargMethod(i) => {
                        self.user_type(i.parent_type().into())
                    }
                };
                json!({"kind":"method","owner":owner,"name":m.name,"signature":self.managed_signature(&m.signature)})
            }
        }
    }

    pub fn method_source(&self, m: &MethodSource) -> Value {
        match m {
            MethodSource::User(m) => self.user_method(*m),
            MethodSource::Generic(g) => json!({"kind":"generic","base":self.user_method(g.base),
                "arguments":g.parameters.iter().map(|t| self.method_type(t)).collect::<Vec<_>>() }),
        }
    }

    pub fn field_source(&self, f: &FieldSource) -> Value {
        let r = self.res;
        match f {
            FieldSource::Definition(i) => {
                let f = &r[*i];
                let id = r
                    .enumerate_fields(i.parent_type())
                    .position(|(idx, _)| idx == *i)
                    .unwrap();
                json!({"kind":"field","id":id,"owner":self.user_type(i.parent_type().into()),
                    "name":f.name,"type":self.member_type(&f.return_type),"static":f.static_member,
                    "by_ref":f.by_ref,"modifiers":self.modifiers(&f.type_modifiers)})
            }
            FieldSource::Reference(i) => {
                let f = &r[*i];
                let owner = match &f.parent {
                    FieldReferenceParent::Type(t) => self.method_type(t),
                    FieldReferenceParent::Module(i) => json!({"kind":"module","name":r[*i].name}),
                };
                json!({"kind":"field","owner":owner,"name":f.name,"type":self.member_type(&f.field_type),
                    "modifiers":self.modifiers(&f.custom_modifiers)})
            }
        }
    }

    // dotnetdll exposes the remaining PE section, not the extent of this RVA field.
    // Never serialize that tail: repeated section tails can expand a small DLL to gigabytes.
    fn initial_value<'a>(&self, field: &'a Field<'_>) -> Result<Option<&'a [u8]>, String> {
        let Some(data) = field.initial_value.as_deref() else {
            return Ok(None);
        };
        use BaseType::*;
        let size = match &field.return_type {
            MemberType::Base(base) => match base.as_ref() {
                Boolean | Int8 | UInt8 => Some(1),
                Char | Int16 | UInt16 => Some(2),
                Int32 | UInt32 | Float32 => Some(4),
                Int64 | UInt64 | Float64 => Some(8),
                Type {
                    source: TypeSource::User(UserType::Definition(i)),
                    ..
                } => match self.res[*i].flags.layout {
                    Layout::Sequential(Some(layout)) => Some(layout.class_size),
                    Layout::Explicit(Some(layout)) => Some(layout.class_size),
                    _ => None,
                },
                _ => None,
            },
            _ => None,
        }
        .filter(|&size| size > 0)
        .ok_or_else(|| format!("unsupported RVA field layout: {}", field.name))?;
        data.get(..size).map(Some).ok_or_else(|| {
            format!(
                "truncated RVA field data: {} (expected {size} bytes)",
                field.name
            )
        })
    }

    pub fn type_metadata(&self, id: usize) -> Result<Value, String> {
        let r = self.res;
        let ti = r
            .type_definition_index(id)
            .ok_or_else(|| format!("invalid type id: {id}"))?;
        let t = &r[ti];
        let initial_values = t
            .fields
            .iter()
            .map(|f| self.initial_value(f))
            .collect::<Result<Vec<_>, _>>()?;
        let fields = t.fields.iter().enumerate().map(|(id,f)| json!({"id":id,"name":f.name,
                "type":self.member_type(&f.return_type),"static":f.static_member,"literal":f.literal,
                "constant":f.default.as_ref().map(constant),"init_only":f.init_only,"by_ref":f.by_ref,
                "modifiers":self.modifiers(&f.type_modifiers),"initial_value":initial_values[id],"offset":f.offset,
                "accessibility":f.accessibility.to_mask()})).collect::<Vec<_>>();
        let methods = self.type_methods[id].clone().map(|id| {
                let m = &r[self.methods[id]];
                json!({"id":id,"name":m.name,"signature":self.managed_signature(&m.signature),
                    "generic":m.generic_parameters.iter().map(|g| g.name.as_ref()).collect::<Vec<_>>(),
                    "virtual":m.virtual_member,"abstract":m.abstract_member,"internal_call":m.internal_call,
                    "sealed":m.sealed,"new_slot":matches!(m.vtable_layout,VtableLayout::NewSlot),
                    "accessibility":m.accessibility.to_mask(),"pinvoke":m.pinvoke.as_ref().map(|p| json!({
                        "name":p.import_name,"module":r[p.import_scope].name}))})
            }).collect::<Vec<_>>();
        Ok(
            json!({"id":id,"type":self.user_type(ti.into()),"extends":t.extends.as_ref().map(|s| self.source(s, |t| self.member_type(t))),
                "implements":t.implements.iter().map(|(_,s)| self.source(s,|t| self.member_type(t))).collect::<Vec<_>>(),
                "generic":t.generic_parameters.iter().map(|g| g.name.as_ref()).collect::<Vec<_>>(),
                "variant":t.generic_parameters.iter().any(|g| !matches!(g.variance, dotnetdll::resolved::generic::Variance::Invariant)),
                "flags":t.flags.to_mask(),"fields":fields,"methods":methods,
                "overrides":t.overrides.iter().map(|o| json!({"implementation":self.user_method(o.implementation),
                    "declaration":self.user_method(o.declaration)})).collect::<Vec<_>>()}),
        )
    }

    pub fn metadata(&self) -> Result<Value, String> {
        let types = (0..self.type_methods.len())
            .map(|id| self.type_metadata(id))
            .collect::<Result<Vec<_>, _>>()?;
        Ok(self.assembly(types))
    }

    pub fn index(&self) -> Value {
        let types = self
            .res
            .enumerate_type_definitions()
            .enumerate()
            .map(|(id, (ti, t))| {
                json!({"id":id,"type":self.user_type(ti.into()),
                "generic":t.generic_parameters.iter().map(|g| g.name.as_ref()).collect::<Vec<_>>()})
            })
            .collect();
        self.assembly(types)
    }

    fn assembly(&self, types: Vec<Value>) -> Value {
        let r = self.res;
        let entry = r.entry_point.map(|e| match e {
            EntryPoint::Method(i) => json!({"kind":"method","id":self.method_id(i),"owner_id":self.type_ids[&i.parent_type()]}),
            EntryPoint::File(i) => json!({"kind":"file","name":r[i].name}),
        });
        json!({"schema_version":1,"assembly":r.assembly.as_ref().map(|a| a.name.as_ref()),
            "module":r.module.name,"entry_point":entry,"types":types})
    }
}

pub fn constant(c: &Constant) -> Value {
    use Constant::*;
    macro_rules! value { ($kind:expr,$v:expr) => { json!({"kind":$kind,"value":$v}) }; }
    match c {
        Boolean(v) => value!("Boolean", v),
        Char(v) => value!("Char", v),
        Int8(v) => value!("Int8", v),
        UInt8(v) => value!("UInt8", v),
        Int16(v) => value!("Int16", v),
        UInt16(v) => value!("UInt16", v),
        Int32(v) => value!("Int32", v),
        UInt32(v) => value!("UInt32", v),
        Int64(v) => value!("Int64", v),
        UInt64(v) => value!("UInt64", v),
        Float32(v) => json!({"kind":"Float32","bits":v.to_bits()}),
        Float64(v) => json!({"kind":"Float64","bits":v.to_bits()}),
        String(v) => value!("String", v),
        Null => json!({"kind":"Null"}),
    }
}

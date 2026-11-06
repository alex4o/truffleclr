use crate::types::{Encoder, standalone_convention};
use dotnetdll::prelude::*;
use serde_json::{Value, json};

fn sign(s: &NumberSign) -> &'static str {
    match s {
        NumberSign::Signed => "signed",
        NumberSign::Unsigned => "unsigned",
    }
}
fn conversion(t: &ConversionType) -> &'static str {
    use ConversionType::*;
    match t {
        Int8 => "Int8",
        UInt8 => "UInt8",
        Int16 => "Int16",
        UInt16 => "UInt16",
        Int32 => "Int32",
        UInt32 => "UInt32",
        Int64 => "Int64",
        UInt64 => "UInt64",
        IntPtr => "IntPtr",
        UIntPtr => "UIntPtr",
    }
}
fn load(t: &LoadType) -> &'static str {
    use LoadType::*;
    match t {
        Int8 => "Int8",
        UInt8 => "UInt8",
        Int16 => "Int16",
        UInt16 => "UInt16",
        Int32 => "Int32",
        UInt32 => "UInt32",
        Int64 => "Int64",
        Float32 => "Float32",
        Float64 => "Float64",
        IntPtr => "IntPtr",
        Object => "Object",
    }
}
fn store(t: &StoreType) -> &'static str {
    use StoreType::*;
    match t {
        Int8 => "Int8",
        Int16 => "Int16",
        Int32 => "Int32",
        Int64 => "Int64",
        Float32 => "Float32",
        Float64 => "Float64",
        IntPtr => "IntPtr",
        Object => "Object",
    }
}
fn alignment(a: &Option<Alignment>) -> Option<u8> {
    a.map(|a| match a {
        Alignment::Byte => 1,
        Alignment::Double => 2,
        Alignment::Quad => 4,
    })
}

impl Encoder<'_, '_> {
    // Exhaustive by construction: adding an upstream variant must fail compilation here.
    // No Debug/Display parsing; flags stay attached to their source instruction.
    pub fn instruction(&self, i: &Instruction) -> Value {
        use Instruction::*;
        macro_rules! op { ($name:ident $(,$k:literal:$v:expr)* $(,)?) => { json!({"op":stringify!($name),$($k:$v),*}) }; }
        match i {
            Add => op!(Add),
            AddOverflow(s) => op!(AddOverflow,"sign":sign(s)),
            And => op!(And),
            ArgumentList => op!(ArgumentList),
            BranchEqual(t) => op!(BranchEqual,"target":t),
            BranchGreaterOrEqual(s, t) => op!(BranchGreaterOrEqual,"sign":sign(s),"target":t),
            BranchGreater(s, t) => op!(BranchGreater,"sign":sign(s),"target":t),
            BranchLessOrEqual(s, t) => op!(BranchLessOrEqual,"sign":sign(s),"target":t),
            BranchLess(s, t) => op!(BranchLess,"sign":sign(s),"target":t),
            BranchNotEqual(t) => op!(BranchNotEqual,"target":t),
            Branch(t) => op!(Branch,"target":t),
            Breakpoint => op!(Breakpoint),
            BranchFalsy(t) => op!(BranchFalsy,"target":t),
            BranchTruthy(t) => op!(BranchTruthy,"target":t),
            Call { tail_call, param0 } => {
                op!(Call,"tail_call":tail_call,"method":self.method_source(param0))
            }
            CallConstrained(t, m) => {
                op!(CallConstrained,"type":self.method_type(t),"method":self.method_source(m))
            }
            CallIndirect { tail_call, param0 } => op!(CallIndirect,"tail_call":tail_call,
                "signature":self.signature(param0,|t| self.method_type(t),standalone_convention)),
            CompareEqual => op!(CompareEqual),
            CompareGreater(s) => op!(CompareGreater,"sign":sign(s)),
            CheckFinite => op!(CheckFinite),
            CompareLess(s) => op!(CompareLess,"sign":sign(s)),
            Convert(t) => op!(Convert,"type":conversion(t)),
            ConvertOverflow(t, s) => op!(ConvertOverflow,"type":conversion(t),"sign":sign(s)),
            ConvertFloat32 => op!(ConvertFloat32),
            ConvertFloat64 => op!(ConvertFloat64),
            ConvertUnsignedToFloat => op!(ConvertUnsignedToFloat),
            CopyMemoryBlock {
                unaligned,
                volatile,
            } => op!(CopyMemoryBlock,"unaligned":alignment(unaligned),"volatile":volatile),
            Divide(s) => op!(Divide,"sign":sign(s)),
            Duplicate => op!(Duplicate),
            EndFilter => op!(EndFilter),
            EndFinally => op!(EndFinally),
            InitializeMemoryBlock {
                unaligned,
                volatile,
            } => op!(InitializeMemoryBlock,"unaligned":alignment(unaligned),"volatile":volatile),
            Jump(m) => op!(Jump,"method":self.method_source(m)),
            LoadArgument(n) => op!(LoadArgument,"index":n),
            LoadArgumentAddress(n) => op!(LoadArgumentAddress,"index":n),
            LoadConstantInt32(v) => op!(LoadConstantInt32,"value":v),
            LoadConstantInt64(v) => op!(LoadConstantInt64,"value":v),
            LoadConstantFloat32(v) => op!(LoadConstantFloat32,"bits":v.to_bits()),
            LoadConstantFloat64(v) => op!(LoadConstantFloat64,"bits":v.to_bits()),
            LoadMethodPointer(m) => op!(LoadMethodPointer,"method":self.method_source(m)),
            LoadIndirect {
                unaligned,
                volatile,
                param0,
            } => {
                op!(LoadIndirect,"unaligned":alignment(unaligned),"volatile":volatile,"type":load(param0))
            }
            LoadLocal(n) => op!(LoadLocal,"index":n),
            LoadLocalAddress(n) => op!(LoadLocalAddress,"index":n),
            LoadNull => op!(LoadNull),
            Leave(t) => op!(Leave,"target":t),
            LocalMemoryAllocate => op!(LocalMemoryAllocate),
            Multiply => op!(Multiply),
            MultiplyOverflow(s) => op!(MultiplyOverflow,"sign":sign(s)),
            Negate => op!(Negate),
            NoOperation => op!(NoOperation),
            Not => op!(Not),
            Or => op!(Or),
            Pop => op!(Pop),
            Remainder(s) => op!(Remainder,"sign":sign(s)),
            Return => op!(Return),
            ShiftLeft => op!(ShiftLeft),
            ShiftRight(s) => op!(ShiftRight,"sign":sign(s)),
            StoreArgument(n) => op!(StoreArgument,"index":n),
            StoreIndirect {
                unaligned,
                volatile,
                param0,
            } => {
                op!(StoreIndirect,"unaligned":alignment(unaligned),"volatile":volatile,"type":store(param0))
            }
            StoreLocal(n) => op!(StoreLocal,"index":n),
            Subtract => op!(Subtract),
            SubtractOverflow(s) => op!(SubtractOverflow,"sign":sign(s)),
            Switch(t) => op!(Switch,"targets":t),
            Xor => op!(Xor),
            BoxValue(t) => op!(BoxValue,"type":self.method_type(t)),
            CallVirtual {
                skip_null_check,
                param0,
            } => {
                op!(CallVirtual,"skip_null_check":skip_null_check,"method":self.method_source(param0))
            }
            CallVirtualConstrained(t, m) => {
                op!(CallVirtualConstrained,"type":self.method_type(t),"method":self.method_source(m))
            }
            CallVirtualTail(m) => op!(CallVirtualTail,"method":self.method_source(m)),
            CastClass {
                skip_type_check,
                param0,
            } => op!(CastClass,"skip_type_check":skip_type_check,"type":self.method_type(param0)),
            CopyObject(t) => op!(CopyObject,"type":self.method_type(t)),
            InitializeForObject(t) => op!(InitializeForObject,"type":self.method_type(t)),
            IsInstance(t) => op!(IsInstance,"type":self.method_type(t)),
            LoadElement {
                skip_range_check,
                skip_null_check,
                param0,
            } => {
                op!(LoadElement,"skip_range_check":skip_range_check,"skip_null_check":skip_null_check,"type":self.method_type(param0))
            }
            LoadElementPrimitive {
                skip_range_check,
                skip_null_check,
                param0,
            } => {
                op!(LoadElementPrimitive,"skip_range_check":skip_range_check,"skip_null_check":skip_null_check,"type":load(param0))
            }
            LoadElementAddress {
                skip_type_check,
                skip_range_check,
                skip_null_check,
                param0,
            } => {
                op!(LoadElementAddress,"skip_type_check":skip_type_check,"skip_range_check":skip_range_check,"skip_null_check":skip_null_check,"type":self.method_type(param0))
            }
            LoadElementAddressReadonly(t) => {
                op!(LoadElementAddressReadonly,"type":self.method_type(t))
            }
            LoadField {
                unaligned,
                volatile,
                param0,
            } => {
                op!(LoadField,"unaligned":alignment(unaligned),"volatile":volatile,"field":self.field_source(param0))
            }
            LoadFieldAddress(f) => op!(LoadFieldAddress,"field":self.field_source(f)),
            LoadFieldSkipNullCheck(f) => op!(LoadFieldSkipNullCheck,"field":self.field_source(f)),
            LoadLength => op!(LoadLength),
            LoadObject {
                unaligned,
                volatile,
                param0,
            } => {
                op!(LoadObject,"unaligned":alignment(unaligned),"volatile":volatile,"type":self.method_type(param0))
            }
            LoadStaticField { volatile, param0 } => {
                op!(LoadStaticField,"volatile":volatile,"field":self.field_source(param0))
            }
            LoadStaticFieldAddress(f) => op!(LoadStaticFieldAddress,"field":self.field_source(f)),
            LoadString(v) => op!(LoadString,"value":v),
            LoadTokenField(f) => op!(LoadTokenField,"field":self.field_source(f)),
            LoadTokenMethod(m) => op!(LoadTokenMethod,"method":self.method_source(m)),
            LoadTokenType(t) => op!(LoadTokenType,"type":self.method_type(t)),
            LoadVirtualMethodPointer {
                skip_null_check,
                param0,
            } => {
                op!(LoadVirtualMethodPointer,"skip_null_check":skip_null_check,"method":self.method_source(param0))
            }
            MakeTypedReference(t) => op!(MakeTypedReference,"type":self.method_type(t)),
            NewArray(t) => op!(NewArray,"type":self.method_type(t)),
            NewObject(m) => op!(NewObject,"method":self.user_method(*m)),
            ReadTypedReferenceType => op!(ReadTypedReferenceType),
            ReadTypedReferenceValue(t) => op!(ReadTypedReferenceValue,"type":self.method_type(t)),
            Rethrow => op!(Rethrow),
            Sizeof(t) => op!(Sizeof,"type":self.method_type(t)),
            StoreElement {
                skip_type_check,
                skip_range_check,
                skip_null_check,
                param0,
            } => {
                op!(StoreElement,"skip_type_check":skip_type_check,"skip_range_check":skip_range_check,"skip_null_check":skip_null_check,"type":self.method_type(param0))
            }
            StoreElementPrimitive {
                skip_type_check,
                skip_range_check,
                skip_null_check,
                param0,
            } => {
                op!(StoreElementPrimitive,"skip_type_check":skip_type_check,"skip_range_check":skip_range_check,"skip_null_check":skip_null_check,"type":store(param0))
            }
            StoreField {
                unaligned,
                volatile,
                param0,
            } => {
                op!(StoreField,"unaligned":alignment(unaligned),"volatile":volatile,"field":self.field_source(param0))
            }
            StoreFieldSkipNullCheck(f) => op!(StoreFieldSkipNullCheck,"field":self.field_source(f)),
            StoreObject {
                unaligned,
                volatile,
                param0,
            } => {
                op!(StoreObject,"unaligned":alignment(unaligned),"volatile":volatile,"type":self.method_type(param0))
            }
            StoreStaticField { volatile, param0 } => {
                op!(StoreStaticField,"volatile":volatile,"field":self.field_source(param0))
            }
            Throw => op!(Throw),
            UnboxIntoAddress {
                skip_type_check,
                param0,
            } => {
                op!(UnboxIntoAddress,"skip_type_check":skip_type_check,"type":self.method_type(param0))
            }
            UnboxIntoValue(t) => op!(UnboxIntoValue,"type":self.method_type(t)),
        }
    }

    pub fn body(&self, id: usize) -> Result<Value, String> {
        let i = *self
            .methods
            .get(id)
            .ok_or_else(|| format!("invalid method id {id}"))?;
        let b = self.res.method_body(i).map_err(|e| e.to_string())?;
        let mut eh = Vec::new();
        for section in &b.data_sections {
            match section {
                body::DataSection::Unrecognized { .. } => {
                    return Err("unrecognized method data section".into());
                }
                body::DataSection::ExceptionHandlers(clauses) => {
                    for c in clauses {
                        let mut clause = match &c.kind {
                            body::ExceptionKind::TypedException(t) => {
                                json!({"kind":"catch","catch_type":self.method_type(t)})
                            }
                            body::ExceptionKind::Filter { offset } => {
                                json!({"kind":"filter","filter_start":offset})
                            }
                            body::ExceptionKind::Finally => json!({"kind":"finally"}),
                            body::ExceptionKind::Fault => json!({"kind":"fault"}),
                        };
                        // Patched vendor lazy.rs converts EH byte ranges (and filter offsets)
                        // to instruction ranges. Do NOT apply byte-offset arithmetic here.
                        clause["try_start"] = json!(c.try_offset);
                        clause["try_end"] = json!(
                            c.try_offset
                                .checked_add(c.try_length)
                                .ok_or("try range overflow")?
                        );
                        clause["handler_start"] = json!(c.handler_offset);
                        clause["handler_end"] = json!(
                            c.handler_offset
                                .checked_add(c.handler_length)
                                .ok_or("handler range overflow")?
                        );
                        eh.push(clause);
                    }
                }
            }
        }
        Ok(
            json!({"method_id":id,"init_locals":b.header.initialize_locals,"max_stack":b.header.maximum_stack_size,
            "locals":b.header.local_variables.iter().map(|l| self.local(l)).collect::<Vec<_>>(),
            "code":b.instructions.iter().map(|i| self.instruction(i)).collect::<Vec<_>>(),"eh":eh}),
        )
    }
}

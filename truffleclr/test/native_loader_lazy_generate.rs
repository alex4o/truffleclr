// Fixture generator, not a unit test. Run in a temporary Cargo project with
// dotnetdll = { path = "<repo>/native/vendor/dotnetdll" }.
// cargo run -- <test-directory>
// Outputs are checked in; launcher tests need neither Rust nor .NET to use them.
use dotnetdll::prelude::*;

fn main() {
    let args: Vec<_> = std::env::args().collect();
    let output = std::path::Path::new(&args[1]);
    let mut res = Resolution::new(Module::new("native_loader_lazy.dll"));
    res.assembly = Some(Assembly::new("native_loader_lazy"));
    let core = res.push_assembly_reference(ExternalAssemblyReference::new("mscorlib"));
    let object = res.push_type_reference(type_ref! { System.Object in #core });
    let value = res.push_type_reference(type_ref! { System.ValueType in #core });
    let program = res.push_type_definition(TypeDefinition::new(Some("HelloWorld".into()), "Program"));
    res[program].set_extends(object);
    let main = res.push_method(program, Method::new(Accessibility::Public,
        msig! { static int () }, "Main", Some(body::Method::new(asm! { LoadConstantInt32 7; Return; }))));
    res.set_entry_point(main);
    let unrelated = res.push_type_definition(TypeDefinition::new(Some("HelloWorld".into()), "Unrelated"));
    res[unrelated].set_extends(object);
    res.push_method(unrelated, Method::new(Accessibility::Public,
        msig! { static int () }, "Answer", Some(body::Method::new(asm! { LoadConstantInt32 42; Return; }))));
    let bad = res.push_type_definition(TypeDefinition::new(Some("HelloWorld".into()), "Recursive"));
    res[bad].set_extends(value);
    // dotnetdll 0.4 writer emits an invalid method range for a trailing empty type.
    res.push_method(bad, Method::new(Accessibility::Public,
        msig! { static int () }, "Unused", Some(body::Method::new(asm! { LoadConstantInt32 0; Return; }))));
    // C# rejects this recursively embedded value field. The PE writer permits
    // it, so loading the unused type exercises runtime shape publication failure.
    res.push_field(bad, Field::instance(Accessibility::Public, "Self", BaseType::valuetype(bad).into()));
    let bad_type: MethodType = BaseType::valuetype(bad).into();
    let mut touch = body::Method::new(asm! {
        LoadLocalAddress 0; InitializeForObject bad_type.clone(); LoadConstantInt32 0; Return;
    });
    touch.header.local_variables.push(LocalVariable::Variable {
        custom_modifiers: vec![], pinned: false, by_ref: false, var_type: bad_type,
    });
    res.push_method(program, Method::new(Accessibility::Public,
        msig! { static int () }, "TouchBad", Some(touch)));
    let carrier = res.push_type_definition(TypeDefinition::new(Some("HelloWorld".into()), "RvaCarrier"));
    res[carrier].set_extends(object);
    res.push_method(carrier, Method::new(Accessibility::Public,
        msig! { static int () }, "Unused", Some(body::Method::new(asm! { LoadConstantInt32 0; Return; }))));
    let mut data = Field::static_member(Accessibility::Public, "Data", ctype! { int });
    data.initial_value = Some(vec![4, 3, 2, 1].into());
    let data = res.push_field(carrier, data);
    res.push_method(program, Method::new(Accessibility::Public,
        msig! { static int () }, "ReadRva", Some(body::Method::new(vec![
            Instruction::LoadStaticField { volatile: false, param0: data.into() }, Instruction::Return,
        ]))));
    std::fs::write(output.join("dll/native_loader_lazy.dll"), res.write(WriteOptions::default()).unwrap()).unwrap();
}

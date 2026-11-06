// Fixture generator, not a unit test. Run in a temporary Cargo project with
// dotnetdll = { path = "<repo>/native/vendor/dotnetdll" }.
// cargo run -- <test-directory> <compiled-native_loader_rva.cs.dll>
// Build the C# input in a temporary SDK library project targeting net10.0 with
// Optimize=true, GenerateAssemblyInfo=false, GenerateTargetFrameworkAttribute=false.
// Copy native_loader_rva.cs as its only source; dotnet build -o <temporary-output>.
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
    std::fs::write(output.join("dll/native_loader_lazy.dll"), res.write(WriteOptions::default()).unwrap()).unwrap();

    let bytes = std::fs::read(&args[2]).unwrap();
    let mut rva = Resolution::parse(&bytes, ReadOptions::default()).unwrap();
    let owner = rva.type_definition_index(1).unwrap();
    for (name, ty, data) in [
        ("ByteRva", ctype! { byte }, vec![0x7b]),
        ("IntRva", ctype! { int }, vec![0x04, 0x03, 0x02, 0x01]),
    ] {
        let mut field = Field::static_member(Accessibility::Public, name, ty);
        field.initial_value = Some(data.into());
        rva.push_field(owner, field);
    }
    std::fs::write(output.join("dll/native_loader_rva.dll"), rva.write(WriteOptions::default()).unwrap()).unwrap();
}

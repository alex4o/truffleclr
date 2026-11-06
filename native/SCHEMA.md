# DLL reader ABI / schema version 1

Library name: `dllreader` (`libdllreader.dylib`, `libdllreader.so`, `dllreader.dll`).

```c
#include <stdint.h>
#include <stddef.h>
void *dll_open(const uint8_t *bytes, size_t len);
char *dll_last_error(void);
char *dll_metadata(const void *handle);
char *dll_body(const void *handle, uint64_t method_id);
void dll_free(char *json);
void dll_close(void *handle);
```

Open copies bytes. A null return means failure: call `dll_last_error` on the
same thread. It returns `{"error":"message"}` or `{"error":null}`. Metadata/body
return `{"error":"message"}` on failure. All returned strings are owned,
NUL-terminated UTF-8 JSON and must be passed to `dll_free`. Close once, never
concurrently with another handle operation. Null free/close are harmless.
Handles retain both backing bytes and a lazy Resolution until close. Metadata
never requests bodies; `dll_body` requests and caches decoding via method_body.
C ABI panics are caught (not invalid pointers, OOM aborts, or process signals).

## Metadata

```text
{
 schema_version:1, assembly:string|null, module:string,
 entry_point:{kind:"method",id:MethodId}|{kind:"file",name:string}|null,
 types:[{
  id:integer, type:Type,
  extends:Type|null, implements:[Type], generic:[string], variant:bool, flags:uint32,
  fields:[{id:integer,name:string,type:Type,static:bool,literal:bool,
    constant:Constant|null,init_only:bool,by_ref:bool,modifiers:[Modifier],
    initial_value:[uint8]|null,offset:integer|null,accessibility:uint16}],
  methods:[{id:MethodId,name:string,signature:Signature,generic:[string],
    virtual:bool,abstract:bool,internal_call:bool,sealed:bool,new_slot:bool,
    accessibility:uint16,pinvoke:{name:string,module:string}|null}],
  overrides:[{implementation:MethodRef,declaration:MethodRef}]
 }]
}
```

Type flags are ECMA TypeAttributes bits; member accessibility uses ECMA low bits.
Method IDs are zero-based assembly-wide enumeration indices, including property
and event accessors, stable throughout the handle's lifetime. Field IDs are
zero-based within the owning type, not assembly-wide tokens.

## Types and signatures

```text
Type =
 {kind:"named",scope:Scope,namespace:string|null,name:string,encloser:Type|null,value_kind?:ValueKind}
 | {kind:"generic",base:Type,arguments:[Type],value_kind?:ValueKind}
 | {kind:"type_generic"|"method_generic",index:integer}
 | {kind:"vector",element:Type,modifiers:[Modifier]}
 | {kind:"array",element:Type,rank:integer,sizes:[integer],lower_bounds:[integer]}
 | {kind:"pointer",element:Type|null,modifiers:[Modifier]}
 | {kind:"function_pointer",signature:Signature}
 | {kind:"Boolean"|"Char"|"Int8"|"UInt8"|"Int16"|"UInt16"|"Int32"|"UInt32"
         |"Int64"|"UInt64"|"Float32"|"Float64"|"IntPtr"|"UIntPtr"|"Object"|"String"}
ValueKind = "class"|"value_type"|null
Scope = {kind:"current_module"}|{kind:"assembly",name:string}
       |{kind:"module",name:string}|{kind:"exported"}
Modifier = {required:bool,type:Type}
Parameter = {kind:"value"|"by_ref",type:Type,modifiers:[Modifier]}
          | {kind:"typed_reference",modifiers:[Modifier]}
Signature = {
 instance:bool,explicit_this:bool,
 calling_convention:{kind:"default"|"vararg"|"generic",arity?:integer}
                  |{kind:"default_managed"|"default_unmanaged"|"cdecl"|"stdcall"|"thiscall"|"fastcall"},
 parameters:[Parameter],return_type:Parameter|{kind:"void",modifiers:[Modifier]},
 varargs:[Parameter]|null
}
MethodRef = {kind:"method",id?:MethodId,owner:Type|{kind:"module",name:string},name:string,signature:Signature}
          | {kind:"generic",base:MethodRef,arguments:[Type]}
FieldRef = {kind:"field",id?:integer,owner:Type|{kind:"module",name:string},name:string,type:Type,
            static?:bool,by_ref?:bool,modifiers:[Modifier]}
Constant = {kind:<primitive integer or Boolean or Char name>,value:<JSON integer or boolean>}
         | {kind:"Float32"|"Float64",bits:<unsigned JSON integer>}
         | {kind:"String",value:[uint16]}
         | {kind:"Null"}
```

Nested named types carry their structured parent in `encloser` and the parent's
scope; do not reconstruct names by parsing display strings. Namespace may be null.
Absent `value_kind` means unspecified. Pointer null element means void pointer.
UTF16 char/string values preserve isolated surrogates. Floating bits preserve
NaN payloads, infinities and signed zero. JSON integer tokens are exact: use
Gson `getAsLong` / `BigInteger`, **never** convert all numeric tokens to Double.

## Body

```text
{
 method_id:MethodId,init_locals:bool,max_stack:integer,
 locals:[{kind:"typed_reference"}|{kind:"variable",type:Type,pinned:bool,by_ref:bool,modifiers:[Modifier]}],
 code:[Instruction],
 eh:[{kind:"catch"|"filter"|"finally"|"fault",
      catch_type?:Type,filter_start?:integer,
      try_start:integer,try_end:integer,handler_start:integer,handler_end:integer}]
}
```

All branch targets and EH boundaries are **source instruction indices**, not byte
offsets. All region ends are exclusive and may equal code.length. The patched
vendor `src/resolution/lazy.rs` converts raw EH byte offsets/lengths to this form,
including filter offsets. Keep that patch when updating vendor.

Before expanding prefixes, JVM must create `sourceToExpanded[code.length + 1]`:
entry i points to the first prefix/instruction emitted for source instruction i;
entry code.length points just past the final emitted instruction. Remap every
branch target, switch target, filter start, try boundary and handler boundary
through this same map. Never remap a length by itself. Prefixes remain attached
as flags in this JSON; constrained/readonly/tail specialized variants also
represent combined source instructions.

### Instructions

`op` is the exact dotnetdll Instruction variant name (not raw IL mnemonic).
The exhaustive match in `src/instructions.rs` is the authoritative mapping.
Operand keys:

* `target`: Branch*, Leave; `targets`: Switch.
* `index`: LoadArgument, LoadArgumentAddress, StoreArgument, LoadLocal,
  LoadLocalAddress, StoreLocal.
* `value`: LoadConstantInt32/Int64 (integer), LoadString ([uint16]).
* `bits`: LoadConstantFloat32/Float64 (unsigned integer).
* `sign`: `signed` or `unsigned` on arithmetic/compare/branch variants that
  carry NumberSign, including ConvertOverflow.
* `type`: structured Type for type-token operands. For Convert/ConvertOverflow,
  LoadIndirect/LoadElementPrimitive/StoreIndirect/StoreElementPrimitive it is a
  primitive **string** (Int8, UInt8, Int16, UInt16, Int32, UInt32, Int64, UInt64,
  Float32, Float64, IntPtr, UIntPtr, Object as applicable).
* `method`: MethodRef for Call*, Jump, LoadMethodPointer, LoadTokenMethod,
  LoadVirtualMethodPointer, NewObject; CallIndirect has `signature` instead.
* `field`: FieldRef for field access/token variants.
* `tail_call`: boolean on Call/CallIndirect.
* `unaligned`: null or 1/2/4 and `volatile`: boolean on memory access variants;
  static field access has only volatile.
* `skip_type_check`, `skip_range_check`, `skip_null_check`: booleans wherever
  those flags exist on the corresponding upstream variant.

CallConstrained/CallVirtualConstrained have both `type` and `method`.
LoadElementAddressReadonly and CallVirtualTail imply their respective prefixes.
LoadFieldSkipNullCheck/StoreFieldSkipNullCheck imply the null-check flag.
Instructions without operands contain only `op`. No instruction is serialized
via Debug/Display or silently replaced by a fallback opcode.

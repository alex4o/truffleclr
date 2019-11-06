
grammar Cil;



/* multi-character punctuation */
DCOLON: '::';                   /* :: */
ELIPSIS: '...';                  /* ... */

/* Keywords   Note the undersores are to avoid collisions as these are common names */
K_VOID: 'void';
K_BOOL: 'bool';
K_CHAR: 'char';
K_UNSIGNED: 'unsigned';
K_INT: 'int';
K_INT8: 'int8';
K_INT16: 'int16';
K_INT32: 'int32';
K_INT64: 'int64';
K_FLOAT: 'float';
K_FLOAT32: K_FLOAT '32';
K_FLOAT64: K_FLOAT '64';
K_BYTEARRAY: 'bytearray';

K_UINT: 'uint';
K_UINT8: 'uint8';
K_UINT16: 'uin16';
K_UINT32: 'uint32';
K_UINT64: 'uint64';
K_FLAGS: 'flags';
K_CALLCONV: 'callconv';
K_MDTOKEN: 'mdtoken';

K_OBJECT: 'object';
K_STRING: 'string';
K_NULLREF: 'nullref';

/* misc keywords */
K_DEFAULT: 'default';
K_CDECL: 'cdecl';
K_VARARG: 'vararg';
K_STDCALL: 'stdcall';
K_THISCALL: 'thiscall';
K_FASTCALL: 'fastcall';
K_CLASS: 'class';

K_TYPEDREF: 'typedref';
K_UNMANAGED: 'unmangled';
K_FINALLY: 'finally';
K_HANDLER: 'handler';
K_CATCH: 'catch';
K_FILTER: 'filter';
K_FAULT: 'fault';

K_EXTENDS: 'extends';
K_IMPLEMENTS: 'implements';
K_TO: 'to';
K_AT: 'at';
K_TLS: 'tls';
K_TRUE: 'true';
K_FALSE: 'false';
D_INTERFACEIMPL: '.interfaceimpl';

/* class, method, field attributes */

K_VALUE: 'value';
K_VALUETYPE: 'valuetype';
K_NATIVE: 'native';
K_INSTANCE: 'instance';
K_SPECIALNAME: 'specialname';
K_FORWARDER: 'forwarder';

K_STATIC: 'static';
K_PUBLIC: 'public';
K_PRIVATE: 'private';
K_FAMILY: 'faimly';
K_FINAL: 'final';
K_SYNCHRONIZED: 'synchronized';
K_INTERFACE: 'interface';
K_SEALED: 'sealed';
K_NESTED: 'nested';

K_ABSTRACT: 'abstract';
K_AUTO: 'auto';
K_SEQUENTIAL: 'sequential';
K_EXPLICIT: 'explicit';
K_ANSI: 'ansi';
K_UNICODE: 'unicode';
K_AUTOCHAR: 'autochar';
K_IMPORT: 'import';
K_ENUM: 'enum';

K_VIRTUAL: 'virtual';
K_NOINLINING: 'noinlining';
K_AGGRESSIVEINLINING: 'aggressiveinlining';
K_NOOPTIMIZATION: 'nooptimization';
K_AGGRESSIVEOPTIMIZATION: 'aggressiveoptimization';
K_UNMANAGEDEXP: 'unmanagedexp';
K_BEFOREFIELDINIT: 'beforefieldinit';

K_STRICT: 'strict';
K_RETARGETABLE: 'retargetable';
K_WINDOWSRUNTIME: 'windowsruntime';
K_NOPLATFORM: 'noplatform';

K_METHOD: 'method';
K_FIELD: 'field';
K_PINNED: 'pinned';
K_MODREQ: 'modreq';
K_MODOPT: 'modopt';
K_SERIALIZABLE: 'serializable';
K_PROPERTY: 'property';
K_TYPE: 'type';

K_ASSEMBLY: 'assembly';
K_FAMANDASSEM: 'famandassem';
K_FAMORASSEM: 'famorassem';
K_PRIVATESCOPE: 'privatescope';
K_HIDEBYSIG: 'hidebysig';
K_NEWSLOT: 'newslot';
K_RTSPECIALNAME: 'rtspecialname';
K_PINVOKEIMPL: 'pinvokeimpl';

D_CTOR: '.ctor';
D_CCTOR: '.cctor';
K_LITERAL: 'literal';
K_NOTSERIALIZED: 'notserialized';
K_INITONLY: 'initonly';
K_REQSECOBJ: 'reqsecobj';

/* method implementation attributes: K_NATIVE and K_UNMANAGED listed above */
K_CIL: 'cil';
K_OPTIL: 'optil';
K_MANAGED: 'managed';
K_FORWARDREF: 'forwardref';
K_PRESERVESIG: 'preservesig';
K_RUNTIME: 'runtime';
K_INTERNALCALL: 'internalcall';

        /* PInvoke-specific keywords */
//IMPORT: 'import';
K_NOMANGLE: 'nomangle';
K_LASTERR: 'lasterr';
K_WINAPI: 'winapi';
K_AS: 'as';
K_BESTFIT: 'bestfit';
K_ON: 'on';
K_OFF: 'off';
K_CHARMAPERROR: 'charmaperror';


        /* intruction tokens (actually instruction groupings) */
//%token <opcode> INSTRNONE INSTRVAR INSTRI INSTRI8 INSTRR INSTRBRTARGET INSTRMETHOD INSTRFIELD
//%token <opcode> INSTRTYPE INSTRSTRING INSTRSIG INSTRTOK
//%token <opcode> INSTRSWITCH
INSTR_NONE: 'nop' | 'break' | 'ldarg.0' | 'ldarg.1' | 'ldarg.2' | 'ldarg.3' | 'ldloc.0' | 'ldloc.1' | 'ldloc.2' | 'ldloc.3' | 'stloc.0' | 'stloc.1' | 'stloc.2' | 'stloc.3' | 'ldnull' | 'ldc.i4.m1' | 'ldc.i4.0' | 'ldc.i4.1' | 'ldc.i4.2' | 'ldc.i4.3' | 'ldc.i4.4' | 'ldc.i4.5' | 'ldc.i4.6' | 'ldc.i4.7' | 'ldc.i4.8' | 'unused' | 'dup' | 'pop' | 'ret' | 'ldind.i1' | 'ldind.u1' | 'ldind.i2' | 'ldind.u2' | 'ldind.i4' | 'ldind.u4' | 'ldind.i8' | 'ldind.i' | 'ldind.r4' | 'ldind.r8' | 'ldind.ref' | 'stind.ref' | 'stind.i1' | 'stind.i2' | 'stind.i4' | 'stind.i8' | 'stind.r4' | 'stind.r8' | 'add' | 'sub' | 'mul' | 'div' | 'div.un' | 'rem' | 'rem.un' | 'and' | 'or' | 'xor' | 'shl' | 'shr' | 'shr.un' | 'neg' | 'not' | 'conv.i1' | 'conv.i2' | 'conv.i4' | 'conv.i8' | 'conv.r4' | 'conv.r8' | 'conv.u4' | 'conv.u8' | 'conv.r.un' | 'throw' | 'conv.ovf.i1.un' | 'conv.ovf.i2.un' | 'conv.ovf.i4.un' | 'conv.ovf.i8.un' | 'conv.ovf.u1.un' | 'conv.ovf.u2.un' | 'conv.ovf.u4.un' | 'conv.ovf.u8.un' | 'conv.ovf.i.un' | 'conv.ovf.u.un' | 'ldlen' | 'ldelem.i1' | 'ldelem.u1' | 'ldelem.i2' | 'ldelem.u2' | 'ldelem.i4' | 'ldelem.u4' | 'ldelem.i8' | 'ldelem.i' | 'ldelem.r4' | 'ldelem.r8' | 'ldelem.ref' | 'stelem.i' | 'stelem.i1' | 'stelem.i2' | 'stelem.i4' | 'stelem.i8' | 'stelem.r4' | 'stelem.r8' | 'stelem.ref' | 'conv.ovf.i1' | 'conv.ovf.u1' | 'conv.ovf.i2' | 'conv.ovf.u2' | 'conv.ovf.i4' | 'conv.ovf.u4' | 'conv.ovf.i8' | 'conv.ovf.u8' | 'ckfinite' | 'conv.u2' | 'conv.u1' | 'conv.i' | 'conv.ovf.i' | 'conv.ovf.u' | 'add.ovf' | 'add.ovf.un' | 'mul.ovf' | 'mul.ovf.un' | 'sub.ovf' | 'sub.ovf.un' | 'endfinally' | 'stind.i' | 'conv.u' | 'prefix7' | 'prefix6' | 'prefix5' | 'prefix4' | 'prefix3' | 'prefix2' | 'prefix1' | 'prefixref' | 'arglist' | 'ceq' | 'cgt' | 'cgt.un' | 'clt' | 'clt.un' | 'localloc' | 'endfilter' | 'volatile.' | 'tail.' | 'cpblk' | 'initblk' | 'rethrow' | 'refanytype' | 'readonly.' | 'illegal' | 'endmac' | 'codelabel';
INSTR_VAR: 'ldarg.s' | 'ldarga.s' | 'starg.s' | 'ldloc.s' | 'ldloca.s' | 'stloc.s' | 'ldarg' | 'ldarga' | 'starg' | 'ldloc' | 'ldloca' | 'stloc';
INSTR_I: 'ldc.i4.s' | 'ldc.i4' | 'unaligned.';
INSTR_I8: 'ldc.i8';
INSTR_R: 'ldc.r4' | 'ldc.r8';
INSTR_METHOD: 'jmp' | 'call' | 'callvirt' | 'newobj' | 'ldftn' | 'ldvirtftn';
INSTR_SIG: 'calli';
INSTR_BRTARGET: 'br.s' | 'brfalse.s' | 'brtrue.s' | 'beq.s' | 'bge.s' | 'bgt.s' | 'ble.s' | 'blt.s' | 'bne.un.s' | 'bge.un.s' | 'bgt.un.s' | 'ble.un.s' | 'blt.un.s' | 'br' | 'brfalse' | 'brtrue' | 'beq' | 'bge' | 'bgt' | 'ble' | 'blt' | 'bne.un' | 'bge.un' | 'bgt.un' | 'ble.un' | 'blt.un' | 'leave' | 'leave.s';
INSTR_SWITCH: 'switch';
INSTR_TYPE: 'cpobj' | 'ldobj' | 'castclass' | 'isinst' | 'unbox' | 'stobj' | 'box' | 'newarr' | 'ldelema' | 'ldelem' | 'stelem' | 'unbox.any' | 'refanyval' | 'mkrefany' | 'initobj' | 'constrained.' | 'sizeof';
INSTR_STRING: 'ldstr';
INSTR_FIELD: 'ldfld' | 'ldflda' | 'stfld' | 'ldsfld' | 'ldsflda' | 'stsfld';
INSTR_TOK: 'ldtoken';
        /* assember directives */
D_CLASS: '.class';
D_NAMESPACE: '.namespace';
D_METHOD: '.method';
D_FIELD: '.field';
D_DATA: '.data';
D_THIS: '.this';
D_BASE: '.base';
D_NESTER: '.nester';

D_EMITBYTE: '.emitbyte';
D_TRY: '.try';
D_MAXSTACK: '.maxstack';
D_LOCALS: '.locals';
D_ENTRYPOINT: '.entrypoint';
D_ZEROINIT: '.zeroinit';

D_EVENT: '.event';
D_ADDON: '.addon';
D_REMOVEON: '.removeon';
D_FIRE: '.fire';
D_OTHER: '.other';

D_PROPERTY: '.property';
D_SET: '.set';
D_GET: '.get';
D_DEFAULT: '.default';

D_PERMISSION: '.permission';
D_PERMISSIONSET: '.permissionset';


                /* security actions */
K_REQUEST: 'request';
K_DEMAND: 'demand';
K_ASSERT: 'assert';
K_DENY: 'deny';
K_PERMITONLY: 'permitonly';
K_LINKCHECK: 'linkcheck';
K_INHERITCHECK: 'inheritcheck';

K_REQMIN: 'reqmin';
K_REQOPT: 'reqopt';
K_REQREFUSE: 'reqrefuse';
K_PREJITGRANT: 'prejitgrant';
K_PREJITDENY: 'prejitdeny';
K_NONCASDEMAND: 'noncasdemand';

K_NONCASLINKDEMAND: 'noncaslinkdemand';
K_NONCASINHERITANCE: 'noncasinheritance';


/* extern debug info specifier (to be used by precompilers only) */
D_LINE: '.line';
P_LINE: 'line';
D_LANGUAGE: '.language';

/* custom value specifier */
D_CUSTOM: '.custom';
/* local vars zeroinit specifier */
K_INIT: 'init';

/* class layout */
D_SIZE: '.size';
D_PACK: '.pack';
D_VTABLE: '.vtable';
D_VTFIXUP: '.vtfixup';
K_FROMUNMANAGED: 'fromunmanaged';
K_CALLMOSTDERIVED: 'callmostderived';
D_VTENTRY: '.vtentry';
K_RETAINAPPDOMAIN: 'retainappdomain';

/* manifest */
D_FILE: '.file';
K_NOMETADATA: 'nometadata';
D_HASH: '.hash';
D_ASSEMBLY: '.assembly';
D_PUBLICKEY: '.publickey';
D_PUBLICKEYTOKEN: '.publickeytoken';
K_ALGORITHM: 'algorithm';
D_VER: '.ver';
D_LOCALE: '.locale';
K_EXTERN: 'extern';

D_MRESOURCE: '.mresource';
D_MODULE: '.module';
D_EXPORT: '.export';
K_LEGACY: 'legacy';
K_LIBRARY: 'library';
K_X86: 'x86';
K_AMD64: 'amd64';
K_ARM: 'arm';
K_ARM64: 'arm64';

/* field marshaling */
K_MARSHAL: 'marshal';
K_CUSTOM: 'custom';
K_SYSSTRING: 'sysstring';
K_FIXED: 'fixed';
K_VARIANT: 'variant';
K_CURRENCY: 'currency';
K_SYSCHAR: 'syschar';
K_DECIMAL: 'decimal';
K_DATE: 'date';
K_BSTR: 'bstr';
K_TBSTR: 'tbstr';
K_LPSTR: 'lpstr';

K_LPWSTR: 'lpwstr';
K_LPTSTR: 'lptstr';
K_OBJECTREF: 'objectref';
K_IUNKNOWN: 'iunknown';
K_IDISPATCH: 'idispatch';
K_STRUCT: 'struct';
K_SAFEARRAY: 'safearray';
K_BYVALSTR: 'byvalstr';
K_LPVOID: 'lpvoid';
K_ANY: 'any';
K_ARRAY: 'array';
K_LPSTRUCT: 'lpstruct';

K_IIDPARAM: 'iidparam';

    /* parameter keywords */
K_IN: 'in';
K_OUT: 'out';
K_OPT: 'opt';

/* .param directive */
D_PARAM: '.param';

/* method implementations */
D_OVERRIDE: '.override';
K_WITH: 'with';

/* variant type specifics */
K_NULL: 'null';
K_HRESULT: 'hresult';
K_CARRAY: 'carray';
K_USERDEFINED: 'userdefined';
K_RECORD: 'record';
K_FILETIME: 'filetime';
K_BLOB: 'blob';
K_STREAM: 'stream';
K_STORAGE: 'storage';

K_STREAMED_OBJECT: 'streamedobject';
K_STORED_OBJECT: 'storedobject';
K_BLOB_OBJECT: 'blobobject';
K_CF: 'cf';
K_CLSID: 'clsid';
K_VECTOR: 'vector';

/* header flags */
D_SUBSYSTEM: '.subsystem';
D_CORFLAGS: '.corflags';
K_ALIGNMENT: 'alignment';
D_IMAGEBASE: '.imagebase';
D_STACKRESERVE: '.stackreseve';

/* syntactic sugar */
D_TYPEDEF: '.typedef';
D_TEMPLATE: '.template';
D_TYPELIST: '.typelist';
D_MSCORLIB: '.mscorelib';

/* compilation control directives */
P_DEFINE: 'define';
P_UNDEF: 'undef';
P_IFDEF: 'ifdef';
P_IFNDEF: 'ifndef';
P_ELSE: 'else';
P_ENDIF: 'endif';
P_INCLUDE: 'include';

/* newly added tokens go here */
K_CONSTRAINT: 'constraint';




WS: [ \n\t\r]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
DOT: '.';
K_ERROR: 'error';
                         /* bad strings,    */

QSTRING: '"' ( . | '\\"' )*? '"';        /* "Hello World\n" */
SQSTRING: '\'' ( . | '\\\'' )*? '\'';        /* 'Hello World\n' */

ID: [A-Za-z_#$@`]+[?A-Za-z_0-9`#$@]*;             /* testing343 */
DOTTEDNAME: ID (DOT ID)*;     /* System.Object */

INT64: '-'? '0'..'9'+ | '0x' [0-9A-F]+;         /* 342534523534534      0x34FA434644554 */
FLOAT64: ('-'? '0'..'9'+) '.' ('0'..'9'+)? | ('-'? '0'..'9'+ 'E' '-'? '0'..'9'+);          /* -334234 24E-34 */
HEXBYTE: [A-F0-9][A-F0-9] (' ' [A-F0-9][A-F0-9])*;        /* 05 1A FA */
// TODO: These should be fixed
TYPEDEFT: 'TypeDef' | 'TypeRef';
//TYPEDEFM: '';
//TYPEDEFF: '';
TYPEDEFTS: 'TypeSpec';
TYPEDEFMR: 'MemberRef';
//TYPEDEFCA: '';


decls                   : decl*
                        ;

/* Module-level declarations */
decl                    : classHead '{' classDecls '}'              #class
                        | nameSpaceHead '{' decls '}'               #namespace
                        | methodHead '{' methodDecls '}'            #method
                        | fieldDecl                                 #field
                        | dataDecl                                  #data
                        | vtableDecl                                #vtable
                        | vtfixupDecl                               #vtfixup
                        | extSourceSpec                             #extsource
                        | fileDecl                                  #file
                        | assemblyHead '{' assemblyDecls '}'        #assembly
                        | assemblyRefHead '{' assemblyRefDecls '}'  #assemblyReferance
                        | exptypeHead '{' exptypeDecls '}'          #exptype
                        | manifestResHead '{' manifestResDecls '}'  #manifest
                        | moduleHead                                #module
                        | secDecl                                   #security
                        | customAttrDecl                            #custom
                        | D_SUBSYSTEM int32                         #system
                        | D_CORFLAGS int32                          #corflags
                        | D_FILE K_ALIGNMENT int32                  #filealignement
                        | D_IMAGEBASE int64                         #imagebase
                        | D_STACKRESERVE int64                      #stackreserve
                        | languageDecl                              #language
                        | typedefDecl                               #typedef
                        | compControl                               #compilationControl
                        | D_TYPELIST '{' classNameSeq '}'           #typeLst
                        | D_MSCORLIB                                #mscorelib
                        ;

classNameSeq            : /* EMPTY */
                        | className classNameSeq
                        ;

compQstring             : QSTRING
                        | compQstring '+' QSTRING
                        ;

languageDecl            : D_LANGUAGE SQSTRING
                        | D_LANGUAGE SQSTRING ',' SQSTRING
                        | D_LANGUAGE SQSTRING ',' SQSTRING ',' SQSTRING
                        ;
/*  Basic tokens  */
id                      : ID
                        | SQSTRING
                        ;

dottedName              : id | DOTTEDNAME;

int32                   : INT64;

int64                   : INT64;

float64                 : FLOAT64
                        | K_FLOAT32 '(' int32 ')'
                        | K_FLOAT64 '(' int64 ')'
                        ;

/*  Aliasing of types, type specs, methods, fields and custom attributes */
typedefDecl             : D_TYPEDEF
                        (type K_AS
                        | className K_AS
                        | memberRef K_AS
                        | customDescr K_AS )
                        dottedName
                        ;

/*  Compilation control directives are processed within yylex(),
    displayed here just for grammar completeness */
compControl             : P_DEFINE dottedName compQstring?
                        | P_UNDEF dottedName
                        | P_IFDEF dottedName
                        | P_IFNDEF dottedName
                        | P_ELSE
                        | P_ENDIF
                        | P_INCLUDE QSTRING
                        | ';'
                        ;


/* Custom attribute declarations  */
customDescr             : D_CUSTOM ('(' ownerType ')')? methodRef
                        ( '=' compQstring
                        |'=' '{' customBlobDescr '}'
                        |'=' '(' bytes ')' )
                        ;

ownerType               : typeSpec
                        | memberRef
                        ;

/*  Verbal description of custom attribute initialization blob  */
customBlobDescr         : customBlobArgs customBlobNVPairs
                        ;

customBlobArgs          : (serInit
                        | compControl)*?
                        ;

customBlobNVPairs       : ( fieldOrProp serializType dottedName '=' serInit
                        | compControl)*?
                        ;

fieldOrProp             : K_FIELD
                        | K_PROPERTY
                        ;

customAttrDecl          : customDescr
//                        | TYPEDEF_CA
                        ;

serializType            : simpleType
                        | K_TYPE
                        | K_OBJECT
                        | K_ENUM K_CLASS SQSTRING
                        | K_ENUM className
                        | serializType '[' ']'
                        ;


/*  Module declaration */
moduleHead              : D_MODULE K_EXTERN? dottedName
                        ;

/*  VTable Fixup table declaration  */
vtfixupDecl             : D_VTFIXUP '[' int32 ']' vtfixupAttr K_AT id
                        ;

vtfixupAttr             : /* EMPTY */
                        | vtfixupAttr K_INT32
                        | vtfixupAttr K_INT64
                        | vtfixupAttr K_FROMUNMANAGED
                        | vtfixupAttr K_CALLMOSTDERIVED
                        | vtfixupAttr K_RETAINAPPDOMAIN
                        ;

vtableDecl              : vtableHead bytes ')'   /* deprecated */
                        ;

vtableHead              : D_VTABLE '=' '('        /* deprecated */
                        ;

/*  Namespace and class declaration  */
nameSpaceHead           : D_NAMESPACE dottedName { System.out.println("Namespace: " + $dottedName.text); }
                        ;

klass                  : D_CLASS
                        ;

classHeadBegin          : klass classAttr*? dottedName typarsClause {  System.out.println("Class: " + $dottedName.text); }
                        ;
classHead               : classHeadBegin extendsClause implClause
                        ;

classAttr               : K_PUBLIC
                        | K_PRIVATE
                        | K_VALUE
                        | K_ENUM
                        | K_INTERFACE
                        | K_SEALED
                        | K_ABSTRACT
                        | K_AUTO
                        | K_SEQUENTIAL
                        | K_EXPLICIT
                        | K_ANSI
                        | K_UNICODE
                        | K_AUTOCHAR
                        | K_IMPORT
                        | K_SERIALIZABLE
                        | K_WINDOWSRUNTIME
                        | K_NESTED
                            ( K_PUBLIC
                            | K_PRIVATE
                            | K_FAMILY
                            | K_ASSEMBLY
                            | K_FAMANDASSEM
                            | K_FAMORASSEM
                            )
                        | K_BEFOREFIELDINIT
                        | K_SPECIALNAME
                        | K_RTSPECIALNAME
                        | K_FLAGS '(' int32 ')'
                        ;

extendsClause           : (K_EXTENDS typeSpec)?;

implClause              : /* EMPTY */
                        | K_IMPLEMENTS implList
                        ;

classDecls              : classDecl*?;

implList                : implList ',' typeSpec
                        | typeSpec
                                        ;

/* Generic type parameters declaration  */
typeList                : /* EMPTY */
                        | typeListNotEmpty
                        ;

typeListNotEmpty        : typeSpec
                        | typeListNotEmpty ',' typeSpec
                        ;

typarsClause            : /* EMPTY */
                        | '<' typars '>'
                        ;

typarAttrib             : '+'
                        | '-'
                        | K_CLASS
                        | K_VALUETYPE
                        | D_CTOR
                        ;

typarAttribs            : /* EMPTY */
                        | typarAttrib typarAttribs
                        ;

typars                  : typarAttribs tyBound? dottedName typarsRest
                        ;

typarsRest              : /* EMPTY */
                        | ',' typars
                        ;

tyBound                 : '(' typeList ')'
                        ;

genArity                : /* EMPTY */
                        | genArityNotEmpty
                        ;

genArityNotEmpty        : '<' '[' int32 ']' '>'
                        ;

/*  Class body declarations  */
classDecl               : methodHead '{' methodDecls '}'    #class_method
                        | classHead '{' classDecls '}'      #class_class
                        | eventHead '{' eventDecls '}'      #class_event
                        | propHead '{' propDecls '}'        #class_property
                        | fieldDecl                         #class_field
                        | dataDecl                          #class_data
                        | secDecl                           #class_security
                        | extSourceSpec                     #class_externalSource
                        | customAttrDecl                    #class_customAttribute
                        | D_SIZE int32                      #class_size
                        | D_PACK int32                      #class_pack
                        | exportHead '{' exptypeDecls '}'   #class_export
                        | D_OVERRIDE
                            ( typeSpec DCOLON methodName K_WITH callConv type typeSpec DCOLON methodName '(' sigArgs0 ')'
                            | K_METHOD callConv type typeSpec DCOLON methodName genArity '(' sigArgs0 ')' K_WITH K_METHOD callConv type typeSpec DCOLON methodName genArity '(' sigArgs0 ')'
                            )                               #class_methodOverride
                        | languageDecl                      #class_language
                        | compControl                       #class_compilationControl
                        | D_PARAM (K_TYPE | K_CONSTRAINT) ('[' int32 ']' |  dottedName) (',' typeSpec)?  #class_param
                        | D_INTERFACEIMPL K_TYPE typeSpec customDescr #class_interfaceImpl
                        ;

/*  Field declaration  */
fieldDecl               : D_FIELD repeatOpt fieldAttr*? type dottedName atOpt initOpt
                        ;

fieldAttr               : K_STATIC
                        | K_PUBLIC
                        | K_PRIVATE
                        | K_FAMILY
                        | K_INITONLY
                        | K_RTSPECIALNAME  /**/
                        | K_SPECIALNAME
                                                /* <STRIP>commented out because PInvoke for fields is not supported by EE
                        | fieldAttr K_PINVOKEIMPL '(' compQstring K_AS compQstring pinvAttr ')'
                        | fieldAttr K_PINVOKEIMPL '(' compQstring  pinvAttr ')'
                        | fieldAttr K_PINVOKEIMPL '(' pinvAttr ')'
                                                </STRIP>*/
                        | K_MARSHAL '(' marshalBlob ')'
                        | K_ASSEMBLY
                        | K_FAMANDASSEM
                        | K_FAMORASSEM
                        | K_PRIVATESCOPE
                        | K_LITERAL
                        | K_NOTSERIALIZED
                        | K_FLAGS '(' int32 ')'
                        ;

atOpt                   : /* EMPTY */
                        | K_AT id
                        ;

initOpt                 : /* EMPTY */
                        | '=' fieldInit
                                                ;

repeatOpt               : /* EMPTY */
                        | '[' int32 ']'
                                                ;

/*  Method referencing  */
methodRef               : callConv type (typeSpec DCOLON)? methodName ( tyArgs0  | genArityNotEmpty ) '(' sigArgs0 ')'
//                        | TYPEDEF_M
//                        | TYPEDEF_MR
                        ;

callConv                : (K_INSTANCE | K_EXPLICIT)*? ( callKind | K_CALLCONV '(' int32 ')' )?;


callKind                : K_DEFAULT
                        | K_VARARG
                        | K_UNMANAGED ( K_CDECL
                        | K_STDCALL
                        | K_THISCALL
                        | K_FASTCALL)
                        ;

mdtoken                 : K_MDTOKEN '(' int32 ')'
                        ;

memberRef               : methodSpec methodRef
                        | K_FIELD type typeSpec DCOLON dottedName
                        | K_FIELD type dottedName
//                        | K_FIELD TYPEDEF_F
//                        | K_FIELD TYPEDEF_MR
                        | mdtoken
                        ;

/*  Event declaration  */
eventHead               : D_EVENT eventAttr typeSpec dottedName
                        | D_EVENT eventAttr dottedName
                        ;


eventAttr               : /* EMPTY */
                        | eventAttr K_RTSPECIALNAME /* */
                        | eventAttr K_SPECIALNAME
                        ;

eventDecls              : eventDecl*?
                        ;

eventDecl               : D_ADDON methodRef
                        | D_REMOVEON methodRef
                        | D_FIRE methodRef
                        | D_OTHER methodRef
                        | extSourceSpec
                        | customAttrDecl
                        | languageDecl
                        | compControl
                        ;

/*  Property declaration  */
propHead                : D_PROPERTY propAttr callConv type dottedName '(' sigArgs0 ')' initOpt
                        ;

propAttr                : /* EMPTY */
                        | propAttr K_RTSPECIALNAME /* */
                        | propAttr K_SPECIALNAME
                        ;

propDecls               : propDecl*?
                        ;


propDecl                : D_SET methodRef
                        | D_GET methodRef
                        | D_OTHER methodRef
                        | customAttrDecl
                        | extSourceSpec
                        | languageDecl
                        | compControl
                        ;

/*  Method declaration  */
methodHeadPart1         : D_METHOD
                        ;

marshalClause           : /* EMPTY */
                        | K_MARSHAL '(' marshalBlob ')'
                        ;

marshalBlob             : nativeType
                        | marshalBlobHead hexbytes '}'
                        ;

marshalBlobHead         : '{'
                        ;

methodHead              : methodHeadPart1 methAttr*? callConv paramAttr*? type marshalClause methodName typarsClause'(' sigArgs0 ')' implAttr*?
                        ;

methAttr                : K_STATIC
                        | K_PUBLIC
                        | K_PRIVATE
                        | K_FAMILY
                        | K_FINAL
                        | K_SPECIALNAME
                        | K_VIRTUAL
                        | K_STRICT
                        | K_ABSTRACT
                        | K_ASSEMBLY
                        | K_FAMANDASSEM
                        | K_FAMORASSEM
                        | K_PRIVATESCOPE
                        | K_HIDEBYSIG
                        | K_NEWSLOT
                        | K_RTSPECIALNAME /*  */
                        | K_UNMANAGEDEXP
                        | K_REQSECOBJ
                        | K_FLAGS '(' int32 ')'
                        | K_PINVOKEIMPL '(' compQstring? (K_AS compQstring)? pinvAttr*? ')'
                        ;

pinvAttr                : K_NOMANGLE
                        |  K_ANSI
                        |  K_UNICODE
                        |  K_AUTOCHAR
                        |  K_LASTERR
                        |  K_WINAPI
                        |  K_CDECL
                        |  K_STDCALL
                        |  K_THISCALL
                        |  K_FASTCALL
                        |  K_BESTFIT ':' K_ON
                        |  K_BESTFIT ':' K_OFF
                        |  K_CHARMAPERROR ':' K_ON
                        |  K_CHARMAPERROR ':' K_OFF
                        |  K_FLAGS '(' int32 ')'
                        ;

methodName              : D_CTOR
                        | D_CCTOR
                        | dottedName
                        ;

paramAttr               : '[' K_IN ']'
                        | '[' K_OUT ']'
                        | '[' K_OPT ']'
                        | '[' int32 ']'
                        ;

implAttr                : K_NATIVE
                        | K_CIL
                        | K_OPTIL
                        | K_MANAGED
                        | K_UNMANAGED
                        | K_FORWARDREF
                        | K_PRESERVESIG
                        | K_RUNTIME
                        | K_INTERNALCALL
                        | K_SYNCHRONIZED
                        | K_NOINLINING
                        | K_AGGRESSIVEINLINING
                        | K_NOOPTIMIZATION
                        | K_AGGRESSIVEOPTIMIZATION
                        | K_FLAGS '(' int32 ')'
                        ;

localsHead              : D_LOCALS
                        ;

methodDecls             : methodDecl*?;

methodDecl              : D_EMITBYTE int32                      #method_emitbyte
                        | sehBlock                              #method_sehblock
                        | D_MAXSTACK int32                      #method_maxstack
                        | localsHead K_INIT? '(' sigArgs0 ')'   #method_locals
                        | D_ENTRYPOINT                          #method_entrypoint
                        | D_ZEROINIT                            #method_zeroinit
                        | dataDecl                              #method_datadecl
                        | (id ':')? instr                       #method_instruction
                        | secDecl                               #method_security
                        | extSourceSpec                         #method_externalSource
                        | languageDecl                          #method_language
                        | customAttrDecl                        #method_customAtribute
                        | compControl                           #method_compilerControl
                        | D_EXPORT '[' int32 ']' (K_AS id)?     #method_export
                        | D_VTENTRY int32 ':' int32             #method_vtentry
                        | D_OVERRIDE ( K_METHOD callConv type )? typeSpec DCOLON methodName (genArity '(' sigArgs0 ')')?  #method_override
                        | scopeBlock                            #method_scopeBlock
                        | D_PARAM ( K_TYPE ('[' int32 ']' | dottedName)
                                  | K_CONSTRAINT ('[' int32 ']' | dottedName) ',' typeSpec
                                  | '[' int32 ']' initOpt) #method_dparam
                        ;

scopeBlock              : scopeOpen methodDecls '}'
                        ;

scopeOpen               : '{'
                        ;

/* Structured exception handling directives  */
sehBlock                : tryBlock sehClauses
                        ;

sehClauses              : sehClause sehClauses
                        | sehClause
                        ;

tryBlock                : D_TRY
                        ( scopeBlock
                        | id K_TO id
                        | int32 K_TO int32)
                        ;



sehClause               : catchClause handlerBlock
                        | filterClause handlerBlock
                        | finallyClause handlerBlock
                        | faultClause handlerBlock
                        ;


filterClause            : filterHead scopeBlock
                        | filterHead id
                        | filterHead int32
                        ;

filterHead              : K_FILTER
                        ;

catchClause             : K_CATCH typeSpec
                        ;

finallyClause           : K_FINALLY
                        ;

faultClause             : K_FAULT
                        ;

handlerBlock            : scopeBlock
                        | K_HANDLER id K_TO id
                        | K_HANDLER int32 K_TO int32
                        ;

/*  Data declaration  */
dataDecl                : ddHead ddBody
                        ;

ddHead                  : D_DATA tls id '='
                        | D_DATA tls
                        ;

tls                     : /* EMPTY */
                        | K_TLS
                        | K_CIL
                        ;

ddBody                  : '{' ddItemList '}'
                        | ddItem
                        ;

ddItemList              : ddItem ',' ddItemList
                        | ddItem
                        ;

ddItemCount             : /* EMPTY */
                        | '[' int32 ']'
                        ;

ddItem                  : K_CHAR '*' '(' compQstring ')'
                        | '&' '(' id ')'
                        | bytearrayhead bytes ')'
                        | K_FLOAT32 '(' float64 ')' ddItemCount
                        | K_FLOAT64 '(' float64 ')' ddItemCount
                        | K_INT64 '(' int64 ')' ddItemCount
                        | K_INT32 '(' int32 ')' ddItemCount
                        | K_INT16 '(' int32 ')' ddItemCount
                        | K_INT8 '(' int32 ')' ddItemCount
                        | K_FLOAT32 ddItemCount
                        | K_FLOAT64 ddItemCount
                        | K_INT64 ddItemCount
                        | K_INT32 ddItemCount
                        | K_INT16 ddItemCount
                        | K_INT8 ddItemCount
                        ;

/*  Default values declaration for fields, parameters and verbal form of CA blob description  */
fieldSerInit            : K_FLOAT32 '(' float64 ')'
                        | K_FLOAT64 '(' float64 ')'
                        | K_FLOAT32 '(' int32 ')'
                        | K_FLOAT64 '(' int64 ')'
                        | K_INT64 '(' int64 ')'
                        | K_INT32 '(' int32 ')'
                        | K_INT16 '(' int32 ')'
                        | K_INT8 '(' int32 ')'
                        | K_UNSIGNED K_INT64 '(' int64 ')'
                        | K_UNSIGNED K_INT32 '(' int32 ')'
                        | K_UNSIGNED K_INT16 '(' int32 ')'
                        | K_UNSIGNED K_INT8 '(' int32 ')'
                        | K_UINT64 '(' int64 ')'
                        | K_UINT32 '(' int32 ')'
                        | K_UINT16 '(' int32 ')'
                        | K_UINT8 '(' int32 ')'
                        | K_CHAR '(' int32 ')'
                        | K_BOOL '(' truefalse ')'
                        | bytearrayhead bytes ')'
                        ;

bytearrayhead           : K_BYTEARRAY '('
                        ;

bytes                   : /* EMPTY */
                        | hexbytes
                        ;

hexbytes                : HEXBYTE
                        | hexbytes HEXBYTE
                        ;

/*  Field/parameter initialization  */
fieldInit               : fieldSerInit
                        | compQstring
                        | K_NULLREF
                        ;

/*  Values for verbal form of CA blob description  */
serInit                 : fieldSerInit
                        | K_STRING '(' K_NULLREF ')'
                        | K_STRING '(' SQSTRING ')'
                        | K_TYPE '(' K_CLASS SQSTRING ')'
                        | K_TYPE '(' className ')'
                        | K_TYPE '(' K_NULLREF ')'
                        | K_OBJECT '(' serInit ')'
                        | K_FLOAT32 '[' int32 ']' '(' f32seq ')'
                        | K_FLOAT64 '[' int32 ']' '(' f64seq ')'
                        | K_INT64 '[' int32 ']' '(' i64seq ')'
                        | K_INT32 '[' int32 ']' '(' i32seq ')'
                        | K_INT16 '[' int32 ']' '(' i16seq ')'
                        | K_INT8 '[' int32 ']' '(' i8seq ')'
                        | K_UINT64 '[' int32 ']' '(' i64seq ')'
                        | K_UINT32 '[' int32 ']' '(' i32seq ')'
                        | K_UINT16 '[' int32 ']' '(' i16seq ')'
                        | K_UINT8 '[' int32 ']' '(' i8seq ')'
                        | K_UNSIGNED K_INT64 '[' int32 ']' '(' i64seq ')'
                        | K_UNSIGNED K_INT32 '[' int32 ']' '(' i32seq ')'
                        | K_UNSIGNED K_INT16 '[' int32 ']' '(' i16seq ')'
                        | K_UNSIGNED K_INT8 '[' int32 ']' '(' i8seq ')'
                        | K_CHAR '[' int32 ']' '(' i16seq ')'
                        | K_BOOL '[' int32 ']' '(' boolSeq ')'
                        | K_STRING '[' int32 ']' '(' sqstringSeq ')'
                        | K_TYPE '[' int32 ']' '(' classSeq ')'
                        | K_OBJECT '[' int32 ']' '(' objSeq ')'
                        ;


f32seq                  : /* EMPTY */
                        | f32seq float64
                        | f32seq int32
                        ;

f64seq                  : /* EMPTY */
                        | f64seq float64
                        | f64seq int64
                        ;

i64seq                  : /* EMPTY */
                        | i64seq int64
                        ;

i32seq                  : /* EMPTY */
                        | i32seq int32
                        ;

i16seq                  : /* EMPTY */
                        | i16seq int32
                        ;

i8seq                   : /* EMPTY */
                        | i8seq int32
                        ;

boolSeq                 : /* EMPTY */
                        | boolSeq truefalse
                        ;

sqstringSeq             : /* EMPTY */
                        | sqstringSeq K_NULLREF
                        | sqstringSeq SQSTRING
                        ;

classSeq                : /* EMPTY */
                        | classSeq K_NULLREF
                        | classSeq K_CLASS SQSTRING
                        | classSeq className
                        ;

objSeq                  : /* EMPTY */
                        | objSeq serInit
                        ;

/*  IL instructions and associated definitions  */
methodSpec              : K_METHOD
                        ;

instr_none              : INSTR_NONE
                        ;

instr_var               : INSTR_VAR (int32 | id)
                        ;

instr_i                 : INSTR_I arg=int32
                        ;

instr_i8                : INSTR_I8 arg=int64
                        ;

instr_r                 : INSTR_R (f=float64 | i=int64 | '(' b=bytes ')')
                        ;

instr_brtarget          : INSTR_BRTARGET (id | int32)
                        ;

instr_method            : INSTR_METHOD methodRef
                        ;

instr_field             : INSTR_FIELD type (typeSpec DCOLON)? dottedName
                        ;

instr_type              : INSTR_TYPE typeSpec
                        ;

instr_string            : INSTR_STRING ( compQstring | K_ANSI '(' compQstring ')' | bytearrayhead bytes ')' )
                        ;

instr_sig               : INSTR_SIG callConv type '(' sigArgs0 ')'
                        ;

instr_tok               : INSTR_TOK ownerType /* ownerType ::= memberRef | typeSpec */
                        ;

instr_switch            : INSTR_SWITCH '(' labels ')'
                        ;



instr                   : instr_none
                        | instr_var
                        | instr_i
                        | instr_i8
                        | instr_r
                        | instr_brtarget
                        | instr_method
                        | instr_field
//                        | instr_field TYPEDEF_F
//                        | instr_field TYPEDEF_MR
                        | instr_type
                        | instr_string
                        | instr_sig
                        | instr_tok
                        | instr_switch
                        ;

labels                  : /* empty */
                        | id ',' labels
                        | int32 ',' labels
                        | id
                        | int32
                        ;

/*  Signatures  */
tyArgs0                 : /* EMPTY */
                        | '<' tyArgs1 '>'
                        ;

tyArgs1                 : /* EMPTY */
                        | tyArgs2
                        ;

tyArgs2                 : type
                        | tyArgs2 ',' type
                        ;


sigArgs0                : sigArgs1?;

sigArgs1                : sigArg (',' sigArg)*?
                        ;

sigArg                  : ELIPSIS
                        |  type marshalClause
                        |  type marshalClause id
                        ;

/*  Class referencing  */
className               : '[' dottedName ']' slashedName
                        | '[' mdtoken ']' slashedName
                        | '[' '*' ']' slashedName
                        | '[' D_MODULE dottedName ']' slashedName
                        | slashedName
                        | mdtoken
//                        | TYPEDEF_T
                        | D_THIS
                        | D_BASE
                        | D_NESTER
                        ;

slashedName             : dottedName ('/' dottedName)*?
                        ;

typeSpec                : className
                        | '[' dottedName ']'
                        | '[' D_MODULE dottedName ']'
                        | type
                        ;

/*  Native types for marshaling signatures  */
nativeType              : /* EMPTY */
                        | K_CUSTOM '(' compQstring ',' compQstring ',' compQstring ',' compQstring ')'
                        | K_CUSTOM '(' compQstring ',' compQstring ')'
                        | K_FIXED K_SYSSTRING '[' int32 ']'
                        | K_FIXED K_ARRAY '[' int32 ']' nativeType
                        | K_VARIANT
                        | K_CURRENCY
                        | K_SYSCHAR
                        | K_VOID
                        | K_BOOL
                        | K_INT8
                        | K_INT16
                        | K_INT32
                        | K_INT64
                        | K_FLOAT32
                        | K_FLOAT64
                        | K_ERROR
                        | K_UNSIGNED K_INT8
                        | K_UNSIGNED K_INT16
                        | K_UNSIGNED K_INT32
                        | K_UNSIGNED K_INT64
                        | K_UINT8
                        | K_UINT16
                        | K_UINT32
                        | K_UINT64
                        | nativeType '*'
                        | nativeType '[' ']'
                        | nativeType '[' int32 ']'
                        | nativeType '[' int32 '+' int32 ']'
                        | nativeType '[' '+' int32 ']'
                        | K_DECIMAL
                        | K_DATE
                        | K_BSTR
                        | K_LPSTR
                        | K_LPWSTR
                        | K_LPTSTR
                        | K_OBJECTREF
                        | K_IUNKNOWN  iidParamIndex
                        | K_IDISPATCH iidParamIndex
                        | K_STRUCT
                        | K_INTERFACE iidParamIndex
                        | K_SAFEARRAY variantType
                        | K_SAFEARRAY variantType ',' compQstring

                        | K_INT
                        | K_UNSIGNED K_INT
                        | K_UINT
                        | K_NESTED K_STRUCT
                        | K_BYVALSTR
                        | K_ANSI K_BSTR
                        | K_TBSTR
                        | K_VARIANT K_BOOL
                        | K_METHOD
                        | K_AS K_ANY
                        | K_LPSTRUCT
//                        | TYPEDEF_TS
                        ;

iidParamIndex           : /* EMPTY */
                        | '(' K_IIDPARAM '=' int32 ')'
                        ;

variantType             : /* EMPTY */
                        | K_NULL
                        | K_VARIANT
                        | K_CURRENCY
                        | K_VOID
                        | K_BOOL
                        | K_INT8
                        | K_INT16
                        | K_INT32
                        | K_INT64
                        | K_FLOAT32
                        | K_FLOAT64
                        | K_UNSIGNED K_INT8
                        | K_UNSIGNED K_INT16
                        | K_UNSIGNED K_INT32
                        | K_UNSIGNED K_INT64
                        | K_UINT8
                        | K_UINT16
                        | K_UINT32
                        | K_UINT64
                        | '*'
                        | variantType '[' ']'
                        | variantType K_VECTOR
                        | variantType '&'
                        | K_DECIMAL
                        | K_DATE
                        | K_BSTR
                        | K_LPSTR
                        | K_LPWSTR
                        | K_IUNKNOWN
                        | K_IDISPATCH
                        | K_SAFEARRAY
                        | K_INT
                        | K_UNSIGNED K_INT
                        | K_UINT
                        | K_ERROR
                        | K_HRESULT
                        | K_CARRAY
                        | K_USERDEFINED
                        | K_RECORD
                        | K_FILETIME
                        | K_BLOB
                        | K_STREAM
                        | K_STORAGE
                        | K_STREAMED_OBJECT
                        | K_STORED_OBJECT
                        | K_BLOB_OBJECT
                        | K_CF
                        | K_CLSID
                        ;

/*  Managed types for signatures  */
type                    : K_CLASS className
                        | K_OBJECT
                        | K_VALUE K_CLASS className
                        | K_VALUETYPE className
                        | type '[' ']'
                        | type '[' bounds1 ']'
                        | type '&'
                        | type '*'
                        | type K_PINNED
                        | type K_MODREQ '(' typeSpec ')'
                        | type K_MODOPT '(' typeSpec ')'
                        | methodSpec callConv type '*' '(' sigArgs0 ')'
                        | type '<' tyArgs1 '>'
                        | '!' '!' int32
                        | '!' int32
                        | '!' '!' dottedName
                        | '!' dottedName
                        | K_TYPEDREF
                        | K_VOID
                        | K_NATIVE K_INT
                        | K_NATIVE K_UNSIGNED K_INT
                        | K_NATIVE K_UINT
                        | simpleType
                        | ELIPSIS type
                        ;

simpleType              : K_CHAR
                        | K_STRING
                        | K_BOOL
                        | K_INT8
                        | K_INT16
                        | K_INT32
                        | K_INT64
                        | K_FLOAT32
                        | K_FLOAT64
                        | K_UNSIGNED K_INT8
                        | K_UNSIGNED K_INT16
                        | K_UNSIGNED K_INT32
                        | K_UNSIGNED K_INT64
                        | K_UINT8
                        | K_UINT16
                        | K_UINT32
                        | K_UINT64
//                        | TYPEDEF_TS
                        ;

bounds1                 : bound
                        | bounds1 ',' bound
                        ;

bound                   : /* EMPTY */
                        | ELIPSIS
                        | int32 ELIPSIS? int32?
                        ;

/*  Security declarations  */
secDecl                 : D_PERMISSION secAction typeSpec '(' nameValPairs ')'
                        | D_PERMISSION secAction typeSpec '=' '{' customBlobDescr '}'
                        | D_PERMISSION secAction typeSpec
                        | psetHead bytes ')'
                        | D_PERMISSIONSET secAction compQstring
                        | D_PERMISSIONSET secAction '=' '{' secAttrSetBlob '}'
                        ;

secAttrSetBlob          : /* EMPTY */
                        | secAttrBlob
                        | secAttrBlob ',' secAttrSetBlob
                        ;

secAttrBlob             : typeSpec '=' '{' customBlobNVPairs '}'
                        | K_CLASS SQSTRING '=' '{' customBlobNVPairs '}'
                        ;

psetHead                : D_PERMISSIONSET secAction '=' '('
                        | D_PERMISSIONSET secAction K_BYTEARRAY '('
                        ;

nameValPairs            : nameValPair
                        | nameValPair ',' nameValPairs
                        ;

nameValPair             : compQstring '=' caValue
                        ;

truefalse               : K_TRUE
                        | K_FALSE
                        ;

caValue                 : truefalse
                        | int32
                        | K_INT32 '(' int32 ')'
                        | compQstring
                        | className '(' K_INT8 ':' int32 ')'
                        | className '(' K_INT16 ':' int32 ')'
                        | className '(' K_INT32 ':' int32 ')'
                        | className '(' int32 ')'
                        ;

secAction               : K_REQUEST
                        | K_DEMAND
                        | K_ASSERT
                        | K_DENY
                        | K_PERMITONLY
                        | K_LINKCHECK
                        | K_INHERITCHECK
                        | K_REQMIN
                        | K_REQOPT
                        | K_REQREFUSE
                        | K_PREJITGRANT
                        | K_PREJITDENY
                        | K_NONCASDEMAND
                        | K_NONCASLINKDEMAND
                        | K_NONCASINHERITANCE
                        ;

/*  External source declarations  */
esHead                  : D_LINE
                        | P_LINE
                        ;

extSourceSpec           : esHead int32 SQSTRING
                        | esHead int32
                        | esHead int32 ':' int32 SQSTRING
                        | esHead int32 ':' int32
                        | esHead int32 ':' int32 ',' int32 SQSTRING
                        | esHead int32 ':' int32 ',' int32
                        | esHead int32 ',' int32 ':' int32 SQSTRING
                        | esHead int32 ',' int32 ':' int32
                        | esHead int32 ',' int32 ':' int32 ',' int32 SQSTRING
                        | esHead int32 ',' int32 ':' int32 ',' int32
                        | esHead int32 QSTRING
                        ;

/*  Manifest declarations  */
fileDecl                : D_FILE fileAttr dottedName fileEntry hashHead bytes ')' fileEntry
                        | D_FILE fileAttr dottedName fileEntry
                        ;

fileAttr                : /* EMPTY */
                        | fileAttr K_NOMETADATA
                        ;

fileEntry               : /* EMPTY */
                        | D_ENTRYPOINT
                        ;

hashHead                : D_HASH '=' '('
                        ;

assemblyHead            : D_ASSEMBLY asmAttr*? dottedName
                        ;

asmAttr                 : K_RETARGETABLE
                        | K_WINDOWSRUNTIME
                        | K_NOPLATFORM
                        | K_LEGACY K_LIBRARY
                        | K_CIL
                        | K_X86
                        | K_AMD64
                        | K_ARM
                        | K_ARM64
                        ;

assemblyDecls           : assemblyDecl*?
                        ;

assemblyDecl            : D_HASH K_ALGORITHM int32
                        | secDecl
                        | asmOrRefDecl
                        ;

intOrWildcard           : int32
                        | '*'
                        ;

asmOrRefDecl            : publicKeyHead bytes ')'
                        | D_VER intOrWildcard ':' intOrWildcard ':' intOrWildcard ':' intOrWildcard
                        | D_LOCALE compQstring
                        | localeHead bytes ')'
                        | customAttrDecl
                        | compControl
                        ;

publicKeyHead           : D_PUBLICKEY '=' '('
                        ;

publicKeyTokenHead      : D_PUBLICKEYTOKEN '=' '('
                        ;

localeHead              : D_LOCALE '=' '('
                        ;

assemblyRefHead         : D_ASSEMBLY K_EXTERN asmAttr*? dottedName (K_AS dottedName)?;

assemblyRefDecls        : assemblyRefDecl*?
                        ;

assemblyRefDecl         : hashHead bytes ')'
                        | asmOrRefDecl
                        | publicKeyTokenHead bytes ')'
                        | K_AUTO
                        ;

exptypeHead             : D_CLASS K_EXTERN exptAttr dottedName
                        ;

exportHead              : D_EXPORT exptAttr dottedName   /* deprecated */
                        ;

exptAttr                : (K_PRIVATE
                        | K_PUBLIC
                        | K_FORWARDER
                        | K_NESTED K_PUBLIC
                        | K_NESTED K_PRIVATE
                        | K_NESTED K_FAMILY
                        | K_NESTED K_ASSEMBLY
                        | K_NESTED K_FAMANDASSEM
                        | K_NESTED K_FAMORASSEM)*
                        ;

exptypeDecls            : exptypeDecl*?
                        ;

exptypeDecl             : D_FILE dottedName
                        | D_CLASS K_EXTERN slashedName
                        | D_ASSEMBLY K_EXTERN dottedName
                        | K_MDTOKEN '(' int32 ')'
                        | D_CLASS  int32
                        | customAttrDecl
                        | compControl
                        ;

manifestResHead         : D_MRESOURCE manresAttr*? dottedName (K_AS dottedName)?
                        ;

manresAttr              : K_PUBLIC
                        | K_PRIVATE
                        ;

manifestResDecls        : manifestResDecl*?
                        ;

manifestResDecl         : D_FILE dottedName K_AT int32
                        | D_ASSEMBLY K_EXTERN dottedName
                        | customAttrDecl
                        | compControl
                        ;


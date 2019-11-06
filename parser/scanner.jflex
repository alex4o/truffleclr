%%

%public
%class CilScanner
%implements CilParser.yyInput
%integer

%line
%column
%unicode

%{
private int token;
private Object value;

// the next 3 methods are required to implement the yyInput interface

public boolean advance() throws java.io.IOException {
  value = new String("");
  token = yylex();
  return (token != YYEOF);
}

public int token() {
  return token;
}

public Object value() {
  return value;
}

%}



WS = [ \n\t\r]+
LINE_COMMENT = "//" [\r\n]*

QSTRING = "\"" ( . | "\\\"" )*? "\""        /* "Hello World\n" */
SQSTRING = "'" ( . | "\\'" )*? "'"        /* 'Hello World\n' */

ID = [A-Za-z_]+[0-9]*              /* testing343 */
DOTTEDNAME = ID ("." ID)*     /* System.Object */

// INT32 = "-"? [0-9]+ | "0x" [0-9A-F]+ | "0" [0-9]+        /* 3425 0x34FA  0352  */
INT64 = "-"? [0-9]+ | "0x" [0-9A-F]+         /* 342534523534534      0x34FA434644554 */
FLOAT64 = ("-"? [0-9]+) ("." [0-9]+)? | ("-"? [0-9]+ "E" "-"? [0-9]+)          /* -334234 24E-34 */
HEXBYTE = [A-F0-9][A-F0-9] (" " [A-F0-9][A-F0-9])*

K_ERROR = "error"
    K_BAD_COMMENT = "bad_comment"
    K_BAD_LITERAL = "bad_literal"
    K_VOID = "void"
    K_BOOL = "bool"
    K_CHAR = "char"
    K_UNSIGNED = "unsigned"
    K_INT = "int"
    K_INT8 = "int8"
    K_INT16 = "int16"
    K_INT32 = "int32"
    K_INT64 = "int64"
    K_FLOAT = "float"
    K_FLOAT32 = "float32"
    K_FLOAT64 = "float64"
    K_BYTEARRAY = "bytearray"
    K_UINT = "uint"
    K_UINT8 = "uint8"
    K_UINT16 = "uint16"
    K_UINT32 = "uint32"
    K_UINT64 = "uint64"
    K_FLAGS = "flags"
    K_CALLCONV = "callconv"
    K_MDTOKEN = "mdtoken"
    K_OBJECT = "object"
    K_STRING = "string"
    K_NULLREF = "nullref"
    K_DEFAULT = "default"
    K_CDECL = "cdecl"
    K_VARARG = "vararg"
    K_STDCALL = "stdcall"
    K_THISCALL = "thiscall"
    K_FASTCALL = "fastcall"
    K_CLASS = "class"
    K_TYPEDREF = "typedref"
    K_UNMANAGED = "unmanaged"
    K_FINALLY = "finally"
    K_HANDLER = "handler"
    K_CATCH = "catch"
    K_FILTER = "filter"
    K_FAULT = "fault"
    K_EXTENDS = "extends"
    K_IMPLEMENTS = "implements"
    K_TO = "to"
    K_AT = "at"
    K_TLS = "tls"
    K_TRUE = "true"
    K_FALSE = "false"
    D_INTERFACEIMPL = ".interfaceimpl"
    K_VALUE = "value"
    K_VALUETYPE = "valuetype"
    K_NATIVE = "native"
    K_INSTANCE = "instance"
    K_SPECIALNAME = "specialname"
    K_FORWARDER = "forwarder"
    K_STATIC = "static"
    K_PUBLIC = "public"
    K_PRIVATE = "private"
    K_FAMILY = "family"
    K_FINAL = "final"
    K_SYNCHRONIZED = "synchronized"
    K_INTERFACE = "interface"
    K_SEALED = "sealed"
    K_NESTED = "nested"
    K_ABSTRACT = "abstract"
    K_AUTO = "auto"
    K_SEQUENTIAL = "sequential"
    K_EXPLICIT = "explicit"
    K_ANSI = "ansi"
    K_UNICODE = "unicode"
    K_AUTOCHAR = "autochar"
    K_IMPORT = "import"
    K_ENUM = "enum"
    K_VIRTUAL = "virtual"
    K_NOINLINING = "noinlining"
    K_AGGRESSIVEINLINING = "aggressiveinlining"
    K_NOOPTIMIZATION = "nooptimization"
    K_AGGRESSIVEOPTIMIZATION = "aggressiveoptimization"
    K_UNMANAGEDEXP = "unmanagedexp"
    K_BEFOREFIELDINIT = "beforefieldinit"
    K_STRICT = "strict"
    K_RETARGETABLE = "retargetable"
    K_WINDOWSRUNTIME = "windowsruntime"
    K_NOPLATFORM = "noplatform"
    K_METHOD = "method"
    K_FIELD = "field"
    K_PINNED = "pinned"
    K_MODREQ = "modreq"
    K_MODOPT = "modopt"
    K_SERIALIZABLE = "serializable"
    K_PROPERTY = "property"
    K_TYPE = "type"
    K_ASSEMBLY = "assembly"
    K_FAMANDASSEM = "famandassem"
    K_FAMORASSEM = "famorassem"
    K_PRIVATESCOPE = "privatescope"
    K_HIDEBYSIG = "hidebysig"
    K_NEWSLOT = "newslot"
    K_RTSPECIALNAME = "rtspecialname"
    K_PINVOKEIMPL = "pinvokeimpl"
    D_CTOR = ".ctor"
    D_CCTOR = ".cctor"
    K_LITERAL = "literal"
    K_NOTSERIALIZED = "notserialized"
    K_INITONLY = "initonly"
    K_REQSECOBJ = "reqsecobj"
    K_CIL = "cil"
    K_OPTIL = "optil"
    K_MANAGED = "managed"
    K_FORWARDREF = "forwardref"
    K_PRESERVESIG = "preservesig"
    K_RUNTIME = "runtime"
    K_INTERNALCALL = "internalcall"
    D_IMPORT = ".import"
    K_NOMANGLE = "nomangle"
    K_LASTERR = "lasterr"
    K_WINAPI = "winapi"
    K_AS = "as"
    K_BESTFIT = "bestfit"
    K_ON = "on"
    K_OFF = "off"
    K_CHARMAPERROR = "charmaperror"
    D_CLASS = ".class"
    D_NAMESPACE = ".namespace"
    D_METHOD = ".method"
    D_FIELD = ".field"
    D_DATA = ".data"
    D_THIS = ".this"
    D_BASE = ".base"
    D_NESTER = ".nester"
    D_EMITBYTE = ".emitbyte"
    D_TRY = ".try"
    D_MAXSTACK = ".maxstack"
    D_LOCALS = ".locals"
    D_ENTRYPOINT = ".entrypoint"
    D_ZEROINIT = ".zeroinit"
    D_EVENT = ".event"
    D_ADDON = ".addon"
    D_REMOVEON = ".removeon"
    D_FIRE = ".fire"
    D_OTHER = ".other"
    D_PROPERTY = ".property"
    D_SET = ".set"
    D_GET = ".get"
    K_DEFAULT = "default"
    D_PERMISSION = ".permission"
    D_PERMISSIONSET = ".permissionset"
    K_REQUEST = "request"
    K_DEMAND = "demand"
    K_ASSERT = "assert"
    K_DENY = "deny"
    K_PERMITONLY = "permitonly"
    K_LINKCHECK = "linkcheck"
    K_INHERITCHECK = "inheritcheck"
    K_REQMIN = "reqmin"
    K_REQOPT = "reqopt"
    K_REQREFUSE = "reqrefuse"
    K_PREJITGRANT = "prejitgrant"
    K_PREJITDENY = "prejitdeny"
    K_NONCASDEMAND = "noncasdemand"
    K_NONCASLINKDEMAND = "noncaslinkdemand"
    K_NONCASINHERITANCE = "noncasinheritance"
    D_LINE = ".line"
    P_LINE = ".line"
    D_LANGUAGE = ".language"
    D_CUSTOM = ".custom"
    K_INIT = "init"
    D_SIZE = ".size"
    D_PACK = ".pack"
    D_VTABLE = ".vtable"
    D_VTFIXUP = ".vtfixup"
    K_FROMUNMANAGED = "fromunmanaged"
    K_CALLMOSTDERIVED = "callmostderived"
    D_VTENTRY = ".vtentry"
    K_RETAINAPPDOMAIN = "retainappdomain"
    D_FILE = ".file"
    K_NOMETADATA = "nometadata"
    D_HASH = ".hash"
    D_ASSEMBLY = ".assembly"
    D_PUBLICKEY = ".publickey"
    D_PUBLICKEYTOKEN = ".publickeytoken"
    K_ALGORITHM = "algorithm"
    D_VER = ".ver"
    D_LOCALE = ".locale"
    K_EXTERN = "extern"
    D_MRESOURCE = ".mresource"
    D_MODULE = ".module"
    D_EXPORT = ".export"
    K_LEGACY = "legacy"
    K_LIBRARY = "library"
    K_X86 = "x86"
    K_AMD64 = "amd64"
    K_ARM = "arm"
    K_ARM64 = "arm64"
    K_MARSHAL = "marshal"
    K_CUSTOM = "custom"
    K_SYSSTRING = "sysstring"
    K_FIXED = "fixed"
    K_VARIANT = "variant"
    K_CURRENCY = "currency"
    K_SYSCHAR = "syschar"
    K_DECIMAL = "decimal"
    K_DATE = "date"
    K_BSTR = "bstr"
    K_TBSTR = "tbstr"
    K_LPSTR = "lpstr"
    K_LPWSTR = "lpwstr"
    K_LPTSTR = "lptstr"
    K_OBJECTREF = "objectref"
    K_IUNKNOWN = "iunknown"
    K_IDISPATCH = "idispatch"
    K_STRUCT = "struct"
    K_SAFEARRAY = "safearray"
    K_BYVALSTR = "byvalstr"
    K_LPVOID = "lpvoid"
    K_ANY = "any"
    K_ARRAY = "array"
    K_LPSTRUCT = "lpstruct"
    K_IIDPARAM = "iidparam"
    K_IN = "in"
    K_OUT = "out"
    K_OPT = "opt"
    D_PARAM = ".param"
    D_OVERRIDE = ".override"
    K_WITH = "with"
    K_NULL = "null"
    K_ERROR = "error"
    K_HRESULT = "hresult"
    K_CARRAY = "carray"
    K_USERDEFINED = "userdefined"
    K_RECORD = "record"
    K_FILETIME = "filetime"
    K_BLOB = "blob"
    K_STREAM = "stream"
    K_STORAGE = "storage"
    K_STREAMED_OBJECT = "streamed_object"
    K_STORED_OBJECT = "stored_object"
    K_BLOB_OBJECT = "blob_object"
    K_CF = "cf"
    K_CLSID = "clsid"
    K_VECTOR = "vector"
    D_SUBSYSTEM = ".subsystem"
    D_CORFLAGS = ".corflags"
    K_ALIGNMENT = "alignment"
    D_IMAGEBASE = ".imagebase"
    D_STACKRESERVE = ".stackreserve"
    D_TYPEDEF = ".typedef"
    D_TEMPLATE = ".template"
    D_TYPELIST = ".typelist"
    D_MSCORLIB = ".mscorlib"
    P_DEFINE = ".define"
    P_UNDEF = ".undef"
    P_IFDEF = ".ifdef"
    P_IFNDEF = ".ifndef"
    P_ELSE = ".else"
    P_ENDIF = ".endif"
    P_INCLUDE = ".include"
    K_CONSTRAINT = "constraint"
    OPEN_BRACE = "{"
    CLOSE_BRACE = "}"
    OPEN_BRACKET = "["
    CLOSE_BRACKET = "]"
    OPEN_PARENS = "("
    CLOSE_PARENS = ")"
    COMMA = ","
    COLON = ":"
    DCOLON = "::"
    SEMICOLON = ";"
    ASSIGN = "="
    STAR = "*"
    AMPERSAND = "&"
    PLUS = "+"
    SLASH = "/"
    BANG = "!"
    ELIPSIS = "..."
    DASH = "-"
    OPEN_ANGLE_BRACKET = "<"
    CLOSE_ANGLE_BRACKET = ">"

%%


{K_ERROR} { return CilParser.K_ERROR; }
    {K_BAD_COMMENT} { return CilParser.K_BAD_COMMENT; }
    {K_BAD_LITERAL} { return CilParser.K_BAD_LITERAL; }
    {K_VOID} { return CilParser.K_VOID; }
    {K_BOOL} { return CilParser.K_BOOL; }
    {K_CHAR} { return CilParser.K_CHAR; }
    {K_UNSIGNED} { return CilParser.K_UNSIGNED; }
    {K_INT} { return CilParser.K_INT; }
    {K_INT8} { return CilParser.K_INT8; }
    {K_INT16} { return CilParser.K_INT16; }
    {K_INT32} { return CilParser.K_INT32; }
    {K_INT64} { return CilParser.K_INT64; }
    {K_FLOAT} { return CilParser.K_FLOAT; }
    {K_FLOAT32} { return CilParser.K_FLOAT32; }
    {K_FLOAT64} { return CilParser.K_FLOAT64; }
    {K_BYTEARRAY} { return CilParser.K_BYTEARRAY; }
    {K_UINT} { return CilParser.K_UINT; }
    {K_UINT8} { return CilParser.K_UINT8; }
    {K_UINT16} { return CilParser.K_UINT16; }
    {K_UINT32} { return CilParser.K_UINT32; }
    {K_UINT64} { return CilParser.K_UINT64; }
    {K_FLAGS} { return CilParser.K_FLAGS; }
    {K_CALLCONV} { return CilParser.K_CALLCONV; }
    {K_MDTOKEN} { return CilParser.K_MDTOKEN; }
    {K_OBJECT} { return CilParser.K_OBJECT; }
    {K_STRING} { return CilParser.K_STRING; }
    {K_NULLREF} { return CilParser.K_NULLREF; }
    {K_DEFAULT} { return CilParser.K_DEFAULT; }
    {K_CDECL} { return CilParser.K_CDECL; }
    {K_VARARG} { return CilParser.K_VARARG; }
    {K_STDCALL} { return CilParser.K_STDCALL; }
    {K_THISCALL} { return CilParser.K_THISCALL; }
    {K_FASTCALL} { return CilParser.K_FASTCALL; }
    {K_CLASS} { return CilParser.K_CLASS; }
    {K_TYPEDREF} { return CilParser.K_TYPEDREF; }
    {K_UNMANAGED} { return CilParser.K_UNMANAGED; }
    {K_FINALLY} { return CilParser.K_FINALLY; }
    {K_HANDLER} { return CilParser.K_HANDLER; }
    {K_CATCH} { return CilParser.K_CATCH; }
    {K_FILTER} { return CilParser.K_FILTER; }
    {K_FAULT} { return CilParser.K_FAULT; }
    {K_EXTENDS} { return CilParser.K_EXTENDS; }
    {K_IMPLEMENTS} { return CilParser.K_IMPLEMENTS; }
    {K_TO} { return CilParser.K_TO; }
    {K_AT} { return CilParser.K_AT; }
    {K_TLS} { return CilParser.K_TLS; }
    {K_TRUE} { return CilParser.K_TRUE; }
    {K_FALSE} { return CilParser.K_FALSE; }
    {D_INTERFACEIMPL} { return CilParser.D_INTERFACEIMPL; }
    {K_VALUE} { return CilParser.K_VALUE; }
    {K_VALUETYPE} { return CilParser.K_VALUETYPE; }
    {K_NATIVE} { return CilParser.K_NATIVE; }
    {K_INSTANCE} { return CilParser.K_INSTANCE; }
    {K_SPECIALNAME} { return CilParser.K_SPECIALNAME; }
    {K_FORWARDER} { return CilParser.K_FORWARDER; }
    {K_STATIC} { return CilParser.K_STATIC; }
    {K_PUBLIC} { return CilParser.K_PUBLIC; }
    {K_PRIVATE} { return CilParser.K_PRIVATE; }
    {K_FAMILY} { return CilParser.K_FAMILY; }
    {K_FINAL} { return CilParser.K_FINAL; }
    {K_SYNCHRONIZED} { return CilParser.K_SYNCHRONIZED; }
    {K_INTERFACE} { return CilParser.K_INTERFACE; }
    {K_SEALED} { return CilParser.K_SEALED; }
    {K_NESTED} { return CilParser.K_NESTED; }
    {K_ABSTRACT} { return CilParser.K_ABSTRACT; }
    {K_AUTO} { return CilParser.K_AUTO; }
    {K_SEQUENTIAL} { return CilParser.K_SEQUENTIAL; }
    {K_EXPLICIT} { return CilParser.K_EXPLICIT; }
    {K_ANSI} { return CilParser.K_ANSI; }
    {K_UNICODE} { return CilParser.K_UNICODE; }
    {K_AUTOCHAR} { return CilParser.K_AUTOCHAR; }
    {K_IMPORT} { return CilParser.K_IMPORT; }
    {K_ENUM} { return CilParser.K_ENUM; }
    {K_VIRTUAL} { return CilParser.K_VIRTUAL; }
    {K_NOINLINING} { return CilParser.K_NOINLINING; }
    {K_AGGRESSIVEINLINING} { return CilParser.K_AGGRESSIVEINLINING; }
    {K_NOOPTIMIZATION} { return CilParser.K_NOOPTIMIZATION; }
    {K_AGGRESSIVEOPTIMIZATION} { return CilParser.K_AGGRESSIVEOPTIMIZATION; }
    {K_UNMANAGEDEXP} { return CilParser.K_UNMANAGEDEXP; }
    {K_BEFOREFIELDINIT} { return CilParser.K_BEFOREFIELDINIT; }
    {K_STRICT} { return CilParser.K_STRICT; }
    {K_RETARGETABLE} { return CilParser.K_RETARGETABLE; }
    {K_WINDOWSRUNTIME} { return CilParser.K_WINDOWSRUNTIME; }
    {K_NOPLATFORM} { return CilParser.K_NOPLATFORM; }
    {K_METHOD} { return CilParser.K_METHOD; }
    {K_FIELD} { return CilParser.K_FIELD; }
    {K_PINNED} { return CilParser.K_PINNED; }
    {K_MODREQ} { return CilParser.K_MODREQ; }
    {K_MODOPT} { return CilParser.K_MODOPT; }
    {K_SERIALIZABLE} { return CilParser.K_SERIALIZABLE; }
    {K_PROPERTY} { return CilParser.K_PROPERTY; }
    {K_TYPE} { return CilParser.K_TYPE; }
    {K_ASSEMBLY} { return CilParser.K_ASSEMBLY; }
    {K_FAMANDASSEM} { return CilParser.K_FAMANDASSEM; }
    {K_FAMORASSEM} { return CilParser.K_FAMORASSEM; }
    {K_PRIVATESCOPE} { return CilParser.K_PRIVATESCOPE; }
    {K_HIDEBYSIG} { return CilParser.K_HIDEBYSIG; }
    {K_NEWSLOT} { return CilParser.K_NEWSLOT; }
    {K_RTSPECIALNAME} { return CilParser.K_RTSPECIALNAME; }
    {K_PINVOKEIMPL} { return CilParser.K_PINVOKEIMPL; }
    {D_CTOR} { return CilParser.D_CTOR; }
    {D_CCTOR} { return CilParser.D_CCTOR; }
    {K_LITERAL} { return CilParser.K_LITERAL; }
    {K_NOTSERIALIZED} { return CilParser.K_NOTSERIALIZED; }
    {K_INITONLY} { return CilParser.K_INITONLY; }
    {K_REQSECOBJ} { return CilParser.K_REQSECOBJ; }
    {K_CIL} { return CilParser.K_CIL; }
    {K_OPTIL} { return CilParser.K_OPTIL; }
    {K_MANAGED} { return CilParser.K_MANAGED; }
    {K_FORWARDREF} { return CilParser.K_FORWARDREF; }
    {K_PRESERVESIG} { return CilParser.K_PRESERVESIG; }
    {K_RUNTIME} { return CilParser.K_RUNTIME; }
    {K_INTERNALCALL} { return CilParser.K_INTERNALCALL; }
    {D_IMPORT} { return CilParser.D_IMPORT; }
    {K_NOMANGLE} { return CilParser.K_NOMANGLE; }
    {K_LASTERR} { return CilParser.K_LASTERR; }
    {K_WINAPI} { return CilParser.K_WINAPI; }
    {K_AS} { return CilParser.K_AS; }
    {K_BESTFIT} { return CilParser.K_BESTFIT; }
    {K_ON} { return CilParser.K_ON; }
    {K_OFF} { return CilParser.K_OFF; }
    {K_CHARMAPERROR} { return CilParser.K_CHARMAPERROR; }
    {D_CLASS} { return CilParser.D_CLASS; }
    {D_NAMESPACE} { return CilParser.D_NAMESPACE; }
    {D_METHOD} { return CilParser.D_METHOD; }
    {D_FIELD} { return CilParser.D_FIELD; }
    {D_DATA} { return CilParser.D_DATA; }
    {D_THIS} { return CilParser.D_THIS; }
    {D_BASE} { return CilParser.D_BASE; }
    {D_NESTER} { return CilParser.D_NESTER; }
    {D_EMITBYTE} { return CilParser.D_EMITBYTE; }
    {D_TRY} { return CilParser.D_TRY; }
    {D_MAXSTACK} { return CilParser.D_MAXSTACK; }
    {D_LOCALS} { return CilParser.D_LOCALS; }
    {D_ENTRYPOINT} { return CilParser.D_ENTRYPOINT; }
    {D_ZEROINIT} { return CilParser.D_ZEROINIT; }
    {D_EVENT} { return CilParser.D_EVENT; }
    {D_ADDON} { return CilParser.D_ADDON; }
    {D_REMOVEON} { return CilParser.D_REMOVEON; }
    {D_FIRE} { return CilParser.D_FIRE; }
    {D_OTHER} { return CilParser.D_OTHER; }
    {D_PROPERTY} { return CilParser.D_PROPERTY; }
    {D_SET} { return CilParser.D_SET; }
    {D_GET} { return CilParser.D_GET; }
    {K_DEFAULT} { return CilParser.K_DEFAULT; }
    {D_PERMISSION} { return CilParser.D_PERMISSION; }
    {D_PERMISSIONSET} { return CilParser.D_PERMISSIONSET; }
    {K_REQUEST} { return CilParser.K_REQUEST; }
    {K_DEMAND} { return CilParser.K_DEMAND; }
    {K_ASSERT} { return CilParser.K_ASSERT; }
    {K_DENY} { return CilParser.K_DENY; }
    {K_PERMITONLY} { return CilParser.K_PERMITONLY; }
    {K_LINKCHECK} { return CilParser.K_LINKCHECK; }
    {K_INHERITCHECK} { return CilParser.K_INHERITCHECK; }
    {K_REQMIN} { return CilParser.K_REQMIN; }
    {K_REQOPT} { return CilParser.K_REQOPT; }
    {K_REQREFUSE} { return CilParser.K_REQREFUSE; }
    {K_PREJITGRANT} { return CilParser.K_PREJITGRANT; }
    {K_PREJITDENY} { return CilParser.K_PREJITDENY; }
    {K_NONCASDEMAND} { return CilParser.K_NONCASDEMAND; }
    {K_NONCASLINKDEMAND} { return CilParser.K_NONCASLINKDEMAND; }
    {K_NONCASINHERITANCE} { return CilParser.K_NONCASINHERITANCE; }
    {D_LINE} { return CilParser.D_LINE; }
    {P_LINE} { return CilParser.P_LINE; }
    {D_LANGUAGE} { return CilParser.D_LANGUAGE; }
    {D_CUSTOM} { return CilParser.D_CUSTOM; }
    {K_INIT} { return CilParser.K_INIT; }
    {D_SIZE} { return CilParser.D_SIZE; }
    {D_PACK} { return CilParser.D_PACK; }
    {D_VTABLE} { return CilParser.D_VTABLE; }
    {D_VTFIXUP} { return CilParser.D_VTFIXUP; }
    {K_FROMUNMANAGED} { return CilParser.K_FROMUNMANAGED; }
    {K_CALLMOSTDERIVED} { return CilParser.K_CALLMOSTDERIVED; }
    {D_VTENTRY} { return CilParser.D_VTENTRY; }
    {K_RETAINAPPDOMAIN} { return CilParser.K_RETAINAPPDOMAIN; }
    {D_FILE} { return CilParser.D_FILE; }
    {K_NOMETADATA} { return CilParser.K_NOMETADATA; }
    {D_HASH} { return CilParser.D_HASH; }
    {D_ASSEMBLY} { return CilParser.D_ASSEMBLY; }
    {D_PUBLICKEY} { return CilParser.D_PUBLICKEY; }
    {D_PUBLICKEYTOKEN} { return CilParser.D_PUBLICKEYTOKEN; }
    {K_ALGORITHM} { return CilParser.K_ALGORITHM; }
    {D_VER} { return CilParser.D_VER; }
    {D_LOCALE} { return CilParser.D_LOCALE; }
    {K_EXTERN} { return CilParser.K_EXTERN; }
    {D_MRESOURCE} { return CilParser.D_MRESOURCE; }
    {D_MODULE} { return CilParser.D_MODULE; }
    {D_EXPORT} { return CilParser.D_EXPORT; }
    {K_LEGACY} { return CilParser.K_LEGACY; }
    {K_LIBRARY} { return CilParser.K_LIBRARY; }
    {K_X86} { return CilParser.K_X86; }
    {K_AMD64} { return CilParser.K_AMD64; }
    {K_ARM} { return CilParser.K_ARM; }
    {K_ARM64} { return CilParser.K_ARM64; }
    {K_MARSHAL} { return CilParser.K_MARSHAL; }
    {K_CUSTOM} { return CilParser.K_CUSTOM; }
    {K_SYSSTRING} { return CilParser.K_SYSSTRING; }
    {K_FIXED} { return CilParser.K_FIXED; }
    {K_VARIANT} { return CilParser.K_VARIANT; }
    {K_CURRENCY} { return CilParser.K_CURRENCY; }
    {K_SYSCHAR} { return CilParser.K_SYSCHAR; }
    {K_DECIMAL} { return CilParser.K_DECIMAL; }
    {K_DATE} { return CilParser.K_DATE; }
    {K_BSTR} { return CilParser.K_BSTR; }
    {K_TBSTR} { return CilParser.K_TBSTR; }
    {K_LPSTR} { return CilParser.K_LPSTR; }
    {K_LPWSTR} { return CilParser.K_LPWSTR; }
    {K_LPTSTR} { return CilParser.K_LPTSTR; }
    {K_OBJECTREF} { return CilParser.K_OBJECTREF; }
    {K_IUNKNOWN} { return CilParser.K_IUNKNOWN; }
    {K_IDISPATCH} { return CilParser.K_IDISPATCH; }
    {K_STRUCT} { return CilParser.K_STRUCT; }
    {K_SAFEARRAY} { return CilParser.K_SAFEARRAY; }
    {K_BYVALSTR} { return CilParser.K_BYVALSTR; }
    {K_LPVOID} { return CilParser.K_LPVOID; }
    {K_ANY} { return CilParser.K_ANY; }
    {K_ARRAY} { return CilParser.K_ARRAY; }
    {K_LPSTRUCT} { return CilParser.K_LPSTRUCT; }
    {K_IIDPARAM} { return CilParser.K_IIDPARAM; }
    {K_IN} { return CilParser.K_IN; }
    {K_OUT} { return CilParser.K_OUT; }
    {K_OPT} { return CilParser.K_OPT; }
    {D_PARAM} { return CilParser.D_PARAM; }
    {D_OVERRIDE} { return CilParser.D_OVERRIDE; }
    {K_WITH} { return CilParser.K_WITH; }
    {K_NULL} { return CilParser.K_NULL; }
    {K_ERROR} { return CilParser.K_ERROR; }
    {K_HRESULT} { return CilParser.K_HRESULT; }
    {K_CARRAY} { return CilParser.K_CARRAY; }
    {K_USERDEFINED} { return CilParser.K_USERDEFINED; }
    {K_RECORD} { return CilParser.K_RECORD; }
    {K_FILETIME} { return CilParser.K_FILETIME; }
    {K_BLOB} { return CilParser.K_BLOB; }
    {K_STREAM} { return CilParser.K_STREAM; }
    {K_STORAGE} { return CilParser.K_STORAGE; }
    {K_STREAMED_OBJECT} { return CilParser.K_STREAMED_OBJECT; }
    {K_STORED_OBJECT} { return CilParser.K_STORED_OBJECT; }
    {K_BLOB_OBJECT} { return CilParser.K_BLOB_OBJECT; }
    {K_CF} { return CilParser.K_CF; }
    {K_CLSID} { return CilParser.K_CLSID; }
    {K_VECTOR} { return CilParser.K_VECTOR; }
    {D_SUBSYSTEM} { return CilParser.D_SUBSYSTEM; }
    {D_CORFLAGS} { return CilParser.D_CORFLAGS; }
    {K_ALIGNMENT} { return CilParser.K_ALIGNMENT; }
    {D_IMAGEBASE} { return CilParser.D_IMAGEBASE; }
    {D_STACKRESERVE} { return CilParser.D_STACKRESERVE; }
    {D_TYPEDEF} { return CilParser.D_TYPEDEF; }
    {D_TEMPLATE} { return CilParser.D_TEMPLATE; }
    {D_TYPELIST} { return CilParser.D_TYPELIST; }
    {D_MSCORLIB} { return CilParser.D_MSCORLIB; }
    {P_DEFINE} { return CilParser.P_DEFINE; }
    {P_UNDEF} { return CilParser.P_UNDEF; }
    {P_IFDEF} { return CilParser.P_IFDEF; }
    {P_IFNDEF} { return CilParser.P_IFNDEF; }
    {P_ELSE} { return CilParser.P_ELSE; }
    {P_ENDIF} { return CilParser.P_ENDIF; }
    {P_INCLUDE} { return CilParser.P_INCLUDE; }
    {K_CONSTRAINT} { return CilParser.K_CONSTRAINT; }
    {OPEN_BRACE} { return CilParser.OPEN_BRACE; }
    {CLOSE_BRACE} { return CilParser.CLOSE_BRACE; }
    {OPEN_BRACKET} { return CilParser.OPEN_BRACKET; }
    {CLOSE_BRACKET} { return CilParser.CLOSE_BRACKET; }
    {OPEN_PARENS} { return CilParser.OPEN_PARENS; }
    {CLOSE_PARENS} { return CilParser.CLOSE_PARENS; }
    {COMMA} { return CilParser.COMMA; }
    {COLON} { return CilParser.COLON; }
    {DCOLON} { return CilParser.DCOLON; }
    {SEMICOLON} { return CilParser.SEMICOLON; }
    {ASSIGN} { return CilParser.ASSIGN; }
    {STAR} { return CilParser.STAR; }
    {AMPERSAND} { return CilParser.AMPERSAND; }
    {PLUS} { return CilParser.PLUS; }
    {SLASH} { return CilParser.SLASH; }
    {BANG} { return CilParser.BANG; }
    {ELIPSIS} { return CilParser.ELIPSIS; }
    {DASH} { return CilParser.DASH; }
    {OPEN_ANGLE_BRACKET} { return CilParser.OPEN_ANGLE_BRACKET; }
    {CLOSE_ANGLE_BRACKET} { return CilParser.CLOSE_ANGLE_BRACKET; }


{WS}                { /* do nothing */ }
{LINE_COMMENT}      { /* happy meal */ }
{ID}    { value = yytext(); return CilParser.ID; }
{DOTTEDNAME}    { value = yytext(); return CilParser.DOTTEDNAME; }
// {INT32}    { value = yytext(); return CilParser.INT32; }
{INT64}    { value = yytext(); return CilParser.INT64; }
{FLOAT64}  { value = yytext(); return CilParser.FLOAT64; }
{HEXBYTE}  { value = yytext(); return CilParser.HEXBYTE; }

{QSTRING}  { value = yytext(); return CilParser.QSTRING; }
{SQSTRING}  { value = yytext(); return CilParser.SQSTRING; }


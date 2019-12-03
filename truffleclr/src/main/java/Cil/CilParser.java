// Generated from /home/alex4o/Projects/truffleclr/truffleclr/Cil.g4 by ANTLR 4.7.2
package Cil;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, DCOLON=19, ELIPSIS=20, K_VOID=21, K_BOOL=22, K_CHAR=23, K_UNSIGNED=24, 
		K_INT=25, K_INT8=26, K_INT16=27, K_INT32=28, K_INT64=29, K_FLOAT=30, K_FLOAT32=31, 
		K_FLOAT64=32, K_BYTEARRAY=33, K_UINT=34, K_UINT8=35, K_UINT16=36, K_UINT32=37, 
		K_UINT64=38, K_FLAGS=39, K_CALLCONV=40, K_MDTOKEN=41, K_OBJECT=42, K_STRING=43, 
		K_NULLREF=44, K_DEFAULT=45, K_CDECL=46, K_VARARG=47, K_STDCALL=48, K_THISCALL=49, 
		K_FASTCALL=50, K_CLASS=51, K_TYPEDREF=52, K_UNMANAGED=53, K_FINALLY=54, 
		K_HANDLER=55, K_CATCH=56, K_FILTER=57, K_FAULT=58, K_EXTENDS=59, K_IMPLEMENTS=60, 
		K_TO=61, K_AT=62, K_TLS=63, K_TRUE=64, K_FALSE=65, D_INTERFACEIMPL=66, 
		K_VALUE=67, K_VALUETYPE=68, K_NATIVE=69, K_INSTANCE=70, K_SPECIALNAME=71, 
		K_FORWARDER=72, K_STATIC=73, K_PUBLIC=74, K_PRIVATE=75, K_FAMILY=76, K_FINAL=77, 
		K_SYNCHRONIZED=78, K_INTERFACE=79, K_SEALED=80, K_NESTED=81, K_ABSTRACT=82, 
		K_AUTO=83, K_SEQUENTIAL=84, K_EXPLICIT=85, K_ANSI=86, K_UNICODE=87, K_AUTOCHAR=88, 
		K_IMPORT=89, K_ENUM=90, K_VIRTUAL=91, K_NOINLINING=92, K_AGGRESSIVEINLINING=93, 
		K_NOOPTIMIZATION=94, K_AGGRESSIVEOPTIMIZATION=95, K_UNMANAGEDEXP=96, K_BEFOREFIELDINIT=97, 
		K_STRICT=98, K_RETARGETABLE=99, K_WINDOWSRUNTIME=100, K_NOPLATFORM=101, 
		K_METHOD=102, K_FIELD=103, K_PINNED=104, K_MODREQ=105, K_MODOPT=106, K_SERIALIZABLE=107, 
		K_PROPERTY=108, K_TYPE=109, K_ASSEMBLY=110, K_FAMANDASSEM=111, K_FAMORASSEM=112, 
		K_PRIVATESCOPE=113, K_HIDEBYSIG=114, K_NEWSLOT=115, K_RTSPECIALNAME=116, 
		K_PINVOKEIMPL=117, D_CTOR=118, D_CCTOR=119, K_LITERAL=120, K_NOTSERIALIZED=121, 
		K_INITONLY=122, K_REQSECOBJ=123, K_CIL=124, K_OPTIL=125, K_MANAGED=126, 
		K_FORWARDREF=127, K_PRESERVESIG=128, K_RUNTIME=129, K_INTERNALCALL=130, 
		K_NOMANGLE=131, K_LASTERR=132, K_WINAPI=133, K_AS=134, K_BESTFIT=135, 
		K_ON=136, K_OFF=137, K_CHARMAPERROR=138, INSTR_NONE=139, INSTR_VAR=140, 
		INSTR_I=141, INSTR_I8=142, INSTR_R=143, INSTR_METHOD=144, INSTR_SIG=145, 
		INSTR_BRTARGET=146, INSTR_SWITCH=147, INSTR_TYPE=148, INSTR_STRING=149, 
		INSTR_FIELD=150, INSTR_TOK=151, D_CLASS=152, D_NAMESPACE=153, D_METHOD=154, 
		D_FIELD=155, D_DATA=156, D_THIS=157, D_BASE=158, D_NESTER=159, D_EMITBYTE=160, 
		D_TRY=161, D_MAXSTACK=162, D_LOCALS=163, D_ENTRYPOINT=164, D_ZEROINIT=165, 
		D_EVENT=166, D_ADDON=167, D_REMOVEON=168, D_FIRE=169, D_OTHER=170, D_PROPERTY=171, 
		D_SET=172, D_GET=173, D_DEFAULT=174, D_PERMISSION=175, D_PERMISSIONSET=176, 
		K_REQUEST=177, K_DEMAND=178, K_ASSERT=179, K_DENY=180, K_PERMITONLY=181, 
		K_LINKCHECK=182, K_INHERITCHECK=183, K_REQMIN=184, K_REQOPT=185, K_REQREFUSE=186, 
		K_PREJITGRANT=187, K_PREJITDENY=188, K_NONCASDEMAND=189, K_NONCASLINKDEMAND=190, 
		K_NONCASINHERITANCE=191, D_LINE=192, P_LINE=193, D_LANGUAGE=194, D_CUSTOM=195, 
		K_INIT=196, D_SIZE=197, D_PACK=198, D_VTABLE=199, D_VTFIXUP=200, K_FROMUNMANAGED=201, 
		K_CALLMOSTDERIVED=202, D_VTENTRY=203, K_RETAINAPPDOMAIN=204, D_FILE=205, 
		K_NOMETADATA=206, D_HASH=207, D_ASSEMBLY=208, D_PUBLICKEY=209, D_PUBLICKEYTOKEN=210, 
		K_ALGORITHM=211, D_VER=212, D_LOCALE=213, K_EXTERN=214, D_MRESOURCE=215, 
		D_MODULE=216, D_EXPORT=217, K_LEGACY=218, K_LIBRARY=219, K_X86=220, K_AMD64=221, 
		K_ARM=222, K_ARM64=223, K_MARSHAL=224, K_CUSTOM=225, K_SYSSTRING=226, 
		K_FIXED=227, K_VARIANT=228, K_CURRENCY=229, K_SYSCHAR=230, K_DECIMAL=231, 
		K_DATE=232, K_BSTR=233, K_TBSTR=234, K_LPSTR=235, K_LPWSTR=236, K_LPTSTR=237, 
		K_OBJECTREF=238, K_IUNKNOWN=239, K_IDISPATCH=240, K_STRUCT=241, K_SAFEARRAY=242, 
		K_BYVALSTR=243, K_LPVOID=244, K_ANY=245, K_ARRAY=246, K_LPSTRUCT=247, 
		K_IIDPARAM=248, K_IN=249, K_OUT=250, K_OPT=251, D_PARAM=252, D_OVERRIDE=253, 
		K_WITH=254, K_NULL=255, K_HRESULT=256, K_CARRAY=257, K_USERDEFINED=258, 
		K_RECORD=259, K_FILETIME=260, K_BLOB=261, K_STREAM=262, K_STORAGE=263, 
		K_STREAMED_OBJECT=264, K_STORED_OBJECT=265, K_BLOB_OBJECT=266, K_CF=267, 
		K_CLSID=268, K_VECTOR=269, D_SUBSYSTEM=270, D_CORFLAGS=271, K_ALIGNMENT=272, 
		D_IMAGEBASE=273, D_STACKRESERVE=274, D_TYPEDEF=275, D_TEMPLATE=276, D_TYPELIST=277, 
		D_MSCORLIB=278, P_DEFINE=279, P_UNDEF=280, P_IFDEF=281, P_IFNDEF=282, 
		P_ELSE=283, P_ENDIF=284, P_INCLUDE=285, K_CONSTRAINT=286, WS=287, LINE_COMMENT=288, 
		DOT=289, K_ERROR=290, QSTRING=291, SQSTRING=292, ID=293, DOTTEDNAME=294, 
		INT64=295, FLOAT64=296, HEXBYTE=297, TYPEDEFT=298, TYPEDEFTS=299, TYPEDEFMR=300;
	public static final int
		RULE_decls = 0, RULE_decl = 1, RULE_classNameSeq = 2, RULE_compQstring = 3, 
		RULE_languageDecl = 4, RULE_id = 5, RULE_dottedName = 6, RULE_int32 = 7, 
		RULE_int64 = 8, RULE_float64 = 9, RULE_typedefDecl = 10, RULE_compControl = 11, 
		RULE_customDescr = 12, RULE_ownerType = 13, RULE_customBlobDescr = 14, 
		RULE_customBlobArgs = 15, RULE_customBlobNVPairs = 16, RULE_fieldOrProp = 17, 
		RULE_customAttrDecl = 18, RULE_serializType = 19, RULE_moduleHead = 20, 
		RULE_vtfixupDecl = 21, RULE_vtfixupAttr = 22, RULE_vtableDecl = 23, RULE_vtableHead = 24, 
		RULE_nameSpaceHead = 25, RULE_klass = 26, RULE_classHeadBegin = 27, RULE_classHead = 28, 
		RULE_classAttr = 29, RULE_extendsClause = 30, RULE_implClause = 31, RULE_classDecls = 32, 
		RULE_implList = 33, RULE_typeList = 34, RULE_typeListNotEmpty = 35, RULE_typarsClause = 36, 
		RULE_typarAttrib = 37, RULE_typarAttribs = 38, RULE_typars = 39, RULE_typarsRest = 40, 
		RULE_tyBound = 41, RULE_genArity = 42, RULE_genArityNotEmpty = 43, RULE_classDecl = 44, 
		RULE_fieldDecl = 45, RULE_fieldAttr = 46, RULE_atOpt = 47, RULE_initOpt = 48, 
		RULE_repeatOpt = 49, RULE_methodRef = 50, RULE_callConv = 51, RULE_callKind = 52, 
		RULE_mdtoken = 53, RULE_memberRef = 54, RULE_eventHead = 55, RULE_eventAttr = 56, 
		RULE_eventDecls = 57, RULE_eventDecl = 58, RULE_propHead = 59, RULE_propAttr = 60, 
		RULE_propDecls = 61, RULE_propDecl = 62, RULE_methodHeadPart1 = 63, RULE_marshalClause = 64, 
		RULE_marshalBlob = 65, RULE_marshalBlobHead = 66, RULE_methodHead = 67, 
		RULE_methAttr = 68, RULE_pinvAttr = 69, RULE_methodName = 70, RULE_paramAttr = 71, 
		RULE_implAttr = 72, RULE_localsHead = 73, RULE_methodDecls = 74, RULE_methodDecl = 75, 
		RULE_scopeBlock = 76, RULE_scopeOpen = 77, RULE_sehBlock = 78, RULE_sehClauses = 79, 
		RULE_tryBlock = 80, RULE_sehClause = 81, RULE_filterClause = 82, RULE_filterHead = 83, 
		RULE_catchClause = 84, RULE_finallyClause = 85, RULE_faultClause = 86, 
		RULE_handlerBlock = 87, RULE_dataDecl = 88, RULE_ddHead = 89, RULE_tls = 90, 
		RULE_ddBody = 91, RULE_ddItemList = 92, RULE_ddItemCount = 93, RULE_ddItem = 94, 
		RULE_fieldSerInit = 95, RULE_bytearrayhead = 96, RULE_bytes = 97, RULE_hexbytes = 98, 
		RULE_fieldInit = 99, RULE_serInit = 100, RULE_f32seq = 101, RULE_f64seq = 102, 
		RULE_i64seq = 103, RULE_i32seq = 104, RULE_i16seq = 105, RULE_i8seq = 106, 
		RULE_boolSeq = 107, RULE_sqstringSeq = 108, RULE_classSeq = 109, RULE_objSeq = 110, 
		RULE_methodSpec = 111, RULE_instr_none = 112, RULE_instr_var = 113, RULE_instr_i = 114, 
		RULE_instr_i8 = 115, RULE_instr_r = 116, RULE_instr_brtarget = 117, RULE_instr_method = 118, 
		RULE_instr_field = 119, RULE_instr_type = 120, RULE_instr_string = 121, 
		RULE_instr_sig = 122, RULE_instr_tok = 123, RULE_instr_switch = 124, RULE_instr = 125, 
		RULE_labels = 126, RULE_tyArgs0 = 127, RULE_tyArgs1 = 128, RULE_tyArgs2 = 129, 
		RULE_sigArgs0 = 130, RULE_sigArgs1 = 131, RULE_sigArg = 132, RULE_className = 133, 
		RULE_slashedName = 134, RULE_typeSpec = 135, RULE_nativeType = 136, RULE_iidParamIndex = 137, 
		RULE_variantType = 138, RULE_type = 139, RULE_simpleType = 140, RULE_bounds1 = 141, 
		RULE_bound = 142, RULE_secDecl = 143, RULE_secAttrSetBlob = 144, RULE_secAttrBlob = 145, 
		RULE_psetHead = 146, RULE_nameValPairs = 147, RULE_nameValPair = 148, 
		RULE_truefalse = 149, RULE_caValue = 150, RULE_secAction = 151, RULE_esHead = 152, 
		RULE_extSourceSpec = 153, RULE_fileDecl = 154, RULE_fileAttr = 155, RULE_fileEntry = 156, 
		RULE_hashHead = 157, RULE_assemblyHead = 158, RULE_asmAttr = 159, RULE_assemblyDecls = 160, 
		RULE_assemblyDecl = 161, RULE_intOrWildcard = 162, RULE_asmOrRefDecl = 163, 
		RULE_publicKeyHead = 164, RULE_publicKeyTokenHead = 165, RULE_localeHead = 166, 
		RULE_assemblyRefHead = 167, RULE_assemblyRefDecls = 168, RULE_assemblyRefDecl = 169, 
		RULE_exptypeHead = 170, RULE_exportHead = 171, RULE_exptAttr = 172, RULE_exptypeDecls = 173, 
		RULE_exptypeDecl = 174, RULE_manifestResHead = 175, RULE_manresAttr = 176, 
		RULE_manifestResDecls = 177, RULE_manifestResDecl = 178;
	private static String[] makeRuleNames() {
		return new String[] {
			"decls", "decl", "classNameSeq", "compQstring", "languageDecl", "id", 
			"dottedName", "int32", "int64", "float64", "typedefDecl", "compControl", 
			"customDescr", "ownerType", "customBlobDescr", "customBlobArgs", "customBlobNVPairs", 
			"fieldOrProp", "customAttrDecl", "serializType", "moduleHead", "vtfixupDecl", 
			"vtfixupAttr", "vtableDecl", "vtableHead", "nameSpaceHead", "klass", 
			"classHeadBegin", "classHead", "classAttr", "extendsClause", "implClause", 
			"classDecls", "implList", "typeList", "typeListNotEmpty", "typarsClause", 
			"typarAttrib", "typarAttribs", "typars", "typarsRest", "tyBound", "genArity", 
			"genArityNotEmpty", "classDecl", "fieldDecl", "fieldAttr", "atOpt", "initOpt", 
			"repeatOpt", "methodRef", "callConv", "callKind", "mdtoken", "memberRef", 
			"eventHead", "eventAttr", "eventDecls", "eventDecl", "propHead", "propAttr", 
			"propDecls", "propDecl", "methodHeadPart1", "marshalClause", "marshalBlob", 
			"marshalBlobHead", "methodHead", "methAttr", "pinvAttr", "methodName", 
			"paramAttr", "implAttr", "localsHead", "methodDecls", "methodDecl", "scopeBlock", 
			"scopeOpen", "sehBlock", "sehClauses", "tryBlock", "sehClause", "filterClause", 
			"filterHead", "catchClause", "finallyClause", "faultClause", "handlerBlock", 
			"dataDecl", "ddHead", "tls", "ddBody", "ddItemList", "ddItemCount", "ddItem", 
			"fieldSerInit", "bytearrayhead", "bytes", "hexbytes", "fieldInit", "serInit", 
			"f32seq", "f64seq", "i64seq", "i32seq", "i16seq", "i8seq", "boolSeq", 
			"sqstringSeq", "classSeq", "objSeq", "methodSpec", "instr_none", "instr_var", 
			"instr_i", "instr_i8", "instr_r", "instr_brtarget", "instr_method", "instr_field", 
			"instr_type", "instr_string", "instr_sig", "instr_tok", "instr_switch", 
			"instr", "labels", "tyArgs0", "tyArgs1", "tyArgs2", "sigArgs0", "sigArgs1", 
			"sigArg", "className", "slashedName", "typeSpec", "nativeType", "iidParamIndex", 
			"variantType", "type", "simpleType", "bounds1", "bound", "secDecl", "secAttrSetBlob", 
			"secAttrBlob", "psetHead", "nameValPairs", "nameValPair", "truefalse", 
			"caValue", "secAction", "esHead", "extSourceSpec", "fileDecl", "fileAttr", 
			"fileEntry", "hashHead", "assemblyHead", "asmAttr", "assemblyDecls", 
			"assemblyDecl", "intOrWildcard", "asmOrRefDecl", "publicKeyHead", "publicKeyTokenHead", 
			"localeHead", "assemblyRefHead", "assemblyRefDecls", "assemblyRefDecl", 
			"exptypeHead", "exportHead", "exptAttr", "exptypeDecls", "exptypeDecl", 
			"manifestResHead", "manresAttr", "manifestResDecls", "manifestResDecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'+'", "','", "'('", "')'", "';'", "'='", "'['", 
			"']'", "'<'", "'>'", "'-'", "':'", "'*'", "'&'", "'/'", "'!'", "'::'", 
			"'...'", "'void'", "'bool'", "'char'", "'unsigned'", "'int'", "'int8'", 
			"'int16'", "'int32'", "'int64'", "'float'", null, null, "'bytearray'", 
			"'uint'", "'uint8'", "'uin16'", "'uint32'", "'uint64'", "'flags'", "'callconv'", 
			"'mdtoken'", "'object'", "'string'", "'nullref'", "'default'", "'cdecl'", 
			"'vararg'", "'stdcall'", "'thiscall'", "'fastcall'", "'class'", "'typedref'", 
			"'unmangled'", "'finally'", "'handler'", "'catch'", "'filter'", "'fault'", 
			"'extends'", "'implements'", "'to'", "'at'", "'tls'", "'true'", "'false'", 
			"'.interfaceimpl'", "'value'", "'valuetype'", "'native'", "'instance'", 
			"'specialname'", "'forwarder'", "'static'", "'public'", "'private'", 
			"'faimly'", "'final'", "'synchronized'", "'interface'", "'sealed'", "'nested'", 
			"'abstract'", "'auto'", "'sequential'", "'explicit'", "'ansi'", "'unicode'", 
			"'autochar'", "'import'", "'enum'", "'virtual'", "'noinlining'", "'aggressiveinlining'", 
			"'nooptimization'", "'aggressiveoptimization'", "'unmanagedexp'", "'beforefieldinit'", 
			"'strict'", "'retargetable'", "'windowsruntime'", "'noplatform'", "'method'", 
			"'field'", "'pinned'", "'modreq'", "'modopt'", "'serializable'", "'property'", 
			"'type'", "'assembly'", "'famandassem'", "'famorassem'", "'privatescope'", 
			"'hidebysig'", "'newslot'", "'rtspecialname'", "'pinvokeimpl'", "'.ctor'", 
			"'.cctor'", "'literal'", "'notserialized'", "'initonly'", "'reqsecobj'", 
			"'cil'", "'optil'", "'managed'", "'forwardref'", "'preservesig'", "'runtime'", 
			"'internalcall'", "'nomangle'", "'lasterr'", "'winapi'", "'as'", "'bestfit'", 
			"'on'", "'off'", "'charmaperror'", null, null, null, "'ldc.i8'", null, 
			null, "'calli'", null, "'switch'", null, "'ldstr'", null, "'ldtoken'", 
			"'.class'", "'.namespace'", "'.method'", "'.field'", "'.data'", "'.this'", 
			"'.base'", "'.nester'", "'.emitbyte'", "'.try'", "'.maxstack'", "'.locals'", 
			"'.entrypoint'", "'.zeroinit'", "'.event'", "'.addon'", "'.removeon'", 
			"'.fire'", "'.other'", "'.property'", "'.set'", "'.get'", "'.default'", 
			"'.permission'", "'.permissionset'", "'request'", "'demand'", "'assert'", 
			"'deny'", "'permitonly'", "'linkcheck'", "'inheritcheck'", "'reqmin'", 
			"'reqopt'", "'reqrefuse'", "'prejitgrant'", "'prejitdeny'", "'noncasdemand'", 
			"'noncaslinkdemand'", "'noncasinheritance'", "'.line'", "'line'", "'.language'", 
			"'.custom'", "'init'", "'.size'", "'.pack'", "'.vtable'", "'.vtfixup'", 
			"'fromunmanaged'", "'callmostderived'", "'.vtentry'", "'retainappdomain'", 
			"'.file'", "'nometadata'", "'.hash'", "'.assembly'", "'.publickey'", 
			"'.publickeytoken'", "'algorithm'", "'.ver'", "'.locale'", "'extern'", 
			"'.mresource'", "'.module'", "'.export'", "'legacy'", "'library'", "'x86'", 
			"'amd64'", "'arm'", "'arm64'", "'marshal'", "'custom'", "'sysstring'", 
			"'fixed'", "'variant'", "'currency'", "'syschar'", "'decimal'", "'date'", 
			"'bstr'", "'tbstr'", "'lpstr'", "'lpwstr'", "'lptstr'", "'objectref'", 
			"'iunknown'", "'idispatch'", "'struct'", "'safearray'", "'byvalstr'", 
			"'lpvoid'", "'any'", "'array'", "'lpstruct'", "'iidparam'", "'in'", "'out'", 
			"'opt'", "'.param'", "'.override'", "'with'", "'null'", "'hresult'", 
			"'carray'", "'userdefined'", "'record'", "'filetime'", "'blob'", "'stream'", 
			"'storage'", "'streamedobject'", "'storedobject'", "'blobobject'", "'cf'", 
			"'clsid'", "'vector'", "'.subsystem'", "'.corflags'", "'alignment'", 
			"'.imagebase'", "'.stackreseve'", "'.typedef'", "'.template'", "'.typelist'", 
			"'.mscorelib'", "'define'", "'undef'", "'ifdef'", "'ifndef'", "'else'", 
			"'endif'", "'include'", "'constraint'", null, null, "'.'", "'error'", 
			null, null, null, null, null, null, null, null, "'TypeSpec'", "'MemberRef'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "DCOLON", "ELIPSIS", "K_VOID", 
			"K_BOOL", "K_CHAR", "K_UNSIGNED", "K_INT", "K_INT8", "K_INT16", "K_INT32", 
			"K_INT64", "K_FLOAT", "K_FLOAT32", "K_FLOAT64", "K_BYTEARRAY", "K_UINT", 
			"K_UINT8", "K_UINT16", "K_UINT32", "K_UINT64", "K_FLAGS", "K_CALLCONV", 
			"K_MDTOKEN", "K_OBJECT", "K_STRING", "K_NULLREF", "K_DEFAULT", "K_CDECL", 
			"K_VARARG", "K_STDCALL", "K_THISCALL", "K_FASTCALL", "K_CLASS", "K_TYPEDREF", 
			"K_UNMANAGED", "K_FINALLY", "K_HANDLER", "K_CATCH", "K_FILTER", "K_FAULT", 
			"K_EXTENDS", "K_IMPLEMENTS", "K_TO", "K_AT", "K_TLS", "K_TRUE", "K_FALSE", 
			"D_INTERFACEIMPL", "K_VALUE", "K_VALUETYPE", "K_NATIVE", "K_INSTANCE", 
			"K_SPECIALNAME", "K_FORWARDER", "K_STATIC", "K_PUBLIC", "K_PRIVATE", 
			"K_FAMILY", "K_FINAL", "K_SYNCHRONIZED", "K_INTERFACE", "K_SEALED", "K_NESTED", 
			"K_ABSTRACT", "K_AUTO", "K_SEQUENTIAL", "K_EXPLICIT", "K_ANSI", "K_UNICODE", 
			"K_AUTOCHAR", "K_IMPORT", "K_ENUM", "K_VIRTUAL", "K_NOINLINING", "K_AGGRESSIVEINLINING", 
			"K_NOOPTIMIZATION", "K_AGGRESSIVEOPTIMIZATION", "K_UNMANAGEDEXP", "K_BEFOREFIELDINIT", 
			"K_STRICT", "K_RETARGETABLE", "K_WINDOWSRUNTIME", "K_NOPLATFORM", "K_METHOD", 
			"K_FIELD", "K_PINNED", "K_MODREQ", "K_MODOPT", "K_SERIALIZABLE", "K_PROPERTY", 
			"K_TYPE", "K_ASSEMBLY", "K_FAMANDASSEM", "K_FAMORASSEM", "K_PRIVATESCOPE", 
			"K_HIDEBYSIG", "K_NEWSLOT", "K_RTSPECIALNAME", "K_PINVOKEIMPL", "D_CTOR", 
			"D_CCTOR", "K_LITERAL", "K_NOTSERIALIZED", "K_INITONLY", "K_REQSECOBJ", 
			"K_CIL", "K_OPTIL", "K_MANAGED", "K_FORWARDREF", "K_PRESERVESIG", "K_RUNTIME", 
			"K_INTERNALCALL", "K_NOMANGLE", "K_LASTERR", "K_WINAPI", "K_AS", "K_BESTFIT", 
			"K_ON", "K_OFF", "K_CHARMAPERROR", "INSTR_NONE", "INSTR_VAR", "INSTR_I", 
			"INSTR_I8", "INSTR_R", "INSTR_METHOD", "INSTR_SIG", "INSTR_BRTARGET", 
			"INSTR_SWITCH", "INSTR_TYPE", "INSTR_STRING", "INSTR_FIELD", "INSTR_TOK", 
			"D_CLASS", "D_NAMESPACE", "D_METHOD", "D_FIELD", "D_DATA", "D_THIS", 
			"D_BASE", "D_NESTER", "D_EMITBYTE", "D_TRY", "D_MAXSTACK", "D_LOCALS", 
			"D_ENTRYPOINT", "D_ZEROINIT", "D_EVENT", "D_ADDON", "D_REMOVEON", "D_FIRE", 
			"D_OTHER", "D_PROPERTY", "D_SET", "D_GET", "D_DEFAULT", "D_PERMISSION", 
			"D_PERMISSIONSET", "K_REQUEST", "K_DEMAND", "K_ASSERT", "K_DENY", "K_PERMITONLY", 
			"K_LINKCHECK", "K_INHERITCHECK", "K_REQMIN", "K_REQOPT", "K_REQREFUSE", 
			"K_PREJITGRANT", "K_PREJITDENY", "K_NONCASDEMAND", "K_NONCASLINKDEMAND", 
			"K_NONCASINHERITANCE", "D_LINE", "P_LINE", "D_LANGUAGE", "D_CUSTOM", 
			"K_INIT", "D_SIZE", "D_PACK", "D_VTABLE", "D_VTFIXUP", "K_FROMUNMANAGED", 
			"K_CALLMOSTDERIVED", "D_VTENTRY", "K_RETAINAPPDOMAIN", "D_FILE", "K_NOMETADATA", 
			"D_HASH", "D_ASSEMBLY", "D_PUBLICKEY", "D_PUBLICKEYTOKEN", "K_ALGORITHM", 
			"D_VER", "D_LOCALE", "K_EXTERN", "D_MRESOURCE", "D_MODULE", "D_EXPORT", 
			"K_LEGACY", "K_LIBRARY", "K_X86", "K_AMD64", "K_ARM", "K_ARM64", "K_MARSHAL", 
			"K_CUSTOM", "K_SYSSTRING", "K_FIXED", "K_VARIANT", "K_CURRENCY", "K_SYSCHAR", 
			"K_DECIMAL", "K_DATE", "K_BSTR", "K_TBSTR", "K_LPSTR", "K_LPWSTR", "K_LPTSTR", 
			"K_OBJECTREF", "K_IUNKNOWN", "K_IDISPATCH", "K_STRUCT", "K_SAFEARRAY", 
			"K_BYVALSTR", "K_LPVOID", "K_ANY", "K_ARRAY", "K_LPSTRUCT", "K_IIDPARAM", 
			"K_IN", "K_OUT", "K_OPT", "D_PARAM", "D_OVERRIDE", "K_WITH", "K_NULL", 
			"K_HRESULT", "K_CARRAY", "K_USERDEFINED", "K_RECORD", "K_FILETIME", "K_BLOB", 
			"K_STREAM", "K_STORAGE", "K_STREAMED_OBJECT", "K_STORED_OBJECT", "K_BLOB_OBJECT", 
			"K_CF", "K_CLSID", "K_VECTOR", "D_SUBSYSTEM", "D_CORFLAGS", "K_ALIGNMENT", 
			"D_IMAGEBASE", "D_STACKRESERVE", "D_TYPEDEF", "D_TEMPLATE", "D_TYPELIST", 
			"D_MSCORLIB", "P_DEFINE", "P_UNDEF", "P_IFDEF", "P_IFNDEF", "P_ELSE", 
			"P_ENDIF", "P_INCLUDE", "K_CONSTRAINT", "WS", "LINE_COMMENT", "DOT", 
			"K_ERROR", "QSTRING", "SQSTRING", "ID", "DOTTEDNAME", "INT64", "FLOAT64", 
			"HEXBYTE", "TYPEDEFT", "TYPEDEFTS", "TYPEDEFMR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cil.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DeclsContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (D_CLASS - 152)) | (1L << (D_NAMESPACE - 152)) | (1L << (D_METHOD - 152)) | (1L << (D_FIELD - 152)) | (1L << (D_DATA - 152)) | (1L << (D_PERMISSION - 152)) | (1L << (D_PERMISSIONSET - 152)) | (1L << (D_LINE - 152)) | (1L << (P_LINE - 152)) | (1L << (D_LANGUAGE - 152)) | (1L << (D_CUSTOM - 152)) | (1L << (D_VTABLE - 152)) | (1L << (D_VTFIXUP - 152)) | (1L << (D_FILE - 152)) | (1L << (D_ASSEMBLY - 152)) | (1L << (D_MRESOURCE - 152)))) != 0) || ((((_la - 216)) & ~0x3f) == 0 && ((1L << (_la - 216)) & ((1L << (D_MODULE - 216)) | (1L << (D_SUBSYSTEM - 216)) | (1L << (D_CORFLAGS - 216)) | (1L << (D_IMAGEBASE - 216)) | (1L << (D_STACKRESERVE - 216)) | (1L << (D_TYPEDEF - 216)) | (1L << (D_TYPELIST - 216)) | (1L << (D_MSCORLIB - 216)) | (1L << (P_DEFINE - 216)))) != 0) || ((((_la - 280)) & ~0x3f) == 0 && ((1L << (_la - 280)) & ((1L << (P_UNDEF - 280)) | (1L << (P_IFDEF - 280)) | (1L << (P_IFNDEF - 280)) | (1L << (P_ELSE - 280)) | (1L << (P_ENDIF - 280)) | (1L << (P_INCLUDE - 280)))) != 0)) {
				{
				{
				setState(358);
				decl();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CorflagsContext extends DeclContext {
		public TerminalNode D_CORFLAGS() { return getToken(CilParser.D_CORFLAGS, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public CorflagsContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCorflags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCorflags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCorflags(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImagebaseContext extends DeclContext {
		public TerminalNode D_IMAGEBASE() { return getToken(CilParser.D_IMAGEBASE, 0); }
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public ImagebaseContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterImagebase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitImagebase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitImagebase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataContext extends DeclContext {
		public DataDeclContext dataDecl() {
			return getRuleContext(DataDeclContext.class,0);
		}
		public DataContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LanguageContext extends DeclContext {
		public LanguageDeclContext languageDecl() {
			return getRuleContext(LanguageDeclContext.class,0);
		}
		public LanguageContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtsourceContext extends DeclContext {
		public ExtSourceSpecContext extSourceSpec() {
			return getRuleContext(ExtSourceSpecContext.class,0);
		}
		public ExtsourceContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterExtsource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitExtsource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitExtsource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompilationControlContext extends DeclContext {
		public CompControlContext compControl() {
			return getRuleContext(CompControlContext.class,0);
		}
		public CompilationControlContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCompilationControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCompilationControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCompilationControl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StackreserveContext extends DeclContext {
		public TerminalNode D_STACKRESERVE() { return getToken(CilParser.D_STACKRESERVE, 0); }
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public StackreserveContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterStackreserve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitStackreserve(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitStackreserve(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VtfixupContext extends DeclContext {
		public VtfixupDeclContext vtfixupDecl() {
			return getRuleContext(VtfixupDeclContext.class,0);
		}
		public VtfixupContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterVtfixup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitVtfixup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitVtfixup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SecurityContext extends DeclContext {
		public SecDeclContext secDecl() {
			return getRuleContext(SecDeclContext.class,0);
		}
		public SecurityContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSecurity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSecurity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSecurity(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FileContext extends DeclContext {
		public FileDeclContext fileDecl() {
			return getRuleContext(FileDeclContext.class,0);
		}
		public FileContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MscorelibContext extends DeclContext {
		public TerminalNode D_MSCORLIB() { return getToken(CilParser.D_MSCORLIB, 0); }
		public MscorelibContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMscorelib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMscorelib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMscorelib(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeLstContext extends DeclContext {
		public TerminalNode D_TYPELIST() { return getToken(CilParser.D_TYPELIST, 0); }
		public ClassNameSeqContext classNameSeq() {
			return getRuleContext(ClassNameSeqContext.class,0);
		}
		public TypeLstContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeLst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeLst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeLst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssemblyContext extends DeclContext {
		public AssemblyHeadContext assemblyHead() {
			return getRuleContext(AssemblyHeadContext.class,0);
		}
		public AssemblyDeclsContext assemblyDecls() {
			return getRuleContext(AssemblyDeclsContext.class,0);
		}
		public AssemblyContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAssembly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAssembly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassContext extends DeclContext {
		public ClassHeadContext classHead() {
			return getRuleContext(ClassHeadContext.class,0);
		}
		public ClassDeclsContext classDecls() {
			return getRuleContext(ClassDeclsContext.class,0);
		}
		public ClassContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodContext extends DeclContext {
		public MethodHeadContext methodHead() {
			return getRuleContext(MethodHeadContext.class,0);
		}
		public MethodDeclsContext methodDecls() {
			return getRuleContext(MethodDeclsContext.class,0);
		}
		public MethodContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManifestContext extends DeclContext {
		public ManifestResHeadContext manifestResHead() {
			return getRuleContext(ManifestResHeadContext.class,0);
		}
		public ManifestResDeclsContext manifestResDecls() {
			return getRuleContext(ManifestResDeclsContext.class,0);
		}
		public ManifestContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterManifest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitManifest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitManifest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuleContext extends DeclContext {
		public ModuleHeadContext moduleHead() {
			return getRuleContext(ModuleHeadContext.class,0);
		}
		public ModuleContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CustomContext extends DeclContext {
		public CustomAttrDeclContext customAttrDecl() {
			return getRuleContext(CustomAttrDeclContext.class,0);
		}
		public CustomContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCustom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCustom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExptypeContext extends DeclContext {
		public ExptypeHeadContext exptypeHead() {
			return getRuleContext(ExptypeHeadContext.class,0);
		}
		public ExptypeDeclsContext exptypeDecls() {
			return getRuleContext(ExptypeDeclsContext.class,0);
		}
		public ExptypeContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterExptype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitExptype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitExptype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypedefContext extends DeclContext {
		public TypedefDeclContext typedefDecl() {
			return getRuleContext(TypedefDeclContext.class,0);
		}
		public TypedefContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypedef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypedef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SystemContext extends DeclContext {
		public TerminalNode D_SUBSYSTEM() { return getToken(CilParser.D_SUBSYSTEM, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public SystemContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSystem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSystem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldContext extends DeclContext {
		public FieldDeclContext fieldDecl() {
			return getRuleContext(FieldDeclContext.class,0);
		}
		public FieldContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VtableContext extends DeclContext {
		public VtableDeclContext vtableDecl() {
			return getRuleContext(VtableDeclContext.class,0);
		}
		public VtableContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterVtable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitVtable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitVtable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssemblyReferanceContext extends DeclContext {
		public AssemblyRefHeadContext assemblyRefHead() {
			return getRuleContext(AssemblyRefHeadContext.class,0);
		}
		public AssemblyRefDeclsContext assemblyRefDecls() {
			return getRuleContext(AssemblyRefDeclsContext.class,0);
		}
		public AssemblyReferanceContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAssemblyReferance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAssemblyReferance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAssemblyReferance(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilealignementContext extends DeclContext {
		public TerminalNode D_FILE() { return getToken(CilParser.D_FILE, 0); }
		public TerminalNode K_ALIGNMENT() { return getToken(CilParser.K_ALIGNMENT, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public FilealignementContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFilealignement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFilealignement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFilealignement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamespaceContext extends DeclContext {
		public NameSpaceHeadContext nameSpaceHead() {
			return getRuleContext(NameSpaceHeadContext.class,0);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public NamespaceContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				classHead();
				setState(365);
				match(T__0);
				setState(366);
				classDecls();
				setState(367);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new NamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				nameSpaceHead();
				setState(370);
				match(T__0);
				setState(371);
				decls();
				setState(372);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				methodHead();
				setState(375);
				match(T__0);
				setState(376);
				methodDecls();
				setState(377);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new FieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				fieldDecl();
				}
				break;
			case 5:
				_localctx = new DataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				dataDecl();
				}
				break;
			case 6:
				_localctx = new VtableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(381);
				vtableDecl();
				}
				break;
			case 7:
				_localctx = new VtfixupContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(382);
				vtfixupDecl();
				}
				break;
			case 8:
				_localctx = new ExtsourceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(383);
				extSourceSpec();
				}
				break;
			case 9:
				_localctx = new FileContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(384);
				fileDecl();
				}
				break;
			case 10:
				_localctx = new AssemblyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(385);
				assemblyHead();
				setState(386);
				match(T__0);
				setState(387);
				assemblyDecls();
				setState(388);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new AssemblyReferanceContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(390);
				assemblyRefHead();
				setState(391);
				match(T__0);
				setState(392);
				assemblyRefDecls();
				setState(393);
				match(T__1);
				}
				break;
			case 12:
				_localctx = new ExptypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(395);
				exptypeHead();
				setState(396);
				match(T__0);
				setState(397);
				exptypeDecls();
				setState(398);
				match(T__1);
				}
				break;
			case 13:
				_localctx = new ManifestContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(400);
				manifestResHead();
				setState(401);
				match(T__0);
				setState(402);
				manifestResDecls();
				setState(403);
				match(T__1);
				}
				break;
			case 14:
				_localctx = new ModuleContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(405);
				moduleHead();
				}
				break;
			case 15:
				_localctx = new SecurityContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(406);
				secDecl();
				}
				break;
			case 16:
				_localctx = new CustomContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(407);
				customAttrDecl();
				}
				break;
			case 17:
				_localctx = new SystemContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(408);
				match(D_SUBSYSTEM);
				setState(409);
				int32();
				}
				break;
			case 18:
				_localctx = new CorflagsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(410);
				match(D_CORFLAGS);
				setState(411);
				int32();
				}
				break;
			case 19:
				_localctx = new FilealignementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(412);
				match(D_FILE);
				setState(413);
				match(K_ALIGNMENT);
				setState(414);
				int32();
				}
				break;
			case 20:
				_localctx = new ImagebaseContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(415);
				match(D_IMAGEBASE);
				setState(416);
				int64();
				}
				break;
			case 21:
				_localctx = new StackreserveContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(417);
				match(D_STACKRESERVE);
				setState(418);
				int64();
				}
				break;
			case 22:
				_localctx = new LanguageContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(419);
				languageDecl();
				}
				break;
			case 23:
				_localctx = new TypedefContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(420);
				typedefDecl();
				}
				break;
			case 24:
				_localctx = new CompilationControlContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(421);
				compControl();
				}
				break;
			case 25:
				_localctx = new TypeLstContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(422);
				match(D_TYPELIST);
				setState(423);
				match(T__0);
				setState(424);
				classNameSeq();
				setState(425);
				match(T__1);
				}
				break;
			case 26:
				_localctx = new MscorelibContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(427);
				match(D_MSCORLIB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameSeqContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassNameSeqContext classNameSeq() {
			return getRuleContext(ClassNameSeqContext.class,0);
		}
		public ClassNameSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classNameSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClassNameSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClassNameSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClassNameSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameSeqContext classNameSeq() throws RecognitionException {
		ClassNameSeqContext _localctx = new ClassNameSeqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classNameSeq);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
			case K_MDTOKEN:
			case D_THIS:
			case D_BASE:
			case D_NESTER:
			case SQSTRING:
			case ID:
			case DOTTEDNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				className();
				setState(432);
				classNameSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompQstringContext extends ParserRuleContext {
		public TerminalNode QSTRING() { return getToken(CilParser.QSTRING, 0); }
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public CompQstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compQstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCompQstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCompQstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCompQstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompQstringContext compQstring() throws RecognitionException {
		return compQstring(0);
	}

	private CompQstringContext compQstring(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompQstringContext _localctx = new CompQstringContext(_ctx, _parentState);
		CompQstringContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_compQstring, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(437);
			match(QSTRING);
			}
			_ctx.stop = _input.LT(-1);
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompQstringContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_compQstring);
					setState(439);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(440);
					match(T__2);
					setState(441);
					match(QSTRING);
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LanguageDeclContext extends ParserRuleContext {
		public TerminalNode D_LANGUAGE() { return getToken(CilParser.D_LANGUAGE, 0); }
		public List<TerminalNode> SQSTRING() { return getTokens(CilParser.SQSTRING); }
		public TerminalNode SQSTRING(int i) {
			return getToken(CilParser.SQSTRING, i);
		}
		public LanguageDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterLanguageDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitLanguageDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitLanguageDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageDeclContext languageDecl() throws RecognitionException {
		LanguageDeclContext _localctx = new LanguageDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_languageDecl);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(D_LANGUAGE);
				setState(448);
				match(SQSTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(D_LANGUAGE);
				setState(450);
				match(SQSTRING);
				setState(451);
				match(T__3);
				setState(452);
				match(SQSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(D_LANGUAGE);
				setState(454);
				match(SQSTRING);
				setState(455);
				match(T__3);
				setState(456);
				match(SQSTRING);
				setState(457);
				match(T__3);
				setState(458);
				match(SQSTRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CilParser.ID, 0); }
		public TerminalNode SQSTRING() { return getToken(CilParser.SQSTRING, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==SQSTRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DottedNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DOTTEDNAME() { return getToken(CilParser.DOTTEDNAME, 0); }
		public DottedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterDottedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitDottedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitDottedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DottedNameContext dottedName() throws RecognitionException {
		DottedNameContext _localctx = new DottedNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dottedName);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQSTRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				id();
				}
				break;
			case DOTTEDNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(DOTTEDNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int32Context extends ParserRuleContext {
		public TerminalNode INT64() { return getToken(CilParser.INT64, 0); }
		public Int32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInt32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInt32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInt32(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int32Context int32() throws RecognitionException {
		Int32Context _localctx = new Int32Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_int32);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(INT64);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int64Context extends ParserRuleContext {
		public TerminalNode INT64() { return getToken(CilParser.INT64, 0); }
		public Int64Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int64; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInt64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInt64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInt64(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int64Context int64() throws RecognitionException {
		Int64Context _localctx = new Int64Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_int64);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(INT64);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float64Context extends ParserRuleContext {
		public TerminalNode FLOAT64() { return getToken(CilParser.FLOAT64, 0); }
		public TerminalNode K_FLOAT32() { return getToken(CilParser.K_FLOAT32, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public TerminalNode K_FLOAT64() { return getToken(CilParser.K_FLOAT64, 0); }
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public Float64Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float64; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFloat64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFloat64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFloat64(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float64Context float64() throws RecognitionException {
		Float64Context _localctx = new Float64Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_float64);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(FLOAT64);
				}
				break;
			case K_FLOAT32:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(K_FLOAT32);
				setState(473);
				match(T__4);
				setState(474);
				int32();
				setState(475);
				match(T__5);
				}
				break;
			case K_FLOAT64:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				match(K_FLOAT64);
				setState(478);
				match(T__4);
				setState(479);
				int64();
				setState(480);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefDeclContext extends ParserRuleContext {
		public TerminalNode D_TYPEDEF() { return getToken(CilParser.D_TYPEDEF, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(CilParser.K_AS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public MemberRefContext memberRef() {
			return getRuleContext(MemberRefContext.class,0);
		}
		public CustomDescrContext customDescr() {
			return getRuleContext(CustomDescrContext.class,0);
		}
		public TypedefDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypedefDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypedefDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypedefDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefDeclContext typedefDecl() throws RecognitionException {
		TypedefDeclContext _localctx = new TypedefDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typedefDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(D_TYPEDEF);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(485);
				type(0);
				setState(486);
				match(K_AS);
				}
				break;
			case 2:
				{
				setState(488);
				className();
				setState(489);
				match(K_AS);
				}
				break;
			case 3:
				{
				setState(491);
				memberRef();
				setState(492);
				match(K_AS);
				}
				break;
			case 4:
				{
				setState(494);
				customDescr();
				setState(495);
				match(K_AS);
				}
				break;
			}
			setState(499);
			dottedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompControlContext extends ParserRuleContext {
		public TerminalNode P_DEFINE() { return getToken(CilParser.P_DEFINE, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public TerminalNode P_UNDEF() { return getToken(CilParser.P_UNDEF, 0); }
		public TerminalNode P_IFDEF() { return getToken(CilParser.P_IFDEF, 0); }
		public TerminalNode P_IFNDEF() { return getToken(CilParser.P_IFNDEF, 0); }
		public TerminalNode P_ELSE() { return getToken(CilParser.P_ELSE, 0); }
		public TerminalNode P_ENDIF() { return getToken(CilParser.P_ENDIF, 0); }
		public TerminalNode P_INCLUDE() { return getToken(CilParser.P_INCLUDE, 0); }
		public TerminalNode QSTRING() { return getToken(CilParser.QSTRING, 0); }
		public CompControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCompControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCompControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCompControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompControlContext compControl() throws RecognitionException {
		CompControlContext _localctx = new CompControlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compControl);
		int _la;
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(P_DEFINE);
				setState(502);
				dottedName();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QSTRING) {
					{
					setState(503);
					compQstring(0);
					}
				}

				}
				break;
			case P_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(P_UNDEF);
				setState(507);
				dottedName();
				}
				break;
			case P_IFDEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				match(P_IFDEF);
				setState(509);
				dottedName();
				}
				break;
			case P_IFNDEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				match(P_IFNDEF);
				setState(511);
				dottedName();
				}
				break;
			case P_ELSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(512);
				match(P_ELSE);
				}
				break;
			case P_ENDIF:
				enterOuterAlt(_localctx, 6);
				{
				setState(513);
				match(P_ENDIF);
				}
				break;
			case P_INCLUDE:
				enterOuterAlt(_localctx, 7);
				{
				setState(514);
				match(P_INCLUDE);
				setState(515);
				match(QSTRING);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 8);
				{
				setState(516);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomDescrContext extends ParserRuleContext {
		public TerminalNode D_CUSTOM() { return getToken(CilParser.D_CUSTOM, 0); }
		public MethodRefContext methodRef() {
			return getRuleContext(MethodRefContext.class,0);
		}
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public CustomBlobDescrContext customBlobDescr() {
			return getRuleContext(CustomBlobDescrContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public OwnerTypeContext ownerType() {
			return getRuleContext(OwnerTypeContext.class,0);
		}
		public CustomDescrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customDescr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCustomDescr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCustomDescr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCustomDescr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomDescrContext customDescr() throws RecognitionException {
		CustomDescrContext _localctx = new CustomDescrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_customDescr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(D_CUSTOM);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(520);
				match(T__4);
				setState(521);
				ownerType();
				setState(522);
				match(T__5);
				}
			}

			setState(526);
			methodRef();
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(527);
				match(T__7);
				setState(528);
				compQstring(0);
				}
				break;
			case 2:
				{
				setState(529);
				match(T__7);
				setState(530);
				match(T__0);
				setState(531);
				customBlobDescr();
				setState(532);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(534);
				match(T__7);
				setState(535);
				match(T__4);
				setState(536);
				bytes();
				setState(537);
				match(T__5);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwnerTypeContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public MemberRefContext memberRef() {
			return getRuleContext(MemberRefContext.class,0);
		}
		public OwnerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterOwnerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitOwnerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitOwnerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerTypeContext ownerType() throws RecognitionException {
		OwnerTypeContext _localctx = new OwnerTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ownerType);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				memberRef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomBlobDescrContext extends ParserRuleContext {
		public CustomBlobArgsContext customBlobArgs() {
			return getRuleContext(CustomBlobArgsContext.class,0);
		}
		public CustomBlobNVPairsContext customBlobNVPairs() {
			return getRuleContext(CustomBlobNVPairsContext.class,0);
		}
		public CustomBlobDescrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customBlobDescr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCustomBlobDescr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCustomBlobDescr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCustomBlobDescr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomBlobDescrContext customBlobDescr() throws RecognitionException {
		CustomBlobDescrContext _localctx = new CustomBlobDescrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_customBlobDescr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			customBlobArgs();
			setState(546);
			customBlobNVPairs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomBlobArgsContext extends ParserRuleContext {
		public List<SerInitContext> serInit() {
			return getRuleContexts(SerInitContext.class);
		}
		public SerInitContext serInit(int i) {
			return getRuleContext(SerInitContext.class,i);
		}
		public List<CompControlContext> compControl() {
			return getRuleContexts(CompControlContext.class);
		}
		public CompControlContext compControl(int i) {
			return getRuleContext(CompControlContext.class,i);
		}
		public CustomBlobArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customBlobArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCustomBlobArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCustomBlobArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCustomBlobArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomBlobArgsContext customBlobArgs() throws RecognitionException {
		CustomBlobArgsContext _localctx = new CustomBlobArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_customBlobArgs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(550);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_BOOL:
					case K_CHAR:
					case K_UNSIGNED:
					case K_INT8:
					case K_INT16:
					case K_INT32:
					case K_INT64:
					case K_FLOAT32:
					case K_FLOAT64:
					case K_BYTEARRAY:
					case K_UINT8:
					case K_UINT16:
					case K_UINT32:
					case K_UINT64:
					case K_OBJECT:
					case K_STRING:
					case K_TYPE:
						{
						setState(548);
						serInit();
						}
						break;
					case T__6:
					case P_DEFINE:
					case P_UNDEF:
					case P_IFDEF:
					case P_IFNDEF:
					case P_ELSE:
					case P_ENDIF:
					case P_INCLUDE:
						{
						setState(549);
						compControl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomBlobNVPairsContext extends ParserRuleContext {
		public List<FieldOrPropContext> fieldOrProp() {
			return getRuleContexts(FieldOrPropContext.class);
		}
		public FieldOrPropContext fieldOrProp(int i) {
			return getRuleContext(FieldOrPropContext.class,i);
		}
		public List<SerializTypeContext> serializType() {
			return getRuleContexts(SerializTypeContext.class);
		}
		public SerializTypeContext serializType(int i) {
			return getRuleContext(SerializTypeContext.class,i);
		}
		public List<DottedNameContext> dottedName() {
			return getRuleContexts(DottedNameContext.class);
		}
		public DottedNameContext dottedName(int i) {
			return getRuleContext(DottedNameContext.class,i);
		}
		public List<SerInitContext> serInit() {
			return getRuleContexts(SerInitContext.class);
		}
		public SerInitContext serInit(int i) {
			return getRuleContext(SerInitContext.class,i);
		}
		public List<CompControlContext> compControl() {
			return getRuleContexts(CompControlContext.class);
		}
		public CompControlContext compControl(int i) {
			return getRuleContext(CompControlContext.class,i);
		}
		public CustomBlobNVPairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customBlobNVPairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCustomBlobNVPairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCustomBlobNVPairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCustomBlobNVPairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomBlobNVPairsContext customBlobNVPairs() throws RecognitionException {
		CustomBlobNVPairsContext _localctx = new CustomBlobNVPairsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_customBlobNVPairs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(562);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_FIELD:
					case K_PROPERTY:
						{
						setState(555);
						fieldOrProp();
						setState(556);
						serializType(0);
						setState(557);
						dottedName();
						setState(558);
						match(T__7);
						setState(559);
						serInit();
						}
						break;
					case T__6:
					case P_DEFINE:
					case P_UNDEF:
					case P_IFDEF:
					case P_IFNDEF:
					case P_ELSE:
					case P_ENDIF:
					case P_INCLUDE:
						{
						setState(561);
						compControl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldOrPropContext extends ParserRuleContext {
		public TerminalNode K_FIELD() { return getToken(CilParser.K_FIELD, 0); }
		public TerminalNode K_PROPERTY() { return getToken(CilParser.K_PROPERTY, 0); }
		public FieldOrPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOrProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFieldOrProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFieldOrProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFieldOrProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOrPropContext fieldOrProp() throws RecognitionException {
		FieldOrPropContext _localctx = new FieldOrPropContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fieldOrProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_la = _input.LA(1);
			if ( !(_la==K_FIELD || _la==K_PROPERTY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomAttrDeclContext extends ParserRuleContext {
		public CustomDescrContext customDescr() {
			return getRuleContext(CustomDescrContext.class,0);
		}
		public CustomAttrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customAttrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCustomAttrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCustomAttrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCustomAttrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomAttrDeclContext customAttrDecl() throws RecognitionException {
		CustomAttrDeclContext _localctx = new CustomAttrDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_customAttrDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			customDescr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerializTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode K_TYPE() { return getToken(CilParser.K_TYPE, 0); }
		public TerminalNode K_OBJECT() { return getToken(CilParser.K_OBJECT, 0); }
		public TerminalNode K_ENUM() { return getToken(CilParser.K_ENUM, 0); }
		public TerminalNode K_CLASS() { return getToken(CilParser.K_CLASS, 0); }
		public TerminalNode SQSTRING() { return getToken(CilParser.SQSTRING, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public SerializTypeContext serializType() {
			return getRuleContext(SerializTypeContext.class,0);
		}
		public SerializTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serializType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSerializType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSerializType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSerializType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerializTypeContext serializType() throws RecognitionException {
		return serializType(0);
	}

	private SerializTypeContext serializType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SerializTypeContext _localctx = new SerializTypeContext(_ctx, _parentState);
		SerializTypeContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_serializType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(572);
				simpleType();
				}
				break;
			case 2:
				{
				setState(573);
				match(K_TYPE);
				}
				break;
			case 3:
				{
				setState(574);
				match(K_OBJECT);
				}
				break;
			case 4:
				{
				setState(575);
				match(K_ENUM);
				setState(576);
				match(K_CLASS);
				setState(577);
				match(SQSTRING);
				}
				break;
			case 5:
				{
				setState(578);
				match(K_ENUM);
				setState(579);
				className();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SerializTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_serializType);
					setState(582);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(583);
					match(T__8);
					setState(584);
					match(T__9);
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ModuleHeadContext extends ParserRuleContext {
		public TerminalNode D_MODULE() { return getToken(CilParser.D_MODULE, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode K_EXTERN() { return getToken(CilParser.K_EXTERN, 0); }
		public ModuleHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterModuleHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitModuleHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitModuleHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleHeadContext moduleHead() throws RecognitionException {
		ModuleHeadContext _localctx = new ModuleHeadContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_moduleHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(D_MODULE);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXTERN) {
				{
				setState(591);
				match(K_EXTERN);
				}
			}

			setState(594);
			dottedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VtfixupDeclContext extends ParserRuleContext {
		public TerminalNode D_VTFIXUP() { return getToken(CilParser.D_VTFIXUP, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public VtfixupAttrContext vtfixupAttr() {
			return getRuleContext(VtfixupAttrContext.class,0);
		}
		public TerminalNode K_AT() { return getToken(CilParser.K_AT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VtfixupDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vtfixupDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterVtfixupDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitVtfixupDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitVtfixupDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VtfixupDeclContext vtfixupDecl() throws RecognitionException {
		VtfixupDeclContext _localctx = new VtfixupDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_vtfixupDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(D_VTFIXUP);
			setState(597);
			match(T__8);
			setState(598);
			int32();
			setState(599);
			match(T__9);
			setState(600);
			vtfixupAttr(0);
			setState(601);
			match(K_AT);
			setState(602);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VtfixupAttrContext extends ParserRuleContext {
		public VtfixupAttrContext vtfixupAttr() {
			return getRuleContext(VtfixupAttrContext.class,0);
		}
		public TerminalNode K_INT32() { return getToken(CilParser.K_INT32, 0); }
		public TerminalNode K_INT64() { return getToken(CilParser.K_INT64, 0); }
		public TerminalNode K_FROMUNMANAGED() { return getToken(CilParser.K_FROMUNMANAGED, 0); }
		public TerminalNode K_CALLMOSTDERIVED() { return getToken(CilParser.K_CALLMOSTDERIVED, 0); }
		public TerminalNode K_RETAINAPPDOMAIN() { return getToken(CilParser.K_RETAINAPPDOMAIN, 0); }
		public VtfixupAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vtfixupAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterVtfixupAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitVtfixupAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitVtfixupAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VtfixupAttrContext vtfixupAttr() throws RecognitionException {
		return vtfixupAttr(0);
	}

	private VtfixupAttrContext vtfixupAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VtfixupAttrContext _localctx = new VtfixupAttrContext(_ctx, _parentState);
		VtfixupAttrContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_vtfixupAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(615);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(605);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(606);
						match(K_INT32);
						}
						break;
					case 2:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(607);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(608);
						match(K_INT64);
						}
						break;
					case 3:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(609);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(610);
						match(K_FROMUNMANAGED);
						}
						break;
					case 4:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(611);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(612);
						match(K_CALLMOSTDERIVED);
						}
						break;
					case 5:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(613);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(614);
						match(K_RETAINAPPDOMAIN);
						}
						break;
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VtableDeclContext extends ParserRuleContext {
		public VtableHeadContext vtableHead() {
			return getRuleContext(VtableHeadContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public VtableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vtableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterVtableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitVtableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitVtableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VtableDeclContext vtableDecl() throws RecognitionException {
		VtableDeclContext _localctx = new VtableDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_vtableDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			vtableHead();
			setState(621);
			bytes();
			setState(622);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VtableHeadContext extends ParserRuleContext {
		public TerminalNode D_VTABLE() { return getToken(CilParser.D_VTABLE, 0); }
		public VtableHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vtableHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterVtableHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitVtableHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitVtableHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VtableHeadContext vtableHead() throws RecognitionException {
		VtableHeadContext _localctx = new VtableHeadContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_vtableHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(D_VTABLE);
			setState(625);
			match(T__7);
			setState(626);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameSpaceHeadContext extends ParserRuleContext {
		public DottedNameContext dottedName;
		public TerminalNode D_NAMESPACE() { return getToken(CilParser.D_NAMESPACE, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public NameSpaceHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameSpaceHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterNameSpaceHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitNameSpaceHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitNameSpaceHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameSpaceHeadContext nameSpaceHead() throws RecognitionException {
		NameSpaceHeadContext _localctx = new NameSpaceHeadContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nameSpaceHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(D_NAMESPACE);
			setState(629);
			((NameSpaceHeadContext)_localctx).dottedName = dottedName();
			 System.out.println("Namespace: " + (((NameSpaceHeadContext)_localctx).dottedName!=null?_input.getText(((NameSpaceHeadContext)_localctx).dottedName.start,((NameSpaceHeadContext)_localctx).dottedName.stop):null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KlassContext extends ParserRuleContext {
		public TerminalNode D_CLASS() { return getToken(CilParser.D_CLASS, 0); }
		public KlassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_klass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterKlass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitKlass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitKlass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KlassContext klass() throws RecognitionException {
		KlassContext _localctx = new KlassContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_klass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(D_CLASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeadBeginContext extends ParserRuleContext {
		public DottedNameContext dottedName;
		public KlassContext klass() {
			return getRuleContext(KlassContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TyparsClauseContext typarsClause() {
			return getRuleContext(TyparsClauseContext.class,0);
		}
		public List<ClassAttrContext> classAttr() {
			return getRuleContexts(ClassAttrContext.class);
		}
		public ClassAttrContext classAttr(int i) {
			return getRuleContext(ClassAttrContext.class,i);
		}
		public ClassHeadBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeadBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClassHeadBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClassHeadBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClassHeadBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadBeginContext classHeadBegin() throws RecognitionException {
		ClassHeadBeginContext _localctx = new ClassHeadBeginContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_classHeadBegin);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			klass();
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(635);
					classAttr();
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(641);
			((ClassHeadBeginContext)_localctx).dottedName = dottedName();
			setState(642);
			typarsClause();
			  System.out.println("Class: " + (((ClassHeadBeginContext)_localctx).dottedName!=null?_input.getText(((ClassHeadBeginContext)_localctx).dottedName.start,((ClassHeadBeginContext)_localctx).dottedName.stop):null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeadContext extends ParserRuleContext {
		public ClassHeadBeginContext classHeadBegin() {
			return getRuleContext(ClassHeadBeginContext.class,0);
		}
		public ExtendsClauseContext extendsClause() {
			return getRuleContext(ExtendsClauseContext.class,0);
		}
		public ImplClauseContext implClause() {
			return getRuleContext(ImplClauseContext.class,0);
		}
		public ClassHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClassHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClassHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClassHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadContext classHead() throws RecognitionException {
		ClassHeadContext _localctx = new ClassHeadContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_classHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			classHeadBegin();
			setState(646);
			extendsClause();
			setState(647);
			implClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassAttrContext extends ParserRuleContext {
		public TerminalNode K_PUBLIC() { return getToken(CilParser.K_PUBLIC, 0); }
		public TerminalNode K_PRIVATE() { return getToken(CilParser.K_PRIVATE, 0); }
		public TerminalNode K_VALUE() { return getToken(CilParser.K_VALUE, 0); }
		public TerminalNode K_ENUM() { return getToken(CilParser.K_ENUM, 0); }
		public TerminalNode K_INTERFACE() { return getToken(CilParser.K_INTERFACE, 0); }
		public TerminalNode K_SEALED() { return getToken(CilParser.K_SEALED, 0); }
		public TerminalNode K_ABSTRACT() { return getToken(CilParser.K_ABSTRACT, 0); }
		public TerminalNode K_AUTO() { return getToken(CilParser.K_AUTO, 0); }
		public TerminalNode K_SEQUENTIAL() { return getToken(CilParser.K_SEQUENTIAL, 0); }
		public TerminalNode K_EXPLICIT() { return getToken(CilParser.K_EXPLICIT, 0); }
		public TerminalNode K_ANSI() { return getToken(CilParser.K_ANSI, 0); }
		public TerminalNode K_UNICODE() { return getToken(CilParser.K_UNICODE, 0); }
		public TerminalNode K_AUTOCHAR() { return getToken(CilParser.K_AUTOCHAR, 0); }
		public TerminalNode K_IMPORT() { return getToken(CilParser.K_IMPORT, 0); }
		public TerminalNode K_SERIALIZABLE() { return getToken(CilParser.K_SERIALIZABLE, 0); }
		public TerminalNode K_WINDOWSRUNTIME() { return getToken(CilParser.K_WINDOWSRUNTIME, 0); }
		public TerminalNode K_NESTED() { return getToken(CilParser.K_NESTED, 0); }
		public TerminalNode K_FAMILY() { return getToken(CilParser.K_FAMILY, 0); }
		public TerminalNode K_ASSEMBLY() { return getToken(CilParser.K_ASSEMBLY, 0); }
		public TerminalNode K_FAMANDASSEM() { return getToken(CilParser.K_FAMANDASSEM, 0); }
		public TerminalNode K_FAMORASSEM() { return getToken(CilParser.K_FAMORASSEM, 0); }
		public TerminalNode K_BEFOREFIELDINIT() { return getToken(CilParser.K_BEFOREFIELDINIT, 0); }
		public TerminalNode K_SPECIALNAME() { return getToken(CilParser.K_SPECIALNAME, 0); }
		public TerminalNode K_RTSPECIALNAME() { return getToken(CilParser.K_RTSPECIALNAME, 0); }
		public TerminalNode K_FLAGS() { return getToken(CilParser.K_FLAGS, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public ClassAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClassAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClassAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClassAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAttrContext classAttr() throws RecognitionException {
		ClassAttrContext _localctx = new ClassAttrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_classAttr);
		int _la;
		try {
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(K_PUBLIC);
				}
				break;
			case K_PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(K_PRIVATE);
				}
				break;
			case K_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				match(K_VALUE);
				}
				break;
			case K_ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(652);
				match(K_ENUM);
				}
				break;
			case K_INTERFACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(653);
				match(K_INTERFACE);
				}
				break;
			case K_SEALED:
				enterOuterAlt(_localctx, 6);
				{
				setState(654);
				match(K_SEALED);
				}
				break;
			case K_ABSTRACT:
				enterOuterAlt(_localctx, 7);
				{
				setState(655);
				match(K_ABSTRACT);
				}
				break;
			case K_AUTO:
				enterOuterAlt(_localctx, 8);
				{
				setState(656);
				match(K_AUTO);
				}
				break;
			case K_SEQUENTIAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(657);
				match(K_SEQUENTIAL);
				}
				break;
			case K_EXPLICIT:
				enterOuterAlt(_localctx, 10);
				{
				setState(658);
				match(K_EXPLICIT);
				}
				break;
			case K_ANSI:
				enterOuterAlt(_localctx, 11);
				{
				setState(659);
				match(K_ANSI);
				}
				break;
			case K_UNICODE:
				enterOuterAlt(_localctx, 12);
				{
				setState(660);
				match(K_UNICODE);
				}
				break;
			case K_AUTOCHAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(661);
				match(K_AUTOCHAR);
				}
				break;
			case K_IMPORT:
				enterOuterAlt(_localctx, 14);
				{
				setState(662);
				match(K_IMPORT);
				}
				break;
			case K_SERIALIZABLE:
				enterOuterAlt(_localctx, 15);
				{
				setState(663);
				match(K_SERIALIZABLE);
				}
				break;
			case K_WINDOWSRUNTIME:
				enterOuterAlt(_localctx, 16);
				{
				setState(664);
				match(K_WINDOWSRUNTIME);
				}
				break;
			case K_NESTED:
				enterOuterAlt(_localctx, 17);
				{
				setState(665);
				match(K_NESTED);
				setState(666);
				_la = _input.LA(1);
				if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_PUBLIC - 74)) | (1L << (K_PRIVATE - 74)) | (1L << (K_FAMILY - 74)) | (1L << (K_ASSEMBLY - 74)) | (1L << (K_FAMANDASSEM - 74)) | (1L << (K_FAMORASSEM - 74)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case K_BEFOREFIELDINIT:
				enterOuterAlt(_localctx, 18);
				{
				setState(667);
				match(K_BEFOREFIELDINIT);
				}
				break;
			case K_SPECIALNAME:
				enterOuterAlt(_localctx, 19);
				{
				setState(668);
				match(K_SPECIALNAME);
				}
				break;
			case K_RTSPECIALNAME:
				enterOuterAlt(_localctx, 20);
				{
				setState(669);
				match(K_RTSPECIALNAME);
				}
				break;
			case K_FLAGS:
				enterOuterAlt(_localctx, 21);
				{
				setState(670);
				match(K_FLAGS);
				setState(671);
				match(T__4);
				setState(672);
				int32();
				setState(673);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsClauseContext extends ParserRuleContext {
		public TerminalNode K_EXTENDS() { return getToken(CilParser.K_EXTENDS, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public ExtendsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterExtendsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitExtendsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitExtendsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsClauseContext extendsClause() throws RecognitionException {
		ExtendsClauseContext _localctx = new ExtendsClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_extendsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXTENDS) {
				{
				setState(677);
				match(K_EXTENDS);
				setState(678);
				typeSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplClauseContext extends ParserRuleContext {
		public TerminalNode K_IMPLEMENTS() { return getToken(CilParser.K_IMPLEMENTS, 0); }
		public ImplListContext implList() {
			return getRuleContext(ImplListContext.class,0);
		}
		public ImplClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterImplClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitImplClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitImplClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplClauseContext implClause() throws RecognitionException {
		ImplClauseContext _localctx = new ImplClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_implClause);
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case K_IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(K_IMPLEMENTS);
				setState(683);
				implList(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclsContext extends ParserRuleContext {
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public ClassDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClassDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClassDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClassDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclsContext classDecls() throws RecognitionException {
		ClassDeclsContext _localctx = new ClassDeclsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(686);
					classDecl();
					}
					} 
				}
				setState(691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplListContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public ImplListContext implList() {
			return getRuleContext(ImplListContext.class,0);
		}
		public ImplListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterImplList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitImplList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitImplList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplListContext implList() throws RecognitionException {
		return implList(0);
	}

	private ImplListContext implList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImplListContext _localctx = new ImplListContext(_ctx, _parentState);
		ImplListContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_implList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(693);
			typeSpec();
			}
			_ctx.stop = _input.LT(-1);
			setState(700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImplListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_implList);
					setState(695);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(696);
					match(T__3);
					setState(697);
					typeSpec();
					}
					} 
				}
				setState(702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public TypeListNotEmptyContext typeListNotEmpty() {
			return getRuleContext(TypeListNotEmptyContext.class,0);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeList);
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
			case T__17:
			case ELIPSIS:
			case K_VOID:
			case K_BOOL:
			case K_CHAR:
			case K_UNSIGNED:
			case K_INT8:
			case K_INT16:
			case K_INT32:
			case K_INT64:
			case K_FLOAT32:
			case K_FLOAT64:
			case K_UINT8:
			case K_UINT16:
			case K_UINT32:
			case K_UINT64:
			case K_MDTOKEN:
			case K_OBJECT:
			case K_STRING:
			case K_CLASS:
			case K_TYPEDREF:
			case K_VALUE:
			case K_VALUETYPE:
			case K_NATIVE:
			case K_METHOD:
			case D_THIS:
			case D_BASE:
			case D_NESTER:
			case SQSTRING:
			case ID:
			case DOTTEDNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				typeListNotEmpty(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListNotEmptyContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TypeListNotEmptyContext typeListNotEmpty() {
			return getRuleContext(TypeListNotEmptyContext.class,0);
		}
		public TypeListNotEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeListNotEmpty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeListNotEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeListNotEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeListNotEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListNotEmptyContext typeListNotEmpty() throws RecognitionException {
		return typeListNotEmpty(0);
	}

	private TypeListNotEmptyContext typeListNotEmpty(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeListNotEmptyContext _localctx = new TypeListNotEmptyContext(_ctx, _parentState);
		TypeListNotEmptyContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_typeListNotEmpty, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(708);
			typeSpec();
			}
			_ctx.stop = _input.LT(-1);
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeListNotEmptyContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeListNotEmpty);
					setState(710);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(711);
					match(T__3);
					setState(712);
					typeSpec();
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TyparsClauseContext extends ParserRuleContext {
		public TyparsContext typars() {
			return getRuleContext(TyparsContext.class,0);
		}
		public TyparsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typarsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTyparsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTyparsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTyparsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyparsClauseContext typarsClause() throws RecognitionException {
		TyparsClauseContext _localctx = new TyparsClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typarsClause);
		try {
			setState(723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case K_EXTENDS:
			case K_IMPLEMENTS:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				match(T__10);
				setState(720);
				typars();
				setState(721);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyparAttribContext extends ParserRuleContext {
		public TerminalNode K_CLASS() { return getToken(CilParser.K_CLASS, 0); }
		public TerminalNode K_VALUETYPE() { return getToken(CilParser.K_VALUETYPE, 0); }
		public TerminalNode D_CTOR() { return getToken(CilParser.D_CTOR, 0); }
		public TyparAttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typarAttrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTyparAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTyparAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTyparAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyparAttribContext typarAttrib() throws RecognitionException {
		TyparAttribContext _localctx = new TyparAttribContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typarAttrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << K_CLASS))) != 0) || _la==K_VALUETYPE || _la==D_CTOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyparAttribsContext extends ParserRuleContext {
		public TyparAttribContext typarAttrib() {
			return getRuleContext(TyparAttribContext.class,0);
		}
		public TyparAttribsContext typarAttribs() {
			return getRuleContext(TyparAttribsContext.class,0);
		}
		public TyparAttribsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typarAttribs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTyparAttribs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTyparAttribs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTyparAttribs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyparAttribsContext typarAttribs() throws RecognitionException {
		TyparAttribsContext _localctx = new TyparAttribsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typarAttribs);
		try {
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case SQSTRING:
			case ID:
			case DOTTEDNAME:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
			case T__12:
			case K_CLASS:
			case K_VALUETYPE:
			case D_CTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				typarAttrib();
				setState(729);
				typarAttribs();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyparsContext extends ParserRuleContext {
		public TyparAttribsContext typarAttribs() {
			return getRuleContext(TyparAttribsContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TyparsRestContext typarsRest() {
			return getRuleContext(TyparsRestContext.class,0);
		}
		public TyBoundContext tyBound() {
			return getRuleContext(TyBoundContext.class,0);
		}
		public TyparsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyparsContext typars() throws RecognitionException {
		TyparsContext _localctx = new TyparsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			typarAttribs();
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(734);
				tyBound();
				}
			}

			setState(737);
			dottedName();
			setState(738);
			typarsRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyparsRestContext extends ParserRuleContext {
		public TyparsContext typars() {
			return getRuleContext(TyparsContext.class,0);
		}
		public TyparsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typarsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTyparsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTyparsRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTyparsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyparsRestContext typarsRest() throws RecognitionException {
		TyparsRestContext _localctx = new TyparsRestContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typarsRest);
		try {
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				match(T__3);
				setState(742);
				typars();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyBoundContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TyBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTyBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTyBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTyBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyBoundContext tyBound() throws RecognitionException {
		TyBoundContext _localctx = new TyBoundContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tyBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(T__4);
			setState(746);
			typeList();
			setState(747);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenArityContext extends ParserRuleContext {
		public GenArityNotEmptyContext genArityNotEmpty() {
			return getRuleContext(GenArityNotEmptyContext.class,0);
		}
		public GenArityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genArity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterGenArity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitGenArity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitGenArity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenArityContext genArity() throws RecognitionException {
		GenArityContext _localctx = new GenArityContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_genArity);
		try {
			setState(751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				genArityNotEmpty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenArityNotEmptyContext extends ParserRuleContext {
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public GenArityNotEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genArityNotEmpty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterGenArityNotEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitGenArityNotEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitGenArityNotEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenArityNotEmptyContext genArityNotEmpty() throws RecognitionException {
		GenArityNotEmptyContext _localctx = new GenArityNotEmptyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_genArityNotEmpty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(T__10);
			setState(754);
			match(T__8);
			setState(755);
			int32();
			setState(756);
			match(T__9);
			setState(757);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
	 
		public ClassDeclContext() { }
		public void copyFrom(ClassDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Class_classContext extends ClassDeclContext {
		public ClassHeadContext classHead() {
			return getRuleContext(ClassHeadContext.class,0);
		}
		public ClassDeclsContext classDecls() {
			return getRuleContext(ClassDeclsContext.class,0);
		}
		public Class_classContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_class(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_eventContext extends ClassDeclContext {
		public EventHeadContext eventHead() {
			return getRuleContext(EventHeadContext.class,0);
		}
		public EventDeclsContext eventDecls() {
			return getRuleContext(EventDeclsContext.class,0);
		}
		public Class_eventContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_event(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_event(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_event(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_externalSourceContext extends ClassDeclContext {
		public ExtSourceSpecContext extSourceSpec() {
			return getRuleContext(ExtSourceSpecContext.class,0);
		}
		public Class_externalSourceContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_externalSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_externalSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_externalSource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_paramContext extends ClassDeclContext {
		public TerminalNode D_PARAM() { return getToken(CilParser.D_PARAM, 0); }
		public TerminalNode K_TYPE() { return getToken(CilParser.K_TYPE, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(CilParser.K_CONSTRAINT, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public Class_paramContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_param(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_fieldContext extends ClassDeclContext {
		public FieldDeclContext fieldDecl() {
			return getRuleContext(FieldDeclContext.class,0);
		}
		public Class_fieldContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_field(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_securityContext extends ClassDeclContext {
		public SecDeclContext secDecl() {
			return getRuleContext(SecDeclContext.class,0);
		}
		public Class_securityContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_security(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_security(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_security(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_customAttributeContext extends ClassDeclContext {
		public CustomAttrDeclContext customAttrDecl() {
			return getRuleContext(CustomAttrDeclContext.class,0);
		}
		public Class_customAttributeContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_customAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_customAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_customAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_compilationControlContext extends ClassDeclContext {
		public CompControlContext compControl() {
			return getRuleContext(CompControlContext.class,0);
		}
		public Class_compilationControlContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_compilationControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_compilationControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_compilationControl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_packContext extends ClassDeclContext {
		public TerminalNode D_PACK() { return getToken(CilParser.D_PACK, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public Class_packContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_pack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_pack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_pack(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_languageContext extends ClassDeclContext {
		public LanguageDeclContext languageDecl() {
			return getRuleContext(LanguageDeclContext.class,0);
		}
		public Class_languageContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_language(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_language(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_language(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_propertyContext extends ClassDeclContext {
		public PropHeadContext propHead() {
			return getRuleContext(PropHeadContext.class,0);
		}
		public PropDeclsContext propDecls() {
			return getRuleContext(PropDeclsContext.class,0);
		}
		public Class_propertyContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_property(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_methodContext extends ClassDeclContext {
		public MethodHeadContext methodHead() {
			return getRuleContext(MethodHeadContext.class,0);
		}
		public MethodDeclsContext methodDecls() {
			return getRuleContext(MethodDeclsContext.class,0);
		}
		public Class_methodContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_method(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_methodOverrideContext extends ClassDeclContext {
		public TerminalNode D_OVERRIDE() { return getToken(CilParser.D_OVERRIDE, 0); }
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public List<TerminalNode> DCOLON() { return getTokens(CilParser.DCOLON); }
		public TerminalNode DCOLON(int i) {
			return getToken(CilParser.DCOLON, i);
		}
		public List<MethodNameContext> methodName() {
			return getRuleContexts(MethodNameContext.class);
		}
		public MethodNameContext methodName(int i) {
			return getRuleContext(MethodNameContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(CilParser.K_WITH, 0); }
		public List<CallConvContext> callConv() {
			return getRuleContexts(CallConvContext.class);
		}
		public CallConvContext callConv(int i) {
			return getRuleContext(CallConvContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<SigArgs0Context> sigArgs0() {
			return getRuleContexts(SigArgs0Context.class);
		}
		public SigArgs0Context sigArgs0(int i) {
			return getRuleContext(SigArgs0Context.class,i);
		}
		public List<TerminalNode> K_METHOD() { return getTokens(CilParser.K_METHOD); }
		public TerminalNode K_METHOD(int i) {
			return getToken(CilParser.K_METHOD, i);
		}
		public List<GenArityContext> genArity() {
			return getRuleContexts(GenArityContext.class);
		}
		public GenArityContext genArity(int i) {
			return getRuleContext(GenArityContext.class,i);
		}
		public Class_methodOverrideContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_methodOverride(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_methodOverride(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_methodOverride(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_dataContext extends ClassDeclContext {
		public DataDeclContext dataDecl() {
			return getRuleContext(DataDeclContext.class,0);
		}
		public Class_dataContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_data(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_sizeContext extends ClassDeclContext {
		public TerminalNode D_SIZE() { return getToken(CilParser.D_SIZE, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public Class_sizeContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_size(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_size(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_exportContext extends ClassDeclContext {
		public ExportHeadContext exportHead() {
			return getRuleContext(ExportHeadContext.class,0);
		}
		public ExptypeDeclsContext exptypeDecls() {
			return getRuleContext(ExptypeDeclsContext.class,0);
		}
		public Class_exportContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_export(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_export(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_export(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_interfaceImplContext extends ClassDeclContext {
		public TerminalNode D_INTERFACEIMPL() { return getToken(CilParser.D_INTERFACEIMPL, 0); }
		public TerminalNode K_TYPE() { return getToken(CilParser.K_TYPE, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public CustomDescrContext customDescr() {
			return getRuleContext(CustomDescrContext.class,0);
		}
		public Class_interfaceImplContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClass_interfaceImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClass_interfaceImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClass_interfaceImpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classDecl);
		int _la;
		try {
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_METHOD:
				_localctx = new Class_methodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				methodHead();
				setState(760);
				match(T__0);
				setState(761);
				methodDecls();
				setState(762);
				match(T__1);
				}
				break;
			case D_CLASS:
				_localctx = new Class_classContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				classHead();
				setState(765);
				match(T__0);
				setState(766);
				classDecls();
				setState(767);
				match(T__1);
				}
				break;
			case D_EVENT:
				_localctx = new Class_eventContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				eventHead();
				setState(770);
				match(T__0);
				setState(771);
				eventDecls();
				setState(772);
				match(T__1);
				}
				break;
			case D_PROPERTY:
				_localctx = new Class_propertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(774);
				propHead();
				setState(775);
				match(T__0);
				setState(776);
				propDecls();
				setState(777);
				match(T__1);
				}
				break;
			case D_FIELD:
				_localctx = new Class_fieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(779);
				fieldDecl();
				}
				break;
			case D_DATA:
				_localctx = new Class_dataContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(780);
				dataDecl();
				}
				break;
			case D_PERMISSION:
			case D_PERMISSIONSET:
				_localctx = new Class_securityContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(781);
				secDecl();
				}
				break;
			case D_LINE:
			case P_LINE:
				_localctx = new Class_externalSourceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(782);
				extSourceSpec();
				}
				break;
			case D_CUSTOM:
				_localctx = new Class_customAttributeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(783);
				customAttrDecl();
				}
				break;
			case D_SIZE:
				_localctx = new Class_sizeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(784);
				match(D_SIZE);
				setState(785);
				int32();
				}
				break;
			case D_PACK:
				_localctx = new Class_packContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(786);
				match(D_PACK);
				setState(787);
				int32();
				}
				break;
			case D_EXPORT:
				_localctx = new Class_exportContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(788);
				exportHead();
				setState(789);
				match(T__0);
				setState(790);
				exptypeDecls();
				setState(791);
				match(T__1);
				}
				break;
			case D_OVERRIDE:
				_localctx = new Class_methodOverrideContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(793);
				match(D_OVERRIDE);
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(794);
					typeSpec();
					setState(795);
					match(DCOLON);
					setState(796);
					methodName();
					setState(797);
					match(K_WITH);
					setState(798);
					callConv();
					setState(799);
					type(0);
					setState(800);
					typeSpec();
					setState(801);
					match(DCOLON);
					setState(802);
					methodName();
					setState(803);
					match(T__4);
					setState(804);
					sigArgs0();
					setState(805);
					match(T__5);
					}
					break;
				case 2:
					{
					setState(807);
					match(K_METHOD);
					setState(808);
					callConv();
					setState(809);
					type(0);
					setState(810);
					typeSpec();
					setState(811);
					match(DCOLON);
					setState(812);
					methodName();
					setState(813);
					genArity();
					setState(814);
					match(T__4);
					setState(815);
					sigArgs0();
					setState(816);
					match(T__5);
					setState(817);
					match(K_WITH);
					setState(818);
					match(K_METHOD);
					setState(819);
					callConv();
					setState(820);
					type(0);
					setState(821);
					typeSpec();
					setState(822);
					match(DCOLON);
					setState(823);
					methodName();
					setState(824);
					genArity();
					setState(825);
					match(T__4);
					setState(826);
					sigArgs0();
					setState(827);
					match(T__5);
					}
					break;
				}
				}
				break;
			case D_LANGUAGE:
				_localctx = new Class_languageContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(831);
				languageDecl();
				}
				break;
			case T__6:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
				_localctx = new Class_compilationControlContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(832);
				compControl();
				}
				break;
			case D_PARAM:
				_localctx = new Class_paramContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(833);
				match(D_PARAM);
				setState(834);
				_la = _input.LA(1);
				if ( !(_la==K_TYPE || _la==K_CONSTRAINT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(840);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(835);
					match(T__8);
					setState(836);
					int32();
					setState(837);
					match(T__9);
					}
					break;
				case SQSTRING:
				case ID:
				case DOTTEDNAME:
					{
					setState(839);
					dottedName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(842);
					match(T__3);
					setState(843);
					typeSpec();
					}
				}

				}
				break;
			case D_INTERFACEIMPL:
				_localctx = new Class_interfaceImplContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(846);
				match(D_INTERFACEIMPL);
				setState(847);
				match(K_TYPE);
				setState(848);
				typeSpec();
				setState(849);
				customDescr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public TerminalNode D_FIELD() { return getToken(CilParser.D_FIELD, 0); }
		public RepeatOptContext repeatOpt() {
			return getRuleContext(RepeatOptContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public AtOptContext atOpt() {
			return getRuleContext(AtOptContext.class,0);
		}
		public InitOptContext initOpt() {
			return getRuleContext(InitOptContext.class,0);
		}
		public List<FieldAttrContext> fieldAttr() {
			return getRuleContexts(FieldAttrContext.class);
		}
		public FieldAttrContext fieldAttr(int i) {
			return getRuleContext(FieldAttrContext.class,i);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fieldDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(D_FIELD);
			setState(854);
			repeatOpt();
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(855);
					fieldAttr();
					}
					} 
				}
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(861);
			type(0);
			setState(862);
			dottedName();
			setState(863);
			atOpt();
			setState(864);
			initOpt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAttrContext extends ParserRuleContext {
		public TerminalNode K_STATIC() { return getToken(CilParser.K_STATIC, 0); }
		public TerminalNode K_PUBLIC() { return getToken(CilParser.K_PUBLIC, 0); }
		public TerminalNode K_PRIVATE() { return getToken(CilParser.K_PRIVATE, 0); }
		public TerminalNode K_FAMILY() { return getToken(CilParser.K_FAMILY, 0); }
		public TerminalNode K_INITONLY() { return getToken(CilParser.K_INITONLY, 0); }
		public TerminalNode K_RTSPECIALNAME() { return getToken(CilParser.K_RTSPECIALNAME, 0); }
		public TerminalNode K_SPECIALNAME() { return getToken(CilParser.K_SPECIALNAME, 0); }
		public TerminalNode K_MARSHAL() { return getToken(CilParser.K_MARSHAL, 0); }
		public MarshalBlobContext marshalBlob() {
			return getRuleContext(MarshalBlobContext.class,0);
		}
		public TerminalNode K_ASSEMBLY() { return getToken(CilParser.K_ASSEMBLY, 0); }
		public TerminalNode K_FAMANDASSEM() { return getToken(CilParser.K_FAMANDASSEM, 0); }
		public TerminalNode K_FAMORASSEM() { return getToken(CilParser.K_FAMORASSEM, 0); }
		public TerminalNode K_PRIVATESCOPE() { return getToken(CilParser.K_PRIVATESCOPE, 0); }
		public TerminalNode K_LITERAL() { return getToken(CilParser.K_LITERAL, 0); }
		public TerminalNode K_NOTSERIALIZED() { return getToken(CilParser.K_NOTSERIALIZED, 0); }
		public TerminalNode K_FLAGS() { return getToken(CilParser.K_FLAGS, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public FieldAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFieldAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFieldAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFieldAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAttrContext fieldAttr() throws RecognitionException {
		FieldAttrContext _localctx = new FieldAttrContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fieldAttr);
		try {
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				match(K_STATIC);
				}
				break;
			case K_PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				match(K_PUBLIC);
				}
				break;
			case K_PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(868);
				match(K_PRIVATE);
				}
				break;
			case K_FAMILY:
				enterOuterAlt(_localctx, 4);
				{
				setState(869);
				match(K_FAMILY);
				}
				break;
			case K_INITONLY:
				enterOuterAlt(_localctx, 5);
				{
				setState(870);
				match(K_INITONLY);
				}
				break;
			case K_RTSPECIALNAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(871);
				match(K_RTSPECIALNAME);
				}
				break;
			case K_SPECIALNAME:
				enterOuterAlt(_localctx, 7);
				{
				setState(872);
				match(K_SPECIALNAME);
				}
				break;
			case K_MARSHAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(873);
				match(K_MARSHAL);
				setState(874);
				match(T__4);
				setState(875);
				marshalBlob();
				setState(876);
				match(T__5);
				}
				break;
			case K_ASSEMBLY:
				enterOuterAlt(_localctx, 9);
				{
				setState(878);
				match(K_ASSEMBLY);
				}
				break;
			case K_FAMANDASSEM:
				enterOuterAlt(_localctx, 10);
				{
				setState(879);
				match(K_FAMANDASSEM);
				}
				break;
			case K_FAMORASSEM:
				enterOuterAlt(_localctx, 11);
				{
				setState(880);
				match(K_FAMORASSEM);
				}
				break;
			case K_PRIVATESCOPE:
				enterOuterAlt(_localctx, 12);
				{
				setState(881);
				match(K_PRIVATESCOPE);
				}
				break;
			case K_LITERAL:
				enterOuterAlt(_localctx, 13);
				{
				setState(882);
				match(K_LITERAL);
				}
				break;
			case K_NOTSERIALIZED:
				enterOuterAlt(_localctx, 14);
				{
				setState(883);
				match(K_NOTSERIALIZED);
				}
				break;
			case K_FLAGS:
				enterOuterAlt(_localctx, 15);
				{
				setState(884);
				match(K_FLAGS);
				setState(885);
				match(T__4);
				setState(886);
				int32();
				setState(887);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtOptContext extends ParserRuleContext {
		public TerminalNode K_AT() { return getToken(CilParser.K_AT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AtOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAtOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAtOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAtOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtOptContext atOpt() throws RecognitionException {
		AtOptContext _localctx = new AtOptContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_atOpt);
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__6:
			case T__7:
			case D_INTERFACEIMPL:
			case D_CLASS:
			case D_NAMESPACE:
			case D_METHOD:
			case D_FIELD:
			case D_DATA:
			case D_EVENT:
			case D_PROPERTY:
			case D_PERMISSION:
			case D_PERMISSIONSET:
			case D_LINE:
			case P_LINE:
			case D_LANGUAGE:
			case D_CUSTOM:
			case D_SIZE:
			case D_PACK:
			case D_VTABLE:
			case D_VTFIXUP:
			case D_FILE:
			case D_ASSEMBLY:
			case D_MRESOURCE:
			case D_MODULE:
			case D_EXPORT:
			case D_PARAM:
			case D_OVERRIDE:
			case D_SUBSYSTEM:
			case D_CORFLAGS:
			case D_IMAGEBASE:
			case D_STACKRESERVE:
			case D_TYPEDEF:
			case D_TYPELIST:
			case D_MSCORLIB:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case K_AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(K_AT);
				setState(893);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitOptContext extends ParserRuleContext {
		public FieldInitContext fieldInit() {
			return getRuleContext(FieldInitContext.class,0);
		}
		public InitOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInitOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInitOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInitOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitOptContext initOpt() throws RecognitionException {
		InitOptContext _localctx = new InitOptContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_initOpt);
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__6:
			case D_INTERFACEIMPL:
			case INSTR_NONE:
			case INSTR_VAR:
			case INSTR_I:
			case INSTR_I8:
			case INSTR_R:
			case INSTR_METHOD:
			case INSTR_SIG:
			case INSTR_BRTARGET:
			case INSTR_SWITCH:
			case INSTR_TYPE:
			case INSTR_STRING:
			case INSTR_FIELD:
			case INSTR_TOK:
			case D_CLASS:
			case D_NAMESPACE:
			case D_METHOD:
			case D_FIELD:
			case D_DATA:
			case D_EMITBYTE:
			case D_TRY:
			case D_MAXSTACK:
			case D_LOCALS:
			case D_ENTRYPOINT:
			case D_ZEROINIT:
			case D_EVENT:
			case D_PROPERTY:
			case D_PERMISSION:
			case D_PERMISSIONSET:
			case D_LINE:
			case P_LINE:
			case D_LANGUAGE:
			case D_CUSTOM:
			case D_SIZE:
			case D_PACK:
			case D_VTABLE:
			case D_VTFIXUP:
			case D_VTENTRY:
			case D_FILE:
			case D_ASSEMBLY:
			case D_MRESOURCE:
			case D_MODULE:
			case D_EXPORT:
			case D_PARAM:
			case D_OVERRIDE:
			case D_SUBSYSTEM:
			case D_CORFLAGS:
			case D_IMAGEBASE:
			case D_STACKRESERVE:
			case D_TYPEDEF:
			case D_TYPELIST:
			case D_MSCORLIB:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
			case SQSTRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				match(T__7);
				setState(898);
				fieldInit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatOptContext extends ParserRuleContext {
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public RepeatOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterRepeatOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitRepeatOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitRepeatOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatOptContext repeatOpt() throws RecognitionException {
		RepeatOptContext _localctx = new RepeatOptContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_repeatOpt);
		try {
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case ELIPSIS:
			case K_VOID:
			case K_BOOL:
			case K_CHAR:
			case K_UNSIGNED:
			case K_INT8:
			case K_INT16:
			case K_INT32:
			case K_INT64:
			case K_FLOAT32:
			case K_FLOAT64:
			case K_UINT8:
			case K_UINT16:
			case K_UINT32:
			case K_UINT64:
			case K_FLAGS:
			case K_OBJECT:
			case K_STRING:
			case K_CLASS:
			case K_TYPEDREF:
			case K_VALUE:
			case K_VALUETYPE:
			case K_NATIVE:
			case K_SPECIALNAME:
			case K_STATIC:
			case K_PUBLIC:
			case K_PRIVATE:
			case K_FAMILY:
			case K_METHOD:
			case K_ASSEMBLY:
			case K_FAMANDASSEM:
			case K_FAMORASSEM:
			case K_PRIVATESCOPE:
			case K_RTSPECIALNAME:
			case K_LITERAL:
			case K_NOTSERIALIZED:
			case K_INITONLY:
			case K_MARSHAL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				match(T__8);
				setState(903);
				int32();
				setState(904);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodRefContext extends ParserRuleContext {
		public CallConvContext callConv() {
			return getRuleContext(CallConvContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public SigArgs0Context sigArgs0() {
			return getRuleContext(SigArgs0Context.class,0);
		}
		public TyArgs0Context tyArgs0() {
			return getRuleContext(TyArgs0Context.class,0);
		}
		public GenArityNotEmptyContext genArityNotEmpty() {
			return getRuleContext(GenArityNotEmptyContext.class,0);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode DCOLON() { return getToken(CilParser.DCOLON, 0); }
		public MethodRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethodRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethodRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethodRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodRefContext methodRef() throws RecognitionException {
		MethodRefContext _localctx = new MethodRefContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_methodRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			callConv();
			setState(909);
			type(0);
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(910);
				typeSpec();
				setState(911);
				match(DCOLON);
				}
				break;
			}
			setState(915);
			methodName();
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(916);
				tyArgs0();
				}
				break;
			case 2:
				{
				setState(917);
				genArityNotEmpty();
				}
				break;
			}
			setState(920);
			match(T__4);
			setState(921);
			sigArgs0();
			setState(922);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallConvContext extends ParserRuleContext {
		public CallKindContext callKind() {
			return getRuleContext(CallKindContext.class,0);
		}
		public TerminalNode K_CALLCONV() { return getToken(CilParser.K_CALLCONV, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public List<TerminalNode> K_INSTANCE() { return getTokens(CilParser.K_INSTANCE); }
		public TerminalNode K_INSTANCE(int i) {
			return getToken(CilParser.K_INSTANCE, i);
		}
		public List<TerminalNode> K_EXPLICIT() { return getTokens(CilParser.K_EXPLICIT); }
		public TerminalNode K_EXPLICIT(int i) {
			return getToken(CilParser.K_EXPLICIT, i);
		}
		public CallConvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callConv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCallConv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCallConv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCallConv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallConvContext callConv() throws RecognitionException {
		CallConvContext _localctx = new CallConvContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_callConv);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(924);
					_la = _input.LA(1);
					if ( !(_la==K_INSTANCE || _la==K_EXPLICIT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DEFAULT:
			case K_VARARG:
			case K_UNMANAGED:
				{
				setState(930);
				callKind();
				}
				break;
			case K_CALLCONV:
				{
				setState(931);
				match(K_CALLCONV);
				setState(932);
				match(T__4);
				setState(933);
				int32();
				setState(934);
				match(T__5);
				}
				break;
			case T__8:
			case T__17:
			case ELIPSIS:
			case K_VOID:
			case K_BOOL:
			case K_CHAR:
			case K_UNSIGNED:
			case K_INT8:
			case K_INT16:
			case K_INT32:
			case K_INT64:
			case K_FLOAT32:
			case K_FLOAT64:
			case K_UINT8:
			case K_UINT16:
			case K_UINT32:
			case K_UINT64:
			case K_OBJECT:
			case K_STRING:
			case K_CLASS:
			case K_TYPEDREF:
			case K_VALUE:
			case K_VALUETYPE:
			case K_NATIVE:
			case K_METHOD:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallKindContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(CilParser.K_DEFAULT, 0); }
		public TerminalNode K_VARARG() { return getToken(CilParser.K_VARARG, 0); }
		public TerminalNode K_UNMANAGED() { return getToken(CilParser.K_UNMANAGED, 0); }
		public TerminalNode K_CDECL() { return getToken(CilParser.K_CDECL, 0); }
		public TerminalNode K_STDCALL() { return getToken(CilParser.K_STDCALL, 0); }
		public TerminalNode K_THISCALL() { return getToken(CilParser.K_THISCALL, 0); }
		public TerminalNode K_FASTCALL() { return getToken(CilParser.K_FASTCALL, 0); }
		public CallKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCallKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCallKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCallKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallKindContext callKind() throws RecognitionException {
		CallKindContext _localctx = new CallKindContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_callKind);
		int _la;
		try {
			setState(942);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				match(K_DEFAULT);
				}
				break;
			case K_VARARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				match(K_VARARG);
				}
				break;
			case K_UNMANAGED:
				enterOuterAlt(_localctx, 3);
				{
				setState(940);
				match(K_UNMANAGED);
				setState(941);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CDECL) | (1L << K_STDCALL) | (1L << K_THISCALL) | (1L << K_FASTCALL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MdtokenContext extends ParserRuleContext {
		public TerminalNode K_MDTOKEN() { return getToken(CilParser.K_MDTOKEN, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public MdtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMdtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMdtoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMdtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MdtokenContext mdtoken() throws RecognitionException {
		MdtokenContext _localctx = new MdtokenContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_mdtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(K_MDTOKEN);
			setState(945);
			match(T__4);
			setState(946);
			int32();
			setState(947);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberRefContext extends ParserRuleContext {
		public MethodSpecContext methodSpec() {
			return getRuleContext(MethodSpecContext.class,0);
		}
		public MethodRefContext methodRef() {
			return getRuleContext(MethodRefContext.class,0);
		}
		public TerminalNode K_FIELD() { return getToken(CilParser.K_FIELD, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode DCOLON() { return getToken(CilParser.DCOLON, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public MdtokenContext mdtoken() {
			return getRuleContext(MdtokenContext.class,0);
		}
		public MemberRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMemberRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMemberRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMemberRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberRefContext memberRef() throws RecognitionException {
		MemberRefContext _localctx = new MemberRefContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_memberRef);
		try {
			setState(963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				methodSpec();
				setState(950);
				methodRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				match(K_FIELD);
				setState(953);
				type(0);
				setState(954);
				typeSpec();
				setState(955);
				match(DCOLON);
				setState(956);
				dottedName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				match(K_FIELD);
				setState(959);
				type(0);
				setState(960);
				dottedName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(962);
				mdtoken();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventHeadContext extends ParserRuleContext {
		public TerminalNode D_EVENT() { return getToken(CilParser.D_EVENT, 0); }
		public EventAttrContext eventAttr() {
			return getRuleContext(EventAttrContext.class,0);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public EventHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterEventHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitEventHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitEventHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventHeadContext eventHead() throws RecognitionException {
		EventHeadContext _localctx = new EventHeadContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_eventHead);
		try {
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				match(D_EVENT);
				setState(966);
				eventAttr(0);
				setState(967);
				typeSpec();
				setState(968);
				dottedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				match(D_EVENT);
				setState(971);
				eventAttr(0);
				setState(972);
				dottedName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventAttrContext extends ParserRuleContext {
		public EventAttrContext eventAttr() {
			return getRuleContext(EventAttrContext.class,0);
		}
		public TerminalNode K_RTSPECIALNAME() { return getToken(CilParser.K_RTSPECIALNAME, 0); }
		public TerminalNode K_SPECIALNAME() { return getToken(CilParser.K_SPECIALNAME, 0); }
		public EventAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterEventAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitEventAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitEventAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventAttrContext eventAttr() throws RecognitionException {
		return eventAttr(0);
	}

	private EventAttrContext eventAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EventAttrContext _localctx = new EventAttrContext(_ctx, _parentState);
		EventAttrContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_eventAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(983);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(981);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new EventAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eventAttr);
						setState(977);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(978);
						match(K_RTSPECIALNAME);
						}
						break;
					case 2:
						{
						_localctx = new EventAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eventAttr);
						setState(979);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(980);
						match(K_SPECIALNAME);
						}
						break;
					}
					} 
				}
				setState(985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EventDeclsContext extends ParserRuleContext {
		public List<EventDeclContext> eventDecl() {
			return getRuleContexts(EventDeclContext.class);
		}
		public EventDeclContext eventDecl(int i) {
			return getRuleContext(EventDeclContext.class,i);
		}
		public EventDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterEventDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitEventDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitEventDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDeclsContext eventDecls() throws RecognitionException {
		EventDeclsContext _localctx = new EventDeclsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_eventDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(986);
					eventDecl();
					}
					} 
				}
				setState(991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDeclContext extends ParserRuleContext {
		public TerminalNode D_ADDON() { return getToken(CilParser.D_ADDON, 0); }
		public MethodRefContext methodRef() {
			return getRuleContext(MethodRefContext.class,0);
		}
		public TerminalNode D_REMOVEON() { return getToken(CilParser.D_REMOVEON, 0); }
		public TerminalNode D_FIRE() { return getToken(CilParser.D_FIRE, 0); }
		public TerminalNode D_OTHER() { return getToken(CilParser.D_OTHER, 0); }
		public ExtSourceSpecContext extSourceSpec() {
			return getRuleContext(ExtSourceSpecContext.class,0);
		}
		public CustomAttrDeclContext customAttrDecl() {
			return getRuleContext(CustomAttrDeclContext.class,0);
		}
		public LanguageDeclContext languageDecl() {
			return getRuleContext(LanguageDeclContext.class,0);
		}
		public CompControlContext compControl() {
			return getRuleContext(CompControlContext.class,0);
		}
		public EventDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterEventDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitEventDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitEventDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDeclContext eventDecl() throws RecognitionException {
		EventDeclContext _localctx = new EventDeclContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_eventDecl);
		try {
			setState(1004);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_ADDON:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				match(D_ADDON);
				setState(993);
				methodRef();
				}
				break;
			case D_REMOVEON:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				match(D_REMOVEON);
				setState(995);
				methodRef();
				}
				break;
			case D_FIRE:
				enterOuterAlt(_localctx, 3);
				{
				setState(996);
				match(D_FIRE);
				setState(997);
				methodRef();
				}
				break;
			case D_OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(998);
				match(D_OTHER);
				setState(999);
				methodRef();
				}
				break;
			case D_LINE:
			case P_LINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1000);
				extSourceSpec();
				}
				break;
			case D_CUSTOM:
				enterOuterAlt(_localctx, 6);
				{
				setState(1001);
				customAttrDecl();
				}
				break;
			case D_LANGUAGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1002);
				languageDecl();
				}
				break;
			case T__6:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1003);
				compControl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropHeadContext extends ParserRuleContext {
		public TerminalNode D_PROPERTY() { return getToken(CilParser.D_PROPERTY, 0); }
		public PropAttrContext propAttr() {
			return getRuleContext(PropAttrContext.class,0);
		}
		public CallConvContext callConv() {
			return getRuleContext(CallConvContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public SigArgs0Context sigArgs0() {
			return getRuleContext(SigArgs0Context.class,0);
		}
		public InitOptContext initOpt() {
			return getRuleContext(InitOptContext.class,0);
		}
		public PropHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterPropHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitPropHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitPropHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropHeadContext propHead() throws RecognitionException {
		PropHeadContext _localctx = new PropHeadContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_propHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(D_PROPERTY);
			setState(1007);
			propAttr(0);
			setState(1008);
			callConv();
			setState(1009);
			type(0);
			setState(1010);
			dottedName();
			setState(1011);
			match(T__4);
			setState(1012);
			sigArgs0();
			setState(1013);
			match(T__5);
			setState(1014);
			initOpt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropAttrContext extends ParserRuleContext {
		public PropAttrContext propAttr() {
			return getRuleContext(PropAttrContext.class,0);
		}
		public TerminalNode K_RTSPECIALNAME() { return getToken(CilParser.K_RTSPECIALNAME, 0); }
		public TerminalNode K_SPECIALNAME() { return getToken(CilParser.K_SPECIALNAME, 0); }
		public PropAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterPropAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitPropAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitPropAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropAttrContext propAttr() throws RecognitionException {
		return propAttr(0);
	}

	private PropAttrContext propAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropAttrContext _localctx = new PropAttrContext(_ctx, _parentState);
		PropAttrContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_propAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1021);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new PropAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_propAttr);
						setState(1017);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1018);
						match(K_RTSPECIALNAME);
						}
						break;
					case 2:
						{
						_localctx = new PropAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_propAttr);
						setState(1019);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1020);
						match(K_SPECIALNAME);
						}
						break;
					}
					} 
				}
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PropDeclsContext extends ParserRuleContext {
		public List<PropDeclContext> propDecl() {
			return getRuleContexts(PropDeclContext.class);
		}
		public PropDeclContext propDecl(int i) {
			return getRuleContext(PropDeclContext.class,i);
		}
		public PropDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterPropDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitPropDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitPropDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropDeclsContext propDecls() throws RecognitionException {
		PropDeclsContext _localctx = new PropDeclsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_propDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1026);
					propDecl();
					}
					} 
				}
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropDeclContext extends ParserRuleContext {
		public TerminalNode D_SET() { return getToken(CilParser.D_SET, 0); }
		public MethodRefContext methodRef() {
			return getRuleContext(MethodRefContext.class,0);
		}
		public TerminalNode D_GET() { return getToken(CilParser.D_GET, 0); }
		public TerminalNode D_OTHER() { return getToken(CilParser.D_OTHER, 0); }
		public CustomAttrDeclContext customAttrDecl() {
			return getRuleContext(CustomAttrDeclContext.class,0);
		}
		public ExtSourceSpecContext extSourceSpec() {
			return getRuleContext(ExtSourceSpecContext.class,0);
		}
		public LanguageDeclContext languageDecl() {
			return getRuleContext(LanguageDeclContext.class,0);
		}
		public CompControlContext compControl() {
			return getRuleContext(CompControlContext.class,0);
		}
		public PropDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterPropDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitPropDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitPropDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropDeclContext propDecl() throws RecognitionException {
		PropDeclContext _localctx = new PropDeclContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_propDecl);
		try {
			setState(1042);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				match(D_SET);
				setState(1033);
				methodRef();
				}
				break;
			case D_GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				match(D_GET);
				setState(1035);
				methodRef();
				}
				break;
			case D_OTHER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1036);
				match(D_OTHER);
				setState(1037);
				methodRef();
				}
				break;
			case D_CUSTOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1038);
				customAttrDecl();
				}
				break;
			case D_LINE:
			case P_LINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1039);
				extSourceSpec();
				}
				break;
			case D_LANGUAGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1040);
				languageDecl();
				}
				break;
			case T__6:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1041);
				compControl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeadPart1Context extends ParserRuleContext {
		public TerminalNode D_METHOD() { return getToken(CilParser.D_METHOD, 0); }
		public MethodHeadPart1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeadPart1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethodHeadPart1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethodHeadPart1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethodHeadPart1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeadPart1Context methodHeadPart1() throws RecognitionException {
		MethodHeadPart1Context _localctx = new MethodHeadPart1Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_methodHeadPart1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(D_METHOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarshalClauseContext extends ParserRuleContext {
		public TerminalNode K_MARSHAL() { return getToken(CilParser.K_MARSHAL, 0); }
		public MarshalBlobContext marshalBlob() {
			return getRuleContext(MarshalBlobContext.class,0);
		}
		public MarshalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marshalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMarshalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMarshalClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMarshalClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarshalClauseContext marshalClause() throws RecognitionException {
		MarshalClauseContext _localctx = new MarshalClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_marshalClause);
		try {
			setState(1052);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case D_CTOR:
			case D_CCTOR:
			case SQSTRING:
			case ID:
			case DOTTEDNAME:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case K_MARSHAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				match(K_MARSHAL);
				setState(1048);
				match(T__4);
				setState(1049);
				marshalBlob();
				setState(1050);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarshalBlobContext extends ParserRuleContext {
		public NativeTypeContext nativeType() {
			return getRuleContext(NativeTypeContext.class,0);
		}
		public MarshalBlobHeadContext marshalBlobHead() {
			return getRuleContext(MarshalBlobHeadContext.class,0);
		}
		public HexbytesContext hexbytes() {
			return getRuleContext(HexbytesContext.class,0);
		}
		public MarshalBlobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marshalBlob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMarshalBlob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMarshalBlob(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMarshalBlob(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarshalBlobContext marshalBlob() throws RecognitionException {
		MarshalBlobContext _localctx = new MarshalBlobContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_marshalBlob);
		try {
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				nativeType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				marshalBlobHead();
				setState(1056);
				hexbytes(0);
				setState(1057);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarshalBlobHeadContext extends ParserRuleContext {
		public MarshalBlobHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marshalBlobHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMarshalBlobHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMarshalBlobHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMarshalBlobHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarshalBlobHeadContext marshalBlobHead() throws RecognitionException {
		MarshalBlobHeadContext _localctx = new MarshalBlobHeadContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_marshalBlobHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeadContext extends ParserRuleContext {
		public MethodHeadPart1Context methodHeadPart1() {
			return getRuleContext(MethodHeadPart1Context.class,0);
		}
		public CallConvContext callConv() {
			return getRuleContext(CallConvContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MarshalClauseContext marshalClause() {
			return getRuleContext(MarshalClauseContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TyparsClauseContext typarsClause() {
			return getRuleContext(TyparsClauseContext.class,0);
		}
		public SigArgs0Context sigArgs0() {
			return getRuleContext(SigArgs0Context.class,0);
		}
		public List<MethAttrContext> methAttr() {
			return getRuleContexts(MethAttrContext.class);
		}
		public MethAttrContext methAttr(int i) {
			return getRuleContext(MethAttrContext.class,i);
		}
		public List<ParamAttrContext> paramAttr() {
			return getRuleContexts(ParamAttrContext.class);
		}
		public ParamAttrContext paramAttr(int i) {
			return getRuleContext(ParamAttrContext.class,i);
		}
		public List<ImplAttrContext> implAttr() {
			return getRuleContexts(ImplAttrContext.class);
		}
		public ImplAttrContext implAttr(int i) {
			return getRuleContext(ImplAttrContext.class,i);
		}
		public MethodHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethodHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethodHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethodHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeadContext methodHead() throws RecognitionException {
		MethodHeadContext _localctx = new MethodHeadContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_methodHead);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			methodHeadPart1();
			setState(1067);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1064);
					methAttr();
					}
					} 
				}
				setState(1069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(1070);
			callConv();
			setState(1074);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1071);
					paramAttr();
					}
					} 
				}
				setState(1076);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(1077);
			type(0);
			setState(1078);
			marshalClause();
			setState(1079);
			methodName();
			setState(1080);
			typarsClause();
			setState(1081);
			match(T__4);
			setState(1082);
			sigArgs0();
			setState(1083);
			match(T__5);
			setState(1087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1084);
					implAttr();
					}
					} 
				}
				setState(1089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethAttrContext extends ParserRuleContext {
		public TerminalNode K_STATIC() { return getToken(CilParser.K_STATIC, 0); }
		public TerminalNode K_PUBLIC() { return getToken(CilParser.K_PUBLIC, 0); }
		public TerminalNode K_PRIVATE() { return getToken(CilParser.K_PRIVATE, 0); }
		public TerminalNode K_FAMILY() { return getToken(CilParser.K_FAMILY, 0); }
		public TerminalNode K_FINAL() { return getToken(CilParser.K_FINAL, 0); }
		public TerminalNode K_SPECIALNAME() { return getToken(CilParser.K_SPECIALNAME, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(CilParser.K_VIRTUAL, 0); }
		public TerminalNode K_STRICT() { return getToken(CilParser.K_STRICT, 0); }
		public TerminalNode K_ABSTRACT() { return getToken(CilParser.K_ABSTRACT, 0); }
		public TerminalNode K_ASSEMBLY() { return getToken(CilParser.K_ASSEMBLY, 0); }
		public TerminalNode K_FAMANDASSEM() { return getToken(CilParser.K_FAMANDASSEM, 0); }
		public TerminalNode K_FAMORASSEM() { return getToken(CilParser.K_FAMORASSEM, 0); }
		public TerminalNode K_PRIVATESCOPE() { return getToken(CilParser.K_PRIVATESCOPE, 0); }
		public TerminalNode K_HIDEBYSIG() { return getToken(CilParser.K_HIDEBYSIG, 0); }
		public TerminalNode K_NEWSLOT() { return getToken(CilParser.K_NEWSLOT, 0); }
		public TerminalNode K_RTSPECIALNAME() { return getToken(CilParser.K_RTSPECIALNAME, 0); }
		public TerminalNode K_UNMANAGEDEXP() { return getToken(CilParser.K_UNMANAGEDEXP, 0); }
		public TerminalNode K_REQSECOBJ() { return getToken(CilParser.K_REQSECOBJ, 0); }
		public TerminalNode K_FLAGS() { return getToken(CilParser.K_FLAGS, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public TerminalNode K_PINVOKEIMPL() { return getToken(CilParser.K_PINVOKEIMPL, 0); }
		public List<CompQstringContext> compQstring() {
			return getRuleContexts(CompQstringContext.class);
		}
		public CompQstringContext compQstring(int i) {
			return getRuleContext(CompQstringContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(CilParser.K_AS, 0); }
		public List<PinvAttrContext> pinvAttr() {
			return getRuleContexts(PinvAttrContext.class);
		}
		public PinvAttrContext pinvAttr(int i) {
			return getRuleContext(PinvAttrContext.class,i);
		}
		public MethAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethAttrContext methAttr() throws RecognitionException {
		MethAttrContext _localctx = new MethAttrContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_methAttr);
		int _la;
		try {
			int _alt;
			setState(1129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1090);
				match(K_STATIC);
				}
				break;
			case K_PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				match(K_PUBLIC);
				}
				break;
			case K_PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1092);
				match(K_PRIVATE);
				}
				break;
			case K_FAMILY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1093);
				match(K_FAMILY);
				}
				break;
			case K_FINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1094);
				match(K_FINAL);
				}
				break;
			case K_SPECIALNAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(1095);
				match(K_SPECIALNAME);
				}
				break;
			case K_VIRTUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1096);
				match(K_VIRTUAL);
				}
				break;
			case K_STRICT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1097);
				match(K_STRICT);
				}
				break;
			case K_ABSTRACT:
				enterOuterAlt(_localctx, 9);
				{
				setState(1098);
				match(K_ABSTRACT);
				}
				break;
			case K_ASSEMBLY:
				enterOuterAlt(_localctx, 10);
				{
				setState(1099);
				match(K_ASSEMBLY);
				}
				break;
			case K_FAMANDASSEM:
				enterOuterAlt(_localctx, 11);
				{
				setState(1100);
				match(K_FAMANDASSEM);
				}
				break;
			case K_FAMORASSEM:
				enterOuterAlt(_localctx, 12);
				{
				setState(1101);
				match(K_FAMORASSEM);
				}
				break;
			case K_PRIVATESCOPE:
				enterOuterAlt(_localctx, 13);
				{
				setState(1102);
				match(K_PRIVATESCOPE);
				}
				break;
			case K_HIDEBYSIG:
				enterOuterAlt(_localctx, 14);
				{
				setState(1103);
				match(K_HIDEBYSIG);
				}
				break;
			case K_NEWSLOT:
				enterOuterAlt(_localctx, 15);
				{
				setState(1104);
				match(K_NEWSLOT);
				}
				break;
			case K_RTSPECIALNAME:
				enterOuterAlt(_localctx, 16);
				{
				setState(1105);
				match(K_RTSPECIALNAME);
				}
				break;
			case K_UNMANAGEDEXP:
				enterOuterAlt(_localctx, 17);
				{
				setState(1106);
				match(K_UNMANAGEDEXP);
				}
				break;
			case K_REQSECOBJ:
				enterOuterAlt(_localctx, 18);
				{
				setState(1107);
				match(K_REQSECOBJ);
				}
				break;
			case K_FLAGS:
				enterOuterAlt(_localctx, 19);
				{
				setState(1108);
				match(K_FLAGS);
				setState(1109);
				match(T__4);
				setState(1110);
				int32();
				setState(1111);
				match(T__5);
				}
				break;
			case K_PINVOKEIMPL:
				enterOuterAlt(_localctx, 20);
				{
				setState(1113);
				match(K_PINVOKEIMPL);
				setState(1114);
				match(T__4);
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QSTRING) {
					{
					setState(1115);
					compQstring(0);
					}
				}

				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1118);
					match(K_AS);
					setState(1119);
					compQstring(0);
					}
				}

				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1122);
						pinvAttr();
						}
						} 
					}
					setState(1127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(1128);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PinvAttrContext extends ParserRuleContext {
		public TerminalNode K_NOMANGLE() { return getToken(CilParser.K_NOMANGLE, 0); }
		public TerminalNode K_ANSI() { return getToken(CilParser.K_ANSI, 0); }
		public TerminalNode K_UNICODE() { return getToken(CilParser.K_UNICODE, 0); }
		public TerminalNode K_AUTOCHAR() { return getToken(CilParser.K_AUTOCHAR, 0); }
		public TerminalNode K_LASTERR() { return getToken(CilParser.K_LASTERR, 0); }
		public TerminalNode K_WINAPI() { return getToken(CilParser.K_WINAPI, 0); }
		public TerminalNode K_CDECL() { return getToken(CilParser.K_CDECL, 0); }
		public TerminalNode K_STDCALL() { return getToken(CilParser.K_STDCALL, 0); }
		public TerminalNode K_THISCALL() { return getToken(CilParser.K_THISCALL, 0); }
		public TerminalNode K_FASTCALL() { return getToken(CilParser.K_FASTCALL, 0); }
		public TerminalNode K_BESTFIT() { return getToken(CilParser.K_BESTFIT, 0); }
		public TerminalNode K_ON() { return getToken(CilParser.K_ON, 0); }
		public TerminalNode K_OFF() { return getToken(CilParser.K_OFF, 0); }
		public TerminalNode K_CHARMAPERROR() { return getToken(CilParser.K_CHARMAPERROR, 0); }
		public TerminalNode K_FLAGS() { return getToken(CilParser.K_FLAGS, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public PinvAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pinvAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterPinvAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitPinvAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitPinvAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PinvAttrContext pinvAttr() throws RecognitionException {
		PinvAttrContext _localctx = new PinvAttrContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_pinvAttr);
		try {
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				match(K_NOMANGLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				match(K_ANSI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1133);
				match(K_UNICODE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1134);
				match(K_AUTOCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1135);
				match(K_LASTERR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1136);
				match(K_WINAPI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1137);
				match(K_CDECL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1138);
				match(K_STDCALL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1139);
				match(K_THISCALL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1140);
				match(K_FASTCALL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1141);
				match(K_BESTFIT);
				setState(1142);
				match(T__13);
				setState(1143);
				match(K_ON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1144);
				match(K_BESTFIT);
				setState(1145);
				match(T__13);
				setState(1146);
				match(K_OFF);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1147);
				match(K_CHARMAPERROR);
				setState(1148);
				match(T__13);
				setState(1149);
				match(K_ON);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1150);
				match(K_CHARMAPERROR);
				setState(1151);
				match(T__13);
				setState(1152);
				match(K_OFF);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1153);
				match(K_FLAGS);
				setState(1154);
				match(T__4);
				setState(1155);
				int32();
				setState(1156);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode D_CTOR() { return getToken(CilParser.D_CTOR, 0); }
		public TerminalNode D_CCTOR() { return getToken(CilParser.D_CCTOR, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodName);
		try {
			setState(1163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_CTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				match(D_CTOR);
				}
				break;
			case D_CCTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				match(D_CCTOR);
				}
				break;
			case SQSTRING:
			case ID:
			case DOTTEDNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(1162);
				dottedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamAttrContext extends ParserRuleContext {
		public TerminalNode K_IN() { return getToken(CilParser.K_IN, 0); }
		public TerminalNode K_OUT() { return getToken(CilParser.K_OUT, 0); }
		public TerminalNode K_OPT() { return getToken(CilParser.K_OPT, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public ParamAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterParamAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitParamAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitParamAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamAttrContext paramAttr() throws RecognitionException {
		ParamAttrContext _localctx = new ParamAttrContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_paramAttr);
		try {
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165);
				match(T__8);
				setState(1166);
				match(K_IN);
				setState(1167);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				match(T__8);
				setState(1169);
				match(K_OUT);
				setState(1170);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1171);
				match(T__8);
				setState(1172);
				match(K_OPT);
				setState(1173);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1174);
				match(T__8);
				setState(1175);
				int32();
				setState(1176);
				match(T__9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplAttrContext extends ParserRuleContext {
		public TerminalNode K_NATIVE() { return getToken(CilParser.K_NATIVE, 0); }
		public TerminalNode K_CIL() { return getToken(CilParser.K_CIL, 0); }
		public TerminalNode K_OPTIL() { return getToken(CilParser.K_OPTIL, 0); }
		public TerminalNode K_MANAGED() { return getToken(CilParser.K_MANAGED, 0); }
		public TerminalNode K_UNMANAGED() { return getToken(CilParser.K_UNMANAGED, 0); }
		public TerminalNode K_FORWARDREF() { return getToken(CilParser.K_FORWARDREF, 0); }
		public TerminalNode K_PRESERVESIG() { return getToken(CilParser.K_PRESERVESIG, 0); }
		public TerminalNode K_RUNTIME() { return getToken(CilParser.K_RUNTIME, 0); }
		public TerminalNode K_INTERNALCALL() { return getToken(CilParser.K_INTERNALCALL, 0); }
		public TerminalNode K_SYNCHRONIZED() { return getToken(CilParser.K_SYNCHRONIZED, 0); }
		public TerminalNode K_NOINLINING() { return getToken(CilParser.K_NOINLINING, 0); }
		public TerminalNode K_AGGRESSIVEINLINING() { return getToken(CilParser.K_AGGRESSIVEINLINING, 0); }
		public TerminalNode K_NOOPTIMIZATION() { return getToken(CilParser.K_NOOPTIMIZATION, 0); }
		public TerminalNode K_AGGRESSIVEOPTIMIZATION() { return getToken(CilParser.K_AGGRESSIVEOPTIMIZATION, 0); }
		public TerminalNode K_FLAGS() { return getToken(CilParser.K_FLAGS, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public ImplAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterImplAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitImplAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitImplAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplAttrContext implAttr() throws RecognitionException {
		ImplAttrContext _localctx = new ImplAttrContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_implAttr);
		try {
			setState(1199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NATIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				match(K_NATIVE);
				}
				break;
			case K_CIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				match(K_CIL);
				}
				break;
			case K_OPTIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1182);
				match(K_OPTIL);
				}
				break;
			case K_MANAGED:
				enterOuterAlt(_localctx, 4);
				{
				setState(1183);
				match(K_MANAGED);
				}
				break;
			case K_UNMANAGED:
				enterOuterAlt(_localctx, 5);
				{
				setState(1184);
				match(K_UNMANAGED);
				}
				break;
			case K_FORWARDREF:
				enterOuterAlt(_localctx, 6);
				{
				setState(1185);
				match(K_FORWARDREF);
				}
				break;
			case K_PRESERVESIG:
				enterOuterAlt(_localctx, 7);
				{
				setState(1186);
				match(K_PRESERVESIG);
				}
				break;
			case K_RUNTIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(1187);
				match(K_RUNTIME);
				}
				break;
			case K_INTERNALCALL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1188);
				match(K_INTERNALCALL);
				}
				break;
			case K_SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1189);
				match(K_SYNCHRONIZED);
				}
				break;
			case K_NOINLINING:
				enterOuterAlt(_localctx, 11);
				{
				setState(1190);
				match(K_NOINLINING);
				}
				break;
			case K_AGGRESSIVEINLINING:
				enterOuterAlt(_localctx, 12);
				{
				setState(1191);
				match(K_AGGRESSIVEINLINING);
				}
				break;
			case K_NOOPTIMIZATION:
				enterOuterAlt(_localctx, 13);
				{
				setState(1192);
				match(K_NOOPTIMIZATION);
				}
				break;
			case K_AGGRESSIVEOPTIMIZATION:
				enterOuterAlt(_localctx, 14);
				{
				setState(1193);
				match(K_AGGRESSIVEOPTIMIZATION);
				}
				break;
			case K_FLAGS:
				enterOuterAlt(_localctx, 15);
				{
				setState(1194);
				match(K_FLAGS);
				setState(1195);
				match(T__4);
				setState(1196);
				int32();
				setState(1197);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalsHeadContext extends ParserRuleContext {
		public TerminalNode D_LOCALS() { return getToken(CilParser.D_LOCALS, 0); }
		public LocalsHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterLocalsHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitLocalsHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitLocalsHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalsHeadContext localsHead() throws RecognitionException {
		LocalsHeadContext _localctx = new LocalsHeadContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_localsHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(D_LOCALS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclsContext extends ParserRuleContext {
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public MethodDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethodDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethodDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethodDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclsContext methodDecls() throws RecognitionException {
		MethodDeclsContext _localctx = new MethodDeclsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1203);
					methodDecl();
					}
					} 
				}
				setState(1208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
	 
		public MethodDeclContext() { }
		public void copyFrom(MethodDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Method_maxstackContext extends MethodDeclContext {
		public TerminalNode D_MAXSTACK() { return getToken(CilParser.D_MAXSTACK, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public Method_maxstackContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_maxstack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_maxstack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_maxstack(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_dparamContext extends MethodDeclContext {
		public TerminalNode D_PARAM() { return getToken(CilParser.D_PARAM, 0); }
		public TerminalNode K_TYPE() { return getToken(CilParser.K_TYPE, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(CilParser.K_CONSTRAINT, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public InitOptContext initOpt() {
			return getRuleContext(InitOptContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public Method_dparamContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_dparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_dparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_dparam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_exportContext extends MethodDeclContext {
		public TerminalNode D_EXPORT() { return getToken(CilParser.D_EXPORT, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public TerminalNode K_AS() { return getToken(CilParser.K_AS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Method_exportContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_export(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_export(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_export(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_zeroinitContext extends MethodDeclContext {
		public TerminalNode D_ZEROINIT() { return getToken(CilParser.D_ZEROINIT, 0); }
		public Method_zeroinitContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_zeroinit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_zeroinit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_zeroinit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_overrideContext extends MethodDeclContext {
		public TerminalNode D_OVERRIDE() { return getToken(CilParser.D_OVERRIDE, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode DCOLON() { return getToken(CilParser.DCOLON, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode K_METHOD() { return getToken(CilParser.K_METHOD, 0); }
		public CallConvContext callConv() {
			return getRuleContext(CallConvContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GenArityContext genArity() {
			return getRuleContext(GenArityContext.class,0);
		}
		public SigArgs0Context sigArgs0() {
			return getRuleContext(SigArgs0Context.class,0);
		}
		public Method_overrideContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_override(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_override(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_override(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_emitbyteContext extends MethodDeclContext {
		public TerminalNode D_EMITBYTE() { return getToken(CilParser.D_EMITBYTE, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public Method_emitbyteContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_emitbyte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_emitbyte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_emitbyte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_vtentryContext extends MethodDeclContext {
		public TerminalNode D_VTENTRY() { return getToken(CilParser.D_VTENTRY, 0); }
		public List<Int32Context> int32() {
			return getRuleContexts(Int32Context.class);
		}
		public Int32Context int32(int i) {
			return getRuleContext(Int32Context.class,i);
		}
		public Method_vtentryContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_vtentry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_vtentry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_vtentry(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_instructionContext extends MethodDeclContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Method_instructionContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_instruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_datadeclContext extends MethodDeclContext {
		public DataDeclContext dataDecl() {
			return getRuleContext(DataDeclContext.class,0);
		}
		public Method_datadeclContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_datadecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_datadecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_datadecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_externalSourceContext extends MethodDeclContext {
		public ExtSourceSpecContext extSourceSpec() {
			return getRuleContext(ExtSourceSpecContext.class,0);
		}
		public Method_externalSourceContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_externalSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_externalSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_externalSource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_scopeBlockContext extends MethodDeclContext {
		public ScopeBlockContext scopeBlock() {
			return getRuleContext(ScopeBlockContext.class,0);
		}
		public Method_scopeBlockContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_scopeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_scopeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_scopeBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_customAtributeContext extends MethodDeclContext {
		public CustomAttrDeclContext customAttrDecl() {
			return getRuleContext(CustomAttrDeclContext.class,0);
		}
		public Method_customAtributeContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_customAtribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_customAtribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_customAtribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_securityContext extends MethodDeclContext {
		public SecDeclContext secDecl() {
			return getRuleContext(SecDeclContext.class,0);
		}
		public Method_securityContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_security(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_security(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_security(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_sehblockContext extends MethodDeclContext {
		public SehBlockContext sehBlock() {
			return getRuleContext(SehBlockContext.class,0);
		}
		public Method_sehblockContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_sehblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_sehblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_sehblock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_localsContext extends MethodDeclContext {
		public LocalsHeadContext localsHead() {
			return getRuleContext(LocalsHeadContext.class,0);
		}
		public SigArgs0Context sigArgs0() {
			return getRuleContext(SigArgs0Context.class,0);
		}
		public TerminalNode K_INIT() { return getToken(CilParser.K_INIT, 0); }
		public Method_localsContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_locals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_locals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_locals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_compilerControlContext extends MethodDeclContext {
		public CompControlContext compControl() {
			return getRuleContext(CompControlContext.class,0);
		}
		public Method_compilerControlContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_compilerControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_compilerControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_compilerControl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_entrypointContext extends MethodDeclContext {
		public TerminalNode D_ENTRYPOINT() { return getToken(CilParser.D_ENTRYPOINT, 0); }
		public Method_entrypointContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_entrypoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_entrypoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_entrypoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_languageContext extends MethodDeclContext {
		public LanguageDeclContext languageDecl() {
			return getRuleContext(LanguageDeclContext.class,0);
		}
		public Method_languageContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethod_language(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethod_language(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethod_language(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodDecl);
		int _la;
		try {
			setState(1294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_EMITBYTE:
				_localctx = new Method_emitbyteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1209);
				match(D_EMITBYTE);
				setState(1210);
				int32();
				}
				break;
			case D_TRY:
				_localctx = new Method_sehblockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1211);
				sehBlock();
				}
				break;
			case D_MAXSTACK:
				_localctx = new Method_maxstackContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1212);
				match(D_MAXSTACK);
				setState(1213);
				int32();
				}
				break;
			case D_LOCALS:
				_localctx = new Method_localsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1214);
				localsHead();
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INIT) {
					{
					setState(1215);
					match(K_INIT);
					}
				}

				setState(1218);
				match(T__4);
				setState(1219);
				sigArgs0();
				setState(1220);
				match(T__5);
				}
				break;
			case D_ENTRYPOINT:
				_localctx = new Method_entrypointContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1222);
				match(D_ENTRYPOINT);
				}
				break;
			case D_ZEROINIT:
				_localctx = new Method_zeroinitContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1223);
				match(D_ZEROINIT);
				}
				break;
			case D_DATA:
				_localctx = new Method_datadeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1224);
				dataDecl();
				}
				break;
			case INSTR_NONE:
			case INSTR_VAR:
			case INSTR_I:
			case INSTR_I8:
			case INSTR_R:
			case INSTR_METHOD:
			case INSTR_SIG:
			case INSTR_BRTARGET:
			case INSTR_SWITCH:
			case INSTR_TYPE:
			case INSTR_STRING:
			case INSTR_FIELD:
			case INSTR_TOK:
			case SQSTRING:
			case ID:
				_localctx = new Method_instructionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQSTRING || _la==ID) {
					{
					setState(1225);
					id();
					setState(1226);
					match(T__13);
					}
				}

				setState(1230);
				instr();
				}
				break;
			case D_PERMISSION:
			case D_PERMISSIONSET:
				_localctx = new Method_securityContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1231);
				secDecl();
				}
				break;
			case D_LINE:
			case P_LINE:
				_localctx = new Method_externalSourceContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1232);
				extSourceSpec();
				}
				break;
			case D_LANGUAGE:
				_localctx = new Method_languageContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1233);
				languageDecl();
				}
				break;
			case D_CUSTOM:
				_localctx = new Method_customAtributeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1234);
				customAttrDecl();
				}
				break;
			case T__6:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
				_localctx = new Method_compilerControlContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1235);
				compControl();
				}
				break;
			case D_EXPORT:
				_localctx = new Method_exportContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1236);
				match(D_EXPORT);
				setState(1237);
				match(T__8);
				setState(1238);
				int32();
				setState(1239);
				match(T__9);
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1240);
					match(K_AS);
					setState(1241);
					id();
					}
				}

				}
				break;
			case D_VTENTRY:
				_localctx = new Method_vtentryContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1244);
				match(D_VTENTRY);
				setState(1245);
				int32();
				setState(1246);
				match(T__13);
				setState(1247);
				int32();
				}
				break;
			case D_OVERRIDE:
				_localctx = new Method_overrideContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1249);
				match(D_OVERRIDE);
				setState(1254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(1250);
					match(K_METHOD);
					setState(1251);
					callConv();
					setState(1252);
					type(0);
					}
					break;
				}
				setState(1256);
				typeSpec();
				setState(1257);
				match(DCOLON);
				setState(1258);
				methodName();
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__10) {
					{
					setState(1259);
					genArity();
					setState(1260);
					match(T__4);
					setState(1261);
					sigArgs0();
					setState(1262);
					match(T__5);
					}
				}

				}
				break;
			case T__0:
				_localctx = new Method_scopeBlockContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1266);
				scopeBlock();
				}
				break;
			case D_PARAM:
				_localctx = new Method_dparamContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1267);
				match(D_PARAM);
				setState(1292);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_TYPE:
					{
					setState(1268);
					match(K_TYPE);
					setState(1274);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(1269);
						match(T__8);
						setState(1270);
						int32();
						setState(1271);
						match(T__9);
						}
						break;
					case SQSTRING:
					case ID:
					case DOTTEDNAME:
						{
						setState(1273);
						dottedName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case K_CONSTRAINT:
					{
					setState(1276);
					match(K_CONSTRAINT);
					setState(1282);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(1277);
						match(T__8);
						setState(1278);
						int32();
						setState(1279);
						match(T__9);
						}
						break;
					case SQSTRING:
					case ID:
					case DOTTEDNAME:
						{
						setState(1281);
						dottedName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1284);
					match(T__3);
					setState(1285);
					typeSpec();
					}
					break;
				case T__8:
					{
					setState(1287);
					match(T__8);
					setState(1288);
					int32();
					setState(1289);
					match(T__9);
					setState(1290);
					initOpt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeBlockContext extends ParserRuleContext {
		public ScopeOpenContext scopeOpen() {
			return getRuleContext(ScopeOpenContext.class,0);
		}
		public MethodDeclsContext methodDecls() {
			return getRuleContext(MethodDeclsContext.class,0);
		}
		public ScopeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterScopeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitScopeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitScopeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeBlockContext scopeBlock() throws RecognitionException {
		ScopeBlockContext _localctx = new ScopeBlockContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_scopeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			scopeOpen();
			setState(1297);
			methodDecls();
			setState(1298);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeOpenContext extends ParserRuleContext {
		public ScopeOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterScopeOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitScopeOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitScopeOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeOpenContext scopeOpen() throws RecognitionException {
		ScopeOpenContext _localctx = new ScopeOpenContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_scopeOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SehBlockContext extends ParserRuleContext {
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public SehClausesContext sehClauses() {
			return getRuleContext(SehClausesContext.class,0);
		}
		public SehBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sehBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSehBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSehBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSehBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SehBlockContext sehBlock() throws RecognitionException {
		SehBlockContext _localctx = new SehBlockContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_sehBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			tryBlock();
			setState(1303);
			sehClauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SehClausesContext extends ParserRuleContext {
		public SehClauseContext sehClause() {
			return getRuleContext(SehClauseContext.class,0);
		}
		public SehClausesContext sehClauses() {
			return getRuleContext(SehClausesContext.class,0);
		}
		public SehClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sehClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSehClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSehClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSehClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SehClausesContext sehClauses() throws RecognitionException {
		SehClausesContext _localctx = new SehClausesContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_sehClauses);
		try {
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				sehClause();
				setState(1306);
				sehClauses();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				sehClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryBlockContext extends ParserRuleContext {
		public TerminalNode D_TRY() { return getToken(CilParser.D_TRY, 0); }
		public ScopeBlockContext scopeBlock() {
			return getRuleContext(ScopeBlockContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode K_TO() { return getToken(CilParser.K_TO, 0); }
		public List<Int32Context> int32() {
			return getRuleContexts(Int32Context.class);
		}
		public Int32Context int32(int i) {
			return getRuleContext(Int32Context.class,i);
		}
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tryBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			match(D_TRY);
			setState(1321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(1312);
				scopeBlock();
				}
				break;
			case SQSTRING:
			case ID:
				{
				setState(1313);
				id();
				setState(1314);
				match(K_TO);
				setState(1315);
				id();
				}
				break;
			case INT64:
				{
				setState(1317);
				int32();
				setState(1318);
				match(K_TO);
				setState(1319);
				int32();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SehClauseContext extends ParserRuleContext {
		public CatchClauseContext catchClause() {
			return getRuleContext(CatchClauseContext.class,0);
		}
		public HandlerBlockContext handlerBlock() {
			return getRuleContext(HandlerBlockContext.class,0);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public FaultClauseContext faultClause() {
			return getRuleContext(FaultClauseContext.class,0);
		}
		public SehClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sehClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSehClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSehClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSehClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SehClauseContext sehClause() throws RecognitionException {
		SehClauseContext _localctx = new SehClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_sehClause);
		try {
			setState(1335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1323);
				catchClause();
				setState(1324);
				handlerBlock();
				}
				break;
			case K_FILTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1326);
				filterClause();
				setState(1327);
				handlerBlock();
				}
				break;
			case K_FINALLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1329);
				finallyClause();
				setState(1330);
				handlerBlock();
				}
				break;
			case K_FAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1332);
				faultClause();
				setState(1333);
				handlerBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterClauseContext extends ParserRuleContext {
		public FilterHeadContext filterHead() {
			return getRuleContext(FilterHeadContext.class,0);
		}
		public ScopeBlockContext scopeBlock() {
			return getRuleContext(ScopeBlockContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public FilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFilterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFilterClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFilterClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterClauseContext filterClause() throws RecognitionException {
		FilterClauseContext _localctx = new FilterClauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_filterClause);
		try {
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				filterHead();
				setState(1338);
				scopeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1340);
				filterHead();
				setState(1341);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1343);
				filterHead();
				setState(1344);
				int32();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterHeadContext extends ParserRuleContext {
		public TerminalNode K_FILTER() { return getToken(CilParser.K_FILTER, 0); }
		public FilterHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFilterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFilterHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFilterHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterHeadContext filterHead() throws RecognitionException {
		FilterHeadContext _localctx = new FilterHeadContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_filterHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(K_FILTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode K_CATCH() { return getToken(CilParser.K_CATCH, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(K_CATCH);
			setState(1351);
			typeSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyClauseContext extends ParserRuleContext {
		public TerminalNode K_FINALLY() { return getToken(CilParser.K_FINALLY, 0); }
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFinallyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFinallyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFinallyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			match(K_FINALLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaultClauseContext extends ParserRuleContext {
		public TerminalNode K_FAULT() { return getToken(CilParser.K_FAULT, 0); }
		public FaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFaultClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFaultClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaultClauseContext faultClause() throws RecognitionException {
		FaultClauseContext _localctx = new FaultClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_faultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(K_FAULT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerBlockContext extends ParserRuleContext {
		public ScopeBlockContext scopeBlock() {
			return getRuleContext(ScopeBlockContext.class,0);
		}
		public TerminalNode K_HANDLER() { return getToken(CilParser.K_HANDLER, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode K_TO() { return getToken(CilParser.K_TO, 0); }
		public List<Int32Context> int32() {
			return getRuleContexts(Int32Context.class);
		}
		public Int32Context int32(int i) {
			return getRuleContext(Int32Context.class,i);
		}
		public HandlerBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterHandlerBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitHandlerBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitHandlerBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerBlockContext handlerBlock() throws RecognitionException {
		HandlerBlockContext _localctx = new HandlerBlockContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_handlerBlock);
		try {
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				scopeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1358);
				match(K_HANDLER);
				setState(1359);
				id();
				setState(1360);
				match(K_TO);
				setState(1361);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1363);
				match(K_HANDLER);
				setState(1364);
				int32();
				setState(1365);
				match(K_TO);
				setState(1366);
				int32();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDeclContext extends ParserRuleContext {
		public DdHeadContext ddHead() {
			return getRuleContext(DdHeadContext.class,0);
		}
		public DdBodyContext ddBody() {
			return getRuleContext(DdBodyContext.class,0);
		}
		public DataDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterDataDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitDataDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitDataDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDeclContext dataDecl() throws RecognitionException {
		DataDeclContext _localctx = new DataDeclContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_dataDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			ddHead();
			setState(1371);
			ddBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DdHeadContext extends ParserRuleContext {
		public TerminalNode D_DATA() { return getToken(CilParser.D_DATA, 0); }
		public TlsContext tls() {
			return getRuleContext(TlsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DdHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterDdHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitDdHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitDdHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdHeadContext ddHead() throws RecognitionException {
		DdHeadContext _localctx = new DdHeadContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_ddHead);
		try {
			setState(1380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				match(D_DATA);
				setState(1374);
				tls();
				setState(1375);
				id();
				setState(1376);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				match(D_DATA);
				setState(1379);
				tls();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TlsContext extends ParserRuleContext {
		public TerminalNode K_TLS() { return getToken(CilParser.K_TLS, 0); }
		public TerminalNode K_CIL() { return getToken(CilParser.K_CIL, 0); }
		public TlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TlsContext tls() throws RecognitionException {
		TlsContext _localctx = new TlsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_tls);
		try {
			setState(1385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__15:
			case K_CHAR:
			case K_INT8:
			case K_INT16:
			case K_INT32:
			case K_INT64:
			case K_FLOAT32:
			case K_FLOAT64:
			case K_BYTEARRAY:
			case SQSTRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case K_TLS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1383);
				match(K_TLS);
				}
				break;
			case K_CIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1384);
				match(K_CIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DdBodyContext extends ParserRuleContext {
		public DdItemListContext ddItemList() {
			return getRuleContext(DdItemListContext.class,0);
		}
		public DdItemContext ddItem() {
			return getRuleContext(DdItemContext.class,0);
		}
		public DdBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterDdBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitDdBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitDdBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdBodyContext ddBody() throws RecognitionException {
		DdBodyContext _localctx = new DdBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_ddBody);
		try {
			setState(1392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				match(T__0);
				setState(1388);
				ddItemList();
				setState(1389);
				match(T__1);
				}
				break;
			case T__15:
			case K_CHAR:
			case K_INT8:
			case K_INT16:
			case K_INT32:
			case K_INT64:
			case K_FLOAT32:
			case K_FLOAT64:
			case K_BYTEARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				ddItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DdItemListContext extends ParserRuleContext {
		public DdItemContext ddItem() {
			return getRuleContext(DdItemContext.class,0);
		}
		public DdItemListContext ddItemList() {
			return getRuleContext(DdItemListContext.class,0);
		}
		public DdItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterDdItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitDdItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitDdItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdItemListContext ddItemList() throws RecognitionException {
		DdItemListContext _localctx = new DdItemListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_ddItemList);
		try {
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				ddItem();
				setState(1395);
				match(T__3);
				setState(1396);
				ddItemList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				ddItem();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DdItemCountContext extends ParserRuleContext {
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public DdItemCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddItemCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterDdItemCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitDdItemCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitDdItemCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdItemCountContext ddItemCount() throws RecognitionException {
		DdItemCountContext _localctx = new DdItemCountContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_ddItemCount);
		try {
			setState(1406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__3:
			case T__6:
			case D_INTERFACEIMPL:
			case INSTR_NONE:
			case INSTR_VAR:
			case INSTR_I:
			case INSTR_I8:
			case INSTR_R:
			case INSTR_METHOD:
			case INSTR_SIG:
			case INSTR_BRTARGET:
			case INSTR_SWITCH:
			case INSTR_TYPE:
			case INSTR_STRING:
			case INSTR_FIELD:
			case INSTR_TOK:
			case D_CLASS:
			case D_NAMESPACE:
			case D_METHOD:
			case D_FIELD:
			case D_DATA:
			case D_EMITBYTE:
			case D_TRY:
			case D_MAXSTACK:
			case D_LOCALS:
			case D_ENTRYPOINT:
			case D_ZEROINIT:
			case D_EVENT:
			case D_PROPERTY:
			case D_PERMISSION:
			case D_PERMISSIONSET:
			case D_LINE:
			case P_LINE:
			case D_LANGUAGE:
			case D_CUSTOM:
			case D_SIZE:
			case D_PACK:
			case D_VTABLE:
			case D_VTFIXUP:
			case D_VTENTRY:
			case D_FILE:
			case D_ASSEMBLY:
			case D_MRESOURCE:
			case D_MODULE:
			case D_EXPORT:
			case D_PARAM:
			case D_OVERRIDE:
			case D_SUBSYSTEM:
			case D_CORFLAGS:
			case D_IMAGEBASE:
			case D_STACKRESERVE:
			case D_TYPEDEF:
			case D_TYPELIST:
			case D_MSCORLIB:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
			case SQSTRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				match(T__8);
				setState(1403);
				int32();
				setState(1404);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DdItemContext extends ParserRuleContext {
		public TerminalNode K_CHAR() { return getToken(CilParser.K_CHAR, 0); }
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BytearrayheadContext bytearrayhead() {
			return getRuleContext(BytearrayheadContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public TerminalNode K_FLOAT32() { return getToken(CilParser.K_FLOAT32, 0); }
		public Float64Context float64() {
			return getRuleContext(Float64Context.class,0);
		}
		public DdItemCountContext ddItemCount() {
			return getRuleContext(DdItemCountContext.class,0);
		}
		public TerminalNode K_FLOAT64() { return getToken(CilParser.K_FLOAT64, 0); }
		public TerminalNode K_INT64() { return getToken(CilParser.K_INT64, 0); }
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public TerminalNode K_INT32() { return getToken(CilParser.K_INT32, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public TerminalNode K_INT16() { return getToken(CilParser.K_INT16, 0); }
		public TerminalNode K_INT8() { return getToken(CilParser.K_INT8, 0); }
		public DdItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterDdItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitDdItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitDdItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdItemContext ddItem() throws RecognitionException {
		DdItemContext _localctx = new DdItemContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_ddItem);
		try {
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1408);
				match(K_CHAR);
				setState(1409);
				match(T__14);
				setState(1410);
				match(T__4);
				setState(1411);
				compQstring(0);
				setState(1412);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				match(T__15);
				setState(1415);
				match(T__4);
				setState(1416);
				id();
				setState(1417);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1419);
				bytearrayhead();
				setState(1420);
				bytes();
				setState(1421);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1423);
				match(K_FLOAT32);
				setState(1424);
				match(T__4);
				setState(1425);
				float64();
				setState(1426);
				match(T__5);
				setState(1427);
				ddItemCount();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1429);
				match(K_FLOAT64);
				setState(1430);
				match(T__4);
				setState(1431);
				float64();
				setState(1432);
				match(T__5);
				setState(1433);
				ddItemCount();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1435);
				match(K_INT64);
				setState(1436);
				match(T__4);
				setState(1437);
				int64();
				setState(1438);
				match(T__5);
				setState(1439);
				ddItemCount();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1441);
				match(K_INT32);
				setState(1442);
				match(T__4);
				setState(1443);
				int32();
				setState(1444);
				match(T__5);
				setState(1445);
				ddItemCount();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1447);
				match(K_INT16);
				setState(1448);
				match(T__4);
				setState(1449);
				int32();
				setState(1450);
				match(T__5);
				setState(1451);
				ddItemCount();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1453);
				match(K_INT8);
				setState(1454);
				match(T__4);
				setState(1455);
				int32();
				setState(1456);
				match(T__5);
				setState(1457);
				ddItemCount();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1459);
				match(K_FLOAT32);
				setState(1460);
				ddItemCount();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1461);
				match(K_FLOAT64);
				setState(1462);
				ddItemCount();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1463);
				match(K_INT64);
				setState(1464);
				ddItemCount();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1465);
				match(K_INT32);
				setState(1466);
				ddItemCount();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1467);
				match(K_INT16);
				setState(1468);
				ddItemCount();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1469);
				match(K_INT8);
				setState(1470);
				ddItemCount();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldSerInitContext extends ParserRuleContext {
		public TerminalNode K_FLOAT32() { return getToken(CilParser.K_FLOAT32, 0); }
		public Float64Context float64() {
			return getRuleContext(Float64Context.class,0);
		}
		public TerminalNode K_FLOAT64() { return getToken(CilParser.K_FLOAT64, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public TerminalNode K_INT64() { return getToken(CilParser.K_INT64, 0); }
		public TerminalNode K_INT32() { return getToken(CilParser.K_INT32, 0); }
		public TerminalNode K_INT16() { return getToken(CilParser.K_INT16, 0); }
		public TerminalNode K_INT8() { return getToken(CilParser.K_INT8, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(CilParser.K_UNSIGNED, 0); }
		public TerminalNode K_UINT64() { return getToken(CilParser.K_UINT64, 0); }
		public TerminalNode K_UINT32() { return getToken(CilParser.K_UINT32, 0); }
		public TerminalNode K_UINT16() { return getToken(CilParser.K_UINT16, 0); }
		public TerminalNode K_UINT8() { return getToken(CilParser.K_UINT8, 0); }
		public TerminalNode K_CHAR() { return getToken(CilParser.K_CHAR, 0); }
		public TerminalNode K_BOOL() { return getToken(CilParser.K_BOOL, 0); }
		public TruefalseContext truefalse() {
			return getRuleContext(TruefalseContext.class,0);
		}
		public BytearrayheadContext bytearrayhead() {
			return getRuleContext(BytearrayheadContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public FieldSerInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldSerInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFieldSerInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFieldSerInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFieldSerInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldSerInitContext fieldSerInit() throws RecognitionException {
		FieldSerInitContext _localctx = new FieldSerInitContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_fieldSerInit);
		try {
			setState(1571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				match(K_FLOAT32);
				setState(1474);
				match(T__4);
				setState(1475);
				float64();
				setState(1476);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1478);
				match(K_FLOAT64);
				setState(1479);
				match(T__4);
				setState(1480);
				float64();
				setState(1481);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1483);
				match(K_FLOAT32);
				setState(1484);
				match(T__4);
				setState(1485);
				int32();
				setState(1486);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1488);
				match(K_FLOAT64);
				setState(1489);
				match(T__4);
				setState(1490);
				int64();
				setState(1491);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1493);
				match(K_INT64);
				setState(1494);
				match(T__4);
				setState(1495);
				int64();
				setState(1496);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1498);
				match(K_INT32);
				setState(1499);
				match(T__4);
				setState(1500);
				int32();
				setState(1501);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1503);
				match(K_INT16);
				setState(1504);
				match(T__4);
				setState(1505);
				int32();
				setState(1506);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1508);
				match(K_INT8);
				setState(1509);
				match(T__4);
				setState(1510);
				int32();
				setState(1511);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1513);
				match(K_UNSIGNED);
				setState(1514);
				match(K_INT64);
				setState(1515);
				match(T__4);
				setState(1516);
				int64();
				setState(1517);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1519);
				match(K_UNSIGNED);
				setState(1520);
				match(K_INT32);
				setState(1521);
				match(T__4);
				setState(1522);
				int32();
				setState(1523);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1525);
				match(K_UNSIGNED);
				setState(1526);
				match(K_INT16);
				setState(1527);
				match(T__4);
				setState(1528);
				int32();
				setState(1529);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1531);
				match(K_UNSIGNED);
				setState(1532);
				match(K_INT8);
				setState(1533);
				match(T__4);
				setState(1534);
				int32();
				setState(1535);
				match(T__5);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1537);
				match(K_UINT64);
				setState(1538);
				match(T__4);
				setState(1539);
				int64();
				setState(1540);
				match(T__5);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1542);
				match(K_UINT32);
				setState(1543);
				match(T__4);
				setState(1544);
				int32();
				setState(1545);
				match(T__5);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1547);
				match(K_UINT16);
				setState(1548);
				match(T__4);
				setState(1549);
				int32();
				setState(1550);
				match(T__5);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1552);
				match(K_UINT8);
				setState(1553);
				match(T__4);
				setState(1554);
				int32();
				setState(1555);
				match(T__5);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1557);
				match(K_CHAR);
				setState(1558);
				match(T__4);
				setState(1559);
				int32();
				setState(1560);
				match(T__5);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1562);
				match(K_BOOL);
				setState(1563);
				match(T__4);
				setState(1564);
				truefalse();
				setState(1565);
				match(T__5);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1567);
				bytearrayhead();
				setState(1568);
				bytes();
				setState(1569);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BytearrayheadContext extends ParserRuleContext {
		public TerminalNode K_BYTEARRAY() { return getToken(CilParser.K_BYTEARRAY, 0); }
		public BytearrayheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytearrayhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterBytearrayhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitBytearrayhead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitBytearrayhead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BytearrayheadContext bytearrayhead() throws RecognitionException {
		BytearrayheadContext _localctx = new BytearrayheadContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_bytearrayhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(K_BYTEARRAY);
			setState(1574);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BytesContext extends ParserRuleContext {
		public HexbytesContext hexbytes() {
			return getRuleContext(HexbytesContext.class,0);
		}
		public BytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BytesContext bytes() throws RecognitionException {
		BytesContext _localctx = new BytesContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_bytes);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case HEXBYTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1577);
				hexbytes(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexbytesContext extends ParserRuleContext {
		public TerminalNode HEXBYTE() { return getToken(CilParser.HEXBYTE, 0); }
		public HexbytesContext hexbytes() {
			return getRuleContext(HexbytesContext.class,0);
		}
		public HexbytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexbytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterHexbytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitHexbytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitHexbytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexbytesContext hexbytes() throws RecognitionException {
		return hexbytes(0);
	}

	private HexbytesContext hexbytes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		HexbytesContext _localctx = new HexbytesContext(_ctx, _parentState);
		HexbytesContext _prevctx = _localctx;
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_hexbytes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1581);
			match(HEXBYTE);
			}
			_ctx.stop = _input.LT(-1);
			setState(1587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new HexbytesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_hexbytes);
					setState(1583);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1584);
					match(HEXBYTE);
					}
					} 
				}
				setState(1589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FieldInitContext extends ParserRuleContext {
		public FieldSerInitContext fieldSerInit() {
			return getRuleContext(FieldSerInitContext.class,0);
		}
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public TerminalNode K_NULLREF() { return getToken(CilParser.K_NULLREF, 0); }
		public FieldInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFieldInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFieldInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFieldInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldInitContext fieldInit() throws RecognitionException {
		FieldInitContext _localctx = new FieldInitContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_fieldInit);
		try {
			setState(1593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BOOL:
			case K_CHAR:
			case K_UNSIGNED:
			case K_INT8:
			case K_INT16:
			case K_INT32:
			case K_INT64:
			case K_FLOAT32:
			case K_FLOAT64:
			case K_BYTEARRAY:
			case K_UINT8:
			case K_UINT16:
			case K_UINT32:
			case K_UINT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				fieldSerInit();
				}
				break;
			case QSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1591);
				compQstring(0);
				}
				break;
			case K_NULLREF:
				enterOuterAlt(_localctx, 3);
				{
				setState(1592);
				match(K_NULLREF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerInitContext extends ParserRuleContext {
		public FieldSerInitContext fieldSerInit() {
			return getRuleContext(FieldSerInitContext.class,0);
		}
		public TerminalNode K_STRING() { return getToken(CilParser.K_STRING, 0); }
		public TerminalNode K_NULLREF() { return getToken(CilParser.K_NULLREF, 0); }
		public TerminalNode SQSTRING() { return getToken(CilParser.SQSTRING, 0); }
		public TerminalNode K_TYPE() { return getToken(CilParser.K_TYPE, 0); }
		public TerminalNode K_CLASS() { return getToken(CilParser.K_CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode K_OBJECT() { return getToken(CilParser.K_OBJECT, 0); }
		public SerInitContext serInit() {
			return getRuleContext(SerInitContext.class,0);
		}
		public TerminalNode K_FLOAT32() { return getToken(CilParser.K_FLOAT32, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public F32seqContext f32seq() {
			return getRuleContext(F32seqContext.class,0);
		}
		public TerminalNode K_FLOAT64() { return getToken(CilParser.K_FLOAT64, 0); }
		public F64seqContext f64seq() {
			return getRuleContext(F64seqContext.class,0);
		}
		public TerminalNode K_INT64() { return getToken(CilParser.K_INT64, 0); }
		public I64seqContext i64seq() {
			return getRuleContext(I64seqContext.class,0);
		}
		public TerminalNode K_INT32() { return getToken(CilParser.K_INT32, 0); }
		public I32seqContext i32seq() {
			return getRuleContext(I32seqContext.class,0);
		}
		public TerminalNode K_INT16() { return getToken(CilParser.K_INT16, 0); }
		public I16seqContext i16seq() {
			return getRuleContext(I16seqContext.class,0);
		}
		public TerminalNode K_INT8() { return getToken(CilParser.K_INT8, 0); }
		public I8seqContext i8seq() {
			return getRuleContext(I8seqContext.class,0);
		}
		public TerminalNode K_UINT64() { return getToken(CilParser.K_UINT64, 0); }
		public TerminalNode K_UINT32() { return getToken(CilParser.K_UINT32, 0); }
		public TerminalNode K_UINT16() { return getToken(CilParser.K_UINT16, 0); }
		public TerminalNode K_UINT8() { return getToken(CilParser.K_UINT8, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(CilParser.K_UNSIGNED, 0); }
		public TerminalNode K_CHAR() { return getToken(CilParser.K_CHAR, 0); }
		public TerminalNode K_BOOL() { return getToken(CilParser.K_BOOL, 0); }
		public BoolSeqContext boolSeq() {
			return getRuleContext(BoolSeqContext.class,0);
		}
		public SqstringSeqContext sqstringSeq() {
			return getRuleContext(SqstringSeqContext.class,0);
		}
		public ClassSeqContext classSeq() {
			return getRuleContext(ClassSeqContext.class,0);
		}
		public ObjSeqContext objSeq() {
			return getRuleContext(ObjSeqContext.class,0);
		}
		public SerInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSerInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSerInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSerInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerInitContext serInit() throws RecognitionException {
		SerInitContext _localctx = new SerInitContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_serInit);
		try {
			setState(1779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1595);
				fieldSerInit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				match(K_STRING);
				setState(1597);
				match(T__4);
				setState(1598);
				match(K_NULLREF);
				setState(1599);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1600);
				match(K_STRING);
				setState(1601);
				match(T__4);
				setState(1602);
				match(SQSTRING);
				setState(1603);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1604);
				match(K_TYPE);
				setState(1605);
				match(T__4);
				setState(1606);
				match(K_CLASS);
				setState(1607);
				match(SQSTRING);
				setState(1608);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1609);
				match(K_TYPE);
				setState(1610);
				match(T__4);
				setState(1611);
				className();
				setState(1612);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1614);
				match(K_TYPE);
				setState(1615);
				match(T__4);
				setState(1616);
				match(K_NULLREF);
				setState(1617);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1618);
				match(K_OBJECT);
				setState(1619);
				match(T__4);
				setState(1620);
				serInit();
				setState(1621);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1623);
				match(K_FLOAT32);
				setState(1624);
				match(T__8);
				setState(1625);
				int32();
				setState(1626);
				match(T__9);
				setState(1627);
				match(T__4);
				setState(1628);
				f32seq(0);
				setState(1629);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1631);
				match(K_FLOAT64);
				setState(1632);
				match(T__8);
				setState(1633);
				int32();
				setState(1634);
				match(T__9);
				setState(1635);
				match(T__4);
				setState(1636);
				f64seq(0);
				setState(1637);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1639);
				match(K_INT64);
				setState(1640);
				match(T__8);
				setState(1641);
				int32();
				setState(1642);
				match(T__9);
				setState(1643);
				match(T__4);
				setState(1644);
				i64seq(0);
				setState(1645);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1647);
				match(K_INT32);
				setState(1648);
				match(T__8);
				setState(1649);
				int32();
				setState(1650);
				match(T__9);
				setState(1651);
				match(T__4);
				setState(1652);
				i32seq(0);
				setState(1653);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1655);
				match(K_INT16);
				setState(1656);
				match(T__8);
				setState(1657);
				int32();
				setState(1658);
				match(T__9);
				setState(1659);
				match(T__4);
				setState(1660);
				i16seq(0);
				setState(1661);
				match(T__5);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1663);
				match(K_INT8);
				setState(1664);
				match(T__8);
				setState(1665);
				int32();
				setState(1666);
				match(T__9);
				setState(1667);
				match(T__4);
				setState(1668);
				i8seq(0);
				setState(1669);
				match(T__5);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1671);
				match(K_UINT64);
				setState(1672);
				match(T__8);
				setState(1673);
				int32();
				setState(1674);
				match(T__9);
				setState(1675);
				match(T__4);
				setState(1676);
				i64seq(0);
				setState(1677);
				match(T__5);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1679);
				match(K_UINT32);
				setState(1680);
				match(T__8);
				setState(1681);
				int32();
				setState(1682);
				match(T__9);
				setState(1683);
				match(T__4);
				setState(1684);
				i32seq(0);
				setState(1685);
				match(T__5);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1687);
				match(K_UINT16);
				setState(1688);
				match(T__8);
				setState(1689);
				int32();
				setState(1690);
				match(T__9);
				setState(1691);
				match(T__4);
				setState(1692);
				i16seq(0);
				setState(1693);
				match(T__5);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1695);
				match(K_UINT8);
				setState(1696);
				match(T__8);
				setState(1697);
				int32();
				setState(1698);
				match(T__9);
				setState(1699);
				match(T__4);
				setState(1700);
				i8seq(0);
				setState(1701);
				match(T__5);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1703);
				match(K_UNSIGNED);
				setState(1704);
				match(K_INT64);
				setState(1705);
				match(T__8);
				setState(1706);
				int32();
				setState(1707);
				match(T__9);
				setState(1708);
				match(T__4);
				setState(1709);
				i64seq(0);
				setState(1710);
				match(T__5);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1712);
				match(K_UNSIGNED);
				setState(1713);
				match(K_INT32);
				setState(1714);
				match(T__8);
				setState(1715);
				int32();
				setState(1716);
				match(T__9);
				setState(1717);
				match(T__4);
				setState(1718);
				i32seq(0);
				setState(1719);
				match(T__5);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1721);
				match(K_UNSIGNED);
				setState(1722);
				match(K_INT16);
				setState(1723);
				match(T__8);
				setState(1724);
				int32();
				setState(1725);
				match(T__9);
				setState(1726);
				match(T__4);
				setState(1727);
				i16seq(0);
				setState(1728);
				match(T__5);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1730);
				match(K_UNSIGNED);
				setState(1731);
				match(K_INT8);
				setState(1732);
				match(T__8);
				setState(1733);
				int32();
				setState(1734);
				match(T__9);
				setState(1735);
				match(T__4);
				setState(1736);
				i8seq(0);
				setState(1737);
				match(T__5);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1739);
				match(K_CHAR);
				setState(1740);
				match(T__8);
				setState(1741);
				int32();
				setState(1742);
				match(T__9);
				setState(1743);
				match(T__4);
				setState(1744);
				i16seq(0);
				setState(1745);
				match(T__5);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1747);
				match(K_BOOL);
				setState(1748);
				match(T__8);
				setState(1749);
				int32();
				setState(1750);
				match(T__9);
				setState(1751);
				match(T__4);
				setState(1752);
				boolSeq(0);
				setState(1753);
				match(T__5);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1755);
				match(K_STRING);
				setState(1756);
				match(T__8);
				setState(1757);
				int32();
				setState(1758);
				match(T__9);
				setState(1759);
				match(T__4);
				setState(1760);
				sqstringSeq(0);
				setState(1761);
				match(T__5);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1763);
				match(K_TYPE);
				setState(1764);
				match(T__8);
				setState(1765);
				int32();
				setState(1766);
				match(T__9);
				setState(1767);
				match(T__4);
				setState(1768);
				classSeq(0);
				setState(1769);
				match(T__5);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1771);
				match(K_OBJECT);
				setState(1772);
				match(T__8);
				setState(1773);
				int32();
				setState(1774);
				match(T__9);
				setState(1775);
				match(T__4);
				setState(1776);
				objSeq(0);
				setState(1777);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F32seqContext extends ParserRuleContext {
		public F32seqContext f32seq() {
			return getRuleContext(F32seqContext.class,0);
		}
		public Float64Context float64() {
			return getRuleContext(Float64Context.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public F32seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f32seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterF32seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitF32seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitF32seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F32seqContext f32seq() throws RecognitionException {
		return f32seq(0);
	}

	private F32seqContext f32seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		F32seqContext _localctx = new F32seqContext(_ctx, _parentState);
		F32seqContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_f32seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1788);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1786);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						_localctx = new F32seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f32seq);
						setState(1782);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1783);
						float64();
						}
						break;
					case 2:
						{
						_localctx = new F32seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f32seq);
						setState(1784);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1785);
						int32();
						}
						break;
					}
					} 
				}
				setState(1790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class F64seqContext extends ParserRuleContext {
		public F64seqContext f64seq() {
			return getRuleContext(F64seqContext.class,0);
		}
		public Float64Context float64() {
			return getRuleContext(Float64Context.class,0);
		}
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public F64seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f64seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterF64seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitF64seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitF64seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F64seqContext f64seq() throws RecognitionException {
		return f64seq(0);
	}

	private F64seqContext f64seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		F64seqContext _localctx = new F64seqContext(_ctx, _parentState);
		F64seqContext _prevctx = _localctx;
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_f64seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1798);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1796);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						_localctx = new F64seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f64seq);
						setState(1792);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1793);
						float64();
						}
						break;
					case 2:
						{
						_localctx = new F64seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f64seq);
						setState(1794);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1795);
						int64();
						}
						break;
					}
					} 
				}
				setState(1800);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class I64seqContext extends ParserRuleContext {
		public I64seqContext i64seq() {
			return getRuleContext(I64seqContext.class,0);
		}
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public I64seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i64seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterI64seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitI64seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitI64seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final I64seqContext i64seq() throws RecognitionException {
		return i64seq(0);
	}

	private I64seqContext i64seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		I64seqContext _localctx = new I64seqContext(_ctx, _parentState);
		I64seqContext _prevctx = _localctx;
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_i64seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new I64seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_i64seq);
					setState(1802);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1803);
					int64();
					}
					} 
				}
				setState(1808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class I32seqContext extends ParserRuleContext {
		public I32seqContext i32seq() {
			return getRuleContext(I32seqContext.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public I32seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i32seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterI32seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitI32seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitI32seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final I32seqContext i32seq() throws RecognitionException {
		return i32seq(0);
	}

	private I32seqContext i32seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		I32seqContext _localctx = new I32seqContext(_ctx, _parentState);
		I32seqContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_i32seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new I32seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_i32seq);
					setState(1810);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1811);
					int32();
					}
					} 
				}
				setState(1816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class I16seqContext extends ParserRuleContext {
		public I16seqContext i16seq() {
			return getRuleContext(I16seqContext.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public I16seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i16seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterI16seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitI16seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitI16seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final I16seqContext i16seq() throws RecognitionException {
		return i16seq(0);
	}

	private I16seqContext i16seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		I16seqContext _localctx = new I16seqContext(_ctx, _parentState);
		I16seqContext _prevctx = _localctx;
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_i16seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new I16seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_i16seq);
					setState(1818);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1819);
					int32();
					}
					} 
				}
				setState(1824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class I8seqContext extends ParserRuleContext {
		public I8seqContext i8seq() {
			return getRuleContext(I8seqContext.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public I8seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i8seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterI8seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitI8seq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitI8seq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final I8seqContext i8seq() throws RecognitionException {
		return i8seq(0);
	}

	private I8seqContext i8seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		I8seqContext _localctx = new I8seqContext(_ctx, _parentState);
		I8seqContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_i8seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new I8seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_i8seq);
					setState(1826);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1827);
					int32();
					}
					} 
				}
				setState(1832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolSeqContext extends ParserRuleContext {
		public BoolSeqContext boolSeq() {
			return getRuleContext(BoolSeqContext.class,0);
		}
		public TruefalseContext truefalse() {
			return getRuleContext(TruefalseContext.class,0);
		}
		public BoolSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterBoolSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitBoolSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitBoolSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolSeqContext boolSeq() throws RecognitionException {
		return boolSeq(0);
	}

	private BoolSeqContext boolSeq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolSeqContext _localctx = new BoolSeqContext(_ctx, _parentState);
		BoolSeqContext _prevctx = _localctx;
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_boolSeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolSeqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolSeq);
					setState(1834);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1835);
					truefalse();
					}
					} 
				}
				setState(1840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SqstringSeqContext extends ParserRuleContext {
		public SqstringSeqContext sqstringSeq() {
			return getRuleContext(SqstringSeqContext.class,0);
		}
		public TerminalNode K_NULLREF() { return getToken(CilParser.K_NULLREF, 0); }
		public TerminalNode SQSTRING() { return getToken(CilParser.SQSTRING, 0); }
		public SqstringSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqstringSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSqstringSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSqstringSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSqstringSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqstringSeqContext sqstringSeq() throws RecognitionException {
		return sqstringSeq(0);
	}

	private SqstringSeqContext sqstringSeq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SqstringSeqContext _localctx = new SqstringSeqContext(_ctx, _parentState);
		SqstringSeqContext _prevctx = _localctx;
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_sqstringSeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1846);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
					case 1:
						{
						_localctx = new SqstringSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sqstringSeq);
						setState(1842);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1843);
						match(K_NULLREF);
						}
						break;
					case 2:
						{
						_localctx = new SqstringSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sqstringSeq);
						setState(1844);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1845);
						match(SQSTRING);
						}
						break;
					}
					} 
				}
				setState(1850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ClassSeqContext extends ParserRuleContext {
		public ClassSeqContext classSeq() {
			return getRuleContext(ClassSeqContext.class,0);
		}
		public TerminalNode K_NULLREF() { return getToken(CilParser.K_NULLREF, 0); }
		public TerminalNode K_CLASS() { return getToken(CilParser.K_CLASS, 0); }
		public TerminalNode SQSTRING() { return getToken(CilParser.SQSTRING, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClassSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClassSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClassSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSeqContext classSeq() throws RecognitionException {
		return classSeq(0);
	}

	private ClassSeqContext classSeq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassSeqContext _localctx = new ClassSeqContext(_ctx, _parentState);
		ClassSeqContext _prevctx = _localctx;
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_classSeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1859);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new ClassSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classSeq);
						setState(1852);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1853);
						match(K_NULLREF);
						}
						break;
					case 2:
						{
						_localctx = new ClassSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classSeq);
						setState(1854);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1855);
						match(K_CLASS);
						setState(1856);
						match(SQSTRING);
						}
						break;
					case 3:
						{
						_localctx = new ClassSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classSeq);
						setState(1857);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1858);
						className();
						}
						break;
					}
					} 
				}
				setState(1863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ObjSeqContext extends ParserRuleContext {
		public ObjSeqContext objSeq() {
			return getRuleContext(ObjSeqContext.class,0);
		}
		public SerInitContext serInit() {
			return getRuleContext(SerInitContext.class,0);
		}
		public ObjSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterObjSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitObjSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitObjSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjSeqContext objSeq() throws RecognitionException {
		return objSeq(0);
	}

	private ObjSeqContext objSeq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObjSeqContext _localctx = new ObjSeqContext(_ctx, _parentState);
		ObjSeqContext _prevctx = _localctx;
		int _startState = 220;
		enterRecursionRule(_localctx, 220, RULE_objSeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1869);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObjSeqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_objSeq);
					setState(1865);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1866);
					serInit();
					}
					} 
				}
				setState(1871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MethodSpecContext extends ParserRuleContext {
		public TerminalNode K_METHOD() { return getToken(CilParser.K_METHOD, 0); }
		public MethodSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethodSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethodSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethodSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSpecContext methodSpec() throws RecognitionException {
		MethodSpecContext _localctx = new MethodSpecContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_methodSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			match(K_METHOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_noneContext extends ParserRuleContext {
		public TerminalNode INSTR_NONE() { return getToken(CilParser.INSTR_NONE, 0); }
		public Instr_noneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_none; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_none(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_none(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_none(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_noneContext instr_none() throws RecognitionException {
		Instr_noneContext _localctx = new Instr_noneContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_instr_none);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1874);
			match(INSTR_NONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_varContext extends ParserRuleContext {
		public TerminalNode INSTR_VAR() { return getToken(CilParser.INSTR_VAR, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Instr_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_varContext instr_var() throws RecognitionException {
		Instr_varContext _localctx = new Instr_varContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_instr_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			match(INSTR_VAR);
			setState(1879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT64:
				{
				setState(1877);
				int32();
				}
				break;
			case SQSTRING:
			case ID:
				{
				setState(1878);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_iContext extends ParserRuleContext {
		public Int64Context arg;
		public TerminalNode INSTR_I() { return getToken(CilParser.INSTR_I, 0); }
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public Instr_iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_i(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_i(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_iContext instr_i() throws RecognitionException {
		Instr_iContext _localctx = new Instr_iContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_instr_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
			match(INSTR_I);
			setState(1882);
			((Instr_iContext)_localctx).arg = int64();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_i8Context extends ParserRuleContext {
		public Int64Context arg;
		public TerminalNode INSTR_I8() { return getToken(CilParser.INSTR_I8, 0); }
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public Instr_i8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_i8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_i8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_i8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_i8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_i8Context instr_i8() throws RecognitionException {
		Instr_i8Context _localctx = new Instr_i8Context(_ctx, getState());
		enterRule(_localctx, 230, RULE_instr_i8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			match(INSTR_I8);
			setState(1885);
			((Instr_i8Context)_localctx).arg = int64();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_rContext extends ParserRuleContext {
		public Float64Context f;
		public Int64Context i;
		public BytesContext b;
		public TerminalNode INSTR_R() { return getToken(CilParser.INSTR_R, 0); }
		public Float64Context float64() {
			return getRuleContext(Float64Context.class,0);
		}
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public Instr_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_r(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_r(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_rContext instr_r() throws RecognitionException {
		Instr_rContext _localctx = new Instr_rContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_instr_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			match(INSTR_R);
			setState(1894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FLOAT32:
			case K_FLOAT64:
			case FLOAT64:
				{
				setState(1888);
				((Instr_rContext)_localctx).f = float64();
				}
				break;
			case INT64:
				{
				setState(1889);
				((Instr_rContext)_localctx).i = int64();
				}
				break;
			case T__4:
				{
				setState(1890);
				match(T__4);
				setState(1891);
				((Instr_rContext)_localctx).b = bytes();
				setState(1892);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_brtargetContext extends ParserRuleContext {
		public TerminalNode INSTR_BRTARGET() { return getToken(CilParser.INSTR_BRTARGET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public Instr_brtargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_brtarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_brtarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_brtarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_brtarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_brtargetContext instr_brtarget() throws RecognitionException {
		Instr_brtargetContext _localctx = new Instr_brtargetContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_instr_brtarget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			match(INSTR_BRTARGET);
			setState(1899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQSTRING:
			case ID:
				{
				setState(1897);
				id();
				}
				break;
			case INT64:
				{
				setState(1898);
				int32();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_methodContext extends ParserRuleContext {
		public TerminalNode INSTR_METHOD() { return getToken(CilParser.INSTR_METHOD, 0); }
		public MethodRefContext methodRef() {
			return getRuleContext(MethodRefContext.class,0);
		}
		public Instr_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_methodContext instr_method() throws RecognitionException {
		Instr_methodContext _localctx = new Instr_methodContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_instr_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			match(INSTR_METHOD);
			setState(1902);
			methodRef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_fieldContext extends ParserRuleContext {
		public TerminalNode INSTR_FIELD() { return getToken(CilParser.INSTR_FIELD, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode DCOLON() { return getToken(CilParser.DCOLON, 0); }
		public Instr_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_fieldContext instr_field() throws RecognitionException {
		Instr_fieldContext _localctx = new Instr_fieldContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_instr_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			match(INSTR_FIELD);
			setState(1905);
			type(0);
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1906);
				typeSpec();
				setState(1907);
				match(DCOLON);
				}
				break;
			}
			setState(1911);
			dottedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_typeContext extends ParserRuleContext {
		public TerminalNode INSTR_TYPE() { return getToken(CilParser.INSTR_TYPE, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public Instr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_typeContext instr_type() throws RecognitionException {
		Instr_typeContext _localctx = new Instr_typeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_instr_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			match(INSTR_TYPE);
			setState(1914);
			typeSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_stringContext extends ParserRuleContext {
		public TerminalNode INSTR_STRING() { return getToken(CilParser.INSTR_STRING, 0); }
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public TerminalNode K_ANSI() { return getToken(CilParser.K_ANSI, 0); }
		public BytearrayheadContext bytearrayhead() {
			return getRuleContext(BytearrayheadContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public Instr_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_stringContext instr_string() throws RecognitionException {
		Instr_stringContext _localctx = new Instr_stringContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_instr_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
			match(INSTR_STRING);
			setState(1927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QSTRING:
				{
				setState(1917);
				compQstring(0);
				}
				break;
			case K_ANSI:
				{
				setState(1918);
				match(K_ANSI);
				setState(1919);
				match(T__4);
				setState(1920);
				compQstring(0);
				setState(1921);
				match(T__5);
				}
				break;
			case K_BYTEARRAY:
				{
				setState(1923);
				bytearrayhead();
				setState(1924);
				bytes();
				setState(1925);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_sigContext extends ParserRuleContext {
		public TerminalNode INSTR_SIG() { return getToken(CilParser.INSTR_SIG, 0); }
		public CallConvContext callConv() {
			return getRuleContext(CallConvContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SigArgs0Context sigArgs0() {
			return getRuleContext(SigArgs0Context.class,0);
		}
		public Instr_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_sig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_sig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_sig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_sig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_sigContext instr_sig() throws RecognitionException {
		Instr_sigContext _localctx = new Instr_sigContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_instr_sig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			match(INSTR_SIG);
			setState(1930);
			callConv();
			setState(1931);
			type(0);
			setState(1932);
			match(T__4);
			setState(1933);
			sigArgs0();
			setState(1934);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_tokContext extends ParserRuleContext {
		public TerminalNode INSTR_TOK() { return getToken(CilParser.INSTR_TOK, 0); }
		public OwnerTypeContext ownerType() {
			return getRuleContext(OwnerTypeContext.class,0);
		}
		public Instr_tokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_tok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_tok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_tok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_tok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_tokContext instr_tok() throws RecognitionException {
		Instr_tokContext _localctx = new Instr_tokContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_instr_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			match(INSTR_TOK);
			setState(1937);
			ownerType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instr_switchContext extends ParserRuleContext {
		public TerminalNode INSTR_SWITCH() { return getToken(CilParser.INSTR_SWITCH, 0); }
		public LabelsContext labels() {
			return getRuleContext(LabelsContext.class,0);
		}
		public Instr_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_switch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_switchContext instr_switch() throws RecognitionException {
		Instr_switchContext _localctx = new Instr_switchContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_instr_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
			match(INSTR_SWITCH);
			setState(1940);
			match(T__4);
			setState(1941);
			labels();
			setState(1942);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrContext extends ParserRuleContext {
		public Instr_noneContext instr_none() {
			return getRuleContext(Instr_noneContext.class,0);
		}
		public Instr_varContext instr_var() {
			return getRuleContext(Instr_varContext.class,0);
		}
		public Instr_iContext instr_i() {
			return getRuleContext(Instr_iContext.class,0);
		}
		public Instr_i8Context instr_i8() {
			return getRuleContext(Instr_i8Context.class,0);
		}
		public Instr_rContext instr_r() {
			return getRuleContext(Instr_rContext.class,0);
		}
		public Instr_brtargetContext instr_brtarget() {
			return getRuleContext(Instr_brtargetContext.class,0);
		}
		public Instr_methodContext instr_method() {
			return getRuleContext(Instr_methodContext.class,0);
		}
		public Instr_fieldContext instr_field() {
			return getRuleContext(Instr_fieldContext.class,0);
		}
		public Instr_typeContext instr_type() {
			return getRuleContext(Instr_typeContext.class,0);
		}
		public Instr_stringContext instr_string() {
			return getRuleContext(Instr_stringContext.class,0);
		}
		public Instr_sigContext instr_sig() {
			return getRuleContext(Instr_sigContext.class,0);
		}
		public Instr_tokContext instr_tok() {
			return getRuleContext(Instr_tokContext.class,0);
		}
		public Instr_switchContext instr_switch() {
			return getRuleContext(Instr_switchContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_instr);
		try {
			setState(1957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSTR_NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1944);
				instr_none();
				}
				break;
			case INSTR_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1945);
				instr_var();
				}
				break;
			case INSTR_I:
				enterOuterAlt(_localctx, 3);
				{
				setState(1946);
				instr_i();
				}
				break;
			case INSTR_I8:
				enterOuterAlt(_localctx, 4);
				{
				setState(1947);
				instr_i8();
				}
				break;
			case INSTR_R:
				enterOuterAlt(_localctx, 5);
				{
				setState(1948);
				instr_r();
				}
				break;
			case INSTR_BRTARGET:
				enterOuterAlt(_localctx, 6);
				{
				setState(1949);
				instr_brtarget();
				}
				break;
			case INSTR_METHOD:
				enterOuterAlt(_localctx, 7);
				{
				setState(1950);
				instr_method();
				}
				break;
			case INSTR_FIELD:
				enterOuterAlt(_localctx, 8);
				{
				setState(1951);
				instr_field();
				}
				break;
			case INSTR_TYPE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1952);
				instr_type();
				}
				break;
			case INSTR_STRING:
				enterOuterAlt(_localctx, 10);
				{
				setState(1953);
				instr_string();
				}
				break;
			case INSTR_SIG:
				enterOuterAlt(_localctx, 11);
				{
				setState(1954);
				instr_sig();
				}
				break;
			case INSTR_TOK:
				enterOuterAlt(_localctx, 12);
				{
				setState(1955);
				instr_tok();
				}
				break;
			case INSTR_SWITCH:
				enterOuterAlt(_localctx, 13);
				{
				setState(1956);
				instr_switch();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelsContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LabelsContext labels() {
			return getRuleContext(LabelsContext.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public LabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelsContext labels() throws RecognitionException {
		LabelsContext _localctx = new LabelsContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_labels);
		try {
			setState(1970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1960);
				id();
				setState(1961);
				match(T__3);
				setState(1962);
				labels();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1964);
				int32();
				setState(1965);
				match(T__3);
				setState(1966);
				labels();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1968);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1969);
				int32();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyArgs0Context extends ParserRuleContext {
		public TyArgs1Context tyArgs1() {
			return getRuleContext(TyArgs1Context.class,0);
		}
		public TyArgs0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyArgs0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTyArgs0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTyArgs0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTyArgs0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyArgs0Context tyArgs0() throws RecognitionException {
		TyArgs0Context _localctx = new TyArgs0Context(_ctx, getState());
		enterRule(_localctx, 254, RULE_tyArgs0);
		try {
			setState(1977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(1973);
				match(T__10);
				setState(1974);
				tyArgs1();
				setState(1975);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyArgs1Context extends ParserRuleContext {
		public TyArgs2Context tyArgs2() {
			return getRuleContext(TyArgs2Context.class,0);
		}
		public TyArgs1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyArgs1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTyArgs1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTyArgs1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTyArgs1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyArgs1Context tyArgs1() throws RecognitionException {
		TyArgs1Context _localctx = new TyArgs1Context(_ctx, getState());
		enterRule(_localctx, 256, RULE_tyArgs1);
		try {
			setState(1981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__17:
			case ELIPSIS:
			case K_VOID:
			case K_BOOL:
			case K_CHAR:
			case K_UNSIGNED:
			case K_INT8:
			case K_INT16:
			case K_INT32:
			case K_INT64:
			case K_FLOAT32:
			case K_FLOAT64:
			case K_UINT8:
			case K_UINT16:
			case K_UINT32:
			case K_UINT64:
			case K_OBJECT:
			case K_STRING:
			case K_CLASS:
			case K_TYPEDREF:
			case K_VALUE:
			case K_VALUETYPE:
			case K_NATIVE:
			case K_METHOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1980);
				tyArgs2(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyArgs2Context extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TyArgs2Context tyArgs2() {
			return getRuleContext(TyArgs2Context.class,0);
		}
		public TyArgs2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyArgs2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTyArgs2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTyArgs2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTyArgs2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyArgs2Context tyArgs2() throws RecognitionException {
		return tyArgs2(0);
	}

	private TyArgs2Context tyArgs2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TyArgs2Context _localctx = new TyArgs2Context(_ctx, _parentState);
		TyArgs2Context _prevctx = _localctx;
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_tyArgs2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1984);
			type(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1991);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TyArgs2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tyArgs2);
					setState(1986);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1987);
					match(T__3);
					setState(1988);
					type(0);
					}
					} 
				}
				setState(1993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SigArgs0Context extends ParserRuleContext {
		public SigArgs1Context sigArgs1() {
			return getRuleContext(SigArgs1Context.class,0);
		}
		public SigArgs0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sigArgs0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSigArgs0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSigArgs0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSigArgs0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SigArgs0Context sigArgs0() throws RecognitionException {
		SigArgs0Context _localctx = new SigArgs0Context(_ctx, getState());
		enterRule(_localctx, 260, RULE_sigArgs0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << ELIPSIS) | (1L << K_VOID) | (1L << K_BOOL) | (1L << K_CHAR) | (1L << K_UNSIGNED) | (1L << K_INT8) | (1L << K_INT16) | (1L << K_INT32) | (1L << K_INT64) | (1L << K_FLOAT32) | (1L << K_FLOAT64) | (1L << K_UINT8) | (1L << K_UINT16) | (1L << K_UINT32) | (1L << K_UINT64) | (1L << K_OBJECT) | (1L << K_STRING) | (1L << K_CLASS) | (1L << K_TYPEDREF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (K_VALUE - 67)) | (1L << (K_VALUETYPE - 67)) | (1L << (K_NATIVE - 67)) | (1L << (K_METHOD - 67)))) != 0)) {
				{
				setState(1994);
				sigArgs1();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SigArgs1Context extends ParserRuleContext {
		public List<SigArgContext> sigArg() {
			return getRuleContexts(SigArgContext.class);
		}
		public SigArgContext sigArg(int i) {
			return getRuleContext(SigArgContext.class,i);
		}
		public SigArgs1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sigArgs1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSigArgs1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSigArgs1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSigArgs1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SigArgs1Context sigArgs1() throws RecognitionException {
		SigArgs1Context _localctx = new SigArgs1Context(_ctx, getState());
		enterRule(_localctx, 262, RULE_sigArgs1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			sigArg();
			setState(2002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1998);
					match(T__3);
					setState(1999);
					sigArg();
					}
					} 
				}
				setState(2004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SigArgContext extends ParserRuleContext {
		public TerminalNode ELIPSIS() { return getToken(CilParser.ELIPSIS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MarshalClauseContext marshalClause() {
			return getRuleContext(MarshalClauseContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SigArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sigArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSigArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSigArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSigArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SigArgContext sigArg() throws RecognitionException {
		SigArgContext _localctx = new SigArgContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_sigArg);
		try {
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2005);
				match(ELIPSIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2006);
				type(0);
				setState(2007);
				marshalClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2009);
				type(0);
				setState(2010);
				marshalClause();
				setState(2011);
				id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public SlashedNameContext slashedName() {
			return getRuleContext(SlashedNameContext.class,0);
		}
		public MdtokenContext mdtoken() {
			return getRuleContext(MdtokenContext.class,0);
		}
		public TerminalNode D_MODULE() { return getToken(CilParser.D_MODULE, 0); }
		public TerminalNode D_THIS() { return getToken(CilParser.D_THIS, 0); }
		public TerminalNode D_BASE() { return getToken(CilParser.D_BASE, 0); }
		public TerminalNode D_NESTER() { return getToken(CilParser.D_NESTER, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_className);
		try {
			setState(2040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2015);
				match(T__8);
				setState(2016);
				dottedName();
				setState(2017);
				match(T__9);
				setState(2018);
				slashedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2020);
				match(T__8);
				setState(2021);
				mdtoken();
				setState(2022);
				match(T__9);
				setState(2023);
				slashedName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2025);
				match(T__8);
				setState(2026);
				match(T__14);
				setState(2027);
				match(T__9);
				setState(2028);
				slashedName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2029);
				match(T__8);
				setState(2030);
				match(D_MODULE);
				setState(2031);
				dottedName();
				setState(2032);
				match(T__9);
				setState(2033);
				slashedName();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2035);
				slashedName();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2036);
				mdtoken();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2037);
				match(D_THIS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2038);
				match(D_BASE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2039);
				match(D_NESTER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlashedNameContext extends ParserRuleContext {
		public List<DottedNameContext> dottedName() {
			return getRuleContexts(DottedNameContext.class);
		}
		public DottedNameContext dottedName(int i) {
			return getRuleContext(DottedNameContext.class,i);
		}
		public SlashedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slashedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSlashedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSlashedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSlashedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlashedNameContext slashedName() throws RecognitionException {
		SlashedNameContext _localctx = new SlashedNameContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_slashedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			dottedName();
			setState(2047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2043);
					match(T__16);
					setState(2044);
					dottedName();
					}
					} 
				}
				setState(2049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode D_MODULE() { return getToken(CilParser.D_MODULE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_typeSpec);
		try {
			setState(2061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2050);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2051);
				match(T__8);
				setState(2052);
				dottedName();
				setState(2053);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2055);
				match(T__8);
				setState(2056);
				match(D_MODULE);
				setState(2057);
				dottedName();
				setState(2058);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2060);
				type(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NativeTypeContext extends ParserRuleContext {
		public TerminalNode K_CUSTOM() { return getToken(CilParser.K_CUSTOM, 0); }
		public List<CompQstringContext> compQstring() {
			return getRuleContexts(CompQstringContext.class);
		}
		public CompQstringContext compQstring(int i) {
			return getRuleContext(CompQstringContext.class,i);
		}
		public TerminalNode K_FIXED() { return getToken(CilParser.K_FIXED, 0); }
		public TerminalNode K_SYSSTRING() { return getToken(CilParser.K_SYSSTRING, 0); }
		public List<Int32Context> int32() {
			return getRuleContexts(Int32Context.class);
		}
		public Int32Context int32(int i) {
			return getRuleContext(Int32Context.class,i);
		}
		public TerminalNode K_ARRAY() { return getToken(CilParser.K_ARRAY, 0); }
		public NativeTypeContext nativeType() {
			return getRuleContext(NativeTypeContext.class,0);
		}
		public TerminalNode K_VARIANT() { return getToken(CilParser.K_VARIANT, 0); }
		public TerminalNode K_CURRENCY() { return getToken(CilParser.K_CURRENCY, 0); }
		public TerminalNode K_SYSCHAR() { return getToken(CilParser.K_SYSCHAR, 0); }
		public TerminalNode K_VOID() { return getToken(CilParser.K_VOID, 0); }
		public TerminalNode K_BOOL() { return getToken(CilParser.K_BOOL, 0); }
		public TerminalNode K_INT8() { return getToken(CilParser.K_INT8, 0); }
		public TerminalNode K_INT16() { return getToken(CilParser.K_INT16, 0); }
		public TerminalNode K_INT32() { return getToken(CilParser.K_INT32, 0); }
		public TerminalNode K_INT64() { return getToken(CilParser.K_INT64, 0); }
		public TerminalNode K_FLOAT32() { return getToken(CilParser.K_FLOAT32, 0); }
		public TerminalNode K_FLOAT64() { return getToken(CilParser.K_FLOAT64, 0); }
		public TerminalNode K_ERROR() { return getToken(CilParser.K_ERROR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(CilParser.K_UNSIGNED, 0); }
		public TerminalNode K_UINT8() { return getToken(CilParser.K_UINT8, 0); }
		public TerminalNode K_UINT16() { return getToken(CilParser.K_UINT16, 0); }
		public TerminalNode K_UINT32() { return getToken(CilParser.K_UINT32, 0); }
		public TerminalNode K_UINT64() { return getToken(CilParser.K_UINT64, 0); }
		public TerminalNode K_DECIMAL() { return getToken(CilParser.K_DECIMAL, 0); }
		public TerminalNode K_DATE() { return getToken(CilParser.K_DATE, 0); }
		public TerminalNode K_BSTR() { return getToken(CilParser.K_BSTR, 0); }
		public TerminalNode K_LPSTR() { return getToken(CilParser.K_LPSTR, 0); }
		public TerminalNode K_LPWSTR() { return getToken(CilParser.K_LPWSTR, 0); }
		public TerminalNode K_LPTSTR() { return getToken(CilParser.K_LPTSTR, 0); }
		public TerminalNode K_OBJECTREF() { return getToken(CilParser.K_OBJECTREF, 0); }
		public TerminalNode K_IUNKNOWN() { return getToken(CilParser.K_IUNKNOWN, 0); }
		public IidParamIndexContext iidParamIndex() {
			return getRuleContext(IidParamIndexContext.class,0);
		}
		public TerminalNode K_IDISPATCH() { return getToken(CilParser.K_IDISPATCH, 0); }
		public TerminalNode K_STRUCT() { return getToken(CilParser.K_STRUCT, 0); }
		public TerminalNode K_INTERFACE() { return getToken(CilParser.K_INTERFACE, 0); }
		public TerminalNode K_SAFEARRAY() { return getToken(CilParser.K_SAFEARRAY, 0); }
		public VariantTypeContext variantType() {
			return getRuleContext(VariantTypeContext.class,0);
		}
		public TerminalNode K_INT() { return getToken(CilParser.K_INT, 0); }
		public TerminalNode K_UINT() { return getToken(CilParser.K_UINT, 0); }
		public TerminalNode K_NESTED() { return getToken(CilParser.K_NESTED, 0); }
		public TerminalNode K_BYVALSTR() { return getToken(CilParser.K_BYVALSTR, 0); }
		public TerminalNode K_ANSI() { return getToken(CilParser.K_ANSI, 0); }
		public TerminalNode K_TBSTR() { return getToken(CilParser.K_TBSTR, 0); }
		public TerminalNode K_METHOD() { return getToken(CilParser.K_METHOD, 0); }
		public TerminalNode K_AS() { return getToken(CilParser.K_AS, 0); }
		public TerminalNode K_ANY() { return getToken(CilParser.K_ANY, 0); }
		public TerminalNode K_LPSTRUCT() { return getToken(CilParser.K_LPSTRUCT, 0); }
		public NativeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterNativeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitNativeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitNativeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeTypeContext nativeType() throws RecognitionException {
		return nativeType(0);
	}

	private NativeTypeContext nativeType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NativeTypeContext _localctx = new NativeTypeContext(_ctx, _parentState);
		NativeTypeContext _prevctx = _localctx;
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_nativeType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(2064);
				match(K_CUSTOM);
				setState(2065);
				match(T__4);
				setState(2066);
				compQstring(0);
				setState(2067);
				match(T__3);
				setState(2068);
				compQstring(0);
				setState(2069);
				match(T__3);
				setState(2070);
				compQstring(0);
				setState(2071);
				match(T__3);
				setState(2072);
				compQstring(0);
				setState(2073);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(2075);
				match(K_CUSTOM);
				setState(2076);
				match(T__4);
				setState(2077);
				compQstring(0);
				setState(2078);
				match(T__3);
				setState(2079);
				compQstring(0);
				setState(2080);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(2082);
				match(K_FIXED);
				setState(2083);
				match(K_SYSSTRING);
				setState(2084);
				match(T__8);
				setState(2085);
				int32();
				setState(2086);
				match(T__9);
				}
				break;
			case 5:
				{
				setState(2088);
				match(K_FIXED);
				setState(2089);
				match(K_ARRAY);
				setState(2090);
				match(T__8);
				setState(2091);
				int32();
				setState(2092);
				match(T__9);
				setState(2093);
				nativeType(50);
				}
				break;
			case 6:
				{
				setState(2095);
				match(K_VARIANT);
				}
				break;
			case 7:
				{
				setState(2096);
				match(K_CURRENCY);
				}
				break;
			case 8:
				{
				setState(2097);
				match(K_SYSCHAR);
				}
				break;
			case 9:
				{
				setState(2098);
				match(K_VOID);
				}
				break;
			case 10:
				{
				setState(2099);
				match(K_BOOL);
				}
				break;
			case 11:
				{
				setState(2100);
				match(K_INT8);
				}
				break;
			case 12:
				{
				setState(2101);
				match(K_INT16);
				}
				break;
			case 13:
				{
				setState(2102);
				match(K_INT32);
				}
				break;
			case 14:
				{
				setState(2103);
				match(K_INT64);
				}
				break;
			case 15:
				{
				setState(2104);
				match(K_FLOAT32);
				}
				break;
			case 16:
				{
				setState(2105);
				match(K_FLOAT64);
				}
				break;
			case 17:
				{
				setState(2106);
				match(K_ERROR);
				}
				break;
			case 18:
				{
				setState(2107);
				match(K_UNSIGNED);
				setState(2108);
				match(K_INT8);
				}
				break;
			case 19:
				{
				setState(2109);
				match(K_UNSIGNED);
				setState(2110);
				match(K_INT16);
				}
				break;
			case 20:
				{
				setState(2111);
				match(K_UNSIGNED);
				setState(2112);
				match(K_INT32);
				}
				break;
			case 21:
				{
				setState(2113);
				match(K_UNSIGNED);
				setState(2114);
				match(K_INT64);
				}
				break;
			case 22:
				{
				setState(2115);
				match(K_UINT8);
				}
				break;
			case 23:
				{
				setState(2116);
				match(K_UINT16);
				}
				break;
			case 24:
				{
				setState(2117);
				match(K_UINT32);
				}
				break;
			case 25:
				{
				setState(2118);
				match(K_UINT64);
				}
				break;
			case 26:
				{
				setState(2119);
				match(K_DECIMAL);
				}
				break;
			case 27:
				{
				setState(2120);
				match(K_DATE);
				}
				break;
			case 28:
				{
				setState(2121);
				match(K_BSTR);
				}
				break;
			case 29:
				{
				setState(2122);
				match(K_LPSTR);
				}
				break;
			case 30:
				{
				setState(2123);
				match(K_LPWSTR);
				}
				break;
			case 31:
				{
				setState(2124);
				match(K_LPTSTR);
				}
				break;
			case 32:
				{
				setState(2125);
				match(K_OBJECTREF);
				}
				break;
			case 33:
				{
				setState(2126);
				match(K_IUNKNOWN);
				setState(2127);
				iidParamIndex();
				}
				break;
			case 34:
				{
				setState(2128);
				match(K_IDISPATCH);
				setState(2129);
				iidParamIndex();
				}
				break;
			case 35:
				{
				setState(2130);
				match(K_STRUCT);
				}
				break;
			case 36:
				{
				setState(2131);
				match(K_INTERFACE);
				setState(2132);
				iidParamIndex();
				}
				break;
			case 37:
				{
				setState(2133);
				match(K_SAFEARRAY);
				setState(2134);
				variantType(0);
				}
				break;
			case 38:
				{
				setState(2135);
				match(K_SAFEARRAY);
				setState(2136);
				variantType(0);
				setState(2137);
				match(T__3);
				setState(2138);
				compQstring(0);
				}
				break;
			case 39:
				{
				setState(2140);
				match(K_INT);
				}
				break;
			case 40:
				{
				setState(2141);
				match(K_UNSIGNED);
				setState(2142);
				match(K_INT);
				}
				break;
			case 41:
				{
				setState(2143);
				match(K_UINT);
				}
				break;
			case 42:
				{
				setState(2144);
				match(K_NESTED);
				setState(2145);
				match(K_STRUCT);
				}
				break;
			case 43:
				{
				setState(2146);
				match(K_BYVALSTR);
				}
				break;
			case 44:
				{
				setState(2147);
				match(K_ANSI);
				setState(2148);
				match(K_BSTR);
				}
				break;
			case 45:
				{
				setState(2149);
				match(K_TBSTR);
				}
				break;
			case 46:
				{
				setState(2150);
				match(K_VARIANT);
				setState(2151);
				match(K_BOOL);
				}
				break;
			case 47:
				{
				setState(2152);
				match(K_METHOD);
				}
				break;
			case 48:
				{
				setState(2153);
				match(K_AS);
				setState(2154);
				match(K_ANY);
				}
				break;
			case 49:
				{
				setState(2155);
				match(K_LPSTRUCT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2158);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(2159);
						match(T__14);
						}
						break;
					case 2:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2160);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(2161);
						match(T__8);
						setState(2162);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2163);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(2164);
						match(T__8);
						setState(2165);
						int32();
						setState(2166);
						match(T__9);
						}
						break;
					case 4:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2168);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(2169);
						match(T__8);
						setState(2170);
						int32();
						setState(2171);
						match(T__2);
						setState(2172);
						int32();
						setState(2173);
						match(T__9);
						}
						break;
					case 5:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2175);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(2176);
						match(T__8);
						setState(2177);
						match(T__2);
						setState(2178);
						int32();
						setState(2179);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(2185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IidParamIndexContext extends ParserRuleContext {
		public TerminalNode K_IIDPARAM() { return getToken(CilParser.K_IIDPARAM, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public IidParamIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iidParamIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterIidParamIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitIidParamIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitIidParamIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IidParamIndexContext iidParamIndex() throws RecognitionException {
		IidParamIndexContext _localctx = new IidParamIndexContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_iidParamIndex);
		try {
			setState(2193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187);
				match(T__4);
				setState(2188);
				match(K_IIDPARAM);
				setState(2189);
				match(T__7);
				setState(2190);
				int32();
				setState(2191);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantTypeContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(CilParser.K_NULL, 0); }
		public TerminalNode K_VARIANT() { return getToken(CilParser.K_VARIANT, 0); }
		public TerminalNode K_CURRENCY() { return getToken(CilParser.K_CURRENCY, 0); }
		public TerminalNode K_VOID() { return getToken(CilParser.K_VOID, 0); }
		public TerminalNode K_BOOL() { return getToken(CilParser.K_BOOL, 0); }
		public TerminalNode K_INT8() { return getToken(CilParser.K_INT8, 0); }
		public TerminalNode K_INT16() { return getToken(CilParser.K_INT16, 0); }
		public TerminalNode K_INT32() { return getToken(CilParser.K_INT32, 0); }
		public TerminalNode K_INT64() { return getToken(CilParser.K_INT64, 0); }
		public TerminalNode K_FLOAT32() { return getToken(CilParser.K_FLOAT32, 0); }
		public TerminalNode K_FLOAT64() { return getToken(CilParser.K_FLOAT64, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(CilParser.K_UNSIGNED, 0); }
		public TerminalNode K_UINT8() { return getToken(CilParser.K_UINT8, 0); }
		public TerminalNode K_UINT16() { return getToken(CilParser.K_UINT16, 0); }
		public TerminalNode K_UINT32() { return getToken(CilParser.K_UINT32, 0); }
		public TerminalNode K_UINT64() { return getToken(CilParser.K_UINT64, 0); }
		public TerminalNode K_DECIMAL() { return getToken(CilParser.K_DECIMAL, 0); }
		public TerminalNode K_DATE() { return getToken(CilParser.K_DATE, 0); }
		public TerminalNode K_BSTR() { return getToken(CilParser.K_BSTR, 0); }
		public TerminalNode K_LPSTR() { return getToken(CilParser.K_LPSTR, 0); }
		public TerminalNode K_LPWSTR() { return getToken(CilParser.K_LPWSTR, 0); }
		public TerminalNode K_IUNKNOWN() { return getToken(CilParser.K_IUNKNOWN, 0); }
		public TerminalNode K_IDISPATCH() { return getToken(CilParser.K_IDISPATCH, 0); }
		public TerminalNode K_SAFEARRAY() { return getToken(CilParser.K_SAFEARRAY, 0); }
		public TerminalNode K_INT() { return getToken(CilParser.K_INT, 0); }
		public TerminalNode K_UINT() { return getToken(CilParser.K_UINT, 0); }
		public TerminalNode K_ERROR() { return getToken(CilParser.K_ERROR, 0); }
		public TerminalNode K_HRESULT() { return getToken(CilParser.K_HRESULT, 0); }
		public TerminalNode K_CARRAY() { return getToken(CilParser.K_CARRAY, 0); }
		public TerminalNode K_USERDEFINED() { return getToken(CilParser.K_USERDEFINED, 0); }
		public TerminalNode K_RECORD() { return getToken(CilParser.K_RECORD, 0); }
		public TerminalNode K_FILETIME() { return getToken(CilParser.K_FILETIME, 0); }
		public TerminalNode K_BLOB() { return getToken(CilParser.K_BLOB, 0); }
		public TerminalNode K_STREAM() { return getToken(CilParser.K_STREAM, 0); }
		public TerminalNode K_STORAGE() { return getToken(CilParser.K_STORAGE, 0); }
		public TerminalNode K_STREAMED_OBJECT() { return getToken(CilParser.K_STREAMED_OBJECT, 0); }
		public TerminalNode K_STORED_OBJECT() { return getToken(CilParser.K_STORED_OBJECT, 0); }
		public TerminalNode K_BLOB_OBJECT() { return getToken(CilParser.K_BLOB_OBJECT, 0); }
		public TerminalNode K_CF() { return getToken(CilParser.K_CF, 0); }
		public TerminalNode K_CLSID() { return getToken(CilParser.K_CLSID, 0); }
		public VariantTypeContext variantType() {
			return getRuleContext(VariantTypeContext.class,0);
		}
		public TerminalNode K_VECTOR() { return getToken(CilParser.K_VECTOR, 0); }
		public VariantTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterVariantType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitVariantType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitVariantType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantTypeContext variantType() throws RecognitionException {
		return variantType(0);
	}

	private VariantTypeContext variantType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariantTypeContext _localctx = new VariantTypeContext(_ctx, _parentState);
		VariantTypeContext _prevctx = _localctx;
		int _startState = 276;
		enterRecursionRule(_localctx, 276, RULE_variantType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(2196);
				match(K_NULL);
				}
				break;
			case 3:
				{
				setState(2197);
				match(K_VARIANT);
				}
				break;
			case 4:
				{
				setState(2198);
				match(K_CURRENCY);
				}
				break;
			case 5:
				{
				setState(2199);
				match(K_VOID);
				}
				break;
			case 6:
				{
				setState(2200);
				match(K_BOOL);
				}
				break;
			case 7:
				{
				setState(2201);
				match(K_INT8);
				}
				break;
			case 8:
				{
				setState(2202);
				match(K_INT16);
				}
				break;
			case 9:
				{
				setState(2203);
				match(K_INT32);
				}
				break;
			case 10:
				{
				setState(2204);
				match(K_INT64);
				}
				break;
			case 11:
				{
				setState(2205);
				match(K_FLOAT32);
				}
				break;
			case 12:
				{
				setState(2206);
				match(K_FLOAT64);
				}
				break;
			case 13:
				{
				setState(2207);
				match(K_UNSIGNED);
				setState(2208);
				match(K_INT8);
				}
				break;
			case 14:
				{
				setState(2209);
				match(K_UNSIGNED);
				setState(2210);
				match(K_INT16);
				}
				break;
			case 15:
				{
				setState(2211);
				match(K_UNSIGNED);
				setState(2212);
				match(K_INT32);
				}
				break;
			case 16:
				{
				setState(2213);
				match(K_UNSIGNED);
				setState(2214);
				match(K_INT64);
				}
				break;
			case 17:
				{
				setState(2215);
				match(K_UINT8);
				}
				break;
			case 18:
				{
				setState(2216);
				match(K_UINT16);
				}
				break;
			case 19:
				{
				setState(2217);
				match(K_UINT32);
				}
				break;
			case 20:
				{
				setState(2218);
				match(K_UINT64);
				}
				break;
			case 21:
				{
				setState(2219);
				match(T__14);
				}
				break;
			case 22:
				{
				setState(2220);
				match(K_DECIMAL);
				}
				break;
			case 23:
				{
				setState(2221);
				match(K_DATE);
				}
				break;
			case 24:
				{
				setState(2222);
				match(K_BSTR);
				}
				break;
			case 25:
				{
				setState(2223);
				match(K_LPSTR);
				}
				break;
			case 26:
				{
				setState(2224);
				match(K_LPWSTR);
				}
				break;
			case 27:
				{
				setState(2225);
				match(K_IUNKNOWN);
				}
				break;
			case 28:
				{
				setState(2226);
				match(K_IDISPATCH);
				}
				break;
			case 29:
				{
				setState(2227);
				match(K_SAFEARRAY);
				}
				break;
			case 30:
				{
				setState(2228);
				match(K_INT);
				}
				break;
			case 31:
				{
				setState(2229);
				match(K_UNSIGNED);
				setState(2230);
				match(K_INT);
				}
				break;
			case 32:
				{
				setState(2231);
				match(K_UINT);
				}
				break;
			case 33:
				{
				setState(2232);
				match(K_ERROR);
				}
				break;
			case 34:
				{
				setState(2233);
				match(K_HRESULT);
				}
				break;
			case 35:
				{
				setState(2234);
				match(K_CARRAY);
				}
				break;
			case 36:
				{
				setState(2235);
				match(K_USERDEFINED);
				}
				break;
			case 37:
				{
				setState(2236);
				match(K_RECORD);
				}
				break;
			case 38:
				{
				setState(2237);
				match(K_FILETIME);
				}
				break;
			case 39:
				{
				setState(2238);
				match(K_BLOB);
				}
				break;
			case 40:
				{
				setState(2239);
				match(K_STREAM);
				}
				break;
			case 41:
				{
				setState(2240);
				match(K_STORAGE);
				}
				break;
			case 42:
				{
				setState(2241);
				match(K_STREAMED_OBJECT);
				}
				break;
			case 43:
				{
				setState(2242);
				match(K_STORED_OBJECT);
				}
				break;
			case 44:
				{
				setState(2243);
				match(K_BLOB_OBJECT);
				}
				break;
			case 45:
				{
				setState(2244);
				match(K_CF);
				}
				break;
			case 46:
				{
				setState(2245);
				match(K_CLSID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
					case 1:
						{
						_localctx = new VariantTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variantType);
						setState(2248);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(2249);
						match(T__8);
						setState(2250);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new VariantTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variantType);
						setState(2251);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(2252);
						match(K_VECTOR);
						}
						break;
					case 3:
						{
						_localctx = new VariantTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variantType);
						setState(2253);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(2254);
						match(T__15);
						}
						break;
					}
					} 
				}
				setState(2259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode K_CLASS() { return getToken(CilParser.K_CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode K_OBJECT() { return getToken(CilParser.K_OBJECT, 0); }
		public TerminalNode K_VALUE() { return getToken(CilParser.K_VALUE, 0); }
		public TerminalNode K_VALUETYPE() { return getToken(CilParser.K_VALUETYPE, 0); }
		public MethodSpecContext methodSpec() {
			return getRuleContext(MethodSpecContext.class,0);
		}
		public CallConvContext callConv() {
			return getRuleContext(CallConvContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SigArgs0Context sigArgs0() {
			return getRuleContext(SigArgs0Context.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode K_TYPEDREF() { return getToken(CilParser.K_TYPEDREF, 0); }
		public TerminalNode K_VOID() { return getToken(CilParser.K_VOID, 0); }
		public TerminalNode K_NATIVE() { return getToken(CilParser.K_NATIVE, 0); }
		public TerminalNode K_INT() { return getToken(CilParser.K_INT, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(CilParser.K_UNSIGNED, 0); }
		public TerminalNode K_UINT() { return getToken(CilParser.K_UINT, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode ELIPSIS() { return getToken(CilParser.ELIPSIS, 0); }
		public Bounds1Context bounds1() {
			return getRuleContext(Bounds1Context.class,0);
		}
		public TerminalNode K_PINNED() { return getToken(CilParser.K_PINNED, 0); }
		public TerminalNode K_MODREQ() { return getToken(CilParser.K_MODREQ, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode K_MODOPT() { return getToken(CilParser.K_MODOPT, 0); }
		public TyArgs1Context tyArgs1() {
			return getRuleContext(TyArgs1Context.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(2261);
				match(K_CLASS);
				setState(2262);
				className();
				}
				break;
			case 2:
				{
				setState(2263);
				match(K_OBJECT);
				}
				break;
			case 3:
				{
				setState(2264);
				match(K_VALUE);
				setState(2265);
				match(K_CLASS);
				setState(2266);
				className();
				}
				break;
			case 4:
				{
				setState(2267);
				match(K_VALUETYPE);
				setState(2268);
				className();
				}
				break;
			case 5:
				{
				setState(2269);
				methodSpec();
				setState(2270);
				callConv();
				setState(2271);
				type(0);
				setState(2272);
				match(T__14);
				setState(2273);
				match(T__4);
				setState(2274);
				sigArgs0();
				setState(2275);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(2277);
				match(T__17);
				setState(2278);
				match(T__17);
				setState(2279);
				int32();
				}
				break;
			case 7:
				{
				setState(2280);
				match(T__17);
				setState(2281);
				int32();
				}
				break;
			case 8:
				{
				setState(2282);
				match(T__17);
				setState(2283);
				match(T__17);
				setState(2284);
				dottedName();
				}
				break;
			case 9:
				{
				setState(2285);
				match(T__17);
				setState(2286);
				dottedName();
				}
				break;
			case 10:
				{
				setState(2287);
				match(K_TYPEDREF);
				}
				break;
			case 11:
				{
				setState(2288);
				match(K_VOID);
				}
				break;
			case 12:
				{
				setState(2289);
				match(K_NATIVE);
				setState(2290);
				match(K_INT);
				}
				break;
			case 13:
				{
				setState(2291);
				match(K_NATIVE);
				setState(2292);
				match(K_UNSIGNED);
				setState(2293);
				match(K_INT);
				}
				break;
			case 14:
				{
				setState(2294);
				match(K_NATIVE);
				setState(2295);
				match(K_UINT);
				}
				break;
			case 15:
				{
				setState(2296);
				simpleType();
				}
				break;
			case 16:
				{
				setState(2297);
				match(ELIPSIS);
				setState(2298);
				type(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2332);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2301);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(2302);
						match(T__8);
						setState(2303);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2304);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2305);
						match(T__8);
						setState(2306);
						bounds1(0);
						setState(2307);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2309);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(2310);
						match(T__15);
						}
						break;
					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2311);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2312);
						match(T__14);
						}
						break;
					case 5:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2313);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2314);
						match(K_PINNED);
						}
						break;
					case 6:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2315);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2316);
						match(K_MODREQ);
						setState(2317);
						match(T__4);
						setState(2318);
						typeSpec();
						setState(2319);
						match(T__5);
						}
						break;
					case 7:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2321);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2322);
						match(K_MODOPT);
						setState(2323);
						match(T__4);
						setState(2324);
						typeSpec();
						setState(2325);
						match(T__5);
						}
						break;
					case 8:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2327);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2328);
						match(T__10);
						setState(2329);
						tyArgs1();
						setState(2330);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(2336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public TerminalNode K_CHAR() { return getToken(CilParser.K_CHAR, 0); }
		public TerminalNode K_STRING() { return getToken(CilParser.K_STRING, 0); }
		public TerminalNode K_BOOL() { return getToken(CilParser.K_BOOL, 0); }
		public TerminalNode K_INT8() { return getToken(CilParser.K_INT8, 0); }
		public TerminalNode K_INT16() { return getToken(CilParser.K_INT16, 0); }
		public TerminalNode K_INT32() { return getToken(CilParser.K_INT32, 0); }
		public TerminalNode K_INT64() { return getToken(CilParser.K_INT64, 0); }
		public TerminalNode K_FLOAT32() { return getToken(CilParser.K_FLOAT32, 0); }
		public TerminalNode K_FLOAT64() { return getToken(CilParser.K_FLOAT64, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(CilParser.K_UNSIGNED, 0); }
		public TerminalNode K_UINT8() { return getToken(CilParser.K_UINT8, 0); }
		public TerminalNode K_UINT16() { return getToken(CilParser.K_UINT16, 0); }
		public TerminalNode K_UINT32() { return getToken(CilParser.K_UINT32, 0); }
		public TerminalNode K_UINT64() { return getToken(CilParser.K_UINT64, 0); }
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_simpleType);
		try {
			setState(2358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2337);
				match(K_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2338);
				match(K_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2339);
				match(K_BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2340);
				match(K_INT8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2341);
				match(K_INT16);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2342);
				match(K_INT32);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2343);
				match(K_INT64);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2344);
				match(K_FLOAT32);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2345);
				match(K_FLOAT64);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2346);
				match(K_UNSIGNED);
				setState(2347);
				match(K_INT8);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2348);
				match(K_UNSIGNED);
				setState(2349);
				match(K_INT16);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2350);
				match(K_UNSIGNED);
				setState(2351);
				match(K_INT32);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2352);
				match(K_UNSIGNED);
				setState(2353);
				match(K_INT64);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2354);
				match(K_UINT8);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2355);
				match(K_UINT16);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2356);
				match(K_UINT32);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2357);
				match(K_UINT64);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bounds1Context extends ParserRuleContext {
		public BoundContext bound() {
			return getRuleContext(BoundContext.class,0);
		}
		public Bounds1Context bounds1() {
			return getRuleContext(Bounds1Context.class,0);
		}
		public Bounds1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bounds1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterBounds1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitBounds1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitBounds1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bounds1Context bounds1() throws RecognitionException {
		return bounds1(0);
	}

	private Bounds1Context bounds1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bounds1Context _localctx = new Bounds1Context(_ctx, _parentState);
		Bounds1Context _prevctx = _localctx;
		int _startState = 282;
		enterRecursionRule(_localctx, 282, RULE_bounds1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2361);
			bound();
			}
			_ctx.stop = _input.LT(-1);
			setState(2368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bounds1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bounds1);
					setState(2363);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2364);
					match(T__3);
					setState(2365);
					bound();
					}
					} 
				}
				setState(2370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoundContext extends ParserRuleContext {
		public TerminalNode ELIPSIS() { return getToken(CilParser.ELIPSIS, 0); }
		public List<Int32Context> int32() {
			return getRuleContexts(Int32Context.class);
		}
		public Int32Context int32(int i) {
			return getRuleContext(Int32Context.class,i);
		}
		public BoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_bound);
		try {
			setState(2380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2372);
				match(ELIPSIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2373);
				int32();
				setState(2375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(2374);
					match(ELIPSIS);
					}
					break;
				}
				setState(2378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(2377);
					int32();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecDeclContext extends ParserRuleContext {
		public TerminalNode D_PERMISSION() { return getToken(CilParser.D_PERMISSION, 0); }
		public SecActionContext secAction() {
			return getRuleContext(SecActionContext.class,0);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public NameValPairsContext nameValPairs() {
			return getRuleContext(NameValPairsContext.class,0);
		}
		public CustomBlobDescrContext customBlobDescr() {
			return getRuleContext(CustomBlobDescrContext.class,0);
		}
		public PsetHeadContext psetHead() {
			return getRuleContext(PsetHeadContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public TerminalNode D_PERMISSIONSET() { return getToken(CilParser.D_PERMISSIONSET, 0); }
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public SecAttrSetBlobContext secAttrSetBlob() {
			return getRuleContext(SecAttrSetBlobContext.class,0);
		}
		public SecDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSecDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSecDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSecDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecDeclContext secDecl() throws RecognitionException {
		SecDeclContext _localctx = new SecDeclContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_secDecl);
		try {
			setState(2416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2382);
				match(D_PERMISSION);
				setState(2383);
				secAction();
				setState(2384);
				typeSpec();
				setState(2385);
				match(T__4);
				setState(2386);
				nameValPairs();
				setState(2387);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2389);
				match(D_PERMISSION);
				setState(2390);
				secAction();
				setState(2391);
				typeSpec();
				setState(2392);
				match(T__7);
				setState(2393);
				match(T__0);
				setState(2394);
				customBlobDescr();
				setState(2395);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2397);
				match(D_PERMISSION);
				setState(2398);
				secAction();
				setState(2399);
				typeSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2401);
				psetHead();
				setState(2402);
				bytes();
				setState(2403);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2405);
				match(D_PERMISSIONSET);
				setState(2406);
				secAction();
				setState(2407);
				compQstring(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2409);
				match(D_PERMISSIONSET);
				setState(2410);
				secAction();
				setState(2411);
				match(T__7);
				setState(2412);
				match(T__0);
				setState(2413);
				secAttrSetBlob();
				setState(2414);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecAttrSetBlobContext extends ParserRuleContext {
		public SecAttrBlobContext secAttrBlob() {
			return getRuleContext(SecAttrBlobContext.class,0);
		}
		public SecAttrSetBlobContext secAttrSetBlob() {
			return getRuleContext(SecAttrSetBlobContext.class,0);
		}
		public SecAttrSetBlobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secAttrSetBlob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSecAttrSetBlob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSecAttrSetBlob(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSecAttrSetBlob(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecAttrSetBlobContext secAttrSetBlob() throws RecognitionException {
		SecAttrSetBlobContext _localctx = new SecAttrSetBlobContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_secAttrSetBlob);
		try {
			setState(2424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2419);
				secAttrBlob();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2420);
				secAttrBlob();
				setState(2421);
				match(T__3);
				setState(2422);
				secAttrSetBlob();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecAttrBlobContext extends ParserRuleContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public CustomBlobNVPairsContext customBlobNVPairs() {
			return getRuleContext(CustomBlobNVPairsContext.class,0);
		}
		public TerminalNode K_CLASS() { return getToken(CilParser.K_CLASS, 0); }
		public TerminalNode SQSTRING() { return getToken(CilParser.SQSTRING, 0); }
		public SecAttrBlobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secAttrBlob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSecAttrBlob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSecAttrBlob(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSecAttrBlob(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecAttrBlobContext secAttrBlob() throws RecognitionException {
		SecAttrBlobContext _localctx = new SecAttrBlobContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_secAttrBlob);
		try {
			setState(2439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2426);
				typeSpec();
				setState(2427);
				match(T__7);
				setState(2428);
				match(T__0);
				setState(2429);
				customBlobNVPairs();
				setState(2430);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2432);
				match(K_CLASS);
				setState(2433);
				match(SQSTRING);
				setState(2434);
				match(T__7);
				setState(2435);
				match(T__0);
				setState(2436);
				customBlobNVPairs();
				setState(2437);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PsetHeadContext extends ParserRuleContext {
		public TerminalNode D_PERMISSIONSET() { return getToken(CilParser.D_PERMISSIONSET, 0); }
		public SecActionContext secAction() {
			return getRuleContext(SecActionContext.class,0);
		}
		public TerminalNode K_BYTEARRAY() { return getToken(CilParser.K_BYTEARRAY, 0); }
		public PsetHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_psetHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterPsetHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitPsetHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitPsetHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PsetHeadContext psetHead() throws RecognitionException {
		PsetHeadContext _localctx = new PsetHeadContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_psetHead);
		try {
			setState(2451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2441);
				match(D_PERMISSIONSET);
				setState(2442);
				secAction();
				setState(2443);
				match(T__7);
				setState(2444);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2446);
				match(D_PERMISSIONSET);
				setState(2447);
				secAction();
				setState(2448);
				match(K_BYTEARRAY);
				setState(2449);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValPairsContext extends ParserRuleContext {
		public NameValPairContext nameValPair() {
			return getRuleContext(NameValPairContext.class,0);
		}
		public NameValPairsContext nameValPairs() {
			return getRuleContext(NameValPairsContext.class,0);
		}
		public NameValPairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValPairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterNameValPairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitNameValPairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitNameValPairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValPairsContext nameValPairs() throws RecognitionException {
		NameValPairsContext _localctx = new NameValPairsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_nameValPairs);
		try {
			setState(2458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2453);
				nameValPair();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2454);
				nameValPair();
				setState(2455);
				match(T__3);
				setState(2456);
				nameValPairs();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameValPairContext extends ParserRuleContext {
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public CaValueContext caValue() {
			return getRuleContext(CaValueContext.class,0);
		}
		public NameValPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterNameValPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitNameValPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitNameValPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValPairContext nameValPair() throws RecognitionException {
		NameValPairContext _localctx = new NameValPairContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_nameValPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			compQstring(0);
			setState(2461);
			match(T__7);
			setState(2462);
			caValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruefalseContext extends ParserRuleContext {
		public TerminalNode K_TRUE() { return getToken(CilParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(CilParser.K_FALSE, 0); }
		public TruefalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truefalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTruefalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTruefalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTruefalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TruefalseContext truefalse() throws RecognitionException {
		TruefalseContext _localctx = new TruefalseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_truefalse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
			_la = _input.LA(1);
			if ( !(_la==K_TRUE || _la==K_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaValueContext extends ParserRuleContext {
		public TruefalseContext truefalse() {
			return getRuleContext(TruefalseContext.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public TerminalNode K_INT32() { return getToken(CilParser.K_INT32, 0); }
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode K_INT8() { return getToken(CilParser.K_INT8, 0); }
		public TerminalNode K_INT16() { return getToken(CilParser.K_INT16, 0); }
		public CaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterCaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitCaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitCaValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaValueContext caValue() throws RecognitionException {
		CaValueContext _localctx = new CaValueContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_caValue);
		try {
			setState(2500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2466);
				truefalse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2467);
				int32();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2468);
				match(K_INT32);
				setState(2469);
				match(T__4);
				setState(2470);
				int32();
				setState(2471);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2473);
				compQstring(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2474);
				className();
				setState(2475);
				match(T__4);
				setState(2476);
				match(K_INT8);
				setState(2477);
				match(T__13);
				setState(2478);
				int32();
				setState(2479);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2481);
				className();
				setState(2482);
				match(T__4);
				setState(2483);
				match(K_INT16);
				setState(2484);
				match(T__13);
				setState(2485);
				int32();
				setState(2486);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2488);
				className();
				setState(2489);
				match(T__4);
				setState(2490);
				match(K_INT32);
				setState(2491);
				match(T__13);
				setState(2492);
				int32();
				setState(2493);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2495);
				className();
				setState(2496);
				match(T__4);
				setState(2497);
				int32();
				setState(2498);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecActionContext extends ParserRuleContext {
		public TerminalNode K_REQUEST() { return getToken(CilParser.K_REQUEST, 0); }
		public TerminalNode K_DEMAND() { return getToken(CilParser.K_DEMAND, 0); }
		public TerminalNode K_ASSERT() { return getToken(CilParser.K_ASSERT, 0); }
		public TerminalNode K_DENY() { return getToken(CilParser.K_DENY, 0); }
		public TerminalNode K_PERMITONLY() { return getToken(CilParser.K_PERMITONLY, 0); }
		public TerminalNode K_LINKCHECK() { return getToken(CilParser.K_LINKCHECK, 0); }
		public TerminalNode K_INHERITCHECK() { return getToken(CilParser.K_INHERITCHECK, 0); }
		public TerminalNode K_REQMIN() { return getToken(CilParser.K_REQMIN, 0); }
		public TerminalNode K_REQOPT() { return getToken(CilParser.K_REQOPT, 0); }
		public TerminalNode K_REQREFUSE() { return getToken(CilParser.K_REQREFUSE, 0); }
		public TerminalNode K_PREJITGRANT() { return getToken(CilParser.K_PREJITGRANT, 0); }
		public TerminalNode K_PREJITDENY() { return getToken(CilParser.K_PREJITDENY, 0); }
		public TerminalNode K_NONCASDEMAND() { return getToken(CilParser.K_NONCASDEMAND, 0); }
		public TerminalNode K_NONCASLINKDEMAND() { return getToken(CilParser.K_NONCASLINKDEMAND, 0); }
		public TerminalNode K_NONCASINHERITANCE() { return getToken(CilParser.K_NONCASINHERITANCE, 0); }
		public SecActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterSecAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitSecAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitSecAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecActionContext secAction() throws RecognitionException {
		SecActionContext _localctx = new SecActionContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_secAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2502);
			_la = _input.LA(1);
			if ( !(((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (K_REQUEST - 177)) | (1L << (K_DEMAND - 177)) | (1L << (K_ASSERT - 177)) | (1L << (K_DENY - 177)) | (1L << (K_PERMITONLY - 177)) | (1L << (K_LINKCHECK - 177)) | (1L << (K_INHERITCHECK - 177)) | (1L << (K_REQMIN - 177)) | (1L << (K_REQOPT - 177)) | (1L << (K_REQREFUSE - 177)) | (1L << (K_PREJITGRANT - 177)) | (1L << (K_PREJITDENY - 177)) | (1L << (K_NONCASDEMAND - 177)) | (1L << (K_NONCASLINKDEMAND - 177)) | (1L << (K_NONCASINHERITANCE - 177)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EsHeadContext extends ParserRuleContext {
		public TerminalNode D_LINE() { return getToken(CilParser.D_LINE, 0); }
		public TerminalNode P_LINE() { return getToken(CilParser.P_LINE, 0); }
		public EsHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterEsHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitEsHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitEsHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsHeadContext esHead() throws RecognitionException {
		EsHeadContext _localctx = new EsHeadContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_esHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			_la = _input.LA(1);
			if ( !(_la==D_LINE || _la==P_LINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtSourceSpecContext extends ParserRuleContext {
		public EsHeadContext esHead() {
			return getRuleContext(EsHeadContext.class,0);
		}
		public List<Int32Context> int32() {
			return getRuleContexts(Int32Context.class);
		}
		public Int32Context int32(int i) {
			return getRuleContext(Int32Context.class,i);
		}
		public TerminalNode SQSTRING() { return getToken(CilParser.SQSTRING, 0); }
		public TerminalNode QSTRING() { return getToken(CilParser.QSTRING, 0); }
		public ExtSourceSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extSourceSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterExtSourceSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitExtSourceSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitExtSourceSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtSourceSpecContext extSourceSpec() throws RecognitionException {
		ExtSourceSpecContext _localctx = new ExtSourceSpecContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_extSourceSpec);
		try {
			setState(2577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2506);
				esHead();
				setState(2507);
				int32();
				setState(2508);
				match(SQSTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2510);
				esHead();
				setState(2511);
				int32();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2513);
				esHead();
				setState(2514);
				int32();
				setState(2515);
				match(T__13);
				setState(2516);
				int32();
				setState(2517);
				match(SQSTRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2519);
				esHead();
				setState(2520);
				int32();
				setState(2521);
				match(T__13);
				setState(2522);
				int32();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2524);
				esHead();
				setState(2525);
				int32();
				setState(2526);
				match(T__13);
				setState(2527);
				int32();
				setState(2528);
				match(T__3);
				setState(2529);
				int32();
				setState(2530);
				match(SQSTRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2532);
				esHead();
				setState(2533);
				int32();
				setState(2534);
				match(T__13);
				setState(2535);
				int32();
				setState(2536);
				match(T__3);
				setState(2537);
				int32();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2539);
				esHead();
				setState(2540);
				int32();
				setState(2541);
				match(T__3);
				setState(2542);
				int32();
				setState(2543);
				match(T__13);
				setState(2544);
				int32();
				setState(2545);
				match(SQSTRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2547);
				esHead();
				setState(2548);
				int32();
				setState(2549);
				match(T__3);
				setState(2550);
				int32();
				setState(2551);
				match(T__13);
				setState(2552);
				int32();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2554);
				esHead();
				setState(2555);
				int32();
				setState(2556);
				match(T__3);
				setState(2557);
				int32();
				setState(2558);
				match(T__13);
				setState(2559);
				int32();
				setState(2560);
				match(T__3);
				setState(2561);
				int32();
				setState(2562);
				match(SQSTRING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2564);
				esHead();
				setState(2565);
				int32();
				setState(2566);
				match(T__3);
				setState(2567);
				int32();
				setState(2568);
				match(T__13);
				setState(2569);
				int32();
				setState(2570);
				match(T__3);
				setState(2571);
				int32();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2573);
				esHead();
				setState(2574);
				int32();
				setState(2575);
				match(QSTRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileDeclContext extends ParserRuleContext {
		public TerminalNode D_FILE() { return getToken(CilParser.D_FILE, 0); }
		public FileAttrContext fileAttr() {
			return getRuleContext(FileAttrContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public List<FileEntryContext> fileEntry() {
			return getRuleContexts(FileEntryContext.class);
		}
		public FileEntryContext fileEntry(int i) {
			return getRuleContext(FileEntryContext.class,i);
		}
		public HashHeadContext hashHead() {
			return getRuleContext(HashHeadContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public FileDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFileDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFileDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFileDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileDeclContext fileDecl() throws RecognitionException {
		FileDeclContext _localctx = new FileDeclContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_fileDecl);
		try {
			setState(2593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2579);
				match(D_FILE);
				setState(2580);
				fileAttr(0);
				setState(2581);
				dottedName();
				setState(2582);
				fileEntry();
				setState(2583);
				hashHead();
				setState(2584);
				bytes();
				setState(2585);
				match(T__5);
				setState(2586);
				fileEntry();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2588);
				match(D_FILE);
				setState(2589);
				fileAttr(0);
				setState(2590);
				dottedName();
				setState(2591);
				fileEntry();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileAttrContext extends ParserRuleContext {
		public FileAttrContext fileAttr() {
			return getRuleContext(FileAttrContext.class,0);
		}
		public TerminalNode K_NOMETADATA() { return getToken(CilParser.K_NOMETADATA, 0); }
		public FileAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFileAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFileAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFileAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileAttrContext fileAttr() throws RecognitionException {
		return fileAttr(0);
	}

	private FileAttrContext fileAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FileAttrContext _localctx = new FileAttrContext(_ctx, _parentState);
		FileAttrContext _prevctx = _localctx;
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_fileAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(2600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FileAttrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fileAttr);
					setState(2596);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2597);
					match(K_NOMETADATA);
					}
					} 
				}
				setState(2602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FileEntryContext extends ParserRuleContext {
		public TerminalNode D_ENTRYPOINT() { return getToken(CilParser.D_ENTRYPOINT, 0); }
		public FileEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterFileEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitFileEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitFileEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileEntryContext fileEntry() throws RecognitionException {
		FileEntryContext _localctx = new FileEntryContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_fileEntry);
		try {
			setState(2605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__6:
			case D_CLASS:
			case D_NAMESPACE:
			case D_METHOD:
			case D_FIELD:
			case D_DATA:
			case D_PERMISSION:
			case D_PERMISSIONSET:
			case D_LINE:
			case P_LINE:
			case D_LANGUAGE:
			case D_CUSTOM:
			case D_VTABLE:
			case D_VTFIXUP:
			case D_FILE:
			case D_HASH:
			case D_ASSEMBLY:
			case D_MRESOURCE:
			case D_MODULE:
			case D_SUBSYSTEM:
			case D_CORFLAGS:
			case D_IMAGEBASE:
			case D_STACKRESERVE:
			case D_TYPEDEF:
			case D_TYPELIST:
			case D_MSCORLIB:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case D_ENTRYPOINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2604);
				match(D_ENTRYPOINT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HashHeadContext extends ParserRuleContext {
		public TerminalNode D_HASH() { return getToken(CilParser.D_HASH, 0); }
		public HashHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterHashHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitHashHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitHashHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashHeadContext hashHead() throws RecognitionException {
		HashHeadContext _localctx = new HashHeadContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_hashHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2607);
			match(D_HASH);
			setState(2608);
			match(T__7);
			setState(2609);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyHeadContext extends ParserRuleContext {
		public TerminalNode D_ASSEMBLY() { return getToken(CilParser.D_ASSEMBLY, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public List<AsmAttrContext> asmAttr() {
			return getRuleContexts(AsmAttrContext.class);
		}
		public AsmAttrContext asmAttr(int i) {
			return getRuleContext(AsmAttrContext.class,i);
		}
		public AssemblyHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAssemblyHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAssemblyHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAssemblyHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyHeadContext assemblyHead() throws RecognitionException {
		AssemblyHeadContext _localctx = new AssemblyHeadContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_assemblyHead);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2611);
			match(D_ASSEMBLY);
			setState(2615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2612);
					asmAttr();
					}
					} 
				}
				setState(2617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			setState(2618);
			dottedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmAttrContext extends ParserRuleContext {
		public TerminalNode K_RETARGETABLE() { return getToken(CilParser.K_RETARGETABLE, 0); }
		public TerminalNode K_WINDOWSRUNTIME() { return getToken(CilParser.K_WINDOWSRUNTIME, 0); }
		public TerminalNode K_NOPLATFORM() { return getToken(CilParser.K_NOPLATFORM, 0); }
		public TerminalNode K_LEGACY() { return getToken(CilParser.K_LEGACY, 0); }
		public TerminalNode K_LIBRARY() { return getToken(CilParser.K_LIBRARY, 0); }
		public TerminalNode K_CIL() { return getToken(CilParser.K_CIL, 0); }
		public TerminalNode K_X86() { return getToken(CilParser.K_X86, 0); }
		public TerminalNode K_AMD64() { return getToken(CilParser.K_AMD64, 0); }
		public TerminalNode K_ARM() { return getToken(CilParser.K_ARM, 0); }
		public TerminalNode K_ARM64() { return getToken(CilParser.K_ARM64, 0); }
		public AsmAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAsmAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAsmAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAsmAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmAttrContext asmAttr() throws RecognitionException {
		AsmAttrContext _localctx = new AsmAttrContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_asmAttr);
		try {
			setState(2630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RETARGETABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2620);
				match(K_RETARGETABLE);
				}
				break;
			case K_WINDOWSRUNTIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(2621);
				match(K_WINDOWSRUNTIME);
				}
				break;
			case K_NOPLATFORM:
				enterOuterAlt(_localctx, 3);
				{
				setState(2622);
				match(K_NOPLATFORM);
				}
				break;
			case K_LEGACY:
				enterOuterAlt(_localctx, 4);
				{
				setState(2623);
				match(K_LEGACY);
				setState(2624);
				match(K_LIBRARY);
				}
				break;
			case K_CIL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2625);
				match(K_CIL);
				}
				break;
			case K_X86:
				enterOuterAlt(_localctx, 6);
				{
				setState(2626);
				match(K_X86);
				}
				break;
			case K_AMD64:
				enterOuterAlt(_localctx, 7);
				{
				setState(2627);
				match(K_AMD64);
				}
				break;
			case K_ARM:
				enterOuterAlt(_localctx, 8);
				{
				setState(2628);
				match(K_ARM);
				}
				break;
			case K_ARM64:
				enterOuterAlt(_localctx, 9);
				{
				setState(2629);
				match(K_ARM64);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyDeclsContext extends ParserRuleContext {
		public List<AssemblyDeclContext> assemblyDecl() {
			return getRuleContexts(AssemblyDeclContext.class);
		}
		public AssemblyDeclContext assemblyDecl(int i) {
			return getRuleContext(AssemblyDeclContext.class,i);
		}
		public AssemblyDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAssemblyDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAssemblyDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAssemblyDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyDeclsContext assemblyDecls() throws RecognitionException {
		AssemblyDeclsContext _localctx = new AssemblyDeclsContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_assemblyDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2632);
					assemblyDecl();
					}
					} 
				}
				setState(2637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyDeclContext extends ParserRuleContext {
		public TerminalNode D_HASH() { return getToken(CilParser.D_HASH, 0); }
		public TerminalNode K_ALGORITHM() { return getToken(CilParser.K_ALGORITHM, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public SecDeclContext secDecl() {
			return getRuleContext(SecDeclContext.class,0);
		}
		public AsmOrRefDeclContext asmOrRefDecl() {
			return getRuleContext(AsmOrRefDeclContext.class,0);
		}
		public AssemblyDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAssemblyDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAssemblyDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAssemblyDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyDeclContext assemblyDecl() throws RecognitionException {
		AssemblyDeclContext _localctx = new AssemblyDeclContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_assemblyDecl);
		try {
			setState(2643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(2638);
				match(D_HASH);
				setState(2639);
				match(K_ALGORITHM);
				setState(2640);
				int32();
				}
				break;
			case D_PERMISSION:
			case D_PERMISSIONSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(2641);
				secDecl();
				}
				break;
			case T__6:
			case D_CUSTOM:
			case D_PUBLICKEY:
			case D_VER:
			case D_LOCALE:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2642);
				asmOrRefDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntOrWildcardContext extends ParserRuleContext {
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public IntOrWildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intOrWildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterIntOrWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitIntOrWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitIntOrWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntOrWildcardContext intOrWildcard() throws RecognitionException {
		IntOrWildcardContext _localctx = new IntOrWildcardContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_intOrWildcard);
		try {
			setState(2647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(2645);
				int32();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(2646);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmOrRefDeclContext extends ParserRuleContext {
		public PublicKeyHeadContext publicKeyHead() {
			return getRuleContext(PublicKeyHeadContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public TerminalNode D_VER() { return getToken(CilParser.D_VER, 0); }
		public List<IntOrWildcardContext> intOrWildcard() {
			return getRuleContexts(IntOrWildcardContext.class);
		}
		public IntOrWildcardContext intOrWildcard(int i) {
			return getRuleContext(IntOrWildcardContext.class,i);
		}
		public TerminalNode D_LOCALE() { return getToken(CilParser.D_LOCALE, 0); }
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public LocaleHeadContext localeHead() {
			return getRuleContext(LocaleHeadContext.class,0);
		}
		public CustomAttrDeclContext customAttrDecl() {
			return getRuleContext(CustomAttrDeclContext.class,0);
		}
		public CompControlContext compControl() {
			return getRuleContext(CompControlContext.class,0);
		}
		public AsmOrRefDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmOrRefDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAsmOrRefDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAsmOrRefDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAsmOrRefDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmOrRefDeclContext asmOrRefDecl() throws RecognitionException {
		AsmOrRefDeclContext _localctx = new AsmOrRefDeclContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_asmOrRefDecl);
		try {
			setState(2670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2649);
				publicKeyHead();
				setState(2650);
				bytes();
				setState(2651);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2653);
				match(D_VER);
				setState(2654);
				intOrWildcard();
				setState(2655);
				match(T__13);
				setState(2656);
				intOrWildcard();
				setState(2657);
				match(T__13);
				setState(2658);
				intOrWildcard();
				setState(2659);
				match(T__13);
				setState(2660);
				intOrWildcard();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2662);
				match(D_LOCALE);
				setState(2663);
				compQstring(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2664);
				localeHead();
				setState(2665);
				bytes();
				setState(2666);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2668);
				customAttrDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2669);
				compControl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicKeyHeadContext extends ParserRuleContext {
		public TerminalNode D_PUBLICKEY() { return getToken(CilParser.D_PUBLICKEY, 0); }
		public PublicKeyHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicKeyHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterPublicKeyHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitPublicKeyHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitPublicKeyHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicKeyHeadContext publicKeyHead() throws RecognitionException {
		PublicKeyHeadContext _localctx = new PublicKeyHeadContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_publicKeyHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2672);
			match(D_PUBLICKEY);
			setState(2673);
			match(T__7);
			setState(2674);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicKeyTokenHeadContext extends ParserRuleContext {
		public TerminalNode D_PUBLICKEYTOKEN() { return getToken(CilParser.D_PUBLICKEYTOKEN, 0); }
		public PublicKeyTokenHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicKeyTokenHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterPublicKeyTokenHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitPublicKeyTokenHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitPublicKeyTokenHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicKeyTokenHeadContext publicKeyTokenHead() throws RecognitionException {
		PublicKeyTokenHeadContext _localctx = new PublicKeyTokenHeadContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_publicKeyTokenHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2676);
			match(D_PUBLICKEYTOKEN);
			setState(2677);
			match(T__7);
			setState(2678);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocaleHeadContext extends ParserRuleContext {
		public TerminalNode D_LOCALE() { return getToken(CilParser.D_LOCALE, 0); }
		public LocaleHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localeHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterLocaleHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitLocaleHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitLocaleHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocaleHeadContext localeHead() throws RecognitionException {
		LocaleHeadContext _localctx = new LocaleHeadContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_localeHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2680);
			match(D_LOCALE);
			setState(2681);
			match(T__7);
			setState(2682);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyRefHeadContext extends ParserRuleContext {
		public TerminalNode D_ASSEMBLY() { return getToken(CilParser.D_ASSEMBLY, 0); }
		public TerminalNode K_EXTERN() { return getToken(CilParser.K_EXTERN, 0); }
		public List<DottedNameContext> dottedName() {
			return getRuleContexts(DottedNameContext.class);
		}
		public DottedNameContext dottedName(int i) {
			return getRuleContext(DottedNameContext.class,i);
		}
		public List<AsmAttrContext> asmAttr() {
			return getRuleContexts(AsmAttrContext.class);
		}
		public AsmAttrContext asmAttr(int i) {
			return getRuleContext(AsmAttrContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(CilParser.K_AS, 0); }
		public AssemblyRefHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyRefHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAssemblyRefHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAssemblyRefHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAssemblyRefHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyRefHeadContext assemblyRefHead() throws RecognitionException {
		AssemblyRefHeadContext _localctx = new AssemblyRefHeadContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_assemblyRefHead);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
			match(D_ASSEMBLY);
			setState(2685);
			match(K_EXTERN);
			setState(2689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2686);
					asmAttr();
					}
					} 
				}
				setState(2691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			setState(2692);
			dottedName();
			setState(2695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(2693);
				match(K_AS);
				setState(2694);
				dottedName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyRefDeclsContext extends ParserRuleContext {
		public List<AssemblyRefDeclContext> assemblyRefDecl() {
			return getRuleContexts(AssemblyRefDeclContext.class);
		}
		public AssemblyRefDeclContext assemblyRefDecl(int i) {
			return getRuleContext(AssemblyRefDeclContext.class,i);
		}
		public AssemblyRefDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyRefDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAssemblyRefDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAssemblyRefDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAssemblyRefDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyRefDeclsContext assemblyRefDecls() throws RecognitionException {
		AssemblyRefDeclsContext _localctx = new AssemblyRefDeclsContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_assemblyRefDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2697);
					assemblyRefDecl();
					}
					} 
				}
				setState(2702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyRefDeclContext extends ParserRuleContext {
		public HashHeadContext hashHead() {
			return getRuleContext(HashHeadContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public AsmOrRefDeclContext asmOrRefDecl() {
			return getRuleContext(AsmOrRefDeclContext.class,0);
		}
		public PublicKeyTokenHeadContext publicKeyTokenHead() {
			return getRuleContext(PublicKeyTokenHeadContext.class,0);
		}
		public TerminalNode K_AUTO() { return getToken(CilParser.K_AUTO, 0); }
		public AssemblyRefDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyRefDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterAssemblyRefDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitAssemblyRefDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitAssemblyRefDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyRefDeclContext assemblyRefDecl() throws RecognitionException {
		AssemblyRefDeclContext _localctx = new AssemblyRefDeclContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_assemblyRefDecl);
		try {
			setState(2713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(2703);
				hashHead();
				setState(2704);
				bytes();
				setState(2705);
				match(T__5);
				}
				break;
			case T__6:
			case D_CUSTOM:
			case D_PUBLICKEY:
			case D_VER:
			case D_LOCALE:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2707);
				asmOrRefDecl();
				}
				break;
			case D_PUBLICKEYTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(2708);
				publicKeyTokenHead();
				setState(2709);
				bytes();
				setState(2710);
				match(T__5);
				}
				break;
			case K_AUTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(2712);
				match(K_AUTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExptypeHeadContext extends ParserRuleContext {
		public TerminalNode D_CLASS() { return getToken(CilParser.D_CLASS, 0); }
		public TerminalNode K_EXTERN() { return getToken(CilParser.K_EXTERN, 0); }
		public ExptAttrContext exptAttr() {
			return getRuleContext(ExptAttrContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public ExptypeHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exptypeHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterExptypeHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitExptypeHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitExptypeHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExptypeHeadContext exptypeHead() throws RecognitionException {
		ExptypeHeadContext _localctx = new ExptypeHeadContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_exptypeHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2715);
			match(D_CLASS);
			setState(2716);
			match(K_EXTERN);
			setState(2717);
			exptAttr();
			setState(2718);
			dottedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportHeadContext extends ParserRuleContext {
		public TerminalNode D_EXPORT() { return getToken(CilParser.D_EXPORT, 0); }
		public ExptAttrContext exptAttr() {
			return getRuleContext(ExptAttrContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public ExportHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterExportHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitExportHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitExportHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportHeadContext exportHead() throws RecognitionException {
		ExportHeadContext _localctx = new ExportHeadContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_exportHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2720);
			match(D_EXPORT);
			setState(2721);
			exptAttr();
			setState(2722);
			dottedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExptAttrContext extends ParserRuleContext {
		public List<TerminalNode> K_PRIVATE() { return getTokens(CilParser.K_PRIVATE); }
		public TerminalNode K_PRIVATE(int i) {
			return getToken(CilParser.K_PRIVATE, i);
		}
		public List<TerminalNode> K_PUBLIC() { return getTokens(CilParser.K_PUBLIC); }
		public TerminalNode K_PUBLIC(int i) {
			return getToken(CilParser.K_PUBLIC, i);
		}
		public List<TerminalNode> K_FORWARDER() { return getTokens(CilParser.K_FORWARDER); }
		public TerminalNode K_FORWARDER(int i) {
			return getToken(CilParser.K_FORWARDER, i);
		}
		public List<TerminalNode> K_NESTED() { return getTokens(CilParser.K_NESTED); }
		public TerminalNode K_NESTED(int i) {
			return getToken(CilParser.K_NESTED, i);
		}
		public List<TerminalNode> K_FAMILY() { return getTokens(CilParser.K_FAMILY); }
		public TerminalNode K_FAMILY(int i) {
			return getToken(CilParser.K_FAMILY, i);
		}
		public List<TerminalNode> K_ASSEMBLY() { return getTokens(CilParser.K_ASSEMBLY); }
		public TerminalNode K_ASSEMBLY(int i) {
			return getToken(CilParser.K_ASSEMBLY, i);
		}
		public List<TerminalNode> K_FAMANDASSEM() { return getTokens(CilParser.K_FAMANDASSEM); }
		public TerminalNode K_FAMANDASSEM(int i) {
			return getToken(CilParser.K_FAMANDASSEM, i);
		}
		public List<TerminalNode> K_FAMORASSEM() { return getTokens(CilParser.K_FAMORASSEM); }
		public TerminalNode K_FAMORASSEM(int i) {
			return getToken(CilParser.K_FAMORASSEM, i);
		}
		public ExptAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exptAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterExptAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitExptAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitExptAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExptAttrContext exptAttr() throws RecognitionException {
		ExptAttrContext _localctx = new ExptAttrContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_exptAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_FORWARDER - 72)) | (1L << (K_PUBLIC - 72)) | (1L << (K_PRIVATE - 72)) | (1L << (K_NESTED - 72)))) != 0)) {
				{
				setState(2739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(2724);
					match(K_PRIVATE);
					}
					break;
				case 2:
					{
					setState(2725);
					match(K_PUBLIC);
					}
					break;
				case 3:
					{
					setState(2726);
					match(K_FORWARDER);
					}
					break;
				case 4:
					{
					setState(2727);
					match(K_NESTED);
					setState(2728);
					match(K_PUBLIC);
					}
					break;
				case 5:
					{
					setState(2729);
					match(K_NESTED);
					setState(2730);
					match(K_PRIVATE);
					}
					break;
				case 6:
					{
					setState(2731);
					match(K_NESTED);
					setState(2732);
					match(K_FAMILY);
					}
					break;
				case 7:
					{
					setState(2733);
					match(K_NESTED);
					setState(2734);
					match(K_ASSEMBLY);
					}
					break;
				case 8:
					{
					setState(2735);
					match(K_NESTED);
					setState(2736);
					match(K_FAMANDASSEM);
					}
					break;
				case 9:
					{
					setState(2737);
					match(K_NESTED);
					setState(2738);
					match(K_FAMORASSEM);
					}
					break;
				}
				}
				setState(2743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExptypeDeclsContext extends ParserRuleContext {
		public List<ExptypeDeclContext> exptypeDecl() {
			return getRuleContexts(ExptypeDeclContext.class);
		}
		public ExptypeDeclContext exptypeDecl(int i) {
			return getRuleContext(ExptypeDeclContext.class,i);
		}
		public ExptypeDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exptypeDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterExptypeDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitExptypeDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitExptypeDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExptypeDeclsContext exptypeDecls() throws RecognitionException {
		ExptypeDeclsContext _localctx = new ExptypeDeclsContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_exptypeDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2744);
					exptypeDecl();
					}
					} 
				}
				setState(2749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExptypeDeclContext extends ParserRuleContext {
		public TerminalNode D_FILE() { return getToken(CilParser.D_FILE, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode D_CLASS() { return getToken(CilParser.D_CLASS, 0); }
		public TerminalNode K_EXTERN() { return getToken(CilParser.K_EXTERN, 0); }
		public SlashedNameContext slashedName() {
			return getRuleContext(SlashedNameContext.class,0);
		}
		public TerminalNode D_ASSEMBLY() { return getToken(CilParser.D_ASSEMBLY, 0); }
		public TerminalNode K_MDTOKEN() { return getToken(CilParser.K_MDTOKEN, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public CustomAttrDeclContext customAttrDecl() {
			return getRuleContext(CustomAttrDeclContext.class,0);
		}
		public CompControlContext compControl() {
			return getRuleContext(CompControlContext.class,0);
		}
		public ExptypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exptypeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterExptypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitExptypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitExptypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExptypeDeclContext exptypeDecl() throws RecognitionException {
		ExptypeDeclContext _localctx = new ExptypeDeclContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_exptypeDecl);
		try {
			setState(2767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2750);
				match(D_FILE);
				setState(2751);
				dottedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2752);
				match(D_CLASS);
				setState(2753);
				match(K_EXTERN);
				setState(2754);
				slashedName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2755);
				match(D_ASSEMBLY);
				setState(2756);
				match(K_EXTERN);
				setState(2757);
				dottedName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2758);
				match(K_MDTOKEN);
				setState(2759);
				match(T__4);
				setState(2760);
				int32();
				setState(2761);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2763);
				match(D_CLASS);
				setState(2764);
				int32();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2765);
				customAttrDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2766);
				compControl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ManifestResHeadContext extends ParserRuleContext {
		public TerminalNode D_MRESOURCE() { return getToken(CilParser.D_MRESOURCE, 0); }
		public List<DottedNameContext> dottedName() {
			return getRuleContexts(DottedNameContext.class);
		}
		public DottedNameContext dottedName(int i) {
			return getRuleContext(DottedNameContext.class,i);
		}
		public List<ManresAttrContext> manresAttr() {
			return getRuleContexts(ManresAttrContext.class);
		}
		public ManresAttrContext manresAttr(int i) {
			return getRuleContext(ManresAttrContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(CilParser.K_AS, 0); }
		public ManifestResHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manifestResHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterManifestResHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitManifestResHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitManifestResHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManifestResHeadContext manifestResHead() throws RecognitionException {
		ManifestResHeadContext _localctx = new ManifestResHeadContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_manifestResHead);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2769);
			match(D_MRESOURCE);
			setState(2773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2770);
					manresAttr();
					}
					} 
				}
				setState(2775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(2776);
			dottedName();
			setState(2779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(2777);
				match(K_AS);
				setState(2778);
				dottedName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ManresAttrContext extends ParserRuleContext {
		public TerminalNode K_PUBLIC() { return getToken(CilParser.K_PUBLIC, 0); }
		public TerminalNode K_PRIVATE() { return getToken(CilParser.K_PRIVATE, 0); }
		public ManresAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manresAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterManresAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitManresAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitManresAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManresAttrContext manresAttr() throws RecognitionException {
		ManresAttrContext _localctx = new ManresAttrContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_manresAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2781);
			_la = _input.LA(1);
			if ( !(_la==K_PUBLIC || _la==K_PRIVATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ManifestResDeclsContext extends ParserRuleContext {
		public List<ManifestResDeclContext> manifestResDecl() {
			return getRuleContexts(ManifestResDeclContext.class);
		}
		public ManifestResDeclContext manifestResDecl(int i) {
			return getRuleContext(ManifestResDeclContext.class,i);
		}
		public ManifestResDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manifestResDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterManifestResDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitManifestResDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitManifestResDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManifestResDeclsContext manifestResDecls() throws RecognitionException {
		ManifestResDeclsContext _localctx = new ManifestResDeclsContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_manifestResDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2783);
					manifestResDecl();
					}
					} 
				}
				setState(2788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ManifestResDeclContext extends ParserRuleContext {
		public TerminalNode D_FILE() { return getToken(CilParser.D_FILE, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode K_AT() { return getToken(CilParser.K_AT, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public TerminalNode D_ASSEMBLY() { return getToken(CilParser.D_ASSEMBLY, 0); }
		public TerminalNode K_EXTERN() { return getToken(CilParser.K_EXTERN, 0); }
		public CustomAttrDeclContext customAttrDecl() {
			return getRuleContext(CustomAttrDeclContext.class,0);
		}
		public CompControlContext compControl() {
			return getRuleContext(CompControlContext.class,0);
		}
		public ManifestResDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manifestResDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterManifestResDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitManifestResDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitManifestResDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManifestResDeclContext manifestResDecl() throws RecognitionException {
		ManifestResDeclContext _localctx = new ManifestResDeclContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_manifestResDecl);
		try {
			setState(2799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2789);
				match(D_FILE);
				setState(2790);
				dottedName();
				setState(2791);
				match(K_AT);
				setState(2792);
				int32();
				}
				break;
			case D_ASSEMBLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2794);
				match(D_ASSEMBLY);
				setState(2795);
				match(K_EXTERN);
				setState(2796);
				dottedName();
				}
				break;
			case D_CUSTOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(2797);
				customAttrDecl();
				}
				break;
			case T__6:
			case P_DEFINE:
			case P_UNDEF:
			case P_IFDEF:
			case P_IFNDEF:
			case P_ELSE:
			case P_ENDIF:
			case P_INCLUDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2798);
				compControl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return compQstring_sempred((CompQstringContext)_localctx, predIndex);
		case 19:
			return serializType_sempred((SerializTypeContext)_localctx, predIndex);
		case 22:
			return vtfixupAttr_sempred((VtfixupAttrContext)_localctx, predIndex);
		case 33:
			return implList_sempred((ImplListContext)_localctx, predIndex);
		case 35:
			return typeListNotEmpty_sempred((TypeListNotEmptyContext)_localctx, predIndex);
		case 56:
			return eventAttr_sempred((EventAttrContext)_localctx, predIndex);
		case 60:
			return propAttr_sempred((PropAttrContext)_localctx, predIndex);
		case 98:
			return hexbytes_sempred((HexbytesContext)_localctx, predIndex);
		case 101:
			return f32seq_sempred((F32seqContext)_localctx, predIndex);
		case 102:
			return f64seq_sempred((F64seqContext)_localctx, predIndex);
		case 103:
			return i64seq_sempred((I64seqContext)_localctx, predIndex);
		case 104:
			return i32seq_sempred((I32seqContext)_localctx, predIndex);
		case 105:
			return i16seq_sempred((I16seqContext)_localctx, predIndex);
		case 106:
			return i8seq_sempred((I8seqContext)_localctx, predIndex);
		case 107:
			return boolSeq_sempred((BoolSeqContext)_localctx, predIndex);
		case 108:
			return sqstringSeq_sempred((SqstringSeqContext)_localctx, predIndex);
		case 109:
			return classSeq_sempred((ClassSeqContext)_localctx, predIndex);
		case 110:
			return objSeq_sempred((ObjSeqContext)_localctx, predIndex);
		case 129:
			return tyArgs2_sempred((TyArgs2Context)_localctx, predIndex);
		case 136:
			return nativeType_sempred((NativeTypeContext)_localctx, predIndex);
		case 138:
			return variantType_sempred((VariantTypeContext)_localctx, predIndex);
		case 139:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 141:
			return bounds1_sempred((Bounds1Context)_localctx, predIndex);
		case 155:
			return fileAttr_sempred((FileAttrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean compQstring_sempred(CompQstringContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean serializType_sempred(SerializTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean vtfixupAttr_sempred(VtfixupAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean implList_sempred(ImplListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean typeListNotEmpty_sempred(TypeListNotEmptyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eventAttr_sempred(EventAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean propAttr_sempred(PropAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean hexbytes_sempred(HexbytesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean f32seq_sempred(F32seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean f64seq_sempred(F64seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i64seq_sempred(I64seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i32seq_sempred(I32seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i16seq_sempred(I16seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i8seq_sempred(I8seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolSeq_sempred(BoolSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sqstringSeq_sempred(SqstringSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 2);
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean classSeq_sempred(ClassSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 3);
		case 26:
			return precpred(_ctx, 2);
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean objSeq_sempred(ObjSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tyArgs2_sempred(TyArgs2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean nativeType_sempred(NativeTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 29);
		case 31:
			return precpred(_ctx, 28);
		case 32:
			return precpred(_ctx, 27);
		case 33:
			return precpred(_ctx, 26);
		case 34:
			return precpred(_ctx, 25);
		}
		return true;
	}
	private boolean variantType_sempred(VariantTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 28);
		case 36:
			return precpred(_ctx, 27);
		case 37:
			return precpred(_ctx, 26);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 20);
		case 39:
			return precpred(_ctx, 19);
		case 40:
			return precpred(_ctx, 18);
		case 41:
			return precpred(_ctx, 17);
		case 42:
			return precpred(_ctx, 16);
		case 43:
			return precpred(_ctx, 15);
		case 44:
			return precpred(_ctx, 14);
		case 45:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean bounds1_sempred(Bounds1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fileAttr_sempred(FileAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u012e\u0af4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\3\2\7\2\u016a\n\2\f\2\16\2\u016d"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01af\n\3\3\4"+
		"\3\4\3\4\3\4\5\4\u01b5\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u01bd\n\5\f\5\16"+
		"\5\u01c0\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01ce"+
		"\n\6\3\7\3\7\3\b\3\b\5\b\u01d4\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u01e5\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01f4\n\f\3\f\3\f\3\r\3\r\3\r\5"+
		"\r\u01fb\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0208\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u020f\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u021e\n\16\3\17\3\17\5\17\u0222"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\7\21\u0229\n\21\f\21\16\21\u022c\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0235\n\22\f\22\16\22\u0238\13"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u0247\n\25\3\25\3\25\3\25\7\25\u024c\n\25\f\25\16\25\u024f\13\25\3"+
		"\26\3\26\5\26\u0253\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u026a"+
		"\n\30\f\30\16\30\u026d\13\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u027f\n\35\f\35\16\35\u0282"+
		"\13\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02a6\n\37\3 \3 \5 \u02aa\n "+
		"\3!\3!\3!\5!\u02af\n!\3\"\7\"\u02b2\n\"\f\"\16\"\u02b5\13\"\3#\3#\3#\3"+
		"#\3#\3#\7#\u02bd\n#\f#\16#\u02c0\13#\3$\3$\5$\u02c4\n$\3%\3%\3%\3%\3%"+
		"\3%\7%\u02cc\n%\f%\16%\u02cf\13%\3&\3&\3&\3&\3&\5&\u02d6\n&\3\'\3\'\3"+
		"(\3(\3(\3(\5(\u02de\n(\3)\3)\5)\u02e2\n)\3)\3)\3)\3*\3*\3*\5*\u02ea\n"+
		"*\3+\3+\3+\3+\3,\3,\5,\u02f2\n,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0340\n.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\5.\u034b\n.\3.\3.\5.\u034f\n.\3.\3.\3.\3.\3.\5"+
		".\u0356\n.\3/\3/\3/\7/\u035b\n/\f/\16/\u035e\13/\3/\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u037c\n\60\3\61\3\61\3\61"+
		"\5\61\u0381\n\61\3\62\3\62\3\62\5\62\u0386\n\62\3\63\3\63\3\63\3\63\3"+
		"\63\5\63\u038d\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u0394\n\64\3\64\3\64"+
		"\3\64\5\64\u0399\n\64\3\64\3\64\3\64\3\64\3\65\7\65\u03a0\n\65\f\65\16"+
		"\65\u03a3\13\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u03ab\n\65\3\66\3\66"+
		"\3\66\3\66\5\66\u03b1\n\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\58\u03c6\n8\39\39\39\39\39\39\39\39\39\59\u03d1"+
		"\n9\3:\3:\3:\3:\3:\7:\u03d8\n:\f:\16:\u03db\13:\3;\7;\u03de\n;\f;\16;"+
		"\u03e1\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u03ef\n<\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\7>\u0400\n>\f>\16>\u0403\13>\3?\7?"+
		"\u0406\n?\f?\16?\u0409\13?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0415\n@\3"+
		"A\3A\3B\3B\3B\3B\3B\3B\5B\u041f\nB\3C\3C\3C\3C\3C\5C\u0426\nC\3D\3D\3"+
		"E\3E\7E\u042c\nE\fE\16E\u042f\13E\3E\3E\7E\u0433\nE\fE\16E\u0436\13E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\7E\u0440\nE\fE\16E\u0443\13E\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u045f"+
		"\nF\3F\3F\5F\u0463\nF\3F\7F\u0466\nF\fF\16F\u0469\13F\3F\5F\u046c\nF\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\5G\u0489\nG\3H\3H\3H\5H\u048e\nH\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\5I\u049d\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\5J\u04b2\nJ\3K\3K\3L\7L\u04b7\nL\fL\16L\u04ba\13L\3M\3M"+
		"\3M\3M\3M\3M\3M\5M\u04c3\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u04cf\nM"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u04dd\nM\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\5M\u04e9\nM\3M\3M\3M\3M\3M\3M\3M\3M\5M\u04f3\nM\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\5M\u04fd\nM\3M\3M\3M\3M\3M\3M\5M\u0505\nM\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\5M\u050f\nM\5M\u0511\nM\3N\3N\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3Q"+
		"\3Q\5Q\u0520\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u052c\nR\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\5S\u053a\nS\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0545"+
		"\nT\3U\3U\3V\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u055b"+
		"\nY\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\5[\u0567\n[\3\\\3\\\3\\\5\\\u056c\n"+
		"\\\3]\3]\3]\3]\3]\5]\u0573\n]\3^\3^\3^\3^\3^\5^\u057a\n^\3_\3_\3_\3_\3"+
		"_\5_\u0581\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u05c2"+
		"\n`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\5a\u0626\na\3b\3b\3b\3c\3c\5c\u062d\nc\3d\3d\3d"+
		"\3d\3d\7d\u0634\nd\fd\16d\u0637\13d\3e\3e\3e\5e\u063c\ne\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u06f6\nf\3"+
		"g\3g\3g\3g\3g\7g\u06fd\ng\fg\16g\u0700\13g\3h\3h\3h\3h\3h\7h\u0707\nh"+
		"\fh\16h\u070a\13h\3i\3i\3i\7i\u070f\ni\fi\16i\u0712\13i\3j\3j\3j\7j\u0717"+
		"\nj\fj\16j\u071a\13j\3k\3k\3k\7k\u071f\nk\fk\16k\u0722\13k\3l\3l\3l\7"+
		"l\u0727\nl\fl\16l\u072a\13l\3m\3m\3m\7m\u072f\nm\fm\16m\u0732\13m\3n\3"+
		"n\3n\3n\3n\7n\u0739\nn\fn\16n\u073c\13n\3o\3o\3o\3o\3o\3o\3o\3o\7o\u0746"+
		"\no\fo\16o\u0749\13o\3p\3p\3p\7p\u074e\np\fp\16p\u0751\13p\3q\3q\3r\3"+
		"r\3s\3s\3s\5s\u075a\ns\3t\3t\3t\3u\3u\3u\3v\3v\3v\3v\3v\3v\3v\5v\u0769"+
		"\nv\3w\3w\3w\5w\u076e\nw\3x\3x\3x\3y\3y\3y\3y\3y\5y\u0778\ny\3y\3y\3z"+
		"\3z\3z\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u078a\n{\3|\3|\3|\3|\3|\3|"+
		"\3|\3}\3}\3}\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u07a8\n\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u07b5\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u07bc\n\u0081\3\u0082\3\u0082\5\u0082\u07c0\n\u0082\3\u0083\3\u0083\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u07c8\n\u0083\f\u0083\16\u0083"+
		"\u07cb\13\u0083\3\u0084\5\u0084\u07ce\n\u0084\3\u0085\3\u0085\3\u0085"+
		"\7\u0085\u07d3\n\u0085\f\u0085\16\u0085\u07d6\13\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u07e0\n\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07fb"+
		"\n\u0087\3\u0088\3\u0088\3\u0088\7\u0088\u0800\n\u0088\f\u0088\16\u0088"+
		"\u0803\13\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0810\n\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\5\u008a\u086f\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\7\u008a\u0888\n\u008a\f\u008a\16\u008a\u088b\13\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0894\n\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u08c9\n\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u08d2\n\u008c"+
		"\f\u008c\16\u008c\u08d5\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u08fe"+
		"\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u091f\n\u008d\f\u008d"+
		"\16\u008d\u0922\13\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0939\n\u008e"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u0941\n\u008f"+
		"\f\u008f\16\u008f\u0944\13\u008f\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090"+
		"\u094a\n\u0090\3\u0090\5\u0090\u094d\n\u0090\5\u0090\u094f\n\u0090\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0973\n\u0091"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u097b\n\u0092"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u098a\n\u0093\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u0996\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u099d\n"+
		"\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u09c7\n\u0098\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\5\u009b\u0a14\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\5\u009c\u0a24\n\u009c\3\u009d\3\u009d\3\u009d\7\u009d\u0a29\n"+
		"\u009d\f\u009d\16\u009d\u0a2c\13\u009d\3\u009e\3\u009e\5\u009e\u0a30\n"+
		"\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\7\u00a0\u0a38\n"+
		"\u00a0\f\u00a0\16\u00a0\u0a3b\13\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1"+
		"\u0a49\n\u00a1\3\u00a2\7\u00a2\u0a4c\n\u00a2\f\u00a2\16\u00a2\u0a4f\13"+
		"\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0a56\n\u00a3\3"+
		"\u00a4\3\u00a4\5\u00a4\u0a5a\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u0a71\n\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\7\u00a9"+
		"\u0a82\n\u00a9\f\u00a9\16\u00a9\u0a85\13\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u0a8a\n\u00a9\3\u00aa\7\u00aa\u0a8d\n\u00aa\f\u00aa\16\u00aa"+
		"\u0a90\13\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a9c\n\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\7\u00ae\u0ab6\n\u00ae\f\u00ae\16\u00ae\u0ab9"+
		"\13\u00ae\3\u00af\7\u00af\u0abc\n\u00af\f\u00af\16\u00af\u0abf\13\u00af"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0"+
		"\u0ad2\n\u00b0\3\u00b1\3\u00b1\7\u00b1\u0ad6\n\u00b1\f\u00b1\16\u00b1"+
		"\u0ad9\13\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0ade\n\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b3\7\u00b3\u0ae3\n\u00b3\f\u00b3\16\u00b3\u0ae6\13\u00b3"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\5\u00b4\u0af2\n\u00b4\3\u00b4\30\u022a\u0236\u0280\u02b3\u035c"+
		"\u03a1\u03df\u0407\u042d\u0434\u0441\u0467\u04b8\u07d4\u0801\u0a39\u0a4d"+
		"\u0a83\u0a8e\u0abd\u0ad7\u0ae4\32\b(.DHrz\u00c6\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u0104\u0112\u0116\u0118\u011c\u0138"+
		"\u00b5\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\2\r\3\2\u0126\u0127\4\2iinn\4\2LNpr\7\2\5\5\17\17\65\65F"+
		"Fxx\4\2oo\u0120\u0120\4\2HHWW\4\2\60\60\62\64\3\2BC\3\2\u00b3\u00c1\3"+
		"\2\u00c2\u00c3\3\2LM\2\u0c9d\2\u016b\3\2\2\2\4\u01ae\3\2\2\2\6\u01b4\3"+
		"\2\2\2\b\u01b6\3\2\2\2\n\u01cd\3\2\2\2\f\u01cf\3\2\2\2\16\u01d3\3\2\2"+
		"\2\20\u01d5\3\2\2\2\22\u01d7\3\2\2\2\24\u01e4\3\2\2\2\26\u01e6\3\2\2\2"+
		"\30\u0207\3\2\2\2\32\u0209\3\2\2\2\34\u0221\3\2\2\2\36\u0223\3\2\2\2 "+
		"\u022a\3\2\2\2\"\u0236\3\2\2\2$\u0239\3\2\2\2&\u023b\3\2\2\2(\u0246\3"+
		"\2\2\2*\u0250\3\2\2\2,\u0256\3\2\2\2.\u025e\3\2\2\2\60\u026e\3\2\2\2\62"+
		"\u0272\3\2\2\2\64\u0276\3\2\2\2\66\u027a\3\2\2\28\u027c\3\2\2\2:\u0287"+
		"\3\2\2\2<\u02a5\3\2\2\2>\u02a9\3\2\2\2@\u02ae\3\2\2\2B\u02b3\3\2\2\2D"+
		"\u02b6\3\2\2\2F\u02c3\3\2\2\2H\u02c5\3\2\2\2J\u02d5\3\2\2\2L\u02d7\3\2"+
		"\2\2N\u02dd\3\2\2\2P\u02df\3\2\2\2R\u02e9\3\2\2\2T\u02eb\3\2\2\2V\u02f1"+
		"\3\2\2\2X\u02f3\3\2\2\2Z\u0355\3\2\2\2\\\u0357\3\2\2\2^\u037b\3\2\2\2"+
		"`\u0380\3\2\2\2b\u0385\3\2\2\2d\u038c\3\2\2\2f\u038e\3\2\2\2h\u03a1\3"+
		"\2\2\2j\u03b0\3\2\2\2l\u03b2\3\2\2\2n\u03c5\3\2\2\2p\u03d0\3\2\2\2r\u03d2"+
		"\3\2\2\2t\u03df\3\2\2\2v\u03ee\3\2\2\2x\u03f0\3\2\2\2z\u03fa\3\2\2\2|"+
		"\u0407\3\2\2\2~\u0414\3\2\2\2\u0080\u0416\3\2\2\2\u0082\u041e\3\2\2\2"+
		"\u0084\u0425\3\2\2\2\u0086\u0427\3\2\2\2\u0088\u0429\3\2\2\2\u008a\u046b"+
		"\3\2\2\2\u008c\u0488\3\2\2\2\u008e\u048d\3\2\2\2\u0090\u049c\3\2\2\2\u0092"+
		"\u04b1\3\2\2\2\u0094\u04b3\3\2\2\2\u0096\u04b8\3\2\2\2\u0098\u0510\3\2"+
		"\2\2\u009a\u0512\3\2\2\2\u009c\u0516\3\2\2\2\u009e\u0518\3\2\2\2\u00a0"+
		"\u051f\3\2\2\2\u00a2\u0521\3\2\2\2\u00a4\u0539\3\2\2\2\u00a6\u0544\3\2"+
		"\2\2\u00a8\u0546\3\2\2\2\u00aa\u0548\3\2\2\2\u00ac\u054b\3\2\2\2\u00ae"+
		"\u054d\3\2\2\2\u00b0\u055a\3\2\2\2\u00b2\u055c\3\2\2\2\u00b4\u0566\3\2"+
		"\2\2\u00b6\u056b\3\2\2\2\u00b8\u0572\3\2\2\2\u00ba\u0579\3\2\2\2\u00bc"+
		"\u0580\3\2\2\2\u00be\u05c1\3\2\2\2\u00c0\u0625\3\2\2\2\u00c2\u0627\3\2"+
		"\2\2\u00c4\u062c\3\2\2\2\u00c6\u062e\3\2\2\2\u00c8\u063b\3\2\2\2\u00ca"+
		"\u06f5\3\2\2\2\u00cc\u06f7\3\2\2\2\u00ce\u0701\3\2\2\2\u00d0\u070b\3\2"+
		"\2\2\u00d2\u0713\3\2\2\2\u00d4\u071b\3\2\2\2\u00d6\u0723\3\2\2\2\u00d8"+
		"\u072b\3\2\2\2\u00da\u0733\3\2\2\2\u00dc\u073d\3\2\2\2\u00de\u074a\3\2"+
		"\2\2\u00e0\u0752\3\2\2\2\u00e2\u0754\3\2\2\2\u00e4\u0756\3\2\2\2\u00e6"+
		"\u075b\3\2\2\2\u00e8\u075e\3\2\2\2\u00ea\u0761\3\2\2\2\u00ec\u076a\3\2"+
		"\2\2\u00ee\u076f\3\2\2\2\u00f0\u0772\3\2\2\2\u00f2\u077b\3\2\2\2\u00f4"+
		"\u077e\3\2\2\2\u00f6\u078b\3\2\2\2\u00f8\u0792\3\2\2\2\u00fa\u0795\3\2"+
		"\2\2\u00fc\u07a7\3\2\2\2\u00fe\u07b4\3\2\2\2\u0100\u07bb\3\2\2\2\u0102"+
		"\u07bf\3\2\2\2\u0104\u07c1\3\2\2\2\u0106\u07cd\3\2\2\2\u0108\u07cf\3\2"+
		"\2\2\u010a\u07df\3\2\2\2\u010c\u07fa\3\2\2\2\u010e\u07fc\3\2\2\2\u0110"+
		"\u080f\3\2\2\2\u0112\u086e\3\2\2\2\u0114\u0893\3\2\2\2\u0116\u08c8\3\2"+
		"\2\2\u0118\u08fd\3\2\2\2\u011a\u0938\3\2\2\2\u011c\u093a\3\2\2\2\u011e"+
		"\u094e\3\2\2\2\u0120\u0972\3\2\2\2\u0122\u097a\3\2\2\2\u0124\u0989\3\2"+
		"\2\2\u0126\u0995\3\2\2\2\u0128\u099c\3\2\2\2\u012a\u099e\3\2\2\2\u012c"+
		"\u09a2\3\2\2\2\u012e\u09c6\3\2\2\2\u0130\u09c8\3\2\2\2\u0132\u09ca\3\2"+
		"\2\2\u0134\u0a13\3\2\2\2\u0136\u0a23\3\2\2\2\u0138\u0a25\3\2\2\2\u013a"+
		"\u0a2f\3\2\2\2\u013c\u0a31\3\2\2\2\u013e\u0a35\3\2\2\2\u0140\u0a48\3\2"+
		"\2\2\u0142\u0a4d\3\2\2\2\u0144\u0a55\3\2\2\2\u0146\u0a59\3\2\2\2\u0148"+
		"\u0a70\3\2\2\2\u014a\u0a72\3\2\2\2\u014c\u0a76\3\2\2\2\u014e\u0a7a\3\2"+
		"\2\2\u0150\u0a7e\3\2\2\2\u0152\u0a8e\3\2\2\2\u0154\u0a9b\3\2\2\2\u0156"+
		"\u0a9d\3\2\2\2\u0158\u0aa2\3\2\2\2\u015a\u0ab7\3\2\2\2\u015c\u0abd\3\2"+
		"\2\2\u015e\u0ad1\3\2\2\2\u0160\u0ad3\3\2\2\2\u0162\u0adf\3\2\2\2\u0164"+
		"\u0ae4\3\2\2\2\u0166\u0af1\3\2\2\2\u0168\u016a\5\4\3\2\u0169\u0168\3\2"+
		"\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\3\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\5:\36\2\u016f\u0170\7\3\2\2"+
		"\u0170\u0171\5B\"\2\u0171\u0172\7\4\2\2\u0172\u01af\3\2\2\2\u0173\u0174"+
		"\5\64\33\2\u0174\u0175\7\3\2\2\u0175\u0176\5\2\2\2\u0176\u0177\7\4\2\2"+
		"\u0177\u01af\3\2\2\2\u0178\u0179\5\u0088E\2\u0179\u017a\7\3\2\2\u017a"+
		"\u017b\5\u0096L\2\u017b\u017c\7\4\2\2\u017c\u01af\3\2\2\2\u017d\u01af"+
		"\5\\/\2\u017e\u01af\5\u00b2Z\2\u017f\u01af\5\60\31\2\u0180\u01af\5,\27"+
		"\2\u0181\u01af\5\u0134\u009b\2\u0182\u01af\5\u0136\u009c\2\u0183\u0184"+
		"\5\u013e\u00a0\2\u0184\u0185\7\3\2\2\u0185\u0186\5\u0142\u00a2\2\u0186"+
		"\u0187\7\4\2\2\u0187\u01af\3\2\2\2\u0188\u0189\5\u0150\u00a9\2\u0189\u018a"+
		"\7\3\2\2\u018a\u018b\5\u0152\u00aa\2\u018b\u018c\7\4\2\2\u018c\u01af\3"+
		"\2\2\2\u018d\u018e\5\u0156\u00ac\2\u018e\u018f\7\3\2\2\u018f\u0190\5\u015c"+
		"\u00af\2\u0190\u0191\7\4\2\2\u0191\u01af\3\2\2\2\u0192\u0193\5\u0160\u00b1"+
		"\2\u0193\u0194\7\3\2\2\u0194\u0195\5\u0164\u00b3\2\u0195\u0196\7\4\2\2"+
		"\u0196\u01af\3\2\2\2\u0197\u01af\5*\26\2\u0198\u01af\5\u0120\u0091\2\u0199"+
		"\u01af\5&\24\2\u019a\u019b\7\u0110\2\2\u019b\u01af\5\20\t\2\u019c\u019d"+
		"\7\u0111\2\2\u019d\u01af\5\20\t\2\u019e\u019f\7\u00cf\2\2\u019f\u01a0"+
		"\7\u0112\2\2\u01a0\u01af\5\20\t\2\u01a1\u01a2\7\u0113\2\2\u01a2\u01af"+
		"\5\22\n\2\u01a3\u01a4\7\u0114\2\2\u01a4\u01af\5\22\n\2\u01a5\u01af\5\n"+
		"\6\2\u01a6\u01af\5\26\f\2\u01a7\u01af\5\30\r\2\u01a8\u01a9\7\u0117\2\2"+
		"\u01a9\u01aa\7\3\2\2\u01aa\u01ab\5\6\4\2\u01ab\u01ac\7\4\2\2\u01ac\u01af"+
		"\3\2\2\2\u01ad\u01af\7\u0118\2\2\u01ae\u016e\3\2\2\2\u01ae\u0173\3\2\2"+
		"\2\u01ae\u0178\3\2\2\2\u01ae\u017d\3\2\2\2\u01ae\u017e\3\2\2\2\u01ae\u017f"+
		"\3\2\2\2\u01ae\u0180\3\2\2\2\u01ae\u0181\3\2\2\2\u01ae\u0182\3\2\2\2\u01ae"+
		"\u0183\3\2\2\2\u01ae\u0188\3\2\2\2\u01ae\u018d\3\2\2\2\u01ae\u0192\3\2"+
		"\2\2\u01ae\u0197\3\2\2\2\u01ae\u0198\3\2\2\2\u01ae\u0199\3\2\2\2\u01ae"+
		"\u019a\3\2\2\2\u01ae\u019c\3\2\2\2\u01ae\u019e\3\2\2\2\u01ae\u01a1\3\2"+
		"\2\2\u01ae\u01a3\3\2\2\2\u01ae\u01a5\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae"+
		"\u01a7\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\5\3\2\2\2"+
		"\u01b0\u01b5\3\2\2\2\u01b1\u01b2\5\u010c\u0087\2\u01b2\u01b3\5\6\4\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b5\7\3\2\2\2"+
		"\u01b6\u01b7\b\5\1\2\u01b7\u01b8\7\u0125\2\2\u01b8\u01be\3\2\2\2\u01b9"+
		"\u01ba\f\3\2\2\u01ba\u01bb\7\5\2\2\u01bb\u01bd\7\u0125\2\2\u01bc\u01b9"+
		"\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\t\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7\u00c4\2\2\u01c2\u01ce\7\u0126"+
		"\2\2\u01c3\u01c4\7\u00c4\2\2\u01c4\u01c5\7\u0126\2\2\u01c5\u01c6\7\6\2"+
		"\2\u01c6\u01ce\7\u0126\2\2\u01c7\u01c8\7\u00c4\2\2\u01c8\u01c9\7\u0126"+
		"\2\2\u01c9\u01ca\7\6\2\2\u01ca\u01cb\7\u0126\2\2\u01cb\u01cc\7\6\2\2\u01cc"+
		"\u01ce\7\u0126\2\2\u01cd\u01c1\3\2\2\2\u01cd\u01c3\3\2\2\2\u01cd\u01c7"+
		"\3\2\2\2\u01ce\13\3\2\2\2\u01cf\u01d0\t\2\2\2\u01d0\r\3\2\2\2\u01d1\u01d4"+
		"\5\f\7\2\u01d2\u01d4\7\u0128\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2"+
		"\2\u01d4\17\3\2\2\2\u01d5\u01d6\7\u0129\2\2\u01d6\21\3\2\2\2\u01d7\u01d8"+
		"\7\u0129\2\2\u01d8\23\3\2\2\2\u01d9\u01e5\7\u012a\2\2\u01da\u01db\7!\2"+
		"\2\u01db\u01dc\7\7\2\2\u01dc\u01dd\5\20\t\2\u01dd\u01de\7\b\2\2\u01de"+
		"\u01e5\3\2\2\2\u01df\u01e0\7\"\2\2\u01e0\u01e1\7\7\2\2\u01e1\u01e2\5\22"+
		"\n\2\u01e2\u01e3\7\b\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01d9\3\2\2\2\u01e4"+
		"\u01da\3\2\2\2\u01e4\u01df\3\2\2\2\u01e5\25\3\2\2\2\u01e6\u01f3\7\u0115"+
		"\2\2\u01e7\u01e8\5\u0118\u008d\2\u01e8\u01e9\7\u0088\2\2\u01e9\u01f4\3"+
		"\2\2\2\u01ea\u01eb\5\u010c\u0087\2\u01eb\u01ec\7\u0088\2\2\u01ec\u01f4"+
		"\3\2\2\2\u01ed\u01ee\5n8\2\u01ee\u01ef\7\u0088\2\2\u01ef\u01f4\3\2\2\2"+
		"\u01f0\u01f1\5\32\16\2\u01f1\u01f2\7\u0088\2\2\u01f2\u01f4\3\2\2\2\u01f3"+
		"\u01e7\3\2\2\2\u01f3\u01ea\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01f0\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\5\16\b\2\u01f6\27\3\2\2\2\u01f7\u01f8"+
		"\7\u0119\2\2\u01f8\u01fa\5\16\b\2\u01f9\u01fb\5\b\5\2\u01fa\u01f9\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0208\3\2\2\2\u01fc\u01fd\7\u011a\2\2\u01fd"+
		"\u0208\5\16\b\2\u01fe\u01ff\7\u011b\2\2\u01ff\u0208\5\16\b\2\u0200\u0201"+
		"\7\u011c\2\2\u0201\u0208\5\16\b\2\u0202\u0208\7\u011d\2\2\u0203\u0208"+
		"\7\u011e\2\2\u0204\u0205\7\u011f\2\2\u0205\u0208\7\u0125\2\2\u0206\u0208"+
		"\7\t\2\2\u0207\u01f7\3\2\2\2\u0207\u01fc\3\2\2\2\u0207\u01fe\3\2\2\2\u0207"+
		"\u0200\3\2\2\2\u0207\u0202\3\2\2\2\u0207\u0203\3\2\2\2\u0207\u0204\3\2"+
		"\2\2\u0207\u0206\3\2\2\2\u0208\31\3\2\2\2\u0209\u020e\7\u00c5\2\2\u020a"+
		"\u020b\7\7\2\2\u020b\u020c\5\34\17\2\u020c\u020d\7\b\2\2\u020d\u020f\3"+
		"\2\2\2\u020e\u020a\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u021d\5f\64\2\u0211\u0212\7\n\2\2\u0212\u021e\5\b\5\2\u0213\u0214\7\n"+
		"\2\2\u0214\u0215\7\3\2\2\u0215\u0216\5\36\20\2\u0216\u0217\7\4\2\2\u0217"+
		"\u021e\3\2\2\2\u0218\u0219\7\n\2\2\u0219\u021a\7\7\2\2\u021a\u021b\5\u00c4"+
		"c\2\u021b\u021c\7\b\2\2\u021c\u021e\3\2\2\2\u021d\u0211\3\2\2\2\u021d"+
		"\u0213\3\2\2\2\u021d\u0218\3\2\2\2\u021e\33\3\2\2\2\u021f\u0222\5\u0110"+
		"\u0089\2\u0220\u0222\5n8\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222"+
		"\35\3\2\2\2\u0223\u0224\5 \21\2\u0224\u0225\5\"\22\2\u0225\37\3\2\2\2"+
		"\u0226\u0229\5\u00caf\2\u0227\u0229\5\30\r\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u022b\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022b!\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\5$\23\2\u022e\u022f"+
		"\5(\25\2\u022f\u0230\5\16\b\2\u0230\u0231\7\n\2\2\u0231\u0232\5\u00ca"+
		"f\2\u0232\u0235\3\2\2\2\u0233\u0235\5\30\r\2\u0234\u022d\3\2\2\2\u0234"+
		"\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0237\3\2\2\2\u0236\u0234\3\2"+
		"\2\2\u0237#\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\t\3\2\2\u023a%\3\2"+
		"\2\2\u023b\u023c\5\32\16\2\u023c\'\3\2\2\2\u023d\u023e\b\25\1\2\u023e"+
		"\u0247\5\u011a\u008e\2\u023f\u0247\7o\2\2\u0240\u0247\7,\2\2\u0241\u0242"+
		"\7\\\2\2\u0242\u0243\7\65\2\2\u0243\u0247\7\u0126\2\2\u0244\u0245\7\\"+
		"\2\2\u0245\u0247\5\u010c\u0087\2\u0246\u023d\3\2\2\2\u0246\u023f\3\2\2"+
		"\2\u0246\u0240\3\2\2\2\u0246\u0241\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u024d"+
		"\3\2\2\2\u0248\u0249\f\3\2\2\u0249\u024a\7\13\2\2\u024a\u024c\7\f\2\2"+
		"\u024b\u0248\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e"+
		"\3\2\2\2\u024e)\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0252\7\u00da\2\2\u0251"+
		"\u0253\7\u00d8\2\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254"+
		"\3\2\2\2\u0254\u0255\5\16\b\2\u0255+\3\2\2\2\u0256\u0257\7\u00ca\2\2\u0257"+
		"\u0258\7\13\2\2\u0258\u0259\5\20\t\2\u0259\u025a\7\f\2\2\u025a\u025b\5"+
		".\30\2\u025b\u025c\7@\2\2\u025c\u025d\5\f\7\2\u025d-\3\2\2\2\u025e\u026b"+
		"\b\30\1\2\u025f\u0260\f\7\2\2\u0260\u026a\7\36\2\2\u0261\u0262\f\6\2\2"+
		"\u0262\u026a\7\37\2\2\u0263\u0264\f\5\2\2\u0264\u026a\7\u00cb\2\2\u0265"+
		"\u0266\f\4\2\2\u0266\u026a\7\u00cc\2\2\u0267\u0268\f\3\2\2\u0268\u026a"+
		"\7\u00ce\2\2\u0269\u025f\3\2\2\2\u0269\u0261\3\2\2\2\u0269\u0263\3\2\2"+
		"\2\u0269\u0265\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c/\3\2\2\2\u026d\u026b\3\2\2\2\u026e"+
		"\u026f\5\62\32\2\u026f\u0270\5\u00c4c\2\u0270\u0271\7\b\2\2\u0271\61\3"+
		"\2\2\2\u0272\u0273\7\u00c9\2\2\u0273\u0274\7\n\2\2\u0274\u0275\7\7\2\2"+
		"\u0275\63\3\2\2\2\u0276\u0277\7\u009b\2\2\u0277\u0278\5\16\b\2\u0278\u0279"+
		"\b\33\1\2\u0279\65\3\2\2\2\u027a\u027b\7\u009a\2\2\u027b\67\3\2\2\2\u027c"+
		"\u0280\5\66\34\2\u027d\u027f\5<\37\2\u027e\u027d\3\2\2\2\u027f\u0282\3"+
		"\2\2\2\u0280\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0283\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0283\u0284\5\16\b\2\u0284\u0285\5J&\2\u0285\u0286\b\35"+
		"\1\2\u02869\3\2\2\2\u0287\u0288\58\35\2\u0288\u0289\5> \2\u0289\u028a"+
		"\5@!\2\u028a;\3\2\2\2\u028b\u02a6\7L\2\2\u028c\u02a6\7M\2\2\u028d\u02a6"+
		"\7E\2\2\u028e\u02a6\7\\\2\2\u028f\u02a6\7Q\2\2\u0290\u02a6\7R\2\2\u0291"+
		"\u02a6\7T\2\2\u0292\u02a6\7U\2\2\u0293\u02a6\7V\2\2\u0294\u02a6\7W\2\2"+
		"\u0295\u02a6\7X\2\2\u0296\u02a6\7Y\2\2\u0297\u02a6\7Z\2\2\u0298\u02a6"+
		"\7[\2\2\u0299\u02a6\7m\2\2\u029a\u02a6\7f\2\2\u029b\u029c\7S\2\2\u029c"+
		"\u02a6\t\4\2\2\u029d\u02a6\7c\2\2\u029e\u02a6\7I\2\2\u029f\u02a6\7v\2"+
		"\2\u02a0\u02a1\7)\2\2\u02a1\u02a2\7\7\2\2\u02a2\u02a3\5\20\t\2\u02a3\u02a4"+
		"\7\b\2\2\u02a4\u02a6\3\2\2\2\u02a5\u028b\3\2\2\2\u02a5\u028c\3\2\2\2\u02a5"+
		"\u028d\3\2\2\2\u02a5\u028e\3\2\2\2\u02a5\u028f\3\2\2\2\u02a5\u0290\3\2"+
		"\2\2\u02a5\u0291\3\2\2\2\u02a5\u0292\3\2\2\2\u02a5\u0293\3\2\2\2\u02a5"+
		"\u0294\3\2\2\2\u02a5\u0295\3\2\2\2\u02a5\u0296\3\2\2\2\u02a5\u0297\3\2"+
		"\2\2\u02a5\u0298\3\2\2\2\u02a5\u0299\3\2\2\2\u02a5\u029a\3\2\2\2\u02a5"+
		"\u029b\3\2\2\2\u02a5\u029d\3\2\2\2\u02a5\u029e\3\2\2\2\u02a5\u029f\3\2"+
		"\2\2\u02a5\u02a0\3\2\2\2\u02a6=\3\2\2\2\u02a7\u02a8\7=\2\2\u02a8\u02aa"+
		"\5\u0110\u0089\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa?\3\2\2"+
		"\2\u02ab\u02af\3\2\2\2\u02ac\u02ad\7>\2\2\u02ad\u02af\5D#\2\u02ae\u02ab"+
		"\3\2\2\2\u02ae\u02ac\3\2\2\2\u02afA\3\2\2\2\u02b0\u02b2\5Z.\2\u02b1\u02b0"+
		"\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4"+
		"C\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\b#\1\2\u02b7\u02b8\5\u0110\u0089"+
		"\2\u02b8\u02be\3\2\2\2\u02b9\u02ba\f\4\2\2\u02ba\u02bb\7\6\2\2\u02bb\u02bd"+
		"\5\u0110\u0089\2\u02bc\u02b9\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3"+
		"\2\2\2\u02be\u02bf\3\2\2\2\u02bfE\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c4"+
		"\3\2\2\2\u02c2\u02c4\5H%\2\u02c3\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4"+
		"G\3\2\2\2\u02c5\u02c6\b%\1\2\u02c6\u02c7\5\u0110\u0089\2\u02c7\u02cd\3"+
		"\2\2\2\u02c8\u02c9\f\3\2\2\u02c9\u02ca\7\6\2\2\u02ca\u02cc\5\u0110\u0089"+
		"\2\u02cb\u02c8\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce"+
		"\3\2\2\2\u02ceI\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d6\3\2\2\2\u02d1"+
		"\u02d2\7\r\2\2\u02d2\u02d3\5P)\2\u02d3\u02d4\7\16\2\2\u02d4\u02d6\3\2"+
		"\2\2\u02d5\u02d0\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d6K\3\2\2\2\u02d7\u02d8"+
		"\t\5\2\2\u02d8M\3\2\2\2\u02d9\u02de\3\2\2\2\u02da\u02db\5L\'\2\u02db\u02dc"+
		"\5N(\2\u02dc\u02de\3\2\2\2\u02dd\u02d9\3\2\2\2\u02dd\u02da\3\2\2\2\u02de"+
		"O\3\2\2\2\u02df\u02e1\5N(\2\u02e0\u02e2\5T+\2\u02e1\u02e0\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\5\16\b\2\u02e4\u02e5\5"+
		"R*\2\u02e5Q\3\2\2\2\u02e6\u02ea\3\2\2\2\u02e7\u02e8\7\6\2\2\u02e8\u02ea"+
		"\5P)\2\u02e9\u02e6\3\2\2\2\u02e9\u02e7\3\2\2\2\u02eaS\3\2\2\2\u02eb\u02ec"+
		"\7\7\2\2\u02ec\u02ed\5F$\2\u02ed\u02ee\7\b\2\2\u02eeU\3\2\2\2\u02ef\u02f2"+
		"\3\2\2\2\u02f0\u02f2\5X-\2\u02f1\u02ef\3\2\2\2\u02f1\u02f0\3\2\2\2\u02f2"+
		"W\3\2\2\2\u02f3\u02f4\7\r\2\2\u02f4\u02f5\7\13\2\2\u02f5\u02f6\5\20\t"+
		"\2\u02f6\u02f7\7\f\2\2\u02f7\u02f8\7\16\2\2\u02f8Y\3\2\2\2\u02f9\u02fa"+
		"\5\u0088E\2\u02fa\u02fb\7\3\2\2\u02fb\u02fc\5\u0096L\2\u02fc\u02fd\7\4"+
		"\2\2\u02fd\u0356\3\2\2\2\u02fe\u02ff\5:\36\2\u02ff\u0300\7\3\2\2\u0300"+
		"\u0301\5B\"\2\u0301\u0302\7\4\2\2\u0302\u0356\3\2\2\2\u0303\u0304\5p9"+
		"\2\u0304\u0305\7\3\2\2\u0305\u0306\5t;\2\u0306\u0307\7\4\2\2\u0307\u0356"+
		"\3\2\2\2\u0308\u0309\5x=\2\u0309\u030a\7\3\2\2\u030a\u030b\5|?\2\u030b"+
		"\u030c\7\4\2\2\u030c\u0356\3\2\2\2\u030d\u0356\5\\/\2\u030e\u0356\5\u00b2"+
		"Z\2\u030f\u0356\5\u0120\u0091\2\u0310\u0356\5\u0134\u009b\2\u0311\u0356"+
		"\5&\24\2\u0312\u0313\7\u00c7\2\2\u0313\u0356\5\20\t\2\u0314\u0315\7\u00c8"+
		"\2\2\u0315\u0356\5\20\t\2\u0316\u0317\5\u0158\u00ad\2\u0317\u0318\7\3"+
		"\2\2\u0318\u0319\5\u015c\u00af\2\u0319\u031a\7\4\2\2\u031a\u0356\3\2\2"+
		"\2\u031b\u033f\7\u00ff\2\2\u031c\u031d\5\u0110\u0089\2\u031d\u031e\7\25"+
		"\2\2\u031e\u031f\5\u008eH\2\u031f\u0320\7\u0100\2\2\u0320\u0321\5h\65"+
		"\2\u0321\u0322\5\u0118\u008d\2\u0322\u0323\5\u0110\u0089\2\u0323\u0324"+
		"\7\25\2\2\u0324\u0325\5\u008eH\2\u0325\u0326\7\7\2\2\u0326\u0327\5\u0106"+
		"\u0084\2\u0327\u0328\7\b\2\2\u0328\u0340\3\2\2\2\u0329\u032a\7h\2\2\u032a"+
		"\u032b\5h\65\2\u032b\u032c\5\u0118\u008d\2\u032c\u032d\5\u0110\u0089\2"+
		"\u032d\u032e\7\25\2\2\u032e\u032f\5\u008eH\2\u032f\u0330\5V,\2\u0330\u0331"+
		"\7\7\2\2\u0331\u0332\5\u0106\u0084\2\u0332\u0333\7\b\2\2\u0333\u0334\7"+
		"\u0100\2\2\u0334\u0335\7h\2\2\u0335\u0336\5h\65\2\u0336\u0337\5\u0118"+
		"\u008d\2\u0337\u0338\5\u0110\u0089\2\u0338\u0339\7\25\2\2\u0339\u033a"+
		"\5\u008eH\2\u033a\u033b\5V,\2\u033b\u033c\7\7\2\2\u033c\u033d\5\u0106"+
		"\u0084\2\u033d\u033e\7\b\2\2\u033e\u0340\3\2\2\2\u033f\u031c\3\2\2\2\u033f"+
		"\u0329\3\2\2\2\u0340\u0356\3\2\2\2\u0341\u0356\5\n\6\2\u0342\u0356\5\30"+
		"\r\2\u0343\u0344\7\u00fe\2\2\u0344\u034a\t\6\2\2\u0345\u0346\7\13\2\2"+
		"\u0346\u0347\5\20\t\2\u0347\u0348\7\f\2\2\u0348\u034b\3\2\2\2\u0349\u034b"+
		"\5\16\b\2\u034a\u0345\3\2\2\2\u034a\u0349\3\2\2\2\u034b\u034e\3\2\2\2"+
		"\u034c\u034d\7\6\2\2\u034d\u034f\5\u0110\u0089\2\u034e\u034c\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0356\3\2\2\2\u0350\u0351\7D\2\2\u0351\u0352\7o\2"+
		"\2\u0352\u0353\5\u0110\u0089\2\u0353\u0354\5\32\16\2\u0354\u0356\3\2\2"+
		"\2\u0355\u02f9\3\2\2\2\u0355\u02fe\3\2\2\2\u0355\u0303\3\2\2\2\u0355\u0308"+
		"\3\2\2\2\u0355\u030d\3\2\2\2\u0355\u030e\3\2\2\2\u0355\u030f\3\2\2\2\u0355"+
		"\u0310\3\2\2\2\u0355\u0311\3\2\2\2\u0355\u0312\3\2\2\2\u0355\u0314\3\2"+
		"\2\2\u0355\u0316\3\2\2\2\u0355\u031b\3\2\2\2\u0355\u0341\3\2\2\2\u0355"+
		"\u0342\3\2\2\2\u0355\u0343\3\2\2\2\u0355\u0350\3\2\2\2\u0356[\3\2\2\2"+
		"\u0357\u0358\7\u009d\2\2\u0358\u035c\5d\63\2\u0359\u035b\5^\60\2\u035a"+
		"\u0359\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035d\3\2\2\2\u035c\u035a\3\2"+
		"\2\2\u035d\u035f\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360\5\u0118\u008d"+
		"\2\u0360\u0361\5\16\b\2\u0361\u0362\5`\61\2\u0362\u0363\5b\62\2\u0363"+
		"]\3\2\2\2\u0364\u037c\7K\2\2\u0365\u037c\7L\2\2\u0366\u037c\7M\2\2\u0367"+
		"\u037c\7N\2\2\u0368\u037c\7|\2\2\u0369\u037c\7v\2\2\u036a\u037c\7I\2\2"+
		"\u036b\u036c\7\u00e2\2\2\u036c\u036d\7\7\2\2\u036d\u036e\5\u0084C\2\u036e"+
		"\u036f\7\b\2\2\u036f\u037c\3\2\2\2\u0370\u037c\7p\2\2\u0371\u037c\7q\2"+
		"\2\u0372\u037c\7r\2\2\u0373\u037c\7s\2\2\u0374\u037c\7z\2\2\u0375\u037c"+
		"\7{\2\2\u0376\u0377\7)\2\2\u0377\u0378\7\7\2\2\u0378\u0379\5\20\t\2\u0379"+
		"\u037a\7\b\2\2\u037a\u037c\3\2\2\2\u037b\u0364\3\2\2\2\u037b\u0365\3\2"+
		"\2\2\u037b\u0366\3\2\2\2\u037b\u0367\3\2\2\2\u037b\u0368\3\2\2\2\u037b"+
		"\u0369\3\2\2\2\u037b\u036a\3\2\2\2\u037b\u036b\3\2\2\2\u037b\u0370\3\2"+
		"\2\2\u037b\u0371\3\2\2\2\u037b\u0372\3\2\2\2\u037b\u0373\3\2\2\2\u037b"+
		"\u0374\3\2\2\2\u037b\u0375\3\2\2\2\u037b\u0376\3\2\2\2\u037c_\3\2\2\2"+
		"\u037d\u0381\3\2\2\2\u037e\u037f\7@\2\2\u037f\u0381\5\f\7\2\u0380\u037d"+
		"\3\2\2\2\u0380\u037e\3\2\2\2\u0381a\3\2\2\2\u0382\u0386\3\2\2\2\u0383"+
		"\u0384\7\n\2\2\u0384\u0386\5\u00c8e\2\u0385\u0382\3\2\2\2\u0385\u0383"+
		"\3\2\2\2\u0386c\3\2\2\2\u0387\u038d\3\2\2\2\u0388\u0389\7\13\2\2\u0389"+
		"\u038a\5\20\t\2\u038a\u038b\7\f\2\2\u038b\u038d\3\2\2\2\u038c\u0387\3"+
		"\2\2\2\u038c\u0388\3\2\2\2\u038de\3\2\2\2\u038e\u038f\5h\65\2\u038f\u0393"+
		"\5\u0118\u008d\2\u0390\u0391\5\u0110\u0089\2\u0391\u0392\7\25\2\2\u0392"+
		"\u0394\3\2\2\2\u0393\u0390\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2"+
		"\2\2\u0395\u0398\5\u008eH\2\u0396\u0399\5\u0100\u0081\2\u0397\u0399\5"+
		"X-\2\u0398\u0396\3\2\2\2\u0398\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u039b\7\7\2\2\u039b\u039c\5\u0106\u0084\2\u039c\u039d\7\b\2\2\u039dg"+
		"\3\2\2\2\u039e\u03a0\t\7\2\2\u039f\u039e\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1"+
		"\u03a2\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03aa\3\2\2\2\u03a3\u03a1\3\2"+
		"\2\2\u03a4\u03ab\5j\66\2\u03a5\u03a6\7*\2\2\u03a6\u03a7\7\7\2\2\u03a7"+
		"\u03a8\5\20\t\2\u03a8\u03a9\7\b\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a4\3"+
		"\2\2\2\u03aa\u03a5\3\2\2\2\u03aa\u03ab\3\2\2\2\u03abi\3\2\2\2\u03ac\u03b1"+
		"\7/\2\2\u03ad\u03b1\7\61\2\2\u03ae\u03af\7\67\2\2\u03af\u03b1\t\b\2\2"+
		"\u03b0\u03ac\3\2\2\2\u03b0\u03ad\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1k\3"+
		"\2\2\2\u03b2\u03b3\7+\2\2\u03b3\u03b4\7\7\2\2\u03b4\u03b5\5\20\t\2\u03b5"+
		"\u03b6\7\b\2\2\u03b6m\3\2\2\2\u03b7\u03b8\5\u00e0q\2\u03b8\u03b9\5f\64"+
		"\2\u03b9\u03c6\3\2\2\2\u03ba\u03bb\7i\2\2\u03bb\u03bc\5\u0118\u008d\2"+
		"\u03bc\u03bd\5\u0110\u0089\2\u03bd\u03be\7\25\2\2\u03be\u03bf\5\16\b\2"+
		"\u03bf\u03c6\3\2\2\2\u03c0\u03c1\7i\2\2\u03c1\u03c2\5\u0118\u008d\2\u03c2"+
		"\u03c3\5\16\b\2\u03c3\u03c6\3\2\2\2\u03c4\u03c6\5l\67\2\u03c5\u03b7\3"+
		"\2\2\2\u03c5\u03ba\3\2\2\2\u03c5\u03c0\3\2\2\2\u03c5\u03c4\3\2\2\2\u03c6"+
		"o\3\2\2\2\u03c7\u03c8\7\u00a8\2\2\u03c8\u03c9\5r:\2\u03c9\u03ca\5\u0110"+
		"\u0089\2\u03ca\u03cb\5\16\b\2\u03cb\u03d1\3\2\2\2\u03cc\u03cd\7\u00a8"+
		"\2\2\u03cd\u03ce\5r:\2\u03ce\u03cf\5\16\b\2\u03cf\u03d1\3\2\2\2\u03d0"+
		"\u03c7\3\2\2\2\u03d0\u03cc\3\2\2\2\u03d1q\3\2\2\2\u03d2\u03d9\b:\1\2\u03d3"+
		"\u03d4\f\4\2\2\u03d4\u03d8\7v\2\2\u03d5\u03d6\f\3\2\2\u03d6\u03d8\7I\2"+
		"\2\u03d7\u03d3\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7"+
		"\3\2\2\2\u03d9\u03da\3\2\2\2\u03das\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc"+
		"\u03de\5v<\2\u03dd\u03dc\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03e0\3\2\2"+
		"\2\u03df\u03dd\3\2\2\2\u03e0u\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03e3"+
		"\7\u00a9\2\2\u03e3\u03ef\5f\64\2\u03e4\u03e5\7\u00aa\2\2\u03e5\u03ef\5"+
		"f\64\2\u03e6\u03e7\7\u00ab\2\2\u03e7\u03ef\5f\64\2\u03e8\u03e9\7\u00ac"+
		"\2\2\u03e9\u03ef\5f\64\2\u03ea\u03ef\5\u0134\u009b\2\u03eb\u03ef\5&\24"+
		"\2\u03ec\u03ef\5\n\6\2\u03ed\u03ef\5\30\r\2\u03ee\u03e2\3\2\2\2\u03ee"+
		"\u03e4\3\2\2\2\u03ee\u03e6\3\2\2\2\u03ee\u03e8\3\2\2\2\u03ee\u03ea\3\2"+
		"\2\2\u03ee\u03eb\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ed\3\2\2\2\u03ef"+
		"w\3\2\2\2\u03f0\u03f1\7\u00ad\2\2\u03f1\u03f2\5z>\2\u03f2\u03f3\5h\65"+
		"\2\u03f3\u03f4\5\u0118\u008d\2\u03f4\u03f5\5\16\b\2\u03f5\u03f6\7\7\2"+
		"\2\u03f6\u03f7\5\u0106\u0084\2\u03f7\u03f8\7\b\2\2\u03f8\u03f9\5b\62\2"+
		"\u03f9y\3\2\2\2\u03fa\u0401\b>\1\2\u03fb\u03fc\f\4\2\2\u03fc\u0400\7v"+
		"\2\2\u03fd\u03fe\f\3\2\2\u03fe\u0400\7I\2\2\u03ff\u03fb\3\2\2\2\u03ff"+
		"\u03fd\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2"+
		"\2\2\u0402{\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0406\5~@\2\u0405\u0404"+
		"\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0408\3\2\2\2\u0407\u0405\3\2\2\2\u0408"+
		"}\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u040b\7\u00ae\2\2\u040b\u0415\5f\64"+
		"\2\u040c\u040d\7\u00af\2\2\u040d\u0415\5f\64\2\u040e\u040f\7\u00ac\2\2"+
		"\u040f\u0415\5f\64\2\u0410\u0415\5&\24\2\u0411\u0415\5\u0134\u009b\2\u0412"+
		"\u0415\5\n\6\2\u0413\u0415\5\30\r\2\u0414\u040a\3\2\2\2\u0414\u040c\3"+
		"\2\2\2\u0414\u040e\3\2\2\2\u0414\u0410\3\2\2\2\u0414\u0411\3\2\2\2\u0414"+
		"\u0412\3\2\2\2\u0414\u0413\3\2\2\2\u0415\177\3\2\2\2\u0416\u0417\7\u009c"+
		"\2\2\u0417\u0081\3\2\2\2\u0418\u041f\3\2\2\2\u0419\u041a\7\u00e2\2\2\u041a"+
		"\u041b\7\7\2\2\u041b\u041c\5\u0084C\2\u041c\u041d\7\b\2\2\u041d\u041f"+
		"\3\2\2\2\u041e\u0418\3\2\2\2\u041e\u0419\3\2\2\2\u041f\u0083\3\2\2\2\u0420"+
		"\u0426\5\u0112\u008a\2\u0421\u0422\5\u0086D\2\u0422\u0423\5\u00c6d\2\u0423"+
		"\u0424\7\4\2\2\u0424\u0426\3\2\2\2\u0425\u0420\3\2\2\2\u0425\u0421\3\2"+
		"\2\2\u0426\u0085\3\2\2\2\u0427\u0428\7\3\2\2\u0428\u0087\3\2\2\2\u0429"+
		"\u042d\5\u0080A\2\u042a\u042c\5\u008aF\2\u042b\u042a\3\2\2\2\u042c\u042f"+
		"\3\2\2\2\u042d\u042e\3\2\2\2\u042d\u042b\3\2\2\2\u042e\u0430\3\2\2\2\u042f"+
		"\u042d\3\2\2\2\u0430\u0434\5h\65\2\u0431\u0433\5\u0090I\2\u0432\u0431"+
		"\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0435\3\2\2\2\u0434\u0432\3\2\2\2\u0435"+
		"\u0437\3\2\2\2\u0436\u0434\3\2\2\2\u0437\u0438\5\u0118\u008d\2\u0438\u0439"+
		"\5\u0082B\2\u0439\u043a\5\u008eH\2\u043a\u043b\5J&\2\u043b\u043c\7\7\2"+
		"\2\u043c\u043d\5\u0106\u0084\2\u043d\u0441\7\b\2\2\u043e\u0440\5\u0092"+
		"J\2\u043f\u043e\3\2\2\2\u0440\u0443\3\2\2\2\u0441\u0442\3\2\2\2\u0441"+
		"\u043f\3\2\2\2\u0442\u0089\3\2\2\2\u0443\u0441\3\2\2\2\u0444\u046c\7K"+
		"\2\2\u0445\u046c\7L\2\2\u0446\u046c\7M\2\2\u0447\u046c\7N\2\2\u0448\u046c"+
		"\7O\2\2\u0449\u046c\7I\2\2\u044a\u046c\7]\2\2\u044b\u046c\7d\2\2\u044c"+
		"\u046c\7T\2\2\u044d\u046c\7p\2\2\u044e\u046c\7q\2\2\u044f\u046c\7r\2\2"+
		"\u0450\u046c\7s\2\2\u0451\u046c\7t\2\2\u0452\u046c\7u\2\2\u0453\u046c"+
		"\7v\2\2\u0454\u046c\7b\2\2\u0455\u046c\7}\2\2\u0456\u0457\7)\2\2\u0457"+
		"\u0458\7\7\2\2\u0458\u0459\5\20\t\2\u0459\u045a\7\b\2\2\u045a\u046c\3"+
		"\2\2\2\u045b\u045c\7w\2\2\u045c\u045e\7\7\2\2\u045d\u045f\5\b\5\2\u045e"+
		"\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0462\3\2\2\2\u0460\u0461\7\u0088"+
		"\2\2\u0461\u0463\5\b\5\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0467\3\2\2\2\u0464\u0466\5\u008cG\2\u0465\u0464\3\2\2\2\u0466\u0469"+
		"\3\2\2\2\u0467\u0468\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u046a\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u046a\u046c\7\b\2\2\u046b\u0444\3\2\2\2\u046b\u0445\3\2"+
		"\2\2\u046b\u0446\3\2\2\2\u046b\u0447\3\2\2\2\u046b\u0448\3\2\2\2\u046b"+
		"\u0449\3\2\2\2\u046b\u044a\3\2\2\2\u046b\u044b\3\2\2\2\u046b\u044c\3\2"+
		"\2\2\u046b\u044d\3\2\2\2\u046b\u044e\3\2\2\2\u046b\u044f\3\2\2\2\u046b"+
		"\u0450\3\2\2\2\u046b\u0451\3\2\2\2\u046b\u0452\3\2\2\2\u046b\u0453\3\2"+
		"\2\2\u046b\u0454\3\2\2\2\u046b\u0455\3\2\2\2\u046b\u0456\3\2\2\2\u046b"+
		"\u045b\3\2\2\2\u046c\u008b\3\2\2\2\u046d\u0489\7\u0085\2\2\u046e\u0489"+
		"\7X\2\2\u046f\u0489\7Y\2\2\u0470\u0489\7Z\2\2\u0471\u0489\7\u0086\2\2"+
		"\u0472\u0489\7\u0087\2\2\u0473\u0489\7\60\2\2\u0474\u0489\7\62\2\2\u0475"+
		"\u0489\7\63\2\2\u0476\u0489\7\64\2\2\u0477\u0478\7\u0089\2\2\u0478\u0479"+
		"\7\20\2\2\u0479\u0489\7\u008a\2\2\u047a\u047b\7\u0089\2\2\u047b\u047c"+
		"\7\20\2\2\u047c\u0489\7\u008b\2\2\u047d\u047e\7\u008c\2\2\u047e\u047f"+
		"\7\20\2\2\u047f\u0489\7\u008a\2\2\u0480\u0481\7\u008c\2\2\u0481\u0482"+
		"\7\20\2\2\u0482\u0489\7\u008b\2\2\u0483\u0484\7)\2\2\u0484\u0485\7\7\2"+
		"\2\u0485\u0486\5\20\t\2\u0486\u0487\7\b\2\2\u0487\u0489\3\2\2\2\u0488"+
		"\u046d\3\2\2\2\u0488\u046e\3\2\2\2\u0488\u046f\3\2\2\2\u0488\u0470\3\2"+
		"\2\2\u0488\u0471\3\2\2\2\u0488\u0472\3\2\2\2\u0488\u0473\3\2\2\2\u0488"+
		"\u0474\3\2\2\2\u0488\u0475\3\2\2\2\u0488\u0476\3\2\2\2\u0488\u0477\3\2"+
		"\2\2\u0488\u047a\3\2\2\2\u0488\u047d\3\2\2\2\u0488\u0480\3\2\2\2\u0488"+
		"\u0483\3\2\2\2\u0489\u008d\3\2\2\2\u048a\u048e\7x\2\2\u048b\u048e\7y\2"+
		"\2\u048c\u048e\5\16\b\2\u048d\u048a\3\2\2\2\u048d\u048b\3\2\2\2\u048d"+
		"\u048c\3\2\2\2\u048e\u008f\3\2\2\2\u048f\u0490\7\13\2\2\u0490\u0491\7"+
		"\u00fb\2\2\u0491\u049d\7\f\2\2\u0492\u0493\7\13\2\2\u0493\u0494\7\u00fc"+
		"\2\2\u0494\u049d\7\f\2\2\u0495\u0496\7\13\2\2\u0496\u0497\7\u00fd\2\2"+
		"\u0497\u049d\7\f\2\2\u0498\u0499\7\13\2\2\u0499\u049a\5\20\t\2\u049a\u049b"+
		"\7\f\2\2\u049b\u049d\3\2\2\2\u049c\u048f\3\2\2\2\u049c\u0492\3\2\2\2\u049c"+
		"\u0495\3\2\2\2\u049c\u0498\3\2\2\2\u049d\u0091\3\2\2\2\u049e\u04b2\7G"+
		"\2\2\u049f\u04b2\7~\2\2\u04a0\u04b2\7\177\2\2\u04a1\u04b2\7\u0080\2\2"+
		"\u04a2\u04b2\7\67\2\2\u04a3\u04b2\7\u0081\2\2\u04a4\u04b2\7\u0082\2\2"+
		"\u04a5\u04b2\7\u0083\2\2\u04a6\u04b2\7\u0084\2\2\u04a7\u04b2\7P\2\2\u04a8"+
		"\u04b2\7^\2\2\u04a9\u04b2\7_\2\2\u04aa\u04b2\7`\2\2\u04ab\u04b2\7a\2\2"+
		"\u04ac\u04ad\7)\2\2\u04ad\u04ae\7\7\2\2\u04ae\u04af\5\20\t\2\u04af\u04b0"+
		"\7\b\2\2\u04b0\u04b2\3\2\2\2\u04b1\u049e\3\2\2\2\u04b1\u049f\3\2\2\2\u04b1"+
		"\u04a0\3\2\2\2\u04b1\u04a1\3\2\2\2\u04b1\u04a2\3\2\2\2\u04b1\u04a3\3\2"+
		"\2\2\u04b1\u04a4\3\2\2\2\u04b1\u04a5\3\2\2\2\u04b1\u04a6\3\2\2\2\u04b1"+
		"\u04a7\3\2\2\2\u04b1\u04a8\3\2\2\2\u04b1\u04a9\3\2\2\2\u04b1\u04aa\3\2"+
		"\2\2\u04b1\u04ab\3\2\2\2\u04b1\u04ac\3\2\2\2\u04b2\u0093\3\2\2\2\u04b3"+
		"\u04b4\7\u00a5\2\2\u04b4\u0095\3\2\2\2\u04b5\u04b7\5\u0098M\2\u04b6\u04b5"+
		"\3\2\2\2\u04b7\u04ba\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b9"+
		"\u0097\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u04bc\7\u00a2\2\2\u04bc\u0511"+
		"\5\20\t\2\u04bd\u0511\5\u009eP\2\u04be\u04bf\7\u00a4\2\2\u04bf\u0511\5"+
		"\20\t\2\u04c0\u04c2\5\u0094K\2\u04c1\u04c3\7\u00c6\2\2\u04c2\u04c1\3\2"+
		"\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\7\7\2\2\u04c5"+
		"\u04c6\5\u0106\u0084\2\u04c6\u04c7\7\b\2\2\u04c7\u0511\3\2\2\2\u04c8\u0511"+
		"\7\u00a6\2\2\u04c9\u0511\7\u00a7\2\2\u04ca\u0511\5\u00b2Z\2\u04cb\u04cc"+
		"\5\f\7\2\u04cc\u04cd\7\20\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04cb\3\2\2\2"+
		"\u04ce\u04cf\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u0511\5\u00fc\177\2\u04d1"+
		"\u0511\5\u0120\u0091\2\u04d2\u0511\5\u0134\u009b\2\u04d3\u0511\5\n\6\2"+
		"\u04d4\u0511\5&\24\2\u04d5\u0511\5\30\r\2\u04d6\u04d7\7\u00db\2\2\u04d7"+
		"\u04d8\7\13\2\2\u04d8\u04d9\5\20\t\2\u04d9\u04dc\7\f\2\2\u04da\u04db\7"+
		"\u0088\2\2\u04db\u04dd\5\f\7\2\u04dc\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2"+
		"\u04dd\u0511\3\2\2\2\u04de\u04df\7\u00cd\2\2\u04df\u04e0\5\20\t\2\u04e0"+
		"\u04e1\7\20\2\2\u04e1\u04e2\5\20\t\2\u04e2\u0511\3\2\2\2\u04e3\u04e8\7"+
		"\u00ff\2\2\u04e4\u04e5\7h\2\2\u04e5\u04e6\5h\65\2\u04e6\u04e7\5\u0118"+
		"\u008d\2\u04e7\u04e9\3\2\2\2\u04e8\u04e4\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04ea\3\2\2\2\u04ea\u04eb\5\u0110\u0089\2\u04eb\u04ec\7\25\2\2\u04ec"+
		"\u04f2\5\u008eH\2\u04ed\u04ee\5V,\2\u04ee\u04ef\7\7\2\2\u04ef\u04f0\5"+
		"\u0106\u0084\2\u04f0\u04f1\7\b\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04ed\3\2"+
		"\2\2\u04f2\u04f3\3\2\2\2\u04f3\u0511\3\2\2\2\u04f4\u0511\5\u009aN\2\u04f5"+
		"\u050e\7\u00fe\2\2\u04f6\u04fc\7o\2\2\u04f7\u04f8\7\13\2\2\u04f8\u04f9"+
		"\5\20\t\2\u04f9\u04fa\7\f\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04fd\5\16\b\2"+
		"\u04fc\u04f7\3\2\2\2\u04fc\u04fb\3\2\2\2\u04fd\u050f\3\2\2\2\u04fe\u0504"+
		"\7\u0120\2\2\u04ff\u0500\7\13\2\2\u0500\u0501\5\20\t\2\u0501\u0502\7\f"+
		"\2\2\u0502\u0505\3\2\2\2\u0503\u0505\5\16\b\2\u0504\u04ff\3\2\2\2\u0504"+
		"\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\7\6\2\2\u0507\u0508\5\u0110"+
		"\u0089\2\u0508\u050f\3\2\2\2\u0509\u050a\7\13\2\2\u050a\u050b\5\20\t\2"+
		"\u050b\u050c\7\f\2\2\u050c\u050d\5b\62\2\u050d\u050f\3\2\2\2\u050e\u04f6"+
		"\3\2\2\2\u050e\u04fe\3\2\2\2\u050e\u0509\3\2\2\2\u050f\u0511\3\2\2\2\u0510"+
		"\u04bb\3\2\2\2\u0510\u04bd\3\2\2\2\u0510\u04be\3\2\2\2\u0510\u04c0\3\2"+
		"\2\2\u0510\u04c8\3\2\2\2\u0510\u04c9\3\2\2\2\u0510\u04ca\3\2\2\2\u0510"+
		"\u04ce\3\2\2\2\u0510\u04d1\3\2\2\2\u0510\u04d2\3\2\2\2\u0510\u04d3\3\2"+
		"\2\2\u0510\u04d4\3\2\2\2\u0510\u04d5\3\2\2\2\u0510\u04d6\3\2\2\2\u0510"+
		"\u04de\3\2\2\2\u0510\u04e3\3\2\2\2\u0510\u04f4\3\2\2\2\u0510\u04f5\3\2"+
		"\2\2\u0511\u0099\3\2\2\2\u0512\u0513\5\u009cO\2\u0513\u0514\5\u0096L\2"+
		"\u0514\u0515\7\4\2\2\u0515\u009b\3\2\2\2\u0516\u0517\7\3\2\2\u0517\u009d"+
		"\3\2\2\2\u0518\u0519\5\u00a2R\2\u0519\u051a\5\u00a0Q\2\u051a\u009f\3\2"+
		"\2\2\u051b\u051c\5\u00a4S\2\u051c\u051d\5\u00a0Q\2\u051d\u0520\3\2\2\2"+
		"\u051e\u0520\5\u00a4S\2\u051f\u051b\3\2\2\2\u051f\u051e\3\2\2\2\u0520"+
		"\u00a1\3\2\2\2\u0521\u052b\7\u00a3\2\2\u0522\u052c\5\u009aN\2\u0523\u0524"+
		"\5\f\7\2\u0524\u0525\7?\2\2\u0525\u0526\5\f\7\2\u0526\u052c\3\2\2\2\u0527"+
		"\u0528\5\20\t\2\u0528\u0529\7?\2\2\u0529\u052a\5\20\t\2\u052a\u052c\3"+
		"\2\2\2\u052b\u0522\3\2\2\2\u052b\u0523\3\2\2\2\u052b\u0527\3\2\2\2\u052c"+
		"\u00a3\3\2\2\2\u052d\u052e\5\u00aaV\2\u052e\u052f\5\u00b0Y\2\u052f\u053a"+
		"\3\2\2\2\u0530\u0531\5\u00a6T\2\u0531\u0532\5\u00b0Y\2\u0532\u053a\3\2"+
		"\2\2\u0533\u0534\5\u00acW\2\u0534\u0535\5\u00b0Y\2\u0535\u053a\3\2\2\2"+
		"\u0536\u0537\5\u00aeX\2\u0537\u0538\5\u00b0Y\2\u0538\u053a\3\2\2\2\u0539"+
		"\u052d\3\2\2\2\u0539\u0530\3\2\2\2\u0539\u0533\3\2\2\2\u0539\u0536\3\2"+
		"\2\2\u053a\u00a5\3\2\2\2\u053b\u053c\5\u00a8U\2\u053c\u053d\5\u009aN\2"+
		"\u053d\u0545\3\2\2\2\u053e\u053f\5\u00a8U\2\u053f\u0540\5\f\7\2\u0540"+
		"\u0545\3\2\2\2\u0541\u0542\5\u00a8U\2\u0542\u0543\5\20\t\2\u0543\u0545"+
		"\3\2\2\2\u0544\u053b\3\2\2\2\u0544\u053e\3\2\2\2\u0544\u0541\3\2\2\2\u0545"+
		"\u00a7\3\2\2\2\u0546\u0547\7;\2\2\u0547\u00a9\3\2\2\2\u0548\u0549\7:\2"+
		"\2\u0549\u054a\5\u0110\u0089\2\u054a\u00ab\3\2\2\2\u054b\u054c\78\2\2"+
		"\u054c\u00ad\3\2\2\2\u054d\u054e\7<\2\2\u054e\u00af\3\2\2\2\u054f\u055b"+
		"\5\u009aN\2\u0550\u0551\79\2\2\u0551\u0552\5\f\7\2\u0552\u0553\7?\2\2"+
		"\u0553\u0554\5\f\7\2\u0554\u055b\3\2\2\2\u0555\u0556\79\2\2\u0556\u0557"+
		"\5\20\t\2\u0557\u0558\7?\2\2\u0558\u0559\5\20\t\2\u0559\u055b\3\2\2\2"+
		"\u055a\u054f\3\2\2\2\u055a\u0550\3\2\2\2\u055a\u0555\3\2\2\2\u055b\u00b1"+
		"\3\2\2\2\u055c\u055d\5\u00b4[\2\u055d\u055e\5\u00b8]\2\u055e\u00b3\3\2"+
		"\2\2\u055f\u0560\7\u009e\2\2\u0560\u0561\5\u00b6\\\2\u0561\u0562\5\f\7"+
		"\2\u0562\u0563\7\n\2\2\u0563\u0567\3\2\2\2\u0564\u0565\7\u009e\2\2\u0565"+
		"\u0567\5\u00b6\\\2\u0566\u055f\3\2\2\2\u0566\u0564\3\2\2\2\u0567\u00b5"+
		"\3\2\2\2\u0568\u056c\3\2\2\2\u0569\u056c\7A\2\2\u056a\u056c\7~\2\2\u056b"+
		"\u0568\3\2\2\2\u056b\u0569\3\2\2\2\u056b\u056a\3\2\2\2\u056c\u00b7\3\2"+
		"\2\2\u056d\u056e\7\3\2\2\u056e\u056f\5\u00ba^\2\u056f\u0570\7\4\2\2\u0570"+
		"\u0573\3\2\2\2\u0571\u0573\5\u00be`\2\u0572\u056d\3\2\2\2\u0572\u0571"+
		"\3\2\2\2\u0573\u00b9\3\2\2\2\u0574\u0575\5\u00be`\2\u0575\u0576\7\6\2"+
		"\2\u0576\u0577\5\u00ba^\2\u0577\u057a\3\2\2\2\u0578\u057a\5\u00be`\2\u0579"+
		"\u0574\3\2\2\2\u0579\u0578\3\2\2\2\u057a\u00bb\3\2\2\2\u057b\u0581\3\2"+
		"\2\2\u057c\u057d\7\13\2\2\u057d\u057e\5\20\t\2\u057e\u057f\7\f\2\2\u057f"+
		"\u0581\3\2\2\2\u0580\u057b\3\2\2\2\u0580\u057c\3\2\2\2\u0581\u00bd\3\2"+
		"\2\2\u0582\u0583\7\31\2\2\u0583\u0584\7\21\2\2\u0584\u0585\7\7\2\2\u0585"+
		"\u0586\5\b\5\2\u0586\u0587\7\b\2\2\u0587\u05c2\3\2\2\2\u0588\u0589\7\22"+
		"\2\2\u0589\u058a\7\7\2\2\u058a\u058b\5\f\7\2\u058b\u058c\7\b\2\2\u058c"+
		"\u05c2\3\2\2\2\u058d\u058e\5\u00c2b\2\u058e\u058f\5\u00c4c\2\u058f\u0590"+
		"\7\b\2\2\u0590\u05c2\3\2\2\2\u0591\u0592\7!\2\2\u0592\u0593\7\7\2\2\u0593"+
		"\u0594\5\24\13\2\u0594\u0595\7\b\2\2\u0595\u0596\5\u00bc_\2\u0596\u05c2"+
		"\3\2\2\2\u0597\u0598\7\"\2\2\u0598\u0599\7\7\2\2\u0599\u059a\5\24\13\2"+
		"\u059a\u059b\7\b\2\2\u059b\u059c\5\u00bc_\2\u059c\u05c2\3\2\2\2\u059d"+
		"\u059e\7\37\2\2\u059e\u059f\7\7\2\2\u059f\u05a0\5\22\n\2\u05a0\u05a1\7"+
		"\b\2\2\u05a1\u05a2\5\u00bc_\2\u05a2\u05c2\3\2\2\2\u05a3\u05a4\7\36\2\2"+
		"\u05a4\u05a5\7\7\2\2\u05a5\u05a6\5\20\t\2\u05a6\u05a7\7\b\2\2\u05a7\u05a8"+
		"\5\u00bc_\2\u05a8\u05c2\3\2\2\2\u05a9\u05aa\7\35\2\2\u05aa\u05ab\7\7\2"+
		"\2\u05ab\u05ac\5\20\t\2\u05ac\u05ad\7\b\2\2\u05ad\u05ae\5\u00bc_\2\u05ae"+
		"\u05c2\3\2\2\2\u05af\u05b0\7\34\2\2\u05b0\u05b1\7\7\2\2\u05b1\u05b2\5"+
		"\20\t\2\u05b2\u05b3\7\b\2\2\u05b3\u05b4\5\u00bc_\2\u05b4\u05c2\3\2\2\2"+
		"\u05b5\u05b6\7!\2\2\u05b6\u05c2\5\u00bc_\2\u05b7\u05b8\7\"\2\2\u05b8\u05c2"+
		"\5\u00bc_\2\u05b9\u05ba\7\37\2\2\u05ba\u05c2\5\u00bc_\2\u05bb\u05bc\7"+
		"\36\2\2\u05bc\u05c2\5\u00bc_\2\u05bd\u05be\7\35\2\2\u05be\u05c2\5\u00bc"+
		"_\2\u05bf\u05c0\7\34\2\2\u05c0\u05c2\5\u00bc_\2\u05c1\u0582\3\2\2\2\u05c1"+
		"\u0588\3\2\2\2\u05c1\u058d\3\2\2\2\u05c1\u0591\3\2\2\2\u05c1\u0597\3\2"+
		"\2\2\u05c1\u059d\3\2\2\2\u05c1\u05a3\3\2\2\2\u05c1\u05a9\3\2\2\2\u05c1"+
		"\u05af\3\2\2\2\u05c1\u05b5\3\2\2\2\u05c1\u05b7\3\2\2\2\u05c1\u05b9\3\2"+
		"\2\2\u05c1\u05bb\3\2\2\2\u05c1\u05bd\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2"+
		"\u00bf\3\2\2\2\u05c3\u05c4\7!\2\2\u05c4\u05c5\7\7\2\2\u05c5\u05c6\5\24"+
		"\13\2\u05c6\u05c7\7\b\2\2\u05c7\u0626\3\2\2\2\u05c8\u05c9\7\"\2\2\u05c9"+
		"\u05ca\7\7\2\2\u05ca\u05cb\5\24\13\2\u05cb\u05cc\7\b\2\2\u05cc\u0626\3"+
		"\2\2\2\u05cd\u05ce\7!\2\2\u05ce\u05cf\7\7\2\2\u05cf\u05d0\5\20\t\2\u05d0"+
		"\u05d1\7\b\2\2\u05d1\u0626\3\2\2\2\u05d2\u05d3\7\"\2\2\u05d3\u05d4\7\7"+
		"\2\2\u05d4\u05d5\5\22\n\2\u05d5\u05d6\7\b\2\2\u05d6\u0626\3\2\2\2\u05d7"+
		"\u05d8\7\37\2\2\u05d8\u05d9\7\7\2\2\u05d9\u05da\5\22\n\2\u05da\u05db\7"+
		"\b\2\2\u05db\u0626\3\2\2\2\u05dc\u05dd\7\36\2\2\u05dd\u05de\7\7\2\2\u05de"+
		"\u05df\5\20\t\2\u05df\u05e0\7\b\2\2\u05e0\u0626\3\2\2\2\u05e1\u05e2\7"+
		"\35\2\2\u05e2\u05e3\7\7\2\2\u05e3\u05e4\5\20\t\2\u05e4\u05e5\7\b\2\2\u05e5"+
		"\u0626\3\2\2\2\u05e6\u05e7\7\34\2\2\u05e7\u05e8\7\7\2\2\u05e8\u05e9\5"+
		"\20\t\2\u05e9\u05ea\7\b\2\2\u05ea\u0626\3\2\2\2\u05eb\u05ec\7\32\2\2\u05ec"+
		"\u05ed\7\37\2\2\u05ed\u05ee\7\7\2\2\u05ee\u05ef\5\22\n\2\u05ef\u05f0\7"+
		"\b\2\2\u05f0\u0626\3\2\2\2\u05f1\u05f2\7\32\2\2\u05f2\u05f3\7\36\2\2\u05f3"+
		"\u05f4\7\7\2\2\u05f4\u05f5\5\20\t\2\u05f5\u05f6\7\b\2\2\u05f6\u0626\3"+
		"\2\2\2\u05f7\u05f8\7\32\2\2\u05f8\u05f9\7\35\2\2\u05f9\u05fa\7\7\2\2\u05fa"+
		"\u05fb\5\20\t\2\u05fb\u05fc\7\b\2\2\u05fc\u0626\3\2\2\2\u05fd\u05fe\7"+
		"\32\2\2\u05fe\u05ff\7\34\2\2\u05ff\u0600\7\7\2\2\u0600\u0601\5\20\t\2"+
		"\u0601\u0602\7\b\2\2\u0602\u0626\3\2\2\2\u0603\u0604\7(\2\2\u0604\u0605"+
		"\7\7\2\2\u0605\u0606\5\22\n\2\u0606\u0607\7\b\2\2\u0607\u0626\3\2\2\2"+
		"\u0608\u0609\7\'\2\2\u0609\u060a\7\7\2\2\u060a\u060b\5\20\t\2\u060b\u060c"+
		"\7\b\2\2\u060c\u0626\3\2\2\2\u060d\u060e\7&\2\2\u060e\u060f\7\7\2\2\u060f"+
		"\u0610\5\20\t\2\u0610\u0611\7\b\2\2\u0611\u0626\3\2\2\2\u0612\u0613\7"+
		"%\2\2\u0613\u0614\7\7\2\2\u0614\u0615\5\20\t\2\u0615\u0616\7\b\2\2\u0616"+
		"\u0626\3\2\2\2\u0617\u0618\7\31\2\2\u0618\u0619\7\7\2\2\u0619\u061a\5"+
		"\20\t\2\u061a\u061b\7\b\2\2\u061b\u0626\3\2\2\2\u061c\u061d\7\30\2\2\u061d"+
		"\u061e\7\7\2\2\u061e\u061f\5\u012c\u0097\2\u061f\u0620\7\b\2\2\u0620\u0626"+
		"\3\2\2\2\u0621\u0622\5\u00c2b\2\u0622\u0623\5\u00c4c\2\u0623\u0624\7\b"+
		"\2\2\u0624\u0626\3\2\2\2\u0625\u05c3\3\2\2\2\u0625\u05c8\3\2\2\2\u0625"+
		"\u05cd\3\2\2\2\u0625\u05d2\3\2\2\2\u0625\u05d7\3\2\2\2\u0625\u05dc\3\2"+
		"\2\2\u0625\u05e1\3\2\2\2\u0625\u05e6\3\2\2\2\u0625\u05eb\3\2\2\2\u0625"+
		"\u05f1\3\2\2\2\u0625\u05f7\3\2\2\2\u0625\u05fd\3\2\2\2\u0625\u0603\3\2"+
		"\2\2\u0625\u0608\3\2\2\2\u0625\u060d\3\2\2\2\u0625\u0612\3\2\2\2\u0625"+
		"\u0617\3\2\2\2\u0625\u061c\3\2\2\2\u0625\u0621\3\2\2\2\u0626\u00c1\3\2"+
		"\2\2\u0627\u0628\7#\2\2\u0628\u0629\7\7\2\2\u0629\u00c3\3\2\2\2\u062a"+
		"\u062d\3\2\2\2\u062b\u062d\5\u00c6d\2\u062c\u062a\3\2\2\2\u062c\u062b"+
		"\3\2\2\2\u062d\u00c5\3\2\2\2\u062e\u062f\bd\1\2\u062f\u0630\7\u012b\2"+
		"\2\u0630\u0635\3\2\2\2\u0631\u0632\f\3\2\2\u0632\u0634\7\u012b\2\2\u0633"+
		"\u0631\3\2\2\2\u0634\u0637\3\2\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2"+
		"\2\2\u0636\u00c7\3\2\2\2\u0637\u0635\3\2\2\2\u0638\u063c\5\u00c0a\2\u0639"+
		"\u063c\5\b\5\2\u063a\u063c\7.\2\2\u063b\u0638\3\2\2\2\u063b\u0639\3\2"+
		"\2\2\u063b\u063a\3\2\2\2\u063c\u00c9\3\2\2\2\u063d\u06f6\5\u00c0a\2\u063e"+
		"\u063f\7-\2\2\u063f\u0640\7\7\2\2\u0640\u0641\7.\2\2\u0641\u06f6\7\b\2"+
		"\2\u0642\u0643\7-\2\2\u0643\u0644\7\7\2\2\u0644\u0645\7\u0126\2\2\u0645"+
		"\u06f6\7\b\2\2\u0646\u0647\7o\2\2\u0647\u0648\7\7\2\2\u0648\u0649\7\65"+
		"\2\2\u0649\u064a\7\u0126\2\2\u064a\u06f6\7\b\2\2\u064b\u064c\7o\2\2\u064c"+
		"\u064d\7\7\2\2\u064d\u064e\5\u010c\u0087\2\u064e\u064f\7\b\2\2\u064f\u06f6"+
		"\3\2\2\2\u0650\u0651\7o\2\2\u0651\u0652\7\7\2\2\u0652\u0653\7.\2\2\u0653"+
		"\u06f6\7\b\2\2\u0654\u0655\7,\2\2\u0655\u0656\7\7\2\2\u0656\u0657\5\u00ca"+
		"f\2\u0657\u0658\7\b\2\2\u0658\u06f6\3\2\2\2\u0659\u065a\7!\2\2\u065a\u065b"+
		"\7\13\2\2\u065b\u065c\5\20\t\2\u065c\u065d\7\f\2\2\u065d\u065e\7\7\2\2"+
		"\u065e\u065f\5\u00ccg\2\u065f\u0660\7\b\2\2\u0660\u06f6\3\2\2\2\u0661"+
		"\u0662\7\"\2\2\u0662\u0663\7\13\2\2\u0663\u0664\5\20\t\2\u0664\u0665\7"+
		"\f\2\2\u0665\u0666\7\7\2\2\u0666\u0667\5\u00ceh\2\u0667\u0668\7\b\2\2"+
		"\u0668\u06f6\3\2\2\2\u0669\u066a\7\37\2\2\u066a\u066b\7\13\2\2\u066b\u066c"+
		"\5\20\t\2\u066c\u066d\7\f\2\2\u066d\u066e\7\7\2\2\u066e\u066f\5\u00d0"+
		"i\2\u066f\u0670\7\b\2\2\u0670\u06f6\3\2\2\2\u0671\u0672\7\36\2\2\u0672"+
		"\u0673\7\13\2\2\u0673\u0674\5\20\t\2\u0674\u0675\7\f\2\2\u0675\u0676\7"+
		"\7\2\2\u0676\u0677\5\u00d2j\2\u0677\u0678\7\b\2\2\u0678\u06f6\3\2\2\2"+
		"\u0679\u067a\7\35\2\2\u067a\u067b\7\13\2\2\u067b\u067c\5\20\t\2\u067c"+
		"\u067d\7\f\2\2\u067d\u067e\7\7\2\2\u067e\u067f\5\u00d4k\2\u067f\u0680"+
		"\7\b\2\2\u0680\u06f6\3\2\2\2\u0681\u0682\7\34\2\2\u0682\u0683\7\13\2\2"+
		"\u0683\u0684\5\20\t\2\u0684\u0685\7\f\2\2\u0685\u0686\7\7\2\2\u0686\u0687"+
		"\5\u00d6l\2\u0687\u0688\7\b\2\2\u0688\u06f6\3\2\2\2\u0689\u068a\7(\2\2"+
		"\u068a\u068b\7\13\2\2\u068b\u068c\5\20\t\2\u068c\u068d\7\f\2\2\u068d\u068e"+
		"\7\7\2\2\u068e\u068f\5\u00d0i\2\u068f\u0690\7\b\2\2\u0690\u06f6\3\2\2"+
		"\2\u0691\u0692\7\'\2\2\u0692\u0693\7\13\2\2\u0693\u0694\5\20\t\2\u0694"+
		"\u0695\7\f\2\2\u0695\u0696\7\7\2\2\u0696\u0697\5\u00d2j\2\u0697\u0698"+
		"\7\b\2\2\u0698\u06f6\3\2\2\2\u0699\u069a\7&\2\2\u069a\u069b\7\13\2\2\u069b"+
		"\u069c\5\20\t\2\u069c\u069d\7\f\2\2\u069d\u069e\7\7\2\2\u069e\u069f\5"+
		"\u00d4k\2\u069f\u06a0\7\b\2\2\u06a0\u06f6\3\2\2\2\u06a1\u06a2\7%\2\2\u06a2"+
		"\u06a3\7\13\2\2\u06a3\u06a4\5\20\t\2\u06a4\u06a5\7\f\2\2\u06a5\u06a6\7"+
		"\7\2\2\u06a6\u06a7\5\u00d6l\2\u06a7\u06a8\7\b\2\2\u06a8\u06f6\3\2\2\2"+
		"\u06a9\u06aa\7\32\2\2\u06aa\u06ab\7\37\2\2\u06ab\u06ac\7\13\2\2\u06ac"+
		"\u06ad\5\20\t\2\u06ad\u06ae\7\f\2\2\u06ae\u06af\7\7\2\2\u06af\u06b0\5"+
		"\u00d0i\2\u06b0\u06b1\7\b\2\2\u06b1\u06f6\3\2\2\2\u06b2\u06b3\7\32\2\2"+
		"\u06b3\u06b4\7\36\2\2\u06b4\u06b5\7\13\2\2\u06b5\u06b6\5\20\t\2\u06b6"+
		"\u06b7\7\f\2\2\u06b7\u06b8\7\7\2\2\u06b8\u06b9\5\u00d2j\2\u06b9\u06ba"+
		"\7\b\2\2\u06ba\u06f6\3\2\2\2\u06bb\u06bc\7\32\2\2\u06bc\u06bd\7\35\2\2"+
		"\u06bd\u06be\7\13\2\2\u06be\u06bf\5\20\t\2\u06bf\u06c0\7\f\2\2\u06c0\u06c1"+
		"\7\7\2\2\u06c1\u06c2\5\u00d4k\2\u06c2\u06c3\7\b\2\2\u06c3\u06f6\3\2\2"+
		"\2\u06c4\u06c5\7\32\2\2\u06c5\u06c6\7\34\2\2\u06c6\u06c7\7\13\2\2\u06c7"+
		"\u06c8\5\20\t\2\u06c8\u06c9\7\f\2\2\u06c9\u06ca\7\7\2\2\u06ca\u06cb\5"+
		"\u00d6l\2\u06cb\u06cc\7\b\2\2\u06cc\u06f6\3\2\2\2\u06cd\u06ce\7\31\2\2"+
		"\u06ce\u06cf\7\13\2\2\u06cf\u06d0\5\20\t\2\u06d0\u06d1\7\f\2\2\u06d1\u06d2"+
		"\7\7\2\2\u06d2\u06d3\5\u00d4k\2\u06d3\u06d4\7\b\2\2\u06d4\u06f6\3\2\2"+
		"\2\u06d5\u06d6\7\30\2\2\u06d6\u06d7\7\13\2\2\u06d7\u06d8\5\20\t\2\u06d8"+
		"\u06d9\7\f\2\2\u06d9\u06da\7\7\2\2\u06da\u06db\5\u00d8m\2\u06db\u06dc"+
		"\7\b\2\2\u06dc\u06f6\3\2\2\2\u06dd\u06de\7-\2\2\u06de\u06df\7\13\2\2\u06df"+
		"\u06e0\5\20\t\2\u06e0\u06e1\7\f\2\2\u06e1\u06e2\7\7\2\2\u06e2\u06e3\5"+
		"\u00dan\2\u06e3\u06e4\7\b\2\2\u06e4\u06f6\3\2\2\2\u06e5\u06e6\7o\2\2\u06e6"+
		"\u06e7\7\13\2\2\u06e7\u06e8\5\20\t\2\u06e8\u06e9\7\f\2\2\u06e9\u06ea\7"+
		"\7\2\2\u06ea\u06eb\5\u00dco\2\u06eb\u06ec\7\b\2\2\u06ec\u06f6\3\2\2\2"+
		"\u06ed\u06ee\7,\2\2\u06ee\u06ef\7\13\2\2\u06ef\u06f0\5\20\t\2\u06f0\u06f1"+
		"\7\f\2\2\u06f1\u06f2\7\7\2\2\u06f2\u06f3\5\u00dep\2\u06f3\u06f4\7\b\2"+
		"\2\u06f4\u06f6\3\2\2\2\u06f5\u063d\3\2\2\2\u06f5\u063e\3\2\2\2\u06f5\u0642"+
		"\3\2\2\2\u06f5\u0646\3\2\2\2\u06f5\u064b\3\2\2\2\u06f5\u0650\3\2\2\2\u06f5"+
		"\u0654\3\2\2\2\u06f5\u0659\3\2\2\2\u06f5\u0661\3\2\2\2\u06f5\u0669\3\2"+
		"\2\2\u06f5\u0671\3\2\2\2\u06f5\u0679\3\2\2\2\u06f5\u0681\3\2\2\2\u06f5"+
		"\u0689\3\2\2\2\u06f5\u0691\3\2\2\2\u06f5\u0699\3\2\2\2\u06f5\u06a1\3\2"+
		"\2\2\u06f5\u06a9\3\2\2\2\u06f5\u06b2\3\2\2\2\u06f5\u06bb\3\2\2\2\u06f5"+
		"\u06c4\3\2\2\2\u06f5\u06cd\3\2\2\2\u06f5\u06d5\3\2\2\2\u06f5\u06dd\3\2"+
		"\2\2\u06f5\u06e5\3\2\2\2\u06f5\u06ed\3\2\2\2\u06f6\u00cb\3\2\2\2\u06f7"+
		"\u06fe\bg\1\2\u06f8\u06f9\f\4\2\2\u06f9\u06fd\5\24\13\2\u06fa\u06fb\f"+
		"\3\2\2\u06fb\u06fd\5\20\t\2\u06fc\u06f8\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fd"+
		"\u0700\3\2\2\2\u06fe\u06fc\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u00cd\3\2"+
		"\2\2\u0700\u06fe\3\2\2\2\u0701\u0708\bh\1\2\u0702\u0703\f\4\2\2\u0703"+
		"\u0707\5\24\13\2\u0704\u0705\f\3\2\2\u0705\u0707\5\22\n\2\u0706\u0702"+
		"\3\2\2\2\u0706\u0704\3\2\2\2\u0707\u070a\3\2\2\2\u0708\u0706\3\2\2\2\u0708"+
		"\u0709\3\2\2\2\u0709\u00cf\3\2\2\2\u070a\u0708\3\2\2\2\u070b\u0710\bi"+
		"\1\2\u070c\u070d\f\3\2\2\u070d\u070f\5\22\n\2\u070e\u070c\3\2\2\2\u070f"+
		"\u0712\3\2\2\2\u0710\u070e\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u00d1\3\2"+
		"\2\2\u0712\u0710\3\2\2\2\u0713\u0718\bj\1\2\u0714\u0715\f\3\2\2\u0715"+
		"\u0717\5\20\t\2\u0716\u0714\3\2\2\2\u0717\u071a\3\2\2\2\u0718\u0716\3"+
		"\2\2\2\u0718\u0719\3\2\2\2\u0719\u00d3\3\2\2\2\u071a\u0718\3\2\2\2\u071b"+
		"\u0720\bk\1\2\u071c\u071d\f\3\2\2\u071d\u071f\5\20\t\2\u071e\u071c\3\2"+
		"\2\2\u071f\u0722\3\2\2\2\u0720\u071e\3\2\2\2\u0720\u0721\3\2\2\2\u0721"+
		"\u00d5\3\2\2\2\u0722\u0720\3\2\2\2\u0723\u0728\bl\1\2\u0724\u0725\f\3"+
		"\2\2\u0725\u0727\5\20\t\2\u0726\u0724\3\2\2\2\u0727\u072a\3\2\2\2\u0728"+
		"\u0726\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u00d7\3\2\2\2\u072a\u0728\3\2"+
		"\2\2\u072b\u0730\bm\1\2\u072c\u072d\f\3\2\2\u072d\u072f\5\u012c\u0097"+
		"\2\u072e\u072c\3\2\2\2\u072f\u0732\3\2\2\2\u0730\u072e\3\2\2\2\u0730\u0731"+
		"\3\2\2\2\u0731\u00d9\3\2\2\2\u0732\u0730\3\2\2\2\u0733\u073a\bn\1\2\u0734"+
		"\u0735\f\4\2\2\u0735\u0739\7.\2\2\u0736\u0737\f\3\2\2\u0737\u0739\7\u0126"+
		"\2\2\u0738\u0734\3\2\2\2\u0738\u0736\3\2\2\2\u0739\u073c\3\2\2\2\u073a"+
		"\u0738\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u00db\3\2\2\2\u073c\u073a\3\2"+
		"\2\2\u073d\u0747\bo\1\2\u073e\u073f\f\5\2\2\u073f\u0746\7.\2\2\u0740\u0741"+
		"\f\4\2\2\u0741\u0742\7\65\2\2\u0742\u0746\7\u0126\2\2\u0743\u0744\f\3"+
		"\2\2\u0744\u0746\5\u010c\u0087\2\u0745\u073e\3\2\2\2\u0745\u0740\3\2\2"+
		"\2\u0745\u0743\3\2\2\2\u0746\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0747\u0748"+
		"\3\2\2\2\u0748\u00dd\3\2\2\2\u0749\u0747\3\2\2\2\u074a\u074f\bp\1\2\u074b"+
		"\u074c\f\3\2\2\u074c\u074e\5\u00caf\2\u074d\u074b\3\2\2\2\u074e\u0751"+
		"\3\2\2\2\u074f\u074d\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u00df\3\2\2\2\u0751"+
		"\u074f\3\2\2\2\u0752\u0753\7h\2\2\u0753\u00e1\3\2\2\2\u0754\u0755\7\u008d"+
		"\2\2\u0755\u00e3\3\2\2\2\u0756\u0759\7\u008e\2\2\u0757\u075a\5\20\t\2"+
		"\u0758\u075a\5\f\7\2\u0759\u0757\3\2\2\2\u0759\u0758\3\2\2\2\u075a\u00e5"+
		"\3\2\2\2\u075b\u075c\7\u008f\2\2\u075c\u075d\5\22\n\2\u075d\u00e7\3\2"+
		"\2\2\u075e\u075f\7\u0090\2\2\u075f\u0760\5\22\n\2\u0760\u00e9\3\2\2\2"+
		"\u0761\u0768\7\u0091\2\2\u0762\u0769\5\24\13\2\u0763\u0769\5\22\n\2\u0764"+
		"\u0765\7\7\2\2\u0765\u0766\5\u00c4c\2\u0766\u0767\7\b\2\2\u0767\u0769"+
		"\3\2\2\2\u0768\u0762\3\2\2\2\u0768\u0763\3\2\2\2\u0768\u0764\3\2\2\2\u0769"+
		"\u00eb\3\2\2\2\u076a\u076d\7\u0094\2\2\u076b\u076e\5\f\7\2\u076c\u076e"+
		"\5\20\t\2\u076d\u076b\3\2\2\2\u076d\u076c\3\2\2\2\u076e\u00ed\3\2\2\2"+
		"\u076f\u0770\7\u0092\2\2\u0770\u0771\5f\64\2\u0771\u00ef\3\2\2\2\u0772"+
		"\u0773\7\u0098\2\2\u0773\u0777\5\u0118\u008d\2\u0774\u0775\5\u0110\u0089"+
		"\2\u0775\u0776\7\25\2\2\u0776\u0778\3\2\2\2\u0777\u0774\3\2\2\2\u0777"+
		"\u0778\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077a\5\16\b\2\u077a\u00f1\3"+
		"\2\2\2\u077b\u077c\7\u0096\2\2\u077c\u077d\5\u0110\u0089\2\u077d\u00f3"+
		"\3\2\2\2\u077e\u0789\7\u0097\2\2\u077f\u078a\5\b\5\2\u0780\u0781\7X\2"+
		"\2\u0781\u0782\7\7\2\2\u0782\u0783\5\b\5\2\u0783\u0784\7\b\2\2\u0784\u078a"+
		"\3\2\2\2\u0785\u0786\5\u00c2b\2\u0786\u0787\5\u00c4c\2\u0787\u0788\7\b"+
		"\2\2\u0788\u078a\3\2\2\2\u0789\u077f\3\2\2\2\u0789\u0780\3\2\2\2\u0789"+
		"\u0785\3\2\2\2\u078a\u00f5\3\2\2\2\u078b\u078c\7\u0093\2\2\u078c\u078d"+
		"\5h\65\2\u078d\u078e\5\u0118\u008d\2\u078e\u078f\7\7\2\2\u078f\u0790\5"+
		"\u0106\u0084\2\u0790\u0791\7\b\2\2\u0791\u00f7\3\2\2\2\u0792\u0793\7\u0099"+
		"\2\2\u0793\u0794\5\34\17\2\u0794\u00f9\3\2\2\2\u0795\u0796\7\u0095\2\2"+
		"\u0796\u0797\7\7\2\2\u0797\u0798\5\u00fe\u0080\2\u0798\u0799\7\b\2\2\u0799"+
		"\u00fb\3\2\2\2\u079a\u07a8\5\u00e2r\2\u079b\u07a8\5\u00e4s\2\u079c\u07a8"+
		"\5\u00e6t\2\u079d\u07a8\5\u00e8u\2\u079e\u07a8\5\u00eav\2\u079f\u07a8"+
		"\5\u00ecw\2\u07a0\u07a8\5\u00eex\2\u07a1\u07a8\5\u00f0y\2\u07a2\u07a8"+
		"\5\u00f2z\2\u07a3\u07a8\5\u00f4{\2\u07a4\u07a8\5\u00f6|\2\u07a5\u07a8"+
		"\5\u00f8}\2\u07a6\u07a8\5\u00fa~\2\u07a7\u079a\3\2\2\2\u07a7\u079b\3\2"+
		"\2\2\u07a7\u079c\3\2\2\2\u07a7\u079d\3\2\2\2\u07a7\u079e\3\2\2\2\u07a7"+
		"\u079f\3\2\2\2\u07a7\u07a0\3\2\2\2\u07a7\u07a1\3\2\2\2\u07a7\u07a2\3\2"+
		"\2\2\u07a7\u07a3\3\2\2\2\u07a7\u07a4\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a7"+
		"\u07a6\3\2\2\2\u07a8\u00fd\3\2\2\2\u07a9\u07b5\3\2\2\2\u07aa\u07ab\5\f"+
		"\7\2\u07ab\u07ac\7\6\2\2\u07ac\u07ad\5\u00fe\u0080\2\u07ad\u07b5\3\2\2"+
		"\2\u07ae\u07af\5\20\t\2\u07af\u07b0\7\6\2\2\u07b0\u07b1\5\u00fe\u0080"+
		"\2\u07b1\u07b5\3\2\2\2\u07b2\u07b5\5\f\7\2\u07b3\u07b5\5\20\t\2\u07b4"+
		"\u07a9\3\2\2\2\u07b4\u07aa\3\2\2\2\u07b4\u07ae\3\2\2\2\u07b4\u07b2\3\2"+
		"\2\2\u07b4\u07b3\3\2\2\2\u07b5\u00ff\3\2\2\2\u07b6\u07bc\3\2\2\2\u07b7"+
		"\u07b8\7\r\2\2\u07b8\u07b9\5\u0102\u0082\2\u07b9\u07ba\7\16\2\2\u07ba"+
		"\u07bc\3\2\2\2\u07bb\u07b6\3\2\2\2\u07bb\u07b7\3\2\2\2\u07bc\u0101\3\2"+
		"\2\2\u07bd\u07c0\3\2\2\2\u07be\u07c0\5\u0104\u0083\2\u07bf\u07bd\3\2\2"+
		"\2\u07bf\u07be\3\2\2\2\u07c0\u0103\3\2\2\2\u07c1\u07c2\b\u0083\1\2\u07c2"+
		"\u07c3\5\u0118\u008d\2\u07c3\u07c9\3\2\2\2\u07c4\u07c5\f\3\2\2\u07c5\u07c6"+
		"\7\6\2\2\u07c6\u07c8\5\u0118\u008d\2\u07c7\u07c4\3\2\2\2\u07c8\u07cb\3"+
		"\2\2\2\u07c9\u07c7\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u0105\3\2\2\2\u07cb"+
		"\u07c9\3\2\2\2\u07cc\u07ce\5\u0108\u0085\2\u07cd\u07cc\3\2\2\2\u07cd\u07ce"+
		"\3\2\2\2\u07ce\u0107\3\2\2\2\u07cf\u07d4\5\u010a\u0086\2\u07d0\u07d1\7"+
		"\6\2\2\u07d1\u07d3\5\u010a\u0086\2\u07d2\u07d0\3\2\2\2\u07d3\u07d6\3\2"+
		"\2\2\u07d4\u07d5\3\2\2\2\u07d4\u07d2\3\2\2\2\u07d5\u0109\3\2\2\2\u07d6"+
		"\u07d4\3\2\2\2\u07d7\u07e0\7\26\2\2\u07d8\u07d9\5\u0118\u008d\2\u07d9"+
		"\u07da\5\u0082B\2\u07da\u07e0\3\2\2\2\u07db\u07dc\5\u0118\u008d\2\u07dc"+
		"\u07dd\5\u0082B\2\u07dd\u07de\5\f\7\2\u07de\u07e0\3\2\2\2\u07df\u07d7"+
		"\3\2\2\2\u07df\u07d8\3\2\2\2\u07df\u07db\3\2\2\2\u07e0\u010b\3\2\2\2\u07e1"+
		"\u07e2\7\13\2\2\u07e2\u07e3\5\16\b\2\u07e3\u07e4\7\f\2\2\u07e4\u07e5\5"+
		"\u010e\u0088\2\u07e5\u07fb\3\2\2\2\u07e6\u07e7\7\13\2\2\u07e7\u07e8\5"+
		"l\67\2\u07e8\u07e9\7\f\2\2\u07e9\u07ea\5\u010e\u0088\2\u07ea\u07fb\3\2"+
		"\2\2\u07eb\u07ec\7\13\2\2\u07ec\u07ed\7\21\2\2\u07ed\u07ee\7\f\2\2\u07ee"+
		"\u07fb\5\u010e\u0088\2\u07ef\u07f0\7\13\2\2\u07f0\u07f1\7\u00da\2\2\u07f1"+
		"\u07f2\5\16\b\2\u07f2\u07f3\7\f\2\2\u07f3\u07f4\5\u010e\u0088\2\u07f4"+
		"\u07fb\3\2\2\2\u07f5\u07fb\5\u010e\u0088\2\u07f6\u07fb\5l\67\2\u07f7\u07fb"+
		"\7\u009f\2\2\u07f8\u07fb\7\u00a0\2\2\u07f9\u07fb\7\u00a1\2\2\u07fa\u07e1"+
		"\3\2\2\2\u07fa\u07e6\3\2\2\2\u07fa\u07eb\3\2\2\2\u07fa\u07ef\3\2\2\2\u07fa"+
		"\u07f5\3\2\2\2\u07fa\u07f6\3\2\2\2\u07fa\u07f7\3\2\2\2\u07fa\u07f8\3\2"+
		"\2\2\u07fa\u07f9\3\2\2\2\u07fb\u010d\3\2\2\2\u07fc\u0801\5\16\b\2\u07fd"+
		"\u07fe\7\23\2\2\u07fe\u0800\5\16\b\2\u07ff\u07fd\3\2\2\2\u0800\u0803\3"+
		"\2\2\2\u0801\u0802\3\2\2\2\u0801\u07ff\3\2\2\2\u0802\u010f\3\2\2\2\u0803"+
		"\u0801\3\2\2\2\u0804\u0810\5\u010c\u0087\2\u0805\u0806\7\13\2\2\u0806"+
		"\u0807\5\16\b\2\u0807\u0808\7\f\2\2\u0808\u0810\3\2\2\2\u0809\u080a\7"+
		"\13\2\2\u080a\u080b\7\u00da\2\2\u080b\u080c\5\16\b\2\u080c\u080d\7\f\2"+
		"\2\u080d\u0810\3\2\2\2\u080e\u0810\5\u0118\u008d\2\u080f\u0804\3\2\2\2"+
		"\u080f\u0805\3\2\2\2\u080f\u0809\3\2\2\2\u080f\u080e\3\2\2\2\u0810\u0111"+
		"\3\2\2\2\u0811\u086f\b\u008a\1\2\u0812\u0813\7\u00e3\2\2\u0813\u0814\7"+
		"\7\2\2\u0814\u0815\5\b\5\2\u0815\u0816\7\6\2\2\u0816\u0817\5\b\5\2\u0817"+
		"\u0818\7\6\2\2\u0818\u0819\5\b\5\2\u0819\u081a\7\6\2\2\u081a\u081b\5\b"+
		"\5\2\u081b\u081c\7\b\2\2\u081c\u086f\3\2\2\2\u081d\u081e\7\u00e3\2\2\u081e"+
		"\u081f\7\7\2\2\u081f\u0820\5\b\5\2\u0820\u0821\7\6\2\2\u0821\u0822\5\b"+
		"\5\2\u0822\u0823\7\b\2\2\u0823\u086f\3\2\2\2\u0824\u0825\7\u00e5\2\2\u0825"+
		"\u0826\7\u00e4\2\2\u0826\u0827\7\13\2\2\u0827\u0828\5\20\t\2\u0828\u0829"+
		"\7\f\2\2\u0829\u086f\3\2\2\2\u082a\u082b\7\u00e5\2\2\u082b\u082c\7\u00f8"+
		"\2\2\u082c\u082d\7\13\2\2\u082d\u082e\5\20\t\2\u082e\u082f\7\f\2\2\u082f"+
		"\u0830\5\u0112\u008a\64\u0830\u086f\3\2\2\2\u0831\u086f\7\u00e6\2\2\u0832"+
		"\u086f\7\u00e7\2\2\u0833\u086f\7\u00e8\2\2\u0834\u086f\7\27\2\2\u0835"+
		"\u086f\7\30\2\2\u0836\u086f\7\34\2\2\u0837\u086f\7\35\2\2\u0838\u086f"+
		"\7\36\2\2\u0839\u086f\7\37\2\2\u083a\u086f\7!\2\2\u083b\u086f\7\"\2\2"+
		"\u083c\u086f\7\u0124\2\2\u083d\u083e\7\32\2\2\u083e\u086f\7\34\2\2\u083f"+
		"\u0840\7\32\2\2\u0840\u086f\7\35\2\2\u0841\u0842\7\32\2\2\u0842\u086f"+
		"\7\36\2\2\u0843\u0844\7\32\2\2\u0844\u086f\7\37\2\2\u0845\u086f\7%\2\2"+
		"\u0846\u086f\7&\2\2\u0847\u086f\7\'\2\2\u0848\u086f\7(\2\2\u0849\u086f"+
		"\7\u00e9\2\2\u084a\u086f\7\u00ea\2\2\u084b\u086f\7\u00eb\2\2\u084c\u086f"+
		"\7\u00ed\2\2\u084d\u086f\7\u00ee\2\2\u084e\u086f\7\u00ef\2\2\u084f\u086f"+
		"\7\u00f0\2\2\u0850\u0851\7\u00f1\2\2\u0851\u086f\5\u0114\u008b\2\u0852"+
		"\u0853\7\u00f2\2\2\u0853\u086f\5\u0114\u008b\2\u0854\u086f\7\u00f3\2\2"+
		"\u0855\u0856\7Q\2\2\u0856\u086f\5\u0114\u008b\2\u0857\u0858\7\u00f4\2"+
		"\2\u0858\u086f\5\u0116\u008c\2\u0859\u085a\7\u00f4\2\2\u085a\u085b\5\u0116"+
		"\u008c\2\u085b\u085c\7\6\2\2\u085c\u085d\5\b\5\2\u085d\u086f\3\2\2\2\u085e"+
		"\u086f\7\33\2\2\u085f\u0860\7\32\2\2\u0860\u086f\7\33\2\2\u0861\u086f"+
		"\7$\2\2\u0862\u0863\7S\2\2\u0863\u086f\7\u00f3\2\2\u0864\u086f\7\u00f5"+
		"\2\2\u0865\u0866\7X\2\2\u0866\u086f\7\u00eb\2\2\u0867\u086f\7\u00ec\2"+
		"\2\u0868\u0869\7\u00e6\2\2\u0869\u086f\7\30\2\2\u086a\u086f\7h\2\2\u086b"+
		"\u086c\7\u0088\2\2\u086c\u086f\7\u00f7\2\2\u086d\u086f\7\u00f9\2\2\u086e"+
		"\u0811\3\2\2\2\u086e\u0812\3\2\2\2\u086e\u081d\3\2\2\2\u086e\u0824\3\2"+
		"\2\2\u086e\u082a\3\2\2\2\u086e\u0831\3\2\2\2\u086e\u0832\3\2\2\2\u086e"+
		"\u0833\3\2\2\2\u086e\u0834\3\2\2\2\u086e\u0835\3\2\2\2\u086e\u0836\3\2"+
		"\2\2\u086e\u0837\3\2\2\2\u086e\u0838\3\2\2\2\u086e\u0839\3\2\2\2\u086e"+
		"\u083a\3\2\2\2\u086e\u083b\3\2\2\2\u086e\u083c\3\2\2\2\u086e\u083d\3\2"+
		"\2\2\u086e\u083f\3\2\2\2\u086e\u0841\3\2\2\2\u086e\u0843\3\2\2\2\u086e"+
		"\u0845\3\2\2\2\u086e\u0846\3\2\2\2\u086e\u0847\3\2\2\2\u086e\u0848\3\2"+
		"\2\2\u086e\u0849\3\2\2\2\u086e\u084a\3\2\2\2\u086e\u084b\3\2\2\2\u086e"+
		"\u084c\3\2\2\2\u086e\u084d\3\2\2\2\u086e\u084e\3\2\2\2\u086e\u084f\3\2"+
		"\2\2\u086e\u0850\3\2\2\2\u086e\u0852\3\2\2\2\u086e\u0854\3\2\2\2\u086e"+
		"\u0855\3\2\2\2\u086e\u0857\3\2\2\2\u086e\u0859\3\2\2\2\u086e\u085e\3\2"+
		"\2\2\u086e\u085f\3\2\2\2\u086e\u0861\3\2\2\2\u086e\u0862\3\2\2\2\u086e"+
		"\u0864\3\2\2\2\u086e\u0865\3\2\2\2\u086e\u0867\3\2\2\2\u086e\u0868\3\2"+
		"\2\2\u086e\u086a\3\2\2\2\u086e\u086b\3\2\2\2\u086e\u086d\3\2\2\2\u086f"+
		"\u0889\3\2\2\2\u0870\u0871\f\37\2\2\u0871\u0888\7\21\2\2\u0872\u0873\f"+
		"\36\2\2\u0873\u0874\7\13\2\2\u0874\u0888\7\f\2\2\u0875\u0876\f\35\2\2"+
		"\u0876\u0877\7\13\2\2\u0877\u0878\5\20\t\2\u0878\u0879\7\f\2\2\u0879\u0888"+
		"\3\2\2\2\u087a\u087b\f\34\2\2\u087b\u087c\7\13\2\2\u087c\u087d\5\20\t"+
		"\2\u087d\u087e\7\5\2\2\u087e\u087f\5\20\t\2\u087f\u0880\7\f\2\2\u0880"+
		"\u0888\3\2\2\2\u0881\u0882\f\33\2\2\u0882\u0883\7\13\2\2\u0883\u0884\7"+
		"\5\2\2\u0884\u0885\5\20\t\2\u0885\u0886\7\f\2\2\u0886\u0888\3\2\2\2\u0887"+
		"\u0870\3\2\2\2\u0887\u0872\3\2\2\2\u0887\u0875\3\2\2\2\u0887\u087a\3\2"+
		"\2\2\u0887\u0881\3\2\2\2\u0888\u088b\3\2\2\2\u0889\u0887\3\2\2\2\u0889"+
		"\u088a\3\2\2\2\u088a\u0113\3\2\2\2\u088b\u0889\3\2\2\2\u088c\u0894\3\2"+
		"\2\2\u088d\u088e\7\7\2\2\u088e\u088f\7\u00fa\2\2\u088f\u0890\7\n\2\2\u0890"+
		"\u0891\5\20\t\2\u0891\u0892\7\b\2\2\u0892\u0894\3\2\2\2\u0893\u088c\3"+
		"\2\2\2\u0893\u088d\3\2\2\2\u0894\u0115\3\2\2\2\u0895\u08c9\b\u008c\1\2"+
		"\u0896\u08c9\7\u0101\2\2\u0897\u08c9\7\u00e6\2\2\u0898\u08c9\7\u00e7\2"+
		"\2\u0899\u08c9\7\27\2\2\u089a\u08c9\7\30\2\2\u089b\u08c9\7\34\2\2\u089c"+
		"\u08c9\7\35\2\2\u089d\u08c9\7\36\2\2\u089e\u08c9\7\37\2\2\u089f\u08c9"+
		"\7!\2\2\u08a0\u08c9\7\"\2\2\u08a1\u08a2\7\32\2\2\u08a2\u08c9\7\34\2\2"+
		"\u08a3\u08a4\7\32\2\2\u08a4\u08c9\7\35\2\2\u08a5\u08a6\7\32\2\2\u08a6"+
		"\u08c9\7\36\2\2\u08a7\u08a8\7\32\2\2\u08a8\u08c9\7\37\2\2\u08a9\u08c9"+
		"\7%\2\2\u08aa\u08c9\7&\2\2\u08ab\u08c9\7\'\2\2\u08ac\u08c9\7(\2\2\u08ad"+
		"\u08c9\7\21\2\2\u08ae\u08c9\7\u00e9\2\2\u08af\u08c9\7\u00ea\2\2\u08b0"+
		"\u08c9\7\u00eb\2\2\u08b1\u08c9\7\u00ed\2\2\u08b2\u08c9\7\u00ee\2\2\u08b3"+
		"\u08c9\7\u00f1\2\2\u08b4\u08c9\7\u00f2\2\2\u08b5\u08c9\7\u00f4\2\2\u08b6"+
		"\u08c9\7\33\2\2\u08b7\u08b8\7\32\2\2\u08b8\u08c9\7\33\2\2\u08b9\u08c9"+
		"\7$\2\2\u08ba\u08c9\7\u0124\2\2\u08bb\u08c9\7\u0102\2\2\u08bc\u08c9\7"+
		"\u0103\2\2\u08bd\u08c9\7\u0104\2\2\u08be\u08c9\7\u0105\2\2\u08bf\u08c9"+
		"\7\u0106\2\2\u08c0\u08c9\7\u0107\2\2\u08c1\u08c9\7\u0108\2\2\u08c2\u08c9"+
		"\7\u0109\2\2\u08c3\u08c9\7\u010a\2\2\u08c4\u08c9\7\u010b\2\2\u08c5\u08c9"+
		"\7\u010c\2\2\u08c6\u08c9\7\u010d\2\2\u08c7\u08c9\7\u010e\2\2\u08c8\u0895"+
		"\3\2\2\2\u08c8\u0896\3\2\2\2\u08c8\u0897\3\2\2\2\u08c8\u0898\3\2\2\2\u08c8"+
		"\u0899\3\2\2\2\u08c8\u089a\3\2\2\2\u08c8\u089b\3\2\2\2\u08c8\u089c\3\2"+
		"\2\2\u08c8\u089d\3\2\2\2\u08c8\u089e\3\2\2\2\u08c8\u089f\3\2\2\2\u08c8"+
		"\u08a0\3\2\2\2\u08c8\u08a1\3\2\2\2\u08c8\u08a3\3\2\2\2\u08c8\u08a5\3\2"+
		"\2\2\u08c8\u08a7\3\2\2\2\u08c8\u08a9\3\2\2\2\u08c8\u08aa\3\2\2\2\u08c8"+
		"\u08ab\3\2\2\2\u08c8\u08ac\3\2\2\2\u08c8\u08ad\3\2\2\2\u08c8\u08ae\3\2"+
		"\2\2\u08c8\u08af\3\2\2\2\u08c8\u08b0\3\2\2\2\u08c8\u08b1\3\2\2\2\u08c8"+
		"\u08b2\3\2\2\2\u08c8\u08b3\3\2\2\2\u08c8\u08b4\3\2\2\2\u08c8\u08b5\3\2"+
		"\2\2\u08c8\u08b6\3\2\2\2\u08c8\u08b7\3\2\2\2\u08c8\u08b9\3\2\2\2\u08c8"+
		"\u08ba\3\2\2\2\u08c8\u08bb\3\2\2\2\u08c8\u08bc\3\2\2\2\u08c8\u08bd\3\2"+
		"\2\2\u08c8\u08be\3\2\2\2\u08c8\u08bf\3\2\2\2\u08c8\u08c0\3\2\2\2\u08c8"+
		"\u08c1\3\2\2\2\u08c8\u08c2\3\2\2\2\u08c8\u08c3\3\2\2\2\u08c8\u08c4\3\2"+
		"\2\2\u08c8\u08c5\3\2\2\2\u08c8\u08c6\3\2\2\2\u08c8\u08c7\3\2\2\2\u08c9"+
		"\u08d3\3\2\2\2\u08ca\u08cb\f\36\2\2\u08cb\u08cc\7\13\2\2\u08cc\u08d2\7"+
		"\f\2\2\u08cd\u08ce\f\35\2\2\u08ce\u08d2\7\u010f\2\2\u08cf\u08d0\f\34\2"+
		"\2\u08d0\u08d2\7\22\2\2\u08d1\u08ca\3\2\2\2\u08d1\u08cd\3\2\2\2\u08d1"+
		"\u08cf\3\2\2\2\u08d2\u08d5\3\2\2\2\u08d3\u08d1\3\2\2\2\u08d3\u08d4\3\2"+
		"\2\2\u08d4\u0117\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d6\u08d7\b\u008d\1\2\u08d7"+
		"\u08d8\7\65\2\2\u08d8\u08fe\5\u010c\u0087\2\u08d9\u08fe\7,\2\2\u08da\u08db"+
		"\7E\2\2\u08db\u08dc\7\65\2\2\u08dc\u08fe\5\u010c\u0087\2\u08dd\u08de\7"+
		"F\2\2\u08de\u08fe\5\u010c\u0087\2\u08df\u08e0\5\u00e0q\2\u08e0\u08e1\5"+
		"h\65\2\u08e1\u08e2\5\u0118\u008d\2\u08e2\u08e3\7\21\2\2\u08e3\u08e4\7"+
		"\7\2\2\u08e4\u08e5\5\u0106\u0084\2\u08e5\u08e6\7\b\2\2\u08e6\u08fe\3\2"+
		"\2\2\u08e7\u08e8\7\24\2\2\u08e8\u08e9\7\24\2\2\u08e9\u08fe\5\20\t\2\u08ea"+
		"\u08eb\7\24\2\2\u08eb\u08fe\5\20\t\2\u08ec\u08ed\7\24\2\2\u08ed\u08ee"+
		"\7\24\2\2\u08ee\u08fe\5\16\b\2\u08ef\u08f0\7\24\2\2\u08f0\u08fe\5\16\b"+
		"\2\u08f1\u08fe\7\66\2\2\u08f2\u08fe\7\27\2\2\u08f3\u08f4\7G\2\2\u08f4"+
		"\u08fe\7\33\2\2\u08f5\u08f6\7G\2\2\u08f6\u08f7\7\32\2\2\u08f7\u08fe\7"+
		"\33\2\2\u08f8\u08f9\7G\2\2\u08f9\u08fe\7$\2\2\u08fa\u08fe\5\u011a\u008e"+
		"\2\u08fb\u08fc\7\26\2\2\u08fc\u08fe\5\u0118\u008d\3\u08fd\u08d6\3\2\2"+
		"\2\u08fd\u08d9\3\2\2\2\u08fd\u08da\3\2\2\2\u08fd\u08dd\3\2\2\2\u08fd\u08df"+
		"\3\2\2\2\u08fd\u08e7\3\2\2\2\u08fd\u08ea\3\2\2\2\u08fd\u08ec\3\2\2\2\u08fd"+
		"\u08ef\3\2\2\2\u08fd\u08f1\3\2\2\2\u08fd\u08f2\3\2\2\2\u08fd\u08f3\3\2"+
		"\2\2\u08fd\u08f5\3\2\2\2\u08fd\u08f8\3\2\2\2\u08fd\u08fa\3\2\2\2\u08fd"+
		"\u08fb\3\2\2\2\u08fe\u0920\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u08ff\u0900\f\26\2\2\u0900\u0901\7\13\2\2\u0901\u091f\7\f\2\2\u0902"+
		"\u0903\f\25\2\2\u0903\u0904\7\13\2\2\u0904\u0905\5\u011c\u008f\2\u0905"+
		"\u0906\7\f\2\2\u0906\u091f\3\2\2\2\u0907\u0908\f\24\2\2\u0908\u091f\7"+
		"\22\2\2\u0909\u090a\f\23\2\2\u090a\u091f\7\21\2\2\u090b\u090c\f\22\2\2"+
		"\u090c\u091f\7j\2\2\u090d\u090e\f\21\2\2\u090e\u090f\7k\2\2\u090f\u0910"+
		"\7\7\2\2\u0910\u0911\5\u0110\u0089\2\u0911\u0912\7\b\2\2\u0912\u091f\3"+
		"\2\2\2\u0913\u0914\f\20\2\2\u0914\u0915\7l\2\2\u0915\u0916\7\7\2\2\u0916"+
		"\u0917\5\u0110\u0089\2\u0917\u0918\7\b\2\2\u0918\u091f\3\2\2\2\u0919\u091a"+
		"\f\16\2\2\u091a\u091b\7\r\2\2\u091b\u091c\5\u0102\u0082\2\u091c\u091d"+
		"\7\16\2\2\u091d\u091f\3\2\2\2\u091e\u08ff\3\2\2\2\u091e\u0902\3\2\2\2"+
		"\u091e\u0907\3\2\2\2\u091e\u0909\3\2\2\2\u091e\u090b\3\2\2\2\u091e\u090d"+
		"\3\2\2\2\u091e\u0913\3\2\2\2\u091e\u0919\3\2\2\2\u091f\u0922\3\2\2\2\u0920"+
		"\u091e\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0119\3\2\2\2\u0922\u0920\3\2"+
		"\2\2\u0923\u0939\7\31\2\2\u0924\u0939\7-\2\2\u0925\u0939\7\30\2\2\u0926"+
		"\u0939\7\34\2\2\u0927\u0939\7\35\2\2\u0928\u0939\7\36\2\2\u0929\u0939"+
		"\7\37\2\2\u092a\u0939\7!\2\2\u092b\u0939\7\"\2\2\u092c\u092d\7\32\2\2"+
		"\u092d\u0939\7\34\2\2\u092e\u092f\7\32\2\2\u092f\u0939\7\35\2\2\u0930"+
		"\u0931\7\32\2\2\u0931\u0939\7\36\2\2\u0932\u0933\7\32\2\2\u0933\u0939"+
		"\7\37\2\2\u0934\u0939\7%\2\2\u0935\u0939\7&\2\2\u0936\u0939\7\'\2\2\u0937"+
		"\u0939\7(\2\2\u0938\u0923\3\2\2\2\u0938\u0924\3\2\2\2\u0938\u0925\3\2"+
		"\2\2\u0938\u0926\3\2\2\2\u0938\u0927\3\2\2\2\u0938\u0928\3\2\2\2\u0938"+
		"\u0929\3\2\2\2\u0938\u092a\3\2\2\2\u0938\u092b\3\2\2\2\u0938\u092c\3\2"+
		"\2\2\u0938\u092e\3\2\2\2\u0938\u0930\3\2\2\2\u0938\u0932\3\2\2\2\u0938"+
		"\u0934\3\2\2\2\u0938\u0935\3\2\2\2\u0938\u0936\3\2\2\2\u0938\u0937\3\2"+
		"\2\2\u0939\u011b\3\2\2\2\u093a\u093b\b\u008f\1\2\u093b\u093c\5\u011e\u0090"+
		"\2\u093c\u0942\3\2\2\2\u093d\u093e\f\3\2\2\u093e\u093f\7\6\2\2\u093f\u0941"+
		"\5\u011e\u0090\2\u0940\u093d\3\2\2\2\u0941\u0944\3\2\2\2\u0942\u0940\3"+
		"\2\2\2\u0942\u0943\3\2\2\2\u0943\u011d\3\2\2\2\u0944\u0942\3\2\2\2\u0945"+
		"\u094f\3\2\2\2\u0946\u094f\7\26\2\2\u0947\u0949\5\20\t\2\u0948\u094a\7"+
		"\26\2\2\u0949\u0948\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094c\3\2\2\2\u094b"+
		"\u094d\5\20\t\2\u094c\u094b\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u094f\3"+
		"\2\2\2\u094e\u0945\3\2\2\2\u094e\u0946\3\2\2\2\u094e\u0947\3\2\2\2\u094f"+
		"\u011f\3\2\2\2\u0950\u0951\7\u00b1\2\2\u0951\u0952\5\u0130\u0099\2\u0952"+
		"\u0953\5\u0110\u0089\2\u0953\u0954\7\7\2\2\u0954\u0955\5\u0128\u0095\2"+
		"\u0955\u0956\7\b\2\2\u0956\u0973\3\2\2\2\u0957\u0958\7\u00b1\2\2\u0958"+
		"\u0959\5\u0130\u0099\2\u0959\u095a\5\u0110\u0089\2\u095a\u095b\7\n\2\2"+
		"\u095b\u095c\7\3\2\2\u095c\u095d\5\36\20\2\u095d\u095e\7\4\2\2\u095e\u0973"+
		"\3\2\2\2\u095f\u0960\7\u00b1\2\2\u0960\u0961\5\u0130\u0099\2\u0961\u0962"+
		"\5\u0110\u0089\2\u0962\u0973\3\2\2\2\u0963\u0964\5\u0126\u0094\2\u0964"+
		"\u0965\5\u00c4c\2\u0965\u0966\7\b\2\2\u0966\u0973\3\2\2\2\u0967\u0968"+
		"\7\u00b2\2\2\u0968\u0969\5\u0130\u0099\2\u0969\u096a\5\b\5\2\u096a\u0973"+
		"\3\2\2\2\u096b\u096c\7\u00b2\2\2\u096c\u096d\5\u0130\u0099\2\u096d\u096e"+
		"\7\n\2\2\u096e\u096f\7\3\2\2\u096f\u0970\5\u0122\u0092\2\u0970\u0971\7"+
		"\4\2\2\u0971\u0973\3\2\2\2\u0972\u0950\3\2\2\2\u0972\u0957\3\2\2\2\u0972"+
		"\u095f\3\2\2\2\u0972\u0963\3\2\2\2\u0972\u0967\3\2\2\2\u0972\u096b\3\2"+
		"\2\2\u0973\u0121\3\2\2\2\u0974\u097b\3\2\2\2\u0975\u097b\5\u0124\u0093"+
		"\2\u0976\u0977\5\u0124\u0093\2\u0977\u0978\7\6\2\2\u0978\u0979\5\u0122"+
		"\u0092\2\u0979\u097b\3\2\2\2\u097a\u0974\3\2\2\2\u097a\u0975\3\2\2\2\u097a"+
		"\u0976\3\2\2\2\u097b\u0123\3\2\2\2\u097c\u097d\5\u0110\u0089\2\u097d\u097e"+
		"\7\n\2\2\u097e\u097f\7\3\2\2\u097f\u0980\5\"\22\2\u0980\u0981\7\4\2\2"+
		"\u0981\u098a\3\2\2\2\u0982\u0983\7\65\2\2\u0983\u0984\7\u0126\2\2\u0984"+
		"\u0985\7\n\2\2\u0985\u0986\7\3\2\2\u0986\u0987\5\"\22\2\u0987\u0988\7"+
		"\4\2\2\u0988\u098a\3\2\2\2\u0989\u097c\3\2\2\2\u0989\u0982\3\2\2\2\u098a"+
		"\u0125\3\2\2\2\u098b\u098c\7\u00b2\2\2\u098c\u098d\5\u0130\u0099\2\u098d"+
		"\u098e\7\n\2\2\u098e\u098f\7\7\2\2\u098f\u0996\3\2\2\2\u0990\u0991\7\u00b2"+
		"\2\2\u0991\u0992\5\u0130\u0099\2\u0992\u0993\7#\2\2\u0993\u0994\7\7\2"+
		"\2\u0994\u0996\3\2\2\2\u0995\u098b\3\2\2\2\u0995\u0990\3\2\2\2\u0996\u0127"+
		"\3\2\2\2\u0997\u099d\5\u012a\u0096\2\u0998\u0999\5\u012a\u0096\2\u0999"+
		"\u099a\7\6\2\2\u099a\u099b\5\u0128\u0095\2\u099b\u099d\3\2\2\2\u099c\u0997"+
		"\3\2\2\2\u099c\u0998\3\2\2\2\u099d\u0129\3\2\2\2\u099e\u099f\5\b\5\2\u099f"+
		"\u09a0\7\n\2\2\u09a0\u09a1\5\u012e\u0098\2\u09a1\u012b\3\2\2\2\u09a2\u09a3"+
		"\t\t\2\2\u09a3\u012d\3\2\2\2\u09a4\u09c7\5\u012c\u0097\2\u09a5\u09c7\5"+
		"\20\t\2\u09a6\u09a7\7\36\2\2\u09a7\u09a8\7\7\2\2\u09a8\u09a9\5\20\t\2"+
		"\u09a9\u09aa\7\b\2\2\u09aa\u09c7\3\2\2\2\u09ab\u09c7\5\b\5\2\u09ac\u09ad"+
		"\5\u010c\u0087\2\u09ad\u09ae\7\7\2\2\u09ae\u09af\7\34\2\2\u09af\u09b0"+
		"\7\20\2\2\u09b0\u09b1\5\20\t\2\u09b1\u09b2\7\b\2\2\u09b2\u09c7\3\2\2\2"+
		"\u09b3\u09b4\5\u010c\u0087\2\u09b4\u09b5\7\7\2\2\u09b5\u09b6\7\35\2\2"+
		"\u09b6\u09b7\7\20\2\2\u09b7\u09b8\5\20\t\2\u09b8\u09b9\7\b\2\2\u09b9\u09c7"+
		"\3\2\2\2\u09ba\u09bb\5\u010c\u0087\2\u09bb\u09bc\7\7\2\2\u09bc\u09bd\7"+
		"\36\2\2\u09bd\u09be\7\20\2\2\u09be\u09bf\5\20\t\2\u09bf\u09c0\7\b\2\2"+
		"\u09c0\u09c7\3\2\2\2\u09c1\u09c2\5\u010c\u0087\2\u09c2\u09c3\7\7\2\2\u09c3"+
		"\u09c4\5\20\t\2\u09c4\u09c5\7\b\2\2\u09c5\u09c7\3\2\2\2\u09c6\u09a4\3"+
		"\2\2\2\u09c6\u09a5\3\2\2\2\u09c6\u09a6\3\2\2\2\u09c6\u09ab\3\2\2\2\u09c6"+
		"\u09ac\3\2\2\2\u09c6\u09b3\3\2\2\2\u09c6\u09ba\3\2\2\2\u09c6\u09c1\3\2"+
		"\2\2\u09c7\u012f\3\2\2\2\u09c8\u09c9\t\n\2\2\u09c9\u0131\3\2\2\2\u09ca"+
		"\u09cb\t\13\2\2\u09cb\u0133\3\2\2\2\u09cc\u09cd\5\u0132\u009a\2\u09cd"+
		"\u09ce\5\20\t\2\u09ce\u09cf\7\u0126\2\2\u09cf\u0a14\3\2\2\2\u09d0\u09d1"+
		"\5\u0132\u009a\2\u09d1\u09d2\5\20\t\2\u09d2\u0a14\3\2\2\2\u09d3\u09d4"+
		"\5\u0132\u009a\2\u09d4\u09d5\5\20\t\2\u09d5\u09d6\7\20\2\2\u09d6\u09d7"+
		"\5\20\t\2\u09d7\u09d8\7\u0126\2\2\u09d8\u0a14\3\2\2\2\u09d9\u09da\5\u0132"+
		"\u009a\2\u09da\u09db\5\20\t\2\u09db\u09dc\7\20\2\2\u09dc\u09dd\5\20\t"+
		"\2\u09dd\u0a14\3\2\2\2\u09de\u09df\5\u0132\u009a\2\u09df\u09e0\5\20\t"+
		"\2\u09e0\u09e1\7\20\2\2\u09e1\u09e2\5\20\t\2\u09e2\u09e3\7\6\2\2\u09e3"+
		"\u09e4\5\20\t\2\u09e4\u09e5\7\u0126\2\2\u09e5\u0a14\3\2\2\2\u09e6\u09e7"+
		"\5\u0132\u009a\2\u09e7\u09e8\5\20\t\2\u09e8\u09e9\7\20\2\2\u09e9\u09ea"+
		"\5\20\t\2\u09ea\u09eb\7\6\2\2\u09eb\u09ec\5\20\t\2\u09ec\u0a14\3\2\2\2"+
		"\u09ed\u09ee\5\u0132\u009a\2\u09ee\u09ef\5\20\t\2\u09ef\u09f0\7\6\2\2"+
		"\u09f0\u09f1\5\20\t\2\u09f1\u09f2\7\20\2\2\u09f2\u09f3\5\20\t\2\u09f3"+
		"\u09f4\7\u0126\2\2\u09f4\u0a14\3\2\2\2\u09f5\u09f6\5\u0132\u009a\2\u09f6"+
		"\u09f7\5\20\t\2\u09f7\u09f8\7\6\2\2\u09f8\u09f9\5\20\t\2\u09f9\u09fa\7"+
		"\20\2\2\u09fa\u09fb\5\20\t\2\u09fb\u0a14\3\2\2\2\u09fc\u09fd\5\u0132\u009a"+
		"\2\u09fd\u09fe\5\20\t\2\u09fe\u09ff\7\6\2\2\u09ff\u0a00\5\20\t\2\u0a00"+
		"\u0a01\7\20\2\2\u0a01\u0a02\5\20\t\2\u0a02\u0a03\7\6\2\2\u0a03\u0a04\5"+
		"\20\t\2\u0a04\u0a05\7\u0126\2\2\u0a05\u0a14\3\2\2\2\u0a06\u0a07\5\u0132"+
		"\u009a\2\u0a07\u0a08\5\20\t\2\u0a08\u0a09\7\6\2\2\u0a09\u0a0a\5\20\t\2"+
		"\u0a0a\u0a0b\7\20\2\2\u0a0b\u0a0c\5\20\t\2\u0a0c\u0a0d\7\6\2\2\u0a0d\u0a0e"+
		"\5\20\t\2\u0a0e\u0a14\3\2\2\2\u0a0f\u0a10\5\u0132\u009a\2\u0a10\u0a11"+
		"\5\20\t\2\u0a11\u0a12\7\u0125\2\2\u0a12\u0a14\3\2\2\2\u0a13\u09cc\3\2"+
		"\2\2\u0a13\u09d0\3\2\2\2\u0a13\u09d3\3\2\2\2\u0a13\u09d9\3\2\2\2\u0a13"+
		"\u09de\3\2\2\2\u0a13\u09e6\3\2\2\2\u0a13\u09ed\3\2\2\2\u0a13\u09f5\3\2"+
		"\2\2\u0a13\u09fc\3\2\2\2\u0a13\u0a06\3\2\2\2\u0a13\u0a0f\3\2\2\2\u0a14"+
		"\u0135\3\2\2\2\u0a15\u0a16\7\u00cf\2\2\u0a16\u0a17\5\u0138\u009d\2\u0a17"+
		"\u0a18\5\16\b\2\u0a18\u0a19\5\u013a\u009e\2\u0a19\u0a1a\5\u013c\u009f"+
		"\2\u0a1a\u0a1b\5\u00c4c\2\u0a1b\u0a1c\7\b\2\2\u0a1c\u0a1d\5\u013a\u009e"+
		"\2\u0a1d\u0a24\3\2\2\2\u0a1e\u0a1f\7\u00cf\2\2\u0a1f\u0a20\5\u0138\u009d"+
		"\2\u0a20\u0a21\5\16\b\2\u0a21\u0a22\5\u013a\u009e\2\u0a22\u0a24\3\2\2"+
		"\2\u0a23\u0a15\3\2\2\2\u0a23\u0a1e\3\2\2\2\u0a24\u0137\3\2\2\2\u0a25\u0a2a"+
		"\b\u009d\1\2\u0a26\u0a27\f\3\2\2\u0a27\u0a29\7\u00d0\2\2\u0a28\u0a26\3"+
		"\2\2\2\u0a29\u0a2c\3\2\2\2\u0a2a\u0a28\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b"+
		"\u0139\3\2\2\2\u0a2c\u0a2a\3\2\2\2\u0a2d\u0a30\3\2\2\2\u0a2e\u0a30\7\u00a6"+
		"\2\2\u0a2f\u0a2d\3\2\2\2\u0a2f\u0a2e\3\2\2\2\u0a30\u013b\3\2\2\2\u0a31"+
		"\u0a32\7\u00d1\2\2\u0a32\u0a33\7\n\2\2\u0a33\u0a34\7\7\2\2\u0a34\u013d"+
		"\3\2\2\2\u0a35\u0a39\7\u00d2\2\2\u0a36\u0a38\5\u0140\u00a1\2\u0a37\u0a36"+
		"\3\2\2\2\u0a38\u0a3b\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a39\u0a37\3\2\2\2\u0a3a"+
		"\u0a3c\3\2\2\2\u0a3b\u0a39\3\2\2\2\u0a3c\u0a3d\5\16\b\2\u0a3d\u013f\3"+
		"\2\2\2\u0a3e\u0a49\7e\2\2\u0a3f\u0a49\7f\2\2\u0a40\u0a49\7g\2\2\u0a41"+
		"\u0a42\7\u00dc\2\2\u0a42\u0a49\7\u00dd\2\2\u0a43\u0a49\7~\2\2\u0a44\u0a49"+
		"\7\u00de\2\2\u0a45\u0a49\7\u00df\2\2\u0a46\u0a49\7\u00e0\2\2\u0a47\u0a49"+
		"\7\u00e1\2\2\u0a48\u0a3e\3\2\2\2\u0a48\u0a3f\3\2\2\2\u0a48\u0a40\3\2\2"+
		"\2\u0a48\u0a41\3\2\2\2\u0a48\u0a43\3\2\2\2\u0a48\u0a44\3\2\2\2\u0a48\u0a45"+
		"\3\2\2\2\u0a48\u0a46\3\2\2\2\u0a48\u0a47\3\2\2\2\u0a49\u0141\3\2\2\2\u0a4a"+
		"\u0a4c\5\u0144\u00a3\2\u0a4b\u0a4a\3\2\2\2\u0a4c\u0a4f\3\2\2\2\u0a4d\u0a4e"+
		"\3\2\2\2\u0a4d\u0a4b\3\2\2\2\u0a4e\u0143\3\2\2\2\u0a4f\u0a4d\3\2\2\2\u0a50"+
		"\u0a51\7\u00d1\2\2\u0a51\u0a52\7\u00d5\2\2\u0a52\u0a56\5\20\t\2\u0a53"+
		"\u0a56\5\u0120\u0091\2\u0a54\u0a56\5\u0148\u00a5\2\u0a55\u0a50\3\2\2\2"+
		"\u0a55\u0a53\3\2\2\2\u0a55\u0a54\3\2\2\2\u0a56\u0145\3\2\2\2\u0a57\u0a5a"+
		"\5\20\t\2\u0a58\u0a5a\7\21\2\2\u0a59\u0a57\3\2\2\2\u0a59\u0a58\3\2\2\2"+
		"\u0a5a\u0147\3\2\2\2\u0a5b\u0a5c\5\u014a\u00a6\2\u0a5c\u0a5d\5\u00c4c"+
		"\2\u0a5d\u0a5e\7\b\2\2\u0a5e\u0a71\3\2\2\2\u0a5f\u0a60\7\u00d6\2\2\u0a60"+
		"\u0a61\5\u0146\u00a4\2\u0a61\u0a62\7\20\2\2\u0a62\u0a63\5\u0146\u00a4"+
		"\2\u0a63\u0a64\7\20\2\2\u0a64\u0a65\5\u0146\u00a4\2\u0a65\u0a66\7\20\2"+
		"\2\u0a66\u0a67\5\u0146\u00a4\2\u0a67\u0a71\3\2\2\2\u0a68\u0a69\7\u00d7"+
		"\2\2\u0a69\u0a71\5\b\5\2\u0a6a\u0a6b\5\u014e\u00a8\2\u0a6b\u0a6c\5\u00c4"+
		"c\2\u0a6c\u0a6d\7\b\2\2\u0a6d\u0a71\3\2\2\2\u0a6e\u0a71\5&\24\2\u0a6f"+
		"\u0a71\5\30\r\2\u0a70\u0a5b\3\2\2\2\u0a70\u0a5f\3\2\2\2\u0a70\u0a68\3"+
		"\2\2\2\u0a70\u0a6a\3\2\2\2\u0a70\u0a6e\3\2\2\2\u0a70\u0a6f\3\2\2\2\u0a71"+
		"\u0149\3\2\2\2\u0a72\u0a73\7\u00d3\2\2\u0a73\u0a74\7\n\2\2\u0a74\u0a75"+
		"\7\7\2\2\u0a75\u014b\3\2\2\2\u0a76\u0a77\7\u00d4\2\2\u0a77\u0a78\7\n\2"+
		"\2\u0a78\u0a79\7\7\2\2\u0a79\u014d\3\2\2\2\u0a7a\u0a7b\7\u00d7\2\2\u0a7b"+
		"\u0a7c\7\n\2\2\u0a7c\u0a7d\7\7\2\2\u0a7d\u014f\3\2\2\2\u0a7e\u0a7f\7\u00d2"+
		"\2\2\u0a7f\u0a83\7\u00d8\2\2\u0a80\u0a82\5\u0140\u00a1\2\u0a81\u0a80\3"+
		"\2\2\2\u0a82\u0a85\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a83\u0a81\3\2\2\2\u0a84"+
		"\u0a86\3\2\2\2\u0a85\u0a83\3\2\2\2\u0a86\u0a89\5\16\b\2\u0a87\u0a88\7"+
		"\u0088\2\2\u0a88\u0a8a\5\16\b\2\u0a89\u0a87\3\2\2\2\u0a89\u0a8a\3\2\2"+
		"\2\u0a8a\u0151\3\2\2\2\u0a8b\u0a8d\5\u0154\u00ab\2\u0a8c\u0a8b\3\2\2\2"+
		"\u0a8d\u0a90\3\2\2\2\u0a8e\u0a8f\3\2\2\2\u0a8e\u0a8c\3\2\2\2\u0a8f\u0153"+
		"\3\2\2\2\u0a90\u0a8e\3\2\2\2\u0a91\u0a92\5\u013c\u009f\2\u0a92\u0a93\5"+
		"\u00c4c\2\u0a93\u0a94\7\b\2\2\u0a94\u0a9c\3\2\2\2\u0a95\u0a9c\5\u0148"+
		"\u00a5\2\u0a96\u0a97\5\u014c\u00a7\2\u0a97\u0a98\5\u00c4c\2\u0a98\u0a99"+
		"\7\b\2\2\u0a99\u0a9c\3\2\2\2\u0a9a\u0a9c\7U\2\2\u0a9b\u0a91\3\2\2\2\u0a9b"+
		"\u0a95\3\2\2\2\u0a9b\u0a96\3\2\2\2\u0a9b\u0a9a\3\2\2\2\u0a9c\u0155\3\2"+
		"\2\2\u0a9d\u0a9e\7\u009a\2\2\u0a9e\u0a9f\7\u00d8\2\2\u0a9f\u0aa0\5\u015a"+
		"\u00ae\2\u0aa0\u0aa1\5\16\b\2\u0aa1\u0157\3\2\2\2\u0aa2\u0aa3\7\u00db"+
		"\2\2\u0aa3\u0aa4\5\u015a\u00ae\2\u0aa4\u0aa5\5\16\b\2\u0aa5\u0159\3\2"+
		"\2\2\u0aa6\u0ab6\7M\2\2\u0aa7\u0ab6\7L\2\2\u0aa8\u0ab6\7J\2\2\u0aa9\u0aaa"+
		"\7S\2\2\u0aaa\u0ab6\7L\2\2\u0aab\u0aac\7S\2\2\u0aac\u0ab6\7M\2\2\u0aad"+
		"\u0aae\7S\2\2\u0aae\u0ab6\7N\2\2\u0aaf\u0ab0\7S\2\2\u0ab0\u0ab6\7p\2\2"+
		"\u0ab1\u0ab2\7S\2\2\u0ab2\u0ab6\7q\2\2\u0ab3\u0ab4\7S\2\2\u0ab4\u0ab6"+
		"\7r\2\2\u0ab5\u0aa6\3\2\2\2\u0ab5\u0aa7\3\2\2\2\u0ab5\u0aa8\3\2\2\2\u0ab5"+
		"\u0aa9\3\2\2\2\u0ab5\u0aab\3\2\2\2\u0ab5\u0aad\3\2\2\2\u0ab5\u0aaf\3\2"+
		"\2\2\u0ab5\u0ab1\3\2\2\2\u0ab5\u0ab3\3\2\2\2\u0ab6\u0ab9\3\2\2\2\u0ab7"+
		"\u0ab5\3\2\2\2\u0ab7\u0ab8\3\2\2\2\u0ab8\u015b\3\2\2\2\u0ab9\u0ab7\3\2"+
		"\2\2\u0aba\u0abc\5\u015e\u00b0\2\u0abb\u0aba\3\2\2\2\u0abc\u0abf\3\2\2"+
		"\2\u0abd\u0abe\3\2\2\2\u0abd\u0abb\3\2\2\2\u0abe\u015d\3\2\2\2\u0abf\u0abd"+
		"\3\2\2\2\u0ac0\u0ac1\7\u00cf\2\2\u0ac1\u0ad2\5\16\b\2\u0ac2\u0ac3\7\u009a"+
		"\2\2\u0ac3\u0ac4\7\u00d8\2\2\u0ac4\u0ad2\5\u010e\u0088\2\u0ac5\u0ac6\7"+
		"\u00d2\2\2\u0ac6\u0ac7\7\u00d8\2\2\u0ac7\u0ad2\5\16\b\2\u0ac8\u0ac9\7"+
		"+\2\2\u0ac9\u0aca\7\7\2\2\u0aca\u0acb\5\20\t\2\u0acb\u0acc\7\b\2\2\u0acc"+
		"\u0ad2\3\2\2\2\u0acd\u0ace\7\u009a\2\2\u0ace\u0ad2\5\20\t\2\u0acf\u0ad2"+
		"\5&\24\2\u0ad0\u0ad2\5\30\r\2\u0ad1\u0ac0\3\2\2\2\u0ad1\u0ac2\3\2\2\2"+
		"\u0ad1\u0ac5\3\2\2\2\u0ad1\u0ac8\3\2\2\2\u0ad1\u0acd\3\2\2\2\u0ad1\u0acf"+
		"\3\2\2\2\u0ad1\u0ad0\3\2\2\2\u0ad2\u015f\3\2\2\2\u0ad3\u0ad7\7\u00d9\2"+
		"\2\u0ad4\u0ad6\5\u0162\u00b2\2\u0ad5\u0ad4\3\2\2\2\u0ad6\u0ad9\3\2\2\2"+
		"\u0ad7\u0ad8\3\2\2\2\u0ad7\u0ad5\3\2\2\2\u0ad8\u0ada\3\2\2\2\u0ad9\u0ad7"+
		"\3\2\2\2\u0ada\u0add\5\16\b\2\u0adb\u0adc\7\u0088\2\2\u0adc\u0ade\5\16"+
		"\b\2\u0add\u0adb\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade\u0161\3\2\2\2\u0adf"+
		"\u0ae0\t\f\2\2\u0ae0\u0163\3\2\2\2\u0ae1\u0ae3\5\u0166\u00b4\2\u0ae2\u0ae1"+
		"\3\2\2\2\u0ae3\u0ae6\3\2\2\2\u0ae4\u0ae5\3\2\2\2\u0ae4\u0ae2\3\2\2\2\u0ae5"+
		"\u0165\3\2\2\2\u0ae6\u0ae4\3\2\2\2\u0ae7\u0ae8\7\u00cf\2\2\u0ae8\u0ae9"+
		"\5\16\b\2\u0ae9\u0aea\7@\2\2\u0aea\u0aeb\5\20\t\2\u0aeb\u0af2\3\2\2\2"+
		"\u0aec\u0aed\7\u00d2\2\2\u0aed\u0aee\7\u00d8\2\2\u0aee\u0af2\5\16\b\2"+
		"\u0aef\u0af2\5&\24\2\u0af0\u0af2\5\30\r\2\u0af1\u0ae7\3\2\2\2\u0af1\u0aec"+
		"\3\2\2\2\u0af1\u0aef\3\2\2\2\u0af1\u0af0\3\2\2\2\u0af2\u0167\3\2\2\2\u00ad"+
		"\u016b\u01ae\u01b4\u01be\u01cd\u01d3\u01e4\u01f3\u01fa\u0207\u020e\u021d"+
		"\u0221\u0228\u022a\u0234\u0236\u0246\u024d\u0252\u0269\u026b\u0280\u02a5"+
		"\u02a9\u02ae\u02b3\u02be\u02c3\u02cd\u02d5\u02dd\u02e1\u02e9\u02f1\u033f"+
		"\u034a\u034e\u0355\u035c\u037b\u0380\u0385\u038c\u0393\u0398\u03a1\u03aa"+
		"\u03b0\u03c5\u03d0\u03d7\u03d9\u03df\u03ee\u03ff\u0401\u0407\u0414\u041e"+
		"\u0425\u042d\u0434\u0441\u045e\u0462\u0467\u046b\u0488\u048d\u049c\u04b1"+
		"\u04b8\u04c2\u04ce\u04dc\u04e8\u04f2\u04fc\u0504\u050e\u0510\u051f\u052b"+
		"\u0539\u0544\u055a\u0566\u056b\u0572\u0579\u0580\u05c1\u0625\u062c\u0635"+
		"\u063b\u06f5\u06fc\u06fe\u0706\u0708\u0710\u0718\u0720\u0728\u0730\u0738"+
		"\u073a\u0745\u0747\u074f\u0759\u0768\u076d\u0777\u0789\u07a7\u07b4\u07bb"+
		"\u07bf\u07c9\u07cd\u07d4\u07df\u07fa\u0801\u080f\u086e\u0887\u0889\u0893"+
		"\u08c8\u08d1\u08d3\u08fd\u091e\u0920\u0938\u0942\u0949\u094c\u094e\u0972"+
		"\u097a\u0989\u0995\u099c\u09c6\u0a13\u0a23\u0a2a\u0a2f\u0a39\u0a48\u0a4d"+
		"\u0a55\u0a59\u0a70\u0a83\u0a89\u0a8e\u0a9b\u0ab5\u0ab7\u0abd\u0ad1\u0ad7"+
		"\u0add\u0ae4\u0af1";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
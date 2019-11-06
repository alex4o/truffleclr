// Generated from /home/alex4o/Projects/truffleclr/truffleforth/Cil.g4 by ANTLR 4.7.2
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
		RULE_instr_sig = 122, RULE_instr_tok = 123, RULE_instr_switch = 124, RULE_instr_r_head = 125, 
		RULE_instr = 126, RULE_labels = 127, RULE_tyArgs0 = 128, RULE_tyArgs1 = 129, 
		RULE_tyArgs2 = 130, RULE_sigArgs0 = 131, RULE_sigArgs1 = 132, RULE_sigArg = 133, 
		RULE_className = 134, RULE_slashedName = 135, RULE_typeSpec = 136, RULE_nativeType = 137, 
		RULE_iidParamIndex = 138, RULE_variantType = 139, RULE_type = 140, RULE_simpleType = 141, 
		RULE_bounds1 = 142, RULE_bound = 143, RULE_secDecl = 144, RULE_secAttrSetBlob = 145, 
		RULE_secAttrBlob = 146, RULE_psetHead = 147, RULE_nameValPairs = 148, 
		RULE_nameValPair = 149, RULE_truefalse = 150, RULE_caValue = 151, RULE_secAction = 152, 
		RULE_esHead = 153, RULE_extSourceSpec = 154, RULE_fileDecl = 155, RULE_fileAttr = 156, 
		RULE_fileEntry = 157, RULE_hashHead = 158, RULE_assemblyHead = 159, RULE_asmAttr = 160, 
		RULE_assemblyDecls = 161, RULE_assemblyDecl = 162, RULE_intOrWildcard = 163, 
		RULE_asmOrRefDecl = 164, RULE_publicKeyHead = 165, RULE_publicKeyTokenHead = 166, 
		RULE_localeHead = 167, RULE_assemblyRefHead = 168, RULE_assemblyRefDecls = 169, 
		RULE_assemblyRefDecl = 170, RULE_exptypeHead = 171, RULE_exportHead = 172, 
		RULE_exptAttr = 173, RULE_exptypeDecls = 174, RULE_exptypeDecl = 175, 
		RULE_manifestResHead = 176, RULE_manresAttr = 177, RULE_manifestResDecls = 178, 
		RULE_manifestResDecl = 179;
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
			"instr_r_head", "instr", "labels", "tyArgs0", "tyArgs1", "tyArgs2", "sigArgs0", 
			"sigArgs1", "sigArg", "className", "slashedName", "typeSpec", "nativeType", 
			"iidParamIndex", "variantType", "type", "simpleType", "bounds1", "bound", 
			"secDecl", "secAttrSetBlob", "secAttrBlob", "psetHead", "nameValPairs", 
			"nameValPair", "truefalse", "caValue", "secAction", "esHead", "extSourceSpec", 
			"fileDecl", "fileAttr", "fileEntry", "hashHead", "assemblyHead", "asmAttr", 
			"assemblyDecls", "assemblyDecl", "intOrWildcard", "asmOrRefDecl", "publicKeyHead", 
			"publicKeyTokenHead", "localeHead", "assemblyRefHead", "assemblyRefDecls", 
			"assemblyRefDecl", "exptypeHead", "exportHead", "exptAttr", "exptypeDecls", 
			"exptypeDecl", "manifestResHead", "manresAttr", "manifestResDecls", "manifestResDecl"
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
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (D_CLASS - 152)) | (1L << (D_NAMESPACE - 152)) | (1L << (D_METHOD - 152)) | (1L << (D_FIELD - 152)) | (1L << (D_DATA - 152)) | (1L << (D_PERMISSION - 152)) | (1L << (D_PERMISSIONSET - 152)) | (1L << (D_LINE - 152)) | (1L << (P_LINE - 152)) | (1L << (D_LANGUAGE - 152)) | (1L << (D_CUSTOM - 152)) | (1L << (D_VTABLE - 152)) | (1L << (D_VTFIXUP - 152)) | (1L << (D_FILE - 152)) | (1L << (D_ASSEMBLY - 152)) | (1L << (D_MRESOURCE - 152)))) != 0) || ((((_la - 216)) & ~0x3f) == 0 && ((1L << (_la - 216)) & ((1L << (D_MODULE - 216)) | (1L << (D_SUBSYSTEM - 216)) | (1L << (D_CORFLAGS - 216)) | (1L << (D_IMAGEBASE - 216)) | (1L << (D_STACKRESERVE - 216)) | (1L << (D_TYPEDEF - 216)) | (1L << (D_TYPELIST - 216)) | (1L << (D_MSCORLIB - 216)) | (1L << (P_DEFINE - 216)))) != 0) || ((((_la - 280)) & ~0x3f) == 0 && ((1L << (_la - 280)) & ((1L << (P_UNDEF - 280)) | (1L << (P_IFDEF - 280)) | (1L << (P_IFNDEF - 280)) | (1L << (P_ELSE - 280)) | (1L << (P_ENDIF - 280)) | (1L << (P_INCLUDE - 280)))) != 0)) {
				{
				{
				setState(360);
				decl();
				}
				}
				setState(365);
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
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				classHead();
				setState(367);
				match(T__0);
				setState(368);
				classDecls();
				setState(369);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new NamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				nameSpaceHead();
				setState(372);
				match(T__0);
				setState(373);
				decls();
				setState(374);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				methodHead();
				setState(377);
				match(T__0);
				setState(378);
				methodDecls();
				setState(379);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new FieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				fieldDecl();
				}
				break;
			case 5:
				_localctx = new DataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				dataDecl();
				}
				break;
			case 6:
				_localctx = new VtableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(383);
				vtableDecl();
				}
				break;
			case 7:
				_localctx = new VtfixupContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(384);
				vtfixupDecl();
				}
				break;
			case 8:
				_localctx = new ExtsourceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(385);
				extSourceSpec();
				}
				break;
			case 9:
				_localctx = new FileContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(386);
				fileDecl();
				}
				break;
			case 10:
				_localctx = new AssemblyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(387);
				assemblyHead();
				setState(388);
				match(T__0);
				setState(389);
				assemblyDecls(0);
				setState(390);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new AssemblyReferanceContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(392);
				assemblyRefHead();
				setState(393);
				match(T__0);
				setState(394);
				assemblyRefDecls(0);
				setState(395);
				match(T__1);
				}
				break;
			case 12:
				_localctx = new ExptypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(397);
				exptypeHead();
				setState(398);
				match(T__0);
				setState(399);
				exptypeDecls(0);
				setState(400);
				match(T__1);
				}
				break;
			case 13:
				_localctx = new ManifestContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(402);
				manifestResHead();
				setState(403);
				match(T__0);
				setState(404);
				manifestResDecls(0);
				setState(405);
				match(T__1);
				}
				break;
			case 14:
				_localctx = new ModuleContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(407);
				moduleHead();
				}
				break;
			case 15:
				_localctx = new SecurityContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(408);
				secDecl();
				}
				break;
			case 16:
				_localctx = new CustomContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(409);
				customAttrDecl();
				}
				break;
			case 17:
				_localctx = new SystemContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(410);
				match(D_SUBSYSTEM);
				setState(411);
				int32();
				}
				break;
			case 18:
				_localctx = new CorflagsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(412);
				match(D_CORFLAGS);
				setState(413);
				int32();
				}
				break;
			case 19:
				_localctx = new FilealignementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(414);
				match(D_FILE);
				setState(415);
				match(K_ALIGNMENT);
				setState(416);
				int32();
				}
				break;
			case 20:
				_localctx = new ImagebaseContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(417);
				match(D_IMAGEBASE);
				setState(418);
				int64();
				}
				break;
			case 21:
				_localctx = new StackreserveContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(419);
				match(D_STACKRESERVE);
				setState(420);
				int64();
				}
				break;
			case 22:
				_localctx = new LanguageContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(421);
				languageDecl();
				}
				break;
			case 23:
				_localctx = new TypedefContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(422);
				typedefDecl();
				}
				break;
			case 24:
				_localctx = new CompilationControlContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(423);
				compControl();
				}
				break;
			case 25:
				_localctx = new TypeLstContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(424);
				match(D_TYPELIST);
				setState(425);
				match(T__0);
				setState(426);
				classNameSeq();
				setState(427);
				match(T__1);
				}
				break;
			case 26:
				_localctx = new MscorelibContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(429);
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
			setState(436);
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
				setState(433);
				className();
				setState(434);
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
			setState(439);
			match(QSTRING);
			}
			_ctx.stop = _input.LT(-1);
			setState(446);
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
					setState(441);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(442);
					match(T__2);
					setState(443);
					match(QSTRING);
					}
					} 
				}
				setState(448);
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
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(D_LANGUAGE);
				setState(450);
				match(SQSTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(D_LANGUAGE);
				setState(452);
				match(SQSTRING);
				setState(453);
				match(T__3);
				setState(454);
				match(SQSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				match(D_LANGUAGE);
				setState(456);
				match(SQSTRING);
				setState(457);
				match(T__3);
				setState(458);
				match(SQSTRING);
				setState(459);
				match(T__3);
				setState(460);
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
			setState(463);
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
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQSTRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				id();
				}
				break;
			case DOTTEDNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
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
			setState(471);
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
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(FLOAT64);
				}
				break;
			case K_FLOAT32:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(K_FLOAT32);
				setState(475);
				match(T__4);
				setState(476);
				int32();
				setState(477);
				match(T__5);
				}
				break;
			case K_FLOAT64:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(K_FLOAT64);
				setState(480);
				match(T__4);
				setState(481);
				int64();
				setState(482);
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
			setState(486);
			match(D_TYPEDEF);
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(487);
				type(0);
				setState(488);
				match(K_AS);
				}
				break;
			case 2:
				{
				setState(490);
				className();
				setState(491);
				match(K_AS);
				}
				break;
			case 3:
				{
				setState(493);
				memberRef();
				setState(494);
				match(K_AS);
				}
				break;
			case 4:
				{
				setState(496);
				customDescr();
				setState(497);
				match(K_AS);
				}
				break;
			}
			setState(501);
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
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(P_DEFINE);
				setState(504);
				dottedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(P_DEFINE);
				setState(506);
				dottedName();
				setState(507);
				compQstring(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(P_UNDEF);
				setState(510);
				dottedName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(P_IFDEF);
				setState(512);
				dottedName();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				match(P_IFNDEF);
				setState(514);
				dottedName();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(515);
				match(P_ELSE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(516);
				match(P_ENDIF);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(517);
				match(P_INCLUDE);
				setState(518);
				match(QSTRING);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(519);
				match(T__6);
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
			setState(522);
			match(D_CUSTOM);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(523);
				match(T__4);
				setState(524);
				ownerType();
				setState(525);
				match(T__5);
				}
			}

			setState(529);
			methodRef();
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(530);
				match(T__7);
				setState(531);
				compQstring(0);
				}
				break;
			case 2:
				{
				setState(532);
				match(T__7);
				setState(533);
				match(T__0);
				setState(534);
				customBlobDescr();
				setState(535);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(537);
				match(T__7);
				setState(538);
				match(T__4);
				setState(539);
				bytes();
				setState(540);
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
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
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
			setState(548);
			customBlobArgs();
			setState(549);
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
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(553);
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
						setState(551);
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
						setState(552);
						compControl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(565);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_FIELD:
					case K_PROPERTY:
						{
						setState(558);
						fieldOrProp();
						setState(559);
						serializType(0);
						setState(560);
						dottedName();
						setState(561);
						match(T__7);
						setState(562);
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
						setState(564);
						compControl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(570);
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
			setState(572);
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
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(575);
				simpleType();
				}
				break;
			case 2:
				{
				setState(576);
				match(K_TYPE);
				}
				break;
			case 3:
				{
				setState(577);
				match(K_OBJECT);
				}
				break;
			case 4:
				{
				setState(578);
				match(K_ENUM);
				setState(579);
				match(K_CLASS);
				setState(580);
				match(SQSTRING);
				}
				break;
			case 5:
				{
				setState(581);
				match(K_ENUM);
				setState(582);
				className();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SerializTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_serializType);
					setState(585);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(586);
					match(T__8);
					setState(587);
					match(T__9);
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(D_MODULE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(D_MODULE);
				setState(595);
				dottedName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				match(D_MODULE);
				setState(597);
				match(K_EXTERN);
				setState(598);
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
			setState(601);
			match(D_VTFIXUP);
			setState(602);
			match(T__8);
			setState(603);
			int32();
			setState(604);
			match(T__9);
			setState(605);
			vtfixupAttr(0);
			setState(606);
			match(K_AT);
			setState(607);
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
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(620);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(610);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(611);
						match(K_INT32);
						}
						break;
					case 2:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(612);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(613);
						match(K_INT64);
						}
						break;
					case 3:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(614);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(615);
						match(K_FROMUNMANAGED);
						}
						break;
					case 4:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(616);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(617);
						match(K_CALLMOSTDERIVED);
						}
						break;
					case 5:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(618);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(619);
						match(K_RETAINAPPDOMAIN);
						}
						break;
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(625);
			vtableHead();
			setState(626);
			bytes();
			setState(627);
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
			setState(629);
			match(D_VTABLE);
			setState(630);
			match(T__7);
			setState(631);
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
			setState(633);
			match(D_NAMESPACE);
			setState(634);
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
			setState(637);
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
		public ClassAttrContext classAttr() {
			return getRuleContext(ClassAttrContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TyparsClauseContext typarsClause() {
			return getRuleContext(TyparsClauseContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			klass();
			setState(640);
			classAttr(0);
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
		public ClassAttrContext classAttr() {
			return getRuleContext(ClassAttrContext.class,0);
		}
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
		return classAttr(0);
	}

	private ClassAttrContext classAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassAttrContext _localctx = new ClassAttrContext(_ctx, _parentState);
		ClassAttrContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_classAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(712);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(650);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(651);
						match(K_PUBLIC);
						}
						break;
					case 2:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(652);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(653);
						match(K_PRIVATE);
						}
						break;
					case 3:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(654);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(655);
						match(K_VALUE);
						}
						break;
					case 4:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(656);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(657);
						match(K_ENUM);
						}
						break;
					case 5:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(658);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(659);
						match(K_INTERFACE);
						}
						break;
					case 6:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(660);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(661);
						match(K_SEALED);
						}
						break;
					case 7:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(662);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(663);
						match(K_ABSTRACT);
						}
						break;
					case 8:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(664);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(665);
						match(K_AUTO);
						}
						break;
					case 9:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(666);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(667);
						match(K_SEQUENTIAL);
						}
						break;
					case 10:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(668);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(669);
						match(K_EXPLICIT);
						}
						break;
					case 11:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(670);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(671);
						match(K_ANSI);
						}
						break;
					case 12:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(672);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(673);
						match(K_UNICODE);
						}
						break;
					case 13:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(674);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(675);
						match(K_AUTOCHAR);
						}
						break;
					case 14:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(676);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(677);
						match(K_IMPORT);
						}
						break;
					case 15:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(678);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(679);
						match(K_SERIALIZABLE);
						}
						break;
					case 16:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(680);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(681);
						match(K_WINDOWSRUNTIME);
						}
						break;
					case 17:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(682);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(683);
						match(K_NESTED);
						setState(684);
						match(K_PUBLIC);
						}
						break;
					case 18:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(685);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(686);
						match(K_NESTED);
						setState(687);
						match(K_PRIVATE);
						}
						break;
					case 19:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(688);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(689);
						match(K_NESTED);
						setState(690);
						match(K_FAMILY);
						}
						break;
					case 20:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(691);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(692);
						match(K_NESTED);
						setState(693);
						match(K_ASSEMBLY);
						}
						break;
					case 21:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(694);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(695);
						match(K_NESTED);
						setState(696);
						match(K_FAMANDASSEM);
						}
						break;
					case 22:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(697);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(698);
						match(K_NESTED);
						setState(699);
						match(K_FAMORASSEM);
						}
						break;
					case 23:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(700);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(701);
						match(K_BEFOREFIELDINIT);
						}
						break;
					case 24:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(702);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(703);
						match(K_SPECIALNAME);
						}
						break;
					case 25:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(704);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(705);
						match(K_RTSPECIALNAME);
						}
						break;
					case 26:
						{
						_localctx = new ClassAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classAttr);
						setState(706);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(707);
						match(K_FLAGS);
						setState(708);
						match(T__4);
						setState(709);
						int32();
						setState(710);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXTENDS) {
				{
				setState(717);
				match(K_EXTENDS);
				setState(718);
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
			setState(724);
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
				setState(722);
				match(K_IMPLEMENTS);
				setState(723);
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
			setState(729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(726);
					classDecl();
					}
					} 
				}
				setState(731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			setState(733);
			typeSpec();
			}
			_ctx.stop = _input.LT(-1);
			setState(740);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImplListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_implList);
					setState(735);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(736);
					match(T__3);
					setState(737);
					typeSpec();
					}
					} 
				}
				setState(742);
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
			setState(745);
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
				setState(744);
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
			setState(748);
			typeSpec();
			}
			_ctx.stop = _input.LT(-1);
			setState(755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeListNotEmptyContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeListNotEmpty);
					setState(750);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(751);
					match(T__3);
					setState(752);
					typeSpec();
					}
					} 
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
			setState(763);
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
				setState(759);
				match(T__10);
				setState(760);
				typars();
				setState(761);
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
			setState(765);
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
			setState(771);
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
				setState(768);
				typarAttrib();
				setState(769);
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
		public TyBoundContext tyBound() {
			return getRuleContext(TyBoundContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TyparsRestContext typarsRest() {
			return getRuleContext(TyparsRestContext.class,0);
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
		try {
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				typarAttribs();
				setState(774);
				tyBound();
				setState(775);
				dottedName();
				setState(776);
				typarsRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				typarAttribs();
				setState(779);
				dottedName();
				setState(780);
				typarsRest();
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
			setState(787);
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
				setState(785);
				match(T__3);
				setState(786);
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
			setState(789);
			match(T__4);
			setState(790);
			typeList();
			setState(791);
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
			setState(795);
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
				setState(794);
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
			setState(797);
			match(T__10);
			setState(798);
			match(T__8);
			setState(799);
			int32();
			setState(800);
			match(T__9);
			setState(801);
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
		public MethodHeadContext methodHead() {
			return getRuleContext(MethodHeadContext.class,0);
		}
		public MethodDeclsContext methodDecls() {
			return getRuleContext(MethodDeclsContext.class,0);
		}
		public ClassHeadContext classHead() {
			return getRuleContext(ClassHeadContext.class,0);
		}
		public ClassDeclsContext classDecls() {
			return getRuleContext(ClassDeclsContext.class,0);
		}
		public EventHeadContext eventHead() {
			return getRuleContext(EventHeadContext.class,0);
		}
		public EventDeclsContext eventDecls() {
			return getRuleContext(EventDeclsContext.class,0);
		}
		public PropHeadContext propHead() {
			return getRuleContext(PropHeadContext.class,0);
		}
		public PropDeclsContext propDecls() {
			return getRuleContext(PropDeclsContext.class,0);
		}
		public FieldDeclContext fieldDecl() {
			return getRuleContext(FieldDeclContext.class,0);
		}
		public DataDeclContext dataDecl() {
			return getRuleContext(DataDeclContext.class,0);
		}
		public SecDeclContext secDecl() {
			return getRuleContext(SecDeclContext.class,0);
		}
		public ExtSourceSpecContext extSourceSpec() {
			return getRuleContext(ExtSourceSpecContext.class,0);
		}
		public CustomAttrDeclContext customAttrDecl() {
			return getRuleContext(CustomAttrDeclContext.class,0);
		}
		public TerminalNode D_SIZE() { return getToken(CilParser.D_SIZE, 0); }
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public TerminalNode D_PACK() { return getToken(CilParser.D_PACK, 0); }
		public ExportHeadContext exportHead() {
			return getRuleContext(ExportHeadContext.class,0);
		}
		public ExptypeDeclsContext exptypeDecls() {
			return getRuleContext(ExptypeDeclsContext.class,0);
		}
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
		public LanguageDeclContext languageDecl() {
			return getRuleContext(LanguageDeclContext.class,0);
		}
		public CompControlContext compControl() {
			return getRuleContext(CompControlContext.class,0);
		}
		public TerminalNode D_PARAM() { return getToken(CilParser.D_PARAM, 0); }
		public TerminalNode K_TYPE() { return getToken(CilParser.K_TYPE, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(CilParser.K_CONSTRAINT, 0); }
		public TerminalNode D_INTERFACEIMPL() { return getToken(CilParser.D_INTERFACEIMPL, 0); }
		public CustomDescrContext customDescr() {
			return getRuleContext(CustomDescrContext.class,0);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classDecl);
		try {
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				methodHead();
				setState(804);
				match(T__0);
				setState(805);
				methodDecls();
				setState(806);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				classHead();
				setState(809);
				match(T__0);
				setState(810);
				classDecls();
				setState(811);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				eventHead();
				setState(814);
				match(T__0);
				setState(815);
				eventDecls(0);
				setState(816);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(818);
				propHead();
				setState(819);
				match(T__0);
				setState(820);
				propDecls(0);
				setState(821);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(823);
				fieldDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(824);
				dataDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(825);
				secDecl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(826);
				extSourceSpec();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(827);
				customAttrDecl();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(828);
				match(D_SIZE);
				setState(829);
				int32();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(830);
				match(D_PACK);
				setState(831);
				int32();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(832);
				exportHead();
				setState(833);
				match(T__0);
				setState(834);
				exptypeDecls(0);
				setState(835);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(837);
				match(D_OVERRIDE);
				setState(838);
				typeSpec();
				setState(839);
				match(DCOLON);
				setState(840);
				methodName();
				setState(841);
				match(K_WITH);
				setState(842);
				callConv();
				setState(843);
				type(0);
				setState(844);
				typeSpec();
				setState(845);
				match(DCOLON);
				setState(846);
				methodName();
				setState(847);
				match(T__4);
				setState(848);
				sigArgs0();
				setState(849);
				match(T__5);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(851);
				match(D_OVERRIDE);
				setState(852);
				match(K_METHOD);
				setState(853);
				callConv();
				setState(854);
				type(0);
				setState(855);
				typeSpec();
				setState(856);
				match(DCOLON);
				setState(857);
				methodName();
				setState(858);
				genArity();
				setState(859);
				match(T__4);
				setState(860);
				sigArgs0();
				setState(861);
				match(T__5);
				setState(862);
				match(K_WITH);
				setState(863);
				match(K_METHOD);
				setState(864);
				callConv();
				setState(865);
				type(0);
				setState(866);
				typeSpec();
				setState(867);
				match(DCOLON);
				setState(868);
				methodName();
				setState(869);
				genArity();
				setState(870);
				match(T__4);
				setState(871);
				sigArgs0();
				setState(872);
				match(T__5);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(874);
				languageDecl();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(875);
				compControl();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(876);
				match(D_PARAM);
				setState(877);
				match(K_TYPE);
				setState(878);
				match(T__8);
				setState(879);
				int32();
				setState(880);
				match(T__9);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(882);
				match(D_PARAM);
				setState(883);
				match(K_TYPE);
				setState(884);
				dottedName();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(885);
				match(D_PARAM);
				setState(886);
				match(K_CONSTRAINT);
				setState(887);
				match(T__8);
				setState(888);
				int32();
				setState(889);
				match(T__9);
				setState(890);
				match(T__3);
				setState(891);
				typeSpec();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(893);
				match(D_PARAM);
				setState(894);
				match(K_CONSTRAINT);
				setState(895);
				dottedName();
				setState(896);
				match(T__3);
				setState(897);
				typeSpec();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(899);
				match(D_INTERFACEIMPL);
				setState(900);
				match(K_TYPE);
				setState(901);
				typeSpec();
				setState(902);
				customDescr();
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

	public static class FieldDeclContext extends ParserRuleContext {
		public TerminalNode D_FIELD() { return getToken(CilParser.D_FIELD, 0); }
		public RepeatOptContext repeatOpt() {
			return getRuleContext(RepeatOptContext.class,0);
		}
		public FieldAttrContext fieldAttr() {
			return getRuleContext(FieldAttrContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(D_FIELD);
			setState(907);
			repeatOpt();
			setState(908);
			fieldAttr(0);
			setState(909);
			type(0);
			setState(910);
			dottedName();
			setState(911);
			atOpt();
			setState(912);
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
		public FieldAttrContext fieldAttr() {
			return getRuleContext(FieldAttrContext.class,0);
		}
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
		return fieldAttr(0);
	}

	private FieldAttrContext fieldAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldAttrContext _localctx = new FieldAttrContext(_ctx, _parentState);
		FieldAttrContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_fieldAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(953);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(915);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(916);
						match(K_STATIC);
						}
						break;
					case 2:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(917);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(918);
						match(K_PUBLIC);
						}
						break;
					case 3:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(919);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(920);
						match(K_PRIVATE);
						}
						break;
					case 4:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(921);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(922);
						match(K_FAMILY);
						}
						break;
					case 5:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(923);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(924);
						match(K_INITONLY);
						}
						break;
					case 6:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(925);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(926);
						match(K_RTSPECIALNAME);
						}
						break;
					case 7:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(927);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(928);
						match(K_SPECIALNAME);
						}
						break;
					case 8:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(929);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(930);
						match(K_MARSHAL);
						setState(931);
						match(T__4);
						setState(932);
						marshalBlob();
						setState(933);
						match(T__5);
						}
						break;
					case 9:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(935);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(936);
						match(K_ASSEMBLY);
						}
						break;
					case 10:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(937);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(938);
						match(K_FAMANDASSEM);
						}
						break;
					case 11:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(939);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(940);
						match(K_FAMORASSEM);
						}
						break;
					case 12:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(941);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(942);
						match(K_PRIVATESCOPE);
						}
						break;
					case 13:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(943);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(944);
						match(K_LITERAL);
						}
						break;
					case 14:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(945);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(946);
						match(K_NOTSERIALIZED);
						}
						break;
					case 15:
						{
						_localctx = new FieldAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_fieldAttr);
						setState(947);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(948);
						match(K_FLAGS);
						setState(949);
						match(T__4);
						setState(950);
						int32();
						setState(951);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
			setState(961);
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
				setState(959);
				match(K_AT);
				setState(960);
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
			setState(966);
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
				setState(964);
				match(T__7);
				setState(965);
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
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(T__8);
				setState(970);
				int32();
				setState(971);
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
			setState(975);
			callConv();
			setState(976);
			type(0);
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(977);
				typeSpec();
				setState(978);
				match(DCOLON);
				}
				break;
			}
			setState(982);
			methodName();
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(983);
				tyArgs0();
				}
				break;
			case 2:
				{
				setState(984);
				genArityNotEmpty();
				}
				break;
			}
			setState(987);
			match(T__4);
			setState(988);
			sigArgs0();
			setState(989);
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
			setState(994);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(991);
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
				setState(996);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(997);
				callKind();
				}
				break;
			case 2:
				{
				setState(998);
				match(K_CALLCONV);
				setState(999);
				match(T__4);
				setState(1000);
				int32();
				setState(1001);
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
			setState(1009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				match(K_DEFAULT);
				}
				break;
			case K_VARARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(K_VARARG);
				}
				break;
			case K_UNMANAGED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				match(K_UNMANAGED);
				setState(1008);
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
			setState(1011);
			match(K_MDTOKEN);
			setState(1012);
			match(T__4);
			setState(1013);
			int32();
			setState(1014);
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
			setState(1030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				methodSpec();
				setState(1017);
				methodRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(K_FIELD);
				setState(1020);
				type(0);
				setState(1021);
				typeSpec();
				setState(1022);
				match(DCOLON);
				setState(1023);
				dottedName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1025);
				match(K_FIELD);
				setState(1026);
				type(0);
				setState(1027);
				dottedName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1029);
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
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				match(D_EVENT);
				setState(1033);
				eventAttr(0);
				setState(1034);
				typeSpec();
				setState(1035);
				dottedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1037);
				match(D_EVENT);
				setState(1038);
				eventAttr(0);
				setState(1039);
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
			setState(1050);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1048);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new EventAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eventAttr);
						setState(1044);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1045);
						match(K_RTSPECIALNAME);
						}
						break;
					case 2:
						{
						_localctx = new EventAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eventAttr);
						setState(1046);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1047);
						match(K_SPECIALNAME);
						}
						break;
					}
					} 
				}
				setState(1052);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		public EventDeclsContext eventDecls() {
			return getRuleContext(EventDeclsContext.class,0);
		}
		public EventDeclContext eventDecl() {
			return getRuleContext(EventDeclContext.class,0);
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
		return eventDecls(0);
	}

	private EventDeclsContext eventDecls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EventDeclsContext _localctx = new EventDeclsContext(_ctx, _parentState);
		EventDeclsContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_eventDecls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1058);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EventDeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eventDecls);
					setState(1054);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1055);
					eventDecl();
					}
					} 
				}
				setState(1060);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
			setState(1073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_ADDON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				match(D_ADDON);
				setState(1062);
				methodRef();
				}
				break;
			case D_REMOVEON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				match(D_REMOVEON);
				setState(1064);
				methodRef();
				}
				break;
			case D_FIRE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
				match(D_FIRE);
				setState(1066);
				methodRef();
				}
				break;
			case D_OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1067);
				match(D_OTHER);
				setState(1068);
				methodRef();
				}
				break;
			case D_LINE:
			case P_LINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1069);
				extSourceSpec();
				}
				break;
			case D_CUSTOM:
				enterOuterAlt(_localctx, 6);
				{
				setState(1070);
				customAttrDecl();
				}
				break;
			case D_LANGUAGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1071);
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
				setState(1072);
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
			setState(1075);
			match(D_PROPERTY);
			setState(1076);
			propAttr(0);
			setState(1077);
			callConv();
			setState(1078);
			type(0);
			setState(1079);
			dottedName();
			setState(1080);
			match(T__4);
			setState(1081);
			sigArgs0();
			setState(1082);
			match(T__5);
			setState(1083);
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
			setState(1092);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1090);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new PropAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_propAttr);
						setState(1086);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1087);
						match(K_RTSPECIALNAME);
						}
						break;
					case 2:
						{
						_localctx = new PropAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_propAttr);
						setState(1088);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1089);
						match(K_SPECIALNAME);
						}
						break;
					}
					} 
				}
				setState(1094);
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

	public static class PropDeclsContext extends ParserRuleContext {
		public PropDeclsContext propDecls() {
			return getRuleContext(PropDeclsContext.class,0);
		}
		public PropDeclContext propDecl() {
			return getRuleContext(PropDeclContext.class,0);
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
		return propDecls(0);
	}

	private PropDeclsContext propDecls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropDeclsContext _localctx = new PropDeclsContext(_ctx, _parentState);
		PropDeclsContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_propDecls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PropDeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_propDecls);
					setState(1096);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1097);
					propDecl();
					}
					} 
				}
				setState(1102);
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
			unrollRecursionContexts(_parentctx);
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
			setState(1113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				match(D_SET);
				setState(1104);
				methodRef();
				}
				break;
			case D_GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				match(D_GET);
				setState(1106);
				methodRef();
				}
				break;
			case D_OTHER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1107);
				match(D_OTHER);
				setState(1108);
				methodRef();
				}
				break;
			case D_CUSTOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1109);
				customAttrDecl();
				}
				break;
			case D_LINE:
			case P_LINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1110);
				extSourceSpec();
				}
				break;
			case D_LANGUAGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1111);
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
				setState(1112);
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
			setState(1115);
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
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				match(K_MARSHAL);
				setState(1119);
				match(T__4);
				setState(1120);
				marshalBlob();
				setState(1121);
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
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				nativeType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				marshalBlobHead();
				setState(1127);
				hexbytes(0);
				setState(1128);
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
			setState(1132);
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
		public MethAttrContext methAttr() {
			return getRuleContext(MethAttrContext.class,0);
		}
		public CallConvContext callConv() {
			return getRuleContext(CallConvContext.class,0);
		}
		public ParamAttrContext paramAttr() {
			return getRuleContext(ParamAttrContext.class,0);
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
		public ImplAttrContext implAttr() {
			return getRuleContext(ImplAttrContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			methodHeadPart1();
			setState(1135);
			methAttr(0);
			setState(1136);
			callConv();
			setState(1137);
			paramAttr(0);
			setState(1138);
			type(0);
			setState(1139);
			marshalClause();
			setState(1140);
			methodName();
			setState(1141);
			typarsClause();
			setState(1142);
			match(T__4);
			setState(1143);
			sigArgs0();
			setState(1144);
			match(T__5);
			setState(1145);
			implAttr(0);
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
		public MethAttrContext methAttr() {
			return getRuleContext(MethAttrContext.class,0);
		}
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
		public PinvAttrContext pinvAttr() {
			return getRuleContext(PinvAttrContext.class,0);
		}
		public List<CompQstringContext> compQstring() {
			return getRuleContexts(CompQstringContext.class);
		}
		public CompQstringContext compQstring(int i) {
			return getRuleContext(CompQstringContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(CilParser.K_AS, 0); }
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
		return methAttr(0);
	}

	private MethAttrContext methAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MethAttrContext _localctx = new MethAttrContext(_ctx, _parentState);
		MethAttrContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_methAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1148);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1149);
						match(K_STATIC);
						}
						break;
					case 2:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1150);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1151);
						match(K_PUBLIC);
						}
						break;
					case 3:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1152);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1153);
						match(K_PRIVATE);
						}
						break;
					case 4:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1154);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1155);
						match(K_FAMILY);
						}
						break;
					case 5:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1156);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1157);
						match(K_FINAL);
						}
						break;
					case 6:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1158);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1159);
						match(K_SPECIALNAME);
						}
						break;
					case 7:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1160);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1161);
						match(K_VIRTUAL);
						}
						break;
					case 8:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1162);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1163);
						match(K_STRICT);
						}
						break;
					case 9:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1164);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1165);
						match(K_ABSTRACT);
						}
						break;
					case 10:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1166);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1167);
						match(K_ASSEMBLY);
						}
						break;
					case 11:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1168);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1169);
						match(K_FAMANDASSEM);
						}
						break;
					case 12:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1170);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1171);
						match(K_FAMORASSEM);
						}
						break;
					case 13:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1172);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1173);
						match(K_PRIVATESCOPE);
						}
						break;
					case 14:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1174);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1175);
						match(K_HIDEBYSIG);
						}
						break;
					case 15:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1176);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1177);
						match(K_NEWSLOT);
						}
						break;
					case 16:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1179);
						match(K_RTSPECIALNAME);
						}
						break;
					case 17:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1180);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1181);
						match(K_UNMANAGEDEXP);
						}
						break;
					case 18:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1183);
						match(K_REQSECOBJ);
						}
						break;
					case 19:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1184);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1185);
						match(K_FLAGS);
						setState(1186);
						match(T__4);
						setState(1187);
						int32();
						setState(1188);
						match(T__5);
						}
						break;
					case 20:
						{
						_localctx = new MethAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_methAttr);
						setState(1190);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1191);
						match(K_PINVOKEIMPL);
						setState(1192);
						match(T__4);
						setState(1194);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(1193);
							compQstring(0);
							}
							break;
						}
						setState(1198);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
						case 1:
							{
							setState(1196);
							match(K_AS);
							setState(1197);
							compQstring(0);
							}
							break;
						}
						setState(1200);
						pinvAttr(0);
						setState(1201);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class PinvAttrContext extends ParserRuleContext {
		public PinvAttrContext pinvAttr() {
			return getRuleContext(PinvAttrContext.class,0);
		}
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
		return pinvAttr(0);
	}

	private PinvAttrContext pinvAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PinvAttrContext _localctx = new PinvAttrContext(_ctx, _parentState);
		PinvAttrContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_pinvAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1209);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1210);
						match(K_NOMANGLE);
						}
						break;
					case 2:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1211);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1212);
						match(K_ANSI);
						}
						break;
					case 3:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1213);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1214);
						match(K_UNICODE);
						}
						break;
					case 4:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1215);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1216);
						match(K_AUTOCHAR);
						}
						break;
					case 5:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1217);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1218);
						match(K_LASTERR);
						}
						break;
					case 6:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1219);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1220);
						match(K_WINAPI);
						}
						break;
					case 7:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1221);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1222);
						match(K_CDECL);
						}
						break;
					case 8:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1223);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1224);
						match(K_STDCALL);
						}
						break;
					case 9:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1225);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1226);
						match(K_THISCALL);
						}
						break;
					case 10:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1227);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1228);
						match(K_FASTCALL);
						}
						break;
					case 11:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1229);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1230);
						match(K_BESTFIT);
						setState(1231);
						match(T__13);
						setState(1232);
						match(K_ON);
						}
						break;
					case 12:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1233);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1234);
						match(K_BESTFIT);
						setState(1235);
						match(T__13);
						setState(1236);
						match(K_OFF);
						}
						break;
					case 13:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1237);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1238);
						match(K_CHARMAPERROR);
						setState(1239);
						match(T__13);
						setState(1240);
						match(K_ON);
						}
						break;
					case 14:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1241);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1242);
						match(K_CHARMAPERROR);
						setState(1243);
						match(T__13);
						setState(1244);
						match(K_OFF);
						}
						break;
					case 15:
						{
						_localctx = new PinvAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pinvAttr);
						setState(1245);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1246);
						match(K_FLAGS);
						setState(1247);
						match(T__4);
						setState(1248);
						int32();
						setState(1249);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(1255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
			setState(1259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_CTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				match(D_CTOR);
				}
				break;
			case D_CCTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				match(D_CCTOR);
				}
				break;
			case SQSTRING:
			case ID:
			case DOTTEDNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(1258);
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
		public ParamAttrContext paramAttr() {
			return getRuleContext(ParamAttrContext.class,0);
		}
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
		return paramAttr(0);
	}

	private ParamAttrContext paramAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamAttrContext _localctx = new ParamAttrContext(_ctx, _parentState);
		ParamAttrContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_paramAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new ParamAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_paramAttr);
						setState(1262);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1263);
						match(T__8);
						setState(1264);
						match(K_IN);
						setState(1265);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new ParamAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_paramAttr);
						setState(1266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1267);
						match(T__8);
						setState(1268);
						match(K_OUT);
						setState(1269);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new ParamAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_paramAttr);
						setState(1270);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1271);
						match(T__8);
						setState(1272);
						match(K_OPT);
						setState(1273);
						match(T__9);
						}
						break;
					case 4:
						{
						_localctx = new ParamAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_paramAttr);
						setState(1274);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1275);
						match(T__8);
						setState(1276);
						int32();
						setState(1277);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(1283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class ImplAttrContext extends ParserRuleContext {
		public ImplAttrContext implAttr() {
			return getRuleContext(ImplAttrContext.class,0);
		}
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
		return implAttr(0);
	}

	private ImplAttrContext implAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImplAttrContext _localctx = new ImplAttrContext(_ctx, _parentState);
		ImplAttrContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_implAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1285);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1286);
						match(K_NATIVE);
						}
						break;
					case 2:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1287);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1288);
						match(K_CIL);
						}
						break;
					case 3:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1289);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1290);
						match(K_OPTIL);
						}
						break;
					case 4:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1291);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1292);
						match(K_MANAGED);
						}
						break;
					case 5:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1293);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1294);
						match(K_UNMANAGED);
						}
						break;
					case 6:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1295);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1296);
						match(K_FORWARDREF);
						}
						break;
					case 7:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1297);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1298);
						match(K_PRESERVESIG);
						}
						break;
					case 8:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1299);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1300);
						match(K_RUNTIME);
						}
						break;
					case 9:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1301);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1302);
						match(K_INTERNALCALL);
						}
						break;
					case 10:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1303);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1304);
						match(K_SYNCHRONIZED);
						}
						break;
					case 11:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1305);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1306);
						match(K_NOINLINING);
						}
						break;
					case 12:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1307);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1308);
						match(K_AGGRESSIVEINLINING);
						}
						break;
					case 13:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1309);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1310);
						match(K_NOOPTIMIZATION);
						}
						break;
					case 14:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1311);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1312);
						match(K_AGGRESSIVEOPTIMIZATION);
						}
						break;
					case 15:
						{
						_localctx = new ImplAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_implAttr);
						setState(1313);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1314);
						match(K_FLAGS);
						setState(1315);
						match(T__4);
						setState(1316);
						int32();
						setState(1317);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(1323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
			setState(1324);
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
			setState(1329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1326);
					methodDecl();
					}
					} 
				}
				setState(1331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
		public TerminalNode D_EMITBYTE() { return getToken(CilParser.D_EMITBYTE, 0); }
		public List<Int32Context> int32() {
			return getRuleContexts(Int32Context.class);
		}
		public Int32Context int32(int i) {
			return getRuleContext(Int32Context.class,i);
		}
		public SehBlockContext sehBlock() {
			return getRuleContext(SehBlockContext.class,0);
		}
		public TerminalNode D_MAXSTACK() { return getToken(CilParser.D_MAXSTACK, 0); }
		public LocalsHeadContext localsHead() {
			return getRuleContext(LocalsHeadContext.class,0);
		}
		public SigArgs0Context sigArgs0() {
			return getRuleContext(SigArgs0Context.class,0);
		}
		public TerminalNode K_INIT() { return getToken(CilParser.K_INIT, 0); }
		public TerminalNode D_ENTRYPOINT() { return getToken(CilParser.D_ENTRYPOINT, 0); }
		public TerminalNode D_ZEROINIT() { return getToken(CilParser.D_ZEROINIT, 0); }
		public DataDeclContext dataDecl() {
			return getRuleContext(DataDeclContext.class,0);
		}
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SecDeclContext secDecl() {
			return getRuleContext(SecDeclContext.class,0);
		}
		public ExtSourceSpecContext extSourceSpec() {
			return getRuleContext(ExtSourceSpecContext.class,0);
		}
		public LanguageDeclContext languageDecl() {
			return getRuleContext(LanguageDeclContext.class,0);
		}
		public CustomAttrDeclContext customAttrDecl() {
			return getRuleContext(CustomAttrDeclContext.class,0);
		}
		public CompControlContext compControl() {
			return getRuleContext(CompControlContext.class,0);
		}
		public TerminalNode D_EXPORT() { return getToken(CilParser.D_EXPORT, 0); }
		public TerminalNode K_AS() { return getToken(CilParser.K_AS, 0); }
		public TerminalNode D_VTENTRY() { return getToken(CilParser.D_VTENTRY, 0); }
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
		public ScopeBlockContext scopeBlock() {
			return getRuleContext(ScopeBlockContext.class,0);
		}
		public TerminalNode D_PARAM() { return getToken(CilParser.D_PARAM, 0); }
		public TerminalNode K_TYPE() { return getToken(CilParser.K_TYPE, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(CilParser.K_CONSTRAINT, 0); }
		public InitOptContext initOpt() {
			return getRuleContext(InitOptContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodDecl);
		int _la;
		try {
			setState(1417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_EMITBYTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				match(D_EMITBYTE);
				setState(1333);
				int32();
				}
				break;
			case D_TRY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				sehBlock();
				}
				break;
			case D_MAXSTACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1335);
				match(D_MAXSTACK);
				setState(1336);
				int32();
				}
				break;
			case D_LOCALS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1337);
				localsHead();
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INIT) {
					{
					setState(1338);
					match(K_INIT);
					}
				}

				setState(1341);
				match(T__4);
				setState(1342);
				sigArgs0();
				setState(1343);
				match(T__5);
				}
				break;
			case D_ENTRYPOINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1345);
				match(D_ENTRYPOINT);
				}
				break;
			case D_ZEROINIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1346);
				match(D_ZEROINIT);
				}
				break;
			case D_DATA:
				enterOuterAlt(_localctx, 7);
				{
				setState(1347);
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
				enterOuterAlt(_localctx, 8);
				{
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQSTRING || _la==ID) {
					{
					setState(1348);
					id();
					setState(1349);
					match(T__13);
					}
				}

				setState(1353);
				instr();
				}
				break;
			case D_PERMISSION:
			case D_PERMISSIONSET:
				enterOuterAlt(_localctx, 9);
				{
				setState(1354);
				secDecl();
				}
				break;
			case D_LINE:
			case P_LINE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1355);
				extSourceSpec();
				}
				break;
			case D_LANGUAGE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1356);
				languageDecl();
				}
				break;
			case D_CUSTOM:
				enterOuterAlt(_localctx, 12);
				{
				setState(1357);
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
				enterOuterAlt(_localctx, 13);
				{
				setState(1358);
				compControl();
				}
				break;
			case D_EXPORT:
				enterOuterAlt(_localctx, 14);
				{
				setState(1359);
				match(D_EXPORT);
				setState(1360);
				match(T__8);
				setState(1361);
				int32();
				setState(1362);
				match(T__9);
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1363);
					match(K_AS);
					setState(1364);
					id();
					}
				}

				}
				break;
			case D_VTENTRY:
				enterOuterAlt(_localctx, 15);
				{
				setState(1367);
				match(D_VTENTRY);
				setState(1368);
				int32();
				setState(1369);
				match(T__13);
				setState(1370);
				int32();
				}
				break;
			case D_OVERRIDE:
				enterOuterAlt(_localctx, 16);
				{
				setState(1372);
				match(D_OVERRIDE);
				setState(1377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(1373);
					match(K_METHOD);
					setState(1374);
					callConv();
					setState(1375);
					type(0);
					}
					break;
				}
				setState(1379);
				typeSpec();
				setState(1380);
				match(DCOLON);
				setState(1381);
				methodName();
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__10) {
					{
					setState(1382);
					genArity();
					setState(1383);
					match(T__4);
					setState(1384);
					sigArgs0();
					setState(1385);
					match(T__5);
					}
				}

				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 17);
				{
				setState(1389);
				scopeBlock();
				}
				break;
			case D_PARAM:
				enterOuterAlt(_localctx, 18);
				{
				setState(1390);
				match(D_PARAM);
				setState(1415);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_TYPE:
					{
					setState(1391);
					match(K_TYPE);
					setState(1397);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(1392);
						match(T__8);
						setState(1393);
						int32();
						setState(1394);
						match(T__9);
						}
						break;
					case SQSTRING:
					case ID:
					case DOTTEDNAME:
						{
						setState(1396);
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
					setState(1399);
					match(K_CONSTRAINT);
					setState(1405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(1400);
						match(T__8);
						setState(1401);
						int32();
						setState(1402);
						match(T__9);
						}
						break;
					case SQSTRING:
					case ID:
					case DOTTEDNAME:
						{
						setState(1404);
						dottedName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1407);
					match(T__3);
					setState(1408);
					typeSpec();
					}
					break;
				case T__8:
					{
					setState(1410);
					match(T__8);
					setState(1411);
					int32();
					setState(1412);
					match(T__9);
					setState(1413);
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
			setState(1419);
			scopeOpen();
			setState(1420);
			methodDecls();
			setState(1421);
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
			setState(1423);
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
			setState(1425);
			tryBlock();
			setState(1426);
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
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				sehClause();
				setState(1429);
				sehClauses();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
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
			setState(1434);
			match(D_TRY);
			setState(1444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(1435);
				scopeBlock();
				}
				break;
			case SQSTRING:
			case ID:
				{
				setState(1436);
				id();
				setState(1437);
				match(K_TO);
				setState(1438);
				id();
				}
				break;
			case INT64:
				{
				setState(1440);
				int32();
				setState(1441);
				match(K_TO);
				setState(1442);
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
			setState(1458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1446);
				catchClause();
				setState(1447);
				handlerBlock();
				}
				break;
			case K_FILTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1449);
				filterClause();
				setState(1450);
				handlerBlock();
				}
				break;
			case K_FINALLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1452);
				finallyClause();
				setState(1453);
				handlerBlock();
				}
				break;
			case K_FAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1455);
				faultClause();
				setState(1456);
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
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1460);
				filterHead();
				setState(1461);
				scopeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1463);
				filterHead();
				setState(1464);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1466);
				filterHead();
				setState(1467);
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
			setState(1471);
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
			setState(1473);
			match(K_CATCH);
			setState(1474);
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
			setState(1476);
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
			setState(1478);
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
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1480);
				scopeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1481);
				match(K_HANDLER);
				setState(1482);
				id();
				setState(1483);
				match(K_TO);
				setState(1484);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1486);
				match(K_HANDLER);
				setState(1487);
				int32();
				setState(1488);
				match(K_TO);
				setState(1489);
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
			setState(1493);
			ddHead();
			setState(1494);
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
			setState(1503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				match(D_DATA);
				setState(1497);
				tls();
				setState(1498);
				id();
				setState(1499);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1501);
				match(D_DATA);
				setState(1502);
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
			setState(1508);
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
				setState(1506);
				match(K_TLS);
				}
				break;
			case K_CIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1507);
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
			setState(1515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				match(T__0);
				setState(1511);
				ddItemList();
				setState(1512);
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
				setState(1514);
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
			setState(1522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1517);
				ddItem();
				setState(1518);
				match(T__3);
				setState(1519);
				ddItemList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1521);
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
			setState(1529);
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
				setState(1525);
				match(T__8);
				setState(1526);
				int32();
				setState(1527);
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
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				match(K_CHAR);
				setState(1532);
				match(T__14);
				setState(1533);
				match(T__4);
				setState(1534);
				compQstring(0);
				setState(1535);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				match(T__15);
				setState(1538);
				match(T__4);
				setState(1539);
				id();
				setState(1540);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1542);
				bytearrayhead();
				setState(1543);
				bytes();
				setState(1544);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1546);
				match(K_FLOAT32);
				setState(1547);
				match(T__4);
				setState(1548);
				float64();
				setState(1549);
				match(T__5);
				setState(1550);
				ddItemCount();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1552);
				match(K_FLOAT64);
				setState(1553);
				match(T__4);
				setState(1554);
				float64();
				setState(1555);
				match(T__5);
				setState(1556);
				ddItemCount();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1558);
				match(K_INT64);
				setState(1559);
				match(T__4);
				setState(1560);
				int64();
				setState(1561);
				match(T__5);
				setState(1562);
				ddItemCount();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1564);
				match(K_INT32);
				setState(1565);
				match(T__4);
				setState(1566);
				int32();
				setState(1567);
				match(T__5);
				setState(1568);
				ddItemCount();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1570);
				match(K_INT16);
				setState(1571);
				match(T__4);
				setState(1572);
				int32();
				setState(1573);
				match(T__5);
				setState(1574);
				ddItemCount();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1576);
				match(K_INT8);
				setState(1577);
				match(T__4);
				setState(1578);
				int32();
				setState(1579);
				match(T__5);
				setState(1580);
				ddItemCount();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1582);
				match(K_FLOAT32);
				setState(1583);
				ddItemCount();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1584);
				match(K_FLOAT64);
				setState(1585);
				ddItemCount();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1586);
				match(K_INT64);
				setState(1587);
				ddItemCount();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1588);
				match(K_INT32);
				setState(1589);
				ddItemCount();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1590);
				match(K_INT16);
				setState(1591);
				ddItemCount();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1592);
				match(K_INT8);
				setState(1593);
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
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				match(K_FLOAT32);
				setState(1597);
				match(T__4);
				setState(1598);
				float64();
				setState(1599);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
				match(K_FLOAT64);
				setState(1602);
				match(T__4);
				setState(1603);
				float64();
				setState(1604);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1606);
				match(K_FLOAT32);
				setState(1607);
				match(T__4);
				setState(1608);
				int32();
				setState(1609);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1611);
				match(K_FLOAT64);
				setState(1612);
				match(T__4);
				setState(1613);
				int64();
				setState(1614);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1616);
				match(K_INT64);
				setState(1617);
				match(T__4);
				setState(1618);
				int64();
				setState(1619);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1621);
				match(K_INT32);
				setState(1622);
				match(T__4);
				setState(1623);
				int32();
				setState(1624);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1626);
				match(K_INT16);
				setState(1627);
				match(T__4);
				setState(1628);
				int32();
				setState(1629);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1631);
				match(K_INT8);
				setState(1632);
				match(T__4);
				setState(1633);
				int32();
				setState(1634);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1636);
				match(K_UNSIGNED);
				setState(1637);
				match(K_INT64);
				setState(1638);
				match(T__4);
				setState(1639);
				int64();
				setState(1640);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1642);
				match(K_UNSIGNED);
				setState(1643);
				match(K_INT32);
				setState(1644);
				match(T__4);
				setState(1645);
				int32();
				setState(1646);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1648);
				match(K_UNSIGNED);
				setState(1649);
				match(K_INT16);
				setState(1650);
				match(T__4);
				setState(1651);
				int32();
				setState(1652);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1654);
				match(K_UNSIGNED);
				setState(1655);
				match(K_INT8);
				setState(1656);
				match(T__4);
				setState(1657);
				int32();
				setState(1658);
				match(T__5);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1660);
				match(K_UINT64);
				setState(1661);
				match(T__4);
				setState(1662);
				int64();
				setState(1663);
				match(T__5);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1665);
				match(K_UINT32);
				setState(1666);
				match(T__4);
				setState(1667);
				int32();
				setState(1668);
				match(T__5);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1670);
				match(K_UINT16);
				setState(1671);
				match(T__4);
				setState(1672);
				int32();
				setState(1673);
				match(T__5);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1675);
				match(K_UINT8);
				setState(1676);
				match(T__4);
				setState(1677);
				int32();
				setState(1678);
				match(T__5);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1680);
				match(K_CHAR);
				setState(1681);
				match(T__4);
				setState(1682);
				int32();
				setState(1683);
				match(T__5);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1685);
				match(K_BOOL);
				setState(1686);
				match(T__4);
				setState(1687);
				truefalse();
				setState(1688);
				match(T__5);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1690);
				bytearrayhead();
				setState(1691);
				bytes();
				setState(1692);
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
			setState(1696);
			match(K_BYTEARRAY);
			setState(1697);
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
			setState(1701);
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
				setState(1700);
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
			setState(1704);
			match(HEXBYTE);
			}
			_ctx.stop = _input.LT(-1);
			setState(1710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new HexbytesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_hexbytes);
					setState(1706);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1707);
					match(HEXBYTE);
					}
					} 
				}
				setState(1712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
			setState(1716);
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
				setState(1713);
				fieldSerInit();
				}
				break;
			case QSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1714);
				compQstring(0);
				}
				break;
			case K_NULLREF:
				enterOuterAlt(_localctx, 3);
				{
				setState(1715);
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
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1718);
				fieldSerInit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1719);
				match(K_STRING);
				setState(1720);
				match(T__4);
				setState(1721);
				match(K_NULLREF);
				setState(1722);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1723);
				match(K_STRING);
				setState(1724);
				match(T__4);
				setState(1725);
				match(SQSTRING);
				setState(1726);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1727);
				match(K_TYPE);
				setState(1728);
				match(T__4);
				setState(1729);
				match(K_CLASS);
				setState(1730);
				match(SQSTRING);
				setState(1731);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1732);
				match(K_TYPE);
				setState(1733);
				match(T__4);
				setState(1734);
				className();
				setState(1735);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1737);
				match(K_TYPE);
				setState(1738);
				match(T__4);
				setState(1739);
				match(K_NULLREF);
				setState(1740);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1741);
				match(K_OBJECT);
				setState(1742);
				match(T__4);
				setState(1743);
				serInit();
				setState(1744);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1746);
				match(K_FLOAT32);
				setState(1747);
				match(T__8);
				setState(1748);
				int32();
				setState(1749);
				match(T__9);
				setState(1750);
				match(T__4);
				setState(1751);
				f32seq(0);
				setState(1752);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1754);
				match(K_FLOAT64);
				setState(1755);
				match(T__8);
				setState(1756);
				int32();
				setState(1757);
				match(T__9);
				setState(1758);
				match(T__4);
				setState(1759);
				f64seq(0);
				setState(1760);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1762);
				match(K_INT64);
				setState(1763);
				match(T__8);
				setState(1764);
				int32();
				setState(1765);
				match(T__9);
				setState(1766);
				match(T__4);
				setState(1767);
				i64seq(0);
				setState(1768);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1770);
				match(K_INT32);
				setState(1771);
				match(T__8);
				setState(1772);
				int32();
				setState(1773);
				match(T__9);
				setState(1774);
				match(T__4);
				setState(1775);
				i32seq(0);
				setState(1776);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1778);
				match(K_INT16);
				setState(1779);
				match(T__8);
				setState(1780);
				int32();
				setState(1781);
				match(T__9);
				setState(1782);
				match(T__4);
				setState(1783);
				i16seq(0);
				setState(1784);
				match(T__5);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1786);
				match(K_INT8);
				setState(1787);
				match(T__8);
				setState(1788);
				int32();
				setState(1789);
				match(T__9);
				setState(1790);
				match(T__4);
				setState(1791);
				i8seq(0);
				setState(1792);
				match(T__5);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1794);
				match(K_UINT64);
				setState(1795);
				match(T__8);
				setState(1796);
				int32();
				setState(1797);
				match(T__9);
				setState(1798);
				match(T__4);
				setState(1799);
				i64seq(0);
				setState(1800);
				match(T__5);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1802);
				match(K_UINT32);
				setState(1803);
				match(T__8);
				setState(1804);
				int32();
				setState(1805);
				match(T__9);
				setState(1806);
				match(T__4);
				setState(1807);
				i32seq(0);
				setState(1808);
				match(T__5);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1810);
				match(K_UINT16);
				setState(1811);
				match(T__8);
				setState(1812);
				int32();
				setState(1813);
				match(T__9);
				setState(1814);
				match(T__4);
				setState(1815);
				i16seq(0);
				setState(1816);
				match(T__5);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1818);
				match(K_UINT8);
				setState(1819);
				match(T__8);
				setState(1820);
				int32();
				setState(1821);
				match(T__9);
				setState(1822);
				match(T__4);
				setState(1823);
				i8seq(0);
				setState(1824);
				match(T__5);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1826);
				match(K_UNSIGNED);
				setState(1827);
				match(K_INT64);
				setState(1828);
				match(T__8);
				setState(1829);
				int32();
				setState(1830);
				match(T__9);
				setState(1831);
				match(T__4);
				setState(1832);
				i64seq(0);
				setState(1833);
				match(T__5);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1835);
				match(K_UNSIGNED);
				setState(1836);
				match(K_INT32);
				setState(1837);
				match(T__8);
				setState(1838);
				int32();
				setState(1839);
				match(T__9);
				setState(1840);
				match(T__4);
				setState(1841);
				i32seq(0);
				setState(1842);
				match(T__5);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1844);
				match(K_UNSIGNED);
				setState(1845);
				match(K_INT16);
				setState(1846);
				match(T__8);
				setState(1847);
				int32();
				setState(1848);
				match(T__9);
				setState(1849);
				match(T__4);
				setState(1850);
				i16seq(0);
				setState(1851);
				match(T__5);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1853);
				match(K_UNSIGNED);
				setState(1854);
				match(K_INT8);
				setState(1855);
				match(T__8);
				setState(1856);
				int32();
				setState(1857);
				match(T__9);
				setState(1858);
				match(T__4);
				setState(1859);
				i8seq(0);
				setState(1860);
				match(T__5);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1862);
				match(K_CHAR);
				setState(1863);
				match(T__8);
				setState(1864);
				int32();
				setState(1865);
				match(T__9);
				setState(1866);
				match(T__4);
				setState(1867);
				i16seq(0);
				setState(1868);
				match(T__5);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1870);
				match(K_BOOL);
				setState(1871);
				match(T__8);
				setState(1872);
				int32();
				setState(1873);
				match(T__9);
				setState(1874);
				match(T__4);
				setState(1875);
				boolSeq(0);
				setState(1876);
				match(T__5);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1878);
				match(K_STRING);
				setState(1879);
				match(T__8);
				setState(1880);
				int32();
				setState(1881);
				match(T__9);
				setState(1882);
				match(T__4);
				setState(1883);
				sqstringSeq(0);
				setState(1884);
				match(T__5);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1886);
				match(K_TYPE);
				setState(1887);
				match(T__8);
				setState(1888);
				int32();
				setState(1889);
				match(T__9);
				setState(1890);
				match(T__4);
				setState(1891);
				classSeq(0);
				setState(1892);
				match(T__5);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1894);
				match(K_OBJECT);
				setState(1895);
				match(T__8);
				setState(1896);
				int32();
				setState(1897);
				match(T__9);
				setState(1898);
				match(T__4);
				setState(1899);
				objSeq(0);
				setState(1900);
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
			setState(1911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1909);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						_localctx = new F32seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f32seq);
						setState(1905);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1906);
						float64();
						}
						break;
					case 2:
						{
						_localctx = new F32seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f32seq);
						setState(1907);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1908);
						int32();
						}
						break;
					}
					} 
				}
				setState(1913);
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
			setState(1921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1919);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new F64seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f64seq);
						setState(1915);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1916);
						float64();
						}
						break;
					case 2:
						{
						_localctx = new F64seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f64seq);
						setState(1917);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1918);
						int64();
						}
						break;
					}
					} 
				}
				setState(1923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
			setState(1929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new I64seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_i64seq);
					setState(1925);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1926);
					int64();
					}
					} 
				}
				setState(1931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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
			setState(1937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new I32seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_i32seq);
					setState(1933);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1934);
					int32();
					}
					} 
				}
				setState(1939);
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
			setState(1945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new I16seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_i16seq);
					setState(1941);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1942);
					int32();
					}
					} 
				}
				setState(1947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
			setState(1953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new I8seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_i8seq);
					setState(1949);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1950);
					int32();
					}
					} 
				}
				setState(1955);
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
			setState(1961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolSeqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolSeq);
					setState(1957);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1958);
					truefalse();
					}
					} 
				}
				setState(1963);
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
			setState(1971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1969);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						_localctx = new SqstringSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sqstringSeq);
						setState(1965);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1966);
						match(K_NULLREF);
						}
						break;
					case 2:
						{
						_localctx = new SqstringSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sqstringSeq);
						setState(1967);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1968);
						match(SQSTRING);
						}
						break;
					}
					} 
				}
				setState(1973);
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
			setState(1984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1982);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
					case 1:
						{
						_localctx = new ClassSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classSeq);
						setState(1975);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1976);
						match(K_NULLREF);
						}
						break;
					case 2:
						{
						_localctx = new ClassSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classSeq);
						setState(1977);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1978);
						match(K_CLASS);
						setState(1979);
						match(SQSTRING);
						}
						break;
					case 3:
						{
						_localctx = new ClassSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classSeq);
						setState(1980);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1981);
						className();
						}
						break;
					}
					} 
				}
				setState(1986);
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
			setState(1992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObjSeqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_objSeq);
					setState(1988);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1989);
					serInit();
					}
					} 
				}
				setState(1994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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
			setState(1995);
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
			setState(1997);
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
			setState(1999);
			match(INSTR_VAR);
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
		public TerminalNode INSTR_I() { return getToken(CilParser.INSTR_I, 0); }
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
			setState(2001);
			match(INSTR_I);
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
		public TerminalNode INSTR_I8() { return getToken(CilParser.INSTR_I8, 0); }
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
			setState(2003);
			match(INSTR_I8);
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
		public TerminalNode INSTR_R() { return getToken(CilParser.INSTR_R, 0); }
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
			setState(2005);
			match(INSTR_R);
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
			setState(2007);
			match(INSTR_BRTARGET);
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
			setState(2009);
			match(INSTR_METHOD);
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
			setState(2011);
			match(INSTR_FIELD);
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
			setState(2013);
			match(INSTR_TYPE);
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
			setState(2015);
			match(INSTR_STRING);
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
			setState(2017);
			match(INSTR_SIG);
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
			setState(2019);
			match(INSTR_TOK);
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
			setState(2021);
			match(INSTR_SWITCH);
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

	public static class Instr_r_headContext extends ParserRuleContext {
		public Instr_rContext instr_r() {
			return getRuleContext(Instr_rContext.class,0);
		}
		public Instr_r_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr_r_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterInstr_r_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitInstr_r_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitInstr_r_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instr_r_headContext instr_r_head() throws RecognitionException {
		Instr_r_headContext _localctx = new Instr_r_headContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_instr_r_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			instr_r();
			setState(2024);
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

	public static class InstrContext extends ParserRuleContext {
		public Instr_noneContext instr_none() {
			return getRuleContext(Instr_noneContext.class,0);
		}
		public Instr_varContext instr_var() {
			return getRuleContext(Instr_varContext.class,0);
		}
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Instr_iContext instr_i() {
			return getRuleContext(Instr_iContext.class,0);
		}
		public Instr_i8Context instr_i8() {
			return getRuleContext(Instr_i8Context.class,0);
		}
		public Int64Context int64() {
			return getRuleContext(Int64Context.class,0);
		}
		public Instr_rContext instr_r() {
			return getRuleContext(Instr_rContext.class,0);
		}
		public Float64Context float64() {
			return getRuleContext(Float64Context.class,0);
		}
		public Instr_r_headContext instr_r_head() {
			return getRuleContext(Instr_r_headContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public Instr_brtargetContext instr_brtarget() {
			return getRuleContext(Instr_brtargetContext.class,0);
		}
		public Instr_methodContext instr_method() {
			return getRuleContext(Instr_methodContext.class,0);
		}
		public MethodRefContext methodRef() {
			return getRuleContext(MethodRefContext.class,0);
		}
		public Instr_fieldContext instr_field() {
			return getRuleContext(Instr_fieldContext.class,0);
		}
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
		public Instr_typeContext instr_type() {
			return getRuleContext(Instr_typeContext.class,0);
		}
		public Instr_stringContext instr_string() {
			return getRuleContext(Instr_stringContext.class,0);
		}
		public CompQstringContext compQstring() {
			return getRuleContext(CompQstringContext.class,0);
		}
		public TerminalNode K_ANSI() { return getToken(CilParser.K_ANSI, 0); }
		public BytearrayheadContext bytearrayhead() {
			return getRuleContext(BytearrayheadContext.class,0);
		}
		public Instr_sigContext instr_sig() {
			return getRuleContext(Instr_sigContext.class,0);
		}
		public CallConvContext callConv() {
			return getRuleContext(CallConvContext.class,0);
		}
		public SigArgs0Context sigArgs0() {
			return getRuleContext(SigArgs0Context.class,0);
		}
		public Instr_tokContext instr_tok() {
			return getRuleContext(Instr_tokContext.class,0);
		}
		public OwnerTypeContext ownerType() {
			return getRuleContext(OwnerTypeContext.class,0);
		}
		public Instr_switchContext instr_switch() {
			return getRuleContext(Instr_switchContext.class,0);
		}
		public LabelsContext labels() {
			return getRuleContext(LabelsContext.class,0);
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
		enterRule(_localctx, 252, RULE_instr);
		try {
			setState(2103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2026);
				instr_none();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2027);
				instr_var();
				setState(2028);
				int32();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2030);
				instr_var();
				setState(2031);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2033);
				instr_i();
				setState(2034);
				int32();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2036);
				instr_i8();
				setState(2037);
				int64();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2039);
				instr_r();
				setState(2040);
				float64();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2042);
				instr_r();
				setState(2043);
				int64();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2045);
				instr_r_head();
				setState(2046);
				bytes();
				setState(2047);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2049);
				instr_brtarget();
				setState(2050);
				int32();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2052);
				instr_brtarget();
				setState(2053);
				id();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2055);
				instr_method();
				setState(2056);
				methodRef();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2058);
				instr_field();
				setState(2059);
				type(0);
				setState(2060);
				typeSpec();
				setState(2061);
				match(DCOLON);
				setState(2062);
				dottedName();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2064);
				instr_field();
				setState(2065);
				type(0);
				setState(2066);
				dottedName();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2068);
				instr_field();
				setState(2069);
				mdtoken();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2071);
				instr_type();
				setState(2072);
				typeSpec();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2074);
				instr_string();
				setState(2075);
				compQstring(0);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2077);
				instr_string();
				setState(2078);
				match(K_ANSI);
				setState(2079);
				match(T__4);
				setState(2080);
				compQstring(0);
				setState(2081);
				match(T__5);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2083);
				instr_string();
				setState(2084);
				bytearrayhead();
				setState(2085);
				bytes();
				setState(2086);
				match(T__5);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2088);
				instr_sig();
				setState(2089);
				callConv();
				setState(2090);
				type(0);
				setState(2091);
				match(T__4);
				setState(2092);
				sigArgs0();
				setState(2093);
				match(T__5);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2095);
				instr_tok();
				setState(2096);
				ownerType();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2098);
				instr_switch();
				setState(2099);
				match(T__4);
				setState(2100);
				labels();
				setState(2101);
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
		enterRule(_localctx, 254, RULE_labels);
		try {
			setState(2116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2106);
				id();
				setState(2107);
				match(T__3);
				setState(2108);
				labels();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2110);
				int32();
				setState(2111);
				match(T__3);
				setState(2112);
				labels();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2114);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2115);
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
		enterRule(_localctx, 256, RULE_tyArgs0);
		try {
			setState(2123);
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
				setState(2119);
				match(T__10);
				setState(2120);
				tyArgs1();
				setState(2121);
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
		enterRule(_localctx, 258, RULE_tyArgs1);
		try {
			setState(2127);
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
				setState(2126);
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
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_tyArgs2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2130);
			type(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TyArgs2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tyArgs2);
					setState(2132);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2133);
					match(T__3);
					setState(2134);
					type(0);
					}
					} 
				}
				setState(2139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
		enterRule(_localctx, 262, RULE_sigArgs0);
		try {
			setState(2142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2141);
				sigArgs1(0);
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

	public static class SigArgs1Context extends ParserRuleContext {
		public SigArgContext sigArg() {
			return getRuleContext(SigArgContext.class,0);
		}
		public SigArgs1Context sigArgs1() {
			return getRuleContext(SigArgs1Context.class,0);
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
		return sigArgs1(0);
	}

	private SigArgs1Context sigArgs1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SigArgs1Context _localctx = new SigArgs1Context(_ctx, _parentState);
		SigArgs1Context _prevctx = _localctx;
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_sigArgs1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2145);
			sigArg();
			}
			_ctx.stop = _input.LT(-1);
			setState(2152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SigArgs1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sigArgs1);
					setState(2147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2148);
					match(T__3);
					setState(2149);
					sigArg();
					}
					} 
				}
				setState(2154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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

	public static class SigArgContext extends ParserRuleContext {
		public TerminalNode ELIPSIS() { return getToken(CilParser.ELIPSIS, 0); }
		public ParamAttrContext paramAttr() {
			return getRuleContext(ParamAttrContext.class,0);
		}
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
		enterRule(_localctx, 266, RULE_sigArg);
		try {
			setState(2165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2155);
				match(ELIPSIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2156);
				paramAttr(0);
				setState(2157);
				type(0);
				setState(2158);
				marshalClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2160);
				paramAttr(0);
				setState(2161);
				type(0);
				setState(2162);
				marshalClause();
				setState(2163);
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
		enterRule(_localctx, 268, RULE_className);
		try {
			setState(2192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2167);
				match(T__8);
				setState(2168);
				dottedName();
				setState(2169);
				match(T__9);
				setState(2170);
				slashedName(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
				match(T__8);
				setState(2173);
				mdtoken();
				setState(2174);
				match(T__9);
				setState(2175);
				slashedName(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2177);
				match(T__8);
				setState(2178);
				match(T__14);
				setState(2179);
				match(T__9);
				setState(2180);
				slashedName(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2181);
				match(T__8);
				setState(2182);
				match(D_MODULE);
				setState(2183);
				dottedName();
				setState(2184);
				match(T__9);
				setState(2185);
				slashedName(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2187);
				slashedName(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2188);
				mdtoken();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2189);
				match(D_THIS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2190);
				match(D_BASE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2191);
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
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public SlashedNameContext slashedName() {
			return getRuleContext(SlashedNameContext.class,0);
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
		return slashedName(0);
	}

	private SlashedNameContext slashedName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SlashedNameContext _localctx = new SlashedNameContext(_ctx, _parentState);
		SlashedNameContext _prevctx = _localctx;
		int _startState = 270;
		enterRecursionRule(_localctx, 270, RULE_slashedName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2195);
			dottedName();
			}
			_ctx.stop = _input.LT(-1);
			setState(2202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SlashedNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_slashedName);
					setState(2197);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2198);
					match(T__16);
					setState(2199);
					dottedName();
					}
					} 
				}
				setState(2204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
		enterRule(_localctx, 272, RULE_typeSpec);
		try {
			setState(2216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2205);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2206);
				match(T__8);
				setState(2207);
				dottedName();
				setState(2208);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2210);
				match(T__8);
				setState(2211);
				match(D_MODULE);
				setState(2212);
				dottedName();
				setState(2213);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2215);
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
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_nativeType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(2219);
				match(K_CUSTOM);
				setState(2220);
				match(T__4);
				setState(2221);
				compQstring(0);
				setState(2222);
				match(T__3);
				setState(2223);
				compQstring(0);
				setState(2224);
				match(T__3);
				setState(2225);
				compQstring(0);
				setState(2226);
				match(T__3);
				setState(2227);
				compQstring(0);
				setState(2228);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(2230);
				match(K_CUSTOM);
				setState(2231);
				match(T__4);
				setState(2232);
				compQstring(0);
				setState(2233);
				match(T__3);
				setState(2234);
				compQstring(0);
				setState(2235);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(2237);
				match(K_FIXED);
				setState(2238);
				match(K_SYSSTRING);
				setState(2239);
				match(T__8);
				setState(2240);
				int32();
				setState(2241);
				match(T__9);
				}
				break;
			case 5:
				{
				setState(2243);
				match(K_FIXED);
				setState(2244);
				match(K_ARRAY);
				setState(2245);
				match(T__8);
				setState(2246);
				int32();
				setState(2247);
				match(T__9);
				setState(2248);
				nativeType(50);
				}
				break;
			case 6:
				{
				setState(2250);
				match(K_VARIANT);
				}
				break;
			case 7:
				{
				setState(2251);
				match(K_CURRENCY);
				}
				break;
			case 8:
				{
				setState(2252);
				match(K_SYSCHAR);
				}
				break;
			case 9:
				{
				setState(2253);
				match(K_VOID);
				}
				break;
			case 10:
				{
				setState(2254);
				match(K_BOOL);
				}
				break;
			case 11:
				{
				setState(2255);
				match(K_INT8);
				}
				break;
			case 12:
				{
				setState(2256);
				match(K_INT16);
				}
				break;
			case 13:
				{
				setState(2257);
				match(K_INT32);
				}
				break;
			case 14:
				{
				setState(2258);
				match(K_INT64);
				}
				break;
			case 15:
				{
				setState(2259);
				match(K_FLOAT32);
				}
				break;
			case 16:
				{
				setState(2260);
				match(K_FLOAT64);
				}
				break;
			case 17:
				{
				setState(2261);
				match(K_ERROR);
				}
				break;
			case 18:
				{
				setState(2262);
				match(K_UNSIGNED);
				setState(2263);
				match(K_INT8);
				}
				break;
			case 19:
				{
				setState(2264);
				match(K_UNSIGNED);
				setState(2265);
				match(K_INT16);
				}
				break;
			case 20:
				{
				setState(2266);
				match(K_UNSIGNED);
				setState(2267);
				match(K_INT32);
				}
				break;
			case 21:
				{
				setState(2268);
				match(K_UNSIGNED);
				setState(2269);
				match(K_INT64);
				}
				break;
			case 22:
				{
				setState(2270);
				match(K_UINT8);
				}
				break;
			case 23:
				{
				setState(2271);
				match(K_UINT16);
				}
				break;
			case 24:
				{
				setState(2272);
				match(K_UINT32);
				}
				break;
			case 25:
				{
				setState(2273);
				match(K_UINT64);
				}
				break;
			case 26:
				{
				setState(2274);
				match(K_DECIMAL);
				}
				break;
			case 27:
				{
				setState(2275);
				match(K_DATE);
				}
				break;
			case 28:
				{
				setState(2276);
				match(K_BSTR);
				}
				break;
			case 29:
				{
				setState(2277);
				match(K_LPSTR);
				}
				break;
			case 30:
				{
				setState(2278);
				match(K_LPWSTR);
				}
				break;
			case 31:
				{
				setState(2279);
				match(K_LPTSTR);
				}
				break;
			case 32:
				{
				setState(2280);
				match(K_OBJECTREF);
				}
				break;
			case 33:
				{
				setState(2281);
				match(K_IUNKNOWN);
				setState(2282);
				iidParamIndex();
				}
				break;
			case 34:
				{
				setState(2283);
				match(K_IDISPATCH);
				setState(2284);
				iidParamIndex();
				}
				break;
			case 35:
				{
				setState(2285);
				match(K_STRUCT);
				}
				break;
			case 36:
				{
				setState(2286);
				match(K_INTERFACE);
				setState(2287);
				iidParamIndex();
				}
				break;
			case 37:
				{
				setState(2288);
				match(K_SAFEARRAY);
				setState(2289);
				variantType(0);
				}
				break;
			case 38:
				{
				setState(2290);
				match(K_SAFEARRAY);
				setState(2291);
				variantType(0);
				setState(2292);
				match(T__3);
				setState(2293);
				compQstring(0);
				}
				break;
			case 39:
				{
				setState(2295);
				match(K_INT);
				}
				break;
			case 40:
				{
				setState(2296);
				match(K_UNSIGNED);
				setState(2297);
				match(K_INT);
				}
				break;
			case 41:
				{
				setState(2298);
				match(K_UINT);
				}
				break;
			case 42:
				{
				setState(2299);
				match(K_NESTED);
				setState(2300);
				match(K_STRUCT);
				}
				break;
			case 43:
				{
				setState(2301);
				match(K_BYVALSTR);
				}
				break;
			case 44:
				{
				setState(2302);
				match(K_ANSI);
				setState(2303);
				match(K_BSTR);
				}
				break;
			case 45:
				{
				setState(2304);
				match(K_TBSTR);
				}
				break;
			case 46:
				{
				setState(2305);
				match(K_VARIANT);
				setState(2306);
				match(K_BOOL);
				}
				break;
			case 47:
				{
				setState(2307);
				match(K_METHOD);
				}
				break;
			case 48:
				{
				setState(2308);
				match(K_AS);
				setState(2309);
				match(K_ANY);
				}
				break;
			case 49:
				{
				setState(2310);
				match(K_LPSTRUCT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2313);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(2314);
						match(T__14);
						}
						break;
					case 2:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2315);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(2316);
						match(T__8);
						setState(2317);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2318);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(2319);
						match(T__8);
						setState(2320);
						int32();
						setState(2321);
						match(T__9);
						}
						break;
					case 4:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2323);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(2324);
						match(T__8);
						setState(2325);
						int32();
						setState(2326);
						match(T__2);
						setState(2327);
						int32();
						setState(2328);
						match(T__9);
						}
						break;
					case 5:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2330);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(2331);
						match(T__8);
						setState(2332);
						match(T__2);
						setState(2333);
						int32();
						setState(2334);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(2340);
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
		enterRule(_localctx, 276, RULE_iidParamIndex);
		try {
			setState(2348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2342);
				match(T__4);
				setState(2343);
				match(K_IIDPARAM);
				setState(2344);
				match(T__7);
				setState(2345);
				int32();
				setState(2346);
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
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_variantType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(2351);
				match(K_NULL);
				}
				break;
			case 3:
				{
				setState(2352);
				match(K_VARIANT);
				}
				break;
			case 4:
				{
				setState(2353);
				match(K_CURRENCY);
				}
				break;
			case 5:
				{
				setState(2354);
				match(K_VOID);
				}
				break;
			case 6:
				{
				setState(2355);
				match(K_BOOL);
				}
				break;
			case 7:
				{
				setState(2356);
				match(K_INT8);
				}
				break;
			case 8:
				{
				setState(2357);
				match(K_INT16);
				}
				break;
			case 9:
				{
				setState(2358);
				match(K_INT32);
				}
				break;
			case 10:
				{
				setState(2359);
				match(K_INT64);
				}
				break;
			case 11:
				{
				setState(2360);
				match(K_FLOAT32);
				}
				break;
			case 12:
				{
				setState(2361);
				match(K_FLOAT64);
				}
				break;
			case 13:
				{
				setState(2362);
				match(K_UNSIGNED);
				setState(2363);
				match(K_INT8);
				}
				break;
			case 14:
				{
				setState(2364);
				match(K_UNSIGNED);
				setState(2365);
				match(K_INT16);
				}
				break;
			case 15:
				{
				setState(2366);
				match(K_UNSIGNED);
				setState(2367);
				match(K_INT32);
				}
				break;
			case 16:
				{
				setState(2368);
				match(K_UNSIGNED);
				setState(2369);
				match(K_INT64);
				}
				break;
			case 17:
				{
				setState(2370);
				match(K_UINT8);
				}
				break;
			case 18:
				{
				setState(2371);
				match(K_UINT16);
				}
				break;
			case 19:
				{
				setState(2372);
				match(K_UINT32);
				}
				break;
			case 20:
				{
				setState(2373);
				match(K_UINT64);
				}
				break;
			case 21:
				{
				setState(2374);
				match(T__14);
				}
				break;
			case 22:
				{
				setState(2375);
				match(K_DECIMAL);
				}
				break;
			case 23:
				{
				setState(2376);
				match(K_DATE);
				}
				break;
			case 24:
				{
				setState(2377);
				match(K_BSTR);
				}
				break;
			case 25:
				{
				setState(2378);
				match(K_LPSTR);
				}
				break;
			case 26:
				{
				setState(2379);
				match(K_LPWSTR);
				}
				break;
			case 27:
				{
				setState(2380);
				match(K_IUNKNOWN);
				}
				break;
			case 28:
				{
				setState(2381);
				match(K_IDISPATCH);
				}
				break;
			case 29:
				{
				setState(2382);
				match(K_SAFEARRAY);
				}
				break;
			case 30:
				{
				setState(2383);
				match(K_INT);
				}
				break;
			case 31:
				{
				setState(2384);
				match(K_UNSIGNED);
				setState(2385);
				match(K_INT);
				}
				break;
			case 32:
				{
				setState(2386);
				match(K_UINT);
				}
				break;
			case 33:
				{
				setState(2387);
				match(K_ERROR);
				}
				break;
			case 34:
				{
				setState(2388);
				match(K_HRESULT);
				}
				break;
			case 35:
				{
				setState(2389);
				match(K_CARRAY);
				}
				break;
			case 36:
				{
				setState(2390);
				match(K_USERDEFINED);
				}
				break;
			case 37:
				{
				setState(2391);
				match(K_RECORD);
				}
				break;
			case 38:
				{
				setState(2392);
				match(K_FILETIME);
				}
				break;
			case 39:
				{
				setState(2393);
				match(K_BLOB);
				}
				break;
			case 40:
				{
				setState(2394);
				match(K_STREAM);
				}
				break;
			case 41:
				{
				setState(2395);
				match(K_STORAGE);
				}
				break;
			case 42:
				{
				setState(2396);
				match(K_STREAMED_OBJECT);
				}
				break;
			case 43:
				{
				setState(2397);
				match(K_STORED_OBJECT);
				}
				break;
			case 44:
				{
				setState(2398);
				match(K_BLOB_OBJECT);
				}
				break;
			case 45:
				{
				setState(2399);
				match(K_CF);
				}
				break;
			case 46:
				{
				setState(2400);
				match(K_CLSID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2410);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						_localctx = new VariantTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variantType);
						setState(2403);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(2404);
						match(T__8);
						setState(2405);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new VariantTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variantType);
						setState(2406);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(2407);
						match(K_VECTOR);
						}
						break;
					case 3:
						{
						_localctx = new VariantTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variantType);
						setState(2408);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(2409);
						match(T__15);
						}
						break;
					}
					} 
				}
				setState(2414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
		int _startState = 280;
		enterRecursionRule(_localctx, 280, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(2416);
				match(K_CLASS);
				setState(2417);
				className();
				}
				break;
			case 2:
				{
				setState(2418);
				match(K_OBJECT);
				}
				break;
			case 3:
				{
				setState(2419);
				match(K_VALUE);
				setState(2420);
				match(K_CLASS);
				setState(2421);
				className();
				}
				break;
			case 4:
				{
				setState(2422);
				match(K_VALUETYPE);
				setState(2423);
				className();
				}
				break;
			case 5:
				{
				setState(2424);
				methodSpec();
				setState(2425);
				callConv();
				setState(2426);
				type(0);
				setState(2427);
				match(T__14);
				setState(2428);
				match(T__4);
				setState(2429);
				sigArgs0();
				setState(2430);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(2432);
				match(T__17);
				setState(2433);
				match(T__17);
				setState(2434);
				int32();
				}
				break;
			case 7:
				{
				setState(2435);
				match(T__17);
				setState(2436);
				int32();
				}
				break;
			case 8:
				{
				setState(2437);
				match(T__17);
				setState(2438);
				match(T__17);
				setState(2439);
				dottedName();
				}
				break;
			case 9:
				{
				setState(2440);
				match(T__17);
				setState(2441);
				dottedName();
				}
				break;
			case 10:
				{
				setState(2442);
				match(K_TYPEDREF);
				}
				break;
			case 11:
				{
				setState(2443);
				match(K_VOID);
				}
				break;
			case 12:
				{
				setState(2444);
				match(K_NATIVE);
				setState(2445);
				match(K_INT);
				}
				break;
			case 13:
				{
				setState(2446);
				match(K_NATIVE);
				setState(2447);
				match(K_UNSIGNED);
				setState(2448);
				match(K_INT);
				}
				break;
			case 14:
				{
				setState(2449);
				match(K_NATIVE);
				setState(2450);
				match(K_UINT);
				}
				break;
			case 15:
				{
				setState(2451);
				simpleType();
				}
				break;
			case 16:
				{
				setState(2452);
				match(ELIPSIS);
				setState(2453);
				type(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2487);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2456);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(2457);
						match(T__8);
						setState(2458);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2459);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2460);
						match(T__8);
						setState(2461);
						bounds1(0);
						setState(2462);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2464);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(2465);
						match(T__15);
						}
						break;
					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2466);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2467);
						match(T__14);
						}
						break;
					case 5:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2468);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2469);
						match(K_PINNED);
						}
						break;
					case 6:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2470);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2471);
						match(K_MODREQ);
						setState(2472);
						match(T__4);
						setState(2473);
						typeSpec();
						setState(2474);
						match(T__5);
						}
						break;
					case 7:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2476);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2477);
						match(K_MODOPT);
						setState(2478);
						match(T__4);
						setState(2479);
						typeSpec();
						setState(2480);
						match(T__5);
						}
						break;
					case 8:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2482);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2483);
						match(T__10);
						setState(2484);
						tyArgs1();
						setState(2485);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(2491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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
		enterRule(_localctx, 282, RULE_simpleType);
		try {
			setState(2513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2492);
				match(K_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2493);
				match(K_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2494);
				match(K_BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2495);
				match(K_INT8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2496);
				match(K_INT16);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2497);
				match(K_INT32);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2498);
				match(K_INT64);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2499);
				match(K_FLOAT32);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2500);
				match(K_FLOAT64);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2501);
				match(K_UNSIGNED);
				setState(2502);
				match(K_INT8);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2503);
				match(K_UNSIGNED);
				setState(2504);
				match(K_INT16);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2505);
				match(K_UNSIGNED);
				setState(2506);
				match(K_INT32);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2507);
				match(K_UNSIGNED);
				setState(2508);
				match(K_INT64);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2509);
				match(K_UINT8);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2510);
				match(K_UINT16);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2511);
				match(K_UINT32);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2512);
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
		int _startState = 284;
		enterRecursionRule(_localctx, 284, RULE_bounds1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2516);
			bound();
			}
			_ctx.stop = _input.LT(-1);
			setState(2523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bounds1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bounds1);
					setState(2518);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2519);
					match(T__3);
					setState(2520);
					bound();
					}
					} 
				}
				setState(2525);
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
		enterRule(_localctx, 286, RULE_bound);
		try {
			setState(2535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2527);
				match(ELIPSIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2528);
				int32();
				setState(2530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(2529);
					match(ELIPSIS);
					}
					break;
				}
				setState(2533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(2532);
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
		enterRule(_localctx, 288, RULE_secDecl);
		try {
			setState(2571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2537);
				match(D_PERMISSION);
				setState(2538);
				secAction();
				setState(2539);
				typeSpec();
				setState(2540);
				match(T__4);
				setState(2541);
				nameValPairs();
				setState(2542);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2544);
				match(D_PERMISSION);
				setState(2545);
				secAction();
				setState(2546);
				typeSpec();
				setState(2547);
				match(T__7);
				setState(2548);
				match(T__0);
				setState(2549);
				customBlobDescr();
				setState(2550);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2552);
				match(D_PERMISSION);
				setState(2553);
				secAction();
				setState(2554);
				typeSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2556);
				psetHead();
				setState(2557);
				bytes();
				setState(2558);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2560);
				match(D_PERMISSIONSET);
				setState(2561);
				secAction();
				setState(2562);
				compQstring(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2564);
				match(D_PERMISSIONSET);
				setState(2565);
				secAction();
				setState(2566);
				match(T__7);
				setState(2567);
				match(T__0);
				setState(2568);
				secAttrSetBlob();
				setState(2569);
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
		enterRule(_localctx, 290, RULE_secAttrSetBlob);
		try {
			setState(2579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2574);
				secAttrBlob();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2575);
				secAttrBlob();
				setState(2576);
				match(T__3);
				setState(2577);
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
		enterRule(_localctx, 292, RULE_secAttrBlob);
		try {
			setState(2594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2581);
				typeSpec();
				setState(2582);
				match(T__7);
				setState(2583);
				match(T__0);
				setState(2584);
				customBlobNVPairs();
				setState(2585);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2587);
				match(K_CLASS);
				setState(2588);
				match(SQSTRING);
				setState(2589);
				match(T__7);
				setState(2590);
				match(T__0);
				setState(2591);
				customBlobNVPairs();
				setState(2592);
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
		enterRule(_localctx, 294, RULE_psetHead);
		try {
			setState(2606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2596);
				match(D_PERMISSIONSET);
				setState(2597);
				secAction();
				setState(2598);
				match(T__7);
				setState(2599);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2601);
				match(D_PERMISSIONSET);
				setState(2602);
				secAction();
				setState(2603);
				match(K_BYTEARRAY);
				setState(2604);
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
		enterRule(_localctx, 296, RULE_nameValPairs);
		try {
			setState(2613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2608);
				nameValPair();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2609);
				nameValPair();
				setState(2610);
				match(T__3);
				setState(2611);
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
		enterRule(_localctx, 298, RULE_nameValPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2615);
			compQstring(0);
			setState(2616);
			match(T__7);
			setState(2617);
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
		enterRule(_localctx, 300, RULE_truefalse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2619);
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
		enterRule(_localctx, 302, RULE_caValue);
		try {
			setState(2655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2621);
				truefalse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2622);
				int32();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2623);
				match(K_INT32);
				setState(2624);
				match(T__4);
				setState(2625);
				int32();
				setState(2626);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2628);
				compQstring(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2629);
				className();
				setState(2630);
				match(T__4);
				setState(2631);
				match(K_INT8);
				setState(2632);
				match(T__13);
				setState(2633);
				int32();
				setState(2634);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2636);
				className();
				setState(2637);
				match(T__4);
				setState(2638);
				match(K_INT16);
				setState(2639);
				match(T__13);
				setState(2640);
				int32();
				setState(2641);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2643);
				className();
				setState(2644);
				match(T__4);
				setState(2645);
				match(K_INT32);
				setState(2646);
				match(T__13);
				setState(2647);
				int32();
				setState(2648);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2650);
				className();
				setState(2651);
				match(T__4);
				setState(2652);
				int32();
				setState(2653);
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
		enterRule(_localctx, 304, RULE_secAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
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
		enterRule(_localctx, 306, RULE_esHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2659);
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
		enterRule(_localctx, 308, RULE_extSourceSpec);
		try {
			setState(2732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2661);
				esHead();
				setState(2662);
				int32();
				setState(2663);
				match(SQSTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2665);
				esHead();
				setState(2666);
				int32();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2668);
				esHead();
				setState(2669);
				int32();
				setState(2670);
				match(T__13);
				setState(2671);
				int32();
				setState(2672);
				match(SQSTRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2674);
				esHead();
				setState(2675);
				int32();
				setState(2676);
				match(T__13);
				setState(2677);
				int32();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2679);
				esHead();
				setState(2680);
				int32();
				setState(2681);
				match(T__13);
				setState(2682);
				int32();
				setState(2683);
				match(T__3);
				setState(2684);
				int32();
				setState(2685);
				match(SQSTRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2687);
				esHead();
				setState(2688);
				int32();
				setState(2689);
				match(T__13);
				setState(2690);
				int32();
				setState(2691);
				match(T__3);
				setState(2692);
				int32();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2694);
				esHead();
				setState(2695);
				int32();
				setState(2696);
				match(T__3);
				setState(2697);
				int32();
				setState(2698);
				match(T__13);
				setState(2699);
				int32();
				setState(2700);
				match(SQSTRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2702);
				esHead();
				setState(2703);
				int32();
				setState(2704);
				match(T__3);
				setState(2705);
				int32();
				setState(2706);
				match(T__13);
				setState(2707);
				int32();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2709);
				esHead();
				setState(2710);
				int32();
				setState(2711);
				match(T__3);
				setState(2712);
				int32();
				setState(2713);
				match(T__13);
				setState(2714);
				int32();
				setState(2715);
				match(T__3);
				setState(2716);
				int32();
				setState(2717);
				match(SQSTRING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2719);
				esHead();
				setState(2720);
				int32();
				setState(2721);
				match(T__3);
				setState(2722);
				int32();
				setState(2723);
				match(T__13);
				setState(2724);
				int32();
				setState(2725);
				match(T__3);
				setState(2726);
				int32();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2728);
				esHead();
				setState(2729);
				int32();
				setState(2730);
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
		enterRule(_localctx, 310, RULE_fileDecl);
		try {
			setState(2748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2734);
				match(D_FILE);
				setState(2735);
				fileAttr(0);
				setState(2736);
				dottedName();
				setState(2737);
				fileEntry();
				setState(2738);
				hashHead();
				setState(2739);
				bytes();
				setState(2740);
				match(T__5);
				setState(2741);
				fileEntry();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2743);
				match(D_FILE);
				setState(2744);
				fileAttr(0);
				setState(2745);
				dottedName();
				setState(2746);
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
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_fileAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(2755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FileAttrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fileAttr);
					setState(2751);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2752);
					match(K_NOMETADATA);
					}
					} 
				}
				setState(2757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
		enterRule(_localctx, 314, RULE_fileEntry);
		try {
			setState(2760);
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
				setState(2759);
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
		enterRule(_localctx, 316, RULE_hashHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2762);
			match(D_HASH);
			setState(2763);
			match(T__7);
			setState(2764);
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
		enterRule(_localctx, 318, RULE_assemblyHead);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2766);
			match(D_ASSEMBLY);
			setState(2770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2767);
					asmAttr();
					}
					} 
				}
				setState(2772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			setState(2773);
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
		enterRule(_localctx, 320, RULE_asmAttr);
		try {
			setState(2785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RETARGETABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2775);
				match(K_RETARGETABLE);
				}
				break;
			case K_WINDOWSRUNTIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(2776);
				match(K_WINDOWSRUNTIME);
				}
				break;
			case K_NOPLATFORM:
				enterOuterAlt(_localctx, 3);
				{
				setState(2777);
				match(K_NOPLATFORM);
				}
				break;
			case K_LEGACY:
				enterOuterAlt(_localctx, 4);
				{
				setState(2778);
				match(K_LEGACY);
				setState(2779);
				match(K_LIBRARY);
				}
				break;
			case K_CIL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2780);
				match(K_CIL);
				}
				break;
			case K_X86:
				enterOuterAlt(_localctx, 6);
				{
				setState(2781);
				match(K_X86);
				}
				break;
			case K_AMD64:
				enterOuterAlt(_localctx, 7);
				{
				setState(2782);
				match(K_AMD64);
				}
				break;
			case K_ARM:
				enterOuterAlt(_localctx, 8);
				{
				setState(2783);
				match(K_ARM);
				}
				break;
			case K_ARM64:
				enterOuterAlt(_localctx, 9);
				{
				setState(2784);
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
		public AssemblyDeclsContext assemblyDecls() {
			return getRuleContext(AssemblyDeclsContext.class,0);
		}
		public AssemblyDeclContext assemblyDecl() {
			return getRuleContext(AssemblyDeclContext.class,0);
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
		return assemblyDecls(0);
	}

	private AssemblyDeclsContext assemblyDecls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AssemblyDeclsContext _localctx = new AssemblyDeclsContext(_ctx, _parentState);
		AssemblyDeclsContext _prevctx = _localctx;
		int _startState = 322;
		enterRecursionRule(_localctx, 322, RULE_assemblyDecls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(2792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssemblyDeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_assemblyDecls);
					setState(2788);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2789);
					assemblyDecl();
					}
					} 
				}
				setState(2794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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
		enterRule(_localctx, 324, RULE_assemblyDecl);
		try {
			setState(2800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(2795);
				match(D_HASH);
				setState(2796);
				match(K_ALGORITHM);
				setState(2797);
				int32();
				}
				break;
			case D_PERMISSION:
			case D_PERMISSIONSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(2798);
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
				setState(2799);
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
		enterRule(_localctx, 326, RULE_intOrWildcard);
		try {
			setState(2804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(2802);
				int32();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(2803);
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
		enterRule(_localctx, 328, RULE_asmOrRefDecl);
		try {
			setState(2827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2806);
				publicKeyHead();
				setState(2807);
				bytes();
				setState(2808);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2810);
				match(D_VER);
				setState(2811);
				intOrWildcard();
				setState(2812);
				match(T__13);
				setState(2813);
				intOrWildcard();
				setState(2814);
				match(T__13);
				setState(2815);
				intOrWildcard();
				setState(2816);
				match(T__13);
				setState(2817);
				intOrWildcard();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2819);
				match(D_LOCALE);
				setState(2820);
				compQstring(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2821);
				localeHead();
				setState(2822);
				bytes();
				setState(2823);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2825);
				customAttrDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2826);
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
		enterRule(_localctx, 330, RULE_publicKeyHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2829);
			match(D_PUBLICKEY);
			setState(2830);
			match(T__7);
			setState(2831);
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
		enterRule(_localctx, 332, RULE_publicKeyTokenHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2833);
			match(D_PUBLICKEYTOKEN);
			setState(2834);
			match(T__7);
			setState(2835);
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
		enterRule(_localctx, 334, RULE_localeHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2837);
			match(D_LOCALE);
			setState(2838);
			match(T__7);
			setState(2839);
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
		enterRule(_localctx, 336, RULE_assemblyRefHead);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2841);
			match(D_ASSEMBLY);
			setState(2842);
			match(K_EXTERN);
			setState(2846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2843);
					asmAttr();
					}
					} 
				}
				setState(2848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			setState(2849);
			dottedName();
			setState(2852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(2850);
				match(K_AS);
				setState(2851);
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
		public AssemblyRefDeclsContext assemblyRefDecls() {
			return getRuleContext(AssemblyRefDeclsContext.class,0);
		}
		public AssemblyRefDeclContext assemblyRefDecl() {
			return getRuleContext(AssemblyRefDeclContext.class,0);
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
		return assemblyRefDecls(0);
	}

	private AssemblyRefDeclsContext assemblyRefDecls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AssemblyRefDeclsContext _localctx = new AssemblyRefDeclsContext(_ctx, _parentState);
		AssemblyRefDeclsContext _prevctx = _localctx;
		int _startState = 338;
		enterRecursionRule(_localctx, 338, RULE_assemblyRefDecls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(2859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssemblyRefDeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_assemblyRefDecls);
					setState(2855);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2856);
					assemblyRefDecl();
					}
					} 
				}
				setState(2861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
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
		enterRule(_localctx, 340, RULE_assemblyRefDecl);
		try {
			setState(2872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(2862);
				hashHead();
				setState(2863);
				bytes();
				setState(2864);
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
				setState(2866);
				asmOrRefDecl();
				}
				break;
			case D_PUBLICKEYTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(2867);
				publicKeyTokenHead();
				setState(2868);
				bytes();
				setState(2869);
				match(T__5);
				}
				break;
			case K_AUTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(2871);
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
		enterRule(_localctx, 342, RULE_exptypeHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2874);
			match(D_CLASS);
			setState(2875);
			match(K_EXTERN);
			setState(2876);
			exptAttr();
			setState(2877);
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
		enterRule(_localctx, 344, RULE_exportHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2879);
			match(D_EXPORT);
			setState(2880);
			exptAttr();
			setState(2881);
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
		enterRule(_localctx, 346, RULE_exptAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_FORWARDER - 72)) | (1L << (K_PUBLIC - 72)) | (1L << (K_PRIVATE - 72)) | (1L << (K_NESTED - 72)))) != 0)) {
				{
				setState(2898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(2883);
					match(K_PRIVATE);
					}
					break;
				case 2:
					{
					setState(2884);
					match(K_PUBLIC);
					}
					break;
				case 3:
					{
					setState(2885);
					match(K_FORWARDER);
					}
					break;
				case 4:
					{
					setState(2886);
					match(K_NESTED);
					setState(2887);
					match(K_PUBLIC);
					}
					break;
				case 5:
					{
					setState(2888);
					match(K_NESTED);
					setState(2889);
					match(K_PRIVATE);
					}
					break;
				case 6:
					{
					setState(2890);
					match(K_NESTED);
					setState(2891);
					match(K_FAMILY);
					}
					break;
				case 7:
					{
					setState(2892);
					match(K_NESTED);
					setState(2893);
					match(K_ASSEMBLY);
					}
					break;
				case 8:
					{
					setState(2894);
					match(K_NESTED);
					setState(2895);
					match(K_FAMANDASSEM);
					}
					break;
				case 9:
					{
					setState(2896);
					match(K_NESTED);
					setState(2897);
					match(K_FAMORASSEM);
					}
					break;
				}
				}
				setState(2902);
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
		public ExptypeDeclsContext exptypeDecls() {
			return getRuleContext(ExptypeDeclsContext.class,0);
		}
		public ExptypeDeclContext exptypeDecl() {
			return getRuleContext(ExptypeDeclContext.class,0);
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
		return exptypeDecls(0);
	}

	private ExptypeDeclsContext exptypeDecls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExptypeDeclsContext _localctx = new ExptypeDeclsContext(_ctx, _parentState);
		ExptypeDeclsContext _prevctx = _localctx;
		int _startState = 348;
		enterRecursionRule(_localctx, 348, RULE_exptypeDecls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(2908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExptypeDeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exptypeDecls);
					setState(2904);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2905);
					exptypeDecl();
					}
					} 
				}
				setState(2910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
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
		enterRule(_localctx, 350, RULE_exptypeDecl);
		try {
			setState(2928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2911);
				match(D_FILE);
				setState(2912);
				dottedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2913);
				match(D_CLASS);
				setState(2914);
				match(K_EXTERN);
				setState(2915);
				slashedName(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2916);
				match(D_ASSEMBLY);
				setState(2917);
				match(K_EXTERN);
				setState(2918);
				dottedName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2919);
				match(K_MDTOKEN);
				setState(2920);
				match(T__4);
				setState(2921);
				int32();
				setState(2922);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2924);
				match(D_CLASS);
				setState(2925);
				int32();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2926);
				customAttrDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2927);
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
		public ManresAttrContext manresAttr() {
			return getRuleContext(ManresAttrContext.class,0);
		}
		public List<DottedNameContext> dottedName() {
			return getRuleContexts(DottedNameContext.class);
		}
		public DottedNameContext dottedName(int i) {
			return getRuleContext(DottedNameContext.class,i);
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
		enterRule(_localctx, 352, RULE_manifestResHead);
		try {
			setState(2940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2930);
				match(D_MRESOURCE);
				setState(2931);
				manresAttr(0);
				setState(2932);
				dottedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2934);
				match(D_MRESOURCE);
				setState(2935);
				manresAttr(0);
				setState(2936);
				dottedName();
				setState(2937);
				match(K_AS);
				setState(2938);
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

	public static class ManresAttrContext extends ParserRuleContext {
		public ManresAttrContext manresAttr() {
			return getRuleContext(ManresAttrContext.class,0);
		}
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
		return manresAttr(0);
	}

	private ManresAttrContext manresAttr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ManresAttrContext _localctx = new ManresAttrContext(_ctx, _parentState);
		ManresAttrContext _prevctx = _localctx;
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_manresAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(2949);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2947);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
					case 1:
						{
						_localctx = new ManresAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_manresAttr);
						setState(2943);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2944);
						match(K_PUBLIC);
						}
						break;
					case 2:
						{
						_localctx = new ManresAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_manresAttr);
						setState(2945);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2946);
						match(K_PRIVATE);
						}
						break;
					}
					} 
				}
				setState(2951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
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

	public static class ManifestResDeclsContext extends ParserRuleContext {
		public ManifestResDeclsContext manifestResDecls() {
			return getRuleContext(ManifestResDeclsContext.class,0);
		}
		public ManifestResDeclContext manifestResDecl() {
			return getRuleContext(ManifestResDeclContext.class,0);
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
		return manifestResDecls(0);
	}

	private ManifestResDeclsContext manifestResDecls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ManifestResDeclsContext _localctx = new ManifestResDeclsContext(_ctx, _parentState);
		ManifestResDeclsContext _prevctx = _localctx;
		int _startState = 356;
		enterRecursionRule(_localctx, 356, RULE_manifestResDecls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(2957);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ManifestResDeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_manifestResDecls);
					setState(2953);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2954);
					manifestResDecl();
					}
					} 
				}
				setState(2959);
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
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 358, RULE_manifestResDecl);
		try {
			setState(2970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2960);
				match(D_FILE);
				setState(2961);
				dottedName();
				setState(2962);
				match(K_AT);
				setState(2963);
				int32();
				}
				break;
			case D_ASSEMBLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2965);
				match(D_ASSEMBLY);
				setState(2966);
				match(K_EXTERN);
				setState(2967);
				dottedName();
				}
				break;
			case D_CUSTOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(2968);
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
				setState(2969);
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
		case 29:
			return classAttr_sempred((ClassAttrContext)_localctx, predIndex);
		case 33:
			return implList_sempred((ImplListContext)_localctx, predIndex);
		case 35:
			return typeListNotEmpty_sempred((TypeListNotEmptyContext)_localctx, predIndex);
		case 46:
			return fieldAttr_sempred((FieldAttrContext)_localctx, predIndex);
		case 56:
			return eventAttr_sempred((EventAttrContext)_localctx, predIndex);
		case 57:
			return eventDecls_sempred((EventDeclsContext)_localctx, predIndex);
		case 60:
			return propAttr_sempred((PropAttrContext)_localctx, predIndex);
		case 61:
			return propDecls_sempred((PropDeclsContext)_localctx, predIndex);
		case 68:
			return methAttr_sempred((MethAttrContext)_localctx, predIndex);
		case 69:
			return pinvAttr_sempred((PinvAttrContext)_localctx, predIndex);
		case 71:
			return paramAttr_sempred((ParamAttrContext)_localctx, predIndex);
		case 72:
			return implAttr_sempred((ImplAttrContext)_localctx, predIndex);
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
		case 130:
			return tyArgs2_sempred((TyArgs2Context)_localctx, predIndex);
		case 132:
			return sigArgs1_sempred((SigArgs1Context)_localctx, predIndex);
		case 135:
			return slashedName_sempred((SlashedNameContext)_localctx, predIndex);
		case 137:
			return nativeType_sempred((NativeTypeContext)_localctx, predIndex);
		case 139:
			return variantType_sempred((VariantTypeContext)_localctx, predIndex);
		case 140:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 142:
			return bounds1_sempred((Bounds1Context)_localctx, predIndex);
		case 156:
			return fileAttr_sempred((FileAttrContext)_localctx, predIndex);
		case 161:
			return assemblyDecls_sempred((AssemblyDeclsContext)_localctx, predIndex);
		case 169:
			return assemblyRefDecls_sempred((AssemblyRefDeclsContext)_localctx, predIndex);
		case 174:
			return exptypeDecls_sempred((ExptypeDeclsContext)_localctx, predIndex);
		case 177:
			return manresAttr_sempred((ManresAttrContext)_localctx, predIndex);
		case 178:
			return manifestResDecls_sempred((ManifestResDeclsContext)_localctx, predIndex);
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
	private boolean classAttr_sempred(ClassAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 26);
		case 8:
			return precpred(_ctx, 25);
		case 9:
			return precpred(_ctx, 24);
		case 10:
			return precpred(_ctx, 23);
		case 11:
			return precpred(_ctx, 22);
		case 12:
			return precpred(_ctx, 21);
		case 13:
			return precpred(_ctx, 20);
		case 14:
			return precpred(_ctx, 19);
		case 15:
			return precpred(_ctx, 18);
		case 16:
			return precpred(_ctx, 17);
		case 17:
			return precpred(_ctx, 16);
		case 18:
			return precpred(_ctx, 15);
		case 19:
			return precpred(_ctx, 14);
		case 20:
			return precpred(_ctx, 13);
		case 21:
			return precpred(_ctx, 12);
		case 22:
			return precpred(_ctx, 11);
		case 23:
			return precpred(_ctx, 10);
		case 24:
			return precpred(_ctx, 9);
		case 25:
			return precpred(_ctx, 8);
		case 26:
			return precpred(_ctx, 7);
		case 27:
			return precpred(_ctx, 6);
		case 28:
			return precpred(_ctx, 5);
		case 29:
			return precpred(_ctx, 4);
		case 30:
			return precpred(_ctx, 3);
		case 31:
			return precpred(_ctx, 2);
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean implList_sempred(ImplListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean typeListNotEmpty_sempred(TypeListNotEmptyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fieldAttr_sempred(FieldAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 15);
		case 36:
			return precpred(_ctx, 14);
		case 37:
			return precpred(_ctx, 13);
		case 38:
			return precpred(_ctx, 12);
		case 39:
			return precpred(_ctx, 11);
		case 40:
			return precpred(_ctx, 10);
		case 41:
			return precpred(_ctx, 9);
		case 42:
			return precpred(_ctx, 8);
		case 43:
			return precpred(_ctx, 7);
		case 44:
			return precpred(_ctx, 6);
		case 45:
			return precpred(_ctx, 5);
		case 46:
			return precpred(_ctx, 4);
		case 47:
			return precpred(_ctx, 3);
		case 48:
			return precpred(_ctx, 2);
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eventAttr_sempred(EventAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 2);
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eventDecls_sempred(EventDeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean propAttr_sempred(PropAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 2);
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean propDecls_sempred(PropDeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean methAttr_sempred(MethAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 20);
		case 57:
			return precpred(_ctx, 19);
		case 58:
			return precpred(_ctx, 18);
		case 59:
			return precpred(_ctx, 17);
		case 60:
			return precpred(_ctx, 16);
		case 61:
			return precpred(_ctx, 15);
		case 62:
			return precpred(_ctx, 14);
		case 63:
			return precpred(_ctx, 13);
		case 64:
			return precpred(_ctx, 12);
		case 65:
			return precpred(_ctx, 11);
		case 66:
			return precpred(_ctx, 10);
		case 67:
			return precpred(_ctx, 9);
		case 68:
			return precpred(_ctx, 8);
		case 69:
			return precpred(_ctx, 7);
		case 70:
			return precpred(_ctx, 6);
		case 71:
			return precpred(_ctx, 5);
		case 72:
			return precpred(_ctx, 4);
		case 73:
			return precpred(_ctx, 3);
		case 74:
			return precpred(_ctx, 2);
		case 75:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pinvAttr_sempred(PinvAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 76:
			return precpred(_ctx, 15);
		case 77:
			return precpred(_ctx, 14);
		case 78:
			return precpred(_ctx, 13);
		case 79:
			return precpred(_ctx, 12);
		case 80:
			return precpred(_ctx, 11);
		case 81:
			return precpred(_ctx, 10);
		case 82:
			return precpred(_ctx, 9);
		case 83:
			return precpred(_ctx, 8);
		case 84:
			return precpred(_ctx, 7);
		case 85:
			return precpred(_ctx, 6);
		case 86:
			return precpred(_ctx, 5);
		case 87:
			return precpred(_ctx, 4);
		case 88:
			return precpred(_ctx, 3);
		case 89:
			return precpred(_ctx, 2);
		case 90:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean paramAttr_sempred(ParamAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 91:
			return precpred(_ctx, 4);
		case 92:
			return precpred(_ctx, 3);
		case 93:
			return precpred(_ctx, 2);
		case 94:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean implAttr_sempred(ImplAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 95:
			return precpred(_ctx, 15);
		case 96:
			return precpred(_ctx, 14);
		case 97:
			return precpred(_ctx, 13);
		case 98:
			return precpred(_ctx, 12);
		case 99:
			return precpred(_ctx, 11);
		case 100:
			return precpred(_ctx, 10);
		case 101:
			return precpred(_ctx, 9);
		case 102:
			return precpred(_ctx, 8);
		case 103:
			return precpred(_ctx, 7);
		case 104:
			return precpred(_ctx, 6);
		case 105:
			return precpred(_ctx, 5);
		case 106:
			return precpred(_ctx, 4);
		case 107:
			return precpred(_ctx, 3);
		case 108:
			return precpred(_ctx, 2);
		case 109:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean hexbytes_sempred(HexbytesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 110:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean f32seq_sempred(F32seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 111:
			return precpred(_ctx, 2);
		case 112:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean f64seq_sempred(F64seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 113:
			return precpred(_ctx, 2);
		case 114:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i64seq_sempred(I64seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 115:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i32seq_sempred(I32seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 116:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i16seq_sempred(I16seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 117:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i8seq_sempred(I8seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 118:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolSeq_sempred(BoolSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 119:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sqstringSeq_sempred(SqstringSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 120:
			return precpred(_ctx, 2);
		case 121:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean classSeq_sempred(ClassSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 122:
			return precpred(_ctx, 3);
		case 123:
			return precpred(_ctx, 2);
		case 124:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean objSeq_sempred(ObjSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 125:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tyArgs2_sempred(TyArgs2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 126:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sigArgs1_sempred(SigArgs1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 127:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean slashedName_sempred(SlashedNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 128:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean nativeType_sempred(NativeTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 129:
			return precpred(_ctx, 29);
		case 130:
			return precpred(_ctx, 28);
		case 131:
			return precpred(_ctx, 27);
		case 132:
			return precpred(_ctx, 26);
		case 133:
			return precpred(_ctx, 25);
		}
		return true;
	}
	private boolean variantType_sempred(VariantTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 134:
			return precpred(_ctx, 28);
		case 135:
			return precpred(_ctx, 27);
		case 136:
			return precpred(_ctx, 26);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 137:
			return precpred(_ctx, 20);
		case 138:
			return precpred(_ctx, 19);
		case 139:
			return precpred(_ctx, 18);
		case 140:
			return precpred(_ctx, 17);
		case 141:
			return precpred(_ctx, 16);
		case 142:
			return precpred(_ctx, 15);
		case 143:
			return precpred(_ctx, 14);
		case 144:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean bounds1_sempred(Bounds1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 145:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fileAttr_sempred(FileAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 146:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assemblyDecls_sempred(AssemblyDeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 147:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assemblyRefDecls_sempred(AssemblyRefDeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 148:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exptypeDecls_sempred(ExptypeDeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 149:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean manresAttr_sempred(ManresAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 150:
			return precpred(_ctx, 2);
		case 151:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean manifestResDecls_sempred(ManifestResDeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 152:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u012e\u0b9f\4\2\t"+
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
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\3\2\7\2\u016c"+
		"\n\2\f\2\16\2\u016f\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\u01b1\n\3\3\4\3\4\3\4\3\4\5\4\u01b7\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5\u01bf\n\5\f\5\16\5\u01c2\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u01d0\n\6\3\7\3\7\3\b\3\b\5\b\u01d6\n\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u01e7\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01f6\n\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u020b\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0212\n\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0221\n\16"+
		"\3\17\3\17\5\17\u0225\n\17\3\20\3\20\3\20\3\21\3\21\7\21\u022c\n\21\f"+
		"\21\16\21\u022f\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0238\n"+
		"\22\f\22\16\22\u023b\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u024a\n\25\3\25\3\25\3\25\7\25\u024f\n\25\f"+
		"\25\16\25\u0252\13\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u025a\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u026f\n\30\f\30\16\30\u0272\13\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\7\37\u02cb\n\37\f\37\16\37\u02ce\13\37\3 \3 \5 \u02d2\n \3!\3"+
		"!\3!\5!\u02d7\n!\3\"\7\"\u02da\n\"\f\"\16\"\u02dd\13\"\3#\3#\3#\3#\3#"+
		"\3#\7#\u02e5\n#\f#\16#\u02e8\13#\3$\3$\5$\u02ec\n$\3%\3%\3%\3%\3%\3%\7"+
		"%\u02f4\n%\f%\16%\u02f7\13%\3&\3&\3&\3&\3&\5&\u02fe\n&\3\'\3\'\3(\3(\3"+
		"(\3(\5(\u0306\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0311\n)\3*\3*\3*\5*\u0316"+
		"\n*\3+\3+\3+\3+\3,\3,\5,\u031e\n,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\5.\u038b\n.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u03bc\n\60\f\60\16\60\u03bf\13\60"+
		"\3\61\3\61\3\61\5\61\u03c4\n\61\3\62\3\62\3\62\5\62\u03c9\n\62\3\63\3"+
		"\63\3\63\3\63\3\63\5\63\u03d0\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u03d7"+
		"\n\64\3\64\3\64\3\64\5\64\u03dc\n\64\3\64\3\64\3\64\3\64\3\65\7\65\u03e3"+
		"\n\65\f\65\16\65\u03e6\13\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u03ee"+
		"\n\65\3\66\3\66\3\66\3\66\5\66\u03f4\n\66\3\67\3\67\3\67\3\67\3\67\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u0409\n8\39\39\39\39\39\39"+
		"\39\39\39\59\u0414\n9\3:\3:\3:\3:\3:\7:\u041b\n:\f:\16:\u041e\13:\3;\3"+
		";\3;\7;\u0423\n;\f;\16;\u0426\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\5<\u0434\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\7>\u0445\n>"+
		"\f>\16>\u0448\13>\3?\3?\3?\7?\u044d\n?\f?\16?\u0450\13?\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\5@\u045c\n@\3A\3A\3B\3B\3B\3B\3B\3B\5B\u0466\nB\3C\3"+
		"C\3C\3C\3C\5C\u046d\nC\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\5F\u04ad\nF\3F\3F\5F\u04b1\nF\3F\3F\3F\7F\u04b6\nF\fF\16F\u04b9\13F"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u04e6"+
		"\nG\fG\16G\u04e9\13G\3H\3H\3H\5H\u04ee\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u0502\nI\fI\16I\u0505\13I\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\7J\u052a\nJ\fJ\16J\u052d\13J\3K\3K\3L\7L\u0532\n"+
		"L\fL\16L\u0535\13L\3M\3M\3M\3M\3M\3M\3M\5M\u053e\nM\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\5M\u054a\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0558"+
		"\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0564\nM\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\5M\u056e\nM\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0578\nM\3M\3M\3M\3M\3M\3M\5M"+
		"\u0580\nM\3M\3M\3M\3M\3M\3M\3M\3M\5M\u058a\nM\5M\u058c\nM\3N\3N\3N\3N"+
		"\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\5Q\u059b\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\5R\u05a7\nR\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u05b5\nS\3T\3T\3T"+
		"\3T\3T\3T\3T\3T\3T\5T\u05c0\nT\3U\3U\3V\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u05d6\nY\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\5[\u05e2"+
		"\n[\3\\\3\\\3\\\5\\\u05e7\n\\\3]\3]\3]\3]\3]\5]\u05ee\n]\3^\3^\3^\3^\3"+
		"^\5^\u05f5\n^\3_\3_\3_\3_\3_\5_\u05fc\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\5`\u063d\n`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u06a1\na\3b\3"+
		"b\3b\3c\3c\5c\u06a8\nc\3d\3d\3d\3d\3d\7d\u06af\nd\fd\16d\u06b2\13d\3e"+
		"\3e\3e\5e\u06b7\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\5f\u0771\nf\3g\3g\3g\3g\3g\7g\u0778\ng\fg\16g\u077b"+
		"\13g\3h\3h\3h\3h\3h\7h\u0782\nh\fh\16h\u0785\13h\3i\3i\3i\7i\u078a\ni"+
		"\fi\16i\u078d\13i\3j\3j\3j\7j\u0792\nj\fj\16j\u0795\13j\3k\3k\3k\7k\u079a"+
		"\nk\fk\16k\u079d\13k\3l\3l\3l\7l\u07a2\nl\fl\16l\u07a5\13l\3m\3m\3m\7"+
		"m\u07aa\nm\fm\16m\u07ad\13m\3n\3n\3n\3n\3n\7n\u07b4\nn\fn\16n\u07b7\13"+
		"n\3o\3o\3o\3o\3o\3o\3o\3o\7o\u07c1\no\fo\16o\u07c4\13o\3p\3p\3p\7p\u07c9"+
		"\np\fp\16p\u07cc\13p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3"+
		"y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\5\u0080\u083a\n\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u0847\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u084e\n"+
		"\u0082\3\u0083\3\u0083\5\u0083\u0852\n\u0083\3\u0084\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\7\u0084\u085a\n\u0084\f\u0084\16\u0084\u085d\13"+
		"\u0084\3\u0085\3\u0085\5\u0085\u0861\n\u0085\3\u0086\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\3\u0086\7\u0086\u0869\n\u0086\f\u0086\16\u0086\u086c\13"+
		"\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u0878\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u0893\n\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\7\u0089\u089b\n\u0089\f\u0089\16\u0089\u089e"+
		"\13\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u08ab\n\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\5\u008b\u090a\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b"+
		"\u0923\n\u008b\f\u008b\16\u008b\u0926\13\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u092f\n\u008c\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0964\n\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u096d\n\u008d\f\u008d"+
		"\16\u008d\u0970\13\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0999\n\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u09ba\n\u008e\f\u008e\16\u008e"+
		"\u09bd\13\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u09d4\n\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u09dc\n\u0090\f\u0090"+
		"\16\u0090\u09df\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u09e5"+
		"\n\u0091\3\u0091\5\u0091\u09e8\n\u0091\5\u0091\u09ea\n\u0091\3\u0092\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0a0e\n\u0092"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u0a16\n\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0a25\n\u0094\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095"+
		"\u0a31\n\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0a38\n"+
		"\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0a62\n\u0099\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\5\u009c\u0aaf\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\5\u009d\u0abf\n\u009d\3\u009e\3\u009e\3\u009e\7\u009e\u0ac4\n"+
		"\u009e\f\u009e\16\u009e\u0ac7\13\u009e\3\u009f\3\u009f\5\u009f\u0acb\n"+
		"\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\7\u00a1\u0ad3\n"+
		"\u00a1\f\u00a1\16\u00a1\u0ad6\13\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2"+
		"\u0ae4\n\u00a2\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u0ae9\n\u00a3\f\u00a3\16"+
		"\u00a3\u0aec\13\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u0af3\n\u00a4\3\u00a5\3\u00a5\5\u00a5\u0af7\n\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\5\u00a6\u0b0e\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa"+
		"\3\u00aa\7\u00aa\u0b1f\n\u00aa\f\u00aa\16\u00aa\u0b22\13\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\5\u00aa\u0b27\n\u00aa\3\u00ab\3\u00ab\3\u00ab\7\u00ab"+
		"\u0b2c\n\u00ab\f\u00ab\16\u00ab\u0b2f\13\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0b3b"+
		"\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\7\u00af\u0b55"+
		"\n\u00af\f\u00af\16\u00af\u0b58\13\u00af\3\u00b0\3\u00b0\3\u00b0\7\u00b0"+
		"\u0b5d\n\u00b0\f\u00b0\16\u00b0\u0b60\13\u00b0\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0b73\n\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\5\u00b2\u0b7f\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3"+
		"\u0b86\n\u00b3\f\u00b3\16\u00b3\u0b89\13\u00b3\3\u00b4\3\u00b4\3\u00b4"+
		"\7\u00b4\u0b8e\n\u00b4\f\u00b4\16\u00b4\u0b91\13\u00b4\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5"+
		"\u0b9d\n\u00b5\3\u00b5\t\u022d\u0239\u02db\u03e4\u0533\u0ad4\u0b20)\b"+
		"(.<DH^rtz|\u008a\u008c\u0090\u0092\u00c6\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u0106\u010a\u0110\u0114\u0118\u011a\u011e"+
		"\u013a\u0144\u0154\u015e\u0164\u0166\u00b6\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\2\n\3\2\u0126\u0127"+
		"\4\2iinn\7\2\5\5\17\17\65\65FFxx\4\2HHWW\4\2\60\60\62\64\3\2BC\3\2\u00b3"+
		"\u00c1\3\2\u00c2\u00c3\2\u0d50\2\u016d\3\2\2\2\4\u01b0\3\2\2\2\6\u01b6"+
		"\3\2\2\2\b\u01b8\3\2\2\2\n\u01cf\3\2\2\2\f\u01d1\3\2\2\2\16\u01d5\3\2"+
		"\2\2\20\u01d7\3\2\2\2\22\u01d9\3\2\2\2\24\u01e6\3\2\2\2\26\u01e8\3\2\2"+
		"\2\30\u020a\3\2\2\2\32\u020c\3\2\2\2\34\u0224\3\2\2\2\36\u0226\3\2\2\2"+
		" \u022d\3\2\2\2\"\u0239\3\2\2\2$\u023c\3\2\2\2&\u023e\3\2\2\2(\u0249\3"+
		"\2\2\2*\u0259\3\2\2\2,\u025b\3\2\2\2.\u0263\3\2\2\2\60\u0273\3\2\2\2\62"+
		"\u0277\3\2\2\2\64\u027b\3\2\2\2\66\u027f\3\2\2\28\u0281\3\2\2\2:\u0287"+
		"\3\2\2\2<\u028b\3\2\2\2>\u02d1\3\2\2\2@\u02d6\3\2\2\2B\u02db\3\2\2\2D"+
		"\u02de\3\2\2\2F\u02eb\3\2\2\2H\u02ed\3\2\2\2J\u02fd\3\2\2\2L\u02ff\3\2"+
		"\2\2N\u0305\3\2\2\2P\u0310\3\2\2\2R\u0315\3\2\2\2T\u0317\3\2\2\2V\u031d"+
		"\3\2\2\2X\u031f\3\2\2\2Z\u038a\3\2\2\2\\\u038c\3\2\2\2^\u0394\3\2\2\2"+
		"`\u03c3\3\2\2\2b\u03c8\3\2\2\2d\u03cf\3\2\2\2f\u03d1\3\2\2\2h\u03e4\3"+
		"\2\2\2j\u03f3\3\2\2\2l\u03f5\3\2\2\2n\u0408\3\2\2\2p\u0413\3\2\2\2r\u0415"+
		"\3\2\2\2t\u041f\3\2\2\2v\u0433\3\2\2\2x\u0435\3\2\2\2z\u043f\3\2\2\2|"+
		"\u0449\3\2\2\2~\u045b\3\2\2\2\u0080\u045d\3\2\2\2\u0082\u0465\3\2\2\2"+
		"\u0084\u046c\3\2\2\2\u0086\u046e\3\2\2\2\u0088\u0470\3\2\2\2\u008a\u047d"+
		"\3\2\2\2\u008c\u04ba\3\2\2\2\u008e\u04ed\3\2\2\2\u0090\u04ef\3\2\2\2\u0092"+
		"\u0506\3\2\2\2\u0094\u052e\3\2\2\2\u0096\u0533\3\2\2\2\u0098\u058b\3\2"+
		"\2\2\u009a\u058d\3\2\2\2\u009c\u0591\3\2\2\2\u009e\u0593\3\2\2\2\u00a0"+
		"\u059a\3\2\2\2\u00a2\u059c\3\2\2\2\u00a4\u05b4\3\2\2\2\u00a6\u05bf\3\2"+
		"\2\2\u00a8\u05c1\3\2\2\2\u00aa\u05c3\3\2\2\2\u00ac\u05c6\3\2\2\2\u00ae"+
		"\u05c8\3\2\2\2\u00b0\u05d5\3\2\2\2\u00b2\u05d7\3\2\2\2\u00b4\u05e1\3\2"+
		"\2\2\u00b6\u05e6\3\2\2\2\u00b8\u05ed\3\2\2\2\u00ba\u05f4\3\2\2\2\u00bc"+
		"\u05fb\3\2\2\2\u00be\u063c\3\2\2\2\u00c0\u06a0\3\2\2\2\u00c2\u06a2\3\2"+
		"\2\2\u00c4\u06a7\3\2\2\2\u00c6\u06a9\3\2\2\2\u00c8\u06b6\3\2\2\2\u00ca"+
		"\u0770\3\2\2\2\u00cc\u0772\3\2\2\2\u00ce\u077c\3\2\2\2\u00d0\u0786\3\2"+
		"\2\2\u00d2\u078e\3\2\2\2\u00d4\u0796\3\2\2\2\u00d6\u079e\3\2\2\2\u00d8"+
		"\u07a6\3\2\2\2\u00da\u07ae\3\2\2\2\u00dc\u07b8\3\2\2\2\u00de\u07c5\3\2"+
		"\2\2\u00e0\u07cd\3\2\2\2\u00e2\u07cf\3\2\2\2\u00e4\u07d1\3\2\2\2\u00e6"+
		"\u07d3\3\2\2\2\u00e8\u07d5\3\2\2\2\u00ea\u07d7\3\2\2\2\u00ec\u07d9\3\2"+
		"\2\2\u00ee\u07db\3\2\2\2\u00f0\u07dd\3\2\2\2\u00f2\u07df\3\2\2\2\u00f4"+
		"\u07e1\3\2\2\2\u00f6\u07e3\3\2\2\2\u00f8\u07e5\3\2\2\2\u00fa\u07e7\3\2"+
		"\2\2\u00fc\u07e9\3\2\2\2\u00fe\u0839\3\2\2\2\u0100\u0846\3\2\2\2\u0102"+
		"\u084d\3\2\2\2\u0104\u0851\3\2\2\2\u0106\u0853\3\2\2\2\u0108\u0860\3\2"+
		"\2\2\u010a\u0862\3\2\2\2\u010c\u0877\3\2\2\2\u010e\u0892\3\2\2\2\u0110"+
		"\u0894\3\2\2\2\u0112\u08aa\3\2\2\2\u0114\u0909\3\2\2\2\u0116\u092e\3\2"+
		"\2\2\u0118\u0963\3\2\2\2\u011a\u0998\3\2\2\2\u011c\u09d3\3\2\2\2\u011e"+
		"\u09d5\3\2\2\2\u0120\u09e9\3\2\2\2\u0122\u0a0d\3\2\2\2\u0124\u0a15\3\2"+
		"\2\2\u0126\u0a24\3\2\2\2\u0128\u0a30\3\2\2\2\u012a\u0a37\3\2\2\2\u012c"+
		"\u0a39\3\2\2\2\u012e\u0a3d\3\2\2\2\u0130\u0a61\3\2\2\2\u0132\u0a63\3\2"+
		"\2\2\u0134\u0a65\3\2\2\2\u0136\u0aae\3\2\2\2\u0138\u0abe\3\2\2\2\u013a"+
		"\u0ac0\3\2\2\2\u013c\u0aca\3\2\2\2\u013e\u0acc\3\2\2\2\u0140\u0ad0\3\2"+
		"\2\2\u0142\u0ae3\3\2\2\2\u0144\u0ae5\3\2\2\2\u0146\u0af2\3\2\2\2\u0148"+
		"\u0af6\3\2\2\2\u014a\u0b0d\3\2\2\2\u014c\u0b0f\3\2\2\2\u014e\u0b13\3\2"+
		"\2\2\u0150\u0b17\3\2\2\2\u0152\u0b1b\3\2\2\2\u0154\u0b28\3\2\2\2\u0156"+
		"\u0b3a\3\2\2\2\u0158\u0b3c\3\2\2\2\u015a\u0b41\3\2\2\2\u015c\u0b56\3\2"+
		"\2\2\u015e\u0b59\3\2\2\2\u0160\u0b72\3\2\2\2\u0162\u0b7e\3\2\2\2\u0164"+
		"\u0b80\3\2\2\2\u0166\u0b8a\3\2\2\2\u0168\u0b9c\3\2\2\2\u016a\u016c\5\4"+
		"\3\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\3\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\5:\36\2"+
		"\u0171\u0172\7\3\2\2\u0172\u0173\5B\"\2\u0173\u0174\7\4\2\2\u0174\u01b1"+
		"\3\2\2\2\u0175\u0176\5\64\33\2\u0176\u0177\7\3\2\2\u0177\u0178\5\2\2\2"+
		"\u0178\u0179\7\4\2\2\u0179\u01b1\3\2\2\2\u017a\u017b\5\u0088E\2\u017b"+
		"\u017c\7\3\2\2\u017c\u017d\5\u0096L\2\u017d\u017e\7\4\2\2\u017e\u01b1"+
		"\3\2\2\2\u017f\u01b1\5\\/\2\u0180\u01b1\5\u00b2Z\2\u0181\u01b1\5\60\31"+
		"\2\u0182\u01b1\5,\27\2\u0183\u01b1\5\u0136\u009c\2\u0184\u01b1\5\u0138"+
		"\u009d\2\u0185\u0186\5\u0140\u00a1\2\u0186\u0187\7\3\2\2\u0187\u0188\5"+
		"\u0144\u00a3\2\u0188\u0189\7\4\2\2\u0189\u01b1\3\2\2\2\u018a\u018b\5\u0152"+
		"\u00aa\2\u018b\u018c\7\3\2\2\u018c\u018d\5\u0154\u00ab\2\u018d\u018e\7"+
		"\4\2\2\u018e\u01b1\3\2\2\2\u018f\u0190\5\u0158\u00ad\2\u0190\u0191\7\3"+
		"\2\2\u0191\u0192\5\u015e\u00b0\2\u0192\u0193\7\4\2\2\u0193\u01b1\3\2\2"+
		"\2\u0194\u0195\5\u0162\u00b2\2\u0195\u0196\7\3\2\2\u0196\u0197\5\u0166"+
		"\u00b4\2\u0197\u0198\7\4\2\2\u0198\u01b1\3\2\2\2\u0199\u01b1\5*\26\2\u019a"+
		"\u01b1\5\u0122\u0092\2\u019b\u01b1\5&\24\2\u019c\u019d\7\u0110\2\2\u019d"+
		"\u01b1\5\20\t\2\u019e\u019f\7\u0111\2\2\u019f\u01b1\5\20\t\2\u01a0\u01a1"+
		"\7\u00cf\2\2\u01a1\u01a2\7\u0112\2\2\u01a2\u01b1\5\20\t\2\u01a3\u01a4"+
		"\7\u0113\2\2\u01a4\u01b1\5\22\n\2\u01a5\u01a6\7\u0114\2\2\u01a6\u01b1"+
		"\5\22\n\2\u01a7\u01b1\5\n\6\2\u01a8\u01b1\5\26\f\2\u01a9\u01b1\5\30\r"+
		"\2\u01aa\u01ab\7\u0117\2\2\u01ab\u01ac\7\3\2\2\u01ac\u01ad\5\6\4\2\u01ad"+
		"\u01ae\7\4\2\2\u01ae\u01b1\3\2\2\2\u01af\u01b1\7\u0118\2\2\u01b0\u0170"+
		"\3\2\2\2\u01b0\u0175\3\2\2\2\u01b0\u017a\3\2\2\2\u01b0\u017f\3\2\2\2\u01b0"+
		"\u0180\3\2\2\2\u01b0\u0181\3\2\2\2\u01b0\u0182\3\2\2\2\u01b0\u0183\3\2"+
		"\2\2\u01b0\u0184\3\2\2\2\u01b0\u0185\3\2\2\2\u01b0\u018a\3\2\2\2\u01b0"+
		"\u018f\3\2\2\2\u01b0\u0194\3\2\2\2\u01b0\u0199\3\2\2\2\u01b0\u019a\3\2"+
		"\2\2\u01b0\u019b\3\2\2\2\u01b0\u019c\3\2\2\2\u01b0\u019e\3\2\2\2\u01b0"+
		"\u01a0\3\2\2\2\u01b0\u01a3\3\2\2\2\u01b0\u01a5\3\2\2\2\u01b0\u01a7\3\2"+
		"\2\2\u01b0\u01a8\3\2\2\2\u01b0\u01a9\3\2\2\2\u01b0\u01aa\3\2\2\2\u01b0"+
		"\u01af\3\2\2\2\u01b1\5\3\2\2\2\u01b2\u01b7\3\2\2\2\u01b3\u01b4\5\u010e"+
		"\u0088\2\u01b4\u01b5\5\6\4\2\u01b5\u01b7\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b6"+
		"\u01b3\3\2\2\2\u01b7\7\3\2\2\2\u01b8\u01b9\b\5\1\2\u01b9\u01ba\7\u0125"+
		"\2\2\u01ba\u01c0\3\2\2\2\u01bb\u01bc\f\3\2\2\u01bc\u01bd\7\5\2\2\u01bd"+
		"\u01bf\7\u0125\2\2\u01be\u01bb\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\t\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3"+
		"\u01c4\7\u00c4\2\2\u01c4\u01d0\7\u0126\2\2\u01c5\u01c6\7\u00c4\2\2\u01c6"+
		"\u01c7\7\u0126\2\2\u01c7\u01c8\7\6\2\2\u01c8\u01d0\7\u0126\2\2\u01c9\u01ca"+
		"\7\u00c4\2\2\u01ca\u01cb\7\u0126\2\2\u01cb\u01cc\7\6\2\2\u01cc\u01cd\7"+
		"\u0126\2\2\u01cd\u01ce\7\6\2\2\u01ce\u01d0\7\u0126\2\2\u01cf\u01c3\3\2"+
		"\2\2\u01cf\u01c5\3\2\2\2\u01cf\u01c9\3\2\2\2\u01d0\13\3\2\2\2\u01d1\u01d2"+
		"\t\2\2\2\u01d2\r\3\2\2\2\u01d3\u01d6\5\f\7\2\u01d4\u01d6\7\u0128\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6\17\3\2\2\2\u01d7\u01d8\7\u0129"+
		"\2\2\u01d8\21\3\2\2\2\u01d9\u01da\7\u0129\2\2\u01da\23\3\2\2\2\u01db\u01e7"+
		"\7\u012a\2\2\u01dc\u01dd\7!\2\2\u01dd\u01de\7\7\2\2\u01de\u01df\5\20\t"+
		"\2\u01df\u01e0\7\b\2\2\u01e0\u01e7\3\2\2\2\u01e1\u01e2\7\"\2\2\u01e2\u01e3"+
		"\7\7\2\2\u01e3\u01e4\5\22\n\2\u01e4\u01e5\7\b\2\2\u01e5\u01e7\3\2\2\2"+
		"\u01e6\u01db\3\2\2\2\u01e6\u01dc\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e7\25"+
		"\3\2\2\2\u01e8\u01f5\7\u0115\2\2\u01e9\u01ea\5\u011a\u008e\2\u01ea\u01eb"+
		"\7\u0088\2\2\u01eb\u01f6\3\2\2\2\u01ec\u01ed\5\u010e\u0088\2\u01ed\u01ee"+
		"\7\u0088\2\2\u01ee\u01f6\3\2\2\2\u01ef\u01f0\5n8\2\u01f0\u01f1\7\u0088"+
		"\2\2\u01f1\u01f6\3\2\2\2\u01f2\u01f3\5\32\16\2\u01f3\u01f4\7\u0088\2\2"+
		"\u01f4\u01f6\3\2\2\2\u01f5\u01e9\3\2\2\2\u01f5\u01ec\3\2\2\2\u01f5\u01ef"+
		"\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\5\16\b\2"+
		"\u01f8\27\3\2\2\2\u01f9\u01fa\7\u0119\2\2\u01fa\u020b\5\16\b\2\u01fb\u01fc"+
		"\7\u0119\2\2\u01fc\u01fd\5\16\b\2\u01fd\u01fe\5\b\5\2\u01fe\u020b\3\2"+
		"\2\2\u01ff\u0200\7\u011a\2\2\u0200\u020b\5\16\b\2\u0201\u0202\7\u011b"+
		"\2\2\u0202\u020b\5\16\b\2\u0203\u0204\7\u011c\2\2\u0204\u020b\5\16\b\2"+
		"\u0205\u020b\7\u011d\2\2\u0206\u020b\7\u011e\2\2\u0207\u0208\7\u011f\2"+
		"\2\u0208\u020b\7\u0125\2\2\u0209\u020b\7\t\2\2\u020a\u01f9\3\2\2\2\u020a"+
		"\u01fb\3\2\2\2\u020a\u01ff\3\2\2\2\u020a\u0201\3\2\2\2\u020a\u0203\3\2"+
		"\2\2\u020a\u0205\3\2\2\2\u020a\u0206\3\2\2\2\u020a\u0207\3\2\2\2\u020a"+
		"\u0209\3\2\2\2\u020b\31\3\2\2\2\u020c\u0211\7\u00c5\2\2\u020d\u020e\7"+
		"\7\2\2\u020e\u020f\5\34\17\2\u020f\u0210\7\b\2\2\u0210\u0212\3\2\2\2\u0211"+
		"\u020d\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0220\5f"+
		"\64\2\u0214\u0215\7\n\2\2\u0215\u0221\5\b\5\2\u0216\u0217\7\n\2\2\u0217"+
		"\u0218\7\3\2\2\u0218\u0219\5\36\20\2\u0219\u021a\7\4\2\2\u021a\u0221\3"+
		"\2\2\2\u021b\u021c\7\n\2\2\u021c\u021d\7\7\2\2\u021d\u021e\5\u00c4c\2"+
		"\u021e\u021f\7\b\2\2\u021f\u0221\3\2\2\2\u0220\u0214\3\2\2\2\u0220\u0216"+
		"\3\2\2\2\u0220\u021b\3\2\2\2\u0221\33\3\2\2\2\u0222\u0225\5\u0112\u008a"+
		"\2\u0223\u0225\5n8\2\u0224\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225\35"+
		"\3\2\2\2\u0226\u0227\5 \21\2\u0227\u0228\5\"\22\2\u0228\37\3\2\2\2\u0229"+
		"\u022c\5\u00caf\2\u022a\u022c\5\30\r\2\u022b\u0229\3\2\2\2\u022b\u022a"+
		"\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e"+
		"!\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\5$\23\2\u0231\u0232\5(\25\2"+
		"\u0232\u0233\5\16\b\2\u0233\u0234\7\n\2\2\u0234\u0235\5\u00caf\2\u0235"+
		"\u0238\3\2\2\2\u0236\u0238\5\30\r\2\u0237\u0230\3\2\2\2\u0237\u0236\3"+
		"\2\2\2\u0238\u023b\3\2\2\2\u0239\u023a\3\2\2\2\u0239\u0237\3\2\2\2\u023a"+
		"#\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\t\3\2\2\u023d%\3\2\2\2\u023e"+
		"\u023f\5\32\16\2\u023f\'\3\2\2\2\u0240\u0241\b\25\1\2\u0241\u024a\5\u011c"+
		"\u008f\2\u0242\u024a\7o\2\2\u0243\u024a\7,\2\2\u0244\u0245\7\\\2\2\u0245"+
		"\u0246\7\65\2\2\u0246\u024a\7\u0126\2\2\u0247\u0248\7\\\2\2\u0248\u024a"+
		"\5\u010e\u0088\2\u0249\u0240\3\2\2\2\u0249\u0242\3\2\2\2\u0249\u0243\3"+
		"\2\2\2\u0249\u0244\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u0250\3\2\2\2\u024b"+
		"\u024c\f\3\2\2\u024c\u024d\7\13\2\2\u024d\u024f\7\f\2\2\u024e\u024b\3"+
		"\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		")\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u025a\7\u00da\2\2\u0254\u0255\7\u00da"+
		"\2\2\u0255\u025a\5\16\b\2\u0256\u0257\7\u00da\2\2\u0257\u0258\7\u00d8"+
		"\2\2\u0258\u025a\5\16\b\2\u0259\u0253\3\2\2\2\u0259\u0254\3\2\2\2\u0259"+
		"\u0256\3\2\2\2\u025a+\3\2\2\2\u025b\u025c\7\u00ca\2\2\u025c\u025d\7\13"+
		"\2\2\u025d\u025e\5\20\t\2\u025e\u025f\7\f\2\2\u025f\u0260\5.\30\2\u0260"+
		"\u0261\7@\2\2\u0261\u0262\5\f\7\2\u0262-\3\2\2\2\u0263\u0270\b\30\1\2"+
		"\u0264\u0265\f\7\2\2\u0265\u026f\7\36\2\2\u0266\u0267\f\6\2\2\u0267\u026f"+
		"\7\37\2\2\u0268\u0269\f\5\2\2\u0269\u026f\7\u00cb\2\2\u026a\u026b\f\4"+
		"\2\2\u026b\u026f\7\u00cc\2\2\u026c\u026d\f\3\2\2\u026d\u026f\7\u00ce\2"+
		"\2\u026e\u0264\3\2\2\2\u026e\u0266\3\2\2\2\u026e\u0268\3\2\2\2\u026e\u026a"+
		"\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271/\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0274\5\62\32"+
		"\2\u0274\u0275\5\u00c4c\2\u0275\u0276\7\b\2\2\u0276\61\3\2\2\2\u0277\u0278"+
		"\7\u00c9\2\2\u0278\u0279\7\n\2\2\u0279\u027a\7\7\2\2\u027a\63\3\2\2\2"+
		"\u027b\u027c\7\u009b\2\2\u027c\u027d\5\16\b\2\u027d\u027e\b\33\1\2\u027e"+
		"\65\3\2\2\2\u027f\u0280\7\u009a\2\2\u0280\67\3\2\2\2\u0281\u0282\5\66"+
		"\34\2\u0282\u0283\5<\37\2\u0283\u0284\5\16\b\2\u0284\u0285\5J&\2\u0285"+
		"\u0286\b\35\1\2\u02869\3\2\2\2\u0287\u0288\58\35\2\u0288\u0289\5> \2\u0289"+
		"\u028a\5@!\2\u028a;\3\2\2\2\u028b\u02cc\b\37\1\2\u028c\u028d\f\34\2\2"+
		"\u028d\u02cb\7L\2\2\u028e\u028f\f\33\2\2\u028f\u02cb\7M\2\2\u0290\u0291"+
		"\f\32\2\2\u0291\u02cb\7E\2\2\u0292\u0293\f\31\2\2\u0293\u02cb\7\\\2\2"+
		"\u0294\u0295\f\30\2\2\u0295\u02cb\7Q\2\2\u0296\u0297\f\27\2\2\u0297\u02cb"+
		"\7R\2\2\u0298\u0299\f\26\2\2\u0299\u02cb\7T\2\2\u029a\u029b\f\25\2\2\u029b"+
		"\u02cb\7U\2\2\u029c\u029d\f\24\2\2\u029d\u02cb\7V\2\2\u029e\u029f\f\23"+
		"\2\2\u029f\u02cb\7W\2\2\u02a0\u02a1\f\22\2\2\u02a1\u02cb\7X\2\2\u02a2"+
		"\u02a3\f\21\2\2\u02a3\u02cb\7Y\2\2\u02a4\u02a5\f\20\2\2\u02a5\u02cb\7"+
		"Z\2\2\u02a6\u02a7\f\17\2\2\u02a7\u02cb\7[\2\2\u02a8\u02a9\f\16\2\2\u02a9"+
		"\u02cb\7m\2\2\u02aa\u02ab\f\r\2\2\u02ab\u02cb\7f\2\2\u02ac\u02ad\f\f\2"+
		"\2\u02ad\u02ae\7S\2\2\u02ae\u02cb\7L\2\2\u02af\u02b0\f\13\2\2\u02b0\u02b1"+
		"\7S\2\2\u02b1\u02cb\7M\2\2\u02b2\u02b3\f\n\2\2\u02b3\u02b4\7S\2\2\u02b4"+
		"\u02cb\7N\2\2\u02b5\u02b6\f\t\2\2\u02b6\u02b7\7S\2\2\u02b7\u02cb\7p\2"+
		"\2\u02b8\u02b9\f\b\2\2\u02b9\u02ba\7S\2\2\u02ba\u02cb\7q\2\2\u02bb\u02bc"+
		"\f\7\2\2\u02bc\u02bd\7S\2\2\u02bd\u02cb\7r\2\2\u02be\u02bf\f\6\2\2\u02bf"+
		"\u02cb\7c\2\2\u02c0\u02c1\f\5\2\2\u02c1\u02cb\7I\2\2\u02c2\u02c3\f\4\2"+
		"\2\u02c3\u02cb\7v\2\2\u02c4\u02c5\f\3\2\2\u02c5\u02c6\7)\2\2\u02c6\u02c7"+
		"\7\7\2\2\u02c7\u02c8\5\20\t\2\u02c8\u02c9\7\b\2\2\u02c9\u02cb\3\2\2\2"+
		"\u02ca\u028c\3\2\2\2\u02ca\u028e\3\2\2\2\u02ca\u0290\3\2\2\2\u02ca\u0292"+
		"\3\2\2\2\u02ca\u0294\3\2\2\2\u02ca\u0296\3\2\2\2\u02ca\u0298\3\2\2\2\u02ca"+
		"\u029a\3\2\2\2\u02ca\u029c\3\2\2\2\u02ca\u029e\3\2\2\2\u02ca\u02a0\3\2"+
		"\2\2\u02ca\u02a2\3\2\2\2\u02ca\u02a4\3\2\2\2\u02ca\u02a6\3\2\2\2\u02ca"+
		"\u02a8\3\2\2\2\u02ca\u02aa\3\2\2\2\u02ca\u02ac\3\2\2\2\u02ca\u02af\3\2"+
		"\2\2\u02ca\u02b2\3\2\2\2\u02ca\u02b5\3\2\2\2\u02ca\u02b8\3\2\2\2\u02ca"+
		"\u02bb\3\2\2\2\u02ca\u02be\3\2\2\2\u02ca\u02c0\3\2\2\2\u02ca\u02c2\3\2"+
		"\2\2\u02ca\u02c4\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd=\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7=\2\2\u02d0"+
		"\u02d2\5\u0112\u008a\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2?"+
		"\3\2\2\2\u02d3\u02d7\3\2\2\2\u02d4\u02d5\7>\2\2\u02d5\u02d7\5D#\2\u02d6"+
		"\u02d3\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7A\3\2\2\2\u02d8\u02da\5Z.\2\u02d9"+
		"\u02d8\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02dc\3\2\2\2\u02db\u02d9\3\2"+
		"\2\2\u02dcC\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02df\b#\1\2\u02df\u02e0"+
		"\5\u0112\u008a\2\u02e0\u02e6\3\2\2\2\u02e1\u02e2\f\4\2\2\u02e2\u02e3\7"+
		"\6\2\2\u02e3\u02e5\5\u0112\u008a\2\u02e4\u02e1\3\2\2\2\u02e5\u02e8\3\2"+
		"\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7E\3\2\2\2\u02e8\u02e6"+
		"\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02ec\5H%\2\u02eb\u02e9\3\2\2\2\u02eb"+
		"\u02ea\3\2\2\2\u02ecG\3\2\2\2\u02ed\u02ee\b%\1\2\u02ee\u02ef\5\u0112\u008a"+
		"\2\u02ef\u02f5\3\2\2\2\u02f0\u02f1\f\3\2\2\u02f1\u02f2\7\6\2\2\u02f2\u02f4"+
		"\5\u0112\u008a\2\u02f3\u02f0\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3"+
		"\2\2\2\u02f5\u02f6\3\2\2\2\u02f6I\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02fe"+
		"\3\2\2\2\u02f9\u02fa\7\r\2\2\u02fa\u02fb\5P)\2\u02fb\u02fc\7\16\2\2\u02fc"+
		"\u02fe\3\2\2\2\u02fd\u02f8\3\2\2\2\u02fd\u02f9\3\2\2\2\u02feK\3\2\2\2"+
		"\u02ff\u0300\t\4\2\2\u0300M\3\2\2\2\u0301\u0306\3\2\2\2\u0302\u0303\5"+
		"L\'\2\u0303\u0304\5N(\2\u0304\u0306\3\2\2\2\u0305\u0301\3\2\2\2\u0305"+
		"\u0302\3\2\2\2\u0306O\3\2\2\2\u0307\u0308\5N(\2\u0308\u0309\5T+\2\u0309"+
		"\u030a\5\16\b\2\u030a\u030b\5R*\2\u030b\u0311\3\2\2\2\u030c\u030d\5N("+
		"\2\u030d\u030e\5\16\b\2\u030e\u030f\5R*\2\u030f\u0311\3\2\2\2\u0310\u0307"+
		"\3\2\2\2\u0310\u030c\3\2\2\2\u0311Q\3\2\2\2\u0312\u0316\3\2\2\2\u0313"+
		"\u0314\7\6\2\2\u0314\u0316\5P)\2\u0315\u0312\3\2\2\2\u0315\u0313\3\2\2"+
		"\2\u0316S\3\2\2\2\u0317\u0318\7\7\2\2\u0318\u0319\5F$\2\u0319\u031a\7"+
		"\b\2\2\u031aU\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031e\5X-\2\u031d\u031b"+
		"\3\2\2\2\u031d\u031c\3\2\2\2\u031eW\3\2\2\2\u031f\u0320\7\r\2\2\u0320"+
		"\u0321\7\13\2\2\u0321\u0322\5\20\t\2\u0322\u0323\7\f\2\2\u0323\u0324\7"+
		"\16\2\2\u0324Y\3\2\2\2\u0325\u0326\5\u0088E\2\u0326\u0327\7\3\2\2\u0327"+
		"\u0328\5\u0096L\2\u0328\u0329\7\4\2\2\u0329\u038b\3\2\2\2\u032a\u032b"+
		"\5:\36\2\u032b\u032c\7\3\2\2\u032c\u032d\5B\"\2\u032d\u032e\7\4\2\2\u032e"+
		"\u038b\3\2\2\2\u032f\u0330\5p9\2\u0330\u0331\7\3\2\2\u0331\u0332\5t;\2"+
		"\u0332\u0333\7\4\2\2\u0333\u038b\3\2\2\2\u0334\u0335\5x=\2\u0335\u0336"+
		"\7\3\2\2\u0336\u0337\5|?\2\u0337\u0338\7\4\2\2\u0338\u038b\3\2\2\2\u0339"+
		"\u038b\5\\/\2\u033a\u038b\5\u00b2Z\2\u033b\u038b\5\u0122\u0092\2\u033c"+
		"\u038b\5\u0136\u009c\2\u033d\u038b\5&\24\2\u033e\u033f\7\u00c7\2\2\u033f"+
		"\u038b\5\20\t\2\u0340\u0341\7\u00c8\2\2\u0341\u038b\5\20\t\2\u0342\u0343"+
		"\5\u015a\u00ae\2\u0343\u0344\7\3\2\2\u0344\u0345\5\u015e\u00b0\2\u0345"+
		"\u0346\7\4\2\2\u0346\u038b\3\2\2\2\u0347\u0348\7\u00ff\2\2\u0348\u0349"+
		"\5\u0112\u008a\2\u0349\u034a\7\25\2\2\u034a\u034b\5\u008eH\2\u034b\u034c"+
		"\7\u0100\2\2\u034c\u034d\5h\65\2\u034d\u034e\5\u011a\u008e\2\u034e\u034f"+
		"\5\u0112\u008a\2\u034f\u0350\7\25\2\2\u0350\u0351\5\u008eH\2\u0351\u0352"+
		"\7\7\2\2\u0352\u0353\5\u0108\u0085\2\u0353\u0354\7\b\2\2\u0354\u038b\3"+
		"\2\2\2\u0355\u0356\7\u00ff\2\2\u0356\u0357\7h\2\2\u0357\u0358\5h\65\2"+
		"\u0358\u0359\5\u011a\u008e\2\u0359\u035a\5\u0112\u008a\2\u035a\u035b\7"+
		"\25\2\2\u035b\u035c\5\u008eH\2\u035c\u035d\5V,\2\u035d\u035e\7\7\2\2\u035e"+
		"\u035f\5\u0108\u0085\2\u035f\u0360\7\b\2\2\u0360\u0361\7\u0100\2\2\u0361"+
		"\u0362\7h\2\2\u0362\u0363\5h\65\2\u0363\u0364\5\u011a\u008e\2\u0364\u0365"+
		"\5\u0112\u008a\2\u0365\u0366\7\25\2\2\u0366\u0367\5\u008eH\2\u0367\u0368"+
		"\5V,\2\u0368\u0369\7\7\2\2\u0369\u036a\5\u0108\u0085\2\u036a\u036b\7\b"+
		"\2\2\u036b\u038b\3\2\2\2\u036c\u038b\5\n\6\2\u036d\u038b\5\30\r\2\u036e"+
		"\u036f\7\u00fe\2\2\u036f\u0370\7o\2\2\u0370\u0371\7\13\2\2\u0371\u0372"+
		"\5\20\t\2\u0372\u0373\7\f\2\2\u0373\u038b\3\2\2\2\u0374\u0375\7\u00fe"+
		"\2\2\u0375\u0376\7o\2\2\u0376\u038b\5\16\b\2\u0377\u0378\7\u00fe\2\2\u0378"+
		"\u0379\7\u0120\2\2\u0379\u037a\7\13\2\2\u037a\u037b\5\20\t\2\u037b\u037c"+
		"\7\f\2\2\u037c\u037d\7\6\2\2\u037d\u037e\5\u0112\u008a\2\u037e\u038b\3"+
		"\2\2\2\u037f\u0380\7\u00fe\2\2\u0380\u0381\7\u0120\2\2\u0381\u0382\5\16"+
		"\b\2\u0382\u0383\7\6\2\2\u0383\u0384\5\u0112\u008a\2\u0384\u038b\3\2\2"+
		"\2\u0385\u0386\7D\2\2\u0386\u0387\7o\2\2\u0387\u0388\5\u0112\u008a\2\u0388"+
		"\u0389\5\32\16\2\u0389\u038b\3\2\2\2\u038a\u0325\3\2\2\2\u038a\u032a\3"+
		"\2\2\2\u038a\u032f\3\2\2\2\u038a\u0334\3\2\2\2\u038a\u0339\3\2\2\2\u038a"+
		"\u033a\3\2\2\2\u038a\u033b\3\2\2\2\u038a\u033c\3\2\2\2\u038a\u033d\3\2"+
		"\2\2\u038a\u033e\3\2\2\2\u038a\u0340\3\2\2\2\u038a\u0342\3\2\2\2\u038a"+
		"\u0347\3\2\2\2\u038a\u0355\3\2\2\2\u038a\u036c\3\2\2\2\u038a\u036d\3\2"+
		"\2\2\u038a\u036e\3\2\2\2\u038a\u0374\3\2\2\2\u038a\u0377\3\2\2\2\u038a"+
		"\u037f\3\2\2\2\u038a\u0385\3\2\2\2\u038b[\3\2\2\2\u038c\u038d\7\u009d"+
		"\2\2\u038d\u038e\5d\63\2\u038e\u038f\5^\60\2\u038f\u0390\5\u011a\u008e"+
		"\2\u0390\u0391\5\16\b\2\u0391\u0392\5`\61\2\u0392\u0393\5b\62\2\u0393"+
		"]\3\2\2\2\u0394\u03bd\b\60\1\2\u0395\u0396\f\21\2\2\u0396\u03bc\7K\2\2"+
		"\u0397\u0398\f\20\2\2\u0398\u03bc\7L\2\2\u0399\u039a\f\17\2\2\u039a\u03bc"+
		"\7M\2\2\u039b\u039c\f\16\2\2\u039c\u03bc\7N\2\2\u039d\u039e\f\r\2\2\u039e"+
		"\u03bc\7|\2\2\u039f\u03a0\f\f\2\2\u03a0\u03bc\7v\2\2\u03a1\u03a2\f\13"+
		"\2\2\u03a2\u03bc\7I\2\2\u03a3\u03a4\f\n\2\2\u03a4\u03a5\7\u00e2\2\2\u03a5"+
		"\u03a6\7\7\2\2\u03a6\u03a7\5\u0084C\2\u03a7\u03a8\7\b\2\2\u03a8\u03bc"+
		"\3\2\2\2\u03a9\u03aa\f\t\2\2\u03aa\u03bc\7p\2\2\u03ab\u03ac\f\b\2\2\u03ac"+
		"\u03bc\7q\2\2\u03ad\u03ae\f\7\2\2\u03ae\u03bc\7r\2\2\u03af\u03b0\f\6\2"+
		"\2\u03b0\u03bc\7s\2\2\u03b1\u03b2\f\5\2\2\u03b2\u03bc\7z\2\2\u03b3\u03b4"+
		"\f\4\2\2\u03b4\u03bc\7{\2\2\u03b5\u03b6\f\3\2\2\u03b6\u03b7\7)\2\2\u03b7"+
		"\u03b8\7\7\2\2\u03b8\u03b9\5\20\t\2\u03b9\u03ba\7\b\2\2\u03ba\u03bc\3"+
		"\2\2\2\u03bb\u0395\3\2\2\2\u03bb\u0397\3\2\2\2\u03bb\u0399\3\2\2\2\u03bb"+
		"\u039b\3\2\2\2\u03bb\u039d\3\2\2\2\u03bb\u039f\3\2\2\2\u03bb\u03a1\3\2"+
		"\2\2\u03bb\u03a3\3\2\2\2\u03bb\u03a9\3\2\2\2\u03bb\u03ab\3\2\2\2\u03bb"+
		"\u03ad\3\2\2\2\u03bb\u03af\3\2\2\2\u03bb\u03b1\3\2\2\2\u03bb\u03b3\3\2"+
		"\2\2\u03bb\u03b5\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be_\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c4\3\2\2\2"+
		"\u03c1\u03c2\7@\2\2\u03c2\u03c4\5\f\7\2\u03c3\u03c0\3\2\2\2\u03c3\u03c1"+
		"\3\2\2\2\u03c4a\3\2\2\2\u03c5\u03c9\3\2\2\2\u03c6\u03c7\7\n\2\2\u03c7"+
		"\u03c9\5\u00c8e\2\u03c8\u03c5\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9c\3\2\2"+
		"\2\u03ca\u03d0\3\2\2\2\u03cb\u03cc\7\13\2\2\u03cc\u03cd\5\20\t\2\u03cd"+
		"\u03ce\7\f\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03ca\3\2\2\2\u03cf\u03cb\3\2"+
		"\2\2\u03d0e\3\2\2\2\u03d1\u03d2\5h\65\2\u03d2\u03d6\5\u011a\u008e\2\u03d3"+
		"\u03d4\5\u0112\u008a\2\u03d4\u03d5\7\25\2\2\u03d5\u03d7\3\2\2\2\u03d6"+
		"\u03d3\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03db\5\u008e"+
		"H\2\u03d9\u03dc\5\u0102\u0082\2\u03da\u03dc\5X-\2\u03db\u03d9\3\2\2\2"+
		"\u03db\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\7\7\2\2\u03de\u03df"+
		"\5\u0108\u0085\2\u03df\u03e0\7\b\2\2\u03e0g\3\2\2\2\u03e1\u03e3\t\5\2"+
		"\2\u03e2\u03e1\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e4\u03e2"+
		"\3\2\2\2\u03e5\u03ed\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03ee\5j\66\2\u03e8"+
		"\u03e9\7*\2\2\u03e9\u03ea\7\7\2\2\u03ea\u03eb\5\20\t\2\u03eb\u03ec\7\b"+
		"\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03e7\3\2\2\2\u03ed\u03e8\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03eei\3\2\2\2\u03ef\u03f4\7/\2\2\u03f0\u03f4\7\61\2\2"+
		"\u03f1\u03f2\7\67\2\2\u03f2\u03f4\t\6\2\2\u03f3\u03ef\3\2\2\2\u03f3\u03f0"+
		"\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4k\3\2\2\2\u03f5\u03f6\7+\2\2\u03f6\u03f7"+
		"\7\7\2\2\u03f7\u03f8\5\20\t\2\u03f8\u03f9\7\b\2\2\u03f9m\3\2\2\2\u03fa"+
		"\u03fb\5\u00e0q\2\u03fb\u03fc\5f\64\2\u03fc\u0409\3\2\2\2\u03fd\u03fe"+
		"\7i\2\2\u03fe\u03ff\5\u011a\u008e\2\u03ff\u0400\5\u0112\u008a\2\u0400"+
		"\u0401\7\25\2\2\u0401\u0402\5\16\b\2\u0402\u0409\3\2\2\2\u0403\u0404\7"+
		"i\2\2\u0404\u0405\5\u011a\u008e\2\u0405\u0406\5\16\b\2\u0406\u0409\3\2"+
		"\2\2\u0407\u0409\5l\67\2\u0408\u03fa\3\2\2\2\u0408\u03fd\3\2\2\2\u0408"+
		"\u0403\3\2\2\2\u0408\u0407\3\2\2\2\u0409o\3\2\2\2\u040a\u040b\7\u00a8"+
		"\2\2\u040b\u040c\5r:\2\u040c\u040d\5\u0112\u008a\2\u040d\u040e\5\16\b"+
		"\2\u040e\u0414\3\2\2\2\u040f\u0410\7\u00a8\2\2\u0410\u0411\5r:\2\u0411"+
		"\u0412\5\16\b\2\u0412\u0414\3\2\2\2\u0413\u040a\3\2\2\2\u0413\u040f\3"+
		"\2\2\2\u0414q\3\2\2\2\u0415\u041c\b:\1\2\u0416\u0417\f\4\2\2\u0417\u041b"+
		"\7v\2\2\u0418\u0419\f\3\2\2\u0419\u041b\7I\2\2\u041a\u0416\3\2\2\2\u041a"+
		"\u0418\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2"+
		"\2\2\u041ds\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0424\b;\1\2\u0420\u0421"+
		"\f\3\2\2\u0421\u0423\5v<\2\u0422\u0420\3\2\2\2\u0423\u0426\3\2\2\2\u0424"+
		"\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425u\3\2\2\2\u0426\u0424\3\2\2\2"+
		"\u0427\u0428\7\u00a9\2\2\u0428\u0434\5f\64\2\u0429\u042a\7\u00aa\2\2\u042a"+
		"\u0434\5f\64\2\u042b\u042c\7\u00ab\2\2\u042c\u0434\5f\64\2\u042d\u042e"+
		"\7\u00ac\2\2\u042e\u0434\5f\64\2\u042f\u0434\5\u0136\u009c\2\u0430\u0434"+
		"\5&\24\2\u0431\u0434\5\n\6\2\u0432\u0434\5\30\r\2\u0433\u0427\3\2\2\2"+
		"\u0433\u0429\3\2\2\2\u0433\u042b\3\2\2\2\u0433\u042d\3\2\2\2\u0433\u042f"+
		"\3\2\2\2\u0433\u0430\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0432\3\2\2\2\u0434"+
		"w\3\2\2\2\u0435\u0436\7\u00ad\2\2\u0436\u0437\5z>\2\u0437\u0438\5h\65"+
		"\2\u0438\u0439\5\u011a\u008e\2\u0439\u043a\5\16\b\2\u043a\u043b\7\7\2"+
		"\2\u043b\u043c\5\u0108\u0085\2\u043c\u043d\7\b\2\2\u043d\u043e\5b\62\2"+
		"\u043ey\3\2\2\2\u043f\u0446\b>\1\2\u0440\u0441\f\4\2\2\u0441\u0445\7v"+
		"\2\2\u0442\u0443\f\3\2\2\u0443\u0445\7I\2\2\u0444\u0440\3\2\2\2\u0444"+
		"\u0442\3\2\2\2\u0445\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2"+
		"\2\2\u0447{\3\2\2\2\u0448\u0446\3\2\2\2\u0449\u044e\b?\1\2\u044a\u044b"+
		"\f\3\2\2\u044b\u044d\5~@\2\u044c\u044a\3\2\2\2\u044d\u0450\3\2\2\2\u044e"+
		"\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f}\3\2\2\2\u0450\u044e\3\2\2\2"+
		"\u0451\u0452\7\u00ae\2\2\u0452\u045c\5f\64\2\u0453\u0454\7\u00af\2\2\u0454"+
		"\u045c\5f\64\2\u0455\u0456\7\u00ac\2\2\u0456\u045c\5f\64\2\u0457\u045c"+
		"\5&\24\2\u0458\u045c\5\u0136\u009c\2\u0459\u045c\5\n\6\2\u045a\u045c\5"+
		"\30\r\2\u045b\u0451\3\2\2\2\u045b\u0453\3\2\2\2\u045b\u0455\3\2\2\2\u045b"+
		"\u0457\3\2\2\2\u045b\u0458\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045a\3\2"+
		"\2\2\u045c\177\3\2\2\2\u045d\u045e\7\u009c\2\2\u045e\u0081\3\2\2\2\u045f"+
		"\u0466\3\2\2\2\u0460\u0461\7\u00e2\2\2\u0461\u0462\7\7\2\2\u0462\u0463"+
		"\5\u0084C\2\u0463\u0464\7\b\2\2\u0464\u0466\3\2\2\2\u0465\u045f\3\2\2"+
		"\2\u0465\u0460\3\2\2\2\u0466\u0083\3\2\2\2\u0467\u046d\5\u0114\u008b\2"+
		"\u0468\u0469\5\u0086D\2\u0469\u046a\5\u00c6d\2\u046a\u046b\7\4\2\2\u046b"+
		"\u046d\3\2\2\2\u046c\u0467\3\2\2\2\u046c\u0468\3\2\2\2\u046d\u0085\3\2"+
		"\2\2\u046e\u046f\7\3\2\2\u046f\u0087\3\2\2\2\u0470\u0471\5\u0080A\2\u0471"+
		"\u0472\5\u008aF\2\u0472\u0473\5h\65\2\u0473\u0474\5\u0090I\2\u0474\u0475"+
		"\5\u011a\u008e\2\u0475\u0476\5\u0082B\2\u0476\u0477\5\u008eH\2\u0477\u0478"+
		"\5J&\2\u0478\u0479\7\7\2\2\u0479\u047a\5\u0108\u0085\2\u047a\u047b\7\b"+
		"\2\2\u047b\u047c\5\u0092J\2\u047c\u0089\3\2\2\2\u047d\u04b7\bF\1\2\u047e"+
		"\u047f\f\26\2\2\u047f\u04b6\7K\2\2\u0480\u0481\f\25\2\2\u0481\u04b6\7"+
		"L\2\2\u0482\u0483\f\24\2\2\u0483\u04b6\7M\2\2\u0484\u0485\f\23\2\2\u0485"+
		"\u04b6\7N\2\2\u0486\u0487\f\22\2\2\u0487\u04b6\7O\2\2\u0488\u0489\f\21"+
		"\2\2\u0489\u04b6\7I\2\2\u048a\u048b\f\20\2\2\u048b\u04b6\7]\2\2\u048c"+
		"\u048d\f\17\2\2\u048d\u04b6\7d\2\2\u048e\u048f\f\16\2\2\u048f\u04b6\7"+
		"T\2\2\u0490\u0491\f\r\2\2\u0491\u04b6\7p\2\2\u0492\u0493\f\f\2\2\u0493"+
		"\u04b6\7q\2\2\u0494\u0495\f\13\2\2\u0495\u04b6\7r\2\2\u0496\u0497\f\n"+
		"\2\2\u0497\u04b6\7s\2\2\u0498\u0499\f\t\2\2\u0499\u04b6\7t\2\2\u049a\u049b"+
		"\f\b\2\2\u049b\u04b6\7u\2\2\u049c\u049d\f\7\2\2\u049d\u04b6\7v\2\2\u049e"+
		"\u049f\f\6\2\2\u049f\u04b6\7b\2\2\u04a0\u04a1\f\5\2\2\u04a1\u04b6\7}\2"+
		"\2\u04a2\u04a3\f\4\2\2\u04a3\u04a4\7)\2\2\u04a4\u04a5\7\7\2\2\u04a5\u04a6"+
		"\5\20\t\2\u04a6\u04a7\7\b\2\2\u04a7\u04b6\3\2\2\2\u04a8\u04a9\f\3\2\2"+
		"\u04a9\u04aa\7w\2\2\u04aa\u04ac\7\7\2\2\u04ab\u04ad\5\b\5\2\u04ac\u04ab"+
		"\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04af\7\u0088\2"+
		"\2\u04af\u04b1\5\b\5\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2"+
		"\3\2\2\2\u04b2\u04b3\5\u008cG\2\u04b3\u04b4\7\b\2\2\u04b4\u04b6\3\2\2"+
		"\2\u04b5\u047e\3\2\2\2\u04b5\u0480\3\2\2\2\u04b5\u0482\3\2\2\2\u04b5\u0484"+
		"\3\2\2\2\u04b5\u0486\3\2\2\2\u04b5\u0488\3\2\2\2\u04b5\u048a\3\2\2\2\u04b5"+
		"\u048c\3\2\2\2\u04b5\u048e\3\2\2\2\u04b5\u0490\3\2\2\2\u04b5\u0492\3\2"+
		"\2\2\u04b5\u0494\3\2\2\2\u04b5\u0496\3\2\2\2\u04b5\u0498\3\2\2\2\u04b5"+
		"\u049a\3\2\2\2\u04b5\u049c\3\2\2\2\u04b5\u049e\3\2\2\2\u04b5\u04a0\3\2"+
		"\2\2\u04b5\u04a2\3\2\2\2\u04b5\u04a8\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7"+
		"\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u008b\3\2\2\2\u04b9\u04b7\3\2"+
		"\2\2\u04ba\u04e7\bG\1\2\u04bb\u04bc\f\21\2\2\u04bc\u04e6\7\u0085\2\2\u04bd"+
		"\u04be\f\20\2\2\u04be\u04e6\7X\2\2\u04bf\u04c0\f\17\2\2\u04c0\u04e6\7"+
		"Y\2\2\u04c1\u04c2\f\16\2\2\u04c2\u04e6\7Z\2\2\u04c3\u04c4\f\r\2\2\u04c4"+
		"\u04e6\7\u0086\2\2\u04c5\u04c6\f\f\2\2\u04c6\u04e6\7\u0087\2\2\u04c7\u04c8"+
		"\f\13\2\2\u04c8\u04e6\7\60\2\2\u04c9\u04ca\f\n\2\2\u04ca\u04e6\7\62\2"+
		"\2\u04cb\u04cc\f\t\2\2\u04cc\u04e6\7\63\2\2\u04cd\u04ce\f\b\2\2\u04ce"+
		"\u04e6\7\64\2\2\u04cf\u04d0\f\7\2\2\u04d0\u04d1\7\u0089\2\2\u04d1\u04d2"+
		"\7\20\2\2\u04d2\u04e6\7\u008a\2\2\u04d3\u04d4\f\6\2\2\u04d4\u04d5\7\u0089"+
		"\2\2\u04d5\u04d6\7\20\2\2\u04d6\u04e6\7\u008b\2\2\u04d7\u04d8\f\5\2\2"+
		"\u04d8\u04d9\7\u008c\2\2\u04d9\u04da\7\20\2\2\u04da\u04e6\7\u008a\2\2"+
		"\u04db\u04dc\f\4\2\2\u04dc\u04dd\7\u008c\2\2\u04dd\u04de\7\20\2\2\u04de"+
		"\u04e6\7\u008b\2\2\u04df\u04e0\f\3\2\2\u04e0\u04e1\7)\2\2\u04e1\u04e2"+
		"\7\7\2\2\u04e2\u04e3\5\20\t\2\u04e3\u04e4\7\b\2\2\u04e4\u04e6\3\2\2\2"+
		"\u04e5\u04bb\3\2\2\2\u04e5\u04bd\3\2\2\2\u04e5\u04bf\3\2\2\2\u04e5\u04c1"+
		"\3\2\2\2\u04e5\u04c3\3\2\2\2\u04e5\u04c5\3\2\2\2\u04e5\u04c7\3\2\2\2\u04e5"+
		"\u04c9\3\2\2\2\u04e5\u04cb\3\2\2\2\u04e5\u04cd\3\2\2\2\u04e5\u04cf\3\2"+
		"\2\2\u04e5\u04d3\3\2\2\2\u04e5\u04d7\3\2\2\2\u04e5\u04db\3\2\2\2\u04e5"+
		"\u04df\3\2\2\2\u04e6\u04e9\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2"+
		"\2\2\u04e8\u008d\3\2\2\2\u04e9\u04e7\3\2\2\2\u04ea\u04ee\7x\2\2\u04eb"+
		"\u04ee\7y\2\2\u04ec\u04ee\5\16\b\2\u04ed\u04ea\3\2\2\2\u04ed\u04eb\3\2"+
		"\2\2\u04ed\u04ec\3\2\2\2\u04ee\u008f\3\2\2\2\u04ef\u0503\bI\1\2\u04f0"+
		"\u04f1\f\6\2\2\u04f1\u04f2\7\13\2\2\u04f2\u04f3\7\u00fb\2\2\u04f3\u0502"+
		"\7\f\2\2\u04f4\u04f5\f\5\2\2\u04f5\u04f6\7\13\2\2\u04f6\u04f7\7\u00fc"+
		"\2\2\u04f7\u0502\7\f\2\2\u04f8\u04f9\f\4\2\2\u04f9\u04fa\7\13\2\2\u04fa"+
		"\u04fb\7\u00fd\2\2\u04fb\u0502\7\f\2\2\u04fc\u04fd\f\3\2\2\u04fd\u04fe"+
		"\7\13\2\2\u04fe\u04ff\5\20\t\2\u04ff\u0500\7\f\2\2\u0500\u0502\3\2\2\2"+
		"\u0501\u04f0\3\2\2\2\u0501\u04f4\3\2\2\2\u0501\u04f8\3\2\2\2\u0501\u04fc"+
		"\3\2\2\2\u0502\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504"+
		"\u0091\3\2\2\2\u0505\u0503\3\2\2\2\u0506\u052b\bJ\1\2\u0507\u0508\f\21"+
		"\2\2\u0508\u052a\7G\2\2\u0509\u050a\f\20\2\2\u050a\u052a\7~\2\2\u050b"+
		"\u050c\f\17\2\2\u050c\u052a\7\177\2\2\u050d\u050e\f\16\2\2\u050e\u052a"+
		"\7\u0080\2\2\u050f\u0510\f\r\2\2\u0510\u052a\7\67\2\2\u0511\u0512\f\f"+
		"\2\2\u0512\u052a\7\u0081\2\2\u0513\u0514\f\13\2\2\u0514\u052a\7\u0082"+
		"\2\2\u0515\u0516\f\n\2\2\u0516\u052a\7\u0083\2\2\u0517\u0518\f\t\2\2\u0518"+
		"\u052a\7\u0084\2\2\u0519\u051a\f\b\2\2\u051a\u052a\7P\2\2\u051b\u051c"+
		"\f\7\2\2\u051c\u052a\7^\2\2\u051d\u051e\f\6\2\2\u051e\u052a\7_\2\2\u051f"+
		"\u0520\f\5\2\2\u0520\u052a\7`\2\2\u0521\u0522\f\4\2\2\u0522\u052a\7a\2"+
		"\2\u0523\u0524\f\3\2\2\u0524\u0525\7)\2\2\u0525\u0526\7\7\2\2\u0526\u0527"+
		"\5\20\t\2\u0527\u0528\7\b\2\2\u0528\u052a\3\2\2\2\u0529\u0507\3\2\2\2"+
		"\u0529\u0509\3\2\2\2\u0529\u050b\3\2\2\2\u0529\u050d\3\2\2\2\u0529\u050f"+
		"\3\2\2\2\u0529\u0511\3\2\2\2\u0529\u0513\3\2\2\2\u0529\u0515\3\2\2\2\u0529"+
		"\u0517\3\2\2\2\u0529\u0519\3\2\2\2\u0529\u051b\3\2\2\2\u0529\u051d\3\2"+
		"\2\2\u0529\u051f\3\2\2\2\u0529\u0521\3\2\2\2\u0529\u0523\3\2\2\2\u052a"+
		"\u052d\3\2\2\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u0093\3\2"+
		"\2\2\u052d\u052b\3\2\2\2\u052e\u052f\7\u00a5\2\2\u052f\u0095\3\2\2\2\u0530"+
		"\u0532\5\u0098M\2\u0531\u0530\3\2\2\2\u0532\u0535\3\2\2\2\u0533\u0534"+
		"\3\2\2\2\u0533\u0531\3\2\2\2\u0534\u0097\3\2\2\2\u0535\u0533\3\2\2\2\u0536"+
		"\u0537\7\u00a2\2\2\u0537\u058c\5\20\t\2\u0538\u058c\5\u009eP\2\u0539\u053a"+
		"\7\u00a4\2\2\u053a\u058c\5\20\t\2\u053b\u053d\5\u0094K\2\u053c\u053e\7"+
		"\u00c6\2\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\3\2\2\2"+
		"\u053f\u0540\7\7\2\2\u0540\u0541\5\u0108\u0085\2\u0541\u0542\7\b\2\2\u0542"+
		"\u058c\3\2\2\2\u0543\u058c\7\u00a6\2\2\u0544\u058c\7\u00a7\2\2\u0545\u058c"+
		"\5\u00b2Z\2\u0546\u0547\5\f\7\2\u0547\u0548\7\20\2\2\u0548\u054a\3\2\2"+
		"\2\u0549\u0546\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u058c"+
		"\5\u00fe\u0080\2\u054c\u058c\5\u0122\u0092\2\u054d\u058c\5\u0136\u009c"+
		"\2\u054e\u058c\5\n\6\2\u054f\u058c\5&\24\2\u0550\u058c\5\30\r\2\u0551"+
		"\u0552\7\u00db\2\2\u0552\u0553\7\13\2\2\u0553\u0554\5\20\t\2\u0554\u0557"+
		"\7\f\2\2\u0555\u0556\7\u0088\2\2\u0556\u0558\5\f\7\2\u0557\u0555\3\2\2"+
		"\2\u0557\u0558\3\2\2\2\u0558\u058c\3\2\2\2\u0559\u055a\7\u00cd\2\2\u055a"+
		"\u055b\5\20\t\2\u055b\u055c\7\20\2\2\u055c\u055d\5\20\t\2\u055d\u058c"+
		"\3\2\2\2\u055e\u0563\7\u00ff\2\2\u055f\u0560\7h\2\2\u0560\u0561\5h\65"+
		"\2\u0561\u0562\5\u011a\u008e\2\u0562\u0564\3\2\2\2\u0563\u055f\3\2\2\2"+
		"\u0563\u0564\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0566\5\u0112\u008a\2\u0566"+
		"\u0567\7\25\2\2\u0567\u056d\5\u008eH\2\u0568\u0569\5V,\2\u0569\u056a\7"+
		"\7\2\2\u056a\u056b\5\u0108\u0085\2\u056b\u056c\7\b\2\2\u056c\u056e\3\2"+
		"\2\2\u056d\u0568\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u058c\3\2\2\2\u056f"+
		"\u058c\5\u009aN\2\u0570\u0589\7\u00fe\2\2\u0571\u0577\7o\2\2\u0572\u0573"+
		"\7\13\2\2\u0573\u0574\5\20\t\2\u0574\u0575\7\f\2\2\u0575\u0578\3\2\2\2"+
		"\u0576\u0578\5\16\b\2\u0577\u0572\3\2\2\2\u0577\u0576\3\2\2\2\u0578\u058a"+
		"\3\2\2\2\u0579\u057f\7\u0120\2\2\u057a\u057b\7\13\2\2\u057b\u057c\5\20"+
		"\t\2\u057c\u057d\7\f\2\2\u057d\u0580\3\2\2\2\u057e\u0580\5\16\b\2\u057f"+
		"\u057a\3\2\2\2\u057f\u057e\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\7\6"+
		"\2\2\u0582\u0583\5\u0112\u008a\2\u0583\u058a\3\2\2\2\u0584\u0585\7\13"+
		"\2\2\u0585\u0586\5\20\t\2\u0586\u0587\7\f\2\2\u0587\u0588\5b\62\2\u0588"+
		"\u058a\3\2\2\2\u0589\u0571\3\2\2\2\u0589\u0579\3\2\2\2\u0589\u0584\3\2"+
		"\2\2\u058a\u058c\3\2\2\2\u058b\u0536\3\2\2\2\u058b\u0538\3\2\2\2\u058b"+
		"\u0539\3\2\2\2\u058b\u053b\3\2\2\2\u058b\u0543\3\2\2\2\u058b\u0544\3\2"+
		"\2\2\u058b\u0545\3\2\2\2\u058b\u0549\3\2\2\2\u058b\u054c\3\2\2\2\u058b"+
		"\u054d\3\2\2\2\u058b\u054e\3\2\2\2\u058b\u054f\3\2\2\2\u058b\u0550\3\2"+
		"\2\2\u058b\u0551\3\2\2\2\u058b\u0559\3\2\2\2\u058b\u055e\3\2\2\2\u058b"+
		"\u056f\3\2\2\2\u058b\u0570\3\2\2\2\u058c\u0099\3\2\2\2\u058d\u058e\5\u009c"+
		"O\2\u058e\u058f\5\u0096L\2\u058f\u0590\7\4\2\2\u0590\u009b\3\2\2\2\u0591"+
		"\u0592\7\3\2\2\u0592\u009d\3\2\2\2\u0593\u0594\5\u00a2R\2\u0594\u0595"+
		"\5\u00a0Q\2\u0595\u009f\3\2\2\2\u0596\u0597\5\u00a4S\2\u0597\u0598\5\u00a0"+
		"Q\2\u0598\u059b\3\2\2\2\u0599\u059b\5\u00a4S\2\u059a\u0596\3\2\2\2\u059a"+
		"\u0599\3\2\2\2\u059b\u00a1\3\2\2\2\u059c\u05a6\7\u00a3\2\2\u059d\u05a7"+
		"\5\u009aN\2\u059e\u059f\5\f\7\2\u059f\u05a0\7?\2\2\u05a0\u05a1\5\f\7\2"+
		"\u05a1\u05a7\3\2\2\2\u05a2\u05a3\5\20\t\2\u05a3\u05a4\7?\2\2\u05a4\u05a5"+
		"\5\20\t\2\u05a5\u05a7\3\2\2\2\u05a6\u059d\3\2\2\2\u05a6\u059e\3\2\2\2"+
		"\u05a6\u05a2\3\2\2\2\u05a7\u00a3\3\2\2\2\u05a8\u05a9\5\u00aaV\2\u05a9"+
		"\u05aa\5\u00b0Y\2\u05aa\u05b5\3\2\2\2\u05ab\u05ac\5\u00a6T\2\u05ac\u05ad"+
		"\5\u00b0Y\2\u05ad\u05b5\3\2\2\2\u05ae\u05af\5\u00acW\2\u05af\u05b0\5\u00b0"+
		"Y\2\u05b0\u05b5\3\2\2\2\u05b1\u05b2\5\u00aeX\2\u05b2\u05b3\5\u00b0Y\2"+
		"\u05b3\u05b5\3\2\2\2\u05b4\u05a8\3\2\2\2\u05b4\u05ab\3\2\2\2\u05b4\u05ae"+
		"\3\2\2\2\u05b4\u05b1\3\2\2\2\u05b5\u00a5\3\2\2\2\u05b6\u05b7\5\u00a8U"+
		"\2\u05b7\u05b8\5\u009aN\2\u05b8\u05c0\3\2\2\2\u05b9\u05ba\5\u00a8U\2\u05ba"+
		"\u05bb\5\f\7\2\u05bb\u05c0\3\2\2\2\u05bc\u05bd\5\u00a8U\2\u05bd\u05be"+
		"\5\20\t\2\u05be\u05c0\3\2\2\2\u05bf\u05b6\3\2\2\2\u05bf\u05b9\3\2\2\2"+
		"\u05bf\u05bc\3\2\2\2\u05c0\u00a7\3\2\2\2\u05c1\u05c2\7;\2\2\u05c2\u00a9"+
		"\3\2\2\2\u05c3\u05c4\7:\2\2\u05c4\u05c5\5\u0112\u008a\2\u05c5\u00ab\3"+
		"\2\2\2\u05c6\u05c7\78\2\2\u05c7\u00ad\3\2\2\2\u05c8\u05c9\7<\2\2\u05c9"+
		"\u00af\3\2\2\2\u05ca\u05d6\5\u009aN\2\u05cb\u05cc\79\2\2\u05cc\u05cd\5"+
		"\f\7\2\u05cd\u05ce\7?\2\2\u05ce\u05cf\5\f\7\2\u05cf\u05d6\3\2\2\2\u05d0"+
		"\u05d1\79\2\2\u05d1\u05d2\5\20\t\2\u05d2\u05d3\7?\2\2\u05d3\u05d4\5\20"+
		"\t\2\u05d4\u05d6\3\2\2\2\u05d5\u05ca\3\2\2\2\u05d5\u05cb\3\2\2\2\u05d5"+
		"\u05d0\3\2\2\2\u05d6\u00b1\3\2\2\2\u05d7\u05d8\5\u00b4[\2\u05d8\u05d9"+
		"\5\u00b8]\2\u05d9\u00b3\3\2\2\2\u05da\u05db\7\u009e\2\2\u05db\u05dc\5"+
		"\u00b6\\\2\u05dc\u05dd\5\f\7\2\u05dd\u05de\7\n\2\2\u05de\u05e2\3\2\2\2"+
		"\u05df\u05e0\7\u009e\2\2\u05e0\u05e2\5\u00b6\\\2\u05e1\u05da\3\2\2\2\u05e1"+
		"\u05df\3\2\2\2\u05e2\u00b5\3\2\2\2\u05e3\u05e7\3\2\2\2\u05e4\u05e7\7A"+
		"\2\2\u05e5\u05e7\7~\2\2\u05e6\u05e3\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6"+
		"\u05e5\3\2\2\2\u05e7\u00b7\3\2\2\2\u05e8\u05e9\7\3\2\2\u05e9\u05ea\5\u00ba"+
		"^\2\u05ea\u05eb\7\4\2\2\u05eb\u05ee\3\2\2\2\u05ec\u05ee\5\u00be`\2\u05ed"+
		"\u05e8\3\2\2\2\u05ed\u05ec\3\2\2\2\u05ee\u00b9\3\2\2\2\u05ef\u05f0\5\u00be"+
		"`\2\u05f0\u05f1\7\6\2\2\u05f1\u05f2\5\u00ba^\2\u05f2\u05f5\3\2\2\2\u05f3"+
		"\u05f5\5\u00be`\2\u05f4\u05ef\3\2\2\2\u05f4\u05f3\3\2\2\2\u05f5\u00bb"+
		"\3\2\2\2\u05f6\u05fc\3\2\2\2\u05f7\u05f8\7\13\2\2\u05f8\u05f9\5\20\t\2"+
		"\u05f9\u05fa\7\f\2\2\u05fa\u05fc\3\2\2\2\u05fb\u05f6\3\2\2\2\u05fb\u05f7"+
		"\3\2\2\2\u05fc\u00bd\3\2\2\2\u05fd\u05fe\7\31\2\2\u05fe\u05ff\7\21\2\2"+
		"\u05ff\u0600\7\7\2\2\u0600\u0601\5\b\5\2\u0601\u0602\7\b\2\2\u0602\u063d"+
		"\3\2\2\2\u0603\u0604\7\22\2\2\u0604\u0605\7\7\2\2\u0605\u0606\5\f\7\2"+
		"\u0606\u0607\7\b\2\2\u0607\u063d\3\2\2\2\u0608\u0609\5\u00c2b\2\u0609"+
		"\u060a\5\u00c4c\2\u060a\u060b\7\b\2\2\u060b\u063d\3\2\2\2\u060c\u060d"+
		"\7!\2\2\u060d\u060e\7\7\2\2\u060e\u060f\5\24\13\2\u060f\u0610\7\b\2\2"+
		"\u0610\u0611\5\u00bc_\2\u0611\u063d\3\2\2\2\u0612\u0613\7\"\2\2\u0613"+
		"\u0614\7\7\2\2\u0614\u0615\5\24\13\2\u0615\u0616\7\b\2\2\u0616\u0617\5"+
		"\u00bc_\2\u0617\u063d\3\2\2\2\u0618\u0619\7\37\2\2\u0619\u061a\7\7\2\2"+
		"\u061a\u061b\5\22\n\2\u061b\u061c\7\b\2\2\u061c\u061d\5\u00bc_\2\u061d"+
		"\u063d\3\2\2\2\u061e\u061f\7\36\2\2\u061f\u0620\7\7\2\2\u0620\u0621\5"+
		"\20\t\2\u0621\u0622\7\b\2\2\u0622\u0623\5\u00bc_\2\u0623\u063d\3\2\2\2"+
		"\u0624\u0625\7\35\2\2\u0625\u0626\7\7\2\2\u0626\u0627\5\20\t\2\u0627\u0628"+
		"\7\b\2\2\u0628\u0629\5\u00bc_\2\u0629\u063d\3\2\2\2\u062a\u062b\7\34\2"+
		"\2\u062b\u062c\7\7\2\2\u062c\u062d\5\20\t\2\u062d\u062e\7\b\2\2\u062e"+
		"\u062f\5\u00bc_\2\u062f\u063d\3\2\2\2\u0630\u0631\7!\2\2\u0631\u063d\5"+
		"\u00bc_\2\u0632\u0633\7\"\2\2\u0633\u063d\5\u00bc_\2\u0634\u0635\7\37"+
		"\2\2\u0635\u063d\5\u00bc_\2\u0636\u0637\7\36\2\2\u0637\u063d\5\u00bc_"+
		"\2\u0638\u0639\7\35\2\2\u0639\u063d\5\u00bc_\2\u063a\u063b\7\34\2\2\u063b"+
		"\u063d\5\u00bc_\2\u063c\u05fd\3\2\2\2\u063c\u0603\3\2\2\2\u063c\u0608"+
		"\3\2\2\2\u063c\u060c\3\2\2\2\u063c\u0612\3\2\2\2\u063c\u0618\3\2\2\2\u063c"+
		"\u061e\3\2\2\2\u063c\u0624\3\2\2\2\u063c\u062a\3\2\2\2\u063c\u0630\3\2"+
		"\2\2\u063c\u0632\3\2\2\2\u063c\u0634\3\2\2\2\u063c\u0636\3\2\2\2\u063c"+
		"\u0638\3\2\2\2\u063c\u063a\3\2\2\2\u063d\u00bf\3\2\2\2\u063e\u063f\7!"+
		"\2\2\u063f\u0640\7\7\2\2\u0640\u0641\5\24\13\2\u0641\u0642\7\b\2\2\u0642"+
		"\u06a1\3\2\2\2\u0643\u0644\7\"\2\2\u0644\u0645\7\7\2\2\u0645\u0646\5\24"+
		"\13\2\u0646\u0647\7\b\2\2\u0647\u06a1\3\2\2\2\u0648\u0649\7!\2\2\u0649"+
		"\u064a\7\7\2\2\u064a\u064b\5\20\t\2\u064b\u064c\7\b\2\2\u064c\u06a1\3"+
		"\2\2\2\u064d\u064e\7\"\2\2\u064e\u064f\7\7\2\2\u064f\u0650\5\22\n\2\u0650"+
		"\u0651\7\b\2\2\u0651\u06a1\3\2\2\2\u0652\u0653\7\37\2\2\u0653\u0654\7"+
		"\7\2\2\u0654\u0655\5\22\n\2\u0655\u0656\7\b\2\2\u0656\u06a1\3\2\2\2\u0657"+
		"\u0658\7\36\2\2\u0658\u0659\7\7\2\2\u0659\u065a\5\20\t\2\u065a\u065b\7"+
		"\b\2\2\u065b\u06a1\3\2\2\2\u065c\u065d\7\35\2\2\u065d\u065e\7\7\2\2\u065e"+
		"\u065f\5\20\t\2\u065f\u0660\7\b\2\2\u0660\u06a1\3\2\2\2\u0661\u0662\7"+
		"\34\2\2\u0662\u0663\7\7\2\2\u0663\u0664\5\20\t\2\u0664\u0665\7\b\2\2\u0665"+
		"\u06a1\3\2\2\2\u0666\u0667\7\32\2\2\u0667\u0668\7\37\2\2\u0668\u0669\7"+
		"\7\2\2\u0669\u066a\5\22\n\2\u066a\u066b\7\b\2\2\u066b\u06a1\3\2\2\2\u066c"+
		"\u066d\7\32\2\2\u066d\u066e\7\36\2\2\u066e\u066f\7\7\2\2\u066f\u0670\5"+
		"\20\t\2\u0670\u0671\7\b\2\2\u0671\u06a1\3\2\2\2\u0672\u0673\7\32\2\2\u0673"+
		"\u0674\7\35\2\2\u0674\u0675\7\7\2\2\u0675\u0676\5\20\t\2\u0676\u0677\7"+
		"\b\2\2\u0677\u06a1\3\2\2\2\u0678\u0679\7\32\2\2\u0679\u067a\7\34\2\2\u067a"+
		"\u067b\7\7\2\2\u067b\u067c\5\20\t\2\u067c\u067d\7\b\2\2\u067d\u06a1\3"+
		"\2\2\2\u067e\u067f\7(\2\2\u067f\u0680\7\7\2\2\u0680\u0681\5\22\n\2\u0681"+
		"\u0682\7\b\2\2\u0682\u06a1\3\2\2\2\u0683\u0684\7\'\2\2\u0684\u0685\7\7"+
		"\2\2\u0685\u0686\5\20\t\2\u0686\u0687\7\b\2\2\u0687\u06a1\3\2\2\2\u0688"+
		"\u0689\7&\2\2\u0689\u068a\7\7\2\2\u068a\u068b\5\20\t\2\u068b\u068c\7\b"+
		"\2\2\u068c\u06a1\3\2\2\2\u068d\u068e\7%\2\2\u068e\u068f\7\7\2\2\u068f"+
		"\u0690\5\20\t\2\u0690\u0691\7\b\2\2\u0691\u06a1\3\2\2\2\u0692\u0693\7"+
		"\31\2\2\u0693\u0694\7\7\2\2\u0694\u0695\5\20\t\2\u0695\u0696\7\b\2\2\u0696"+
		"\u06a1\3\2\2\2\u0697\u0698\7\30\2\2\u0698\u0699\7\7\2\2\u0699\u069a\5"+
		"\u012e\u0098\2\u069a\u069b\7\b\2\2\u069b\u06a1\3\2\2\2\u069c\u069d\5\u00c2"+
		"b\2\u069d\u069e\5\u00c4c\2\u069e\u069f\7\b\2\2\u069f\u06a1\3\2\2\2\u06a0"+
		"\u063e\3\2\2\2\u06a0\u0643\3\2\2\2\u06a0\u0648\3\2\2\2\u06a0\u064d\3\2"+
		"\2\2\u06a0\u0652\3\2\2\2\u06a0\u0657\3\2\2\2\u06a0\u065c\3\2\2\2\u06a0"+
		"\u0661\3\2\2\2\u06a0\u0666\3\2\2\2\u06a0\u066c\3\2\2\2\u06a0\u0672\3\2"+
		"\2\2\u06a0\u0678\3\2\2\2\u06a0\u067e\3\2\2\2\u06a0\u0683\3\2\2\2\u06a0"+
		"\u0688\3\2\2\2\u06a0\u068d\3\2\2\2\u06a0\u0692\3\2\2\2\u06a0\u0697\3\2"+
		"\2\2\u06a0\u069c\3\2\2\2\u06a1\u00c1\3\2\2\2\u06a2\u06a3\7#\2\2\u06a3"+
		"\u06a4\7\7\2\2\u06a4\u00c3\3\2\2\2\u06a5\u06a8\3\2\2\2\u06a6\u06a8\5\u00c6"+
		"d\2\u06a7\u06a5\3\2\2\2\u06a7\u06a6\3\2\2\2\u06a8\u00c5\3\2\2\2\u06a9"+
		"\u06aa\bd\1\2\u06aa\u06ab\7\u012b\2\2\u06ab\u06b0\3\2\2\2\u06ac\u06ad"+
		"\f\3\2\2\u06ad\u06af\7\u012b\2\2\u06ae\u06ac\3\2\2\2\u06af\u06b2\3\2\2"+
		"\2\u06b0\u06ae\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u00c7\3\2\2\2\u06b2\u06b0"+
		"\3\2\2\2\u06b3\u06b7\5\u00c0a\2\u06b4\u06b7\5\b\5\2\u06b5\u06b7\7.\2\2"+
		"\u06b6\u06b3\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b6\u06b5\3\2\2\2\u06b7\u00c9"+
		"\3\2\2\2\u06b8\u0771\5\u00c0a\2\u06b9\u06ba\7-\2\2\u06ba\u06bb\7\7\2\2"+
		"\u06bb\u06bc\7.\2\2\u06bc\u0771\7\b\2\2\u06bd\u06be\7-\2\2\u06be\u06bf"+
		"\7\7\2\2\u06bf\u06c0\7\u0126\2\2\u06c0\u0771\7\b\2\2\u06c1\u06c2\7o\2"+
		"\2\u06c2\u06c3\7\7\2\2\u06c3\u06c4\7\65\2\2\u06c4\u06c5\7\u0126\2\2\u06c5"+
		"\u0771\7\b\2\2\u06c6\u06c7\7o\2\2\u06c7\u06c8\7\7\2\2\u06c8\u06c9\5\u010e"+
		"\u0088\2\u06c9\u06ca\7\b\2\2\u06ca\u0771\3\2\2\2\u06cb\u06cc\7o\2\2\u06cc"+
		"\u06cd\7\7\2\2\u06cd\u06ce\7.\2\2\u06ce\u0771\7\b\2\2\u06cf\u06d0\7,\2"+
		"\2\u06d0\u06d1\7\7\2\2\u06d1\u06d2\5\u00caf\2\u06d2\u06d3\7\b\2\2\u06d3"+
		"\u0771\3\2\2\2\u06d4\u06d5\7!\2\2\u06d5\u06d6\7\13\2\2\u06d6\u06d7\5\20"+
		"\t\2\u06d7\u06d8\7\f\2\2\u06d8\u06d9\7\7\2\2\u06d9\u06da\5\u00ccg\2\u06da"+
		"\u06db\7\b\2\2\u06db\u0771\3\2\2\2\u06dc\u06dd\7\"\2\2\u06dd\u06de\7\13"+
		"\2\2\u06de\u06df\5\20\t\2\u06df\u06e0\7\f\2\2\u06e0\u06e1\7\7\2\2\u06e1"+
		"\u06e2\5\u00ceh\2\u06e2\u06e3\7\b\2\2\u06e3\u0771\3\2\2\2\u06e4\u06e5"+
		"\7\37\2\2\u06e5\u06e6\7\13\2\2\u06e6\u06e7\5\20\t\2\u06e7\u06e8\7\f\2"+
		"\2\u06e8\u06e9\7\7\2\2\u06e9\u06ea\5\u00d0i\2\u06ea\u06eb\7\b\2\2\u06eb"+
		"\u0771\3\2\2\2\u06ec\u06ed\7\36\2\2\u06ed\u06ee\7\13\2\2\u06ee\u06ef\5"+
		"\20\t\2\u06ef\u06f0\7\f\2\2\u06f0\u06f1\7\7\2\2\u06f1\u06f2\5\u00d2j\2"+
		"\u06f2\u06f3\7\b\2\2\u06f3\u0771\3\2\2\2\u06f4\u06f5\7\35\2\2\u06f5\u06f6"+
		"\7\13\2\2\u06f6\u06f7\5\20\t\2\u06f7\u06f8\7\f\2\2\u06f8\u06f9\7\7\2\2"+
		"\u06f9\u06fa\5\u00d4k\2\u06fa\u06fb\7\b\2\2\u06fb\u0771\3\2\2\2\u06fc"+
		"\u06fd\7\34\2\2\u06fd\u06fe\7\13\2\2\u06fe\u06ff\5\20\t\2\u06ff\u0700"+
		"\7\f\2\2\u0700\u0701\7\7\2\2\u0701\u0702\5\u00d6l\2\u0702\u0703\7\b\2"+
		"\2\u0703\u0771\3\2\2\2\u0704\u0705\7(\2\2\u0705\u0706\7\13\2\2\u0706\u0707"+
		"\5\20\t\2\u0707\u0708\7\f\2\2\u0708\u0709\7\7\2\2\u0709\u070a\5\u00d0"+
		"i\2\u070a\u070b\7\b\2\2\u070b\u0771\3\2\2\2\u070c\u070d\7\'\2\2\u070d"+
		"\u070e\7\13\2\2\u070e\u070f\5\20\t\2\u070f\u0710\7\f\2\2\u0710\u0711\7"+
		"\7\2\2\u0711\u0712\5\u00d2j\2\u0712\u0713\7\b\2\2\u0713\u0771\3\2\2\2"+
		"\u0714\u0715\7&\2\2\u0715\u0716\7\13\2\2\u0716\u0717\5\20\t\2\u0717\u0718"+
		"\7\f\2\2\u0718\u0719\7\7\2\2\u0719\u071a\5\u00d4k\2\u071a\u071b\7\b\2"+
		"\2\u071b\u0771\3\2\2\2\u071c\u071d\7%\2\2\u071d\u071e\7\13\2\2\u071e\u071f"+
		"\5\20\t\2\u071f\u0720\7\f\2\2\u0720\u0721\7\7\2\2\u0721\u0722\5\u00d6"+
		"l\2\u0722\u0723\7\b\2\2\u0723\u0771\3\2\2\2\u0724\u0725\7\32\2\2\u0725"+
		"\u0726\7\37\2\2\u0726\u0727\7\13\2\2\u0727\u0728\5\20\t\2\u0728\u0729"+
		"\7\f\2\2\u0729\u072a\7\7\2\2\u072a\u072b\5\u00d0i\2\u072b\u072c\7\b\2"+
		"\2\u072c\u0771\3\2\2\2\u072d\u072e\7\32\2\2\u072e\u072f\7\36\2\2\u072f"+
		"\u0730\7\13\2\2\u0730\u0731\5\20\t\2\u0731\u0732\7\f\2\2\u0732\u0733\7"+
		"\7\2\2\u0733\u0734\5\u00d2j\2\u0734\u0735\7\b\2\2\u0735\u0771\3\2\2\2"+
		"\u0736\u0737\7\32\2\2\u0737\u0738\7\35\2\2\u0738\u0739\7\13\2\2\u0739"+
		"\u073a\5\20\t\2\u073a\u073b\7\f\2\2\u073b\u073c\7\7\2\2\u073c\u073d\5"+
		"\u00d4k\2\u073d\u073e\7\b\2\2\u073e\u0771\3\2\2\2\u073f\u0740\7\32\2\2"+
		"\u0740\u0741\7\34\2\2\u0741\u0742\7\13\2\2\u0742\u0743\5\20\t\2\u0743"+
		"\u0744\7\f\2\2\u0744\u0745\7\7\2\2\u0745\u0746\5\u00d6l\2\u0746\u0747"+
		"\7\b\2\2\u0747\u0771\3\2\2\2\u0748\u0749\7\31\2\2\u0749\u074a\7\13\2\2"+
		"\u074a\u074b\5\20\t\2\u074b\u074c\7\f\2\2\u074c\u074d\7\7\2\2\u074d\u074e"+
		"\5\u00d4k\2\u074e\u074f\7\b\2\2\u074f\u0771\3\2\2\2\u0750\u0751\7\30\2"+
		"\2\u0751\u0752\7\13\2\2\u0752\u0753\5\20\t\2\u0753\u0754\7\f\2\2\u0754"+
		"\u0755\7\7\2\2\u0755\u0756\5\u00d8m\2\u0756\u0757\7\b\2\2\u0757\u0771"+
		"\3\2\2\2\u0758\u0759\7-\2\2\u0759\u075a\7\13\2\2\u075a\u075b\5\20\t\2"+
		"\u075b\u075c\7\f\2\2\u075c\u075d\7\7\2\2\u075d\u075e\5\u00dan\2\u075e"+
		"\u075f\7\b\2\2\u075f\u0771\3\2\2\2\u0760\u0761\7o\2\2\u0761\u0762\7\13"+
		"\2\2\u0762\u0763\5\20\t\2\u0763\u0764\7\f\2\2\u0764\u0765\7\7\2\2\u0765"+
		"\u0766\5\u00dco\2\u0766\u0767\7\b\2\2\u0767\u0771\3\2\2\2\u0768\u0769"+
		"\7,\2\2\u0769\u076a\7\13\2\2\u076a\u076b\5\20\t\2\u076b\u076c\7\f\2\2"+
		"\u076c\u076d\7\7\2\2\u076d\u076e\5\u00dep\2\u076e\u076f\7\b\2\2\u076f"+
		"\u0771\3\2\2\2\u0770\u06b8\3\2\2\2\u0770\u06b9\3\2\2\2\u0770\u06bd\3\2"+
		"\2\2\u0770\u06c1\3\2\2\2\u0770\u06c6\3\2\2\2\u0770\u06cb\3\2\2\2\u0770"+
		"\u06cf\3\2\2\2\u0770\u06d4\3\2\2\2\u0770\u06dc\3\2\2\2\u0770\u06e4\3\2"+
		"\2\2\u0770\u06ec\3\2\2\2\u0770\u06f4\3\2\2\2\u0770\u06fc\3\2\2\2\u0770"+
		"\u0704\3\2\2\2\u0770\u070c\3\2\2\2\u0770\u0714\3\2\2\2\u0770\u071c\3\2"+
		"\2\2\u0770\u0724\3\2\2\2\u0770\u072d\3\2\2\2\u0770\u0736\3\2\2\2\u0770"+
		"\u073f\3\2\2\2\u0770\u0748\3\2\2\2\u0770\u0750\3\2\2\2\u0770\u0758\3\2"+
		"\2\2\u0770\u0760\3\2\2\2\u0770\u0768\3\2\2\2\u0771\u00cb\3\2\2\2\u0772"+
		"\u0779\bg\1\2\u0773\u0774\f\4\2\2\u0774\u0778\5\24\13\2\u0775\u0776\f"+
		"\3\2\2\u0776\u0778\5\20\t\2\u0777\u0773\3\2\2\2\u0777\u0775\3\2\2\2\u0778"+
		"\u077b\3\2\2\2\u0779\u0777\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u00cd\3\2"+
		"\2\2\u077b\u0779\3\2\2\2\u077c\u0783\bh\1\2\u077d\u077e\f\4\2\2\u077e"+
		"\u0782\5\24\13\2\u077f\u0780\f\3\2\2\u0780\u0782\5\22\n\2\u0781\u077d"+
		"\3\2\2\2\u0781\u077f\3\2\2\2\u0782\u0785\3\2\2\2\u0783\u0781\3\2\2\2\u0783"+
		"\u0784\3\2\2\2\u0784\u00cf\3\2\2\2\u0785\u0783\3\2\2\2\u0786\u078b\bi"+
		"\1\2\u0787\u0788\f\3\2\2\u0788\u078a\5\22\n\2\u0789\u0787\3\2\2\2\u078a"+
		"\u078d\3\2\2\2\u078b\u0789\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u00d1\3\2"+
		"\2\2\u078d\u078b\3\2\2\2\u078e\u0793\bj\1\2\u078f\u0790\f\3\2\2\u0790"+
		"\u0792\5\20\t\2\u0791\u078f\3\2\2\2\u0792\u0795\3\2\2\2\u0793\u0791\3"+
		"\2\2\2\u0793\u0794\3\2\2\2\u0794\u00d3\3\2\2\2\u0795\u0793\3\2\2\2\u0796"+
		"\u079b\bk\1\2\u0797\u0798\f\3\2\2\u0798\u079a\5\20\t\2\u0799\u0797\3\2"+
		"\2\2\u079a\u079d\3\2\2\2\u079b\u0799\3\2\2\2\u079b\u079c\3\2\2\2\u079c"+
		"\u00d5\3\2\2\2\u079d\u079b\3\2\2\2\u079e\u07a3\bl\1\2\u079f\u07a0\f\3"+
		"\2\2\u07a0\u07a2\5\20\t\2\u07a1\u079f\3\2\2\2\u07a2\u07a5\3\2\2\2\u07a3"+
		"\u07a1\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u00d7\3\2\2\2\u07a5\u07a3\3\2"+
		"\2\2\u07a6\u07ab\bm\1\2\u07a7\u07a8\f\3\2\2\u07a8\u07aa\5\u012e\u0098"+
		"\2\u07a9\u07a7\3\2\2\2\u07aa\u07ad\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ab\u07ac"+
		"\3\2\2\2\u07ac\u00d9\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ae\u07b5\bn\1\2\u07af"+
		"\u07b0\f\4\2\2\u07b0\u07b4\7.\2\2\u07b1\u07b2\f\3\2\2\u07b2\u07b4\7\u0126"+
		"\2\2\u07b3\u07af\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b4\u07b7\3\2\2\2\u07b5"+
		"\u07b3\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u00db\3\2\2\2\u07b7\u07b5\3\2"+
		"\2\2\u07b8\u07c2\bo\1\2\u07b9\u07ba\f\5\2\2\u07ba\u07c1\7.\2\2\u07bb\u07bc"+
		"\f\4\2\2\u07bc\u07bd\7\65\2\2\u07bd\u07c1\7\u0126\2\2\u07be\u07bf\f\3"+
		"\2\2\u07bf\u07c1\5\u010e\u0088\2\u07c0\u07b9\3\2\2\2\u07c0\u07bb\3\2\2"+
		"\2\u07c0\u07be\3\2\2\2\u07c1\u07c4\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c2\u07c3"+
		"\3\2\2\2\u07c3\u00dd\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c5\u07ca\bp\1\2\u07c6"+
		"\u07c7\f\3\2\2\u07c7\u07c9\5\u00caf\2\u07c8\u07c6\3\2\2\2\u07c9\u07cc"+
		"\3\2\2\2\u07ca\u07c8\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u00df\3\2\2\2\u07cc"+
		"\u07ca\3\2\2\2\u07cd\u07ce\7h\2\2\u07ce\u00e1\3\2\2\2\u07cf\u07d0\7\u008d"+
		"\2\2\u07d0\u00e3\3\2\2\2\u07d1\u07d2\7\u008e\2\2\u07d2\u00e5\3\2\2\2\u07d3"+
		"\u07d4\7\u008f\2\2\u07d4\u00e7\3\2\2\2\u07d5\u07d6\7\u0090\2\2\u07d6\u00e9"+
		"\3\2\2\2\u07d7\u07d8\7\u0091\2\2\u07d8\u00eb\3\2\2\2\u07d9\u07da\7\u0094"+
		"\2\2\u07da\u00ed\3\2\2\2\u07db\u07dc\7\u0092\2\2\u07dc\u00ef\3\2\2\2\u07dd"+
		"\u07de\7\u0098\2\2\u07de\u00f1\3\2\2\2\u07df\u07e0\7\u0096\2\2\u07e0\u00f3"+
		"\3\2\2\2\u07e1\u07e2\7\u0097\2\2\u07e2\u00f5\3\2\2\2\u07e3\u07e4\7\u0093"+
		"\2\2\u07e4\u00f7\3\2\2\2\u07e5\u07e6\7\u0099\2\2\u07e6\u00f9\3\2\2\2\u07e7"+
		"\u07e8\7\u0095\2\2\u07e8\u00fb\3\2\2\2\u07e9\u07ea\5\u00eav\2\u07ea\u07eb"+
		"\7\7\2\2\u07eb\u00fd\3\2\2\2\u07ec\u083a\5\u00e2r\2\u07ed\u07ee\5\u00e4"+
		"s\2\u07ee\u07ef\5\20\t\2\u07ef\u083a\3\2\2\2\u07f0\u07f1\5\u00e4s\2\u07f1"+
		"\u07f2\5\f\7\2\u07f2\u083a\3\2\2\2\u07f3\u07f4\5\u00e6t\2\u07f4\u07f5"+
		"\5\20\t\2\u07f5\u083a\3\2\2\2\u07f6\u07f7\5\u00e8u\2\u07f7\u07f8\5\22"+
		"\n\2\u07f8\u083a\3\2\2\2\u07f9\u07fa\5\u00eav\2\u07fa\u07fb\5\24\13\2"+
		"\u07fb\u083a\3\2\2\2\u07fc\u07fd\5\u00eav\2\u07fd\u07fe\5\22\n\2\u07fe"+
		"\u083a\3\2\2\2\u07ff\u0800\5\u00fc\177\2\u0800\u0801\5\u00c4c\2\u0801"+
		"\u0802\7\b\2\2\u0802\u083a\3\2\2\2\u0803\u0804\5\u00ecw\2\u0804\u0805"+
		"\5\20\t\2\u0805\u083a\3\2\2\2\u0806\u0807\5\u00ecw\2\u0807\u0808\5\f\7"+
		"\2\u0808\u083a\3\2\2\2\u0809\u080a\5\u00eex\2\u080a\u080b\5f\64\2\u080b"+
		"\u083a\3\2\2\2\u080c\u080d\5\u00f0y\2\u080d\u080e\5\u011a\u008e\2\u080e"+
		"\u080f\5\u0112\u008a\2\u080f\u0810\7\25\2\2\u0810\u0811\5\16\b\2\u0811"+
		"\u083a\3\2\2\2\u0812\u0813\5\u00f0y\2\u0813\u0814\5\u011a\u008e\2\u0814"+
		"\u0815\5\16\b\2\u0815\u083a\3\2\2\2\u0816\u0817\5\u00f0y\2\u0817\u0818"+
		"\5l\67\2\u0818\u083a\3\2\2\2\u0819\u081a\5\u00f2z\2\u081a\u081b\5\u0112"+
		"\u008a\2\u081b\u083a\3\2\2\2\u081c\u081d\5\u00f4{\2\u081d\u081e\5\b\5"+
		"\2\u081e\u083a\3\2\2\2\u081f\u0820\5\u00f4{\2\u0820\u0821\7X\2\2\u0821"+
		"\u0822\7\7\2\2\u0822\u0823\5\b\5\2\u0823\u0824\7\b\2\2\u0824\u083a\3\2"+
		"\2\2\u0825\u0826\5\u00f4{\2\u0826\u0827\5\u00c2b\2\u0827\u0828\5\u00c4"+
		"c\2\u0828\u0829\7\b\2\2\u0829\u083a\3\2\2\2\u082a\u082b\5\u00f6|\2\u082b"+
		"\u082c\5h\65\2\u082c\u082d\5\u011a\u008e\2\u082d\u082e\7\7\2\2\u082e\u082f"+
		"\5\u0108\u0085\2\u082f\u0830\7\b\2\2\u0830\u083a\3\2\2\2\u0831\u0832\5"+
		"\u00f8}\2\u0832\u0833\5\34\17\2\u0833\u083a\3\2\2\2\u0834\u0835\5\u00fa"+
		"~\2\u0835\u0836\7\7\2\2\u0836\u0837\5\u0100\u0081\2\u0837\u0838\7\b\2"+
		"\2\u0838\u083a\3\2\2\2\u0839\u07ec\3\2\2\2\u0839\u07ed\3\2\2\2\u0839\u07f0"+
		"\3\2\2\2\u0839\u07f3\3\2\2\2\u0839\u07f6\3\2\2\2\u0839\u07f9\3\2\2\2\u0839"+
		"\u07fc\3\2\2\2\u0839\u07ff\3\2\2\2\u0839\u0803\3\2\2\2\u0839\u0806\3\2"+
		"\2\2\u0839\u0809\3\2\2\2\u0839\u080c\3\2\2\2\u0839\u0812\3\2\2\2\u0839"+
		"\u0816\3\2\2\2\u0839\u0819\3\2\2\2\u0839\u081c\3\2\2\2\u0839\u081f\3\2"+
		"\2\2\u0839\u0825\3\2\2\2\u0839\u082a\3\2\2\2\u0839\u0831\3\2\2\2\u0839"+
		"\u0834\3\2\2\2\u083a\u00ff\3\2\2\2\u083b\u0847\3\2\2\2\u083c\u083d\5\f"+
		"\7\2\u083d\u083e\7\6\2\2\u083e\u083f\5\u0100\u0081\2\u083f\u0847\3\2\2"+
		"\2\u0840\u0841\5\20\t\2\u0841\u0842\7\6\2\2\u0842\u0843\5\u0100\u0081"+
		"\2\u0843\u0847\3\2\2\2\u0844\u0847\5\f\7\2\u0845\u0847\5\20\t\2\u0846"+
		"\u083b\3\2\2\2\u0846\u083c\3\2\2\2\u0846\u0840\3\2\2\2\u0846\u0844\3\2"+
		"\2\2\u0846\u0845\3\2\2\2\u0847\u0101\3\2\2\2\u0848\u084e\3\2\2\2\u0849"+
		"\u084a\7\r\2\2\u084a\u084b\5\u0104\u0083\2\u084b\u084c\7\16\2\2\u084c"+
		"\u084e\3\2\2\2\u084d\u0848\3\2\2\2\u084d\u0849\3\2\2\2\u084e\u0103\3\2"+
		"\2\2\u084f\u0852\3\2\2\2\u0850\u0852\5\u0106\u0084\2\u0851\u084f\3\2\2"+
		"\2\u0851\u0850\3\2\2\2\u0852\u0105\3\2\2\2\u0853\u0854\b\u0084\1\2\u0854"+
		"\u0855\5\u011a\u008e\2\u0855\u085b\3\2\2\2\u0856\u0857\f\3\2\2\u0857\u0858"+
		"\7\6\2\2\u0858\u085a\5\u011a\u008e\2\u0859\u0856\3\2\2\2\u085a\u085d\3"+
		"\2\2\2\u085b\u0859\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u0107\3\2\2\2\u085d"+
		"\u085b\3\2\2\2\u085e\u0861\3\2\2\2\u085f\u0861\5\u010a\u0086\2\u0860\u085e"+
		"\3\2\2\2\u0860\u085f\3\2\2\2\u0861\u0109\3\2\2\2\u0862\u0863\b\u0086\1"+
		"\2\u0863\u0864\5\u010c\u0087\2\u0864\u086a\3\2\2\2\u0865\u0866\f\3\2\2"+
		"\u0866\u0867\7\6\2\2\u0867\u0869\5\u010c\u0087\2\u0868\u0865\3\2\2\2\u0869"+
		"\u086c\3\2\2\2\u086a\u0868\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u010b\3\2"+
		"\2\2\u086c\u086a\3\2\2\2\u086d\u0878\7\26\2\2\u086e\u086f\5\u0090I\2\u086f"+
		"\u0870\5\u011a\u008e\2\u0870\u0871\5\u0082B\2\u0871\u0878\3\2\2\2\u0872"+
		"\u0873\5\u0090I\2\u0873\u0874\5\u011a\u008e\2\u0874\u0875\5\u0082B\2\u0875"+
		"\u0876\5\f\7\2\u0876\u0878\3\2\2\2\u0877\u086d\3\2\2\2\u0877\u086e\3\2"+
		"\2\2\u0877\u0872\3\2\2\2\u0878\u010d\3\2\2\2\u0879\u087a\7\13\2\2\u087a"+
		"\u087b\5\16\b\2\u087b\u087c\7\f\2\2\u087c\u087d\5\u0110\u0089\2\u087d"+
		"\u0893\3\2\2\2\u087e\u087f\7\13\2\2\u087f\u0880\5l\67\2\u0880\u0881\7"+
		"\f\2\2\u0881\u0882\5\u0110\u0089\2\u0882\u0893\3\2\2\2\u0883\u0884\7\13"+
		"\2\2\u0884\u0885\7\21\2\2\u0885\u0886\7\f\2\2\u0886\u0893\5\u0110\u0089"+
		"\2\u0887\u0888\7\13\2\2\u0888\u0889\7\u00da\2\2\u0889\u088a\5\16\b\2\u088a"+
		"\u088b\7\f\2\2\u088b\u088c\5\u0110\u0089\2\u088c\u0893\3\2\2\2\u088d\u0893"+
		"\5\u0110\u0089\2\u088e\u0893\5l\67\2\u088f\u0893\7\u009f\2\2\u0890\u0893"+
		"\7\u00a0\2\2\u0891\u0893\7\u00a1\2\2\u0892\u0879\3\2\2\2\u0892\u087e\3"+
		"\2\2\2\u0892\u0883\3\2\2\2\u0892\u0887\3\2\2\2\u0892\u088d\3\2\2\2\u0892"+
		"\u088e\3\2\2\2\u0892\u088f\3\2\2\2\u0892\u0890\3\2\2\2\u0892\u0891\3\2"+
		"\2\2\u0893\u010f\3\2\2\2\u0894\u0895\b\u0089\1\2\u0895\u0896\5\16\b\2"+
		"\u0896\u089c\3\2\2\2\u0897\u0898\f\3\2\2\u0898\u0899\7\23\2\2\u0899\u089b"+
		"\5\16\b\2\u089a\u0897\3\2\2\2\u089b\u089e\3\2\2\2\u089c\u089a\3\2\2\2"+
		"\u089c\u089d\3\2\2\2\u089d\u0111\3\2\2\2\u089e\u089c\3\2\2\2\u089f\u08ab"+
		"\5\u010e\u0088\2\u08a0\u08a1\7\13\2\2\u08a1\u08a2\5\16\b\2\u08a2\u08a3"+
		"\7\f\2\2\u08a3\u08ab\3\2\2\2\u08a4\u08a5\7\13\2\2\u08a5\u08a6\7\u00da"+
		"\2\2\u08a6\u08a7\5\16\b\2\u08a7\u08a8\7\f\2\2\u08a8\u08ab\3\2\2\2\u08a9"+
		"\u08ab\5\u011a\u008e\2\u08aa\u089f\3\2\2\2\u08aa\u08a0\3\2\2\2\u08aa\u08a4"+
		"\3\2\2\2\u08aa\u08a9\3\2\2\2\u08ab\u0113\3\2\2\2\u08ac\u090a\b\u008b\1"+
		"\2\u08ad\u08ae\7\u00e3\2\2\u08ae\u08af\7\7\2\2\u08af\u08b0\5\b\5\2\u08b0"+
		"\u08b1\7\6\2\2\u08b1\u08b2\5\b\5\2\u08b2\u08b3\7\6\2\2\u08b3\u08b4\5\b"+
		"\5\2\u08b4\u08b5\7\6\2\2\u08b5\u08b6\5\b\5\2\u08b6\u08b7\7\b\2\2\u08b7"+
		"\u090a\3\2\2\2\u08b8\u08b9\7\u00e3\2\2\u08b9\u08ba\7\7\2\2\u08ba\u08bb"+
		"\5\b\5\2\u08bb\u08bc\7\6\2\2\u08bc\u08bd\5\b\5\2\u08bd\u08be\7\b\2\2\u08be"+
		"\u090a\3\2\2\2\u08bf\u08c0\7\u00e5\2\2\u08c0\u08c1\7\u00e4\2\2\u08c1\u08c2"+
		"\7\13\2\2\u08c2\u08c3\5\20\t\2\u08c3\u08c4\7\f\2\2\u08c4\u090a\3\2\2\2"+
		"\u08c5\u08c6\7\u00e5\2\2\u08c6\u08c7\7\u00f8\2\2\u08c7\u08c8\7\13\2\2"+
		"\u08c8\u08c9\5\20\t\2\u08c9\u08ca\7\f\2\2\u08ca\u08cb\5\u0114\u008b\64"+
		"\u08cb\u090a\3\2\2\2\u08cc\u090a\7\u00e6\2\2\u08cd\u090a\7\u00e7\2\2\u08ce"+
		"\u090a\7\u00e8\2\2\u08cf\u090a\7\27\2\2\u08d0\u090a\7\30\2\2\u08d1\u090a"+
		"\7\34\2\2\u08d2\u090a\7\35\2\2\u08d3\u090a\7\36\2\2\u08d4\u090a\7\37\2"+
		"\2\u08d5\u090a\7!\2\2\u08d6\u090a\7\"\2\2\u08d7\u090a\7\u0124\2\2\u08d8"+
		"\u08d9\7\32\2\2\u08d9\u090a\7\34\2\2\u08da\u08db\7\32\2\2\u08db\u090a"+
		"\7\35\2\2\u08dc\u08dd\7\32\2\2\u08dd\u090a\7\36\2\2\u08de\u08df\7\32\2"+
		"\2\u08df\u090a\7\37\2\2\u08e0\u090a\7%\2\2\u08e1\u090a\7&\2\2\u08e2\u090a"+
		"\7\'\2\2\u08e3\u090a\7(\2\2\u08e4\u090a\7\u00e9\2\2\u08e5\u090a\7\u00ea"+
		"\2\2\u08e6\u090a\7\u00eb\2\2\u08e7\u090a\7\u00ed\2\2\u08e8\u090a\7\u00ee"+
		"\2\2\u08e9\u090a\7\u00ef\2\2\u08ea\u090a\7\u00f0\2\2\u08eb\u08ec\7\u00f1"+
		"\2\2\u08ec\u090a\5\u0116\u008c\2\u08ed\u08ee\7\u00f2\2\2\u08ee\u090a\5"+
		"\u0116\u008c\2\u08ef\u090a\7\u00f3\2\2\u08f0\u08f1\7Q\2\2\u08f1\u090a"+
		"\5\u0116\u008c\2\u08f2\u08f3\7\u00f4\2\2\u08f3\u090a\5\u0118\u008d\2\u08f4"+
		"\u08f5\7\u00f4\2\2\u08f5\u08f6\5\u0118\u008d\2\u08f6\u08f7\7\6\2\2\u08f7"+
		"\u08f8\5\b\5\2\u08f8\u090a\3\2\2\2\u08f9\u090a\7\33\2\2\u08fa\u08fb\7"+
		"\32\2\2\u08fb\u090a\7\33\2\2\u08fc\u090a\7$\2\2\u08fd\u08fe\7S\2\2\u08fe"+
		"\u090a\7\u00f3\2\2\u08ff\u090a\7\u00f5\2\2\u0900\u0901\7X\2\2\u0901\u090a"+
		"\7\u00eb\2\2\u0902\u090a\7\u00ec\2\2\u0903\u0904\7\u00e6\2\2\u0904\u090a"+
		"\7\30\2\2\u0905\u090a\7h\2\2\u0906\u0907\7\u0088\2\2\u0907\u090a\7\u00f7"+
		"\2\2\u0908\u090a\7\u00f9\2\2\u0909\u08ac\3\2\2\2\u0909\u08ad\3\2\2\2\u0909"+
		"\u08b8\3\2\2\2\u0909\u08bf\3\2\2\2\u0909\u08c5\3\2\2\2\u0909\u08cc\3\2"+
		"\2\2\u0909\u08cd\3\2\2\2\u0909\u08ce\3\2\2\2\u0909\u08cf\3\2\2\2\u0909"+
		"\u08d0\3\2\2\2\u0909\u08d1\3\2\2\2\u0909\u08d2\3\2\2\2\u0909\u08d3\3\2"+
		"\2\2\u0909\u08d4\3\2\2\2\u0909\u08d5\3\2\2\2\u0909\u08d6\3\2\2\2\u0909"+
		"\u08d7\3\2\2\2\u0909\u08d8\3\2\2\2\u0909\u08da\3\2\2\2\u0909\u08dc\3\2"+
		"\2\2\u0909\u08de\3\2\2\2\u0909\u08e0\3\2\2\2\u0909\u08e1\3\2\2\2\u0909"+
		"\u08e2\3\2\2\2\u0909\u08e3\3\2\2\2\u0909\u08e4\3\2\2\2\u0909\u08e5\3\2"+
		"\2\2\u0909\u08e6\3\2\2\2\u0909\u08e7\3\2\2\2\u0909\u08e8\3\2\2\2\u0909"+
		"\u08e9\3\2\2\2\u0909\u08ea\3\2\2\2\u0909\u08eb\3\2\2\2\u0909\u08ed\3\2"+
		"\2\2\u0909\u08ef\3\2\2\2\u0909\u08f0\3\2\2\2\u0909\u08f2\3\2\2\2\u0909"+
		"\u08f4\3\2\2\2\u0909\u08f9\3\2\2\2\u0909\u08fa\3\2\2\2\u0909\u08fc\3\2"+
		"\2\2\u0909\u08fd\3\2\2\2\u0909\u08ff\3\2\2\2\u0909\u0900\3\2\2\2\u0909"+
		"\u0902\3\2\2\2\u0909\u0903\3\2\2\2\u0909\u0905\3\2\2\2\u0909\u0906\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u0909\u0908\3\2\2\2\u090a\u0924\3\2\2\2\u090b\u090c\f\37\2\2\u090c"+
		"\u0923\7\21\2\2\u090d\u090e\f\36\2\2\u090e\u090f\7\13\2\2\u090f\u0923"+
		"\7\f\2\2\u0910\u0911\f\35\2\2\u0911\u0912\7\13\2\2\u0912\u0913\5\20\t"+
		"\2\u0913\u0914\7\f\2\2\u0914\u0923\3\2\2\2\u0915\u0916\f\34\2\2\u0916"+
		"\u0917\7\13\2\2\u0917\u0918\5\20\t\2\u0918\u0919\7\5\2\2\u0919\u091a\5"+
		"\20\t\2\u091a\u091b\7\f\2\2\u091b\u0923\3\2\2\2\u091c\u091d\f\33\2\2\u091d"+
		"\u091e\7\13\2\2\u091e\u091f\7\5\2\2\u091f\u0920\5\20\t\2\u0920\u0921\7"+
		"\f\2\2\u0921\u0923\3\2\2\2\u0922\u090b\3\2\2\2\u0922\u090d\3\2\2\2\u0922"+
		"\u0910\3\2\2\2\u0922\u0915\3\2\2\2\u0922\u091c\3\2\2\2\u0923\u0926\3\2"+
		"\2\2\u0924\u0922\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0115\3\2\2\2\u0926"+
		"\u0924\3\2\2\2\u0927\u092f\3\2\2\2\u0928\u0929\7\7\2\2\u0929\u092a\7\u00fa"+
		"\2\2\u092a\u092b\7\n\2\2\u092b\u092c\5\20\t\2\u092c\u092d\7\b\2\2\u092d"+
		"\u092f\3\2\2\2\u092e\u0927\3\2\2\2\u092e\u0928\3\2\2\2\u092f\u0117\3\2"+
		"\2\2\u0930\u0964\b\u008d\1\2\u0931\u0964\7\u0101\2\2\u0932\u0964\7\u00e6"+
		"\2\2\u0933\u0964\7\u00e7\2\2\u0934\u0964\7\27\2\2\u0935\u0964\7\30\2\2"+
		"\u0936\u0964\7\34\2\2\u0937\u0964\7\35\2\2\u0938\u0964\7\36\2\2\u0939"+
		"\u0964\7\37\2\2\u093a\u0964\7!\2\2\u093b\u0964\7\"\2\2\u093c\u093d\7\32"+
		"\2\2\u093d\u0964\7\34\2\2\u093e\u093f\7\32\2\2\u093f\u0964\7\35\2\2\u0940"+
		"\u0941\7\32\2\2\u0941\u0964\7\36\2\2\u0942\u0943\7\32\2\2\u0943\u0964"+
		"\7\37\2\2\u0944\u0964\7%\2\2\u0945\u0964\7&\2\2\u0946\u0964\7\'\2\2\u0947"+
		"\u0964\7(\2\2\u0948\u0964\7\21\2\2\u0949\u0964\7\u00e9\2\2\u094a\u0964"+
		"\7\u00ea\2\2\u094b\u0964\7\u00eb\2\2\u094c\u0964\7\u00ed\2\2\u094d\u0964"+
		"\7\u00ee\2\2\u094e\u0964\7\u00f1\2\2\u094f\u0964\7\u00f2\2\2\u0950\u0964"+
		"\7\u00f4\2\2\u0951\u0964\7\33\2\2\u0952\u0953\7\32\2\2\u0953\u0964\7\33"+
		"\2\2\u0954\u0964\7$\2\2\u0955\u0964\7\u0124\2\2\u0956\u0964\7\u0102\2"+
		"\2\u0957\u0964\7\u0103\2\2\u0958\u0964\7\u0104\2\2\u0959\u0964\7\u0105"+
		"\2\2\u095a\u0964\7\u0106\2\2\u095b\u0964\7\u0107\2\2\u095c\u0964\7\u0108"+
		"\2\2\u095d\u0964\7\u0109\2\2\u095e\u0964\7\u010a\2\2\u095f\u0964\7\u010b"+
		"\2\2\u0960\u0964\7\u010c\2\2\u0961\u0964\7\u010d\2\2\u0962\u0964\7\u010e"+
		"\2\2\u0963\u0930\3\2\2\2\u0963\u0931\3\2\2\2\u0963\u0932\3\2\2\2\u0963"+
		"\u0933\3\2\2\2\u0963\u0934\3\2\2\2\u0963\u0935\3\2\2\2\u0963\u0936\3\2"+
		"\2\2\u0963\u0937\3\2\2\2\u0963\u0938\3\2\2\2\u0963\u0939\3\2\2\2\u0963"+
		"\u093a\3\2\2\2\u0963\u093b\3\2\2\2\u0963\u093c\3\2\2\2\u0963\u093e\3\2"+
		"\2\2\u0963\u0940\3\2\2\2\u0963\u0942\3\2\2\2\u0963\u0944\3\2\2\2\u0963"+
		"\u0945\3\2\2\2\u0963\u0946\3\2\2\2\u0963\u0947\3\2\2\2\u0963\u0948\3\2"+
		"\2\2\u0963\u0949\3\2\2\2\u0963\u094a\3\2\2\2\u0963\u094b\3\2\2\2\u0963"+
		"\u094c\3\2\2\2\u0963\u094d\3\2\2\2\u0963\u094e\3\2\2\2\u0963\u094f\3\2"+
		"\2\2\u0963\u0950\3\2\2\2\u0963\u0951\3\2\2\2\u0963\u0952\3\2\2\2\u0963"+
		"\u0954\3\2\2\2\u0963\u0955\3\2\2\2\u0963\u0956\3\2\2\2\u0963\u0957\3\2"+
		"\2\2\u0963\u0958\3\2\2\2\u0963\u0959\3\2\2\2\u0963\u095a\3\2\2\2\u0963"+
		"\u095b\3\2\2\2\u0963\u095c\3\2\2\2\u0963\u095d\3\2\2\2\u0963\u095e\3\2"+
		"\2\2\u0963\u095f\3\2\2\2\u0963\u0960\3\2\2\2\u0963\u0961\3\2\2\2\u0963"+
		"\u0962\3\2\2\2\u0964\u096e\3\2\2\2\u0965\u0966\f\36\2\2\u0966\u0967\7"+
		"\13\2\2\u0967\u096d\7\f\2\2\u0968\u0969\f\35\2\2\u0969\u096d\7\u010f\2"+
		"\2\u096a\u096b\f\34\2\2\u096b\u096d\7\22\2\2\u096c\u0965\3\2\2\2\u096c"+
		"\u0968\3\2\2\2\u096c\u096a\3\2\2\2\u096d\u0970\3\2\2\2\u096e\u096c\3\2"+
		"\2\2\u096e\u096f\3\2\2\2\u096f\u0119\3\2\2\2\u0970\u096e\3\2\2\2\u0971"+
		"\u0972\b\u008e\1\2\u0972\u0973\7\65\2\2\u0973\u0999\5\u010e\u0088\2\u0974"+
		"\u0999\7,\2\2\u0975\u0976\7E\2\2\u0976\u0977\7\65\2\2\u0977\u0999\5\u010e"+
		"\u0088\2\u0978\u0979\7F\2\2\u0979\u0999\5\u010e\u0088\2\u097a\u097b\5"+
		"\u00e0q\2\u097b\u097c\5h\65\2\u097c\u097d\5\u011a\u008e\2\u097d\u097e"+
		"\7\21\2\2\u097e\u097f\7\7\2\2\u097f\u0980\5\u0108\u0085\2\u0980\u0981"+
		"\7\b\2\2\u0981\u0999\3\2\2\2\u0982\u0983\7\24\2\2\u0983\u0984\7\24\2\2"+
		"\u0984\u0999\5\20\t\2\u0985\u0986\7\24\2\2\u0986\u0999\5\20\t\2\u0987"+
		"\u0988\7\24\2\2\u0988\u0989\7\24\2\2\u0989\u0999\5\16\b\2\u098a\u098b"+
		"\7\24\2\2\u098b\u0999\5\16\b\2\u098c\u0999\7\66\2\2\u098d\u0999\7\27\2"+
		"\2\u098e\u098f\7G\2\2\u098f\u0999\7\33\2\2\u0990\u0991\7G\2\2\u0991\u0992"+
		"\7\32\2\2\u0992\u0999\7\33\2\2\u0993\u0994\7G\2\2\u0994\u0999\7$\2\2\u0995"+
		"\u0999\5\u011c\u008f\2\u0996\u0997\7\26\2\2\u0997\u0999\5\u011a\u008e"+
		"\3\u0998\u0971\3\2\2\2\u0998\u0974\3\2\2\2\u0998\u0975\3\2\2\2\u0998\u0978"+
		"\3\2\2\2\u0998\u097a\3\2\2\2\u0998\u0982\3\2\2\2\u0998\u0985\3\2\2\2\u0998"+
		"\u0987\3\2\2\2\u0998\u098a\3\2\2\2\u0998\u098c\3\2\2\2\u0998\u098d\3\2"+
		"\2\2\u0998\u098e\3\2\2\2\u0998\u0990\3\2\2\2\u0998\u0993\3\2\2\2\u0998"+
		"\u0995\3\2\2\2\u0998\u0996\3\2\2\2\u0999\u09bb\3\2\2\2\u099a\u099b\f\26"+
		"\2\2\u099b\u099c\7\13\2\2\u099c\u09ba\7\f\2\2\u099d\u099e\f\25\2\2\u099e"+
		"\u099f\7\13\2\2\u099f\u09a0\5\u011e\u0090\2\u09a0\u09a1\7\f\2\2\u09a1"+
		"\u09ba\3\2\2\2\u09a2\u09a3\f\24\2\2\u09a3\u09ba\7\22\2\2\u09a4\u09a5\f"+
		"\23\2\2\u09a5\u09ba\7\21\2\2\u09a6\u09a7\f\22\2\2\u09a7\u09ba\7j\2\2\u09a8"+
		"\u09a9\f\21\2\2\u09a9\u09aa\7k\2\2\u09aa\u09ab\7\7\2\2\u09ab\u09ac\5\u0112"+
		"\u008a\2\u09ac\u09ad\7\b\2\2\u09ad\u09ba\3\2\2\2\u09ae\u09af\f\20\2\2"+
		"\u09af\u09b0\7l\2\2\u09b0\u09b1\7\7\2\2\u09b1\u09b2\5\u0112\u008a\2\u09b2"+
		"\u09b3\7\b\2\2\u09b3\u09ba\3\2\2\2\u09b4\u09b5\f\16\2\2\u09b5\u09b6\7"+
		"\r\2\2\u09b6\u09b7\5\u0104\u0083\2\u09b7\u09b8\7\16\2\2\u09b8\u09ba\3"+
		"\2\2\2\u09b9\u099a\3\2\2\2\u09b9\u099d\3\2\2\2\u09b9\u09a2\3\2\2\2\u09b9"+
		"\u09a4\3\2\2\2\u09b9\u09a6\3\2\2\2\u09b9\u09a8\3\2\2\2\u09b9\u09ae\3\2"+
		"\2\2\u09b9\u09b4\3\2\2\2\u09ba\u09bd\3\2\2\2\u09bb\u09b9\3\2\2\2\u09bb"+
		"\u09bc\3\2\2\2\u09bc\u011b\3\2\2\2\u09bd\u09bb\3\2\2\2\u09be\u09d4\7\31"+
		"\2\2\u09bf\u09d4\7-\2\2\u09c0\u09d4\7\30\2\2\u09c1\u09d4\7\34\2\2\u09c2"+
		"\u09d4\7\35\2\2\u09c3\u09d4\7\36\2\2\u09c4\u09d4\7\37\2\2\u09c5\u09d4"+
		"\7!\2\2\u09c6\u09d4\7\"\2\2\u09c7\u09c8\7\32\2\2\u09c8\u09d4\7\34\2\2"+
		"\u09c9\u09ca\7\32\2\2\u09ca\u09d4\7\35\2\2\u09cb\u09cc\7\32\2\2\u09cc"+
		"\u09d4\7\36\2\2\u09cd\u09ce\7\32\2\2\u09ce\u09d4\7\37\2\2\u09cf\u09d4"+
		"\7%\2\2\u09d0\u09d4\7&\2\2\u09d1\u09d4\7\'\2\2\u09d2\u09d4\7(\2\2\u09d3"+
		"\u09be\3\2\2\2\u09d3\u09bf\3\2\2\2\u09d3\u09c0\3\2\2\2\u09d3\u09c1\3\2"+
		"\2\2\u09d3\u09c2\3\2\2\2\u09d3\u09c3\3\2\2\2\u09d3\u09c4\3\2\2\2\u09d3"+
		"\u09c5\3\2\2\2\u09d3\u09c6\3\2\2\2\u09d3\u09c7\3\2\2\2\u09d3\u09c9\3\2"+
		"\2\2\u09d3\u09cb\3\2\2\2\u09d3\u09cd\3\2\2\2\u09d3\u09cf\3\2\2\2\u09d3"+
		"\u09d0\3\2\2\2\u09d3\u09d1\3\2\2\2\u09d3\u09d2\3\2\2\2\u09d4\u011d\3\2"+
		"\2\2\u09d5\u09d6\b\u0090\1\2\u09d6\u09d7\5\u0120\u0091\2\u09d7\u09dd\3"+
		"\2\2\2\u09d8\u09d9\f\3\2\2\u09d9\u09da\7\6\2\2\u09da\u09dc\5\u0120\u0091"+
		"\2\u09db\u09d8\3\2\2\2\u09dc\u09df\3\2\2\2\u09dd\u09db\3\2\2\2\u09dd\u09de"+
		"\3\2\2\2\u09de\u011f\3\2\2\2\u09df\u09dd\3\2\2\2\u09e0\u09ea\3\2\2\2\u09e1"+
		"\u09ea\7\26\2\2\u09e2\u09e4\5\20\t\2\u09e3\u09e5\7\26\2\2\u09e4\u09e3"+
		"\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e7\3\2\2\2\u09e6\u09e8\5\20\t\2"+
		"\u09e7\u09e6\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09ea\3\2\2\2\u09e9\u09e0"+
		"\3\2\2\2\u09e9\u09e1\3\2\2\2\u09e9\u09e2\3\2\2\2\u09ea\u0121\3\2\2\2\u09eb"+
		"\u09ec\7\u00b1\2\2\u09ec\u09ed\5\u0132\u009a\2\u09ed\u09ee\5\u0112\u008a"+
		"\2\u09ee\u09ef\7\7\2\2\u09ef\u09f0\5\u012a\u0096\2\u09f0\u09f1\7\b\2\2"+
		"\u09f1\u0a0e\3\2\2\2\u09f2\u09f3\7\u00b1\2\2\u09f3\u09f4\5\u0132\u009a"+
		"\2\u09f4\u09f5\5\u0112\u008a\2\u09f5\u09f6\7\n\2\2\u09f6\u09f7\7\3\2\2"+
		"\u09f7\u09f8\5\36\20\2\u09f8\u09f9\7\4\2\2\u09f9\u0a0e\3\2\2\2\u09fa\u09fb"+
		"\7\u00b1\2\2\u09fb\u09fc\5\u0132\u009a\2\u09fc\u09fd\5\u0112\u008a\2\u09fd"+
		"\u0a0e\3\2\2\2\u09fe\u09ff\5\u0128\u0095\2\u09ff\u0a00\5\u00c4c\2\u0a00"+
		"\u0a01\7\b\2\2\u0a01\u0a0e\3\2\2\2\u0a02\u0a03\7\u00b2\2\2\u0a03\u0a04"+
		"\5\u0132\u009a\2\u0a04\u0a05\5\b\5\2\u0a05\u0a0e\3\2\2\2\u0a06\u0a07\7"+
		"\u00b2\2\2\u0a07\u0a08\5\u0132\u009a\2\u0a08\u0a09\7\n\2\2\u0a09\u0a0a"+
		"\7\3\2\2\u0a0a\u0a0b\5\u0124\u0093\2\u0a0b\u0a0c\7\4\2\2\u0a0c\u0a0e\3"+
		"\2\2\2\u0a0d\u09eb\3\2\2\2\u0a0d\u09f2\3\2\2\2\u0a0d\u09fa\3\2\2\2\u0a0d"+
		"\u09fe\3\2\2\2\u0a0d\u0a02\3\2\2\2\u0a0d\u0a06\3\2\2\2\u0a0e\u0123\3\2"+
		"\2\2\u0a0f\u0a16\3\2\2\2\u0a10\u0a16\5\u0126\u0094\2\u0a11\u0a12\5\u0126"+
		"\u0094\2\u0a12\u0a13\7\6\2\2\u0a13\u0a14\5\u0124\u0093\2\u0a14\u0a16\3"+
		"\2\2\2\u0a15\u0a0f\3\2\2\2\u0a15\u0a10\3\2\2\2\u0a15\u0a11\3\2\2\2\u0a16"+
		"\u0125\3\2\2\2\u0a17\u0a18\5\u0112\u008a\2\u0a18\u0a19\7\n\2\2\u0a19\u0a1a"+
		"\7\3\2\2\u0a1a\u0a1b\5\"\22\2\u0a1b\u0a1c\7\4\2\2\u0a1c\u0a25\3\2\2\2"+
		"\u0a1d\u0a1e\7\65\2\2\u0a1e\u0a1f\7\u0126\2\2\u0a1f\u0a20\7\n\2\2\u0a20"+
		"\u0a21\7\3\2\2\u0a21\u0a22\5\"\22\2\u0a22\u0a23\7\4\2\2\u0a23\u0a25\3"+
		"\2\2\2\u0a24\u0a17\3\2\2\2\u0a24\u0a1d\3\2\2\2\u0a25\u0127\3\2\2\2\u0a26"+
		"\u0a27\7\u00b2\2\2\u0a27\u0a28\5\u0132\u009a\2\u0a28\u0a29\7\n\2\2\u0a29"+
		"\u0a2a\7\7\2\2\u0a2a\u0a31\3\2\2\2\u0a2b\u0a2c\7\u00b2\2\2\u0a2c\u0a2d"+
		"\5\u0132\u009a\2\u0a2d\u0a2e\7#\2\2\u0a2e\u0a2f\7\7\2\2\u0a2f\u0a31\3"+
		"\2\2\2\u0a30\u0a26\3\2\2\2\u0a30\u0a2b\3\2\2\2\u0a31\u0129\3\2\2\2\u0a32"+
		"\u0a38\5\u012c\u0097\2\u0a33\u0a34\5\u012c\u0097\2\u0a34\u0a35\7\6\2\2"+
		"\u0a35\u0a36\5\u012a\u0096\2\u0a36\u0a38\3\2\2\2\u0a37\u0a32\3\2\2\2\u0a37"+
		"\u0a33\3\2\2\2\u0a38\u012b\3\2\2\2\u0a39\u0a3a\5\b\5\2\u0a3a\u0a3b\7\n"+
		"\2\2\u0a3b\u0a3c\5\u0130\u0099\2\u0a3c\u012d\3\2\2\2\u0a3d\u0a3e\t\7\2"+
		"\2\u0a3e\u012f\3\2\2\2\u0a3f\u0a62\5\u012e\u0098\2\u0a40\u0a62\5\20\t"+
		"\2\u0a41\u0a42\7\36\2\2\u0a42\u0a43\7\7\2\2\u0a43\u0a44\5\20\t\2\u0a44"+
		"\u0a45\7\b\2\2\u0a45\u0a62\3\2\2\2\u0a46\u0a62\5\b\5\2\u0a47\u0a48\5\u010e"+
		"\u0088\2\u0a48\u0a49\7\7\2\2\u0a49\u0a4a\7\34\2\2\u0a4a\u0a4b\7\20\2\2"+
		"\u0a4b\u0a4c\5\20\t\2\u0a4c\u0a4d\7\b\2\2\u0a4d\u0a62\3\2\2\2\u0a4e\u0a4f"+
		"\5\u010e\u0088\2\u0a4f\u0a50\7\7\2\2\u0a50\u0a51\7\35\2\2\u0a51\u0a52"+
		"\7\20\2\2\u0a52\u0a53\5\20\t\2\u0a53\u0a54\7\b\2\2\u0a54\u0a62\3\2\2\2"+
		"\u0a55\u0a56\5\u010e\u0088\2\u0a56\u0a57\7\7\2\2\u0a57\u0a58\7\36\2\2"+
		"\u0a58\u0a59\7\20\2\2\u0a59\u0a5a\5\20\t\2\u0a5a\u0a5b\7\b\2\2\u0a5b\u0a62"+
		"\3\2\2\2\u0a5c\u0a5d\5\u010e\u0088\2\u0a5d\u0a5e\7\7\2\2\u0a5e\u0a5f\5"+
		"\20\t\2\u0a5f\u0a60\7\b\2\2\u0a60\u0a62\3\2\2\2\u0a61\u0a3f\3\2\2\2\u0a61"+
		"\u0a40\3\2\2\2\u0a61\u0a41\3\2\2\2\u0a61\u0a46\3\2\2\2\u0a61\u0a47\3\2"+
		"\2\2\u0a61\u0a4e\3\2\2\2\u0a61\u0a55\3\2\2\2\u0a61\u0a5c\3\2\2\2\u0a62"+
		"\u0131\3\2\2\2\u0a63\u0a64\t\b\2\2\u0a64\u0133\3\2\2\2\u0a65\u0a66\t\t"+
		"\2\2\u0a66\u0135\3\2\2\2\u0a67\u0a68\5\u0134\u009b\2\u0a68\u0a69\5\20"+
		"\t\2\u0a69\u0a6a\7\u0126\2\2\u0a6a\u0aaf\3\2\2\2\u0a6b\u0a6c\5\u0134\u009b"+
		"\2\u0a6c\u0a6d\5\20\t\2\u0a6d\u0aaf\3\2\2\2\u0a6e\u0a6f\5\u0134\u009b"+
		"\2\u0a6f\u0a70\5\20\t\2\u0a70\u0a71\7\20\2\2\u0a71\u0a72\5\20\t\2\u0a72"+
		"\u0a73\7\u0126\2\2\u0a73\u0aaf\3\2\2\2\u0a74\u0a75\5\u0134\u009b\2\u0a75"+
		"\u0a76\5\20\t\2\u0a76\u0a77\7\20\2\2\u0a77\u0a78\5\20\t\2\u0a78\u0aaf"+
		"\3\2\2\2\u0a79\u0a7a\5\u0134\u009b\2\u0a7a\u0a7b\5\20\t\2\u0a7b\u0a7c"+
		"\7\20\2\2\u0a7c\u0a7d\5\20\t\2\u0a7d\u0a7e\7\6\2\2\u0a7e\u0a7f\5\20\t"+
		"\2\u0a7f\u0a80\7\u0126\2\2\u0a80\u0aaf\3\2\2\2\u0a81\u0a82\5\u0134\u009b"+
		"\2\u0a82\u0a83\5\20\t\2\u0a83\u0a84\7\20\2\2\u0a84\u0a85\5\20\t\2\u0a85"+
		"\u0a86\7\6\2\2\u0a86\u0a87\5\20\t\2\u0a87\u0aaf\3\2\2\2\u0a88\u0a89\5"+
		"\u0134\u009b\2\u0a89\u0a8a\5\20\t\2\u0a8a\u0a8b\7\6\2\2\u0a8b\u0a8c\5"+
		"\20\t\2\u0a8c\u0a8d\7\20\2\2\u0a8d\u0a8e\5\20\t\2\u0a8e\u0a8f\7\u0126"+
		"\2\2\u0a8f\u0aaf\3\2\2\2\u0a90\u0a91\5\u0134\u009b\2\u0a91\u0a92\5\20"+
		"\t\2\u0a92\u0a93\7\6\2\2\u0a93\u0a94\5\20\t\2\u0a94\u0a95\7\20\2\2\u0a95"+
		"\u0a96\5\20\t\2\u0a96\u0aaf\3\2\2\2\u0a97\u0a98\5\u0134\u009b\2\u0a98"+
		"\u0a99\5\20\t\2\u0a99\u0a9a\7\6\2\2\u0a9a\u0a9b\5\20\t\2\u0a9b\u0a9c\7"+
		"\20\2\2\u0a9c\u0a9d\5\20\t\2\u0a9d\u0a9e\7\6\2\2\u0a9e\u0a9f\5\20\t\2"+
		"\u0a9f\u0aa0\7\u0126\2\2\u0aa0\u0aaf\3\2\2\2\u0aa1\u0aa2\5\u0134\u009b"+
		"\2\u0aa2\u0aa3\5\20\t\2\u0aa3\u0aa4\7\6\2\2\u0aa4\u0aa5\5\20\t\2\u0aa5"+
		"\u0aa6\7\20\2\2\u0aa6\u0aa7\5\20\t\2\u0aa7\u0aa8\7\6\2\2\u0aa8\u0aa9\5"+
		"\20\t\2\u0aa9\u0aaf\3\2\2\2\u0aaa\u0aab\5\u0134\u009b\2\u0aab\u0aac\5"+
		"\20\t\2\u0aac\u0aad\7\u0125\2\2\u0aad\u0aaf\3\2\2\2\u0aae\u0a67\3\2\2"+
		"\2\u0aae\u0a6b\3\2\2\2\u0aae\u0a6e\3\2\2\2\u0aae\u0a74\3\2\2\2\u0aae\u0a79"+
		"\3\2\2\2\u0aae\u0a81\3\2\2\2\u0aae\u0a88\3\2\2\2\u0aae\u0a90\3\2\2\2\u0aae"+
		"\u0a97\3\2\2\2\u0aae\u0aa1\3\2\2\2\u0aae\u0aaa\3\2\2\2\u0aaf\u0137\3\2"+
		"\2\2\u0ab0\u0ab1\7\u00cf\2\2\u0ab1\u0ab2\5\u013a\u009e\2\u0ab2\u0ab3\5"+
		"\16\b\2\u0ab3\u0ab4\5\u013c\u009f\2\u0ab4\u0ab5\5\u013e\u00a0\2\u0ab5"+
		"\u0ab6\5\u00c4c\2\u0ab6\u0ab7\7\b\2\2\u0ab7\u0ab8\5\u013c\u009f\2\u0ab8"+
		"\u0abf\3\2\2\2\u0ab9\u0aba\7\u00cf\2\2\u0aba\u0abb\5\u013a\u009e\2\u0abb"+
		"\u0abc\5\16\b\2\u0abc\u0abd\5\u013c\u009f\2\u0abd\u0abf\3\2\2\2\u0abe"+
		"\u0ab0\3\2\2\2\u0abe\u0ab9\3\2\2\2\u0abf\u0139\3\2\2\2\u0ac0\u0ac5\b\u009e"+
		"\1\2\u0ac1\u0ac2\f\3\2\2\u0ac2\u0ac4\7\u00d0\2\2\u0ac3\u0ac1\3\2\2\2\u0ac4"+
		"\u0ac7\3\2\2\2\u0ac5\u0ac3\3\2\2\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u013b\3\2"+
		"\2\2\u0ac7\u0ac5\3\2\2\2\u0ac8\u0acb\3\2\2\2\u0ac9\u0acb\7\u00a6\2\2\u0aca"+
		"\u0ac8\3\2\2\2\u0aca\u0ac9\3\2\2\2\u0acb\u013d\3\2\2\2\u0acc\u0acd\7\u00d1"+
		"\2\2\u0acd\u0ace\7\n\2\2\u0ace\u0acf\7\7\2\2\u0acf\u013f\3\2\2\2\u0ad0"+
		"\u0ad4\7\u00d2\2\2\u0ad1\u0ad3\5\u0142\u00a2\2\u0ad2\u0ad1\3\2\2\2\u0ad3"+
		"\u0ad6\3\2\2\2\u0ad4\u0ad5\3\2\2\2\u0ad4\u0ad2\3\2\2\2\u0ad5\u0ad7\3\2"+
		"\2\2\u0ad6\u0ad4\3\2\2\2\u0ad7\u0ad8\5\16\b\2\u0ad8\u0141\3\2\2\2\u0ad9"+
		"\u0ae4\7e\2\2\u0ada\u0ae4\7f\2\2\u0adb\u0ae4\7g\2\2\u0adc\u0add\7\u00dc"+
		"\2\2\u0add\u0ae4\7\u00dd\2\2\u0ade\u0ae4\7~\2\2\u0adf\u0ae4\7\u00de\2"+
		"\2\u0ae0\u0ae4\7\u00df\2\2\u0ae1\u0ae4\7\u00e0\2\2\u0ae2\u0ae4\7\u00e1"+
		"\2\2\u0ae3\u0ad9\3\2\2\2\u0ae3\u0ada\3\2\2\2\u0ae3\u0adb\3\2\2\2\u0ae3"+
		"\u0adc\3\2\2\2\u0ae3\u0ade\3\2\2\2\u0ae3\u0adf\3\2\2\2\u0ae3\u0ae0\3\2"+
		"\2\2\u0ae3\u0ae1\3\2\2\2\u0ae3\u0ae2\3\2\2\2\u0ae4\u0143\3\2\2\2\u0ae5"+
		"\u0aea\b\u00a3\1\2\u0ae6\u0ae7\f\3\2\2\u0ae7\u0ae9\5\u0146\u00a4\2\u0ae8"+
		"\u0ae6\3\2\2\2\u0ae9\u0aec\3\2\2\2\u0aea\u0ae8\3\2\2\2\u0aea\u0aeb\3\2"+
		"\2\2\u0aeb\u0145\3\2\2\2\u0aec\u0aea\3\2\2\2\u0aed\u0aee\7\u00d1\2\2\u0aee"+
		"\u0aef\7\u00d5\2\2\u0aef\u0af3\5\20\t\2\u0af0\u0af3\5\u0122\u0092\2\u0af1"+
		"\u0af3\5\u014a\u00a6\2\u0af2\u0aed\3\2\2\2\u0af2\u0af0\3\2\2\2\u0af2\u0af1"+
		"\3\2\2\2\u0af3\u0147\3\2\2\2\u0af4\u0af7\5\20\t\2\u0af5\u0af7\7\21\2\2"+
		"\u0af6\u0af4\3\2\2\2\u0af6\u0af5\3\2\2\2\u0af7\u0149\3\2\2\2\u0af8\u0af9"+
		"\5\u014c\u00a7\2\u0af9\u0afa\5\u00c4c\2\u0afa\u0afb\7\b\2\2\u0afb\u0b0e"+
		"\3\2\2\2\u0afc\u0afd\7\u00d6\2\2\u0afd\u0afe\5\u0148\u00a5\2\u0afe\u0aff"+
		"\7\20\2\2\u0aff\u0b00\5\u0148\u00a5\2\u0b00\u0b01\7\20\2\2\u0b01\u0b02"+
		"\5\u0148\u00a5\2\u0b02\u0b03\7\20\2\2\u0b03\u0b04\5\u0148\u00a5\2\u0b04"+
		"\u0b0e\3\2\2\2\u0b05\u0b06\7\u00d7\2\2\u0b06\u0b0e\5\b\5\2\u0b07\u0b08"+
		"\5\u0150\u00a9\2\u0b08\u0b09\5\u00c4c\2\u0b09\u0b0a\7\b\2\2\u0b0a\u0b0e"+
		"\3\2\2\2\u0b0b\u0b0e\5&\24\2\u0b0c\u0b0e\5\30\r\2\u0b0d\u0af8\3\2\2\2"+
		"\u0b0d\u0afc\3\2\2\2\u0b0d\u0b05\3\2\2\2\u0b0d\u0b07\3\2\2\2\u0b0d\u0b0b"+
		"\3\2\2\2\u0b0d\u0b0c\3\2\2\2\u0b0e\u014b\3\2\2\2\u0b0f\u0b10\7\u00d3\2"+
		"\2\u0b10\u0b11\7\n\2\2\u0b11\u0b12\7\7\2\2\u0b12\u014d\3\2\2\2\u0b13\u0b14"+
		"\7\u00d4\2\2\u0b14\u0b15\7\n\2\2\u0b15\u0b16\7\7\2\2\u0b16\u014f\3\2\2"+
		"\2\u0b17\u0b18\7\u00d7\2\2\u0b18\u0b19\7\n\2\2\u0b19\u0b1a\7\7\2\2\u0b1a"+
		"\u0151\3\2\2\2\u0b1b\u0b1c\7\u00d2\2\2\u0b1c\u0b20\7\u00d8\2\2\u0b1d\u0b1f"+
		"\5\u0142\u00a2\2\u0b1e\u0b1d\3\2\2\2\u0b1f\u0b22\3\2\2\2\u0b20\u0b21\3"+
		"\2\2\2\u0b20\u0b1e\3\2\2\2\u0b21\u0b23\3\2\2\2\u0b22\u0b20\3\2\2\2\u0b23"+
		"\u0b26\5\16\b\2\u0b24\u0b25\7\u0088\2\2\u0b25\u0b27\5\16\b\2\u0b26\u0b24"+
		"\3\2\2\2\u0b26\u0b27\3\2\2\2\u0b27\u0153\3\2\2\2\u0b28\u0b2d\b\u00ab\1"+
		"\2\u0b29\u0b2a\f\3\2\2\u0b2a\u0b2c\5\u0156\u00ac\2\u0b2b\u0b29\3\2\2\2"+
		"\u0b2c\u0b2f\3\2\2\2\u0b2d\u0b2b\3\2\2\2\u0b2d\u0b2e\3\2\2\2\u0b2e\u0155"+
		"\3\2\2\2\u0b2f\u0b2d\3\2\2\2\u0b30\u0b31\5\u013e\u00a0\2\u0b31\u0b32\5"+
		"\u00c4c\2\u0b32\u0b33\7\b\2\2\u0b33\u0b3b\3\2\2\2\u0b34\u0b3b\5\u014a"+
		"\u00a6\2\u0b35\u0b36\5\u014e\u00a8\2\u0b36\u0b37\5\u00c4c\2\u0b37\u0b38"+
		"\7\b\2\2\u0b38\u0b3b\3\2\2\2\u0b39\u0b3b\7U\2\2\u0b3a\u0b30\3\2\2\2\u0b3a"+
		"\u0b34\3\2\2\2\u0b3a\u0b35\3\2\2\2\u0b3a\u0b39\3\2\2\2\u0b3b\u0157\3\2"+
		"\2\2\u0b3c\u0b3d\7\u009a\2\2\u0b3d\u0b3e\7\u00d8\2\2\u0b3e\u0b3f\5\u015c"+
		"\u00af\2\u0b3f\u0b40\5\16\b\2\u0b40\u0159\3\2\2\2\u0b41\u0b42\7\u00db"+
		"\2\2\u0b42\u0b43\5\u015c\u00af\2\u0b43\u0b44\5\16\b\2\u0b44\u015b\3\2"+
		"\2\2\u0b45\u0b55\7M\2\2\u0b46\u0b55\7L\2\2\u0b47\u0b55\7J\2\2\u0b48\u0b49"+
		"\7S\2\2\u0b49\u0b55\7L\2\2\u0b4a\u0b4b\7S\2\2\u0b4b\u0b55\7M\2\2\u0b4c"+
		"\u0b4d\7S\2\2\u0b4d\u0b55\7N\2\2\u0b4e\u0b4f\7S\2\2\u0b4f\u0b55\7p\2\2"+
		"\u0b50\u0b51\7S\2\2\u0b51\u0b55\7q\2\2\u0b52\u0b53\7S\2\2\u0b53\u0b55"+
		"\7r\2\2\u0b54\u0b45\3\2\2\2\u0b54\u0b46\3\2\2\2\u0b54\u0b47\3\2\2\2\u0b54"+
		"\u0b48\3\2\2\2\u0b54\u0b4a\3\2\2\2\u0b54\u0b4c\3\2\2\2\u0b54\u0b4e\3\2"+
		"\2\2\u0b54\u0b50\3\2\2\2\u0b54\u0b52\3\2\2\2\u0b55\u0b58\3\2\2\2\u0b56"+
		"\u0b54\3\2\2\2\u0b56\u0b57\3\2\2\2\u0b57\u015d\3\2\2\2\u0b58\u0b56\3\2"+
		"\2\2\u0b59\u0b5e\b\u00b0\1\2\u0b5a\u0b5b\f\3\2\2\u0b5b\u0b5d\5\u0160\u00b1"+
		"\2\u0b5c\u0b5a\3\2\2\2\u0b5d\u0b60\3\2\2\2\u0b5e\u0b5c\3\2\2\2\u0b5e\u0b5f"+
		"\3\2\2\2\u0b5f\u015f\3\2\2\2\u0b60\u0b5e\3\2\2\2\u0b61\u0b62\7\u00cf\2"+
		"\2\u0b62\u0b73\5\16\b\2\u0b63\u0b64\7\u009a\2\2\u0b64\u0b65\7\u00d8\2"+
		"\2\u0b65\u0b73\5\u0110\u0089\2\u0b66\u0b67\7\u00d2\2\2\u0b67\u0b68\7\u00d8"+
		"\2\2\u0b68\u0b73\5\16\b\2\u0b69\u0b6a\7+\2\2\u0b6a\u0b6b\7\7\2\2\u0b6b"+
		"\u0b6c\5\20\t\2\u0b6c\u0b6d\7\b\2\2\u0b6d\u0b73\3\2\2\2\u0b6e\u0b6f\7"+
		"\u009a\2\2\u0b6f\u0b73\5\20\t\2\u0b70\u0b73\5&\24\2\u0b71\u0b73\5\30\r"+
		"\2\u0b72\u0b61\3\2\2\2\u0b72\u0b63\3\2\2\2\u0b72\u0b66\3\2\2\2\u0b72\u0b69"+
		"\3\2\2\2\u0b72\u0b6e\3\2\2\2\u0b72\u0b70\3\2\2\2\u0b72\u0b71\3\2\2\2\u0b73"+
		"\u0161\3\2\2\2\u0b74\u0b75\7\u00d9\2\2\u0b75\u0b76\5\u0164\u00b3\2\u0b76"+
		"\u0b77\5\16\b\2\u0b77\u0b7f\3\2\2\2\u0b78\u0b79\7\u00d9\2\2\u0b79\u0b7a"+
		"\5\u0164\u00b3\2\u0b7a\u0b7b\5\16\b\2\u0b7b\u0b7c\7\u0088\2\2\u0b7c\u0b7d"+
		"\5\16\b\2\u0b7d\u0b7f\3\2\2\2\u0b7e\u0b74\3\2\2\2\u0b7e\u0b78\3\2\2\2"+
		"\u0b7f\u0163\3\2\2\2\u0b80\u0b87\b\u00b3\1\2\u0b81\u0b82\f\4\2\2\u0b82"+
		"\u0b86\7L\2\2\u0b83\u0b84\f\3\2\2\u0b84\u0b86\7M\2\2\u0b85\u0b81\3\2\2"+
		"\2\u0b85\u0b83\3\2\2\2\u0b86\u0b89\3\2\2\2\u0b87\u0b85\3\2\2\2\u0b87\u0b88"+
		"\3\2\2\2\u0b88\u0165\3\2\2\2\u0b89\u0b87\3\2\2\2\u0b8a\u0b8f\b\u00b4\1"+
		"\2\u0b8b\u0b8c\f\3\2\2\u0b8c\u0b8e\5\u0168\u00b5\2\u0b8d\u0b8b\3\2\2\2"+
		"\u0b8e\u0b91\3\2\2\2\u0b8f\u0b8d\3\2\2\2\u0b8f\u0b90\3\2\2\2\u0b90\u0167"+
		"\3\2\2\2\u0b91\u0b8f\3\2\2\2\u0b92\u0b93\7\u00cf\2\2\u0b93\u0b94\5\16"+
		"\b\2\u0b94\u0b95\7@\2\2\u0b95\u0b96\5\20\t\2\u0b96\u0b9d\3\2\2\2\u0b97"+
		"\u0b98\7\u00d2\2\2\u0b98\u0b99\7\u00d8\2\2\u0b99\u0b9d\5\16\b\2\u0b9a"+
		"\u0b9d\5&\24\2\u0b9b\u0b9d\5\30\r\2\u0b9c\u0b92\3\2\2\2\u0b9c\u0b97\3"+
		"\2\2\2\u0b9c\u0b9a\3\2\2\2\u0b9c\u0b9b\3\2\2\2\u0b9d\u0169\3\2\2\2\u00a5"+
		"\u016d\u01b0\u01b6\u01c0\u01cf\u01d5\u01e6\u01f5\u020a\u0211\u0220\u0224"+
		"\u022b\u022d\u0237\u0239\u0249\u0250\u0259\u026e\u0270\u02ca\u02cc\u02d1"+
		"\u02d6\u02db\u02e6\u02eb\u02f5\u02fd\u0305\u0310\u0315\u031d\u038a\u03bb"+
		"\u03bd\u03c3\u03c8\u03cf\u03d6\u03db\u03e4\u03ed\u03f3\u0408\u0413\u041a"+
		"\u041c\u0424\u0433\u0444\u0446\u044e\u045b\u0465\u046c\u04ac\u04b0\u04b5"+
		"\u04b7\u04e5\u04e7\u04ed\u0501\u0503\u0529\u052b\u0533\u053d\u0549\u0557"+
		"\u0563\u056d\u0577\u057f\u0589\u058b\u059a\u05a6\u05b4\u05bf\u05d5\u05e1"+
		"\u05e6\u05ed\u05f4\u05fb\u063c\u06a0\u06a7\u06b0\u06b6\u0770\u0777\u0779"+
		"\u0781\u0783\u078b\u0793\u079b\u07a3\u07ab\u07b3\u07b5\u07c0\u07c2\u07ca"+
		"\u0839\u0846\u084d\u0851\u085b\u0860\u086a\u0877\u0892\u089c\u08aa\u0909"+
		"\u0922\u0924\u092e\u0963\u096c\u096e\u0998\u09b9\u09bb\u09d3\u09dd\u09e4"+
		"\u09e7\u09e9\u0a0d\u0a15\u0a24\u0a30\u0a37\u0a61\u0aae\u0abe\u0ac5\u0aca"+
		"\u0ad4\u0ae3\u0aea\u0af2\u0af6\u0b0d\u0b20\u0b26\u0b2d\u0b3a\u0b54\u0b56"+
		"\u0b5e\u0b72\u0b7e\u0b85\u0b87\u0b8f\u0b9c";
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
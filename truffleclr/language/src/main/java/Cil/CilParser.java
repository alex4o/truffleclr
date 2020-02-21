// Generated from /home/alex4o/Projects/truffleclr/truffleclr/Cil.g4 by ANTLR 4.8
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
	static {
		RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, DCOLON=21, ELIPSIS=22, K_VOID=23, K_BOOL=24, 
		K_CHAR=25, K_UNSIGNED=26, K_INT=27, K_INT8=28, K_INT16=29, K_INT32=30, 
		K_INT64=31, K_FLOAT=32, K_FLOAT32=33, K_FLOAT64=34, K_BYTEARRAY=35, K_UINT=36, 
		K_UINT8=37, K_UINT16=38, K_UINT32=39, K_UINT64=40, K_FLAGS=41, K_CALLCONV=42, 
		K_MDTOKEN=43, K_OBJECT=44, K_STRING=45, K_NULLREF=46, K_DEFAULT=47, K_CDECL=48, 
		K_VARARG=49, K_STDCALL=50, K_THISCALL=51, K_FASTCALL=52, K_CLASS=53, K_TYPEDREF=54, 
		K_UNMANAGED=55, K_FINALLY=56, K_HANDLER=57, K_CATCH=58, K_FILTER=59, K_FAULT=60, 
		K_EXTENDS=61, K_IMPLEMENTS=62, K_TO=63, K_AT=64, K_TLS=65, K_TRUE=66, 
		K_FALSE=67, D_INTERFACEIMPL=68, K_VALUE=69, K_VALUETYPE=70, K_NATIVE=71, 
		K_INSTANCE=72, K_SPECIALNAME=73, K_FORWARDER=74, K_STATIC=75, K_PUBLIC=76, 
		K_PRIVATE=77, K_FAMILY=78, K_FINAL=79, K_SYNCHRONIZED=80, K_INTERFACE=81, 
		K_SEALED=82, K_NESTED=83, K_ABSTRACT=84, K_AUTO=85, K_SEQUENTIAL=86, K_EXPLICIT=87, 
		K_ANSI=88, K_UNICODE=89, K_AUTOCHAR=90, K_IMPORT=91, K_ENUM=92, K_VIRTUAL=93, 
		K_NOINLINING=94, K_AGGRESSIVEINLINING=95, K_NOOPTIMIZATION=96, K_AGGRESSIVEOPTIMIZATION=97, 
		K_UNMANAGEDEXP=98, K_BEFOREFIELDINIT=99, K_STRICT=100, K_RETARGETABLE=101, 
		K_WINDOWSRUNTIME=102, K_NOPLATFORM=103, K_METHOD=104, K_FIELD=105, K_PINNED=106, 
		K_MODREQ=107, K_MODOPT=108, K_SERIALIZABLE=109, K_PROPERTY=110, K_TYPE=111, 
		K_ASSEMBLY=112, K_FAMANDASSEM=113, K_FAMORASSEM=114, K_PRIVATESCOPE=115, 
		K_HIDEBYSIG=116, K_NEWSLOT=117, K_RTSPECIALNAME=118, K_PINVOKEIMPL=119, 
		D_CTOR=120, D_CCTOR=121, K_LITERAL=122, K_NOTSERIALIZED=123, K_INITONLY=124, 
		K_REQSECOBJ=125, K_CIL=126, K_OPTIL=127, K_MANAGED=128, K_FORWARDREF=129, 
		K_PRESERVESIG=130, K_RUNTIME=131, K_INTERNALCALL=132, K_NOMANGLE=133, 
		K_LASTERR=134, K_WINAPI=135, K_AS=136, K_BESTFIT=137, K_ON=138, K_OFF=139, 
		K_CHARMAPERROR=140, INSTR_NONE=141, INSTR_VAR=142, INSTR_I=143, INSTR_I8=144, 
		INSTR_R=145, INSTR_METHOD=146, INSTR_SIG=147, INSTR_BRTARGET=148, INSTR_SWITCH=149, 
		INSTR_TYPE=150, INSTR_STRING=151, INSTR_FIELD=152, INSTR_TOK=153, D_CLASS=154, 
		D_NAMESPACE=155, D_METHOD=156, D_FIELD=157, D_DATA=158, D_THIS=159, D_BASE=160, 
		D_NESTER=161, D_EMITBYTE=162, D_TRY=163, D_MAXSTACK=164, D_LOCALS=165, 
		D_ENTRYPOINT=166, D_ZEROINIT=167, D_EVENT=168, D_ADDON=169, D_REMOVEON=170, 
		D_FIRE=171, D_OTHER=172, D_PROPERTY=173, D_SET=174, D_GET=175, D_DEFAULT=176, 
		D_PERMISSION=177, D_PERMISSIONSET=178, K_REQUEST=179, K_DEMAND=180, K_ASSERT=181, 
		K_DENY=182, K_PERMITONLY=183, K_LINKCHECK=184, K_INHERITCHECK=185, K_REQMIN=186, 
		K_REQOPT=187, K_REQREFUSE=188, K_PREJITGRANT=189, K_PREJITDENY=190, K_NONCASDEMAND=191, 
		K_NONCASLINKDEMAND=192, K_NONCASINHERITANCE=193, D_LINE=194, P_LINE=195, 
		D_LANGUAGE=196, D_CUSTOM=197, K_INIT=198, D_SIZE=199, D_PACK=200, D_VTABLE=201, 
		D_VTFIXUP=202, K_FROMUNMANAGED=203, K_CALLMOSTDERIVED=204, D_VTENTRY=205, 
		K_RETAINAPPDOMAIN=206, D_FILE=207, K_NOMETADATA=208, D_HASH=209, D_ASSEMBLY=210, 
		D_PUBLICKEY=211, D_PUBLICKEYTOKEN=212, K_ALGORITHM=213, D_VER=214, D_LOCALE=215, 
		K_EXTERN=216, D_MRESOURCE=217, D_MODULE=218, D_EXPORT=219, K_LEGACY=220, 
		K_LIBRARY=221, K_X86=222, K_AMD64=223, K_ARM=224, K_ARM64=225, K_MARSHAL=226, 
		K_CUSTOM=227, K_SYSSTRING=228, K_FIXED=229, K_VARIANT=230, K_CURRENCY=231, 
		K_SYSCHAR=232, K_DECIMAL=233, K_DATE=234, K_BSTR=235, K_TBSTR=236, K_LPSTR=237, 
		K_LPWSTR=238, K_LPTSTR=239, K_OBJECTREF=240, K_IUNKNOWN=241, K_IDISPATCH=242, 
		K_STRUCT=243, K_SAFEARRAY=244, K_BYVALSTR=245, K_LPVOID=246, K_ANY=247, 
		K_ARRAY=248, K_LPSTRUCT=249, K_IIDPARAM=250, K_IN=251, K_OUT=252, K_OPT=253, 
		D_PARAM=254, D_OVERRIDE=255, K_WITH=256, K_NULL=257, K_HRESULT=258, K_CARRAY=259, 
		K_USERDEFINED=260, K_RECORD=261, K_FILETIME=262, K_BLOB=263, K_STREAM=264, 
		K_STORAGE=265, K_STREAMED_OBJECT=266, K_STORED_OBJECT=267, K_BLOB_OBJECT=268, 
		K_CF=269, K_CLSID=270, K_VECTOR=271, D_SUBSYSTEM=272, D_CORFLAGS=273, 
		K_ALIGNMENT=274, D_IMAGEBASE=275, D_STACKRESERVE=276, D_TYPEDEF=277, D_TEMPLATE=278, 
		D_TYPELIST=279, D_MSCORLIB=280, P_DEFINE=281, P_UNDEF=282, P_IFDEF=283, 
		P_IFNDEF=284, P_ELSE=285, P_ENDIF=286, P_INCLUDE=287, K_CONSTRAINT=288, 
		WS=289, LINE_COMMENT=290, DOT=291, K_ERROR=292, QSTRING=293, SQSTRING=294, 
		ID=295, DOTTEDNAME=296, INT64=297, FLOAT64=298, HEXBYTE=299, TYPEDEFT=300, 
		TYPEDEFTS=301, TYPEDEFMR=302;
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
		RULE_propDecls = 61, RULE_propDecl = 62, RULE_marshalClause = 63, RULE_marshalBlob = 64, 
		RULE_marshalBlobHead = 65, RULE_methodHead = 66, RULE_methAttr = 67, RULE_pinvAttr = 68, 
		RULE_methodName = 69, RULE_paramAttr = 70, RULE_implAttr = 71, RULE_localsHead = 72, 
		RULE_methodDecls = 73, RULE_methodDecl = 74, RULE_scopeBlock = 75, RULE_scopeOpen = 76, 
		RULE_sehBlock = 77, RULE_sehClauses = 78, RULE_tryBlock = 79, RULE_sehClause = 80, 
		RULE_filterClause = 81, RULE_filterHead = 82, RULE_catchClause = 83, RULE_finallyClause = 84, 
		RULE_faultClause = 85, RULE_handlerBlock = 86, RULE_dataDecl = 87, RULE_ddHead = 88, 
		RULE_tls = 89, RULE_ddBody = 90, RULE_ddItemList = 91, RULE_ddItemCount = 92, 
		RULE_ddItem = 93, RULE_fieldSerInit = 94, RULE_bytearrayhead = 95, RULE_bytes = 96, 
		RULE_fieldInit = 97, RULE_serInit = 98, RULE_f32seq = 99, RULE_f64seq = 100, 
		RULE_i64seq = 101, RULE_i32seq = 102, RULE_i16seq = 103, RULE_i8seq = 104, 
		RULE_boolSeq = 105, RULE_sqstringSeq = 106, RULE_classSeq = 107, RULE_objSeq = 108, 
		RULE_methodSpec = 109, RULE_instr_none = 110, RULE_instr_var = 111, RULE_instr_i = 112, 
		RULE_instr_i8 = 113, RULE_instr_r = 114, RULE_instr_brtarget = 115, RULE_instr_method = 116, 
		RULE_instr_field = 117, RULE_instr_type = 118, RULE_instr_string = 119, 
		RULE_instr_sig = 120, RULE_instr_tok = 121, RULE_instr_switch = 122, RULE_instr = 123, 
		RULE_labels = 124, RULE_tyArgs0 = 125, RULE_tyArgs1 = 126, RULE_tyArgs2 = 127, 
		RULE_sigArgs0 = 128, RULE_sigArgs1 = 129, RULE_sigArg = 130, RULE_className = 131, 
		RULE_slashedName = 132, RULE_typeSpec = 133, RULE_nativeType = 134, RULE_iidParamIndex = 135, 
		RULE_variantType = 136, RULE_type = 137, RULE_simpleType = 138, RULE_bounds1 = 139, 
		RULE_bound = 140, RULE_secDecl = 141, RULE_secAttrSetBlob = 142, RULE_secAttrBlob = 143, 
		RULE_psetHead = 144, RULE_nameValPairs = 145, RULE_nameValPair = 146, 
		RULE_truefalse = 147, RULE_caValue = 148, RULE_secAction = 149, RULE_esHead = 150, 
		RULE_extSourceSpec = 151, RULE_fileDecl = 152, RULE_fileAttr = 153, RULE_fileEntry = 154, 
		RULE_hashHead = 155, RULE_assemblyHead = 156, RULE_asmAttr = 157, RULE_assemblyDecls = 158, 
		RULE_assemblyDecl = 159, RULE_intOrWildcard = 160, RULE_asmOrRefDecl = 161, 
		RULE_publicKeyHead = 162, RULE_publicKeyTokenHead = 163, RULE_localeHead = 164, 
		RULE_assemblyRefHead = 165, RULE_assemblyRefDecls = 166, RULE_assemblyRefDecl = 167, 
		RULE_exptypeHead = 168, RULE_exportHead = 169, RULE_exptAttr = 170, RULE_exptypeDecls = 171, 
		RULE_exptypeDecl = 172, RULE_manifestResHead = 173, RULE_manresAttr = 174, 
		RULE_manifestResDecls = 175, RULE_manifestResDecl = 176;
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
			"propDecls", "propDecl", "marshalClause", "marshalBlob", "marshalBlobHead", 
			"methodHead", "methAttr", "pinvAttr", "methodName", "paramAttr", "implAttr", 
			"localsHead", "methodDecls", "methodDecl", "scopeBlock", "scopeOpen", 
			"sehBlock", "sehClauses", "tryBlock", "sehClause", "filterClause", "filterHead", 
			"catchClause", "finallyClause", "faultClause", "handlerBlock", "dataDecl", 
			"ddHead", "tls", "ddBody", "ddItemList", "ddItemCount", "ddItem", "fieldSerInit", 
			"bytearrayhead", "bytes", "fieldInit", "serInit", "f32seq", "f64seq", 
			"i64seq", "i32seq", "i16seq", "i8seq", "boolSeq", "sqstringSeq", "classSeq", 
			"objSeq", "methodSpec", "instr_none", "instr_var", "instr_i", "instr_i8", 
			"instr_r", "instr_brtarget", "instr_method", "instr_field", "instr_type", 
			"instr_string", "instr_sig", "instr_tok", "instr_switch", "instr", "labels", 
			"tyArgs0", "tyArgs1", "tyArgs2", "sigArgs0", "sigArgs1", "sigArg", "className", 
			"slashedName", "typeSpec", "nativeType", "iidParamIndex", "variantType", 
			"type", "simpleType", "bounds1", "bound", "secDecl", "secAttrSetBlob", 
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
			"']'", "'<'", "'>'", "'-'", "'requiresecobj'", "':'", "'*'", "'&'", "'/'", 
			"'!'", "'!(null)'", "'::'", "'...'", "'void'", "'bool'", "'char'", "'unsigned'", 
			"'int'", "'int8'", "'int16'", "'int32'", "'int64'", "'float'", null, 
			null, "'bytearray'", "'uint'", "'uint8'", "'uin16'", "'uint32'", "'uint64'", 
			"'flags'", "'callconv'", "'mdtoken'", "'object'", "'string'", "'nullref'", 
			"'default'", "'cdecl'", "'vararg'", "'stdcall'", "'thiscall'", "'fastcall'", 
			"'class'", "'typedref'", "'unmangled'", "'finally'", "'handler'", "'catch'", 
			"'filter'", "'fault'", "'extends'", "'implements'", "'to'", "'at'", "'tls'", 
			"'true'", "'false'", "'.interfaceimpl'", "'value'", "'valuetype'", "'native'", 
			"'instance'", "'specialname'", "'forwarder'", "'static'", "'public'", 
			"'private'", "'family'", "'final'", "'synchronized'", "'interface'", 
			"'sealed'", "'nested'", "'abstract'", "'auto'", "'sequential'", "'explicit'", 
			"'ansi'", "'unicode'", "'autochar'", "'import'", "'enum'", "'virtual'", 
			"'noinlining'", "'agressive-inlining'", "'nooptimization'", "'agressiveoptimization'", 
			"'unmanagedexp'", "'beforefieldinit'", "'strict'", "'retargetable'", 
			"'windowsruntime'", "'noplatform'", "'method'", "'field'", "'pinned'", 
			"'modreq'", "'modopt'", "'serializable'", "'property'", "'type'", "'assembly'", 
			"'famandassem'", "'famorassem'", "'privatescope'", "'hidebysig'", "'newslot'", 
			"'rtspecialname'", "'pinvokeimpl'", null, null, "'literal'", "'notserialized'", 
			"'initonly'", "'reqsecobj'", "'cil'", "'optil'", "'managed'", "'forwardref'", 
			"'preservesig'", "'runtime'", "'internalcall'", "'nomangle'", "'lasterr'", 
			"'winapi'", "'as'", "'bestfit'", "'on'", "'off'", "'charmaperror'", null, 
			null, null, "'ldc.i8'", null, null, "'calli'", null, "'switch'", null, 
			"'ldstr'", null, "'ldtoken'", "'.class'", "'.namespace'", "'.method'", 
			"'.field'", "'.data'", "'.this'", "'.base'", "'.nester'", "'.emitbyte'", 
			"'.try'", "'.maxstack'", "'.locals'", "'.entrypoint'", "'.zeroinit'", 
			"'.event'", "'.addon'", "'.removeon'", "'.fire'", "'.other'", "'.property'", 
			"'.set'", "'.get'", "'.default'", "'.permission'", "'.permissionset'", 
			"'request'", "'demand'", "'assert'", "'deny'", "'permitonly'", "'linkcheck'", 
			"'inheritcheck'", "'reqmin'", "'reqopt'", "'reqrefuse'", "'prejitgrant'", 
			"'prejitdeny'", "'noncasdemand'", "'noncaslinkdemand'", "'noncasinheritance'", 
			"'.line'", "'line'", "'.language'", "'.custom'", "'init'", "'.size'", 
			"'.pack'", "'.vtable'", "'.vtfixup'", "'fromunmanaged'", "'callmostderived'", 
			"'.vtentry'", "'retainappdomain'", "'.file'", "'nometadata'", "'.hash'", 
			"'.assembly'", "'.publickey'", "'.publickeytoken'", "'algorithm'", "'.ver'", 
			"'.locale'", "'extern'", "'.mresource'", "'.module'", "'.export'", "'legacy'", 
			"'library'", "'x86'", "'amd64'", "'arm'", "'arm64'", "'marshal'", "'custom'", 
			"'sysstring'", "'fixed'", "'variant'", "'currency'", "'syschar'", "'decimal'", 
			"'date'", "'bstr'", "'tbstr'", "'lpstr'", "'lpwstr'", "'lptstr'", "'objectref'", 
			"'iunknown'", "'idispatch'", "'struct'", "'safearray'", "'byvalstr'", 
			"'lpvoid'", "'any'", "'array'", "'lpstruct'", "'iidparam'", "'in'", "'out'", 
			"'opt'", "'.param'", "'.override'", "'with'", "'null'", "'hresult'", 
			"'carray'", "'userdefined'", "'record'", "'filetime'", "'blob'", "'stream'", 
			"'storage'", "'streamedobject'", "'storedobject'", "'blobobject'", "'cf'", 
			"'clsid'", "'vector'", "'.subsystem'", "'.corflags'", "'alignment'", 
			"'.imagebase'", "'.stackreserve'", "'.typedef'", "'.template'", "'.typelist'", 
			"'.mscorlib'", "'define'", "'undef'", "'ifdef'", "'ifndef'", "'else'", 
			"'endif'", "'include'", "'constraint'", null, null, "'.'", "'error'", 
			null, null, null, null, null, null, null, null, "'TypeSpec'", "'MemberRef'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "DCOLON", "ELIPSIS", 
			"K_VOID", "K_BOOL", "K_CHAR", "K_UNSIGNED", "K_INT", "K_INT8", "K_INT16", 
			"K_INT32", "K_INT64", "K_FLOAT", "K_FLOAT32", "K_FLOAT64", "K_BYTEARRAY", 
			"K_UINT", "K_UINT8", "K_UINT16", "K_UINT32", "K_UINT64", "K_FLAGS", "K_CALLCONV", 
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
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & ((1L << (D_CLASS - 154)) | (1L << (D_NAMESPACE - 154)) | (1L << (D_METHOD - 154)) | (1L << (D_FIELD - 154)) | (1L << (D_DATA - 154)) | (1L << (D_PERMISSION - 154)) | (1L << (D_PERMISSIONSET - 154)) | (1L << (D_LINE - 154)) | (1L << (P_LINE - 154)) | (1L << (D_LANGUAGE - 154)) | (1L << (D_CUSTOM - 154)) | (1L << (D_VTABLE - 154)) | (1L << (D_VTFIXUP - 154)) | (1L << (D_FILE - 154)) | (1L << (D_ASSEMBLY - 154)) | (1L << (D_MRESOURCE - 154)))) != 0) || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (D_MODULE - 218)) | (1L << (D_SUBSYSTEM - 218)) | (1L << (D_CORFLAGS - 218)) | (1L << (D_IMAGEBASE - 218)) | (1L << (D_STACKRESERVE - 218)) | (1L << (D_TYPEDEF - 218)) | (1L << (D_TYPELIST - 218)) | (1L << (D_MSCORLIB - 218)) | (1L << (P_DEFINE - 218)))) != 0) || ((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & ((1L << (P_UNDEF - 282)) | (1L << (P_IFDEF - 282)) | (1L << (P_IFNDEF - 282)) | (1L << (P_ELSE - 282)) | (1L << (P_ENDIF - 282)) | (1L << (P_INCLUDE - 282)))) != 0)) {
				{
				{
				setState(354);
				decl();
				}
				}
				setState(359);
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
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				classHead();
				setState(361);
				match(T__0);
				setState(362);
				classDecls();
				setState(363);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new NamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				nameSpaceHead();
				setState(366);
				match(T__0);
				setState(367);
				decls();
				setState(368);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				methodHead();
				setState(371);
				match(T__0);
				setState(372);
				methodDecls();
				setState(373);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new FieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				fieldDecl();
				}
				break;
			case 5:
				_localctx = new DataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				dataDecl();
				}
				break;
			case 6:
				_localctx = new VtableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(377);
				vtableDecl();
				}
				break;
			case 7:
				_localctx = new VtfixupContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(378);
				vtfixupDecl();
				}
				break;
			case 8:
				_localctx = new ExtsourceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(379);
				extSourceSpec();
				}
				break;
			case 9:
				_localctx = new FileContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(380);
				fileDecl();
				}
				break;
			case 10:
				_localctx = new AssemblyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(381);
				assemblyHead();
				setState(382);
				match(T__0);
				setState(383);
				assemblyDecls();
				setState(384);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new AssemblyReferanceContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(386);
				assemblyRefHead();
				setState(387);
				match(T__0);
				setState(388);
				assemblyRefDecls();
				setState(389);
				match(T__1);
				}
				break;
			case 12:
				_localctx = new ExptypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(391);
				exptypeHead();
				setState(392);
				match(T__0);
				setState(393);
				exptypeDecls();
				setState(394);
				match(T__1);
				}
				break;
			case 13:
				_localctx = new ManifestContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(396);
				manifestResHead();
				setState(397);
				match(T__0);
				setState(398);
				manifestResDecls();
				setState(399);
				match(T__1);
				}
				break;
			case 14:
				_localctx = new ModuleContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(401);
				moduleHead();
				}
				break;
			case 15:
				_localctx = new SecurityContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(402);
				secDecl();
				}
				break;
			case 16:
				_localctx = new CustomContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(403);
				customAttrDecl();
				}
				break;
			case 17:
				_localctx = new SystemContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(404);
				match(D_SUBSYSTEM);
				setState(405);
				int32();
				}
				break;
			case 18:
				_localctx = new CorflagsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(406);
				match(D_CORFLAGS);
				setState(407);
				int32();
				}
				break;
			case 19:
				_localctx = new FilealignementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(408);
				match(D_FILE);
				setState(409);
				match(K_ALIGNMENT);
				setState(410);
				int32();
				}
				break;
			case 20:
				_localctx = new ImagebaseContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(411);
				match(D_IMAGEBASE);
				setState(412);
				int64();
				}
				break;
			case 21:
				_localctx = new StackreserveContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(413);
				match(D_STACKRESERVE);
				setState(414);
				int64();
				}
				break;
			case 22:
				_localctx = new LanguageContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(415);
				languageDecl();
				}
				break;
			case 23:
				_localctx = new TypedefContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(416);
				typedefDecl();
				}
				break;
			case 24:
				_localctx = new CompilationControlContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(417);
				compControl();
				}
				break;
			case 25:
				_localctx = new TypeLstContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(418);
				match(D_TYPELIST);
				setState(419);
				match(T__0);
				setState(420);
				classNameSeq();
				setState(421);
				match(T__1);
				}
				break;
			case 26:
				_localctx = new MscorelibContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(423);
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
			setState(430);
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
			case HEXBYTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				className();
				setState(428);
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
			setState(433);
			match(QSTRING);
			}
			_ctx.stop = _input.LT(-1);
			setState(440);
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
					setState(435);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(436);
					match(T__2);
					setState(437);
					match(QSTRING);
					}
					} 
				}
				setState(442);
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
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(D_LANGUAGE);
				setState(444);
				match(SQSTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(D_LANGUAGE);
				setState(446);
				match(SQSTRING);
				setState(447);
				match(T__3);
				setState(448);
				match(SQSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				match(D_LANGUAGE);
				setState(450);
				match(SQSTRING);
				setState(451);
				match(T__3);
				setState(452);
				match(SQSTRING);
				setState(453);
				match(T__3);
				setState(454);
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
			setState(457);
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
		public TerminalNode HEXBYTE() { return getToken(CilParser.HEXBYTE, 0); }
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
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQSTRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				id();
				}
				break;
			case DOTTEDNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(DOTTEDNAME);
				}
				break;
			case HEXBYTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(HEXBYTE);
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
			setState(464);
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
			setState(466);
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
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(FLOAT64);
				}
				break;
			case K_FLOAT32:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(K_FLOAT32);
				setState(470);
				match(T__4);
				setState(471);
				int32();
				setState(472);
				match(T__5);
				}
				break;
			case K_FLOAT64:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(K_FLOAT64);
				setState(475);
				match(T__4);
				setState(476);
				int64();
				setState(477);
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
			setState(481);
			match(D_TYPEDEF);
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(482);
				type(0);
				setState(483);
				match(K_AS);
				}
				break;
			case 2:
				{
				setState(485);
				className();
				setState(486);
				match(K_AS);
				}
				break;
			case 3:
				{
				setState(488);
				memberRef();
				setState(489);
				match(K_AS);
				}
				break;
			case 4:
				{
				setState(491);
				customDescr();
				setState(492);
				match(K_AS);
				}
				break;
			}
			setState(496);
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
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(P_DEFINE);
				setState(499);
				dottedName();
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QSTRING) {
					{
					setState(500);
					compQstring(0);
					}
				}

				}
				break;
			case P_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(P_UNDEF);
				setState(504);
				dottedName();
				}
				break;
			case P_IFDEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				match(P_IFDEF);
				setState(506);
				dottedName();
				}
				break;
			case P_IFNDEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				match(P_IFNDEF);
				setState(508);
				dottedName();
				}
				break;
			case P_ELSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(509);
				match(P_ELSE);
				}
				break;
			case P_ENDIF:
				enterOuterAlt(_localctx, 6);
				{
				setState(510);
				match(P_ENDIF);
				}
				break;
			case P_INCLUDE:
				enterOuterAlt(_localctx, 7);
				{
				setState(511);
				match(P_INCLUDE);
				setState(512);
				match(QSTRING);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 8);
				{
				setState(513);
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
			setState(516);
			match(D_CUSTOM);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(517);
				match(T__4);
				setState(518);
				ownerType();
				setState(519);
				match(T__5);
				}
			}

			setState(523);
			methodRef();
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(524);
				match(T__7);
				setState(525);
				compQstring(0);
				}
				break;
			case 2:
				{
				setState(526);
				match(T__7);
				setState(527);
				match(T__0);
				setState(528);
				customBlobDescr();
				setState(529);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(531);
				match(T__7);
				setState(532);
				match(T__4);
				setState(533);
				bytes();
				setState(534);
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
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
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
			setState(542);
			customBlobArgs();
			setState(543);
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
			setState(549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(547);
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
						setState(545);
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
						setState(546);
						compControl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(551);
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
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(559);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_FIELD:
					case K_PROPERTY:
						{
						setState(552);
						fieldOrProp();
						setState(553);
						serializType(0);
						setState(554);
						dottedName();
						setState(555);
						match(T__7);
						setState(556);
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
						setState(558);
						compControl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(563);
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
			setState(564);
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
			setState(566);
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
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(569);
				simpleType();
				}
				break;
			case 2:
				{
				setState(570);
				match(K_TYPE);
				}
				break;
			case 3:
				{
				setState(571);
				match(K_OBJECT);
				}
				break;
			case 4:
				{
				setState(572);
				match(K_ENUM);
				setState(573);
				match(K_CLASS);
				setState(574);
				match(SQSTRING);
				}
				break;
			case 5:
				{
				setState(575);
				match(K_ENUM);
				setState(576);
				className();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(584);
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
					setState(579);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(580);
					match(T__8);
					setState(581);
					match(T__9);
					}
					} 
				}
				setState(586);
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
			setState(587);
			match(D_MODULE);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXTERN) {
				{
				setState(588);
				match(K_EXTERN);
				}
			}

			setState(591);
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
			setState(593);
			match(D_VTFIXUP);
			setState(594);
			match(T__8);
			setState(595);
			int32();
			setState(596);
			match(T__9);
			setState(597);
			vtfixupAttr(0);
			setState(598);
			match(K_AT);
			setState(599);
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
			setState(614);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(612);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(602);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(603);
						match(K_INT32);
						}
						break;
					case 2:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(604);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(605);
						match(K_INT64);
						}
						break;
					case 3:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(606);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(607);
						match(K_FROMUNMANAGED);
						}
						break;
					case 4:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(608);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(609);
						match(K_CALLMOSTDERIVED);
						}
						break;
					case 5:
						{
						_localctx = new VtfixupAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_vtfixupAttr);
						setState(610);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(611);
						match(K_RETAINAPPDOMAIN);
						}
						break;
					}
					} 
				}
				setState(616);
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
			setState(617);
			vtableHead();
			setState(618);
			bytes();
			setState(619);
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
			setState(621);
			match(D_VTABLE);
			setState(622);
			match(T__7);
			setState(623);
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
			setState(625);
			match(D_NAMESPACE);
			setState(626);
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
			setState(628);
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
			setState(630);
			klass();
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(631);
					classAttr();
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(637);
			dottedName();
			setState(638);
			typarsClause();
			}
		}
		catch (RecognitionException re) {
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
			setState(640);
			classHeadBegin();
			setState(641);
			extendsClause();
			setState(642);
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
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				match(K_PUBLIC);
				}
				break;
			case K_PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				match(K_PRIVATE);
				}
				break;
			case K_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(646);
				match(K_VALUE);
				}
				break;
			case K_ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(647);
				match(K_ENUM);
				}
				break;
			case K_INTERFACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(648);
				match(K_INTERFACE);
				}
				break;
			case K_SEALED:
				enterOuterAlt(_localctx, 6);
				{
				setState(649);
				match(K_SEALED);
				}
				break;
			case K_ABSTRACT:
				enterOuterAlt(_localctx, 7);
				{
				setState(650);
				match(K_ABSTRACT);
				}
				break;
			case K_AUTO:
				enterOuterAlt(_localctx, 8);
				{
				setState(651);
				match(K_AUTO);
				}
				break;
			case K_SEQUENTIAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(652);
				match(K_SEQUENTIAL);
				}
				break;
			case K_EXPLICIT:
				enterOuterAlt(_localctx, 10);
				{
				setState(653);
				match(K_EXPLICIT);
				}
				break;
			case K_ANSI:
				enterOuterAlt(_localctx, 11);
				{
				setState(654);
				match(K_ANSI);
				}
				break;
			case K_UNICODE:
				enterOuterAlt(_localctx, 12);
				{
				setState(655);
				match(K_UNICODE);
				}
				break;
			case K_AUTOCHAR:
				enterOuterAlt(_localctx, 13);
				{
				setState(656);
				match(K_AUTOCHAR);
				}
				break;
			case K_IMPORT:
				enterOuterAlt(_localctx, 14);
				{
				setState(657);
				match(K_IMPORT);
				}
				break;
			case K_SERIALIZABLE:
				enterOuterAlt(_localctx, 15);
				{
				setState(658);
				match(K_SERIALIZABLE);
				}
				break;
			case K_WINDOWSRUNTIME:
				enterOuterAlt(_localctx, 16);
				{
				setState(659);
				match(K_WINDOWSRUNTIME);
				}
				break;
			case K_NESTED:
				enterOuterAlt(_localctx, 17);
				{
				setState(660);
				match(K_NESTED);
				setState(661);
				_la = _input.LA(1);
				if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (K_PUBLIC - 76)) | (1L << (K_PRIVATE - 76)) | (1L << (K_FAMILY - 76)) | (1L << (K_ASSEMBLY - 76)) | (1L << (K_FAMANDASSEM - 76)) | (1L << (K_FAMORASSEM - 76)))) != 0)) ) {
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
				setState(662);
				match(K_BEFOREFIELDINIT);
				}
				break;
			case K_SPECIALNAME:
				enterOuterAlt(_localctx, 19);
				{
				setState(663);
				match(K_SPECIALNAME);
				}
				break;
			case K_RTSPECIALNAME:
				enterOuterAlt(_localctx, 20);
				{
				setState(664);
				match(K_RTSPECIALNAME);
				}
				break;
			case K_FLAGS:
				enterOuterAlt(_localctx, 21);
				{
				setState(665);
				match(K_FLAGS);
				setState(666);
				match(T__4);
				setState(667);
				int32();
				setState(668);
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
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXTENDS) {
				{
				setState(672);
				match(K_EXTENDS);
				setState(673);
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
			setState(679);
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
				setState(677);
				match(K_IMPLEMENTS);
				setState(678);
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
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(681);
					classDecl();
					}
					} 
				}
				setState(686);
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
			setState(688);
			typeSpec();
			}
			_ctx.stop = _input.LT(-1);
			setState(695);
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
					setState(690);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(691);
					match(T__3);
					setState(692);
					typeSpec();
					}
					} 
				}
				setState(697);
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
			setState(700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
			case T__18:
			case T__19:
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
			case HEXBYTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
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
			setState(703);
			typeSpec();
			}
			_ctx.stop = _input.LT(-1);
			setState(710);
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
					setState(705);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(706);
					match(T__3);
					setState(707);
					typeSpec();
					}
					} 
				}
				setState(712);
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
			setState(718);
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
				setState(714);
				match(T__10);
				setState(715);
				typars();
				setState(716);
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
			setState(720);
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
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case SQSTRING:
			case ID:
			case DOTTEDNAME:
			case HEXBYTE:
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
				setState(723);
				typarAttrib();
				setState(724);
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
			setState(728);
			typarAttribs();
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(729);
				tyBound();
				}
			}

			setState(732);
			dottedName();
			setState(733);
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
			setState(738);
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
				setState(736);
				match(T__3);
				setState(737);
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
			setState(740);
			match(T__4);
			setState(741);
			typeList();
			setState(742);
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
			setState(746);
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
				setState(745);
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
			setState(748);
			match(T__10);
			setState(749);
			match(T__8);
			setState(750);
			int32();
			setState(751);
			match(T__9);
			setState(752);
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
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_METHOD:
				_localctx = new Class_methodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				methodHead();
				setState(755);
				match(T__0);
				setState(756);
				methodDecls();
				setState(757);
				match(T__1);
				}
				break;
			case D_CLASS:
				_localctx = new Class_classContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				classHead();
				setState(760);
				match(T__0);
				setState(761);
				classDecls();
				setState(762);
				match(T__1);
				}
				break;
			case D_EVENT:
				_localctx = new Class_eventContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				eventHead();
				setState(765);
				match(T__0);
				setState(766);
				eventDecls();
				setState(767);
				match(T__1);
				}
				break;
			case D_PROPERTY:
				_localctx = new Class_propertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(769);
				propHead();
				setState(770);
				match(T__0);
				setState(771);
				propDecls();
				setState(772);
				match(T__1);
				}
				break;
			case D_FIELD:
				_localctx = new Class_fieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(774);
				fieldDecl();
				}
				break;
			case D_DATA:
				_localctx = new Class_dataContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(775);
				dataDecl();
				}
				break;
			case D_PERMISSION:
			case D_PERMISSIONSET:
				_localctx = new Class_securityContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(776);
				secDecl();
				}
				break;
			case D_LINE:
			case P_LINE:
				_localctx = new Class_externalSourceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(777);
				extSourceSpec();
				}
				break;
			case D_CUSTOM:
				_localctx = new Class_customAttributeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(778);
				customAttrDecl();
				}
				break;
			case D_SIZE:
				_localctx = new Class_sizeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(779);
				match(D_SIZE);
				setState(780);
				int32();
				}
				break;
			case D_PACK:
				_localctx = new Class_packContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(781);
				match(D_PACK);
				setState(782);
				int32();
				}
				break;
			case D_EXPORT:
				_localctx = new Class_exportContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(783);
				exportHead();
				setState(784);
				match(T__0);
				setState(785);
				exptypeDecls();
				setState(786);
				match(T__1);
				}
				break;
			case D_OVERRIDE:
				_localctx = new Class_methodOverrideContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(788);
				match(D_OVERRIDE);
				setState(824);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(789);
					typeSpec();
					setState(790);
					match(DCOLON);
					setState(791);
					methodName();
					setState(792);
					match(K_WITH);
					setState(793);
					callConv();
					setState(794);
					type(0);
					setState(795);
					typeSpec();
					setState(796);
					match(DCOLON);
					setState(797);
					methodName();
					setState(798);
					match(T__4);
					setState(799);
					sigArgs0();
					setState(800);
					match(T__5);
					}
					break;
				case 2:
					{
					setState(802);
					match(K_METHOD);
					setState(803);
					callConv();
					setState(804);
					type(0);
					setState(805);
					typeSpec();
					setState(806);
					match(DCOLON);
					setState(807);
					methodName();
					setState(808);
					genArity();
					setState(809);
					match(T__4);
					setState(810);
					sigArgs0();
					setState(811);
					match(T__5);
					setState(812);
					match(K_WITH);
					setState(813);
					match(K_METHOD);
					setState(814);
					callConv();
					setState(815);
					type(0);
					setState(816);
					typeSpec();
					setState(817);
					match(DCOLON);
					setState(818);
					methodName();
					setState(819);
					genArity();
					setState(820);
					match(T__4);
					setState(821);
					sigArgs0();
					setState(822);
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
				setState(826);
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
				setState(827);
				compControl();
				}
				break;
			case D_PARAM:
				_localctx = new Class_paramContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(828);
				match(D_PARAM);
				setState(829);
				_la = _input.LA(1);
				if ( !(_la==K_TYPE || _la==K_CONSTRAINT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(835);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(830);
					match(T__8);
					setState(831);
					int32();
					setState(832);
					match(T__9);
					}
					break;
				case SQSTRING:
				case ID:
				case DOTTEDNAME:
				case HEXBYTE:
					{
					setState(834);
					dottedName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(837);
					match(T__3);
					setState(838);
					typeSpec();
					}
				}

				}
				break;
			case D_INTERFACEIMPL:
				_localctx = new Class_interfaceImplContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(841);
				match(D_INTERFACEIMPL);
				setState(842);
				match(K_TYPE);
				setState(843);
				typeSpec();
				setState(844);
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
			setState(848);
			match(D_FIELD);
			setState(849);
			repeatOpt();
			setState(853);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(850);
					fieldAttr();
					}
					} 
				}
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(856);
			type(0);
			setState(857);
			dottedName();
			setState(858);
			atOpt();
			setState(859);
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
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				match(K_STATIC);
				}
				break;
			case K_PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				match(K_PUBLIC);
				}
				break;
			case K_PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(863);
				match(K_PRIVATE);
				}
				break;
			case K_FAMILY:
				enterOuterAlt(_localctx, 4);
				{
				setState(864);
				match(K_FAMILY);
				}
				break;
			case K_INITONLY:
				enterOuterAlt(_localctx, 5);
				{
				setState(865);
				match(K_INITONLY);
				}
				break;
			case K_RTSPECIALNAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(866);
				match(K_RTSPECIALNAME);
				}
				break;
			case K_SPECIALNAME:
				enterOuterAlt(_localctx, 7);
				{
				setState(867);
				match(K_SPECIALNAME);
				}
				break;
			case K_MARSHAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(868);
				match(K_MARSHAL);
				setState(869);
				match(T__4);
				setState(870);
				marshalBlob();
				setState(871);
				match(T__5);
				}
				break;
			case K_ASSEMBLY:
				enterOuterAlt(_localctx, 9);
				{
				setState(873);
				match(K_ASSEMBLY);
				}
				break;
			case K_FAMANDASSEM:
				enterOuterAlt(_localctx, 10);
				{
				setState(874);
				match(K_FAMANDASSEM);
				}
				break;
			case K_FAMORASSEM:
				enterOuterAlt(_localctx, 11);
				{
				setState(875);
				match(K_FAMORASSEM);
				}
				break;
			case K_PRIVATESCOPE:
				enterOuterAlt(_localctx, 12);
				{
				setState(876);
				match(K_PRIVATESCOPE);
				}
				break;
			case K_LITERAL:
				enterOuterAlt(_localctx, 13);
				{
				setState(877);
				match(K_LITERAL);
				}
				break;
			case K_NOTSERIALIZED:
				enterOuterAlt(_localctx, 14);
				{
				setState(878);
				match(K_NOTSERIALIZED);
				}
				break;
			case K_FLAGS:
				enterOuterAlt(_localctx, 15);
				{
				setState(879);
				match(K_FLAGS);
				setState(880);
				match(T__4);
				setState(881);
				int32();
				setState(882);
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
			setState(889);
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
				setState(887);
				match(K_AT);
				setState(888);
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
			setState(894);
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
				setState(892);
				match(T__7);
				setState(893);
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
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
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
				setState(897);
				match(T__8);
				setState(898);
				int32();
				setState(899);
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
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode DCOLON() { return getToken(CilParser.DCOLON, 0); }
		public TyArgs0Context tyArgs0() {
			return getRuleContext(TyArgs0Context.class,0);
		}
		public GenArityNotEmptyContext genArityNotEmpty() {
			return getRuleContext(GenArityNotEmptyContext.class,0);
		}
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
			setState(903);
			callConv();
			setState(904);
			type(0);
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(905);
				typeSpec();
				setState(906);
				match(DCOLON);
				}
				break;
			}
			setState(910);
			methodName();
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(911);
				tyArgs0();
				}
				break;
			case 2:
				{
				setState(912);
				genArityNotEmpty();
				}
				break;
			}
			setState(915);
			match(T__4);
			setState(916);
			sigArgs0();
			setState(917);
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
			setState(922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(919);
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
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(931);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DEFAULT:
			case K_VARARG:
			case K_UNMANAGED:
				{
				setState(925);
				callKind();
				}
				break;
			case K_CALLCONV:
				{
				setState(926);
				match(K_CALLCONV);
				setState(927);
				match(T__4);
				setState(928);
				int32();
				setState(929);
				match(T__5);
				}
				break;
			case T__8:
			case T__18:
			case T__19:
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
			setState(937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				match(K_DEFAULT);
				}
				break;
			case K_VARARG:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				match(K_VARARG);
				}
				break;
			case K_UNMANAGED:
				enterOuterAlt(_localctx, 3);
				{
				setState(935);
				match(K_UNMANAGED);
				setState(936);
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
			setState(939);
			match(K_MDTOKEN);
			setState(940);
			match(T__4);
			setState(941);
			int32();
			setState(942);
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
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				methodSpec();
				setState(945);
				methodRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				match(K_FIELD);
				setState(948);
				type(0);
				setState(949);
				typeSpec();
				setState(950);
				match(DCOLON);
				setState(951);
				dottedName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(953);
				match(K_FIELD);
				setState(954);
				type(0);
				setState(955);
				dottedName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(957);
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
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				match(D_EVENT);
				setState(961);
				eventAttr(0);
				setState(962);
				typeSpec();
				setState(963);
				dottedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				match(D_EVENT);
				setState(966);
				eventAttr(0);
				setState(967);
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
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(976);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new EventAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eventAttr);
						setState(972);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(973);
						match(K_RTSPECIALNAME);
						}
						break;
					case 2:
						{
						_localctx = new EventAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eventAttr);
						setState(974);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(975);
						match(K_SPECIALNAME);
						}
						break;
					}
					} 
				}
				setState(980);
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
			setState(984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(981);
					eventDecl();
					}
					} 
				}
				setState(986);
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
			setState(999);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_ADDON:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				match(D_ADDON);
				setState(988);
				methodRef();
				}
				break;
			case D_REMOVEON:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				match(D_REMOVEON);
				setState(990);
				methodRef();
				}
				break;
			case D_FIRE:
				enterOuterAlt(_localctx, 3);
				{
				setState(991);
				match(D_FIRE);
				setState(992);
				methodRef();
				}
				break;
			case D_OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(993);
				match(D_OTHER);
				setState(994);
				methodRef();
				}
				break;
			case D_LINE:
			case P_LINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(995);
				extSourceSpec();
				}
				break;
			case D_CUSTOM:
				enterOuterAlt(_localctx, 6);
				{
				setState(996);
				customAttrDecl();
				}
				break;
			case D_LANGUAGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(997);
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
				setState(998);
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
			setState(1001);
			match(D_PROPERTY);
			setState(1002);
			propAttr(0);
			setState(1003);
			callConv();
			setState(1004);
			type(0);
			setState(1005);
			dottedName();
			setState(1006);
			match(T__4);
			setState(1007);
			sigArgs0();
			setState(1008);
			match(T__5);
			setState(1009);
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
			setState(1018);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1016);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new PropAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_propAttr);
						setState(1012);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1013);
						match(K_RTSPECIALNAME);
						}
						break;
					case 2:
						{
						_localctx = new PropAttrContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_propAttr);
						setState(1014);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1015);
						match(K_SPECIALNAME);
						}
						break;
					}
					} 
				}
				setState(1020);
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
			setState(1024);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1021);
					propDecl();
					}
					} 
				}
				setState(1026);
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
			setState(1037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				match(D_SET);
				setState(1028);
				methodRef();
				}
				break;
			case D_GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				match(D_GET);
				setState(1030);
				methodRef();
				}
				break;
			case D_OTHER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				match(D_OTHER);
				setState(1032);
				methodRef();
				}
				break;
			case D_CUSTOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1033);
				customAttrDecl();
				}
				break;
			case D_LINE:
			case P_LINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1034);
				extSourceSpec();
				}
				break;
			case D_LANGUAGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1035);
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
				setState(1036);
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
		enterRule(_localctx, 126, RULE_marshalClause);
		try {
			setState(1045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case D_CTOR:
			case D_CCTOR:
			case SQSTRING:
			case ID:
			case DOTTEDNAME:
			case HEXBYTE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case K_MARSHAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
				match(K_MARSHAL);
				setState(1041);
				match(T__4);
				setState(1042);
				marshalBlob();
				setState(1043);
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
		public TerminalNode HEXBYTE() { return getToken(CilParser.HEXBYTE, 0); }
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
		enterRule(_localctx, 128, RULE_marshalBlob);
		try {
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				nativeType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				marshalBlobHead();
				setState(1049);
				match(HEXBYTE);
				setState(1050);
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
		enterRule(_localctx, 130, RULE_marshalBlobHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
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
		public TerminalNode D_METHOD() { return getToken(CilParser.D_METHOD, 0); }
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
		enterRule(_localctx, 132, RULE_methodHead);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(D_METHOD);
			setState(1060);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1057);
					methAttr();
					}
					} 
				}
				setState(1062);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(1063);
			callConv();
			setState(1067);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1064);
					paramAttr();
					}
					} 
				}
				setState(1069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(1070);
			type(0);
			setState(1071);
			marshalClause();
			setState(1072);
			methodName();
			setState(1073);
			typarsClause();
			setState(1074);
			match(T__4);
			setState(1075);
			sigArgs0();
			setState(1076);
			match(T__5);
			setState(1080);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1077);
					implAttr();
					}
					} 
				}
				setState(1082);
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
		enterRule(_localctx, 134, RULE_methAttr);
		int _la;
		try {
			int _alt;
			setState(1123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083);
				match(K_STATIC);
				}
				break;
			case K_PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(K_PUBLIC);
				}
				break;
			case K_PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1085);
				match(K_PRIVATE);
				}
				break;
			case K_FAMILY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1086);
				match(K_FAMILY);
				}
				break;
			case K_FINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1087);
				match(K_FINAL);
				}
				break;
			case K_SPECIALNAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(1088);
				match(K_SPECIALNAME);
				}
				break;
			case K_VIRTUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1089);
				match(K_VIRTUAL);
				}
				break;
			case K_STRICT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1090);
				match(K_STRICT);
				}
				break;
			case K_ABSTRACT:
				enterOuterAlt(_localctx, 9);
				{
				setState(1091);
				match(K_ABSTRACT);
				}
				break;
			case K_ASSEMBLY:
				enterOuterAlt(_localctx, 10);
				{
				setState(1092);
				match(K_ASSEMBLY);
				}
				break;
			case K_FAMANDASSEM:
				enterOuterAlt(_localctx, 11);
				{
				setState(1093);
				match(K_FAMANDASSEM);
				}
				break;
			case K_FAMORASSEM:
				enterOuterAlt(_localctx, 12);
				{
				setState(1094);
				match(K_FAMORASSEM);
				}
				break;
			case K_PRIVATESCOPE:
				enterOuterAlt(_localctx, 13);
				{
				setState(1095);
				match(K_PRIVATESCOPE);
				}
				break;
			case K_HIDEBYSIG:
				enterOuterAlt(_localctx, 14);
				{
				setState(1096);
				match(K_HIDEBYSIG);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 15);
				{
				setState(1097);
				match(T__13);
				}
				break;
			case K_NEWSLOT:
				enterOuterAlt(_localctx, 16);
				{
				setState(1098);
				match(K_NEWSLOT);
				}
				break;
			case K_RTSPECIALNAME:
				enterOuterAlt(_localctx, 17);
				{
				setState(1099);
				match(K_RTSPECIALNAME);
				}
				break;
			case K_UNMANAGEDEXP:
				enterOuterAlt(_localctx, 18);
				{
				setState(1100);
				match(K_UNMANAGEDEXP);
				}
				break;
			case K_REQSECOBJ:
				enterOuterAlt(_localctx, 19);
				{
				setState(1101);
				match(K_REQSECOBJ);
				}
				break;
			case K_FLAGS:
				enterOuterAlt(_localctx, 20);
				{
				setState(1102);
				match(K_FLAGS);
				setState(1103);
				match(T__4);
				setState(1104);
				int32();
				setState(1105);
				match(T__5);
				}
				break;
			case K_PINVOKEIMPL:
				enterOuterAlt(_localctx, 21);
				{
				setState(1107);
				match(K_PINVOKEIMPL);
				setState(1108);
				match(T__4);
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QSTRING) {
					{
					setState(1109);
					compQstring(0);
					}
				}

				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1112);
					match(K_AS);
					setState(1113);
					compQstring(0);
					}
				}

				setState(1119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1116);
						pinvAttr();
						}
						} 
					}
					setState(1121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(1122);
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
		enterRule(_localctx, 136, RULE_pinvAttr);
		try {
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				match(K_NOMANGLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				match(K_ANSI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1127);
				match(K_UNICODE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1128);
				match(K_AUTOCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1129);
				match(K_LASTERR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1130);
				match(K_WINAPI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1131);
				match(K_CDECL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1132);
				match(K_STDCALL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1133);
				match(K_THISCALL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1134);
				match(K_FASTCALL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1135);
				match(K_BESTFIT);
				setState(1136);
				match(T__14);
				setState(1137);
				match(K_ON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1138);
				match(K_BESTFIT);
				setState(1139);
				match(T__14);
				setState(1140);
				match(K_OFF);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1141);
				match(K_CHARMAPERROR);
				setState(1142);
				match(T__14);
				setState(1143);
				match(K_ON);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1144);
				match(K_CHARMAPERROR);
				setState(1145);
				match(T__14);
				setState(1146);
				match(K_OFF);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1147);
				match(K_FLAGS);
				setState(1148);
				match(T__4);
				setState(1149);
				int32();
				setState(1150);
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
		enterRule(_localctx, 138, RULE_methodName);
		try {
			setState(1157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_CTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1154);
				match(D_CTOR);
				}
				break;
			case D_CCTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1155);
				match(D_CCTOR);
				}
				break;
			case SQSTRING:
			case ID:
			case DOTTEDNAME:
			case HEXBYTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1156);
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
		enterRule(_localctx, 140, RULE_paramAttr);
		try {
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				match(T__8);
				setState(1160);
				match(K_IN);
				setState(1161);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				match(T__8);
				setState(1163);
				match(K_OUT);
				setState(1164);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1165);
				match(T__8);
				setState(1166);
				match(K_OPT);
				setState(1167);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1168);
				match(T__8);
				setState(1169);
				int32();
				setState(1170);
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
		enterRule(_localctx, 142, RULE_implAttr);
		try {
			setState(1193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NATIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				match(K_NATIVE);
				}
				break;
			case K_CIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				match(K_CIL);
				}
				break;
			case K_OPTIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1176);
				match(K_OPTIL);
				}
				break;
			case K_MANAGED:
				enterOuterAlt(_localctx, 4);
				{
				setState(1177);
				match(K_MANAGED);
				}
				break;
			case K_UNMANAGED:
				enterOuterAlt(_localctx, 5);
				{
				setState(1178);
				match(K_UNMANAGED);
				}
				break;
			case K_FORWARDREF:
				enterOuterAlt(_localctx, 6);
				{
				setState(1179);
				match(K_FORWARDREF);
				}
				break;
			case K_PRESERVESIG:
				enterOuterAlt(_localctx, 7);
				{
				setState(1180);
				match(K_PRESERVESIG);
				}
				break;
			case K_RUNTIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(1181);
				match(K_RUNTIME);
				}
				break;
			case K_INTERNALCALL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1182);
				match(K_INTERNALCALL);
				}
				break;
			case K_SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1183);
				match(K_SYNCHRONIZED);
				}
				break;
			case K_NOINLINING:
				enterOuterAlt(_localctx, 11);
				{
				setState(1184);
				match(K_NOINLINING);
				}
				break;
			case K_AGGRESSIVEINLINING:
				enterOuterAlt(_localctx, 12);
				{
				setState(1185);
				match(K_AGGRESSIVEINLINING);
				}
				break;
			case K_NOOPTIMIZATION:
				enterOuterAlt(_localctx, 13);
				{
				setState(1186);
				match(K_NOOPTIMIZATION);
				}
				break;
			case K_AGGRESSIVEOPTIMIZATION:
				enterOuterAlt(_localctx, 14);
				{
				setState(1187);
				match(K_AGGRESSIVEOPTIMIZATION);
				}
				break;
			case K_FLAGS:
				enterOuterAlt(_localctx, 15);
				{
				setState(1188);
				match(K_FLAGS);
				setState(1189);
				match(T__4);
				setState(1190);
				int32();
				setState(1191);
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
		enterRule(_localctx, 144, RULE_localsHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
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
		enterRule(_localctx, 146, RULE_methodDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1197);
					methodDecl();
					}
					} 
				}
				setState(1202);
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
		enterRule(_localctx, 148, RULE_methodDecl);
		int _la;
		try {
			setState(1288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_EMITBYTE:
				_localctx = new Method_emitbyteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				match(D_EMITBYTE);
				setState(1204);
				int32();
				}
				break;
			case D_TRY:
				_localctx = new Method_sehblockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				sehBlock();
				}
				break;
			case D_MAXSTACK:
				_localctx = new Method_maxstackContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1206);
				match(D_MAXSTACK);
				setState(1207);
				int32();
				}
				break;
			case D_LOCALS:
				_localctx = new Method_localsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1208);
				localsHead();
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_INIT) {
					{
					setState(1209);
					match(K_INIT);
					}
				}

				setState(1212);
				match(T__4);
				setState(1213);
				sigArgs0();
				setState(1214);
				match(T__5);
				}
				break;
			case D_ENTRYPOINT:
				_localctx = new Method_entrypointContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1216);
				match(D_ENTRYPOINT);
				}
				break;
			case D_ZEROINIT:
				_localctx = new Method_zeroinitContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1217);
				match(D_ZEROINIT);
				}
				break;
			case D_DATA:
				_localctx = new Method_datadeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1218);
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
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQSTRING || _la==ID) {
					{
					setState(1219);
					id();
					setState(1220);
					match(T__14);
					}
				}

				setState(1224);
				instr();
				}
				break;
			case D_PERMISSION:
			case D_PERMISSIONSET:
				_localctx = new Method_securityContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1225);
				secDecl();
				}
				break;
			case D_LINE:
			case P_LINE:
				_localctx = new Method_externalSourceContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1226);
				extSourceSpec();
				}
				break;
			case D_LANGUAGE:
				_localctx = new Method_languageContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1227);
				languageDecl();
				}
				break;
			case D_CUSTOM:
				_localctx = new Method_customAtributeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1228);
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
				setState(1229);
				compControl();
				}
				break;
			case D_EXPORT:
				_localctx = new Method_exportContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1230);
				match(D_EXPORT);
				setState(1231);
				match(T__8);
				setState(1232);
				int32();
				setState(1233);
				match(T__9);
				setState(1236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS) {
					{
					setState(1234);
					match(K_AS);
					setState(1235);
					id();
					}
				}

				}
				break;
			case D_VTENTRY:
				_localctx = new Method_vtentryContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1238);
				match(D_VTENTRY);
				setState(1239);
				int32();
				setState(1240);
				match(T__14);
				setState(1241);
				int32();
				}
				break;
			case D_OVERRIDE:
				_localctx = new Method_overrideContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1243);
				match(D_OVERRIDE);
				setState(1248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(1244);
					match(K_METHOD);
					setState(1245);
					callConv();
					setState(1246);
					type(0);
					}
					break;
				}
				setState(1250);
				typeSpec();
				setState(1251);
				match(DCOLON);
				setState(1252);
				methodName();
				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__10) {
					{
					setState(1253);
					genArity();
					setState(1254);
					match(T__4);
					setState(1255);
					sigArgs0();
					setState(1256);
					match(T__5);
					}
				}

				}
				break;
			case T__0:
				_localctx = new Method_scopeBlockContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1260);
				scopeBlock();
				}
				break;
			case D_PARAM:
				_localctx = new Method_dparamContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1261);
				match(D_PARAM);
				setState(1286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_TYPE:
					{
					setState(1262);
					match(K_TYPE);
					setState(1268);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(1263);
						match(T__8);
						setState(1264);
						int32();
						setState(1265);
						match(T__9);
						}
						break;
					case SQSTRING:
					case ID:
					case DOTTEDNAME:
					case HEXBYTE:
						{
						setState(1267);
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
					setState(1270);
					match(K_CONSTRAINT);
					setState(1276);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(1271);
						match(T__8);
						setState(1272);
						int32();
						setState(1273);
						match(T__9);
						}
						break;
					case SQSTRING:
					case ID:
					case DOTTEDNAME:
					case HEXBYTE:
						{
						setState(1275);
						dottedName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1278);
					match(T__3);
					setState(1279);
					typeSpec();
					}
					break;
				case T__8:
					{
					setState(1281);
					match(T__8);
					setState(1282);
					int32();
					setState(1283);
					match(T__9);
					setState(1284);
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
		enterRule(_localctx, 150, RULE_scopeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			scopeOpen();
			setState(1291);
			methodDecls();
			setState(1292);
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
		enterRule(_localctx, 152, RULE_scopeOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
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
		enterRule(_localctx, 154, RULE_sehBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			tryBlock();
			setState(1297);
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
		enterRule(_localctx, 156, RULE_sehClauses);
		try {
			setState(1303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1299);
				sehClause();
				setState(1300);
				sehClauses();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302);
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
		enterRule(_localctx, 158, RULE_tryBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			match(D_TRY);
			setState(1315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(1306);
				scopeBlock();
				}
				break;
			case SQSTRING:
			case ID:
				{
				setState(1307);
				id();
				setState(1308);
				match(K_TO);
				setState(1309);
				id();
				}
				break;
			case INT64:
				{
				setState(1311);
				int32();
				setState(1312);
				match(K_TO);
				setState(1313);
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
		enterRule(_localctx, 160, RULE_sehClause);
		try {
			setState(1329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1317);
				catchClause();
				setState(1318);
				handlerBlock();
				}
				break;
			case K_FILTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				filterClause();
				setState(1321);
				handlerBlock();
				}
				break;
			case K_FINALLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1323);
				finallyClause();
				setState(1324);
				handlerBlock();
				}
				break;
			case K_FAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1326);
				faultClause();
				setState(1327);
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
		enterRule(_localctx, 162, RULE_filterClause);
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331);
				filterHead();
				setState(1332);
				scopeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				filterHead();
				setState(1335);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1337);
				filterHead();
				setState(1338);
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
		enterRule(_localctx, 164, RULE_filterHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
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
		enterRule(_localctx, 166, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			match(K_CATCH);
			setState(1345);
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
		enterRule(_localctx, 168, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
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
		enterRule(_localctx, 170, RULE_faultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
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
		public TerminalNode K_TO() { return getToken(CilParser.K_TO, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
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
		enterRule(_localctx, 172, RULE_handlerBlock);
		try {
			setState(1362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351);
				scopeBlock();
				}
				break;
			case K_HANDLER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1352);
				match(K_HANDLER);
				setState(1355);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SQSTRING:
				case ID:
					{
					setState(1353);
					id();
					}
					break;
				case INT64:
					{
					setState(1354);
					int32();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1357);
				match(K_TO);
				setState(1360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SQSTRING:
				case ID:
					{
					setState(1358);
					id();
					}
					break;
				case INT64:
					{
					setState(1359);
					int32();
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
		enterRule(_localctx, 174, RULE_dataDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			ddHead();
			setState(1365);
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
		enterRule(_localctx, 176, RULE_ddHead);
		try {
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				match(D_DATA);
				setState(1368);
				tls();
				setState(1369);
				id();
				setState(1370);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				match(D_DATA);
				setState(1373);
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
		enterRule(_localctx, 178, RULE_tls);
		try {
			setState(1379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__16:
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
				setState(1377);
				match(K_TLS);
				}
				break;
			case K_CIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1378);
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
		enterRule(_localctx, 180, RULE_ddBody);
		try {
			setState(1386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				match(T__0);
				setState(1382);
				ddItemList();
				setState(1383);
				match(T__1);
				}
				break;
			case T__16:
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
				setState(1385);
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
		enterRule(_localctx, 182, RULE_ddItemList);
		try {
			setState(1393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1388);
				ddItem();
				setState(1389);
				match(T__3);
				setState(1390);
				ddItemList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1392);
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
		enterRule(_localctx, 184, RULE_ddItemCount);
		try {
			setState(1400);
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
				setState(1396);
				match(T__8);
				setState(1397);
				int32();
				setState(1398);
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
		enterRule(_localctx, 186, RULE_ddItem);
		try {
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1402);
				match(K_CHAR);
				setState(1403);
				match(T__15);
				setState(1404);
				match(T__4);
				setState(1405);
				compQstring(0);
				setState(1406);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1408);
				match(T__16);
				setState(1409);
				match(T__4);
				setState(1410);
				id();
				setState(1411);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				bytearrayhead();
				setState(1414);
				bytes();
				setState(1415);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1417);
				match(K_FLOAT32);
				setState(1418);
				match(T__4);
				setState(1419);
				float64();
				setState(1420);
				match(T__5);
				setState(1421);
				ddItemCount();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1423);
				match(K_FLOAT64);
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
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1429);
				match(K_INT64);
				setState(1430);
				match(T__4);
				setState(1431);
				int64();
				setState(1432);
				match(T__5);
				setState(1433);
				ddItemCount();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1435);
				match(K_INT32);
				setState(1436);
				match(T__4);
				setState(1437);
				int32();
				setState(1438);
				match(T__5);
				setState(1439);
				ddItemCount();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1441);
				match(K_INT16);
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
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1447);
				match(K_INT8);
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
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1453);
				match(K_FLOAT32);
				setState(1454);
				ddItemCount();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1455);
				match(K_FLOAT64);
				setState(1456);
				ddItemCount();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1457);
				match(K_INT64);
				setState(1458);
				ddItemCount();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1459);
				match(K_INT32);
				setState(1460);
				ddItemCount();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1461);
				match(K_INT16);
				setState(1462);
				ddItemCount();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1463);
				match(K_INT8);
				setState(1464);
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
		enterRule(_localctx, 188, RULE_fieldSerInit);
		try {
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1467);
				match(K_FLOAT32);
				setState(1468);
				match(T__4);
				setState(1469);
				float64();
				setState(1470);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1472);
				match(K_FLOAT64);
				setState(1473);
				match(T__4);
				setState(1474);
				float64();
				setState(1475);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1477);
				match(K_FLOAT32);
				setState(1478);
				match(T__4);
				setState(1479);
				int32();
				setState(1480);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1482);
				match(K_FLOAT64);
				setState(1483);
				match(T__4);
				setState(1484);
				int64();
				setState(1485);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1487);
				match(K_INT64);
				setState(1488);
				match(T__4);
				setState(1489);
				int64();
				setState(1490);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1492);
				match(K_INT32);
				setState(1493);
				match(T__4);
				setState(1494);
				int32();
				setState(1495);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1497);
				match(K_INT16);
				setState(1498);
				match(T__4);
				setState(1499);
				int32();
				setState(1500);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1502);
				match(K_INT8);
				setState(1503);
				match(T__4);
				setState(1504);
				int32();
				setState(1505);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1507);
				match(K_UNSIGNED);
				setState(1508);
				match(K_INT64);
				setState(1509);
				match(T__4);
				setState(1510);
				int64();
				setState(1511);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1513);
				match(K_UNSIGNED);
				setState(1514);
				match(K_INT32);
				setState(1515);
				match(T__4);
				setState(1516);
				int32();
				setState(1517);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1519);
				match(K_UNSIGNED);
				setState(1520);
				match(K_INT16);
				setState(1521);
				match(T__4);
				setState(1522);
				int32();
				setState(1523);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1525);
				match(K_UNSIGNED);
				setState(1526);
				match(K_INT8);
				setState(1527);
				match(T__4);
				setState(1528);
				int32();
				setState(1529);
				match(T__5);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1531);
				match(K_UINT64);
				setState(1532);
				match(T__4);
				setState(1533);
				int64();
				setState(1534);
				match(T__5);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1536);
				match(K_UINT32);
				setState(1537);
				match(T__4);
				setState(1538);
				int32();
				setState(1539);
				match(T__5);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1541);
				match(K_UINT16);
				setState(1542);
				match(T__4);
				setState(1543);
				int32();
				setState(1544);
				match(T__5);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1546);
				match(K_UINT8);
				setState(1547);
				match(T__4);
				setState(1548);
				int32();
				setState(1549);
				match(T__5);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1551);
				match(K_CHAR);
				setState(1552);
				match(T__4);
				setState(1553);
				int32();
				setState(1554);
				match(T__5);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1556);
				match(K_BOOL);
				setState(1557);
				match(T__4);
				setState(1558);
				truefalse();
				setState(1559);
				match(T__5);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1561);
				bytearrayhead();
				setState(1562);
				bytes();
				setState(1563);
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
		enterRule(_localctx, 190, RULE_bytearrayhead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(K_BYTEARRAY);
			setState(1568);
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
		public TerminalNode HEXBYTE() { return getToken(CilParser.HEXBYTE, 0); }
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
		enterRule(_localctx, 192, RULE_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			match(HEXBYTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
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
		enterRule(_localctx, 194, RULE_fieldInit);
		try {
			setState(1575);
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
				setState(1572);
				fieldSerInit();
				}
				break;
			case QSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
				compQstring(0);
				}
				break;
			case K_NULLREF:
				enterOuterAlt(_localctx, 3);
				{
				setState(1574);
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
		enterRule(_localctx, 196, RULE_serInit);
		try {
			setState(1761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1577);
				fieldSerInit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1578);
				match(K_STRING);
				setState(1579);
				match(T__4);
				setState(1580);
				match(K_NULLREF);
				setState(1581);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1582);
				match(K_STRING);
				setState(1583);
				match(T__4);
				setState(1584);
				match(SQSTRING);
				setState(1585);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1586);
				match(K_TYPE);
				setState(1587);
				match(T__4);
				setState(1588);
				match(K_CLASS);
				setState(1589);
				match(SQSTRING);
				setState(1590);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1591);
				match(K_TYPE);
				setState(1592);
				match(T__4);
				setState(1593);
				className();
				setState(1594);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1596);
				match(K_TYPE);
				setState(1597);
				match(T__4);
				setState(1598);
				match(K_NULLREF);
				setState(1599);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1600);
				match(K_OBJECT);
				setState(1601);
				match(T__4);
				setState(1602);
				serInit();
				setState(1603);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1605);
				match(K_FLOAT32);
				setState(1606);
				match(T__8);
				setState(1607);
				int32();
				setState(1608);
				match(T__9);
				setState(1609);
				match(T__4);
				setState(1610);
				f32seq(0);
				setState(1611);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1613);
				match(K_FLOAT64);
				setState(1614);
				match(T__8);
				setState(1615);
				int32();
				setState(1616);
				match(T__9);
				setState(1617);
				match(T__4);
				setState(1618);
				f64seq(0);
				setState(1619);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1621);
				match(K_INT64);
				setState(1622);
				match(T__8);
				setState(1623);
				int32();
				setState(1624);
				match(T__9);
				setState(1625);
				match(T__4);
				setState(1626);
				i64seq(0);
				setState(1627);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1629);
				match(K_INT32);
				setState(1630);
				match(T__8);
				setState(1631);
				int32();
				setState(1632);
				match(T__9);
				setState(1633);
				match(T__4);
				setState(1634);
				i32seq(0);
				setState(1635);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1637);
				match(K_INT16);
				setState(1638);
				match(T__8);
				setState(1639);
				int32();
				setState(1640);
				match(T__9);
				setState(1641);
				match(T__4);
				setState(1642);
				i16seq(0);
				setState(1643);
				match(T__5);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1645);
				match(K_INT8);
				setState(1646);
				match(T__8);
				setState(1647);
				int32();
				setState(1648);
				match(T__9);
				setState(1649);
				match(T__4);
				setState(1650);
				i8seq(0);
				setState(1651);
				match(T__5);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1653);
				match(K_UINT64);
				setState(1654);
				match(T__8);
				setState(1655);
				int32();
				setState(1656);
				match(T__9);
				setState(1657);
				match(T__4);
				setState(1658);
				i64seq(0);
				setState(1659);
				match(T__5);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1661);
				match(K_UINT32);
				setState(1662);
				match(T__8);
				setState(1663);
				int32();
				setState(1664);
				match(T__9);
				setState(1665);
				match(T__4);
				setState(1666);
				i32seq(0);
				setState(1667);
				match(T__5);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1669);
				match(K_UINT16);
				setState(1670);
				match(T__8);
				setState(1671);
				int32();
				setState(1672);
				match(T__9);
				setState(1673);
				match(T__4);
				setState(1674);
				i16seq(0);
				setState(1675);
				match(T__5);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1677);
				match(K_UINT8);
				setState(1678);
				match(T__8);
				setState(1679);
				int32();
				setState(1680);
				match(T__9);
				setState(1681);
				match(T__4);
				setState(1682);
				i8seq(0);
				setState(1683);
				match(T__5);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1685);
				match(K_UNSIGNED);
				setState(1686);
				match(K_INT64);
				setState(1687);
				match(T__8);
				setState(1688);
				int32();
				setState(1689);
				match(T__9);
				setState(1690);
				match(T__4);
				setState(1691);
				i64seq(0);
				setState(1692);
				match(T__5);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1694);
				match(K_UNSIGNED);
				setState(1695);
				match(K_INT32);
				setState(1696);
				match(T__8);
				setState(1697);
				int32();
				setState(1698);
				match(T__9);
				setState(1699);
				match(T__4);
				setState(1700);
				i32seq(0);
				setState(1701);
				match(T__5);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1703);
				match(K_UNSIGNED);
				setState(1704);
				match(K_INT16);
				setState(1705);
				match(T__8);
				setState(1706);
				int32();
				setState(1707);
				match(T__9);
				setState(1708);
				match(T__4);
				setState(1709);
				i16seq(0);
				setState(1710);
				match(T__5);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1712);
				match(K_UNSIGNED);
				setState(1713);
				match(K_INT8);
				setState(1714);
				match(T__8);
				setState(1715);
				int32();
				setState(1716);
				match(T__9);
				setState(1717);
				match(T__4);
				setState(1718);
				i8seq(0);
				setState(1719);
				match(T__5);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1721);
				match(K_CHAR);
				setState(1722);
				match(T__8);
				setState(1723);
				int32();
				setState(1724);
				match(T__9);
				setState(1725);
				match(T__4);
				setState(1726);
				i16seq(0);
				setState(1727);
				match(T__5);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1729);
				match(K_BOOL);
				setState(1730);
				match(T__8);
				setState(1731);
				int32();
				setState(1732);
				match(T__9);
				setState(1733);
				match(T__4);
				setState(1734);
				boolSeq(0);
				setState(1735);
				match(T__5);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1737);
				match(K_STRING);
				setState(1738);
				match(T__8);
				setState(1739);
				int32();
				setState(1740);
				match(T__9);
				setState(1741);
				match(T__4);
				setState(1742);
				sqstringSeq(0);
				setState(1743);
				match(T__5);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1745);
				match(K_TYPE);
				setState(1746);
				match(T__8);
				setState(1747);
				int32();
				setState(1748);
				match(T__9);
				setState(1749);
				match(T__4);
				setState(1750);
				classSeq(0);
				setState(1751);
				match(T__5);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1753);
				match(K_OBJECT);
				setState(1754);
				match(T__8);
				setState(1755);
				int32();
				setState(1756);
				match(T__9);
				setState(1757);
				match(T__4);
				setState(1758);
				objSeq(0);
				setState(1759);
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
		int _startState = 198;
		enterRecursionRule(_localctx, 198, RULE_f32seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1768);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						_localctx = new F32seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f32seq);
						setState(1764);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1765);
						float64();
						}
						break;
					case 2:
						{
						_localctx = new F32seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f32seq);
						setState(1766);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1767);
						int32();
						}
						break;
					}
					} 
				}
				setState(1772);
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
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_f64seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1778);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						_localctx = new F64seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f64seq);
						setState(1774);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1775);
						float64();
						}
						break;
					case 2:
						{
						_localctx = new F64seqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f64seq);
						setState(1776);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1777);
						int64();
						}
						break;
					}
					} 
				}
				setState(1782);
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
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_i64seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1788);
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
					setState(1784);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1785);
					int64();
					}
					} 
				}
				setState(1790);
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
		int _startState = 204;
		enterRecursionRule(_localctx, 204, RULE_i32seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1796);
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
					setState(1792);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1793);
					int32();
					}
					} 
				}
				setState(1798);
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
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_i16seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1804);
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
					setState(1800);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1801);
					int32();
					}
					} 
				}
				setState(1806);
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
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_i8seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1812);
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
					setState(1808);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1809);
					int32();
					}
					} 
				}
				setState(1814);
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
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_boolSeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1820);
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
					setState(1816);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1817);
					truefalse();
					}
					} 
				}
				setState(1822);
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
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_sqstringSeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1828);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
					case 1:
						{
						_localctx = new SqstringSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sqstringSeq);
						setState(1824);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1825);
						match(K_NULLREF);
						}
						break;
					case 2:
						{
						_localctx = new SqstringSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sqstringSeq);
						setState(1826);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1827);
						match(SQSTRING);
						}
						break;
					}
					} 
				}
				setState(1832);
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
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_classSeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1841);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new ClassSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classSeq);
						setState(1834);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1835);
						match(K_NULLREF);
						}
						break;
					case 2:
						{
						_localctx = new ClassSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classSeq);
						setState(1836);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1837);
						match(K_CLASS);
						setState(1838);
						match(SQSTRING);
						}
						break;
					case 3:
						{
						_localctx = new ClassSeqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_classSeq);
						setState(1839);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1840);
						className();
						}
						break;
					}
					} 
				}
				setState(1845);
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
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_objSeq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(1851);
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
					setState(1847);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1848);
					serInit();
					}
					} 
				}
				setState(1853);
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
		enterRule(_localctx, 218, RULE_methodSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
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
		enterRule(_localctx, 220, RULE_instr_none);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
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
		enterRule(_localctx, 222, RULE_instr_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			match(INSTR_VAR);
			setState(1861);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT64:
				{
				setState(1859);
				int32();
				}
				break;
			case SQSTRING:
			case ID:
				{
				setState(1860);
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
		enterRule(_localctx, 224, RULE_instr_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			match(INSTR_I);
			setState(1864);
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
		enterRule(_localctx, 226, RULE_instr_i8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			match(INSTR_I8);
			setState(1867);
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
		enterRule(_localctx, 228, RULE_instr_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			match(INSTR_R);
			setState(1876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FLOAT32:
			case K_FLOAT64:
			case FLOAT64:
				{
				setState(1870);
				((Instr_rContext)_localctx).f = float64();
				}
				break;
			case INT64:
				{
				setState(1871);
				((Instr_rContext)_localctx).i = int64();
				}
				break;
			case T__4:
				{
				setState(1872);
				match(T__4);
				setState(1873);
				((Instr_rContext)_localctx).b = bytes();
				setState(1874);
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
		enterRule(_localctx, 230, RULE_instr_brtarget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			match(INSTR_BRTARGET);
			setState(1881);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQSTRING:
			case ID:
				{
				setState(1879);
				id();
				}
				break;
			case INT64:
				{
				setState(1880);
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
		enterRule(_localctx, 232, RULE_instr_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			match(INSTR_METHOD);
			setState(1884);
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
		enterRule(_localctx, 234, RULE_instr_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			match(INSTR_FIELD);
			setState(1887);
			type(0);
			setState(1891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1888);
				typeSpec();
				setState(1889);
				match(DCOLON);
				}
				break;
			}
			setState(1893);
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
		enterRule(_localctx, 236, RULE_instr_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			match(INSTR_TYPE);
			setState(1896);
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
		enterRule(_localctx, 238, RULE_instr_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			match(INSTR_STRING);
			setState(1909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QSTRING:
				{
				setState(1899);
				compQstring(0);
				}
				break;
			case K_ANSI:
				{
				setState(1900);
				match(K_ANSI);
				setState(1901);
				match(T__4);
				setState(1902);
				compQstring(0);
				setState(1903);
				match(T__5);
				}
				break;
			case K_BYTEARRAY:
				{
				setState(1905);
				bytearrayhead();
				setState(1906);
				bytes();
				setState(1907);
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
		enterRule(_localctx, 240, RULE_instr_sig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			match(INSTR_SIG);
			setState(1912);
			callConv();
			setState(1913);
			type(0);
			setState(1914);
			match(T__4);
			setState(1915);
			sigArgs0();
			setState(1916);
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
		enterRule(_localctx, 242, RULE_instr_tok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			match(INSTR_TOK);
			setState(1919);
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
		enterRule(_localctx, 244, RULE_instr_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			match(INSTR_SWITCH);
			setState(1922);
			match(T__4);
			setState(1923);
			labels();
			setState(1924);
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
		enterRule(_localctx, 246, RULE_instr);
		try {
			setState(1939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSTR_NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1926);
				instr_none();
				}
				break;
			case INSTR_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1927);
				instr_var();
				}
				break;
			case INSTR_I:
				enterOuterAlt(_localctx, 3);
				{
				setState(1928);
				instr_i();
				}
				break;
			case INSTR_I8:
				enterOuterAlt(_localctx, 4);
				{
				setState(1929);
				instr_i8();
				}
				break;
			case INSTR_R:
				enterOuterAlt(_localctx, 5);
				{
				setState(1930);
				instr_r();
				}
				break;
			case INSTR_BRTARGET:
				enterOuterAlt(_localctx, 6);
				{
				setState(1931);
				instr_brtarget();
				}
				break;
			case INSTR_METHOD:
				enterOuterAlt(_localctx, 7);
				{
				setState(1932);
				instr_method();
				}
				break;
			case INSTR_FIELD:
				enterOuterAlt(_localctx, 8);
				{
				setState(1933);
				instr_field();
				}
				break;
			case INSTR_TYPE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1934);
				instr_type();
				}
				break;
			case INSTR_STRING:
				enterOuterAlt(_localctx, 10);
				{
				setState(1935);
				instr_string();
				}
				break;
			case INSTR_SIG:
				enterOuterAlt(_localctx, 11);
				{
				setState(1936);
				instr_sig();
				}
				break;
			case INSTR_TOK:
				enterOuterAlt(_localctx, 12);
				{
				setState(1937);
				instr_tok();
				}
				break;
			case INSTR_SWITCH:
				enterOuterAlt(_localctx, 13);
				{
				setState(1938);
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
		enterRule(_localctx, 248, RULE_labels);
		try {
			setState(1952);
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
				setState(1942);
				id();
				setState(1943);
				match(T__3);
				setState(1944);
				labels();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1946);
				int32();
				setState(1947);
				match(T__3);
				setState(1948);
				labels();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1950);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1951);
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
		enterRule(_localctx, 250, RULE_tyArgs0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
			match(T__10);
			setState(1955);
			tyArgs1();
			setState(1956);
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
		enterRule(_localctx, 252, RULE_tyArgs1);
		try {
			setState(1960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__18:
			case T__19:
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
				setState(1959);
				tyArgs2();
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
		TyArgs2Context _localctx = new TyArgs2Context(_ctx, getState());
		enterRule(_localctx, 254, RULE_tyArgs2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			type(0);
			setState(1967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1963);
					match(T__3);
					setState(1964);
					type(0);
					}
					} 
				}
				setState(1969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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
		enterRule(_localctx, 256, RULE_sigArgs0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__18) | (1L << T__19) | (1L << ELIPSIS) | (1L << K_VOID) | (1L << K_BOOL) | (1L << K_CHAR) | (1L << K_UNSIGNED) | (1L << K_INT8) | (1L << K_INT16) | (1L << K_INT32) | (1L << K_INT64) | (1L << K_FLOAT32) | (1L << K_FLOAT64) | (1L << K_UINT8) | (1L << K_UINT16) | (1L << K_UINT32) | (1L << K_UINT64) | (1L << K_OBJECT) | (1L << K_STRING) | (1L << K_CLASS) | (1L << K_TYPEDREF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (K_VALUE - 69)) | (1L << (K_VALUETYPE - 69)) | (1L << (K_NATIVE - 69)) | (1L << (K_METHOD - 69)))) != 0)) {
				{
				setState(1970);
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
		enterRule(_localctx, 258, RULE_sigArgs1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			sigArg();
			setState(1978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1974);
					match(T__3);
					setState(1975);
					sigArg();
					}
					} 
				}
				setState(1980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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
		public List<ParamAttrContext> paramAttr() {
			return getRuleContexts(ParamAttrContext.class);
		}
		public ParamAttrContext paramAttr(int i) {
			return getRuleContext(ParamAttrContext.class,i);
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
		enterRule(_localctx, 260, RULE_sigArg);
		int _la;
		try {
			int _alt;
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1981);
				match(ELIPSIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1982);
						paramAttr();
						}
						} 
					}
					setState(1987);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(1988);
				type(0);
				setState(1989);
				marshalClause();
				setState(1991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQSTRING || _la==ID) {
					{
					setState(1990);
					id();
					}
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
		enterRule(_localctx, 262, RULE_className);
		try {
			setState(2020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1995);
				match(T__8);
				setState(1996);
				dottedName();
				setState(1997);
				match(T__9);
				setState(1998);
				slashedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2000);
				match(T__8);
				setState(2001);
				mdtoken();
				setState(2002);
				match(T__9);
				setState(2003);
				slashedName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2005);
				match(T__8);
				setState(2006);
				match(T__15);
				setState(2007);
				match(T__9);
				setState(2008);
				slashedName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2009);
				match(T__8);
				setState(2010);
				match(D_MODULE);
				setState(2011);
				dottedName();
				setState(2012);
				match(T__9);
				setState(2013);
				slashedName();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2015);
				slashedName();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2016);
				mdtoken();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2017);
				match(D_THIS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2018);
				match(D_BASE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2019);
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
		enterRule(_localctx, 264, RULE_slashedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			dottedName();
			setState(2027);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2023);
					match(T__17);
					setState(2024);
					dottedName();
					}
					} 
				}
				setState(2029);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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
		enterRule(_localctx, 266, RULE_typeSpec);
		try {
			setState(2041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2030);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2031);
				match(T__8);
				setState(2032);
				dottedName();
				setState(2033);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2035);
				match(T__8);
				setState(2036);
				match(D_MODULE);
				setState(2037);
				dottedName();
				setState(2038);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2040);
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
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_nativeType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(2044);
				match(K_CUSTOM);
				setState(2045);
				match(T__4);
				setState(2046);
				compQstring(0);
				setState(2047);
				match(T__3);
				setState(2048);
				compQstring(0);
				setState(2049);
				match(T__3);
				setState(2050);
				compQstring(0);
				setState(2051);
				match(T__3);
				setState(2052);
				compQstring(0);
				setState(2053);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(2055);
				match(K_CUSTOM);
				setState(2056);
				match(T__4);
				setState(2057);
				compQstring(0);
				setState(2058);
				match(T__3);
				setState(2059);
				compQstring(0);
				setState(2060);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(2062);
				match(K_FIXED);
				setState(2063);
				match(K_SYSSTRING);
				setState(2064);
				match(T__8);
				setState(2065);
				int32();
				setState(2066);
				match(T__9);
				}
				break;
			case 5:
				{
				setState(2068);
				match(K_FIXED);
				setState(2069);
				match(K_ARRAY);
				setState(2070);
				match(T__8);
				setState(2071);
				int32();
				setState(2072);
				match(T__9);
				setState(2073);
				nativeType(50);
				}
				break;
			case 6:
				{
				setState(2075);
				match(K_VARIANT);
				}
				break;
			case 7:
				{
				setState(2076);
				match(K_CURRENCY);
				}
				break;
			case 8:
				{
				setState(2077);
				match(K_SYSCHAR);
				}
				break;
			case 9:
				{
				setState(2078);
				match(K_VOID);
				}
				break;
			case 10:
				{
				setState(2079);
				match(K_BOOL);
				}
				break;
			case 11:
				{
				setState(2080);
				match(K_INT8);
				}
				break;
			case 12:
				{
				setState(2081);
				match(K_INT16);
				}
				break;
			case 13:
				{
				setState(2082);
				match(K_INT32);
				}
				break;
			case 14:
				{
				setState(2083);
				match(K_INT64);
				}
				break;
			case 15:
				{
				setState(2084);
				match(K_FLOAT32);
				}
				break;
			case 16:
				{
				setState(2085);
				match(K_FLOAT64);
				}
				break;
			case 17:
				{
				setState(2086);
				match(K_ERROR);
				}
				break;
			case 18:
				{
				setState(2087);
				match(K_UNSIGNED);
				setState(2088);
				match(K_INT8);
				}
				break;
			case 19:
				{
				setState(2089);
				match(K_UNSIGNED);
				setState(2090);
				match(K_INT16);
				}
				break;
			case 20:
				{
				setState(2091);
				match(K_UNSIGNED);
				setState(2092);
				match(K_INT32);
				}
				break;
			case 21:
				{
				setState(2093);
				match(K_UNSIGNED);
				setState(2094);
				match(K_INT64);
				}
				break;
			case 22:
				{
				setState(2095);
				match(K_UINT8);
				}
				break;
			case 23:
				{
				setState(2096);
				match(K_UINT16);
				}
				break;
			case 24:
				{
				setState(2097);
				match(K_UINT32);
				}
				break;
			case 25:
				{
				setState(2098);
				match(K_UINT64);
				}
				break;
			case 26:
				{
				setState(2099);
				match(K_DECIMAL);
				}
				break;
			case 27:
				{
				setState(2100);
				match(K_DATE);
				}
				break;
			case 28:
				{
				setState(2101);
				match(K_BSTR);
				}
				break;
			case 29:
				{
				setState(2102);
				match(K_LPSTR);
				}
				break;
			case 30:
				{
				setState(2103);
				match(K_LPWSTR);
				}
				break;
			case 31:
				{
				setState(2104);
				match(K_LPTSTR);
				}
				break;
			case 32:
				{
				setState(2105);
				match(K_OBJECTREF);
				}
				break;
			case 33:
				{
				setState(2106);
				match(K_IUNKNOWN);
				setState(2107);
				iidParamIndex();
				}
				break;
			case 34:
				{
				setState(2108);
				match(K_IDISPATCH);
				setState(2109);
				iidParamIndex();
				}
				break;
			case 35:
				{
				setState(2110);
				match(K_STRUCT);
				}
				break;
			case 36:
				{
				setState(2111);
				match(K_INTERFACE);
				setState(2112);
				iidParamIndex();
				}
				break;
			case 37:
				{
				setState(2113);
				match(K_SAFEARRAY);
				setState(2114);
				variantType(0);
				}
				break;
			case 38:
				{
				setState(2115);
				match(K_SAFEARRAY);
				setState(2116);
				variantType(0);
				setState(2117);
				match(T__3);
				setState(2118);
				compQstring(0);
				}
				break;
			case 39:
				{
				setState(2120);
				match(K_INT);
				}
				break;
			case 40:
				{
				setState(2121);
				match(K_UNSIGNED);
				setState(2122);
				match(K_INT);
				}
				break;
			case 41:
				{
				setState(2123);
				match(K_UINT);
				}
				break;
			case 42:
				{
				setState(2124);
				match(K_NESTED);
				setState(2125);
				match(K_STRUCT);
				}
				break;
			case 43:
				{
				setState(2126);
				match(K_BYVALSTR);
				}
				break;
			case 44:
				{
				setState(2127);
				match(K_ANSI);
				setState(2128);
				match(K_BSTR);
				}
				break;
			case 45:
				{
				setState(2129);
				match(K_TBSTR);
				}
				break;
			case 46:
				{
				setState(2130);
				match(K_VARIANT);
				setState(2131);
				match(K_BOOL);
				}
				break;
			case 47:
				{
				setState(2132);
				match(K_METHOD);
				}
				break;
			case 48:
				{
				setState(2133);
				match(K_AS);
				setState(2134);
				match(K_ANY);
				}
				break;
			case 49:
				{
				setState(2135);
				match(K_LPSTRUCT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2138);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(2139);
						match(T__15);
						}
						break;
					case 2:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2140);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(2141);
						match(T__8);
						setState(2142);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2143);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(2144);
						match(T__8);
						setState(2145);
						int32();
						setState(2146);
						match(T__9);
						}
						break;
					case 4:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2148);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(2149);
						match(T__8);
						setState(2150);
						int32();
						setState(2151);
						match(T__2);
						setState(2152);
						int32();
						setState(2153);
						match(T__9);
						}
						break;
					case 5:
						{
						_localctx = new NativeTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nativeType);
						setState(2155);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(2156);
						match(T__8);
						setState(2157);
						match(T__2);
						setState(2158);
						int32();
						setState(2159);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(2165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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
		enterRule(_localctx, 270, RULE_iidParamIndex);
		try {
			setState(2173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2167);
				match(T__4);
				setState(2168);
				match(K_IIDPARAM);
				setState(2169);
				match(T__7);
				setState(2170);
				int32();
				setState(2171);
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
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_variantType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(2176);
				match(K_NULL);
				}
				break;
			case 3:
				{
				setState(2177);
				match(K_VARIANT);
				}
				break;
			case 4:
				{
				setState(2178);
				match(K_CURRENCY);
				}
				break;
			case 5:
				{
				setState(2179);
				match(K_VOID);
				}
				break;
			case 6:
				{
				setState(2180);
				match(K_BOOL);
				}
				break;
			case 7:
				{
				setState(2181);
				match(K_INT8);
				}
				break;
			case 8:
				{
				setState(2182);
				match(K_INT16);
				}
				break;
			case 9:
				{
				setState(2183);
				match(K_INT32);
				}
				break;
			case 10:
				{
				setState(2184);
				match(K_INT64);
				}
				break;
			case 11:
				{
				setState(2185);
				match(K_FLOAT32);
				}
				break;
			case 12:
				{
				setState(2186);
				match(K_FLOAT64);
				}
				break;
			case 13:
				{
				setState(2187);
				match(K_UNSIGNED);
				setState(2188);
				match(K_INT8);
				}
				break;
			case 14:
				{
				setState(2189);
				match(K_UNSIGNED);
				setState(2190);
				match(K_INT16);
				}
				break;
			case 15:
				{
				setState(2191);
				match(K_UNSIGNED);
				setState(2192);
				match(K_INT32);
				}
				break;
			case 16:
				{
				setState(2193);
				match(K_UNSIGNED);
				setState(2194);
				match(K_INT64);
				}
				break;
			case 17:
				{
				setState(2195);
				match(K_UINT8);
				}
				break;
			case 18:
				{
				setState(2196);
				match(K_UINT16);
				}
				break;
			case 19:
				{
				setState(2197);
				match(K_UINT32);
				}
				break;
			case 20:
				{
				setState(2198);
				match(K_UINT64);
				}
				break;
			case 21:
				{
				setState(2199);
				match(T__15);
				}
				break;
			case 22:
				{
				setState(2200);
				match(K_DECIMAL);
				}
				break;
			case 23:
				{
				setState(2201);
				match(K_DATE);
				}
				break;
			case 24:
				{
				setState(2202);
				match(K_BSTR);
				}
				break;
			case 25:
				{
				setState(2203);
				match(K_LPSTR);
				}
				break;
			case 26:
				{
				setState(2204);
				match(K_LPWSTR);
				}
				break;
			case 27:
				{
				setState(2205);
				match(K_IUNKNOWN);
				}
				break;
			case 28:
				{
				setState(2206);
				match(K_IDISPATCH);
				}
				break;
			case 29:
				{
				setState(2207);
				match(K_SAFEARRAY);
				}
				break;
			case 30:
				{
				setState(2208);
				match(K_INT);
				}
				break;
			case 31:
				{
				setState(2209);
				match(K_UNSIGNED);
				setState(2210);
				match(K_INT);
				}
				break;
			case 32:
				{
				setState(2211);
				match(K_UINT);
				}
				break;
			case 33:
				{
				setState(2212);
				match(K_ERROR);
				}
				break;
			case 34:
				{
				setState(2213);
				match(K_HRESULT);
				}
				break;
			case 35:
				{
				setState(2214);
				match(K_CARRAY);
				}
				break;
			case 36:
				{
				setState(2215);
				match(K_USERDEFINED);
				}
				break;
			case 37:
				{
				setState(2216);
				match(K_RECORD);
				}
				break;
			case 38:
				{
				setState(2217);
				match(K_FILETIME);
				}
				break;
			case 39:
				{
				setState(2218);
				match(K_BLOB);
				}
				break;
			case 40:
				{
				setState(2219);
				match(K_STREAM);
				}
				break;
			case 41:
				{
				setState(2220);
				match(K_STORAGE);
				}
				break;
			case 42:
				{
				setState(2221);
				match(K_STREAMED_OBJECT);
				}
				break;
			case 43:
				{
				setState(2222);
				match(K_STORED_OBJECT);
				}
				break;
			case 44:
				{
				setState(2223);
				match(K_BLOB_OBJECT);
				}
				break;
			case 45:
				{
				setState(2224);
				match(K_CF);
				}
				break;
			case 46:
				{
				setState(2225);
				match(K_CLSID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
					case 1:
						{
						_localctx = new VariantTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variantType);
						setState(2228);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(2229);
						match(T__8);
						setState(2230);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new VariantTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variantType);
						setState(2231);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(2232);
						match(K_VECTOR);
						}
						break;
					case 3:
						{
						_localctx = new VariantTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variantType);
						setState(2233);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(2234);
						match(T__16);
						}
						break;
					}
					} 
				}
				setState(2239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeObjectContext extends TypeContext {
		public TerminalNode K_OBJECT() { return getToken(CilParser.K_OBJECT, 0); }
		public TypeObjectContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeManageRefContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeManageRefContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeManageRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeManageRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeManageRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDeRefContext extends TypeContext {
		public TerminalNode K_TYPEDREF() { return getToken(CilParser.K_TYPEDREF, 0); }
		public TypeDeRefContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeDeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeDeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeDeRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeGenericContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TyArgs1Context tyArgs1() {
			return getRuleContext(TyArgs1Context.class,0);
		}
		public TypeGenericContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeGeneric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeGeneric(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeNativeContext extends TypeContext {
		public TerminalNode K_NATIVE() { return getToken(CilParser.K_NATIVE, 0); }
		public TerminalNode K_UINT() { return getToken(CilParser.K_UINT, 0); }
		public TerminalNode K_INT() { return getToken(CilParser.K_INT, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(CilParser.K_UNSIGNED, 0); }
		public TypeNativeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeNative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeNative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeNative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeModContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode K_MODREQ() { return getToken(CilParser.K_MODREQ, 0); }
		public TerminalNode K_MODOPT() { return getToken(CilParser.K_MODOPT, 0); }
		public TypeModContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypePinndedContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode K_PINNED() { return getToken(CilParser.K_PINNED, 0); }
		public TypePinndedContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypePinnded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypePinnded(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypePinnded(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElipsisContext extends TypeContext {
		public TerminalNode ELIPSIS() { return getToken(CilParser.ELIPSIS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ElipsisContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterElipsis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitElipsis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitElipsis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeArrayContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Bounds1Context bounds1() {
			return getRuleContext(Bounds1Context.class,0);
		}
		public TypeArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeU4Context extends TypeContext {
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TypeU4Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeU4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeU4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeU4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeU3Context extends TypeContext {
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TypeU3Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeU3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeU3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeU3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeClassContext extends TypeContext {
		public TerminalNode K_CLASS() { return getToken(CilParser.K_CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode K_VALUE() { return getToken(CilParser.K_VALUE, 0); }
		public TypeClassContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeClass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeMethodContext extends TypeContext {
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
		public TypeMethodContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeU2Context extends TypeContext {
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public TypeU2Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeU2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeU2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeU2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeU1Context extends TypeContext {
		public Int32Context int32() {
			return getRuleContext(Int32Context.class,0);
		}
		public TypeU1Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeU1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeU1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeU1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeValueTypeContext extends TypeContext {
		public TerminalNode K_VALUETYPE() { return getToken(CilParser.K_VALUETYPE, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TypeValueTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeValueType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeValueType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotTunContext extends TypeContext {
		public NotTunContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterNotTun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitNotTun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitNotTun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeUnmanagedRefContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeUnmanagedRefContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeUnmanagedRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeUnmanagedRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeUnmanagedRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypePrimitiveContext extends TypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypePrimitiveContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypePrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypePrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypePrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeVoidContext extends TypeContext {
		public TerminalNode K_VOID() { return getToken(CilParser.K_VOID, 0); }
		public TypeVoidContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).enterTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CilListener ) ((CilListener)listener).exitTypeVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CilVisitor ) return ((CilVisitor<? extends T>)visitor).visitTypeVoid(this);
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
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				_localctx = new TypeClassContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VALUE) {
					{
					setState(2241);
					match(K_VALUE);
					}
				}

				setState(2244);
				match(K_CLASS);
				setState(2245);
				className();
				}
				break;
			case 2:
				{
				_localctx = new TypeObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2246);
				match(K_OBJECT);
				}
				break;
			case 3:
				{
				_localctx = new TypeValueTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2247);
				match(K_VALUETYPE);
				setState(2248);
				className();
				}
				break;
			case 4:
				{
				_localctx = new TypeMethodContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2249);
				methodSpec();
				setState(2250);
				callConv();
				setState(2251);
				type(0);
				setState(2252);
				match(T__15);
				setState(2253);
				match(T__4);
				setState(2254);
				sigArgs0();
				setState(2255);
				match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new TypeU1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2257);
				match(T__18);
				setState(2258);
				match(T__18);
				setState(2259);
				int32();
				}
				break;
			case 6:
				{
				_localctx = new TypeU2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2260);
				match(T__18);
				setState(2261);
				int32();
				}
				break;
			case 7:
				{
				_localctx = new TypeU3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2262);
				match(T__18);
				setState(2263);
				match(T__18);
				setState(2264);
				dottedName();
				}
				break;
			case 8:
				{
				_localctx = new TypeU4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2265);
				match(T__18);
				setState(2266);
				dottedName();
				}
				break;
			case 9:
				{
				_localctx = new TypeDeRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2267);
				match(K_TYPEDREF);
				}
				break;
			case 10:
				{
				_localctx = new TypeVoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2268);
				match(K_VOID);
				}
				break;
			case 11:
				{
				_localctx = new TypeNativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2269);
				match(K_NATIVE);
				setState(2275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(2270);
					match(K_UINT);
					}
					break;
				case 2:
					{
					setState(2272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_UNSIGNED) {
						{
						setState(2271);
						match(K_UNSIGNED);
						}
					}

					setState(2274);
					match(K_INT);
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new TypePrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2277);
				simpleType();
				}
				break;
			case 13:
				{
				_localctx = new ElipsisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2278);
				match(ELIPSIS);
				setState(2279);
				type(2);
				}
				break;
			case 14:
				{
				_localctx = new NotTunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2280);
				match(T__19);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2306);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						_localctx = new TypeArrayContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2283);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2284);
						match(T__8);
						setState(2286);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
						case 1:
							{
							setState(2285);
							bounds1(0);
							}
							break;
						}
						setState(2288);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new TypeManageRefContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2289);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2290);
						match(T__16);
						}
						break;
					case 3:
						{
						_localctx = new TypeUnmanagedRefContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2291);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2292);
						match(T__15);
						}
						break;
					case 4:
						{
						_localctx = new TypePinndedContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2293);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2294);
						match(K_PINNED);
						}
						break;
					case 5:
						{
						_localctx = new TypeModContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2295);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2296);
						_la = _input.LA(1);
						if ( !(_la==K_MODREQ || _la==K_MODOPT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2297);
						match(T__4);
						setState(2298);
						typeSpec();
						setState(2299);
						match(T__5);
						}
						break;
					case 6:
						{
						_localctx = new TypeGenericContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(2301);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2302);
						match(T__10);
						setState(2303);
						tyArgs1();
						setState(2304);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(2310);
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
		enterRule(_localctx, 276, RULE_simpleType);
		try {
			setState(2332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2311);
				match(K_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2312);
				match(K_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2313);
				match(K_BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2314);
				match(K_INT8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2315);
				match(K_INT16);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2316);
				match(K_INT32);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2317);
				match(K_INT64);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2318);
				match(K_FLOAT32);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2319);
				match(K_FLOAT64);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2320);
				match(K_UNSIGNED);
				setState(2321);
				match(K_INT8);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2322);
				match(K_UNSIGNED);
				setState(2323);
				match(K_INT16);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2324);
				match(K_UNSIGNED);
				setState(2325);
				match(K_INT32);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2326);
				match(K_UNSIGNED);
				setState(2327);
				match(K_INT64);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2328);
				match(K_UINT8);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2329);
				match(K_UINT16);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2330);
				match(K_UINT32);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2331);
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
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_bounds1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2335);
			bound();
			}
			_ctx.stop = _input.LT(-1);
			setState(2342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bounds1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bounds1);
					setState(2337);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2338);
					match(T__3);
					setState(2339);
					bound();
					}
					} 
				}
				setState(2344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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
		enterRule(_localctx, 280, RULE_bound);
		try {
			setState(2354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2346);
				match(ELIPSIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2347);
				int32();
				setState(2349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(2348);
					match(ELIPSIS);
					}
					break;
				}
				setState(2352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(2351);
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
		enterRule(_localctx, 282, RULE_secDecl);
		try {
			setState(2390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2356);
				match(D_PERMISSION);
				setState(2357);
				secAction();
				setState(2358);
				typeSpec();
				setState(2359);
				match(T__4);
				setState(2360);
				nameValPairs();
				setState(2361);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				match(D_PERMISSION);
				setState(2364);
				secAction();
				setState(2365);
				typeSpec();
				setState(2366);
				match(T__7);
				setState(2367);
				match(T__0);
				setState(2368);
				customBlobDescr();
				setState(2369);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2371);
				match(D_PERMISSION);
				setState(2372);
				secAction();
				setState(2373);
				typeSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2375);
				psetHead();
				setState(2376);
				bytes();
				setState(2377);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2379);
				match(D_PERMISSIONSET);
				setState(2380);
				secAction();
				setState(2381);
				compQstring(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2383);
				match(D_PERMISSIONSET);
				setState(2384);
				secAction();
				setState(2385);
				match(T__7);
				setState(2386);
				match(T__0);
				setState(2387);
				secAttrSetBlob();
				setState(2388);
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
		enterRule(_localctx, 284, RULE_secAttrSetBlob);
		try {
			setState(2398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2393);
				secAttrBlob();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2394);
				secAttrBlob();
				setState(2395);
				match(T__3);
				setState(2396);
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
		enterRule(_localctx, 286, RULE_secAttrBlob);
		try {
			setState(2413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2400);
				typeSpec();
				setState(2401);
				match(T__7);
				setState(2402);
				match(T__0);
				setState(2403);
				customBlobNVPairs();
				setState(2404);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2406);
				match(K_CLASS);
				setState(2407);
				match(SQSTRING);
				setState(2408);
				match(T__7);
				setState(2409);
				match(T__0);
				setState(2410);
				customBlobNVPairs();
				setState(2411);
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
		enterRule(_localctx, 288, RULE_psetHead);
		try {
			setState(2425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2415);
				match(D_PERMISSIONSET);
				setState(2416);
				secAction();
				setState(2417);
				match(T__7);
				setState(2418);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2420);
				match(D_PERMISSIONSET);
				setState(2421);
				secAction();
				setState(2422);
				match(K_BYTEARRAY);
				setState(2423);
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
		enterRule(_localctx, 290, RULE_nameValPairs);
		try {
			setState(2432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2427);
				nameValPair();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2428);
				nameValPair();
				setState(2429);
				match(T__3);
				setState(2430);
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
		enterRule(_localctx, 292, RULE_nameValPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			compQstring(0);
			setState(2435);
			match(T__7);
			setState(2436);
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
		enterRule(_localctx, 294, RULE_truefalse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
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
		enterRule(_localctx, 296, RULE_caValue);
		try {
			setState(2474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2440);
				truefalse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2441);
				int32();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2442);
				match(K_INT32);
				setState(2443);
				match(T__4);
				setState(2444);
				int32();
				setState(2445);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2447);
				compQstring(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2448);
				className();
				setState(2449);
				match(T__4);
				setState(2450);
				match(K_INT8);
				setState(2451);
				match(T__14);
				setState(2452);
				int32();
				setState(2453);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2455);
				className();
				setState(2456);
				match(T__4);
				setState(2457);
				match(K_INT16);
				setState(2458);
				match(T__14);
				setState(2459);
				int32();
				setState(2460);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2462);
				className();
				setState(2463);
				match(T__4);
				setState(2464);
				match(K_INT32);
				setState(2465);
				match(T__14);
				setState(2466);
				int32();
				setState(2467);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2469);
				className();
				setState(2470);
				match(T__4);
				setState(2471);
				int32();
				setState(2472);
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
		enterRule(_localctx, 298, RULE_secAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			_la = _input.LA(1);
			if ( !(((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (K_REQUEST - 179)) | (1L << (K_DEMAND - 179)) | (1L << (K_ASSERT - 179)) | (1L << (K_DENY - 179)) | (1L << (K_PERMITONLY - 179)) | (1L << (K_LINKCHECK - 179)) | (1L << (K_INHERITCHECK - 179)) | (1L << (K_REQMIN - 179)) | (1L << (K_REQOPT - 179)) | (1L << (K_REQREFUSE - 179)) | (1L << (K_PREJITGRANT - 179)) | (1L << (K_PREJITDENY - 179)) | (1L << (K_NONCASDEMAND - 179)) | (1L << (K_NONCASLINKDEMAND - 179)) | (1L << (K_NONCASINHERITANCE - 179)))) != 0)) ) {
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
		enterRule(_localctx, 300, RULE_esHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2478);
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
		enterRule(_localctx, 302, RULE_extSourceSpec);
		try {
			setState(2551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2480);
				esHead();
				setState(2481);
				int32();
				setState(2482);
				match(SQSTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2484);
				esHead();
				setState(2485);
				int32();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2487);
				esHead();
				setState(2488);
				int32();
				setState(2489);
				match(T__14);
				setState(2490);
				int32();
				setState(2491);
				match(SQSTRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2493);
				esHead();
				setState(2494);
				int32();
				setState(2495);
				match(T__14);
				setState(2496);
				int32();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2498);
				esHead();
				setState(2499);
				int32();
				setState(2500);
				match(T__14);
				setState(2501);
				int32();
				setState(2502);
				match(T__3);
				setState(2503);
				int32();
				setState(2504);
				match(SQSTRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2506);
				esHead();
				setState(2507);
				int32();
				setState(2508);
				match(T__14);
				setState(2509);
				int32();
				setState(2510);
				match(T__3);
				setState(2511);
				int32();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2513);
				esHead();
				setState(2514);
				int32();
				setState(2515);
				match(T__3);
				setState(2516);
				int32();
				setState(2517);
				match(T__14);
				setState(2518);
				int32();
				setState(2519);
				match(SQSTRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2521);
				esHead();
				setState(2522);
				int32();
				setState(2523);
				match(T__3);
				setState(2524);
				int32();
				setState(2525);
				match(T__14);
				setState(2526);
				int32();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2528);
				esHead();
				setState(2529);
				int32();
				setState(2530);
				match(T__3);
				setState(2531);
				int32();
				setState(2532);
				match(T__14);
				setState(2533);
				int32();
				setState(2534);
				match(T__3);
				setState(2535);
				int32();
				setState(2536);
				match(SQSTRING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2538);
				esHead();
				setState(2539);
				int32();
				setState(2540);
				match(T__3);
				setState(2541);
				int32();
				setState(2542);
				match(T__14);
				setState(2543);
				int32();
				setState(2544);
				match(T__3);
				setState(2545);
				int32();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2547);
				esHead();
				setState(2548);
				int32();
				setState(2549);
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
		enterRule(_localctx, 304, RULE_fileDecl);
		try {
			setState(2567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2553);
				match(D_FILE);
				setState(2554);
				fileAttr(0);
				setState(2555);
				dottedName();
				setState(2556);
				fileEntry();
				setState(2557);
				hashHead();
				setState(2558);
				bytes();
				setState(2559);
				match(T__5);
				setState(2560);
				fileEntry();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2562);
				match(D_FILE);
				setState(2563);
				fileAttr(0);
				setState(2564);
				dottedName();
				setState(2565);
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
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_fileAttr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(2574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FileAttrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fileAttr);
					setState(2570);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2571);
					match(K_NOMETADATA);
					}
					} 
				}
				setState(2576);
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
		enterRule(_localctx, 308, RULE_fileEntry);
		try {
			setState(2579);
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
				setState(2578);
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
		enterRule(_localctx, 310, RULE_hashHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2581);
			match(D_HASH);
			setState(2582);
			match(T__7);
			setState(2583);
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
		enterRule(_localctx, 312, RULE_assemblyHead);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2585);
			match(D_ASSEMBLY);
			setState(2589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2586);
					asmAttr();
					}
					} 
				}
				setState(2591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(2592);
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
		enterRule(_localctx, 314, RULE_asmAttr);
		try {
			setState(2604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RETARGETABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2594);
				match(K_RETARGETABLE);
				}
				break;
			case K_WINDOWSRUNTIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(2595);
				match(K_WINDOWSRUNTIME);
				}
				break;
			case K_NOPLATFORM:
				enterOuterAlt(_localctx, 3);
				{
				setState(2596);
				match(K_NOPLATFORM);
				}
				break;
			case K_LEGACY:
				enterOuterAlt(_localctx, 4);
				{
				setState(2597);
				match(K_LEGACY);
				setState(2598);
				match(K_LIBRARY);
				}
				break;
			case K_CIL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2599);
				match(K_CIL);
				}
				break;
			case K_X86:
				enterOuterAlt(_localctx, 6);
				{
				setState(2600);
				match(K_X86);
				}
				break;
			case K_AMD64:
				enterOuterAlt(_localctx, 7);
				{
				setState(2601);
				match(K_AMD64);
				}
				break;
			case K_ARM:
				enterOuterAlt(_localctx, 8);
				{
				setState(2602);
				match(K_ARM);
				}
				break;
			case K_ARM64:
				enterOuterAlt(_localctx, 9);
				{
				setState(2603);
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
		enterRule(_localctx, 316, RULE_assemblyDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2606);
					assemblyDecl();
					}
					} 
				}
				setState(2611);
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
		enterRule(_localctx, 318, RULE_assemblyDecl);
		try {
			setState(2617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(2612);
				match(D_HASH);
				setState(2613);
				match(K_ALGORITHM);
				setState(2614);
				int32();
				}
				break;
			case D_PERMISSION:
			case D_PERMISSIONSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(2615);
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
				setState(2616);
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
		enterRule(_localctx, 320, RULE_intOrWildcard);
		try {
			setState(2621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(2619);
				int32();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(2620);
				match(T__15);
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
		enterRule(_localctx, 322, RULE_asmOrRefDecl);
		try {
			setState(2644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2623);
				publicKeyHead();
				setState(2624);
				bytes();
				setState(2625);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2627);
				match(D_VER);
				setState(2628);
				intOrWildcard();
				setState(2629);
				match(T__14);
				setState(2630);
				intOrWildcard();
				setState(2631);
				match(T__14);
				setState(2632);
				intOrWildcard();
				setState(2633);
				match(T__14);
				setState(2634);
				intOrWildcard();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2636);
				match(D_LOCALE);
				setState(2637);
				compQstring(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2638);
				localeHead();
				setState(2639);
				bytes();
				setState(2640);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2642);
				customAttrDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2643);
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
		enterRule(_localctx, 324, RULE_publicKeyHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2646);
			match(D_PUBLICKEY);
			setState(2647);
			match(T__7);
			setState(2648);
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
		enterRule(_localctx, 326, RULE_publicKeyTokenHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2650);
			match(D_PUBLICKEYTOKEN);
			setState(2651);
			match(T__7);
			setState(2652);
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
		enterRule(_localctx, 328, RULE_localeHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2654);
			match(D_LOCALE);
			setState(2655);
			match(T__7);
			setState(2656);
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
		enterRule(_localctx, 330, RULE_assemblyRefHead);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			match(D_ASSEMBLY);
			setState(2659);
			match(K_EXTERN);
			setState(2663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2660);
					asmAttr();
					}
					} 
				}
				setState(2665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(2666);
			dottedName();
			setState(2669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(2667);
				match(K_AS);
				setState(2668);
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
		enterRule(_localctx, 332, RULE_assemblyRefDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2671);
					assemblyRefDecl();
					}
					} 
				}
				setState(2676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
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
		enterRule(_localctx, 334, RULE_assemblyRefDecl);
		try {
			setState(2687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(2677);
				hashHead();
				setState(2678);
				bytes();
				setState(2679);
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
				setState(2681);
				asmOrRefDecl();
				}
				break;
			case D_PUBLICKEYTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(2682);
				publicKeyTokenHead();
				setState(2683);
				bytes();
				setState(2684);
				match(T__5);
				}
				break;
			case K_AUTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(2686);
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
		enterRule(_localctx, 336, RULE_exptypeHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2689);
			match(D_CLASS);
			setState(2690);
			match(K_EXTERN);
			setState(2691);
			exptAttr();
			setState(2692);
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
		enterRule(_localctx, 338, RULE_exportHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2694);
			match(D_EXPORT);
			setState(2695);
			exptAttr();
			setState(2696);
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
		enterRule(_localctx, 340, RULE_exptAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_FORWARDER - 74)) | (1L << (K_PUBLIC - 74)) | (1L << (K_PRIVATE - 74)) | (1L << (K_NESTED - 74)))) != 0)) {
				{
				setState(2713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(2698);
					match(K_PRIVATE);
					}
					break;
				case 2:
					{
					setState(2699);
					match(K_PUBLIC);
					}
					break;
				case 3:
					{
					setState(2700);
					match(K_FORWARDER);
					}
					break;
				case 4:
					{
					setState(2701);
					match(K_NESTED);
					setState(2702);
					match(K_PUBLIC);
					}
					break;
				case 5:
					{
					setState(2703);
					match(K_NESTED);
					setState(2704);
					match(K_PRIVATE);
					}
					break;
				case 6:
					{
					setState(2705);
					match(K_NESTED);
					setState(2706);
					match(K_FAMILY);
					}
					break;
				case 7:
					{
					setState(2707);
					match(K_NESTED);
					setState(2708);
					match(K_ASSEMBLY);
					}
					break;
				case 8:
					{
					setState(2709);
					match(K_NESTED);
					setState(2710);
					match(K_FAMANDASSEM);
					}
					break;
				case 9:
					{
					setState(2711);
					match(K_NESTED);
					setState(2712);
					match(K_FAMORASSEM);
					}
					break;
				}
				}
				setState(2717);
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
		enterRule(_localctx, 342, RULE_exptypeDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2718);
					exptypeDecl();
					}
					} 
				}
				setState(2723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
		enterRule(_localctx, 344, RULE_exptypeDecl);
		try {
			setState(2741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2724);
				match(D_FILE);
				setState(2725);
				dottedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2726);
				match(D_CLASS);
				setState(2727);
				match(K_EXTERN);
				setState(2728);
				slashedName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2729);
				match(D_ASSEMBLY);
				setState(2730);
				match(K_EXTERN);
				setState(2731);
				dottedName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2732);
				match(K_MDTOKEN);
				setState(2733);
				match(T__4);
				setState(2734);
				int32();
				setState(2735);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2737);
				match(D_CLASS);
				setState(2738);
				int32();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2739);
				customAttrDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2740);
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
		enterRule(_localctx, 346, RULE_manifestResHead);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2743);
			match(D_MRESOURCE);
			setState(2747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2744);
					manresAttr();
					}
					} 
				}
				setState(2749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			setState(2750);
			dottedName();
			setState(2753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(2751);
				match(K_AS);
				setState(2752);
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
		enterRule(_localctx, 348, RULE_manresAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2755);
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
		enterRule(_localctx, 350, RULE_manifestResDecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2757);
					manifestResDecl();
					}
					} 
				}
				setState(2762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
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
		enterRule(_localctx, 352, RULE_manifestResDecl);
		try {
			setState(2773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2763);
				match(D_FILE);
				setState(2764);
				dottedName();
				setState(2765);
				match(K_AT);
				setState(2766);
				int32();
				}
				break;
			case D_ASSEMBLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2768);
				match(D_ASSEMBLY);
				setState(2769);
				match(K_EXTERN);
				setState(2770);
				dottedName();
				}
				break;
			case D_CUSTOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(2771);
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
				setState(2772);
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
		case 99:
			return f32seq_sempred((F32seqContext)_localctx, predIndex);
		case 100:
			return f64seq_sempred((F64seqContext)_localctx, predIndex);
		case 101:
			return i64seq_sempred((I64seqContext)_localctx, predIndex);
		case 102:
			return i32seq_sempred((I32seqContext)_localctx, predIndex);
		case 103:
			return i16seq_sempred((I16seqContext)_localctx, predIndex);
		case 104:
			return i8seq_sempred((I8seqContext)_localctx, predIndex);
		case 105:
			return boolSeq_sempred((BoolSeqContext)_localctx, predIndex);
		case 106:
			return sqstringSeq_sempred((SqstringSeqContext)_localctx, predIndex);
		case 107:
			return classSeq_sempred((ClassSeqContext)_localctx, predIndex);
		case 108:
			return objSeq_sempred((ObjSeqContext)_localctx, predIndex);
		case 134:
			return nativeType_sempred((NativeTypeContext)_localctx, predIndex);
		case 136:
			return variantType_sempred((VariantTypeContext)_localctx, predIndex);
		case 137:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 139:
			return bounds1_sempred((Bounds1Context)_localctx, predIndex);
		case 153:
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
	private boolean f32seq_sempred(F32seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean f64seq_sempred(F64seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i64seq_sempred(I64seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i32seq_sempred(I32seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i16seq_sempred(I16seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean i8seq_sempred(I8seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolSeq_sempred(BoolSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sqstringSeq_sempred(SqstringSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 2);
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean classSeq_sempred(ClassSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 3);
		case 25:
			return precpred(_ctx, 2);
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean objSeq_sempred(ObjSeqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean nativeType_sempred(NativeTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 29);
		case 29:
			return precpred(_ctx, 28);
		case 30:
			return precpred(_ctx, 27);
		case 31:
			return precpred(_ctx, 26);
		case 32:
			return precpred(_ctx, 25);
		}
		return true;
	}
	private boolean variantType_sempred(VariantTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 28);
		case 34:
			return precpred(_ctx, 27);
		case 35:
			return precpred(_ctx, 26);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 17);
		case 37:
			return precpred(_ctx, 16);
		case 38:
			return precpred(_ctx, 15);
		case 39:
			return precpred(_ctx, 14);
		case 40:
			return precpred(_ctx, 13);
		case 41:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean bounds1_sempred(Bounds1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fileAttr_sempred(FileAttrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0130\u0ada\4\2\t"+
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
		"\t\u00b2\3\2\7\2\u0166\n\2\f\2\16\2\u0169\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u01ab\n\3\3\4\3\4\3\4\3\4\5\4\u01b1\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5\u01b9\n\5\f\5\16\5\u01bc\13\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01ca\n\6\3\7\3\7\3\b\3\b\3\b\5\b"+
		"\u01d1\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u01e2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u01f1\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u01f8\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0205\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u020c\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u021b\n\16\3\17\3\17\5\17\u021f\n\17\3\20\3\20\3\20\3"+
		"\21\3\21\7\21\u0226\n\21\f\21\16\21\u0229\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u0232\n\22\f\22\16\22\u0235\13\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0244\n\25\3\25"+
		"\3\25\3\25\7\25\u0249\n\25\f\25\16\25\u024c\13\25\3\26\3\26\5\26\u0250"+
		"\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0267\n\30\f\30\16\30\u026a"+
		"\13\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\7\35\u027b\n\35\f\35\16\35\u027e\13\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u02a1\n\37\3 \3 \5 \u02a5\n \3!\3!\3!\5!\u02aa\n!\3\"\7\"\u02ad"+
		"\n\"\f\"\16\"\u02b0\13\"\3#\3#\3#\3#\3#\3#\7#\u02b8\n#\f#\16#\u02bb\13"+
		"#\3$\3$\5$\u02bf\n$\3%\3%\3%\3%\3%\3%\7%\u02c7\n%\f%\16%\u02ca\13%\3&"+
		"\3&\3&\3&\3&\5&\u02d1\n&\3\'\3\'\3(\3(\3(\3(\5(\u02d9\n(\3)\3)\5)\u02dd"+
		"\n)\3)\3)\3)\3*\3*\3*\5*\u02e5\n*\3+\3+\3+\3+\3,\3,\5,\u02ed\n,\3-\3-"+
		"\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\5.\u033b\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0346\n.\3."+
		"\3.\5.\u034a\n.\3.\3.\3.\3.\3.\5.\u0351\n.\3/\3/\3/\7/\u0356\n/\f/\16"+
		"/\u0359\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u0377\n\60\3\61\3\61\3\61\5\61\u037c\n\61\3\62\3\62\3\62\5\62\u0381"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\5\63\u0388\n\63\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u038f\n\64\3\64\3\64\3\64\5\64\u0394\n\64\3\64\3\64\3\64\3\64\3"+
		"\65\7\65\u039b\n\65\f\65\16\65\u039e\13\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\5\65\u03a6\n\65\3\66\3\66\3\66\3\66\5\66\u03ac\n\66\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u03c1\n8\39\3"+
		"9\39\39\39\39\39\39\39\59\u03cc\n9\3:\3:\3:\3:\3:\7:\u03d3\n:\f:\16:\u03d6"+
		"\13:\3;\7;\u03d9\n;\f;\16;\u03dc\13;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\5<\u03ea\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\7>\u03fb"+
		"\n>\f>\16>\u03fe\13>\3?\7?\u0401\n?\f?\16?\u0404\13?\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\5@\u0410\n@\3A\3A\3A\3A\3A\3A\5A\u0418\nA\3B\3B\3B\3B\3"+
		"B\5B\u041f\nB\3C\3C\3D\3D\7D\u0425\nD\fD\16D\u0428\13D\3D\3D\7D\u042c"+
		"\nD\fD\16D\u042f\13D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u0439\nD\fD\16D\u043c"+
		"\13D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\5E\u0459\nE\3E\3E\5E\u045d\nE\3E\7E\u0460\nE\fE\16E\u0463"+
		"\13E\3E\5E\u0466\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0483\nF\3G\3G\3G\5G\u0488\nG\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0497\nH\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u04ac\nI\3J\3J\3K\7K\u04b1\nK\f"+
		"K\16K\u04b4\13K\3L\3L\3L\3L\3L\3L\3L\5L\u04bd\nL\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\5L\u04c9\nL\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04d7\nL"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04e3\nL\3L\3L\3L\3L\3L\3L\3L\3L\5L"+
		"\u04ed\nL\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04f7\nL\3L\3L\3L\3L\3L\3L\5L\u04ff"+
		"\nL\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0509\nL\5L\u050b\nL\3M\3M\3M\3M\3N\3N"+
		"\3O\3O\3O\3P\3P\3P\3P\5P\u051a\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0526"+
		"\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0534\nR\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\5S\u053f\nS\3T\3T\3U\3U\3U\3V\3V\3W\3W\3X\3X\3X\3X\5X\u054e"+
		"\nX\3X\3X\3X\5X\u0553\nX\5X\u0555\nX\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z"+
		"\u0561\nZ\3[\3[\3[\5[\u0566\n[\3\\\3\\\3\\\3\\\3\\\5\\\u056d\n\\\3]\3"+
		"]\3]\3]\3]\5]\u0574\n]\3^\3^\3^\3^\3^\5^\u057b\n^\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u05bc\n_\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0620"+
		"\n`\3a\3a\3a\3b\3b\3c\3c\3c\5c\u062a\nc\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u06e4\nd\3e\3e\3e\3e\3e\7e"+
		"\u06eb\ne\fe\16e\u06ee\13e\3f\3f\3f\3f\3f\7f\u06f5\nf\ff\16f\u06f8\13"+
		"f\3g\3g\3g\7g\u06fd\ng\fg\16g\u0700\13g\3h\3h\3h\7h\u0705\nh\fh\16h\u0708"+
		"\13h\3i\3i\3i\7i\u070d\ni\fi\16i\u0710\13i\3j\3j\3j\7j\u0715\nj\fj\16"+
		"j\u0718\13j\3k\3k\3k\7k\u071d\nk\fk\16k\u0720\13k\3l\3l\3l\3l\3l\7l\u0727"+
		"\nl\fl\16l\u072a\13l\3m\3m\3m\3m\3m\3m\3m\3m\7m\u0734\nm\fm\16m\u0737"+
		"\13m\3n\3n\3n\7n\u073c\nn\fn\16n\u073f\13n\3o\3o\3p\3p\3q\3q\3q\5q\u0748"+
		"\nq\3r\3r\3r\3s\3s\3s\3t\3t\3t\3t\3t\3t\3t\5t\u0757\nt\3u\3u\3u\5u\u075c"+
		"\nu\3v\3v\3v\3w\3w\3w\3w\3w\5w\u0766\nw\3w\3w\3x\3x\3x\3y\3y\3y\3y\3y"+
		"\3y\3y\3y\3y\3y\3y\5y\u0778\ny\3z\3z\3z\3z\3z\3z\3z\3{\3{\3{\3|\3|\3|"+
		"\3|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0796\n}\3~\3~\3~\3~"+
		"\3~\3~\3~\3~\3~\3~\3~\5~\u07a3\n~\3\177\3\177\3\177\3\177\3\u0080\3\u0080"+
		"\5\u0080\u07ab\n\u0080\3\u0081\3\u0081\3\u0081\7\u0081\u07b0\n\u0081\f"+
		"\u0081\16\u0081\u07b3\13\u0081\3\u0082\5\u0082\u07b6\n\u0082\3\u0083\3"+
		"\u0083\3\u0083\7\u0083\u07bb\n\u0083\f\u0083\16\u0083\u07be\13\u0083\3"+
		"\u0084\3\u0084\7\u0084\u07c2\n\u0084\f\u0084\16\u0084\u07c5\13\u0084\3"+
		"\u0084\3\u0084\3\u0084\5\u0084\u07ca\n\u0084\5\u0084\u07cc\n\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u07e7\n\u0085"+
		"\3\u0086\3\u0086\3\u0086\7\u0086\u07ec\n\u0086\f\u0086\16\u0086\u07ef"+
		"\13\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u07fc\n\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u085b\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\7\u0088"+
		"\u0874\n\u0088\f\u0088\16\u0088\u0877\13\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0880\n\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u08b5\n\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\7\u008a\u08be\n\u008a\f\u008a"+
		"\16\u008a\u08c1\13\u008a\3\u008b\3\u008b\5\u008b\u08c5\n\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\5\u008b\u08e3\n\u008b\3\u008b\5\u008b\u08e6\n\u008b\3\u008b\3\u008b\3"+
		"\u008b\3\u008b\5\u008b\u08ec\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u08f1"+
		"\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\7\u008b\u0905\n\u008b\f\u008b\16\u008b\u0908\13\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u091f\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\7\u008d\u0927\n\u008d\f\u008d\16\u008d\u092a\13\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0930\n\u008e\3\u008e\5\u008e"+
		"\u0933\n\u008e\5\u008e\u0935\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\5\u008f\u0959\n\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\5\u0090\u0961\n\u0090\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u0970\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u097c\n\u0092\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u0983\n\u0093\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\5\u0096\u09ad\n\u0096\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u09fa\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0a0a"+
		"\n\u009a\3\u009b\3\u009b\3\u009b\7\u009b\u0a0f\n\u009b\f\u009b\16\u009b"+
		"\u0a12\13\u009b\3\u009c\3\u009c\5\u009c\u0a16\n\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009e\3\u009e\7\u009e\u0a1e\n\u009e\f\u009e\16\u009e"+
		"\u0a21\13\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0a2f\n\u009f\3\u00a0"+
		"\7\u00a0\u0a32\n\u00a0\f\u00a0\16\u00a0\u0a35\13\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u0a3c\n\u00a1\3\u00a2\3\u00a2\5\u00a2"+
		"\u0a40\n\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0a57\n\u00a3\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u0a68\n\u00a7\f\u00a7"+
		"\16\u00a7\u0a6b\13\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0a70\n\u00a7"+
		"\3\u00a8\7\u00a8\u0a73\n\u00a8\f\u00a8\16\u00a8\u0a76\13\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\5\u00a9\u0a82\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\7\u00ac\u0a9c\n\u00ac\f\u00ac\16\u00ac\u0a9f\13\u00ac\3\u00ad\7\u00ad"+
		"\u0aa2\n\u00ad\f\u00ad\16\u00ad\u0aa5\13\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0ab8\n\u00ae\3\u00af"+
		"\3\u00af\7\u00af\u0abc\n\u00af\f\u00af\16\u00af\u0abf\13\u00af\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u0ac4\n\u00af\3\u00b0\3\u00b0\3\u00b1\7\u00b1"+
		"\u0ac9\n\u00b1\f\u00b1\16\u00b1\u0acc\13\u00b1\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0ad8"+
		"\n\u00b2\3\u00b2\32\u0227\u0233\u027c\u02ae\u0357\u039c\u03da\u0402\u0426"+
		"\u042d\u043a\u0461\u04b2\u07b1\u07bc\u07c3\u07ed\u0a1f\u0a33\u0a69\u0a74"+
		"\u0aa3\u0abd\u0aca\30\b(.DHrz\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u010e\u0112\u0114\u0118\u0134\u00b3\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\2\16\3\2\u0128\u0129"+
		"\4\2kkpp\4\2NPrt\7\2\5\5\17\17\67\67HHzz\4\2qq\u0122\u0122\4\2JJYY\4\2"+
		"\62\62\64\66\3\2mn\3\2DE\3\2\u00b5\u00c3\3\2\u00c4\u00c5\3\2NO\2\u0c88"+
		"\2\u0167\3\2\2\2\4\u01aa\3\2\2\2\6\u01b0\3\2\2\2\b\u01b2\3\2\2\2\n\u01c9"+
		"\3\2\2\2\f\u01cb\3\2\2\2\16\u01d0\3\2\2\2\20\u01d2\3\2\2\2\22\u01d4\3"+
		"\2\2\2\24\u01e1\3\2\2\2\26\u01e3\3\2\2\2\30\u0204\3\2\2\2\32\u0206\3\2"+
		"\2\2\34\u021e\3\2\2\2\36\u0220\3\2\2\2 \u0227\3\2\2\2\"\u0233\3\2\2\2"+
		"$\u0236\3\2\2\2&\u0238\3\2\2\2(\u0243\3\2\2\2*\u024d\3\2\2\2,\u0253\3"+
		"\2\2\2.\u025b\3\2\2\2\60\u026b\3\2\2\2\62\u026f\3\2\2\2\64\u0273\3\2\2"+
		"\2\66\u0276\3\2\2\28\u0278\3\2\2\2:\u0282\3\2\2\2<\u02a0\3\2\2\2>\u02a4"+
		"\3\2\2\2@\u02a9\3\2\2\2B\u02ae\3\2\2\2D\u02b1\3\2\2\2F\u02be\3\2\2\2H"+
		"\u02c0\3\2\2\2J\u02d0\3\2\2\2L\u02d2\3\2\2\2N\u02d8\3\2\2\2P\u02da\3\2"+
		"\2\2R\u02e4\3\2\2\2T\u02e6\3\2\2\2V\u02ec\3\2\2\2X\u02ee\3\2\2\2Z\u0350"+
		"\3\2\2\2\\\u0352\3\2\2\2^\u0376\3\2\2\2`\u037b\3\2\2\2b\u0380\3\2\2\2"+
		"d\u0387\3\2\2\2f\u0389\3\2\2\2h\u039c\3\2\2\2j\u03ab\3\2\2\2l\u03ad\3"+
		"\2\2\2n\u03c0\3\2\2\2p\u03cb\3\2\2\2r\u03cd\3\2\2\2t\u03da\3\2\2\2v\u03e9"+
		"\3\2\2\2x\u03eb\3\2\2\2z\u03f5\3\2\2\2|\u0402\3\2\2\2~\u040f\3\2\2\2\u0080"+
		"\u0417\3\2\2\2\u0082\u041e\3\2\2\2\u0084\u0420\3\2\2\2\u0086\u0422\3\2"+
		"\2\2\u0088\u0465\3\2\2\2\u008a\u0482\3\2\2\2\u008c\u0487\3\2\2\2\u008e"+
		"\u0496\3\2\2\2\u0090\u04ab\3\2\2\2\u0092\u04ad\3\2\2\2\u0094\u04b2\3\2"+
		"\2\2\u0096\u050a\3\2\2\2\u0098\u050c\3\2\2\2\u009a\u0510\3\2\2\2\u009c"+
		"\u0512\3\2\2\2\u009e\u0519\3\2\2\2\u00a0\u051b\3\2\2\2\u00a2\u0533\3\2"+
		"\2\2\u00a4\u053e\3\2\2\2\u00a6\u0540\3\2\2\2\u00a8\u0542\3\2\2\2\u00aa"+
		"\u0545\3\2\2\2\u00ac\u0547\3\2\2\2\u00ae\u0554\3\2\2\2\u00b0\u0556\3\2"+
		"\2\2\u00b2\u0560\3\2\2\2\u00b4\u0565\3\2\2\2\u00b6\u056c\3\2\2\2\u00b8"+
		"\u0573\3\2\2\2\u00ba\u057a\3\2\2\2\u00bc\u05bb\3\2\2\2\u00be\u061f\3\2"+
		"\2\2\u00c0\u0621\3\2\2\2\u00c2\u0624\3\2\2\2\u00c4\u0629\3\2\2\2\u00c6"+
		"\u06e3\3\2\2\2\u00c8\u06e5\3\2\2\2\u00ca\u06ef\3\2\2\2\u00cc\u06f9\3\2"+
		"\2\2\u00ce\u0701\3\2\2\2\u00d0\u0709\3\2\2\2\u00d2\u0711\3\2\2\2\u00d4"+
		"\u0719\3\2\2\2\u00d6\u0721\3\2\2\2\u00d8\u072b\3\2\2\2\u00da\u0738\3\2"+
		"\2\2\u00dc\u0740\3\2\2\2\u00de\u0742\3\2\2\2\u00e0\u0744\3\2\2\2\u00e2"+
		"\u0749\3\2\2\2\u00e4\u074c\3\2\2\2\u00e6\u074f\3\2\2\2\u00e8\u0758\3\2"+
		"\2\2\u00ea\u075d\3\2\2\2\u00ec\u0760\3\2\2\2\u00ee\u0769\3\2\2\2\u00f0"+
		"\u076c\3\2\2\2\u00f2\u0779\3\2\2\2\u00f4\u0780\3\2\2\2\u00f6\u0783\3\2"+
		"\2\2\u00f8\u0795\3\2\2\2\u00fa\u07a2\3\2\2\2\u00fc\u07a4\3\2\2\2\u00fe"+
		"\u07aa\3\2\2\2\u0100\u07ac\3\2\2\2\u0102\u07b5\3\2\2\2\u0104\u07b7\3\2"+
		"\2\2\u0106\u07cb\3\2\2\2\u0108\u07e6\3\2\2\2\u010a\u07e8\3\2\2\2\u010c"+
		"\u07fb\3\2\2\2\u010e\u085a\3\2\2\2\u0110\u087f\3\2\2\2\u0112\u08b4\3\2"+
		"\2\2\u0114\u08eb\3\2\2\2\u0116\u091e\3\2\2\2\u0118\u0920\3\2\2\2\u011a"+
		"\u0934\3\2\2\2\u011c\u0958\3\2\2\2\u011e\u0960\3\2\2\2\u0120\u096f\3\2"+
		"\2\2\u0122\u097b\3\2\2\2\u0124\u0982\3\2\2\2\u0126\u0984\3\2\2\2\u0128"+
		"\u0988\3\2\2\2\u012a\u09ac\3\2\2\2\u012c\u09ae\3\2\2\2\u012e\u09b0\3\2"+
		"\2\2\u0130\u09f9\3\2\2\2\u0132\u0a09\3\2\2\2\u0134\u0a0b\3\2\2\2\u0136"+
		"\u0a15\3\2\2\2\u0138\u0a17\3\2\2\2\u013a\u0a1b\3\2\2\2\u013c\u0a2e\3\2"+
		"\2\2\u013e\u0a33\3\2\2\2\u0140\u0a3b\3\2\2\2\u0142\u0a3f\3\2\2\2\u0144"+
		"\u0a56\3\2\2\2\u0146\u0a58\3\2\2\2\u0148\u0a5c\3\2\2\2\u014a\u0a60\3\2"+
		"\2\2\u014c\u0a64\3\2\2\2\u014e\u0a74\3\2\2\2\u0150\u0a81\3\2\2\2\u0152"+
		"\u0a83\3\2\2\2\u0154\u0a88\3\2\2\2\u0156\u0a9d\3\2\2\2\u0158\u0aa3\3\2"+
		"\2\2\u015a\u0ab7\3\2\2\2\u015c\u0ab9\3\2\2\2\u015e\u0ac5\3\2\2\2\u0160"+
		"\u0aca\3\2\2\2\u0162\u0ad7\3\2\2\2\u0164\u0166\5\4\3\2\u0165\u0164\3\2"+
		"\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\3\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\5:\36\2\u016b\u016c\7\3\2\2"+
		"\u016c\u016d\5B\"\2\u016d\u016e\7\4\2\2\u016e\u01ab\3\2\2\2\u016f\u0170"+
		"\5\64\33\2\u0170\u0171\7\3\2\2\u0171\u0172\5\2\2\2\u0172\u0173\7\4\2\2"+
		"\u0173\u01ab\3\2\2\2\u0174\u0175\5\u0086D\2\u0175\u0176\7\3\2\2\u0176"+
		"\u0177\5\u0094K\2\u0177\u0178\7\4\2\2\u0178\u01ab\3\2\2\2\u0179\u01ab"+
		"\5\\/\2\u017a\u01ab\5\u00b0Y\2\u017b\u01ab\5\60\31\2\u017c\u01ab\5,\27"+
		"\2\u017d\u01ab\5\u0130\u0099\2\u017e\u01ab\5\u0132\u009a\2\u017f\u0180"+
		"\5\u013a\u009e\2\u0180\u0181\7\3\2\2\u0181\u0182\5\u013e\u00a0\2\u0182"+
		"\u0183\7\4\2\2\u0183\u01ab\3\2\2\2\u0184\u0185\5\u014c\u00a7\2\u0185\u0186"+
		"\7\3\2\2\u0186\u0187\5\u014e\u00a8\2\u0187\u0188\7\4\2\2\u0188\u01ab\3"+
		"\2\2\2\u0189\u018a\5\u0152\u00aa\2\u018a\u018b\7\3\2\2\u018b\u018c\5\u0158"+
		"\u00ad\2\u018c\u018d\7\4\2\2\u018d\u01ab\3\2\2\2\u018e\u018f\5\u015c\u00af"+
		"\2\u018f\u0190\7\3\2\2\u0190\u0191\5\u0160\u00b1\2\u0191\u0192\7\4\2\2"+
		"\u0192\u01ab\3\2\2\2\u0193\u01ab\5*\26\2\u0194\u01ab\5\u011c\u008f\2\u0195"+
		"\u01ab\5&\24\2\u0196\u0197\7\u0112\2\2\u0197\u01ab\5\20\t\2\u0198\u0199"+
		"\7\u0113\2\2\u0199\u01ab\5\20\t\2\u019a\u019b\7\u00d1\2\2\u019b\u019c"+
		"\7\u0114\2\2\u019c\u01ab\5\20\t\2\u019d\u019e\7\u0115\2\2\u019e\u01ab"+
		"\5\22\n\2\u019f\u01a0\7\u0116\2\2\u01a0\u01ab\5\22\n\2\u01a1\u01ab\5\n"+
		"\6\2\u01a2\u01ab\5\26\f\2\u01a3\u01ab\5\30\r\2\u01a4\u01a5\7\u0119\2\2"+
		"\u01a5\u01a6\7\3\2\2\u01a6\u01a7\5\6\4\2\u01a7\u01a8\7\4\2\2\u01a8\u01ab"+
		"\3\2\2\2\u01a9\u01ab\7\u011a\2\2\u01aa\u016a\3\2\2\2\u01aa\u016f\3\2\2"+
		"\2\u01aa\u0174\3\2\2\2\u01aa\u0179\3\2\2\2\u01aa\u017a\3\2\2\2\u01aa\u017b"+
		"\3\2\2\2\u01aa\u017c\3\2\2\2\u01aa\u017d\3\2\2\2\u01aa\u017e\3\2\2\2\u01aa"+
		"\u017f\3\2\2\2\u01aa\u0184\3\2\2\2\u01aa\u0189\3\2\2\2\u01aa\u018e\3\2"+
		"\2\2\u01aa\u0193\3\2\2\2\u01aa\u0194\3\2\2\2\u01aa\u0195\3\2\2\2\u01aa"+
		"\u0196\3\2\2\2\u01aa\u0198\3\2\2\2\u01aa\u019a\3\2\2\2\u01aa\u019d\3\2"+
		"\2\2\u01aa\u019f\3\2\2\2\u01aa\u01a1\3\2\2\2\u01aa\u01a2\3\2\2\2\u01aa"+
		"\u01a3\3\2\2\2\u01aa\u01a4\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\5\3\2\2\2"+
		"\u01ac\u01b1\3\2\2\2\u01ad\u01ae\5\u0108\u0085\2\u01ae\u01af\5\6\4\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b1\7\3\2\2\2"+
		"\u01b2\u01b3\b\5\1\2\u01b3\u01b4\7\u0127\2\2\u01b4\u01ba\3\2\2\2\u01b5"+
		"\u01b6\f\3\2\2\u01b6\u01b7\7\5\2\2\u01b7\u01b9\7\u0127\2\2\u01b8\u01b5"+
		"\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\t\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7\u00c6\2\2\u01be\u01ca\7\u0128"+
		"\2\2\u01bf\u01c0\7\u00c6\2\2\u01c0\u01c1\7\u0128\2\2\u01c1\u01c2\7\6\2"+
		"\2\u01c2\u01ca\7\u0128\2\2\u01c3\u01c4\7\u00c6\2\2\u01c4\u01c5\7\u0128"+
		"\2\2\u01c5\u01c6\7\6\2\2\u01c6\u01c7\7\u0128\2\2\u01c7\u01c8\7\6\2\2\u01c8"+
		"\u01ca\7\u0128\2\2\u01c9\u01bd\3\2\2\2\u01c9\u01bf\3\2\2\2\u01c9\u01c3"+
		"\3\2\2\2\u01ca\13\3\2\2\2\u01cb\u01cc\t\2\2\2\u01cc\r\3\2\2\2\u01cd\u01d1"+
		"\5\f\7\2\u01ce\u01d1\7\u012a\2\2\u01cf\u01d1\7\u012d\2\2\u01d0\u01cd\3"+
		"\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\17\3\2\2\2\u01d2"+
		"\u01d3\7\u012b\2\2\u01d3\21\3\2\2\2\u01d4\u01d5\7\u012b\2\2\u01d5\23\3"+
		"\2\2\2\u01d6\u01e2\7\u012c\2\2\u01d7\u01d8\7#\2\2\u01d8\u01d9\7\7\2\2"+
		"\u01d9\u01da\5\20\t\2\u01da\u01db\7\b\2\2\u01db\u01e2\3\2\2\2\u01dc\u01dd"+
		"\7$\2\2\u01dd\u01de\7\7\2\2\u01de\u01df\5\22\n\2\u01df\u01e0\7\b\2\2\u01e0"+
		"\u01e2\3\2\2\2\u01e1\u01d6\3\2\2\2\u01e1\u01d7\3\2\2\2\u01e1\u01dc\3\2"+
		"\2\2\u01e2\25\3\2\2\2\u01e3\u01f0\7\u0117\2\2\u01e4\u01e5\5\u0114\u008b"+
		"\2\u01e5\u01e6\7\u008a\2\2\u01e6\u01f1\3\2\2\2\u01e7\u01e8\5\u0108\u0085"+
		"\2\u01e8\u01e9\7\u008a\2\2\u01e9\u01f1\3\2\2\2\u01ea\u01eb\5n8\2\u01eb"+
		"\u01ec\7\u008a\2\2\u01ec\u01f1\3\2\2\2\u01ed\u01ee\5\32\16\2\u01ee\u01ef"+
		"\7\u008a\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01e4\3\2\2\2\u01f0\u01e7\3\2\2"+
		"\2\u01f0\u01ea\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3"+
		"\5\16\b\2\u01f3\27\3\2\2\2\u01f4\u01f5\7\u011b\2\2\u01f5\u01f7\5\16\b"+
		"\2\u01f6\u01f8\5\b\5\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0205"+
		"\3\2\2\2\u01f9\u01fa\7\u011c\2\2\u01fa\u0205\5\16\b\2\u01fb\u01fc\7\u011d"+
		"\2\2\u01fc\u0205\5\16\b\2\u01fd\u01fe\7\u011e\2\2\u01fe\u0205\5\16\b\2"+
		"\u01ff\u0205\7\u011f\2\2\u0200\u0205\7\u0120\2\2\u0201\u0202\7\u0121\2"+
		"\2\u0202\u0205\7\u0127\2\2\u0203\u0205\7\t\2\2\u0204\u01f4\3\2\2\2\u0204"+
		"\u01f9\3\2\2\2\u0204\u01fb\3\2\2\2\u0204\u01fd\3\2\2\2\u0204\u01ff\3\2"+
		"\2\2\u0204\u0200\3\2\2\2\u0204\u0201\3\2\2\2\u0204\u0203\3\2\2\2\u0205"+
		"\31\3\2\2\2\u0206\u020b\7\u00c7\2\2\u0207\u0208\7\7\2\2\u0208\u0209\5"+
		"\34\17\2\u0209\u020a\7\b\2\2\u020a\u020c\3\2\2\2\u020b\u0207\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u021a\5f\64\2\u020e\u020f\7\n"+
		"\2\2\u020f\u021b\5\b\5\2\u0210\u0211\7\n\2\2\u0211\u0212\7\3\2\2\u0212"+
		"\u0213\5\36\20\2\u0213\u0214\7\4\2\2\u0214\u021b\3\2\2\2\u0215\u0216\7"+
		"\n\2\2\u0216\u0217\7\7\2\2\u0217\u0218\5\u00c2b\2\u0218\u0219\7\b\2\2"+
		"\u0219\u021b\3\2\2\2\u021a\u020e\3\2\2\2\u021a\u0210\3\2\2\2\u021a\u0215"+
		"\3\2\2\2\u021b\33\3\2\2\2\u021c\u021f\5\u010c\u0087\2\u021d\u021f\5n8"+
		"\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021f\35\3\2\2\2\u0220\u0221"+
		"\5 \21\2\u0221\u0222\5\"\22\2\u0222\37\3\2\2\2\u0223\u0226\5\u00c6d\2"+
		"\u0224\u0226\5\30\r\2\u0225\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u0226\u0229"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228!\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022b\5$\23\2\u022b\u022c\5(\25\2\u022c\u022d\5\16"+
		"\b\2\u022d\u022e\7\n\2\2\u022e\u022f\5\u00c6d\2\u022f\u0232\3\2\2\2\u0230"+
		"\u0232\5\30\r\2\u0231\u022a\3\2\2\2\u0231\u0230\3\2\2\2\u0232\u0235\3"+
		"\2\2\2\u0233\u0234\3\2\2\2\u0233\u0231\3\2\2\2\u0234#\3\2\2\2\u0235\u0233"+
		"\3\2\2\2\u0236\u0237\t\3\2\2\u0237%\3\2\2\2\u0238\u0239\5\32\16\2\u0239"+
		"\'\3\2\2\2\u023a\u023b\b\25\1\2\u023b\u0244\5\u0116\u008c\2\u023c\u0244"+
		"\7q\2\2\u023d\u0244\7.\2\2\u023e\u023f\7^\2\2\u023f\u0240\7\67\2\2\u0240"+
		"\u0244\7\u0128\2\2\u0241\u0242\7^\2\2\u0242\u0244\5\u0108\u0085\2\u0243"+
		"\u023a\3\2\2\2\u0243\u023c\3\2\2\2\u0243\u023d\3\2\2\2\u0243\u023e\3\2"+
		"\2\2\u0243\u0241\3\2\2\2\u0244\u024a\3\2\2\2\u0245\u0246\f\3\2\2\u0246"+
		"\u0247\7\13\2\2\u0247\u0249\7\f\2\2\u0248\u0245\3\2\2\2\u0249\u024c\3"+
		"\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b)\3\2\2\2\u024c\u024a"+
		"\3\2\2\2\u024d\u024f\7\u00dc\2\2\u024e\u0250\7\u00da\2\2\u024f\u024e\3"+
		"\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\5\16\b\2\u0252"+
		"+\3\2\2\2\u0253\u0254\7\u00cc\2\2\u0254\u0255\7\13\2\2\u0255\u0256\5\20"+
		"\t\2\u0256\u0257\7\f\2\2\u0257\u0258\5.\30\2\u0258\u0259\7B\2\2\u0259"+
		"\u025a\5\f\7\2\u025a-\3\2\2\2\u025b\u0268\b\30\1\2\u025c\u025d\f\7\2\2"+
		"\u025d\u0267\7 \2\2\u025e\u025f\f\6\2\2\u025f\u0267\7!\2\2\u0260\u0261"+
		"\f\5\2\2\u0261\u0267\7\u00cd\2\2\u0262\u0263\f\4\2\2\u0263\u0267\7\u00ce"+
		"\2\2\u0264\u0265\f\3\2\2\u0265\u0267\7\u00d0\2\2\u0266\u025c\3\2\2\2\u0266"+
		"\u025e\3\2\2\2\u0266\u0260\3\2\2\2\u0266\u0262\3\2\2\2\u0266\u0264\3\2"+
		"\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"/\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c\5\62\32\2\u026c\u026d\5\u00c2"+
		"b\2\u026d\u026e\7\b\2\2\u026e\61\3\2\2\2\u026f\u0270\7\u00cb\2\2\u0270"+
		"\u0271\7\n\2\2\u0271\u0272\7\7\2\2\u0272\63\3\2\2\2\u0273\u0274\7\u009d"+
		"\2\2\u0274\u0275\5\16\b\2\u0275\65\3\2\2\2\u0276\u0277\7\u009c\2\2\u0277"+
		"\67\3\2\2\2\u0278\u027c\5\66\34\2\u0279\u027b\5<\37\2\u027a\u0279\3\2"+
		"\2\2\u027b\u027e\3\2\2\2\u027c\u027d\3\2\2\2\u027c\u027a\3\2\2\2\u027d"+
		"\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\5\16\b\2\u0280\u0281\5"+
		"J&\2\u02819\3\2\2\2\u0282\u0283\58\35\2\u0283\u0284\5> \2\u0284\u0285"+
		"\5@!\2\u0285;\3\2\2\2\u0286\u02a1\7N\2\2\u0287\u02a1\7O\2\2\u0288\u02a1"+
		"\7G\2\2\u0289\u02a1\7^\2\2\u028a\u02a1\7S\2\2\u028b\u02a1\7T\2\2\u028c"+
		"\u02a1\7V\2\2\u028d\u02a1\7W\2\2\u028e\u02a1\7X\2\2\u028f\u02a1\7Y\2\2"+
		"\u0290\u02a1\7Z\2\2\u0291\u02a1\7[\2\2\u0292\u02a1\7\\\2\2\u0293\u02a1"+
		"\7]\2\2\u0294\u02a1\7o\2\2\u0295\u02a1\7h\2\2\u0296\u0297\7U\2\2\u0297"+
		"\u02a1\t\4\2\2\u0298\u02a1\7e\2\2\u0299\u02a1\7K\2\2\u029a\u02a1\7x\2"+
		"\2\u029b\u029c\7+\2\2\u029c\u029d\7\7\2\2\u029d\u029e\5\20\t\2\u029e\u029f"+
		"\7\b\2\2\u029f\u02a1\3\2\2\2\u02a0\u0286\3\2\2\2\u02a0\u0287\3\2\2\2\u02a0"+
		"\u0288\3\2\2\2\u02a0\u0289\3\2\2\2\u02a0\u028a\3\2\2\2\u02a0\u028b\3\2"+
		"\2\2\u02a0\u028c\3\2\2\2\u02a0\u028d\3\2\2\2\u02a0\u028e\3\2\2\2\u02a0"+
		"\u028f\3\2\2\2\u02a0\u0290\3\2\2\2\u02a0\u0291\3\2\2\2\u02a0\u0292\3\2"+
		"\2\2\u02a0\u0293\3\2\2\2\u02a0\u0294\3\2\2\2\u02a0\u0295\3\2\2\2\u02a0"+
		"\u0296\3\2\2\2\u02a0\u0298\3\2\2\2\u02a0\u0299\3\2\2\2\u02a0\u029a\3\2"+
		"\2\2\u02a0\u029b\3\2\2\2\u02a1=\3\2\2\2\u02a2\u02a3\7?\2\2\u02a3\u02a5"+
		"\5\u010c\u0087\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5?\3\2\2"+
		"\2\u02a6\u02aa\3\2\2\2\u02a7\u02a8\7@\2\2\u02a8\u02aa\5D#\2\u02a9\u02a6"+
		"\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aaA\3\2\2\2\u02ab\u02ad\5Z.\2\u02ac\u02ab"+
		"\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02af\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af"+
		"C\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2\b#\1\2\u02b2\u02b3\5\u010c\u0087"+
		"\2\u02b3\u02b9\3\2\2\2\u02b4\u02b5\f\4\2\2\u02b5\u02b6\7\6\2\2\u02b6\u02b8"+
		"\5\u010c\u0087\2\u02b7\u02b4\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3"+
		"\2\2\2\u02b9\u02ba\3\2\2\2\u02baE\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bf"+
		"\3\2\2\2\u02bd\u02bf\5H%\2\u02be\u02bc\3\2\2\2\u02be\u02bd\3\2\2\2\u02bf"+
		"G\3\2\2\2\u02c0\u02c1\b%\1\2\u02c1\u02c2\5\u010c\u0087\2\u02c2\u02c8\3"+
		"\2\2\2\u02c3\u02c4\f\3\2\2\u02c4\u02c5\7\6\2\2\u02c5\u02c7\5\u010c\u0087"+
		"\2\u02c6\u02c3\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9I\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02d1\3\2\2\2\u02cc"+
		"\u02cd\7\r\2\2\u02cd\u02ce\5P)\2\u02ce\u02cf\7\16\2\2\u02cf\u02d1\3\2"+
		"\2\2\u02d0\u02cb\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d1K\3\2\2\2\u02d2\u02d3"+
		"\t\5\2\2\u02d3M\3\2\2\2\u02d4\u02d9\3\2\2\2\u02d5\u02d6\5L\'\2\u02d6\u02d7"+
		"\5N(\2\u02d7\u02d9\3\2\2\2\u02d8\u02d4\3\2\2\2\u02d8\u02d5\3\2\2\2\u02d9"+
		"O\3\2\2\2\u02da\u02dc\5N(\2\u02db\u02dd\5T+\2\u02dc\u02db\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\5\16\b\2\u02df\u02e0\5"+
		"R*\2\u02e0Q\3\2\2\2\u02e1\u02e5\3\2\2\2\u02e2\u02e3\7\6\2\2\u02e3\u02e5"+
		"\5P)\2\u02e4\u02e1\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5S\3\2\2\2\u02e6\u02e7"+
		"\7\7\2\2\u02e7\u02e8\5F$\2\u02e8\u02e9\7\b\2\2\u02e9U\3\2\2\2\u02ea\u02ed"+
		"\3\2\2\2\u02eb\u02ed\5X-\2\u02ec\u02ea\3\2\2\2\u02ec\u02eb\3\2\2\2\u02ed"+
		"W\3\2\2\2\u02ee\u02ef\7\r\2\2\u02ef\u02f0\7\13\2\2\u02f0\u02f1\5\20\t"+
		"\2\u02f1\u02f2\7\f\2\2\u02f2\u02f3\7\16\2\2\u02f3Y\3\2\2\2\u02f4\u02f5"+
		"\5\u0086D\2\u02f5\u02f6\7\3\2\2\u02f6\u02f7\5\u0094K\2\u02f7\u02f8\7\4"+
		"\2\2\u02f8\u0351\3\2\2\2\u02f9\u02fa\5:\36\2\u02fa\u02fb\7\3\2\2\u02fb"+
		"\u02fc\5B\"\2\u02fc\u02fd\7\4\2\2\u02fd\u0351\3\2\2\2\u02fe\u02ff\5p9"+
		"\2\u02ff\u0300\7\3\2\2\u0300\u0301\5t;\2\u0301\u0302\7\4\2\2\u0302\u0351"+
		"\3\2\2\2\u0303\u0304\5x=\2\u0304\u0305\7\3\2\2\u0305\u0306\5|?\2\u0306"+
		"\u0307\7\4\2\2\u0307\u0351\3\2\2\2\u0308\u0351\5\\/\2\u0309\u0351\5\u00b0"+
		"Y\2\u030a\u0351\5\u011c\u008f\2\u030b\u0351\5\u0130\u0099\2\u030c\u0351"+
		"\5&\24\2\u030d\u030e\7\u00c9\2\2\u030e\u0351\5\20\t\2\u030f\u0310\7\u00ca"+
		"\2\2\u0310\u0351\5\20\t\2\u0311\u0312\5\u0154\u00ab\2\u0312\u0313\7\3"+
		"\2\2\u0313\u0314\5\u0158\u00ad\2\u0314\u0315\7\4\2\2\u0315\u0351\3\2\2"+
		"\2\u0316\u033a\7\u0101\2\2\u0317\u0318\5\u010c\u0087\2\u0318\u0319\7\27"+
		"\2\2\u0319\u031a\5\u008cG\2\u031a\u031b\7\u0102\2\2\u031b\u031c\5h\65"+
		"\2\u031c\u031d\5\u0114\u008b\2\u031d\u031e\5\u010c\u0087\2\u031e\u031f"+
		"\7\27\2\2\u031f\u0320\5\u008cG\2\u0320\u0321\7\7\2\2\u0321\u0322\5\u0102"+
		"\u0082\2\u0322\u0323\7\b\2\2\u0323\u033b\3\2\2\2\u0324\u0325\7j\2\2\u0325"+
		"\u0326\5h\65\2\u0326\u0327\5\u0114\u008b\2\u0327\u0328\5\u010c\u0087\2"+
		"\u0328\u0329\7\27\2\2\u0329\u032a\5\u008cG\2\u032a\u032b\5V,\2\u032b\u032c"+
		"\7\7\2\2\u032c\u032d\5\u0102\u0082\2\u032d\u032e\7\b\2\2\u032e\u032f\7"+
		"\u0102\2\2\u032f\u0330\7j\2\2\u0330\u0331\5h\65\2\u0331\u0332\5\u0114"+
		"\u008b\2\u0332\u0333\5\u010c\u0087\2\u0333\u0334\7\27\2\2\u0334\u0335"+
		"\5\u008cG\2\u0335\u0336\5V,\2\u0336\u0337\7\7\2\2\u0337\u0338\5\u0102"+
		"\u0082\2\u0338\u0339\7\b\2\2\u0339\u033b\3\2\2\2\u033a\u0317\3\2\2\2\u033a"+
		"\u0324\3\2\2\2\u033b\u0351\3\2\2\2\u033c\u0351\5\n\6\2\u033d\u0351\5\30"+
		"\r\2\u033e\u033f\7\u0100\2\2\u033f\u0345\t\6\2\2\u0340\u0341\7\13\2\2"+
		"\u0341\u0342\5\20\t\2\u0342\u0343\7\f\2\2\u0343\u0346\3\2\2\2\u0344\u0346"+
		"\5\16\b\2\u0345\u0340\3\2\2\2\u0345\u0344\3\2\2\2\u0346\u0349\3\2\2\2"+
		"\u0347\u0348\7\6\2\2\u0348\u034a\5\u010c\u0087\2\u0349\u0347\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u0351\3\2\2\2\u034b\u034c\7F\2\2\u034c\u034d\7q\2"+
		"\2\u034d\u034e\5\u010c\u0087\2\u034e\u034f\5\32\16\2\u034f\u0351\3\2\2"+
		"\2\u0350\u02f4\3\2\2\2\u0350\u02f9\3\2\2\2\u0350\u02fe\3\2\2\2\u0350\u0303"+
		"\3\2\2\2\u0350\u0308\3\2\2\2\u0350\u0309\3\2\2\2\u0350\u030a\3\2\2\2\u0350"+
		"\u030b\3\2\2\2\u0350\u030c\3\2\2\2\u0350\u030d\3\2\2\2\u0350\u030f\3\2"+
		"\2\2\u0350\u0311\3\2\2\2\u0350\u0316\3\2\2\2\u0350\u033c\3\2\2\2\u0350"+
		"\u033d\3\2\2\2\u0350\u033e\3\2\2\2\u0350\u034b\3\2\2\2\u0351[\3\2\2\2"+
		"\u0352\u0353\7\u009f\2\2\u0353\u0357\5d\63\2\u0354\u0356\5^\60\2\u0355"+
		"\u0354\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0358\3\2\2\2\u0357\u0355\3\2"+
		"\2\2\u0358\u035a\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u035b\5\u0114\u008b"+
		"\2\u035b\u035c\5\16\b\2\u035c\u035d\5`\61\2\u035d\u035e\5b\62\2\u035e"+
		"]\3\2\2\2\u035f\u0377\7M\2\2\u0360\u0377\7N\2\2\u0361\u0377\7O\2\2\u0362"+
		"\u0377\7P\2\2\u0363\u0377\7~\2\2\u0364\u0377\7x\2\2\u0365\u0377\7K\2\2"+
		"\u0366\u0367\7\u00e4\2\2\u0367\u0368\7\7\2\2\u0368\u0369\5\u0082B\2\u0369"+
		"\u036a\7\b\2\2\u036a\u0377\3\2\2\2\u036b\u0377\7r\2\2\u036c\u0377\7s\2"+
		"\2\u036d\u0377\7t\2\2\u036e\u0377\7u\2\2\u036f\u0377\7|\2\2\u0370\u0377"+
		"\7}\2\2\u0371\u0372\7+\2\2\u0372\u0373\7\7\2\2\u0373\u0374\5\20\t\2\u0374"+
		"\u0375\7\b\2\2\u0375\u0377\3\2\2\2\u0376\u035f\3\2\2\2\u0376\u0360\3\2"+
		"\2\2\u0376\u0361\3\2\2\2\u0376\u0362\3\2\2\2\u0376\u0363\3\2\2\2\u0376"+
		"\u0364\3\2\2\2\u0376\u0365\3\2\2\2\u0376\u0366\3\2\2\2\u0376\u036b\3\2"+
		"\2\2\u0376\u036c\3\2\2\2\u0376\u036d\3\2\2\2\u0376\u036e\3\2\2\2\u0376"+
		"\u036f\3\2\2\2\u0376\u0370\3\2\2\2\u0376\u0371\3\2\2\2\u0377_\3\2\2\2"+
		"\u0378\u037c\3\2\2\2\u0379\u037a\7B\2\2\u037a\u037c\5\f\7\2\u037b\u0378"+
		"\3\2\2\2\u037b\u0379\3\2\2\2\u037ca\3\2\2\2\u037d\u0381\3\2\2\2\u037e"+
		"\u037f\7\n\2\2\u037f\u0381\5\u00c4c\2\u0380\u037d\3\2\2\2\u0380\u037e"+
		"\3\2\2\2\u0381c\3\2\2\2\u0382\u0388\3\2\2\2\u0383\u0384\7\13\2\2\u0384"+
		"\u0385\5\20\t\2\u0385\u0386\7\f\2\2\u0386\u0388\3\2\2\2\u0387\u0382\3"+
		"\2\2\2\u0387\u0383\3\2\2\2\u0388e\3\2\2\2\u0389\u038a\5h\65\2\u038a\u038e"+
		"\5\u0114\u008b\2\u038b\u038c\5\u010c\u0087\2\u038c\u038d\7\27\2\2\u038d"+
		"\u038f\3\2\2\2\u038e\u038b\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2"+
		"\2\2\u0390\u0393\5\u008cG\2\u0391\u0394\5\u00fc\177\2\u0392\u0394\5X-"+
		"\2\u0393\u0391\3\2\2\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395"+
		"\3\2\2\2\u0395\u0396\7\7\2\2\u0396\u0397\5\u0102\u0082\2\u0397\u0398\7"+
		"\b\2\2\u0398g\3\2\2\2\u0399\u039b\t\7\2\2\u039a\u0399\3\2\2\2\u039b\u039e"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u03a5\3\2\2\2\u039e"+
		"\u039c\3\2\2\2\u039f\u03a6\5j\66\2\u03a0\u03a1\7,\2\2\u03a1\u03a2\7\7"+
		"\2\2\u03a2\u03a3\5\20\t\2\u03a3\u03a4\7\b\2\2\u03a4\u03a6\3\2\2\2\u03a5"+
		"\u039f\3\2\2\2\u03a5\u03a0\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6i\3\2\2\2"+
		"\u03a7\u03ac\7\61\2\2\u03a8\u03ac\7\63\2\2\u03a9\u03aa\79\2\2\u03aa\u03ac"+
		"\t\b\2\2\u03ab\u03a7\3\2\2\2\u03ab\u03a8\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac"+
		"k\3\2\2\2\u03ad\u03ae\7-\2\2\u03ae\u03af\7\7\2\2\u03af\u03b0\5\20\t\2"+
		"\u03b0\u03b1\7\b\2\2\u03b1m\3\2\2\2\u03b2\u03b3\5\u00dco\2\u03b3\u03b4"+
		"\5f\64\2\u03b4\u03c1\3\2\2\2\u03b5\u03b6\7k\2\2\u03b6\u03b7\5\u0114\u008b"+
		"\2\u03b7\u03b8\5\u010c\u0087\2\u03b8\u03b9\7\27\2\2\u03b9\u03ba\5\16\b"+
		"\2\u03ba\u03c1\3\2\2\2\u03bb\u03bc\7k\2\2\u03bc\u03bd\5\u0114\u008b\2"+
		"\u03bd\u03be\5\16\b\2\u03be\u03c1\3\2\2\2\u03bf\u03c1\5l\67\2\u03c0\u03b2"+
		"\3\2\2\2\u03c0\u03b5\3\2\2\2\u03c0\u03bb\3\2\2\2\u03c0\u03bf\3\2\2\2\u03c1"+
		"o\3\2\2\2\u03c2\u03c3\7\u00aa\2\2\u03c3\u03c4\5r:\2\u03c4\u03c5\5\u010c"+
		"\u0087\2\u03c5\u03c6\5\16\b\2\u03c6\u03cc\3\2\2\2\u03c7\u03c8\7\u00aa"+
		"\2\2\u03c8\u03c9\5r:\2\u03c9\u03ca\5\16\b\2\u03ca\u03cc\3\2\2\2\u03cb"+
		"\u03c2\3\2\2\2\u03cb\u03c7\3\2\2\2\u03ccq\3\2\2\2\u03cd\u03d4\b:\1\2\u03ce"+
		"\u03cf\f\4\2\2\u03cf\u03d3\7x\2\2\u03d0\u03d1\f\3\2\2\u03d1\u03d3\7K\2"+
		"\2\u03d2\u03ce\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2"+
		"\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5s\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7"+
		"\u03d9\5v<\2\u03d8\u03d7\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03db\3\2\2"+
		"\2\u03da\u03d8\3\2\2\2\u03dbu\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03de"+
		"\7\u00ab\2\2\u03de\u03ea\5f\64\2\u03df\u03e0\7\u00ac\2\2\u03e0\u03ea\5"+
		"f\64\2\u03e1\u03e2\7\u00ad\2\2\u03e2\u03ea\5f\64\2\u03e3\u03e4\7\u00ae"+
		"\2\2\u03e4\u03ea\5f\64\2\u03e5\u03ea\5\u0130\u0099\2\u03e6\u03ea\5&\24"+
		"\2\u03e7\u03ea\5\n\6\2\u03e8\u03ea\5\30\r\2\u03e9\u03dd\3\2\2\2\u03e9"+
		"\u03df\3\2\2\2\u03e9\u03e1\3\2\2\2\u03e9\u03e3\3\2\2\2\u03e9\u03e5\3\2"+
		"\2\2\u03e9\u03e6\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03e8\3\2\2\2\u03ea"+
		"w\3\2\2\2\u03eb\u03ec\7\u00af\2\2\u03ec\u03ed\5z>\2\u03ed\u03ee\5h\65"+
		"\2\u03ee\u03ef\5\u0114\u008b\2\u03ef\u03f0\5\16\b\2\u03f0\u03f1\7\7\2"+
		"\2\u03f1\u03f2\5\u0102\u0082\2\u03f2\u03f3\7\b\2\2\u03f3\u03f4\5b\62\2"+
		"\u03f4y\3\2\2\2\u03f5\u03fc\b>\1\2\u03f6\u03f7\f\4\2\2\u03f7\u03fb\7x"+
		"\2\2\u03f8\u03f9\f\3\2\2\u03f9\u03fb\7K\2\2\u03fa\u03f6\3\2\2\2\u03fa"+
		"\u03f8\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2"+
		"\2\2\u03fd{\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0401\5~@\2\u0400\u03ff"+
		"\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0403\3\2\2\2\u0402\u0400\3\2\2\2\u0403"+
		"}\3\2\2\2\u0404\u0402\3\2\2\2\u0405\u0406\7\u00b0\2\2\u0406\u0410\5f\64"+
		"\2\u0407\u0408\7\u00b1\2\2\u0408\u0410\5f\64\2\u0409\u040a\7\u00ae\2\2"+
		"\u040a\u0410\5f\64\2\u040b\u0410\5&\24\2\u040c\u0410\5\u0130\u0099\2\u040d"+
		"\u0410\5\n\6\2\u040e\u0410\5\30\r\2\u040f\u0405\3\2\2\2\u040f\u0407\3"+
		"\2\2\2\u040f\u0409\3\2\2\2\u040f\u040b\3\2\2\2\u040f\u040c\3\2\2\2\u040f"+
		"\u040d\3\2\2\2\u040f\u040e\3\2\2\2\u0410\177\3\2\2\2\u0411\u0418\3\2\2"+
		"\2\u0412\u0413\7\u00e4\2\2\u0413\u0414\7\7\2\2\u0414\u0415\5\u0082B\2"+
		"\u0415\u0416\7\b\2\2\u0416\u0418\3\2\2\2\u0417\u0411\3\2\2\2\u0417\u0412"+
		"\3\2\2\2\u0418\u0081\3\2\2\2\u0419\u041f\5\u010e\u0088\2\u041a\u041b\5"+
		"\u0084C\2\u041b\u041c\7\u012d\2\2\u041c\u041d\7\4\2\2\u041d\u041f\3\2"+
		"\2\2\u041e\u0419\3\2\2\2\u041e\u041a\3\2\2\2\u041f\u0083\3\2\2\2\u0420"+
		"\u0421\7\3\2\2\u0421\u0085\3\2\2\2\u0422\u0426\7\u009e\2\2\u0423\u0425"+
		"\5\u0088E\2\u0424\u0423\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0427\3\2\2"+
		"\2\u0426\u0424\3\2\2\2\u0427\u0429\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042d"+
		"\5h\65\2\u042a\u042c\5\u008eH\2\u042b\u042a\3\2\2\2\u042c\u042f\3\2\2"+
		"\2\u042d\u042e\3\2\2\2\u042d\u042b\3\2\2\2\u042e\u0430\3\2\2\2\u042f\u042d"+
		"\3\2\2\2\u0430\u0431\5\u0114\u008b\2\u0431\u0432\5\u0080A\2\u0432\u0433"+
		"\5\u008cG\2\u0433\u0434\5J&\2\u0434\u0435\7\7\2\2\u0435\u0436\5\u0102"+
		"\u0082\2\u0436\u043a\7\b\2\2\u0437\u0439\5\u0090I\2\u0438\u0437\3\2\2"+
		"\2\u0439\u043c\3\2\2\2\u043a\u043b\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u0087"+
		"\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u0466\7M\2\2\u043e\u0466\7N\2\2\u043f"+
		"\u0466\7O\2\2\u0440\u0466\7P\2\2\u0441\u0466\7Q\2\2\u0442\u0466\7K\2\2"+
		"\u0443\u0466\7_\2\2\u0444\u0466\7f\2\2\u0445\u0466\7V\2\2\u0446\u0466"+
		"\7r\2\2\u0447\u0466\7s\2\2\u0448\u0466\7t\2\2\u0449\u0466\7u\2\2\u044a"+
		"\u0466\7v\2\2\u044b\u0466\7\20\2\2\u044c\u0466\7w\2\2\u044d\u0466\7x\2"+
		"\2\u044e\u0466\7d\2\2\u044f\u0466\7\177\2\2\u0450\u0451\7+\2\2\u0451\u0452"+
		"\7\7\2\2\u0452\u0453\5\20\t\2\u0453\u0454\7\b\2\2\u0454\u0466\3\2\2\2"+
		"\u0455\u0456\7y\2\2\u0456\u0458\7\7\2\2\u0457\u0459\5\b\5\2\u0458\u0457"+
		"\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045c\3\2\2\2\u045a\u045b\7\u008a\2"+
		"\2\u045b\u045d\5\b\5\2\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u0461"+
		"\3\2\2\2\u045e\u0460\5\u008aF\2\u045f\u045e\3\2\2\2\u0460\u0463\3\2\2"+
		"\2\u0461\u0462\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0464\3\2\2\2\u0463\u0461"+
		"\3\2\2\2\u0464\u0466\7\b\2\2\u0465\u043d\3\2\2\2\u0465\u043e\3\2\2\2\u0465"+
		"\u043f\3\2\2\2\u0465\u0440\3\2\2\2\u0465\u0441\3\2\2\2\u0465\u0442\3\2"+
		"\2\2\u0465\u0443\3\2\2\2\u0465\u0444\3\2\2\2\u0465\u0445\3\2\2\2\u0465"+
		"\u0446\3\2\2\2\u0465\u0447\3\2\2\2\u0465\u0448\3\2\2\2\u0465\u0449\3\2"+
		"\2\2\u0465\u044a\3\2\2\2\u0465\u044b\3\2\2\2\u0465\u044c\3\2\2\2\u0465"+
		"\u044d\3\2\2\2\u0465\u044e\3\2\2\2\u0465\u044f\3\2\2\2\u0465\u0450\3\2"+
		"\2\2\u0465\u0455\3\2\2\2\u0466\u0089\3\2\2\2\u0467\u0483\7\u0087\2\2\u0468"+
		"\u0483\7Z\2\2\u0469\u0483\7[\2\2\u046a\u0483\7\\\2\2\u046b\u0483\7\u0088"+
		"\2\2\u046c\u0483\7\u0089\2\2\u046d\u0483\7\62\2\2\u046e\u0483\7\64\2\2"+
		"\u046f\u0483\7\65\2\2\u0470\u0483\7\66\2\2\u0471\u0472\7\u008b\2\2\u0472"+
		"\u0473\7\21\2\2\u0473\u0483\7\u008c\2\2\u0474\u0475\7\u008b\2\2\u0475"+
		"\u0476\7\21\2\2\u0476\u0483\7\u008d\2\2\u0477\u0478\7\u008e\2\2\u0478"+
		"\u0479\7\21\2\2\u0479\u0483\7\u008c\2\2\u047a\u047b\7\u008e\2\2\u047b"+
		"\u047c\7\21\2\2\u047c\u0483\7\u008d\2\2\u047d\u047e\7+\2\2\u047e\u047f"+
		"\7\7\2\2\u047f\u0480\5\20\t\2\u0480\u0481\7\b\2\2\u0481\u0483\3\2\2\2"+
		"\u0482\u0467\3\2\2\2\u0482\u0468\3\2\2\2\u0482\u0469\3\2\2\2\u0482\u046a"+
		"\3\2\2\2\u0482\u046b\3\2\2\2\u0482\u046c\3\2\2\2\u0482\u046d\3\2\2\2\u0482"+
		"\u046e\3\2\2\2\u0482\u046f\3\2\2\2\u0482\u0470\3\2\2\2\u0482\u0471\3\2"+
		"\2\2\u0482\u0474\3\2\2\2\u0482\u0477\3\2\2\2\u0482\u047a\3\2\2\2\u0482"+
		"\u047d\3\2\2\2\u0483\u008b\3\2\2\2\u0484\u0488\7z\2\2\u0485\u0488\7{\2"+
		"\2\u0486\u0488\5\16\b\2\u0487\u0484\3\2\2\2\u0487\u0485\3\2\2\2\u0487"+
		"\u0486\3\2\2\2\u0488\u008d\3\2\2\2\u0489\u048a\7\13\2\2\u048a\u048b\7"+
		"\u00fd\2\2\u048b\u0497\7\f\2\2\u048c\u048d\7\13\2\2\u048d\u048e\7\u00fe"+
		"\2\2\u048e\u0497\7\f\2\2\u048f\u0490\7\13\2\2\u0490\u0491\7\u00ff\2\2"+
		"\u0491\u0497\7\f\2\2\u0492\u0493\7\13\2\2\u0493\u0494\5\20\t\2\u0494\u0495"+
		"\7\f\2\2\u0495\u0497\3\2\2\2\u0496\u0489\3\2\2\2\u0496\u048c\3\2\2\2\u0496"+
		"\u048f\3\2\2\2\u0496\u0492\3\2\2\2\u0497\u008f\3\2\2\2\u0498\u04ac\7I"+
		"\2\2\u0499\u04ac\7\u0080\2\2\u049a\u04ac\7\u0081\2\2\u049b\u04ac\7\u0082"+
		"\2\2\u049c\u04ac\79\2\2\u049d\u04ac\7\u0083\2\2\u049e\u04ac\7\u0084\2"+
		"\2\u049f\u04ac\7\u0085\2\2\u04a0\u04ac\7\u0086\2\2\u04a1\u04ac\7R\2\2"+
		"\u04a2\u04ac\7`\2\2\u04a3\u04ac\7a\2\2\u04a4\u04ac\7b\2\2\u04a5\u04ac"+
		"\7c\2\2\u04a6\u04a7\7+\2\2\u04a7\u04a8\7\7\2\2\u04a8\u04a9\5\20\t\2\u04a9"+
		"\u04aa\7\b\2\2\u04aa\u04ac\3\2\2\2\u04ab\u0498\3\2\2\2\u04ab\u0499\3\2"+
		"\2\2\u04ab\u049a\3\2\2\2\u04ab\u049b\3\2\2\2\u04ab\u049c\3\2\2\2\u04ab"+
		"\u049d\3\2\2\2\u04ab\u049e\3\2\2\2\u04ab\u049f\3\2\2\2\u04ab\u04a0\3\2"+
		"\2\2\u04ab\u04a1\3\2\2\2\u04ab\u04a2\3\2\2\2\u04ab\u04a3\3\2\2\2\u04ab"+
		"\u04a4\3\2\2\2\u04ab\u04a5\3\2\2\2\u04ab\u04a6\3\2\2\2\u04ac\u0091\3\2"+
		"\2\2\u04ad\u04ae\7\u00a7\2\2\u04ae\u0093\3\2\2\2\u04af\u04b1\5\u0096L"+
		"\2\u04b0\u04af\3\2\2\2\u04b1\u04b4\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b2\u04b0"+
		"\3\2\2\2\u04b3\u0095\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b5\u04b6\7\u00a4\2"+
		"\2\u04b6\u050b\5\20\t\2\u04b7\u050b\5\u009cO\2\u04b8\u04b9\7\u00a6\2\2"+
		"\u04b9\u050b\5\20\t\2\u04ba\u04bc\5\u0092J\2\u04bb\u04bd\7\u00c8\2\2\u04bc"+
		"\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\7\7"+
		"\2\2\u04bf\u04c0\5\u0102\u0082\2\u04c0\u04c1\7\b\2\2\u04c1\u050b\3\2\2"+
		"\2\u04c2\u050b\7\u00a8\2\2\u04c3\u050b\7\u00a9\2\2\u04c4\u050b\5\u00b0"+
		"Y\2\u04c5\u04c6\5\f\7\2\u04c6\u04c7\7\21\2\2\u04c7\u04c9\3\2\2\2\u04c8"+
		"\u04c5\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u050b\5\u00f8"+
		"}\2\u04cb\u050b\5\u011c\u008f\2\u04cc\u050b\5\u0130\u0099\2\u04cd\u050b"+
		"\5\n\6\2\u04ce\u050b\5&\24\2\u04cf\u050b\5\30\r\2\u04d0\u04d1\7\u00dd"+
		"\2\2\u04d1\u04d2\7\13\2\2\u04d2\u04d3\5\20\t\2\u04d3\u04d6\7\f\2\2\u04d4"+
		"\u04d5\7\u008a\2\2\u04d5\u04d7\5\f\7\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7"+
		"\3\2\2\2\u04d7\u050b\3\2\2\2\u04d8\u04d9\7\u00cf\2\2\u04d9\u04da\5\20"+
		"\t\2\u04da\u04db\7\21\2\2\u04db\u04dc\5\20\t\2\u04dc\u050b\3\2\2\2\u04dd"+
		"\u04e2\7\u0101\2\2\u04de\u04df\7j\2\2\u04df\u04e0\5h\65\2\u04e0\u04e1"+
		"\5\u0114\u008b\2\u04e1\u04e3\3\2\2\2\u04e2\u04de\3\2\2\2\u04e2\u04e3\3"+
		"\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\5\u010c\u0087\2\u04e5\u04e6\7\27"+
		"\2\2\u04e6\u04ec\5\u008cG\2\u04e7\u04e8\5V,\2\u04e8\u04e9\7\7\2\2\u04e9"+
		"\u04ea\5\u0102\u0082\2\u04ea\u04eb\7\b\2\2\u04eb\u04ed\3\2\2\2\u04ec\u04e7"+
		"\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u050b\3\2\2\2\u04ee\u050b\5\u0098M"+
		"\2\u04ef\u0508\7\u0100\2\2\u04f0\u04f6\7q\2\2\u04f1\u04f2\7\13\2\2\u04f2"+
		"\u04f3\5\20\t\2\u04f3\u04f4\7\f\2\2\u04f4\u04f7\3\2\2\2\u04f5\u04f7\5"+
		"\16\b\2\u04f6\u04f1\3\2\2\2\u04f6\u04f5\3\2\2\2\u04f7\u0509\3\2\2\2\u04f8"+
		"\u04fe\7\u0122\2\2\u04f9\u04fa\7\13\2\2\u04fa\u04fb\5\20\t\2\u04fb\u04fc"+
		"\7\f\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04ff\5\16\b\2\u04fe\u04f9\3\2\2\2"+
		"\u04fe\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\7\6\2\2\u0501\u0502"+
		"\5\u010c\u0087\2\u0502\u0509\3\2\2\2\u0503\u0504\7\13\2\2\u0504\u0505"+
		"\5\20\t\2\u0505\u0506\7\f\2\2\u0506\u0507\5b\62\2\u0507\u0509\3\2\2\2"+
		"\u0508\u04f0\3\2\2\2\u0508\u04f8\3\2\2\2\u0508\u0503\3\2\2\2\u0509\u050b"+
		"\3\2\2\2\u050a\u04b5\3\2\2\2\u050a\u04b7\3\2\2\2\u050a\u04b8\3\2\2\2\u050a"+
		"\u04ba\3\2\2\2\u050a\u04c2\3\2\2\2\u050a\u04c3\3\2\2\2\u050a\u04c4\3\2"+
		"\2\2\u050a\u04c8\3\2\2\2\u050a\u04cb\3\2\2\2\u050a\u04cc\3\2\2\2\u050a"+
		"\u04cd\3\2\2\2\u050a\u04ce\3\2\2\2\u050a\u04cf\3\2\2\2\u050a\u04d0\3\2"+
		"\2\2\u050a\u04d8\3\2\2\2\u050a\u04dd\3\2\2\2\u050a\u04ee\3\2\2\2\u050a"+
		"\u04ef\3\2\2\2\u050b\u0097\3\2\2\2\u050c\u050d\5\u009aN\2\u050d\u050e"+
		"\5\u0094K\2\u050e\u050f\7\4\2\2\u050f\u0099\3\2\2\2\u0510\u0511\7\3\2"+
		"\2\u0511\u009b\3\2\2\2\u0512\u0513\5\u00a0Q\2\u0513\u0514\5\u009eP\2\u0514"+
		"\u009d\3\2\2\2\u0515\u0516\5\u00a2R\2\u0516\u0517\5\u009eP\2\u0517\u051a"+
		"\3\2\2\2\u0518\u051a\5\u00a2R\2\u0519\u0515\3\2\2\2\u0519\u0518\3\2\2"+
		"\2\u051a\u009f\3\2\2\2\u051b\u0525\7\u00a5\2\2\u051c\u0526\5\u0098M\2"+
		"\u051d\u051e\5\f\7\2\u051e\u051f\7A\2\2\u051f\u0520\5\f\7\2\u0520\u0526"+
		"\3\2\2\2\u0521\u0522\5\20\t\2\u0522\u0523\7A\2\2\u0523\u0524\5\20\t\2"+
		"\u0524\u0526\3\2\2\2\u0525\u051c\3\2\2\2\u0525\u051d\3\2\2\2\u0525\u0521"+
		"\3\2\2\2\u0526\u00a1\3\2\2\2\u0527\u0528\5\u00a8U\2\u0528\u0529\5\u00ae"+
		"X\2\u0529\u0534\3\2\2\2\u052a\u052b\5\u00a4S\2\u052b\u052c\5\u00aeX\2"+
		"\u052c\u0534\3\2\2\2\u052d\u052e\5\u00aaV\2\u052e\u052f\5\u00aeX\2\u052f"+
		"\u0534\3\2\2\2\u0530\u0531\5\u00acW\2\u0531\u0532\5\u00aeX\2\u0532\u0534"+
		"\3\2\2\2\u0533\u0527\3\2\2\2\u0533\u052a\3\2\2\2\u0533\u052d\3\2\2\2\u0533"+
		"\u0530\3\2\2\2\u0534\u00a3\3\2\2\2\u0535\u0536\5\u00a6T\2\u0536\u0537"+
		"\5\u0098M\2\u0537\u053f\3\2\2\2\u0538\u0539\5\u00a6T\2\u0539\u053a\5\f"+
		"\7\2\u053a\u053f\3\2\2\2\u053b\u053c\5\u00a6T\2\u053c\u053d\5\20\t\2\u053d"+
		"\u053f\3\2\2\2\u053e\u0535\3\2\2\2\u053e\u0538\3\2\2\2\u053e\u053b\3\2"+
		"\2\2\u053f\u00a5\3\2\2\2\u0540\u0541\7=\2\2\u0541\u00a7\3\2\2\2\u0542"+
		"\u0543\7<\2\2\u0543\u0544\5\u010c\u0087\2\u0544\u00a9\3\2\2\2\u0545\u0546"+
		"\7:\2\2\u0546\u00ab\3\2\2\2\u0547\u0548\7>\2\2\u0548\u00ad\3\2\2\2\u0549"+
		"\u0555\5\u0098M\2\u054a\u054d\7;\2\2\u054b\u054e\5\f\7\2\u054c\u054e\5"+
		"\20\t\2\u054d\u054b\3\2\2\2\u054d\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f"+
		"\u0552\7A\2\2\u0550\u0553\5\f\7\2\u0551\u0553\5\20\t\2\u0552\u0550\3\2"+
		"\2\2\u0552\u0551\3\2\2\2\u0553\u0555\3\2\2\2\u0554\u0549\3\2\2\2\u0554"+
		"\u054a\3\2\2\2\u0555\u00af\3\2\2\2\u0556\u0557\5\u00b2Z\2\u0557\u0558"+
		"\5\u00b6\\\2\u0558\u00b1\3\2\2\2\u0559\u055a\7\u00a0\2\2\u055a\u055b\5"+
		"\u00b4[\2\u055b\u055c\5\f\7\2\u055c\u055d\7\n\2\2\u055d\u0561\3\2\2\2"+
		"\u055e\u055f\7\u00a0\2\2\u055f\u0561\5\u00b4[\2\u0560\u0559\3\2\2\2\u0560"+
		"\u055e\3\2\2\2\u0561\u00b3\3\2\2\2\u0562\u0566\3\2\2\2\u0563\u0566\7C"+
		"\2\2\u0564\u0566\7\u0080\2\2\u0565\u0562\3\2\2\2\u0565\u0563\3\2\2\2\u0565"+
		"\u0564\3\2\2\2\u0566\u00b5\3\2\2\2\u0567\u0568\7\3\2\2\u0568\u0569\5\u00b8"+
		"]\2\u0569\u056a\7\4\2\2\u056a\u056d\3\2\2\2\u056b\u056d\5\u00bc_\2\u056c"+
		"\u0567\3\2\2\2\u056c\u056b\3\2\2\2\u056d\u00b7\3\2\2\2\u056e\u056f\5\u00bc"+
		"_\2\u056f\u0570\7\6\2\2\u0570\u0571\5\u00b8]\2\u0571\u0574\3\2\2\2\u0572"+
		"\u0574\5\u00bc_\2\u0573\u056e\3\2\2\2\u0573\u0572\3\2\2\2\u0574\u00b9"+
		"\3\2\2\2\u0575\u057b\3\2\2\2\u0576\u0577\7\13\2\2\u0577\u0578\5\20\t\2"+
		"\u0578\u0579\7\f\2\2\u0579\u057b\3\2\2\2\u057a\u0575\3\2\2\2\u057a\u0576"+
		"\3\2\2\2\u057b\u00bb\3\2\2\2\u057c\u057d\7\33\2\2\u057d\u057e\7\22\2\2"+
		"\u057e\u057f\7\7\2\2\u057f\u0580\5\b\5\2\u0580\u0581\7\b\2\2\u0581\u05bc"+
		"\3\2\2\2\u0582\u0583\7\23\2\2\u0583\u0584\7\7\2\2\u0584\u0585\5\f\7\2"+
		"\u0585\u0586\7\b\2\2\u0586\u05bc\3\2\2\2\u0587\u0588\5\u00c0a\2\u0588"+
		"\u0589\5\u00c2b\2\u0589\u058a\7\b\2\2\u058a\u05bc\3\2\2\2\u058b\u058c"+
		"\7#\2\2\u058c\u058d\7\7\2\2\u058d\u058e\5\24\13\2\u058e\u058f\7\b\2\2"+
		"\u058f\u0590\5\u00ba^\2\u0590\u05bc\3\2\2\2\u0591\u0592\7$\2\2\u0592\u0593"+
		"\7\7\2\2\u0593\u0594\5\24\13\2\u0594\u0595\7\b\2\2\u0595\u0596\5\u00ba"+
		"^\2\u0596\u05bc\3\2\2\2\u0597\u0598\7!\2\2\u0598\u0599\7\7\2\2\u0599\u059a"+
		"\5\22\n\2\u059a\u059b\7\b\2\2\u059b\u059c\5\u00ba^\2\u059c\u05bc\3\2\2"+
		"\2\u059d\u059e\7 \2\2\u059e\u059f\7\7\2\2\u059f\u05a0\5\20\t\2\u05a0\u05a1"+
		"\7\b\2\2\u05a1\u05a2\5\u00ba^\2\u05a2\u05bc\3\2\2\2\u05a3\u05a4\7\37\2"+
		"\2\u05a4\u05a5\7\7\2\2\u05a5\u05a6\5\20\t\2\u05a6\u05a7\7\b\2\2\u05a7"+
		"\u05a8\5\u00ba^\2\u05a8\u05bc\3\2\2\2\u05a9\u05aa\7\36\2\2\u05aa\u05ab"+
		"\7\7\2\2\u05ab\u05ac\5\20\t\2\u05ac\u05ad\7\b\2\2\u05ad\u05ae\5\u00ba"+
		"^\2\u05ae\u05bc\3\2\2\2\u05af\u05b0\7#\2\2\u05b0\u05bc\5\u00ba^\2\u05b1"+
		"\u05b2\7$\2\2\u05b2\u05bc\5\u00ba^\2\u05b3\u05b4\7!\2\2\u05b4\u05bc\5"+
		"\u00ba^\2\u05b5\u05b6\7 \2\2\u05b6\u05bc\5\u00ba^\2\u05b7\u05b8\7\37\2"+
		"\2\u05b8\u05bc\5\u00ba^\2\u05b9\u05ba\7\36\2\2\u05ba\u05bc\5\u00ba^\2"+
		"\u05bb\u057c\3\2\2\2\u05bb\u0582\3\2\2\2\u05bb\u0587\3\2\2\2\u05bb\u058b"+
		"\3\2\2\2\u05bb\u0591\3\2\2\2\u05bb\u0597\3\2\2\2\u05bb\u059d\3\2\2\2\u05bb"+
		"\u05a3\3\2\2\2\u05bb\u05a9\3\2\2\2\u05bb\u05af\3\2\2\2\u05bb\u05b1\3\2"+
		"\2\2\u05bb\u05b3\3\2\2\2\u05bb\u05b5\3\2\2\2\u05bb\u05b7\3\2\2\2\u05bb"+
		"\u05b9\3\2\2\2\u05bc\u00bd\3\2\2\2\u05bd\u05be\7#\2\2\u05be\u05bf\7\7"+
		"\2\2\u05bf\u05c0\5\24\13\2\u05c0\u05c1\7\b\2\2\u05c1\u0620\3\2\2\2\u05c2"+
		"\u05c3\7$\2\2\u05c3\u05c4\7\7\2\2\u05c4\u05c5\5\24\13\2\u05c5\u05c6\7"+
		"\b\2\2\u05c6\u0620\3\2\2\2\u05c7\u05c8\7#\2\2\u05c8\u05c9\7\7\2\2\u05c9"+
		"\u05ca\5\20\t\2\u05ca\u05cb\7\b\2\2\u05cb\u0620\3\2\2\2\u05cc\u05cd\7"+
		"$\2\2\u05cd\u05ce\7\7\2\2\u05ce\u05cf\5\22\n\2\u05cf\u05d0\7\b\2\2\u05d0"+
		"\u0620\3\2\2\2\u05d1\u05d2\7!\2\2\u05d2\u05d3\7\7\2\2\u05d3\u05d4\5\22"+
		"\n\2\u05d4\u05d5\7\b\2\2\u05d5\u0620\3\2\2\2\u05d6\u05d7\7 \2\2\u05d7"+
		"\u05d8\7\7\2\2\u05d8\u05d9\5\20\t\2\u05d9\u05da\7\b\2\2\u05da\u0620\3"+
		"\2\2\2\u05db\u05dc\7\37\2\2\u05dc\u05dd\7\7\2\2\u05dd\u05de\5\20\t\2\u05de"+
		"\u05df\7\b\2\2\u05df\u0620\3\2\2\2\u05e0\u05e1\7\36\2\2\u05e1\u05e2\7"+
		"\7\2\2\u05e2\u05e3\5\20\t\2\u05e3\u05e4\7\b\2\2\u05e4\u0620\3\2\2\2\u05e5"+
		"\u05e6\7\34\2\2\u05e6\u05e7\7!\2\2\u05e7\u05e8\7\7\2\2\u05e8\u05e9\5\22"+
		"\n\2\u05e9\u05ea\7\b\2\2\u05ea\u0620\3\2\2\2\u05eb\u05ec\7\34\2\2\u05ec"+
		"\u05ed\7 \2\2\u05ed\u05ee\7\7\2\2\u05ee\u05ef\5\20\t\2\u05ef\u05f0\7\b"+
		"\2\2\u05f0\u0620\3\2\2\2\u05f1\u05f2\7\34\2\2\u05f2\u05f3\7\37\2\2\u05f3"+
		"\u05f4\7\7\2\2\u05f4\u05f5\5\20\t\2\u05f5\u05f6\7\b\2\2\u05f6\u0620\3"+
		"\2\2\2\u05f7\u05f8\7\34\2\2\u05f8\u05f9\7\36\2\2\u05f9\u05fa\7\7\2\2\u05fa"+
		"\u05fb\5\20\t\2\u05fb\u05fc\7\b\2\2\u05fc\u0620\3\2\2\2\u05fd\u05fe\7"+
		"*\2\2\u05fe\u05ff\7\7\2\2\u05ff\u0600\5\22\n\2\u0600\u0601\7\b\2\2\u0601"+
		"\u0620\3\2\2\2\u0602\u0603\7)\2\2\u0603\u0604\7\7\2\2\u0604\u0605\5\20"+
		"\t\2\u0605\u0606\7\b\2\2\u0606\u0620\3\2\2\2\u0607\u0608\7(\2\2\u0608"+
		"\u0609\7\7\2\2\u0609\u060a\5\20\t\2\u060a\u060b\7\b\2\2\u060b\u0620\3"+
		"\2\2\2\u060c\u060d\7\'\2\2\u060d\u060e\7\7\2\2\u060e\u060f\5\20\t\2\u060f"+
		"\u0610\7\b\2\2\u0610\u0620\3\2\2\2\u0611\u0612\7\33\2\2\u0612\u0613\7"+
		"\7\2\2\u0613\u0614\5\20\t\2\u0614\u0615\7\b\2\2\u0615\u0620\3\2\2\2\u0616"+
		"\u0617\7\32\2\2\u0617\u0618\7\7\2\2\u0618\u0619\5\u0128\u0095\2\u0619"+
		"\u061a\7\b\2\2\u061a\u0620\3\2\2\2\u061b\u061c\5\u00c0a\2\u061c\u061d"+
		"\5\u00c2b\2\u061d\u061e\7\b\2\2\u061e\u0620\3\2\2\2\u061f\u05bd\3\2\2"+
		"\2\u061f\u05c2\3\2\2\2\u061f\u05c7\3\2\2\2\u061f\u05cc\3\2\2\2\u061f\u05d1"+
		"\3\2\2\2\u061f\u05d6\3\2\2\2\u061f\u05db\3\2\2\2\u061f\u05e0\3\2\2\2\u061f"+
		"\u05e5\3\2\2\2\u061f\u05eb\3\2\2\2\u061f\u05f1\3\2\2\2\u061f\u05f7\3\2"+
		"\2\2\u061f\u05fd\3\2\2\2\u061f\u0602\3\2\2\2\u061f\u0607\3\2\2\2\u061f"+
		"\u060c\3\2\2\2\u061f\u0611\3\2\2\2\u061f\u0616\3\2\2\2\u061f\u061b\3\2"+
		"\2\2\u0620\u00bf\3\2\2\2\u0621\u0622\7%\2\2\u0622\u0623\7\7\2\2\u0623"+
		"\u00c1\3\2\2\2\u0624\u0625\7\u012d\2\2\u0625\u00c3\3\2\2\2\u0626\u062a"+
		"\5\u00be`\2\u0627\u062a\5\b\5\2\u0628\u062a\7\60\2\2\u0629\u0626\3\2\2"+
		"\2\u0629\u0627\3\2\2\2\u0629\u0628\3\2\2\2\u062a\u00c5\3\2\2\2\u062b\u06e4"+
		"\5\u00be`\2\u062c\u062d\7/\2\2\u062d\u062e\7\7\2\2\u062e\u062f\7\60\2"+
		"\2\u062f\u06e4\7\b\2\2\u0630\u0631\7/\2\2\u0631\u0632\7\7\2\2\u0632\u0633"+
		"\7\u0128\2\2\u0633\u06e4\7\b\2\2\u0634\u0635\7q\2\2\u0635\u0636\7\7\2"+
		"\2\u0636\u0637\7\67\2\2\u0637\u0638\7\u0128\2\2\u0638\u06e4\7\b\2\2\u0639"+
		"\u063a\7q\2\2\u063a\u063b\7\7\2\2\u063b\u063c\5\u0108\u0085\2\u063c\u063d"+
		"\7\b\2\2\u063d\u06e4\3\2\2\2\u063e\u063f\7q\2\2\u063f\u0640\7\7\2\2\u0640"+
		"\u0641\7\60\2\2\u0641\u06e4\7\b\2\2\u0642\u0643\7.\2\2\u0643\u0644\7\7"+
		"\2\2\u0644\u0645\5\u00c6d\2\u0645\u0646\7\b\2\2\u0646\u06e4\3\2\2\2\u0647"+
		"\u0648\7#\2\2\u0648\u0649\7\13\2\2\u0649\u064a\5\20\t\2\u064a\u064b\7"+
		"\f\2\2\u064b\u064c\7\7\2\2\u064c\u064d\5\u00c8e\2\u064d\u064e\7\b\2\2"+
		"\u064e\u06e4\3\2\2\2\u064f\u0650\7$\2\2\u0650\u0651\7\13\2\2\u0651\u0652"+
		"\5\20\t\2\u0652\u0653\7\f\2\2\u0653\u0654\7\7\2\2\u0654\u0655\5\u00ca"+
		"f\2\u0655\u0656\7\b\2\2\u0656\u06e4\3\2\2\2\u0657\u0658\7!\2\2\u0658\u0659"+
		"\7\13\2\2\u0659\u065a\5\20\t\2\u065a\u065b\7\f\2\2\u065b\u065c\7\7\2\2"+
		"\u065c\u065d\5\u00ccg\2\u065d\u065e\7\b\2\2\u065e\u06e4\3\2\2\2\u065f"+
		"\u0660\7 \2\2\u0660\u0661\7\13\2\2\u0661\u0662\5\20\t\2\u0662\u0663\7"+
		"\f\2\2\u0663\u0664\7\7\2\2\u0664\u0665\5\u00ceh\2\u0665\u0666\7\b\2\2"+
		"\u0666\u06e4\3\2\2\2\u0667\u0668\7\37\2\2\u0668\u0669\7\13\2\2\u0669\u066a"+
		"\5\20\t\2\u066a\u066b\7\f\2\2\u066b\u066c\7\7\2\2\u066c\u066d\5\u00d0"+
		"i\2\u066d\u066e\7\b\2\2\u066e\u06e4\3\2\2\2\u066f\u0670\7\36\2\2\u0670"+
		"\u0671\7\13\2\2\u0671\u0672\5\20\t\2\u0672\u0673\7\f\2\2\u0673\u0674\7"+
		"\7\2\2\u0674\u0675\5\u00d2j\2\u0675\u0676\7\b\2\2\u0676\u06e4\3\2\2\2"+
		"\u0677\u0678\7*\2\2\u0678\u0679\7\13\2\2\u0679\u067a\5\20\t\2\u067a\u067b"+
		"\7\f\2\2\u067b\u067c\7\7\2\2\u067c\u067d\5\u00ccg\2\u067d\u067e\7\b\2"+
		"\2\u067e\u06e4\3\2\2\2\u067f\u0680\7)\2\2\u0680\u0681\7\13\2\2\u0681\u0682"+
		"\5\20\t\2\u0682\u0683\7\f\2\2\u0683\u0684\7\7\2\2\u0684\u0685\5\u00ce"+
		"h\2\u0685\u0686\7\b\2\2\u0686\u06e4\3\2\2\2\u0687\u0688\7(\2\2\u0688\u0689"+
		"\7\13\2\2\u0689\u068a\5\20\t\2\u068a\u068b\7\f\2\2\u068b\u068c\7\7\2\2"+
		"\u068c\u068d\5\u00d0i\2\u068d\u068e\7\b\2\2\u068e\u06e4\3\2\2\2\u068f"+
		"\u0690\7\'\2\2\u0690\u0691\7\13\2\2\u0691\u0692\5\20\t\2\u0692\u0693\7"+
		"\f\2\2\u0693\u0694\7\7\2\2\u0694\u0695\5\u00d2j\2\u0695\u0696\7\b\2\2"+
		"\u0696\u06e4\3\2\2\2\u0697\u0698\7\34\2\2\u0698\u0699\7!\2\2\u0699\u069a"+
		"\7\13\2\2\u069a\u069b\5\20\t\2\u069b\u069c\7\f\2\2\u069c\u069d\7\7\2\2"+
		"\u069d\u069e\5\u00ccg\2\u069e\u069f\7\b\2\2\u069f\u06e4\3\2\2\2\u06a0"+
		"\u06a1\7\34\2\2\u06a1\u06a2\7 \2\2\u06a2\u06a3\7\13\2\2\u06a3\u06a4\5"+
		"\20\t\2\u06a4\u06a5\7\f\2\2\u06a5\u06a6\7\7\2\2\u06a6\u06a7\5\u00ceh\2"+
		"\u06a7\u06a8\7\b\2\2\u06a8\u06e4\3\2\2\2\u06a9\u06aa\7\34\2\2\u06aa\u06ab"+
		"\7\37\2\2\u06ab\u06ac\7\13\2\2\u06ac\u06ad\5\20\t\2\u06ad\u06ae\7\f\2"+
		"\2\u06ae\u06af\7\7\2\2\u06af\u06b0\5\u00d0i\2\u06b0\u06b1\7\b\2\2\u06b1"+
		"\u06e4\3\2\2\2\u06b2\u06b3\7\34\2\2\u06b3\u06b4\7\36\2\2\u06b4\u06b5\7"+
		"\13\2\2\u06b5\u06b6\5\20\t\2\u06b6\u06b7\7\f\2\2\u06b7\u06b8\7\7\2\2\u06b8"+
		"\u06b9\5\u00d2j\2\u06b9\u06ba\7\b\2\2\u06ba\u06e4\3\2\2\2\u06bb\u06bc"+
		"\7\33\2\2\u06bc\u06bd\7\13\2\2\u06bd\u06be\5\20\t\2\u06be\u06bf\7\f\2"+
		"\2\u06bf\u06c0\7\7\2\2\u06c0\u06c1\5\u00d0i\2\u06c1\u06c2\7\b\2\2\u06c2"+
		"\u06e4\3\2\2\2\u06c3\u06c4\7\32\2\2\u06c4\u06c5\7\13\2\2\u06c5\u06c6\5"+
		"\20\t\2\u06c6\u06c7\7\f\2\2\u06c7\u06c8\7\7\2\2\u06c8\u06c9\5\u00d4k\2"+
		"\u06c9\u06ca\7\b\2\2\u06ca\u06e4\3\2\2\2\u06cb\u06cc\7/\2\2\u06cc\u06cd"+
		"\7\13\2\2\u06cd\u06ce\5\20\t\2\u06ce\u06cf\7\f\2\2\u06cf\u06d0\7\7\2\2"+
		"\u06d0\u06d1\5\u00d6l\2\u06d1\u06d2\7\b\2\2\u06d2\u06e4\3\2\2\2\u06d3"+
		"\u06d4\7q\2\2\u06d4\u06d5\7\13\2\2\u06d5\u06d6\5\20\t\2\u06d6\u06d7\7"+
		"\f\2\2\u06d7\u06d8\7\7\2\2\u06d8\u06d9\5\u00d8m\2\u06d9\u06da\7\b\2\2"+
		"\u06da\u06e4\3\2\2\2\u06db\u06dc\7.\2\2\u06dc\u06dd\7\13\2\2\u06dd\u06de"+
		"\5\20\t\2\u06de\u06df\7\f\2\2\u06df\u06e0\7\7\2\2\u06e0\u06e1\5\u00da"+
		"n\2\u06e1\u06e2\7\b\2\2\u06e2\u06e4\3\2\2\2\u06e3\u062b\3\2\2\2\u06e3"+
		"\u062c\3\2\2\2\u06e3\u0630\3\2\2\2\u06e3\u0634\3\2\2\2\u06e3\u0639\3\2"+
		"\2\2\u06e3\u063e\3\2\2\2\u06e3\u0642\3\2\2\2\u06e3\u0647\3\2\2\2\u06e3"+
		"\u064f\3\2\2\2\u06e3\u0657\3\2\2\2\u06e3\u065f\3\2\2\2\u06e3\u0667\3\2"+
		"\2\2\u06e3\u066f\3\2\2\2\u06e3\u0677\3\2\2\2\u06e3\u067f\3\2\2\2\u06e3"+
		"\u0687\3\2\2\2\u06e3\u068f\3\2\2\2\u06e3\u0697\3\2\2\2\u06e3\u06a0\3\2"+
		"\2\2\u06e3\u06a9\3\2\2\2\u06e3\u06b2\3\2\2\2\u06e3\u06bb\3\2\2\2\u06e3"+
		"\u06c3\3\2\2\2\u06e3\u06cb\3\2\2\2\u06e3\u06d3\3\2\2\2\u06e3\u06db\3\2"+
		"\2\2\u06e4\u00c7\3\2\2\2\u06e5\u06ec\be\1\2\u06e6\u06e7\f\4\2\2\u06e7"+
		"\u06eb\5\24\13\2\u06e8\u06e9\f\3\2\2\u06e9\u06eb\5\20\t\2\u06ea\u06e6"+
		"\3\2\2\2\u06ea\u06e8\3\2\2\2\u06eb\u06ee\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ec"+
		"\u06ed\3\2\2\2\u06ed\u00c9\3\2\2\2\u06ee\u06ec\3\2\2\2\u06ef\u06f6\bf"+
		"\1\2\u06f0\u06f1\f\4\2\2\u06f1\u06f5\5\24\13\2\u06f2\u06f3\f\3\2\2\u06f3"+
		"\u06f5\5\22\n\2\u06f4\u06f0\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f5\u06f8\3"+
		"\2\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u00cb\3\2\2\2\u06f8"+
		"\u06f6\3\2\2\2\u06f9\u06fe\bg\1\2\u06fa\u06fb\f\3\2\2\u06fb\u06fd\5\22"+
		"\n\2\u06fc\u06fa\3\2\2\2\u06fd\u0700\3\2\2\2\u06fe\u06fc\3\2\2\2\u06fe"+
		"\u06ff\3\2\2\2\u06ff\u00cd\3\2\2\2\u0700\u06fe\3\2\2\2\u0701\u0706\bh"+
		"\1\2\u0702\u0703\f\3\2\2\u0703\u0705\5\20\t\2\u0704\u0702\3\2\2\2\u0705"+
		"\u0708\3\2\2\2\u0706\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u00cf\3\2"+
		"\2\2\u0708\u0706\3\2\2\2\u0709\u070e\bi\1\2\u070a\u070b\f\3\2\2\u070b"+
		"\u070d\5\20\t\2\u070c\u070a\3\2\2\2\u070d\u0710\3\2\2\2\u070e\u070c\3"+
		"\2\2\2\u070e\u070f\3\2\2\2\u070f\u00d1\3\2\2\2\u0710\u070e\3\2\2\2\u0711"+
		"\u0716\bj\1\2\u0712\u0713\f\3\2\2\u0713\u0715\5\20\t\2\u0714\u0712\3\2"+
		"\2\2\u0715\u0718\3\2\2\2\u0716\u0714\3\2\2\2\u0716\u0717\3\2\2\2\u0717"+
		"\u00d3\3\2\2\2\u0718\u0716\3\2\2\2\u0719\u071e\bk\1\2\u071a\u071b\f\3"+
		"\2\2\u071b\u071d\5\u0128\u0095\2\u071c\u071a\3\2\2\2\u071d\u0720\3\2\2"+
		"\2\u071e\u071c\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u00d5\3\2\2\2\u0720\u071e"+
		"\3\2\2\2\u0721\u0728\bl\1\2\u0722\u0723\f\4\2\2\u0723\u0727\7\60\2\2\u0724"+
		"\u0725\f\3\2\2\u0725\u0727\7\u0128\2\2\u0726\u0722\3\2\2\2\u0726\u0724"+
		"\3\2\2\2\u0727\u072a\3\2\2\2\u0728\u0726\3\2\2\2\u0728\u0729\3\2\2\2\u0729"+
		"\u00d7\3\2\2\2\u072a\u0728\3\2\2\2\u072b\u0735\bm\1\2\u072c\u072d\f\5"+
		"\2\2\u072d\u0734\7\60\2\2\u072e\u072f\f\4\2\2\u072f\u0730\7\67\2\2\u0730"+
		"\u0734\7\u0128\2\2\u0731\u0732\f\3\2\2\u0732\u0734\5\u0108\u0085\2\u0733"+
		"\u072c\3\2\2\2\u0733\u072e\3\2\2\2\u0733\u0731\3\2\2\2\u0734\u0737\3\2"+
		"\2\2\u0735\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u00d9\3\2\2\2\u0737"+
		"\u0735\3\2\2\2\u0738\u073d\bn\1\2\u0739\u073a\f\3\2\2\u073a\u073c\5\u00c6"+
		"d\2\u073b\u0739\3\2\2\2\u073c\u073f\3\2\2\2\u073d\u073b\3\2\2\2\u073d"+
		"\u073e\3\2\2\2\u073e\u00db\3\2\2\2\u073f\u073d\3\2\2\2\u0740\u0741\7j"+
		"\2\2\u0741\u00dd\3\2\2\2\u0742\u0743\7\u008f\2\2\u0743\u00df\3\2\2\2\u0744"+
		"\u0747\7\u0090\2\2\u0745\u0748\5\20\t\2\u0746\u0748\5\f\7\2\u0747\u0745"+
		"\3\2\2\2\u0747\u0746\3\2\2\2\u0748\u00e1\3\2\2\2\u0749\u074a\7\u0091\2"+
		"\2\u074a\u074b\5\22\n\2\u074b\u00e3\3\2\2\2\u074c\u074d\7\u0092\2\2\u074d"+
		"\u074e\5\22\n\2\u074e\u00e5\3\2\2\2\u074f\u0756\7\u0093\2\2\u0750\u0757"+
		"\5\24\13\2\u0751\u0757\5\22\n\2\u0752\u0753\7\7\2\2\u0753\u0754\5\u00c2"+
		"b\2\u0754\u0755\7\b\2\2\u0755\u0757\3\2\2\2\u0756\u0750\3\2\2\2\u0756"+
		"\u0751\3\2\2\2\u0756\u0752\3\2\2\2\u0757\u00e7\3\2\2\2\u0758\u075b\7\u0096"+
		"\2\2\u0759\u075c\5\f\7\2\u075a\u075c\5\20\t\2\u075b\u0759\3\2\2\2\u075b"+
		"\u075a\3\2\2\2\u075c\u00e9\3\2\2\2\u075d\u075e\7\u0094\2\2\u075e\u075f"+
		"\5f\64\2\u075f\u00eb\3\2\2\2\u0760\u0761\7\u009a\2\2\u0761\u0765\5\u0114"+
		"\u008b\2\u0762\u0763\5\u010c\u0087\2\u0763\u0764\7\27\2\2\u0764\u0766"+
		"\3\2\2\2\u0765\u0762\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\3\2\2\2\u0767"+
		"\u0768\5\16\b\2\u0768\u00ed\3\2\2\2\u0769\u076a\7\u0098\2\2\u076a\u076b"+
		"\5\u010c\u0087\2\u076b\u00ef\3\2\2\2\u076c\u0777\7\u0099\2\2\u076d\u0778"+
		"\5\b\5\2\u076e\u076f\7Z\2\2\u076f\u0770\7\7\2\2\u0770\u0771\5\b\5\2\u0771"+
		"\u0772\7\b\2\2\u0772\u0778\3\2\2\2\u0773\u0774\5\u00c0a\2\u0774\u0775"+
		"\5\u00c2b\2\u0775\u0776\7\b\2\2\u0776\u0778\3\2\2\2\u0777\u076d\3\2\2"+
		"\2\u0777\u076e\3\2\2\2\u0777\u0773\3\2\2\2\u0778\u00f1\3\2\2\2\u0779\u077a"+
		"\7\u0095\2\2\u077a\u077b\5h\65\2\u077b\u077c\5\u0114\u008b\2\u077c\u077d"+
		"\7\7\2\2\u077d\u077e\5\u0102\u0082\2\u077e\u077f\7\b\2\2\u077f\u00f3\3"+
		"\2\2\2\u0780\u0781\7\u009b\2\2\u0781\u0782\5\34\17\2\u0782\u00f5\3\2\2"+
		"\2\u0783\u0784\7\u0097\2\2\u0784\u0785\7\7\2\2\u0785\u0786\5\u00fa~\2"+
		"\u0786\u0787\7\b\2\2\u0787\u00f7\3\2\2\2\u0788\u0796\5\u00dep\2\u0789"+
		"\u0796\5\u00e0q\2\u078a\u0796\5\u00e2r\2\u078b\u0796\5\u00e4s\2\u078c"+
		"\u0796\5\u00e6t\2\u078d\u0796\5\u00e8u\2\u078e\u0796\5\u00eav\2\u078f"+
		"\u0796\5\u00ecw\2\u0790\u0796\5\u00eex\2\u0791\u0796\5\u00f0y\2\u0792"+
		"\u0796\5\u00f2z\2\u0793\u0796\5\u00f4{\2\u0794\u0796\5\u00f6|\2\u0795"+
		"\u0788\3\2\2\2\u0795\u0789\3\2\2\2\u0795\u078a\3\2\2\2\u0795\u078b\3\2"+
		"\2\2\u0795\u078c\3\2\2\2\u0795\u078d\3\2\2\2\u0795\u078e\3\2\2\2\u0795"+
		"\u078f\3\2\2\2\u0795\u0790\3\2\2\2\u0795\u0791\3\2\2\2\u0795\u0792\3\2"+
		"\2\2\u0795\u0793\3\2\2\2\u0795\u0794\3\2\2\2\u0796\u00f9\3\2\2\2\u0797"+
		"\u07a3\3\2\2\2\u0798\u0799\5\f\7\2\u0799\u079a\7\6\2\2\u079a\u079b\5\u00fa"+
		"~\2\u079b\u07a3\3\2\2\2\u079c\u079d\5\20\t\2\u079d\u079e\7\6\2\2\u079e"+
		"\u079f\5\u00fa~\2\u079f\u07a3\3\2\2\2\u07a0\u07a3\5\f\7\2\u07a1\u07a3"+
		"\5\20\t\2\u07a2\u0797\3\2\2\2\u07a2\u0798\3\2\2\2\u07a2\u079c\3\2\2\2"+
		"\u07a2\u07a0\3\2\2\2\u07a2\u07a1\3\2\2\2\u07a3\u00fb\3\2\2\2\u07a4\u07a5"+
		"\7\r\2\2\u07a5\u07a6\5\u00fe\u0080\2\u07a6\u07a7\7\16\2\2\u07a7\u00fd"+
		"\3\2\2\2\u07a8\u07ab\3\2\2\2\u07a9\u07ab\5\u0100\u0081\2\u07aa\u07a8\3"+
		"\2\2\2\u07aa\u07a9\3\2\2\2\u07ab\u00ff\3\2\2\2\u07ac\u07b1\5\u0114\u008b"+
		"\2\u07ad\u07ae\7\6\2\2\u07ae\u07b0\5\u0114\u008b\2\u07af\u07ad\3\2\2\2"+
		"\u07b0\u07b3\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b1\u07af\3\2\2\2\u07b2\u0101"+
		"\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b4\u07b6\5\u0104\u0083\2\u07b5\u07b4\3"+
		"\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u0103\3\2\2\2\u07b7\u07bc\5\u0106\u0084"+
		"\2\u07b8\u07b9\7\6\2\2\u07b9\u07bb\5\u0106\u0084\2\u07ba\u07b8\3\2\2\2"+
		"\u07bb\u07be\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bd\u0105"+
		"\3\2\2\2\u07be\u07bc\3\2\2\2\u07bf\u07cc\7\30\2\2\u07c0\u07c2\5\u008e"+
		"H\2\u07c1\u07c0\3\2\2\2\u07c2\u07c5\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c3"+
		"\u07c1\3\2\2\2\u07c4\u07c6\3\2\2\2\u07c5\u07c3\3\2\2\2\u07c6\u07c7\5\u0114"+
		"\u008b\2\u07c7\u07c9\5\u0080A\2\u07c8\u07ca\5\f\7\2\u07c9\u07c8\3\2\2"+
		"\2\u07c9\u07ca\3\2\2\2\u07ca\u07cc\3\2\2\2\u07cb\u07bf\3\2\2\2\u07cb\u07c3"+
		"\3\2\2\2\u07cc\u0107\3\2\2\2\u07cd\u07ce\7\13\2\2\u07ce\u07cf\5\16\b\2"+
		"\u07cf\u07d0\7\f\2\2\u07d0\u07d1\5\u010a\u0086\2\u07d1\u07e7\3\2\2\2\u07d2"+
		"\u07d3\7\13\2\2\u07d3\u07d4\5l\67\2\u07d4\u07d5\7\f\2\2\u07d5\u07d6\5"+
		"\u010a\u0086\2\u07d6\u07e7\3\2\2\2\u07d7\u07d8\7\13\2\2\u07d8\u07d9\7"+
		"\22\2\2\u07d9\u07da\7\f\2\2\u07da\u07e7\5\u010a\u0086\2\u07db\u07dc\7"+
		"\13\2\2\u07dc\u07dd\7\u00dc\2\2\u07dd\u07de\5\16\b\2\u07de\u07df\7\f\2"+
		"\2\u07df\u07e0\5\u010a\u0086\2\u07e0\u07e7\3\2\2\2\u07e1\u07e7\5\u010a"+
		"\u0086\2\u07e2\u07e7\5l\67\2\u07e3\u07e7\7\u00a1\2\2\u07e4\u07e7\7\u00a2"+
		"\2\2\u07e5\u07e7\7\u00a3\2\2\u07e6\u07cd\3\2\2\2\u07e6\u07d2\3\2\2\2\u07e6"+
		"\u07d7\3\2\2\2\u07e6\u07db\3\2\2\2\u07e6\u07e1\3\2\2\2\u07e6\u07e2\3\2"+
		"\2\2\u07e6\u07e3\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e5\3\2\2\2\u07e7"+
		"\u0109\3\2\2\2\u07e8\u07ed\5\16\b\2\u07e9\u07ea\7\24\2\2\u07ea\u07ec\5"+
		"\16\b\2\u07eb\u07e9\3\2\2\2\u07ec\u07ef\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ed"+
		"\u07eb\3\2\2\2\u07ee\u010b\3\2\2\2\u07ef\u07ed\3\2\2\2\u07f0\u07fc\5\u0108"+
		"\u0085\2\u07f1\u07f2\7\13\2\2\u07f2\u07f3\5\16\b\2\u07f3\u07f4\7\f\2\2"+
		"\u07f4\u07fc\3\2\2\2\u07f5\u07f6\7\13\2\2\u07f6\u07f7\7\u00dc\2\2\u07f7"+
		"\u07f8\5\16\b\2\u07f8\u07f9\7\f\2\2\u07f9\u07fc\3\2\2\2\u07fa\u07fc\5"+
		"\u0114\u008b\2\u07fb\u07f0\3\2\2\2\u07fb\u07f1\3\2\2\2\u07fb\u07f5\3\2"+
		"\2\2\u07fb\u07fa\3\2\2\2\u07fc\u010d\3\2\2\2\u07fd\u085b\b\u0088\1\2\u07fe"+
		"\u07ff\7\u00e5\2\2\u07ff\u0800\7\7\2\2\u0800\u0801\5\b\5\2\u0801\u0802"+
		"\7\6\2\2\u0802\u0803\5\b\5\2\u0803\u0804\7\6\2\2\u0804\u0805\5\b\5\2\u0805"+
		"\u0806\7\6\2\2\u0806\u0807\5\b\5\2\u0807\u0808\7\b\2\2\u0808\u085b\3\2"+
		"\2\2\u0809\u080a\7\u00e5\2\2\u080a\u080b\7\7\2\2\u080b\u080c\5\b\5\2\u080c"+
		"\u080d\7\6\2\2\u080d\u080e\5\b\5\2\u080e\u080f\7\b\2\2\u080f\u085b\3\2"+
		"\2\2\u0810\u0811\7\u00e7\2\2\u0811\u0812\7\u00e6\2\2\u0812\u0813\7\13"+
		"\2\2\u0813\u0814\5\20\t\2\u0814\u0815\7\f\2\2\u0815\u085b\3\2\2\2\u0816"+
		"\u0817\7\u00e7\2\2\u0817\u0818\7\u00fa\2\2\u0818\u0819\7\13\2\2\u0819"+
		"\u081a\5\20\t\2\u081a\u081b\7\f\2\2\u081b\u081c\5\u010e\u0088\64\u081c"+
		"\u085b\3\2\2\2\u081d\u085b\7\u00e8\2\2\u081e\u085b\7\u00e9\2\2\u081f\u085b"+
		"\7\u00ea\2\2\u0820\u085b\7\31\2\2\u0821\u085b\7\32\2\2\u0822\u085b\7\36"+
		"\2\2\u0823\u085b\7\37\2\2\u0824\u085b\7 \2\2\u0825\u085b\7!\2\2\u0826"+
		"\u085b\7#\2\2\u0827\u085b\7$\2\2\u0828\u085b\7\u0126\2\2\u0829\u082a\7"+
		"\34\2\2\u082a\u085b\7\36\2\2\u082b\u082c\7\34\2\2\u082c\u085b\7\37\2\2"+
		"\u082d\u082e\7\34\2\2\u082e\u085b\7 \2\2\u082f\u0830\7\34\2\2\u0830\u085b"+
		"\7!\2\2\u0831\u085b\7\'\2\2\u0832\u085b\7(\2\2\u0833\u085b\7)\2\2\u0834"+
		"\u085b\7*\2\2\u0835\u085b\7\u00eb\2\2\u0836\u085b\7\u00ec\2\2\u0837\u085b"+
		"\7\u00ed\2\2\u0838\u085b\7\u00ef\2\2\u0839\u085b\7\u00f0\2\2\u083a\u085b"+
		"\7\u00f1\2\2\u083b\u085b\7\u00f2\2\2\u083c\u083d\7\u00f3\2\2\u083d\u085b"+
		"\5\u0110\u0089\2\u083e\u083f\7\u00f4\2\2\u083f\u085b\5\u0110\u0089\2\u0840"+
		"\u085b\7\u00f5\2\2\u0841\u0842\7S\2\2\u0842\u085b\5\u0110\u0089\2\u0843"+
		"\u0844\7\u00f6\2\2\u0844\u085b\5\u0112\u008a\2\u0845\u0846\7\u00f6\2\2"+
		"\u0846\u0847\5\u0112\u008a\2\u0847\u0848\7\6\2\2\u0848\u0849\5\b\5\2\u0849"+
		"\u085b\3\2\2\2\u084a\u085b\7\35\2\2\u084b\u084c\7\34\2\2\u084c\u085b\7"+
		"\35\2\2\u084d\u085b\7&\2\2\u084e\u084f\7U\2\2\u084f\u085b\7\u00f5\2\2"+
		"\u0850\u085b\7\u00f7\2\2\u0851\u0852\7Z\2\2\u0852\u085b\7\u00ed\2\2\u0853"+
		"\u085b\7\u00ee\2\2\u0854\u0855\7\u00e8\2\2\u0855\u085b\7\32\2\2\u0856"+
		"\u085b\7j\2\2\u0857\u0858\7\u008a\2\2\u0858\u085b\7\u00f9\2\2\u0859\u085b"+
		"\7\u00fb\2\2\u085a\u07fd\3\2\2\2\u085a\u07fe\3\2\2\2\u085a\u0809\3\2\2"+
		"\2\u085a\u0810\3\2\2\2\u085a\u0816\3\2\2\2\u085a\u081d\3\2\2\2\u085a\u081e"+
		"\3\2\2\2\u085a\u081f\3\2\2\2\u085a\u0820\3\2\2\2\u085a\u0821\3\2\2\2\u085a"+
		"\u0822\3\2\2\2\u085a\u0823\3\2\2\2\u085a\u0824\3\2\2\2\u085a\u0825\3\2"+
		"\2\2\u085a\u0826\3\2\2\2\u085a\u0827\3\2\2\2\u085a\u0828\3\2\2\2\u085a"+
		"\u0829\3\2\2\2\u085a\u082b\3\2\2\2\u085a\u082d\3\2\2\2\u085a\u082f\3\2"+
		"\2\2\u085a\u0831\3\2\2\2\u085a\u0832\3\2\2\2\u085a\u0833\3\2\2\2\u085a"+
		"\u0834\3\2\2\2\u085a\u0835\3\2\2\2\u085a\u0836\3\2\2\2\u085a\u0837\3\2"+
		"\2\2\u085a\u0838\3\2\2\2\u085a\u0839\3\2\2\2\u085a\u083a\3\2\2\2\u085a"+
		"\u083b\3\2\2\2\u085a\u083c\3\2\2\2\u085a\u083e\3\2\2\2\u085a\u0840\3\2"+
		"\2\2\u085a\u0841\3\2\2\2\u085a\u0843\3\2\2\2\u085a\u0845\3\2\2\2\u085a"+
		"\u084a\3\2\2\2\u085a\u084b\3\2\2\2\u085a\u084d\3\2\2\2\u085a\u084e\3\2"+
		"\2\2\u085a\u0850\3\2\2\2\u085a\u0851\3\2\2\2\u085a\u0853\3\2\2\2\u085a"+
		"\u0854\3\2\2\2\u085a\u0856\3\2\2\2\u085a\u0857\3\2\2\2\u085a\u0859\3\2"+
		"\2\2\u085b\u0875\3\2\2\2\u085c\u085d\f\37\2\2\u085d\u0874\7\22\2\2\u085e"+
		"\u085f\f\36\2\2\u085f\u0860\7\13\2\2\u0860\u0874\7\f\2\2\u0861\u0862\f"+
		"\35\2\2\u0862\u0863\7\13\2\2\u0863\u0864\5\20\t\2\u0864\u0865\7\f\2\2"+
		"\u0865\u0874\3\2\2\2\u0866\u0867\f\34\2\2\u0867\u0868\7\13\2\2\u0868\u0869"+
		"\5\20\t\2\u0869\u086a\7\5\2\2\u086a\u086b\5\20\t\2\u086b\u086c\7\f\2\2"+
		"\u086c\u0874\3\2\2\2\u086d\u086e\f\33\2\2\u086e\u086f\7\13\2\2\u086f\u0870"+
		"\7\5\2\2\u0870\u0871\5\20\t\2\u0871\u0872\7\f\2\2\u0872\u0874\3\2\2\2"+
		"\u0873\u085c\3\2\2\2\u0873\u085e\3\2\2\2\u0873\u0861\3\2\2\2\u0873\u0866"+
		"\3\2\2\2\u0873\u086d\3\2\2\2\u0874\u0877\3\2\2\2\u0875\u0873\3\2\2\2\u0875"+
		"\u0876\3\2\2\2\u0876\u010f\3\2\2\2\u0877\u0875\3\2\2\2\u0878\u0880\3\2"+
		"\2\2\u0879\u087a\7\7\2\2\u087a\u087b\7\u00fc\2\2\u087b\u087c\7\n\2\2\u087c"+
		"\u087d\5\20\t\2\u087d\u087e\7\b\2\2\u087e\u0880\3\2\2\2\u087f\u0878\3"+
		"\2\2\2\u087f\u0879\3\2\2\2\u0880\u0111\3\2\2\2\u0881\u08b5\b\u008a\1\2"+
		"\u0882\u08b5\7\u0103\2\2\u0883\u08b5\7\u00e8\2\2\u0884\u08b5\7\u00e9\2"+
		"\2\u0885\u08b5\7\31\2\2\u0886\u08b5\7\32\2\2\u0887\u08b5\7\36\2\2\u0888"+
		"\u08b5\7\37\2\2\u0889\u08b5\7 \2\2\u088a\u08b5\7!\2\2\u088b\u08b5\7#\2"+
		"\2\u088c\u08b5\7$\2\2\u088d\u088e\7\34\2\2\u088e\u08b5\7\36\2\2\u088f"+
		"\u0890\7\34\2\2\u0890\u08b5\7\37\2\2\u0891\u0892\7\34\2\2\u0892\u08b5"+
		"\7 \2\2\u0893\u0894\7\34\2\2\u0894\u08b5\7!\2\2\u0895\u08b5\7\'\2\2\u0896"+
		"\u08b5\7(\2\2\u0897\u08b5\7)\2\2\u0898\u08b5\7*\2\2\u0899\u08b5\7\22\2"+
		"\2\u089a\u08b5\7\u00eb\2\2\u089b\u08b5\7\u00ec\2\2\u089c\u08b5\7\u00ed"+
		"\2\2\u089d\u08b5\7\u00ef\2\2\u089e\u08b5\7\u00f0\2\2\u089f\u08b5\7\u00f3"+
		"\2\2\u08a0\u08b5\7\u00f4\2\2\u08a1\u08b5\7\u00f6\2\2\u08a2\u08b5\7\35"+
		"\2\2\u08a3\u08a4\7\34\2\2\u08a4\u08b5\7\35\2\2\u08a5\u08b5\7&\2\2\u08a6"+
		"\u08b5\7\u0126\2\2\u08a7\u08b5\7\u0104\2\2\u08a8\u08b5\7\u0105\2\2\u08a9"+
		"\u08b5\7\u0106\2\2\u08aa\u08b5\7\u0107\2\2\u08ab\u08b5\7\u0108\2\2\u08ac"+
		"\u08b5\7\u0109\2\2\u08ad\u08b5\7\u010a\2\2\u08ae\u08b5\7\u010b\2\2\u08af"+
		"\u08b5\7\u010c\2\2\u08b0\u08b5\7\u010d\2\2\u08b1\u08b5\7\u010e\2\2\u08b2"+
		"\u08b5\7\u010f\2\2\u08b3\u08b5\7\u0110\2\2\u08b4\u0881\3\2\2\2\u08b4\u0882"+
		"\3\2\2\2\u08b4\u0883\3\2\2\2\u08b4\u0884\3\2\2\2\u08b4\u0885\3\2\2\2\u08b4"+
		"\u0886\3\2\2\2\u08b4\u0887\3\2\2\2\u08b4\u0888\3\2\2\2\u08b4\u0889\3\2"+
		"\2\2\u08b4\u088a\3\2\2\2\u08b4\u088b\3\2\2\2\u08b4\u088c\3\2\2\2\u08b4"+
		"\u088d\3\2\2\2\u08b4\u088f\3\2\2\2\u08b4\u0891\3\2\2\2\u08b4\u0893\3\2"+
		"\2\2\u08b4\u0895\3\2\2\2\u08b4\u0896\3\2\2\2\u08b4\u0897\3\2\2\2\u08b4"+
		"\u0898\3\2\2\2\u08b4\u0899\3\2\2\2\u08b4\u089a\3\2\2\2\u08b4\u089b\3\2"+
		"\2\2\u08b4\u089c\3\2\2\2\u08b4\u089d\3\2\2\2\u08b4\u089e\3\2\2\2\u08b4"+
		"\u089f\3\2\2\2\u08b4\u08a0\3\2\2\2\u08b4\u08a1\3\2\2\2\u08b4\u08a2\3\2"+
		"\2\2\u08b4\u08a3\3\2\2\2\u08b4\u08a5\3\2\2\2\u08b4\u08a6\3\2\2\2\u08b4"+
		"\u08a7\3\2\2\2\u08b4\u08a8\3\2\2\2\u08b4\u08a9\3\2\2\2\u08b4\u08aa\3\2"+
		"\2\2\u08b4\u08ab\3\2\2\2\u08b4\u08ac\3\2\2\2\u08b4\u08ad\3\2\2\2\u08b4"+
		"\u08ae\3\2\2\2\u08b4\u08af\3\2\2\2\u08b4\u08b0\3\2\2\2\u08b4\u08b1\3\2"+
		"\2\2\u08b4\u08b2\3\2\2\2\u08b4\u08b3\3\2\2\2\u08b5\u08bf\3\2\2\2\u08b6"+
		"\u08b7\f\36\2\2\u08b7\u08b8\7\13\2\2\u08b8\u08be\7\f\2\2\u08b9\u08ba\f"+
		"\35\2\2\u08ba\u08be\7\u0111\2\2\u08bb\u08bc\f\34\2\2\u08bc\u08be\7\23"+
		"\2\2\u08bd\u08b6\3\2\2\2\u08bd\u08b9\3\2\2\2\u08bd\u08bb\3\2\2\2\u08be"+
		"\u08c1\3\2\2\2\u08bf\u08bd\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u0113\3\2"+
		"\2\2\u08c1\u08bf\3\2\2\2\u08c2\u08c4\b\u008b\1\2\u08c3\u08c5\7G\2\2\u08c4"+
		"\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c7\7\67"+
		"\2\2\u08c7\u08ec\5\u0108\u0085\2\u08c8\u08ec\7.\2\2\u08c9\u08ca\7H\2\2"+
		"\u08ca\u08ec\5\u0108\u0085\2\u08cb\u08cc\5\u00dco\2\u08cc\u08cd\5h\65"+
		"\2\u08cd\u08ce\5\u0114\u008b\2\u08ce\u08cf\7\22\2\2\u08cf\u08d0\7\7\2"+
		"\2\u08d0\u08d1\5\u0102\u0082\2\u08d1\u08d2\7\b\2\2\u08d2\u08ec\3\2\2\2"+
		"\u08d3\u08d4\7\25\2\2\u08d4\u08d5\7\25\2\2\u08d5\u08ec\5\20\t\2\u08d6"+
		"\u08d7\7\25\2\2\u08d7\u08ec\5\20\t\2\u08d8\u08d9\7\25\2\2\u08d9\u08da"+
		"\7\25\2\2\u08da\u08ec\5\16\b\2\u08db\u08dc\7\25\2\2\u08dc\u08ec\5\16\b"+
		"\2\u08dd\u08ec\78\2\2\u08de\u08ec\7\31\2\2\u08df\u08e5\7I\2\2\u08e0\u08e6"+
		"\7&\2\2\u08e1\u08e3\7\34\2\2\u08e2\u08e1\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3"+
		"\u08e4\3\2\2\2\u08e4\u08e6\7\35\2\2\u08e5\u08e0\3\2\2\2\u08e5\u08e2\3"+
		"\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08ec\3\2\2\2\u08e7\u08ec\5\u0116\u008c"+
		"\2\u08e8\u08e9\7\30\2\2\u08e9\u08ec\5\u0114\u008b\4\u08ea\u08ec\7\26\2"+
		"\2\u08eb\u08c2\3\2\2\2\u08eb\u08c8\3\2\2\2\u08eb\u08c9\3\2\2\2\u08eb\u08cb"+
		"\3\2\2\2\u08eb\u08d3\3\2\2\2\u08eb\u08d6\3\2\2\2\u08eb\u08d8\3\2\2\2\u08eb"+
		"\u08db\3\2\2\2\u08eb\u08dd\3\2\2\2\u08eb\u08de\3\2\2\2\u08eb\u08df\3\2"+
		"\2\2\u08eb\u08e7\3\2\2\2\u08eb\u08e8\3\2\2\2\u08eb\u08ea\3\2\2\2\u08ec"+
		"\u0906\3\2\2\2\u08ed\u08ee\f\23\2\2\u08ee\u08f0\7\13\2\2\u08ef\u08f1\5"+
		"\u0118\u008d\2\u08f0\u08ef\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f2\3\2"+
		"\2\2\u08f2\u0905\7\f\2\2\u08f3\u08f4\f\22\2\2\u08f4\u0905\7\23\2\2\u08f5"+
		"\u08f6\f\21\2\2\u08f6\u0905\7\22\2\2\u08f7\u08f8\f\20\2\2\u08f8\u0905"+
		"\7l\2\2\u08f9\u08fa\f\17\2\2\u08fa\u08fb\t\t\2\2\u08fb\u08fc\7\7\2\2\u08fc"+
		"\u08fd\5\u010c\u0087\2\u08fd\u08fe\7\b\2\2\u08fe\u0905\3\2\2\2";
	private static final String _serializedATNSegment1 =
		"\u08ff\u0900\f\r\2\2\u0900\u0901\7\r\2\2\u0901\u0902\5\u00fe\u0080\2\u0902"+
		"\u0903\7\16\2\2\u0903\u0905\3\2\2\2\u0904\u08ed\3\2\2\2\u0904\u08f3\3"+
		"\2\2\2\u0904\u08f5\3\2\2\2\u0904\u08f7\3\2\2\2\u0904\u08f9\3\2\2\2\u0904"+
		"\u08ff\3\2\2\2\u0905\u0908\3\2\2\2\u0906\u0904\3\2\2\2\u0906\u0907\3\2"+
		"\2\2\u0907\u0115\3\2\2\2\u0908\u0906\3\2\2\2\u0909\u091f\7\33\2\2\u090a"+
		"\u091f\7/\2\2\u090b\u091f\7\32\2\2\u090c\u091f\7\36\2\2\u090d\u091f\7"+
		"\37\2\2\u090e\u091f\7 \2\2\u090f\u091f\7!\2\2\u0910\u091f\7#\2\2\u0911"+
		"\u091f\7$\2\2\u0912\u0913\7\34\2\2\u0913\u091f\7\36\2\2\u0914\u0915\7"+
		"\34\2\2\u0915\u091f\7\37\2\2\u0916\u0917\7\34\2\2\u0917\u091f\7 \2\2\u0918"+
		"\u0919\7\34\2\2\u0919\u091f\7!\2\2\u091a\u091f\7\'\2\2\u091b\u091f\7("+
		"\2\2\u091c\u091f\7)\2\2\u091d\u091f\7*\2\2\u091e\u0909\3\2\2\2\u091e\u090a"+
		"\3\2\2\2\u091e\u090b\3\2\2\2\u091e\u090c\3\2\2\2\u091e\u090d\3\2\2\2\u091e"+
		"\u090e\3\2\2\2\u091e\u090f\3\2\2\2\u091e\u0910\3\2\2\2\u091e\u0911\3\2"+
		"\2\2\u091e\u0912\3\2\2\2\u091e\u0914\3\2\2\2\u091e\u0916\3\2\2\2\u091e"+
		"\u0918\3\2\2\2\u091e\u091a\3\2\2\2\u091e\u091b\3\2\2\2\u091e\u091c\3\2"+
		"\2\2\u091e\u091d\3\2\2\2\u091f\u0117\3\2\2\2\u0920\u0921\b\u008d\1\2\u0921"+
		"\u0922\5\u011a\u008e\2\u0922\u0928\3\2\2\2\u0923\u0924\f\3\2\2\u0924\u0925"+
		"\7\6\2\2\u0925\u0927\5\u011a\u008e\2\u0926\u0923\3\2\2\2\u0927\u092a\3"+
		"\2\2\2\u0928\u0926\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u0119\3\2\2\2\u092a"+
		"\u0928\3\2\2\2\u092b\u0935\3\2\2\2\u092c\u0935\7\30\2\2\u092d\u092f\5"+
		"\20\t\2\u092e\u0930\7\30\2\2\u092f\u092e\3\2\2\2\u092f\u0930\3\2\2\2\u0930"+
		"\u0932\3\2\2\2\u0931\u0933\5\20\t\2\u0932\u0931\3\2\2\2\u0932\u0933\3"+
		"\2\2\2\u0933\u0935\3\2\2\2\u0934\u092b\3\2\2\2\u0934\u092c\3\2\2\2\u0934"+
		"\u092d\3\2\2\2\u0935\u011b\3\2\2\2\u0936\u0937\7\u00b3\2\2\u0937\u0938"+
		"\5\u012c\u0097\2\u0938\u0939\5\u010c\u0087\2\u0939\u093a\7\7\2\2\u093a"+
		"\u093b\5\u0124\u0093\2\u093b\u093c\7\b\2\2\u093c\u0959\3\2\2\2\u093d\u093e"+
		"\7\u00b3\2\2\u093e\u093f\5\u012c\u0097\2\u093f\u0940\5\u010c\u0087\2\u0940"+
		"\u0941\7\n\2\2\u0941\u0942\7\3\2\2\u0942\u0943\5\36\20\2\u0943\u0944\7"+
		"\4\2\2\u0944\u0959\3\2\2\2\u0945\u0946\7\u00b3\2\2\u0946\u0947\5\u012c"+
		"\u0097\2\u0947\u0948\5\u010c\u0087\2\u0948\u0959\3\2\2\2\u0949\u094a\5"+
		"\u0122\u0092\2\u094a\u094b\5\u00c2b\2\u094b\u094c\7\b\2\2\u094c\u0959"+
		"\3\2\2\2\u094d\u094e\7\u00b4\2\2\u094e\u094f\5\u012c\u0097\2\u094f\u0950"+
		"\5\b\5\2\u0950\u0959\3\2\2\2\u0951\u0952\7\u00b4\2\2\u0952\u0953\5\u012c"+
		"\u0097\2\u0953\u0954\7\n\2\2\u0954\u0955\7\3\2\2\u0955\u0956\5\u011e\u0090"+
		"\2\u0956\u0957\7\4\2\2\u0957\u0959\3\2\2\2\u0958\u0936\3\2\2\2\u0958\u093d"+
		"\3\2\2\2\u0958\u0945\3\2\2\2\u0958\u0949\3\2\2\2\u0958\u094d\3\2\2\2\u0958"+
		"\u0951\3\2\2\2\u0959\u011d\3\2\2\2\u095a\u0961\3\2\2\2\u095b\u0961\5\u0120"+
		"\u0091\2\u095c\u095d\5\u0120\u0091\2\u095d\u095e\7\6\2\2\u095e\u095f\5"+
		"\u011e\u0090\2\u095f\u0961\3\2\2\2\u0960\u095a\3\2\2\2\u0960\u095b\3\2"+
		"\2\2\u0960\u095c\3\2\2\2\u0961\u011f\3\2\2\2\u0962\u0963\5\u010c\u0087"+
		"\2\u0963\u0964\7\n\2\2\u0964\u0965\7\3\2\2\u0965\u0966\5\"\22\2\u0966"+
		"\u0967\7\4\2\2\u0967\u0970\3\2\2\2\u0968\u0969\7\67\2\2\u0969\u096a\7"+
		"\u0128\2\2\u096a\u096b\7\n\2\2\u096b\u096c\7\3\2\2\u096c\u096d\5\"\22"+
		"\2\u096d\u096e\7\4\2\2\u096e\u0970\3\2\2\2\u096f\u0962\3\2\2\2\u096f\u0968"+
		"\3\2\2\2\u0970\u0121\3\2\2\2\u0971\u0972\7\u00b4\2\2\u0972\u0973\5\u012c"+
		"\u0097\2\u0973\u0974\7\n\2\2\u0974\u0975\7\7\2\2\u0975\u097c\3\2\2\2\u0976"+
		"\u0977\7\u00b4\2\2\u0977\u0978\5\u012c\u0097\2\u0978\u0979\7%\2\2\u0979"+
		"\u097a\7\7\2\2\u097a\u097c\3\2\2\2\u097b\u0971\3\2\2\2\u097b\u0976\3\2"+
		"\2\2\u097c\u0123\3\2\2\2\u097d\u0983\5\u0126\u0094\2\u097e\u097f\5\u0126"+
		"\u0094\2\u097f\u0980\7\6\2\2\u0980\u0981\5\u0124\u0093\2\u0981\u0983\3"+
		"\2\2\2\u0982\u097d\3\2\2\2\u0982\u097e\3\2\2\2\u0983\u0125\3\2\2\2\u0984"+
		"\u0985\5\b\5\2\u0985\u0986\7\n\2\2\u0986\u0987\5\u012a\u0096\2\u0987\u0127"+
		"\3\2\2\2\u0988\u0989\t\n\2\2\u0989\u0129\3\2\2\2\u098a\u09ad\5\u0128\u0095"+
		"\2\u098b\u09ad\5\20\t\2\u098c\u098d\7 \2\2\u098d\u098e\7\7\2\2\u098e\u098f"+
		"\5\20\t\2\u098f\u0990\7\b\2\2\u0990\u09ad\3\2\2\2\u0991\u09ad\5\b\5\2"+
		"\u0992\u0993\5\u0108\u0085\2\u0993\u0994\7\7\2\2\u0994\u0995\7\36\2\2"+
		"\u0995\u0996\7\21\2\2\u0996\u0997\5\20\t\2\u0997\u0998\7\b\2\2\u0998\u09ad"+
		"\3\2\2\2\u0999\u099a\5\u0108\u0085\2\u099a\u099b\7\7\2\2\u099b\u099c\7"+
		"\37\2\2\u099c\u099d\7\21\2\2\u099d\u099e\5\20\t\2\u099e\u099f\7\b\2\2"+
		"\u099f\u09ad\3\2\2\2\u09a0\u09a1\5\u0108\u0085\2\u09a1\u09a2\7\7\2\2\u09a2"+
		"\u09a3\7 \2\2\u09a3\u09a4\7\21\2\2\u09a4\u09a5\5\20\t\2\u09a5\u09a6\7"+
		"\b\2\2\u09a6\u09ad\3\2\2\2\u09a7\u09a8\5\u0108\u0085\2\u09a8\u09a9\7\7"+
		"\2\2\u09a9\u09aa\5\20\t\2\u09aa\u09ab\7\b\2\2\u09ab\u09ad\3\2\2\2\u09ac"+
		"\u098a\3\2\2\2\u09ac\u098b\3\2\2\2\u09ac\u098c\3\2\2\2\u09ac\u0991\3\2"+
		"\2\2\u09ac\u0992\3\2\2\2\u09ac\u0999\3\2\2\2\u09ac\u09a0\3\2\2\2\u09ac"+
		"\u09a7\3\2\2\2\u09ad\u012b\3\2\2\2\u09ae\u09af\t\13\2\2\u09af\u012d\3"+
		"\2\2\2\u09b0\u09b1\t\f\2\2\u09b1\u012f\3\2\2\2\u09b2\u09b3\5\u012e\u0098"+
		"\2\u09b3\u09b4\5\20\t\2\u09b4\u09b5\7\u0128\2\2\u09b5\u09fa\3\2\2\2\u09b6"+
		"\u09b7\5\u012e\u0098\2\u09b7\u09b8\5\20\t\2\u09b8\u09fa\3\2\2\2\u09b9"+
		"\u09ba\5\u012e\u0098\2\u09ba\u09bb\5\20\t\2\u09bb\u09bc\7\21\2\2\u09bc"+
		"\u09bd\5\20\t\2\u09bd\u09be\7\u0128\2\2\u09be\u09fa\3\2\2\2\u09bf\u09c0"+
		"\5\u012e\u0098\2\u09c0\u09c1\5\20\t\2\u09c1\u09c2\7\21\2\2\u09c2\u09c3"+
		"\5\20\t\2\u09c3\u09fa\3\2\2\2\u09c4\u09c5\5\u012e\u0098\2\u09c5\u09c6"+
		"\5\20\t\2\u09c6\u09c7\7\21\2\2\u09c7\u09c8\5\20\t\2\u09c8\u09c9\7\6\2"+
		"\2\u09c9\u09ca\5\20\t\2\u09ca\u09cb\7\u0128\2\2\u09cb\u09fa\3\2\2\2\u09cc"+
		"\u09cd\5\u012e\u0098\2\u09cd\u09ce\5\20\t\2\u09ce\u09cf\7\21\2\2\u09cf"+
		"\u09d0\5\20\t\2\u09d0\u09d1\7\6\2\2\u09d1\u09d2\5\20\t\2\u09d2\u09fa\3"+
		"\2\2\2\u09d3\u09d4\5\u012e\u0098\2\u09d4\u09d5\5\20\t\2\u09d5\u09d6\7"+
		"\6\2\2\u09d6\u09d7\5\20\t\2\u09d7\u09d8\7\21\2\2\u09d8\u09d9\5\20\t\2"+
		"\u09d9\u09da\7\u0128\2\2\u09da\u09fa\3\2\2\2\u09db\u09dc\5\u012e\u0098"+
		"\2\u09dc\u09dd\5\20\t\2\u09dd\u09de\7\6\2\2\u09de\u09df\5\20\t\2\u09df"+
		"\u09e0\7\21\2\2\u09e0\u09e1\5\20\t\2\u09e1\u09fa\3\2\2\2\u09e2\u09e3\5"+
		"\u012e\u0098\2\u09e3\u09e4\5\20\t\2\u09e4\u09e5\7\6\2\2\u09e5\u09e6\5"+
		"\20\t\2\u09e6\u09e7\7\21\2\2\u09e7\u09e8\5\20\t\2\u09e8\u09e9\7\6\2\2"+
		"\u09e9\u09ea\5\20\t\2\u09ea\u09eb\7\u0128\2\2\u09eb\u09fa\3\2\2\2\u09ec"+
		"\u09ed\5\u012e\u0098\2\u09ed\u09ee\5\20\t\2\u09ee\u09ef\7\6\2\2\u09ef"+
		"\u09f0\5\20\t\2\u09f0\u09f1\7\21\2\2\u09f1\u09f2\5\20\t\2\u09f2\u09f3"+
		"\7\6\2\2\u09f3\u09f4\5\20\t\2\u09f4\u09fa\3\2\2\2\u09f5\u09f6\5\u012e"+
		"\u0098\2\u09f6\u09f7\5\20\t\2\u09f7\u09f8\7\u0127\2\2\u09f8\u09fa\3\2"+
		"\2\2\u09f9\u09b2\3\2\2\2\u09f9\u09b6\3\2\2\2\u09f9\u09b9\3\2\2\2\u09f9"+
		"\u09bf\3\2\2\2\u09f9\u09c4\3\2\2\2\u09f9\u09cc\3\2\2\2\u09f9\u09d3\3\2"+
		"\2\2\u09f9\u09db\3\2\2\2\u09f9\u09e2\3\2\2\2\u09f9\u09ec\3\2\2\2\u09f9"+
		"\u09f5\3\2\2\2\u09fa\u0131\3\2\2\2\u09fb\u09fc\7\u00d1\2\2\u09fc\u09fd"+
		"\5\u0134\u009b\2\u09fd\u09fe\5\16\b\2\u09fe\u09ff\5\u0136\u009c\2\u09ff"+
		"\u0a00\5\u0138\u009d\2\u0a00\u0a01\5\u00c2b\2\u0a01\u0a02\7\b\2\2\u0a02"+
		"\u0a03\5\u0136\u009c\2\u0a03\u0a0a\3\2\2\2\u0a04\u0a05\7\u00d1\2\2\u0a05"+
		"\u0a06\5\u0134\u009b\2\u0a06\u0a07\5\16\b\2\u0a07\u0a08\5\u0136\u009c"+
		"\2\u0a08\u0a0a\3\2\2\2\u0a09\u09fb\3\2\2\2\u0a09\u0a04\3\2\2\2\u0a0a\u0133"+
		"\3\2\2\2\u0a0b\u0a10\b\u009b\1\2\u0a0c\u0a0d\f\3\2\2\u0a0d\u0a0f\7\u00d2"+
		"\2\2\u0a0e\u0a0c\3\2\2\2\u0a0f\u0a12\3\2\2\2\u0a10\u0a0e\3\2\2\2\u0a10"+
		"\u0a11\3\2\2\2\u0a11\u0135\3\2\2\2\u0a12\u0a10\3\2\2\2\u0a13\u0a16\3\2"+
		"\2\2\u0a14\u0a16\7\u00a8\2\2\u0a15\u0a13\3\2\2\2\u0a15\u0a14\3\2\2\2\u0a16"+
		"\u0137\3\2\2\2\u0a17\u0a18\7\u00d3\2\2\u0a18\u0a19\7\n\2\2\u0a19\u0a1a"+
		"\7\7\2\2\u0a1a\u0139\3\2\2\2\u0a1b\u0a1f\7\u00d4\2\2\u0a1c\u0a1e\5\u013c"+
		"\u009f\2\u0a1d\u0a1c\3\2\2\2\u0a1e\u0a21\3\2\2\2\u0a1f\u0a20\3\2\2\2\u0a1f"+
		"\u0a1d\3\2\2\2\u0a20\u0a22\3\2\2\2\u0a21\u0a1f\3\2\2\2\u0a22\u0a23\5\16"+
		"\b\2\u0a23\u013b\3\2\2\2\u0a24\u0a2f\7g\2\2\u0a25\u0a2f\7h\2\2\u0a26\u0a2f"+
		"\7i\2\2\u0a27\u0a28\7\u00de\2\2\u0a28\u0a2f\7\u00df\2\2\u0a29\u0a2f\7"+
		"\u0080\2\2\u0a2a\u0a2f\7\u00e0\2\2\u0a2b\u0a2f\7\u00e1\2\2\u0a2c\u0a2f"+
		"\7\u00e2\2\2\u0a2d\u0a2f\7\u00e3\2\2\u0a2e\u0a24\3\2\2\2\u0a2e\u0a25\3"+
		"\2\2\2\u0a2e\u0a26\3\2\2\2\u0a2e\u0a27\3\2\2\2\u0a2e\u0a29\3\2\2\2\u0a2e"+
		"\u0a2a\3\2\2\2\u0a2e\u0a2b\3\2\2\2\u0a2e\u0a2c\3\2\2\2\u0a2e\u0a2d\3\2"+
		"\2\2\u0a2f\u013d\3\2\2\2\u0a30\u0a32\5\u0140\u00a1\2\u0a31\u0a30\3\2\2"+
		"\2\u0a32\u0a35\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a33\u0a31\3\2\2\2\u0a34\u013f"+
		"\3\2\2\2\u0a35\u0a33\3\2\2\2\u0a36\u0a37\7\u00d3\2\2\u0a37\u0a38\7\u00d7"+
		"\2\2\u0a38\u0a3c\5\20\t\2\u0a39\u0a3c\5\u011c\u008f\2\u0a3a\u0a3c\5\u0144"+
		"\u00a3\2\u0a3b\u0a36\3\2\2\2\u0a3b\u0a39\3\2\2\2\u0a3b\u0a3a\3\2\2\2\u0a3c"+
		"\u0141\3\2\2\2\u0a3d\u0a40\5\20\t\2\u0a3e\u0a40\7\22\2\2\u0a3f\u0a3d\3"+
		"\2\2\2\u0a3f\u0a3e\3\2\2\2\u0a40\u0143\3\2\2\2\u0a41\u0a42\5\u0146\u00a4"+
		"\2\u0a42\u0a43\5\u00c2b\2\u0a43\u0a44\7\b\2\2\u0a44\u0a57\3\2\2\2\u0a45"+
		"\u0a46\7\u00d8\2\2\u0a46\u0a47\5\u0142\u00a2\2\u0a47\u0a48\7\21\2\2\u0a48"+
		"\u0a49\5\u0142\u00a2\2\u0a49\u0a4a\7\21\2\2\u0a4a\u0a4b\5\u0142\u00a2"+
		"\2\u0a4b\u0a4c\7\21\2\2\u0a4c\u0a4d\5\u0142\u00a2\2\u0a4d\u0a57\3\2\2"+
		"\2\u0a4e\u0a4f\7\u00d9\2\2\u0a4f\u0a57\5\b\5\2\u0a50\u0a51\5\u014a\u00a6"+
		"\2\u0a51\u0a52\5\u00c2b\2\u0a52\u0a53\7\b\2\2\u0a53\u0a57\3\2\2\2\u0a54"+
		"\u0a57\5&\24\2\u0a55\u0a57\5\30\r\2\u0a56\u0a41\3\2\2\2\u0a56\u0a45\3"+
		"\2\2\2\u0a56\u0a4e\3\2\2\2\u0a56\u0a50\3\2\2\2\u0a56\u0a54\3\2\2\2\u0a56"+
		"\u0a55\3\2\2\2\u0a57\u0145\3\2\2\2\u0a58\u0a59\7\u00d5\2\2\u0a59\u0a5a"+
		"\7\n\2\2\u0a5a\u0a5b\7\7\2\2\u0a5b\u0147\3\2\2\2\u0a5c\u0a5d\7\u00d6\2"+
		"\2\u0a5d\u0a5e\7\n\2\2\u0a5e\u0a5f\7\7\2\2\u0a5f\u0149\3\2\2\2\u0a60\u0a61"+
		"\7\u00d9\2\2\u0a61\u0a62\7\n\2\2\u0a62\u0a63\7\7\2\2\u0a63\u014b\3\2\2"+
		"\2\u0a64\u0a65\7\u00d4\2\2\u0a65\u0a69\7\u00da\2\2\u0a66\u0a68\5\u013c"+
		"\u009f\2\u0a67\u0a66\3\2\2\2\u0a68\u0a6b\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a69"+
		"\u0a67\3\2\2\2\u0a6a\u0a6c\3\2\2\2\u0a6b\u0a69\3\2\2\2\u0a6c\u0a6f\5\16"+
		"\b\2\u0a6d\u0a6e\7\u008a\2\2\u0a6e\u0a70\5\16\b\2\u0a6f\u0a6d\3\2\2\2"+
		"\u0a6f\u0a70\3\2\2\2\u0a70\u014d\3\2\2\2\u0a71\u0a73\5\u0150\u00a9\2\u0a72"+
		"\u0a71\3\2\2\2\u0a73\u0a76\3\2\2\2\u0a74\u0a75\3\2\2\2\u0a74\u0a72\3\2"+
		"\2\2\u0a75\u014f\3\2\2\2\u0a76\u0a74\3\2\2\2\u0a77\u0a78\5\u0138\u009d"+
		"\2\u0a78\u0a79\5\u00c2b\2\u0a79\u0a7a\7\b\2\2\u0a7a\u0a82\3\2\2\2\u0a7b"+
		"\u0a82\5\u0144\u00a3\2\u0a7c\u0a7d\5\u0148\u00a5\2\u0a7d\u0a7e\5\u00c2"+
		"b\2\u0a7e\u0a7f\7\b\2\2\u0a7f\u0a82\3\2\2\2\u0a80\u0a82\7W\2\2\u0a81\u0a77"+
		"\3\2\2\2\u0a81\u0a7b\3\2\2\2\u0a81\u0a7c\3\2\2\2\u0a81\u0a80\3\2\2\2\u0a82"+
		"\u0151\3\2\2\2\u0a83\u0a84\7\u009c\2\2\u0a84\u0a85\7\u00da\2\2\u0a85\u0a86"+
		"\5\u0156\u00ac\2\u0a86\u0a87\5\16\b\2\u0a87\u0153\3\2\2\2\u0a88\u0a89"+
		"\7\u00dd\2\2\u0a89\u0a8a\5\u0156\u00ac\2\u0a8a\u0a8b\5\16\b\2\u0a8b\u0155"+
		"\3\2\2\2\u0a8c\u0a9c\7O\2\2\u0a8d\u0a9c\7N\2\2\u0a8e\u0a9c\7L\2\2\u0a8f"+
		"\u0a90\7U\2\2\u0a90\u0a9c\7N\2\2\u0a91\u0a92\7U\2\2\u0a92\u0a9c\7O\2\2"+
		"\u0a93\u0a94\7U\2\2\u0a94\u0a9c\7P\2\2\u0a95\u0a96\7U\2\2\u0a96\u0a9c"+
		"\7r\2\2\u0a97\u0a98\7U\2\2\u0a98\u0a9c\7s\2\2\u0a99\u0a9a\7U\2\2\u0a9a"+
		"\u0a9c\7t\2\2\u0a9b\u0a8c\3\2\2\2\u0a9b\u0a8d\3\2\2\2\u0a9b\u0a8e\3\2"+
		"\2\2\u0a9b\u0a8f\3\2\2\2\u0a9b\u0a91\3\2\2\2\u0a9b\u0a93\3\2\2\2\u0a9b"+
		"\u0a95\3\2\2\2\u0a9b\u0a97\3\2\2\2\u0a9b\u0a99\3\2\2\2\u0a9c\u0a9f\3\2"+
		"\2\2\u0a9d\u0a9b\3\2\2\2\u0a9d\u0a9e\3\2\2\2\u0a9e\u0157\3\2\2\2\u0a9f"+
		"\u0a9d\3\2\2\2\u0aa0\u0aa2\5\u015a\u00ae\2\u0aa1\u0aa0\3\2\2\2\u0aa2\u0aa5"+
		"\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa3\u0aa1\3\2\2\2\u0aa4\u0159\3\2\2\2\u0aa5"+
		"\u0aa3\3\2\2\2\u0aa6\u0aa7\7\u00d1\2\2\u0aa7\u0ab8\5\16\b\2\u0aa8\u0aa9"+
		"\7\u009c\2\2\u0aa9\u0aaa\7\u00da\2\2\u0aaa\u0ab8\5\u010a\u0086\2\u0aab"+
		"\u0aac\7\u00d4\2\2\u0aac\u0aad\7\u00da\2\2\u0aad\u0ab8\5\16\b\2\u0aae"+
		"\u0aaf\7-\2\2\u0aaf\u0ab0\7\7\2\2\u0ab0\u0ab1\5\20\t\2\u0ab1\u0ab2\7\b"+
		"\2\2\u0ab2\u0ab8\3\2\2\2\u0ab3\u0ab4\7\u009c\2\2\u0ab4\u0ab8\5\20\t\2"+
		"\u0ab5\u0ab8\5&\24\2\u0ab6\u0ab8\5\30\r\2\u0ab7\u0aa6\3\2\2\2\u0ab7\u0aa8"+
		"\3\2\2\2\u0ab7\u0aab\3\2\2\2\u0ab7\u0aae\3\2\2\2\u0ab7\u0ab3\3\2\2\2\u0ab7"+
		"\u0ab5\3\2\2\2\u0ab7\u0ab6\3\2\2\2\u0ab8\u015b\3\2\2\2\u0ab9\u0abd\7\u00db"+
		"\2\2\u0aba\u0abc\5\u015e\u00b0\2\u0abb\u0aba\3\2\2\2\u0abc\u0abf\3\2\2"+
		"\2\u0abd\u0abe\3\2\2\2\u0abd\u0abb\3\2\2\2\u0abe\u0ac0\3\2\2\2\u0abf\u0abd"+
		"\3\2\2\2\u0ac0\u0ac3\5\16\b\2\u0ac1\u0ac2\7\u008a\2\2\u0ac2\u0ac4\5\16"+
		"\b\2\u0ac3\u0ac1\3\2\2\2\u0ac3\u0ac4\3\2\2\2\u0ac4\u015d\3\2\2\2\u0ac5"+
		"\u0ac6\t\r\2\2\u0ac6\u015f\3\2\2\2\u0ac7\u0ac9\5\u0162\u00b2\2\u0ac8\u0ac7"+
		"\3\2\2\2\u0ac9\u0acc\3\2\2\2\u0aca\u0acb\3\2\2\2\u0aca\u0ac8\3\2\2\2\u0acb"+
		"\u0161\3\2\2\2\u0acc\u0aca\3\2\2\2\u0acd\u0ace\7\u00d1\2\2\u0ace\u0acf"+
		"\5\16\b\2\u0acf\u0ad0\7B\2\2\u0ad0\u0ad1\5\20\t\2\u0ad1\u0ad8\3\2\2\2"+
		"\u0ad2\u0ad3\7\u00d4\2\2\u0ad3\u0ad4\7\u00da\2\2\u0ad4\u0ad8\5\16\b\2"+
		"\u0ad5\u0ad8\5&\24\2\u0ad6\u0ad8\5\30\r\2\u0ad7\u0acd\3\2\2\2\u0ad7\u0ad2"+
		"\3\2\2\2\u0ad7\u0ad5\3\2\2\2\u0ad7\u0ad6\3\2\2\2\u0ad8\u0163\3\2\2\2\u00b2"+
		"\u0167\u01aa\u01b0\u01ba\u01c9\u01d0\u01e1\u01f0\u01f7\u0204\u020b\u021a"+
		"\u021e\u0225\u0227\u0231\u0233\u0243\u024a\u024f\u0266\u0268\u027c\u02a0"+
		"\u02a4\u02a9\u02ae\u02b9\u02be\u02c8\u02d0\u02d8\u02dc\u02e4\u02ec\u033a"+
		"\u0345\u0349\u0350\u0357\u0376\u037b\u0380\u0387\u038e\u0393\u039c\u03a5"+
		"\u03ab\u03c0\u03cb\u03d2\u03d4\u03da\u03e9\u03fa\u03fc\u0402\u040f\u0417"+
		"\u041e\u0426\u042d\u043a\u0458\u045c\u0461\u0465\u0482\u0487\u0496\u04ab"+
		"\u04b2\u04bc\u04c8\u04d6\u04e2\u04ec\u04f6\u04fe\u0508\u050a\u0519\u0525"+
		"\u0533\u053e\u054d\u0552\u0554\u0560\u0565\u056c\u0573\u057a\u05bb\u061f"+
		"\u0629\u06e3\u06ea\u06ec\u06f4\u06f6\u06fe\u0706\u070e\u0716\u071e\u0726"+
		"\u0728\u0733\u0735\u073d\u0747\u0756\u075b\u0765\u0777\u0795\u07a2\u07aa"+
		"\u07b1\u07b5\u07bc\u07c3\u07c9\u07cb\u07e6\u07ed\u07fb\u085a\u0873\u0875"+
		"\u087f\u08b4\u08bd\u08bf\u08c4\u08e2\u08e5\u08eb\u08f0\u0904\u0906\u091e"+
		"\u0928\u092f\u0932\u0934\u0958\u0960\u096f\u097b\u0982\u09ac\u09f9\u0a09"+
		"\u0a10\u0a15\u0a1f\u0a2e\u0a33\u0a3b\u0a3f\u0a56\u0a69\u0a6f\u0a74\u0a81"+
		"\u0a9b\u0a9d\u0aa3\u0ab7\u0abd\u0ac3\u0aca\u0ad7";
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
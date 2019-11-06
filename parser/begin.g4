

decls                   : /* EMPTY */
                        | decls decl
                        ;
/* Module-level declarations */
decl                    : classHead '{' classDecls '}' 
                        | nameSpaceHead '{' decls '}' 
                        | methodHead  methodDecls '}' 
                        | fieldDecl
                        | dataDecl
                        | vtableDecl
                        | vtfixupDecl
                        | extSourceSpec
                        | fileDecl
                        | assemblyHead '{' assemblyDecls '}' 
                        | assemblyRefHead '{' assemblyRefDecls '}' 
                        | exptypeHead '{' exptypeDecls '}' 
                        | manifestResHead '{' manifestResDecls '}' 
                        | moduleHead
                        | secDecl
                        | customAttrDecl
                        | D_SUBSYSTEM int32 
                        | D_CORFLAGS int32 
                        | D_FILE K_ALIGNMENT int32 
                        | D_IMAGEBASE int64 
                        | D_STACKRESERVE int64 
                        | languageDecl
                        | typedefDecl
                        | compControl
                        | D_TYPELIST '{' classNameSeq '}'
                        | D_MSCORLIB 
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

dottedName              : id 
                        | DOTTEDNAME 
                        | dottedName '.' dottedName 
                        ;

int32                   : INT32 
                        ;

int64                   : INT64 
                        | INT32 
                        ;

float64                 : FLOAT64 
                        | K_FLOAT32 '(' int32 ')' 
                        | K_FLOAT64 '(' int64 ')' 
                        ;

/*  Aliasing of types, type specs, methods, fields and custom attributes */
typedefDecl             : D_TYPEDEF type K_AS dottedName 
                        | D_TYPEDEF className K_AS dottedName 
                        | D_TYPEDEF memberRef K_AS dottedName 
                        | D_TYPEDEF customDescr K_AS dottedName 
                        | D_TYPEDEF customDescrWithOwner K_AS dottedName 
                        ;

/*  Compilation control directives are processed within yylex(),
    displayed here just for grammar completeness */
compControl             : P_DEFINE dottedName 
                        | P_DEFINE dottedName compQstring 
                        | P_UNDEF dottedName 
                        | P_IFDEF dottedName 
                        | P_IFNDEF dottedName 
                        | P_ELSE 
                        | P_ENDIF 
                        | P_INCLUDE QSTRING 
                        | ';' 
                        ;

/* Custom attribute declarations  */
customDescr             : D_CUSTOM customType 
                        | D_CUSTOM customType '=' compQstring 
                        | D_CUSTOM customType '=' '{' customBlobDescr '}' 
                        | customHead bytes ')' 
                        ;

customDescrWithOwner    : D_CUSTOM '(' ownerType ')' customType 
                        | D_CUSTOM '(' ownerType ')' customType '=' compQstring 
                        | D_CUSTOM '(' ownerType ')' customType '=' '{' customBlobDescr '}' 
                        | customHeadWithOwner bytes ')' 
                        ;

customHead              : D_CUSTOM customType '=' '(' 
                        ;

customHeadWithOwner     : D_CUSTOM '(' ownerType ')' customType '=' '(' 
                        ;

customType              : methodRef 
                        ;

ownerType               : typeSpec 
                        | memberRef 
                        ;

/*  Verbal description of custom attribute initialization blob  */
customBlobDescr         : customBlobArgs customBlobNVPairs 
                        ;

customBlobArgs          : /* EMPTY */ 
                        | customBlobArgs serInit 
                        | customBlobArgs compControl 
                        ;

customBlobNVPairs       : /* EMPTY */ 
                        | customBlobNVPairs fieldOrProp serializType dottedName '=' serInit 
                        | customBlobNVPairs compControl 
                        ;

fieldOrProp             : K_FIELD 
                        | K_PROPERTY 
                        ;

customAttrDecl          : customDescr 
                        | customDescrWithOwner 
                        | TYPEDEF_CA 
                        ;

serializType            : simpleType 
                        | K_TYPE 
                        | K_OBJECT 
                        | K_ENUM K_CLASS SQSTRING 
                        | K_ENUM className 
                        | serializType '[' ']' 
                        ;


/*  Module declaration */
moduleHead              : D_MODULE 
                        | D_MODULE dottedName 
                        | D_MODULE K_EXTERN dottedName 
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
nameSpaceHead           : D_NAMESPACE dottedName 
                        ;

klass                  : D_CLASS 
                        ;

classHeadBegin          : klass classAttr dottedName typarsClause 
                        ;
classHead               : classHeadBegin extendsClause implClause 
                        ;

classAttr               : /* EMPTY */ 
                        | classAttr K_PUBLIC 
                        | classAttr K_PRIVATE 
                        | classAttr K_VALUE 
                        | classAttr K_ENUM 
                        | classAttr K_INTERFACE 
                        | classAttr K_SEALED 
                        | classAttr K_ABSTRACT 
                        | classAttr K_AUTO 
                        | classAttr K_SEQUENTIAL 
                        | classAttr K_EXPLICIT 
                        | classAttr K_ANSI 
                        | classAttr K_UNICODE 
                        | classAttr K_AUTOCHAR 
                        | classAttr K_IMPORT 
                        | classAttr K_SERIALIZABLE 
                        | classAttr K_WINDOWSRUNTIME 
                        | classAttr K_NESTED K_PUBLIC 
                        | classAttr K_NESTED K_PRIVATE 
                        | classAttr K_NESTED K_FAMILY 
                        | classAttr K_NESTED K_ASSEMBLY 
                        | classAttr K_NESTED K_FAMANDASSEM 
                        | classAttr K_NESTED K_FAMORASSEM 
                        | classAttr K_BEFOREFIELDINIT 
                        | classAttr K_SPECIALNAME 
                        | classAttr K_RTSPECIALNAME 
                        | classAttr K_FLAGS '(' int32 ')' 
                        ;

extendsClause           : /* EMPTY */
                        | K_EXTENDS typeSpec 
                        ;

implClause              : /* EMPTY */
                        | K_IMPLEMENTS implList
                        ;

classDecls              : /* EMPTY */
                        | classDecls classDecl
                        ;

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

typars                  : typarAttribs tyBound dottedName typarsRest 
                        | typarAttribs dottedName typarsRest 
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
classDecl               : methodHead  methodDecls '}' 
                        | classHead '{' classDecls '}' 
                        | eventHead '{' eventDecls '}' 
                        | propHead '{' propDecls '}' 
                        | fieldDecl
                        | dataDecl
                        | secDecl
                        | extSourceSpec
                        | customAttrDecl
                        | D_SIZE int32 
                        | D_PACK int32 
                        | exportHead '{' exptypeDecls '}' 
                        | D_OVERRIDE typeSpec DCOLON methodName K_WITH callConv type typeSpec DCOLON methodName '(' sigArgs0 ')' 
                        | D_OVERRIDE K_METHOD callConv type typeSpec DCOLON methodName genArity '(' sigArgs0 ')' K_WITH K_METHOD callConv type typeSpec DCOLON methodName genArity '(' sigArgs0 ')' 
                        | languageDecl
                        | compControl
                        | D_PARAM K_TYPE '[' int32 ']' 
                        | D_PARAM K_TYPE dottedName 
                        | D_PARAM K_CONSTRAINT '[' int32 ']' ',' typeSpec 
                        | D_PARAM K_CONSTRAINT dottedName ',' typeSpec 
                        | D_INTERFACEIMPL K_TYPE typeSpec customDescr 
                        ;

/*  Field declaration  */
fieldDecl               : D_FIELD repeatOpt fieldAttr type dottedName atOpt initOpt 
                        ;

fieldAttr               : /* EMPTY */ 
                        | fieldAttr K_STATIC 
                        | fieldAttr K_PUBLIC 
                        | fieldAttr K_PRIVATE 
                        | fieldAttr K_FAMILY 
                        | fieldAttr K_INITONLY 
                        | fieldAttr K_RTSPECIALNAME  /**/
                        | fieldAttr K_SPECIALNAME 
                                                /* <STRIP>commented out because PInvoke for fields is not supported by EE
                        | fieldAttr K_PINVOKEIMPL '(' compQstring K_AS compQstring pinvAttr ')' 
                        | fieldAttr K_PINVOKEIMPL '(' compQstring  pinvAttr ')' 
                        | fieldAttr K_PINVOKEIMPL '(' pinvAttr ')' 
                                                </STRIP>*/
                        | fieldAttr K_MARSHAL '(' marshalBlob ')' 
                        | fieldAttr K_ASSEMBLY 
                        | fieldAttr K_FAMANDASSEM 
                        | fieldAttr K_FAMORASSEM 
                        | fieldAttr K_PRIVATESCOPE 
                        | fieldAttr K_LITERAL 
                        | fieldAttr K_NOTSERIALIZED 
                        | fieldAttr K_FLAGS '(' int32 ')' 
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
methodRef               : callConv type typeSpec DCOLON methodName tyArgs0 '(' sigArgs0 ')' 
                        | callConv type typeSpec DCOLON methodName genArityNotEmpty '(' sigArgs0 ')' 
                        | callConv type methodName tyArgs0 '(' sigArgs0 ')' 
                        | callConv type methodName genArityNotEmpty '(' sigArgs0 ')' 
                        | mdtoken 
                        | TYPEDEF_M 
                        | TYPEDEF_MR 
                        ;

callConv                : K_INSTANCE callConv 
                        | K_EXPLICIT callConv 
                        | callKind 
                        | K_CALLCONV '(' int32 ')' 
                        ;

callKind                : /* EMPTY */ 
                        | K_DEFAULT 
                        | K_VARARG 
                        | K_UNMANAGED K_CDECL 
                        | K_UNMANAGED K_STDCALL 
                        | K_UNMANAGED K_THISCALL 
                        | K_UNMANAGED K_FASTCALL 
                        ;

mdtoken                 : K_MDTOKEN '(' int32 ')' 
                        ;

memberRef               : methodSpec methodRef 
                        | K_FIELD type typeSpec DCOLON dottedName 
                        | K_FIELD type dottedName 
                        | K_FIELD TYPEDEF_F 
                        | K_FIELD TYPEDEF_MR 
                        | mdtoken 
                        ;

/*  Event declaration  */
eventHead               : D_EVENT eventAttr typeSpec dottedName 
                        | D_EVENT eventAttr dottedName 
                        ;


eventAttr               : /* EMPTY */ 
                        | eventAttr K_RTSPECIALNAME /**/
                        | eventAttr K_SPECIALNAME 
                        ;

eventDecls              : /* EMPTY */
                        | eventDecls eventDecl
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
                        | propAttr K_RTSPECIALNAME /**/
                        | propAttr K_SPECIALNAME 
                        ;

propDecls               : /* EMPTY */
                        | propDecls propDecl
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

methodHead              : methodHeadPart1 methAttr callConv paramAttr type marshalClause methodName typarsClause'(' sigArgs0 ')' implAttr '{' 
                        ;

methAttr                : /* EMPTY */ 
                        | methAttr K_STATIC 
                        | methAttr K_PUBLIC 
                        | methAttr K_PRIVATE 
                        | methAttr K_FAMILY 
                        | methAttr K_FINAL 
                        | methAttr K_SPECIALNAME 
                        | methAttr K_VIRTUAL 
                        | methAttr K_STRICT 
                        | methAttr K_ABSTRACT 
                        | methAttr K_ASSEMBLY 
                        | methAttr K_FAMANDASSEM 
                        | methAttr K_FAMORASSEM 
                        | methAttr K_PRIVATESCOPE 
                        | methAttr K_HIDEBYSIG 
                        | methAttr K_NEWSLOT 
                        | methAttr K_RTSPECIALNAME /**/
                        | methAttr K_UNMANAGEDEXP 
                        | methAttr K_REQSECOBJ 
                        | methAttr K_FLAGS '(' int32 ')' 
                        | methAttr K_PINVOKEIMPL '(' compQstring K_AS compQstring pinvAttr ')' 
                        | methAttr K_PINVOKEIMPL '(' compQstring  pinvAttr ')' 
                        | methAttr K_PINVOKEIMPL '(' pinvAttr ')' 
                        ;

pinvAttr                : /* EMPTY */ 
                        | pinvAttr K_NOMANGLE 
                        | pinvAttr K_ANSI 
                        | pinvAttr K_UNICODE 
                        | pinvAttr K_AUTOCHAR 
                        | pinvAttr K_LASTERR 
                        | pinvAttr K_WINAPI 
                        | pinvAttr K_CDECL 
                        | pinvAttr K_STDCALL 
                        | pinvAttr K_THISCALL 
                        | pinvAttr K_FASTCALL 
                        | pinvAttr K_BESTFIT ':' K_ON 
                        | pinvAttr K_BESTFIT ':' K_OFF 
                        | pinvAttr K_CHARMAPERROR ':' K_ON 
                        | pinvAttr K_CHARMAPERROR ':' K_OFF 
                        | pinvAttr K_FLAGS '(' int32 ')' 
                        ;

methodName              : D_CTOR 
                        | D_CCTOR 
                        | dottedName 
                        ;

paramAttr               : /* EMPTY */ 
                        | paramAttr '[' K_IN ']' 
                        | paramAttr '[' K_OUT ']' 
                        | paramAttr '[' K_OPT ']' 
                        | paramAttr '[' int32 ']' 
                        ;

implAttr                : /* EMPTY */ 
                        | implAttr K_NATIVE 
                        | implAttr K_CIL 
                        | implAttr K_OPTIL 
                        | implAttr K_MANAGED 
                        | implAttr K_UNMANAGED 
                        | implAttr K_FORWARDREF 
                        | implAttr K_PRESERVESIG 
                        | implAttr K_RUNTIME 
                        | implAttr K_INTERNALCALL 
                        | implAttr K_SYNCHRONIZED 
                        | implAttr K_NOINLINING 
                        | implAttr K_AGGRESSIVEINLINING 
                        | implAttr K_NOOPTIMIZATION 
                        | implAttr K_AGGRESSIVEOPTIMIZATION 
                        | implAttr K_FLAGS '(' int32 ')' 
                        ;

localsHead              : D_LOCALS 
                        ;

methodDecls             : /* EMPTY */
                        | methodDecls methodDecl
                        ;

methodDecl              : D_EMITBYTE int32 
                        | sehBlock 
                        | D_MAXSTACK int32 
                        | localsHead '(' sigArgs0 ')' 
                        | localsHead K_INIT '(' sigArgs0 ')' 
                        | D_ENTRYPOINT 
                        | D_ZEROINIT 
                        | dataDecl
                        | instr
                        | id ':' 
                        | secDecl
                        | extSourceSpec
                        | languageDecl
                        | customAttrDecl
                        | compControl
                        | D_EXPORT '[' int32 ']' 
                        | D_EXPORT '[' int32 ']' K_AS id 
                        | D_VTENTRY int32 ':' int32 
                        | D_OVERRIDE typeSpec DCOLON methodName 

                        | D_OVERRIDE K_METHOD callConv type typeSpec DCOLON methodName genArity '(' sigArgs0 ')' 
                        | scopeBlock
                        | D_PARAM K_TYPE '[' int32 ']' 
                        | D_PARAM K_TYPE dottedName 
                        | D_PARAM K_CONSTRAINT '[' int32 ']' ',' typeSpec 
                        | D_PARAM K_CONSTRAINT dottedName ',' typeSpec 

                        | D_PARAM '[' int32 ']' initOpt 
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

tryBlock                : tryHead scopeBlock 
                        | tryHead id K_TO id 
                        | tryHead int32 K_TO int32 
                        ;

tryHead                 : D_TRY 
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

instr_var               : INSTR_VAR 
                        ;

instr_i                 : INSTR_I 
                        ;

instr_i8                : INSTR_I8 
                        ;

instr_r                 : INSTR_R 
                        ;

instr_brtarget          : INSTR_BRTARGET 
                        ;

instr_method            : INSTR_METHOD 
                        ;

instr_field             : INSTR_FIELD 
                        ;

instr_type              : INSTR_TYPE 
                        ;

instr_string            : INSTR_STRING 
                        ;

instr_sig               : INSTR_SIG 
                        ;

instr_tok               : INSTR_TOK 
                        ;

instr_switch            : INSTR_SWITCH 
                        ;

instr_r_head            : instr_r '(' 
                        ;


instr                   : instr_none 
                        | instr_var int32 
                        | instr_var id 
                        | instr_i int32 
                        | instr_i8 int64 
                        | instr_r float64 
                        | instr_r int64 
                        | instr_r_head bytes ')' 
                        | instr_brtarget int32 
                        | instr_brtarget id 
                        | instr_method methodRef 
                        | instr_field type typeSpec DCOLON dottedName 
                        | instr_field type dottedName 
                        | instr_field mdtoken 
                        | instr_field TYPEDEF_F 
                        | instr_field TYPEDEF_MR 
                        | instr_type typeSpec 
                        | instr_string compQstring 
                        | instr_string K_ANSI '(' compQstring ')' 
                        | instr_string bytearrayhead bytes ')' 
                        | instr_sig callConv type '(' sigArgs0 ')' 
                        | instr_tok ownerType /* ownerType ::= memberRef | typeSpec */ 
                        | instr_switch '(' labels ')' 
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


sigArgs0                : /* EMPTY */ 
                        | sigArgs1 
                        ;

sigArgs1                : sigArg 
                        | sigArgs1 ',' sigArg 
                        ;

sigArg                  : ELIPSIS 
                        | paramAttr type marshalClause 
                        | paramAttr type marshalClause id 
                        ;

/*  Class referencing  */
className               : '[' dottedName ']' slashedName 
                        | '[' mdtoken ']' slashedName 
                        | '[' '*' ']' slashedName 
                        | '[' D_MODULE dottedName ']' slashedName 
                        | slashedName 
                        | mdtoken 
                        | TYPEDEF_T 
                        | D_THIS 
                        | D_BASE 
                        | D_NESTER 
                        ;

slashedName             : dottedName 
                        | slashedName '/' dottedName 
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
                        | TYPEDEF_TS 
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
                        | TYPEDEF_TS 
                        ;

bounds1                 : bound 
                        | bounds1 ',' bound 
                        ;

bound                   : /* EMPTY */ 
                        | ELIPSIS 
                        | int32 
                        | int32 ELIPSIS int32 
                        | int32 ELIPSIS 
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

assemblyHead            : D_ASSEMBLY asmAttr dottedName 
                        ;

asmAttr                 : /* EMPTY */ 
                        | asmAttr K_RETARGETABLE 
                        | asmAttr K_WINDOWSRUNTIME 
                        | asmAttr K_NOPLATFORM 
                        | asmAttr K_LEGACY K_LIBRARY 
                        | asmAttr K_CIL 
                        | asmAttr K_X86 
                        | asmAttr K_AMD64 
                        | asmAttr K_ARM 
                        | asmAttr K_ARM64 
                        ;

assemblyDecls           : /* EMPTY */
                        | assemblyDecls assemblyDecl
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

assemblyRefHead         : D_ASSEMBLY K_EXTERN asmAttr dottedName 
                        | D_ASSEMBLY K_EXTERN asmAttr dottedName K_AS dottedName 
                        ;

assemblyRefDecls        : /* EMPTY */
                        | assemblyRefDecls assemblyRefDecl
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

exptAttr                : /* EMPTY */ 
                        | exptAttr K_PRIVATE 
                        | exptAttr K_PUBLIC 
                        | exptAttr K_FORWARDER 
                        | exptAttr K_NESTED K_PUBLIC 
                        | exptAttr K_NESTED K_PRIVATE 
                        | exptAttr K_NESTED K_FAMILY 
                        | exptAttr K_NESTED K_ASSEMBLY 
                        | exptAttr K_NESTED K_FAMANDASSEM 
                        | exptAttr K_NESTED K_FAMORASSEM 
                        ;

exptypeDecls            : /* EMPTY */
                        | exptypeDecls exptypeDecl
                        ;

exptypeDecl             : D_FILE dottedName 
                        | D_CLASS K_EXTERN slashedName 
                        | D_ASSEMBLY K_EXTERN dottedName 
                        | K_MDTOKEN '(' int32 ')' 
                        | D_CLASS  int32 
                        | customAttrDecl
                        | compControl
                        ;

manifestResHead         : D_MRESOURCE manresAttr dottedName 
                        | D_MRESOURCE manresAttr dottedName K_AS dottedName 
                        ;

manresAttr              : /* EMPTY */ 
                        | manresAttr K_PUBLIC 
                        | manresAttr K_PRIVATE 
                        ;

manifestResDecls        : /* EMPTY */
                        | manifestResDecls manifestResDecl
                        ;

manifestResDecl         : D_FILE dottedName K_AT int32 
                        | D_ASSEMBLY K_EXTERN dottedName 
                        | customAttrDecl
                        | compControl
                        ;


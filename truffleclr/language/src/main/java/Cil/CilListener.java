// Generated from /home/alex4o/Projects/truffleclr/truffleclr/Cil.g4 by ANTLR 4.8
package Cil;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CilParser}.
 */
public interface CilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CilParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(CilParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(CilParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterClass(CilParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitClass(CilParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namespace}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(CilParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namespace}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(CilParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod(CilParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod(CilParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code field}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterField(CilParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code field}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitField(CilParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code data}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterData(CilParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code data}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitData(CilParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vtable}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVtable(CilParser.VtableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vtable}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVtable(CilParser.VtableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vtfixup}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVtfixup(CilParser.VtfixupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vtfixup}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVtfixup(CilParser.VtfixupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extsource}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterExtsource(CilParser.ExtsourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extsource}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitExtsource(CilParser.ExtsourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code file}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterFile(CilParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code file}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitFile(CilParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assembly}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterAssembly(CilParser.AssemblyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assembly}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitAssembly(CilParser.AssemblyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assemblyReferance}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyReferance(CilParser.AssemblyReferanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assemblyReferance}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyReferance(CilParser.AssemblyReferanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exptype}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterExptype(CilParser.ExptypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exptype}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitExptype(CilParser.ExptypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manifest}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterManifest(CilParser.ManifestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manifest}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitManifest(CilParser.ManifestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code module}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterModule(CilParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code module}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitModule(CilParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code security}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterSecurity(CilParser.SecurityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code security}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitSecurity(CilParser.SecurityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code custom}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterCustom(CilParser.CustomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code custom}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitCustom(CilParser.CustomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code system}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterSystem(CilParser.SystemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code system}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitSystem(CilParser.SystemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code corflags}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterCorflags(CilParser.CorflagsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code corflags}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitCorflags(CilParser.CorflagsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filealignement}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterFilealignement(CilParser.FilealignementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filealignement}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitFilealignement(CilParser.FilealignementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imagebase}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterImagebase(CilParser.ImagebaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imagebase}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitImagebase(CilParser.ImagebaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stackreserve}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterStackreserve(CilParser.StackreserveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stackreserve}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitStackreserve(CilParser.StackreserveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code language}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(CilParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code language}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(CilParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedef}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(CilParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedef}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(CilParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compilationControl}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterCompilationControl(CilParser.CompilationControlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compilationControl}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitCompilationControl(CilParser.CompilationControlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeLst}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterTypeLst(CilParser.TypeLstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeLst}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitTypeLst(CilParser.TypeLstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mscorelib}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterMscorelib(CilParser.MscorelibContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mscorelib}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitMscorelib(CilParser.MscorelibContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#classNameSeq}.
	 * @param ctx the parse tree
	 */
	void enterClassNameSeq(CilParser.ClassNameSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#classNameSeq}.
	 * @param ctx the parse tree
	 */
	void exitClassNameSeq(CilParser.ClassNameSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#compQstring}.
	 * @param ctx the parse tree
	 */
	void enterCompQstring(CilParser.CompQstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#compQstring}.
	 * @param ctx the parse tree
	 */
	void exitCompQstring(CilParser.CompQstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#languageDecl}.
	 * @param ctx the parse tree
	 */
	void enterLanguageDecl(CilParser.LanguageDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#languageDecl}.
	 * @param ctx the parse tree
	 */
	void exitLanguageDecl(CilParser.LanguageDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(CilParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(CilParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedName(CilParser.DottedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedName(CilParser.DottedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#int32}.
	 * @param ctx the parse tree
	 */
	void enterInt32(CilParser.Int32Context ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#int32}.
	 * @param ctx the parse tree
	 */
	void exitInt32(CilParser.Int32Context ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#int64}.
	 * @param ctx the parse tree
	 */
	void enterInt64(CilParser.Int64Context ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#int64}.
	 * @param ctx the parse tree
	 */
	void exitInt64(CilParser.Int64Context ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#float64}.
	 * @param ctx the parse tree
	 */
	void enterFloat64(CilParser.Float64Context ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#float64}.
	 * @param ctx the parse tree
	 */
	void exitFloat64(CilParser.Float64Context ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#typedefDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypedefDecl(CilParser.TypedefDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#typedefDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypedefDecl(CilParser.TypedefDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#compControl}.
	 * @param ctx the parse tree
	 */
	void enterCompControl(CilParser.CompControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#compControl}.
	 * @param ctx the parse tree
	 */
	void exitCompControl(CilParser.CompControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#customDescr}.
	 * @param ctx the parse tree
	 */
	void enterCustomDescr(CilParser.CustomDescrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#customDescr}.
	 * @param ctx the parse tree
	 */
	void exitCustomDescr(CilParser.CustomDescrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#ownerType}.
	 * @param ctx the parse tree
	 */
	void enterOwnerType(CilParser.OwnerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#ownerType}.
	 * @param ctx the parse tree
	 */
	void exitOwnerType(CilParser.OwnerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#customBlobDescr}.
	 * @param ctx the parse tree
	 */
	void enterCustomBlobDescr(CilParser.CustomBlobDescrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#customBlobDescr}.
	 * @param ctx the parse tree
	 */
	void exitCustomBlobDescr(CilParser.CustomBlobDescrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#customBlobArgs}.
	 * @param ctx the parse tree
	 */
	void enterCustomBlobArgs(CilParser.CustomBlobArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#customBlobArgs}.
	 * @param ctx the parse tree
	 */
	void exitCustomBlobArgs(CilParser.CustomBlobArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#customBlobNVPairs}.
	 * @param ctx the parse tree
	 */
	void enterCustomBlobNVPairs(CilParser.CustomBlobNVPairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#customBlobNVPairs}.
	 * @param ctx the parse tree
	 */
	void exitCustomBlobNVPairs(CilParser.CustomBlobNVPairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#fieldOrProp}.
	 * @param ctx the parse tree
	 */
	void enterFieldOrProp(CilParser.FieldOrPropContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#fieldOrProp}.
	 * @param ctx the parse tree
	 */
	void exitFieldOrProp(CilParser.FieldOrPropContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#customAttrDecl}.
	 * @param ctx the parse tree
	 */
	void enterCustomAttrDecl(CilParser.CustomAttrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#customAttrDecl}.
	 * @param ctx the parse tree
	 */
	void exitCustomAttrDecl(CilParser.CustomAttrDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#serializType}.
	 * @param ctx the parse tree
	 */
	void enterSerializType(CilParser.SerializTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#serializType}.
	 * @param ctx the parse tree
	 */
	void exitSerializType(CilParser.SerializTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#moduleHead}.
	 * @param ctx the parse tree
	 */
	void enterModuleHead(CilParser.ModuleHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#moduleHead}.
	 * @param ctx the parse tree
	 */
	void exitModuleHead(CilParser.ModuleHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#vtfixupDecl}.
	 * @param ctx the parse tree
	 */
	void enterVtfixupDecl(CilParser.VtfixupDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#vtfixupDecl}.
	 * @param ctx the parse tree
	 */
	void exitVtfixupDecl(CilParser.VtfixupDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#vtfixupAttr}.
	 * @param ctx the parse tree
	 */
	void enterVtfixupAttr(CilParser.VtfixupAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#vtfixupAttr}.
	 * @param ctx the parse tree
	 */
	void exitVtfixupAttr(CilParser.VtfixupAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#vtableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVtableDecl(CilParser.VtableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#vtableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVtableDecl(CilParser.VtableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#vtableHead}.
	 * @param ctx the parse tree
	 */
	void enterVtableHead(CilParser.VtableHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#vtableHead}.
	 * @param ctx the parse tree
	 */
	void exitVtableHead(CilParser.VtableHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#nameSpaceHead}.
	 * @param ctx the parse tree
	 */
	void enterNameSpaceHead(CilParser.NameSpaceHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#nameSpaceHead}.
	 * @param ctx the parse tree
	 */
	void exitNameSpaceHead(CilParser.NameSpaceHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#klass}.
	 * @param ctx the parse tree
	 */
	void enterKlass(CilParser.KlassContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#klass}.
	 * @param ctx the parse tree
	 */
	void exitKlass(CilParser.KlassContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#classHeadBegin}.
	 * @param ctx the parse tree
	 */
	void enterClassHeadBegin(CilParser.ClassHeadBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#classHeadBegin}.
	 * @param ctx the parse tree
	 */
	void exitClassHeadBegin(CilParser.ClassHeadBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#classHead}.
	 * @param ctx the parse tree
	 */
	void enterClassHead(CilParser.ClassHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#classHead}.
	 * @param ctx the parse tree
	 */
	void exitClassHead(CilParser.ClassHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#classAttr}.
	 * @param ctx the parse tree
	 */
	void enterClassAttr(CilParser.ClassAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#classAttr}.
	 * @param ctx the parse tree
	 */
	void exitClassAttr(CilParser.ClassAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#extendsClause}.
	 * @param ctx the parse tree
	 */
	void enterExtendsClause(CilParser.ExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#extendsClause}.
	 * @param ctx the parse tree
	 */
	void exitExtendsClause(CilParser.ExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#implClause}.
	 * @param ctx the parse tree
	 */
	void enterImplClause(CilParser.ImplClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#implClause}.
	 * @param ctx the parse tree
	 */
	void exitImplClause(CilParser.ImplClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#classDecls}.
	 * @param ctx the parse tree
	 */
	void enterClassDecls(CilParser.ClassDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#classDecls}.
	 * @param ctx the parse tree
	 */
	void exitClassDecls(CilParser.ClassDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#implList}.
	 * @param ctx the parse tree
	 */
	void enterImplList(CilParser.ImplListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#implList}.
	 * @param ctx the parse tree
	 */
	void exitImplList(CilParser.ImplListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(CilParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(CilParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#typeListNotEmpty}.
	 * @param ctx the parse tree
	 */
	void enterTypeListNotEmpty(CilParser.TypeListNotEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#typeListNotEmpty}.
	 * @param ctx the parse tree
	 */
	void exitTypeListNotEmpty(CilParser.TypeListNotEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#typarsClause}.
	 * @param ctx the parse tree
	 */
	void enterTyparsClause(CilParser.TyparsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#typarsClause}.
	 * @param ctx the parse tree
	 */
	void exitTyparsClause(CilParser.TyparsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#typarAttrib}.
	 * @param ctx the parse tree
	 */
	void enterTyparAttrib(CilParser.TyparAttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#typarAttrib}.
	 * @param ctx the parse tree
	 */
	void exitTyparAttrib(CilParser.TyparAttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#typarAttribs}.
	 * @param ctx the parse tree
	 */
	void enterTyparAttribs(CilParser.TyparAttribsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#typarAttribs}.
	 * @param ctx the parse tree
	 */
	void exitTyparAttribs(CilParser.TyparAttribsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#typars}.
	 * @param ctx the parse tree
	 */
	void enterTypars(CilParser.TyparsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#typars}.
	 * @param ctx the parse tree
	 */
	void exitTypars(CilParser.TyparsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#typarsRest}.
	 * @param ctx the parse tree
	 */
	void enterTyparsRest(CilParser.TyparsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#typarsRest}.
	 * @param ctx the parse tree
	 */
	void exitTyparsRest(CilParser.TyparsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#tyBound}.
	 * @param ctx the parse tree
	 */
	void enterTyBound(CilParser.TyBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#tyBound}.
	 * @param ctx the parse tree
	 */
	void exitTyBound(CilParser.TyBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#genArity}.
	 * @param ctx the parse tree
	 */
	void enterGenArity(CilParser.GenArityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#genArity}.
	 * @param ctx the parse tree
	 */
	void exitGenArity(CilParser.GenArityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#genArityNotEmpty}.
	 * @param ctx the parse tree
	 */
	void enterGenArityNotEmpty(CilParser.GenArityNotEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#genArityNotEmpty}.
	 * @param ctx the parse tree
	 */
	void exitGenArityNotEmpty(CilParser.GenArityNotEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_method}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_method(CilParser.Class_methodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_method}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_method(CilParser.Class_methodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_class}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_class(CilParser.Class_classContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_class}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_class(CilParser.Class_classContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_event}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_event(CilParser.Class_eventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_event}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_event(CilParser.Class_eventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_property}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_property(CilParser.Class_propertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_property}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_property(CilParser.Class_propertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_field}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_field(CilParser.Class_fieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_field}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_field(CilParser.Class_fieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_data}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_data(CilParser.Class_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_data}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_data(CilParser.Class_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_security}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_security(CilParser.Class_securityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_security}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_security(CilParser.Class_securityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_externalSource}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_externalSource(CilParser.Class_externalSourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_externalSource}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_externalSource(CilParser.Class_externalSourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_customAttribute}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_customAttribute(CilParser.Class_customAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_customAttribute}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_customAttribute(CilParser.Class_customAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_size}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_size(CilParser.Class_sizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_size}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_size(CilParser.Class_sizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_pack}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_pack(CilParser.Class_packContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_pack}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_pack(CilParser.Class_packContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_export}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_export(CilParser.Class_exportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_export}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_export(CilParser.Class_exportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_methodOverride}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_methodOverride(CilParser.Class_methodOverrideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_methodOverride}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_methodOverride(CilParser.Class_methodOverrideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_language}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_language(CilParser.Class_languageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_language}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_language(CilParser.Class_languageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_compilationControl}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_compilationControl(CilParser.Class_compilationControlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_compilationControl}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_compilationControl(CilParser.Class_compilationControlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_param}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_param(CilParser.Class_paramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_param}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_param(CilParser.Class_paramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_interfaceImpl}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClass_interfaceImpl(CilParser.Class_interfaceImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_interfaceImpl}
	 * labeled alternative in {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClass_interfaceImpl(CilParser.Class_interfaceImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(CilParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(CilParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#fieldAttr}.
	 * @param ctx the parse tree
	 */
	void enterFieldAttr(CilParser.FieldAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#fieldAttr}.
	 * @param ctx the parse tree
	 */
	void exitFieldAttr(CilParser.FieldAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#atOpt}.
	 * @param ctx the parse tree
	 */
	void enterAtOpt(CilParser.AtOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#atOpt}.
	 * @param ctx the parse tree
	 */
	void exitAtOpt(CilParser.AtOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#initOpt}.
	 * @param ctx the parse tree
	 */
	void enterInitOpt(CilParser.InitOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#initOpt}.
	 * @param ctx the parse tree
	 */
	void exitInitOpt(CilParser.InitOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#repeatOpt}.
	 * @param ctx the parse tree
	 */
	void enterRepeatOpt(CilParser.RepeatOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#repeatOpt}.
	 * @param ctx the parse tree
	 */
	void exitRepeatOpt(CilParser.RepeatOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#methodRef}.
	 * @param ctx the parse tree
	 */
	void enterMethodRef(CilParser.MethodRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#methodRef}.
	 * @param ctx the parse tree
	 */
	void exitMethodRef(CilParser.MethodRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#callConv}.
	 * @param ctx the parse tree
	 */
	void enterCallConv(CilParser.CallConvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#callConv}.
	 * @param ctx the parse tree
	 */
	void exitCallConv(CilParser.CallConvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#callKind}.
	 * @param ctx the parse tree
	 */
	void enterCallKind(CilParser.CallKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#callKind}.
	 * @param ctx the parse tree
	 */
	void exitCallKind(CilParser.CallKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#mdtoken}.
	 * @param ctx the parse tree
	 */
	void enterMdtoken(CilParser.MdtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#mdtoken}.
	 * @param ctx the parse tree
	 */
	void exitMdtoken(CilParser.MdtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#memberRef}.
	 * @param ctx the parse tree
	 */
	void enterMemberRef(CilParser.MemberRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#memberRef}.
	 * @param ctx the parse tree
	 */
	void exitMemberRef(CilParser.MemberRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#eventHead}.
	 * @param ctx the parse tree
	 */
	void enterEventHead(CilParser.EventHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#eventHead}.
	 * @param ctx the parse tree
	 */
	void exitEventHead(CilParser.EventHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#eventAttr}.
	 * @param ctx the parse tree
	 */
	void enterEventAttr(CilParser.EventAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#eventAttr}.
	 * @param ctx the parse tree
	 */
	void exitEventAttr(CilParser.EventAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#eventDecls}.
	 * @param ctx the parse tree
	 */
	void enterEventDecls(CilParser.EventDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#eventDecls}.
	 * @param ctx the parse tree
	 */
	void exitEventDecls(CilParser.EventDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#eventDecl}.
	 * @param ctx the parse tree
	 */
	void enterEventDecl(CilParser.EventDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#eventDecl}.
	 * @param ctx the parse tree
	 */
	void exitEventDecl(CilParser.EventDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#propHead}.
	 * @param ctx the parse tree
	 */
	void enterPropHead(CilParser.PropHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#propHead}.
	 * @param ctx the parse tree
	 */
	void exitPropHead(CilParser.PropHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#propAttr}.
	 * @param ctx the parse tree
	 */
	void enterPropAttr(CilParser.PropAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#propAttr}.
	 * @param ctx the parse tree
	 */
	void exitPropAttr(CilParser.PropAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#propDecls}.
	 * @param ctx the parse tree
	 */
	void enterPropDecls(CilParser.PropDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#propDecls}.
	 * @param ctx the parse tree
	 */
	void exitPropDecls(CilParser.PropDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#propDecl}.
	 * @param ctx the parse tree
	 */
	void enterPropDecl(CilParser.PropDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#propDecl}.
	 * @param ctx the parse tree
	 */
	void exitPropDecl(CilParser.PropDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#marshalClause}.
	 * @param ctx the parse tree
	 */
	void enterMarshalClause(CilParser.MarshalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#marshalClause}.
	 * @param ctx the parse tree
	 */
	void exitMarshalClause(CilParser.MarshalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#marshalBlob}.
	 * @param ctx the parse tree
	 */
	void enterMarshalBlob(CilParser.MarshalBlobContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#marshalBlob}.
	 * @param ctx the parse tree
	 */
	void exitMarshalBlob(CilParser.MarshalBlobContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#marshalBlobHead}.
	 * @param ctx the parse tree
	 */
	void enterMarshalBlobHead(CilParser.MarshalBlobHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#marshalBlobHead}.
	 * @param ctx the parse tree
	 */
	void exitMarshalBlobHead(CilParser.MarshalBlobHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#methodHead}.
	 * @param ctx the parse tree
	 */
	void enterMethodHead(CilParser.MethodHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#methodHead}.
	 * @param ctx the parse tree
	 */
	void exitMethodHead(CilParser.MethodHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#methAttr}.
	 * @param ctx the parse tree
	 */
	void enterMethAttr(CilParser.MethAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#methAttr}.
	 * @param ctx the parse tree
	 */
	void exitMethAttr(CilParser.MethAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#pinvAttr}.
	 * @param ctx the parse tree
	 */
	void enterPinvAttr(CilParser.PinvAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#pinvAttr}.
	 * @param ctx the parse tree
	 */
	void exitPinvAttr(CilParser.PinvAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(CilParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(CilParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#paramAttr}.
	 * @param ctx the parse tree
	 */
	void enterParamAttr(CilParser.ParamAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#paramAttr}.
	 * @param ctx the parse tree
	 */
	void exitParamAttr(CilParser.ParamAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#implAttr}.
	 * @param ctx the parse tree
	 */
	void enterImplAttr(CilParser.ImplAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#implAttr}.
	 * @param ctx the parse tree
	 */
	void exitImplAttr(CilParser.ImplAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#localsHead}.
	 * @param ctx the parse tree
	 */
	void enterLocalsHead(CilParser.LocalsHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#localsHead}.
	 * @param ctx the parse tree
	 */
	void exitLocalsHead(CilParser.LocalsHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#methodDecls}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecls(CilParser.MethodDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#methodDecls}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecls(CilParser.MethodDeclsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_emitbyte}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_emitbyte(CilParser.Method_emitbyteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_emitbyte}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_emitbyte(CilParser.Method_emitbyteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_sehblock}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_sehblock(CilParser.Method_sehblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_sehblock}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_sehblock(CilParser.Method_sehblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_maxstack}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_maxstack(CilParser.Method_maxstackContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_maxstack}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_maxstack(CilParser.Method_maxstackContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_locals}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_locals(CilParser.Method_localsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_locals}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_locals(CilParser.Method_localsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_entrypoint}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_entrypoint(CilParser.Method_entrypointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_entrypoint}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_entrypoint(CilParser.Method_entrypointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_zeroinit}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_zeroinit(CilParser.Method_zeroinitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_zeroinit}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_zeroinit(CilParser.Method_zeroinitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_datadecl}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_datadecl(CilParser.Method_datadeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_datadecl}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_datadecl(CilParser.Method_datadeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_instruction}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_instruction(CilParser.Method_instructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_instruction}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_instruction(CilParser.Method_instructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_security}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_security(CilParser.Method_securityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_security}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_security(CilParser.Method_securityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_externalSource}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_externalSource(CilParser.Method_externalSourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_externalSource}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_externalSource(CilParser.Method_externalSourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_language}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_language(CilParser.Method_languageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_language}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_language(CilParser.Method_languageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_customAtribute}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_customAtribute(CilParser.Method_customAtributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_customAtribute}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_customAtribute(CilParser.Method_customAtributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_compilerControl}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_compilerControl(CilParser.Method_compilerControlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_compilerControl}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_compilerControl(CilParser.Method_compilerControlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_export}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_export(CilParser.Method_exportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_export}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_export(CilParser.Method_exportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_vtentry}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_vtentry(CilParser.Method_vtentryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_vtentry}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_vtentry(CilParser.Method_vtentryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_override}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_override(CilParser.Method_overrideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_override}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_override(CilParser.Method_overrideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_scopeBlock}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_scopeBlock(CilParser.Method_scopeBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_scopeBlock}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_scopeBlock(CilParser.Method_scopeBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_dparam}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_dparam(CilParser.Method_dparamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_dparam}
	 * labeled alternative in {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_dparam(CilParser.Method_dparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#scopeBlock}.
	 * @param ctx the parse tree
	 */
	void enterScopeBlock(CilParser.ScopeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#scopeBlock}.
	 * @param ctx the parse tree
	 */
	void exitScopeBlock(CilParser.ScopeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#scopeOpen}.
	 * @param ctx the parse tree
	 */
	void enterScopeOpen(CilParser.ScopeOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#scopeOpen}.
	 * @param ctx the parse tree
	 */
	void exitScopeOpen(CilParser.ScopeOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#sehBlock}.
	 * @param ctx the parse tree
	 */
	void enterSehBlock(CilParser.SehBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#sehBlock}.
	 * @param ctx the parse tree
	 */
	void exitSehBlock(CilParser.SehBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#sehClauses}.
	 * @param ctx the parse tree
	 */
	void enterSehClauses(CilParser.SehClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#sehClauses}.
	 * @param ctx the parse tree
	 */
	void exitSehClauses(CilParser.SehClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(CilParser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(CilParser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#sehClause}.
	 * @param ctx the parse tree
	 */
	void enterSehClause(CilParser.SehClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#sehClause}.
	 * @param ctx the parse tree
	 */
	void exitSehClause(CilParser.SehClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void enterFilterClause(CilParser.FilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void exitFilterClause(CilParser.FilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#filterHead}.
	 * @param ctx the parse tree
	 */
	void enterFilterHead(CilParser.FilterHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#filterHead}.
	 * @param ctx the parse tree
	 */
	void exitFilterHead(CilParser.FilterHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(CilParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(CilParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(CilParser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(CilParser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#faultClause}.
	 * @param ctx the parse tree
	 */
	void enterFaultClause(CilParser.FaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#faultClause}.
	 * @param ctx the parse tree
	 */
	void exitFaultClause(CilParser.FaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#handlerBlock}.
	 * @param ctx the parse tree
	 */
	void enterHandlerBlock(CilParser.HandlerBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#handlerBlock}.
	 * @param ctx the parse tree
	 */
	void exitHandlerBlock(CilParser.HandlerBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#dataDecl}.
	 * @param ctx the parse tree
	 */
	void enterDataDecl(CilParser.DataDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#dataDecl}.
	 * @param ctx the parse tree
	 */
	void exitDataDecl(CilParser.DataDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#ddHead}.
	 * @param ctx the parse tree
	 */
	void enterDdHead(CilParser.DdHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#ddHead}.
	 * @param ctx the parse tree
	 */
	void exitDdHead(CilParser.DdHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#tls}.
	 * @param ctx the parse tree
	 */
	void enterTls(CilParser.TlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#tls}.
	 * @param ctx the parse tree
	 */
	void exitTls(CilParser.TlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#ddBody}.
	 * @param ctx the parse tree
	 */
	void enterDdBody(CilParser.DdBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#ddBody}.
	 * @param ctx the parse tree
	 */
	void exitDdBody(CilParser.DdBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#ddItemList}.
	 * @param ctx the parse tree
	 */
	void enterDdItemList(CilParser.DdItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#ddItemList}.
	 * @param ctx the parse tree
	 */
	void exitDdItemList(CilParser.DdItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#ddItemCount}.
	 * @param ctx the parse tree
	 */
	void enterDdItemCount(CilParser.DdItemCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#ddItemCount}.
	 * @param ctx the parse tree
	 */
	void exitDdItemCount(CilParser.DdItemCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#ddItem}.
	 * @param ctx the parse tree
	 */
	void enterDdItem(CilParser.DdItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#ddItem}.
	 * @param ctx the parse tree
	 */
	void exitDdItem(CilParser.DdItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#fieldSerInit}.
	 * @param ctx the parse tree
	 */
	void enterFieldSerInit(CilParser.FieldSerInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#fieldSerInit}.
	 * @param ctx the parse tree
	 */
	void exitFieldSerInit(CilParser.FieldSerInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#bytearrayhead}.
	 * @param ctx the parse tree
	 */
	void enterBytearrayhead(CilParser.BytearrayheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#bytearrayhead}.
	 * @param ctx the parse tree
	 */
	void exitBytearrayhead(CilParser.BytearrayheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#bytes}.
	 * @param ctx the parse tree
	 */
	void enterBytes(CilParser.BytesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#bytes}.
	 * @param ctx the parse tree
	 */
	void exitBytes(CilParser.BytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#fieldInit}.
	 * @param ctx the parse tree
	 */
	void enterFieldInit(CilParser.FieldInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#fieldInit}.
	 * @param ctx the parse tree
	 */
	void exitFieldInit(CilParser.FieldInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#serInit}.
	 * @param ctx the parse tree
	 */
	void enterSerInit(CilParser.SerInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#serInit}.
	 * @param ctx the parse tree
	 */
	void exitSerInit(CilParser.SerInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#f32seq}.
	 * @param ctx the parse tree
	 */
	void enterF32seq(CilParser.F32seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#f32seq}.
	 * @param ctx the parse tree
	 */
	void exitF32seq(CilParser.F32seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#f64seq}.
	 * @param ctx the parse tree
	 */
	void enterF64seq(CilParser.F64seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#f64seq}.
	 * @param ctx the parse tree
	 */
	void exitF64seq(CilParser.F64seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#i64seq}.
	 * @param ctx the parse tree
	 */
	void enterI64seq(CilParser.I64seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#i64seq}.
	 * @param ctx the parse tree
	 */
	void exitI64seq(CilParser.I64seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#i32seq}.
	 * @param ctx the parse tree
	 */
	void enterI32seq(CilParser.I32seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#i32seq}.
	 * @param ctx the parse tree
	 */
	void exitI32seq(CilParser.I32seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#i16seq}.
	 * @param ctx the parse tree
	 */
	void enterI16seq(CilParser.I16seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#i16seq}.
	 * @param ctx the parse tree
	 */
	void exitI16seq(CilParser.I16seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#i8seq}.
	 * @param ctx the parse tree
	 */
	void enterI8seq(CilParser.I8seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#i8seq}.
	 * @param ctx the parse tree
	 */
	void exitI8seq(CilParser.I8seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#boolSeq}.
	 * @param ctx the parse tree
	 */
	void enterBoolSeq(CilParser.BoolSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#boolSeq}.
	 * @param ctx the parse tree
	 */
	void exitBoolSeq(CilParser.BoolSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#sqstringSeq}.
	 * @param ctx the parse tree
	 */
	void enterSqstringSeq(CilParser.SqstringSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#sqstringSeq}.
	 * @param ctx the parse tree
	 */
	void exitSqstringSeq(CilParser.SqstringSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#classSeq}.
	 * @param ctx the parse tree
	 */
	void enterClassSeq(CilParser.ClassSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#classSeq}.
	 * @param ctx the parse tree
	 */
	void exitClassSeq(CilParser.ClassSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#objSeq}.
	 * @param ctx the parse tree
	 */
	void enterObjSeq(CilParser.ObjSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#objSeq}.
	 * @param ctx the parse tree
	 */
	void exitObjSeq(CilParser.ObjSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void enterMethodSpec(CilParser.MethodSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void exitMethodSpec(CilParser.MethodSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_none}.
	 * @param ctx the parse tree
	 */
	void enterInstr_none(CilParser.Instr_noneContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_none}.
	 * @param ctx the parse tree
	 */
	void exitInstr_none(CilParser.Instr_noneContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_var}.
	 * @param ctx the parse tree
	 */
	void enterInstr_var(CilParser.Instr_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_var}.
	 * @param ctx the parse tree
	 */
	void exitInstr_var(CilParser.Instr_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_i}.
	 * @param ctx the parse tree
	 */
	void enterInstr_i(CilParser.Instr_iContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_i}.
	 * @param ctx the parse tree
	 */
	void exitInstr_i(CilParser.Instr_iContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_i8}.
	 * @param ctx the parse tree
	 */
	void enterInstr_i8(CilParser.Instr_i8Context ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_i8}.
	 * @param ctx the parse tree
	 */
	void exitInstr_i8(CilParser.Instr_i8Context ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_r}.
	 * @param ctx the parse tree
	 */
	void enterInstr_r(CilParser.Instr_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_r}.
	 * @param ctx the parse tree
	 */
	void exitInstr_r(CilParser.Instr_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_brtarget}.
	 * @param ctx the parse tree
	 */
	void enterInstr_brtarget(CilParser.Instr_brtargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_brtarget}.
	 * @param ctx the parse tree
	 */
	void exitInstr_brtarget(CilParser.Instr_brtargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_method}.
	 * @param ctx the parse tree
	 */
	void enterInstr_method(CilParser.Instr_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_method}.
	 * @param ctx the parse tree
	 */
	void exitInstr_method(CilParser.Instr_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_field}.
	 * @param ctx the parse tree
	 */
	void enterInstr_field(CilParser.Instr_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_field}.
	 * @param ctx the parse tree
	 */
	void exitInstr_field(CilParser.Instr_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_type}.
	 * @param ctx the parse tree
	 */
	void enterInstr_type(CilParser.Instr_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_type}.
	 * @param ctx the parse tree
	 */
	void exitInstr_type(CilParser.Instr_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_string}.
	 * @param ctx the parse tree
	 */
	void enterInstr_string(CilParser.Instr_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_string}.
	 * @param ctx the parse tree
	 */
	void exitInstr_string(CilParser.Instr_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_sig}.
	 * @param ctx the parse tree
	 */
	void enterInstr_sig(CilParser.Instr_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_sig}.
	 * @param ctx the parse tree
	 */
	void exitInstr_sig(CilParser.Instr_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_tok}.
	 * @param ctx the parse tree
	 */
	void enterInstr_tok(CilParser.Instr_tokContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_tok}.
	 * @param ctx the parse tree
	 */
	void exitInstr_tok(CilParser.Instr_tokContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr_switch}.
	 * @param ctx the parse tree
	 */
	void enterInstr_switch(CilParser.Instr_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr_switch}.
	 * @param ctx the parse tree
	 */
	void exitInstr_switch(CilParser.Instr_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(CilParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(CilParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#labels}.
	 * @param ctx the parse tree
	 */
	void enterLabels(CilParser.LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#labels}.
	 * @param ctx the parse tree
	 */
	void exitLabels(CilParser.LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#tyArgs0}.
	 * @param ctx the parse tree
	 */
	void enterTyArgs0(CilParser.TyArgs0Context ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#tyArgs0}.
	 * @param ctx the parse tree
	 */
	void exitTyArgs0(CilParser.TyArgs0Context ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#tyArgs1}.
	 * @param ctx the parse tree
	 */
	void enterTyArgs1(CilParser.TyArgs1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#tyArgs1}.
	 * @param ctx the parse tree
	 */
	void exitTyArgs1(CilParser.TyArgs1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#tyArgs2}.
	 * @param ctx the parse tree
	 */
	void enterTyArgs2(CilParser.TyArgs2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#tyArgs2}.
	 * @param ctx the parse tree
	 */
	void exitTyArgs2(CilParser.TyArgs2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#sigArgs0}.
	 * @param ctx the parse tree
	 */
	void enterSigArgs0(CilParser.SigArgs0Context ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#sigArgs0}.
	 * @param ctx the parse tree
	 */
	void exitSigArgs0(CilParser.SigArgs0Context ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#sigArgs1}.
	 * @param ctx the parse tree
	 */
	void enterSigArgs1(CilParser.SigArgs1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#sigArgs1}.
	 * @param ctx the parse tree
	 */
	void exitSigArgs1(CilParser.SigArgs1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#sigArg}.
	 * @param ctx the parse tree
	 */
	void enterSigArg(CilParser.SigArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#sigArg}.
	 * @param ctx the parse tree
	 */
	void exitSigArg(CilParser.SigArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(CilParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(CilParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#slashedName}.
	 * @param ctx the parse tree
	 */
	void enterSlashedName(CilParser.SlashedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#slashedName}.
	 * @param ctx the parse tree
	 */
	void exitSlashedName(CilParser.SlashedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(CilParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(CilParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#nativeType}.
	 * @param ctx the parse tree
	 */
	void enterNativeType(CilParser.NativeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#nativeType}.
	 * @param ctx the parse tree
	 */
	void exitNativeType(CilParser.NativeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#iidParamIndex}.
	 * @param ctx the parse tree
	 */
	void enterIidParamIndex(CilParser.IidParamIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#iidParamIndex}.
	 * @param ctx the parse tree
	 */
	void exitIidParamIndex(CilParser.IidParamIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#variantType}.
	 * @param ctx the parse tree
	 */
	void enterVariantType(CilParser.VariantTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#variantType}.
	 * @param ctx the parse tree
	 */
	void exitVariantType(CilParser.VariantTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeObject}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeObject(CilParser.TypeObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeObject}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeObject(CilParser.TypeObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeManageRef}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeManageRef(CilParser.TypeManageRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeManageRef}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeManageRef(CilParser.TypeManageRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDeRef}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeRef(CilParser.TypeDeRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDeRef}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeRef(CilParser.TypeDeRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeGeneric}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeGeneric(CilParser.TypeGenericContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeGeneric}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeGeneric(CilParser.TypeGenericContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeNative}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeNative(CilParser.TypeNativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeNative}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeNative(CilParser.TypeNativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeMod}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeMod(CilParser.TypeModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeMod}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeMod(CilParser.TypeModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typePinnded}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypePinnded(CilParser.TypePinndedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typePinnded}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypePinnded(CilParser.TypePinndedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elipsis}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterElipsis(CilParser.ElipsisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elipsis}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitElipsis(CilParser.ElipsisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(CilParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeArray}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(CilParser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeU4}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeU4(CilParser.TypeU4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code typeU4}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeU4(CilParser.TypeU4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code typeU3}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeU3(CilParser.TypeU3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code typeU3}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeU3(CilParser.TypeU3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code typeClass}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeClass(CilParser.TypeClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeClass}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeClass(CilParser.TypeClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeMethod}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeMethod(CilParser.TypeMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeMethod}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeMethod(CilParser.TypeMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeU2}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeU2(CilParser.TypeU2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code typeU2}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeU2(CilParser.TypeU2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code typeU1}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeU1(CilParser.TypeU1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code typeU1}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeU1(CilParser.TypeU1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code typeValueType}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeValueType(CilParser.TypeValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeValueType}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeValueType(CilParser.TypeValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notTun}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterNotTun(CilParser.NotTunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notTun}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitNotTun(CilParser.NotTunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeUnmanagedRef}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeUnmanagedRef(CilParser.TypeUnmanagedRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeUnmanagedRef}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeUnmanagedRef(CilParser.TypeUnmanagedRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typePrimitive}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypePrimitive(CilParser.TypePrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typePrimitive}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypePrimitive(CilParser.TypePrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeVoid}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeVoid(CilParser.TypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeVoid}
	 * labeled alternative in {@link CilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeVoid(CilParser.TypeVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(CilParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(CilParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#bounds1}.
	 * @param ctx the parse tree
	 */
	void enterBounds1(CilParser.Bounds1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#bounds1}.
	 * @param ctx the parse tree
	 */
	void exitBounds1(CilParser.Bounds1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#bound}.
	 * @param ctx the parse tree
	 */
	void enterBound(CilParser.BoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#bound}.
	 * @param ctx the parse tree
	 */
	void exitBound(CilParser.BoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#secDecl}.
	 * @param ctx the parse tree
	 */
	void enterSecDecl(CilParser.SecDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#secDecl}.
	 * @param ctx the parse tree
	 */
	void exitSecDecl(CilParser.SecDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#secAttrSetBlob}.
	 * @param ctx the parse tree
	 */
	void enterSecAttrSetBlob(CilParser.SecAttrSetBlobContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#secAttrSetBlob}.
	 * @param ctx the parse tree
	 */
	void exitSecAttrSetBlob(CilParser.SecAttrSetBlobContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#secAttrBlob}.
	 * @param ctx the parse tree
	 */
	void enterSecAttrBlob(CilParser.SecAttrBlobContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#secAttrBlob}.
	 * @param ctx the parse tree
	 */
	void exitSecAttrBlob(CilParser.SecAttrBlobContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#psetHead}.
	 * @param ctx the parse tree
	 */
	void enterPsetHead(CilParser.PsetHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#psetHead}.
	 * @param ctx the parse tree
	 */
	void exitPsetHead(CilParser.PsetHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#nameValPairs}.
	 * @param ctx the parse tree
	 */
	void enterNameValPairs(CilParser.NameValPairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#nameValPairs}.
	 * @param ctx the parse tree
	 */
	void exitNameValPairs(CilParser.NameValPairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#nameValPair}.
	 * @param ctx the parse tree
	 */
	void enterNameValPair(CilParser.NameValPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#nameValPair}.
	 * @param ctx the parse tree
	 */
	void exitNameValPair(CilParser.NameValPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#truefalse}.
	 * @param ctx the parse tree
	 */
	void enterTruefalse(CilParser.TruefalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#truefalse}.
	 * @param ctx the parse tree
	 */
	void exitTruefalse(CilParser.TruefalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#caValue}.
	 * @param ctx the parse tree
	 */
	void enterCaValue(CilParser.CaValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#caValue}.
	 * @param ctx the parse tree
	 */
	void exitCaValue(CilParser.CaValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#secAction}.
	 * @param ctx the parse tree
	 */
	void enterSecAction(CilParser.SecActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#secAction}.
	 * @param ctx the parse tree
	 */
	void exitSecAction(CilParser.SecActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#esHead}.
	 * @param ctx the parse tree
	 */
	void enterEsHead(CilParser.EsHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#esHead}.
	 * @param ctx the parse tree
	 */
	void exitEsHead(CilParser.EsHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#extSourceSpec}.
	 * @param ctx the parse tree
	 */
	void enterExtSourceSpec(CilParser.ExtSourceSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#extSourceSpec}.
	 * @param ctx the parse tree
	 */
	void exitExtSourceSpec(CilParser.ExtSourceSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void enterFileDecl(CilParser.FileDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void exitFileDecl(CilParser.FileDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#fileAttr}.
	 * @param ctx the parse tree
	 */
	void enterFileAttr(CilParser.FileAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#fileAttr}.
	 * @param ctx the parse tree
	 */
	void exitFileAttr(CilParser.FileAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#fileEntry}.
	 * @param ctx the parse tree
	 */
	void enterFileEntry(CilParser.FileEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#fileEntry}.
	 * @param ctx the parse tree
	 */
	void exitFileEntry(CilParser.FileEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#hashHead}.
	 * @param ctx the parse tree
	 */
	void enterHashHead(CilParser.HashHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#hashHead}.
	 * @param ctx the parse tree
	 */
	void exitHashHead(CilParser.HashHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#assemblyHead}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyHead(CilParser.AssemblyHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#assemblyHead}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyHead(CilParser.AssemblyHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#asmAttr}.
	 * @param ctx the parse tree
	 */
	void enterAsmAttr(CilParser.AsmAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#asmAttr}.
	 * @param ctx the parse tree
	 */
	void exitAsmAttr(CilParser.AsmAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#assemblyDecls}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyDecls(CilParser.AssemblyDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#assemblyDecls}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyDecls(CilParser.AssemblyDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#assemblyDecl}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyDecl(CilParser.AssemblyDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#assemblyDecl}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyDecl(CilParser.AssemblyDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#intOrWildcard}.
	 * @param ctx the parse tree
	 */
	void enterIntOrWildcard(CilParser.IntOrWildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#intOrWildcard}.
	 * @param ctx the parse tree
	 */
	void exitIntOrWildcard(CilParser.IntOrWildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#asmOrRefDecl}.
	 * @param ctx the parse tree
	 */
	void enterAsmOrRefDecl(CilParser.AsmOrRefDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#asmOrRefDecl}.
	 * @param ctx the parse tree
	 */
	void exitAsmOrRefDecl(CilParser.AsmOrRefDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#publicKeyHead}.
	 * @param ctx the parse tree
	 */
	void enterPublicKeyHead(CilParser.PublicKeyHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#publicKeyHead}.
	 * @param ctx the parse tree
	 */
	void exitPublicKeyHead(CilParser.PublicKeyHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#publicKeyTokenHead}.
	 * @param ctx the parse tree
	 */
	void enterPublicKeyTokenHead(CilParser.PublicKeyTokenHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#publicKeyTokenHead}.
	 * @param ctx the parse tree
	 */
	void exitPublicKeyTokenHead(CilParser.PublicKeyTokenHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#localeHead}.
	 * @param ctx the parse tree
	 */
	void enterLocaleHead(CilParser.LocaleHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#localeHead}.
	 * @param ctx the parse tree
	 */
	void exitLocaleHead(CilParser.LocaleHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#assemblyRefHead}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyRefHead(CilParser.AssemblyRefHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#assemblyRefHead}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyRefHead(CilParser.AssemblyRefHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#assemblyRefDecls}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyRefDecls(CilParser.AssemblyRefDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#assemblyRefDecls}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyRefDecls(CilParser.AssemblyRefDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#assemblyRefDecl}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyRefDecl(CilParser.AssemblyRefDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#assemblyRefDecl}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyRefDecl(CilParser.AssemblyRefDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#exptypeHead}.
	 * @param ctx the parse tree
	 */
	void enterExptypeHead(CilParser.ExptypeHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#exptypeHead}.
	 * @param ctx the parse tree
	 */
	void exitExptypeHead(CilParser.ExptypeHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#exportHead}.
	 * @param ctx the parse tree
	 */
	void enterExportHead(CilParser.ExportHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#exportHead}.
	 * @param ctx the parse tree
	 */
	void exitExportHead(CilParser.ExportHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#exptAttr}.
	 * @param ctx the parse tree
	 */
	void enterExptAttr(CilParser.ExptAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#exptAttr}.
	 * @param ctx the parse tree
	 */
	void exitExptAttr(CilParser.ExptAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#exptypeDecls}.
	 * @param ctx the parse tree
	 */
	void enterExptypeDecls(CilParser.ExptypeDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#exptypeDecls}.
	 * @param ctx the parse tree
	 */
	void exitExptypeDecls(CilParser.ExptypeDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#exptypeDecl}.
	 * @param ctx the parse tree
	 */
	void enterExptypeDecl(CilParser.ExptypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#exptypeDecl}.
	 * @param ctx the parse tree
	 */
	void exitExptypeDecl(CilParser.ExptypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#manifestResHead}.
	 * @param ctx the parse tree
	 */
	void enterManifestResHead(CilParser.ManifestResHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#manifestResHead}.
	 * @param ctx the parse tree
	 */
	void exitManifestResHead(CilParser.ManifestResHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#manresAttr}.
	 * @param ctx the parse tree
	 */
	void enterManresAttr(CilParser.ManresAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#manresAttr}.
	 * @param ctx the parse tree
	 */
	void exitManresAttr(CilParser.ManresAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#manifestResDecls}.
	 * @param ctx the parse tree
	 */
	void enterManifestResDecls(CilParser.ManifestResDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#manifestResDecls}.
	 * @param ctx the parse tree
	 */
	void exitManifestResDecls(CilParser.ManifestResDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CilParser#manifestResDecl}.
	 * @param ctx the parse tree
	 */
	void enterManifestResDecl(CilParser.ManifestResDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CilParser#manifestResDecl}.
	 * @param ctx the parse tree
	 */
	void exitManifestResDecl(CilParser.ManifestResDeclContext ctx);
}
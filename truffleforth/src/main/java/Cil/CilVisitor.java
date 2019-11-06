// Generated from /home/alex4o/Projects/truffleclr/truffleforth/Cil.g4 by ANTLR 4.7.2
package Cil;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CilParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CilVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CilParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(CilParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(CilParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namespace}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(CilParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code method}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(CilParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code field}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(CilParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code data}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(CilParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vtable}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVtable(CilParser.VtableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vtfixup}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVtfixup(CilParser.VtfixupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extsource}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtsource(CilParser.ExtsourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code file}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CilParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assembly}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembly(CilParser.AssemblyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assemblyReferance}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyReferance(CilParser.AssemblyReferanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exptype}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExptype(CilParser.ExptypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manifest}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManifest(CilParser.ManifestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code module}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(CilParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code security}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity(CilParser.SecurityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code custom}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustom(CilParser.CustomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code system}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem(CilParser.SystemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code corflags}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorflags(CilParser.CorflagsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filealignement}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilealignement(CilParser.FilealignementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imagebase}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImagebase(CilParser.ImagebaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stackreserve}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackreserve(CilParser.StackreserveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code language}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(CilParser.LanguageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedef}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(CilParser.TypedefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compilationControl}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationControl(CilParser.CompilationControlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeLst}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLst(CilParser.TypeLstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mscorelib}
	 * labeled alternative in {@link CilParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMscorelib(CilParser.MscorelibContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#classNameSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassNameSeq(CilParser.ClassNameSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#compQstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompQstring(CilParser.CompQstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#languageDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageDecl(CilParser.LanguageDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CilParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedName(CilParser.DottedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#int32}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt32(CilParser.Int32Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#int64}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt64(CilParser.Int64Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#float64}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat64(CilParser.Float64Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#typedefDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefDecl(CilParser.TypedefDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#compControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompControl(CilParser.CompControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#customDescr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomDescr(CilParser.CustomDescrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#ownerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnerType(CilParser.OwnerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#customBlobDescr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomBlobDescr(CilParser.CustomBlobDescrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#customBlobArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomBlobArgs(CilParser.CustomBlobArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#customBlobNVPairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomBlobNVPairs(CilParser.CustomBlobNVPairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#fieldOrProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOrProp(CilParser.FieldOrPropContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#customAttrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomAttrDecl(CilParser.CustomAttrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#serializType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerializType(CilParser.SerializTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#moduleHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleHead(CilParser.ModuleHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#vtfixupDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVtfixupDecl(CilParser.VtfixupDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#vtfixupAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVtfixupAttr(CilParser.VtfixupAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#vtableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVtableDecl(CilParser.VtableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#vtableHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVtableHead(CilParser.VtableHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#nameSpaceHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameSpaceHead(CilParser.NameSpaceHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#klass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKlass(CilParser.KlassContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#classHeadBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeadBegin(CilParser.ClassHeadBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#classHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHead(CilParser.ClassHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#classAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAttr(CilParser.ClassAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#extendsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsClause(CilParser.ExtendsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#implClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplClause(CilParser.ImplClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#classDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecls(CilParser.ClassDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#implList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplList(CilParser.ImplListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(CilParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#typeListNotEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeListNotEmpty(CilParser.TypeListNotEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#typarsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyparsClause(CilParser.TyparsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#typarAttrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyparAttrib(CilParser.TyparAttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#typarAttribs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyparAttribs(CilParser.TyparAttribsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#typars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypars(CilParser.TyparsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#typarsRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyparsRest(CilParser.TyparsRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#tyBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyBound(CilParser.TyBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#genArity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenArity(CilParser.GenArityContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#genArityNotEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenArityNotEmpty(CilParser.GenArityNotEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(CilParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(CilParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#fieldAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAttr(CilParser.FieldAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#atOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtOpt(CilParser.AtOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#initOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitOpt(CilParser.InitOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#repeatOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatOpt(CilParser.RepeatOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#methodRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodRef(CilParser.MethodRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#callConv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallConv(CilParser.CallConvContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#callKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallKind(CilParser.CallKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#mdtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdtoken(CilParser.MdtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#memberRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberRef(CilParser.MemberRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#eventHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventHead(CilParser.EventHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#eventAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttr(CilParser.EventAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#eventDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDecls(CilParser.EventDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#eventDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDecl(CilParser.EventDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#propHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropHead(CilParser.PropHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#propAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropAttr(CilParser.PropAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#propDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropDecls(CilParser.PropDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#propDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropDecl(CilParser.PropDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#methodHeadPart1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeadPart1(CilParser.MethodHeadPart1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#marshalClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarshalClause(CilParser.MarshalClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#marshalBlob}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarshalBlob(CilParser.MarshalBlobContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#marshalBlobHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarshalBlobHead(CilParser.MarshalBlobHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#methodHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHead(CilParser.MethodHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#methAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethAttr(CilParser.MethAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#pinvAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinvAttr(CilParser.PinvAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(CilParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#paramAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamAttr(CilParser.ParamAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#implAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplAttr(CilParser.ImplAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#localsHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalsHead(CilParser.LocalsHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#methodDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecls(CilParser.MethodDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(CilParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#scopeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeBlock(CilParser.ScopeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#scopeOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeOpen(CilParser.ScopeOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#sehBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSehBlock(CilParser.SehBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#sehClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSehClauses(CilParser.SehClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(CilParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#sehClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSehClause(CilParser.SehClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#filterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterClause(CilParser.FilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#filterHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterHead(CilParser.FilterHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(CilParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#finallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyClause(CilParser.FinallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#faultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaultClause(CilParser.FaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#handlerBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerBlock(CilParser.HandlerBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#dataDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDecl(CilParser.DataDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#ddHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdHead(CilParser.DdHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#tls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTls(CilParser.TlsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#ddBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdBody(CilParser.DdBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#ddItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdItemList(CilParser.DdItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#ddItemCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdItemCount(CilParser.DdItemCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#ddItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdItem(CilParser.DdItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#fieldSerInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldSerInit(CilParser.FieldSerInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#bytearrayhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBytearrayhead(CilParser.BytearrayheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#bytes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBytes(CilParser.BytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#hexbytes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexbytes(CilParser.HexbytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#fieldInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldInit(CilParser.FieldInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#serInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerInit(CilParser.SerInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#f32seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF32seq(CilParser.F32seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#f64seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF64seq(CilParser.F64seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#i64seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI64seq(CilParser.I64seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#i32seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI32seq(CilParser.I32seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#i16seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI16seq(CilParser.I16seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#i8seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI8seq(CilParser.I8seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#boolSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolSeq(CilParser.BoolSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#sqstringSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqstringSeq(CilParser.SqstringSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#classSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSeq(CilParser.ClassSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#objSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjSeq(CilParser.ObjSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#methodSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSpec(CilParser.MethodSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_none}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_none(CilParser.Instr_noneContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_var(CilParser.Instr_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_i(CilParser.Instr_iContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_i8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_i8(CilParser.Instr_i8Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_r(CilParser.Instr_rContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_brtarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_brtarget(CilParser.Instr_brtargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_method(CilParser.Instr_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_field(CilParser.Instr_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_type(CilParser.Instr_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_string(CilParser.Instr_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_sig(CilParser.Instr_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_tok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_tok(CilParser.Instr_tokContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_switch(CilParser.Instr_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr_r_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr_r_head(CilParser.Instr_r_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr(CilParser.InstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabels(CilParser.LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#tyArgs0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyArgs0(CilParser.TyArgs0Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#tyArgs1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyArgs1(CilParser.TyArgs1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#tyArgs2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyArgs2(CilParser.TyArgs2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#sigArgs0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigArgs0(CilParser.SigArgs0Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#sigArgs1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigArgs1(CilParser.SigArgs1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#sigArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigArg(CilParser.SigArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(CilParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#slashedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashedName(CilParser.SlashedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(CilParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#nativeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNativeType(CilParser.NativeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#iidParamIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIidParamIndex(CilParser.IidParamIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#variantType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantType(CilParser.VariantTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CilParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(CilParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#bounds1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBounds1(CilParser.Bounds1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound(CilParser.BoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#secDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecDecl(CilParser.SecDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#secAttrSetBlob}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecAttrSetBlob(CilParser.SecAttrSetBlobContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#secAttrBlob}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecAttrBlob(CilParser.SecAttrBlobContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#psetHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPsetHead(CilParser.PsetHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#nameValPairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValPairs(CilParser.NameValPairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#nameValPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValPair(CilParser.NameValPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#truefalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruefalse(CilParser.TruefalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#caValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaValue(CilParser.CaValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#secAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecAction(CilParser.SecActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#esHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsHead(CilParser.EsHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#extSourceSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtSourceSpec(CilParser.ExtSourceSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#fileDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDecl(CilParser.FileDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#fileAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAttr(CilParser.FileAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#fileEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileEntry(CilParser.FileEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#hashHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashHead(CilParser.HashHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#assemblyHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyHead(CilParser.AssemblyHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#asmAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmAttr(CilParser.AsmAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#assemblyDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyDecls(CilParser.AssemblyDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#assemblyDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyDecl(CilParser.AssemblyDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#intOrWildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntOrWildcard(CilParser.IntOrWildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#asmOrRefDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmOrRefDecl(CilParser.AsmOrRefDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#publicKeyHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicKeyHead(CilParser.PublicKeyHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#publicKeyTokenHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicKeyTokenHead(CilParser.PublicKeyTokenHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#localeHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocaleHead(CilParser.LocaleHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#assemblyRefHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyRefHead(CilParser.AssemblyRefHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#assemblyRefDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyRefDecls(CilParser.AssemblyRefDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#assemblyRefDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyRefDecl(CilParser.AssemblyRefDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#exptypeHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExptypeHead(CilParser.ExptypeHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#exportHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportHead(CilParser.ExportHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#exptAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExptAttr(CilParser.ExptAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#exptypeDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExptypeDecls(CilParser.ExptypeDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#exptypeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExptypeDecl(CilParser.ExptypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#manifestResHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManifestResHead(CilParser.ManifestResHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#manresAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManresAttr(CilParser.ManresAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#manifestResDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManifestResDecls(CilParser.ManifestResDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CilParser#manifestResDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManifestResDecl(CilParser.ManifestResDeclContext ctx);
}
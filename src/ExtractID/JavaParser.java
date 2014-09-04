// $ANTLR 3.4 Java.g 2014-09-01 18:02:36

        /* esto es para que el parser sea visto desde el resto del proyecto y viceversa */
	package ExtractID;
        /*import java.io.File;*/
        import Listas.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AMPAMP", "AMPEQ", "ASSERT", "BANG", "BANGEQ", "BAR", "BARBAR", "BAREQ", "BOOLEAN", "BREAK", "BYTE", "CARET", "CARETEQ", "CASE", "CATCH", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "DEFAULT", "DO", "DOT", "DOUBLE", "DOUBLELITERAL", "DoubleSuffix", "ELLIPSIS", "ELSE", "ENUM", "EQ", "EQEQ", "EXTENDS", "EscapeSequence", "Exponent", "FALSE", "FINAL", "FINALLY", "FLOAT", "FLOATLITERAL", "FOR", "FloatSuffix", "GOTO", "GT", "HexDigit", "HexPrefix", "IDENTIFIER", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "INTLITERAL", "IdentifierPart", "IdentifierStart", "IntegerNumber", "LBRACE", "LBRACKET", "LINE_COMMENT", "LONG", "LONGLITERAL", "LPAREN", "LT", "LongSuffix", "MONKEYS_AT", "NATIVE", "NEW", "NULL", "NonIntegerNumber", "PACKAGE", "PERCENT", "PERCENTEQ", "PLUS", "PLUSEQ", "PLUSPLUS", "PRIVATE", "PROTECTED", "PUBLIC", "QUES", "RBRACE", "RBRACKET", "RETURN", "RPAREN", "SEMI", "SHORT", "SLASH", "SLASHEQ", "STAR", "STAREQ", "STATIC", "STRICTFP", "STRINGLITERAL", "SUB", "SUBEQ", "SUBSUB", "SUPER", "SWITCH", "SYNCHRONIZED", "SurrogateIdentifer", "THIS", "THROW", "THROWS", "TILDE", "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int AMP=5;
    public static final int AMPAMP=6;
    public static final int AMPEQ=7;
    public static final int ASSERT=8;
    public static final int BANG=9;
    public static final int BANGEQ=10;
    public static final int BAR=11;
    public static final int BARBAR=12;
    public static final int BAREQ=13;
    public static final int BOOLEAN=14;
    public static final int BREAK=15;
    public static final int BYTE=16;
    public static final int CARET=17;
    public static final int CARETEQ=18;
    public static final int CASE=19;
    public static final int CATCH=20;
    public static final int CHAR=21;
    public static final int CHARLITERAL=22;
    public static final int CLASS=23;
    public static final int COLON=24;
    public static final int COMMA=25;
    public static final int COMMENT=26;
    public static final int CONST=27;
    public static final int CONTINUE=28;
    public static final int DEFAULT=29;
    public static final int DO=30;
    public static final int DOT=31;
    public static final int DOUBLE=32;
    public static final int DOUBLELITERAL=33;
    public static final int DoubleSuffix=34;
    public static final int ELLIPSIS=35;
    public static final int ELSE=36;
    public static final int ENUM=37;
    public static final int EQ=38;
    public static final int EQEQ=39;
    public static final int EXTENDS=40;
    public static final int EscapeSequence=41;
    public static final int Exponent=42;
    public static final int FALSE=43;
    public static final int FINAL=44;
    public static final int FINALLY=45;
    public static final int FLOAT=46;
    public static final int FLOATLITERAL=47;
    public static final int FOR=48;
    public static final int FloatSuffix=49;
    public static final int GOTO=50;
    public static final int GT=51;
    public static final int HexDigit=52;
    public static final int HexPrefix=53;
    public static final int IDENTIFIER=54;
    public static final int IF=55;
    public static final int IMPLEMENTS=56;
    public static final int IMPORT=57;
    public static final int INSTANCEOF=58;
    public static final int INT=59;
    public static final int INTERFACE=60;
    public static final int INTLITERAL=61;
    public static final int IdentifierPart=62;
    public static final int IdentifierStart=63;
    public static final int IntegerNumber=64;
    public static final int LBRACE=65;
    public static final int LBRACKET=66;
    public static final int LINE_COMMENT=67;
    public static final int LONG=68;
    public static final int LONGLITERAL=69;
    public static final int LPAREN=70;
    public static final int LT=71;
    public static final int LongSuffix=72;
    public static final int MONKEYS_AT=73;
    public static final int NATIVE=74;
    public static final int NEW=75;
    public static final int NULL=76;
    public static final int NonIntegerNumber=77;
    public static final int PACKAGE=78;
    public static final int PERCENT=79;
    public static final int PERCENTEQ=80;
    public static final int PLUS=81;
    public static final int PLUSEQ=82;
    public static final int PLUSPLUS=83;
    public static final int PRIVATE=84;
    public static final int PROTECTED=85;
    public static final int PUBLIC=86;
    public static final int QUES=87;
    public static final int RBRACE=88;
    public static final int RBRACKET=89;
    public static final int RETURN=90;
    public static final int RPAREN=91;
    public static final int SEMI=92;
    public static final int SHORT=93;
    public static final int SLASH=94;
    public static final int SLASHEQ=95;
    public static final int STAR=96;
    public static final int STAREQ=97;
    public static final int STATIC=98;
    public static final int STRICTFP=99;
    public static final int STRINGLITERAL=100;
    public static final int SUB=101;
    public static final int SUBEQ=102;
    public static final int SUBSUB=103;
    public static final int SUPER=104;
    public static final int SWITCH=105;
    public static final int SYNCHRONIZED=106;
    public static final int SurrogateIdentifer=107;
    public static final int THIS=108;
    public static final int THROW=109;
    public static final int THROWS=110;
    public static final int TILDE=111;
    public static final int TRANSIENT=112;
    public static final int TRUE=113;
    public static final int TRY=114;
    public static final int VOID=115;
    public static final int VOLATILE=116;
    public static final int WHILE=117;
    public static final int WS=118;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators

    protected static class GlobalOne_scope {
        int claseActual;
    }
    protected Stack GlobalOne_stack = new Stack();



    public JavaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[381+1];
         

    }

    public String[] getTokenNames() { return JavaParser.tokenNames; }
    public String getGrammarFileName() { return "Java.g"; }


        private boolean noErr = true;
        
        @Override
         public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {                                       
             
             noErr = false;
        }

        public boolean ocurrioError(){return noErr;}

        private Clase claseAnalisis;

        public Clase getClaseAnalisis(){return claseAnalisis;}


        ArrayList<Literal> lisLiterales = new ArrayList(); 
        public ArrayList<Literal> getLisLiterales(){return this.lisLiterales;}
    	



    // $ANTLR start "compilationUnit"
    // Java.g:100:1: compilationUnit : ( ( annotations )? p= packageDeclaration )? ( importDeclaration )* (t= typeDeclaration )* ;
    public final void compilationUnit() throws RecognitionException {
        int compilationUnit_StartIndex = input.index();

        JavaParser.packageDeclaration_return p =null;

        Clase t =null;



            //ArrayList<Clase> lisClases = new ArrayList<Clase>();    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // Java.g:104:5: ( ( ( annotations )? p= packageDeclaration )? ( importDeclaration )* (t= typeDeclaration )* )
            // Java.g:104:9: ( ( annotations )? p= packageDeclaration )? ( importDeclaration )* (t= typeDeclaration )*
            {
            // Java.g:104:9: ( ( annotations )? p= packageDeclaration )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MONKEYS_AT) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2_Java()) ) {
                    alt2=1;
                }
            }
            else if ( (LA2_0==PACKAGE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Java.g:104:13: ( annotations )? p= packageDeclaration
                    {
                    // Java.g:104:13: ( annotations )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==MONKEYS_AT) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // Java.g:104:14: annotations
                            {
                            pushFollow(FOLLOW_annotations_in_compilationUnit103);
                            annotations();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_packageDeclaration_in_compilationUnit136);
                    p=packageDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:108:9: ( importDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IMPORT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Java.g:108:10: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_compilationUnit158);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // Java.g:110:9: (t= typeDeclaration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ABSTRACT||LA4_0==BOOLEAN||LA4_0==BYTE||LA4_0==CHAR||LA4_0==CLASS||LA4_0==DOUBLE||LA4_0==ENUM||LA4_0==FINAL||LA4_0==FLOAT||LA4_0==IDENTIFIER||(LA4_0 >= INT && LA4_0 <= INTERFACE)||LA4_0==LONG||LA4_0==LT||(LA4_0 >= MONKEYS_AT && LA4_0 <= NATIVE)||(LA4_0 >= PRIVATE && LA4_0 <= PUBLIC)||(LA4_0 >= SEMI && LA4_0 <= SHORT)||(LA4_0 >= STATIC && LA4_0 <= STRICTFP)||LA4_0==SYNCHRONIZED||LA4_0==TRANSIENT||(LA4_0 >= VOID && LA4_0 <= VOLATILE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Java.g:110:10: t= typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_compilationUnit182);
            	    t=typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {if(t==null){System.out.println("Java.g Error: typeDeclaration == null!");noErr=false;}
            	                if(p!=null){t.setNomPaq(p.paqName); t.setLinPaq(p.paqLine);} claseAnalisis = t;}

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "compilationUnit"


    public static class packageDeclaration_return extends ParserRuleReturnScope {
        public String paqName= "";
        public int paqLine;
    };


    // $ANTLR start "packageDeclaration"
    // Java.g:115:1: packageDeclaration returns [String paqName= \"\", int paqLine] : 'package' q= qualifiedName ';' ;
    public final JavaParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
        JavaParser.packageDeclaration_return retval = new JavaParser.packageDeclaration_return();
        retval.start = input.LT(1);

        int packageDeclaration_StartIndex = input.index();

        JavaParser.qualifiedName_return q =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // Java.g:116:5: ( 'package' q= qualifiedName ';' )
            // Java.g:116:9: 'package' q= qualifiedName ';'
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration219); if (state.failed) return retval;

            pushFollow(FOLLOW_qualifiedName_in_packageDeclaration225);
            q=qualifiedName();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.paqName = q.paqName; retval.paqLine = q.paqLine;}

            match(input,SEMI,FOLLOW_SEMI_in_packageDeclaration237); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "packageDeclaration"



    // $ANTLR start "importDeclaration"
    // Java.g:120:1: importDeclaration : ( 'import' ( 'static' )? IDENTIFIER '.' '*' ';' | 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';' );
    public final void importDeclaration() throws RecognitionException {
        int importDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // Java.g:121:5: ( 'import' ( 'static' )? IDENTIFIER '.' '*' ';' | 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IMPORT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==STATIC) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==IDENTIFIER) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==DOT) ) {
                            int LA9_4 = input.LA(5);

                            if ( (LA9_4==STAR) ) {
                                alt9=1;
                            }
                            else if ( (LA9_4==IDENTIFIER) ) {
                                alt9=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA9_1==IDENTIFIER) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==DOT) ) {
                        int LA9_4 = input.LA(4);

                        if ( (LA9_4==STAR) ) {
                            alt9=1;
                        }
                        else if ( (LA9_4==IDENTIFIER) ) {
                            alt9=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Java.g:121:9: 'import' ( 'static' )? IDENTIFIER '.' '*' ';'
                    {
                    match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration258); if (state.failed) return ;

                    // Java.g:122:9: ( 'static' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==STATIC) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Java.g:122:10: 'static'
                            {
                            match(input,STATIC,FOLLOW_STATIC_in_importDeclaration270); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration291); if (state.failed) return ;

                    match(input,DOT,FOLLOW_DOT_in_importDeclaration293); if (state.failed) return ;

                    match(input,STAR,FOLLOW_STAR_in_importDeclaration295); if (state.failed) return ;

                    match(input,SEMI,FOLLOW_SEMI_in_importDeclaration305); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:126:9: 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';'
                    {
                    match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration322); if (state.failed) return ;

                    // Java.g:127:9: ( 'static' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==STATIC) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Java.g:127:10: 'static'
                            {
                            match(input,STATIC,FOLLOW_STATIC_in_importDeclaration334); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration355); if (state.failed) return ;

                    // Java.g:130:9: ( '.' IDENTIFIER )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==DOT) ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1==IDENTIFIER) ) {
                                alt7=1;
                            }


                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Java.g:130:10: '.' IDENTIFIER
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_importDeclaration366); if (state.failed) return ;

                    	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration368); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    // Java.g:132:9: ( '.' '*' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==DOT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Java.g:132:10: '.' '*'
                            {
                            match(input,DOT,FOLLOW_DOT_in_importDeclaration390); if (state.failed) return ;

                            match(input,STAR,FOLLOW_STAR_in_importDeclaration392); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_importDeclaration413); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "importDeclaration"



    // $ANTLR start "qualifiedImportName"
    // Java.g:137:1: qualifiedImportName : IDENTIFIER ( '.' IDENTIFIER )* ;
    public final void qualifiedImportName() throws RecognitionException {
        int qualifiedImportName_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // Java.g:138:5: ( IDENTIFIER ( '.' IDENTIFIER )* )
            // Java.g:138:9: IDENTIFIER ( '.' IDENTIFIER )*
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedImportName433); if (state.failed) return ;

            // Java.g:139:9: ( '.' IDENTIFIER )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Java.g:139:10: '.' IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_qualifiedImportName444); if (state.failed) return ;

            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedImportName446); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, qualifiedImportName_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "qualifiedImportName"



    // $ANTLR start "typeDeclaration"
    // Java.g:143:1: typeDeclaration returns [Clase unaClase] : (c= classOrInterfaceDeclaration | ';' );
    public final Clase typeDeclaration() throws RecognitionException {
        Clase unaClase = null;

        int typeDeclaration_StartIndex = input.index();

        Clase c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return unaClase; }

            // Java.g:144:5: (c= classOrInterfaceDeclaration | ';' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ABSTRACT||LA11_0==BOOLEAN||LA11_0==BYTE||LA11_0==CHAR||LA11_0==CLASS||LA11_0==DOUBLE||LA11_0==ENUM||LA11_0==FINAL||LA11_0==FLOAT||LA11_0==IDENTIFIER||(LA11_0 >= INT && LA11_0 <= INTERFACE)||LA11_0==LONG||LA11_0==LT||(LA11_0 >= MONKEYS_AT && LA11_0 <= NATIVE)||(LA11_0 >= PRIVATE && LA11_0 <= PUBLIC)||LA11_0==SHORT||(LA11_0 >= STATIC && LA11_0 <= STRICTFP)||LA11_0==SYNCHRONIZED||LA11_0==TRANSIENT||(LA11_0 >= VOID && LA11_0 <= VOLATILE)) ) {
                alt11=1;
            }
            else if ( (LA11_0==SEMI) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return unaClase;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // Java.g:144:9: c= classOrInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration485);
                    c=classOrInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    if ( state.backtracking==0 ) {unaClase = c;}

                    }
                    break;
                case 2 :
                    // Java.g:145:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_typeDeclaration497); if (state.failed) return unaClase;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, typeDeclaration_StartIndex); }

        }
        return unaClase;
    }
    // $ANTLR end "typeDeclaration"



    // $ANTLR start "classOrInterfaceDeclaration"
    // Java.g:148:1: classOrInterfaceDeclaration returns [Clase unaClase] : (c= classDeclaration | interfaceDeclaration );
    public final Clase classOrInterfaceDeclaration() throws RecognitionException {
        Clase unaClase = null;

        int classOrInterfaceDeclaration_StartIndex = input.index();

        Clase c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return unaClase; }

            // Java.g:149:5: (c= classDeclaration | interfaceDeclaration )
            int alt12=2;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
                }
                break;
            case PUBLIC:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;

                }
                }
                break;
            case PROTECTED:
                {
                int LA12_3 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;

                }
                }
                break;
            case PRIVATE:
                {
                int LA12_4 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;

                }
                }
                break;
            case STATIC:
                {
                int LA12_5 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 5, input);

                    throw nvae;

                }
                }
                break;
            case ABSTRACT:
                {
                int LA12_6 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 6, input);

                    throw nvae;

                }
                }
                break;
            case FINAL:
                {
                int LA12_7 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 7, input);

                    throw nvae;

                }
                }
                break;
            case NATIVE:
                {
                int LA12_8 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 8, input);

                    throw nvae;

                }
                }
                break;
            case SYNCHRONIZED:
                {
                int LA12_9 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRANSIENT:
                {
                int LA12_10 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 10, input);

                    throw nvae;

                }
                }
                break;
            case VOLATILE:
                {
                int LA12_11 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 11, input);

                    throw nvae;

                }
                }
                break;
            case STRICTFP:
                {
                int LA12_12 = input.LA(2);

                if ( (synpred12_Java()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 12, input);

                    throw nvae;

                }
                }
                break;
            case CLASS:
            case ENUM:
                {
                alt12=1;
                }
                break;
            case INTERFACE:
                {
                alt12=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return unaClase;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // Java.g:149:9: c= classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration525);
                    c=classDeclaration();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    if ( state.backtracking==0 ) {unaClase = c;}

                    }
                    break;
                case 2 :
                    // Java.g:150:9: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration537);
                    interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, classOrInterfaceDeclaration_StartIndex); }

        }
        return unaClase;
    }
    // $ANTLR end "classOrInterfaceDeclaration"



    // $ANTLR start "modifiers"
    // Java.g:154:1: modifiers returns [String modif] : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )* ;
    public final String modifiers() throws RecognitionException {
        String modif = null;

        int modifiers_StartIndex = input.index();


            modif = "";

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return modif; }

            // Java.g:158:5: ( ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )* )
            // Java.g:159:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )*
            {
            // Java.g:159:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )*
            loop13:
            do {
                int alt13=13;
                switch ( input.LA(1) ) {
                case MONKEYS_AT:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==IDENTIFIER) ) {
                        alt13=1;
                    }


                    }
                    break;
                case PUBLIC:
                    {
                    alt13=2;
                    }
                    break;
                case PROTECTED:
                    {
                    alt13=3;
                    }
                    break;
                case PRIVATE:
                    {
                    alt13=4;
                    }
                    break;
                case STATIC:
                    {
                    alt13=5;
                    }
                    break;
                case ABSTRACT:
                    {
                    alt13=6;
                    }
                    break;
                case FINAL:
                    {
                    alt13=7;
                    }
                    break;
                case NATIVE:
                    {
                    alt13=8;
                    }
                    break;
                case SYNCHRONIZED:
                    {
                    alt13=9;
                    }
                    break;
                case TRANSIENT:
                    {
                    alt13=10;
                    }
                    break;
                case VOLATILE:
                    {
                    alt13=11;
                    }
                    break;
                case STRICTFP:
                    {
                    alt13=12;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // Java.g:159:10: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_modifiers579);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return modif;

            	    }
            	    break;
            	case 2 :
            	    // Java.g:160:9: 'public'
            	    {
            	    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifiers589); if (state.failed) return modif;

            	    if ( state.backtracking==0 ) {modif = "public";}

            	    }
            	    break;
            	case 3 :
            	    // Java.g:161:9: 'protected'
            	    {
            	    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifiers601); if (state.failed) return modif;

            	    if ( state.backtracking==0 ) {modif = "protected";}

            	    }
            	    break;
            	case 4 :
            	    // Java.g:162:9: 'private'
            	    {
            	    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifiers613); if (state.failed) return modif;

            	    if ( state.backtracking==0 ) {modif = "private";}

            	    }
            	    break;
            	case 5 :
            	    // Java.g:163:9: 'static'
            	    {
            	    match(input,STATIC,FOLLOW_STATIC_in_modifiers625); if (state.failed) return modif;

            	    }
            	    break;
            	case 6 :
            	    // Java.g:164:9: 'abstract'
            	    {
            	    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifiers635); if (state.failed) return modif;

            	    }
            	    break;
            	case 7 :
            	    // Java.g:165:9: 'final'
            	    {
            	    match(input,FINAL,FOLLOW_FINAL_in_modifiers645); if (state.failed) return modif;

            	    }
            	    break;
            	case 8 :
            	    // Java.g:166:9: 'native'
            	    {
            	    match(input,NATIVE,FOLLOW_NATIVE_in_modifiers655); if (state.failed) return modif;

            	    }
            	    break;
            	case 9 :
            	    // Java.g:167:9: 'synchronized'
            	    {
            	    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifiers665); if (state.failed) return modif;

            	    }
            	    break;
            	case 10 :
            	    // Java.g:168:9: 'transient'
            	    {
            	    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifiers675); if (state.failed) return modif;

            	    }
            	    break;
            	case 11 :
            	    // Java.g:169:9: 'volatile'
            	    {
            	    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifiers685); if (state.failed) return modif;

            	    }
            	    break;
            	case 12 :
            	    // Java.g:170:9: 'strictfp'
            	    {
            	    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifiers695); if (state.failed) return modif;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, modifiers_StartIndex); }

        }
        return modif;
    }
    // $ANTLR end "modifiers"


    public static class variableModifiers_return extends ParserRuleReturnScope {
        public String s = "";
    };


    // $ANTLR start "variableModifiers"
    // Java.g:175:1: variableModifiers returns [String s = \"\"] : ( 'final' | annotation )* ;
    public final JavaParser.variableModifiers_return variableModifiers() throws RecognitionException {
        JavaParser.variableModifiers_return retval = new JavaParser.variableModifiers_return();
        retval.start = input.LT(1);

        int variableModifiers_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Java.g:176:5: ( ( 'final' | annotation )* )
            // Java.g:176:9: ( 'final' | annotation )*
            {
            // Java.g:176:9: ( 'final' | annotation )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==FINAL) ) {
                    alt14=1;
                }
                else if ( (LA14_0==MONKEYS_AT) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // Java.g:176:13: 'final'
            	    {
            	    match(input,FINAL,FOLLOW_FINAL_in_variableModifiers735); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // Java.g:177:13: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_variableModifiers749);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, variableModifiers_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableModifiers"



    // $ANTLR start "classDeclaration"
    // Java.g:182:1: classDeclaration returns [Clase unaClase] : (n= normalClassDeclaration | enumDeclaration );
    public final Clase classDeclaration() throws RecognitionException {
        Clase unaClase = null;

        int classDeclaration_StartIndex = input.index();

        Clase n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return unaClase; }

            // Java.g:183:5: (n= normalClassDeclaration | enumDeclaration )
            int alt15=2;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA15_1 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
                }
                break;
            case PUBLIC:
                {
                int LA15_2 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;

                }
                }
                break;
            case PROTECTED:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;

                }
                }
                break;
            case PRIVATE:
                {
                int LA15_4 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;

                }
                }
                break;
            case STATIC:
                {
                int LA15_5 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 5, input);

                    throw nvae;

                }
                }
                break;
            case ABSTRACT:
                {
                int LA15_6 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 6, input);

                    throw nvae;

                }
                }
                break;
            case FINAL:
                {
                int LA15_7 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 7, input);

                    throw nvae;

                }
                }
                break;
            case NATIVE:
                {
                int LA15_8 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 8, input);

                    throw nvae;

                }
                }
                break;
            case SYNCHRONIZED:
                {
                int LA15_9 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRANSIENT:
                {
                int LA15_10 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 10, input);

                    throw nvae;

                }
                }
                break;
            case VOLATILE:
                {
                int LA15_11 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 11, input);

                    throw nvae;

                }
                }
                break;
            case STRICTFP:
                {
                int LA15_12 = input.LA(2);

                if ( (synpred27_Java()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return unaClase;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 12, input);

                    throw nvae;

                }
                }
                break;
            case CLASS:
                {
                alt15=1;
                }
                break;
            case ENUM:
                {
                alt15=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return unaClase;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // Java.g:183:9: n= normalClassDeclaration
                    {
                    pushFollow(FOLLOW_normalClassDeclaration_in_classDeclaration793);
                    n=normalClassDeclaration();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    if ( state.backtracking==0 ) {unaClase = n;}

                    }
                    break;
                case 2 :
                    // Java.g:184:9: enumDeclaration
                    {
                    pushFollow(FOLLOW_enumDeclaration_in_classDeclaration805);
                    enumDeclaration();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, classDeclaration_StartIndex); }

        }
        return unaClase;
    }
    // $ANTLR end "classDeclaration"



    // $ANTLR start "normalClassDeclaration"
    // Java.g:187:1: normalClassDeclaration returns [Clase unaClase] : mo1= modifiers 'class' I1= IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? c= classBody ;
    public final Clase normalClassDeclaration() throws RecognitionException {
        Clase unaClase = null;

        int normalClassDeclaration_StartIndex = input.index();

        Token I1=null;
        String mo1 =null;

        Clase c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return unaClase; }

            // Java.g:188:5: (mo1= modifiers 'class' I1= IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? c= classBody )
            // Java.g:188:9: mo1= modifiers 'class' I1= IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? c= classBody
            {
            pushFollow(FOLLOW_modifiers_in_normalClassDeclaration833);
            mo1=modifiers();

            state._fsp--;
            if (state.failed) return unaClase;

            match(input,CLASS,FOLLOW_CLASS_in_normalClassDeclaration836); if (state.failed) return unaClase;

            I1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalClassDeclaration842); if (state.failed) return unaClase;

            // Java.g:189:9: ( typeParameters )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Java.g:189:10: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_normalClassDeclaration853);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    }
                    break;

            }


            // Java.g:191:9: ( 'extends' type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EXTENDS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Java.g:191:10: 'extends' type
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_normalClassDeclaration877); if (state.failed) return unaClase;

                    pushFollow(FOLLOW_type_in_normalClassDeclaration879);
                    type();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    }
                    break;

            }


            // Java.g:193:9: ( 'implements' typeList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IMPLEMENTS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Java.g:193:10: 'implements' typeList
                    {
                    match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_normalClassDeclaration901); if (state.failed) return unaClase;

                    pushFollow(FOLLOW_typeList_in_normalClassDeclaration903);
                    typeList();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    }
                    break;

            }


            pushFollow(FOLLOW_classBody_in_normalClassDeclaration940);
            c=classBody();

            state._fsp--;
            if (state.failed) return unaClase;

            if ( state.backtracking==0 ) {c.setIde(new Id((I1!=null?I1.getText():null),I1.getLine())); c.setModClase(mo1);unaClase =c;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, normalClassDeclaration_StartIndex); }

        }
        return unaClase;
    }
    // $ANTLR end "normalClassDeclaration"



    // $ANTLR start "typeParameters"
    // Java.g:199:1: typeParameters : '<' typeParameter ( ',' typeParameter )* '>' ;
    public final void typeParameters() throws RecognitionException {
        int typeParameters_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // Java.g:200:5: ( '<' typeParameter ( ',' typeParameter )* '>' )
            // Java.g:200:9: '<' typeParameter ( ',' typeParameter )* '>'
            {
            match(input,LT,FOLLOW_LT_in_typeParameters963); if (state.failed) return ;

            pushFollow(FOLLOW_typeParameter_in_typeParameters977);
            typeParameter();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:202:13: ( ',' typeParameter )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Java.g:202:14: ',' typeParameter
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeParameters992); if (state.failed) return ;

            	    pushFollow(FOLLOW_typeParameter_in_typeParameters994);
            	    typeParameter();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match(input,GT,FOLLOW_GT_in_typeParameters1019); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, typeParameters_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeParameters"



    // $ANTLR start "typeParameter"
    // Java.g:207:1: typeParameter : IDENTIFIER ( 'extends' typeBound )? ;
    public final void typeParameter() throws RecognitionException {
        int typeParameter_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // Java.g:208:5: ( IDENTIFIER ( 'extends' typeBound )? )
            // Java.g:208:9: IDENTIFIER ( 'extends' typeBound )?
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeParameter1039); if (state.failed) return ;

            // Java.g:209:9: ( 'extends' typeBound )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EXTENDS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Java.g:209:10: 'extends' typeBound
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_typeParameter1050); if (state.failed) return ;

                    pushFollow(FOLLOW_typeBound_in_typeParameter1052);
                    typeBound();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, typeParameter_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeParameter"



    // $ANTLR start "typeBound"
    // Java.g:214:1: typeBound : type ( '&' type )* ;
    public final void typeBound() throws RecognitionException {
        int typeBound_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // Java.g:215:5: ( type ( '&' type )* )
            // Java.g:215:9: type ( '&' type )*
            {
            pushFollow(FOLLOW_type_in_typeBound1084);
            type();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:216:9: ( '&' type )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AMP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Java.g:216:10: '&' type
            	    {
            	    match(input,AMP,FOLLOW_AMP_in_typeBound1095); if (state.failed) return ;

            	    pushFollow(FOLLOW_type_in_typeBound1097);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, typeBound_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeBound"



    // $ANTLR start "enumDeclaration"
    // Java.g:221:1: enumDeclaration : modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody ;
    public final void enumDeclaration() throws RecognitionException {
        int enumDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // Java.g:222:5: ( modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody )
            // Java.g:222:9: modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody
            {
            pushFollow(FOLLOW_modifiers_in_enumDeclaration1129);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:223:9: ( 'enum' )
            // Java.g:223:10: 'enum'
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration1141); if (state.failed) return ;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDeclaration1162); if (state.failed) return ;

            // Java.g:226:9: ( 'implements' typeList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IMPLEMENTS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Java.g:226:10: 'implements' typeList
                    {
                    match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_enumDeclaration1173); if (state.failed) return ;

                    pushFollow(FOLLOW_typeList_in_enumDeclaration1175);
                    typeList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDeclaration1196);
            enumBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, enumDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enumDeclaration"



    // $ANTLR start "enumBody"
    // Java.g:232:1: enumBody : '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' ;
    public final void enumBody() throws RecognitionException {
        int enumBody_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // Java.g:233:5: ( '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' )
            // Java.g:233:9: '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_enumBody1221); if (state.failed) return ;

            // Java.g:234:9: ( enumConstants )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENTIFIER||LA23_0==MONKEYS_AT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Java.g:234:10: enumConstants
                    {
                    pushFollow(FOLLOW_enumConstants_in_enumBody1232);
                    enumConstants();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:236:9: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==COMMA) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Java.g:236:9: ','
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_enumBody1254); if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:237:9: ( enumBodyDeclarations )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==SEMI) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Java.g:237:10: enumBodyDeclarations
                    {
                    pushFollow(FOLLOW_enumBodyDeclarations_in_enumBody1267);
                    enumBodyDeclarations();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_enumBody1289); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, enumBody_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enumBody"



    // $ANTLR start "enumConstants"
    // Java.g:242:1: enumConstants : enumConstant ( ',' enumConstant )* ;
    public final void enumConstants() throws RecognitionException {
        int enumConstants_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // Java.g:243:5: ( enumConstant ( ',' enumConstant )* )
            // Java.g:243:9: enumConstant ( ',' enumConstant )*
            {
            pushFollow(FOLLOW_enumConstant_in_enumConstants1309);
            enumConstant();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:244:9: ( ',' enumConstant )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==IDENTIFIER||LA26_1==MONKEYS_AT) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // Java.g:244:10: ',' enumConstant
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumConstants1320); if (state.failed) return ;

            	    pushFollow(FOLLOW_enumConstant_in_enumConstants1322);
            	    enumConstant();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, enumConstants_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enumConstants"



    // $ANTLR start "enumConstant"
    // Java.g:252:1: enumConstant : ( annotations )? IDENTIFIER ( arguments )? ( classBody )? ;
    public final void enumConstant() throws RecognitionException {
        int enumConstant_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // Java.g:253:5: ( ( annotations )? IDENTIFIER ( arguments )? ( classBody )? )
            // Java.g:253:9: ( annotations )? IDENTIFIER ( arguments )? ( classBody )?
            {
            // Java.g:253:9: ( annotations )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==MONKEYS_AT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Java.g:253:10: annotations
                    {
                    pushFollow(FOLLOW_annotations_in_enumConstant1356);
                    annotations();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumConstant1377); if (state.failed) return ;

            // Java.g:256:9: ( arguments )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LPAREN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Java.g:256:10: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant1388);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:258:9: ( classBody )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LBRACE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Java.g:258:10: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_enumConstant1410);
                    classBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, enumConstant_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enumConstant"



    // $ANTLR start "enumBodyDeclarations"
    // Java.g:264:1: enumBodyDeclarations : ';' ( classBodyDeclaration )* ;
    public final void enumBodyDeclarations() throws RecognitionException {
        int enumBodyDeclarations_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // Java.g:265:5: ( ';' ( classBodyDeclaration )* )
            // Java.g:265:9: ';' ( classBodyDeclaration )*
            {
            match(input,SEMI,FOLLOW_SEMI_in_enumBodyDeclarations1451); if (state.failed) return ;

            // Java.g:266:9: ( classBodyDeclaration )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ABSTRACT||LA30_0==BOOLEAN||LA30_0==BYTE||LA30_0==CHAR||LA30_0==CLASS||LA30_0==DOUBLE||LA30_0==ENUM||LA30_0==FINAL||LA30_0==FLOAT||LA30_0==IDENTIFIER||(LA30_0 >= INT && LA30_0 <= INTERFACE)||LA30_0==LBRACE||LA30_0==LONG||LA30_0==LT||(LA30_0 >= MONKEYS_AT && LA30_0 <= NATIVE)||(LA30_0 >= PRIVATE && LA30_0 <= PUBLIC)||(LA30_0 >= SEMI && LA30_0 <= SHORT)||(LA30_0 >= STATIC && LA30_0 <= STRICTFP)||LA30_0==SYNCHRONIZED||LA30_0==TRANSIENT||(LA30_0 >= VOID && LA30_0 <= VOLATILE)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Java.g:266:10: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_enumBodyDeclarations1463);
            	    classBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, enumBodyDeclarations_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enumBodyDeclarations"



    // $ANTLR start "interfaceDeclaration"
    // Java.g:270:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
    public final void interfaceDeclaration() throws RecognitionException {
        int interfaceDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // Java.g:271:5: ( normalInterfaceDeclaration | annotationTypeDeclaration )
            int alt31=2;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA31_1 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
                }
                break;
            case PUBLIC:
                {
                int LA31_2 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;

                }
                }
                break;
            case PROTECTED:
                {
                int LA31_3 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;

                }
                }
                break;
            case PRIVATE:
                {
                int LA31_4 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 4, input);

                    throw nvae;

                }
                }
                break;
            case STATIC:
                {
                int LA31_5 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 5, input);

                    throw nvae;

                }
                }
                break;
            case ABSTRACT:
                {
                int LA31_6 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 6, input);

                    throw nvae;

                }
                }
                break;
            case FINAL:
                {
                int LA31_7 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 7, input);

                    throw nvae;

                }
                }
                break;
            case NATIVE:
                {
                int LA31_8 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 8, input);

                    throw nvae;

                }
                }
                break;
            case SYNCHRONIZED:
                {
                int LA31_9 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRANSIENT:
                {
                int LA31_10 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 10, input);

                    throw nvae;

                }
                }
                break;
            case VOLATILE:
                {
                int LA31_11 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 11, input);

                    throw nvae;

                }
                }
                break;
            case STRICTFP:
                {
                int LA31_12 = input.LA(2);

                if ( (synpred43_Java()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 12, input);

                    throw nvae;

                }
                }
                break;
            case INTERFACE:
                {
                alt31=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // Java.g:271:9: normalInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration1494);
                    normalInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:272:9: annotationTypeDeclaration
                    {
                    pushFollow(FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration1504);
                    annotationTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, interfaceDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "interfaceDeclaration"



    // $ANTLR start "normalInterfaceDeclaration"
    // Java.g:275:1: normalInterfaceDeclaration : modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody ;
    public final void normalInterfaceDeclaration() throws RecognitionException {
        int normalInterfaceDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // Java.g:276:5: ( modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody )
            // Java.g:276:9: modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody
            {
            pushFollow(FOLLOW_modifiers_in_normalInterfaceDeclaration1528);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            match(input,INTERFACE,FOLLOW_INTERFACE_in_normalInterfaceDeclaration1530); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration1532); if (state.failed) return ;

            // Java.g:277:9: ( typeParameters )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Java.g:277:10: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration1543);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:279:9: ( 'extends' typeList )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EXTENDS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Java.g:279:10: 'extends' typeList
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_normalInterfaceDeclaration1565); if (state.failed) return ;

                    pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration1567);
                    typeList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration1588);
            interfaceBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, normalInterfaceDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "normalInterfaceDeclaration"



    // $ANTLR start "typeList"
    // Java.g:284:1: typeList : type ( ',' type )* ;
    public final void typeList() throws RecognitionException {
        int typeList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // Java.g:285:5: ( type ( ',' type )* )
            // Java.g:285:9: type ( ',' type )*
            {
            pushFollow(FOLLOW_type_in_typeList1608);
            type();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:286:9: ( ',' type )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==COMMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Java.g:286:10: ',' type
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeList1619); if (state.failed) return ;

            	    pushFollow(FOLLOW_type_in_typeList1621);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, typeList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeList"



    // $ANTLR start "classBody"
    // Java.g:290:1: classBody returns [Clase unaClase] : '{' (c= classBodyDeclaration )* '}' ;
    public final Clase classBody() throws RecognitionException {
        Clase unaClase = null;

        int classBody_StartIndex = input.index();

        JavaParser.classBodyDeclaration_return c =null;



            ArrayList<ClassBodyDecl> clDecl = new ArrayList<ClassBodyDecl>();
            
            ArrayList<UsoId> lisUsosId = new ArrayList<>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return unaClase; }

            // Java.g:301:5: ( '{' (c= classBodyDeclaration )* '}' )
            // Java.g:301:9: '{' (c= classBodyDeclaration )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_classBody1663); if (state.failed) return unaClase;

            // Java.g:302:9: (c= classBodyDeclaration )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ABSTRACT||LA35_0==BOOLEAN||LA35_0==BYTE||LA35_0==CHAR||LA35_0==CLASS||LA35_0==DOUBLE||LA35_0==ENUM||LA35_0==FINAL||LA35_0==FLOAT||LA35_0==IDENTIFIER||(LA35_0 >= INT && LA35_0 <= INTERFACE)||LA35_0==LBRACE||LA35_0==LONG||LA35_0==LT||(LA35_0 >= MONKEYS_AT && LA35_0 <= NATIVE)||(LA35_0 >= PRIVATE && LA35_0 <= PUBLIC)||(LA35_0 >= SEMI && LA35_0 <= SHORT)||(LA35_0 >= STATIC && LA35_0 <= STRICTFP)||LA35_0==SYNCHRONIZED||LA35_0==TRANSIENT||(LA35_0 >= VOID && LA35_0 <= VOLATILE)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Java.g:302:10: c= classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody1679);
            	    c=classBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return unaClase;

            	    if ( state.backtracking==0 ) {clDecl.add(c.cBd);lisUsosId.addAll(c.lisUsosId);}

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_classBody1702); if (state.failed) return unaClase;

            }

            if ( state.backtracking==0 ) {
                unaClase = new Clase(clDecl);
                //analizo uso en variables globales
                unaClase.buscarUsoId(lisUsosId);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, classBody_StartIndex); }

        }
        return unaClase;
    }
    // $ANTLR end "classBody"



    // $ANTLR start "interfaceBody"
    // Java.g:307:1: interfaceBody : '{' ( interfaceBodyDeclaration )* '}' ;
    public final void interfaceBody() throws RecognitionException {
        int interfaceBody_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // Java.g:308:5: ( '{' ( interfaceBodyDeclaration )* '}' )
            // Java.g:308:9: '{' ( interfaceBodyDeclaration )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_interfaceBody1723); if (state.failed) return ;

            // Java.g:309:9: ( interfaceBodyDeclaration )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ABSTRACT||LA36_0==BOOLEAN||LA36_0==BYTE||LA36_0==CHAR||LA36_0==CLASS||LA36_0==DOUBLE||LA36_0==ENUM||LA36_0==FINAL||LA36_0==FLOAT||LA36_0==IDENTIFIER||(LA36_0 >= INT && LA36_0 <= INTERFACE)||LA36_0==LONG||LA36_0==LT||(LA36_0 >= MONKEYS_AT && LA36_0 <= NATIVE)||(LA36_0 >= PRIVATE && LA36_0 <= PUBLIC)||(LA36_0 >= SEMI && LA36_0 <= SHORT)||(LA36_0 >= STATIC && LA36_0 <= STRICTFP)||LA36_0==SYNCHRONIZED||LA36_0==TRANSIENT||(LA36_0 >= VOID && LA36_0 <= VOLATILE)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Java.g:309:10: interfaceBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody1735);
            	    interfaceBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_interfaceBody1757); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, interfaceBody_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "interfaceBody"


    public static class classBodyDeclaration_return extends ParserRuleReturnScope {
        public ClassBodyDecl cBd;
        public ArrayList<UsoId> lisUsosId;
    };


    // $ANTLR start "classBodyDeclaration"
    // Java.g:314:1: classBodyDeclaration returns [ClassBodyDecl cBd,ArrayList<UsoId> lisUsosId] : ( ';' | ( 'static' )? block |memb= memberDecl );
    public final JavaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        JavaParser.classBodyDeclaration_return retval = new JavaParser.classBodyDeclaration_return();
        retval.start = input.LT(1);

        int classBodyDeclaration_StartIndex = input.index();

        JavaParser.memberDecl_return memb =null;



            retval.cBd = new ClassBodyDecl();
            retval.lisUsosId = new ArrayList<UsoId>(); 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Java.g:319:5: ( ';' | ( 'static' )? block |memb= memberDecl )
            int alt38=3;
            switch ( input.LA(1) ) {
            case SEMI:
                {
                alt38=1;
                }
                break;
            case STATIC:
                {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==LBRACE) ) {
                    alt38=2;
                }
                else if ( (LA38_2==ABSTRACT||LA38_2==BOOLEAN||LA38_2==BYTE||LA38_2==CHAR||LA38_2==CLASS||LA38_2==DOUBLE||LA38_2==ENUM||LA38_2==FINAL||LA38_2==FLOAT||LA38_2==IDENTIFIER||(LA38_2 >= INT && LA38_2 <= INTERFACE)||LA38_2==LONG||LA38_2==LT||(LA38_2 >= MONKEYS_AT && LA38_2 <= NATIVE)||(LA38_2 >= PRIVATE && LA38_2 <= PUBLIC)||LA38_2==SHORT||(LA38_2 >= STATIC && LA38_2 <= STRICTFP)||LA38_2==SYNCHRONIZED||LA38_2==TRANSIENT||(LA38_2 >= VOID && LA38_2 <= VOLATILE)) ) {
                    alt38=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;

                }
                }
                break;
            case LBRACE:
                {
                alt38=2;
                }
                break;
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case DOUBLE:
            case ENUM:
            case FINAL:
            case FLOAT:
            case IDENTIFIER:
            case INT:
            case INTERFACE:
            case LONG:
            case LT:
            case MONKEYS_AT:
            case NATIVE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STRICTFP:
            case SYNCHRONIZED:
            case TRANSIENT:
            case VOID:
            case VOLATILE:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // Java.g:319:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_classBodyDeclaration1784); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Java.g:320:9: ( 'static' )? block
                    {
                    // Java.g:320:9: ( 'static' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==STATIC) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // Java.g:320:10: 'static'
                            {
                            match(input,STATIC,FOLLOW_STATIC_in_classBodyDeclaration1795); if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_classBodyDeclaration1817);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Java.g:323:9: memb= memberDecl
                    {
                    pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration1831);
                    memb=memberDecl();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.cBd = memb.cBd;retval.lisUsosId = memb.lisUsosId;}

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, classBodyDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classBodyDeclaration"


    public static class memberDecl_return extends ParserRuleReturnScope {
        public ClassBodyDecl cBd;
        public ArrayList<UsoId> lisUsosId;
    };


    // $ANTLR start "memberDecl"
    // Java.g:326:1: memberDecl returns [ClassBodyDecl cBd,ArrayList<UsoId> lisUsosId] : (f1= fieldDeclaration |m1= methodDeclaration | classDeclaration | interfaceDeclaration );
    public final JavaParser.memberDecl_return memberDecl() throws RecognitionException {
        JavaParser.memberDecl_return retval = new JavaParser.memberDecl_return();
        retval.start = input.LT(1);

        int memberDecl_StartIndex = input.index();

        Map<String,Declaracion> f1 =null;

        JavaParser.methodDeclaration_return m1 =null;


           
            retval.cBd = new ClassBodyDecl();
            retval.lisUsosId = new ArrayList<UsoId>(); 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Java.g:332:5: (f1= fieldDeclaration |m1= methodDeclaration | classDeclaration | interfaceDeclaration )
            int alt39=4;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA39_1 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }
                }
                break;
            case PUBLIC:
                {
                int LA39_2 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;

                }
                }
                break;
            case PROTECTED:
                {
                int LA39_3 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 3, input);

                    throw nvae;

                }
                }
                break;
            case PRIVATE:
                {
                int LA39_4 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 4, input);

                    throw nvae;

                }
                }
                break;
            case STATIC:
                {
                int LA39_5 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 5, input);

                    throw nvae;

                }
                }
                break;
            case ABSTRACT:
                {
                int LA39_6 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 6, input);

                    throw nvae;

                }
                }
                break;
            case FINAL:
                {
                int LA39_7 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 7, input);

                    throw nvae;

                }
                }
                break;
            case NATIVE:
                {
                int LA39_8 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 8, input);

                    throw nvae;

                }
                }
                break;
            case SYNCHRONIZED:
                {
                int LA39_9 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRANSIENT:
                {
                int LA39_10 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 10, input);

                    throw nvae;

                }
                }
                break;
            case VOLATILE:
                {
                int LA39_11 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 11, input);

                    throw nvae;

                }
                }
                break;
            case STRICTFP:
                {
                int LA39_12 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else if ( (synpred54_Java()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 12, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA39_13 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 13, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                int LA39_14 = input.LA(2);

                if ( (synpred52_Java()) ) {
                    alt39=1;
                }
                else if ( (synpred53_Java()) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 14, input);

                    throw nvae;

                }
                }
                break;
            case LT:
            case VOID:
                {
                alt39=2;
                }
                break;
            case CLASS:
            case ENUM:
                {
                alt39=3;
                }
                break;
            case INTERFACE:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // Java.g:332:10: f1= fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDecl1866);
                    f1=fieldDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.cBd.setLisDecl(f1);}

                    }
                    break;
                case 2 :
                    // Java.g:333:10: m1= methodDeclaration
                    {
                    pushFollow(FOLLOW_methodDeclaration_in_memberDecl1883);
                    m1=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.cBd.setMe(m1.me);retval.cBd.setLineaMetodo(m1.lineaMetodo);retval.lisUsosId = m1.lisUsosId;}

                    }
                    break;
                case 3 :
                    // Java.g:334:10: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_memberDecl1896);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Java.g:335:10: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_memberDecl1907);
                    interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, memberDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "memberDecl"


    public static class methodDeclaration_return extends ParserRuleReturnScope {
        public Metodo me;
        public int lineaMetodo;
        public ArrayList<UsoId> lisUsosId;
    };


    // $ANTLR start "methodDeclaration"
    // Java.g:339:1: methodDeclaration returns [Metodo me, int lineaMetodo,ArrayList<UsoId> lisUsosId] : (mo2= modifiers ( typeParameters )? Id1= IDENTIFIER f1= formalParameters ( 'throws' qualifiedNameList )? '{' (ex1= explicitConstructorInvocation )? (b1= blockStatement )* '}' |mo1= modifiers ( typeParameters )? ( type | 'void' ) Id2= IDENTIFIER f2= formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? (b2= block | ';' ) );
    public final JavaParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        JavaParser.methodDeclaration_return retval = new JavaParser.methodDeclaration_return();
        retval.start = input.LT(1);

        int methodDeclaration_StartIndex = input.index();

        Token Id1=null;
        Token Id2=null;
        String mo2 =null;

        Map<String,Parametro> f1 =null;

        ArrayList<UsoId> ex1 =null;

        JavaParser.blockStatement_return b1 =null;

        String mo1 =null;

        Map<String,Parametro> f2 =null;

        JavaParser.block_return b2 =null;

        JavaParser.type_return type1 =null;



            retval.me = new Metodo();
            String mod = new String();
            String tipo = new String();
            Map<String,Declaracion> lisDeclme = new HashMap<String,Declaracion>(); //Para hacer el merge con la listas de decl del constructor
            retval.lisUsosId = new ArrayList<UsoId>();    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // Java.g:352:5: (mo2= modifiers ( typeParameters )? Id1= IDENTIFIER f1= formalParameters ( 'throws' qualifiedNameList )? '{' (ex1= explicitConstructorInvocation )? (b1= blockStatement )* '}' |mo1= modifiers ( typeParameters )? ( type | 'void' ) Id2= IDENTIFIER f2= formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? (b2= block | ';' ) )
            int alt49=2;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA49_1 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;

                }
                }
                break;
            case PUBLIC:
                {
                int LA49_2 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;

                }
                }
                break;
            case PROTECTED:
                {
                int LA49_3 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    throw nvae;

                }
                }
                break;
            case PRIVATE:
                {
                int LA49_4 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 4, input);

                    throw nvae;

                }
                }
                break;
            case STATIC:
                {
                int LA49_5 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 5, input);

                    throw nvae;

                }
                }
                break;
            case ABSTRACT:
                {
                int LA49_6 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 6, input);

                    throw nvae;

                }
                }
                break;
            case FINAL:
                {
                int LA49_7 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 7, input);

                    throw nvae;

                }
                }
                break;
            case NATIVE:
                {
                int LA49_8 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 8, input);

                    throw nvae;

                }
                }
                break;
            case SYNCHRONIZED:
                {
                int LA49_9 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRANSIENT:
                {
                int LA49_10 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 10, input);

                    throw nvae;

                }
                }
                break;
            case VOLATILE:
                {
                int LA49_11 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 11, input);

                    throw nvae;

                }
                }
                break;
            case STRICTFP:
                {
                int LA49_12 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 12, input);

                    throw nvae;

                }
                }
                break;
            case LT:
                {
                int LA49_13 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 13, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA49_14 = input.LA(2);

                if ( (synpred59_Java()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 14, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
            case VOID:
                {
                alt49=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // Java.g:354:10: mo2= modifiers ( typeParameters )? Id1= IDENTIFIER f1= formalParameters ( 'throws' qualifiedNameList )? '{' (ex1= explicitConstructorInvocation )? (b1= blockStatement )* '}'
                    {
                    pushFollow(FOLLOW_modifiers_in_methodDeclaration1960);
                    mo2=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {mod = mo2;tipo="";}

                    // Java.g:355:9: ( typeParameters )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==LT) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // Java.g:355:10: typeParameters
                            {
                            pushFollow(FOLLOW_typeParameters_in_methodDeclaration1973);
                            typeParameters();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    Id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration1998); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.me = new Metodo(mod,tipo,new Id((Id1!=null?Id1.getText():null),Id1.getLine()));retval.lineaMetodo =Id1.getLine();}

                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration2014);
                    f1=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.me.addListParam(f1);}

                    // Java.g:359:9: ( 'throws' qualifiedNameList )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==THROWS) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // Java.g:359:10: 'throws' qualifiedNameList
                            {
                            match(input,THROWS,FOLLOW_THROWS_in_methodDeclaration2027); if (state.failed) return retval;

                            pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaration2029);
                            qualifiedNameList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,LBRACE,FOLLOW_LBRACE_in_methodDeclaration2050); if (state.failed) return retval;

                    // Java.g:362:9: (ex1= explicitConstructorInvocation )?
                    int alt42=2;
                    switch ( input.LA(1) ) {
                        case LT:
                            {
                            alt42=1;
                            }
                            break;
                        case THIS:
                            {
                            int LA42_2 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case LPAREN:
                            {
                            int LA42_3 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case SUPER:
                            {
                            int LA42_4 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case IDENTIFIER:
                            {
                            int LA42_5 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case INTLITERAL:
                            {
                            int LA42_6 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case LONGLITERAL:
                            {
                            int LA42_7 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case FLOATLITERAL:
                            {
                            int LA42_8 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case DOUBLELITERAL:
                            {
                            int LA42_9 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case CHARLITERAL:
                            {
                            int LA42_10 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case STRINGLITERAL:
                            {
                            int LA42_11 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case TRUE:
                            {
                            int LA42_12 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case FALSE:
                            {
                            int LA42_13 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case NULL:
                            {
                            int LA42_14 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case NEW:
                            {
                            int LA42_15 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case BOOLEAN:
                        case BYTE:
                        case CHAR:
                        case DOUBLE:
                        case FLOAT:
                        case INT:
                        case LONG:
                        case SHORT:
                            {
                            int LA42_16 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                        case VOID:
                            {
                            int LA42_17 = input.LA(2);

                            if ( (synpred57_Java()) ) {
                                alt42=1;
                            }
                            }
                            break;
                    }

                    switch (alt42) {
                        case 1 :
                            // Java.g:362:10: ex1= explicitConstructorInvocation
                            {
                            pushFollow(FOLLOW_explicitConstructorInvocation_in_methodDeclaration2066);
                            ex1=explicitConstructorInvocation();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) {retval.lisUsosId.addAll(ex1);}

                            }
                            break;

                    }


                    // Java.g:364:9: (b1= blockStatement )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==ABSTRACT||(LA43_0 >= ASSERT && LA43_0 <= BANG)||(LA43_0 >= BOOLEAN && LA43_0 <= BYTE)||(LA43_0 >= CHAR && LA43_0 <= CLASS)||LA43_0==CONTINUE||LA43_0==DO||(LA43_0 >= DOUBLE && LA43_0 <= DOUBLELITERAL)||LA43_0==ENUM||(LA43_0 >= FALSE && LA43_0 <= FINAL)||(LA43_0 >= FLOAT && LA43_0 <= FOR)||(LA43_0 >= IDENTIFIER && LA43_0 <= IF)||(LA43_0 >= INT && LA43_0 <= INTLITERAL)||LA43_0==LBRACE||(LA43_0 >= LONG && LA43_0 <= LT)||(LA43_0 >= MONKEYS_AT && LA43_0 <= NULL)||LA43_0==PLUS||(LA43_0 >= PLUSPLUS && LA43_0 <= PUBLIC)||LA43_0==RETURN||(LA43_0 >= SEMI && LA43_0 <= SHORT)||(LA43_0 >= STATIC && LA43_0 <= SUB)||(LA43_0 >= SUBSUB && LA43_0 <= SYNCHRONIZED)||(LA43_0 >= THIS && LA43_0 <= THROW)||(LA43_0 >= TILDE && LA43_0 <= WHILE)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // Java.g:364:10: b1= blockStatement
                    	    {
                    	    pushFollow(FOLLOW_blockStatement_in_methodDeclaration2094);
                    	    b1=blockStatement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) {lisDeclme.putAll(b1.lisDecl);retval.lisUsosId.addAll(b1.lisUsosId);}

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {retval.me.addListDecl(lisDeclme);}

                    match(input,RBRACE,FOLLOW_RBRACE_in_methodDeclaration2119); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Java.g:367:9: mo1= modifiers ( typeParameters )? ( type | 'void' ) Id2= IDENTIFIER f2= formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? (b2= block | ';' )
                    {
                    pushFollow(FOLLOW_modifiers_in_methodDeclaration2249);
                    mo1=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {mod = mo1;}

                    // Java.g:368:9: ( typeParameters )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==LT) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // Java.g:368:10: typeParameters
                            {
                            pushFollow(FOLLOW_typeParameters_in_methodDeclaration2262);
                            typeParameters();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    // Java.g:370:9: ( type | 'void' )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==BOOLEAN||LA45_0==BYTE||LA45_0==CHAR||LA45_0==DOUBLE||LA45_0==FLOAT||LA45_0==IDENTIFIER||LA45_0==INT||LA45_0==LONG||LA45_0==SHORT) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==VOID) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;

                    }
                    switch (alt45) {
                        case 1 :
                            // Java.g:370:10: type
                            {
                            pushFollow(FOLLOW_type_in_methodDeclaration2284);
                            type1=type();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) {tipo = (type1!=null?input.toString(type1.start,type1.stop):null);}

                            }
                            break;
                        case 2 :
                            // Java.g:371:13: 'void'
                            {
                            match(input,VOID,FOLLOW_VOID_in_methodDeclaration2300); if (state.failed) return retval;

                            if ( state.backtracking==0 ) {tipo = "void";}

                            }
                            break;

                    }


                    Id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration2326); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.me = new Metodo(mod,tipo,new Id((Id2!=null?Id2.getText():null),Id2.getLine()));retval.lineaMetodo =Id2.getLine();}

                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration2342);
                    f2=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.me.addListParam(f2);}

                    // Java.g:375:9: ( '[' ']' )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==LBRACKET) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // Java.g:375:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_methodDeclaration2355); if (state.failed) return retval;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_methodDeclaration2357); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    // Java.g:377:9: ( 'throws' qualifiedNameList )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==THROWS) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // Java.g:377:10: 'throws' qualifiedNameList
                            {
                            match(input,THROWS,FOLLOW_THROWS_in_methodDeclaration2379); if (state.failed) return retval;

                            pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaration2381);
                            qualifiedNameList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    // Java.g:379:9: (b2= block | ';' )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==LBRACE) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==SEMI) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;

                    }
                    switch (alt48) {
                        case 1 :
                            // Java.g:380:12: b2= block
                            {
                            pushFollow(FOLLOW_block_in_methodDeclaration2439);
                            b2=block();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) {retval.lisUsosId.addAll(b2.lisUsosId);retval.me.addListDecl(b2.lisDecl);}

                            }
                            break;
                        case 2 :
                            // Java.g:381:13: ';'
                            {
                            match(input,SEMI,FOLLOW_SEMI_in_methodDeclaration2455); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {//elimino los elementos ya analizados el resto sube para su analisis en las declaraciones globales

            retval.lisUsosId = retval.me.buscarUsoIdDec(retval.lisUsosId);retval.lisUsosId = retval.me.buscarUsoIdPar(retval.lisUsosId);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, methodDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"



    // $ANTLR start "fieldDeclaration"
    // Java.g:386:1: fieldDeclaration returns [Map<String,Declaracion> lisDecl] : mo1= modifiers type v1= variableDeclarator ( ',' v2= variableDeclarator )* ';' ;
    public final Map<String,Declaracion> fieldDeclaration() throws RecognitionException {
        Map<String,Declaracion> lisDecl = null;

        int fieldDeclaration_StartIndex = input.index();

        String mo1 =null;

        Id v1 =null;

        Id v2 =null;

        JavaParser.type_return type2 =null;



            lisDecl = new HashMap<String,Declaracion>();
            String mod = new String();
            String tipo = new String();    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return lisDecl; }

            // Java.g:392:5: (mo1= modifiers type v1= variableDeclarator ( ',' v2= variableDeclarator )* ';' )
            // Java.g:393:9: mo1= modifiers type v1= variableDeclarator ( ',' v2= variableDeclarator )* ';'
            {
            pushFollow(FOLLOW_modifiers_in_fieldDeclaration2642);
            mo1=modifiers();

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {mod = mo1;}

            pushFollow(FOLLOW_type_in_fieldDeclaration2654);
            type2=type();

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {tipo = (type2!=null?input.toString(type2.start,type2.stop):null);}

            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration2677);
            v1=variableDeclarator();

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {lisDecl.put(v1.getNomID(),new Declaracion(mod,tipo,v1));}

            // Java.g:396:9: ( ',' v2= variableDeclarator )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Java.g:396:10: ',' v2= variableDeclarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_fieldDeclaration2690); if (state.failed) return lisDecl;

            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration2696);
            	    v2=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return lisDecl;

            	    if ( state.backtracking==0 ) {lisDecl.put(v2.getNomID(),new Declaracion(mod,tipo,v2));}

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_fieldDeclaration2719); if (state.failed) return lisDecl;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, fieldDeclaration_StartIndex); }

        }
        return lisDecl;
    }
    // $ANTLR end "fieldDeclaration"



    // $ANTLR start "variableDeclarator"
    // Java.g:401:1: variableDeclarator returns [Id id] : IDENTIFIER ( '[' ']' )* ( '=' variableInitializer )? ;
    public final Id variableDeclarator() throws RecognitionException {
        Id id = null;

        int variableDeclarator_StartIndex = input.index();

        Token IDENTIFIER3=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return id; }

            // Java.g:403:5: ( IDENTIFIER ( '[' ']' )* ( '=' variableInitializer )? )
            // Java.g:403:9: IDENTIFIER ( '[' ']' )* ( '=' variableInitializer )?
            {
            IDENTIFIER3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclarator2743); if (state.failed) return id;

            if ( state.backtracking==0 ) {id = new Id((IDENTIFIER3!=null?IDENTIFIER3.getText():null),IDENTIFIER3.getLine());}

            // Java.g:404:9: ( '[' ']' )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==LBRACKET) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Java.g:404:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_variableDeclarator2756); if (state.failed) return id;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_variableDeclarator2758); if (state.failed) return id;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            // Java.g:406:9: ( '=' variableInitializer )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EQ) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Java.g:406:10: '=' variableInitializer
                    {
                    match(input,EQ,FOLLOW_EQ_in_variableDeclarator2780); if (state.failed) return id;

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator2782);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return id;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, variableDeclarator_StartIndex); }

        }
        return id;
    }
    // $ANTLR end "variableDeclarator"



    // $ANTLR start "interfaceBodyDeclaration"
    // Java.g:413:1: interfaceBodyDeclaration : ( interfaceFieldDeclaration | interfaceMethodDeclaration | interfaceDeclaration | classDeclaration | ';' );
    public final void interfaceBodyDeclaration() throws RecognitionException {
        int interfaceBodyDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // Java.g:414:5: ( interfaceFieldDeclaration | interfaceMethodDeclaration | interfaceDeclaration | classDeclaration | ';' )
            int alt53=5;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA53_1 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
                }
                break;
            case PUBLIC:
                {
                int LA53_2 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;

                }
                }
                break;
            case PROTECTED:
                {
                int LA53_3 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 3, input);

                    throw nvae;

                }
                }
                break;
            case PRIVATE:
                {
                int LA53_4 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 4, input);

                    throw nvae;

                }
                }
                break;
            case STATIC:
                {
                int LA53_5 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 5, input);

                    throw nvae;

                }
                }
                break;
            case ABSTRACT:
                {
                int LA53_6 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 6, input);

                    throw nvae;

                }
                }
                break;
            case FINAL:
                {
                int LA53_7 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 7, input);

                    throw nvae;

                }
                }
                break;
            case NATIVE:
                {
                int LA53_8 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 8, input);

                    throw nvae;

                }
                }
                break;
            case SYNCHRONIZED:
                {
                int LA53_9 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRANSIENT:
                {
                int LA53_10 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 10, input);

                    throw nvae;

                }
                }
                break;
            case VOLATILE:
                {
                int LA53_11 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 11, input);

                    throw nvae;

                }
                }
                break;
            case STRICTFP:
                {
                int LA53_12 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else if ( (synpred70_Java()) ) {
                    alt53=3;
                }
                else if ( (synpred71_Java()) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 12, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA53_13 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 13, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                int LA53_14 = input.LA(2);

                if ( (synpred68_Java()) ) {
                    alt53=1;
                }
                else if ( (synpred69_Java()) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 14, input);

                    throw nvae;

                }
                }
                break;
            case LT:
            case VOID:
                {
                alt53=2;
                }
                break;
            case INTERFACE:
                {
                alt53=3;
                }
                break;
            case CLASS:
            case ENUM:
                {
                alt53=4;
                }
                break;
            case SEMI:
                {
                alt53=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // Java.g:415:9: interfaceFieldDeclaration
                    {
                    pushFollow(FOLLOW_interfaceFieldDeclaration_in_interfaceBodyDeclaration2821);
                    interfaceFieldDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:416:9: interfaceMethodDeclaration
                    {
                    pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDeclaration2831);
                    interfaceMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:417:9: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_interfaceBodyDeclaration2841);
                    interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Java.g:418:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_interfaceBodyDeclaration2851);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Java.g:419:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_interfaceBodyDeclaration2861); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, interfaceBodyDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "interfaceBodyDeclaration"



    // $ANTLR start "interfaceMethodDeclaration"
    // Java.g:422:1: interfaceMethodDeclaration : modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' ;
    public final void interfaceMethodDeclaration() throws RecognitionException {
        int interfaceMethodDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }

            // Java.g:423:5: ( modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' )
            // Java.g:423:9: modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';'
            {
            pushFollow(FOLLOW_modifiers_in_interfaceMethodDeclaration2881);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:424:9: ( typeParameters )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Java.g:424:10: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_interfaceMethodDeclaration2892);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:426:9: ( type | 'void' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==BOOLEAN||LA55_0==BYTE||LA55_0==CHAR||LA55_0==DOUBLE||LA55_0==FLOAT||LA55_0==IDENTIFIER||LA55_0==INT||LA55_0==LONG||LA55_0==SHORT) ) {
                alt55=1;
            }
            else if ( (LA55_0==VOID) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // Java.g:426:10: type
                    {
                    pushFollow(FOLLOW_type_in_interfaceMethodDeclaration2914);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:427:10: 'void'
                    {
                    match(input,VOID,FOLLOW_VOID_in_interfaceMethodDeclaration2925); if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interfaceMethodDeclaration2945); if (state.failed) return ;

            pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaration2955);
            formalParameters();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:431:9: ( '[' ']' )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==LBRACKET) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Java.g:431:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_interfaceMethodDeclaration2966); if (state.failed) return ;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_interfaceMethodDeclaration2968); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            // Java.g:433:9: ( 'throws' qualifiedNameList )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==THROWS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // Java.g:433:10: 'throws' qualifiedNameList
                    {
                    match(input,THROWS,FOLLOW_THROWS_in_interfaceMethodDeclaration2990); if (state.failed) return ;

                    pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaration2992);
                    qualifiedNameList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,SEMI,FOLLOW_SEMI_in_interfaceMethodDeclaration3005); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, interfaceMethodDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "interfaceMethodDeclaration"



    // $ANTLR start "interfaceFieldDeclaration"
    // Java.g:442:1: interfaceFieldDeclaration : modifiers type variableDeclarator ( ',' variableDeclarator )* ';' ;
    public final void interfaceFieldDeclaration() throws RecognitionException {
        int interfaceFieldDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }

            // Java.g:443:5: ( modifiers type variableDeclarator ( ',' variableDeclarator )* ';' )
            // Java.g:443:9: modifiers type variableDeclarator ( ',' variableDeclarator )* ';'
            {
            pushFollow(FOLLOW_modifiers_in_interfaceFieldDeclaration3027);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_interfaceFieldDeclaration3029);
            type();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDeclarator_in_interfaceFieldDeclaration3031);
            variableDeclarator();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:444:9: ( ',' variableDeclarator )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==COMMA) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // Java.g:444:10: ',' variableDeclarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_interfaceFieldDeclaration3042); if (state.failed) return ;

            	    pushFollow(FOLLOW_variableDeclarator_in_interfaceFieldDeclaration3044);
            	    variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_interfaceFieldDeclaration3065); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, interfaceFieldDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "interfaceFieldDeclaration"


    public static class type_return extends ParserRuleReturnScope {
        public String tip;
    };


    // $ANTLR start "type"
    // Java.g:450:1: type returns [String tip] : ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* );
    public final JavaParser.type_return type() throws RecognitionException {
        JavaParser.type_return retval = new JavaParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        JavaParser.primitiveType_return primitiveType4 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Java.g:451:5: ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENTIFIER) ) {
                alt61=1;
            }
            else if ( (LA61_0==BOOLEAN||LA61_0==BYTE||LA61_0==CHAR||LA61_0==DOUBLE||LA61_0==FLOAT||LA61_0==INT||LA61_0==LONG||LA61_0==SHORT) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // Java.g:451:9: classOrInterfaceType ( '[' ']' )*
                    {
                    pushFollow(FOLLOW_classOrInterfaceType_in_type3089);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;

                    // Java.g:452:9: ( '[' ']' )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==LBRACKET) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // Java.g:452:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_type3100); if (state.failed) return retval;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_type3102); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Java.g:454:9: primitiveType ( '[' ']' )*
                    {
                    pushFollow(FOLLOW_primitiveType_in_type3123);
                    primitiveType4=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.tip = (primitiveType4!=null?input.toString(primitiveType4.start,primitiveType4.stop):null);}

                    // Java.g:455:9: ( '[' ']' )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==LBRACKET) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // Java.g:455:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_type3136); if (state.failed) return retval;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_type3138); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, type_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type"



    // $ANTLR start "classOrInterfaceType"
    // Java.g:460:1: classOrInterfaceType : IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )* ;
    public final void classOrInterfaceType() throws RecognitionException {
        int classOrInterfaceType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }

            // Java.g:461:5: ( IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )* )
            // Java.g:461:9: IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )*
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterfaceType3170); if (state.failed) return ;

            // Java.g:462:9: ( typeArguments )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==LT) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==BOOLEAN||LA62_1==BYTE||LA62_1==CHAR||LA62_1==DOUBLE||LA62_1==FLOAT||LA62_1==IDENTIFIER||LA62_1==INT||LA62_1==LONG||LA62_1==QUES||LA62_1==SHORT) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // Java.g:462:10: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType3181);
                    typeArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:464:9: ( '.' IDENTIFIER ( typeArguments )? )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==DOT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // Java.g:464:10: '.' IDENTIFIER ( typeArguments )?
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_classOrInterfaceType3203); if (state.failed) return ;

            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterfaceType3205); if (state.failed) return ;

            	    // Java.g:465:13: ( typeArguments )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==LT) ) {
            	        int LA63_1 = input.LA(2);

            	        if ( (LA63_1==BOOLEAN||LA63_1==BYTE||LA63_1==CHAR||LA63_1==DOUBLE||LA63_1==FLOAT||LA63_1==IDENTIFIER||LA63_1==INT||LA63_1==LONG||LA63_1==QUES||LA63_1==SHORT) ) {
            	            alt63=1;
            	        }
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // Java.g:465:14: typeArguments
            	            {
            	            pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType3220);
            	            typeArguments();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, classOrInterfaceType_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "classOrInterfaceType"


    public static class primitiveType_return extends ParserRuleReturnScope {
        public String primtype;
    };


    // $ANTLR start "primitiveType"
    // Java.g:470:1: primitiveType returns [String primtype] : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
    public final JavaParser.primitiveType_return primitiveType() throws RecognitionException {
        JavaParser.primitiveType_return retval = new JavaParser.primitiveType_return();
        retval.start = input.LT(1);

        int primitiveType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Java.g:471:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
            // Java.g:
            {
            if ( input.LA(1)==BOOLEAN||input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==DOUBLE||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, primitiveType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primitiveType"



    // $ANTLR start "typeArguments"
    // Java.g:481:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
    public final void typeArguments() throws RecognitionException {
        int typeArguments_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }

            // Java.g:482:5: ( '<' typeArgument ( ',' typeArgument )* '>' )
            // Java.g:482:9: '<' typeArgument ( ',' typeArgument )* '>'
            {
            match(input,LT,FOLLOW_LT_in_typeArguments3361); if (state.failed) return ;

            pushFollow(FOLLOW_typeArgument_in_typeArguments3363);
            typeArgument();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:483:9: ( ',' typeArgument )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==COMMA) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // Java.g:483:10: ',' typeArgument
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeArguments3374); if (state.failed) return ;

            	    pushFollow(FOLLOW_typeArgument_in_typeArguments3376);
            	    typeArgument();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            match(input,GT,FOLLOW_GT_in_typeArguments3398); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, typeArguments_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeArguments"



    // $ANTLR start "typeArgument"
    // Java.g:488:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
    public final void typeArgument() throws RecognitionException {
        int typeArgument_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }

            // Java.g:489:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==BOOLEAN||LA67_0==BYTE||LA67_0==CHAR||LA67_0==DOUBLE||LA67_0==FLOAT||LA67_0==IDENTIFIER||LA67_0==INT||LA67_0==LONG||LA67_0==SHORT) ) {
                alt67=1;
            }
            else if ( (LA67_0==QUES) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }
            switch (alt67) {
                case 1 :
                    // Java.g:489:9: type
                    {
                    pushFollow(FOLLOW_type_in_typeArgument3418);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:490:9: '?' ( ( 'extends' | 'super' ) type )?
                    {
                    match(input,QUES,FOLLOW_QUES_in_typeArgument3428); if (state.failed) return ;

                    // Java.g:491:9: ( ( 'extends' | 'super' ) type )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==EXTENDS||LA66_0==SUPER) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Java.g:492:13: ( 'extends' | 'super' ) type
                            {
                            if ( input.LA(1)==EXTENDS||input.LA(1)==SUPER ) {
                                input.consume();
                                state.errorRecovery=false;
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            pushFollow(FOLLOW_type_in_typeArgument3496);
                            type();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, typeArgument_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeArgument"



    // $ANTLR start "qualifiedNameList"
    // Java.g:499:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
    public final void qualifiedNameList() throws RecognitionException {
        int qualifiedNameList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }

            // Java.g:500:5: ( qualifiedName ( ',' qualifiedName )* )
            // Java.g:500:9: qualifiedName ( ',' qualifiedName )*
            {
            pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList3527);
            qualifiedName();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:501:9: ( ',' qualifiedName )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // Java.g:501:10: ',' qualifiedName
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_qualifiedNameList3538); if (state.failed) return ;

            	    pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList3540);
            	    qualifiedName();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, qualifiedNameList_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "qualifiedNameList"



    // $ANTLR start "formalParameters"
    // Java.g:505:1: formalParameters returns [Map<String,Parametro> lisParam] : '(' (f1= formalParameterDecls )? ')' ;
    public final Map<String,Parametro> formalParameters() throws RecognitionException {
        Map<String,Parametro> lisParam = null;

        int formalParameters_StartIndex = input.index();

        Map<String,Parametro> f1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return lisParam; }

            // Java.g:506:5: ( '(' (f1= formalParameterDecls )? ')' )
            // Java.g:506:9: '(' (f1= formalParameterDecls )? ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameters3574); if (state.failed) return lisParam;

            // Java.g:507:9: (f1= formalParameterDecls )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==BOOLEAN||LA69_0==BYTE||LA69_0==CHAR||LA69_0==DOUBLE||LA69_0==FINAL||LA69_0==FLOAT||LA69_0==IDENTIFIER||LA69_0==INT||LA69_0==LONG||LA69_0==MONKEYS_AT||LA69_0==SHORT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // Java.g:507:10: f1= formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters3589);
                    f1=formalParameterDecls();

                    state._fsp--;
                    if (state.failed) return lisParam;

                    if ( state.backtracking==0 ) {lisParam = f1;}

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameters3613); if (state.failed) return lisParam;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, formalParameters_StartIndex); }

        }
        return lisParam;
    }
    // $ANTLR end "formalParameters"



    // $ANTLR start "formalParameterDecls"
    // Java.g:512:1: formalParameterDecls returns [Map<String,Parametro> lisParam] : ( ellipsisParameterDecl |p1= normalParameterDecl ( ',' p2= normalParameterDecl )* | ( normalParameterDecl ',' )+ ellipsisParameterDecl );
    public final Map<String,Parametro> formalParameterDecls() throws RecognitionException {
        Map<String,Parametro> lisParam = null;

        int formalParameterDecls_StartIndex = input.index();

        Parametro p1 =null;

        Parametro p2 =null;



            lisParam = new HashMap<String,Parametro>();    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return lisParam; }

            // Java.g:516:5: ( ellipsisParameterDecl |p1= normalParameterDecl ( ',' p2= normalParameterDecl )* | ( normalParameterDecl ',' )+ ellipsisParameterDecl )
            int alt72=3;
            switch ( input.LA(1) ) {
            case FINAL:
                {
                int LA72_1 = input.LA(2);

                if ( (synpred96_Java()) ) {
                    alt72=1;
                }
                else if ( (synpred98_Java()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisParam;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;

                }
                }
                break;
            case MONKEYS_AT:
                {
                int LA72_2 = input.LA(2);

                if ( (synpred96_Java()) ) {
                    alt72=1;
                }
                else if ( (synpred98_Java()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisParam;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 2, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA72_3 = input.LA(2);

                if ( (synpred96_Java()) ) {
                    alt72=1;
                }
                else if ( (synpred98_Java()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisParam;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 3, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                int LA72_4 = input.LA(2);

                if ( (synpred96_Java()) ) {
                    alt72=1;
                }
                else if ( (synpred98_Java()) ) {
                    alt72=2;
                }
                else if ( (true) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisParam;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return lisParam;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // Java.g:516:9: ellipsisParameterDecl
                    {
                    pushFollow(FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3640);
                    ellipsisParameterDecl();

                    state._fsp--;
                    if (state.failed) return lisParam;

                    }
                    break;
                case 2 :
                    // Java.g:518:8: p1= normalParameterDecl ( ',' p2= normalParameterDecl )*
                    {
                    pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3654);
                    p1=normalParameterDecl();

                    state._fsp--;
                    if (state.failed) return lisParam;

                    if ( state.backtracking==0 ) {lisParam.put(p1.getIdent().getNomID(),p1);}

                    // Java.g:519:9: ( ',' p2= normalParameterDecl )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==COMMA) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // Java.g:519:10: ',' p2= normalParameterDecl
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterDecls3667); if (state.failed) return lisParam;

                    	    pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3673);
                    	    p2=normalParameterDecl();

                    	    state._fsp--;
                    	    if (state.failed) return lisParam;

                    	    if ( state.backtracking==0 ) {lisParam.put(p2.getIdent().getNomID(),p2);}

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // Java.g:522:9: ( normalParameterDecl ',' )+ ellipsisParameterDecl
                    {
                    // Java.g:522:9: ( normalParameterDecl ',' )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        switch ( input.LA(1) ) {
                        case FINAL:
                            {
                            int LA71_1 = input.LA(2);

                            if ( (synpred99_Java()) ) {
                                alt71=1;
                            }


                            }
                            break;
                        case MONKEYS_AT:
                            {
                            int LA71_2 = input.LA(2);

                            if ( (synpred99_Java()) ) {
                                alt71=1;
                            }


                            }
                            break;
                        case IDENTIFIER:
                            {
                            int LA71_3 = input.LA(2);

                            if ( (synpred99_Java()) ) {
                                alt71=1;
                            }


                            }
                            break;
                        case BOOLEAN:
                        case BYTE:
                        case CHAR:
                        case DOUBLE:
                        case FLOAT:
                        case INT:
                        case LONG:
                        case SHORT:
                            {
                            int LA71_4 = input.LA(2);

                            if ( (synpred99_Java()) ) {
                                alt71=1;
                            }


                            }
                            break;

                        }

                        switch (alt71) {
                    	case 1 :
                    	    // Java.g:522:10: normalParameterDecl ','
                    	    {
                    	    pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3698);
                    	    normalParameterDecl();

                    	    state._fsp--;
                    	    if (state.failed) return lisParam;

                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterDecls3708); if (state.failed) return lisParam;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return lisParam;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);


                    pushFollow(FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3730);
                    ellipsisParameterDecl();

                    state._fsp--;
                    if (state.failed) return lisParam;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, formalParameterDecls_StartIndex); }

        }
        return lisParam;
    }
    // $ANTLR end "formalParameterDecls"



    // $ANTLR start "normalParameterDecl"
    // Java.g:528:1: normalParameterDecl returns [Parametro pa] : variableModifiers type IDENTIFIER ( '[' ']' )* ;
    public final Parametro normalParameterDecl() throws RecognitionException {
        Parametro pa = null;

        int normalParameterDecl_StartIndex = input.index();

        Token IDENTIFIER7=null;
        JavaParser.variableModifiers_return variableModifiers5 =null;

        JavaParser.type_return type6 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return pa; }

            // Java.g:529:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* )
            // Java.g:529:9: variableModifiers type IDENTIFIER ( '[' ']' )*
            {
            pushFollow(FOLLOW_variableModifiers_in_normalParameterDecl3753);
            variableModifiers5=variableModifiers();

            state._fsp--;
            if (state.failed) return pa;

            pushFollow(FOLLOW_type_in_normalParameterDecl3755);
            type6=type();

            state._fsp--;
            if (state.failed) return pa;

            IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalParameterDecl3757); if (state.failed) return pa;

            if ( state.backtracking==0 ) {pa = new Parametro((variableModifiers5!=null?input.toString(variableModifiers5.start,variableModifiers5.stop):null), (type6!=null?input.toString(type6.start,type6.stop):null), new Id((IDENTIFIER7!=null?IDENTIFIER7.getText():null),(IDENTIFIER7!=null?IDENTIFIER7.getLine():0)));}

            // Java.g:530:9: ( '[' ']' )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==LBRACKET) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // Java.g:530:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_normalParameterDecl3770); if (state.failed) return pa;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_normalParameterDecl3772); if (state.failed) return pa;

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, normalParameterDecl_StartIndex); }

        }
        return pa;
    }
    // $ANTLR end "normalParameterDecl"



    // $ANTLR start "ellipsisParameterDecl"
    // Java.g:534:1: ellipsisParameterDecl : variableModifiers type '...' IDENTIFIER ;
    public final void ellipsisParameterDecl() throws RecognitionException {
        int ellipsisParameterDecl_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }

            // Java.g:535:5: ( variableModifiers type '...' IDENTIFIER )
            // Java.g:535:9: variableModifiers type '...' IDENTIFIER
            {
            pushFollow(FOLLOW_variableModifiers_in_ellipsisParameterDecl3803);
            variableModifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_ellipsisParameterDecl3813);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_ellipsisParameterDecl3816); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ellipsisParameterDecl3826); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, ellipsisParameterDecl_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "ellipsisParameterDecl"



    // $ANTLR start "explicitConstructorInvocation"
    // Java.g:541:1: explicitConstructorInvocation returns [ArrayList<UsoId> lisUsosId] : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) a1= arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' a2= arguments ';' );
    public final ArrayList<UsoId> explicitConstructorInvocation() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int explicitConstructorInvocation_StartIndex = input.index();

        ArrayList<UsoId> a1 =null;

        ArrayList<UsoId> a2 =null;



            lisUsosId = new ArrayList<UsoId>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return lisUsosId; }

            // Java.g:545:5: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) a1= arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' a2= arguments ';' )
            int alt76=2;
            switch ( input.LA(1) ) {
            case LT:
                {
                alt76=1;
                }
                break;
            case THIS:
                {
                int LA76_2 = input.LA(2);

                if ( (synpred103_Java()) ) {
                    alt76=1;
                }
                else if ( (true) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 2, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CHARLITERAL:
            case DOUBLE:
            case DOUBLELITERAL:
            case FALSE:
            case FLOAT:
            case FLOATLITERAL:
            case IDENTIFIER:
            case INT:
            case INTLITERAL:
            case LONG:
            case LONGLITERAL:
            case LPAREN:
            case NEW:
            case NULL:
            case SHORT:
            case STRINGLITERAL:
            case TRUE:
            case VOID:
                {
                alt76=2;
                }
                break;
            case SUPER:
                {
                int LA76_4 = input.LA(2);

                if ( (synpred103_Java()) ) {
                    alt76=1;
                }
                else if ( (true) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // Java.g:545:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) a1= arguments ';'
                    {
                    // Java.g:545:9: ( nonWildcardTypeArguments )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==LT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // Java.g:545:10: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3855);
                            nonWildcardTypeArguments();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    if ( input.LA(1)==SUPER||input.LA(1)==THIS ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation3917);
                    a1=arguments();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId = a1;}

                    match(input,SEMI,FOLLOW_SEMI_in_explicitConstructorInvocation3921); if (state.failed) return lisUsosId;

                    }
                    break;
                case 2 :
                    // Java.g:552:9: primary '.' ( nonWildcardTypeArguments )? 'super' a2= arguments ';'
                    {
                    pushFollow(FOLLOW_primary_in_explicitConstructorInvocation3932);
                    primary();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,DOT,FOLLOW_DOT_in_explicitConstructorInvocation3942); if (state.failed) return lisUsosId;

                    // Java.g:554:9: ( nonWildcardTypeArguments )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==LT) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // Java.g:554:10: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3953);
                            nonWildcardTypeArguments();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation3974); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation3988);
                    a2=arguments();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId = a2;}

                    match(input,SEMI,FOLLOW_SEMI_in_explicitConstructorInvocation3991); if (state.failed) return lisUsosId;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, explicitConstructorInvocation_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "explicitConstructorInvocation"


    public static class qualifiedName_return extends ParserRuleReturnScope {
        public String paqName= "";
        public int paqLine;
    };


    // $ANTLR start "qualifiedName"
    // Java.g:560:1: qualifiedName returns [String paqName= \"\", int paqLine] : Id1= IDENTIFIER ( '.' Id2= IDENTIFIER )* ;
    public final JavaParser.qualifiedName_return qualifiedName() throws RecognitionException {
        JavaParser.qualifiedName_return retval = new JavaParser.qualifiedName_return();
        retval.start = input.LT(1);

        int qualifiedName_StartIndex = input.index();

        Token Id1=null;
        Token Id2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Java.g:561:5: (Id1= IDENTIFIER ( '.' Id2= IDENTIFIER )* )
            // Java.g:561:9: Id1= IDENTIFIER ( '.' Id2= IDENTIFIER )*
            {
            Id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedName4018); if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.paqName = (Id1!=null?Id1.getText():null); retval.paqLine = (Id1!=null?Id1.getLine():0);}

            // Java.g:562:9: ( '.' Id2= IDENTIFIER )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==DOT) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // Java.g:562:10: '.' Id2= IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_qualifiedName4032); if (state.failed) return retval;

            	    Id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedName4038); if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.paqName = retval.paqName + "." + (Id2!=null?Id2.getText():null);}

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, qualifiedName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "qualifiedName"



    // $ANTLR start "annotations"
    // Java.g:566:1: annotations : ( annotation )+ ;
    public final void annotations() throws RecognitionException {
        int annotations_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }

            // Java.g:567:5: ( ( annotation )+ )
            // Java.g:567:9: ( annotation )+
            {
            // Java.g:567:9: ( annotation )+
            int cnt78=0;
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==MONKEYS_AT) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // Java.g:567:10: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations4072);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt78 >= 1 ) break loop78;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, annotations_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotations"



    // $ANTLR start "annotation"
    // Java.g:575:1: annotation : '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )? ;
    public final void annotation() throws RecognitionException {
        int annotation_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }

            // Java.g:576:5: ( '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )? )
            // Java.g:576:9: '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )?
            {
            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotation4105); if (state.failed) return ;

            pushFollow(FOLLOW_qualifiedName_in_annotation4107);
            qualifiedName();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:577:9: ( '(' ( elementValuePairs | elementValue )? ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==LPAREN) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Java.g:577:13: '(' ( elementValuePairs | elementValue )? ')'
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_annotation4121); if (state.failed) return ;

                    // Java.g:578:19: ( elementValuePairs | elementValue )?
                    int alt79=3;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==IDENTIFIER) ) {
                        int LA79_1 = input.LA(2);

                        if ( (LA79_1==EQ) ) {
                            alt79=1;
                        }
                        else if ( ((LA79_1 >= AMP && LA79_1 <= AMPAMP)||(LA79_1 >= BANGEQ && LA79_1 <= BARBAR)||LA79_1==CARET||LA79_1==DOT||LA79_1==EQEQ||LA79_1==GT||LA79_1==INSTANCEOF||LA79_1==LBRACKET||(LA79_1 >= LPAREN && LA79_1 <= LT)||LA79_1==PERCENT||LA79_1==PLUS||LA79_1==PLUSPLUS||LA79_1==QUES||LA79_1==RPAREN||LA79_1==SLASH||LA79_1==STAR||LA79_1==SUB||LA79_1==SUBSUB) ) {
                            alt79=2;
                        }
                    }
                    else if ( (LA79_0==BANG||LA79_0==BOOLEAN||LA79_0==BYTE||(LA79_0 >= CHAR && LA79_0 <= CHARLITERAL)||(LA79_0 >= DOUBLE && LA79_0 <= DOUBLELITERAL)||LA79_0==FALSE||(LA79_0 >= FLOAT && LA79_0 <= FLOATLITERAL)||LA79_0==INT||LA79_0==INTLITERAL||LA79_0==LBRACE||(LA79_0 >= LONG && LA79_0 <= LPAREN)||LA79_0==MONKEYS_AT||(LA79_0 >= NEW && LA79_0 <= NULL)||LA79_0==PLUS||LA79_0==PLUSPLUS||LA79_0==SHORT||(LA79_0 >= STRINGLITERAL && LA79_0 <= SUB)||(LA79_0 >= SUBSUB && LA79_0 <= SUPER)||LA79_0==THIS||LA79_0==TILDE||LA79_0==TRUE||LA79_0==VOID) ) {
                        alt79=2;
                    }
                    switch (alt79) {
                        case 1 :
                            // Java.g:578:23: elementValuePairs
                            {
                            pushFollow(FOLLOW_elementValuePairs_in_annotation4148);
                            elementValuePairs();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // Java.g:579:23: elementValue
                            {
                            pushFollow(FOLLOW_elementValue_in_annotation4172);
                            elementValue();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_annotation4208); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, annotation_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotation"



    // $ANTLR start "elementValuePairs"
    // Java.g:585:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
    public final void elementValuePairs() throws RecognitionException {
        int elementValuePairs_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }

            // Java.g:586:5: ( elementValuePair ( ',' elementValuePair )* )
            // Java.g:586:9: elementValuePair ( ',' elementValuePair )*
            {
            pushFollow(FOLLOW_elementValuePair_in_elementValuePairs4240);
            elementValuePair();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:587:9: ( ',' elementValuePair )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // Java.g:587:10: ',' elementValuePair
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elementValuePairs4251); if (state.failed) return ;

            	    pushFollow(FOLLOW_elementValuePair_in_elementValuePairs4253);
            	    elementValuePair();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, elementValuePairs_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "elementValuePairs"



    // $ANTLR start "elementValuePair"
    // Java.g:591:1: elementValuePair : IDENTIFIER '=' elementValue ;
    public final void elementValuePair() throws RecognitionException {
        int elementValuePair_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }

            // Java.g:592:5: ( IDENTIFIER '=' elementValue )
            // Java.g:592:9: IDENTIFIER '=' elementValue
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_elementValuePair4284); if (state.failed) return ;

            match(input,EQ,FOLLOW_EQ_in_elementValuePair4286); if (state.failed) return ;

            pushFollow(FOLLOW_elementValue_in_elementValuePair4288);
            elementValue();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, elementValuePair_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "elementValuePair"



    // $ANTLR start "elementValue"
    // Java.g:595:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
    public final void elementValue() throws RecognitionException {
        int elementValue_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }

            // Java.g:596:5: ( conditionalExpression | annotation | elementValueArrayInitializer )
            int alt82=3;
            switch ( input.LA(1) ) {
            case BANG:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CHARLITERAL:
            case DOUBLE:
            case DOUBLELITERAL:
            case FALSE:
            case FLOAT:
            case FLOATLITERAL:
            case IDENTIFIER:
            case INT:
            case INTLITERAL:
            case LONG:
            case LONGLITERAL:
            case LPAREN:
            case NEW:
            case NULL:
            case PLUS:
            case PLUSPLUS:
            case SHORT:
            case STRINGLITERAL:
            case SUB:
            case SUBSUB:
            case SUPER:
            case THIS:
            case TILDE:
            case TRUE:
            case VOID:
                {
                alt82=1;
                }
                break;
            case MONKEYS_AT:
                {
                alt82=2;
                }
                break;
            case LBRACE:
                {
                alt82=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }

            switch (alt82) {
                case 1 :
                    // Java.g:596:9: conditionalExpression
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_elementValue4308);
                    conditionalExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:597:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_elementValue4318);
                    annotation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:598:9: elementValueArrayInitializer
                    {
                    pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue4328);
                    elementValueArrayInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, elementValue_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "elementValue"



    // $ANTLR start "elementValueArrayInitializer"
    // Java.g:601:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
    public final void elementValueArrayInitializer() throws RecognitionException {
        int elementValueArrayInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }

            // Java.g:602:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
            // Java.g:602:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_elementValueArrayInitializer4348); if (state.failed) return ;

            // Java.g:603:9: ( elementValue ( ',' elementValue )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==BANG||LA84_0==BOOLEAN||LA84_0==BYTE||(LA84_0 >= CHAR && LA84_0 <= CHARLITERAL)||(LA84_0 >= DOUBLE && LA84_0 <= DOUBLELITERAL)||LA84_0==FALSE||(LA84_0 >= FLOAT && LA84_0 <= FLOATLITERAL)||LA84_0==IDENTIFIER||LA84_0==INT||LA84_0==INTLITERAL||LA84_0==LBRACE||(LA84_0 >= LONG && LA84_0 <= LPAREN)||LA84_0==MONKEYS_AT||(LA84_0 >= NEW && LA84_0 <= NULL)||LA84_0==PLUS||LA84_0==PLUSPLUS||LA84_0==SHORT||(LA84_0 >= STRINGLITERAL && LA84_0 <= SUB)||(LA84_0 >= SUBSUB && LA84_0 <= SUPER)||LA84_0==THIS||LA84_0==TILDE||LA84_0==TRUE||LA84_0==VOID) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // Java.g:603:10: elementValue ( ',' elementValue )*
                    {
                    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer4359);
                    elementValue();

                    state._fsp--;
                    if (state.failed) return ;

                    // Java.g:604:13: ( ',' elementValue )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==COMMA) ) {
                            int LA83_1 = input.LA(2);

                            if ( (LA83_1==BANG||LA83_1==BOOLEAN||LA83_1==BYTE||(LA83_1 >= CHAR && LA83_1 <= CHARLITERAL)||(LA83_1 >= DOUBLE && LA83_1 <= DOUBLELITERAL)||LA83_1==FALSE||(LA83_1 >= FLOAT && LA83_1 <= FLOATLITERAL)||LA83_1==IDENTIFIER||LA83_1==INT||LA83_1==INTLITERAL||LA83_1==LBRACE||(LA83_1 >= LONG && LA83_1 <= LPAREN)||LA83_1==MONKEYS_AT||(LA83_1 >= NEW && LA83_1 <= NULL)||LA83_1==PLUS||LA83_1==PLUSPLUS||LA83_1==SHORT||(LA83_1 >= STRINGLITERAL && LA83_1 <= SUB)||(LA83_1 >= SUBSUB && LA83_1 <= SUPER)||LA83_1==THIS||LA83_1==TILDE||LA83_1==TRUE||LA83_1==VOID) ) {
                                alt83=1;
                            }


                        }


                        switch (alt83) {
                    	case 1 :
                    	    // Java.g:604:14: ',' elementValue
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_elementValueArrayInitializer4374); if (state.failed) return ;

                    	    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer4376);
                    	    elementValue();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }
                    break;

            }


            // Java.g:606:12: ( ',' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==COMMA) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Java.g:606:13: ','
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_elementValueArrayInitializer4405); if (state.failed) return ;

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_elementValueArrayInitializer4409); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, elementValueArrayInitializer_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "elementValueArrayInitializer"



    // $ANTLR start "annotationTypeDeclaration"
    // Java.g:613:1: annotationTypeDeclaration : modifiers '@' 'interface' IDENTIFIER annotationTypeBody ;
    public final void annotationTypeDeclaration() throws RecognitionException {
        int annotationTypeDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }

            // Java.g:614:5: ( modifiers '@' 'interface' IDENTIFIER annotationTypeBody )
            // Java.g:614:9: modifiers '@' 'interface' IDENTIFIER annotationTypeBody
            {
            pushFollow(FOLLOW_modifiers_in_annotationTypeDeclaration4432);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotationTypeDeclaration4434); if (state.failed) return ;

            match(input,INTERFACE,FOLLOW_INTERFACE_in_annotationTypeDeclaration4444); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationTypeDeclaration4454); if (state.failed) return ;

            pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration4464);
            annotationTypeBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, annotationTypeDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationTypeDeclaration"



    // $ANTLR start "annotationTypeBody"
    // Java.g:621:1: annotationTypeBody : '{' ( annotationTypeElementDeclaration )* '}' ;
    public final void annotationTypeBody() throws RecognitionException {
        int annotationTypeBody_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }

            // Java.g:622:5: ( '{' ( annotationTypeElementDeclaration )* '}' )
            // Java.g:622:9: '{' ( annotationTypeElementDeclaration )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_annotationTypeBody4485); if (state.failed) return ;

            // Java.g:623:9: ( annotationTypeElementDeclaration )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==ABSTRACT||LA86_0==BOOLEAN||LA86_0==BYTE||LA86_0==CHAR||LA86_0==CLASS||LA86_0==DOUBLE||LA86_0==ENUM||LA86_0==FINAL||LA86_0==FLOAT||LA86_0==IDENTIFIER||(LA86_0 >= INT && LA86_0 <= INTERFACE)||LA86_0==LONG||LA86_0==LT||(LA86_0 >= MONKEYS_AT && LA86_0 <= NATIVE)||(LA86_0 >= PRIVATE && LA86_0 <= PUBLIC)||(LA86_0 >= SEMI && LA86_0 <= SHORT)||(LA86_0 >= STATIC && LA86_0 <= STRICTFP)||LA86_0==SYNCHRONIZED||LA86_0==TRANSIENT||(LA86_0 >= VOID && LA86_0 <= VOLATILE)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // Java.g:623:10: annotationTypeElementDeclaration
            	    {
            	    pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody4497);
            	    annotationTypeElementDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_annotationTypeBody4519); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, annotationTypeBody_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationTypeBody"



    // $ANTLR start "annotationTypeElementDeclaration"
    // Java.g:631:1: annotationTypeElementDeclaration : ( annotationMethodDeclaration | interfaceFieldDeclaration | normalClassDeclaration | normalInterfaceDeclaration | enumDeclaration | annotationTypeDeclaration | ';' );
    public final void annotationTypeElementDeclaration() throws RecognitionException {
        int annotationTypeElementDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }

            // Java.g:632:5: ( annotationMethodDeclaration | interfaceFieldDeclaration | normalClassDeclaration | normalInterfaceDeclaration | enumDeclaration | annotationTypeDeclaration | ';' )
            int alt87=7;
            switch ( input.LA(1) ) {
            case MONKEYS_AT:
                {
                int LA87_1 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;

                }
                }
                break;
            case PUBLIC:
                {
                int LA87_2 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 2, input);

                    throw nvae;

                }
                }
                break;
            case PROTECTED:
                {
                int LA87_3 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 3, input);

                    throw nvae;

                }
                }
                break;
            case PRIVATE:
                {
                int LA87_4 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 4, input);

                    throw nvae;

                }
                }
                break;
            case STATIC:
                {
                int LA87_5 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 5, input);

                    throw nvae;

                }
                }
                break;
            case ABSTRACT:
                {
                int LA87_6 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 6, input);

                    throw nvae;

                }
                }
                break;
            case FINAL:
                {
                int LA87_7 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 7, input);

                    throw nvae;

                }
                }
                break;
            case NATIVE:
                {
                int LA87_8 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 8, input);

                    throw nvae;

                }
                }
                break;
            case SYNCHRONIZED:
                {
                int LA87_9 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRANSIENT:
                {
                int LA87_10 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 10, input);

                    throw nvae;

                }
                }
                break;
            case VOLATILE:
                {
                int LA87_11 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 11, input);

                    throw nvae;

                }
                }
                break;
            case STRICTFP:
                {
                int LA87_12 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else if ( (synpred119_Java()) ) {
                    alt87=3;
                }
                else if ( (synpred120_Java()) ) {
                    alt87=4;
                }
                else if ( (synpred121_Java()) ) {
                    alt87=5;
                }
                else if ( (synpred122_Java()) ) {
                    alt87=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 12, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA87_13 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 13, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                int LA87_14 = input.LA(2);

                if ( (synpred117_Java()) ) {
                    alt87=1;
                }
                else if ( (synpred118_Java()) ) {
                    alt87=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 14, input);

                    throw nvae;

                }
                }
                break;
            case CLASS:
                {
                alt87=3;
                }
                break;
            case INTERFACE:
                {
                alt87=4;
                }
                break;
            case ENUM:
                {
                alt87=5;
                }
                break;
            case SEMI:
                {
                alt87=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }

            switch (alt87) {
                case 1 :
                    // Java.g:632:9: annotationMethodDeclaration
                    {
                    pushFollow(FOLLOW_annotationMethodDeclaration_in_annotationTypeElementDeclaration4541);
                    annotationMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:633:9: interfaceFieldDeclaration
                    {
                    pushFollow(FOLLOW_interfaceFieldDeclaration_in_annotationTypeElementDeclaration4551);
                    interfaceFieldDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:634:9: normalClassDeclaration
                    {
                    pushFollow(FOLLOW_normalClassDeclaration_in_annotationTypeElementDeclaration4561);
                    normalClassDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Java.g:635:9: normalInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementDeclaration4571);
                    normalInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Java.g:636:9: enumDeclaration
                    {
                    pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementDeclaration4581);
                    enumDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // Java.g:637:9: annotationTypeDeclaration
                    {
                    pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementDeclaration4591);
                    annotationTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // Java.g:638:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_annotationTypeElementDeclaration4601); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, annotationTypeElementDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationTypeElementDeclaration"



    // $ANTLR start "annotationMethodDeclaration"
    // Java.g:641:1: annotationMethodDeclaration : modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';' ;
    public final void annotationMethodDeclaration() throws RecognitionException {
        int annotationMethodDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }

            // Java.g:642:5: ( modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';' )
            // Java.g:642:9: modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';'
            {
            pushFollow(FOLLOW_modifiers_in_annotationMethodDeclaration4621);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_annotationMethodDeclaration4623);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationMethodDeclaration4625); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_annotationMethodDeclaration4635); if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_annotationMethodDeclaration4637); if (state.failed) return ;

            // Java.g:643:17: ( 'default' elementValue )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==DEFAULT) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // Java.g:643:18: 'default' elementValue
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationMethodDeclaration4640); if (state.failed) return ;

                    pushFollow(FOLLOW_elementValue_in_annotationMethodDeclaration4642);
                    elementValue();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,SEMI,FOLLOW_SEMI_in_annotationMethodDeclaration4671); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, annotationMethodDeclaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationMethodDeclaration"


    public static class block_return extends ParserRuleReturnScope {
        public Map<String,Declaracion> lisDecl;
        public ArrayList<UsoId> lisUsosId;
    };


    // $ANTLR start "block"
    // Java.g:648:1: block returns [Map<String,Declaracion> lisDecl, ArrayList<UsoId> lisUsosId] : '{' (b1= blockStatement )* '}' ;
    public final JavaParser.block_return block() throws RecognitionException {
        JavaParser.block_return retval = new JavaParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        JavaParser.blockStatement_return b1 =null;



            retval.lisDecl = new HashMap<String,Declaracion>();
            retval.lisUsosId = new ArrayList<UsoId>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Java.g:653:5: ( '{' (b1= blockStatement )* '}' )
            // Java.g:653:9: '{' (b1= blockStatement )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_block4702); if (state.failed) return retval;

            // Java.g:654:9: (b1= blockStatement )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==ABSTRACT||(LA89_0 >= ASSERT && LA89_0 <= BANG)||(LA89_0 >= BOOLEAN && LA89_0 <= BYTE)||(LA89_0 >= CHAR && LA89_0 <= CLASS)||LA89_0==CONTINUE||LA89_0==DO||(LA89_0 >= DOUBLE && LA89_0 <= DOUBLELITERAL)||LA89_0==ENUM||(LA89_0 >= FALSE && LA89_0 <= FINAL)||(LA89_0 >= FLOAT && LA89_0 <= FOR)||(LA89_0 >= IDENTIFIER && LA89_0 <= IF)||(LA89_0 >= INT && LA89_0 <= INTLITERAL)||LA89_0==LBRACE||(LA89_0 >= LONG && LA89_0 <= LT)||(LA89_0 >= MONKEYS_AT && LA89_0 <= NULL)||LA89_0==PLUS||(LA89_0 >= PLUSPLUS && LA89_0 <= PUBLIC)||LA89_0==RETURN||(LA89_0 >= SEMI && LA89_0 <= SHORT)||(LA89_0 >= STATIC && LA89_0 <= SUB)||(LA89_0 >= SUBSUB && LA89_0 <= SYNCHRONIZED)||(LA89_0 >= THIS && LA89_0 <= THROW)||(LA89_0 >= TILDE && LA89_0 <= WHILE)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // Java.g:654:10: b1= blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block4717);
            	    b1=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisDecl.putAll(b1.lisDecl);retval.lisUsosId.addAll(b1.lisUsosId);}

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_block4740); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, block_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "block"


    public static class blockStatement_return extends ParserRuleReturnScope {
        public Map<String,Declaracion> lisDecl;
        public ArrayList<UsoId> lisUsosId;
    };


    // $ANTLR start "blockStatement"
    // Java.g:683:1: blockStatement returns [Map<String,Declaracion> lisDecl, ArrayList<UsoId> lisUsosId] : (l1= localVariableDeclarationStatement | classOrInterfaceDeclaration |s1= statement );
    public final JavaParser.blockStatement_return blockStatement() throws RecognitionException {
        JavaParser.blockStatement_return retval = new JavaParser.blockStatement_return();
        retval.start = input.LT(1);

        int blockStatement_StartIndex = input.index();

        Map<String,Declaracion> l1 =null;

        ArrayList<UsoId> s1 =null;



            retval.lisDecl = new HashMap<String,Declaracion>();
            retval.lisUsosId = new ArrayList<UsoId>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Java.g:688:5: (l1= localVariableDeclarationStatement | classOrInterfaceDeclaration |s1= statement )
            int alt90=3;
            switch ( input.LA(1) ) {
            case FINAL:
                {
                int LA90_1 = input.LA(2);

                if ( (synpred125_Java()) ) {
                    alt90=1;
                }
                else if ( (synpred126_Java()) ) {
                    alt90=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 1, input);

                    throw nvae;

                }
                }
                break;
            case MONKEYS_AT:
                {
                int LA90_2 = input.LA(2);

                if ( (synpred125_Java()) ) {
                    alt90=1;
                }
                else if ( (synpred126_Java()) ) {
                    alt90=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 2, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA90_3 = input.LA(2);

                if ( (synpred125_Java()) ) {
                    alt90=1;
                }
                else if ( (true) ) {
                    alt90=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 3, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                int LA90_4 = input.LA(2);

                if ( (synpred125_Java()) ) {
                    alt90=1;
                }
                else if ( (true) ) {
                    alt90=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 4, input);

                    throw nvae;

                }
                }
                break;
            case ABSTRACT:
            case CLASS:
            case ENUM:
            case INTERFACE:
            case NATIVE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case STATIC:
            case STRICTFP:
            case TRANSIENT:
            case VOLATILE:
                {
                alt90=2;
                }
                break;
            case SYNCHRONIZED:
                {
                int LA90_11 = input.LA(2);

                if ( (synpred126_Java()) ) {
                    alt90=2;
                }
                else if ( (true) ) {
                    alt90=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 11, input);

                    throw nvae;

                }
                }
                break;
            case ASSERT:
            case BANG:
            case BREAK:
            case CHARLITERAL:
            case CONTINUE:
            case DO:
            case DOUBLELITERAL:
            case FALSE:
            case FLOATLITERAL:
            case FOR:
            case IF:
            case INTLITERAL:
            case LBRACE:
            case LONGLITERAL:
            case LPAREN:
            case NEW:
            case NULL:
            case PLUS:
            case PLUSPLUS:
            case RETURN:
            case SEMI:
            case STRINGLITERAL:
            case SUB:
            case SUBSUB:
            case SUPER:
            case SWITCH:
            case THIS:
            case THROW:
            case TILDE:
            case TRUE:
            case TRY:
            case VOID:
            case WHILE:
                {
                alt90=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }

            switch (alt90) {
                case 1 :
                    // Java.g:688:9: l1= localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement4773);
                    l1=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.lisDecl = l1;}

                    }
                    break;
                case 2 :
                    // Java.g:689:9: classOrInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement4785);
                    classOrInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Java.g:690:9: s1= statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement4799);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.lisUsosId = s1;}

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, blockStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "blockStatement"



    // $ANTLR start "localVariableDeclarationStatement"
    // Java.g:694:1: localVariableDeclarationStatement returns [Map<String,Declaracion> lisDecl] : l1= localVariableDeclaration ';' ;
    public final Map<String,Declaracion> localVariableDeclarationStatement() throws RecognitionException {
        Map<String,Declaracion> lisDecl = null;

        int localVariableDeclarationStatement_StartIndex = input.index();

        Map<String,Declaracion> l1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return lisDecl; }

            // Java.g:695:5: (l1= localVariableDeclaration ';' )
            // Java.g:695:9: l1= localVariableDeclaration ';'
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement4830);
            l1=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {lisDecl = l1;}

            match(input,SEMI,FOLLOW_SEMI_in_localVariableDeclarationStatement4842); if (state.failed) return lisDecl;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, localVariableDeclarationStatement_StartIndex); }

        }
        return lisDecl;
    }
    // $ANTLR end "localVariableDeclarationStatement"



    // $ANTLR start "localVariableDeclaration"
    // Java.g:699:1: localVariableDeclaration returns [Map<String,Declaracion> lisDecl] : variableModifiers type v1= variableDeclarator ( ',' v2= variableDeclarator )* ;
    public final Map<String,Declaracion> localVariableDeclaration() throws RecognitionException {
        Map<String,Declaracion> lisDecl = null;

        int localVariableDeclaration_StartIndex = input.index();

        Id v1 =null;

        Id v2 =null;

        JavaParser.variableModifiers_return variableModifiers8 =null;

        JavaParser.type_return type9 =null;



            lisDecl = new HashMap<String,Declaracion>();
            String mod = new String();
            String tipo = new String();    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return lisDecl; }

            // Java.g:705:5: ( variableModifiers type v1= variableDeclarator ( ',' v2= variableDeclarator )* )
            // Java.g:705:9: variableModifiers type v1= variableDeclarator ( ',' v2= variableDeclarator )*
            {
            pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration4869);
            variableModifiers8=variableModifiers();

            state._fsp--;
            if (state.failed) return lisDecl;

            pushFollow(FOLLOW_type_in_localVariableDeclaration4871);
            type9=type();

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {mod = (variableModifiers8!=null?input.toString(variableModifiers8.start,variableModifiers8.stop):null); tipo = (type9!=null?input.toString(type9.start,type9.stop):null);}

            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration4887);
            v1=variableDeclarator();

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {lisDecl.put(v1.getNomID(),new Declaracion(mod,tipo,v1));}

            // Java.g:707:9: ( ',' v2= variableDeclarator )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==COMMA) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // Java.g:707:10: ',' v2= variableDeclarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_localVariableDeclaration4900); if (state.failed) return lisDecl;

            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration4906);
            	    v2=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return lisDecl;

            	    if ( state.backtracking==0 ) {lisDecl.put(v2.getNomID(),new Declaracion(mod,tipo,v2));}

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, localVariableDeclaration_StartIndex); }

        }
        return lisDecl;
    }
    // $ANTLR end "localVariableDeclaration"



    // $ANTLR start "statement"
    // Java.g:711:2: statement returns [ArrayList<UsoId> lisUsosId] : (b1= block | ( 'assert' ) exp1= expression ( ':' exp2= expression )? ';' | 'assert' expression ( ':' expression )? ';' | 'if' p1= parExpression s1= statement ( 'else' s2= statement )? |f1= forstatement | 'while' p2= parExpression s3= statement | 'do' dos1= statement 'while' pa1= parExpression ';' |tr1= trystatement | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' (r1= expression )? ';' | 'throw' expression ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' |e1= expression ';' | IDENTIFIER ':' statement | ';' );
    public final ArrayList<UsoId> statement() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int statement_StartIndex = input.index();

        JavaParser.block_return b1 =null;

        ArrayList<UsoId> exp1 =null;

        ArrayList<UsoId> exp2 =null;

        ArrayList<UsoId> p1 =null;

        ArrayList<UsoId> s1 =null;

        ArrayList<UsoId> s2 =null;

        ArrayList<UsoId> f1 =null;

        ArrayList<UsoId> p2 =null;

        ArrayList<UsoId> s3 =null;

        ArrayList<UsoId> dos1 =null;

        ArrayList<UsoId> pa1 =null;

        ArrayList<UsoId> tr1 =null;

        ArrayList<UsoId> r1 =null;

        ArrayList<UsoId> e1 =null;


           
            lisUsosId = new ArrayList<UsoId>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return lisUsosId; }

            // Java.g:715:5: (b1= block | ( 'assert' ) exp1= expression ( ':' exp2= expression )? ';' | 'assert' expression ( ':' expression )? ';' | 'if' p1= parExpression s1= statement ( 'else' s2= statement )? |f1= forstatement | 'while' p2= parExpression s3= statement | 'do' dos1= statement 'while' pa1= parExpression ';' |tr1= trystatement | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' (r1= expression )? ';' | 'throw' expression ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' |e1= expression ';' | IDENTIFIER ':' statement | ';' )
            int alt98=17;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt98=1;
                }
                break;
            case ASSERT:
                {
                int LA98_2 = input.LA(2);

                if ( (synpred130_Java()) ) {
                    alt98=2;
                }
                else if ( (synpred132_Java()) ) {
                    alt98=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 2, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt98=4;
                }
                break;
            case FOR:
                {
                alt98=5;
                }
                break;
            case WHILE:
                {
                alt98=6;
                }
                break;
            case DO:
                {
                alt98=7;
                }
                break;
            case TRY:
                {
                alt98=8;
                }
                break;
            case SWITCH:
                {
                alt98=9;
                }
                break;
            case SYNCHRONIZED:
                {
                alt98=10;
                }
                break;
            case RETURN:
                {
                alt98=11;
                }
                break;
            case THROW:
                {
                alt98=12;
                }
                break;
            case BREAK:
                {
                alt98=13;
                }
                break;
            case CONTINUE:
                {
                alt98=14;
                }
                break;
            case BANG:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CHARLITERAL:
            case DOUBLE:
            case DOUBLELITERAL:
            case FALSE:
            case FLOAT:
            case FLOATLITERAL:
            case INT:
            case INTLITERAL:
            case LONG:
            case LONGLITERAL:
            case LPAREN:
            case NEW:
            case NULL:
            case PLUS:
            case PLUSPLUS:
            case SHORT:
            case STRINGLITERAL:
            case SUB:
            case SUBSUB:
            case SUPER:
            case THIS:
            case TILDE:
            case TRUE:
            case VOID:
                {
                alt98=15;
                }
                break;
            case IDENTIFIER:
                {
                int LA98_22 = input.LA(2);

                if ( (synpred148_Java()) ) {
                    alt98=15;
                }
                else if ( (synpred149_Java()) ) {
                    alt98=16;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 22, input);

                    throw nvae;

                }
                }
                break;
            case SEMI:
                {
                alt98=17;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }

            switch (alt98) {
                case 1 :
                    // Java.g:715:9: b1= block
                    {
                    pushFollow(FOLLOW_block_in_statement4951);
                    b1=block();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(b1!=null){lisUsosId.addAll(b1.lisUsosId);}}

                    }
                    break;
                case 2 :
                    // Java.g:717:9: ( 'assert' ) exp1= expression ( ':' exp2= expression )? ';'
                    {
                    // Java.g:717:9: ( 'assert' )
                    // Java.g:717:10: 'assert'
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement4977); if (state.failed) return lisUsosId;

                    }


                    pushFollow(FOLLOW_expression_in_statement5001);
                    exp1=expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    // Java.g:719:27: ( ':' exp2= expression )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==COLON) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Java.g:719:28: ':' exp2= expression
                            {
                            match(input,COLON,FOLLOW_COLON_in_statement5004); if (state.failed) return lisUsosId;

                            pushFollow(FOLLOW_expression_in_statement5010);
                            exp2=expression();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            if ( state.backtracking==0 ) {lisUsosId.addAll(exp2);}

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_statement5016); if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId.addAll(exp1);}

                    }
                    break;
                case 3 :
                    // Java.g:720:9: 'assert' expression ( ':' expression )? ';'
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement5028); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_expression_in_statement5031);
                    expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    // Java.g:720:30: ( ':' expression )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==COLON) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Java.g:720:31: ':' expression
                            {
                            match(input,COLON,FOLLOW_COLON_in_statement5034); if (state.failed) return lisUsosId;

                            pushFollow(FOLLOW_expression_in_statement5036);
                            expression();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_statement5040); if (state.failed) return lisUsosId;

                    }
                    break;
                case 4 :
                    // Java.g:721:9: 'if' p1= parExpression s1= statement ( 'else' s2= statement )?
                    {
                    match(input,IF,FOLLOW_IF_in_statement5062); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_parExpression_in_statement5068);
                    p1=parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_statement_in_statement5074);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    // Java.g:721:48: ( 'else' s2= statement )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==ELSE) ) {
                        int LA94_1 = input.LA(2);

                        if ( (synpred133_Java()) ) {
                            alt94=1;
                        }
                    }
                    switch (alt94) {
                        case 1 :
                            // Java.g:721:49: 'else' s2= statement
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_statement5077); if (state.failed) return lisUsosId;

                            pushFollow(FOLLOW_statement_in_statement5083);
                            s2=statement();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {if(p1!=null){lisUsosId.addAll(p1);}if(s1!=null){lisUsosId.addAll(s1);} if(s2!=null){lisUsosId.addAll(s2);}}

                    }
                    break;
                case 5 :
                    // Java.g:722:9: f1= forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement5100);
                    f1=forstatement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(f1!=null){lisUsosId.addAll(f1);}}

                    }
                    break;
                case 6 :
                    // Java.g:723:9: 'while' p2= parExpression s3= statement
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement5112); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_parExpression_in_statement5118);
                    p2=parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_statement_in_statement5124);
                    s3=statement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(p2!=null){lisUsosId.addAll(p2);} if(s3!=null){lisUsosId.addAll(s3);}}

                    }
                    break;
                case 7 :
                    // Java.g:724:9: 'do' dos1= statement 'while' pa1= parExpression ';'
                    {
                    match(input,DO,FOLLOW_DO_in_statement5136); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_statement_in_statement5142);
                    dos1=statement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,WHILE,FOLLOW_WHILE_in_statement5144); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_parExpression_in_statement5150);
                    pa1=parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,SEMI,FOLLOW_SEMI_in_statement5152); if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(dos1!=null){lisUsosId.addAll(dos1);} lisUsosId.addAll(pa1);}

                    }
                    break;
                case 8 :
                    // Java.g:725:9: tr1= trystatement
                    {
                    pushFollow(FOLLOW_trystatement_in_statement5169);
                    tr1=trystatement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(tr1!=null){lisUsosId.addAll(tr1);}}

                    }
                    break;
                case 9 :
                    // Java.g:726:9: 'switch' parExpression '{' switchBlockStatementGroups '}'
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement5181); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_parExpression_in_statement5183);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,LBRACE,FOLLOW_LBRACE_in_statement5185); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_switchBlockStatementGroups_in_statement5187);
                    switchBlockStatementGroups();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,RBRACE,FOLLOW_RBRACE_in_statement5189); if (state.failed) return lisUsosId;

                    }
                    break;
                case 10 :
                    // Java.g:727:9: 'synchronized' parExpression block
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement5199); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_parExpression_in_statement5201);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_block_in_statement5203);
                    block();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 11 :
                    // Java.g:728:9: 'return' (r1= expression )? ';'
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement5213); if (state.failed) return lisUsosId;

                    // Java.g:728:18: (r1= expression )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==BANG||LA95_0==BOOLEAN||LA95_0==BYTE||(LA95_0 >= CHAR && LA95_0 <= CHARLITERAL)||(LA95_0 >= DOUBLE && LA95_0 <= DOUBLELITERAL)||LA95_0==FALSE||(LA95_0 >= FLOAT && LA95_0 <= FLOATLITERAL)||LA95_0==IDENTIFIER||LA95_0==INT||LA95_0==INTLITERAL||(LA95_0 >= LONG && LA95_0 <= LPAREN)||(LA95_0 >= NEW && LA95_0 <= NULL)||LA95_0==PLUS||LA95_0==PLUSPLUS||LA95_0==SHORT||(LA95_0 >= STRINGLITERAL && LA95_0 <= SUB)||(LA95_0 >= SUBSUB && LA95_0 <= SUPER)||LA95_0==THIS||LA95_0==TILDE||LA95_0==TRUE||LA95_0==VOID) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // Java.g:728:20: r1= expression
                            {
                            pushFollow(FOLLOW_expression_in_statement5221);
                            r1=expression();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            if ( state.backtracking==0 ) {lisUsosId.addAll(r1);}

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_statement5228); if (state.failed) return lisUsosId;

                    }
                    break;
                case 12 :
                    // Java.g:729:9: 'throw' expression ';'
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement5238); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_expression_in_statement5240);
                    expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,SEMI,FOLLOW_SEMI_in_statement5242); if (state.failed) return lisUsosId;

                    }
                    break;
                case 13 :
                    // Java.g:730:9: 'break' ( IDENTIFIER )? ';'
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement5252); if (state.failed) return lisUsosId;

                    // Java.g:731:13: ( IDENTIFIER )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==IDENTIFIER) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Java.g:731:14: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement5267); if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_statement5284); if (state.failed) return lisUsosId;

                    }
                    break;
                case 14 :
                    // Java.g:733:9: 'continue' ( IDENTIFIER )? ';'
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement5294); if (state.failed) return lisUsosId;

                    // Java.g:734:13: ( IDENTIFIER )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==IDENTIFIER) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Java.g:734:14: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement5309); if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_statement5326); if (state.failed) return lisUsosId;

                    }
                    break;
                case 15 :
                    // Java.g:736:9: e1= expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_statement5340);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,SEMI,FOLLOW_SEMI_in_statement5342); if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(e1!=null){lisUsosId.addAll(e1);}}

                    }
                    break;
                case 16 :
                    // Java.g:737:9: IDENTIFIER ':' statement
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement5358); if (state.failed) return lisUsosId;

                    match(input,COLON,FOLLOW_COLON_in_statement5360); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_statement_in_statement5362);
                    statement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 17 :
                    // Java.g:738:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement5372); if (state.failed) return lisUsosId;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, statement_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "statement"



    // $ANTLR start "switchBlockStatementGroups"
    // Java.g:742:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
    public final void switchBlockStatementGroups() throws RecognitionException {
        int switchBlockStatementGroups_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }

            // Java.g:743:5: ( ( switchBlockStatementGroup )* )
            // Java.g:743:9: ( switchBlockStatementGroup )*
            {
            // Java.g:743:9: ( switchBlockStatementGroup )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==CASE||LA99_0==DEFAULT) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // Java.g:743:10: switchBlockStatementGroup
            	    {
            	    pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups5394);
            	    switchBlockStatementGroup();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, switchBlockStatementGroups_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "switchBlockStatementGroups"



    // $ANTLR start "switchBlockStatementGroup"
    // Java.g:746:1: switchBlockStatementGroup : switchLabel ( blockStatement )* ;
    public final void switchBlockStatementGroup() throws RecognitionException {
        int switchBlockStatementGroup_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }

            // Java.g:747:5: ( switchLabel ( blockStatement )* )
            // Java.g:748:9: switchLabel ( blockStatement )*
            {
            pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup5423);
            switchLabel();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:749:9: ( blockStatement )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==ABSTRACT||(LA100_0 >= ASSERT && LA100_0 <= BANG)||(LA100_0 >= BOOLEAN && LA100_0 <= BYTE)||(LA100_0 >= CHAR && LA100_0 <= CLASS)||LA100_0==CONTINUE||LA100_0==DO||(LA100_0 >= DOUBLE && LA100_0 <= DOUBLELITERAL)||LA100_0==ENUM||(LA100_0 >= FALSE && LA100_0 <= FINAL)||(LA100_0 >= FLOAT && LA100_0 <= FOR)||(LA100_0 >= IDENTIFIER && LA100_0 <= IF)||(LA100_0 >= INT && LA100_0 <= INTLITERAL)||LA100_0==LBRACE||(LA100_0 >= LONG && LA100_0 <= LT)||(LA100_0 >= MONKEYS_AT && LA100_0 <= NULL)||LA100_0==PLUS||(LA100_0 >= PLUSPLUS && LA100_0 <= PUBLIC)||LA100_0==RETURN||(LA100_0 >= SEMI && LA100_0 <= SHORT)||(LA100_0 >= STATIC && LA100_0 <= SUB)||(LA100_0 >= SUBSUB && LA100_0 <= SYNCHRONIZED)||(LA100_0 >= THIS && LA100_0 <= THROW)||(LA100_0 >= TILDE && LA100_0 <= WHILE)) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // Java.g:749:10: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup5434);
            	    blockStatement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, switchBlockStatementGroup_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "switchBlockStatementGroup"



    // $ANTLR start "switchLabel"
    // Java.g:753:1: switchLabel : ( 'case' expression ':' | 'default' ':' );
    public final void switchLabel() throws RecognitionException {
        int switchLabel_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }

            // Java.g:754:5: ( 'case' expression ':' | 'default' ':' )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==CASE) ) {
                alt101=1;
            }
            else if ( (LA101_0==DEFAULT) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }
            switch (alt101) {
                case 1 :
                    // Java.g:754:9: 'case' expression ':'
                    {
                    match(input,CASE,FOLLOW_CASE_in_switchLabel5465); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_switchLabel5467);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,COLON,FOLLOW_COLON_in_switchLabel5469); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:755:9: 'default' ':'
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_switchLabel5479); if (state.failed) return ;

                    match(input,COLON,FOLLOW_COLON_in_switchLabel5481); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 61, switchLabel_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "switchLabel"



    // $ANTLR start "trystatement"
    // Java.g:759:1: trystatement returns [ArrayList<UsoId> lisUsosId] : 'try' b1= block (ca1= catches 'finally' b2= block |ca2= catches | 'finally' b3= block ) ;
    public final ArrayList<UsoId> trystatement() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int trystatement_StartIndex = input.index();

        JavaParser.block_return b1 =null;

        ArrayList<UsoId> ca1 =null;

        JavaParser.block_return b2 =null;

        ArrayList<UsoId> ca2 =null;

        JavaParser.block_return b3 =null;


           
            lisUsosId = new ArrayList<UsoId>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return lisUsosId; }

            // Java.g:763:5: ( 'try' b1= block (ca1= catches 'finally' b2= block |ca2= catches | 'finally' b3= block ) )
            // Java.g:763:9: 'try' b1= block (ca1= catches 'finally' b2= block |ca2= catches | 'finally' b3= block )
            {
            match(input,TRY,FOLLOW_TRY_in_trystatement5509); if (state.failed) return lisUsosId;

            pushFollow(FOLLOW_block_in_trystatement5515);
            b1=block();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {if(b1!=null){lisUsosId.addAll(b1.lisUsosId);}}

            // Java.g:764:9: (ca1= catches 'finally' b2= block |ca2= catches | 'finally' b3= block )
            int alt102=3;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==CATCH) ) {
                int LA102_1 = input.LA(2);

                if ( (synpred153_Java()) ) {
                    alt102=1;
                }
                else if ( (synpred154_Java()) ) {
                    alt102=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA102_0==FINALLY) ) {
                alt102=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }
            switch (alt102) {
                case 1 :
                    // Java.g:764:13: ca1= catches 'finally' b2= block
                    {
                    pushFollow(FOLLOW_catches_in_trystatement5535);
                    ca1=catches();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,FINALLY,FOLLOW_FINALLY_in_trystatement5537); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_block_in_trystatement5543);
                    b2=block();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(b2!=null){lisUsosId.addAll(b2.lisUsosId);} lisUsosId.addAll(ca1);}

                    }
                    break;
                case 2 :
                    // Java.g:765:13: ca2= catches
                    {
                    pushFollow(FOLLOW_catches_in_trystatement5563);
                    ca2=catches();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId.addAll(ca2);}

                    }
                    break;
                case 3 :
                    // Java.g:766:13: 'finally' b3= block
                    {
                    match(input,FINALLY,FOLLOW_FINALLY_in_trystatement5579); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_block_in_trystatement5585);
                    b3=block();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(b3!=null){lisUsosId.addAll(b3.lisUsosId);}}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 62, trystatement_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "trystatement"



    // $ANTLR start "catches"
    // Java.g:770:1: catches returns [ArrayList<UsoId> lisUsosId] : c1= catchClause (c2= catchClause )* ;
    public final ArrayList<UsoId> catches() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int catches_StartIndex = input.index();

        ArrayList<UsoId> c1 =null;

        ArrayList<UsoId> c2 =null;


           
            lisUsosId = new ArrayList<UsoId>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return lisUsosId; }

            // Java.g:774:5: (c1= catchClause (c2= catchClause )* )
            // Java.g:774:9: c1= catchClause (c2= catchClause )*
            {
            pushFollow(FOLLOW_catchClause_in_catches5629);
            c1=catchClause();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = c1;}

            // Java.g:775:9: (c2= catchClause )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==CATCH) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // Java.g:775:10: c2= catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches5646);
            	    c2=catchClause();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(c2!=null){lisUsosId.addAll(c2);}}

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 63, catches_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "catches"



    // $ANTLR start "catchClause"
    // Java.g:779:1: catchClause returns [ArrayList<UsoId> lisUsosId] : 'catch' '(' formalParameter ')' b1= block ;
    public final ArrayList<UsoId> catchClause() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int catchClause_StartIndex = input.index();

        JavaParser.block_return b1 =null;


           
            lisUsosId = new ArrayList<UsoId>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return lisUsosId; }

            // Java.g:783:5: ( 'catch' '(' formalParameter ')' b1= block )
            // Java.g:783:9: 'catch' '(' formalParameter ')' b1= block
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause5686); if (state.failed) return lisUsosId;

            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause5688); if (state.failed) return lisUsosId;

            pushFollow(FOLLOW_formalParameter_in_catchClause5690);
            formalParameter();

            state._fsp--;
            if (state.failed) return lisUsosId;

            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause5700); if (state.failed) return lisUsosId;

            pushFollow(FOLLOW_block_in_catchClause5706);
            b1=block();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {if(b1!=null){lisUsosId.addAll(b1.lisUsosId);}}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 64, catchClause_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "catchClause"



    // $ANTLR start "formalParameter"
    // Java.g:787:1: formalParameter : variableModifiers type IDENTIFIER ( '[' ']' )* ;
    public final void formalParameter() throws RecognitionException {
        int formalParameter_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }

            // Java.g:788:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* )
            // Java.g:788:9: variableModifiers type IDENTIFIER ( '[' ']' )*
            {
            pushFollow(FOLLOW_variableModifiers_in_formalParameter5728);
            variableModifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_formalParameter5730);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formalParameter5732); if (state.failed) return ;

            // Java.g:789:9: ( '[' ']' )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==LBRACKET) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // Java.g:789:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_formalParameter5743); if (state.failed) return ;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_formalParameter5745); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 65, formalParameter_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "formalParameter"



    // $ANTLR start "forstatement"
    // Java.g:793:1: forstatement returns [ArrayList<UsoId> lisUsosId] : ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' s2= statement | 'for' '(' ( forInit )? ';' (e1= expression )? ';' (e2= expressionList )? ')' s1= statement );
    public final ArrayList<UsoId> forstatement() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int forstatement_StartIndex = input.index();

        ArrayList<UsoId> s2 =null;

        ArrayList<UsoId> e1 =null;

        ArrayList<UsoId> e2 =null;

        ArrayList<UsoId> s1 =null;


           
            lisUsosId = new ArrayList<UsoId>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return lisUsosId; }

            // Java.g:797:5: ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' s2= statement | 'for' '(' ( forInit )? ';' (e1= expression )? ';' (e2= expressionList )? ')' s1= statement )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==FOR) ) {
                int LA108_1 = input.LA(2);

                if ( (synpred157_Java()) ) {
                    alt108=1;
                }
                else if ( (true) ) {
                    alt108=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }
            switch (alt108) {
                case 1 :
                    // Java.g:799:9: 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' s2= statement
                    {
                    match(input,FOR,FOLLOW_FOR_in_forstatement5802); if (state.failed) return lisUsosId;

                    match(input,LPAREN,FOLLOW_LPAREN_in_forstatement5804); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_variableModifiers_in_forstatement5806);
                    variableModifiers();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_type_in_forstatement5808);
                    type();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_forstatement5810); if (state.failed) return lisUsosId;

                    match(input,COLON,FOLLOW_COLON_in_forstatement5812); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_expression_in_forstatement5823);
                    expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,RPAREN,FOLLOW_RPAREN_in_forstatement5825); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_statement_in_forstatement5831);
                    s2=statement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(s2!=null){lisUsosId.addAll(s2);}}

                    }
                    break;
                case 2 :
                    // Java.g:803:9: 'for' '(' ( forInit )? ';' (e1= expression )? ';' (e2= expressionList )? ')' s1= statement
                    {
                    match(input,FOR,FOLLOW_FOR_in_forstatement5865); if (state.failed) return lisUsosId;

                    match(input,LPAREN,FOLLOW_LPAREN_in_forstatement5867); if (state.failed) return lisUsosId;

                    // Java.g:804:17: ( forInit )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==BANG||LA105_0==BOOLEAN||LA105_0==BYTE||(LA105_0 >= CHAR && LA105_0 <= CHARLITERAL)||(LA105_0 >= DOUBLE && LA105_0 <= DOUBLELITERAL)||(LA105_0 >= FALSE && LA105_0 <= FINAL)||(LA105_0 >= FLOAT && LA105_0 <= FLOATLITERAL)||LA105_0==IDENTIFIER||LA105_0==INT||LA105_0==INTLITERAL||(LA105_0 >= LONG && LA105_0 <= LPAREN)||LA105_0==MONKEYS_AT||(LA105_0 >= NEW && LA105_0 <= NULL)||LA105_0==PLUS||LA105_0==PLUSPLUS||LA105_0==SHORT||(LA105_0 >= STRINGLITERAL && LA105_0 <= SUB)||(LA105_0 >= SUBSUB && LA105_0 <= SUPER)||LA105_0==THIS||LA105_0==TILDE||LA105_0==TRUE||LA105_0==VOID) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Java.g:804:18: forInit
                            {
                            pushFollow(FOLLOW_forInit_in_forstatement5887);
                            forInit();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_forstatement5908); if (state.failed) return lisUsosId;

                    // Java.g:806:17: (e1= expression )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==BANG||LA106_0==BOOLEAN||LA106_0==BYTE||(LA106_0 >= CHAR && LA106_0 <= CHARLITERAL)||(LA106_0 >= DOUBLE && LA106_0 <= DOUBLELITERAL)||LA106_0==FALSE||(LA106_0 >= FLOAT && LA106_0 <= FLOATLITERAL)||LA106_0==IDENTIFIER||LA106_0==INT||LA106_0==INTLITERAL||(LA106_0 >= LONG && LA106_0 <= LPAREN)||(LA106_0 >= NEW && LA106_0 <= NULL)||LA106_0==PLUS||LA106_0==PLUSPLUS||LA106_0==SHORT||(LA106_0 >= STRINGLITERAL && LA106_0 <= SUB)||(LA106_0 >= SUBSUB && LA106_0 <= SUPER)||LA106_0==THIS||LA106_0==TILDE||LA106_0==TRUE||LA106_0==VOID) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Java.g:806:19: e1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forstatement5933);
                            e1=expression();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            if ( state.backtracking==0 ) {lisUsosId.addAll(e1);}

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_forstatement5956); if (state.failed) return lisUsosId;

                    // Java.g:808:17: (e2= expressionList )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==BANG||LA107_0==BOOLEAN||LA107_0==BYTE||(LA107_0 >= CHAR && LA107_0 <= CHARLITERAL)||(LA107_0 >= DOUBLE && LA107_0 <= DOUBLELITERAL)||LA107_0==FALSE||(LA107_0 >= FLOAT && LA107_0 <= FLOATLITERAL)||LA107_0==IDENTIFIER||LA107_0==INT||LA107_0==INTLITERAL||(LA107_0 >= LONG && LA107_0 <= LPAREN)||(LA107_0 >= NEW && LA107_0 <= NULL)||LA107_0==PLUS||LA107_0==PLUSPLUS||LA107_0==SHORT||(LA107_0 >= STRINGLITERAL && LA107_0 <= SUB)||(LA107_0 >= SUBSUB && LA107_0 <= SUPER)||LA107_0==THIS||LA107_0==TILDE||LA107_0==TRUE||LA107_0==VOID) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Java.g:808:19: e2= expressionList
                            {
                            pushFollow(FOLLOW_expressionList_in_forstatement5981);
                            e2=expressionList();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            if ( state.backtracking==0 ) {if(e2!=null){lisUsosId.addAll(e2);}}

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_forstatement6004); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_statement_in_forstatement6010);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(s1!=null){lisUsosId.addAll(s1);}}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, forstatement_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "forstatement"



    // $ANTLR start "forInit"
    // Java.g:812:1: forInit : ( localVariableDeclaration | expressionList );
    public final void forInit() throws RecognitionException {
        int forInit_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }

            // Java.g:813:5: ( localVariableDeclaration | expressionList )
            int alt109=2;
            switch ( input.LA(1) ) {
            case FINAL:
            case MONKEYS_AT:
                {
                alt109=1;
                }
                break;
            case IDENTIFIER:
                {
                int LA109_3 = input.LA(2);

                if ( (synpred161_Java()) ) {
                    alt109=1;
                }
                else if ( (true) ) {
                    alt109=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 3, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                int LA109_4 = input.LA(2);

                if ( (synpred161_Java()) ) {
                    alt109=1;
                }
                else if ( (true) ) {
                    alt109=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 4, input);

                    throw nvae;

                }
                }
                break;
            case BANG:
            case CHARLITERAL:
            case DOUBLELITERAL:
            case FALSE:
            case FLOATLITERAL:
            case INTLITERAL:
            case LONGLITERAL:
            case LPAREN:
            case NEW:
            case NULL:
            case PLUS:
            case PLUSPLUS:
            case STRINGLITERAL:
            case SUB:
            case SUBSUB:
            case SUPER:
            case THIS:
            case TILDE:
            case TRUE:
            case VOID:
                {
                alt109=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;

            }

            switch (alt109) {
                case 1 :
                    // Java.g:813:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit6031);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:814:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit6041);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 67, forInit_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "forInit"



    // $ANTLR start "parExpression"
    // Java.g:817:1: parExpression returns [ArrayList<UsoId> lisUsosId] : '(' e1= expression ')' ;
    public final ArrayList<UsoId> parExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int parExpression_StartIndex = input.index();

        ArrayList<UsoId> e1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return lisUsosId; }

            // Java.g:818:5: ( '(' e1= expression ')' )
            // Java.g:818:9: '(' e1= expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression6065); if (state.failed) return lisUsosId;

            pushFollow(FOLLOW_expression_in_parExpression6070);
            e1=expression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression6071); if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = e1;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 68, parExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "parExpression"



    // $ANTLR start "expressionList"
    // Java.g:821:1: expressionList returns [ArrayList<UsoId> lisUsosId] : e1= expression ( ',' e2= expression )* ;
    public final ArrayList<UsoId> expressionList() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int expressionList_StartIndex = input.index();

        ArrayList<UsoId> e1 =null;

        ArrayList<UsoId> e2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return lisUsosId; }

            // Java.g:822:5: (e1= expression ( ',' e2= expression )* )
            // Java.g:822:9: e1= expression ( ',' e2= expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList6100);
            e1=expression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = e1;}

            // Java.g:823:9: ( ',' e2= expression )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==COMMA) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // Java.g:823:10: ',' e2= expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionList6113); if (state.failed) return lisUsosId;

            	    pushFollow(FOLLOW_expression_in_expressionList6119);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {lisUsosId.addAll(e2);}

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, expressionList_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "expressionList"



    // $ANTLR start "expression"
    // Java.g:828:1: expression returns [ArrayList<UsoId> lisUsosId] : c1= conditionalExpression ( assignmentOperator e1= expression )? ;
    public final ArrayList<UsoId> expression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int expression_StartIndex = input.index();

        ArrayList<UsoId> c1 =null;

        ArrayList<UsoId> e1 =null;



            lisUsosId = new ArrayList<UsoId>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return lisUsosId; }

            // Java.g:832:5: (c1= conditionalExpression ( assignmentOperator e1= expression )? )
            // Java.g:832:9: c1= conditionalExpression ( assignmentOperator e1= expression )?
            {
            pushFollow(FOLLOW_conditionalExpression_in_expression6198);
            c1=conditionalExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {if(c1!=null){lisUsosId = c1;}}

            // Java.g:833:9: ( assignmentOperator e1= expression )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==AMPEQ||LA111_0==BAREQ||LA111_0==CARETEQ||LA111_0==EQ||LA111_0==GT||LA111_0==LT||LA111_0==PERCENTEQ||LA111_0==PLUSEQ||LA111_0==SLASHEQ||LA111_0==STAREQ||LA111_0==SUBEQ) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // Java.g:833:10: assignmentOperator e1= expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression6212);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_expression_in_expression6218);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId.addAll(e1);}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, expression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "expression"



    // $ANTLR start "assignmentOperator"
    // Java.g:838:1: assignmentOperator returns [String s] : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' );
    public final String assignmentOperator() throws RecognitionException {
        String s = null;

        int assignmentOperator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return s; }

            // Java.g:839:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' )
            int alt112=12;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt112=1;
                }
                break;
            case PLUSEQ:
                {
                alt112=2;
                }
                break;
            case SUBEQ:
                {
                alt112=3;
                }
                break;
            case STAREQ:
                {
                alt112=4;
                }
                break;
            case SLASHEQ:
                {
                alt112=5;
                }
                break;
            case AMPEQ:
                {
                alt112=6;
                }
                break;
            case BAREQ:
                {
                alt112=7;
                }
                break;
            case CARETEQ:
                {
                alt112=8;
                }
                break;
            case PERCENTEQ:
                {
                alt112=9;
                }
                break;
            case LT:
                {
                alt112=10;
                }
                break;
            case GT:
                {
                int LA112_11 = input.LA(2);

                if ( (LA112_11==GT) ) {
                    int LA112_12 = input.LA(3);

                    if ( (LA112_12==GT) ) {
                        alt112=11;
                    }
                    else if ( (LA112_12==EQ) ) {
                        alt112=12;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return s;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 12, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return s;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 112, 11, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;

            }

            switch (alt112) {
                case 1 :
                    // Java.g:839:9: '='
                    {
                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator6256); if (state.failed) return s;

                    }
                    break;
                case 2 :
                    // Java.g:840:9: '+='
                    {
                    match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignmentOperator6266); if (state.failed) return s;

                    }
                    break;
                case 3 :
                    // Java.g:841:9: '-='
                    {
                    match(input,SUBEQ,FOLLOW_SUBEQ_in_assignmentOperator6276); if (state.failed) return s;

                    }
                    break;
                case 4 :
                    // Java.g:842:9: '*='
                    {
                    match(input,STAREQ,FOLLOW_STAREQ_in_assignmentOperator6286); if (state.failed) return s;

                    }
                    break;
                case 5 :
                    // Java.g:843:9: '/='
                    {
                    match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignmentOperator6296); if (state.failed) return s;

                    }
                    break;
                case 6 :
                    // Java.g:844:9: '&='
                    {
                    match(input,AMPEQ,FOLLOW_AMPEQ_in_assignmentOperator6306); if (state.failed) return s;

                    }
                    break;
                case 7 :
                    // Java.g:845:9: '|='
                    {
                    match(input,BAREQ,FOLLOW_BAREQ_in_assignmentOperator6316); if (state.failed) return s;

                    }
                    break;
                case 8 :
                    // Java.g:846:9: '^='
                    {
                    match(input,CARETEQ,FOLLOW_CARETEQ_in_assignmentOperator6326); if (state.failed) return s;

                    }
                    break;
                case 9 :
                    // Java.g:847:9: '%='
                    {
                    match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignmentOperator6336); if (state.failed) return s;

                    }
                    break;
                case 10 :
                    // Java.g:848:10: '<' '<' '='
                    {
                    match(input,LT,FOLLOW_LT_in_assignmentOperator6347); if (state.failed) return s;

                    match(input,LT,FOLLOW_LT_in_assignmentOperator6349); if (state.failed) return s;

                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator6351); if (state.failed) return s;

                    }
                    break;
                case 11 :
                    // Java.g:849:10: '>' '>' '>' '='
                    {
                    match(input,GT,FOLLOW_GT_in_assignmentOperator6362); if (state.failed) return s;

                    match(input,GT,FOLLOW_GT_in_assignmentOperator6364); if (state.failed) return s;

                    match(input,GT,FOLLOW_GT_in_assignmentOperator6366); if (state.failed) return s;

                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator6368); if (state.failed) return s;

                    }
                    break;
                case 12 :
                    // Java.g:850:10: '>' '>' '='
                    {
                    match(input,GT,FOLLOW_GT_in_assignmentOperator6379); if (state.failed) return s;

                    match(input,GT,FOLLOW_GT_in_assignmentOperator6381); if (state.failed) return s;

                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator6383); if (state.failed) return s;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 71, assignmentOperator_StartIndex); }

        }
        return s;
    }
    // $ANTLR end "assignmentOperator"



    // $ANTLR start "conditionalExpression"
    // Java.g:854:1: conditionalExpression returns [ArrayList<UsoId> lisUsosId] : c1= conditionalOrExpression ( '?' e1= expression ':' c2= conditionalExpression )? ;
    public final ArrayList<UsoId> conditionalExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int conditionalExpression_StartIndex = input.index();

        ArrayList<UsoId> c1 =null;

        ArrayList<UsoId> e1 =null;

        ArrayList<UsoId> c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return lisUsosId; }

            // Java.g:855:5: (c1= conditionalOrExpression ( '?' e1= expression ':' c2= conditionalExpression )? )
            // Java.g:855:9: c1= conditionalOrExpression ( '?' e1= expression ':' c2= conditionalExpression )?
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression6411);
            c1=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = c1;}

            // Java.g:856:9: ( '?' e1= expression ':' c2= conditionalExpression )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==QUES) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // Java.g:856:10: '?' e1= expression ':' c2= conditionalExpression
                    {
                    match(input,QUES,FOLLOW_QUES_in_conditionalExpression6424); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_expression_in_conditionalExpression6430);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId.addAll(e1);}

                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression6434); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression6440);
                    c2=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(c2!=null){lisUsosId.addAll(c2);}}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 72, conditionalExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "conditionalExpression"



    // $ANTLR start "conditionalOrExpression"
    // Java.g:860:1: conditionalOrExpression returns [ArrayList<UsoId> lisUsosId] : c1= conditionalAndExpression ( '||' c2= conditionalAndExpression )* ;
    public final ArrayList<UsoId> conditionalOrExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int conditionalOrExpression_StartIndex = input.index();

        ArrayList<UsoId> c1 =null;

        ArrayList<UsoId> c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return lisUsosId; }

            // Java.g:861:5: (c1= conditionalAndExpression ( '||' c2= conditionalAndExpression )* )
            // Java.g:861:9: c1= conditionalAndExpression ( '||' c2= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression6480);
            c1=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = c1;}

            // Java.g:862:9: ( '||' c2= conditionalAndExpression )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==BARBAR) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // Java.g:862:10: '||' c2= conditionalAndExpression
            	    {
            	    match(input,BARBAR,FOLLOW_BARBAR_in_conditionalOrExpression6493); if (state.failed) return lisUsosId;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression6499);
            	    c2=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(c2!=null){lisUsosId.addAll(c2);}}

            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, conditionalOrExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // Java.g:866:1: conditionalAndExpression returns [ArrayList<UsoId> lisUsosId] : i1= inclusiveOrExpression ( '&&' i2= inclusiveOrExpression )* ;
    public final ArrayList<UsoId> conditionalAndExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int conditionalAndExpression_StartIndex = input.index();

        ArrayList<UsoId> i1 =null;

        ArrayList<UsoId> i2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return lisUsosId; }

            // Java.g:867:5: (i1= inclusiveOrExpression ( '&&' i2= inclusiveOrExpression )* )
            // Java.g:867:9: i1= inclusiveOrExpression ( '&&' i2= inclusiveOrExpression )*
            {
            pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6539);
            i1=inclusiveOrExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = i1;}

            // Java.g:868:9: ( '&&' i2= inclusiveOrExpression )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==AMPAMP) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // Java.g:868:10: '&&' i2= inclusiveOrExpression
            	    {
            	    match(input,AMPAMP,FOLLOW_AMPAMP_in_conditionalAndExpression6552); if (state.failed) return lisUsosId;

            	    pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6558);
            	    i2=inclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(i2!=null){lisUsosId.addAll(i2);}}

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, conditionalAndExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "inclusiveOrExpression"
    // Java.g:872:1: inclusiveOrExpression returns [ArrayList<UsoId> lisUsosId] : e1= exclusiveOrExpression ( '|' e2= exclusiveOrExpression )* ;
    public final ArrayList<UsoId> inclusiveOrExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int inclusiveOrExpression_StartIndex = input.index();

        ArrayList<UsoId> e1 =null;

        ArrayList<UsoId> e2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return lisUsosId; }

            // Java.g:873:5: (e1= exclusiveOrExpression ( '|' e2= exclusiveOrExpression )* )
            // Java.g:873:9: e1= exclusiveOrExpression ( '|' e2= exclusiveOrExpression )*
            {
            pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6598);
            e1=exclusiveOrExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = e1;}

            // Java.g:874:9: ( '|' e2= exclusiveOrExpression )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==BAR) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // Java.g:874:10: '|' e2= exclusiveOrExpression
            	    {
            	    match(input,BAR,FOLLOW_BAR_in_inclusiveOrExpression6611); if (state.failed) return lisUsosId;

            	    pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6617);
            	    e2=exclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(e2!=null){lisUsosId.addAll(e2);}}

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, inclusiveOrExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "inclusiveOrExpression"



    // $ANTLR start "exclusiveOrExpression"
    // Java.g:878:1: exclusiveOrExpression returns [ArrayList<UsoId> lisUsosId] : a1= andExpression ( '^' a2= andExpression )* ;
    public final ArrayList<UsoId> exclusiveOrExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int exclusiveOrExpression_StartIndex = input.index();

        ArrayList<UsoId> a1 =null;

        ArrayList<UsoId> a2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return lisUsosId; }

            // Java.g:879:5: (a1= andExpression ( '^' a2= andExpression )* )
            // Java.g:879:9: a1= andExpression ( '^' a2= andExpression )*
            {
            pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression6657);
            a1=andExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = a1;}

            // Java.g:880:9: ( '^' a2= andExpression )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==CARET) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // Java.g:880:10: '^' a2= andExpression
            	    {
            	    match(input,CARET,FOLLOW_CARET_in_exclusiveOrExpression6670); if (state.failed) return lisUsosId;

            	    pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression6676);
            	    a2=andExpression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(a2!=null){lisUsosId.addAll(a2);}}

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, exclusiveOrExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "exclusiveOrExpression"



    // $ANTLR start "andExpression"
    // Java.g:884:1: andExpression returns [ArrayList<UsoId> lisUsosId] : e1= equalityExpression ( '&' e2= equalityExpression )* ;
    public final ArrayList<UsoId> andExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int andExpression_StartIndex = input.index();

        ArrayList<UsoId> e1 =null;

        ArrayList<UsoId> e2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return lisUsosId; }

            // Java.g:885:5: (e1= equalityExpression ( '&' e2= equalityExpression )* )
            // Java.g:885:9: e1= equalityExpression ( '&' e2= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_andExpression6716);
            e1=equalityExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = e1;}

            // Java.g:886:9: ( '&' e2= equalityExpression )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==AMP) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // Java.g:886:10: '&' e2= equalityExpression
            	    {
            	    match(input,AMP,FOLLOW_AMP_in_andExpression6729); if (state.failed) return lisUsosId;

            	    pushFollow(FOLLOW_equalityExpression_in_andExpression6735);
            	    e2=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(e2!=null){lisUsosId.addAll(e2);}}

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 77, andExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "andExpression"



    // $ANTLR start "equalityExpression"
    // Java.g:890:1: equalityExpression returns [ArrayList<UsoId> lisUsosId] : i1= instanceOfExpression ( ( '==' | '!=' ) i2= instanceOfExpression )* ;
    public final ArrayList<UsoId> equalityExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int equalityExpression_StartIndex = input.index();

        ArrayList<UsoId> i1 =null;

        ArrayList<UsoId> i2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return lisUsosId; }

            // Java.g:891:5: (i1= instanceOfExpression ( ( '==' | '!=' ) i2= instanceOfExpression )* )
            // Java.g:891:9: i1= instanceOfExpression ( ( '==' | '!=' ) i2= instanceOfExpression )*
            {
            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression6775);
            i1=instanceOfExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = i1;}

            // Java.g:892:9: ( ( '==' | '!=' ) i2= instanceOfExpression )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==BANGEQ||LA119_0==EQEQ) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // Java.g:893:13: ( '==' | '!=' ) i2= instanceOfExpression
            	    {
            	    if ( input.LA(1)==BANGEQ||input.LA(1)==EQEQ ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return lisUsosId;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression6858);
            	    i2=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(i2!=null){lisUsosId.addAll(i2);}}

            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 78, equalityExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "instanceOfExpression"
    // Java.g:900:1: instanceOfExpression returns [ArrayList<UsoId> lisUsosId] : r1= relationalExpression ( 'instanceof' type )? ;
    public final ArrayList<UsoId> instanceOfExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int instanceOfExpression_StartIndex = input.index();

        ArrayList<UsoId> r1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return lisUsosId; }

            // Java.g:901:5: (r1= relationalExpression ( 'instanceof' type )? )
            // Java.g:901:9: r1= relationalExpression ( 'instanceof' type )?
            {
            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression6898);
            r1=relationalExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = r1;}

            // Java.g:902:9: ( 'instanceof' type )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==INSTANCEOF) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // Java.g:902:10: 'instanceof' type
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression6911); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_type_in_instanceOfExpression6913);
                    type();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 79, instanceOfExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "instanceOfExpression"



    // $ANTLR start "relationalExpression"
    // Java.g:906:1: relationalExpression returns [ArrayList<UsoId> lisUsosId] : h1= shiftExpression ( relationalOp h2= shiftExpression )* ;
    public final ArrayList<UsoId> relationalExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int relationalExpression_StartIndex = input.index();

        ArrayList<UsoId> h1 =null;

        ArrayList<UsoId> h2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return lisUsosId; }

            // Java.g:907:5: (h1= shiftExpression ( relationalOp h2= shiftExpression )* )
            // Java.g:907:9: h1= shiftExpression ( relationalOp h2= shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpression6951);
            h1=shiftExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {if(h1!=null){lisUsosId = h1;}}

            // Java.g:908:9: ( relationalOp h2= shiftExpression )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==LT) ) {
                    int LA121_2 = input.LA(2);

                    if ( (LA121_2==BANG||LA121_2==BOOLEAN||LA121_2==BYTE||(LA121_2 >= CHAR && LA121_2 <= CHARLITERAL)||(LA121_2 >= DOUBLE && LA121_2 <= DOUBLELITERAL)||LA121_2==EQ||LA121_2==FALSE||(LA121_2 >= FLOAT && LA121_2 <= FLOATLITERAL)||LA121_2==IDENTIFIER||LA121_2==INT||LA121_2==INTLITERAL||(LA121_2 >= LONG && LA121_2 <= LPAREN)||(LA121_2 >= NEW && LA121_2 <= NULL)||LA121_2==PLUS||LA121_2==PLUSPLUS||LA121_2==SHORT||(LA121_2 >= STRINGLITERAL && LA121_2 <= SUB)||(LA121_2 >= SUBSUB && LA121_2 <= SUPER)||LA121_2==THIS||LA121_2==TILDE||LA121_2==TRUE||LA121_2==VOID) ) {
                        alt121=1;
                    }


                }
                else if ( (LA121_0==GT) ) {
                    int LA121_3 = input.LA(2);

                    if ( (LA121_3==BANG||LA121_3==BOOLEAN||LA121_3==BYTE||(LA121_3 >= CHAR && LA121_3 <= CHARLITERAL)||(LA121_3 >= DOUBLE && LA121_3 <= DOUBLELITERAL)||LA121_3==EQ||LA121_3==FALSE||(LA121_3 >= FLOAT && LA121_3 <= FLOATLITERAL)||LA121_3==IDENTIFIER||LA121_3==INT||LA121_3==INTLITERAL||(LA121_3 >= LONG && LA121_3 <= LPAREN)||(LA121_3 >= NEW && LA121_3 <= NULL)||LA121_3==PLUS||LA121_3==PLUSPLUS||LA121_3==SHORT||(LA121_3 >= STRINGLITERAL && LA121_3 <= SUB)||(LA121_3 >= SUBSUB && LA121_3 <= SUPER)||LA121_3==THIS||LA121_3==TILDE||LA121_3==TRUE||LA121_3==VOID) ) {
                        alt121=1;
                    }


                }


                switch (alt121) {
            	case 1 :
            	    // Java.g:908:10: relationalOp h2= shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression6964);
            	    relationalOp();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression6970);
            	    h2=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(h2!=null){lisUsosId.addAll(h2);}}

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 80, relationalExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "relationalOp"
    // Java.g:912:1: relationalOp : ( '<' '=' | '>' '=' | '<' | '>' );
    public final void relationalOp() throws RecognitionException {
        int relationalOp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }

            // Java.g:913:5: ( '<' '=' | '>' '=' | '<' | '>' )
            int alt122=4;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==LT) ) {
                int LA122_1 = input.LA(2);

                if ( (LA122_1==EQ) ) {
                    alt122=1;
                }
                else if ( (LA122_1==BANG||LA122_1==BOOLEAN||LA122_1==BYTE||(LA122_1 >= CHAR && LA122_1 <= CHARLITERAL)||(LA122_1 >= DOUBLE && LA122_1 <= DOUBLELITERAL)||LA122_1==FALSE||(LA122_1 >= FLOAT && LA122_1 <= FLOATLITERAL)||LA122_1==IDENTIFIER||LA122_1==INT||LA122_1==INTLITERAL||(LA122_1 >= LONG && LA122_1 <= LPAREN)||(LA122_1 >= NEW && LA122_1 <= NULL)||LA122_1==PLUS||LA122_1==PLUSPLUS||LA122_1==SHORT||(LA122_1 >= STRINGLITERAL && LA122_1 <= SUB)||(LA122_1 >= SUBSUB && LA122_1 <= SUPER)||LA122_1==THIS||LA122_1==TILDE||LA122_1==TRUE||LA122_1==VOID) ) {
                    alt122=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 122, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA122_0==GT) ) {
                int LA122_2 = input.LA(2);

                if ( (LA122_2==EQ) ) {
                    alt122=2;
                }
                else if ( (LA122_2==BANG||LA122_2==BOOLEAN||LA122_2==BYTE||(LA122_2 >= CHAR && LA122_2 <= CHARLITERAL)||(LA122_2 >= DOUBLE && LA122_2 <= DOUBLELITERAL)||LA122_2==FALSE||(LA122_2 >= FLOAT && LA122_2 <= FLOATLITERAL)||LA122_2==IDENTIFIER||LA122_2==INT||LA122_2==INTLITERAL||(LA122_2 >= LONG && LA122_2 <= LPAREN)||(LA122_2 >= NEW && LA122_2 <= NULL)||LA122_2==PLUS||LA122_2==PLUSPLUS||LA122_2==SHORT||(LA122_2 >= STRINGLITERAL && LA122_2 <= SUB)||(LA122_2 >= SUBSUB && LA122_2 <= SUPER)||LA122_2==THIS||LA122_2==TILDE||LA122_2==TRUE||LA122_2==VOID) ) {
                    alt122=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 122, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;

            }
            switch (alt122) {
                case 1 :
                    // Java.g:913:10: '<' '='
                    {
                    match(input,LT,FOLLOW_LT_in_relationalOp7003); if (state.failed) return ;

                    match(input,EQ,FOLLOW_EQ_in_relationalOp7005); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:914:10: '>' '='
                    {
                    match(input,GT,FOLLOW_GT_in_relationalOp7016); if (state.failed) return ;

                    match(input,EQ,FOLLOW_EQ_in_relationalOp7018); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:915:9: '<'
                    {
                    match(input,LT,FOLLOW_LT_in_relationalOp7028); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Java.g:916:9: '>'
                    {
                    match(input,GT,FOLLOW_GT_in_relationalOp7038); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 81, relationalOp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "relationalOp"



    // $ANTLR start "shiftExpression"
    // Java.g:919:1: shiftExpression returns [ArrayList<UsoId> lisUsosId] : a1= additiveExpression ( shiftOp a2= additiveExpression )* ;
    public final ArrayList<UsoId> shiftExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int shiftExpression_StartIndex = input.index();

        ArrayList<UsoId> a1 =null;

        ArrayList<UsoId> a2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return lisUsosId; }

            // Java.g:920:5: (a1= additiveExpression ( shiftOp a2= additiveExpression )* )
            // Java.g:920:9: a1= additiveExpression ( shiftOp a2= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression7065);
            a1=additiveExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = a1;}

            // Java.g:921:9: ( shiftOp a2= additiveExpression )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==LT) ) {
                    int LA123_1 = input.LA(2);

                    if ( (LA123_1==LT) ) {
                        int LA123_4 = input.LA(3);

                        if ( (LA123_4==BANG||LA123_4==BOOLEAN||LA123_4==BYTE||(LA123_4 >= CHAR && LA123_4 <= CHARLITERAL)||(LA123_4 >= DOUBLE && LA123_4 <= DOUBLELITERAL)||LA123_4==FALSE||(LA123_4 >= FLOAT && LA123_4 <= FLOATLITERAL)||LA123_4==IDENTIFIER||LA123_4==INT||LA123_4==INTLITERAL||(LA123_4 >= LONG && LA123_4 <= LPAREN)||(LA123_4 >= NEW && LA123_4 <= NULL)||LA123_4==PLUS||LA123_4==PLUSPLUS||LA123_4==SHORT||(LA123_4 >= STRINGLITERAL && LA123_4 <= SUB)||(LA123_4 >= SUBSUB && LA123_4 <= SUPER)||LA123_4==THIS||LA123_4==TILDE||LA123_4==TRUE||LA123_4==VOID) ) {
                            alt123=1;
                        }


                    }


                }
                else if ( (LA123_0==GT) ) {
                    int LA123_2 = input.LA(2);

                    if ( (LA123_2==GT) ) {
                        int LA123_5 = input.LA(3);

                        if ( (LA123_5==GT) ) {
                            int LA123_7 = input.LA(4);

                            if ( (LA123_7==BANG||LA123_7==BOOLEAN||LA123_7==BYTE||(LA123_7 >= CHAR && LA123_7 <= CHARLITERAL)||(LA123_7 >= DOUBLE && LA123_7 <= DOUBLELITERAL)||LA123_7==FALSE||(LA123_7 >= FLOAT && LA123_7 <= FLOATLITERAL)||LA123_7==IDENTIFIER||LA123_7==INT||LA123_7==INTLITERAL||(LA123_7 >= LONG && LA123_7 <= LPAREN)||(LA123_7 >= NEW && LA123_7 <= NULL)||LA123_7==PLUS||LA123_7==PLUSPLUS||LA123_7==SHORT||(LA123_7 >= STRINGLITERAL && LA123_7 <= SUB)||(LA123_7 >= SUBSUB && LA123_7 <= SUPER)||LA123_7==THIS||LA123_7==TILDE||LA123_7==TRUE||LA123_7==VOID) ) {
                                alt123=1;
                            }


                        }
                        else if ( (LA123_5==BANG||LA123_5==BOOLEAN||LA123_5==BYTE||(LA123_5 >= CHAR && LA123_5 <= CHARLITERAL)||(LA123_5 >= DOUBLE && LA123_5 <= DOUBLELITERAL)||LA123_5==FALSE||(LA123_5 >= FLOAT && LA123_5 <= FLOATLITERAL)||LA123_5==IDENTIFIER||LA123_5==INT||LA123_5==INTLITERAL||(LA123_5 >= LONG && LA123_5 <= LPAREN)||(LA123_5 >= NEW && LA123_5 <= NULL)||LA123_5==PLUS||LA123_5==PLUSPLUS||LA123_5==SHORT||(LA123_5 >= STRINGLITERAL && LA123_5 <= SUB)||(LA123_5 >= SUBSUB && LA123_5 <= SUPER)||LA123_5==THIS||LA123_5==TILDE||LA123_5==TRUE||LA123_5==VOID) ) {
                            alt123=1;
                        }


                    }


                }


                switch (alt123) {
            	case 1 :
            	    // Java.g:921:10: shiftOp a2= additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_shiftExpression7078);
            	    shiftOp();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression7084);
            	    a2=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(a2!=null){lisUsosId.addAll(a2);}}

            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 82, shiftExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "shiftExpression"



    // $ANTLR start "shiftOp"
    // Java.g:926:1: shiftOp : ( '<' '<' | '>' '>' '>' | '>' '>' );
    public final void shiftOp() throws RecognitionException {
        int shiftOp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }

            // Java.g:927:5: ( '<' '<' | '>' '>' '>' | '>' '>' )
            int alt124=3;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==LT) ) {
                alt124=1;
            }
            else if ( (LA124_0==GT) ) {
                int LA124_2 = input.LA(2);

                if ( (LA124_2==GT) ) {
                    int LA124_3 = input.LA(3);

                    if ( (LA124_3==GT) ) {
                        alt124=2;
                    }
                    else if ( (LA124_3==BANG||LA124_3==BOOLEAN||LA124_3==BYTE||(LA124_3 >= CHAR && LA124_3 <= CHARLITERAL)||(LA124_3 >= DOUBLE && LA124_3 <= DOUBLELITERAL)||LA124_3==FALSE||(LA124_3 >= FLOAT && LA124_3 <= FLOATLITERAL)||LA124_3==IDENTIFIER||LA124_3==INT||LA124_3==INTLITERAL||(LA124_3 >= LONG && LA124_3 <= LPAREN)||(LA124_3 >= NEW && LA124_3 <= NULL)||LA124_3==PLUS||LA124_3==PLUSPLUS||LA124_3==SHORT||(LA124_3 >= STRINGLITERAL && LA124_3 <= SUB)||(LA124_3 >= SUBSUB && LA124_3 <= SUPER)||LA124_3==THIS||LA124_3==TILDE||LA124_3==TRUE||LA124_3==VOID) ) {
                        alt124=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 124, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;

            }
            switch (alt124) {
                case 1 :
                    // Java.g:927:10: '<' '<'
                    {
                    match(input,LT,FOLLOW_LT_in_shiftOp7119); if (state.failed) return ;

                    match(input,LT,FOLLOW_LT_in_shiftOp7121); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:928:10: '>' '>' '>'
                    {
                    match(input,GT,FOLLOW_GT_in_shiftOp7132); if (state.failed) return ;

                    match(input,GT,FOLLOW_GT_in_shiftOp7134); if (state.failed) return ;

                    match(input,GT,FOLLOW_GT_in_shiftOp7136); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:929:10: '>' '>'
                    {
                    match(input,GT,FOLLOW_GT_in_shiftOp7147); if (state.failed) return ;

                    match(input,GT,FOLLOW_GT_in_shiftOp7149); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 83, shiftOp_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "shiftOp"



    // $ANTLR start "additiveExpression"
    // Java.g:933:1: additiveExpression returns [ArrayList<UsoId> lisUsosId] : m1= multiplicativeExpression ( ( '+' | '-' ) m2= multiplicativeExpression )* ;
    public final ArrayList<UsoId> additiveExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int additiveExpression_StartIndex = input.index();

        ArrayList<UsoId> m1 =null;

        ArrayList<UsoId> m2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return lisUsosId; }

            // Java.g:934:5: (m1= multiplicativeExpression ( ( '+' | '-' ) m2= multiplicativeExpression )* )
            // Java.g:934:9: m1= multiplicativeExpression ( ( '+' | '-' ) m2= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression7177);
            m1=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = m1;}

            // Java.g:935:9: ( ( '+' | '-' ) m2= multiplicativeExpression )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==PLUS||LA125_0==SUB) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // Java.g:936:13: ( '+' | '-' ) m2= multiplicativeExpression
            	    {
            	    if ( input.LA(1)==PLUS||input.LA(1)==SUB ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return lisUsosId;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression7260);
            	    m2=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(m2!=null){lisUsosId.addAll(m2);}}

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 84, additiveExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // Java.g:943:1: multiplicativeExpression returns [ArrayList<UsoId> lisUsosId] : u1= unaryExpression ( ( '*' | '/' | '%' ) u2= unaryExpression )* ;
    public final ArrayList<UsoId> multiplicativeExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int multiplicativeExpression_StartIndex = input.index();

        ArrayList<UsoId> u1 =null;

        ArrayList<UsoId> u2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return lisUsosId; }

            // Java.g:944:5: (u1= unaryExpression ( ( '*' | '/' | '%' ) u2= unaryExpression )* )
            // Java.g:945:9: u1= unaryExpression ( ( '*' | '/' | '%' ) u2= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression7307);
            u1=unaryExpression();

            state._fsp--;
            if (state.failed) return lisUsosId;

            if ( state.backtracking==0 ) {lisUsosId = u1;}

            // Java.g:946:9: ( ( '*' | '/' | '%' ) u2= unaryExpression )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==PERCENT||LA126_0==SLASH||LA126_0==STAR) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // Java.g:947:13: ( '*' | '/' | '%' ) u2= unaryExpression
            	    {
            	    if ( input.LA(1)==PERCENT||input.LA(1)==SLASH||input.LA(1)==STAR ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return lisUsosId;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression7408);
            	    u2=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return lisUsosId;

            	    if ( state.backtracking==0 ) {if(u2!=null){lisUsosId.addAll(u2);}}

            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 85, multiplicativeExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // Java.g:959:1: unaryExpression returns [ArrayList<UsoId> lisUsosId] : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |u= unaryExpressionNotPlusMinus );
    public final ArrayList<UsoId> unaryExpression() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int unaryExpression_StartIndex = input.index();

        ArrayList<UsoId> u =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return lisUsosId; }

            // Java.g:960:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |u= unaryExpressionNotPlusMinus )
            int alt127=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt127=1;
                }
                break;
            case SUB:
                {
                alt127=2;
                }
                break;
            case PLUSPLUS:
                {
                alt127=3;
                }
                break;
            case SUBSUB:
                {
                alt127=4;
                }
                break;
            case BANG:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CHARLITERAL:
            case DOUBLE:
            case DOUBLELITERAL:
            case FALSE:
            case FLOAT:
            case FLOATLITERAL:
            case IDENTIFIER:
            case INT:
            case INTLITERAL:
            case LONG:
            case LONGLITERAL:
            case LPAREN:
            case NEW:
            case NULL:
            case SHORT:
            case STRINGLITERAL:
            case SUPER:
            case THIS:
            case TILDE:
            case TRUE:
            case VOID:
                {
                alt127=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;

            }

            switch (alt127) {
                case 1 :
                    // Java.g:960:9: '+' unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression7447); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression7450);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 2 :
                    // Java.g:961:9: '-' unaryExpression
                    {
                    match(input,SUB,FOLLOW_SUB_in_unaryExpression7460); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression7462);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 3 :
                    // Java.g:962:9: '++' unaryExpression
                    {
                    match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unaryExpression7472); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression7474);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 4 :
                    // Java.g:963:9: '--' unaryExpression
                    {
                    match(input,SUBSUB,FOLLOW_SUBSUB_in_unaryExpression7484); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression7486);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 5 :
                    // Java.g:964:9: u= unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression7500);
                    u=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId = u;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 86, unaryExpression_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "unaryExpressionNotPlusMinus"
    // Java.g:967:1: unaryExpressionNotPlusMinus returns [ArrayList<UsoId> lisUsosId] : ( '~' unaryExpression | '!' unaryExpression | castExpression |p= primary (s1= selector )* ( '++' | '--' )? );
    public final ArrayList<UsoId> unaryExpressionNotPlusMinus() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        ArrayList<UsoId> p =null;

        ArrayList<UsoId> s1 =null;



            lisUsosId = new ArrayList<UsoId>(); 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return lisUsosId; }

            // Java.g:971:5: ( '~' unaryExpression | '!' unaryExpression | castExpression |p= primary (s1= selector )* ( '++' | '--' )? )
            int alt130=4;
            switch ( input.LA(1) ) {
            case TILDE:
                {
                alt130=1;
                }
                break;
            case BANG:
                {
                alt130=2;
                }
                break;
            case LPAREN:
                {
                int LA130_3 = input.LA(2);

                if ( (synpred202_Java()) ) {
                    alt130=3;
                }
                else if ( (true) ) {
                    alt130=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 3, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CHARLITERAL:
            case DOUBLE:
            case DOUBLELITERAL:
            case FALSE:
            case FLOAT:
            case FLOATLITERAL:
            case IDENTIFIER:
            case INT:
            case INTLITERAL:
            case LONG:
            case LONGLITERAL:
            case NEW:
            case NULL:
            case SHORT:
            case STRINGLITERAL:
            case SUPER:
            case THIS:
            case TRUE:
            case VOID:
                {
                alt130=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;

            }

            switch (alt130) {
                case 1 :
                    // Java.g:971:9: '~' unaryExpression
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_unaryExpressionNotPlusMinus7529); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus7531);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 2 :
                    // Java.g:972:9: '!' unaryExpression
                    {
                    match(input,BANG,FOLLOW_BANG_in_unaryExpressionNotPlusMinus7541); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus7543);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 3 :
                    // Java.g:973:9: castExpression
                    {
                    pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus7553);
                    castExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 4 :
                    // Java.g:974:9: p= primary (s1= selector )* ( '++' | '--' )?
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus7567);
                    p=primary();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId = p;}

                    // Java.g:975:9: (s1= selector )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==DOT||LA128_0==LBRACKET) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // Java.g:975:10: s1= selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus7584);
                    	    s1=selector();

                    	    state._fsp--;
                    	    if (state.failed) return lisUsosId;

                    	    if ( state.backtracking==0 ) {lisUsosId.addAll(s1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);


                    // Java.g:977:9: ( '++' | '--' )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==PLUSPLUS||LA129_0==SUBSUB) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // Java.g:
                            {
                            if ( input.LA(1)==PLUSPLUS||input.LA(1)==SUBSUB ) {
                                input.consume();
                                state.errorRecovery=false;
                                state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 87, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"



    // $ANTLR start "castExpression"
    // Java.g:982:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' type ')' unaryExpressionNotPlusMinus );
    public final void castExpression() throws RecognitionException {
        int castExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }

            // Java.g:983:5: ( '(' primitiveType ')' unaryExpression | '(' type ')' unaryExpressionNotPlusMinus )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==LPAREN) ) {
                int LA131_1 = input.LA(2);

                if ( (synpred206_Java()) ) {
                    alt131=1;
                }
                else if ( (true) ) {
                    alt131=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;

            }
            switch (alt131) {
                case 1 :
                    // Java.g:983:9: '(' primitiveType ')' unaryExpression
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_castExpression7656); if (state.failed) return ;

                    pushFollow(FOLLOW_primitiveType_in_castExpression7658);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,RPAREN,FOLLOW_RPAREN_in_castExpression7660); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_castExpression7662);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:984:9: '(' type ')' unaryExpressionNotPlusMinus
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_castExpression7672); if (state.failed) return ;

                    pushFollow(FOLLOW_type_in_castExpression7674);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,RPAREN,FOLLOW_RPAREN_in_castExpression7676); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression7678);
                    unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 88, castExpression_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "castExpression"



    // $ANTLR start "primary"
    // Java.g:990:1: primary returns [ArrayList<UsoId> lisUsosId] : (p1= parExpression | 'this' ( '.' Id1= IDENTIFIER )* (ids1= identifierSuffix )? |Id2= IDENTIFIER ( '.' Id3= IDENTIFIER )* (ids2= identifierSuffix )? | 'super' s1= superSuffix | literal | creator | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
    public final ArrayList<UsoId> primary() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int primary_StartIndex = input.index();

        Token Id1=null;
        Token Id2=null;
        Token Id3=null;
        ArrayList<UsoId> p1 =null;

        JavaParser.identifierSuffix_return ids1 =null;

        JavaParser.identifierSuffix_return ids2 =null;

        ArrayList<UsoId> s1 =null;



            lisUsosId = new ArrayList<UsoId>(); //lista que se crea en nodo 'hoja'
            UsoId ui = null;    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return lisUsosId; }

            // Java.g:995:5: (p1= parExpression | 'this' ( '.' Id1= IDENTIFIER )* (ids1= identifierSuffix )? |Id2= IDENTIFIER ( '.' Id3= IDENTIFIER )* (ids2= identifierSuffix )? | 'super' s1= superSuffix | literal | creator | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
            int alt137=8;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt137=1;
                }
                break;
            case THIS:
                {
                alt137=2;
                }
                break;
            case IDENTIFIER:
                {
                alt137=3;
                }
                break;
            case SUPER:
                {
                alt137=4;
                }
                break;
            case CHARLITERAL:
            case DOUBLELITERAL:
            case FALSE:
            case FLOATLITERAL:
            case INTLITERAL:
            case LONGLITERAL:
            case NULL:
            case STRINGLITERAL:
            case TRUE:
                {
                alt137=5;
                }
                break;
            case NEW:
                {
                alt137=6;
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                alt137=7;
                }
                break;
            case VOID:
                {
                alt137=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }

            switch (alt137) {
                case 1 :
                    // Java.g:995:9: p1= parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary7712);
                    p1=parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId = p1;}

                    }
                    break;
                case 2 :
                    // Java.g:996:9: 'this' ( '.' Id1= IDENTIFIER )* (ids1= identifierSuffix )?
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary7724); if (state.failed) return lisUsosId;

                    // Java.g:997:9: ( '.' Id1= IDENTIFIER )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==DOT) ) {
                            int LA132_2 = input.LA(2);

                            if ( (LA132_2==IDENTIFIER) ) {
                                int LA132_3 = input.LA(3);

                                if ( (synpred208_Java()) ) {
                                    alt132=1;
                                }


                            }


                        }


                        switch (alt132) {
                    	case 1 :
                    	    // Java.g:997:10: '.' Id1= IDENTIFIER
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_primary7735); if (state.failed) return lisUsosId;

                    	    Id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary7741); if (state.failed) return lisUsosId;

                    	    if ( state.backtracking==0 ) {if(Id1 != null){ui = new UsoId(Id1.getText(),Id1.getLine(),false); lisUsosId.add(ui);}}

                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);


                    // Java.g:1000:9: (ids1= identifierSuffix )?
                    int alt133=2;
                    switch ( input.LA(1) ) {
                        case LBRACKET:
                            {
                            int LA133_1 = input.LA(2);

                            if ( (synpred209_Java()) ) {
                                alt133=1;
                            }
                            }
                            break;
                        case LPAREN:
                            {
                            alt133=1;
                            }
                            break;
                        case DOT:
                            {
                            int LA133_3 = input.LA(2);

                            if ( (synpred209_Java()) ) {
                                alt133=1;
                            }
                            }
                            break;
                    }

                    switch (alt133) {
                        case 1 :
                            // Java.g:1000:10: ids1= identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primary7779);
                            ids1=identifierSuffix();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            if ( state.backtracking==0 ) {//remueve el ultimo y lo reinserta como metodo = true
                                    if(ids1.esMetodo && ui != null){lisUsosId.remove(lisUsosId.size() - 1);ui.setEsMetodo(true); lisUsosId.add(ui);}

                                    if(ids1.esMetodo){lisUsosId.addAll(ids1.lisUsosId);}}

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Java.g:1007:9: Id2= IDENTIFIER ( '.' Id3= IDENTIFIER )* (ids2= identifierSuffix )?
                    {
                    Id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary7824); if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {if(Id2 != null){ui = new UsoId(Id2.getText(),Id2.getLine(),false); lisUsosId.add(ui);}}

                    // Java.g:1008:9: ( '.' Id3= IDENTIFIER )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==DOT) ) {
                            int LA134_2 = input.LA(2);

                            if ( (LA134_2==IDENTIFIER) ) {
                                int LA134_3 = input.LA(3);

                                if ( (synpred211_Java()) ) {
                                    alt134=1;
                                }


                            }


                        }


                        switch (alt134) {
                    	case 1 :
                    	    // Java.g:1008:10: '.' Id3= IDENTIFIER
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_primary7837); if (state.failed) return lisUsosId;

                    	    Id3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary7843); if (state.failed) return lisUsosId;

                    	    if ( state.backtracking==0 ) {if(Id3 != null){ui = new UsoId(Id3.getText(),Id3.getLine(),false); lisUsosId.add(ui);}}

                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);


                    // Java.g:1010:9: (ids2= identifierSuffix )?
                    int alt135=2;
                    switch ( input.LA(1) ) {
                        case LBRACKET:
                            {
                            int LA135_1 = input.LA(2);

                            if ( (synpred212_Java()) ) {
                                alt135=1;
                            }
                            }
                            break;
                        case LPAREN:
                            {
                            alt135=1;
                            }
                            break;
                        case DOT:
                            {
                            int LA135_3 = input.LA(2);

                            if ( (synpred212_Java()) ) {
                                alt135=1;
                            }
                            }
                            break;
                    }

                    switch (alt135) {
                        case 1 :
                            // Java.g:1010:10: ids2= identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primary7893);
                            ids2=identifierSuffix();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            if ( state.backtracking==0 ) {//remueve el ultimo y lo reinserta como metodo = true
                                    if(ids2.esMetodo && ui != null){lisUsosId.remove(lisUsosId.size() - 1);ui.setEsMetodo(true); lisUsosId.add(ui);}

                                    if(ids2.esMetodo){lisUsosId.addAll(ids2.lisUsosId);}}

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Java.g:1017:9: 'super' s1= superSuffix
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primary7934); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_superSuffix_in_primary7948);
                    s1=superSuffix();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId = s1;}

                    }
                    break;
                case 5 :
                    // Java.g:1019:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primary7960);
                    literal();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 6 :
                    // Java.g:1020:9: creator
                    {
                    pushFollow(FOLLOW_creator_in_primary7970);
                    creator();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 7 :
                    // Java.g:1021:9: primitiveType ( '[' ']' )* '.' 'class'
                    {
                    pushFollow(FOLLOW_primitiveType_in_primary7996);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    // Java.g:1022:9: ( '[' ']' )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==LBRACKET) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // Java.g:1022:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_primary8007); if (state.failed) return lisUsosId;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_primary8009); if (state.failed) return lisUsosId;

                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);


                    match(input,DOT,FOLLOW_DOT_in_primary8030); if (state.failed) return lisUsosId;

                    match(input,CLASS,FOLLOW_CLASS_in_primary8032); if (state.failed) return lisUsosId;

                    }
                    break;
                case 8 :
                    // Java.g:1025:9: 'void' '.' 'class'
                    {
                    match(input,VOID,FOLLOW_VOID_in_primary8042); if (state.failed) return lisUsosId;

                    match(input,DOT,FOLLOW_DOT_in_primary8044); if (state.failed) return lisUsosId;

                    match(input,CLASS,FOLLOW_CLASS_in_primary8046); if (state.failed) return lisUsosId;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 89, primary_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "primary"



    // $ANTLR start "superSuffix"
    // Java.g:1029:1: superSuffix returns [ArrayList<UsoId> lisUsosId] : (a1= arguments | '.' ( typeArguments )? id1= IDENTIFIER (a2= arguments )? );
    public final ArrayList<UsoId> superSuffix() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int superSuffix_StartIndex = input.index();

        Token id1=null;
        ArrayList<UsoId> a1 =null;

        ArrayList<UsoId> a2 =null;



            lisUsosId = new ArrayList<UsoId>();
            boolean esMet = false;    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return lisUsosId; }

            // Java.g:1034:5: (a1= arguments | '.' ( typeArguments )? id1= IDENTIFIER (a2= arguments )? )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==LPAREN) ) {
                alt140=1;
            }
            else if ( (LA140_0==DOT) ) {
                alt140=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;

            }
            switch (alt140) {
                case 1 :
                    // Java.g:1034:9: a1= arguments
                    {
                    pushFollow(FOLLOW_arguments_in_superSuffix8084);
                    a1=arguments();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId = a1;}

                    }
                    break;
                case 2 :
                    // Java.g:1035:9: '.' ( typeArguments )? id1= IDENTIFIER (a2= arguments )?
                    {
                    match(input,DOT,FOLLOW_DOT_in_superSuffix8096); if (state.failed) return lisUsosId;

                    // Java.g:1035:13: ( typeArguments )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==LT) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // Java.g:1035:14: typeArguments
                            {
                            pushFollow(FOLLOW_typeArguments_in_superSuffix8099);
                            typeArguments();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superSuffix8124); if (state.failed) return lisUsosId;

                    // Java.g:1038:9: (a2= arguments )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==LPAREN) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // Java.g:1038:10: a2= arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superSuffix8140);
                            a2=arguments();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            if ( state.backtracking==0 ) {lisUsosId = a2; esMet = true;}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {lisUsosId.add(new UsoId(id1.getText(),id1.getLine(),"global",esMet));}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 90, superSuffix_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "superSuffix"


    public static class identifierSuffix_return extends ParserRuleReturnScope {
        public ArrayList<UsoId> lisUsosId;
        public boolean esMetodo;
    };


    // $ANTLR start "identifierSuffix"
    // Java.g:1043:1: identifierSuffix returns [ArrayList<UsoId> lisUsosId, boolean esMetodo] : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ |a1= arguments | '.' 'class' | '.' nonWildcardTypeArguments IDENTIFIER arguments | '.' 'this' | '.' 'super' arguments | innerCreator );
    public final JavaParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
        JavaParser.identifierSuffix_return retval = new JavaParser.identifierSuffix_return();
        retval.start = input.LT(1);

        int identifierSuffix_StartIndex = input.index();

        ArrayList<UsoId> a1 =null;



            retval.lisUsosId = new ArrayList<UsoId>();
            retval.esMetodo =false;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

            // Java.g:1048:5: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ |a1= arguments | '.' 'class' | '.' nonWildcardTypeArguments IDENTIFIER arguments | '.' 'this' | '.' 'super' arguments | innerCreator )
            int alt143=8;
            switch ( input.LA(1) ) {
            case LBRACKET:
                {
                int LA143_1 = input.LA(2);

                if ( (LA143_1==RBRACKET) ) {
                    alt143=1;
                }
                else if ( (LA143_1==BANG||LA143_1==BOOLEAN||LA143_1==BYTE||(LA143_1 >= CHAR && LA143_1 <= CHARLITERAL)||(LA143_1 >= DOUBLE && LA143_1 <= DOUBLELITERAL)||LA143_1==FALSE||(LA143_1 >= FLOAT && LA143_1 <= FLOATLITERAL)||LA143_1==IDENTIFIER||LA143_1==INT||LA143_1==INTLITERAL||(LA143_1 >= LONG && LA143_1 <= LPAREN)||(LA143_1 >= NEW && LA143_1 <= NULL)||LA143_1==PLUS||LA143_1==PLUSPLUS||LA143_1==SHORT||(LA143_1 >= STRINGLITERAL && LA143_1 <= SUB)||(LA143_1 >= SUBSUB && LA143_1 <= SUPER)||LA143_1==THIS||LA143_1==TILDE||LA143_1==TRUE||LA143_1==VOID) ) {
                    alt143=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 143, 1, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                alt143=3;
                }
                break;
            case DOT:
                {
                switch ( input.LA(2) ) {
                case CLASS:
                    {
                    alt143=4;
                    }
                    break;
                case THIS:
                    {
                    alt143=6;
                    }
                    break;
                case SUPER:
                    {
                    alt143=7;
                    }
                    break;
                case NEW:
                    {
                    alt143=8;
                    }
                    break;
                case LT:
                    {
                    alt143=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 143, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;

            }

            switch (alt143) {
                case 1 :
                    // Java.g:1048:9: ( '[' ']' )+ '.' 'class'
                    {
                    // Java.g:1048:9: ( '[' ']' )+
                    int cnt141=0;
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==LBRACKET) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // Java.g:1048:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_identifierSuffix8184); if (state.failed) return retval;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_identifierSuffix8186); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt141 >= 1 ) break loop141;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(141, input);
                                throw eee;
                        }
                        cnt141++;
                    } while (true);


                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix8207); if (state.failed) return retval;

                    match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix8209); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Java.g:1051:9: ( '[' expression ']' )+
                    {
                    // Java.g:1051:9: ( '[' expression ']' )+
                    int cnt142=0;
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==LBRACKET) ) {
                            int LA142_2 = input.LA(2);

                            if ( (synpred224_Java()) ) {
                                alt142=1;
                            }


                        }


                        switch (alt142) {
                    	case 1 :
                    	    // Java.g:1051:10: '[' expression ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_identifierSuffix8220); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_identifierSuffix8222);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_identifierSuffix8224); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt142 >= 1 ) break loop142;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(142, input);
                                throw eee;
                        }
                        cnt142++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // Java.g:1053:9: a1= arguments
                    {
                    pushFollow(FOLLOW_arguments_in_identifierSuffix8249);
                    a1=arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.lisUsosId = a1; retval.esMetodo =true;}

                    }
                    break;
                case 4 :
                    // Java.g:1054:9: '.' 'class'
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix8261); if (state.failed) return retval;

                    match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix8263); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // Java.g:1055:9: '.' nonWildcardTypeArguments IDENTIFIER arguments
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix8273); if (state.failed) return retval;

                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_identifierSuffix8275);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierSuffix8277); if (state.failed) return retval;

                    pushFollow(FOLLOW_arguments_in_identifierSuffix8279);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Java.g:1056:9: '.' 'this'
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix8289); if (state.failed) return retval;

                    match(input,THIS,FOLLOW_THIS_in_identifierSuffix8291); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // Java.g:1057:9: '.' 'super' arguments
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix8301); if (state.failed) return retval;

                    match(input,SUPER,FOLLOW_SUPER_in_identifierSuffix8303); if (state.failed) return retval;

                    pushFollow(FOLLOW_arguments_in_identifierSuffix8305);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Java.g:1058:9: innerCreator
                    {
                    pushFollow(FOLLOW_innerCreator_in_identifierSuffix8315);
                    innerCreator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 91, identifierSuffix_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifierSuffix"



    // $ANTLR start "selector"
    // Java.g:1062:1: selector returns [ArrayList<UsoId> lisUsosId] : ( '.' id1= IDENTIFIER (a1= arguments )? | '.' 'this' | '.' 'super' superSuffix | innerCreator | '[' expression ']' );
    public final ArrayList<UsoId> selector() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int selector_StartIndex = input.index();

        Token id1=null;
        ArrayList<UsoId> a1 =null;



            lisUsosId = new ArrayList<UsoId>();
            boolean esMet = false;    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return lisUsosId; }

            // Java.g:1067:5: ( '.' id1= IDENTIFIER (a1= arguments )? | '.' 'this' | '.' 'super' superSuffix | innerCreator | '[' expression ']' )
            int alt145=5;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==DOT) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    alt145=1;
                    }
                    break;
                case THIS:
                    {
                    alt145=2;
                    }
                    break;
                case SUPER:
                    {
                    alt145=3;
                    }
                    break;
                case NEW:
                    {
                    alt145=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA145_0==LBRACKET) ) {
                alt145=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return lisUsosId;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;

            }
            switch (alt145) {
                case 1 :
                    // Java.g:1067:9: '.' id1= IDENTIFIER (a1= arguments )?
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector8343); if (state.failed) return lisUsosId;

                    id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector8349); if (state.failed) return lisUsosId;

                    // Java.g:1068:9: (a1= arguments )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==LPAREN) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // Java.g:1068:10: a1= arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector8365);
                            a1=arguments();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            if ( state.backtracking==0 ) {lisUsosId = a1; esMet = true;}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {lisUsosId.add(new UsoId(id1.getText(),id1.getLine(),"global",esMet));}

                    }
                    break;
                case 2 :
                    // Java.g:1070:9: '.' 'this'
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector8390); if (state.failed) return lisUsosId;

                    match(input,THIS,FOLLOW_THIS_in_selector8392); if (state.failed) return lisUsosId;

                    }
                    break;
                case 3 :
                    // Java.g:1071:9: '.' 'super' superSuffix
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector8402); if (state.failed) return lisUsosId;

                    match(input,SUPER,FOLLOW_SUPER_in_selector8404); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_superSuffix_in_selector8414);
                    superSuffix();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 4 :
                    // Java.g:1073:9: innerCreator
                    {
                    pushFollow(FOLLOW_innerCreator_in_selector8424);
                    innerCreator();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 5 :
                    // Java.g:1074:9: '[' expression ']'
                    {
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_selector8434); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_expression_in_selector8436);
                    expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,RBRACKET,FOLLOW_RBRACKET_in_selector8438); if (state.failed) return lisUsosId;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 92, selector_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "selector"



    // $ANTLR start "creator"
    // Java.g:1077:1: creator : ( 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest | 'new' classOrInterfaceType classCreatorRest | arrayCreator );
    public final void creator() throws RecognitionException {
        int creator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }

            // Java.g:1078:5: ( 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest | 'new' classOrInterfaceType classCreatorRest | arrayCreator )
            int alt146=3;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==NEW) ) {
                int LA146_1 = input.LA(2);

                if ( (synpred236_Java()) ) {
                    alt146=1;
                }
                else if ( (synpred237_Java()) ) {
                    alt146=2;
                }
                else if ( (true) ) {
                    alt146=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 146, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;

            }
            switch (alt146) {
                case 1 :
                    // Java.g:1078:9: 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest
                    {
                    match(input,NEW,FOLLOW_NEW_in_creator8458); if (state.failed) return ;

                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator8460);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_classOrInterfaceType_in_creator8462);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_classCreatorRest_in_creator8464);
                    classCreatorRest();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1079:9: 'new' classOrInterfaceType classCreatorRest
                    {
                    match(input,NEW,FOLLOW_NEW_in_creator8474); if (state.failed) return ;

                    pushFollow(FOLLOW_classOrInterfaceType_in_creator8476);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_classCreatorRest_in_creator8478);
                    classCreatorRest();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:1080:9: arrayCreator
                    {
                    pushFollow(FOLLOW_arrayCreator_in_creator8488);
                    arrayCreator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 93, creator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "creator"



    // $ANTLR start "arrayCreator"
    // Java.g:1083:1: arrayCreator : ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer | 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )* );
    public final void arrayCreator() throws RecognitionException {
        int arrayCreator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }

            // Java.g:1084:5: ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer | 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )* )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==NEW) ) {
                int LA150_1 = input.LA(2);

                if ( (synpred239_Java()) ) {
                    alt150=1;
                }
                else if ( (true) ) {
                    alt150=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 150, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;

            }
            switch (alt150) {
                case 1 :
                    // Java.g:1084:9: 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer
                    {
                    match(input,NEW,FOLLOW_NEW_in_arrayCreator8508); if (state.failed) return ;

                    pushFollow(FOLLOW_createdName_in_arrayCreator8510);
                    createdName();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8520); if (state.failed) return ;

                    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8522); if (state.failed) return ;

                    // Java.g:1086:9: ( '[' ']' )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==LBRACKET) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // Java.g:1086:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8533); if (state.failed) return ;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8535); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);


                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreator8556);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1090:9: 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )*
                    {
                    match(input,NEW,FOLLOW_NEW_in_arrayCreator8567); if (state.failed) return ;

                    pushFollow(FOLLOW_createdName_in_arrayCreator8569);
                    createdName();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8579); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_arrayCreator8581);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8591); if (state.failed) return ;

                    // Java.g:1093:9: ( '[' expression ']' )*
                    loop148:
                    do {
                        int alt148=2;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==LBRACKET) ) {
                            int LA148_1 = input.LA(2);

                            if ( (synpred240_Java()) ) {
                                alt148=1;
                            }


                        }


                        switch (alt148) {
                    	case 1 :
                    	    // Java.g:1093:13: '[' expression ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8605); if (state.failed) return ;

                    	    pushFollow(FOLLOW_expression_in_arrayCreator8607);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8621); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop148;
                        }
                    } while (true);


                    // Java.g:1096:9: ( '[' ']' )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==LBRACKET) ) {
                            int LA149_2 = input.LA(2);

                            if ( (LA149_2==RBRACKET) ) {
                                alt149=1;
                            }


                        }


                        switch (alt149) {
                    	case 1 :
                    	    // Java.g:1096:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8643); if (state.failed) return ;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8645); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 94, arrayCreator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "arrayCreator"



    // $ANTLR start "variableInitializer"
    // Java.g:1100:1: variableInitializer : ( arrayInitializer | expression );
    public final void variableInitializer() throws RecognitionException {
        int variableInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }

            // Java.g:1101:5: ( arrayInitializer | expression )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==LBRACE) ) {
                alt151=1;
            }
            else if ( (LA151_0==BANG||LA151_0==BOOLEAN||LA151_0==BYTE||(LA151_0 >= CHAR && LA151_0 <= CHARLITERAL)||(LA151_0 >= DOUBLE && LA151_0 <= DOUBLELITERAL)||LA151_0==FALSE||(LA151_0 >= FLOAT && LA151_0 <= FLOATLITERAL)||LA151_0==IDENTIFIER||LA151_0==INT||LA151_0==INTLITERAL||(LA151_0 >= LONG && LA151_0 <= LPAREN)||(LA151_0 >= NEW && LA151_0 <= NULL)||LA151_0==PLUS||LA151_0==PLUSPLUS||LA151_0==SHORT||(LA151_0 >= STRINGLITERAL && LA151_0 <= SUB)||(LA151_0 >= SUBSUB && LA151_0 <= SUPER)||LA151_0==THIS||LA151_0==TILDE||LA151_0==TRUE||LA151_0==VOID) ) {
                alt151=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;

            }
            switch (alt151) {
                case 1 :
                    // Java.g:1101:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer8676);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1102:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer8686);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 95, variableInitializer_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "variableInitializer"



    // $ANTLR start "arrayInitializer"
    // Java.g:1105:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}' ;
    public final void arrayInitializer() throws RecognitionException {
        int arrayInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }

            // Java.g:1106:5: ( '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}' )
            // Java.g:1106:9: '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_arrayInitializer8707); if (state.failed) return ;

            // Java.g:1107:13: ( variableInitializer ( ',' variableInitializer )* )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==BANG||LA153_0==BOOLEAN||LA153_0==BYTE||(LA153_0 >= CHAR && LA153_0 <= CHARLITERAL)||(LA153_0 >= DOUBLE && LA153_0 <= DOUBLELITERAL)||LA153_0==FALSE||(LA153_0 >= FLOAT && LA153_0 <= FLOATLITERAL)||LA153_0==IDENTIFIER||LA153_0==INT||LA153_0==INTLITERAL||LA153_0==LBRACE||(LA153_0 >= LONG && LA153_0 <= LPAREN)||(LA153_0 >= NEW && LA153_0 <= NULL)||LA153_0==PLUS||LA153_0==PLUSPLUS||LA153_0==SHORT||(LA153_0 >= STRINGLITERAL && LA153_0 <= SUB)||(LA153_0 >= SUBSUB && LA153_0 <= SUPER)||LA153_0==THIS||LA153_0==TILDE||LA153_0==TRUE||LA153_0==VOID) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // Java.g:1107:14: variableInitializer ( ',' variableInitializer )*
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer8723);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    // Java.g:1108:17: ( ',' variableInitializer )*
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( (LA152_0==COMMA) ) {
                            int LA152_1 = input.LA(2);

                            if ( (LA152_1==BANG||LA152_1==BOOLEAN||LA152_1==BYTE||(LA152_1 >= CHAR && LA152_1 <= CHARLITERAL)||(LA152_1 >= DOUBLE && LA152_1 <= DOUBLELITERAL)||LA152_1==FALSE||(LA152_1 >= FLOAT && LA152_1 <= FLOATLITERAL)||LA152_1==IDENTIFIER||LA152_1==INT||LA152_1==INTLITERAL||LA152_1==LBRACE||(LA152_1 >= LONG && LA152_1 <= LPAREN)||(LA152_1 >= NEW && LA152_1 <= NULL)||LA152_1==PLUS||LA152_1==PLUSPLUS||LA152_1==SHORT||(LA152_1 >= STRINGLITERAL && LA152_1 <= SUB)||(LA152_1 >= SUBSUB && LA152_1 <= SUPER)||LA152_1==THIS||LA152_1==TILDE||LA152_1==TRUE||LA152_1==VOID) ) {
                                alt152=1;
                            }


                        }


                        switch (alt152) {
                    	case 1 :
                    	    // Java.g:1108:18: ',' variableInitializer
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer8742); if (state.failed) return ;

                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer8744);
                    	    variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop152;
                        }
                    } while (true);


                    }
                    break;

            }


            // Java.g:1111:13: ( ',' )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==COMMA) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // Java.g:1111:14: ','
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer8794); if (state.failed) return ;

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_arrayInitializer8807); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 96, arrayInitializer_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "arrayInitializer"



    // $ANTLR start "createdName"
    // Java.g:1116:1: createdName : ( classOrInterfaceType | primitiveType );
    public final void createdName() throws RecognitionException {
        int createdName_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }

            // Java.g:1117:5: ( classOrInterfaceType | primitiveType )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==IDENTIFIER) ) {
                alt155=1;
            }
            else if ( (LA155_0==BOOLEAN||LA155_0==BYTE||LA155_0==CHAR||LA155_0==DOUBLE||LA155_0==FLOAT||LA155_0==INT||LA155_0==LONG||LA155_0==SHORT) ) {
                alt155=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;

            }
            switch (alt155) {
                case 1 :
                    // Java.g:1117:9: classOrInterfaceType
                    {
                    pushFollow(FOLLOW_classOrInterfaceType_in_createdName8841);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1118:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName8851);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 97, createdName_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "createdName"



    // $ANTLR start "innerCreator"
    // Java.g:1121:1: innerCreator : '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest ;
    public final void innerCreator() throws RecognitionException {
        int innerCreator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return ; }

            // Java.g:1122:5: ( '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest )
            // Java.g:1122:9: '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest
            {
            match(input,DOT,FOLLOW_DOT_in_innerCreator8872); if (state.failed) return ;

            match(input,NEW,FOLLOW_NEW_in_innerCreator8874); if (state.failed) return ;

            // Java.g:1123:9: ( nonWildcardTypeArguments )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==LT) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // Java.g:1123:10: nonWildcardTypeArguments
                    {
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator8885);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerCreator8906); if (state.failed) return ;

            // Java.g:1126:9: ( typeArguments )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==LT) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // Java.g:1126:10: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_innerCreator8917);
                    typeArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_classCreatorRest_in_innerCreator8938);
            classCreatorRest();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 98, innerCreator_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "innerCreator"



    // $ANTLR start "classCreatorRest"
    // Java.g:1132:1: classCreatorRest : arguments ( classBody )? ;
    public final void classCreatorRest() throws RecognitionException {
        int classCreatorRest_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return ; }

            // Java.g:1133:5: ( arguments ( classBody )? )
            // Java.g:1133:9: arguments ( classBody )?
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest8959);
            arguments();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:1134:9: ( classBody )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==LBRACE) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // Java.g:1134:10: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_classCreatorRest8970);
                    classBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 99, classCreatorRest_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "classCreatorRest"



    // $ANTLR start "nonWildcardTypeArguments"
    // Java.g:1139:1: nonWildcardTypeArguments : '<' typeList '>' ;
    public final void nonWildcardTypeArguments() throws RecognitionException {
        int nonWildcardTypeArguments_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return ; }

            // Java.g:1140:5: ( '<' typeList '>' )
            // Java.g:1140:9: '<' typeList '>'
            {
            match(input,LT,FOLLOW_LT_in_nonWildcardTypeArguments9002); if (state.failed) return ;

            pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments9004);
            typeList();

            state._fsp--;
            if (state.failed) return ;

            match(input,GT,FOLLOW_GT_in_nonWildcardTypeArguments9014); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 100, nonWildcardTypeArguments_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "nonWildcardTypeArguments"



    // $ANTLR start "arguments"
    // Java.g:1144:1: arguments returns [ArrayList<UsoId> lisUsosId] : '(' (e1= expressionList )? ')' ;
    public final ArrayList<UsoId> arguments() throws RecognitionException {
        ArrayList<UsoId> lisUsosId = null;

        int arguments_StartIndex = input.index();

        ArrayList<UsoId> e1 =null;



            lisUsosId = new ArrayList<UsoId>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return lisUsosId; }

            // Java.g:1148:5: ( '(' (e1= expressionList )? ')' )
            // Java.g:1148:9: '(' (e1= expressionList )? ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments9041); if (state.failed) return lisUsosId;

            // Java.g:1148:13: (e1= expressionList )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==BANG||LA159_0==BOOLEAN||LA159_0==BYTE||(LA159_0 >= CHAR && LA159_0 <= CHARLITERAL)||(LA159_0 >= DOUBLE && LA159_0 <= DOUBLELITERAL)||LA159_0==FALSE||(LA159_0 >= FLOAT && LA159_0 <= FLOATLITERAL)||LA159_0==IDENTIFIER||LA159_0==INT||LA159_0==INTLITERAL||(LA159_0 >= LONG && LA159_0 <= LPAREN)||(LA159_0 >= NEW && LA159_0 <= NULL)||LA159_0==PLUS||LA159_0==PLUSPLUS||LA159_0==SHORT||(LA159_0 >= STRINGLITERAL && LA159_0 <= SUB)||(LA159_0 >= SUBSUB && LA159_0 <= SUPER)||LA159_0==THIS||LA159_0==TILDE||LA159_0==TRUE||LA159_0==VOID) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // Java.g:1148:14: e1= expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments9048);
                    e1=expressionList();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId = e1;}

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_arguments9063); if (state.failed) return lisUsosId;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 101, arguments_StartIndex); }

        }
        return lisUsosId;
    }
    // $ANTLR end "arguments"



    // $ANTLR start "literal"
    // Java.g:1152:1: literal : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL |str= STRINGLITERAL | TRUE | FALSE | NULL );
    public final void literal() throws RecognitionException {
        int literal_StartIndex = input.index();

        Token str=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return ; }

            // Java.g:1153:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL |str= STRINGLITERAL | TRUE | FALSE | NULL )
            int alt160=9;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt160=1;
                }
                break;
            case LONGLITERAL:
                {
                alt160=2;
                }
                break;
            case FLOATLITERAL:
                {
                alt160=3;
                }
                break;
            case DOUBLELITERAL:
                {
                alt160=4;
                }
                break;
            case CHARLITERAL:
                {
                alt160=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt160=6;
                }
                break;
            case TRUE:
                {
                alt160=7;
                }
                break;
            case FALSE:
                {
                alt160=8;
                }
                break;
            case NULL:
                {
                alt160=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;

            }

            switch (alt160) {
                case 1 :
                    // Java.g:1153:9: INTLITERAL
                    {
                    match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal9082); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1154:9: LONGLITERAL
                    {
                    match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal9092); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:1155:9: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal9102); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Java.g:1156:9: DOUBLELITERAL
                    {
                    match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal9112); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Java.g:1157:9: CHARLITERAL
                    {
                    match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal9122); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // Java.g:1158:9: str= STRINGLITERAL
                    {
                    str=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal9140); if (state.failed) return ;

                    if ( state.backtracking==0 ) {String lit = str.getText(); 
                            if(!(lit.replaceAll("\"", "").trim().isEmpty())){
                                lisLiterales.add(new Literal(str.getLine(),lit));
                            }}

                    }
                    break;
                case 7 :
                    // Java.g:1162:9: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_literal9152); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // Java.g:1163:9: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_literal9162); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // Java.g:1164:9: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_literal9172); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 102, literal_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "literal"



    // $ANTLR start "classHeader"
    // Java.g:1171:1: classHeader : modifiers 'class' IDENTIFIER ;
    public final void classHeader() throws RecognitionException {
        int classHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return ; }

            // Java.g:1172:5: ( modifiers 'class' IDENTIFIER )
            // Java.g:1172:9: modifiers 'class' IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_classHeader9196);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLASS,FOLLOW_CLASS_in_classHeader9198); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classHeader9200); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 103, classHeader_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "classHeader"



    // $ANTLR start "enumHeader"
    // Java.g:1175:1: enumHeader : modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER ;
    public final void enumHeader() throws RecognitionException {
        int enumHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return ; }

            // Java.g:1176:5: ( modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER )
            // Java.g:1176:9: modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_enumHeader9220);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            if ( input.LA(1)==ENUM||input.LA(1)==IDENTIFIER ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumHeader9228); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 104, enumHeader_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "enumHeader"



    // $ANTLR start "interfaceHeader"
    // Java.g:1179:1: interfaceHeader : modifiers 'interface' IDENTIFIER ;
    public final void interfaceHeader() throws RecognitionException {
        int interfaceHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return ; }

            // Java.g:1180:5: ( modifiers 'interface' IDENTIFIER )
            // Java.g:1180:9: modifiers 'interface' IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_interfaceHeader9248);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceHeader9250); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interfaceHeader9252); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 105, interfaceHeader_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "interfaceHeader"



    // $ANTLR start "annotationHeader"
    // Java.g:1183:1: annotationHeader : modifiers '@' 'interface' IDENTIFIER ;
    public final void annotationHeader() throws RecognitionException {
        int annotationHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return ; }

            // Java.g:1184:5: ( modifiers '@' 'interface' IDENTIFIER )
            // Java.g:1184:9: modifiers '@' 'interface' IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_annotationHeader9272);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotationHeader9274); if (state.failed) return ;

            match(input,INTERFACE,FOLLOW_INTERFACE_in_annotationHeader9276); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationHeader9278); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 106, annotationHeader_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "annotationHeader"



    // $ANTLR start "typeHeader"
    // Java.g:1187:1: typeHeader : modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER ;
    public final void typeHeader() throws RecognitionException {
        int typeHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return ; }

            // Java.g:1188:5: ( modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER )
            // Java.g:1188:9: modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_typeHeader9298);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:1188:19: ( 'class' | 'enum' | ( ( '@' )? 'interface' ) )
            int alt162=3;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                alt162=1;
                }
                break;
            case ENUM:
                {
                alt162=2;
                }
                break;
            case INTERFACE:
            case MONKEYS_AT:
                {
                alt162=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;

            }

            switch (alt162) {
                case 1 :
                    // Java.g:1188:20: 'class'
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_typeHeader9301); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1188:28: 'enum'
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeHeader9303); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:1188:35: ( ( '@' )? 'interface' )
                    {
                    // Java.g:1188:35: ( ( '@' )? 'interface' )
                    // Java.g:1188:36: ( '@' )? 'interface'
                    {
                    // Java.g:1188:36: ( '@' )?
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==MONKEYS_AT) ) {
                        alt161=1;
                    }
                    switch (alt161) {
                        case 1 :
                            // Java.g:1188:36: '@'
                            {
                            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_typeHeader9306); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeHeader9310); if (state.failed) return ;

                    }


                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeHeader9314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 107, typeHeader_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "typeHeader"



    // $ANTLR start "methodHeader"
    // Java.g:1191:1: methodHeader : modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '(' ;
    public final void methodHeader() throws RecognitionException {
        int methodHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return ; }

            // Java.g:1192:5: ( modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '(' )
            // Java.g:1192:9: modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '('
            {
            pushFollow(FOLLOW_modifiers_in_methodHeader9334);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:1192:19: ( typeParameters )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==LT) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // Java.g:1192:19: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_methodHeader9336);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:1192:35: ( type | 'void' )?
            int alt164=3;
            switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    int LA164_1 = input.LA(2);

                    if ( (LA164_1==DOT||LA164_1==IDENTIFIER||LA164_1==LBRACKET||LA164_1==LT) ) {
                        alt164=1;
                    }
                    }
                    break;
                case BOOLEAN:
                case BYTE:
                case CHAR:
                case DOUBLE:
                case FLOAT:
                case INT:
                case LONG:
                case SHORT:
                    {
                    alt164=1;
                    }
                    break;
                case VOID:
                    {
                    alt164=2;
                    }
                    break;
            }

            switch (alt164) {
                case 1 :
                    // Java.g:1192:36: type
                    {
                    pushFollow(FOLLOW_type_in_methodHeader9340);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1192:41: 'void'
                    {
                    match(input,VOID,FOLLOW_VOID_in_methodHeader9342); if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodHeader9346); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_methodHeader9348); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 108, methodHeader_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "methodHeader"



    // $ANTLR start "fieldHeader"
    // Java.g:1195:1: fieldHeader : modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) ;
    public final void fieldHeader() throws RecognitionException {
        int fieldHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return ; }

            // Java.g:1196:5: ( modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) )
            // Java.g:1196:9: modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' )
            {
            pushFollow(FOLLOW_modifiers_in_fieldHeader9368);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_fieldHeader9370);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldHeader9372); if (state.failed) return ;

            // Java.g:1196:35: ( '[' ']' )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==LBRACKET) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // Java.g:1196:36: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_fieldHeader9375); if (state.failed) return ;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_fieldHeader9376); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);


            if ( input.LA(1)==COMMA||input.LA(1)==EQ||input.LA(1)==SEMI ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 109, fieldHeader_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "fieldHeader"



    // $ANTLR start "localVariableHeader"
    // Java.g:1199:1: localVariableHeader : variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) ;
    public final void localVariableHeader() throws RecognitionException {
        int localVariableHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return ; }

            // Java.g:1200:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) )
            // Java.g:1200:9: variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' )
            {
            pushFollow(FOLLOW_variableModifiers_in_localVariableHeader9406);
            variableModifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_localVariableHeader9408);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableHeader9410); if (state.failed) return ;

            // Java.g:1200:43: ( '[' ']' )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==LBRACKET) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // Java.g:1200:44: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_localVariableHeader9413); if (state.failed) return ;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_localVariableHeader9414); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop166;
                }
            } while (true);


            if ( input.LA(1)==COMMA||input.LA(1)==EQ||input.LA(1)==SEMI ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 110, localVariableHeader_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "localVariableHeader"

    // $ANTLR start synpred2_Java
    public final void synpred2_Java_fragment() throws RecognitionException {
        JavaParser.packageDeclaration_return p =null;


        // Java.g:104:13: ( ( annotations )? p= packageDeclaration )
        // Java.g:104:13: ( annotations )? p= packageDeclaration
        {
        // Java.g:104:13: ( annotations )?
        int alt167=2;
        int LA167_0 = input.LA(1);

        if ( (LA167_0==MONKEYS_AT) ) {
            alt167=1;
        }
        switch (alt167) {
            case 1 :
                // Java.g:104:14: annotations
                {
                pushFollow(FOLLOW_annotations_in_synpred2_Java103);
                annotations();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        pushFollow(FOLLOW_packageDeclaration_in_synpred2_Java136);
        p=packageDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Java

    // $ANTLR start synpred12_Java
    public final void synpred12_Java_fragment() throws RecognitionException {
        Clase c =null;


        // Java.g:149:9: (c= classDeclaration )
        // Java.g:149:9: c= classDeclaration
        {
        pushFollow(FOLLOW_classDeclaration_in_synpred12_Java525);
        c=classDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Java

    // $ANTLR start synpred27_Java
    public final void synpred27_Java_fragment() throws RecognitionException {
        Clase n =null;


        // Java.g:183:9: (n= normalClassDeclaration )
        // Java.g:183:9: n= normalClassDeclaration
        {
        pushFollow(FOLLOW_normalClassDeclaration_in_synpred27_Java793);
        n=normalClassDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred27_Java

    // $ANTLR start synpred43_Java
    public final void synpred43_Java_fragment() throws RecognitionException {
        // Java.g:271:9: ( normalInterfaceDeclaration )
        // Java.g:271:9: normalInterfaceDeclaration
        {
        pushFollow(FOLLOW_normalInterfaceDeclaration_in_synpred43_Java1494);
        normalInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred43_Java

    // $ANTLR start synpred52_Java
    public final void synpred52_Java_fragment() throws RecognitionException {
        Map<String,Declaracion> f1 =null;


        // Java.g:332:10: (f1= fieldDeclaration )
        // Java.g:332:10: f1= fieldDeclaration
        {
        pushFollow(FOLLOW_fieldDeclaration_in_synpred52_Java1866);
        f1=fieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_Java

    // $ANTLR start synpred53_Java
    public final void synpred53_Java_fragment() throws RecognitionException {
        JavaParser.methodDeclaration_return m1 =null;


        // Java.g:333:10: (m1= methodDeclaration )
        // Java.g:333:10: m1= methodDeclaration
        {
        pushFollow(FOLLOW_methodDeclaration_in_synpred53_Java1883);
        m1=methodDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_Java

    // $ANTLR start synpred54_Java
    public final void synpred54_Java_fragment() throws RecognitionException {
        // Java.g:334:10: ( classDeclaration )
        // Java.g:334:10: classDeclaration
        {
        pushFollow(FOLLOW_classDeclaration_in_synpred54_Java1896);
        classDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred54_Java

    // $ANTLR start synpred57_Java
    public final void synpred57_Java_fragment() throws RecognitionException {
        ArrayList<UsoId> ex1 =null;


        // Java.g:362:10: (ex1= explicitConstructorInvocation )
        // Java.g:362:10: ex1= explicitConstructorInvocation
        {
        pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred57_Java2066);
        ex1=explicitConstructorInvocation();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_Java

    // $ANTLR start synpred59_Java
    public final void synpred59_Java_fragment() throws RecognitionException {
        Token Id1=null;
        String mo2 =null;

        Map<String,Parametro> f1 =null;

        ArrayList<UsoId> ex1 =null;

        JavaParser.blockStatement_return b1 =null;


        // Java.g:354:10: (mo2= modifiers ( typeParameters )? Id1= IDENTIFIER f1= formalParameters ( 'throws' qualifiedNameList )? '{' (ex1= explicitConstructorInvocation )? (b1= blockStatement )* '}' )
        // Java.g:354:10: mo2= modifiers ( typeParameters )? Id1= IDENTIFIER f1= formalParameters ( 'throws' qualifiedNameList )? '{' (ex1= explicitConstructorInvocation )? (b1= blockStatement )* '}'
        {
        pushFollow(FOLLOW_modifiers_in_synpred59_Java1960);
        mo2=modifiers();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:355:9: ( typeParameters )?
        int alt170=2;
        int LA170_0 = input.LA(1);

        if ( (LA170_0==LT) ) {
            alt170=1;
        }
        switch (alt170) {
            case 1 :
                // Java.g:355:10: typeParameters
                {
                pushFollow(FOLLOW_typeParameters_in_synpred59_Java1973);
                typeParameters();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        Id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred59_Java1998); if (state.failed) return ;

        pushFollow(FOLLOW_formalParameters_in_synpred59_Java2014);
        f1=formalParameters();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:359:9: ( 'throws' qualifiedNameList )?
        int alt171=2;
        int LA171_0 = input.LA(1);

        if ( (LA171_0==THROWS) ) {
            alt171=1;
        }
        switch (alt171) {
            case 1 :
                // Java.g:359:10: 'throws' qualifiedNameList
                {
                match(input,THROWS,FOLLOW_THROWS_in_synpred59_Java2027); if (state.failed) return ;

                pushFollow(FOLLOW_qualifiedNameList_in_synpred59_Java2029);
                qualifiedNameList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred59_Java2050); if (state.failed) return ;

        // Java.g:362:9: (ex1= explicitConstructorInvocation )?
        int alt172=2;
        switch ( input.LA(1) ) {
            case LT:
                {
                alt172=1;
                }
                break;
            case THIS:
                {
                int LA172_2 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case LPAREN:
                {
                int LA172_3 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case SUPER:
                {
                int LA172_4 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA172_5 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case INTLITERAL:
                {
                int LA172_6 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case LONGLITERAL:
                {
                int LA172_7 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case FLOATLITERAL:
                {
                int LA172_8 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case DOUBLELITERAL:
                {
                int LA172_9 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case CHARLITERAL:
                {
                int LA172_10 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA172_11 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case TRUE:
                {
                int LA172_12 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case FALSE:
                {
                int LA172_13 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case NULL:
                {
                int LA172_14 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case NEW:
                {
                int LA172_15 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                int LA172_16 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
            case VOID:
                {
                int LA172_17 = input.LA(2);

                if ( (synpred57_Java()) ) {
                    alt172=1;
                }
                }
                break;
        }

        switch (alt172) {
            case 1 :
                // Java.g:362:10: ex1= explicitConstructorInvocation
                {
                pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred59_Java2066);
                ex1=explicitConstructorInvocation();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // Java.g:364:9: (b1= blockStatement )*
        loop173:
        do {
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==ABSTRACT||(LA173_0 >= ASSERT && LA173_0 <= BANG)||(LA173_0 >= BOOLEAN && LA173_0 <= BYTE)||(LA173_0 >= CHAR && LA173_0 <= CLASS)||LA173_0==CONTINUE||LA173_0==DO||(LA173_0 >= DOUBLE && LA173_0 <= DOUBLELITERAL)||LA173_0==ENUM||(LA173_0 >= FALSE && LA173_0 <= FINAL)||(LA173_0 >= FLOAT && LA173_0 <= FOR)||(LA173_0 >= IDENTIFIER && LA173_0 <= IF)||(LA173_0 >= INT && LA173_0 <= INTLITERAL)||LA173_0==LBRACE||(LA173_0 >= LONG && LA173_0 <= LT)||(LA173_0 >= MONKEYS_AT && LA173_0 <= NULL)||LA173_0==PLUS||(LA173_0 >= PLUSPLUS && LA173_0 <= PUBLIC)||LA173_0==RETURN||(LA173_0 >= SEMI && LA173_0 <= SHORT)||(LA173_0 >= STATIC && LA173_0 <= SUB)||(LA173_0 >= SUBSUB && LA173_0 <= SYNCHRONIZED)||(LA173_0 >= THIS && LA173_0 <= THROW)||(LA173_0 >= TILDE && LA173_0 <= WHILE)) ) {
                alt173=1;
            }


            switch (alt173) {
        	case 1 :
        	    // Java.g:364:10: b1= blockStatement
        	    {
        	    pushFollow(FOLLOW_blockStatement_in_synpred59_Java2094);
        	    b1=blockStatement();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop173;
            }
        } while (true);


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred59_Java2119); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Java

    // $ANTLR start synpred68_Java
    public final void synpred68_Java_fragment() throws RecognitionException {
        // Java.g:415:9: ( interfaceFieldDeclaration )
        // Java.g:415:9: interfaceFieldDeclaration
        {
        pushFollow(FOLLOW_interfaceFieldDeclaration_in_synpred68_Java2821);
        interfaceFieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred68_Java

    // $ANTLR start synpred69_Java
    public final void synpred69_Java_fragment() throws RecognitionException {
        // Java.g:416:9: ( interfaceMethodDeclaration )
        // Java.g:416:9: interfaceMethodDeclaration
        {
        pushFollow(FOLLOW_interfaceMethodDeclaration_in_synpred69_Java2831);
        interfaceMethodDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred69_Java

    // $ANTLR start synpred70_Java
    public final void synpred70_Java_fragment() throws RecognitionException {
        // Java.g:417:9: ( interfaceDeclaration )
        // Java.g:417:9: interfaceDeclaration
        {
        pushFollow(FOLLOW_interfaceDeclaration_in_synpred70_Java2841);
        interfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred70_Java

    // $ANTLR start synpred71_Java
    public final void synpred71_Java_fragment() throws RecognitionException {
        // Java.g:418:9: ( classDeclaration )
        // Java.g:418:9: classDeclaration
        {
        pushFollow(FOLLOW_classDeclaration_in_synpred71_Java2851);
        classDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred71_Java

    // $ANTLR start synpred96_Java
    public final void synpred96_Java_fragment() throws RecognitionException {
        // Java.g:516:9: ( ellipsisParameterDecl )
        // Java.g:516:9: ellipsisParameterDecl
        {
        pushFollow(FOLLOW_ellipsisParameterDecl_in_synpred96_Java3640);
        ellipsisParameterDecl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred96_Java

    // $ANTLR start synpred98_Java
    public final void synpred98_Java_fragment() throws RecognitionException {
        Parametro p1 =null;

        Parametro p2 =null;


        // Java.g:518:8: (p1= normalParameterDecl ( ',' p2= normalParameterDecl )* )
        // Java.g:518:8: p1= normalParameterDecl ( ',' p2= normalParameterDecl )*
        {
        pushFollow(FOLLOW_normalParameterDecl_in_synpred98_Java3654);
        p1=normalParameterDecl();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:519:9: ( ',' p2= normalParameterDecl )*
        loop176:
        do {
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==COMMA) ) {
                alt176=1;
            }


            switch (alt176) {
        	case 1 :
        	    // Java.g:519:10: ',' p2= normalParameterDecl
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred98_Java3667); if (state.failed) return ;

        	    pushFollow(FOLLOW_normalParameterDecl_in_synpred98_Java3673);
        	    p2=normalParameterDecl();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop176;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred98_Java

    // $ANTLR start synpred99_Java
    public final void synpred99_Java_fragment() throws RecognitionException {
        // Java.g:522:10: ( normalParameterDecl ',' )
        // Java.g:522:10: normalParameterDecl ','
        {
        pushFollow(FOLLOW_normalParameterDecl_in_synpred99_Java3698);
        normalParameterDecl();

        state._fsp--;
        if (state.failed) return ;

        match(input,COMMA,FOLLOW_COMMA_in_synpred99_Java3708); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred99_Java

    // $ANTLR start synpred103_Java
    public final void synpred103_Java_fragment() throws RecognitionException {
        ArrayList<UsoId> a1 =null;


        // Java.g:545:9: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) a1= arguments ';' )
        // Java.g:545:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) a1= arguments ';'
        {
        // Java.g:545:9: ( nonWildcardTypeArguments )?
        int alt177=2;
        int LA177_0 = input.LA(1);

        if ( (LA177_0==LT) ) {
            alt177=1;
        }
        switch (alt177) {
            case 1 :
                // Java.g:545:10: nonWildcardTypeArguments
                {
                pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred103_Java3855);
                nonWildcardTypeArguments();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        if ( input.LA(1)==SUPER||input.LA(1)==THIS ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_arguments_in_synpred103_Java3917);
        a1=arguments();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred103_Java3921); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred103_Java

    // $ANTLR start synpred117_Java
    public final void synpred117_Java_fragment() throws RecognitionException {
        // Java.g:632:9: ( annotationMethodDeclaration )
        // Java.g:632:9: annotationMethodDeclaration
        {
        pushFollow(FOLLOW_annotationMethodDeclaration_in_synpred117_Java4541);
        annotationMethodDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred117_Java

    // $ANTLR start synpred118_Java
    public final void synpred118_Java_fragment() throws RecognitionException {
        // Java.g:633:9: ( interfaceFieldDeclaration )
        // Java.g:633:9: interfaceFieldDeclaration
        {
        pushFollow(FOLLOW_interfaceFieldDeclaration_in_synpred118_Java4551);
        interfaceFieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_Java

    // $ANTLR start synpred119_Java
    public final void synpred119_Java_fragment() throws RecognitionException {
        // Java.g:634:9: ( normalClassDeclaration )
        // Java.g:634:9: normalClassDeclaration
        {
        pushFollow(FOLLOW_normalClassDeclaration_in_synpred119_Java4561);
        normalClassDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred119_Java

    // $ANTLR start synpred120_Java
    public final void synpred120_Java_fragment() throws RecognitionException {
        // Java.g:635:9: ( normalInterfaceDeclaration )
        // Java.g:635:9: normalInterfaceDeclaration
        {
        pushFollow(FOLLOW_normalInterfaceDeclaration_in_synpred120_Java4571);
        normalInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_Java

    // $ANTLR start synpred121_Java
    public final void synpred121_Java_fragment() throws RecognitionException {
        // Java.g:636:9: ( enumDeclaration )
        // Java.g:636:9: enumDeclaration
        {
        pushFollow(FOLLOW_enumDeclaration_in_synpred121_Java4581);
        enumDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred121_Java

    // $ANTLR start synpred122_Java
    public final void synpred122_Java_fragment() throws RecognitionException {
        // Java.g:637:9: ( annotationTypeDeclaration )
        // Java.g:637:9: annotationTypeDeclaration
        {
        pushFollow(FOLLOW_annotationTypeDeclaration_in_synpred122_Java4591);
        annotationTypeDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred122_Java

    // $ANTLR start synpred125_Java
    public final void synpred125_Java_fragment() throws RecognitionException {
        Map<String,Declaracion> l1 =null;


        // Java.g:688:9: (l1= localVariableDeclarationStatement )
        // Java.g:688:9: l1= localVariableDeclarationStatement
        {
        pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred125_Java4773);
        l1=localVariableDeclarationStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred125_Java

    // $ANTLR start synpred126_Java
    public final void synpred126_Java_fragment() throws RecognitionException {
        // Java.g:689:9: ( classOrInterfaceDeclaration )
        // Java.g:689:9: classOrInterfaceDeclaration
        {
        pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred126_Java4785);
        classOrInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred126_Java

    // $ANTLR start synpred130_Java
    public final void synpred130_Java_fragment() throws RecognitionException {
        ArrayList<UsoId> exp1 =null;

        ArrayList<UsoId> exp2 =null;


        // Java.g:717:9: ( ( 'assert' ) exp1= expression ( ':' exp2= expression )? ';' )
        // Java.g:717:9: ( 'assert' ) exp1= expression ( ':' exp2= expression )? ';'
        {
        // Java.g:717:9: ( 'assert' )
        // Java.g:717:10: 'assert'
        {
        match(input,ASSERT,FOLLOW_ASSERT_in_synpred130_Java4977); if (state.failed) return ;

        }


        pushFollow(FOLLOW_expression_in_synpred130_Java5001);
        exp1=expression();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:719:27: ( ':' exp2= expression )?
        int alt180=2;
        int LA180_0 = input.LA(1);

        if ( (LA180_0==COLON) ) {
            alt180=1;
        }
        switch (alt180) {
            case 1 :
                // Java.g:719:28: ':' exp2= expression
                {
                match(input,COLON,FOLLOW_COLON_in_synpred130_Java5004); if (state.failed) return ;

                pushFollow(FOLLOW_expression_in_synpred130_Java5010);
                exp2=expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SEMI,FOLLOW_SEMI_in_synpred130_Java5016); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred130_Java

    // $ANTLR start synpred132_Java
    public final void synpred132_Java_fragment() throws RecognitionException {
        // Java.g:720:9: ( 'assert' expression ( ':' expression )? ';' )
        // Java.g:720:9: 'assert' expression ( ':' expression )? ';'
        {
        match(input,ASSERT,FOLLOW_ASSERT_in_synpred132_Java5028); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred132_Java5031);
        expression();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:720:30: ( ':' expression )?
        int alt181=2;
        int LA181_0 = input.LA(1);

        if ( (LA181_0==COLON) ) {
            alt181=1;
        }
        switch (alt181) {
            case 1 :
                // Java.g:720:31: ':' expression
                {
                match(input,COLON,FOLLOW_COLON_in_synpred132_Java5034); if (state.failed) return ;

                pushFollow(FOLLOW_expression_in_synpred132_Java5036);
                expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SEMI,FOLLOW_SEMI_in_synpred132_Java5040); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred132_Java

    // $ANTLR start synpred133_Java
    public final void synpred133_Java_fragment() throws RecognitionException {
        ArrayList<UsoId> s2 =null;


        // Java.g:721:49: ( 'else' s2= statement )
        // Java.g:721:49: 'else' s2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred133_Java5077); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred133_Java5083);
        s2=statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred133_Java

    // $ANTLR start synpred148_Java
    public final void synpred148_Java_fragment() throws RecognitionException {
        ArrayList<UsoId> e1 =null;


        // Java.g:736:9: (e1= expression ';' )
        // Java.g:736:9: e1= expression ';'
        {
        pushFollow(FOLLOW_expression_in_synpred148_Java5340);
        e1=expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred148_Java5342); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred148_Java

    // $ANTLR start synpred149_Java
    public final void synpred149_Java_fragment() throws RecognitionException {
        // Java.g:737:9: ( IDENTIFIER ':' statement )
        // Java.g:737:9: IDENTIFIER ':' statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred149_Java5358); if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred149_Java5360); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred149_Java5362);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred149_Java

    // $ANTLR start synpred153_Java
    public final void synpred153_Java_fragment() throws RecognitionException {
        ArrayList<UsoId> ca1 =null;

        JavaParser.block_return b2 =null;


        // Java.g:764:13: (ca1= catches 'finally' b2= block )
        // Java.g:764:13: ca1= catches 'finally' b2= block
        {
        pushFollow(FOLLOW_catches_in_synpred153_Java5535);
        ca1=catches();

        state._fsp--;
        if (state.failed) return ;

        match(input,FINALLY,FOLLOW_FINALLY_in_synpred153_Java5537); if (state.failed) return ;

        pushFollow(FOLLOW_block_in_synpred153_Java5543);
        b2=block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred153_Java

    // $ANTLR start synpred154_Java
    public final void synpred154_Java_fragment() throws RecognitionException {
        ArrayList<UsoId> ca2 =null;


        // Java.g:765:13: (ca2= catches )
        // Java.g:765:13: ca2= catches
        {
        pushFollow(FOLLOW_catches_in_synpred154_Java5563);
        ca2=catches();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred154_Java

    // $ANTLR start synpred157_Java
    public final void synpred157_Java_fragment() throws RecognitionException {
        ArrayList<UsoId> s2 =null;


        // Java.g:799:9: ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' s2= statement )
        // Java.g:799:9: 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' s2= statement
        {
        match(input,FOR,FOLLOW_FOR_in_synpred157_Java5802); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred157_Java5804); if (state.failed) return ;

        pushFollow(FOLLOW_variableModifiers_in_synpred157_Java5806);
        variableModifiers();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred157_Java5808);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred157_Java5810); if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred157_Java5812); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred157_Java5823);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred157_Java5825); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred157_Java5831);
        s2=statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred157_Java

    // $ANTLR start synpred161_Java
    public final void synpred161_Java_fragment() throws RecognitionException {
        // Java.g:813:9: ( localVariableDeclaration )
        // Java.g:813:9: localVariableDeclaration
        {
        pushFollow(FOLLOW_localVariableDeclaration_in_synpred161_Java6031);
        localVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred161_Java

    // $ANTLR start synpred202_Java
    public final void synpred202_Java_fragment() throws RecognitionException {
        // Java.g:973:9: ( castExpression )
        // Java.g:973:9: castExpression
        {
        pushFollow(FOLLOW_castExpression_in_synpred202_Java7553);
        castExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred202_Java

    // $ANTLR start synpred206_Java
    public final void synpred206_Java_fragment() throws RecognitionException {
        // Java.g:983:9: ( '(' primitiveType ')' unaryExpression )
        // Java.g:983:9: '(' primitiveType ')' unaryExpression
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred206_Java7656); if (state.failed) return ;

        pushFollow(FOLLOW_primitiveType_in_synpred206_Java7658);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred206_Java7660); if (state.failed) return ;

        pushFollow(FOLLOW_unaryExpression_in_synpred206_Java7662);
        unaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred206_Java

    // $ANTLR start synpred208_Java
    public final void synpred208_Java_fragment() throws RecognitionException {
        Token Id1=null;

        // Java.g:997:10: ( '.' Id1= IDENTIFIER )
        // Java.g:997:10: '.' Id1= IDENTIFIER
        {
        match(input,DOT,FOLLOW_DOT_in_synpred208_Java7735); if (state.failed) return ;

        Id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred208_Java7741); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred208_Java

    // $ANTLR start synpred209_Java
    public final void synpred209_Java_fragment() throws RecognitionException {
        JavaParser.identifierSuffix_return ids1 =null;


        // Java.g:1000:10: (ids1= identifierSuffix )
        // Java.g:1000:10: ids1= identifierSuffix
        {
        pushFollow(FOLLOW_identifierSuffix_in_synpred209_Java7779);
        ids1=identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred209_Java

    // $ANTLR start synpred211_Java
    public final void synpred211_Java_fragment() throws RecognitionException {
        Token Id3=null;

        // Java.g:1008:10: ( '.' Id3= IDENTIFIER )
        // Java.g:1008:10: '.' Id3= IDENTIFIER
        {
        match(input,DOT,FOLLOW_DOT_in_synpred211_Java7837); if (state.failed) return ;

        Id3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred211_Java7843); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred211_Java

    // $ANTLR start synpred212_Java
    public final void synpred212_Java_fragment() throws RecognitionException {
        JavaParser.identifierSuffix_return ids2 =null;


        // Java.g:1010:10: (ids2= identifierSuffix )
        // Java.g:1010:10: ids2= identifierSuffix
        {
        pushFollow(FOLLOW_identifierSuffix_in_synpred212_Java7893);
        ids2=identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred212_Java

    // $ANTLR start synpred224_Java
    public final void synpred224_Java_fragment() throws RecognitionException {
        // Java.g:1051:10: ( '[' expression ']' )
        // Java.g:1051:10: '[' expression ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred224_Java8220); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred224_Java8222);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred224_Java8224); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred224_Java

    // $ANTLR start synpred236_Java
    public final void synpred236_Java_fragment() throws RecognitionException {
        // Java.g:1078:9: ( 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest )
        // Java.g:1078:9: 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest
        {
        match(input,NEW,FOLLOW_NEW_in_synpred236_Java8458); if (state.failed) return ;

        pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred236_Java8460);
        nonWildcardTypeArguments();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_classOrInterfaceType_in_synpred236_Java8462);
        classOrInterfaceType();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_classCreatorRest_in_synpred236_Java8464);
        classCreatorRest();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred236_Java

    // $ANTLR start synpred237_Java
    public final void synpred237_Java_fragment() throws RecognitionException {
        // Java.g:1079:9: ( 'new' classOrInterfaceType classCreatorRest )
        // Java.g:1079:9: 'new' classOrInterfaceType classCreatorRest
        {
        match(input,NEW,FOLLOW_NEW_in_synpred237_Java8474); if (state.failed) return ;

        pushFollow(FOLLOW_classOrInterfaceType_in_synpred237_Java8476);
        classOrInterfaceType();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_classCreatorRest_in_synpred237_Java8478);
        classCreatorRest();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred237_Java

    // $ANTLR start synpred239_Java
    public final void synpred239_Java_fragment() throws RecognitionException {
        // Java.g:1084:9: ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer )
        // Java.g:1084:9: 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer
        {
        match(input,NEW,FOLLOW_NEW_in_synpred239_Java8508); if (state.failed) return ;

        pushFollow(FOLLOW_createdName_in_synpred239_Java8510);
        createdName();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred239_Java8520); if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred239_Java8522); if (state.failed) return ;

        // Java.g:1086:9: ( '[' ']' )*
        loop194:
        do {
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( (LA194_0==LBRACKET) ) {
                alt194=1;
            }


            switch (alt194) {
        	case 1 :
        	    // Java.g:1086:10: '[' ']'
        	    {
        	    match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred239_Java8533); if (state.failed) return ;

        	    match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred239_Java8535); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop194;
            }
        } while (true);


        pushFollow(FOLLOW_arrayInitializer_in_synpred239_Java8556);
        arrayInitializer();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred239_Java

    // $ANTLR start synpred240_Java
    public final void synpred240_Java_fragment() throws RecognitionException {
        // Java.g:1093:13: ( '[' expression ']' )
        // Java.g:1093:13: '[' expression ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred240_Java8605); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred240_Java8607);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred240_Java8621); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred240_Java

    // Delegated rules

    public final boolean synpred43_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred157_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred157_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred224_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred224_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred211_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred211_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred239_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred239_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred202_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred202_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred148_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred148_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred212_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred212_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred161_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred161_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred209_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred209_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred236_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred236_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred149_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred149_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred122_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred240_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred240_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred206_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred206_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred153_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred153_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred237_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred237_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred208_Java() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred208_Java_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_annotations_in_compilationUnit103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit136 = new BitSet(new long[]{0x1200102000800012L,0x0011040C10700600L});
    public static final BitSet FOLLOW_importDeclaration_in_compilationUnit158 = new BitSet(new long[]{0x1200102000800012L,0x0011040C10700600L});
    public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit182 = new BitSet(new long[]{0x1000102000800012L,0x0011040C10700600L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration219 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedName_in_packageDeclaration225 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_packageDeclaration237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration258 = new BitSet(new long[]{0x0040000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration270 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration291 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOT_in_importDeclaration293 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_STAR_in_importDeclaration295 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_importDeclaration305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration322 = new BitSet(new long[]{0x0040000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration334 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration355 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOT_in_importDeclaration366 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_importDeclaration368 = new BitSet(new long[]{0x0000000080000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DOT_in_importDeclaration390 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_STAR_in_importDeclaration392 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_importDeclaration413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedImportName433 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedImportName444 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedImportName446 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_typeDeclaration497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_modifiers579 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_PUBLIC_in_modifiers589 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_PROTECTED_in_modifiers601 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_PRIVATE_in_modifiers613 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_STATIC_in_modifiers625 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifiers635 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_FINAL_in_modifiers645 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_NATIVE_in_modifiers655 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifiers665 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifiers675 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_VOLATILE_in_modifiers685 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_STRICTFP_in_modifiers695 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_FINAL_in_variableModifiers735 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_annotation_in_variableModifiers749 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_classDeclaration793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_classDeclaration805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_normalClassDeclaration833 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_normalClassDeclaration836 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_normalClassDeclaration842 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_typeParameters_in_normalClassDeclaration853 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_normalClassDeclaration877 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_normalClassDeclaration879 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_normalClassDeclaration901 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_typeList_in_normalClassDeclaration903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_classBody_in_normalClassDeclaration940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParameters963 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters977 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_COMMA_in_typeParameters992 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters994 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_GT_in_typeParameters1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeParameter1039 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_typeParameter1050 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeBound1084 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AMP_in_typeBound1095 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_typeBound1097 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_modifiers_in_enumDeclaration1129 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDeclaration1141 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDeclaration1162 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_enumDeclaration1173 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_typeList_in_enumDeclaration1175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumBody_in_enumDeclaration1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody1221 = new BitSet(new long[]{0x0040000002000000L,0x0000000011000200L});
    public static final BitSet FOLLOW_enumConstants_in_enumBody1232 = new BitSet(new long[]{0x0000000002000000L,0x0000000011000000L});
    public static final BitSet FOLLOW_COMMA_in_enumBody1254 = new BitSet(new long[]{0x0000000000000000L,0x0000000011000000L});
    public static final BitSet FOLLOW_enumBodyDeclarations_in_enumBody1267 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstant_in_enumConstants1309 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_enumConstants1320 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_enumConstant_in_enumConstants1322 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_annotations_in_enumConstant1356 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumConstant1377 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000042L});
    public static final BitSet FOLLOW_arguments_in_enumConstant1388 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_classBody_in_enumConstant1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumBodyDeclarations1451 = new BitSet(new long[]{0x1840502100A14012L,0x0019040C30700692L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_enumBodyDeclarations1463 = new BitSet(new long[]{0x1840502100A14012L,0x0019040C30700692L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_normalInterfaceDeclaration1528 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_normalInterfaceDeclaration1530 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration1532 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration1543 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_normalInterfaceDeclaration1565 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1608 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1619 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_typeList1621 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBody1663 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700692L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody1679 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700692L});
    public static final BitSet FOLLOW_RBRACE_in_classBody1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceBody1723 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700690L});
    public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody1735 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700690L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceBody1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_classBodyDeclaration1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_classBodyDeclaration1795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_classBodyDeclaration1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDecl1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_memberDecl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_memberDecl1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_memberDecl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodDeclaration1960 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeParameters_in_methodDeclaration1973 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration2014 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000002L});
    public static final BitSet FOLLOW_THROWS_in_methodDeclaration2027 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaration2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_methodDeclaration2050 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1EF2L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_methodDeclaration2066 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_blockStatement_in_methodDeclaration2094 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_RBRACE_in_methodDeclaration2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodDeclaration2249 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000090L});
    public static final BitSet FOLLOW_typeParameters_in_methodDeclaration2262 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000010L});
    public static final BitSet FOLLOW_type_in_methodDeclaration2284 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_VOID_in_methodDeclaration2300 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration2326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration2342 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000006L});
    public static final BitSet FOLLOW_LBRACKET_in_methodDeclaration2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodDeclaration2357 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000006L});
    public static final BitSet FOLLOW_THROWS_in_methodDeclaration2379 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaration2381 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000002L});
    public static final BitSet FOLLOW_block_in_methodDeclaration2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_methodDeclaration2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_fieldDeclaration2642 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration2654 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration2677 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_fieldDeclaration2690 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration2696 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_fieldDeclaration2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclarator2743 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_variableDeclarator2756 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_variableDeclarator2758 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator2780 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1872L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_interfaceBodyDeclaration2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDeclaration2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceBodyDeclaration2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_interfaceBodyDeclaration2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_interfaceBodyDeclaration2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceMethodDeclaration2881 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000090L});
    public static final BitSet FOLLOW_typeParameters_in_interfaceMethodDeclaration2892 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000010L});
    public static final BitSet FOLLOW_type_in_interfaceMethodDeclaration2914 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_VOID_in_interfaceMethodDeclaration2925 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_interfaceMethodDeclaration2945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaration2955 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000004L});
    public static final BitSet FOLLOW_LBRACKET_in_interfaceMethodDeclaration2966 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_interfaceMethodDeclaration2968 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000004L});
    public static final BitSet FOLLOW_THROWS_in_interfaceMethodDeclaration2990 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaration2992 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_interfaceMethodDeclaration3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceFieldDeclaration3027 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_interfaceFieldDeclaration3029 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_interfaceFieldDeclaration3031 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_interfaceFieldDeclaration3042 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_interfaceFieldDeclaration3044 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_interfaceFieldDeclaration3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_type3089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_type3100 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_type3102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type3123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_type3136 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_type3138 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterfaceType3170 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType3181 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_DOT_in_classOrInterfaceType3203 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterfaceType3205 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType3220 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_LT_in_typeArguments3361 = new BitSet(new long[]{0x0840400100214000L,0x0000000020800010L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments3363 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_COMMA_in_typeArguments3374 = new BitSet(new long[]{0x0840400100214000L,0x0000000020800010L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments3376 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_GT_in_typeArguments3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeArgument3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUES_in_typeArgument3428 = new BitSet(new long[]{0x0000010000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_set_in_typeArgument3452 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_typeArgument3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList3527 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_qualifiedNameList3538 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList3540 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameters3574 = new BitSet(new long[]{0x0840500100214000L,0x0000000028000210L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters3589 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameters3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3654 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterDecls3667 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3673 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3698 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterDecls3708 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_normalParameterDecl3753 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_normalParameterDecl3755 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_normalParameterDecl3757 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_normalParameterDecl3770 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_normalParameterDecl3772 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableModifiers_in_ellipsisParameterDecl3803 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_ellipsisParameterDecl3813 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ELLIPSIS_in_ellipsisParameterDecl3816 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ellipsisParameterDecl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3855 = new BitSet(new long[]{0x0000000000000000L,0x0000110000000000L});
    public static final BitSet FOLLOW_set_in_explicitConstructorInvocation3881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation3917 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_explicitConstructorInvocation3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation3932 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOT_in_explicitConstructorInvocation3942 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000080L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3953 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation3974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation3988 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_explicitConstructorInvocation3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedName4018 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedName4032 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedName4038 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_annotation_in_annotations4072 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_annotation4105 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedName_in_annotation4107 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_annotation4121 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0280A1A72L});
    public static final BitSet FOLLOW_elementValuePairs_in_annotation4148 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_elementValue_in_annotation4172 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs4240 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_elementValuePairs4251 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs4253 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_elementValuePair4284 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_elementValuePair4286 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1A72L});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_elementValue4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_elementValue4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_elementValueArrayInitializer4348 = new BitSet(new long[]{0x2840C80302614200L,0x000A91B0210A1A72L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer4359 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_elementValueArrayInitializer4374 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1A72L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer4376 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_elementValueArrayInitializer4405 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACE_in_elementValueArrayInitializer4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_annotationTypeDeclaration4432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_annotationTypeDeclaration4434 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_annotationTypeDeclaration4444 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_annotationTypeDeclaration4454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_annotationTypeBody4485 = new BitSet(new long[]{0x1840502100A14010L,0x0011040C31700610L});
    public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody4497 = new BitSet(new long[]{0x1840502100A14010L,0x0011040C31700610L});
    public static final BitSet FOLLOW_RBRACE_in_annotationTypeBody4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationMethodDeclaration_in_annotationTypeElementDeclaration4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_annotationTypeElementDeclaration4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_annotationTypeElementDeclaration4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementDeclaration4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementDeclaration4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementDeclaration4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_annotationTypeElementDeclaration4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_annotationMethodDeclaration4621 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_annotationMethodDeclaration4623 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_annotationMethodDeclaration4625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_annotationMethodDeclaration4635 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotationMethodDeclaration4637 = new BitSet(new long[]{0x0000000020000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationMethodDeclaration4640 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1A72L});
    public static final BitSet FOLLOW_elementValue_in_annotationMethodDeclaration4642 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_annotationMethodDeclaration4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block4702 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_blockStatement_in_block4717 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_RBRACE_in_block4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement4830 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDeclarationStatement4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration4869 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration4871 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration4887 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_localVariableDeclaration4900 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration4906 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_block_in_statement4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement4977 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_statement5001 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_statement5004 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_statement5010 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement5028 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_statement5031 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_statement5034 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_statement5036 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement5062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parExpression_in_statement5068 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_statement5074 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement5077 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_statement5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatement_in_statement5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement5112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parExpression_in_statement5118 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_statement5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement5136 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_statement5142 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement5144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parExpression_in_statement5150 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trystatement_in_statement5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement5181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parExpression_in_statement5183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_statement5185 = new BitSet(new long[]{0x0000000020080000L,0x0000000001000000L});
    public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement5187 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACE_in_statement5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement5199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parExpression_in_statement5201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement5213 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0300A1870L});
    public static final BitSet FOLLOW_expression_in_statement5221 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement5238 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_statement5240 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement5252 = new BitSet(new long[]{0x0040000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement5267 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement5294 = new BitSet(new long[]{0x0040000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement5309 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement5340 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement5358 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_statement5360 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_statement5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups5394 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup5423 = new BitSet(new long[]{0x38C1D82350E1C312L,0x003FB7BC347A1E72L});
    public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup5434 = new BitSet(new long[]{0x38C1D82350E1C312L,0x003FB7BC347A1E72L});
    public static final BitSet FOLLOW_CASE_in_switchLabel5465 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_switchLabel5467 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_switchLabel5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchLabel5479 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_switchLabel5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_trystatement5509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_trystatement5515 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_catches_in_trystatement5535 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_FINALLY_in_trystatement5537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_trystatement5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_trystatement5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_trystatement5579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_trystatement5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchClause_in_catches5629 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_catchClause_in_catches5646 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause5686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause5688 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_formalParameter_in_catchClause5690 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause5700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_catchClause5706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_formalParameter5728 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_formalParameter5730 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_formalParameter5732 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_formalParameter5743 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_formalParameter5745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FOR_in_forstatement5802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement5804 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_variableModifiers_in_forstatement5806 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_forstatement5808 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_forstatement5810 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_forstatement5812 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_forstatement5823 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement5825 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_forstatement5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstatement5865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement5867 = new BitSet(new long[]{0x2840D80300614200L,0x000A91B0300A1A70L});
    public static final BitSet FOLLOW_forInit_in_forstatement5887 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_forstatement5908 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0300A1870L});
    public static final BitSet FOLLOW_expression_in_forstatement5933 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_forstatement5956 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0280A1870L});
    public static final BitSet FOLLOW_expressionList_in_forstatement5981 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement6004 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_forstatement6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression6065 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_parExpression6070 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList6100 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_expressionList6113 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_expressionList6119 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression6198 = new BitSet(new long[]{0x0008004000042082L,0x0000004280050080L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression6212 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_expression6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignmentOperator6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignmentOperator6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAREQ_in_assignmentOperator6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignmentOperator6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignmentOperator6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAREQ_in_assignmentOperator6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARETEQ_in_assignmentOperator6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignmentOperator6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_assignmentOperator6347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_assignmentOperator6349 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator6362 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator6364 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator6366 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator6379 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator6381 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression6411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_QUES_in_conditionalExpression6424 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression6430 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression6434 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression6480 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_BARBAR_in_conditionalOrExpression6493 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression6499 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6539 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_conditionalAndExpression6552 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6558 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6598 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_BAR_in_inclusiveOrExpression6611 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6617 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression6657 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_CARET_in_exclusiveOrExpression6670 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression6676 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression6716 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AMP_in_andExpression6729 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression6735 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression6775 = new BitSet(new long[]{0x0000008000000402L});
    public static final BitSet FOLLOW_set_in_equalityExpression6804 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression6858 = new BitSet(new long[]{0x0000008000000402L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression6898 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression6911 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression6951 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression6964 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression6970 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_relationalOp7003 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_relationalOp7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relationalOp7016 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_relationalOp7018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_relationalOp7028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relationalOp7038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression7065 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_shiftOp_in_shiftExpression7078 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression7084 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_shiftOp7119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_shiftOp7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_shiftOp7132 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftOp7134 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftOp7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_shiftOp7147 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftOp7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression7177 = new BitSet(new long[]{0x0000000000000002L,0x0000002000020000L});
    public static final BitSet FOLLOW_set_in_additiveExpression7206 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression7260 = new BitSet(new long[]{0x0000000000000002L,0x0000002000020000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression7307 = new BitSet(new long[]{0x0000000000000002L,0x0000000140008000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression7336 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression7408 = new BitSet(new long[]{0x0000000000000002L,0x0000000140008000L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression7447 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression7450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryExpression7460 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression7462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unaryExpression7472 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unaryExpression7484 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_unaryExpressionNotPlusMinus7529 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_unaryExpressionNotPlusMinus7541 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus7543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus7567 = new BitSet(new long[]{0x0000000080000002L,0x0000008000080004L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus7584 = new BitSet(new long[]{0x0000000080000002L,0x0000008000080004L});
    public static final BitSet FOLLOW_LPAREN_in_castExpression7656 = new BitSet(new long[]{0x0800400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression7658 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpression7660 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_castExpression7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_castExpression7672 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_castExpression7674 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpression7676 = new BitSet(new long[]{0x2840C80300614200L,0x000A911020001870L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary7724 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
    public static final BitSet FOLLOW_DOT_in_primary7735 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary7741 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary7824 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
    public static final BitSet FOLLOW_DOT_in_primary7837 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary7843 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary7893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary7934 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_superSuffix_in_primary7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_creator_in_primary7970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary7996 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_primary8007 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_primary8009 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DOT_in_primary8030 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_primary8032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary8042 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOT_in_primary8044 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_primary8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_superSuffix8096 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeArguments_in_superSuffix8099 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superSuffix8124 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_superSuffix8140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifierSuffix8184 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifierSuffix8186 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix8207 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifierSuffix8220 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_identifierSuffix8222 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifierSuffix8224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix8261 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix8273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_identifierSuffix8275 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierSuffix8277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix8289 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_THIS_in_identifierSuffix8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix8301 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SUPER_in_identifierSuffix8303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix8305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_innerCreator_in_identifierSuffix8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector8343 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector8349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_selector8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector8390 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_THIS_in_selector8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector8402 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SUPER_in_selector8404 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_superSuffix_in_selector8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_innerCreator_in_selector8424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_selector8434 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_selector8436 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_selector8438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_creator8458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator8460 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_creator8462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator8464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_creator8474 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_creator8476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayCreator_in_creator8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_arrayCreator8508 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_createdName_in_arrayCreator8510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8520 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8533 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreator8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_arrayCreator8567 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_createdName_in_arrayCreator8569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8579 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_arrayCreator8581 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8605 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_arrayCreator8607 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8643 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer8676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer8686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_arrayInitializer8707 = new BitSet(new long[]{0x2840C80302614200L,0x000A91B0210A1872L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer8723 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayInitializer8742 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1872L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer8744 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayInitializer8794 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACE_in_arrayInitializer8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_createdName8841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName8851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_innerCreator8872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_NEW_in_innerCreator8874 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator8885 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerCreator8906 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_typeArguments_in_innerCreator8917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_classCreatorRest_in_innerCreator8938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest8959 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_classBody_in_classCreatorRest8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_nonWildcardTypeArguments9002 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments9004 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_nonWildcardTypeArguments9014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments9041 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0280A1870L});
    public static final BitSet FOLLOW_expressionList_in_arguments9048 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_arguments9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal9082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal9092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal9102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal9112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal9152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal9172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_classHeader9196 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_classHeader9198 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classHeader9200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_enumHeader9220 = new BitSet(new long[]{0x0040002000000000L});
    public static final BitSet FOLLOW_set_in_enumHeader9222 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumHeader9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceHeader9248 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceHeader9250 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_interfaceHeader9252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_annotationHeader9272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_annotationHeader9274 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_annotationHeader9276 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_annotationHeader9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_typeHeader9298 = new BitSet(new long[]{0x1000002000800000L,0x0000000000000200L});
    public static final BitSet FOLLOW_CLASS_in_typeHeader9301 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ENUM_in_typeHeader9303 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_typeHeader9306 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_typeHeader9310 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeHeader9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodHeader9334 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000090L});
    public static final BitSet FOLLOW_typeParameters_in_methodHeader9336 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000010L});
    public static final BitSet FOLLOW_type_in_methodHeader9340 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_VOID_in_methodHeader9342 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodHeader9346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_methodHeader9348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_fieldHeader9368 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_fieldHeader9370 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldHeader9372 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
    public static final BitSet FOLLOW_LBRACKET_in_fieldHeader9375 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_fieldHeader9376 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
    public static final BitSet FOLLOW_set_in_fieldHeader9380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_localVariableHeader9406 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_localVariableHeader9408 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableHeader9410 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
    public static final BitSet FOLLOW_LBRACKET_in_localVariableHeader9413 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_localVariableHeader9414 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
    public static final BitSet FOLLOW_set_in_localVariableHeader9418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_synpred2_Java103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_packageDeclaration_in_synpred2_Java136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_synpred12_Java525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_synpred27_Java793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_synpred43_Java1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_synpred52_Java1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_synpred53_Java1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_synpred54_Java1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred57_Java2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_synpred59_Java1960 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeParameters_in_synpred59_Java1973 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred59_Java1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_formalParameters_in_synpred59_Java2014 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000002L});
    public static final BitSet FOLLOW_THROWS_in_synpred59_Java2027 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_synpred59_Java2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_synpred59_Java2050 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1EF2L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred59_Java2066 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_blockStatement_in_synpred59_Java2094 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_RBRACE_in_synpred59_Java2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_synpred68_Java2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceMethodDeclaration_in_synpred69_Java2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_synpred70_Java2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_synpred71_Java2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ellipsisParameterDecl_in_synpred96_Java3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalParameterDecl_in_synpred98_Java3654 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred98_Java3667 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_normalParameterDecl_in_synpred98_Java3673 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_normalParameterDecl_in_synpred99_Java3698 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred99_Java3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred103_Java3855 = new BitSet(new long[]{0x0000000000000000L,0x0000110000000000L});
    public static final BitSet FOLLOW_set_in_synpred103_Java3881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_synpred103_Java3917 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred103_Java3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationMethodDeclaration_in_synpred117_Java4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_synpred118_Java4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_synpred119_Java4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_synpred120_Java4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_synpred121_Java4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_synpred122_Java4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred125_Java4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred126_Java4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_synpred130_Java4977 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred130_Java5001 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_synpred130_Java5004 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred130_Java5010 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred130_Java5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_synpred132_Java5028 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred132_Java5031 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_synpred132_Java5034 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred132_Java5036 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred132_Java5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred133_Java5077 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_synpred133_Java5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred148_Java5340 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred148_Java5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred149_Java5358 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_synpred149_Java5360 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_synpred149_Java5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_synpred153_Java5535 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_FINALLY_in_synpred153_Java5537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred153_Java5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_synpred154_Java5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_synpred157_Java5802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_synpred157_Java5804 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_variableModifiers_in_synpred157_Java5806 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_synpred157_Java5808 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred157_Java5810 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_synpred157_Java5812 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred157_Java5823 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred157_Java5825 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_synpred157_Java5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_synpred161_Java6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_synpred202_Java7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred206_Java7656 = new BitSet(new long[]{0x0800400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_primitiveType_in_synpred206_Java7658 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred206_Java7660 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_synpred206_Java7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred208_Java7735 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred208_Java7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred209_Java7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred211_Java7837 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred211_Java7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred212_Java7893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred224_Java8220 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred224_Java8222 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred224_Java8224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_synpred236_Java8458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred236_Java8460 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_synpred236_Java8462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_classCreatorRest_in_synpred236_Java8464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_synpred237_Java8474 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_synpred237_Java8476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_classCreatorRest_in_synpred237_Java8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_synpred239_Java8508 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_createdName_in_synpred239_Java8510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred239_Java8520 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred239_Java8522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred239_Java8533 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred239_Java8535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_arrayInitializer_in_synpred239_Java8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred240_Java8605 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred240_Java8607 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred240_Java8621 = new BitSet(new long[]{0x0000000000000002L});

}
// $ANTLR 3.4 Java.g 2013-05-20 22:31:54

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


        ArrayList<String> lisLiterales = new ArrayList<String>(); 
        public ArrayList<String> getLisLiterales(){return this.lisLiterales;}
    	



    // $ANTLR start "compilationUnit"
    // Java.g:60:1: compilationUnit : ( ( annotations )? p= packageDeclaration )? ( importDeclaration )* (t= typeDeclaration )* ;
    public final void compilationUnit() throws RecognitionException {
        int compilationUnit_StartIndex = input.index();

        String p =null;

        Clase t =null;



            ArrayList<Clase> lisClases = new ArrayList<Clase>();     

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // Java.g:64:5: ( ( ( annotations )? p= packageDeclaration )? ( importDeclaration )* (t= typeDeclaration )* )
            // Java.g:64:9: ( ( annotations )? p= packageDeclaration )? ( importDeclaration )* (t= typeDeclaration )*
            {
            // Java.g:64:9: ( ( annotations )? p= packageDeclaration )?
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
                    // Java.g:64:13: ( annotations )? p= packageDeclaration
                    {
                    // Java.g:64:13: ( annotations )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==MONKEYS_AT) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // Java.g:64:14: annotations
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


            // Java.g:68:9: ( importDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IMPORT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Java.g:68:10: importDeclaration
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


            // Java.g:70:9: (t= typeDeclaration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ABSTRACT||LA4_0==BOOLEAN||LA4_0==BYTE||LA4_0==CHAR||LA4_0==CLASS||LA4_0==DOUBLE||LA4_0==ENUM||LA4_0==FINAL||LA4_0==FLOAT||LA4_0==IDENTIFIER||(LA4_0 >= INT && LA4_0 <= INTERFACE)||LA4_0==LONG||LA4_0==LT||(LA4_0 >= MONKEYS_AT && LA4_0 <= NATIVE)||(LA4_0 >= PRIVATE && LA4_0 <= PUBLIC)||(LA4_0 >= SEMI && LA4_0 <= SHORT)||(LA4_0 >= STATIC && LA4_0 <= STRICTFP)||LA4_0==SYNCHRONIZED||LA4_0==TRANSIENT||(LA4_0 >= VOID && LA4_0 <= VOLATILE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Java.g:70:10: t= typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_compilationUnit182);
            	    t=typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    if ( state.backtracking==0 ) {t.setNomPaq(p);claseAnalisis = t;}

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



    // $ANTLR start "packageDeclaration"
    // Java.g:74:1: packageDeclaration returns [String s] : 'package' q= qualifiedName ';' ;
    public final String packageDeclaration() throws RecognitionException {
        String s = null;

        int packageDeclaration_StartIndex = input.index();

        String q =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return s; }

            // Java.g:75:5: ( 'package' q= qualifiedName ';' )
            // Java.g:75:9: 'package' q= qualifiedName ';'
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration219); if (state.failed) return s;

            pushFollow(FOLLOW_qualifiedName_in_packageDeclaration225);
            q=qualifiedName();

            state._fsp--;
            if (state.failed) return s;

            if ( state.backtracking==0 ) {s = q;}

            match(input,SEMI,FOLLOW_SEMI_in_packageDeclaration237); if (state.failed) return s;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }

        }
        return s;
    }
    // $ANTLR end "packageDeclaration"



    // $ANTLR start "importDeclaration"
    // Java.g:79:1: importDeclaration : ( 'import' ( 'static' )? IDENTIFIER '.' '*' ';' | 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';' );
    public final void importDeclaration() throws RecognitionException {
        int importDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // Java.g:80:5: ( 'import' ( 'static' )? IDENTIFIER '.' '*' ';' | 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';' )
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
                    // Java.g:80:9: 'import' ( 'static' )? IDENTIFIER '.' '*' ';'
                    {
                    match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration258); if (state.failed) return ;

                    // Java.g:81:9: ( 'static' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==STATIC) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Java.g:81:10: 'static'
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
                    // Java.g:85:9: 'import' ( 'static' )? IDENTIFIER ( '.' IDENTIFIER )+ ( '.' '*' )? ';'
                    {
                    match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration322); if (state.failed) return ;

                    // Java.g:86:9: ( 'static' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==STATIC) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Java.g:86:10: 'static'
                            {
                            match(input,STATIC,FOLLOW_STATIC_in_importDeclaration334); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_importDeclaration355); if (state.failed) return ;

                    // Java.g:89:9: ( '.' IDENTIFIER )+
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
                    	    // Java.g:89:10: '.' IDENTIFIER
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


                    // Java.g:91:9: ( '.' '*' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==DOT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Java.g:91:10: '.' '*'
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
    // Java.g:96:1: qualifiedImportName : IDENTIFIER ( '.' IDENTIFIER )* ;
    public final void qualifiedImportName() throws RecognitionException {
        int qualifiedImportName_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // Java.g:97:5: ( IDENTIFIER ( '.' IDENTIFIER )* )
            // Java.g:97:9: IDENTIFIER ( '.' IDENTIFIER )*
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedImportName433); if (state.failed) return ;

            // Java.g:98:9: ( '.' IDENTIFIER )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Java.g:98:10: '.' IDENTIFIER
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
    // Java.g:102:1: typeDeclaration returns [Clase unaClase] : (c= classOrInterfaceDeclaration | ';' );
    public final Clase typeDeclaration() throws RecognitionException {
        Clase unaClase = null;

        int typeDeclaration_StartIndex = input.index();

        Clase c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return unaClase; }

            // Java.g:103:5: (c= classOrInterfaceDeclaration | ';' )
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
                    // Java.g:103:9: c= classOrInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration485);
                    c=classOrInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    if ( state.backtracking==0 ) {unaClase = c;}

                    }
                    break;
                case 2 :
                    // Java.g:104:9: ';'
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
    // Java.g:107:1: classOrInterfaceDeclaration returns [Clase unaClase] : (c= classDeclaration | interfaceDeclaration );
    public final Clase classOrInterfaceDeclaration() throws RecognitionException {
        Clase unaClase = null;

        int classOrInterfaceDeclaration_StartIndex = input.index();

        Clase c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return unaClase; }

            // Java.g:108:5: (c= classDeclaration | interfaceDeclaration )
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
                    // Java.g:108:9: c= classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration525);
                    c=classDeclaration();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    if ( state.backtracking==0 ) {unaClase = c;}

                    }
                    break;
                case 2 :
                    // Java.g:109:9: interfaceDeclaration
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


    public static class modifiers_return extends ParserRuleReturnScope {
        public String modif;
    };


    // $ANTLR start "modifiers"
    // Java.g:113:1: modifiers returns [String modif] : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )* ;
    public final JavaParser.modifiers_return modifiers() throws RecognitionException {
        JavaParser.modifiers_return retval = new JavaParser.modifiers_return();
        retval.start = input.LT(1);

        int modifiers_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // Java.g:114:5: ( ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )* )
            // Java.g:115:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )*
            {
            // Java.g:115:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )*
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
            	    // Java.g:115:10: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_modifiers575);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // Java.g:116:9: 'public'
            	    {
            	    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifiers585); if (state.failed) return retval;

            	    }
            	    break;
            	case 3 :
            	    // Java.g:117:9: 'protected'
            	    {
            	    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifiers596); if (state.failed) return retval;

            	    }
            	    break;
            	case 4 :
            	    // Java.g:118:9: 'private'
            	    {
            	    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifiers606); if (state.failed) return retval;

            	    }
            	    break;
            	case 5 :
            	    // Java.g:119:9: 'static'
            	    {
            	    match(input,STATIC,FOLLOW_STATIC_in_modifiers616); if (state.failed) return retval;

            	    }
            	    break;
            	case 6 :
            	    // Java.g:120:9: 'abstract'
            	    {
            	    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifiers626); if (state.failed) return retval;

            	    }
            	    break;
            	case 7 :
            	    // Java.g:121:9: 'final'
            	    {
            	    match(input,FINAL,FOLLOW_FINAL_in_modifiers636); if (state.failed) return retval;

            	    }
            	    break;
            	case 8 :
            	    // Java.g:122:9: 'native'
            	    {
            	    match(input,NATIVE,FOLLOW_NATIVE_in_modifiers646); if (state.failed) return retval;

            	    }
            	    break;
            	case 9 :
            	    // Java.g:123:9: 'synchronized'
            	    {
            	    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifiers656); if (state.failed) return retval;

            	    }
            	    break;
            	case 10 :
            	    // Java.g:124:9: 'transient'
            	    {
            	    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifiers666); if (state.failed) return retval;

            	    }
            	    break;
            	case 11 :
            	    // Java.g:125:9: 'volatile'
            	    {
            	    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifiers676); if (state.failed) return retval;

            	    }
            	    break;
            	case 12 :
            	    // Java.g:126:9: 'strictfp'
            	    {
            	    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifiers686); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop13;
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
            if ( state.backtracking>0 ) { memoize(input, 7, modifiers_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "modifiers"


    public static class variableModifiers_return extends ParserRuleReturnScope {
        public String s = "";
    };


    // $ANTLR start "variableModifiers"
    // Java.g:131:1: variableModifiers returns [String s = \"\"] : ( 'final' | annotation )* ;
    public final JavaParser.variableModifiers_return variableModifiers() throws RecognitionException {
        JavaParser.variableModifiers_return retval = new JavaParser.variableModifiers_return();
        retval.start = input.LT(1);

        int variableModifiers_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Java.g:132:5: ( ( 'final' | annotation )* )
            // Java.g:132:9: ( 'final' | annotation )*
            {
            // Java.g:132:9: ( 'final' | annotation )*
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
            	    // Java.g:132:13: 'final'
            	    {
            	    match(input,FINAL,FOLLOW_FINAL_in_variableModifiers721); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // Java.g:133:13: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_variableModifiers735);
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
    // Java.g:138:1: classDeclaration returns [Clase unaClase] : (n= normalClassDeclaration | enumDeclaration );
    public final Clase classDeclaration() throws RecognitionException {
        Clase unaClase = null;

        int classDeclaration_StartIndex = input.index();

        Clase n =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return unaClase; }

            // Java.g:139:5: (n= normalClassDeclaration | enumDeclaration )
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
                    // Java.g:139:9: n= normalClassDeclaration
                    {
                    pushFollow(FOLLOW_normalClassDeclaration_in_classDeclaration779);
                    n=normalClassDeclaration();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    if ( state.backtracking==0 ) {unaClase = n;}

                    }
                    break;
                case 2 :
                    // Java.g:140:9: enumDeclaration
                    {
                    pushFollow(FOLLOW_enumDeclaration_in_classDeclaration791);
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
    // Java.g:143:1: normalClassDeclaration returns [Clase unaClase] : modifiers 'class' I1= IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? c= classBody ;
    public final Clase normalClassDeclaration() throws RecognitionException {
        Clase unaClase = null;

        int normalClassDeclaration_StartIndex = input.index();

        Token I1=null;
        Clase c =null;

        JavaParser.modifiers_return modifiers1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return unaClase; }

            // Java.g:144:5: ( modifiers 'class' I1= IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? c= classBody )
            // Java.g:144:9: modifiers 'class' I1= IDENTIFIER ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? c= classBody
            {
            pushFollow(FOLLOW_modifiers_in_normalClassDeclaration815);
            modifiers1=modifiers();

            state._fsp--;
            if (state.failed) return unaClase;

            match(input,CLASS,FOLLOW_CLASS_in_normalClassDeclaration818); if (state.failed) return unaClase;

            I1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalClassDeclaration824); if (state.failed) return unaClase;

            // Java.g:145:9: ( typeParameters )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Java.g:145:10: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_normalClassDeclaration835);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    }
                    break;

            }


            // Java.g:147:9: ( 'extends' type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EXTENDS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Java.g:147:10: 'extends' type
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_normalClassDeclaration859); if (state.failed) return unaClase;

                    pushFollow(FOLLOW_type_in_normalClassDeclaration861);
                    type();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    }
                    break;

            }


            // Java.g:149:9: ( 'implements' typeList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IMPLEMENTS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Java.g:149:10: 'implements' typeList
                    {
                    match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_normalClassDeclaration883); if (state.failed) return unaClase;

                    pushFollow(FOLLOW_typeList_in_normalClassDeclaration885);
                    typeList();

                    state._fsp--;
                    if (state.failed) return unaClase;

                    }
                    break;

            }


            pushFollow(FOLLOW_classBody_in_normalClassDeclaration922);
            c=classBody();

            state._fsp--;
            if (state.failed) return unaClase;

            if ( state.backtracking==0 ) {c.setIde(new Id((I1!=null?I1.getText():null))); c.setModClase((modifiers1!=null?input.toString(modifiers1.start,modifiers1.stop):null));unaClase =c;}

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
    // Java.g:155:1: typeParameters : '<' typeParameter ( ',' typeParameter )* '>' ;
    public final void typeParameters() throws RecognitionException {
        int typeParameters_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // Java.g:156:5: ( '<' typeParameter ( ',' typeParameter )* '>' )
            // Java.g:156:9: '<' typeParameter ( ',' typeParameter )* '>'
            {
            match(input,LT,FOLLOW_LT_in_typeParameters945); if (state.failed) return ;

            pushFollow(FOLLOW_typeParameter_in_typeParameters959);
            typeParameter();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:158:13: ( ',' typeParameter )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Java.g:158:14: ',' typeParameter
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeParameters974); if (state.failed) return ;

            	    pushFollow(FOLLOW_typeParameter_in_typeParameters976);
            	    typeParameter();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match(input,GT,FOLLOW_GT_in_typeParameters1001); if (state.failed) return ;

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
    // Java.g:163:1: typeParameter : IDENTIFIER ( 'extends' typeBound )? ;
    public final void typeParameter() throws RecognitionException {
        int typeParameter_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // Java.g:164:5: ( IDENTIFIER ( 'extends' typeBound )? )
            // Java.g:164:9: IDENTIFIER ( 'extends' typeBound )?
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeParameter1021); if (state.failed) return ;

            // Java.g:165:9: ( 'extends' typeBound )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EXTENDS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Java.g:165:10: 'extends' typeBound
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_typeParameter1032); if (state.failed) return ;

                    pushFollow(FOLLOW_typeBound_in_typeParameter1034);
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
    // Java.g:170:1: typeBound : type ( '&' type )* ;
    public final void typeBound() throws RecognitionException {
        int typeBound_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // Java.g:171:5: ( type ( '&' type )* )
            // Java.g:171:9: type ( '&' type )*
            {
            pushFollow(FOLLOW_type_in_typeBound1066);
            type();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:172:9: ( '&' type )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AMP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Java.g:172:10: '&' type
            	    {
            	    match(input,AMP,FOLLOW_AMP_in_typeBound1077); if (state.failed) return ;

            	    pushFollow(FOLLOW_type_in_typeBound1079);
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
    // Java.g:177:1: enumDeclaration : modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody ;
    public final void enumDeclaration() throws RecognitionException {
        int enumDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // Java.g:178:5: ( modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody )
            // Java.g:178:9: modifiers ( 'enum' ) IDENTIFIER ( 'implements' typeList )? enumBody
            {
            pushFollow(FOLLOW_modifiers_in_enumDeclaration1111);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:179:9: ( 'enum' )
            // Java.g:179:10: 'enum'
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration1123); if (state.failed) return ;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDeclaration1144); if (state.failed) return ;

            // Java.g:182:9: ( 'implements' typeList )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IMPLEMENTS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Java.g:182:10: 'implements' typeList
                    {
                    match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_enumDeclaration1155); if (state.failed) return ;

                    pushFollow(FOLLOW_typeList_in_enumDeclaration1157);
                    typeList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDeclaration1178);
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
    // Java.g:188:1: enumBody : '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' ;
    public final void enumBody() throws RecognitionException {
        int enumBody_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // Java.g:189:5: ( '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' )
            // Java.g:189:9: '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_enumBody1203); if (state.failed) return ;

            // Java.g:190:9: ( enumConstants )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENTIFIER||LA23_0==MONKEYS_AT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Java.g:190:10: enumConstants
                    {
                    pushFollow(FOLLOW_enumConstants_in_enumBody1214);
                    enumConstants();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:192:9: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==COMMA) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Java.g:192:9: ','
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_enumBody1236); if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:193:9: ( enumBodyDeclarations )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==SEMI) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Java.g:193:10: enumBodyDeclarations
                    {
                    pushFollow(FOLLOW_enumBodyDeclarations_in_enumBody1249);
                    enumBodyDeclarations();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_enumBody1271); if (state.failed) return ;

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
    // Java.g:198:1: enumConstants : enumConstant ( ',' enumConstant )* ;
    public final void enumConstants() throws RecognitionException {
        int enumConstants_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }

            // Java.g:199:5: ( enumConstant ( ',' enumConstant )* )
            // Java.g:199:9: enumConstant ( ',' enumConstant )*
            {
            pushFollow(FOLLOW_enumConstant_in_enumConstants1291);
            enumConstant();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:200:9: ( ',' enumConstant )*
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
            	    // Java.g:200:10: ',' enumConstant
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumConstants1302); if (state.failed) return ;

            	    pushFollow(FOLLOW_enumConstant_in_enumConstants1304);
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
    // Java.g:208:1: enumConstant : ( annotations )? IDENTIFIER ( arguments )? ( classBody )? ;
    public final void enumConstant() throws RecognitionException {
        int enumConstant_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // Java.g:209:5: ( ( annotations )? IDENTIFIER ( arguments )? ( classBody )? )
            // Java.g:209:9: ( annotations )? IDENTIFIER ( arguments )? ( classBody )?
            {
            // Java.g:209:9: ( annotations )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==MONKEYS_AT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Java.g:209:10: annotations
                    {
                    pushFollow(FOLLOW_annotations_in_enumConstant1338);
                    annotations();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumConstant1359); if (state.failed) return ;

            // Java.g:212:9: ( arguments )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LPAREN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Java.g:212:10: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant1370);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:214:9: ( classBody )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LBRACE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Java.g:214:10: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_enumConstant1392);
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
    // Java.g:220:1: enumBodyDeclarations : ';' ( classBodyDeclaration )* ;
    public final void enumBodyDeclarations() throws RecognitionException {
        int enumBodyDeclarations_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // Java.g:221:5: ( ';' ( classBodyDeclaration )* )
            // Java.g:221:9: ';' ( classBodyDeclaration )*
            {
            match(input,SEMI,FOLLOW_SEMI_in_enumBodyDeclarations1433); if (state.failed) return ;

            // Java.g:222:9: ( classBodyDeclaration )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ABSTRACT||LA30_0==BOOLEAN||LA30_0==BYTE||LA30_0==CHAR||LA30_0==CLASS||LA30_0==DOUBLE||LA30_0==ENUM||LA30_0==FINAL||LA30_0==FLOAT||LA30_0==IDENTIFIER||(LA30_0 >= INT && LA30_0 <= INTERFACE)||LA30_0==LBRACE||LA30_0==LONG||LA30_0==LT||(LA30_0 >= MONKEYS_AT && LA30_0 <= NATIVE)||(LA30_0 >= PRIVATE && LA30_0 <= PUBLIC)||(LA30_0 >= SEMI && LA30_0 <= SHORT)||(LA30_0 >= STATIC && LA30_0 <= STRICTFP)||LA30_0==SYNCHRONIZED||LA30_0==TRANSIENT||(LA30_0 >= VOID && LA30_0 <= VOLATILE)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Java.g:222:10: classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_enumBodyDeclarations1445);
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
    // Java.g:226:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
    public final void interfaceDeclaration() throws RecognitionException {
        int interfaceDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // Java.g:227:5: ( normalInterfaceDeclaration | annotationTypeDeclaration )
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
                    // Java.g:227:9: normalInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration1476);
                    normalInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:228:9: annotationTypeDeclaration
                    {
                    pushFollow(FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration1486);
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
    // Java.g:231:1: normalInterfaceDeclaration : modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody ;
    public final void normalInterfaceDeclaration() throws RecognitionException {
        int normalInterfaceDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // Java.g:232:5: ( modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody )
            // Java.g:232:9: modifiers 'interface' IDENTIFIER ( typeParameters )? ( 'extends' typeList )? interfaceBody
            {
            pushFollow(FOLLOW_modifiers_in_normalInterfaceDeclaration1510);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            match(input,INTERFACE,FOLLOW_INTERFACE_in_normalInterfaceDeclaration1512); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration1514); if (state.failed) return ;

            // Java.g:233:9: ( typeParameters )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Java.g:233:10: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration1525);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:235:9: ( 'extends' typeList )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EXTENDS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Java.g:235:10: 'extends' typeList
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_normalInterfaceDeclaration1547); if (state.failed) return ;

                    pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration1549);
                    typeList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration1570);
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
    // Java.g:240:1: typeList : type ( ',' type )* ;
    public final void typeList() throws RecognitionException {
        int typeList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // Java.g:241:5: ( type ( ',' type )* )
            // Java.g:241:9: type ( ',' type )*
            {
            pushFollow(FOLLOW_type_in_typeList1590);
            type();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:242:9: ( ',' type )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==COMMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Java.g:242:10: ',' type
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeList1601); if (state.failed) return ;

            	    pushFollow(FOLLOW_type_in_typeList1603);
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
    // Java.g:246:1: classBody returns [Clase unaClase] : '{' (c= classBodyDeclaration )* '}' ;
    public final Clase classBody() throws RecognitionException {
        Clase unaClase = null;

        int classBody_StartIndex = input.index();

        JavaParser.classBodyDeclaration_return c =null;



            ArrayList<ClassBodyDecl> clDecl = new ArrayList<ClassBodyDecl>();
            Clase cl;
            ArrayList<String> lisUsosId = new ArrayList<String>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return unaClase; }

            // Java.g:255:5: ( '{' (c= classBodyDeclaration )* '}' )
            // Java.g:255:9: '{' (c= classBodyDeclaration )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_classBody1645); if (state.failed) return unaClase;

            // Java.g:256:9: (c= classBodyDeclaration )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ABSTRACT||LA35_0==BOOLEAN||LA35_0==BYTE||LA35_0==CHAR||LA35_0==CLASS||LA35_0==DOUBLE||LA35_0==ENUM||LA35_0==FINAL||LA35_0==FLOAT||LA35_0==IDENTIFIER||(LA35_0 >= INT && LA35_0 <= INTERFACE)||LA35_0==LBRACE||LA35_0==LONG||LA35_0==LT||(LA35_0 >= MONKEYS_AT && LA35_0 <= NATIVE)||(LA35_0 >= PRIVATE && LA35_0 <= PUBLIC)||(LA35_0 >= SEMI && LA35_0 <= SHORT)||(LA35_0 >= STATIC && LA35_0 <= STRICTFP)||LA35_0==SYNCHRONIZED||LA35_0==TRANSIENT||(LA35_0 >= VOID && LA35_0 <= VOLATILE)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Java.g:256:10: c= classBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_classBodyDeclaration_in_classBody1661);
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


            if ( state.backtracking==0 ) {cl = new Clase(clDecl);unaClase = cl;}

            match(input,RBRACE,FOLLOW_RBRACE_in_classBody1686); if (state.failed) return unaClase;

            }

            if ( state.backtracking==0 ) {//analizo uso en variables globales
                unaClase.buscarUso(lisUsosId);
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
    // Java.g:261:1: interfaceBody : '{' ( interfaceBodyDeclaration )* '}' ;
    public final void interfaceBody() throws RecognitionException {
        int interfaceBody_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // Java.g:262:5: ( '{' ( interfaceBodyDeclaration )* '}' )
            // Java.g:262:9: '{' ( interfaceBodyDeclaration )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_interfaceBody1707); if (state.failed) return ;

            // Java.g:263:9: ( interfaceBodyDeclaration )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ABSTRACT||LA36_0==BOOLEAN||LA36_0==BYTE||LA36_0==CHAR||LA36_0==CLASS||LA36_0==DOUBLE||LA36_0==ENUM||LA36_0==FINAL||LA36_0==FLOAT||LA36_0==IDENTIFIER||(LA36_0 >= INT && LA36_0 <= INTERFACE)||LA36_0==LONG||LA36_0==LT||(LA36_0 >= MONKEYS_AT && LA36_0 <= NATIVE)||(LA36_0 >= PRIVATE && LA36_0 <= PUBLIC)||(LA36_0 >= SEMI && LA36_0 <= SHORT)||(LA36_0 >= STATIC && LA36_0 <= STRICTFP)||LA36_0==SYNCHRONIZED||LA36_0==TRANSIENT||(LA36_0 >= VOID && LA36_0 <= VOLATILE)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Java.g:263:10: interfaceBodyDeclaration
            	    {
            	    pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody1719);
            	    interfaceBodyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_interfaceBody1741); if (state.failed) return ;

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
        public ArrayList<String> lisUsosId;
    };


    // $ANTLR start "classBodyDeclaration"
    // Java.g:268:1: classBodyDeclaration returns [ClassBodyDecl cBd,ArrayList<String> lisUsosId] : ( ';' | ( 'static' )? block |memb= memberDecl );
    public final JavaParser.classBodyDeclaration_return classBodyDeclaration() throws RecognitionException {
        JavaParser.classBodyDeclaration_return retval = new JavaParser.classBodyDeclaration_return();
        retval.start = input.LT(1);

        int classBodyDeclaration_StartIndex = input.index();

        JavaParser.memberDecl_return memb =null;



            retval.cBd = new ClassBodyDecl();
            retval.lisUsosId = new ArrayList<String>(); 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Java.g:273:5: ( ';' | ( 'static' )? block |memb= memberDecl )
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
                    // Java.g:273:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_classBodyDeclaration1768); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Java.g:274:9: ( 'static' )? block
                    {
                    // Java.g:274:9: ( 'static' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==STATIC) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // Java.g:274:10: 'static'
                            {
                            match(input,STATIC,FOLLOW_STATIC_in_classBodyDeclaration1779); if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_classBodyDeclaration1801);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Java.g:277:9: memb= memberDecl
                    {
                    pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration1815);
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
        public ArrayList<String> lisUsosId;
    };


    // $ANTLR start "memberDecl"
    // Java.g:280:1: memberDecl returns [ClassBodyDecl cBd,ArrayList<String> lisUsosId] : (f1= fieldDeclaration |m1= methodDeclaration | classDeclaration | interfaceDeclaration );
    public final JavaParser.memberDecl_return memberDecl() throws RecognitionException {
        JavaParser.memberDecl_return retval = new JavaParser.memberDecl_return();
        retval.start = input.LT(1);

        int memberDecl_StartIndex = input.index();

        Map<String,Declaracion> f1 =null;

        JavaParser.methodDeclaration_return m1 =null;


           
            retval.cBd = new ClassBodyDecl();
            retval.lisUsosId = new ArrayList<String>(); 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Java.g:286:5: (f1= fieldDeclaration |m1= methodDeclaration | classDeclaration | interfaceDeclaration )
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
                    // Java.g:286:10: f1= fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_memberDecl1850);
                    f1=fieldDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.cBd.setLisDecl(f1);}

                    }
                    break;
                case 2 :
                    // Java.g:287:10: m1= methodDeclaration
                    {
                    pushFollow(FOLLOW_methodDeclaration_in_memberDecl1867);
                    m1=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.cBd.setMe(m1.me);retval.cBd.setLineaMetodo(m1.lineaMetodo);retval.lisUsosId = m1.lisUsosId;}

                    }
                    break;
                case 3 :
                    // Java.g:288:10: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_memberDecl1880);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Java.g:289:10: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_memberDecl1891);
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
        public ArrayList<String> lisUsosId;
    };


    // $ANTLR start "methodDeclaration"
    // Java.g:293:1: methodDeclaration returns [Metodo me, int lineaMetodo,ArrayList<String> lisUsosId] : ( modifiers ( typeParameters )? Id1= IDENTIFIER f1= formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? (b1= blockStatement )* '}' | modifiers ( typeParameters )? ( type | 'void' ) Id2= IDENTIFIER f2= formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? (b2= block | ';' ) );
    public final JavaParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        JavaParser.methodDeclaration_return retval = new JavaParser.methodDeclaration_return();
        retval.start = input.LT(1);

        int methodDeclaration_StartIndex = input.index();

        Token Id1=null;
        Token Id2=null;
        Map<String,Parametro> f1 =null;

        JavaParser.blockStatement_return b1 =null;

        Map<String,Parametro> f2 =null;

        JavaParser.block_return b2 =null;

        JavaParser.modifiers_return modifiers2 =null;

        JavaParser.modifiers_return modifiers3 =null;

        JavaParser.type_return type4 =null;



            retval.me = new Metodo();
            String mod = new String();
            String tipo = new String();
            Map<String,Declaracion> lisDeclme = new HashMap<String,Declaracion>(); //Para hacer el merge con la listas de decl del constructor
            retval.lisUsosId = new ArrayList<String>();    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // Java.g:306:5: ( modifiers ( typeParameters )? Id1= IDENTIFIER f1= formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? (b1= blockStatement )* '}' | modifiers ( typeParameters )? ( type | 'void' ) Id2= IDENTIFIER f2= formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? (b2= block | ';' ) )
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
                    // Java.g:308:10: modifiers ( typeParameters )? Id1= IDENTIFIER f1= formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? (b1= blockStatement )* '}'
                    {
                    pushFollow(FOLLOW_modifiers_in_methodDeclaration1940);
                    modifiers2=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {mod = (modifiers2!=null?input.toString(modifiers2.start,modifiers2.stop):null);tipo="";}

                    // Java.g:309:9: ( typeParameters )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==LT) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // Java.g:309:10: typeParameters
                            {
                            pushFollow(FOLLOW_typeParameters_in_methodDeclaration1953);
                            typeParameters();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    Id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration1978); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.me = new Metodo(mod,tipo,new Id((Id1!=null?Id1.getText():null)));retval.lineaMetodo =Id1.getLine();}

                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration1994);
                    f1=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.me.addListParam(f1);}

                    // Java.g:313:9: ( 'throws' qualifiedNameList )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==THROWS) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // Java.g:313:10: 'throws' qualifiedNameList
                            {
                            match(input,THROWS,FOLLOW_THROWS_in_methodDeclaration2007); if (state.failed) return retval;

                            pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaration2009);
                            qualifiedNameList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,LBRACE,FOLLOW_LBRACE_in_methodDeclaration2030); if (state.failed) return retval;

                    // Java.g:316:9: ( explicitConstructorInvocation )?
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
                            // Java.g:316:10: explicitConstructorInvocation
                            {
                            pushFollow(FOLLOW_explicitConstructorInvocation_in_methodDeclaration2042);
                            explicitConstructorInvocation();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    // Java.g:318:9: (b1= blockStatement )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==ABSTRACT||(LA43_0 >= ASSERT && LA43_0 <= BANG)||(LA43_0 >= BOOLEAN && LA43_0 <= BYTE)||(LA43_0 >= CHAR && LA43_0 <= CLASS)||LA43_0==CONTINUE||LA43_0==DO||(LA43_0 >= DOUBLE && LA43_0 <= DOUBLELITERAL)||LA43_0==ENUM||(LA43_0 >= FALSE && LA43_0 <= FINAL)||(LA43_0 >= FLOAT && LA43_0 <= FOR)||(LA43_0 >= IDENTIFIER && LA43_0 <= IF)||(LA43_0 >= INT && LA43_0 <= INTLITERAL)||LA43_0==LBRACE||(LA43_0 >= LONG && LA43_0 <= LT)||(LA43_0 >= MONKEYS_AT && LA43_0 <= NULL)||LA43_0==PLUS||(LA43_0 >= PLUSPLUS && LA43_0 <= PUBLIC)||LA43_0==RETURN||(LA43_0 >= SEMI && LA43_0 <= SHORT)||(LA43_0 >= STATIC && LA43_0 <= SUB)||(LA43_0 >= SUBSUB && LA43_0 <= SYNCHRONIZED)||(LA43_0 >= THIS && LA43_0 <= THROW)||(LA43_0 >= TILDE && LA43_0 <= WHILE)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // Java.g:318:10: b1= blockStatement
                    	    {
                    	    pushFollow(FOLLOW_blockStatement_in_methodDeclaration2068);
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

                    match(input,RBRACE,FOLLOW_RBRACE_in_methodDeclaration2093); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Java.g:321:9: modifiers ( typeParameters )? ( type | 'void' ) Id2= IDENTIFIER f2= formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? (b2= block | ';' )
                    {
                    pushFollow(FOLLOW_modifiers_in_methodDeclaration2219);
                    modifiers3=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {mod = (modifiers3!=null?input.toString(modifiers3.start,modifiers3.stop):null);}

                    // Java.g:322:9: ( typeParameters )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==LT) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // Java.g:322:10: typeParameters
                            {
                            pushFollow(FOLLOW_typeParameters_in_methodDeclaration2232);
                            typeParameters();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    // Java.g:324:9: ( type | 'void' )
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
                            // Java.g:324:10: type
                            {
                            pushFollow(FOLLOW_type_in_methodDeclaration2254);
                            type4=type();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) {tipo = (type4!=null?input.toString(type4.start,type4.stop):null);}

                            }
                            break;
                        case 2 :
                            // Java.g:325:13: 'void'
                            {
                            match(input,VOID,FOLLOW_VOID_in_methodDeclaration2270); if (state.failed) return retval;

                            if ( state.backtracking==0 ) {tipo = "void";}

                            }
                            break;

                    }


                    Id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodDeclaration2296); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.me = new Metodo(mod,tipo,new Id((Id2!=null?Id2.getText():null)));retval.lineaMetodo =Id2.getLine();}

                    pushFollow(FOLLOW_formalParameters_in_methodDeclaration2312);
                    f2=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.me.addListParam(f2);}

                    // Java.g:329:9: ( '[' ']' )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==LBRACKET) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // Java.g:329:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_methodDeclaration2325); if (state.failed) return retval;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_methodDeclaration2327); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    // Java.g:331:9: ( 'throws' qualifiedNameList )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==THROWS) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // Java.g:331:10: 'throws' qualifiedNameList
                            {
                            match(input,THROWS,FOLLOW_THROWS_in_methodDeclaration2349); if (state.failed) return retval;

                            pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaration2351);
                            qualifiedNameList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    // Java.g:333:9: (b2= block | ';' )
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
                            // Java.g:334:12: b2= block
                            {
                            pushFollow(FOLLOW_block_in_methodDeclaration2409);
                            b2=block();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) {retval.lisUsosId.addAll(b2.lisUsosId);retval.me.addListDecl(b2.lisDecl);}

                            }
                            break;
                        case 2 :
                            // Java.g:335:13: ';'
                            {
                            match(input,SEMI,FOLLOW_SEMI_in_methodDeclaration2425); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {//elimino los elementos ya analizados el resto sube para su analisis en las declaraciones globales

            retval.lisUsosId = retval.me.buscarUsoDecl(retval.lisUsosId);retval.lisUsosId = retval.me.buscarUsoParam(retval.lisUsosId);

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
    // Java.g:340:1: fieldDeclaration returns [Map<String,Declaracion> lisDecl] : modifiers type v1= variableDeclarator[flagStr] ( ',' v2= variableDeclarator[flagStr] )* ';' ;
    public final Map<String,Declaracion> fieldDeclaration() throws RecognitionException {
        Map<String,Declaracion> lisDecl = null;

        int fieldDeclaration_StartIndex = input.index();

        Id v1 =null;

        Id v2 =null;

        JavaParser.modifiers_return modifiers5 =null;

        JavaParser.type_return type6 =null;



            lisDecl = new HashMap<String,Declaracion>();
            String mod = new String();
            String tipo = new String();
            boolean flagStr = false;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return lisDecl; }

            // Java.g:347:5: ( modifiers type v1= variableDeclarator[flagStr] ( ',' v2= variableDeclarator[flagStr] )* ';' )
            // Java.g:348:9: modifiers type v1= variableDeclarator[flagStr] ( ',' v2= variableDeclarator[flagStr] )* ';'
            {
            pushFollow(FOLLOW_modifiers_in_fieldDeclaration2608);
            modifiers5=modifiers();

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {mod = (modifiers5!=null?input.toString(modifiers5.start,modifiers5.stop):null);}

            pushFollow(FOLLOW_type_in_fieldDeclaration2620);
            type6=type();

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {tipo = (type6!=null?input.toString(type6.start,type6.stop):null); if(tipo.equals("String")){flagStr=true;}}

            pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration2643);
            v1=variableDeclarator(flagStr);

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {lisDecl.put(v1.getNomID(),new Declaracion(mod,tipo,v1));}

            // Java.g:351:9: ( ',' v2= variableDeclarator[flagStr] )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // Java.g:351:10: ',' v2= variableDeclarator[flagStr]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_fieldDeclaration2658); if (state.failed) return lisDecl;

            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDeclaration2664);
            	    v2=variableDeclarator(flagStr);

            	    state._fsp--;
            	    if (state.failed) return lisDecl;

            	    if ( state.backtracking==0 ) {lisDecl.put(v2.getNomID(),new Declaracion(mod,tipo,v2));}

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_fieldDeclaration2689); if (state.failed) return lisDecl;

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
    // Java.g:356:1: variableDeclarator[boolean flag] returns [Id id] : IDENTIFIER ( '[' ']' )* ( '=' v1= variableInitializer )? ;
    public final Id variableDeclarator(boolean flag) throws RecognitionException {
        Id id = null;

        int variableDeclarator_StartIndex = input.index();

        Token IDENTIFIER7=null;
        String v1 =null;



            boolean flagStr = flag;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return id; }

            // Java.g:360:5: ( IDENTIFIER ( '[' ']' )* ( '=' v1= variableInitializer )? )
            // Java.g:360:9: IDENTIFIER ( '[' ']' )* ( '=' v1= variableInitializer )?
            {
            IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableDeclarator2754); if (state.failed) return id;

            if ( state.backtracking==0 ) {id = new Id((IDENTIFIER7!=null?IDENTIFIER7.getText():null));}

            // Java.g:361:9: ( '[' ']' )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==LBRACKET) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Java.g:361:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_variableDeclarator2767); if (state.failed) return id;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_variableDeclarator2769); if (state.failed) return id;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            // Java.g:363:9: ( '=' v1= variableInitializer )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EQ) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Java.g:363:10: '=' v1= variableInitializer
                    {
                    match(input,EQ,FOLLOW_EQ_in_variableDeclarator2791); if (state.failed) return id;

                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator2797);
                    v1=variableInitializer();

                    state._fsp--;
                    if (state.failed) return id;

                    if ( state.backtracking==0 ) {if(flagStr){id.setStrContenido(v1);}}

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
    // Java.g:370:1: interfaceBodyDeclaration : ( interfaceFieldDeclaration | interfaceMethodDeclaration | interfaceDeclaration | classDeclaration | ';' );
    public final void interfaceBodyDeclaration() throws RecognitionException {
        int interfaceBodyDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // Java.g:371:5: ( interfaceFieldDeclaration | interfaceMethodDeclaration | interfaceDeclaration | classDeclaration | ';' )
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
                    // Java.g:372:9: interfaceFieldDeclaration
                    {
                    pushFollow(FOLLOW_interfaceFieldDeclaration_in_interfaceBodyDeclaration2838);
                    interfaceFieldDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:373:9: interfaceMethodDeclaration
                    {
                    pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDeclaration2848);
                    interfaceMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:374:9: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_interfaceBodyDeclaration2858);
                    interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Java.g:375:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_interfaceBodyDeclaration2868);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Java.g:376:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_interfaceBodyDeclaration2878); if (state.failed) return ;

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
    // Java.g:379:1: interfaceMethodDeclaration : modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' ;
    public final void interfaceMethodDeclaration() throws RecognitionException {
        int interfaceMethodDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }

            // Java.g:380:5: ( modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' )
            // Java.g:380:9: modifiers ( typeParameters )? ( type | 'void' ) IDENTIFIER formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';'
            {
            pushFollow(FOLLOW_modifiers_in_interfaceMethodDeclaration2898);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:381:9: ( typeParameters )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Java.g:381:10: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_interfaceMethodDeclaration2909);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:383:9: ( type | 'void' )
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
                    // Java.g:383:10: type
                    {
                    pushFollow(FOLLOW_type_in_interfaceMethodDeclaration2931);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:384:10: 'void'
                    {
                    match(input,VOID,FOLLOW_VOID_in_interfaceMethodDeclaration2942); if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interfaceMethodDeclaration2962); if (state.failed) return ;

            pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaration2972);
            formalParameters();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:388:9: ( '[' ']' )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==LBRACKET) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Java.g:388:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_interfaceMethodDeclaration2983); if (state.failed) return ;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_interfaceMethodDeclaration2985); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            // Java.g:390:9: ( 'throws' qualifiedNameList )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==THROWS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // Java.g:390:10: 'throws' qualifiedNameList
                    {
                    match(input,THROWS,FOLLOW_THROWS_in_interfaceMethodDeclaration3007); if (state.failed) return ;

                    pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaration3009);
                    qualifiedNameList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,SEMI,FOLLOW_SEMI_in_interfaceMethodDeclaration3022); if (state.failed) return ;

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
    // Java.g:399:1: interfaceFieldDeclaration : modifiers type variableDeclarator[false] ( ',' variableDeclarator[false] )* ';' ;
    public final void interfaceFieldDeclaration() throws RecognitionException {
        int interfaceFieldDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }

            // Java.g:400:5: ( modifiers type variableDeclarator[false] ( ',' variableDeclarator[false] )* ';' )
            // Java.g:400:9: modifiers type variableDeclarator[false] ( ',' variableDeclarator[false] )* ';'
            {
            pushFollow(FOLLOW_modifiers_in_interfaceFieldDeclaration3044);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_interfaceFieldDeclaration3046);
            type();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDeclarator_in_interfaceFieldDeclaration3048);
            variableDeclarator(false);

            state._fsp--;
            if (state.failed) return ;

            // Java.g:401:9: ( ',' variableDeclarator[false] )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==COMMA) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // Java.g:401:10: ',' variableDeclarator[false]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_interfaceFieldDeclaration3061); if (state.failed) return ;

            	    pushFollow(FOLLOW_variableDeclarator_in_interfaceFieldDeclaration3063);
            	    variableDeclarator(false);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_interfaceFieldDeclaration3086); if (state.failed) return ;

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
    // Java.g:407:1: type returns [String tip] : ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* );
    public final JavaParser.type_return type() throws RecognitionException {
        JavaParser.type_return retval = new JavaParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        JavaParser.primitiveType_return primitiveType8 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Java.g:408:5: ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* )
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
                    // Java.g:408:9: classOrInterfaceType ( '[' ']' )*
                    {
                    pushFollow(FOLLOW_classOrInterfaceType_in_type3110);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;

                    // Java.g:409:9: ( '[' ']' )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==LBRACKET) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // Java.g:409:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_type3121); if (state.failed) return retval;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_type3123); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Java.g:411:9: primitiveType ( '[' ']' )*
                    {
                    pushFollow(FOLLOW_primitiveType_in_type3144);
                    primitiveType8=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.tip = (primitiveType8!=null?input.toString(primitiveType8.start,primitiveType8.stop):null);}

                    // Java.g:412:9: ( '[' ']' )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==LBRACKET) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // Java.g:412:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_type3157); if (state.failed) return retval;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_type3159); if (state.failed) return retval;

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
    // Java.g:417:1: classOrInterfaceType : IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )* ;
    public final void classOrInterfaceType() throws RecognitionException {
        int classOrInterfaceType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }

            // Java.g:418:5: ( IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )* )
            // Java.g:418:9: IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )*
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterfaceType3191); if (state.failed) return ;

            // Java.g:419:9: ( typeArguments )?
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
                    // Java.g:419:10: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType3202);
                    typeArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:421:9: ( '.' IDENTIFIER ( typeArguments )? )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==DOT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // Java.g:421:10: '.' IDENTIFIER ( typeArguments )?
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_classOrInterfaceType3224); if (state.failed) return ;

            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterfaceType3226); if (state.failed) return ;

            	    // Java.g:422:13: ( typeArguments )?
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
            	            // Java.g:422:14: typeArguments
            	            {
            	            pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType3241);
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
    // Java.g:427:1: primitiveType returns [String primtype] : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
    public final JavaParser.primitiveType_return primitiveType() throws RecognitionException {
        JavaParser.primitiveType_return retval = new JavaParser.primitiveType_return();
        retval.start = input.LT(1);

        int primitiveType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Java.g:428:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
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
    // Java.g:438:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
    public final void typeArguments() throws RecognitionException {
        int typeArguments_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }

            // Java.g:439:5: ( '<' typeArgument ( ',' typeArgument )* '>' )
            // Java.g:439:9: '<' typeArgument ( ',' typeArgument )* '>'
            {
            match(input,LT,FOLLOW_LT_in_typeArguments3382); if (state.failed) return ;

            pushFollow(FOLLOW_typeArgument_in_typeArguments3384);
            typeArgument();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:440:9: ( ',' typeArgument )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==COMMA) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // Java.g:440:10: ',' typeArgument
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeArguments3395); if (state.failed) return ;

            	    pushFollow(FOLLOW_typeArgument_in_typeArguments3397);
            	    typeArgument();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            match(input,GT,FOLLOW_GT_in_typeArguments3419); if (state.failed) return ;

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
    // Java.g:445:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
    public final void typeArgument() throws RecognitionException {
        int typeArgument_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }

            // Java.g:446:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
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
                    // Java.g:446:9: type
                    {
                    pushFollow(FOLLOW_type_in_typeArgument3439);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:447:9: '?' ( ( 'extends' | 'super' ) type )?
                    {
                    match(input,QUES,FOLLOW_QUES_in_typeArgument3449); if (state.failed) return ;

                    // Java.g:448:9: ( ( 'extends' | 'super' ) type )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==EXTENDS||LA66_0==SUPER) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Java.g:449:13: ( 'extends' | 'super' ) type
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


                            pushFollow(FOLLOW_type_in_typeArgument3517);
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
    // Java.g:456:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
    public final void qualifiedNameList() throws RecognitionException {
        int qualifiedNameList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }

            // Java.g:457:5: ( qualifiedName ( ',' qualifiedName )* )
            // Java.g:457:9: qualifiedName ( ',' qualifiedName )*
            {
            pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList3548);
            qualifiedName();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:458:9: ( ',' qualifiedName )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // Java.g:458:10: ',' qualifiedName
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_qualifiedNameList3559); if (state.failed) return ;

            	    pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList3561);
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
    // Java.g:462:1: formalParameters returns [Map<String,Parametro> lisParam] : '(' (f1= formalParameterDecls )? ')' ;
    public final Map<String,Parametro> formalParameters() throws RecognitionException {
        Map<String,Parametro> lisParam = null;

        int formalParameters_StartIndex = input.index();

        Map<String,Parametro> f1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return lisParam; }

            // Java.g:463:5: ( '(' (f1= formalParameterDecls )? ')' )
            // Java.g:463:9: '(' (f1= formalParameterDecls )? ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameters3595); if (state.failed) return lisParam;

            // Java.g:464:9: (f1= formalParameterDecls )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==BOOLEAN||LA69_0==BYTE||LA69_0==CHAR||LA69_0==DOUBLE||LA69_0==FINAL||LA69_0==FLOAT||LA69_0==IDENTIFIER||LA69_0==INT||LA69_0==LONG||LA69_0==MONKEYS_AT||LA69_0==SHORT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // Java.g:464:10: f1= formalParameterDecls
                    {
                    pushFollow(FOLLOW_formalParameterDecls_in_formalParameters3610);
                    f1=formalParameterDecls();

                    state._fsp--;
                    if (state.failed) return lisParam;

                    if ( state.backtracking==0 ) {lisParam = f1;}

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameters3634); if (state.failed) return lisParam;

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
    // Java.g:469:1: formalParameterDecls returns [Map<String,Parametro> lisParam] : ( ellipsisParameterDecl |p1= normalParameterDecl ( ',' p2= normalParameterDecl )* | ( normalParameterDecl ',' )+ ellipsisParameterDecl );
    public final Map<String,Parametro> formalParameterDecls() throws RecognitionException {
        Map<String,Parametro> lisParam = null;

        int formalParameterDecls_StartIndex = input.index();

        Parametro p1 =null;

        Parametro p2 =null;



            lisParam = new HashMap<String,Parametro>();    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return lisParam; }

            // Java.g:473:5: ( ellipsisParameterDecl |p1= normalParameterDecl ( ',' p2= normalParameterDecl )* | ( normalParameterDecl ',' )+ ellipsisParameterDecl )
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
                    // Java.g:473:9: ellipsisParameterDecl
                    {
                    pushFollow(FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3661);
                    ellipsisParameterDecl();

                    state._fsp--;
                    if (state.failed) return lisParam;

                    }
                    break;
                case 2 :
                    // Java.g:475:8: p1= normalParameterDecl ( ',' p2= normalParameterDecl )*
                    {
                    pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3675);
                    p1=normalParameterDecl();

                    state._fsp--;
                    if (state.failed) return lisParam;

                    if ( state.backtracking==0 ) {lisParam.put(p1.getIdent().getNomID(),p1);}

                    // Java.g:476:9: ( ',' p2= normalParameterDecl )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==COMMA) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // Java.g:476:10: ',' p2= normalParameterDecl
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterDecls3688); if (state.failed) return lisParam;

                    	    pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3694);
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
                    // Java.g:479:9: ( normalParameterDecl ',' )+ ellipsisParameterDecl
                    {
                    // Java.g:479:9: ( normalParameterDecl ',' )+
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
                    	    // Java.g:479:10: normalParameterDecl ','
                    	    {
                    	    pushFollow(FOLLOW_normalParameterDecl_in_formalParameterDecls3719);
                    	    normalParameterDecl();

                    	    state._fsp--;
                    	    if (state.failed) return lisParam;

                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterDecls3729); if (state.failed) return lisParam;

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


                    pushFollow(FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3751);
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
    // Java.g:485:1: normalParameterDecl returns [Parametro pa] : variableModifiers type IDENTIFIER ( '[' ']' )* ;
    public final Parametro normalParameterDecl() throws RecognitionException {
        Parametro pa = null;

        int normalParameterDecl_StartIndex = input.index();

        Token IDENTIFIER11=null;
        JavaParser.variableModifiers_return variableModifiers9 =null;

        JavaParser.type_return type10 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return pa; }

            // Java.g:486:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* )
            // Java.g:486:9: variableModifiers type IDENTIFIER ( '[' ']' )*
            {
            pushFollow(FOLLOW_variableModifiers_in_normalParameterDecl3774);
            variableModifiers9=variableModifiers();

            state._fsp--;
            if (state.failed) return pa;

            pushFollow(FOLLOW_type_in_normalParameterDecl3776);
            type10=type();

            state._fsp--;
            if (state.failed) return pa;

            IDENTIFIER11=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_normalParameterDecl3778); if (state.failed) return pa;

            if ( state.backtracking==0 ) {pa = new Parametro((variableModifiers9!=null?input.toString(variableModifiers9.start,variableModifiers9.stop):null), (type10!=null?input.toString(type10.start,type10.stop):null), new Id((IDENTIFIER11!=null?IDENTIFIER11.getText():null)));}

            // Java.g:487:9: ( '[' ']' )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==LBRACKET) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // Java.g:487:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_normalParameterDecl3791); if (state.failed) return pa;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_normalParameterDecl3793); if (state.failed) return pa;

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
    // Java.g:491:1: ellipsisParameterDecl : variableModifiers type '...' IDENTIFIER ;
    public final void ellipsisParameterDecl() throws RecognitionException {
        int ellipsisParameterDecl_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }

            // Java.g:492:5: ( variableModifiers type '...' IDENTIFIER )
            // Java.g:492:9: variableModifiers type '...' IDENTIFIER
            {
            pushFollow(FOLLOW_variableModifiers_in_ellipsisParameterDecl3824);
            variableModifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_ellipsisParameterDecl3834);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_ellipsisParameterDecl3837); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ellipsisParameterDecl3847); if (state.failed) return ;

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
    // Java.g:498:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );
    public final void explicitConstructorInvocation() throws RecognitionException {
        int explicitConstructorInvocation_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }

            // Java.g:499:5: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' )
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
                    if (state.backtracking>0) {state.failed=true; return ;}
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
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // Java.g:499:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
                    {
                    // Java.g:499:9: ( nonWildcardTypeArguments )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==LT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // Java.g:499:10: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3869);
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


                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation3927);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,SEMI,FOLLOW_SEMI_in_explicitConstructorInvocation3929); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:506:9: primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';'
                    {
                    pushFollow(FOLLOW_primary_in_explicitConstructorInvocation3940);
                    primary();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,DOT,FOLLOW_DOT_in_explicitConstructorInvocation3950); if (state.failed) return ;

                    // Java.g:508:9: ( nonWildcardTypeArguments )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==LT) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // Java.g:508:10: nonWildcardTypeArguments
                            {
                            pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3961);
                            nonWildcardTypeArguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation3982); if (state.failed) return ;

                    pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation3992);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,SEMI,FOLLOW_SEMI_in_explicitConstructorInvocation3994); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "explicitConstructorInvocation"



    // $ANTLR start "qualifiedName"
    // Java.g:514:1: qualifiedName returns [String s= \"\"] : Id1= IDENTIFIER ( '.' Id2= IDENTIFIER )* ;
    public final String qualifiedName() throws RecognitionException {
        String s =  "";

        int qualifiedName_StartIndex = input.index();

        Token Id1=null;
        Token Id2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return s; }

            // Java.g:515:5: (Id1= IDENTIFIER ( '.' Id2= IDENTIFIER )* )
            // Java.g:515:9: Id1= IDENTIFIER ( '.' Id2= IDENTIFIER )*
            {
            Id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedName4021); if (state.failed) return s;

            if ( state.backtracking==0 ) {s = (Id1!=null?Id1.getText():null);}

            // Java.g:516:9: ( '.' Id2= IDENTIFIER )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==DOT) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // Java.g:516:10: '.' Id2= IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_qualifiedName4035); if (state.failed) return s;

            	    Id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedName4041); if (state.failed) return s;

            	    if ( state.backtracking==0 ) {s = s + "." + (Id2!=null?Id2.getText():null);}

            	    }
            	    break;

            	default :
            	    break loop77;
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
            if ( state.backtracking>0 ) { memoize(input, 43, qualifiedName_StartIndex); }

        }
        return s;
    }
    // $ANTLR end "qualifiedName"



    // $ANTLR start "annotations"
    // Java.g:520:1: annotations : ( annotation )+ ;
    public final void annotations() throws RecognitionException {
        int annotations_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }

            // Java.g:521:5: ( ( annotation )+ )
            // Java.g:521:9: ( annotation )+
            {
            // Java.g:521:9: ( annotation )+
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
            	    // Java.g:521:10: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations4075);
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
    // Java.g:529:1: annotation : '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )? ;
    public final void annotation() throws RecognitionException {
        int annotation_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }

            // Java.g:530:5: ( '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )? )
            // Java.g:530:9: '@' qualifiedName ( '(' ( elementValuePairs | elementValue )? ')' )?
            {
            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotation4108); if (state.failed) return ;

            pushFollow(FOLLOW_qualifiedName_in_annotation4110);
            qualifiedName();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:531:9: ( '(' ( elementValuePairs | elementValue )? ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==LPAREN) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Java.g:531:13: '(' ( elementValuePairs | elementValue )? ')'
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_annotation4124); if (state.failed) return ;

                    // Java.g:532:19: ( elementValuePairs | elementValue )?
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
                            // Java.g:532:23: elementValuePairs
                            {
                            pushFollow(FOLLOW_elementValuePairs_in_annotation4151);
                            elementValuePairs();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // Java.g:533:23: elementValue
                            {
                            pushFollow(FOLLOW_elementValue_in_annotation4175);
                            elementValue();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_annotation4211); if (state.failed) return ;

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
    // Java.g:539:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
    public final void elementValuePairs() throws RecognitionException {
        int elementValuePairs_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }

            // Java.g:540:5: ( elementValuePair ( ',' elementValuePair )* )
            // Java.g:540:9: elementValuePair ( ',' elementValuePair )*
            {
            pushFollow(FOLLOW_elementValuePair_in_elementValuePairs4243);
            elementValuePair();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:541:9: ( ',' elementValuePair )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // Java.g:541:10: ',' elementValuePair
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elementValuePairs4254); if (state.failed) return ;

            	    pushFollow(FOLLOW_elementValuePair_in_elementValuePairs4256);
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
    // Java.g:545:1: elementValuePair : IDENTIFIER '=' elementValue ;
    public final void elementValuePair() throws RecognitionException {
        int elementValuePair_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }

            // Java.g:546:5: ( IDENTIFIER '=' elementValue )
            // Java.g:546:9: IDENTIFIER '=' elementValue
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_elementValuePair4287); if (state.failed) return ;

            match(input,EQ,FOLLOW_EQ_in_elementValuePair4289); if (state.failed) return ;

            pushFollow(FOLLOW_elementValue_in_elementValuePair4291);
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
    // Java.g:549:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
    public final void elementValue() throws RecognitionException {
        int elementValue_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }

            // Java.g:550:5: ( conditionalExpression | annotation | elementValueArrayInitializer )
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
                    // Java.g:550:9: conditionalExpression
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_elementValue4311);
                    conditionalExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:551:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_elementValue4321);
                    annotation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:552:9: elementValueArrayInitializer
                    {
                    pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue4331);
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
    // Java.g:555:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
    public final void elementValueArrayInitializer() throws RecognitionException {
        int elementValueArrayInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }

            // Java.g:556:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
            // Java.g:556:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_elementValueArrayInitializer4351); if (state.failed) return ;

            // Java.g:557:9: ( elementValue ( ',' elementValue )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==BANG||LA84_0==BOOLEAN||LA84_0==BYTE||(LA84_0 >= CHAR && LA84_0 <= CHARLITERAL)||(LA84_0 >= DOUBLE && LA84_0 <= DOUBLELITERAL)||LA84_0==FALSE||(LA84_0 >= FLOAT && LA84_0 <= FLOATLITERAL)||LA84_0==IDENTIFIER||LA84_0==INT||LA84_0==INTLITERAL||LA84_0==LBRACE||(LA84_0 >= LONG && LA84_0 <= LPAREN)||LA84_0==MONKEYS_AT||(LA84_0 >= NEW && LA84_0 <= NULL)||LA84_0==PLUS||LA84_0==PLUSPLUS||LA84_0==SHORT||(LA84_0 >= STRINGLITERAL && LA84_0 <= SUB)||(LA84_0 >= SUBSUB && LA84_0 <= SUPER)||LA84_0==THIS||LA84_0==TILDE||LA84_0==TRUE||LA84_0==VOID) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // Java.g:557:10: elementValue ( ',' elementValue )*
                    {
                    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer4362);
                    elementValue();

                    state._fsp--;
                    if (state.failed) return ;

                    // Java.g:558:13: ( ',' elementValue )*
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
                    	    // Java.g:558:14: ',' elementValue
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_elementValueArrayInitializer4377); if (state.failed) return ;

                    	    pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer4379);
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


            // Java.g:560:12: ( ',' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==COMMA) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Java.g:560:13: ','
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_elementValueArrayInitializer4408); if (state.failed) return ;

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_elementValueArrayInitializer4412); if (state.failed) return ;

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
    // Java.g:567:1: annotationTypeDeclaration : modifiers '@' 'interface' IDENTIFIER annotationTypeBody ;
    public final void annotationTypeDeclaration() throws RecognitionException {
        int annotationTypeDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }

            // Java.g:568:5: ( modifiers '@' 'interface' IDENTIFIER annotationTypeBody )
            // Java.g:568:9: modifiers '@' 'interface' IDENTIFIER annotationTypeBody
            {
            pushFollow(FOLLOW_modifiers_in_annotationTypeDeclaration4435);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotationTypeDeclaration4437); if (state.failed) return ;

            match(input,INTERFACE,FOLLOW_INTERFACE_in_annotationTypeDeclaration4447); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationTypeDeclaration4457); if (state.failed) return ;

            pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration4467);
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
    // Java.g:575:1: annotationTypeBody : '{' ( annotationTypeElementDeclaration )* '}' ;
    public final void annotationTypeBody() throws RecognitionException {
        int annotationTypeBody_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }

            // Java.g:576:5: ( '{' ( annotationTypeElementDeclaration )* '}' )
            // Java.g:576:9: '{' ( annotationTypeElementDeclaration )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_annotationTypeBody4488); if (state.failed) return ;

            // Java.g:577:9: ( annotationTypeElementDeclaration )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==ABSTRACT||LA86_0==BOOLEAN||LA86_0==BYTE||LA86_0==CHAR||LA86_0==CLASS||LA86_0==DOUBLE||LA86_0==ENUM||LA86_0==FINAL||LA86_0==FLOAT||LA86_0==IDENTIFIER||(LA86_0 >= INT && LA86_0 <= INTERFACE)||LA86_0==LONG||LA86_0==LT||(LA86_0 >= MONKEYS_AT && LA86_0 <= NATIVE)||(LA86_0 >= PRIVATE && LA86_0 <= PUBLIC)||(LA86_0 >= SEMI && LA86_0 <= SHORT)||(LA86_0 >= STATIC && LA86_0 <= STRICTFP)||LA86_0==SYNCHRONIZED||LA86_0==TRANSIENT||(LA86_0 >= VOID && LA86_0 <= VOLATILE)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // Java.g:577:10: annotationTypeElementDeclaration
            	    {
            	    pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody4500);
            	    annotationTypeElementDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_annotationTypeBody4522); if (state.failed) return ;

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
    // Java.g:585:1: annotationTypeElementDeclaration : ( annotationMethodDeclaration | interfaceFieldDeclaration | normalClassDeclaration | normalInterfaceDeclaration | enumDeclaration | annotationTypeDeclaration | ';' );
    public final void annotationTypeElementDeclaration() throws RecognitionException {
        int annotationTypeElementDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }

            // Java.g:586:5: ( annotationMethodDeclaration | interfaceFieldDeclaration | normalClassDeclaration | normalInterfaceDeclaration | enumDeclaration | annotationTypeDeclaration | ';' )
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
                    // Java.g:586:9: annotationMethodDeclaration
                    {
                    pushFollow(FOLLOW_annotationMethodDeclaration_in_annotationTypeElementDeclaration4544);
                    annotationMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:587:9: interfaceFieldDeclaration
                    {
                    pushFollow(FOLLOW_interfaceFieldDeclaration_in_annotationTypeElementDeclaration4554);
                    interfaceFieldDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:588:9: normalClassDeclaration
                    {
                    pushFollow(FOLLOW_normalClassDeclaration_in_annotationTypeElementDeclaration4564);
                    normalClassDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Java.g:589:9: normalInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementDeclaration4574);
                    normalInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Java.g:590:9: enumDeclaration
                    {
                    pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementDeclaration4584);
                    enumDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // Java.g:591:9: annotationTypeDeclaration
                    {
                    pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementDeclaration4594);
                    annotationTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // Java.g:592:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_annotationTypeElementDeclaration4604); if (state.failed) return ;

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
    // Java.g:595:1: annotationMethodDeclaration : modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';' ;
    public final void annotationMethodDeclaration() throws RecognitionException {
        int annotationMethodDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }

            // Java.g:596:5: ( modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';' )
            // Java.g:596:9: modifiers type IDENTIFIER '(' ')' ( 'default' elementValue )? ';'
            {
            pushFollow(FOLLOW_modifiers_in_annotationMethodDeclaration4624);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_annotationMethodDeclaration4626);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationMethodDeclaration4628); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_annotationMethodDeclaration4638); if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_annotationMethodDeclaration4640); if (state.failed) return ;

            // Java.g:597:17: ( 'default' elementValue )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==DEFAULT) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // Java.g:597:18: 'default' elementValue
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationMethodDeclaration4643); if (state.failed) return ;

                    pushFollow(FOLLOW_elementValue_in_annotationMethodDeclaration4645);
                    elementValue();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,SEMI,FOLLOW_SEMI_in_annotationMethodDeclaration4674); if (state.failed) return ;

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
        public ArrayList<String> lisUsosId;
    };


    // $ANTLR start "block"
    // Java.g:602:1: block returns [Map<String,Declaracion> lisDecl, ArrayList<String> lisUsosId] : '{' (b1= blockStatement )* '}' ;
    public final JavaParser.block_return block() throws RecognitionException {
        JavaParser.block_return retval = new JavaParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        JavaParser.blockStatement_return b1 =null;



            retval.lisDecl = new HashMap<String,Declaracion>();
            retval.lisUsosId = new ArrayList<String>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Java.g:607:5: ( '{' (b1= blockStatement )* '}' )
            // Java.g:607:9: '{' (b1= blockStatement )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_block4705); if (state.failed) return retval;

            // Java.g:608:9: (b1= blockStatement )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==ABSTRACT||(LA89_0 >= ASSERT && LA89_0 <= BANG)||(LA89_0 >= BOOLEAN && LA89_0 <= BYTE)||(LA89_0 >= CHAR && LA89_0 <= CLASS)||LA89_0==CONTINUE||LA89_0==DO||(LA89_0 >= DOUBLE && LA89_0 <= DOUBLELITERAL)||LA89_0==ENUM||(LA89_0 >= FALSE && LA89_0 <= FINAL)||(LA89_0 >= FLOAT && LA89_0 <= FOR)||(LA89_0 >= IDENTIFIER && LA89_0 <= IF)||(LA89_0 >= INT && LA89_0 <= INTLITERAL)||LA89_0==LBRACE||(LA89_0 >= LONG && LA89_0 <= LT)||(LA89_0 >= MONKEYS_AT && LA89_0 <= NULL)||LA89_0==PLUS||(LA89_0 >= PLUSPLUS && LA89_0 <= PUBLIC)||LA89_0==RETURN||(LA89_0 >= SEMI && LA89_0 <= SHORT)||(LA89_0 >= STATIC && LA89_0 <= SUB)||(LA89_0 >= SUBSUB && LA89_0 <= SYNCHRONIZED)||(LA89_0 >= THIS && LA89_0 <= THROW)||(LA89_0 >= TILDE && LA89_0 <= WHILE)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // Java.g:608:10: b1= blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_block4720);
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


            match(input,RBRACE,FOLLOW_RBRACE_in_block4743); if (state.failed) return retval;

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
        public ArrayList<String> lisUsosId;
    };


    // $ANTLR start "blockStatement"
    // Java.g:637:1: blockStatement returns [Map<String,Declaracion> lisDecl, ArrayList<String> lisUsosId] : (l1= localVariableDeclarationStatement | classOrInterfaceDeclaration |s1= statement );
    public final JavaParser.blockStatement_return blockStatement() throws RecognitionException {
        JavaParser.blockStatement_return retval = new JavaParser.blockStatement_return();
        retval.start = input.LT(1);

        int blockStatement_StartIndex = input.index();

        Map<String,Declaracion> l1 =null;

        ArrayList<String> s1 =null;



            retval.lisDecl = new HashMap<String,Declaracion>();
            retval.lisUsosId = new ArrayList<String>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Java.g:642:5: (l1= localVariableDeclarationStatement | classOrInterfaceDeclaration |s1= statement )
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
                    // Java.g:642:9: l1= localVariableDeclarationStatement
                    {
                    pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement4776);
                    l1=localVariableDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.lisDecl = l1;}

                    }
                    break;
                case 2 :
                    // Java.g:643:9: classOrInterfaceDeclaration
                    {
                    pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement4788);
                    classOrInterfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Java.g:644:9: s1= statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement4802);
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
    // Java.g:648:1: localVariableDeclarationStatement returns [Map<String,Declaracion> lisDecl] : l1= localVariableDeclaration ';' ;
    public final Map<String,Declaracion> localVariableDeclarationStatement() throws RecognitionException {
        Map<String,Declaracion> lisDecl = null;

        int localVariableDeclarationStatement_StartIndex = input.index();

        Map<String,Declaracion> l1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return lisDecl; }

            // Java.g:649:5: (l1= localVariableDeclaration ';' )
            // Java.g:649:9: l1= localVariableDeclaration ';'
            {
            pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement4833);
            l1=localVariableDeclaration();

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {lisDecl = l1;}

            match(input,SEMI,FOLLOW_SEMI_in_localVariableDeclarationStatement4845); if (state.failed) return lisDecl;

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
    // Java.g:653:1: localVariableDeclaration returns [Map<String,Declaracion> lisDecl] : variableModifiers type v1= variableDeclarator[flagStr] ( ',' v2= variableDeclarator[flagStr] )* ;
    public final Map<String,Declaracion> localVariableDeclaration() throws RecognitionException {
        Map<String,Declaracion> lisDecl = null;

        int localVariableDeclaration_StartIndex = input.index();

        Id v1 =null;

        Id v2 =null;

        JavaParser.variableModifiers_return variableModifiers12 =null;

        JavaParser.type_return type13 =null;



            lisDecl = new HashMap<String,Declaracion>();
            String mod = new String();
            String tipo = new String();
            boolean flagStr = false;    

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return lisDecl; }

            // Java.g:660:5: ( variableModifiers type v1= variableDeclarator[flagStr] ( ',' v2= variableDeclarator[flagStr] )* )
            // Java.g:660:9: variableModifiers type v1= variableDeclarator[flagStr] ( ',' v2= variableDeclarator[flagStr] )*
            {
            pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration4872);
            variableModifiers12=variableModifiers();

            state._fsp--;
            if (state.failed) return lisDecl;

            pushFollow(FOLLOW_type_in_localVariableDeclaration4874);
            type13=type();

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {mod = (variableModifiers12!=null?input.toString(variableModifiers12.start,variableModifiers12.stop):null); tipo = (type13!=null?input.toString(type13.start,type13.stop):null);if(tipo.equals("String"))flagStr=true; }

            pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration4890);
            v1=variableDeclarator(flagStr);

            state._fsp--;
            if (state.failed) return lisDecl;

            if ( state.backtracking==0 ) {lisDecl.put(v1.getNomID(),new Declaracion(mod,tipo,v1));}

            // Java.g:662:9: ( ',' v2= variableDeclarator[flagStr] )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==COMMA) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // Java.g:662:10: ',' v2= variableDeclarator[flagStr]
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_localVariableDeclaration4904); if (state.failed) return lisDecl;

            	    pushFollow(FOLLOW_variableDeclarator_in_localVariableDeclaration4910);
            	    v2=variableDeclarator(flagStr);

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
    // Java.g:666:2: statement returns [ArrayList<String> lisUsosId] : ( block | ( 'assert' ) expression ( ':' expression )? ';' | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | forstatement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | trystatement | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' |e1= expression ';' | IDENTIFIER ':' statement | ';' );
    public final ArrayList<String> statement() throws RecognitionException {
        ArrayList<String> lisUsosId = null;

        int statement_StartIndex = input.index();

        JavaParser.expression_return e1 =null;


           
            lisUsosId = new ArrayList<String>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return lisUsosId; }

            // Java.g:670:5: ( block | ( 'assert' ) expression ( ':' expression )? ';' | 'assert' expression ( ':' expression )? ';' | 'if' parExpression statement ( 'else' statement )? | forstatement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | trystatement | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' |e1= expression ';' | IDENTIFIER ':' statement | ';' )
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
                    // Java.g:670:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement4953);
                    block();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 2 :
                    // Java.g:672:9: ( 'assert' ) expression ( ':' expression )? ';'
                    {
                    // Java.g:672:9: ( 'assert' )
                    // Java.g:672:10: 'assert'
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement4977); if (state.failed) return lisUsosId;

                    }


                    pushFollow(FOLLOW_expression_in_statement4997);
                    expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    // Java.g:674:20: ( ':' expression )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==COLON) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Java.g:674:21: ':' expression
                            {
                            match(input,COLON,FOLLOW_COLON_in_statement5000); if (state.failed) return lisUsosId;

                            pushFollow(FOLLOW_expression_in_statement5002);
                            expression();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_statement5006); if (state.failed) return lisUsosId;

                    }
                    break;
                case 3 :
                    // Java.g:675:9: 'assert' expression ( ':' expression )? ';'
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement5016); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_expression_in_statement5019);
                    expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    // Java.g:675:30: ( ':' expression )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==COLON) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Java.g:675:31: ':' expression
                            {
                            match(input,COLON,FOLLOW_COLON_in_statement5022); if (state.failed) return lisUsosId;

                            pushFollow(FOLLOW_expression_in_statement5024);
                            expression();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_statement5028); if (state.failed) return lisUsosId;

                    }
                    break;
                case 4 :
                    // Java.g:676:9: 'if' parExpression statement ( 'else' statement )?
                    {
                    match(input,IF,FOLLOW_IF_in_statement5050); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_parExpression_in_statement5052);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_statement_in_statement5054);
                    statement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    // Java.g:676:38: ( 'else' statement )?
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
                            // Java.g:676:39: 'else' statement
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_statement5057); if (state.failed) return lisUsosId;

                            pushFollow(FOLLOW_statement_in_statement5059);
                            statement();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // Java.g:677:9: forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement5081);
                    forstatement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 6 :
                    // Java.g:678:9: 'while' parExpression statement
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement5091); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_parExpression_in_statement5093);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_statement_in_statement5095);
                    statement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 7 :
                    // Java.g:679:9: 'do' statement 'while' parExpression ';'
                    {
                    match(input,DO,FOLLOW_DO_in_statement5105); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_statement_in_statement5107);
                    statement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,WHILE,FOLLOW_WHILE_in_statement5109); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_parExpression_in_statement5111);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,SEMI,FOLLOW_SEMI_in_statement5113); if (state.failed) return lisUsosId;

                    }
                    break;
                case 8 :
                    // Java.g:680:9: trystatement
                    {
                    pushFollow(FOLLOW_trystatement_in_statement5123);
                    trystatement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 9 :
                    // Java.g:681:9: 'switch' parExpression '{' switchBlockStatementGroups '}'
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement5133); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_parExpression_in_statement5135);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,LBRACE,FOLLOW_LBRACE_in_statement5137); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_switchBlockStatementGroups_in_statement5139);
                    switchBlockStatementGroups();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,RBRACE,FOLLOW_RBRACE_in_statement5141); if (state.failed) return lisUsosId;

                    }
                    break;
                case 10 :
                    // Java.g:682:9: 'synchronized' parExpression block
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement5151); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_parExpression_in_statement5153);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_block_in_statement5155);
                    block();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 11 :
                    // Java.g:683:9: 'return' ( expression )? ';'
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement5165); if (state.failed) return lisUsosId;

                    // Java.g:683:18: ( expression )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==BANG||LA95_0==BOOLEAN||LA95_0==BYTE||(LA95_0 >= CHAR && LA95_0 <= CHARLITERAL)||(LA95_0 >= DOUBLE && LA95_0 <= DOUBLELITERAL)||LA95_0==FALSE||(LA95_0 >= FLOAT && LA95_0 <= FLOATLITERAL)||LA95_0==IDENTIFIER||LA95_0==INT||LA95_0==INTLITERAL||(LA95_0 >= LONG && LA95_0 <= LPAREN)||(LA95_0 >= NEW && LA95_0 <= NULL)||LA95_0==PLUS||LA95_0==PLUSPLUS||LA95_0==SHORT||(LA95_0 >= STRINGLITERAL && LA95_0 <= SUB)||(LA95_0 >= SUBSUB && LA95_0 <= SUPER)||LA95_0==THIS||LA95_0==TILDE||LA95_0==TRUE||LA95_0==VOID) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // Java.g:683:19: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement5168);
                            expression();

                            state._fsp--;
                            if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_statement5173); if (state.failed) return lisUsosId;

                    }
                    break;
                case 12 :
                    // Java.g:684:9: 'throw' expression ';'
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement5183); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_expression_in_statement5185);
                    expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,SEMI,FOLLOW_SEMI_in_statement5187); if (state.failed) return lisUsosId;

                    }
                    break;
                case 13 :
                    // Java.g:685:9: 'break' ( IDENTIFIER )? ';'
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement5197); if (state.failed) return lisUsosId;

                    // Java.g:686:13: ( IDENTIFIER )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==IDENTIFIER) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Java.g:686:14: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement5212); if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_statement5229); if (state.failed) return lisUsosId;

                    }
                    break;
                case 14 :
                    // Java.g:688:9: 'continue' ( IDENTIFIER )? ';'
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement5239); if (state.failed) return lisUsosId;

                    // Java.g:689:13: ( IDENTIFIER )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==IDENTIFIER) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Java.g:689:14: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement5254); if (state.failed) return lisUsosId;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_statement5271); if (state.failed) return lisUsosId;

                    }
                    break;
                case 15 :
                    // Java.g:691:9: e1= expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_statement5285);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    match(input,SEMI,FOLLOW_SEMI_in_statement5287); if (state.failed) return lisUsosId;

                    if ( state.backtracking==0 ) {lisUsosId = e1.lisUsosId;}

                    }
                    break;
                case 16 :
                    // Java.g:692:9: IDENTIFIER ':' statement
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement5303); if (state.failed) return lisUsosId;

                    match(input,COLON,FOLLOW_COLON_in_statement5305); if (state.failed) return lisUsosId;

                    pushFollow(FOLLOW_statement_in_statement5307);
                    statement();

                    state._fsp--;
                    if (state.failed) return lisUsosId;

                    }
                    break;
                case 17 :
                    // Java.g:693:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement5317); if (state.failed) return lisUsosId;

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
    // Java.g:697:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
    public final void switchBlockStatementGroups() throws RecognitionException {
        int switchBlockStatementGroups_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }

            // Java.g:698:5: ( ( switchBlockStatementGroup )* )
            // Java.g:698:9: ( switchBlockStatementGroup )*
            {
            // Java.g:698:9: ( switchBlockStatementGroup )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==CASE||LA99_0==DEFAULT) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // Java.g:698:10: switchBlockStatementGroup
            	    {
            	    pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups5339);
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
    // Java.g:701:1: switchBlockStatementGroup : switchLabel ( blockStatement )* ;
    public final void switchBlockStatementGroup() throws RecognitionException {
        int switchBlockStatementGroup_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }

            // Java.g:702:5: ( switchLabel ( blockStatement )* )
            // Java.g:703:9: switchLabel ( blockStatement )*
            {
            pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup5368);
            switchLabel();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:704:9: ( blockStatement )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==ABSTRACT||(LA100_0 >= ASSERT && LA100_0 <= BANG)||(LA100_0 >= BOOLEAN && LA100_0 <= BYTE)||(LA100_0 >= CHAR && LA100_0 <= CLASS)||LA100_0==CONTINUE||LA100_0==DO||(LA100_0 >= DOUBLE && LA100_0 <= DOUBLELITERAL)||LA100_0==ENUM||(LA100_0 >= FALSE && LA100_0 <= FINAL)||(LA100_0 >= FLOAT && LA100_0 <= FOR)||(LA100_0 >= IDENTIFIER && LA100_0 <= IF)||(LA100_0 >= INT && LA100_0 <= INTLITERAL)||LA100_0==LBRACE||(LA100_0 >= LONG && LA100_0 <= LT)||(LA100_0 >= MONKEYS_AT && LA100_0 <= NULL)||LA100_0==PLUS||(LA100_0 >= PLUSPLUS && LA100_0 <= PUBLIC)||LA100_0==RETURN||(LA100_0 >= SEMI && LA100_0 <= SHORT)||(LA100_0 >= STATIC && LA100_0 <= SUB)||(LA100_0 >= SUBSUB && LA100_0 <= SYNCHRONIZED)||(LA100_0 >= THIS && LA100_0 <= THROW)||(LA100_0 >= TILDE && LA100_0 <= WHILE)) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // Java.g:704:10: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup5379);
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
    // Java.g:708:1: switchLabel : ( 'case' expression ':' | 'default' ':' );
    public final void switchLabel() throws RecognitionException {
        int switchLabel_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }

            // Java.g:709:5: ( 'case' expression ':' | 'default' ':' )
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
                    // Java.g:709:9: 'case' expression ':'
                    {
                    match(input,CASE,FOLLOW_CASE_in_switchLabel5410); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_switchLabel5412);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,COLON,FOLLOW_COLON_in_switchLabel5414); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:710:9: 'default' ':'
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_switchLabel5424); if (state.failed) return ;

                    match(input,COLON,FOLLOW_COLON_in_switchLabel5426); if (state.failed) return ;

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
    // Java.g:714:1: trystatement : 'try' block ( catches 'finally' block | catches | 'finally' block ) ;
    public final void trystatement() throws RecognitionException {
        int trystatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }

            // Java.g:715:5: ( 'try' block ( catches 'finally' block | catches | 'finally' block ) )
            // Java.g:715:9: 'try' block ( catches 'finally' block | catches | 'finally' block )
            {
            match(input,TRY,FOLLOW_TRY_in_trystatement5447); if (state.failed) return ;

            pushFollow(FOLLOW_block_in_trystatement5449);
            block();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:716:9: ( catches 'finally' block | catches | 'finally' block )
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
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA102_0==FINALLY) ) {
                alt102=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }
            switch (alt102) {
                case 1 :
                    // Java.g:716:13: catches 'finally' block
                    {
                    pushFollow(FOLLOW_catches_in_trystatement5463);
                    catches();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,FINALLY,FOLLOW_FINALLY_in_trystatement5465); if (state.failed) return ;

                    pushFollow(FOLLOW_block_in_trystatement5467);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:717:13: catches
                    {
                    pushFollow(FOLLOW_catches_in_trystatement5481);
                    catches();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:718:13: 'finally' block
                    {
                    match(input,FINALLY,FOLLOW_FINALLY_in_trystatement5495); if (state.failed) return ;

                    pushFollow(FOLLOW_block_in_trystatement5497);
                    block();

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
            if ( state.backtracking>0 ) { memoize(input, 62, trystatement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "trystatement"



    // $ANTLR start "catches"
    // Java.g:722:1: catches : catchClause ( catchClause )* ;
    public final void catches() throws RecognitionException {
        int catches_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }

            // Java.g:723:5: ( catchClause ( catchClause )* )
            // Java.g:723:9: catchClause ( catchClause )*
            {
            pushFollow(FOLLOW_catchClause_in_catches5528);
            catchClause();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:724:9: ( catchClause )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==CATCH) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // Java.g:724:10: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches5539);
            	    catchClause();

            	    state._fsp--;
            	    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "catches"



    // $ANTLR start "catchClause"
    // Java.g:728:1: catchClause : 'catch' '(' formalParameter ')' block ;
    public final void catchClause() throws RecognitionException {
        int catchClause_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }

            // Java.g:729:5: ( 'catch' '(' formalParameter ')' block )
            // Java.g:729:9: 'catch' '(' formalParameter ')' block
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause5570); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause5572); if (state.failed) return ;

            pushFollow(FOLLOW_formalParameter_in_catchClause5574);
            formalParameter();

            state._fsp--;
            if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause5584); if (state.failed) return ;

            pushFollow(FOLLOW_block_in_catchClause5586);
            block();

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
            if ( state.backtracking>0 ) { memoize(input, 64, catchClause_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "catchClause"



    // $ANTLR start "formalParameter"
    // Java.g:733:1: formalParameter : variableModifiers type IDENTIFIER ( '[' ']' )* ;
    public final void formalParameter() throws RecognitionException {
        int formalParameter_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }

            // Java.g:734:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* )
            // Java.g:734:9: variableModifiers type IDENTIFIER ( '[' ']' )*
            {
            pushFollow(FOLLOW_variableModifiers_in_formalParameter5607);
            variableModifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_formalParameter5609);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_formalParameter5611); if (state.failed) return ;

            // Java.g:735:9: ( '[' ']' )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==LBRACKET) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // Java.g:735:10: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_formalParameter5622); if (state.failed) return ;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_formalParameter5624); if (state.failed) return ;

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
    // Java.g:739:1: forstatement : ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement | 'for' '(' ( forInit )? ';' ( expression )? ';' ( expressionList )? ')' statement );
    public final void forstatement() throws RecognitionException {
        int forstatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }

            // Java.g:740:5: ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement | 'for' '(' ( forInit )? ';' ( expression )? ';' ( expressionList )? ')' statement )
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
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }
            switch (alt108) {
                case 1 :
                    // Java.g:742:9: 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement
                    {
                    match(input,FOR,FOLLOW_FOR_in_forstatement5673); if (state.failed) return ;

                    match(input,LPAREN,FOLLOW_LPAREN_in_forstatement5675); if (state.failed) return ;

                    pushFollow(FOLLOW_variableModifiers_in_forstatement5677);
                    variableModifiers();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_type_in_forstatement5679);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_forstatement5681); if (state.failed) return ;

                    match(input,COLON,FOLLOW_COLON_in_forstatement5683); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_forstatement5694);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,RPAREN,FOLLOW_RPAREN_in_forstatement5696); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_forstatement5698);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:746:9: 'for' '(' ( forInit )? ';' ( expression )? ';' ( expressionList )? ')' statement
                    {
                    match(input,FOR,FOLLOW_FOR_in_forstatement5730); if (state.failed) return ;

                    match(input,LPAREN,FOLLOW_LPAREN_in_forstatement5732); if (state.failed) return ;

                    // Java.g:747:17: ( forInit )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==BANG||LA105_0==BOOLEAN||LA105_0==BYTE||(LA105_0 >= CHAR && LA105_0 <= CHARLITERAL)||(LA105_0 >= DOUBLE && LA105_0 <= DOUBLELITERAL)||(LA105_0 >= FALSE && LA105_0 <= FINAL)||(LA105_0 >= FLOAT && LA105_0 <= FLOATLITERAL)||LA105_0==IDENTIFIER||LA105_0==INT||LA105_0==INTLITERAL||(LA105_0 >= LONG && LA105_0 <= LPAREN)||LA105_0==MONKEYS_AT||(LA105_0 >= NEW && LA105_0 <= NULL)||LA105_0==PLUS||LA105_0==PLUSPLUS||LA105_0==SHORT||(LA105_0 >= STRINGLITERAL && LA105_0 <= SUB)||(LA105_0 >= SUBSUB && LA105_0 <= SUPER)||LA105_0==THIS||LA105_0==TILDE||LA105_0==TRUE||LA105_0==VOID) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Java.g:747:18: forInit
                            {
                            pushFollow(FOLLOW_forInit_in_forstatement5752);
                            forInit();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_forstatement5773); if (state.failed) return ;

                    // Java.g:749:17: ( expression )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==BANG||LA106_0==BOOLEAN||LA106_0==BYTE||(LA106_0 >= CHAR && LA106_0 <= CHARLITERAL)||(LA106_0 >= DOUBLE && LA106_0 <= DOUBLELITERAL)||LA106_0==FALSE||(LA106_0 >= FLOAT && LA106_0 <= FLOATLITERAL)||LA106_0==IDENTIFIER||LA106_0==INT||LA106_0==INTLITERAL||(LA106_0 >= LONG && LA106_0 <= LPAREN)||(LA106_0 >= NEW && LA106_0 <= NULL)||LA106_0==PLUS||LA106_0==PLUSPLUS||LA106_0==SHORT||(LA106_0 >= STRINGLITERAL && LA106_0 <= SUB)||(LA106_0 >= SUBSUB && LA106_0 <= SUPER)||LA106_0==THIS||LA106_0==TILDE||LA106_0==TRUE||LA106_0==VOID) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Java.g:749:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_forstatement5793);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,SEMI,FOLLOW_SEMI_in_forstatement5814); if (state.failed) return ;

                    // Java.g:751:17: ( expressionList )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==BANG||LA107_0==BOOLEAN||LA107_0==BYTE||(LA107_0 >= CHAR && LA107_0 <= CHARLITERAL)||(LA107_0 >= DOUBLE && LA107_0 <= DOUBLELITERAL)||LA107_0==FALSE||(LA107_0 >= FLOAT && LA107_0 <= FLOATLITERAL)||LA107_0==IDENTIFIER||LA107_0==INT||LA107_0==INTLITERAL||(LA107_0 >= LONG && LA107_0 <= LPAREN)||(LA107_0 >= NEW && LA107_0 <= NULL)||LA107_0==PLUS||LA107_0==PLUSPLUS||LA107_0==SHORT||(LA107_0 >= STRINGLITERAL && LA107_0 <= SUB)||(LA107_0 >= SUBSUB && LA107_0 <= SUPER)||LA107_0==THIS||LA107_0==TILDE||LA107_0==TRUE||LA107_0==VOID) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Java.g:751:18: expressionList
                            {
                            pushFollow(FOLLOW_expressionList_in_forstatement5834);
                            expressionList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_forstatement5855); if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_forstatement5857);
                    statement();

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
            if ( state.backtracking>0 ) { memoize(input, 66, forstatement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "forstatement"



    // $ANTLR start "forInit"
    // Java.g:755:1: forInit : ( localVariableDeclaration | expressionList );
    public final void forInit() throws RecognitionException {
        int forInit_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }

            // Java.g:756:5: ( localVariableDeclaration | expressionList )
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
                    // Java.g:756:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_forInit5876);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:757:9: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit5886);
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
    // Java.g:760:1: parExpression : '(' expression ')' ;
    public final void parExpression() throws RecognitionException {
        int parExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }

            // Java.g:761:5: ( '(' expression ')' )
            // Java.g:761:9: '(' expression ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression5906); if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_parExpression5907);
            expression();

            state._fsp--;
            if (state.failed) return ;

            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression5908); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "parExpression"



    // $ANTLR start "expressionList"
    // Java.g:764:1: expressionList : expression ( ',' expression )* ;
    public final void expressionList() throws RecognitionException {
        int expressionList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }

            // Java.g:765:5: ( expression ( ',' expression )* )
            // Java.g:765:9: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList5927);
            expression();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:766:9: ( ',' expression )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==COMMA) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // Java.g:766:10: ',' expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionList5938); if (state.failed) return ;

            	    pushFollow(FOLLOW_expression_in_expressionList5940);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "expressionList"


    public static class expression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s;
    };


    // $ANTLR start "expression"
    // Java.g:771:1: expression returns [ArrayList<String> lisUsosId, String s] : c1= conditionalExpression ( assignmentOperator e1= expression )? ;
    public final JavaParser.expression_return expression() throws RecognitionException {
        JavaParser.expression_return retval = new JavaParser.expression_return();
        retval.start = input.LT(1);

        int expression_StartIndex = input.index();

        JavaParser.conditionalExpression_return c1 =null;

        JavaParser.expression_return e1 =null;



            retval.lisUsosId = new ArrayList<String>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Java.g:775:5: (c1= conditionalExpression ( assignmentOperator e1= expression )? )
            // Java.g:775:9: c1= conditionalExpression ( assignmentOperator e1= expression )?
            {
            pushFollow(FOLLOW_conditionalExpression_in_expression5983);
            c1=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = c1.lisUsosId; retval.s = c1.s;}

            // Java.g:776:9: ( assignmentOperator e1= expression )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==AMPEQ||LA111_0==BAREQ||LA111_0==CARETEQ||LA111_0==EQ||LA111_0==GT||LA111_0==LT||LA111_0==PERCENTEQ||LA111_0==PLUSEQ||LA111_0==SLASHEQ||LA111_0==STAREQ||LA111_0==SUBEQ) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // Java.g:776:10: assignmentOperator e1= expression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_expression5996);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_expression6002);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(e1.lisUsosId); retval.s += e1.s;}

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 70, expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression"



    // $ANTLR start "assignmentOperator"
    // Java.g:781:1: assignmentOperator returns [String s] : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' );
    public final String assignmentOperator() throws RecognitionException {
        String s = null;

        int assignmentOperator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return s; }

            // Java.g:782:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<' '<' '=' | '>' '>' '>' '=' | '>' '>' '=' )
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
                    // Java.g:782:9: '='
                    {
                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator6040); if (state.failed) return s;

                    }
                    break;
                case 2 :
                    // Java.g:783:9: '+='
                    {
                    match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignmentOperator6050); if (state.failed) return s;

                    }
                    break;
                case 3 :
                    // Java.g:784:9: '-='
                    {
                    match(input,SUBEQ,FOLLOW_SUBEQ_in_assignmentOperator6060); if (state.failed) return s;

                    }
                    break;
                case 4 :
                    // Java.g:785:9: '*='
                    {
                    match(input,STAREQ,FOLLOW_STAREQ_in_assignmentOperator6070); if (state.failed) return s;

                    }
                    break;
                case 5 :
                    // Java.g:786:9: '/='
                    {
                    match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignmentOperator6080); if (state.failed) return s;

                    }
                    break;
                case 6 :
                    // Java.g:787:9: '&='
                    {
                    match(input,AMPEQ,FOLLOW_AMPEQ_in_assignmentOperator6090); if (state.failed) return s;

                    }
                    break;
                case 7 :
                    // Java.g:788:9: '|='
                    {
                    match(input,BAREQ,FOLLOW_BAREQ_in_assignmentOperator6100); if (state.failed) return s;

                    }
                    break;
                case 8 :
                    // Java.g:789:9: '^='
                    {
                    match(input,CARETEQ,FOLLOW_CARETEQ_in_assignmentOperator6110); if (state.failed) return s;

                    }
                    break;
                case 9 :
                    // Java.g:790:9: '%='
                    {
                    match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignmentOperator6120); if (state.failed) return s;

                    }
                    break;
                case 10 :
                    // Java.g:791:10: '<' '<' '='
                    {
                    match(input,LT,FOLLOW_LT_in_assignmentOperator6131); if (state.failed) return s;

                    match(input,LT,FOLLOW_LT_in_assignmentOperator6133); if (state.failed) return s;

                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator6135); if (state.failed) return s;

                    }
                    break;
                case 11 :
                    // Java.g:792:10: '>' '>' '>' '='
                    {
                    match(input,GT,FOLLOW_GT_in_assignmentOperator6146); if (state.failed) return s;

                    match(input,GT,FOLLOW_GT_in_assignmentOperator6148); if (state.failed) return s;

                    match(input,GT,FOLLOW_GT_in_assignmentOperator6150); if (state.failed) return s;

                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator6152); if (state.failed) return s;

                    }
                    break;
                case 12 :
                    // Java.g:793:10: '>' '>' '='
                    {
                    match(input,GT,FOLLOW_GT_in_assignmentOperator6163); if (state.failed) return s;

                    match(input,GT,FOLLOW_GT_in_assignmentOperator6165); if (state.failed) return s;

                    match(input,EQ,FOLLOW_EQ_in_assignmentOperator6167); if (state.failed) return s;

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


    public static class conditionalExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s;
    };


    // $ANTLR start "conditionalExpression"
    // Java.g:797:1: conditionalExpression returns [ArrayList<String> lisUsosId, String s] : c1= conditionalOrExpression ( '?' e1= expression ':' c2= conditionalExpression )? ;
    public final JavaParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        JavaParser.conditionalExpression_return retval = new JavaParser.conditionalExpression_return();
        retval.start = input.LT(1);

        int conditionalExpression_StartIndex = input.index();

        JavaParser.conditionalOrExpression_return c1 =null;

        JavaParser.expression_return e1 =null;

        JavaParser.conditionalExpression_return c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Java.g:798:5: (c1= conditionalOrExpression ( '?' e1= expression ':' c2= conditionalExpression )? )
            // Java.g:798:9: c1= conditionalOrExpression ( '?' e1= expression ':' c2= conditionalExpression )?
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression6195);
            c1=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = c1.lisUsosId; retval.s = c1.s;}

            // Java.g:799:9: ( '?' e1= expression ':' c2= conditionalExpression )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==QUES) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // Java.g:799:10: '?' e1= expression ':' c2= conditionalExpression
                    {
                    match(input,QUES,FOLLOW_QUES_in_conditionalExpression6208); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_conditionalExpression6214);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(e1.lisUsosId); retval.s += e1.s;}

                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression6218); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression6224);
                    c2=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(c2.lisUsosId);retval.s+=c2.s;}

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 72, conditionalExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"


    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s = "";
    };


    // $ANTLR start "conditionalOrExpression"
    // Java.g:803:1: conditionalOrExpression returns [ArrayList<String> lisUsosId, String s = \"\"] : c1= conditionalAndExpression ( '||' c2= conditionalAndExpression )* ;
    public final JavaParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        JavaParser.conditionalOrExpression_return retval = new JavaParser.conditionalOrExpression_return();
        retval.start = input.LT(1);

        int conditionalOrExpression_StartIndex = input.index();

        JavaParser.conditionalAndExpression_return c1 =null;

        JavaParser.conditionalAndExpression_return c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Java.g:804:5: (c1= conditionalAndExpression ( '||' c2= conditionalAndExpression )* )
            // Java.g:804:9: c1= conditionalAndExpression ( '||' c2= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression6264);
            c1=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = c1.lisUsosId; retval.s = c1.s;}

            // Java.g:805:9: ( '||' c2= conditionalAndExpression )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==BARBAR) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // Java.g:805:10: '||' c2= conditionalAndExpression
            	    {
            	    match(input,BARBAR,FOLLOW_BARBAR_in_conditionalOrExpression6277); if (state.failed) return retval;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression6283);
            	    c2=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(c2.lisUsosId); retval.s = retval.s + c2.s;}

            	    }
            	    break;

            	default :
            	    break loop114;
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
            if ( state.backtracking>0 ) { memoize(input, 73, conditionalOrExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"


    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s="";
    };


    // $ANTLR start "conditionalAndExpression"
    // Java.g:809:1: conditionalAndExpression returns [ArrayList<String> lisUsosId, String s=\"\"] : i1= inclusiveOrExpression ( '&&' i2= inclusiveOrExpression )* ;
    public final JavaParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        JavaParser.conditionalAndExpression_return retval = new JavaParser.conditionalAndExpression_return();
        retval.start = input.LT(1);

        int conditionalAndExpression_StartIndex = input.index();

        JavaParser.inclusiveOrExpression_return i1 =null;

        JavaParser.inclusiveOrExpression_return i2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Java.g:810:5: (i1= inclusiveOrExpression ( '&&' i2= inclusiveOrExpression )* )
            // Java.g:810:9: i1= inclusiveOrExpression ( '&&' i2= inclusiveOrExpression )*
            {
            pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6323);
            i1=inclusiveOrExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = i1.lisUsosId; retval.s = i1.s;}

            // Java.g:811:9: ( '&&' i2= inclusiveOrExpression )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==AMPAMP) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // Java.g:811:10: '&&' i2= inclusiveOrExpression
            	    {
            	    match(input,AMPAMP,FOLLOW_AMPAMP_in_conditionalAndExpression6336); if (state.failed) return retval;

            	    pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6342);
            	    i2=inclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(i2.lisUsosId); retval.s = retval.s + i2.s;}

            	    }
            	    break;

            	default :
            	    break loop115;
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
            if ( state.backtracking>0 ) { memoize(input, 74, conditionalAndExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"


    public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s="";
    };


    // $ANTLR start "inclusiveOrExpression"
    // Java.g:815:1: inclusiveOrExpression returns [ArrayList<String> lisUsosId, String s=\"\"] : e1= exclusiveOrExpression ( '|' e2= exclusiveOrExpression )* ;
    public final JavaParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
        JavaParser.inclusiveOrExpression_return retval = new JavaParser.inclusiveOrExpression_return();
        retval.start = input.LT(1);

        int inclusiveOrExpression_StartIndex = input.index();

        JavaParser.exclusiveOrExpression_return e1 =null;

        JavaParser.exclusiveOrExpression_return e2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Java.g:816:5: (e1= exclusiveOrExpression ( '|' e2= exclusiveOrExpression )* )
            // Java.g:816:9: e1= exclusiveOrExpression ( '|' e2= exclusiveOrExpression )*
            {
            pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6382);
            e1=exclusiveOrExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = e1.lisUsosId; retval.s =e1.s;}

            // Java.g:817:9: ( '|' e2= exclusiveOrExpression )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==BAR) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // Java.g:817:10: '|' e2= exclusiveOrExpression
            	    {
            	    match(input,BAR,FOLLOW_BAR_in_inclusiveOrExpression6395); if (state.failed) return retval;

            	    pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6401);
            	    e2=exclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(e2.lisUsosId); retval.s = retval.s + e2.s;}

            	    }
            	    break;

            	default :
            	    break loop116;
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
            if ( state.backtracking>0 ) { memoize(input, 75, inclusiveOrExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inclusiveOrExpression"


    public static class exclusiveOrExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s = "";
    };


    // $ANTLR start "exclusiveOrExpression"
    // Java.g:821:1: exclusiveOrExpression returns [ArrayList<String> lisUsosId, String s = \"\"] : a1= andExpression ( '^' a2= andExpression )* ;
    public final JavaParser.exclusiveOrExpression_return exclusiveOrExpression() throws RecognitionException {
        JavaParser.exclusiveOrExpression_return retval = new JavaParser.exclusiveOrExpression_return();
        retval.start = input.LT(1);

        int exclusiveOrExpression_StartIndex = input.index();

        JavaParser.andExpression_return a1 =null;

        JavaParser.andExpression_return a2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Java.g:822:5: (a1= andExpression ( '^' a2= andExpression )* )
            // Java.g:822:9: a1= andExpression ( '^' a2= andExpression )*
            {
            pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression6441);
            a1=andExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = a1.lisUsosId; retval.s =a1.s;}

            // Java.g:823:9: ( '^' a2= andExpression )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==CARET) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // Java.g:823:10: '^' a2= andExpression
            	    {
            	    match(input,CARET,FOLLOW_CARET_in_exclusiveOrExpression6454); if (state.failed) return retval;

            	    pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression6460);
            	    a2=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(a2.lisUsosId);retval.s =retval.s+a2.s;}

            	    }
            	    break;

            	default :
            	    break loop117;
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
            if ( state.backtracking>0 ) { memoize(input, 76, exclusiveOrExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exclusiveOrExpression"


    public static class andExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s="";
    };


    // $ANTLR start "andExpression"
    // Java.g:827:1: andExpression returns [ArrayList<String> lisUsosId, String s=\"\"] : e1= equalityExpression ( '&' e2= equalityExpression )* ;
    public final JavaParser.andExpression_return andExpression() throws RecognitionException {
        JavaParser.andExpression_return retval = new JavaParser.andExpression_return();
        retval.start = input.LT(1);

        int andExpression_StartIndex = input.index();

        JavaParser.equalityExpression_return e1 =null;

        JavaParser.equalityExpression_return e2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Java.g:828:5: (e1= equalityExpression ( '&' e2= equalityExpression )* )
            // Java.g:828:9: e1= equalityExpression ( '&' e2= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_andExpression6500);
            e1=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = e1.lisUsosId; retval.s =e1.s;}

            // Java.g:829:9: ( '&' e2= equalityExpression )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==AMP) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // Java.g:829:10: '&' e2= equalityExpression
            	    {
            	    match(input,AMP,FOLLOW_AMP_in_andExpression6513); if (state.failed) return retval;

            	    pushFollow(FOLLOW_equalityExpression_in_andExpression6519);
            	    e2=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(e2.lisUsosId); retval.s = retval.s + e2.s;}

            	    }
            	    break;

            	default :
            	    break loop118;
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
            if ( state.backtracking>0 ) { memoize(input, 77, andExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "andExpression"


    public static class equalityExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s="";
    };


    // $ANTLR start "equalityExpression"
    // Java.g:833:1: equalityExpression returns [ArrayList<String> lisUsosId, String s=\"\"] : i1= instanceOfExpression ( ( '==' | '!=' ) i2= instanceOfExpression )* ;
    public final JavaParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JavaParser.equalityExpression_return retval = new JavaParser.equalityExpression_return();
        retval.start = input.LT(1);

        int equalityExpression_StartIndex = input.index();

        JavaParser.instanceOfExpression_return i1 =null;

        JavaParser.instanceOfExpression_return i2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Java.g:834:5: (i1= instanceOfExpression ( ( '==' | '!=' ) i2= instanceOfExpression )* )
            // Java.g:834:9: i1= instanceOfExpression ( ( '==' | '!=' ) i2= instanceOfExpression )*
            {
            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression6559);
            i1=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = i1.lisUsosId; retval.s = i1.s;}

            // Java.g:835:9: ( ( '==' | '!=' ) i2= instanceOfExpression )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==BANGEQ||LA119_0==EQEQ) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // Java.g:836:13: ( '==' | '!=' ) i2= instanceOfExpression
            	    {
            	    if ( input.LA(1)==BANGEQ||input.LA(1)==EQEQ ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression6642);
            	    i2=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(i2.lisUsosId); retval.s = retval.s + i2.s;}

            	    }
            	    break;

            	default :
            	    break loop119;
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
            if ( state.backtracking>0 ) { memoize(input, 78, equalityExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equalityExpression"


    public static class instanceOfExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s = "";
    };


    // $ANTLR start "instanceOfExpression"
    // Java.g:843:1: instanceOfExpression returns [ArrayList<String> lisUsosId, String s = \"\"] : r1= relationalExpression ( 'instanceof' type )? ;
    public final JavaParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
        JavaParser.instanceOfExpression_return retval = new JavaParser.instanceOfExpression_return();
        retval.start = input.LT(1);

        int instanceOfExpression_StartIndex = input.index();

        JavaParser.relationalExpression_return r1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Java.g:844:5: (r1= relationalExpression ( 'instanceof' type )? )
            // Java.g:844:9: r1= relationalExpression ( 'instanceof' type )?
            {
            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression6682);
            r1=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = r1.lisUsosId; retval.s =r1.s;}

            // Java.g:845:9: ( 'instanceof' type )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==INSTANCEOF) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // Java.g:845:10: 'instanceof' type
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression6695); if (state.failed) return retval;

                    pushFollow(FOLLOW_type_in_instanceOfExpression6697);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 79, instanceOfExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "instanceOfExpression"


    public static class relationalExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s = "";
    };


    // $ANTLR start "relationalExpression"
    // Java.g:849:1: relationalExpression returns [ArrayList<String> lisUsosId, String s = \"\"] : h1= shiftExpression ( relationalOp h2= shiftExpression )* ;
    public final JavaParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JavaParser.relationalExpression_return retval = new JavaParser.relationalExpression_return();
        retval.start = input.LT(1);

        int relationalExpression_StartIndex = input.index();

        JavaParser.shiftExpression_return h1 =null;

        JavaParser.shiftExpression_return h2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // Java.g:850:5: (h1= shiftExpression ( relationalOp h2= shiftExpression )* )
            // Java.g:850:9: h1= shiftExpression ( relationalOp h2= shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpression6735);
            h1=shiftExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = h1.lisUsosId; retval.s =h1.s;}

            // Java.g:851:9: ( relationalOp h2= shiftExpression )*
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
            	    // Java.g:851:10: relationalOp h2= shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression6748);
            	    relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression6754);
            	    h2=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(h2.lisUsosId); retval.s = retval.s + h2.s;}

            	    }
            	    break;

            	default :
            	    break loop121;
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
            if ( state.backtracking>0 ) { memoize(input, 80, relationalExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "relationalOp"
    // Java.g:855:1: relationalOp : ( '<' '=' | '>' '=' | '<' | '>' );
    public final void relationalOp() throws RecognitionException {
        int relationalOp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }

            // Java.g:856:5: ( '<' '=' | '>' '=' | '<' | '>' )
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
                    // Java.g:856:10: '<' '='
                    {
                    match(input,LT,FOLLOW_LT_in_relationalOp6787); if (state.failed) return ;

                    match(input,EQ,FOLLOW_EQ_in_relationalOp6789); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:857:10: '>' '='
                    {
                    match(input,GT,FOLLOW_GT_in_relationalOp6800); if (state.failed) return ;

                    match(input,EQ,FOLLOW_EQ_in_relationalOp6802); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:858:9: '<'
                    {
                    match(input,LT,FOLLOW_LT_in_relationalOp6812); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Java.g:859:9: '>'
                    {
                    match(input,GT,FOLLOW_GT_in_relationalOp6822); if (state.failed) return ;

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


    public static class shiftExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s = "";
    };


    // $ANTLR start "shiftExpression"
    // Java.g:862:1: shiftExpression returns [ArrayList<String> lisUsosId, String s = \"\"] : a1= additiveExpression ( shiftOp a2= additiveExpression )* ;
    public final JavaParser.shiftExpression_return shiftExpression() throws RecognitionException {
        JavaParser.shiftExpression_return retval = new JavaParser.shiftExpression_return();
        retval.start = input.LT(1);

        int shiftExpression_StartIndex = input.index();

        JavaParser.additiveExpression_return a1 =null;

        JavaParser.additiveExpression_return a2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // Java.g:863:5: (a1= additiveExpression ( shiftOp a2= additiveExpression )* )
            // Java.g:863:9: a1= additiveExpression ( shiftOp a2= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression6849);
            a1=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = a1.lisUsosId; retval.s = a1.s;}

            // Java.g:864:9: ( shiftOp a2= additiveExpression )*
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
            	    // Java.g:864:10: shiftOp a2= additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_shiftExpression6862);
            	    shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression6868);
            	    a2=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(a2.lisUsosId); retval.s = retval.s + a2.s;}

            	    }
            	    break;

            	default :
            	    break loop123;
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
            if ( state.backtracking>0 ) { memoize(input, 82, shiftExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "shiftExpression"



    // $ANTLR start "shiftOp"
    // Java.g:869:1: shiftOp : ( '<' '<' | '>' '>' '>' | '>' '>' );
    public final void shiftOp() throws RecognitionException {
        int shiftOp_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }

            // Java.g:870:5: ( '<' '<' | '>' '>' '>' | '>' '>' )
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
                    // Java.g:870:10: '<' '<'
                    {
                    match(input,LT,FOLLOW_LT_in_shiftOp6903); if (state.failed) return ;

                    match(input,LT,FOLLOW_LT_in_shiftOp6905); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:871:10: '>' '>' '>'
                    {
                    match(input,GT,FOLLOW_GT_in_shiftOp6916); if (state.failed) return ;

                    match(input,GT,FOLLOW_GT_in_shiftOp6918); if (state.failed) return ;

                    match(input,GT,FOLLOW_GT_in_shiftOp6920); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:872:10: '>' '>'
                    {
                    match(input,GT,FOLLOW_GT_in_shiftOp6931); if (state.failed) return ;

                    match(input,GT,FOLLOW_GT_in_shiftOp6933); if (state.failed) return ;

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


    public static class additiveExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s = "";
    };


    // $ANTLR start "additiveExpression"
    // Java.g:876:1: additiveExpression returns [ArrayList<String> lisUsosId, String s = \"\"] : m1= multiplicativeExpression ( ( '+' | '-' ) m2= multiplicativeExpression )* ;
    public final JavaParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JavaParser.additiveExpression_return retval = new JavaParser.additiveExpression_return();
        retval.start = input.LT(1);

        int additiveExpression_StartIndex = input.index();

        JavaParser.multiplicativeExpression_return m1 =null;

        JavaParser.multiplicativeExpression_return m2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // Java.g:877:5: (m1= multiplicativeExpression ( ( '+' | '-' ) m2= multiplicativeExpression )* )
            // Java.g:877:9: m1= multiplicativeExpression ( ( '+' | '-' ) m2= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression6961);
            m1=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = m1.lisUsosId; retval.s = m1.s;}

            // Java.g:878:9: ( ( '+' | '-' ) m2= multiplicativeExpression )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==PLUS||LA125_0==SUB) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // Java.g:879:13: ( '+' | '-' ) m2= multiplicativeExpression
            	    {
            	    if ( input.LA(1)==PLUS||input.LA(1)==SUB ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression7044);
            	    m2=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(m2.lisUsosId); retval.s = retval.s + m2.s;}

            	    }
            	    break;

            	default :
            	    break loop125;
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
            if ( state.backtracking>0 ) { memoize(input, 84, additiveExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "additiveExpression"


    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s = "";
    };


    // $ANTLR start "multiplicativeExpression"
    // Java.g:886:1: multiplicativeExpression returns [ArrayList<String> lisUsosId, String s = \"\"] : u1= unaryExpression ( ( '*' | '/' | '%' ) u2= unaryExpression )* ;
    public final JavaParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JavaParser.multiplicativeExpression_return retval = new JavaParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        int multiplicativeExpression_StartIndex = input.index();

        JavaParser.unaryExpression_return u1 =null;

        JavaParser.unaryExpression_return u2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // Java.g:887:5: (u1= unaryExpression ( ( '*' | '/' | '%' ) u2= unaryExpression )* )
            // Java.g:888:9: u1= unaryExpression ( ( '*' | '/' | '%' ) u2= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression7091);
            u1=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.lisUsosId = u1.lisUsosId; retval.s = u1.s;}

            // Java.g:889:9: ( ( '*' | '/' | '%' ) u2= unaryExpression )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==PERCENT||LA126_0==SLASH||LA126_0==STAR) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // Java.g:890:13: ( '*' | '/' | '%' ) u2= unaryExpression
            	    {
            	    if ( input.LA(1)==PERCENT||input.LA(1)==SLASH||input.LA(1)==STAR ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression7192);
            	    u2=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {retval.lisUsosId.addAll(u2.lisUsosId); retval.s = retval.s + u2.s;}

            	    }
            	    break;

            	default :
            	    break loop126;
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
            if ( state.backtracking>0 ) { memoize(input, 85, multiplicativeExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"


    public static class unaryExpression_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s;
    };


    // $ANTLR start "unaryExpression"
    // Java.g:902:1: unaryExpression returns [ArrayList<String> lisUsosId,String s] : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |u= unaryExpressionNotPlusMinus );
    public final JavaParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JavaParser.unaryExpression_return retval = new JavaParser.unaryExpression_return();
        retval.start = input.LT(1);

        int unaryExpression_StartIndex = input.index();

        JavaParser.unaryExpressionNotPlusMinus_return u =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // Java.g:903:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression |u= unaryExpressionNotPlusMinus )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;

            }

            switch (alt127) {
                case 1 :
                    // Java.g:903:9: '+' unaryExpression
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression7231); if (state.failed) return retval;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression7234);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Java.g:904:9: '-' unaryExpression
                    {
                    match(input,SUB,FOLLOW_SUB_in_unaryExpression7244); if (state.failed) return retval;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression7246);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Java.g:905:9: '++' unaryExpression
                    {
                    match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unaryExpression7256); if (state.failed) return retval;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression7258);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Java.g:906:9: '--' unaryExpression
                    {
                    match(input,SUBSUB,FOLLOW_SUBSUB_in_unaryExpression7268); if (state.failed) return retval;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression7270);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // Java.g:907:9: u= unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression7284);
                    u=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.lisUsosId = u.lisUsosId;retval.s =u.s;}

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
            if ( state.backtracking>0 ) { memoize(input, 86, unaryExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unaryExpression"


    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s;
    };


    // $ANTLR start "unaryExpressionNotPlusMinus"
    // Java.g:910:1: unaryExpressionNotPlusMinus returns [ArrayList<String> lisUsosId,String s] : ( '~' unaryExpression | '!' unaryExpression | castExpression |p= primary ( selector )* ( '++' | '--' )? );
    public final JavaParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        JavaParser.unaryExpressionNotPlusMinus_return retval = new JavaParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        JavaParser.primary_return p =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // Java.g:911:5: ( '~' unaryExpression | '!' unaryExpression | castExpression |p= primary ( selector )* ( '++' | '--' )? )
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;

            }

            switch (alt130) {
                case 1 :
                    // Java.g:911:9: '~' unaryExpression
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_unaryExpressionNotPlusMinus7309); if (state.failed) return retval;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus7311);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Java.g:912:9: '!' unaryExpression
                    {
                    match(input,BANG,FOLLOW_BANG_in_unaryExpressionNotPlusMinus7321); if (state.failed) return retval;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus7323);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Java.g:913:9: castExpression
                    {
                    pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus7333);
                    castExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Java.g:914:9: p= primary ( selector )* ( '++' | '--' )?
                    {
                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus7347);
                    p=primary();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.lisUsosId = p.lisUsosId; retval.s =p.s;}

                    // Java.g:915:9: ( selector )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==DOT||LA128_0==LBRACKET) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // Java.g:915:10: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus7360);
                    	    selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);


                    // Java.g:917:9: ( '++' | '--' )?
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
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


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
            if ( state.backtracking>0 ) { memoize(input, 87, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"



    // $ANTLR start "castExpression"
    // Java.g:922:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' type ')' unaryExpressionNotPlusMinus );
    public final void castExpression() throws RecognitionException {
        int castExpression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }

            // Java.g:923:5: ( '(' primitiveType ')' unaryExpression | '(' type ')' unaryExpressionNotPlusMinus )
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
                    // Java.g:923:9: '(' primitiveType ')' unaryExpression
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_castExpression7431); if (state.failed) return ;

                    pushFollow(FOLLOW_primitiveType_in_castExpression7433);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,RPAREN,FOLLOW_RPAREN_in_castExpression7435); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpression_in_castExpression7437);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:924:9: '(' type ')' unaryExpressionNotPlusMinus
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_castExpression7447); if (state.failed) return ;

                    pushFollow(FOLLOW_type_in_castExpression7449);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,RPAREN,FOLLOW_RPAREN_in_castExpression7451); if (state.failed) return ;

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression7453);
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


    public static class primary_return extends ParserRuleReturnScope {
        public ArrayList<String> lisUsosId;
        public String s;
    };


    // $ANTLR start "primary"
    // Java.g:930:1: primary returns [ArrayList<String> lisUsosId, String s] : ( parExpression | 'this' ( '.' Id1= IDENTIFIER )* ( identifierSuffix )? |Id2= IDENTIFIER ( '.' Id3= IDENTIFIER )* ( identifierSuffix )? | 'super' superSuffix |l= literal | creator | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
    public final JavaParser.primary_return primary() throws RecognitionException {
        JavaParser.primary_return retval = new JavaParser.primary_return();
        retval.start = input.LT(1);

        int primary_StartIndex = input.index();

        Token Id1=null;
        Token Id2=null;
        Token Id3=null;
        JavaParser.literal_return l =null;



            retval.lisUsosId = new ArrayList<String>(); //lista que se crea en nodo 'hoja'

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

            // Java.g:934:5: ( parExpression | 'this' ( '.' Id1= IDENTIFIER )* ( identifierSuffix )? |Id2= IDENTIFIER ( '.' Id3= IDENTIFIER )* ( identifierSuffix )? | 'super' superSuffix |l= literal | creator | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }

            switch (alt137) {
                case 1 :
                    // Java.g:934:9: parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_primary7483);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Java.g:935:9: 'this' ( '.' Id1= IDENTIFIER )* ( identifierSuffix )?
                    {
                    match(input,THIS,FOLLOW_THIS_in_primary7505); if (state.failed) return retval;

                    // Java.g:936:9: ( '.' Id1= IDENTIFIER )*
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
                    	    // Java.g:936:10: '.' Id1= IDENTIFIER
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_primary7516); if (state.failed) return retval;

                    	    Id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary7522); if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) {retval.lisUsosId.add(Id1.getText());}

                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);


                    // Java.g:938:9: ( identifierSuffix )?
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
                            // Java.g:938:10: identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primary7546);
                            identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Java.g:940:9: Id2= IDENTIFIER ( '.' Id3= IDENTIFIER )* ( identifierSuffix )?
                    {
                    Id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary7571); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.lisUsosId.add(Id2.getText());}

                    // Java.g:941:9: ( '.' Id3= IDENTIFIER )*
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
                    	    // Java.g:941:10: '.' Id3= IDENTIFIER
                    	    {
                    	    match(input,DOT,FOLLOW_DOT_in_primary7584); if (state.failed) return retval;

                    	    Id3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary7590); if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) {retval.lisUsosId.add(Id3.getText());}

                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);


                    // Java.g:943:9: ( identifierSuffix )?
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
                            // Java.g:943:10: identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primary7614);
                            identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Java.g:945:9: 'super' superSuffix
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primary7635); if (state.failed) return retval;

                    pushFollow(FOLLOW_superSuffix_in_primary7645);
                    superSuffix();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // Java.g:947:9: l= literal
                    {
                    pushFollow(FOLLOW_literal_in_primary7659);
                    l=literal();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.s = (l!=null?input.toString(l.start,l.stop):null);}

                    }
                    break;
                case 6 :
                    // Java.g:948:9: creator
                    {
                    pushFollow(FOLLOW_creator_in_primary7671);
                    creator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // Java.g:949:9: primitiveType ( '[' ']' )* '.' 'class'
                    {
                    pushFollow(FOLLOW_primitiveType_in_primary7697);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    // Java.g:950:9: ( '[' ']' )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==LBRACKET) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // Java.g:950:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_primary7708); if (state.failed) return retval;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_primary7710); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);


                    match(input,DOT,FOLLOW_DOT_in_primary7731); if (state.failed) return retval;

                    match(input,CLASS,FOLLOW_CLASS_in_primary7733); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Java.g:953:9: 'void' '.' 'class'
                    {
                    match(input,VOID,FOLLOW_VOID_in_primary7743); if (state.failed) return retval;

                    match(input,DOT,FOLLOW_DOT_in_primary7745); if (state.failed) return retval;

                    match(input,CLASS,FOLLOW_CLASS_in_primary7747); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 89, primary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primary"



    // $ANTLR start "superSuffix"
    // Java.g:957:1: superSuffix : ( arguments | '.' ( typeArguments )? IDENTIFIER ( arguments )? );
    public final void superSuffix() throws RecognitionException {
        int superSuffix_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }

            // Java.g:958:5: ( arguments | '.' ( typeArguments )? IDENTIFIER ( arguments )? )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==LPAREN) ) {
                alt140=1;
            }
            else if ( (LA140_0==DOT) ) {
                alt140=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;

            }
            switch (alt140) {
                case 1 :
                    // Java.g:958:9: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_superSuffix7773);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:959:9: '.' ( typeArguments )? IDENTIFIER ( arguments )?
                    {
                    match(input,DOT,FOLLOW_DOT_in_superSuffix7783); if (state.failed) return ;

                    // Java.g:959:13: ( typeArguments )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==LT) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // Java.g:959:14: typeArguments
                            {
                            pushFollow(FOLLOW_typeArguments_in_superSuffix7786);
                            typeArguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superSuffix7807); if (state.failed) return ;

                    // Java.g:962:9: ( arguments )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==LPAREN) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // Java.g:962:10: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superSuffix7818);
                            arguments();

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
            if ( state.backtracking>0 ) { memoize(input, 90, superSuffix_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "superSuffix"



    // $ANTLR start "identifierSuffix"
    // Java.g:967:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' nonWildcardTypeArguments IDENTIFIER arguments | '.' 'this' | '.' 'super' arguments | innerCreator );
    public final void identifierSuffix() throws RecognitionException {
        int identifierSuffix_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }

            // Java.g:968:5: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' nonWildcardTypeArguments IDENTIFIER arguments | '.' 'this' | '.' 'super' arguments | innerCreator )
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
                    if (state.backtracking>0) {state.failed=true; return ;}
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
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 143, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;

            }

            switch (alt143) {
                case 1 :
                    // Java.g:968:9: ( '[' ']' )+ '.' 'class'
                    {
                    // Java.g:968:9: ( '[' ']' )+
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
                    	    // Java.g:968:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_identifierSuffix7851); if (state.failed) return ;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_identifierSuffix7853); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt141 >= 1 ) break loop141;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(141, input);
                                throw eee;
                        }
                        cnt141++;
                    } while (true);


                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix7874); if (state.failed) return ;

                    match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix7876); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:971:9: ( '[' expression ']' )+
                    {
                    // Java.g:971:9: ( '[' expression ']' )+
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
                    	    // Java.g:971:10: '[' expression ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_identifierSuffix7887); if (state.failed) return ;

                    	    pushFollow(FOLLOW_expression_in_identifierSuffix7889);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_identifierSuffix7891); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt142 >= 1 ) break loop142;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(142, input);
                                throw eee;
                        }
                        cnt142++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // Java.g:973:9: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_identifierSuffix7912);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Java.g:974:9: '.' 'class'
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix7922); if (state.failed) return ;

                    match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix7924); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Java.g:975:9: '.' nonWildcardTypeArguments IDENTIFIER arguments
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix7934); if (state.failed) return ;

                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_identifierSuffix7936);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierSuffix7938); if (state.failed) return ;

                    pushFollow(FOLLOW_arguments_in_identifierSuffix7940);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // Java.g:976:9: '.' 'this'
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix7950); if (state.failed) return ;

                    match(input,THIS,FOLLOW_THIS_in_identifierSuffix7952); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // Java.g:977:9: '.' 'super' arguments
                    {
                    match(input,DOT,FOLLOW_DOT_in_identifierSuffix7962); if (state.failed) return ;

                    match(input,SUPER,FOLLOW_SUPER_in_identifierSuffix7964); if (state.failed) return ;

                    pushFollow(FOLLOW_arguments_in_identifierSuffix7966);
                    arguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // Java.g:978:9: innerCreator
                    {
                    pushFollow(FOLLOW_innerCreator_in_identifierSuffix7976);
                    innerCreator();

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
            if ( state.backtracking>0 ) { memoize(input, 91, identifierSuffix_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "identifierSuffix"



    // $ANTLR start "selector"
    // Java.g:982:1: selector : ( '.' IDENTIFIER ( arguments )? | '.' 'this' | '.' 'super' superSuffix | innerCreator | '[' expression ']' );
    public final void selector() throws RecognitionException {
        int selector_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }

            // Java.g:983:5: ( '.' IDENTIFIER ( arguments )? | '.' 'this' | '.' 'super' superSuffix | innerCreator | '[' expression ']' )
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
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA145_0==LBRACKET) ) {
                alt145=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;

            }
            switch (alt145) {
                case 1 :
                    // Java.g:983:9: '.' IDENTIFIER ( arguments )?
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector7996); if (state.failed) return ;

                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector7998); if (state.failed) return ;

                    // Java.g:984:9: ( arguments )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==LPAREN) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // Java.g:984:10: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector8009);
                            arguments();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Java.g:986:9: '.' 'this'
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector8030); if (state.failed) return ;

                    match(input,THIS,FOLLOW_THIS_in_selector8032); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:987:9: '.' 'super' superSuffix
                    {
                    match(input,DOT,FOLLOW_DOT_in_selector8042); if (state.failed) return ;

                    match(input,SUPER,FOLLOW_SUPER_in_selector8044); if (state.failed) return ;

                    pushFollow(FOLLOW_superSuffix_in_selector8054);
                    superSuffix();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Java.g:989:9: innerCreator
                    {
                    pushFollow(FOLLOW_innerCreator_in_selector8064);
                    innerCreator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Java.g:990:9: '[' expression ']'
                    {
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_selector8074); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_selector8076);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,RBRACKET,FOLLOW_RBRACKET_in_selector8078); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "selector"



    // $ANTLR start "creator"
    // Java.g:993:1: creator : ( 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest | 'new' classOrInterfaceType classCreatorRest | arrayCreator );
    public final void creator() throws RecognitionException {
        int creator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }

            // Java.g:994:5: ( 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest | 'new' classOrInterfaceType classCreatorRest | arrayCreator )
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
                    // Java.g:994:9: 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest
                    {
                    match(input,NEW,FOLLOW_NEW_in_creator8098); if (state.failed) return ;

                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator8100);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_classOrInterfaceType_in_creator8102);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_classCreatorRest_in_creator8104);
                    classCreatorRest();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:995:9: 'new' classOrInterfaceType classCreatorRest
                    {
                    match(input,NEW,FOLLOW_NEW_in_creator8114); if (state.failed) return ;

                    pushFollow(FOLLOW_classOrInterfaceType_in_creator8116);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_classCreatorRest_in_creator8118);
                    classCreatorRest();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:996:9: arrayCreator
                    {
                    pushFollow(FOLLOW_arrayCreator_in_creator8128);
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
    // Java.g:999:1: arrayCreator : ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer | 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )* );
    public final void arrayCreator() throws RecognitionException {
        int arrayCreator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }

            // Java.g:1000:5: ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer | 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )* )
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
                    // Java.g:1000:9: 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer
                    {
                    match(input,NEW,FOLLOW_NEW_in_arrayCreator8148); if (state.failed) return ;

                    pushFollow(FOLLOW_createdName_in_arrayCreator8150);
                    createdName();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8160); if (state.failed) return ;

                    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8162); if (state.failed) return ;

                    // Java.g:1002:9: ( '[' ']' )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==LBRACKET) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // Java.g:1002:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8173); if (state.failed) return ;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8175); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);


                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreator8196);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1006:9: 'new' createdName '[' expression ']' ( '[' expression ']' )* ( '[' ']' )*
                    {
                    match(input,NEW,FOLLOW_NEW_in_arrayCreator8207); if (state.failed) return ;

                    pushFollow(FOLLOW_createdName_in_arrayCreator8209);
                    createdName();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8219); if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_arrayCreator8221);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8231); if (state.failed) return ;

                    // Java.g:1009:9: ( '[' expression ']' )*
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
                    	    // Java.g:1009:13: '[' expression ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8245); if (state.failed) return ;

                    	    pushFollow(FOLLOW_expression_in_arrayCreator8247);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8261); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop148;
                        }
                    } while (true);


                    // Java.g:1012:9: ( '[' ']' )*
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
                    	    // Java.g:1012:10: '[' ']'
                    	    {
                    	    match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreator8283); if (state.failed) return ;

                    	    match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreator8285); if (state.failed) return ;

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
    // Java.g:1016:1: variableInitializer returns [String s] : ( arrayInitializer |e1= expression );
    public final String variableInitializer() throws RecognitionException {
        String s = null;

        int variableInitializer_StartIndex = input.index();

        JavaParser.expression_return e1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return s; }

            // Java.g:1017:5: ( arrayInitializer |e1= expression )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==LBRACE) ) {
                alt151=1;
            }
            else if ( (LA151_0==BANG||LA151_0==BOOLEAN||LA151_0==BYTE||(LA151_0 >= CHAR && LA151_0 <= CHARLITERAL)||(LA151_0 >= DOUBLE && LA151_0 <= DOUBLELITERAL)||LA151_0==FALSE||(LA151_0 >= FLOAT && LA151_0 <= FLOATLITERAL)||LA151_0==IDENTIFIER||LA151_0==INT||LA151_0==INTLITERAL||(LA151_0 >= LONG && LA151_0 <= LPAREN)||(LA151_0 >= NEW && LA151_0 <= NULL)||LA151_0==PLUS||LA151_0==PLUSPLUS||LA151_0==SHORT||(LA151_0 >= STRINGLITERAL && LA151_0 <= SUB)||(LA151_0 >= SUBSUB && LA151_0 <= SUPER)||LA151_0==THIS||LA151_0==TILDE||LA151_0==TRUE||LA151_0==VOID) ) {
                alt151=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;

            }
            switch (alt151) {
                case 1 :
                    // Java.g:1017:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer8320);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return s;

                    }
                    break;
                case 2 :
                    // Java.g:1018:9: e1= expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer8334);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return s;

                    if ( state.backtracking==0 ) {s = e1.s;}

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
        return s;
    }
    // $ANTLR end "variableInitializer"



    // $ANTLR start "arrayInitializer"
    // Java.g:1021:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}' ;
    public final void arrayInitializer() throws RecognitionException {
        int arrayInitializer_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }

            // Java.g:1022:5: ( '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}' )
            // Java.g:1022:9: '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_arrayInitializer8356); if (state.failed) return ;

            // Java.g:1023:13: ( variableInitializer ( ',' variableInitializer )* )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==BANG||LA153_0==BOOLEAN||LA153_0==BYTE||(LA153_0 >= CHAR && LA153_0 <= CHARLITERAL)||(LA153_0 >= DOUBLE && LA153_0 <= DOUBLELITERAL)||LA153_0==FALSE||(LA153_0 >= FLOAT && LA153_0 <= FLOATLITERAL)||LA153_0==IDENTIFIER||LA153_0==INT||LA153_0==INTLITERAL||LA153_0==LBRACE||(LA153_0 >= LONG && LA153_0 <= LPAREN)||(LA153_0 >= NEW && LA153_0 <= NULL)||LA153_0==PLUS||LA153_0==PLUSPLUS||LA153_0==SHORT||(LA153_0 >= STRINGLITERAL && LA153_0 <= SUB)||(LA153_0 >= SUBSUB && LA153_0 <= SUPER)||LA153_0==THIS||LA153_0==TILDE||LA153_0==TRUE||LA153_0==VOID) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // Java.g:1023:14: variableInitializer ( ',' variableInitializer )*
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer8372);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    // Java.g:1024:17: ( ',' variableInitializer )*
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
                    	    // Java.g:1024:18: ',' variableInitializer
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer8391); if (state.failed) return ;

                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer8393);
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


            // Java.g:1027:13: ( ',' )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==COMMA) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // Java.g:1027:14: ','
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer8443); if (state.failed) return ;

                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_arrayInitializer8456); if (state.failed) return ;

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
    // Java.g:1032:1: createdName : ( classOrInterfaceType | primitiveType );
    public final void createdName() throws RecognitionException {
        int createdName_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }

            // Java.g:1033:5: ( classOrInterfaceType | primitiveType )
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
                    // Java.g:1033:9: classOrInterfaceType
                    {
                    pushFollow(FOLLOW_classOrInterfaceType_in_createdName8490);
                    classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1034:9: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_createdName8500);
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
    // Java.g:1037:1: innerCreator : '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest ;
    public final void innerCreator() throws RecognitionException {
        int innerCreator_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return ; }

            // Java.g:1038:5: ( '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest )
            // Java.g:1038:9: '.' 'new' ( nonWildcardTypeArguments )? IDENTIFIER ( typeArguments )? classCreatorRest
            {
            match(input,DOT,FOLLOW_DOT_in_innerCreator8521); if (state.failed) return ;

            match(input,NEW,FOLLOW_NEW_in_innerCreator8523); if (state.failed) return ;

            // Java.g:1039:9: ( nonWildcardTypeArguments )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==LT) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // Java.g:1039:10: nonWildcardTypeArguments
                    {
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator8534);
                    nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerCreator8555); if (state.failed) return ;

            // Java.g:1042:9: ( typeArguments )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==LT) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // Java.g:1042:10: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_innerCreator8566);
                    typeArguments();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            pushFollow(FOLLOW_classCreatorRest_in_innerCreator8587);
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
    // Java.g:1048:1: classCreatorRest : arguments ( classBody )? ;
    public final void classCreatorRest() throws RecognitionException {
        int classCreatorRest_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return ; }

            // Java.g:1049:5: ( arguments ( classBody )? )
            // Java.g:1049:9: arguments ( classBody )?
            {
            pushFollow(FOLLOW_arguments_in_classCreatorRest8608);
            arguments();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:1050:9: ( classBody )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==LBRACE) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // Java.g:1050:10: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_classCreatorRest8619);
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
    // Java.g:1055:1: nonWildcardTypeArguments : '<' typeList '>' ;
    public final void nonWildcardTypeArguments() throws RecognitionException {
        int nonWildcardTypeArguments_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return ; }

            // Java.g:1056:5: ( '<' typeList '>' )
            // Java.g:1056:9: '<' typeList '>'
            {
            match(input,LT,FOLLOW_LT_in_nonWildcardTypeArguments8651); if (state.failed) return ;

            pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments8653);
            typeList();

            state._fsp--;
            if (state.failed) return ;

            match(input,GT,FOLLOW_GT_in_nonWildcardTypeArguments8663); if (state.failed) return ;

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
    // Java.g:1060:1: arguments : '(' ( expressionList )? ')' ;
    public final void arguments() throws RecognitionException {
        int arguments_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return ; }

            // Java.g:1061:5: ( '(' ( expressionList )? ')' )
            // Java.g:1061:9: '(' ( expressionList )? ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments8683); if (state.failed) return ;

            // Java.g:1061:13: ( expressionList )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==BANG||LA159_0==BOOLEAN||LA159_0==BYTE||(LA159_0 >= CHAR && LA159_0 <= CHARLITERAL)||(LA159_0 >= DOUBLE && LA159_0 <= DOUBLELITERAL)||LA159_0==FALSE||(LA159_0 >= FLOAT && LA159_0 <= FLOATLITERAL)||LA159_0==IDENTIFIER||LA159_0==INT||LA159_0==INTLITERAL||(LA159_0 >= LONG && LA159_0 <= LPAREN)||(LA159_0 >= NEW && LA159_0 <= NULL)||LA159_0==PLUS||LA159_0==PLUSPLUS||LA159_0==SHORT||(LA159_0 >= STRINGLITERAL && LA159_0 <= SUB)||(LA159_0 >= SUBSUB && LA159_0 <= SUPER)||LA159_0==THIS||LA159_0==TILDE||LA159_0==TRUE||LA159_0==VOID) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // Java.g:1061:14: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments8686);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_arguments8699); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "arguments"


    public static class literal_return extends ParserRuleReturnScope {
        public String s;
    };


    // $ANTLR start "literal"
    // Java.g:1065:1: literal returns [String s] : ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL |str= STRINGLITERAL | TRUE | FALSE | NULL );
    public final JavaParser.literal_return literal() throws RecognitionException {
        JavaParser.literal_return retval = new JavaParser.literal_return();
        retval.start = input.LT(1);

        int literal_StartIndex = input.index();

        Token str=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

            // Java.g:1066:5: ( INTLITERAL | LONGLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL |str= STRINGLITERAL | TRUE | FALSE | NULL )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;

            }

            switch (alt160) {
                case 1 :
                    // Java.g:1066:9: INTLITERAL
                    {
                    match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal8722); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Java.g:1067:9: LONGLITERAL
                    {
                    match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal8732); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Java.g:1068:9: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal8742); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Java.g:1069:9: DOUBLELITERAL
                    {
                    match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal8752); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // Java.g:1070:9: CHARLITERAL
                    {
                    match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal8762); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Java.g:1071:9: str= STRINGLITERAL
                    {
                    str=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal8776); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {lisLiterales.add(str.getText());retval.s =str.getText();}

                    }
                    break;
                case 7 :
                    // Java.g:1072:9: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_literal8788); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Java.g:1073:9: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_literal8798); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // Java.g:1074:9: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_literal8808); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 102, literal_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "literal"



    // $ANTLR start "classHeader"
    // Java.g:1081:1: classHeader : modifiers 'class' IDENTIFIER ;
    public final void classHeader() throws RecognitionException {
        int classHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return ; }

            // Java.g:1082:5: ( modifiers 'class' IDENTIFIER )
            // Java.g:1082:9: modifiers 'class' IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_classHeader8832);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLASS,FOLLOW_CLASS_in_classHeader8834); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classHeader8836); if (state.failed) return ;

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
    // Java.g:1085:1: enumHeader : modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER ;
    public final void enumHeader() throws RecognitionException {
        int enumHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return ; }

            // Java.g:1086:5: ( modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER )
            // Java.g:1086:9: modifiers ( 'enum' | IDENTIFIER ) IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_enumHeader8856);
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


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumHeader8864); if (state.failed) return ;

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
    // Java.g:1089:1: interfaceHeader : modifiers 'interface' IDENTIFIER ;
    public final void interfaceHeader() throws RecognitionException {
        int interfaceHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return ; }

            // Java.g:1090:5: ( modifiers 'interface' IDENTIFIER )
            // Java.g:1090:9: modifiers 'interface' IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_interfaceHeader8884);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceHeader8886); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_interfaceHeader8888); if (state.failed) return ;

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
    // Java.g:1093:1: annotationHeader : modifiers '@' 'interface' IDENTIFIER ;
    public final void annotationHeader() throws RecognitionException {
        int annotationHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return ; }

            // Java.g:1094:5: ( modifiers '@' 'interface' IDENTIFIER )
            // Java.g:1094:9: modifiers '@' 'interface' IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_annotationHeader8908);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_annotationHeader8910); if (state.failed) return ;

            match(input,INTERFACE,FOLLOW_INTERFACE_in_annotationHeader8912); if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_annotationHeader8914); if (state.failed) return ;

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
    // Java.g:1097:1: typeHeader : modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER ;
    public final void typeHeader() throws RecognitionException {
        int typeHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return ; }

            // Java.g:1098:5: ( modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER )
            // Java.g:1098:9: modifiers ( 'class' | 'enum' | ( ( '@' )? 'interface' ) ) IDENTIFIER
            {
            pushFollow(FOLLOW_modifiers_in_typeHeader8934);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:1098:19: ( 'class' | 'enum' | ( ( '@' )? 'interface' ) )
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
                    // Java.g:1098:20: 'class'
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_typeHeader8937); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1098:28: 'enum'
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeHeader8939); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Java.g:1098:35: ( ( '@' )? 'interface' )
                    {
                    // Java.g:1098:35: ( ( '@' )? 'interface' )
                    // Java.g:1098:36: ( '@' )? 'interface'
                    {
                    // Java.g:1098:36: ( '@' )?
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==MONKEYS_AT) ) {
                        alt161=1;
                    }
                    switch (alt161) {
                        case 1 :
                            // Java.g:1098:36: '@'
                            {
                            match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_typeHeader8942); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeHeader8946); if (state.failed) return ;

                    }


                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeHeader8950); if (state.failed) return ;

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
    // Java.g:1101:1: methodHeader : modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '(' ;
    public final void methodHeader() throws RecognitionException {
        int methodHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return ; }

            // Java.g:1102:5: ( modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '(' )
            // Java.g:1102:9: modifiers ( typeParameters )? ( type | 'void' )? IDENTIFIER '('
            {
            pushFollow(FOLLOW_modifiers_in_methodHeader8970);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            // Java.g:1102:19: ( typeParameters )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==LT) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // Java.g:1102:19: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_methodHeader8972);
                    typeParameters();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // Java.g:1102:35: ( type | 'void' )?
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
                    // Java.g:1102:36: type
                    {
                    pushFollow(FOLLOW_type_in_methodHeader8976);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Java.g:1102:41: 'void'
                    {
                    match(input,VOID,FOLLOW_VOID_in_methodHeader8978); if (state.failed) return ;

                    }
                    break;

            }


            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_methodHeader8982); if (state.failed) return ;

            match(input,LPAREN,FOLLOW_LPAREN_in_methodHeader8984); if (state.failed) return ;

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
    // Java.g:1105:1: fieldHeader : modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) ;
    public final void fieldHeader() throws RecognitionException {
        int fieldHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return ; }

            // Java.g:1106:5: ( modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) )
            // Java.g:1106:9: modifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' )
            {
            pushFollow(FOLLOW_modifiers_in_fieldHeader9004);
            modifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_fieldHeader9006);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldHeader9008); if (state.failed) return ;

            // Java.g:1106:35: ( '[' ']' )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==LBRACKET) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // Java.g:1106:36: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_fieldHeader9011); if (state.failed) return ;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_fieldHeader9012); if (state.failed) return ;

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
    // Java.g:1109:1: localVariableHeader : variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) ;
    public final void localVariableHeader() throws RecognitionException {
        int localVariableHeader_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return ; }

            // Java.g:1110:5: ( variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' ) )
            // Java.g:1110:9: variableModifiers type IDENTIFIER ( '[' ']' )* ( '=' | ',' | ';' )
            {
            pushFollow(FOLLOW_variableModifiers_in_localVariableHeader9042);
            variableModifiers();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_type_in_localVariableHeader9044);
            type();

            state._fsp--;
            if (state.failed) return ;

            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableHeader9046); if (state.failed) return ;

            // Java.g:1110:43: ( '[' ']' )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==LBRACKET) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // Java.g:1110:44: '[' ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_localVariableHeader9049); if (state.failed) return ;

            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_localVariableHeader9050); if (state.failed) return ;

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
        String p =null;


        // Java.g:64:13: ( ( annotations )? p= packageDeclaration )
        // Java.g:64:13: ( annotations )? p= packageDeclaration
        {
        // Java.g:64:13: ( annotations )?
        int alt167=2;
        int LA167_0 = input.LA(1);

        if ( (LA167_0==MONKEYS_AT) ) {
            alt167=1;
        }
        switch (alt167) {
            case 1 :
                // Java.g:64:14: annotations
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


        // Java.g:108:9: (c= classDeclaration )
        // Java.g:108:9: c= classDeclaration
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


        // Java.g:139:9: (n= normalClassDeclaration )
        // Java.g:139:9: n= normalClassDeclaration
        {
        pushFollow(FOLLOW_normalClassDeclaration_in_synpred27_Java779);
        n=normalClassDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred27_Java

    // $ANTLR start synpred43_Java
    public final void synpred43_Java_fragment() throws RecognitionException {
        // Java.g:227:9: ( normalInterfaceDeclaration )
        // Java.g:227:9: normalInterfaceDeclaration
        {
        pushFollow(FOLLOW_normalInterfaceDeclaration_in_synpred43_Java1476);
        normalInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred43_Java

    // $ANTLR start synpred52_Java
    public final void synpred52_Java_fragment() throws RecognitionException {
        Map<String,Declaracion> f1 =null;


        // Java.g:286:10: (f1= fieldDeclaration )
        // Java.g:286:10: f1= fieldDeclaration
        {
        pushFollow(FOLLOW_fieldDeclaration_in_synpred52_Java1850);
        f1=fieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_Java

    // $ANTLR start synpred53_Java
    public final void synpred53_Java_fragment() throws RecognitionException {
        JavaParser.methodDeclaration_return m1 =null;


        // Java.g:287:10: (m1= methodDeclaration )
        // Java.g:287:10: m1= methodDeclaration
        {
        pushFollow(FOLLOW_methodDeclaration_in_synpred53_Java1867);
        m1=methodDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_Java

    // $ANTLR start synpred54_Java
    public final void synpred54_Java_fragment() throws RecognitionException {
        // Java.g:288:10: ( classDeclaration )
        // Java.g:288:10: classDeclaration
        {
        pushFollow(FOLLOW_classDeclaration_in_synpred54_Java1880);
        classDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred54_Java

    // $ANTLR start synpred57_Java
    public final void synpred57_Java_fragment() throws RecognitionException {
        // Java.g:316:10: ( explicitConstructorInvocation )
        // Java.g:316:10: explicitConstructorInvocation
        {
        pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred57_Java2042);
        explicitConstructorInvocation();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_Java

    // $ANTLR start synpred59_Java
    public final void synpred59_Java_fragment() throws RecognitionException {
        Token Id1=null;
        Map<String,Parametro> f1 =null;

        JavaParser.blockStatement_return b1 =null;


        // Java.g:308:10: ( modifiers ( typeParameters )? Id1= IDENTIFIER f1= formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? (b1= blockStatement )* '}' )
        // Java.g:308:10: modifiers ( typeParameters )? Id1= IDENTIFIER f1= formalParameters ( 'throws' qualifiedNameList )? '{' ( explicitConstructorInvocation )? (b1= blockStatement )* '}'
        {
        pushFollow(FOLLOW_modifiers_in_synpred59_Java1940);
        modifiers();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:309:9: ( typeParameters )?
        int alt170=2;
        int LA170_0 = input.LA(1);

        if ( (LA170_0==LT) ) {
            alt170=1;
        }
        switch (alt170) {
            case 1 :
                // Java.g:309:10: typeParameters
                {
                pushFollow(FOLLOW_typeParameters_in_synpred59_Java1953);
                typeParameters();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        Id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred59_Java1978); if (state.failed) return ;

        pushFollow(FOLLOW_formalParameters_in_synpred59_Java1994);
        f1=formalParameters();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:313:9: ( 'throws' qualifiedNameList )?
        int alt171=2;
        int LA171_0 = input.LA(1);

        if ( (LA171_0==THROWS) ) {
            alt171=1;
        }
        switch (alt171) {
            case 1 :
                // Java.g:313:10: 'throws' qualifiedNameList
                {
                match(input,THROWS,FOLLOW_THROWS_in_synpred59_Java2007); if (state.failed) return ;

                pushFollow(FOLLOW_qualifiedNameList_in_synpred59_Java2009);
                qualifiedNameList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,LBRACE,FOLLOW_LBRACE_in_synpred59_Java2030); if (state.failed) return ;

        // Java.g:316:9: ( explicitConstructorInvocation )?
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
                // Java.g:316:10: explicitConstructorInvocation
                {
                pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred59_Java2042);
                explicitConstructorInvocation();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // Java.g:318:9: (b1= blockStatement )*
        loop173:
        do {
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==ABSTRACT||(LA173_0 >= ASSERT && LA173_0 <= BANG)||(LA173_0 >= BOOLEAN && LA173_0 <= BYTE)||(LA173_0 >= CHAR && LA173_0 <= CLASS)||LA173_0==CONTINUE||LA173_0==DO||(LA173_0 >= DOUBLE && LA173_0 <= DOUBLELITERAL)||LA173_0==ENUM||(LA173_0 >= FALSE && LA173_0 <= FINAL)||(LA173_0 >= FLOAT && LA173_0 <= FOR)||(LA173_0 >= IDENTIFIER && LA173_0 <= IF)||(LA173_0 >= INT && LA173_0 <= INTLITERAL)||LA173_0==LBRACE||(LA173_0 >= LONG && LA173_0 <= LT)||(LA173_0 >= MONKEYS_AT && LA173_0 <= NULL)||LA173_0==PLUS||(LA173_0 >= PLUSPLUS && LA173_0 <= PUBLIC)||LA173_0==RETURN||(LA173_0 >= SEMI && LA173_0 <= SHORT)||(LA173_0 >= STATIC && LA173_0 <= SUB)||(LA173_0 >= SUBSUB && LA173_0 <= SYNCHRONIZED)||(LA173_0 >= THIS && LA173_0 <= THROW)||(LA173_0 >= TILDE && LA173_0 <= WHILE)) ) {
                alt173=1;
            }


            switch (alt173) {
        	case 1 :
        	    // Java.g:318:10: b1= blockStatement
        	    {
        	    pushFollow(FOLLOW_blockStatement_in_synpred59_Java2068);
        	    b1=blockStatement();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop173;
            }
        } while (true);


        match(input,RBRACE,FOLLOW_RBRACE_in_synpred59_Java2093); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Java

    // $ANTLR start synpred68_Java
    public final void synpred68_Java_fragment() throws RecognitionException {
        // Java.g:372:9: ( interfaceFieldDeclaration )
        // Java.g:372:9: interfaceFieldDeclaration
        {
        pushFollow(FOLLOW_interfaceFieldDeclaration_in_synpred68_Java2838);
        interfaceFieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred68_Java

    // $ANTLR start synpred69_Java
    public final void synpred69_Java_fragment() throws RecognitionException {
        // Java.g:373:9: ( interfaceMethodDeclaration )
        // Java.g:373:9: interfaceMethodDeclaration
        {
        pushFollow(FOLLOW_interfaceMethodDeclaration_in_synpred69_Java2848);
        interfaceMethodDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred69_Java

    // $ANTLR start synpred70_Java
    public final void synpred70_Java_fragment() throws RecognitionException {
        // Java.g:374:9: ( interfaceDeclaration )
        // Java.g:374:9: interfaceDeclaration
        {
        pushFollow(FOLLOW_interfaceDeclaration_in_synpred70_Java2858);
        interfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred70_Java

    // $ANTLR start synpred71_Java
    public final void synpred71_Java_fragment() throws RecognitionException {
        // Java.g:375:9: ( classDeclaration )
        // Java.g:375:9: classDeclaration
        {
        pushFollow(FOLLOW_classDeclaration_in_synpred71_Java2868);
        classDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred71_Java

    // $ANTLR start synpred96_Java
    public final void synpred96_Java_fragment() throws RecognitionException {
        // Java.g:473:9: ( ellipsisParameterDecl )
        // Java.g:473:9: ellipsisParameterDecl
        {
        pushFollow(FOLLOW_ellipsisParameterDecl_in_synpred96_Java3661);
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


        // Java.g:475:8: (p1= normalParameterDecl ( ',' p2= normalParameterDecl )* )
        // Java.g:475:8: p1= normalParameterDecl ( ',' p2= normalParameterDecl )*
        {
        pushFollow(FOLLOW_normalParameterDecl_in_synpred98_Java3675);
        p1=normalParameterDecl();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:476:9: ( ',' p2= normalParameterDecl )*
        loop176:
        do {
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==COMMA) ) {
                alt176=1;
            }


            switch (alt176) {
        	case 1 :
        	    // Java.g:476:10: ',' p2= normalParameterDecl
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred98_Java3688); if (state.failed) return ;

        	    pushFollow(FOLLOW_normalParameterDecl_in_synpred98_Java3694);
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
        // Java.g:479:10: ( normalParameterDecl ',' )
        // Java.g:479:10: normalParameterDecl ','
        {
        pushFollow(FOLLOW_normalParameterDecl_in_synpred99_Java3719);
        normalParameterDecl();

        state._fsp--;
        if (state.failed) return ;

        match(input,COMMA,FOLLOW_COMMA_in_synpred99_Java3729); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred99_Java

    // $ANTLR start synpred103_Java
    public final void synpred103_Java_fragment() throws RecognitionException {
        // Java.g:499:9: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' )
        // Java.g:499:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
        {
        // Java.g:499:9: ( nonWildcardTypeArguments )?
        int alt177=2;
        int LA177_0 = input.LA(1);

        if ( (LA177_0==LT) ) {
            alt177=1;
        }
        switch (alt177) {
            case 1 :
                // Java.g:499:10: nonWildcardTypeArguments
                {
                pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred103_Java3869);
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


        pushFollow(FOLLOW_arguments_in_synpred103_Java3927);
        arguments();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred103_Java3929); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred103_Java

    // $ANTLR start synpred117_Java
    public final void synpred117_Java_fragment() throws RecognitionException {
        // Java.g:586:9: ( annotationMethodDeclaration )
        // Java.g:586:9: annotationMethodDeclaration
        {
        pushFollow(FOLLOW_annotationMethodDeclaration_in_synpred117_Java4544);
        annotationMethodDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred117_Java

    // $ANTLR start synpred118_Java
    public final void synpred118_Java_fragment() throws RecognitionException {
        // Java.g:587:9: ( interfaceFieldDeclaration )
        // Java.g:587:9: interfaceFieldDeclaration
        {
        pushFollow(FOLLOW_interfaceFieldDeclaration_in_synpred118_Java4554);
        interfaceFieldDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_Java

    // $ANTLR start synpred119_Java
    public final void synpred119_Java_fragment() throws RecognitionException {
        // Java.g:588:9: ( normalClassDeclaration )
        // Java.g:588:9: normalClassDeclaration
        {
        pushFollow(FOLLOW_normalClassDeclaration_in_synpred119_Java4564);
        normalClassDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred119_Java

    // $ANTLR start synpred120_Java
    public final void synpred120_Java_fragment() throws RecognitionException {
        // Java.g:589:9: ( normalInterfaceDeclaration )
        // Java.g:589:9: normalInterfaceDeclaration
        {
        pushFollow(FOLLOW_normalInterfaceDeclaration_in_synpred120_Java4574);
        normalInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_Java

    // $ANTLR start synpred121_Java
    public final void synpred121_Java_fragment() throws RecognitionException {
        // Java.g:590:9: ( enumDeclaration )
        // Java.g:590:9: enumDeclaration
        {
        pushFollow(FOLLOW_enumDeclaration_in_synpred121_Java4584);
        enumDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred121_Java

    // $ANTLR start synpred122_Java
    public final void synpred122_Java_fragment() throws RecognitionException {
        // Java.g:591:9: ( annotationTypeDeclaration )
        // Java.g:591:9: annotationTypeDeclaration
        {
        pushFollow(FOLLOW_annotationTypeDeclaration_in_synpred122_Java4594);
        annotationTypeDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred122_Java

    // $ANTLR start synpred125_Java
    public final void synpred125_Java_fragment() throws RecognitionException {
        Map<String,Declaracion> l1 =null;


        // Java.g:642:9: (l1= localVariableDeclarationStatement )
        // Java.g:642:9: l1= localVariableDeclarationStatement
        {
        pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred125_Java4776);
        l1=localVariableDeclarationStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred125_Java

    // $ANTLR start synpred126_Java
    public final void synpred126_Java_fragment() throws RecognitionException {
        // Java.g:643:9: ( classOrInterfaceDeclaration )
        // Java.g:643:9: classOrInterfaceDeclaration
        {
        pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred126_Java4788);
        classOrInterfaceDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred126_Java

    // $ANTLR start synpred130_Java
    public final void synpred130_Java_fragment() throws RecognitionException {
        // Java.g:672:9: ( ( 'assert' ) expression ( ':' expression )? ';' )
        // Java.g:672:9: ( 'assert' ) expression ( ':' expression )? ';'
        {
        // Java.g:672:9: ( 'assert' )
        // Java.g:672:10: 'assert'
        {
        match(input,ASSERT,FOLLOW_ASSERT_in_synpred130_Java4977); if (state.failed) return ;

        }


        pushFollow(FOLLOW_expression_in_synpred130_Java4997);
        expression();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:674:20: ( ':' expression )?
        int alt180=2;
        int LA180_0 = input.LA(1);

        if ( (LA180_0==COLON) ) {
            alt180=1;
        }
        switch (alt180) {
            case 1 :
                // Java.g:674:21: ':' expression
                {
                match(input,COLON,FOLLOW_COLON_in_synpred130_Java5000); if (state.failed) return ;

                pushFollow(FOLLOW_expression_in_synpred130_Java5002);
                expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SEMI,FOLLOW_SEMI_in_synpred130_Java5006); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred130_Java

    // $ANTLR start synpred132_Java
    public final void synpred132_Java_fragment() throws RecognitionException {
        // Java.g:675:9: ( 'assert' expression ( ':' expression )? ';' )
        // Java.g:675:9: 'assert' expression ( ':' expression )? ';'
        {
        match(input,ASSERT,FOLLOW_ASSERT_in_synpred132_Java5016); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred132_Java5019);
        expression();

        state._fsp--;
        if (state.failed) return ;

        // Java.g:675:30: ( ':' expression )?
        int alt181=2;
        int LA181_0 = input.LA(1);

        if ( (LA181_0==COLON) ) {
            alt181=1;
        }
        switch (alt181) {
            case 1 :
                // Java.g:675:31: ':' expression
                {
                match(input,COLON,FOLLOW_COLON_in_synpred132_Java5022); if (state.failed) return ;

                pushFollow(FOLLOW_expression_in_synpred132_Java5024);
                expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SEMI,FOLLOW_SEMI_in_synpred132_Java5028); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred132_Java

    // $ANTLR start synpred133_Java
    public final void synpred133_Java_fragment() throws RecognitionException {
        // Java.g:676:39: ( 'else' statement )
        // Java.g:676:39: 'else' statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred133_Java5057); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred133_Java5059);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred133_Java

    // $ANTLR start synpred148_Java
    public final void synpred148_Java_fragment() throws RecognitionException {
        JavaParser.expression_return e1 =null;


        // Java.g:691:9: (e1= expression ';' )
        // Java.g:691:9: e1= expression ';'
        {
        pushFollow(FOLLOW_expression_in_synpred148_Java5285);
        e1=expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred148_Java5287); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred148_Java

    // $ANTLR start synpred149_Java
    public final void synpred149_Java_fragment() throws RecognitionException {
        // Java.g:692:9: ( IDENTIFIER ':' statement )
        // Java.g:692:9: IDENTIFIER ':' statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred149_Java5303); if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred149_Java5305); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred149_Java5307);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred149_Java

    // $ANTLR start synpred153_Java
    public final void synpred153_Java_fragment() throws RecognitionException {
        // Java.g:716:13: ( catches 'finally' block )
        // Java.g:716:13: catches 'finally' block
        {
        pushFollow(FOLLOW_catches_in_synpred153_Java5463);
        catches();

        state._fsp--;
        if (state.failed) return ;

        match(input,FINALLY,FOLLOW_FINALLY_in_synpred153_Java5465); if (state.failed) return ;

        pushFollow(FOLLOW_block_in_synpred153_Java5467);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred153_Java

    // $ANTLR start synpred154_Java
    public final void synpred154_Java_fragment() throws RecognitionException {
        // Java.g:717:13: ( catches )
        // Java.g:717:13: catches
        {
        pushFollow(FOLLOW_catches_in_synpred154_Java5481);
        catches();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred154_Java

    // $ANTLR start synpred157_Java
    public final void synpred157_Java_fragment() throws RecognitionException {
        // Java.g:742:9: ( 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement )
        // Java.g:742:9: 'for' '(' variableModifiers type IDENTIFIER ':' expression ')' statement
        {
        match(input,FOR,FOLLOW_FOR_in_synpred157_Java5673); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred157_Java5675); if (state.failed) return ;

        pushFollow(FOLLOW_variableModifiers_in_synpred157_Java5677);
        variableModifiers();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred157_Java5679);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred157_Java5681); if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred157_Java5683); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred157_Java5694);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred157_Java5696); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred157_Java5698);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred157_Java

    // $ANTLR start synpred161_Java
    public final void synpred161_Java_fragment() throws RecognitionException {
        // Java.g:756:9: ( localVariableDeclaration )
        // Java.g:756:9: localVariableDeclaration
        {
        pushFollow(FOLLOW_localVariableDeclaration_in_synpred161_Java5876);
        localVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred161_Java

    // $ANTLR start synpred202_Java
    public final void synpred202_Java_fragment() throws RecognitionException {
        // Java.g:913:9: ( castExpression )
        // Java.g:913:9: castExpression
        {
        pushFollow(FOLLOW_castExpression_in_synpred202_Java7333);
        castExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred202_Java

    // $ANTLR start synpred206_Java
    public final void synpred206_Java_fragment() throws RecognitionException {
        // Java.g:923:9: ( '(' primitiveType ')' unaryExpression )
        // Java.g:923:9: '(' primitiveType ')' unaryExpression
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred206_Java7431); if (state.failed) return ;

        pushFollow(FOLLOW_primitiveType_in_synpred206_Java7433);
        primitiveType();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred206_Java7435); if (state.failed) return ;

        pushFollow(FOLLOW_unaryExpression_in_synpred206_Java7437);
        unaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred206_Java

    // $ANTLR start synpred208_Java
    public final void synpred208_Java_fragment() throws RecognitionException {
        Token Id1=null;

        // Java.g:936:10: ( '.' Id1= IDENTIFIER )
        // Java.g:936:10: '.' Id1= IDENTIFIER
        {
        match(input,DOT,FOLLOW_DOT_in_synpred208_Java7516); if (state.failed) return ;

        Id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred208_Java7522); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred208_Java

    // $ANTLR start synpred209_Java
    public final void synpred209_Java_fragment() throws RecognitionException {
        // Java.g:938:10: ( identifierSuffix )
        // Java.g:938:10: identifierSuffix
        {
        pushFollow(FOLLOW_identifierSuffix_in_synpred209_Java7546);
        identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred209_Java

    // $ANTLR start synpred211_Java
    public final void synpred211_Java_fragment() throws RecognitionException {
        Token Id3=null;

        // Java.g:941:10: ( '.' Id3= IDENTIFIER )
        // Java.g:941:10: '.' Id3= IDENTIFIER
        {
        match(input,DOT,FOLLOW_DOT_in_synpred211_Java7584); if (state.failed) return ;

        Id3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred211_Java7590); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred211_Java

    // $ANTLR start synpred212_Java
    public final void synpred212_Java_fragment() throws RecognitionException {
        // Java.g:943:10: ( identifierSuffix )
        // Java.g:943:10: identifierSuffix
        {
        pushFollow(FOLLOW_identifierSuffix_in_synpred212_Java7614);
        identifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred212_Java

    // $ANTLR start synpred224_Java
    public final void synpred224_Java_fragment() throws RecognitionException {
        // Java.g:971:10: ( '[' expression ']' )
        // Java.g:971:10: '[' expression ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred224_Java7887); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred224_Java7889);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred224_Java7891); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred224_Java

    // $ANTLR start synpred236_Java
    public final void synpred236_Java_fragment() throws RecognitionException {
        // Java.g:994:9: ( 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest )
        // Java.g:994:9: 'new' nonWildcardTypeArguments classOrInterfaceType classCreatorRest
        {
        match(input,NEW,FOLLOW_NEW_in_synpred236_Java8098); if (state.failed) return ;

        pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred236_Java8100);
        nonWildcardTypeArguments();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_classOrInterfaceType_in_synpred236_Java8102);
        classOrInterfaceType();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_classCreatorRest_in_synpred236_Java8104);
        classCreatorRest();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred236_Java

    // $ANTLR start synpred237_Java
    public final void synpred237_Java_fragment() throws RecognitionException {
        // Java.g:995:9: ( 'new' classOrInterfaceType classCreatorRest )
        // Java.g:995:9: 'new' classOrInterfaceType classCreatorRest
        {
        match(input,NEW,FOLLOW_NEW_in_synpred237_Java8114); if (state.failed) return ;

        pushFollow(FOLLOW_classOrInterfaceType_in_synpred237_Java8116);
        classOrInterfaceType();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_classCreatorRest_in_synpred237_Java8118);
        classCreatorRest();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred237_Java

    // $ANTLR start synpred239_Java
    public final void synpred239_Java_fragment() throws RecognitionException {
        // Java.g:1000:9: ( 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer )
        // Java.g:1000:9: 'new' createdName '[' ']' ( '[' ']' )* arrayInitializer
        {
        match(input,NEW,FOLLOW_NEW_in_synpred239_Java8148); if (state.failed) return ;

        pushFollow(FOLLOW_createdName_in_synpred239_Java8150);
        createdName();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred239_Java8160); if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred239_Java8162); if (state.failed) return ;

        // Java.g:1002:9: ( '[' ']' )*
        loop194:
        do {
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( (LA194_0==LBRACKET) ) {
                alt194=1;
            }


            switch (alt194) {
        	case 1 :
        	    // Java.g:1002:10: '[' ']'
        	    {
        	    match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred239_Java8173); if (state.failed) return ;

        	    match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred239_Java8175); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop194;
            }
        } while (true);


        pushFollow(FOLLOW_arrayInitializer_in_synpred239_Java8196);
        arrayInitializer();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred239_Java

    // $ANTLR start synpred240_Java
    public final void synpred240_Java_fragment() throws RecognitionException {
        // Java.g:1009:13: ( '[' expression ']' )
        // Java.g:1009:13: '[' expression ']'
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred240_Java8245); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred240_Java8247);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred240_Java8261); if (state.failed) return ;

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
    public static final BitSet FOLLOW_annotation_in_modifiers575 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_PUBLIC_in_modifiers585 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_PROTECTED_in_modifiers596 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_PRIVATE_in_modifiers606 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_STATIC_in_modifiers616 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifiers626 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_FINAL_in_modifiers636 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_NATIVE_in_modifiers646 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifiers656 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifiers666 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_VOLATILE_in_modifiers676 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_STRICTFP_in_modifiers686 = new BitSet(new long[]{0x0000100000000012L,0x0011040C00700600L});
    public static final BitSet FOLLOW_FINAL_in_variableModifiers721 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_annotation_in_variableModifiers735 = new BitSet(new long[]{0x0000100000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_classDeclaration779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_classDeclaration791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_normalClassDeclaration815 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_normalClassDeclaration818 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_normalClassDeclaration824 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_typeParameters_in_normalClassDeclaration835 = new BitSet(new long[]{0x0100010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_normalClassDeclaration859 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_normalClassDeclaration861 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_normalClassDeclaration883 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_typeList_in_normalClassDeclaration885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_classBody_in_normalClassDeclaration922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParameters945 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters959 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_COMMA_in_typeParameters974 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters976 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_GT_in_typeParameters1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeParameter1021 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_typeParameter1032 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeBound1066 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AMP_in_typeBound1077 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_typeBound1079 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_modifiers_in_enumDeclaration1111 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDeclaration1123 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDeclaration1144 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_enumDeclaration1155 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_typeList_in_enumDeclaration1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumBody_in_enumDeclaration1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody1203 = new BitSet(new long[]{0x0040000002000000L,0x0000000011000200L});
    public static final BitSet FOLLOW_enumConstants_in_enumBody1214 = new BitSet(new long[]{0x0000000002000000L,0x0000000011000000L});
    public static final BitSet FOLLOW_COMMA_in_enumBody1236 = new BitSet(new long[]{0x0000000000000000L,0x0000000011000000L});
    public static final BitSet FOLLOW_enumBodyDeclarations_in_enumBody1249 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumConstant_in_enumConstants1291 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_enumConstants1302 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_enumConstant_in_enumConstants1304 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_annotations_in_enumConstant1338 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumConstant1359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000042L});
    public static final BitSet FOLLOW_arguments_in_enumConstant1370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_classBody_in_enumConstant1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumBodyDeclarations1433 = new BitSet(new long[]{0x1840502100A14012L,0x0019040C30700692L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_enumBodyDeclarations1445 = new BitSet(new long[]{0x1840502100A14012L,0x0019040C30700692L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_normalInterfaceDeclaration1510 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_normalInterfaceDeclaration1512 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_normalInterfaceDeclaration1514 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration1525 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_normalInterfaceDeclaration1547 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1590 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1601 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_typeList1603 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBody1645 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700692L});
    public static final BitSet FOLLOW_classBodyDeclaration_in_classBody1661 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700692L});
    public static final BitSet FOLLOW_RBRACE_in_classBody1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceBody1707 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700690L});
    public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody1719 = new BitSet(new long[]{0x1840502100A14010L,0x0019040C31700690L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceBody1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_classBodyDeclaration1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_classBodyDeclaration1779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_classBodyDeclaration1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_memberDecl1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_memberDecl1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_memberDecl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_memberDecl1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodDeclaration1940 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeParameters_in_methodDeclaration1953 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration1978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration1994 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000002L});
    public static final BitSet FOLLOW_THROWS_in_methodDeclaration2007 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaration2009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_methodDeclaration2030 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1EF2L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_methodDeclaration2042 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_blockStatement_in_methodDeclaration2068 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_RBRACE_in_methodDeclaration2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodDeclaration2219 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000090L});
    public static final BitSet FOLLOW_typeParameters_in_methodDeclaration2232 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000010L});
    public static final BitSet FOLLOW_type_in_methodDeclaration2254 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_VOID_in_methodDeclaration2270 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodDeclaration2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration2312 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000006L});
    public static final BitSet FOLLOW_LBRACKET_in_methodDeclaration2325 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodDeclaration2327 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000006L});
    public static final BitSet FOLLOW_THROWS_in_methodDeclaration2349 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaration2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000002L});
    public static final BitSet FOLLOW_block_in_methodDeclaration2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_methodDeclaration2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_fieldDeclaration2608 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration2620 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration2643 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_fieldDeclaration2658 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDeclaration2664 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_fieldDeclaration2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variableDeclarator2754 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_variableDeclarator2767 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_variableDeclarator2769 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_EQ_in_variableDeclarator2791 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1872L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_interfaceBodyDeclaration2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDeclaration2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceBodyDeclaration2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_interfaceBodyDeclaration2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_interfaceBodyDeclaration2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceMethodDeclaration2898 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000090L});
    public static final BitSet FOLLOW_typeParameters_in_interfaceMethodDeclaration2909 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000010L});
    public static final BitSet FOLLOW_type_in_interfaceMethodDeclaration2931 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_VOID_in_interfaceMethodDeclaration2942 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_interfaceMethodDeclaration2962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaration2972 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000004L});
    public static final BitSet FOLLOW_LBRACKET_in_interfaceMethodDeclaration2983 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_interfaceMethodDeclaration2985 = new BitSet(new long[]{0x0000000000000000L,0x0000400010000004L});
    public static final BitSet FOLLOW_THROWS_in_interfaceMethodDeclaration3007 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaration3009 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_interfaceMethodDeclaration3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceFieldDeclaration3044 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_interfaceFieldDeclaration3046 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_interfaceFieldDeclaration3048 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_interfaceFieldDeclaration3061 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_interfaceFieldDeclaration3063 = new BitSet(new long[]{0x0000000002000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_interfaceFieldDeclaration3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_type3110 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_type3121 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_type3123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type3144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_type3157 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_type3159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterfaceType3191 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType3202 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_DOT_in_classOrInterfaceType3224 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterfaceType3226 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType3241 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_LT_in_typeArguments3382 = new BitSet(new long[]{0x0840400100214000L,0x0000000020800010L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments3384 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_COMMA_in_typeArguments3395 = new BitSet(new long[]{0x0840400100214000L,0x0000000020800010L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments3397 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_GT_in_typeArguments3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeArgument3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUES_in_typeArgument3449 = new BitSet(new long[]{0x0000010000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_set_in_typeArgument3473 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_typeArgument3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList3548 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_qualifiedNameList3559 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList3561 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameters3595 = new BitSet(new long[]{0x0840500100214000L,0x0000000028000210L});
    public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters3610 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameters3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3675 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterDecls3688 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3694 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_normalParameterDecl_in_formalParameterDecls3719 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterDecls3729 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_ellipsisParameterDecl_in_formalParameterDecls3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_normalParameterDecl3774 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_normalParameterDecl3776 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_normalParameterDecl3778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_normalParameterDecl3791 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_normalParameterDecl3793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_variableModifiers_in_ellipsisParameterDecl3824 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_ellipsisParameterDecl3834 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ELLIPSIS_in_ellipsisParameterDecl3837 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ellipsisParameterDecl3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3869 = new BitSet(new long[]{0x0000000000000000L,0x0000110000000000L});
    public static final BitSet FOLLOW_set_in_explicitConstructorInvocation3895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation3927 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_explicitConstructorInvocation3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation3940 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOT_in_explicitConstructorInvocation3950 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000080L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation3961 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation3982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation3992 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_explicitConstructorInvocation3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedName4021 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedName4035 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedName4041 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_annotation_in_annotations4075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_annotation4108 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedName_in_annotation4110 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_annotation4124 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0280A1A72L});
    public static final BitSet FOLLOW_elementValuePairs_in_annotation4151 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_elementValue_in_annotation4175 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs4243 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_elementValuePairs4254 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs4256 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_elementValuePair4287 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_elementValuePair4289 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1A72L});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_elementValue4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_elementValue4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_elementValueArrayInitializer4351 = new BitSet(new long[]{0x2840C80302614200L,0x000A91B0210A1A72L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer4362 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_elementValueArrayInitializer4377 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1A72L});
    public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer4379 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_elementValueArrayInitializer4408 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACE_in_elementValueArrayInitializer4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_annotationTypeDeclaration4435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_annotationTypeDeclaration4437 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_annotationTypeDeclaration4447 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_annotationTypeDeclaration4457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_annotationTypeBody4488 = new BitSet(new long[]{0x1840502100A14010L,0x0011040C31700610L});
    public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody4500 = new BitSet(new long[]{0x1840502100A14010L,0x0011040C31700610L});
    public static final BitSet FOLLOW_RBRACE_in_annotationTypeBody4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationMethodDeclaration_in_annotationTypeElementDeclaration4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_annotationTypeElementDeclaration4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_annotationTypeElementDeclaration4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementDeclaration4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementDeclaration4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementDeclaration4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_annotationTypeElementDeclaration4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_annotationMethodDeclaration4624 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_annotationMethodDeclaration4626 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_annotationMethodDeclaration4628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_annotationMethodDeclaration4638 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotationMethodDeclaration4640 = new BitSet(new long[]{0x0000000020000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationMethodDeclaration4643 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1A72L});
    public static final BitSet FOLLOW_elementValue_in_annotationMethodDeclaration4645 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_annotationMethodDeclaration4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block4705 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_blockStatement_in_block4720 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_RBRACE_in_block4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement4833 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_localVariableDeclarationStatement4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration4872 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration4874 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration4890 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_localVariableDeclaration4904 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_localVariableDeclaration4910 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_block_in_statement4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement4977 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_statement4997 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_statement5000 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_statement5002 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement5016 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_statement5019 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_statement5022 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_statement5024 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement5050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parExpression_in_statement5052 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_statement5054 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement5057 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_statement5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstatement_in_statement5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement5091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parExpression_in_statement5093 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_statement5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement5105 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_statement5107 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement5109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parExpression_in_statement5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trystatement_in_statement5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement5133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parExpression_in_statement5135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_statement5137 = new BitSet(new long[]{0x0000000020080000L,0x0000000001000000L});
    public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement5139 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACE_in_statement5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement5151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_parExpression_in_statement5153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement5165 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0300A1870L});
    public static final BitSet FOLLOW_expression_in_statement5168 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement5183 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_statement5185 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement5197 = new BitSet(new long[]{0x0040000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement5212 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement5239 = new BitSet(new long[]{0x0040000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement5254 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement5285 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_statement5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement5303 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_statement5305 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_statement5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups5339 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup5368 = new BitSet(new long[]{0x38C1D82350E1C312L,0x003FB7BC347A1E72L});
    public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup5379 = new BitSet(new long[]{0x38C1D82350E1C312L,0x003FB7BC347A1E72L});
    public static final BitSet FOLLOW_CASE_in_switchLabel5410 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_switchLabel5412 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_switchLabel5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchLabel5424 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_switchLabel5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_trystatement5447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_trystatement5449 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_catches_in_trystatement5463 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_FINALLY_in_trystatement5465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_trystatement5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_trystatement5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_trystatement5495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_trystatement5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchClause_in_catches5528 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_catchClause_in_catches5539 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause5570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause5572 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_formalParameter_in_catchClause5574 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause5584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_catchClause5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_formalParameter5607 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_formalParameter5609 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_formalParameter5611 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_formalParameter5622 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_formalParameter5624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FOR_in_forstatement5673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement5675 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_variableModifiers_in_forstatement5677 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_forstatement5679 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_forstatement5681 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_forstatement5683 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_forstatement5694 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement5696 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_forstatement5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstatement5730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement5732 = new BitSet(new long[]{0x2840D80300614200L,0x000A91B0300A1A70L});
    public static final BitSet FOLLOW_forInit_in_forstatement5752 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_forstatement5773 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0300A1870L});
    public static final BitSet FOLLOW_expression_in_forstatement5793 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_forstatement5814 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0280A1870L});
    public static final BitSet FOLLOW_expressionList_in_forstatement5834 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement5855 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_forstatement5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression5906 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_parExpression5907 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList5927 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_expressionList5938 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_expressionList5940 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression5983 = new BitSet(new long[]{0x0008004000042082L,0x0000004280050080L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression5996 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_expression6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignmentOperator6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignmentOperator6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAREQ_in_assignmentOperator6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignmentOperator6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignmentOperator6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAREQ_in_assignmentOperator6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARETEQ_in_assignmentOperator6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignmentOperator6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_assignmentOperator6131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_assignmentOperator6133 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator6146 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator6148 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator6150 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator6163 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator6165 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_assignmentOperator6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression6195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_QUES_in_conditionalExpression6208 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression6214 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression6218 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression6264 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_BARBAR_in_conditionalOrExpression6277 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression6283 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6323 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_conditionalAndExpression6336 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6342 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6382 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_BAR_in_inclusiveOrExpression6395 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6401 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression6441 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_CARET_in_exclusiveOrExpression6454 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression6460 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression6500 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AMP_in_andExpression6513 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression6519 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression6559 = new BitSet(new long[]{0x0000008000000402L});
    public static final BitSet FOLLOW_set_in_equalityExpression6588 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression6642 = new BitSet(new long[]{0x0000008000000402L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression6682 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression6695 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression6735 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression6748 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression6754 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_relationalOp6787 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_relationalOp6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relationalOp6800 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_EQ_in_relationalOp6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_relationalOp6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relationalOp6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression6849 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_shiftOp_in_shiftExpression6862 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression6868 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_shiftOp6903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_shiftOp6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_shiftOp6916 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftOp6918 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftOp6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_shiftOp6931 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_shiftOp6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression6961 = new BitSet(new long[]{0x0000000000000002L,0x0000002000020000L});
    public static final BitSet FOLLOW_set_in_additiveExpression6990 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression7044 = new BitSet(new long[]{0x0000000000000002L,0x0000002000020000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression7091 = new BitSet(new long[]{0x0000000000000002L,0x0000000140008000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression7120 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression7192 = new BitSet(new long[]{0x0000000000000002L,0x0000000140008000L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression7231 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryExpression7244 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unaryExpression7256 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unaryExpression7268 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression7270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_unaryExpressionNotPlusMinus7309 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BANG_in_unaryExpressionNotPlusMinus7321 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus7323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus7347 = new BitSet(new long[]{0x0000000080000002L,0x0000008000080004L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus7360 = new BitSet(new long[]{0x0000000080000002L,0x0000008000080004L});
    public static final BitSet FOLLOW_LPAREN_in_castExpression7431 = new BitSet(new long[]{0x0800400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_primitiveType_in_castExpression7433 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpression7435 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_castExpression7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_castExpression7447 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_castExpression7449 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_castExpression7451 = new BitSet(new long[]{0x2840C80300614200L,0x000A911020001870L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primary7505 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
    public static final BitSet FOLLOW_DOT_in_primary7516 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary7522 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary7546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary7571 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
    public static final BitSet FOLLOW_DOT_in_primary7584 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary7590 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000044L});
    public static final BitSet FOLLOW_identifierSuffix_in_primary7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primary7635 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_superSuffix_in_primary7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary7659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_creator_in_primary7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primary7697 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_primary7708 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_primary7710 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DOT_in_primary7731 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_primary7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primary7743 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOT_in_primary7745 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_primary7747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_superSuffix7783 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeArguments_in_superSuffix7786 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superSuffix7807 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_superSuffix7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifierSuffix7851 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifierSuffix7853 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix7874 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix7876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_identifierSuffix7887 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_identifierSuffix7889 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_identifierSuffix7891 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix7922 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_identifierSuffix7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix7934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_identifierSuffix7936 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifierSuffix7938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix7950 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_THIS_in_identifierSuffix7952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_identifierSuffix7962 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SUPER_in_identifierSuffix7964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_innerCreator_in_identifierSuffix7976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector7996 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector7998 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_selector8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector8030 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_THIS_in_selector8032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector8042 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SUPER_in_selector8044 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_superSuffix_in_selector8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_innerCreator_in_selector8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_selector8074 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_selector8076 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_selector8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_creator8098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator8100 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_creator8102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_creator8114 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_creator8116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayCreator_in_creator8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_arrayCreator8148 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_createdName_in_arrayCreator8150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8160 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8173 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreator8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_arrayCreator8207 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_createdName_in_arrayCreator8209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8219 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_arrayCreator8221 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8231 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8245 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_arrayCreator8247 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayCreator8283 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayCreator8285 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer8334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_arrayInitializer8356 = new BitSet(new long[]{0x2840C80302614200L,0x000A91B0210A1872L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer8372 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayInitializer8391 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1872L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer8393 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_arrayInitializer8443 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RBRACE_in_arrayInitializer8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_createdName8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_innerCreator8521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_NEW_in_innerCreator8523 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator8534 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerCreator8555 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_typeArguments_in_innerCreator8566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_classCreatorRest_in_innerCreator8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest8608 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_classBody_in_classCreatorRest8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_nonWildcardTypeArguments8651 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments8653 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_nonWildcardTypeArguments8663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments8683 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0280A1870L});
    public static final BitSet FOLLOW_expressionList_in_arguments8686 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_arguments8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal8722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal8732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal8776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal8798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal8808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_classHeader8832 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_classHeader8834 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classHeader8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_enumHeader8856 = new BitSet(new long[]{0x0040002000000000L});
    public static final BitSet FOLLOW_set_in_enumHeader8858 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumHeader8864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceHeader8884 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceHeader8886 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_interfaceHeader8888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_annotationHeader8908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_annotationHeader8910 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_annotationHeader8912 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_annotationHeader8914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_typeHeader8934 = new BitSet(new long[]{0x1000002000800000L,0x0000000000000200L});
    public static final BitSet FOLLOW_CLASS_in_typeHeader8937 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ENUM_in_typeHeader8939 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_typeHeader8942 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_INTERFACE_in_typeHeader8946 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeHeader8950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodHeader8970 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000090L});
    public static final BitSet FOLLOW_typeParameters_in_methodHeader8972 = new BitSet(new long[]{0x0840400100214000L,0x0008000020000010L});
    public static final BitSet FOLLOW_type_in_methodHeader8976 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_VOID_in_methodHeader8978 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_methodHeader8982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_methodHeader8984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_fieldHeader9004 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_fieldHeader9006 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldHeader9008 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
    public static final BitSet FOLLOW_LBRACKET_in_fieldHeader9011 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_fieldHeader9012 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
    public static final BitSet FOLLOW_set_in_fieldHeader9016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_localVariableHeader9042 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_localVariableHeader9044 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableHeader9046 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
    public static final BitSet FOLLOW_LBRACKET_in_localVariableHeader9049 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_localVariableHeader9050 = new BitSet(new long[]{0x0000004002000000L,0x0000000010000004L});
    public static final BitSet FOLLOW_set_in_localVariableHeader9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_synpred2_Java103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_packageDeclaration_in_synpred2_Java136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_synpred12_Java525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_synpred27_Java779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_synpred43_Java1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_synpred52_Java1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_synpred53_Java1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_synpred54_Java1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred57_Java2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_synpred59_Java1940 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeParameters_in_synpred59_Java1953 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred59_Java1978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_formalParameters_in_synpred59_Java1994 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000002L});
    public static final BitSet FOLLOW_THROWS_in_synpred59_Java2007 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_qualifiedNameList_in_synpred59_Java2009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_synpred59_Java2030 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1EF2L});
    public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred59_Java2042 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_blockStatement_in_synpred59_Java2068 = new BitSet(new long[]{0x38C1D82350E1C310L,0x003FB7BC357A1E72L});
    public static final BitSet FOLLOW_RBRACE_in_synpred59_Java2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_synpred68_Java2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceMethodDeclaration_in_synpred69_Java2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_synpred70_Java2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_synpred71_Java2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ellipsisParameterDecl_in_synpred96_Java3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalParameterDecl_in_synpred98_Java3675 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred98_Java3688 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_normalParameterDecl_in_synpred98_Java3694 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_normalParameterDecl_in_synpred99_Java3719 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred99_Java3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred103_Java3869 = new BitSet(new long[]{0x0000000000000000L,0x0000110000000000L});
    public static final BitSet FOLLOW_set_in_synpred103_Java3895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_synpred103_Java3927 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred103_Java3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationMethodDeclaration_in_synpred117_Java4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceFieldDeclaration_in_synpred118_Java4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalClassDeclaration_in_synpred119_Java4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normalInterfaceDeclaration_in_synpred120_Java4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDeclaration_in_synpred121_Java4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationTypeDeclaration_in_synpred122_Java4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred125_Java4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred126_Java4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_synpred130_Java4977 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred130_Java4997 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_synpred130_Java5000 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred130_Java5002 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred130_Java5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_synpred132_Java5016 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred132_Java5019 = new BitSet(new long[]{0x0000000001000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_synpred132_Java5022 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred132_Java5024 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred132_Java5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred133_Java5057 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_synpred133_Java5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred148_Java5285 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred148_Java5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred149_Java5303 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_synpred149_Java5305 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_synpred149_Java5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_synpred153_Java5463 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_FINALLY_in_synpred153_Java5465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred153_Java5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catches_in_synpred154_Java5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_synpred157_Java5673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LPAREN_in_synpred157_Java5675 = new BitSet(new long[]{0x0840500100214000L,0x0000000020000210L});
    public static final BitSet FOLLOW_variableModifiers_in_synpred157_Java5677 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_type_in_synpred157_Java5679 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred157_Java5681 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_synpred157_Java5683 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred157_Java5694 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred157_Java5696 = new BitSet(new long[]{0x28C1C8035061C300L,0x002EB7B0340A1872L});
    public static final BitSet FOLLOW_statement_in_synpred157_Java5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_synpred161_Java5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_synpred202_Java7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred206_Java7431 = new BitSet(new long[]{0x0800400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_primitiveType_in_synpred206_Java7433 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred206_Java7435 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_unaryExpression_in_synpred206_Java7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred208_Java7516 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred208_Java7522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred209_Java7546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred211_Java7584 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred211_Java7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred212_Java7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred224_Java7887 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred224_Java7889 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred224_Java7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_synpred236_Java8098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred236_Java8100 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_synpred236_Java8102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_classCreatorRest_in_synpred236_Java8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_synpred237_Java8114 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_synpred237_Java8116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_classCreatorRest_in_synpred237_Java8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_synpred239_Java8148 = new BitSet(new long[]{0x0840400100214000L,0x0000000020000010L});
    public static final BitSet FOLLOW_createdName_in_synpred239_Java8150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred239_Java8160 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred239_Java8162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred239_Java8173 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred239_Java8175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_arrayInitializer_in_synpred239_Java8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred240_Java8245 = new BitSet(new long[]{0x2840C80300614200L,0x000A91B0200A1870L});
    public static final BitSet FOLLOW_expression_in_synpred240_Java8247 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred240_Java8261 = new BitSet(new long[]{0x0000000000000002L});

}
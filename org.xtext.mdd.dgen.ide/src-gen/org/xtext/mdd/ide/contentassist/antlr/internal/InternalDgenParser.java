package org.xtext.mdd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.mdd.services.DgenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDgenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'All'", "'None'", "'Create'", "'Read'", "'Update'", "'Delete'", "'datatype'", "'entity'", "'{'", "'}'", "'extends'", "':'", "'@'", "'many'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDgenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDgenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDgenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDgen.g"; }


    	private DgenGrammarAccess grammarAccess;

    	public void setGrammarAccess(DgenGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainmodel"
    // InternalDgen.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalDgen.g:54:1: ( ruleDomainmodel EOF )
            // InternalDgen.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalDgen.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalDgen.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalDgen.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalDgen.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalDgen.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDgen.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalDgen.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDgen.g:79:1: ( ruleType EOF )
            // InternalDgen.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDgen.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDgen.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDgen.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalDgen.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDgen.g:94:3: ( rule__Type__Alternatives )
            // InternalDgen.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalDgen.g:103:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDgen.g:104:1: ( ruleDataType EOF )
            // InternalDgen.g:105:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDgen.g:112:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:116:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDgen.g:117:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDgen.g:117:2: ( ( rule__DataType__Group__0 ) )
            // InternalDgen.g:118:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDgen.g:119:3: ( rule__DataType__Group__0 )
            // InternalDgen.g:119:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalDgen.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDgen.g:129:1: ( ruleEntity EOF )
            // InternalDgen.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDgen.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDgen.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDgen.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalDgen.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDgen.g:144:3: ( rule__Entity__Group__0 )
            // InternalDgen.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalDgen.g:153:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalDgen.g:154:1: ( ruleFeature EOF )
            // InternalDgen.g:155:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalDgen.g:162:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:166:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalDgen.g:167:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalDgen.g:167:2: ( ( rule__Feature__Group__0 ) )
            // InternalDgen.g:168:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalDgen.g:169:3: ( rule__Feature__Group__0 )
            // InternalDgen.g:169:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleViewGroup"
    // InternalDgen.g:178:1: entryRuleViewGroup : ruleViewGroup EOF ;
    public final void entryRuleViewGroup() throws RecognitionException {
        try {
            // InternalDgen.g:179:1: ( ruleViewGroup EOF )
            // InternalDgen.g:180:1: ruleViewGroup EOF
            {
             before(grammarAccess.getViewGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleViewGroup();

            state._fsp--;

             after(grammarAccess.getViewGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewGroup"


    // $ANTLR start "ruleViewGroup"
    // InternalDgen.g:187:1: ruleViewGroup : ( ( rule__ViewGroup__Group__0 ) ) ;
    public final void ruleViewGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:191:2: ( ( ( rule__ViewGroup__Group__0 ) ) )
            // InternalDgen.g:192:2: ( ( rule__ViewGroup__Group__0 ) )
            {
            // InternalDgen.g:192:2: ( ( rule__ViewGroup__Group__0 ) )
            // InternalDgen.g:193:3: ( rule__ViewGroup__Group__0 )
            {
             before(grammarAccess.getViewGroupAccess().getGroup()); 
            // InternalDgen.g:194:3: ( rule__ViewGroup__Group__0 )
            // InternalDgen.g:194:4: rule__ViewGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ViewGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewGroup"


    // $ANTLR start "entryRuleViewOptions"
    // InternalDgen.g:203:1: entryRuleViewOptions : ruleViewOptions EOF ;
    public final void entryRuleViewOptions() throws RecognitionException {
        try {
            // InternalDgen.g:204:1: ( ruleViewOptions EOF )
            // InternalDgen.g:205:1: ruleViewOptions EOF
            {
             before(grammarAccess.getViewOptionsRule()); 
            pushFollow(FOLLOW_1);
            ruleViewOptions();

            state._fsp--;

             after(grammarAccess.getViewOptionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewOptions"


    // $ANTLR start "ruleViewOptions"
    // InternalDgen.g:212:1: ruleViewOptions : ( ( rule__ViewOptions__Group__0 ) ) ;
    public final void ruleViewOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:216:2: ( ( ( rule__ViewOptions__Group__0 ) ) )
            // InternalDgen.g:217:2: ( ( rule__ViewOptions__Group__0 ) )
            {
            // InternalDgen.g:217:2: ( ( rule__ViewOptions__Group__0 ) )
            // InternalDgen.g:218:3: ( rule__ViewOptions__Group__0 )
            {
             before(grammarAccess.getViewOptionsAccess().getGroup()); 
            // InternalDgen.g:219:3: ( rule__ViewOptions__Group__0 )
            // InternalDgen.g:219:4: rule__ViewOptions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ViewOptions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewOptionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewOptions"


    // $ANTLR start "entryRuleViews"
    // InternalDgen.g:228:1: entryRuleViews : ruleViews EOF ;
    public final void entryRuleViews() throws RecognitionException {
        try {
            // InternalDgen.g:229:1: ( ruleViews EOF )
            // InternalDgen.g:230:1: ruleViews EOF
            {
             before(grammarAccess.getViewsRule()); 
            pushFollow(FOLLOW_1);
            ruleViews();

            state._fsp--;

             after(grammarAccess.getViewsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViews"


    // $ANTLR start "ruleViews"
    // InternalDgen.g:237:1: ruleViews : ( ( rule__Views__Alternatives ) ) ;
    public final void ruleViews() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:241:2: ( ( ( rule__Views__Alternatives ) ) )
            // InternalDgen.g:242:2: ( ( rule__Views__Alternatives ) )
            {
            // InternalDgen.g:242:2: ( ( rule__Views__Alternatives ) )
            // InternalDgen.g:243:3: ( rule__Views__Alternatives )
            {
             before(grammarAccess.getViewsAccess().getAlternatives()); 
            // InternalDgen.g:244:3: ( rule__Views__Alternatives )
            // InternalDgen.g:244:4: rule__Views__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Views__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getViewsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViews"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDgen.g:252:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:256:1: ( ( ruleDataType ) | ( ruleEntity ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDgen.g:257:2: ( ruleDataType )
                    {
                    // InternalDgen.g:257:2: ( ruleDataType )
                    // InternalDgen.g:258:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDgen.g:263:2: ( ruleEntity )
                    {
                    // InternalDgen.g:263:2: ( ruleEntity )
                    // InternalDgen.g:264:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ViewGroup__NameAlternatives_1_0"
    // InternalDgen.g:273:1: rule__ViewGroup__NameAlternatives_1_0 : ( ( 'All' ) | ( 'None' ) );
    public final void rule__ViewGroup__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:277:1: ( ( 'All' ) | ( 'None' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDgen.g:278:2: ( 'All' )
                    {
                    // InternalDgen.g:278:2: ( 'All' )
                    // InternalDgen.g:279:3: 'All'
                    {
                     before(grammarAccess.getViewGroupAccess().getNameAllKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getViewGroupAccess().getNameAllKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDgen.g:284:2: ( 'None' )
                    {
                    // InternalDgen.g:284:2: ( 'None' )
                    // InternalDgen.g:285:3: 'None'
                    {
                     before(grammarAccess.getViewGroupAccess().getNameNoneKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getViewGroupAccess().getNameNoneKeyword_1_0_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewGroup__NameAlternatives_1_0"


    // $ANTLR start "rule__ViewOptions__NameAlternatives_1_0"
    // InternalDgen.g:294:1: rule__ViewOptions__NameAlternatives_1_0 : ( ( 'Create' ) | ( 'Read' ) | ( 'Update' ) | ( 'Delete' ) );
    public final void rule__ViewOptions__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:298:1: ( ( 'Create' ) | ( 'Read' ) | ( 'Update' ) | ( 'Delete' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDgen.g:299:2: ( 'Create' )
                    {
                    // InternalDgen.g:299:2: ( 'Create' )
                    // InternalDgen.g:300:3: 'Create'
                    {
                     before(grammarAccess.getViewOptionsAccess().getNameCreateKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getViewOptionsAccess().getNameCreateKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDgen.g:305:2: ( 'Read' )
                    {
                    // InternalDgen.g:305:2: ( 'Read' )
                    // InternalDgen.g:306:3: 'Read'
                    {
                     before(grammarAccess.getViewOptionsAccess().getNameReadKeyword_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getViewOptionsAccess().getNameReadKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDgen.g:311:2: ( 'Update' )
                    {
                    // InternalDgen.g:311:2: ( 'Update' )
                    // InternalDgen.g:312:3: 'Update'
                    {
                     before(grammarAccess.getViewOptionsAccess().getNameUpdateKeyword_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getViewOptionsAccess().getNameUpdateKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDgen.g:317:2: ( 'Delete' )
                    {
                    // InternalDgen.g:317:2: ( 'Delete' )
                    // InternalDgen.g:318:3: 'Delete'
                    {
                     before(grammarAccess.getViewOptionsAccess().getNameDeleteKeyword_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getViewOptionsAccess().getNameDeleteKeyword_1_0_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewOptions__NameAlternatives_1_0"


    // $ANTLR start "rule__Views__Alternatives"
    // InternalDgen.g:327:1: rule__Views__Alternatives : ( ( ( rule__Views__ViewGroupAssignment_0 ) ) | ( ( ( rule__Views__ViewOptionAssignment_1 ) ) ( ( rule__Views__ViewOptionAssignment_1 )* ) ) );
    public final void rule__Views__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:331:1: ( ( ( rule__Views__ViewGroupAssignment_0 ) ) | ( ( ( rule__Views__ViewOptionAssignment_1 ) ) ( ( rule__Views__ViewOptionAssignment_1 )* ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=11 && LA6_1<=12)) ) {
                    alt6=1;
                }
                else if ( ((LA6_1>=13 && LA6_1<=16)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDgen.g:332:2: ( ( rule__Views__ViewGroupAssignment_0 ) )
                    {
                    // InternalDgen.g:332:2: ( ( rule__Views__ViewGroupAssignment_0 ) )
                    // InternalDgen.g:333:3: ( rule__Views__ViewGroupAssignment_0 )
                    {
                     before(grammarAccess.getViewsAccess().getViewGroupAssignment_0()); 
                    // InternalDgen.g:334:3: ( rule__Views__ViewGroupAssignment_0 )
                    // InternalDgen.g:334:4: rule__Views__ViewGroupAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Views__ViewGroupAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getViewsAccess().getViewGroupAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDgen.g:338:2: ( ( ( rule__Views__ViewOptionAssignment_1 ) ) ( ( rule__Views__ViewOptionAssignment_1 )* ) )
                    {
                    // InternalDgen.g:338:2: ( ( ( rule__Views__ViewOptionAssignment_1 ) ) ( ( rule__Views__ViewOptionAssignment_1 )* ) )
                    // InternalDgen.g:339:3: ( ( rule__Views__ViewOptionAssignment_1 ) ) ( ( rule__Views__ViewOptionAssignment_1 )* )
                    {
                    // InternalDgen.g:339:3: ( ( rule__Views__ViewOptionAssignment_1 ) )
                    // InternalDgen.g:340:4: ( rule__Views__ViewOptionAssignment_1 )
                    {
                     before(grammarAccess.getViewsAccess().getViewOptionAssignment_1()); 
                    // InternalDgen.g:341:4: ( rule__Views__ViewOptionAssignment_1 )
                    // InternalDgen.g:341:5: rule__Views__ViewOptionAssignment_1
                    {
                    pushFollow(FOLLOW_4);
                    rule__Views__ViewOptionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getViewsAccess().getViewOptionAssignment_1()); 

                    }

                    // InternalDgen.g:344:3: ( ( rule__Views__ViewOptionAssignment_1 )* )
                    // InternalDgen.g:345:4: ( rule__Views__ViewOptionAssignment_1 )*
                    {
                     before(grammarAccess.getViewsAccess().getViewOptionAssignment_1()); 
                    // InternalDgen.g:346:4: ( rule__Views__ViewOptionAssignment_1 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==23) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDgen.g:346:5: rule__Views__ViewOptionAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Views__ViewOptionAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getViewsAccess().getViewOptionAssignment_1()); 

                    }


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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Views__Alternatives"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalDgen.g:355:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:359:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDgen.g:360:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalDgen.g:367:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:371:1: ( ( 'datatype' ) )
            // InternalDgen.g:372:1: ( 'datatype' )
            {
            // InternalDgen.g:372:1: ( 'datatype' )
            // InternalDgen.g:373:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalDgen.g:382:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:386:1: ( rule__DataType__Group__1__Impl )
            // InternalDgen.g:387:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalDgen.g:393:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:397:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalDgen.g:398:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalDgen.g:398:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalDgen.g:399:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalDgen.g:400:2: ( rule__DataType__NameAssignment_1 )
            // InternalDgen.g:400:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDgen.g:409:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:413:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDgen.g:414:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDgen.g:421:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__ViewsAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:425:1: ( ( ( rule__Entity__ViewsAssignment_0 ) ) )
            // InternalDgen.g:426:1: ( ( rule__Entity__ViewsAssignment_0 ) )
            {
            // InternalDgen.g:426:1: ( ( rule__Entity__ViewsAssignment_0 ) )
            // InternalDgen.g:427:2: ( rule__Entity__ViewsAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getViewsAssignment_0()); 
            // InternalDgen.g:428:2: ( rule__Entity__ViewsAssignment_0 )
            // InternalDgen.g:428:3: rule__Entity__ViewsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ViewsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getViewsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDgen.g:436:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:440:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDgen.g:441:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDgen.g:448:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:452:1: ( ( 'entity' ) )
            // InternalDgen.g:453:1: ( 'entity' )
            {
            // InternalDgen.g:453:1: ( 'entity' )
            // InternalDgen.g:454:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDgen.g:463:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:467:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDgen.g:468:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDgen.g:475:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:479:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalDgen.g:480:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalDgen.g:480:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalDgen.g:481:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalDgen.g:482:2: ( rule__Entity__NameAssignment_2 )
            // InternalDgen.g:482:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDgen.g:490:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:494:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDgen.g:495:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDgen.g:502:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:506:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalDgen.g:507:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalDgen.g:507:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalDgen.g:508:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalDgen.g:509:2: ( rule__Entity__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDgen.g:509:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDgen.g:517:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:521:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalDgen.g:522:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDgen.g:529:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:533:1: ( ( '{' ) )
            // InternalDgen.g:534:1: ( '{' )
            {
            // InternalDgen.g:534:1: ( '{' )
            // InternalDgen.g:535:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalDgen.g:544:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:548:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalDgen.g:549:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalDgen.g:556:1: rule__Entity__Group__5__Impl : ( ( ( rule__Entity__FeaturesAssignment_5 ) ) ( ( rule__Entity__FeaturesAssignment_5 )* ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:560:1: ( ( ( ( rule__Entity__FeaturesAssignment_5 ) ) ( ( rule__Entity__FeaturesAssignment_5 )* ) ) )
            // InternalDgen.g:561:1: ( ( ( rule__Entity__FeaturesAssignment_5 ) ) ( ( rule__Entity__FeaturesAssignment_5 )* ) )
            {
            // InternalDgen.g:561:1: ( ( ( rule__Entity__FeaturesAssignment_5 ) ) ( ( rule__Entity__FeaturesAssignment_5 )* ) )
            // InternalDgen.g:562:2: ( ( rule__Entity__FeaturesAssignment_5 ) ) ( ( rule__Entity__FeaturesAssignment_5 )* )
            {
            // InternalDgen.g:562:2: ( ( rule__Entity__FeaturesAssignment_5 ) )
            // InternalDgen.g:563:3: ( rule__Entity__FeaturesAssignment_5 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 
            // InternalDgen.g:564:3: ( rule__Entity__FeaturesAssignment_5 )
            // InternalDgen.g:564:4: rule__Entity__FeaturesAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Entity__FeaturesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 

            }

            // InternalDgen.g:567:2: ( ( rule__Entity__FeaturesAssignment_5 )* )
            // InternalDgen.g:568:3: ( rule__Entity__FeaturesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 
            // InternalDgen.g:569:3: ( rule__Entity__FeaturesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDgen.g:569:4: rule__Entity__FeaturesAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__FeaturesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalDgen.g:578:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:582:1: ( rule__Entity__Group__6__Impl )
            // InternalDgen.g:583:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalDgen.g:589:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:593:1: ( ( '}' ) )
            // InternalDgen.g:594:1: ( '}' )
            {
            // InternalDgen.g:594:1: ( '}' )
            // InternalDgen.g:595:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalDgen.g:605:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:609:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalDgen.g:610:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalDgen.g:617:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:621:1: ( ( 'extends' ) )
            // InternalDgen.g:622:1: ( 'extends' )
            {
            // InternalDgen.g:622:1: ( 'extends' )
            // InternalDgen.g:623:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalDgen.g:632:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:636:1: ( rule__Entity__Group_3__1__Impl )
            // InternalDgen.g:637:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalDgen.g:643:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:647:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // InternalDgen.g:648:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // InternalDgen.g:648:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // InternalDgen.g:649:2: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // InternalDgen.g:650:2: ( rule__Entity__SuperTypeAssignment_3_1 )
            // InternalDgen.g:650:3: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalDgen.g:659:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:663:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalDgen.g:664:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalDgen.g:671:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:675:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // InternalDgen.g:676:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // InternalDgen.g:676:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // InternalDgen.g:677:2: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // InternalDgen.g:678:2: ( rule__Feature__ManyAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDgen.g:678:3: rule__Feature__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalDgen.g:686:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:690:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalDgen.g:691:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalDgen.g:698:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:702:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalDgen.g:703:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalDgen.g:703:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalDgen.g:704:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalDgen.g:705:2: ( rule__Feature__NameAssignment_1 )
            // InternalDgen.g:705:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalDgen.g:713:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:717:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalDgen.g:718:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalDgen.g:725:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:729:1: ( ( ':' ) )
            // InternalDgen.g:730:1: ( ':' )
            {
            // InternalDgen.g:730:1: ( ':' )
            // InternalDgen.g:731:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalDgen.g:740:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:744:1: ( rule__Feature__Group__3__Impl )
            // InternalDgen.g:745:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalDgen.g:751:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:755:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // InternalDgen.g:756:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // InternalDgen.g:756:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // InternalDgen.g:757:2: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // InternalDgen.g:758:2: ( rule__Feature__TypeAssignment_3 )
            // InternalDgen.g:758:3: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__ViewGroup__Group__0"
    // InternalDgen.g:767:1: rule__ViewGroup__Group__0 : rule__ViewGroup__Group__0__Impl rule__ViewGroup__Group__1 ;
    public final void rule__ViewGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:771:1: ( rule__ViewGroup__Group__0__Impl rule__ViewGroup__Group__1 )
            // InternalDgen.g:772:2: rule__ViewGroup__Group__0__Impl rule__ViewGroup__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ViewGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViewGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewGroup__Group__0"


    // $ANTLR start "rule__ViewGroup__Group__0__Impl"
    // InternalDgen.g:779:1: rule__ViewGroup__Group__0__Impl : ( '@' ) ;
    public final void rule__ViewGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:783:1: ( ( '@' ) )
            // InternalDgen.g:784:1: ( '@' )
            {
            // InternalDgen.g:784:1: ( '@' )
            // InternalDgen.g:785:2: '@'
            {
             before(grammarAccess.getViewGroupAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getViewGroupAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewGroup__Group__0__Impl"


    // $ANTLR start "rule__ViewGroup__Group__1"
    // InternalDgen.g:794:1: rule__ViewGroup__Group__1 : rule__ViewGroup__Group__1__Impl ;
    public final void rule__ViewGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:798:1: ( rule__ViewGroup__Group__1__Impl )
            // InternalDgen.g:799:2: rule__ViewGroup__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViewGroup__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewGroup__Group__1"


    // $ANTLR start "rule__ViewGroup__Group__1__Impl"
    // InternalDgen.g:805:1: rule__ViewGroup__Group__1__Impl : ( ( rule__ViewGroup__NameAssignment_1 ) ) ;
    public final void rule__ViewGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:809:1: ( ( ( rule__ViewGroup__NameAssignment_1 ) ) )
            // InternalDgen.g:810:1: ( ( rule__ViewGroup__NameAssignment_1 ) )
            {
            // InternalDgen.g:810:1: ( ( rule__ViewGroup__NameAssignment_1 ) )
            // InternalDgen.g:811:2: ( rule__ViewGroup__NameAssignment_1 )
            {
             before(grammarAccess.getViewGroupAccess().getNameAssignment_1()); 
            // InternalDgen.g:812:2: ( rule__ViewGroup__NameAssignment_1 )
            // InternalDgen.g:812:3: rule__ViewGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ViewGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getViewGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewGroup__Group__1__Impl"


    // $ANTLR start "rule__ViewOptions__Group__0"
    // InternalDgen.g:821:1: rule__ViewOptions__Group__0 : rule__ViewOptions__Group__0__Impl rule__ViewOptions__Group__1 ;
    public final void rule__ViewOptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:825:1: ( rule__ViewOptions__Group__0__Impl rule__ViewOptions__Group__1 )
            // InternalDgen.g:826:2: rule__ViewOptions__Group__0__Impl rule__ViewOptions__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ViewOptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViewOptions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewOptions__Group__0"


    // $ANTLR start "rule__ViewOptions__Group__0__Impl"
    // InternalDgen.g:833:1: rule__ViewOptions__Group__0__Impl : ( '@' ) ;
    public final void rule__ViewOptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:837:1: ( ( '@' ) )
            // InternalDgen.g:838:1: ( '@' )
            {
            // InternalDgen.g:838:1: ( '@' )
            // InternalDgen.g:839:2: '@'
            {
             before(grammarAccess.getViewOptionsAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getViewOptionsAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewOptions__Group__0__Impl"


    // $ANTLR start "rule__ViewOptions__Group__1"
    // InternalDgen.g:848:1: rule__ViewOptions__Group__1 : rule__ViewOptions__Group__1__Impl ;
    public final void rule__ViewOptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:852:1: ( rule__ViewOptions__Group__1__Impl )
            // InternalDgen.g:853:2: rule__ViewOptions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViewOptions__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewOptions__Group__1"


    // $ANTLR start "rule__ViewOptions__Group__1__Impl"
    // InternalDgen.g:859:1: rule__ViewOptions__Group__1__Impl : ( ( rule__ViewOptions__NameAssignment_1 ) ) ;
    public final void rule__ViewOptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:863:1: ( ( ( rule__ViewOptions__NameAssignment_1 ) ) )
            // InternalDgen.g:864:1: ( ( rule__ViewOptions__NameAssignment_1 ) )
            {
            // InternalDgen.g:864:1: ( ( rule__ViewOptions__NameAssignment_1 ) )
            // InternalDgen.g:865:2: ( rule__ViewOptions__NameAssignment_1 )
            {
             before(grammarAccess.getViewOptionsAccess().getNameAssignment_1()); 
            // InternalDgen.g:866:2: ( rule__ViewOptions__NameAssignment_1 )
            // InternalDgen.g:866:3: rule__ViewOptions__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ViewOptions__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getViewOptionsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewOptions__Group__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalDgen.g:875:1: rule__Domainmodel__ElementsAssignment : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:879:1: ( ( ruleType ) )
            // InternalDgen.g:880:2: ( ruleType )
            {
            // InternalDgen.g:880:2: ( ruleType )
            // InternalDgen.g:881:3: ruleType
            {
             before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalDgen.g:890:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:894:1: ( ( RULE_ID ) )
            // InternalDgen.g:895:2: ( RULE_ID )
            {
            // InternalDgen.g:895:2: ( RULE_ID )
            // InternalDgen.g:896:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Entity__ViewsAssignment_0"
    // InternalDgen.g:905:1: rule__Entity__ViewsAssignment_0 : ( ruleViews ) ;
    public final void rule__Entity__ViewsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:909:1: ( ( ruleViews ) )
            // InternalDgen.g:910:2: ( ruleViews )
            {
            // InternalDgen.g:910:2: ( ruleViews )
            // InternalDgen.g:911:3: ruleViews
            {
             before(grammarAccess.getEntityAccess().getViewsViewsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleViews();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getViewsViewsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ViewsAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalDgen.g:920:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:924:1: ( ( RULE_ID ) )
            // InternalDgen.g:925:2: ( RULE_ID )
            {
            // InternalDgen.g:925:2: ( RULE_ID )
            // InternalDgen.g:926:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_3_1"
    // InternalDgen.g:935:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:939:1: ( ( ( RULE_ID ) ) )
            // InternalDgen.g:940:2: ( ( RULE_ID ) )
            {
            // InternalDgen.g:940:2: ( ( RULE_ID ) )
            // InternalDgen.g:941:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // InternalDgen.g:942:3: ( RULE_ID )
            // InternalDgen.g:943:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_5"
    // InternalDgen.g:954:1: rule__Entity__FeaturesAssignment_5 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:958:1: ( ( ruleFeature ) )
            // InternalDgen.g:959:2: ( ruleFeature )
            {
            // InternalDgen.g:959:2: ( ruleFeature )
            // InternalDgen.g:960:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_5"


    // $ANTLR start "rule__Feature__ManyAssignment_0"
    // InternalDgen.g:969:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:973:1: ( ( ( 'many' ) ) )
            // InternalDgen.g:974:2: ( ( 'many' ) )
            {
            // InternalDgen.g:974:2: ( ( 'many' ) )
            // InternalDgen.g:975:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // InternalDgen.g:976:3: ( 'many' )
            // InternalDgen.g:977:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ManyAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalDgen.g:988:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:992:1: ( ( RULE_ID ) )
            // InternalDgen.g:993:2: ( RULE_ID )
            {
            // InternalDgen.g:993:2: ( RULE_ID )
            // InternalDgen.g:994:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // InternalDgen.g:1003:1: rule__Feature__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:1007:1: ( ( ( RULE_ID ) ) )
            // InternalDgen.g:1008:2: ( ( RULE_ID ) )
            {
            // InternalDgen.g:1008:2: ( ( RULE_ID ) )
            // InternalDgen.g:1009:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            // InternalDgen.g:1010:3: ( RULE_ID )
            // InternalDgen.g:1011:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_3"


    // $ANTLR start "rule__ViewGroup__NameAssignment_1"
    // InternalDgen.g:1022:1: rule__ViewGroup__NameAssignment_1 : ( ( rule__ViewGroup__NameAlternatives_1_0 ) ) ;
    public final void rule__ViewGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:1026:1: ( ( ( rule__ViewGroup__NameAlternatives_1_0 ) ) )
            // InternalDgen.g:1027:2: ( ( rule__ViewGroup__NameAlternatives_1_0 ) )
            {
            // InternalDgen.g:1027:2: ( ( rule__ViewGroup__NameAlternatives_1_0 ) )
            // InternalDgen.g:1028:3: ( rule__ViewGroup__NameAlternatives_1_0 )
            {
             before(grammarAccess.getViewGroupAccess().getNameAlternatives_1_0()); 
            // InternalDgen.g:1029:3: ( rule__ViewGroup__NameAlternatives_1_0 )
            // InternalDgen.g:1029:4: rule__ViewGroup__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ViewGroup__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getViewGroupAccess().getNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewGroup__NameAssignment_1"


    // $ANTLR start "rule__ViewOptions__NameAssignment_1"
    // InternalDgen.g:1037:1: rule__ViewOptions__NameAssignment_1 : ( ( rule__ViewOptions__NameAlternatives_1_0 ) ) ;
    public final void rule__ViewOptions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:1041:1: ( ( ( rule__ViewOptions__NameAlternatives_1_0 ) ) )
            // InternalDgen.g:1042:2: ( ( rule__ViewOptions__NameAlternatives_1_0 ) )
            {
            // InternalDgen.g:1042:2: ( ( rule__ViewOptions__NameAlternatives_1_0 ) )
            // InternalDgen.g:1043:3: ( rule__ViewOptions__NameAlternatives_1_0 )
            {
             before(grammarAccess.getViewOptionsAccess().getNameAlternatives_1_0()); 
            // InternalDgen.g:1044:3: ( rule__ViewOptions__NameAlternatives_1_0 )
            // InternalDgen.g:1044:4: rule__ViewOptions__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ViewOptions__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getViewOptionsAccess().getNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewOptions__NameAssignment_1"


    // $ANTLR start "rule__Views__ViewGroupAssignment_0"
    // InternalDgen.g:1052:1: rule__Views__ViewGroupAssignment_0 : ( ruleViewGroup ) ;
    public final void rule__Views__ViewGroupAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:1056:1: ( ( ruleViewGroup ) )
            // InternalDgen.g:1057:2: ( ruleViewGroup )
            {
            // InternalDgen.g:1057:2: ( ruleViewGroup )
            // InternalDgen.g:1058:3: ruleViewGroup
            {
             before(grammarAccess.getViewsAccess().getViewGroupViewGroupParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleViewGroup();

            state._fsp--;

             after(grammarAccess.getViewsAccess().getViewGroupViewGroupParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Views__ViewGroupAssignment_0"


    // $ANTLR start "rule__Views__ViewOptionAssignment_1"
    // InternalDgen.g:1067:1: rule__Views__ViewOptionAssignment_1 : ( ruleViewOptions ) ;
    public final void rule__Views__ViewOptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDgen.g:1071:1: ( ( ruleViewOptions ) )
            // InternalDgen.g:1072:2: ( ruleViewOptions )
            {
            // InternalDgen.g:1072:2: ( ruleViewOptions )
            // InternalDgen.g:1073:3: ruleViewOptions
            {
             before(grammarAccess.getViewsAccess().getViewOptionViewOptionsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleViewOptions();

            state._fsp--;

             after(grammarAccess.getViewsAccess().getViewOptionViewOptionsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Views__ViewOptionAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000820002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000001E000L});

}
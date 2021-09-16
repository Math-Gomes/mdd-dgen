package org.xtext.mdd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mdd.services.DgenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDgenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "'entity'", "'extends'", "'{'", "'}'", "'many'", "'?'", "':'", "'@'", "'All'", "'None'", "'Create'", "'Read'", "'Update'", "'Delete'"
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
    public static final int T__25=25;
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

        public InternalDgenParser(TokenStream input, DgenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected DgenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalDgen.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalDgen.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalDgen.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalDgen.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalDgen.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalDgen.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalDgen.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDgen.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalDgen.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalDgen.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.mdd.Dgen.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalDgen.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDgen.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalDgen.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDgen.g:107:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalDgen.g:113:2: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // InternalDgen.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // InternalDgen.g:114:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDgen.g:115:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDgen.g:124:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalDgen.g:136:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDgen.g:136:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDgen.g:137:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDgen.g:143:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDgen.g:149:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDgen.g:150:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDgen.g:150:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDgen.g:151:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalDgen.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDgen.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDgen.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalDgen.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalDgen.g:177:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDgen.g:177:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDgen.g:178:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDgen.g:184:1: ruleEntity returns [EObject current=null] : ( ( (lv_views_0_0= ruleViews ) ) otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )+ otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_views_0_0 = null;

        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalDgen.g:190:2: ( ( ( (lv_views_0_0= ruleViews ) ) otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )+ otherlv_7= '}' ) )
            // InternalDgen.g:191:2: ( ( (lv_views_0_0= ruleViews ) ) otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )+ otherlv_7= '}' )
            {
            // InternalDgen.g:191:2: ( ( (lv_views_0_0= ruleViews ) ) otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )+ otherlv_7= '}' )
            // InternalDgen.g:192:3: ( (lv_views_0_0= ruleViews ) ) otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )+ otherlv_7= '}'
            {
            // InternalDgen.g:192:3: ( (lv_views_0_0= ruleViews ) )
            // InternalDgen.g:193:4: (lv_views_0_0= ruleViews )
            {
            // InternalDgen.g:193:4: (lv_views_0_0= ruleViews )
            // InternalDgen.g:194:5: lv_views_0_0= ruleViews
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getViewsViewsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_views_0_0=ruleViews();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"views",
            						lv_views_0_0,
            						"org.xtext.mdd.Dgen.Views");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalDgen.g:215:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDgen.g:216:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDgen.g:216:4: (lv_name_2_0= RULE_ID )
            // InternalDgen.g:217:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDgen.g:233:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDgen.g:234:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                    			
                    // InternalDgen.g:238:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDgen.g:239:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDgen.g:239:5: (otherlv_4= RULE_ID )
                    // InternalDgen.g:240:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDgen.g:256:3: ( (lv_features_6_0= ruleFeature ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDgen.g:257:4: (lv_features_6_0= ruleFeature )
            	    {
            	    // InternalDgen.g:257:4: (lv_features_6_0= ruleFeature )
            	    // InternalDgen.g:258:5: lv_features_6_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_features_6_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"org.xtext.mdd.Dgen.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalDgen.g:283:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalDgen.g:283:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalDgen.g:284:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalDgen.g:290:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token lv_optional_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDgen.g:296:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalDgen.g:297:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalDgen.g:297:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // InternalDgen.g:298:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_optional_2_0= '?' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            // InternalDgen.g:298:3: ( (lv_many_0_0= 'many' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDgen.g:299:4: (lv_many_0_0= 'many' )
                    {
                    // InternalDgen.g:299:4: (lv_many_0_0= 'many' )
                    // InternalDgen.g:300:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "many", lv_many_0_0 != null, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalDgen.g:312:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDgen.g:313:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDgen.g:313:4: (lv_name_1_0= RULE_ID )
            // InternalDgen.g:314:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDgen.g:330:3: ( (lv_optional_2_0= '?' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDgen.g:331:4: (lv_optional_2_0= '?' )
                    {
                    // InternalDgen.g:331:4: (lv_optional_2_0= '?' )
                    // InternalDgen.g:332:5: lv_optional_2_0= '?'
                    {
                    lv_optional_2_0=(Token)match(input,17,FOLLOW_11); 

                    					newLeafNode(lv_optional_2_0, grammarAccess.getFeatureAccess().getOptionalQuestionMarkKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_2_0 != null, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getColonKeyword_3());
            		
            // InternalDgen.g:348:3: ( (otherlv_4= RULE_ID ) )
            // InternalDgen.g:349:4: (otherlv_4= RULE_ID )
            {
            // InternalDgen.g:349:4: (otherlv_4= RULE_ID )
            // InternalDgen.g:350:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getTypeTypeCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleViewGroup"
    // InternalDgen.g:365:1: entryRuleViewGroup returns [EObject current=null] : iv_ruleViewGroup= ruleViewGroup EOF ;
    public final EObject entryRuleViewGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewGroup = null;


        try {
            // InternalDgen.g:365:50: (iv_ruleViewGroup= ruleViewGroup EOF )
            // InternalDgen.g:366:2: iv_ruleViewGroup= ruleViewGroup EOF
            {
             newCompositeNode(grammarAccess.getViewGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewGroup=ruleViewGroup();

            state._fsp--;

             current =iv_ruleViewGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewGroup"


    // $ANTLR start "ruleViewGroup"
    // InternalDgen.g:372:1: ruleViewGroup returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_name_1_1= 'All' | lv_name_1_2= 'None' ) ) ) ) ;
    public final EObject ruleViewGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;


        	enterRule();

        try {
            // InternalDgen.g:378:2: ( (otherlv_0= '@' ( ( (lv_name_1_1= 'All' | lv_name_1_2= 'None' ) ) ) ) )
            // InternalDgen.g:379:2: (otherlv_0= '@' ( ( (lv_name_1_1= 'All' | lv_name_1_2= 'None' ) ) ) )
            {
            // InternalDgen.g:379:2: (otherlv_0= '@' ( ( (lv_name_1_1= 'All' | lv_name_1_2= 'None' ) ) ) )
            // InternalDgen.g:380:3: otherlv_0= '@' ( ( (lv_name_1_1= 'All' | lv_name_1_2= 'None' ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getViewGroupAccess().getCommercialAtKeyword_0());
            		
            // InternalDgen.g:384:3: ( ( (lv_name_1_1= 'All' | lv_name_1_2= 'None' ) ) )
            // InternalDgen.g:385:4: ( (lv_name_1_1= 'All' | lv_name_1_2= 'None' ) )
            {
            // InternalDgen.g:385:4: ( (lv_name_1_1= 'All' | lv_name_1_2= 'None' ) )
            // InternalDgen.g:386:5: (lv_name_1_1= 'All' | lv_name_1_2= 'None' )
            {
            // InternalDgen.g:386:5: (lv_name_1_1= 'All' | lv_name_1_2= 'None' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDgen.g:387:6: lv_name_1_1= 'All'
                    {
                    lv_name_1_1=(Token)match(input,20,FOLLOW_2); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getViewGroupAccess().getNameAllKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getViewGroupRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDgen.g:398:6: lv_name_1_2= 'None'
                    {
                    lv_name_1_2=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getViewGroupAccess().getNameNoneKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getViewGroupRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewGroup"


    // $ANTLR start "entryRuleViewOptions"
    // InternalDgen.g:415:1: entryRuleViewOptions returns [EObject current=null] : iv_ruleViewOptions= ruleViewOptions EOF ;
    public final EObject entryRuleViewOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewOptions = null;


        try {
            // InternalDgen.g:415:52: (iv_ruleViewOptions= ruleViewOptions EOF )
            // InternalDgen.g:416:2: iv_ruleViewOptions= ruleViewOptions EOF
            {
             newCompositeNode(grammarAccess.getViewOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewOptions=ruleViewOptions();

            state._fsp--;

             current =iv_ruleViewOptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewOptions"


    // $ANTLR start "ruleViewOptions"
    // InternalDgen.g:422:1: ruleViewOptions returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_name_1_1= 'Create' | lv_name_1_2= 'Read' | lv_name_1_3= 'Update' | lv_name_1_4= 'Delete' ) ) ) ) ;
    public final EObject ruleViewOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token lv_name_1_4=null;


        	enterRule();

        try {
            // InternalDgen.g:428:2: ( (otherlv_0= '@' ( ( (lv_name_1_1= 'Create' | lv_name_1_2= 'Read' | lv_name_1_3= 'Update' | lv_name_1_4= 'Delete' ) ) ) ) )
            // InternalDgen.g:429:2: (otherlv_0= '@' ( ( (lv_name_1_1= 'Create' | lv_name_1_2= 'Read' | lv_name_1_3= 'Update' | lv_name_1_4= 'Delete' ) ) ) )
            {
            // InternalDgen.g:429:2: (otherlv_0= '@' ( ( (lv_name_1_1= 'Create' | lv_name_1_2= 'Read' | lv_name_1_3= 'Update' | lv_name_1_4= 'Delete' ) ) ) )
            // InternalDgen.g:430:3: otherlv_0= '@' ( ( (lv_name_1_1= 'Create' | lv_name_1_2= 'Read' | lv_name_1_3= 'Update' | lv_name_1_4= 'Delete' ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getViewOptionsAccess().getCommercialAtKeyword_0());
            		
            // InternalDgen.g:434:3: ( ( (lv_name_1_1= 'Create' | lv_name_1_2= 'Read' | lv_name_1_3= 'Update' | lv_name_1_4= 'Delete' ) ) )
            // InternalDgen.g:435:4: ( (lv_name_1_1= 'Create' | lv_name_1_2= 'Read' | lv_name_1_3= 'Update' | lv_name_1_4= 'Delete' ) )
            {
            // InternalDgen.g:435:4: ( (lv_name_1_1= 'Create' | lv_name_1_2= 'Read' | lv_name_1_3= 'Update' | lv_name_1_4= 'Delete' ) )
            // InternalDgen.g:436:5: (lv_name_1_1= 'Create' | lv_name_1_2= 'Read' | lv_name_1_3= 'Update' | lv_name_1_4= 'Delete' )
            {
            // InternalDgen.g:436:5: (lv_name_1_1= 'Create' | lv_name_1_2= 'Read' | lv_name_1_3= 'Update' | lv_name_1_4= 'Delete' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDgen.g:437:6: lv_name_1_1= 'Create'
                    {
                    lv_name_1_1=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getViewOptionsAccess().getNameCreateKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getViewOptionsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDgen.g:448:6: lv_name_1_2= 'Read'
                    {
                    lv_name_1_2=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getViewOptionsAccess().getNameReadKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getViewOptionsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalDgen.g:459:6: lv_name_1_3= 'Update'
                    {
                    lv_name_1_3=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_name_1_3, grammarAccess.getViewOptionsAccess().getNameUpdateKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getViewOptionsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalDgen.g:470:6: lv_name_1_4= 'Delete'
                    {
                    lv_name_1_4=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_name_1_4, grammarAccess.getViewOptionsAccess().getNameDeleteKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getViewOptionsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_4, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewOptions"


    // $ANTLR start "entryRuleViews"
    // InternalDgen.g:487:1: entryRuleViews returns [EObject current=null] : iv_ruleViews= ruleViews EOF ;
    public final EObject entryRuleViews() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViews = null;


        try {
            // InternalDgen.g:487:46: (iv_ruleViews= ruleViews EOF )
            // InternalDgen.g:488:2: iv_ruleViews= ruleViews EOF
            {
             newCompositeNode(grammarAccess.getViewsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViews=ruleViews();

            state._fsp--;

             current =iv_ruleViews; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViews"


    // $ANTLR start "ruleViews"
    // InternalDgen.g:494:1: ruleViews returns [EObject current=null] : ( ( (lv_viewGroup_0_0= ruleViewGroup ) ) | ( (lv_viewOption_1_0= ruleViewOptions ) )+ ) ;
    public final EObject ruleViews() throws RecognitionException {
        EObject current = null;

        EObject lv_viewGroup_0_0 = null;

        EObject lv_viewOption_1_0 = null;



        	enterRule();

        try {
            // InternalDgen.g:500:2: ( ( ( (lv_viewGroup_0_0= ruleViewGroup ) ) | ( (lv_viewOption_1_0= ruleViewOptions ) )+ ) )
            // InternalDgen.g:501:2: ( ( (lv_viewGroup_0_0= ruleViewGroup ) ) | ( (lv_viewOption_1_0= ruleViewOptions ) )+ )
            {
            // InternalDgen.g:501:2: ( ( (lv_viewGroup_0_0= ruleViewGroup ) ) | ( (lv_viewOption_1_0= ruleViewOptions ) )+ )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=22 && LA10_1<=25)) ) {
                    alt10=2;
                }
                else if ( ((LA10_1>=20 && LA10_1<=21)) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDgen.g:502:3: ( (lv_viewGroup_0_0= ruleViewGroup ) )
                    {
                    // InternalDgen.g:502:3: ( (lv_viewGroup_0_0= ruleViewGroup ) )
                    // InternalDgen.g:503:4: (lv_viewGroup_0_0= ruleViewGroup )
                    {
                    // InternalDgen.g:503:4: (lv_viewGroup_0_0= ruleViewGroup )
                    // InternalDgen.g:504:5: lv_viewGroup_0_0= ruleViewGroup
                    {

                    					newCompositeNode(grammarAccess.getViewsAccess().getViewGroupViewGroupParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_viewGroup_0_0=ruleViewGroup();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getViewsRule());
                    					}
                    					set(
                    						current,
                    						"viewGroup",
                    						lv_viewGroup_0_0,
                    						"org.xtext.mdd.Dgen.ViewGroup");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDgen.g:522:3: ( (lv_viewOption_1_0= ruleViewOptions ) )+
                    {
                    // InternalDgen.g:522:3: ( (lv_viewOption_1_0= ruleViewOptions ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDgen.g:523:4: (lv_viewOption_1_0= ruleViewOptions )
                    	    {
                    	    // InternalDgen.g:523:4: (lv_viewOption_1_0= ruleViewOptions )
                    	    // InternalDgen.g:524:5: lv_viewOption_1_0= ruleViewOptions
                    	    {

                    	    					newCompositeNode(grammarAccess.getViewsAccess().getViewOptionViewOptionsParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_3);
                    	    lv_viewOption_1_0=ruleViewOptions();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getViewsRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"viewOption",
                    	    						lv_viewOption_1_0,
                    	    						"org.xtext.mdd.Dgen.ViewOptions");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViews"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003C00000L});

}
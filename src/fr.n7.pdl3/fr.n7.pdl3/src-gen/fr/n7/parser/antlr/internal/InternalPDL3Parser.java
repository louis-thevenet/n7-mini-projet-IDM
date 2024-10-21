package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.PDL3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "':'", "'resources'", "'workdefinitions'", "'resourceusages'", "'worksequences'", "';'", "'='", "'f2s'", "'f2f'", "'s2s'", "'s2f'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDL3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL3.g"; }



     	private PDL3GrammarAccess grammarAccess;

        public InternalPDL3Parser(TokenStream input, PDL3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDL3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL3.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL3.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL3.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL3.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'resources' otherlv_4= ':' ( (lv_processElements_5_0= ruleResources ) )* otherlv_6= 'workdefinitions' otherlv_7= ':' ( (lv_processElements_8_0= ruleWorkDefinitions ) )* otherlv_9= 'resourceusages' otherlv_10= ':' ( (lv_processElements_11_0= ruleResourceUsages ) )* otherlv_12= 'worksequences' otherlv_13= ':' ( (lv_processElements_14_0= ruleWorkSequences ) )* ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_processElements_5_0 = null;

        EObject lv_processElements_8_0 = null;

        EObject lv_processElements_11_0 = null;

        EObject lv_processElements_14_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:78:2: ( (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'resources' otherlv_4= ':' ( (lv_processElements_5_0= ruleResources ) )* otherlv_6= 'workdefinitions' otherlv_7= ':' ( (lv_processElements_8_0= ruleWorkDefinitions ) )* otherlv_9= 'resourceusages' otherlv_10= ':' ( (lv_processElements_11_0= ruleResourceUsages ) )* otherlv_12= 'worksequences' otherlv_13= ':' ( (lv_processElements_14_0= ruleWorkSequences ) )* ) )
            // InternalPDL3.g:79:2: (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'resources' otherlv_4= ':' ( (lv_processElements_5_0= ruleResources ) )* otherlv_6= 'workdefinitions' otherlv_7= ':' ( (lv_processElements_8_0= ruleWorkDefinitions ) )* otherlv_9= 'resourceusages' otherlv_10= ':' ( (lv_processElements_11_0= ruleResourceUsages ) )* otherlv_12= 'worksequences' otherlv_13= ':' ( (lv_processElements_14_0= ruleWorkSequences ) )* )
            {
            // InternalPDL3.g:79:2: (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'resources' otherlv_4= ':' ( (lv_processElements_5_0= ruleResources ) )* otherlv_6= 'workdefinitions' otherlv_7= ':' ( (lv_processElements_8_0= ruleWorkDefinitions ) )* otherlv_9= 'resourceusages' otherlv_10= ':' ( (lv_processElements_11_0= ruleResourceUsages ) )* otherlv_12= 'worksequences' otherlv_13= ':' ( (lv_processElements_14_0= ruleWorkSequences ) )* )
            // InternalPDL3.g:80:3: otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'resources' otherlv_4= ':' ( (lv_processElements_5_0= ruleResources ) )* otherlv_6= 'workdefinitions' otherlv_7= ':' ( (lv_processElements_8_0= ruleWorkDefinitions ) )* otherlv_9= 'resourceusages' otherlv_10= ':' ( (lv_processElements_11_0= ruleResourceUsages ) )* otherlv_12= 'worksequences' otherlv_13= ':' ( (lv_processElements_14_0= ruleWorkSequences ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getColonKeyword_1());
            		
            // InternalPDL3.g:88:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPDL3.g:89:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPDL3.g:89:4: (lv_name_2_0= RULE_ID )
            // InternalPDL3.g:90:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getResourcesKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getColonKeyword_4());
            		
            // InternalPDL3.g:114:3: ( (lv_processElements_5_0= ruleResources ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL3.g:115:4: (lv_processElements_5_0= ruleResources )
            	    {
            	    // InternalPDL3.g:115:4: (lv_processElements_5_0= ruleResources )
            	    // InternalPDL3.g:116:5: lv_processElements_5_0= ruleResources
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsResourcesParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_processElements_5_0=ruleResources();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_5_0,
            	    						"fr.n7.PDL3.Resources");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getColonKeyword_7());
            		
            // InternalPDL3.g:141:3: ( (lv_processElements_8_0= ruleWorkDefinitions ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPDL3.g:142:4: (lv_processElements_8_0= ruleWorkDefinitions )
            	    {
            	    // InternalPDL3.g:142:4: (lv_processElements_8_0= ruleWorkDefinitions )
            	    // InternalPDL3.g:143:5: lv_processElements_8_0= ruleWorkDefinitions
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsWorkDefinitionsParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_processElements_8_0=ruleWorkDefinitions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_8_0,
            	    						"fr.n7.PDL3.WorkDefinitions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getResourceusagesKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getColonKeyword_10());
            		
            // InternalPDL3.g:168:3: ( (lv_processElements_11_0= ruleResourceUsages ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDL3.g:169:4: (lv_processElements_11_0= ruleResourceUsages )
            	    {
            	    // InternalPDL3.g:169:4: (lv_processElements_11_0= ruleResourceUsages )
            	    // InternalPDL3.g:170:5: lv_processElements_11_0= ruleResourceUsages
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsResourceUsagesParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_processElements_11_0=ruleResourceUsages();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_11_0,
            	    						"fr.n7.PDL3.ResourceUsages");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getWorksequencesKeyword_12());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getProcessAccess().getColonKeyword_13());
            		
            // InternalPDL3.g:195:3: ( (lv_processElements_14_0= ruleWorkSequences ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDL3.g:196:4: (lv_processElements_14_0= ruleWorkSequences )
            	    {
            	    // InternalPDL3.g:196:4: (lv_processElements_14_0= ruleWorkSequences )
            	    // InternalPDL3.g:197:5: lv_processElements_14_0= ruleWorkSequences
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsWorkSequencesParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_processElements_14_0=ruleWorkSequences();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_14_0,
            	    						"fr.n7.PDL3.WorkSequences");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleResourceUsages"
    // InternalPDL3.g:218:1: entryRuleResourceUsages returns [EObject current=null] : iv_ruleResourceUsages= ruleResourceUsages EOF ;
    public final EObject entryRuleResourceUsages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceUsages = null;


        try {
            // InternalPDL3.g:218:55: (iv_ruleResourceUsages= ruleResourceUsages EOF )
            // InternalPDL3.g:219:2: iv_ruleResourceUsages= ruleResourceUsages EOF
            {
             newCompositeNode(grammarAccess.getResourceUsagesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceUsages=ruleResourceUsages();

            state._fsp--;

             current =iv_ruleResourceUsages; 
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
    // $ANTLR end "entryRuleResourceUsages"


    // $ANTLR start "ruleResourceUsages"
    // InternalPDL3.g:225:1: ruleResourceUsages returns [EObject current=null] : (this_ResourceUsage_0= ruleResourceUsage otherlv_1= ';' ) ;
    public final EObject ruleResourceUsages() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ResourceUsage_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:231:2: ( (this_ResourceUsage_0= ruleResourceUsage otherlv_1= ';' ) )
            // InternalPDL3.g:232:2: (this_ResourceUsage_0= ruleResourceUsage otherlv_1= ';' )
            {
            // InternalPDL3.g:232:2: (this_ResourceUsage_0= ruleResourceUsage otherlv_1= ';' )
            // InternalPDL3.g:233:3: this_ResourceUsage_0= ruleResourceUsage otherlv_1= ';'
            {

            			newCompositeNode(grammarAccess.getResourceUsagesAccess().getResourceUsageParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_ResourceUsage_0=ruleResourceUsage();

            state._fsp--;


            			current = this_ResourceUsage_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceUsagesAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleResourceUsages"


    // $ANTLR start "entryRuleResourceUsage"
    // InternalPDL3.g:249:1: entryRuleResourceUsage returns [EObject current=null] : iv_ruleResourceUsage= ruleResourceUsage EOF ;
    public final EObject entryRuleResourceUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceUsage = null;


        try {
            // InternalPDL3.g:249:54: (iv_ruleResourceUsage= ruleResourceUsage EOF )
            // InternalPDL3.g:250:2: iv_ruleResourceUsage= ruleResourceUsage EOF
            {
             newCompositeNode(grammarAccess.getResourceUsageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceUsage=ruleResourceUsage();

            state._fsp--;

             current =iv_ruleResourceUsage; 
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
    // $ANTLR end "entryRuleResourceUsage"


    // $ANTLR start "ruleResourceUsage"
    // InternalPDL3.g:256:1: ruleResourceUsage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_needed_4_0= RULE_INT ) ) ) ;
    public final EObject ruleResourceUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_needed_4_0=null;


        	enterRule();

        try {
            // InternalPDL3.g:262:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_needed_4_0= RULE_INT ) ) ) )
            // InternalPDL3.g:263:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_needed_4_0= RULE_INT ) ) )
            {
            // InternalPDL3.g:263:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_needed_4_0= RULE_INT ) ) )
            // InternalPDL3.g:264:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_needed_4_0= RULE_INT ) )
            {
            // InternalPDL3.g:264:3: ( (otherlv_0= RULE_ID ) )
            // InternalPDL3.g:265:4: (otherlv_0= RULE_ID )
            {
            // InternalPDL3.g:265:4: (otherlv_0= RULE_ID )
            // InternalPDL3.g:266:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceUsageRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getResourceUsageAccess().getWorkDefinitionWorkDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceUsageAccess().getColonKeyword_1());
            		
            // InternalPDL3.g:281:3: ( (otherlv_2= RULE_ID ) )
            // InternalPDL3.g:282:4: (otherlv_2= RULE_ID )
            {
            // InternalPDL3.g:282:4: (otherlv_2= RULE_ID )
            // InternalPDL3.g:283:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceUsageRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getResourceUsageAccess().getResourceResourceCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceUsageAccess().getEqualsSignKeyword_3());
            		
            // InternalPDL3.g:298:3: ( (lv_needed_4_0= RULE_INT ) )
            // InternalPDL3.g:299:4: (lv_needed_4_0= RULE_INT )
            {
            // InternalPDL3.g:299:4: (lv_needed_4_0= RULE_INT )
            // InternalPDL3.g:300:5: lv_needed_4_0= RULE_INT
            {
            lv_needed_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_needed_4_0, grammarAccess.getResourceUsageAccess().getNeededINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceUsageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"needed",
            						lv_needed_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleResourceUsage"


    // $ANTLR start "entryRuleResources"
    // InternalPDL3.g:320:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // InternalPDL3.g:320:50: (iv_ruleResources= ruleResources EOF )
            // InternalPDL3.g:321:2: iv_ruleResources= ruleResources EOF
            {
             newCompositeNode(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResources=ruleResources();

            state._fsp--;

             current =iv_ruleResources; 
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
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalPDL3.g:327:1: ruleResources returns [EObject current=null] : (this_Resource_0= ruleResource otherlv_1= ';' ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Resource_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:333:2: ( (this_Resource_0= ruleResource otherlv_1= ';' ) )
            // InternalPDL3.g:334:2: (this_Resource_0= ruleResource otherlv_1= ';' )
            {
            // InternalPDL3.g:334:2: (this_Resource_0= ruleResource otherlv_1= ';' )
            // InternalPDL3.g:335:3: this_Resource_0= ruleResource otherlv_1= ';'
            {

            			newCompositeNode(grammarAccess.getResourcesAccess().getResourceParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Resource_0=ruleResource();

            state._fsp--;


            			current = this_Resource_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getResourcesAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleResource"
    // InternalPDL3.g:351:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalPDL3.g:351:49: (iv_ruleResource= ruleResource EOF )
            // InternalPDL3.g:352:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalPDL3.g:358:1: ruleResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_total_2_0= RULE_INT ) ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_total_2_0=null;


        	enterRule();

        try {
            // InternalPDL3.g:364:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_total_2_0= RULE_INT ) ) ) )
            // InternalPDL3.g:365:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_total_2_0= RULE_INT ) ) )
            {
            // InternalPDL3.g:365:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_total_2_0= RULE_INT ) ) )
            // InternalPDL3.g:366:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_total_2_0= RULE_INT ) )
            {
            // InternalPDL3.g:366:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPDL3.g:367:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPDL3.g:367:4: (lv_name_0_0= RULE_ID )
            // InternalPDL3.g:368:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getColonKeyword_1());
            		
            // InternalPDL3.g:388:3: ( (lv_total_2_0= RULE_INT ) )
            // InternalPDL3.g:389:4: (lv_total_2_0= RULE_INT )
            {
            // InternalPDL3.g:389:4: (lv_total_2_0= RULE_INT )
            // InternalPDL3.g:390:5: lv_total_2_0= RULE_INT
            {
            lv_total_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_total_2_0, grammarAccess.getResourceAccess().getTotalINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"total",
            						lv_total_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleWorkDefinitions"
    // InternalPDL3.g:410:1: entryRuleWorkDefinitions returns [EObject current=null] : iv_ruleWorkDefinitions= ruleWorkDefinitions EOF ;
    public final EObject entryRuleWorkDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinitions = null;


        try {
            // InternalPDL3.g:410:56: (iv_ruleWorkDefinitions= ruleWorkDefinitions EOF )
            // InternalPDL3.g:411:2: iv_ruleWorkDefinitions= ruleWorkDefinitions EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinitions=ruleWorkDefinitions();

            state._fsp--;

             current =iv_ruleWorkDefinitions; 
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
    // $ANTLR end "entryRuleWorkDefinitions"


    // $ANTLR start "ruleWorkDefinitions"
    // InternalPDL3.g:417:1: ruleWorkDefinitions returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition otherlv_1= ';' ) ;
    public final EObject ruleWorkDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_WorkDefinition_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:423:2: ( (this_WorkDefinition_0= ruleWorkDefinition otherlv_1= ';' ) )
            // InternalPDL3.g:424:2: (this_WorkDefinition_0= ruleWorkDefinition otherlv_1= ';' )
            {
            // InternalPDL3.g:424:2: (this_WorkDefinition_0= ruleWorkDefinition otherlv_1= ';' )
            // InternalPDL3.g:425:3: this_WorkDefinition_0= ruleWorkDefinition otherlv_1= ';'
            {

            			newCompositeNode(grammarAccess.getWorkDefinitionsAccess().getWorkDefinitionParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_WorkDefinition_0=ruleWorkDefinition();

            state._fsp--;


            			current = this_WorkDefinition_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkDefinitionsAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleWorkDefinitions"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL3.g:441:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL3.g:441:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL3.g:442:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL3.g:448:1: ruleWorkDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPDL3.g:454:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPDL3.g:455:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPDL3.g:455:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPDL3.g:456:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPDL3.g:456:3: (lv_name_0_0= RULE_ID )
            // InternalPDL3.g:457:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWorkDefinitionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequences"
    // InternalPDL3.g:476:1: entryRuleWorkSequences returns [EObject current=null] : iv_ruleWorkSequences= ruleWorkSequences EOF ;
    public final EObject entryRuleWorkSequences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequences = null;


        try {
            // InternalPDL3.g:476:54: (iv_ruleWorkSequences= ruleWorkSequences EOF )
            // InternalPDL3.g:477:2: iv_ruleWorkSequences= ruleWorkSequences EOF
            {
             newCompositeNode(grammarAccess.getWorkSequencesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequences=ruleWorkSequences();

            state._fsp--;

             current =iv_ruleWorkSequences; 
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
    // $ANTLR end "entryRuleWorkSequences"


    // $ANTLR start "ruleWorkSequences"
    // InternalPDL3.g:483:1: ruleWorkSequences returns [EObject current=null] : (this_WorkSequence_0= ruleWorkSequence otherlv_1= ';' ) ;
    public final EObject ruleWorkSequences() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_WorkSequence_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:489:2: ( (this_WorkSequence_0= ruleWorkSequence otherlv_1= ';' ) )
            // InternalPDL3.g:490:2: (this_WorkSequence_0= ruleWorkSequence otherlv_1= ';' )
            {
            // InternalPDL3.g:490:2: (this_WorkSequence_0= ruleWorkSequence otherlv_1= ';' )
            // InternalPDL3.g:491:3: this_WorkSequence_0= ruleWorkSequence otherlv_1= ';'
            {

            			newCompositeNode(grammarAccess.getWorkSequencesAccess().getWorkSequenceParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_WorkSequence_0=ruleWorkSequence();

            state._fsp--;


            			current = this_WorkSequence_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkSequencesAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleWorkSequences"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL3.g:507:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL3.g:507:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL3.g:508:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL3.g:514:1: ruleWorkSequence returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceKind ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:520:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceKind ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalPDL3.g:521:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceKind ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalPDL3.g:521:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceKind ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalPDL3.g:522:3: ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceKind ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalPDL3.g:522:3: ( (otherlv_0= RULE_ID ) )
            // InternalPDL3.g:523:4: (otherlv_0= RULE_ID )
            {
            // InternalPDL3.g:523:4: (otherlv_0= RULE_ID )
            // InternalPDL3.g:524:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getLinkToPredecessorWorkDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalPDL3.g:535:3: ( (lv_linkType_1_0= ruleWorkSequenceKind ) )
            // InternalPDL3.g:536:4: (lv_linkType_1_0= ruleWorkSequenceKind )
            {
            // InternalPDL3.g:536:4: (lv_linkType_1_0= ruleWorkSequenceKind )
            // InternalPDL3.g:537:5: lv_linkType_1_0= ruleWorkSequenceKind
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceKindEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_linkType_1_0=ruleWorkSequenceKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"fr.n7.PDL3.WorkSequenceKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL3.g:554:3: ( (otherlv_2= RULE_ID ) )
            // InternalPDL3.g:555:4: (otherlv_2= RULE_ID )
            {
            // InternalPDL3.g:555:4: (otherlv_2= RULE_ID )
            // InternalPDL3.g:556:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getLinkToSucessorWorkDefinitionCrossReference_2_0());
            				

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "ruleWorkSequenceKind"
    // InternalPDL3.g:571:1: ruleWorkSequenceKind returns [Enumerator current=null] : ( (enumLiteral_0= 'f2s' ) | (enumLiteral_1= 'f2f' ) | (enumLiteral_2= 's2s' ) | (enumLiteral_3= 's2f' ) ) ;
    public final Enumerator ruleWorkSequenceKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL3.g:577:2: ( ( (enumLiteral_0= 'f2s' ) | (enumLiteral_1= 'f2f' ) | (enumLiteral_2= 's2s' ) | (enumLiteral_3= 's2f' ) ) )
            // InternalPDL3.g:578:2: ( (enumLiteral_0= 'f2s' ) | (enumLiteral_1= 'f2f' ) | (enumLiteral_2= 's2s' ) | (enumLiteral_3= 's2f' ) )
            {
            // InternalPDL3.g:578:2: ( (enumLiteral_0= 'f2s' ) | (enumLiteral_1= 'f2f' ) | (enumLiteral_2= 's2s' ) | (enumLiteral_3= 's2f' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPDL3.g:579:3: (enumLiteral_0= 'f2s' )
                    {
                    // InternalPDL3.g:579:3: (enumLiteral_0= 'f2s' )
                    // InternalPDL3.g:580:4: enumLiteral_0= 'f2s'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceKindAccess().getFinishToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceKindAccess().getFinishToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL3.g:587:3: (enumLiteral_1= 'f2f' )
                    {
                    // InternalPDL3.g:587:3: (enumLiteral_1= 'f2f' )
                    // InternalPDL3.g:588:4: enumLiteral_1= 'f2f'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceKindAccess().getFinishToFinishEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceKindAccess().getFinishToFinishEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL3.g:595:3: (enumLiteral_2= 's2s' )
                    {
                    // InternalPDL3.g:595:3: (enumLiteral_2= 's2s' )
                    // InternalPDL3.g:596:4: enumLiteral_2= 's2s'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceKindAccess().getStartToStartEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceKindAccess().getStartToStartEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL3.g:603:3: (enumLiteral_3= 's2f' )
                    {
                    // InternalPDL3.g:603:3: (enumLiteral_3= 's2f' )
                    // InternalPDL3.g:604:4: enumLiteral_3= 's2f'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceKindAccess().getStartToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceKindAccess().getStartToFinishEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleWorkSequenceKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000780000L});

}
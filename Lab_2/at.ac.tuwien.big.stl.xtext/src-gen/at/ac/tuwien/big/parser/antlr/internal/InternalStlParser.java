package at.ac.tuwien.big.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.services.StlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'area'", "'item'", "'='", "'>'", "'service'", "'(cost='", "',reliability='", "',processingTime='", "')'", "'){'", "'input'", "':'", "'generator'", "'generates'", "'output'", "'productStore'", "',capacity='", "'wasteStore'", "'buffer'", "'conveyor'", "'machine'", "'turntable'", "'.'", "'-'", "'E'", "'e'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStl.g"; }



     	private StlGrammarAccess grammarAccess;

        public InternalStlParser(TokenStream input, StlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected StlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalStl.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalStl.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalStl.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalStl.g:71:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )* ( (lv_areas_4_0= ruleArea ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_itemTypes_3_0 = null;

        EObject lv_areas_4_0 = null;



        	enterRule();

        try {
            // InternalStl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )* ( (lv_areas_4_0= ruleArea ) )* otherlv_5= '}' ) )
            // InternalStl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )* ( (lv_areas_4_0= ruleArea ) )* otherlv_5= '}' )
            {
            // InternalStl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )* ( (lv_areas_4_0= ruleArea ) )* otherlv_5= '}' )
            // InternalStl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_itemTypes_3_0= ruleItemType ) )* ( (lv_areas_4_0= ruleArea ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
              		
            }
            // InternalStl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSystemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalStl.g:105:3: ( (lv_itemTypes_3_0= ruleItemType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStl.g:106:4: (lv_itemTypes_3_0= ruleItemType )
            	    {
            	    // InternalStl.g:106:4: (lv_itemTypes_3_0= ruleItemType )
            	    // InternalStl.g:107:5: lv_itemTypes_3_0= ruleItemType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSystemAccess().getItemTypesItemTypeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_itemTypes_3_0=ruleItemType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSystemRule());
            	      					}
            	      					add(
            	      						current,
            	      						"itemTypes",
            	      						lv_itemTypes_3_0,
            	      						"at.ac.tuwien.big.Stl.ItemType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalStl.g:124:3: ( (lv_areas_4_0= ruleArea ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStl.g:125:4: (lv_areas_4_0= ruleArea )
            	    {
            	    // InternalStl.g:125:4: (lv_areas_4_0= ruleArea )
            	    // InternalStl.g:126:5: lv_areas_4_0= ruleArea
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSystemAccess().getAreasAreaParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_areas_4_0=ruleArea();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSystemRule());
            	      					}
            	      					add(
            	      						current,
            	      						"areas",
            	      						lv_areas_4_0,
            	      						"at.ac.tuwien.big.Stl.Area");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleArea"
    // InternalStl.g:151:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalStl.g:151:45: (iv_ruleArea= ruleArea EOF )
            // InternalStl.g:152:2: iv_ruleArea= ruleArea EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAreaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArea=ruleArea();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArea; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalStl.g:158:1: ruleArea returns [EObject current=null] : (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' ) ;
    public final EObject ruleArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_components_3_0 = null;

        EObject lv_connectors_4_0 = null;



        	enterRule();

        try {
            // InternalStl.g:164:2: ( (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' ) )
            // InternalStl.g:165:2: (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' )
            {
            // InternalStl.g:165:2: (otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' )
            // InternalStl.g:166:3: otherlv_0= 'area' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAreaAccess().getAreaKeyword_0());
              		
            }
            // InternalStl.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAreaAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAreaRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAreaAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalStl.g:192:3: ( (lv_components_3_0= ruleComponent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26||LA3_0==29||(LA3_0>=31 && LA3_0<=35)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStl.g:193:4: (lv_components_3_0= ruleComponent )
            	    {
            	    // InternalStl.g:193:4: (lv_components_3_0= ruleComponent )
            	    // InternalStl.g:194:5: lv_components_3_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAreaAccess().getComponentsComponentParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAreaRule());
            	      					}
            	      					add(
            	      						current,
            	      						"components",
            	      						lv_components_3_0,
            	      						"at.ac.tuwien.big.Stl.Component");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalStl.g:211:3: ( (lv_connectors_4_0= ruleConnector ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStl.g:212:4: (lv_connectors_4_0= ruleConnector )
            	    {
            	    // InternalStl.g:212:4: (lv_connectors_4_0= ruleConnector )
            	    // InternalStl.g:213:5: lv_connectors_4_0= ruleConnector
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAreaAccess().getConnectorsConnectorParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_connectors_4_0=ruleConnector();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAreaRule());
            	      					}
            	      					add(
            	      						current,
            	      						"connectors",
            	      						lv_connectors_4_0,
            	      						"at.ac.tuwien.big.Stl.Connector");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAreaAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleItemType"
    // InternalStl.g:238:1: entryRuleItemType returns [EObject current=null] : iv_ruleItemType= ruleItemType EOF ;
    public final EObject entryRuleItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemType = null;


        try {
            // InternalStl.g:238:49: (iv_ruleItemType= ruleItemType EOF )
            // InternalStl.g:239:2: iv_ruleItemType= ruleItemType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItemTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleItemType=ruleItemType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItemType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // InternalStl.g:245:1: ruleItemType returns [EObject current=null] : (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= ruleEString ) ) ) ;
    public final EObject ruleItemType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalStl.g:251:2: ( (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= ruleEString ) ) ) )
            // InternalStl.g:252:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= ruleEString ) ) )
            {
            // InternalStl.g:252:2: (otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= ruleEString ) ) )
            // InternalStl.g:253:3: otherlv_0= 'item' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getItemTypeAccess().getItemKeyword_0());
              		
            }
            // InternalStl.g:257:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:258:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:258:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:259:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getItemTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getItemTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getItemTypeAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalStl.g:279:3: ( (lv_description_3_0= ruleEString ) )
            // InternalStl.g:280:4: (lv_description_3_0= ruleEString )
            {
            // InternalStl.g:280:4: (lv_description_3_0= ruleEString )
            // InternalStl.g:281:5: lv_description_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItemTypeAccess().getDescriptionEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_description_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getItemTypeRule());
              					}
              					set(
              						current,
              						"description",
              						lv_description_3_0,
              						"at.ac.tuwien.big.Stl.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleConnector"
    // InternalStl.g:302:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalStl.g:302:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalStl.g:303:2: iv_ruleConnector= ruleConnector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalStl.g:309:1: ruleConnector returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '>' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalStl.g:315:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '>' ( ( ruleQualifiedName ) ) ) )
            // InternalStl.g:316:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '>' ( ( ruleQualifiedName ) ) )
            {
            // InternalStl.g:316:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '>' ( ( ruleQualifiedName ) ) )
            // InternalStl.g:317:3: ( ( ruleQualifiedName ) ) otherlv_1= '>' ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:317:3: ( ( ruleQualifiedName ) )
            // InternalStl.g:318:4: ( ruleQualifiedName )
            {
            // InternalStl.g:318:4: ( ruleQualifiedName )
            // InternalStl.g:319:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectorAccess().getEntrySlotCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConnectorAccess().getGreaterThanSignKeyword_1());
              		
            }
            // InternalStl.g:337:3: ( ( ruleQualifiedName ) )
            // InternalStl.g:338:4: ( ruleQualifiedName )
            {
            // InternalStl.g:338:4: ( ruleQualifiedName )
            // InternalStl.g:339:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConnectorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConnectorAccess().getExitSlotCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleComponent"
    // InternalStl.g:357:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalStl.g:357:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalStl.g:358:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalStl.g:364:1: ruleComponent returns [EObject current=null] : (this_ItemGenerator_0= ruleItemGenerator | this_Store_1= ruleStore | this_Buffer_2= ruleBuffer | this_Conveyor_3= ruleConveyor | this_Machine_4= ruleMachine | this_TurnTable_5= ruleTurnTable ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_ItemGenerator_0 = null;

        EObject this_Store_1 = null;

        EObject this_Buffer_2 = null;

        EObject this_Conveyor_3 = null;

        EObject this_Machine_4 = null;

        EObject this_TurnTable_5 = null;



        	enterRule();

        try {
            // InternalStl.g:370:2: ( (this_ItemGenerator_0= ruleItemGenerator | this_Store_1= ruleStore | this_Buffer_2= ruleBuffer | this_Conveyor_3= ruleConveyor | this_Machine_4= ruleMachine | this_TurnTable_5= ruleTurnTable ) )
            // InternalStl.g:371:2: (this_ItemGenerator_0= ruleItemGenerator | this_Store_1= ruleStore | this_Buffer_2= ruleBuffer | this_Conveyor_3= ruleConveyor | this_Machine_4= ruleMachine | this_TurnTable_5= ruleTurnTable )
            {
            // InternalStl.g:371:2: (this_ItemGenerator_0= ruleItemGenerator | this_Store_1= ruleStore | this_Buffer_2= ruleBuffer | this_Conveyor_3= ruleConveyor | this_Machine_4= ruleMachine | this_TurnTable_5= ruleTurnTable )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 29:
            case 31:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            case 33:
                {
                alt5=4;
                }
                break;
            case 34:
                {
                alt5=5;
                }
                break;
            case 35:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalStl.g:372:3: this_ItemGenerator_0= ruleItemGenerator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getItemGeneratorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ItemGenerator_0=ruleItemGenerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ItemGenerator_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStl.g:381:3: this_Store_1= ruleStore
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getStoreParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Store_1=ruleStore();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Store_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalStl.g:390:3: this_Buffer_2= ruleBuffer
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getBufferParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Buffer_2=ruleBuffer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Buffer_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalStl.g:399:3: this_Conveyor_3= ruleConveyor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getConveyorParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Conveyor_3=ruleConveyor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Conveyor_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalStl.g:408:3: this_Machine_4= ruleMachine
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getMachineParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Machine_4=ruleMachine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Machine_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalStl.g:417:3: this_TurnTable_5= ruleTurnTable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComponentAccess().getTurnTableParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TurnTable_5=ruleTurnTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TurnTable_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleService"
    // InternalStl.g:429:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalStl.g:429:48: (iv_ruleService= ruleService EOF )
            // InternalStl.g:430:2: iv_ruleService= ruleService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleService; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalStl.g:436:1: ruleService returns [EObject current=null] : ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= ruleEInt ) ) otherlv_8= ')' ) | (otherlv_9= 'service' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(cost=' ( (lv_cost_12_0= ruleEInt ) ) otherlv_13= ',reliability=' ( (lv_reliability_14_0= ruleEDouble ) ) otherlv_15= ',processingTime=' ( (lv_processingTime_16_0= ruleEInt ) ) otherlv_17= '){' ( (lv_parameters_18_0= ruleParameter ) )+ otherlv_19= '}' ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_cost_3_0 = null;

        AntlrDatatypeRuleToken lv_reliability_5_0 = null;

        AntlrDatatypeRuleToken lv_processingTime_7_0 = null;

        AntlrDatatypeRuleToken lv_cost_12_0 = null;

        AntlrDatatypeRuleToken lv_reliability_14_0 = null;

        AntlrDatatypeRuleToken lv_processingTime_16_0 = null;

        EObject lv_parameters_18_0 = null;



        	enterRule();

        try {
            // InternalStl.g:442:2: ( ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= ruleEInt ) ) otherlv_8= ')' ) | (otherlv_9= 'service' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(cost=' ( (lv_cost_12_0= ruleEInt ) ) otherlv_13= ',reliability=' ( (lv_reliability_14_0= ruleEDouble ) ) otherlv_15= ',processingTime=' ( (lv_processingTime_16_0= ruleEInt ) ) otherlv_17= '){' ( (lv_parameters_18_0= ruleParameter ) )+ otherlv_19= '}' ) ) )
            // InternalStl.g:443:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= ruleEInt ) ) otherlv_8= ')' ) | (otherlv_9= 'service' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(cost=' ( (lv_cost_12_0= ruleEInt ) ) otherlv_13= ',reliability=' ( (lv_reliability_14_0= ruleEDouble ) ) otherlv_15= ',processingTime=' ( (lv_processingTime_16_0= ruleEInt ) ) otherlv_17= '){' ( (lv_parameters_18_0= ruleParameter ) )+ otherlv_19= '}' ) )
            {
            // InternalStl.g:443:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= ruleEInt ) ) otherlv_8= ')' ) | (otherlv_9= 'service' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(cost=' ( (lv_cost_12_0= ruleEInt ) ) otherlv_13= ',reliability=' ( (lv_reliability_14_0= ruleEDouble ) ) otherlv_15= ',processingTime=' ( (lv_processingTime_16_0= ruleEInt ) ) otherlv_17= '){' ( (lv_parameters_18_0= ruleParameter ) )+ otherlv_19= '}' ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalStl.g:444:3: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= ruleEInt ) ) otherlv_8= ')' )
                    {
                    // InternalStl.g:444:3: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= ruleEInt ) ) otherlv_8= ')' )
                    // InternalStl.g:445:4: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= ruleEInt ) ) otherlv_8= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0_0());
                      			
                    }
                    // InternalStl.g:449:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalStl.g:450:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalStl.g:450:5: (lv_name_1_0= RULE_ID )
                    // InternalStl.g:451:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getServiceRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getCostKeyword_0_2());
                      			
                    }
                    // InternalStl.g:471:4: ( (lv_cost_3_0= ruleEInt ) )
                    // InternalStl.g:472:5: (lv_cost_3_0= ruleEInt )
                    {
                    // InternalStl.g:472:5: (lv_cost_3_0= ruleEInt )
                    // InternalStl.g:473:6: lv_cost_3_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getServiceAccess().getCostEIntParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_cost_3_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getServiceRule());
                      						}
                      						set(
                      							current,
                      							"cost",
                      							lv_cost_3_0,
                      							"at.ac.tuwien.big.Stl.EInt");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getReliabilityKeyword_0_4());
                      			
                    }
                    // InternalStl.g:494:4: ( (lv_reliability_5_0= ruleEDouble ) )
                    // InternalStl.g:495:5: (lv_reliability_5_0= ruleEDouble )
                    {
                    // InternalStl.g:495:5: (lv_reliability_5_0= ruleEDouble )
                    // InternalStl.g:496:6: lv_reliability_5_0= ruleEDouble
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_0_5_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_reliability_5_0=ruleEDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getServiceRule());
                      						}
                      						set(
                      							current,
                      							"reliability",
                      							lv_reliability_5_0,
                      							"at.ac.tuwien.big.Stl.EDouble");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getProcessingTimeKeyword_0_6());
                      			
                    }
                    // InternalStl.g:517:4: ( (lv_processingTime_7_0= ruleEInt ) )
                    // InternalStl.g:518:5: (lv_processingTime_7_0= ruleEInt )
                    {
                    // InternalStl.g:518:5: (lv_processingTime_7_0= ruleEInt )
                    // InternalStl.g:519:6: lv_processingTime_7_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getServiceAccess().getProcessingTimeEIntParserRuleCall_0_7_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_processingTime_7_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getServiceRule());
                      						}
                      						set(
                      							current,
                      							"processingTime",
                      							lv_processingTime_7_0,
                      							"at.ac.tuwien.big.Stl.EInt");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getRightParenthesisKeyword_0_8());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalStl.g:542:3: (otherlv_9= 'service' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(cost=' ( (lv_cost_12_0= ruleEInt ) ) otherlv_13= ',reliability=' ( (lv_reliability_14_0= ruleEDouble ) ) otherlv_15= ',processingTime=' ( (lv_processingTime_16_0= ruleEInt ) ) otherlv_17= '){' ( (lv_parameters_18_0= ruleParameter ) )+ otherlv_19= '}' )
                    {
                    // InternalStl.g:542:3: (otherlv_9= 'service' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(cost=' ( (lv_cost_12_0= ruleEInt ) ) otherlv_13= ',reliability=' ( (lv_reliability_14_0= ruleEDouble ) ) otherlv_15= ',processingTime=' ( (lv_processingTime_16_0= ruleEInt ) ) otherlv_17= '){' ( (lv_parameters_18_0= ruleParameter ) )+ otherlv_19= '}' )
                    // InternalStl.g:543:4: otherlv_9= 'service' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(cost=' ( (lv_cost_12_0= ruleEInt ) ) otherlv_13= ',reliability=' ( (lv_reliability_14_0= ruleEDouble ) ) otherlv_15= ',processingTime=' ( (lv_processingTime_16_0= ruleEInt ) ) otherlv_17= '){' ( (lv_parameters_18_0= ruleParameter ) )+ otherlv_19= '}'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getServiceKeyword_1_0());
                      			
                    }
                    // InternalStl.g:547:4: ( (lv_name_10_0= RULE_ID ) )
                    // InternalStl.g:548:5: (lv_name_10_0= RULE_ID )
                    {
                    // InternalStl.g:548:5: (lv_name_10_0= RULE_ID )
                    // InternalStl.g:549:6: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_10_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getServiceRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_10_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getCostKeyword_1_2());
                      			
                    }
                    // InternalStl.g:569:4: ( (lv_cost_12_0= ruleEInt ) )
                    // InternalStl.g:570:5: (lv_cost_12_0= ruleEInt )
                    {
                    // InternalStl.g:570:5: (lv_cost_12_0= ruleEInt )
                    // InternalStl.g:571:6: lv_cost_12_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getServiceAccess().getCostEIntParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_cost_12_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getServiceRule());
                      						}
                      						set(
                      							current,
                      							"cost",
                      							lv_cost_12_0,
                      							"at.ac.tuwien.big.Stl.EInt");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getReliabilityKeyword_1_4());
                      			
                    }
                    // InternalStl.g:592:4: ( (lv_reliability_14_0= ruleEDouble ) )
                    // InternalStl.g:593:5: (lv_reliability_14_0= ruleEDouble )
                    {
                    // InternalStl.g:593:5: (lv_reliability_14_0= ruleEDouble )
                    // InternalStl.g:594:6: lv_reliability_14_0= ruleEDouble
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getServiceAccess().getReliabilityEDoubleParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_reliability_14_0=ruleEDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getServiceRule());
                      						}
                      						set(
                      							current,
                      							"reliability",
                      							lv_reliability_14_0,
                      							"at.ac.tuwien.big.Stl.EDouble");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getProcessingTimeKeyword_1_6());
                      			
                    }
                    // InternalStl.g:615:4: ( (lv_processingTime_16_0= ruleEInt ) )
                    // InternalStl.g:616:5: (lv_processingTime_16_0= ruleEInt )
                    {
                    // InternalStl.g:616:5: (lv_processingTime_16_0= ruleEInt )
                    // InternalStl.g:617:6: lv_processingTime_16_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getServiceAccess().getProcessingTimeEIntParserRuleCall_1_7_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_processingTime_16_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getServiceRule());
                      						}
                      						set(
                      							current,
                      							"processingTime",
                      							lv_processingTime_16_0,
                      							"at.ac.tuwien.big.Stl.EInt");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getServiceAccess().getRightParenthesisLeftCurlyBracketKeyword_1_8());
                      			
                    }
                    // InternalStl.g:638:4: ( (lv_parameters_18_0= ruleParameter ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalStl.g:639:5: (lv_parameters_18_0= ruleParameter )
                    	    {
                    	    // InternalStl.g:639:5: (lv_parameters_18_0= ruleParameter )
                    	    // InternalStl.g:640:6: lv_parameters_18_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getServiceAccess().getParametersParameterParserRuleCall_1_9_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_parameters_18_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getServiceRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"parameters",
                    	      							lv_parameters_18_0,
                    	      							"at.ac.tuwien.big.Stl.Parameter");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    otherlv_19=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_1_10());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleParameter"
    // InternalStl.g:666:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalStl.g:666:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalStl.g:667:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalStl.g:673:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStl.g:679:2: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStl.g:680:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStl.g:680:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStl.g:681:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getInputKeyword_0());
              		
            }
            // InternalStl.g:685:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:686:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:686:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:687:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSlot"
    // InternalStl.g:707:1: entryRuleSlot returns [EObject current=null] : iv_ruleSlot= ruleSlot EOF ;
    public final EObject entryRuleSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlot = null;


        try {
            // InternalStl.g:707:45: (iv_ruleSlot= ruleSlot EOF )
            // InternalStl.g:708:2: iv_ruleSlot= ruleSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSlotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSlot=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSlot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSlot"


    // $ANTLR start "ruleSlot"
    // InternalStl.g:714:1: ruleSlot returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSlot() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalStl.g:720:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalStl.g:721:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalStl.g:721:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalStl.g:722:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalStl.g:722:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalStl.g:723:4: (lv_name_0_0= RULE_ID )
            {
            // InternalStl.g:723:4: (lv_name_0_0= RULE_ID )
            // InternalStl.g:724:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getSlotAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSlotRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSlotAccess().getColonKeyword_1());
              		
            }
            // InternalStl.g:744:3: ( ( ruleQualifiedName ) )
            // InternalStl.g:745:4: ( ruleQualifiedName )
            {
            // InternalStl.g:745:4: ( ruleQualifiedName )
            // InternalStl.g:746:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSlotRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSlotAccess().getRequiredTypeItemTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSlot"


    // $ANTLR start "entryRuleItemGenerator"
    // InternalStl.g:764:1: entryRuleItemGenerator returns [EObject current=null] : iv_ruleItemGenerator= ruleItemGenerator EOF ;
    public final EObject entryRuleItemGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemGenerator = null;


        try {
            // InternalStl.g:764:54: (iv_ruleItemGenerator= ruleItemGenerator EOF )
            // InternalStl.g:765:2: iv_ruleItemGenerator= ruleItemGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItemGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleItemGenerator=ruleItemGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItemGenerator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleItemGenerator"


    // $ANTLR start "ruleItemGenerator"
    // InternalStl.g:771:1: ruleItemGenerator returns [EObject current=null] : (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'generates' ( ( ruleQualifiedName ) ) otherlv_4= '(cost=' ( (lv_cost_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) ;
    public final EObject ruleItemGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_cost_5_0 = null;

        EObject lv_outputSlots_8_0 = null;

        EObject lv_services_9_0 = null;



        	enterRule();

        try {
            // InternalStl.g:777:2: ( (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'generates' ( ( ruleQualifiedName ) ) otherlv_4= '(cost=' ( (lv_cost_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) )
            // InternalStl.g:778:2: (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'generates' ( ( ruleQualifiedName ) ) otherlv_4= '(cost=' ( (lv_cost_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            {
            // InternalStl.g:778:2: (otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'generates' ( ( ruleQualifiedName ) ) otherlv_4= '(cost=' ( (lv_cost_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            // InternalStl.g:779:3: otherlv_0= 'generator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'generates' ( ( ruleQualifiedName ) ) otherlv_4= '(cost=' ( (lv_cost_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getItemGeneratorAccess().getGeneratorKeyword_0());
              		
            }
            // InternalStl.g:783:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:784:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:784:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:785:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getItemGeneratorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getItemGeneratorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getItemGeneratorAccess().getGeneratesKeyword_2());
              		
            }
            // InternalStl.g:805:3: ( ( ruleQualifiedName ) )
            // InternalStl.g:806:4: ( ruleQualifiedName )
            {
            // InternalStl.g:806:4: ( ruleQualifiedName )
            // InternalStl.g:807:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getItemGeneratorRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItemGeneratorAccess().getGeneratedTypeItemTypeCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getItemGeneratorAccess().getCostKeyword_4());
              		
            }
            // InternalStl.g:825:3: ( (lv_cost_5_0= ruleEInt ) )
            // InternalStl.g:826:4: (lv_cost_5_0= ruleEInt )
            {
            // InternalStl.g:826:4: (lv_cost_5_0= ruleEInt )
            // InternalStl.g:827:5: lv_cost_5_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItemGeneratorAccess().getCostEIntParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_cost_5_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getItemGeneratorRule());
              					}
              					set(
              						current,
              						"cost",
              						lv_cost_5_0,
              						"at.ac.tuwien.big.Stl.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getItemGeneratorAccess().getRightParenthesisLeftCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getItemGeneratorAccess().getOutputKeyword_7());
              		
            }
            // InternalStl.g:852:3: ( (lv_outputSlots_8_0= ruleSlot ) )
            // InternalStl.g:853:4: (lv_outputSlots_8_0= ruleSlot )
            {
            // InternalStl.g:853:4: (lv_outputSlots_8_0= ruleSlot )
            // InternalStl.g:854:5: lv_outputSlots_8_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItemGeneratorAccess().getOutputSlotsSlotParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_outputSlots_8_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getItemGeneratorRule());
              					}
              					add(
              						current,
              						"outputSlots",
              						lv_outputSlots_8_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStl.g:871:3: ( (lv_services_9_0= ruleService ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStl.g:872:4: (lv_services_9_0= ruleService )
            	    {
            	    // InternalStl.g:872:4: (lv_services_9_0= ruleService )
            	    // InternalStl.g:873:5: lv_services_9_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getItemGeneratorAccess().getServicesServiceParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_services_9_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getItemGeneratorRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_9_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getItemGeneratorAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleItemGenerator"


    // $ANTLR start "entryRuleStore"
    // InternalStl.g:898:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalStl.g:898:46: (iv_ruleStore= ruleStore EOF )
            // InternalStl.g:899:2: iv_ruleStore= ruleStore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStore; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalStl.g:905:1: ruleStore returns [EObject current=null] : (this_ProductStore_0= ruleProductStore | this_WasteStore_1= ruleWasteStore ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        EObject this_ProductStore_0 = null;

        EObject this_WasteStore_1 = null;



        	enterRule();

        try {
            // InternalStl.g:911:2: ( (this_ProductStore_0= ruleProductStore | this_WasteStore_1= ruleWasteStore ) )
            // InternalStl.g:912:2: (this_ProductStore_0= ruleProductStore | this_WasteStore_1= ruleWasteStore )
            {
            // InternalStl.g:912:2: (this_ProductStore_0= ruleProductStore | this_WasteStore_1= ruleWasteStore )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalStl.g:913:3: this_ProductStore_0= ruleProductStore
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStoreAccess().getProductStoreParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProductStore_0=ruleProductStore();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProductStore_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStl.g:922:3: this_WasteStore_1= ruleWasteStore
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStoreAccess().getWasteStoreParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WasteStore_1=ruleWasteStore();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WasteStore_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleProductStore"
    // InternalStl.g:934:1: entryRuleProductStore returns [EObject current=null] : iv_ruleProductStore= ruleProductStore EOF ;
    public final EObject entryRuleProductStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductStore = null;


        try {
            // InternalStl.g:934:53: (iv_ruleProductStore= ruleProductStore EOF )
            // InternalStl.g:935:2: iv_ruleProductStore= ruleProductStore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProductStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProductStore=ruleProductStore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProductStore; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProductStore"


    // $ANTLR start "ruleProductStore"
    // InternalStl.g:941:1: ruleProductStore returns [EObject current=null] : (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'input' ( (lv_inputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) ;
    public final EObject ruleProductStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_cost_3_0 = null;

        AntlrDatatypeRuleToken lv_capacity_5_0 = null;

        EObject lv_inputSlots_8_0 = null;

        EObject lv_services_9_0 = null;



        	enterRule();

        try {
            // InternalStl.g:947:2: ( (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'input' ( (lv_inputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) )
            // InternalStl.g:948:2: (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'input' ( (lv_inputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            {
            // InternalStl.g:948:2: (otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'input' ( (lv_inputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            // InternalStl.g:949:3: otherlv_0= 'productStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'input' ( (lv_inputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProductStoreAccess().getProductStoreKeyword_0());
              		
            }
            // InternalStl.g:953:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:954:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:954:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:955:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProductStoreAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProductStoreRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProductStoreAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:975:3: ( (lv_cost_3_0= ruleEInt ) )
            // InternalStl.g:976:4: (lv_cost_3_0= ruleEInt )
            {
            // InternalStl.g:976:4: (lv_cost_3_0= ruleEInt )
            // InternalStl.g:977:5: lv_cost_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductStoreAccess().getCostEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_cost_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductStoreRule());
              					}
              					set(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"at.ac.tuwien.big.Stl.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProductStoreAccess().getCapacityKeyword_4());
              		
            }
            // InternalStl.g:998:3: ( (lv_capacity_5_0= ruleEInt ) )
            // InternalStl.g:999:4: (lv_capacity_5_0= ruleEInt )
            {
            // InternalStl.g:999:4: (lv_capacity_5_0= ruleEInt )
            // InternalStl.g:1000:5: lv_capacity_5_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductStoreAccess().getCapacityEIntParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_capacity_5_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductStoreRule());
              					}
              					set(
              						current,
              						"capacity",
              						lv_capacity_5_0,
              						"at.ac.tuwien.big.Stl.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getProductStoreAccess().getRightParenthesisLeftCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getProductStoreAccess().getInputKeyword_7());
              		
            }
            // InternalStl.g:1025:3: ( (lv_inputSlots_8_0= ruleSlot ) )
            // InternalStl.g:1026:4: (lv_inputSlots_8_0= ruleSlot )
            {
            // InternalStl.g:1026:4: (lv_inputSlots_8_0= ruleSlot )
            // InternalStl.g:1027:5: lv_inputSlots_8_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProductStoreAccess().getInputSlotsSlotParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_inputSlots_8_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProductStoreRule());
              					}
              					add(
              						current,
              						"inputSlots",
              						lv_inputSlots_8_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStl.g:1044:3: ( (lv_services_9_0= ruleService ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalStl.g:1045:4: (lv_services_9_0= ruleService )
            	    {
            	    // InternalStl.g:1045:4: (lv_services_9_0= ruleService )
            	    // InternalStl.g:1046:5: lv_services_9_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProductStoreAccess().getServicesServiceParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_services_9_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProductStoreRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_9_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getProductStoreAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProductStore"


    // $ANTLR start "entryRuleWasteStore"
    // InternalStl.g:1071:1: entryRuleWasteStore returns [EObject current=null] : iv_ruleWasteStore= ruleWasteStore EOF ;
    public final EObject entryRuleWasteStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWasteStore = null;


        try {
            // InternalStl.g:1071:51: (iv_ruleWasteStore= ruleWasteStore EOF )
            // InternalStl.g:1072:2: iv_ruleWasteStore= ruleWasteStore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWasteStoreRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWasteStore=ruleWasteStore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWasteStore; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWasteStore"


    // $ANTLR start "ruleWasteStore"
    // InternalStl.g:1078:1: ruleWasteStore returns [EObject current=null] : (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'input' ( (lv_inputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) ;
    public final EObject ruleWasteStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_cost_3_0 = null;

        AntlrDatatypeRuleToken lv_capacity_5_0 = null;

        EObject lv_inputSlots_8_0 = null;

        EObject lv_services_9_0 = null;



        	enterRule();

        try {
            // InternalStl.g:1084:2: ( (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'input' ( (lv_inputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) )
            // InternalStl.g:1085:2: (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'input' ( (lv_inputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            {
            // InternalStl.g:1085:2: (otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'input' ( (lv_inputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            // InternalStl.g:1086:3: otherlv_0= 'wasteStore' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',capacity=' ( (lv_capacity_5_0= ruleEInt ) ) otherlv_6= '){' otherlv_7= 'input' ( (lv_inputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWasteStoreAccess().getWasteStoreKeyword_0());
              		
            }
            // InternalStl.g:1090:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1091:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1091:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1092:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getWasteStoreAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWasteStoreRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWasteStoreAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:1112:3: ( (lv_cost_3_0= ruleEInt ) )
            // InternalStl.g:1113:4: (lv_cost_3_0= ruleEInt )
            {
            // InternalStl.g:1113:4: (lv_cost_3_0= ruleEInt )
            // InternalStl.g:1114:5: lv_cost_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWasteStoreAccess().getCostEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_cost_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWasteStoreRule());
              					}
              					set(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"at.ac.tuwien.big.Stl.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWasteStoreAccess().getCapacityKeyword_4());
              		
            }
            // InternalStl.g:1135:3: ( (lv_capacity_5_0= ruleEInt ) )
            // InternalStl.g:1136:4: (lv_capacity_5_0= ruleEInt )
            {
            // InternalStl.g:1136:4: (lv_capacity_5_0= ruleEInt )
            // InternalStl.g:1137:5: lv_capacity_5_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWasteStoreAccess().getCapacityEIntParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_capacity_5_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWasteStoreRule());
              					}
              					set(
              						current,
              						"capacity",
              						lv_capacity_5_0,
              						"at.ac.tuwien.big.Stl.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getWasteStoreAccess().getRightParenthesisLeftCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getWasteStoreAccess().getInputKeyword_7());
              		
            }
            // InternalStl.g:1162:3: ( (lv_inputSlots_8_0= ruleSlot ) )
            // InternalStl.g:1163:4: (lv_inputSlots_8_0= ruleSlot )
            {
            // InternalStl.g:1163:4: (lv_inputSlots_8_0= ruleSlot )
            // InternalStl.g:1164:5: lv_inputSlots_8_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWasteStoreAccess().getInputSlotsSlotParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_inputSlots_8_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWasteStoreRule());
              					}
              					add(
              						current,
              						"inputSlots",
              						lv_inputSlots_8_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStl.g:1181:3: ( (lv_services_9_0= ruleService ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStl.g:1182:4: (lv_services_9_0= ruleService )
            	    {
            	    // InternalStl.g:1182:4: (lv_services_9_0= ruleService )
            	    // InternalStl.g:1183:5: lv_services_9_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWasteStoreAccess().getServicesServiceParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_services_9_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWasteStoreRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_9_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getWasteStoreAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWasteStore"


    // $ANTLR start "entryRuleBuffer"
    // InternalStl.g:1208:1: entryRuleBuffer returns [EObject current=null] : iv_ruleBuffer= ruleBuffer EOF ;
    public final EObject entryRuleBuffer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuffer = null;


        try {
            // InternalStl.g:1208:47: (iv_ruleBuffer= ruleBuffer EOF )
            // InternalStl.g:1209:2: iv_ruleBuffer= ruleBuffer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBufferRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBuffer=ruleBuffer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuffer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBuffer"


    // $ANTLR start "ruleBuffer"
    // InternalStl.g:1215:1: ruleBuffer returns [EObject current=null] : (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) ;
    public final EObject ruleBuffer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_cost_3_0 = null;

        EObject lv_inputSlots_6_0 = null;

        EObject lv_outputSlots_8_0 = null;

        EObject lv_services_9_0 = null;



        	enterRule();

        try {
            // InternalStl.g:1221:2: ( (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) )
            // InternalStl.g:1222:2: (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            {
            // InternalStl.g:1222:2: (otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            // InternalStl.g:1223:3: otherlv_0= 'buffer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBufferAccess().getBufferKeyword_0());
              		
            }
            // InternalStl.g:1227:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1228:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1228:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1229:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getBufferAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBufferRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBufferAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:1249:3: ( (lv_cost_3_0= ruleEInt ) )
            // InternalStl.g:1250:4: (lv_cost_3_0= ruleEInt )
            {
            // InternalStl.g:1250:4: (lv_cost_3_0= ruleEInt )
            // InternalStl.g:1251:5: lv_cost_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBufferAccess().getCostEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_cost_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBufferRule());
              					}
              					set(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"at.ac.tuwien.big.Stl.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBufferAccess().getRightParenthesisLeftCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBufferAccess().getInputKeyword_5());
              		
            }
            // InternalStl.g:1276:3: ( (lv_inputSlots_6_0= ruleSlot ) )
            // InternalStl.g:1277:4: (lv_inputSlots_6_0= ruleSlot )
            {
            // InternalStl.g:1277:4: (lv_inputSlots_6_0= ruleSlot )
            // InternalStl.g:1278:5: lv_inputSlots_6_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBufferAccess().getInputSlotsSlotParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_inputSlots_6_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBufferRule());
              					}
              					add(
              						current,
              						"inputSlots",
              						lv_inputSlots_6_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getBufferAccess().getOutputKeyword_7());
              		
            }
            // InternalStl.g:1299:3: ( (lv_outputSlots_8_0= ruleSlot ) )
            // InternalStl.g:1300:4: (lv_outputSlots_8_0= ruleSlot )
            {
            // InternalStl.g:1300:4: (lv_outputSlots_8_0= ruleSlot )
            // InternalStl.g:1301:5: lv_outputSlots_8_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBufferAccess().getOutputSlotsSlotParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_outputSlots_8_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBufferRule());
              					}
              					add(
              						current,
              						"outputSlots",
              						lv_outputSlots_8_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStl.g:1318:3: ( (lv_services_9_0= ruleService ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalStl.g:1319:4: (lv_services_9_0= ruleService )
            	    {
            	    // InternalStl.g:1319:4: (lv_services_9_0= ruleService )
            	    // InternalStl.g:1320:5: lv_services_9_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBufferAccess().getServicesServiceParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_services_9_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBufferRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_9_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getBufferAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBuffer"


    // $ANTLR start "entryRuleConveyor"
    // InternalStl.g:1345:1: entryRuleConveyor returns [EObject current=null] : iv_ruleConveyor= ruleConveyor EOF ;
    public final EObject entryRuleConveyor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConveyor = null;


        try {
            // InternalStl.g:1345:49: (iv_ruleConveyor= ruleConveyor EOF )
            // InternalStl.g:1346:2: iv_ruleConveyor= ruleConveyor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConveyorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConveyor=ruleConveyor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConveyor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConveyor"


    // $ANTLR start "ruleConveyor"
    // InternalStl.g:1352:1: ruleConveyor returns [EObject current=null] : (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) ;
    public final EObject ruleConveyor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_cost_3_0 = null;

        EObject lv_inputSlots_6_0 = null;

        EObject lv_outputSlots_8_0 = null;

        EObject lv_services_9_0 = null;



        	enterRule();

        try {
            // InternalStl.g:1358:2: ( (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) )
            // InternalStl.g:1359:2: (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            {
            // InternalStl.g:1359:2: (otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            // InternalStl.g:1360:3: otherlv_0= 'conveyor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) ( (lv_services_9_0= ruleService ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConveyorAccess().getConveyorKeyword_0());
              		
            }
            // InternalStl.g:1364:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1365:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1365:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1366:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getConveyorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConveyorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConveyorAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:1386:3: ( (lv_cost_3_0= ruleEInt ) )
            // InternalStl.g:1387:4: (lv_cost_3_0= ruleEInt )
            {
            // InternalStl.g:1387:4: (lv_cost_3_0= ruleEInt )
            // InternalStl.g:1388:5: lv_cost_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConveyorAccess().getCostEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_cost_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConveyorRule());
              					}
              					set(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"at.ac.tuwien.big.Stl.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConveyorAccess().getRightParenthesisLeftCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConveyorAccess().getInputKeyword_5());
              		
            }
            // InternalStl.g:1413:3: ( (lv_inputSlots_6_0= ruleSlot ) )
            // InternalStl.g:1414:4: (lv_inputSlots_6_0= ruleSlot )
            {
            // InternalStl.g:1414:4: (lv_inputSlots_6_0= ruleSlot )
            // InternalStl.g:1415:5: lv_inputSlots_6_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConveyorAccess().getInputSlotsSlotParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_inputSlots_6_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConveyorRule());
              					}
              					add(
              						current,
              						"inputSlots",
              						lv_inputSlots_6_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getConveyorAccess().getOutputKeyword_7());
              		
            }
            // InternalStl.g:1436:3: ( (lv_outputSlots_8_0= ruleSlot ) )
            // InternalStl.g:1437:4: (lv_outputSlots_8_0= ruleSlot )
            {
            // InternalStl.g:1437:4: (lv_outputSlots_8_0= ruleSlot )
            // InternalStl.g:1438:5: lv_outputSlots_8_0= ruleSlot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConveyorAccess().getOutputSlotsSlotParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_outputSlots_8_0=ruleSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConveyorRule());
              					}
              					add(
              						current,
              						"outputSlots",
              						lv_outputSlots_8_0,
              						"at.ac.tuwien.big.Stl.Slot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalStl.g:1455:3: ( (lv_services_9_0= ruleService ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalStl.g:1456:4: (lv_services_9_0= ruleService )
            	    {
            	    // InternalStl.g:1456:4: (lv_services_9_0= ruleService )
            	    // InternalStl.g:1457:5: lv_services_9_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getConveyorAccess().getServicesServiceParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_services_9_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getConveyorRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_9_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getConveyorAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConveyor"


    // $ANTLR start "entryRuleMachine"
    // InternalStl.g:1482:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalStl.g:1482:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalStl.g:1483:2: iv_ruleMachine= ruleMachine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMachineRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMachine; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalStl.g:1489:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+ (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+ ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_cost_3_0 = null;

        EObject lv_inputSlots_6_0 = null;

        EObject lv_outputSlots_8_0 = null;

        EObject lv_services_9_0 = null;



        	enterRule();

        try {
            // InternalStl.g:1495:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+ (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+ ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) )
            // InternalStl.g:1496:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+ (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+ ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            {
            // InternalStl.g:1496:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+ (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+ ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            // InternalStl.g:1497:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+ (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+ ( (lv_services_9_0= ruleService ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
              		
            }
            // InternalStl.g:1501:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1502:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1502:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1503:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMachineRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:1523:3: ( (lv_cost_3_0= ruleEInt ) )
            // InternalStl.g:1524:4: (lv_cost_3_0= ruleEInt )
            {
            // InternalStl.g:1524:4: (lv_cost_3_0= ruleEInt )
            // InternalStl.g:1525:5: lv_cost_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMachineAccess().getCostEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_cost_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMachineRule());
              					}
              					set(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"at.ac.tuwien.big.Stl.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getRightParenthesisLeftCurlyBracketKeyword_4());
              		
            }
            // InternalStl.g:1546:3: (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalStl.g:1547:4: otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getInputKeyword_5_0());
            	      			
            	    }
            	    // InternalStl.g:1551:4: ( (lv_inputSlots_6_0= ruleSlot ) )
            	    // InternalStl.g:1552:5: (lv_inputSlots_6_0= ruleSlot )
            	    {
            	    // InternalStl.g:1552:5: (lv_inputSlots_6_0= ruleSlot )
            	    // InternalStl.g:1553:6: lv_inputSlots_6_0= ruleSlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMachineAccess().getInputSlotsSlotParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_inputSlots_6_0=ruleSlot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMachineRule());
            	      						}
            	      						add(
            	      							current,
            	      							"inputSlots",
            	      							lv_inputSlots_6_0,
            	      							"at.ac.tuwien.big.Stl.Slot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // InternalStl.g:1571:3: (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalStl.g:1572:4: otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) )
            	    {
            	    otherlv_7=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getOutputKeyword_6_0());
            	      			
            	    }
            	    // InternalStl.g:1576:4: ( (lv_outputSlots_8_0= ruleSlot ) )
            	    // InternalStl.g:1577:5: (lv_outputSlots_8_0= ruleSlot )
            	    {
            	    // InternalStl.g:1577:5: (lv_outputSlots_8_0= ruleSlot )
            	    // InternalStl.g:1578:6: lv_outputSlots_8_0= ruleSlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMachineAccess().getOutputSlotsSlotParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_outputSlots_8_0=ruleSlot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMachineRule());
            	      						}
            	      						add(
            	      							current,
            	      							"outputSlots",
            	      							lv_outputSlots_8_0,
            	      							"at.ac.tuwien.big.Stl.Slot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // InternalStl.g:1596:3: ( (lv_services_9_0= ruleService ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalStl.g:1597:4: (lv_services_9_0= ruleService )
            	    {
            	    // InternalStl.g:1597:4: (lv_services_9_0= ruleService )
            	    // InternalStl.g:1598:5: lv_services_9_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMachineAccess().getServicesServiceParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_services_9_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMachineRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_9_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleTurnTable"
    // InternalStl.g:1623:1: entryRuleTurnTable returns [EObject current=null] : iv_ruleTurnTable= ruleTurnTable EOF ;
    public final EObject entryRuleTurnTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnTable = null;


        try {
            // InternalStl.g:1623:50: (iv_ruleTurnTable= ruleTurnTable EOF )
            // InternalStl.g:1624:2: iv_ruleTurnTable= ruleTurnTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTurnTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTurnTable=ruleTurnTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTurnTable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTurnTable"


    // $ANTLR start "ruleTurnTable"
    // InternalStl.g:1630:1: ruleTurnTable returns [EObject current=null] : (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+ (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+ ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) ;
    public final EObject ruleTurnTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_cost_3_0 = null;

        EObject lv_inputSlots_6_0 = null;

        EObject lv_outputSlots_8_0 = null;

        EObject lv_services_9_0 = null;



        	enterRule();

        try {
            // InternalStl.g:1636:2: ( (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+ (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+ ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' ) )
            // InternalStl.g:1637:2: (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+ (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+ ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            {
            // InternalStl.g:1637:2: (otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+ (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+ ( (lv_services_9_0= ruleService ) )* otherlv_10= '}' )
            // InternalStl.g:1638:3: otherlv_0= 'turntable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= '){' (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+ (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+ ( (lv_services_9_0= ruleService ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTurnTableAccess().getTurntableKeyword_0());
              		
            }
            // InternalStl.g:1642:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStl.g:1643:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStl.g:1643:4: (lv_name_1_0= RULE_ID )
            // InternalStl.g:1644:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTurnTableAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTurnTableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTurnTableAccess().getCostKeyword_2());
              		
            }
            // InternalStl.g:1664:3: ( (lv_cost_3_0= ruleEInt ) )
            // InternalStl.g:1665:4: (lv_cost_3_0= ruleEInt )
            {
            // InternalStl.g:1665:4: (lv_cost_3_0= ruleEInt )
            // InternalStl.g:1666:5: lv_cost_3_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTurnTableAccess().getCostEIntParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_cost_3_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTurnTableRule());
              					}
              					set(
              						current,
              						"cost",
              						lv_cost_3_0,
              						"at.ac.tuwien.big.Stl.EInt");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTurnTableAccess().getRightParenthesisLeftCurlyBracketKeyword_4());
              		
            }
            // InternalStl.g:1687:3: (otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalStl.g:1688:4: otherlv_5= 'input' ( (lv_inputSlots_6_0= ruleSlot ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getTurnTableAccess().getInputKeyword_5_0());
            	      			
            	    }
            	    // InternalStl.g:1692:4: ( (lv_inputSlots_6_0= ruleSlot ) )
            	    // InternalStl.g:1693:5: (lv_inputSlots_6_0= ruleSlot )
            	    {
            	    // InternalStl.g:1693:5: (lv_inputSlots_6_0= ruleSlot )
            	    // InternalStl.g:1694:6: lv_inputSlots_6_0= ruleSlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTurnTableAccess().getInputSlotsSlotParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_inputSlots_6_0=ruleSlot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTurnTableRule());
            	      						}
            	      						add(
            	      							current,
            	      							"inputSlots",
            	      							lv_inputSlots_6_0,
            	      							"at.ac.tuwien.big.Stl.Slot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // InternalStl.g:1712:3: (otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalStl.g:1713:4: otherlv_7= 'output' ( (lv_outputSlots_8_0= ruleSlot ) )
            	    {
            	    otherlv_7=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getTurnTableAccess().getOutputKeyword_6_0());
            	      			
            	    }
            	    // InternalStl.g:1717:4: ( (lv_outputSlots_8_0= ruleSlot ) )
            	    // InternalStl.g:1718:5: (lv_outputSlots_8_0= ruleSlot )
            	    {
            	    // InternalStl.g:1718:5: (lv_outputSlots_8_0= ruleSlot )
            	    // InternalStl.g:1719:6: lv_outputSlots_8_0= ruleSlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTurnTableAccess().getOutputSlotsSlotParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_outputSlots_8_0=ruleSlot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTurnTableRule());
            	      						}
            	      						add(
            	      							current,
            	      							"outputSlots",
            	      							lv_outputSlots_8_0,
            	      							"at.ac.tuwien.big.Stl.Slot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalStl.g:1737:3: ( (lv_services_9_0= ruleService ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStl.g:1738:4: (lv_services_9_0= ruleService )
            	    {
            	    // InternalStl.g:1738:4: (lv_services_9_0= ruleService )
            	    // InternalStl.g:1739:5: lv_services_9_0= ruleService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTurnTableAccess().getServicesServiceParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_services_9_0=ruleService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTurnTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"services",
            	      						lv_services_9_0,
            	      						"at.ac.tuwien.big.Stl.Service");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTurnTableAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTurnTable"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalStl.g:1764:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalStl.g:1764:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalStl.g:1765:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalStl.g:1771:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalStl.g:1777:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalStl.g:1778:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalStl.g:1778:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalStl.g:1779:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalStl.g:1786:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) && (synpred1_InternalStl())) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalStl.g:1787:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalStl.g:1787:4: ( ( '.' )=>kw= '.' )
            	    // InternalStl.g:1788:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEDouble"
    // InternalStl.g:1807:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalStl.g:1807:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalStl.g:1808:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalStl.g:1814:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalStl.g:1820:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalStl.g:1821:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalStl.g:1821:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalStl.g:1822:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalStl.g:1822:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalStl.g:1823:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalStl.g:1829:3: (this_INT_1= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalStl.g:1830:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,36,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
              		
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
              		
            }
            // InternalStl.g:1850:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=38 && LA25_0<=39)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalStl.g:1851:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalStl.g:1851:4: (kw= 'E' | kw= 'e' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==38) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==39) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalStl.g:1852:5: kw= 'E'
                            {
                            kw=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalStl.g:1858:5: kw= 'e'
                            {
                            kw=(Token)match(input,39,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalStl.g:1864:4: (kw= '-' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==37) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalStl.g:1865:5: kw= '-'
                            {
                            kw=(Token)match(input,37,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                              				
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalStl.g:1883:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalStl.g:1883:47: (iv_ruleEString= ruleEString EOF )
            // InternalStl.g:1884:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalStl.g:1890:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalStl.g:1896:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalStl.g:1897:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalStl.g:1897:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalStl.g:1898:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalStl.g:1906:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalStl.g:1917:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalStl.g:1917:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalStl.g:1918:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalStl.g:1924:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalStl.g:1930:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalStl.g:1931:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalStl.g:1931:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalStl.g:1932:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalStl.g:1932:3: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalStl.g:1933:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEInt"

    // $ANTLR start synpred1_InternalStl
    public final void synpred1_InternalStl_fragment() throws RecognitionException {   
        // InternalStl.g:1788:5: ( '.' )
        // InternalStl.g:1788:6: '.'
        {
        match(input,36,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalStl

    // Delegated rules

    public final boolean synpred1_InternalStl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalStl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\22\1\4\1\23\2\5\1\24\2\5\1\44\1\5\1\25\4\5\1\25\1\5\1\26\2\uffff";
    static final String dfa_3s = "\1\22\1\4\1\23\1\45\1\5\1\24\1\45\2\44\1\5\1\47\3\45\1\5\1\25\1\5\1\27\2\uffff";
    static final String dfa_4s = "\22\uffff\1\2\1\1";
    static final String dfa_5s = "\24\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\37\uffff\1\4",
            "\1\5",
            "\1\6",
            "\1\10\36\uffff\1\11\1\7",
            "\1\10\36\uffff\1\11",
            "\1\11",
            "\1\12",
            "\1\15\20\uffff\1\13\1\14",
            "\1\17\37\uffff\1\16",
            "\1\17\37\uffff\1\16",
            "\1\21\37\uffff\1\20",
            "\1\17",
            "\1\15",
            "\1\21",
            "\1\23\1\22",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "443:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(cost=' ( (lv_cost_3_0= ruleEInt ) ) otherlv_4= ',reliability=' ( (lv_reliability_5_0= ruleEDouble ) ) otherlv_6= ',processingTime=' ( (lv_processingTime_7_0= ruleEInt ) ) otherlv_8= ')' ) | (otherlv_9= 'service' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '(cost=' ( (lv_cost_12_0= ruleEInt ) ) otherlv_13= ',reliability=' ( (lv_reliability_14_0= ruleEDouble ) ) otherlv_15= ',processingTime=' ( (lv_processingTime_16_0= ruleEInt ) ) otherlv_17= '){' ( (lv_parameters_18_0= ruleParameter ) )+ otherlv_19= '}' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000FA4002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010042000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000C000000002L});

}
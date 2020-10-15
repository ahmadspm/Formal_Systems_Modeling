package org.xtext.behavior.withstatemachine.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.behavior.withstatemachine.services.MyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'machine'", "'event'", "'state'", "'eventrate'", "'.'", "'to'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDSL.g"; }



     	private MyDSLGrammarAccess grammarAccess;

        public InternalMyDSLParser(TokenStream input, MyDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Statemachine";
       	}

       	@Override
       	protected MyDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStatemachine"
    // InternalMyDSL.g:64:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // InternalMyDSL.g:64:53: (iv_ruleStatemachine= ruleStatemachine EOF )
            // InternalMyDSL.g:65:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
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
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // InternalMyDSL.g:71:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_events_2_0= ruleEvent ) )* ( (lv_states_3_0= ruleState ) )* ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_events_2_0 = null;

        EObject lv_states_3_0 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:77:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_events_2_0= ruleEvent ) )* ( (lv_states_3_0= ruleState ) )* ) )
            // InternalMyDSL.g:78:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_events_2_0= ruleEvent ) )* ( (lv_states_3_0= ruleState ) )* )
            {
            // InternalMyDSL.g:78:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_events_2_0= ruleEvent ) )* ( (lv_states_3_0= ruleState ) )* )
            // InternalMyDSL.g:79:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) ( (lv_events_2_0= ruleEvent ) )* ( (lv_states_3_0= ruleState ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStatemachineAccess().getMachineKeyword_0());
            		
            // InternalMyDSL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDSL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDSL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDSL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStatemachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatemachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDSL.g:101:3: ( (lv_events_2_0= ruleEvent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDSL.g:102:4: (lv_events_2_0= ruleEvent )
            	    {
            	    // InternalMyDSL.g:102:4: (lv_events_2_0= ruleEvent )
            	    // InternalMyDSL.g:103:5: lv_events_2_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_events_2_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_2_0,
            	    						"org.xtext.behavior.withstatemachine.MyDSL.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDSL.g:120:3: ( (lv_states_3_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDSL.g:121:4: (lv_states_3_0= ruleState )
            	    {
            	    // InternalMyDSL.g:121:4: (lv_states_3_0= ruleState )
            	    // InternalMyDSL.g:122:5: lv_states_3_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_states_3_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_3_0,
            	    						"org.xtext.behavior.withstatemachine.MyDSL.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDSL.g:143:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMyDSL.g:143:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMyDSL.g:144:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMyDSL.g:150:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_evenrates_2_0= ruleRate ) )* ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_evenrates_2_0 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:156:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_evenrates_2_0= ruleRate ) )* ) )
            // InternalMyDSL.g:157:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_evenrates_2_0= ruleRate ) )* )
            {
            // InternalMyDSL.g:157:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_evenrates_2_0= ruleRate ) )* )
            // InternalMyDSL.g:158:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ( (lv_evenrates_2_0= ruleRate ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalMyDSL.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDSL.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDSL.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMyDSL.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDSL.g:180:3: ( (lv_evenrates_2_0= ruleRate ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDSL.g:181:4: (lv_evenrates_2_0= ruleRate )
            	    {
            	    // InternalMyDSL.g:181:4: (lv_evenrates_2_0= ruleRate )
            	    // InternalMyDSL.g:182:5: lv_evenrates_2_0= ruleRate
            	    {

            	    					newCompositeNode(grammarAccess.getEventAccess().getEvenratesRateParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_evenrates_2_0=ruleRate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"evenrates",
            	    						lv_evenrates_2_0,
            	    						"org.xtext.behavior.withstatemachine.MyDSL.Rate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleState"
    // InternalMyDSL.g:203:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDSL.g:203:46: (iv_ruleState= ruleState EOF )
            // InternalMyDSL.g:204:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDSL.g:210:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransitions ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_transitions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:216:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransitions ) )* ) )
            // InternalMyDSL.g:217:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransitions ) )* )
            {
            // InternalMyDSL.g:217:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransitions ) )* )
            // InternalMyDSL.g:218:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) ( (lv_transitions_2_0= ruleTransitions ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalMyDSL.g:222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDSL.g:223:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDSL.g:223:4: (lv_name_1_0= RULE_ID )
            // InternalMyDSL.g:224:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDSL.g:240:3: ( (lv_transitions_2_0= ruleTransitions ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDSL.g:241:4: (lv_transitions_2_0= ruleTransitions )
            	    {
            	    // InternalMyDSL.g:241:4: (lv_transitions_2_0= ruleTransitions )
            	    // InternalMyDSL.g:242:5: lv_transitions_2_0= ruleTransitions
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_transitions_2_0=ruleTransitions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_2_0,
            	    						"org.xtext.behavior.withstatemachine.MyDSL.Transitions");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleRate"
    // InternalMyDSL.g:263:1: entryRuleRate returns [EObject current=null] : iv_ruleRate= ruleRate EOF ;
    public final EObject entryRuleRate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRate = null;


        try {
            // InternalMyDSL.g:263:45: (iv_ruleRate= ruleRate EOF )
            // InternalMyDSL.g:264:2: iv_ruleRate= ruleRate EOF
            {
             newCompositeNode(grammarAccess.getRateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRate=ruleRate();

            state._fsp--;

             current =iv_ruleRate; 
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
    // $ANTLR end "entryRuleRate"


    // $ANTLR start "ruleRate"
    // InternalMyDSL.g:270:1: ruleRate returns [EObject current=null] : (otherlv_0= 'eventrate' ( (lv_eventval_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eventval_1_0=null;


        	enterRule();

        try {
            // InternalMyDSL.g:276:2: ( (otherlv_0= 'eventrate' ( (lv_eventval_1_0= RULE_INT ) ) ) )
            // InternalMyDSL.g:277:2: (otherlv_0= 'eventrate' ( (lv_eventval_1_0= RULE_INT ) ) )
            {
            // InternalMyDSL.g:277:2: (otherlv_0= 'eventrate' ( (lv_eventval_1_0= RULE_INT ) ) )
            // InternalMyDSL.g:278:3: otherlv_0= 'eventrate' ( (lv_eventval_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRateAccess().getEventrateKeyword_0());
            		
            // InternalMyDSL.g:282:3: ( (lv_eventval_1_0= RULE_INT ) )
            // InternalMyDSL.g:283:4: (lv_eventval_1_0= RULE_INT )
            {
            // InternalMyDSL.g:283:4: (lv_eventval_1_0= RULE_INT )
            // InternalMyDSL.g:284:5: lv_eventval_1_0= RULE_INT
            {
            lv_eventval_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_eventval_1_0, grammarAccess.getRateAccess().getEventvalINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eventval",
            						lv_eventval_1_0,
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
    // $ANTLR end "ruleRate"


    // $ANTLR start "entryRuleTransitions"
    // InternalMyDSL.g:304:1: entryRuleTransitions returns [EObject current=null] : iv_ruleTransitions= ruleTransitions EOF ;
    public final EObject entryRuleTransitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitions = null;


        try {
            // InternalMyDSL.g:304:52: (iv_ruleTransitions= ruleTransitions EOF )
            // InternalMyDSL.g:305:2: iv_ruleTransitions= ruleTransitions EOF
            {
             newCompositeNode(grammarAccess.getTransitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitions=ruleTransitions();

            state._fsp--;

             current =iv_ruleTransitions; 
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
    // $ANTLR end "entryRuleTransitions"


    // $ANTLR start "ruleTransitions"
    // InternalMyDSL.g:311:1: ruleTransitions returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleTransitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDSL.g:317:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalMyDSL.g:318:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalMyDSL.g:318:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) )
            // InternalMyDSL.g:319:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) )
            {
            // InternalMyDSL.g:319:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDSL.g:320:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDSL.g:320:4: (otherlv_0= RULE_ID )
            // InternalMyDSL.g:321:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionsAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionsAccess().getFullStopKeyword_1());
            		
            // InternalMyDSL.g:336:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDSL.g:337:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDSL.g:337:4: (otherlv_2= RULE_ID )
            // InternalMyDSL.g:338:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionsRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionsAccess().getEventratesRateCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionsAccess().getToKeyword_3());
            		
            // InternalMyDSL.g:353:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDSL.g:354:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDSL.g:354:4: (otherlv_4= RULE_ID )
            // InternalMyDSL.g:355:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionsRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getTransitionsAccess().getTargetStateCrossReference_4_0());
            				

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
    // $ANTLR end "ruleTransitions"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}
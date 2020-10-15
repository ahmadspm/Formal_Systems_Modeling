/*
 * generated by Xtext 2.19.0
 */
package org.xtext.sosarch.csdesign.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ConstiuteintsystemDesignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.ConstiuteintsystemDesign");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameters_listKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cActionsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cActionsRatesParserRuleCall_2_0_0 = (RuleCall)cActionsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cActionAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cActionRatesParserRuleCall_2_1_1_0 = (RuleCall)cActionAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cCSKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNameIDTerminalRuleCall_5_0 = (RuleCall)cNameAssignment_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cPortsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cPortsPortParserRuleCall_7_0 = (RuleCall)cPortsAssignment_7.eContents().get(0);
		
		//ConstiuteintsystemDesign:
		//	'parameters_list' '(' (actions+=rates (',' action+=rates)*)? ')'
		//	"CS" name=ID
		//	"{"
		//	ports+=Port*;
		@Override public ParserRule getRule() { return rule; }
		
		//'parameters_list' '(' (actions+=rates (',' action+=rates)*)? ')' "CS" name=ID "{" ports+=Port*
		public Group getGroup() { return cGroup; }
		
		//'parameters_list'
		public Keyword getParameters_listKeyword_0() { return cParameters_listKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(actions+=rates (',' action+=rates)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//actions+=rates
		public Assignment getActionsAssignment_2_0() { return cActionsAssignment_2_0; }
		
		//rates
		public RuleCall getActionsRatesParserRuleCall_2_0_0() { return cActionsRatesParserRuleCall_2_0_0; }
		
		//(',' action+=rates)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//action+=rates
		public Assignment getActionAssignment_2_1_1() { return cActionAssignment_2_1_1; }
		
		//rates
		public RuleCall getActionRatesParserRuleCall_2_1_1_0() { return cActionRatesParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//"CS"
		public Keyword getCSKeyword_4() { return cCSKeyword_4; }
		
		//name=ID
		public Assignment getNameAssignment_5() { return cNameAssignment_5; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_5_0() { return cNameIDTerminalRuleCall_5_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//ports+=Port*
		public Assignment getPortsAssignment_7() { return cPortsAssignment_7; }
		
		//Port
		public RuleCall getPortsPortParserRuleCall_7_0() { return cPortsPortParserRuleCall_7_0; }
	}
	public class PortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.Port");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cPortAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cPortKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cNameAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_0_2_0 = (RuleCall)cNameAssignment_0_2.eContents().get(0);
		private final Assignment cProvidesAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cProvidesProvideParserRuleCall_0_3_0 = (RuleCall)cProvidesAssignment_0_3.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cPortAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cRequiresAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRequiresRequireParserRuleCall_1_1_0 = (RuleCall)cRequiresAssignment_1_1.eContents().get(0);
		
		//Port:
		//	{Port} 'port' name=ID provides+=provide? | {Port} requires+=require?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Port} 'port' name=ID provides+=provide? | {Port} requires+=require?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Port} 'port' name=ID provides+=provide?
		public Group getGroup_0() { return cGroup_0; }
		
		//{Port}
		public Action getPortAction_0_0() { return cPortAction_0_0; }
		
		//'port'
		public Keyword getPortKeyword_0_1() { return cPortKeyword_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_0_2() { return cNameAssignment_0_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_2_0() { return cNameIDTerminalRuleCall_0_2_0; }
		
		//provides+=provide?
		public Assignment getProvidesAssignment_0_3() { return cProvidesAssignment_0_3; }
		
		//provide
		public RuleCall getProvidesProvideParserRuleCall_0_3_0() { return cProvidesProvideParserRuleCall_0_3_0; }
		
		//{Port} requires+=require?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Port}
		public Action getPortAction_1_0() { return cPortAction_1_0; }
		
		//requires+=require?
		public Assignment getRequiresAssignment_1_1() { return cRequiresAssignment_1_1; }
		
		//require
		public RuleCall getRequiresRequireParserRuleCall_1_1_0() { return cRequiresRequireParserRuleCall_1_1_0; }
	}
	public class StochasticbehaviorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.Stochasticbehavior");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStochaticBehaviorAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cSystemTransitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSystemTransitionSystemTranstionsParserRuleCall_1_0 = (RuleCall)cSystemTransitionAssignment_1.eContents().get(0);
		private final Assignment cConConstraintAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConConstraintStochaticConstriantsParserRuleCall_2_0 = (RuleCall)cConConstraintAssignment_2.eContents().get(0);
		
		//Stochasticbehavior:
		//	{StochaticBehavior} SystemTransition+=SystemTranstions*
		//	ConConstraint+=StochaticConstriants*;
		@Override public ParserRule getRule() { return rule; }
		
		//{StochaticBehavior} SystemTransition+=SystemTranstions* ConConstraint+=StochaticConstriants*
		public Group getGroup() { return cGroup; }
		
		//{StochaticBehavior}
		public Action getStochaticBehaviorAction_0() { return cStochaticBehaviorAction_0; }
		
		//SystemTransition+=SystemTranstions*
		public Assignment getSystemTransitionAssignment_1() { return cSystemTransitionAssignment_1; }
		
		//SystemTranstions
		public RuleCall getSystemTransitionSystemTranstionsParserRuleCall_1_0() { return cSystemTransitionSystemTranstionsParserRuleCall_1_0; }
		
		//ConConstraint+=StochaticConstriants*
		public Assignment getConConstraintAssignment_2() { return cConConstraintAssignment_2; }
		
		//StochaticConstriants
		public RuleCall getConConstraintStochaticConstriantsParserRuleCall_2_0() { return cConConstraintStochaticConstriantsParserRuleCall_2_0; }
	}
	public class StochaticConstriantsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.StochaticConstriants");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStochaticConstriantsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStochasticKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCconstraintsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cTellKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cConstraintShareDateAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cConstraintShareDateShardataParserRuleCall_4_2_0 = (RuleCall)cConstraintShareDateAssignment_4_2.eContents().get(0);
		private final Keyword cFullStopKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Assignment cRateAssignment_4_4 = (Assignment)cGroup_4.eContents().get(4);
		private final RuleCall cRateRatesParserRuleCall_4_4_0 = (RuleCall)cRateAssignment_4_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4_5 = (Keyword)cGroup_4.eContents().get(5);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cAskKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cConstraintDataAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cConstraintDataDatatoinferParserRuleCall_5_2_0 = (RuleCall)cConstraintDataAssignment_5_2.eContents().get(0);
		private final Keyword cFullStopKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		private final Assignment cRateAssignment_5_4 = (Assignment)cGroup_5.eContents().get(4);
		private final RuleCall cRateRatesParserRuleCall_5_4_0 = (RuleCall)cRateAssignment_5_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5_5 = (Keyword)cGroup_5.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//StochaticConstriants:
		//	{StochaticConstriants} 'Stochastic' 'Cconstraints' '{' ('Tell' '(' ConstraintShareDate+=shardata '.' rate+=rates
		//	')')* ('Ask' '(' ConstraintData+=Datatoinfer '.' rate+=rates ')')* '}'
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//{StochaticConstriants} 'Stochastic' 'Cconstraints' '{' ('Tell' '(' ConstraintShareDate+=shardata '.' rate+=rates ')')*
		//('Ask' '(' ConstraintData+=Datatoinfer '.' rate+=rates ')')* '}' "}"
		public Group getGroup() { return cGroup; }
		
		//{StochaticConstriants}
		public Action getStochaticConstriantsAction_0() { return cStochaticConstriantsAction_0; }
		
		//'Stochastic'
		public Keyword getStochasticKeyword_1() { return cStochasticKeyword_1; }
		
		//'Cconstraints'
		public Keyword getCconstraintsKeyword_2() { return cCconstraintsKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('Tell' '(' ConstraintShareDate+=shardata '.' rate+=rates ')')*
		public Group getGroup_4() { return cGroup_4; }
		
		//'Tell'
		public Keyword getTellKeyword_4_0() { return cTellKeyword_4_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4_1() { return cLeftParenthesisKeyword_4_1; }
		
		//ConstraintShareDate+=shardata
		public Assignment getConstraintShareDateAssignment_4_2() { return cConstraintShareDateAssignment_4_2; }
		
		//shardata
		public RuleCall getConstraintShareDateShardataParserRuleCall_4_2_0() { return cConstraintShareDateShardataParserRuleCall_4_2_0; }
		
		//'.'
		public Keyword getFullStopKeyword_4_3() { return cFullStopKeyword_4_3; }
		
		//rate+=rates
		public Assignment getRateAssignment_4_4() { return cRateAssignment_4_4; }
		
		//rates
		public RuleCall getRateRatesParserRuleCall_4_4_0() { return cRateRatesParserRuleCall_4_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4_5() { return cRightParenthesisKeyword_4_5; }
		
		//('Ask' '(' ConstraintData+=Datatoinfer '.' rate+=rates ')')*
		public Group getGroup_5() { return cGroup_5; }
		
		//'Ask'
		public Keyword getAskKeyword_5_0() { return cAskKeyword_5_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_1() { return cLeftParenthesisKeyword_5_1; }
		
		//ConstraintData+=Datatoinfer
		public Assignment getConstraintDataAssignment_5_2() { return cConstraintDataAssignment_5_2; }
		
		//Datatoinfer
		public RuleCall getConstraintDataDatatoinferParserRuleCall_5_2_0() { return cConstraintDataDatatoinferParserRuleCall_5_2_0; }
		
		//'.'
		public Keyword getFullStopKeyword_5_3() { return cFullStopKeyword_5_3; }
		
		//rate+=rates
		public Assignment getRateAssignment_5_4() { return cRateAssignment_5_4; }
		
		//rates
		public RuleCall getRateRatesParserRuleCall_5_4_0() { return cRateRatesParserRuleCall_5_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_5() { return cRightParenthesisKeyword_5_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class DatatoinferElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.Datatoinfer");
		private final Action cAskfordataAction = (Action)rule.eContents().get(1);
		
		//Datatoinfer:
		//	{Askfordata};
		@Override public ParserRule getRule() { return rule; }
		
		//{Askfordata}
		public Action getAskfordataAction() { return cAskfordataAction; }
	}
	public class ShardataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.shardata");
		private final Action cTellDataAction = (Action)rule.eContents().get(1);
		
		//shardata:
		//	{TellData};
		@Override public ParserRule getRule() { return rule; }
		
		//{TellData}
		public Action getTellDataAction() { return cTellDataAction; }
	}
	public class SystemTranstionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.SystemTranstions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIterateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTranstionsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Assignment cStatesAssignment_5_0 = (Assignment)cAlternatives_5.eContents().get(0);
		private final RuleCall cStatesStateParserRuleCall_5_0_0 = (RuleCall)cStatesAssignment_5_0.eContents().get(0);
		private final Assignment cEventsAssignment_5_1 = (Assignment)cAlternatives_5.eContents().get(1);
		private final RuleCall cEventsEventParserRuleCall_5_1_0 = (RuleCall)cEventsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//SystemTranstions:
		//	'Iterate' '{'
		//	'transtions' name=ID "{" (states+=State | events+=Event)*
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//'Iterate' '{' 'transtions' name=ID "{" (states+=State | events+=Event)* "}"
		public Group getGroup() { return cGroup; }
		
		//'Iterate'
		public Keyword getIterateKeyword_0() { return cIterateKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'transtions'
		public Keyword getTranstionsKeyword_2() { return cTranstionsKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//(states+=State | events+=Event)*
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//states+=State
		public Assignment getStatesAssignment_5_0() { return cStatesAssignment_5_0; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_5_0_0() { return cStatesStateParserRuleCall_5_0_0; }
		
		//events+=Event
		public Assignment getEventsAssignment_5_1() { return cEventsAssignment_5_1; }
		
		//Event
		public RuleCall getEventsEventParserRuleCall_5_1_0() { return cEventsEventParserRuleCall_5_1_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTransitionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTransitionsTransitionParserRuleCall_3_0 = (RuleCall)cTransitionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//State:
		//	"state" name=ID "{"
		//	transitions+=Transition*
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//"state" name=ID "{" transitions+=Transition* "}"
		public Group getGroup() { return cGroup; }
		
		//"state"
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//transitions+=Transition*
		public Assignment getTransitionsAssignment_3() { return cTransitionsAssignment_3; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_3_0() { return cTransitionsTransitionParserRuleCall_3_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEventAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEventEventCrossReference_0_0 = (CrossReference)cEventAssignment_0.eContents().get(0);
		private final RuleCall cEventEventIDTerminalRuleCall_0_0_1 = (RuleCall)cEventEventCrossReference_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cRateRatesCrossReference_2_0 = (CrossReference)cRateAssignment_2.eContents().get(0);
		private final RuleCall cRateRatesIDTerminalRuleCall_2_0_1 = (RuleCall)cRateRatesCrossReference_2_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTargetAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTargetStateCrossReference_4_0 = (CrossReference)cTargetAssignment_4.eContents().get(0);
		private final RuleCall cTargetStateIDTerminalRuleCall_4_0_1 = (RuleCall)cTargetStateCrossReference_4_0.eContents().get(1);
		
		//Transition:
		//	event=[Event] '.' rate=[rates] "->" target=[State];
		@Override public ParserRule getRule() { return rule; }
		
		//event=[Event] '.' rate=[rates] "->" target=[State]
		public Group getGroup() { return cGroup; }
		
		//event=[Event]
		public Assignment getEventAssignment_0() { return cEventAssignment_0; }
		
		//[Event]
		public CrossReference getEventEventCrossReference_0_0() { return cEventEventCrossReference_0_0; }
		
		//ID
		public RuleCall getEventEventIDTerminalRuleCall_0_0_1() { return cEventEventIDTerminalRuleCall_0_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//rate=[rates]
		public Assignment getRateAssignment_2() { return cRateAssignment_2; }
		
		//[rates]
		public CrossReference getRateRatesCrossReference_2_0() { return cRateRatesCrossReference_2_0; }
		
		//ID
		public RuleCall getRateRatesIDTerminalRuleCall_2_0_1() { return cRateRatesIDTerminalRuleCall_2_0_1; }
		
		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }
		
		//target=[State]
		public Assignment getTargetAssignment_4() { return cTargetAssignment_4; }
		
		//[State]
		public CrossReference getTargetStateCrossReference_4_0() { return cTargetStateCrossReference_4_0; }
		
		//ID
		public RuleCall getTargetStateIDTerminalRuleCall_4_0_1() { return cTargetStateIDTerminalRuleCall_4_0_1; }
	}
	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.Operation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cOperationsAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cOperationsKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cSendsAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cSendsSendParserRuleCall_0_2_0 = (RuleCall)cSendsAssignment_0_2.eContents().get(0);
		private final Assignment cRecievesAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cRecievesReceiveParserRuleCall_1_0 = (RuleCall)cRecievesAssignment_1.eContents().get(0);
		
		//Operation:
		//	{operations}
		//	'operations' sends+=send | recieves+=receive
		//	//'operations' name=ID rates+=rate*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{operations} 'operations' sends+=send | recieves+=receive
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{operations} 'operations' sends+=send
		public Group getGroup_0() { return cGroup_0; }
		
		//{operations}
		public Action getOperationsAction_0_0() { return cOperationsAction_0_0; }
		
		//'operations'
		public Keyword getOperationsKeyword_0_1() { return cOperationsKeyword_0_1; }
		
		//sends+=send
		public Assignment getSendsAssignment_0_2() { return cSendsAssignment_0_2; }
		
		//send
		public RuleCall getSendsSendParserRuleCall_0_2_0() { return cSendsSendParserRuleCall_0_2_0; }
		
		//recieves+=receive
		public Assignment getRecievesAssignment_1() { return cRecievesAssignment_1; }
		
		//receive
		public RuleCall getRecievesReceiveParserRuleCall_1_0() { return cRecievesReceiveParserRuleCall_1_0; }
	}
	public class SendElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.send");
		private final Keyword cSend_dataKeyword = (Keyword)rule.eContents().get(1);
		
		//send:
		//	'send_data';
		@Override public ParserRule getRule() { return rule; }
		
		//'send_data'
		public Keyword getSend_dataKeyword() { return cSend_dataKeyword; }
	}
	public class ReceiveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.receive");
		private final Keyword cRecieve_dataKeyword = (Keyword)rule.eContents().get(1);
		
		//receive:
		//	'recieve_data';
		@Override public ParserRule getRule() { return rule; }
		
		//'recieve_data'
		public Keyword getRecieve_dataKeyword() { return cRecieve_dataKeyword; }
	}
	public class RatesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.rates");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActionratesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRatesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRatesINTTerminalRuleCall_1_0 = (RuleCall)cRatesAssignment_1.eContents().get(0);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//rates: //{ActionRatees}
		//	'actionrates' rates=INT '.' INT;
		@Override public ParserRule getRule() { return rule; }
		
		////{ActionRatees}
		//'actionrates' rates=INT '.' INT
		public Group getGroup() { return cGroup; }
		
		////{ActionRatees}
		//'actionrates'
		public Keyword getActionratesKeyword_0() { return cActionratesKeyword_0; }
		
		//rates=INT
		public Assignment getRatesAssignment_1() { return cRatesAssignment_1; }
		
		//INT
		public RuleCall getRatesINTTerminalRuleCall_1_0() { return cRatesINTTerminalRuleCall_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEventKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cOperationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cOperationOperationCrossReference_3_0 = (CrossReference)cOperationAssignment_3.eContents().get(0);
		private final RuleCall cOperationOperationIDTerminalRuleCall_3_0_1 = (RuleCall)cOperationOperationCrossReference_3_0.eContents().get(1);
		
		//Event:
		//	"event" name=ID ":" operation=[Operation];
		@Override public ParserRule getRule() { return rule; }
		
		//"event" name=ID ":" operation=[Operation]
		public Group getGroup() { return cGroup; }
		
		//"event"
		public Keyword getEventKeyword_0() { return cEventKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//operation=[Operation]
		public Assignment getOperationAssignment_3() { return cOperationAssignment_3; }
		
		//[Operation]
		public CrossReference getOperationOperationCrossReference_3_0() { return cOperationOperationCrossReference_3_0; }
		
		//ID
		public RuleCall getOperationOperationIDTerminalRuleCall_3_0_1() { return cOperationOperationIDTerminalRuleCall_3_0_1; }
	}
	public class RequireElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.require");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//require:
		//	'requires' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'requires' name=ID
		public Group getGroup() { return cGroup; }
		
		//'requires'
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ProvideElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sosarch.csdesign.MyDsl.provide");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//provide:
		//	'provides' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'provides' name=ID
		public Group getGroup() { return cGroup; }
		
		//'provides'
		public Keyword getProvidesKeyword_0() { return cProvidesKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final ConstiuteintsystemDesignElements pConstiuteintsystemDesign;
	private final PortElements pPort;
	private final StochasticbehaviorElements pStochasticbehavior;
	private final StochaticConstriantsElements pStochaticConstriants;
	private final DatatoinferElements pDatatoinfer;
	private final ShardataElements pShardata;
	private final SystemTranstionsElements pSystemTranstions;
	private final StateElements pState;
	private final TransitionElements pTransition;
	private final OperationElements pOperation;
	private final SendElements pSend;
	private final ReceiveElements pReceive;
	private final RatesElements pRates;
	private final EventElements pEvent;
	private final RequireElements pRequire;
	private final ProvideElements pProvide;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pConstiuteintsystemDesign = new ConstiuteintsystemDesignElements();
		this.pPort = new PortElements();
		this.pStochasticbehavior = new StochasticbehaviorElements();
		this.pStochaticConstriants = new StochaticConstriantsElements();
		this.pDatatoinfer = new DatatoinferElements();
		this.pShardata = new ShardataElements();
		this.pSystemTranstions = new SystemTranstionsElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
		this.pOperation = new OperationElements();
		this.pSend = new SendElements();
		this.pReceive = new ReceiveElements();
		this.pRates = new RatesElements();
		this.pEvent = new EventElements();
		this.pRequire = new RequireElements();
		this.pProvide = new ProvideElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.sosarch.csdesign.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ConstiuteintsystemDesign:
	//	'parameters_list' '(' (actions+=rates (',' action+=rates)*)? ')'
	//	"CS" name=ID
	//	"{"
	//	ports+=Port*;
	public ConstiuteintsystemDesignElements getConstiuteintsystemDesignAccess() {
		return pConstiuteintsystemDesign;
	}
	
	public ParserRule getConstiuteintsystemDesignRule() {
		return getConstiuteintsystemDesignAccess().getRule();
	}
	
	//Port:
	//	{Port} 'port' name=ID provides+=provide? | {Port} requires+=require?;
	public PortElements getPortAccess() {
		return pPort;
	}
	
	public ParserRule getPortRule() {
		return getPortAccess().getRule();
	}
	
	//Stochasticbehavior:
	//	{StochaticBehavior} SystemTransition+=SystemTranstions*
	//	ConConstraint+=StochaticConstriants*;
	public StochasticbehaviorElements getStochasticbehaviorAccess() {
		return pStochasticbehavior;
	}
	
	public ParserRule getStochasticbehaviorRule() {
		return getStochasticbehaviorAccess().getRule();
	}
	
	//StochaticConstriants:
	//	{StochaticConstriants} 'Stochastic' 'Cconstraints' '{' ('Tell' '(' ConstraintShareDate+=shardata '.' rate+=rates
	//	')')* ('Ask' '(' ConstraintData+=Datatoinfer '.' rate+=rates ')')* '}'
	//	"}";
	public StochaticConstriantsElements getStochaticConstriantsAccess() {
		return pStochaticConstriants;
	}
	
	public ParserRule getStochaticConstriantsRule() {
		return getStochaticConstriantsAccess().getRule();
	}
	
	//Datatoinfer:
	//	{Askfordata};
	public DatatoinferElements getDatatoinferAccess() {
		return pDatatoinfer;
	}
	
	public ParserRule getDatatoinferRule() {
		return getDatatoinferAccess().getRule();
	}
	
	//shardata:
	//	{TellData};
	public ShardataElements getShardataAccess() {
		return pShardata;
	}
	
	public ParserRule getShardataRule() {
		return getShardataAccess().getRule();
	}
	
	//SystemTranstions:
	//	'Iterate' '{'
	//	'transtions' name=ID "{" (states+=State | events+=Event)*
	//	"}";
	public SystemTranstionsElements getSystemTranstionsAccess() {
		return pSystemTranstions;
	}
	
	public ParserRule getSystemTranstionsRule() {
		return getSystemTranstionsAccess().getRule();
	}
	
	//State:
	//	"state" name=ID "{"
	//	transitions+=Transition*
	//	"}";
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//	event=[Event] '.' rate=[rates] "->" target=[State];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//Operation:
	//	{operations}
	//	'operations' sends+=send | recieves+=receive
	//	//'operations' name=ID rates+=rate*
	//;
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}
	
	//send:
	//	'send_data';
	public SendElements getSendAccess() {
		return pSend;
	}
	
	public ParserRule getSendRule() {
		return getSendAccess().getRule();
	}
	
	//receive:
	//	'recieve_data';
	public ReceiveElements getReceiveAccess() {
		return pReceive;
	}
	
	public ParserRule getReceiveRule() {
		return getReceiveAccess().getRule();
	}
	
	//rates: //{ActionRatees}
	//	'actionrates' rates=INT '.' INT;
	public RatesElements getRatesAccess() {
		return pRates;
	}
	
	public ParserRule getRatesRule() {
		return getRatesAccess().getRule();
	}
	
	//Event:
	//	"event" name=ID ":" operation=[Operation];
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//require:
	//	'requires' name=ID;
	public RequireElements getRequireAccess() {
		return pRequire;
	}
	
	public ParserRule getRequireRule() {
		return getRequireAccess().getRule();
	}
	
	//provide:
	//	'provides' name=ID;
	public ProvideElements getProvideAccess() {
		return pProvide;
	}
	
	public ParserRule getProvideRule() {
		return getProvideAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

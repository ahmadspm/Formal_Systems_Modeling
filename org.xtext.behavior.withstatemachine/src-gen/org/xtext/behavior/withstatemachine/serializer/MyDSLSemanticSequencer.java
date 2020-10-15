/*
 * generated by Xtext 2.19.0
 */
package org.xtext.behavior.withstatemachine.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.behavior.withstatemachine.myDSL.Event;
import org.xtext.behavior.withstatemachine.myDSL.MyDSLPackage;
import org.xtext.behavior.withstatemachine.myDSL.Rate;
import org.xtext.behavior.withstatemachine.myDSL.State;
import org.xtext.behavior.withstatemachine.myDSL.Statemachine;
import org.xtext.behavior.withstatemachine.myDSL.Transitions;
import org.xtext.behavior.withstatemachine.services.MyDSLGrammarAccess;

@SuppressWarnings("all")
public class MyDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDSLPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case MyDSLPackage.RATE:
				sequence_Rate(context, (Rate) semanticObject); 
				return; 
			case MyDSLPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case MyDSLPackage.STATEMACHINE:
				sequence_Statemachine(context, (Statemachine) semanticObject); 
				return; 
			case MyDSLPackage.TRANSITIONS:
				sequence_Transitions(context, (Transitions) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (name=ID evenrates+=Rate*)
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rate returns Rate
	 *
	 * Constraint:
	 *     eventval=INT
	 */
	protected void sequence_Rate(ISerializationContext context, Rate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDSLPackage.Literals.RATE__EVENTVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDSLPackage.Literals.RATE__EVENTVAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRateAccess().getEventvalINTTerminalRuleCall_1_0(), semanticObject.getEventval());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID transitions+=Transitions*)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statemachine returns Statemachine
	 *
	 * Constraint:
	 *     (name=ID events+=Event* states+=State*)
	 */
	protected void sequence_Statemachine(ISerializationContext context, Statemachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transitions returns Transitions
	 *
	 * Constraint:
	 *     (event=[Event|ID] eventrates=[Rate|ID] target=[State|ID])
	 */
	protected void sequence_Transitions(ISerializationContext context, Transitions semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDSLPackage.Literals.TRANSITIONS__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDSLPackage.Literals.TRANSITIONS__EVENT));
			if (transientValues.isValueTransient(semanticObject, MyDSLPackage.Literals.TRANSITIONS__EVENTRATES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDSLPackage.Literals.TRANSITIONS__EVENTRATES));
			if (transientValues.isValueTransient(semanticObject, MyDSLPackage.Literals.TRANSITIONS__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDSLPackage.Literals.TRANSITIONS__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionsAccess().getEventEventIDTerminalRuleCall_0_0_1(), semanticObject.eGet(MyDSLPackage.Literals.TRANSITIONS__EVENT, false));
		feeder.accept(grammarAccess.getTransitionsAccess().getEventratesRateIDTerminalRuleCall_2_0_1(), semanticObject.eGet(MyDSLPackage.Literals.TRANSITIONS__EVENTRATES, false));
		feeder.accept(grammarAccess.getTransitionsAccess().getTargetStateIDTerminalRuleCall_4_0_1(), semanticObject.eGet(MyDSLPackage.Literals.TRANSITIONS__TARGET, false));
		feeder.finish();
	}
	
	
}

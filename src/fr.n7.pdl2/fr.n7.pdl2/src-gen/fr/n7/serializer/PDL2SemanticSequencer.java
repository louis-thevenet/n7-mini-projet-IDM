/*
 * generated by Xtext 2.32.0
 */
package fr.n7.serializer;

import com.google.inject.Inject;
import fr.n7.pDL2.DependanceFinish;
import fr.n7.pDL2.DependanceStart;
import fr.n7.pDL2.Guidance;
import fr.n7.pDL2.PDL2Package;
import fr.n7.pDL2.WorkDefinition;
import fr.n7.pDL2.WorkSequenceKindFinish;
import fr.n7.pDL2.WorkSequenceKindStart;
import fr.n7.services.PDL2GrammarAccess;
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

@SuppressWarnings("all")
public class PDL2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PDL2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PDL2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PDL2Package.DEPENDANCE_FINISH:
				sequence_DependanceFinish(context, (DependanceFinish) semanticObject); 
				return; 
			case PDL2Package.DEPENDANCE_START:
				sequence_DependanceStart(context, (DependanceStart) semanticObject); 
				return; 
			case PDL2Package.GUIDANCE:
				sequence_Guidance(context, (Guidance) semanticObject); 
				return; 
			case PDL2Package.PROCESS:
				sequence_Process(context, (fr.n7.pDL2.Process) semanticObject); 
				return; 
			case PDL2Package.WORK_DEFINITION:
				sequence_WorkDefinition(context, (WorkDefinition) semanticObject); 
				return; 
			case PDL2Package.WORK_SEQUENCE_KIND_FINISH:
				sequence_WorkSequenceKindFinish(context, (WorkSequenceKindFinish) semanticObject); 
				return; 
			case PDL2Package.WORK_SEQUENCE_KIND_START:
				sequence_WorkSequenceKindStart(context, (WorkSequenceKindStart) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     DependanceFinish returns DependanceFinish
	 *
	 * Constraint:
	 *     (predecessor=[WorkDefinition|ID] link=WorkSequenceKindFinish)
	 * </pre>
	 */
	protected void sequence_DependanceFinish(ISerializationContext context, DependanceFinish semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__PREDECESSOR));
			if (transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__LINK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1(), semanticObject.eGet(PDL2Package.Literals.DEPENDANCE_FINISH__PREDECESSOR, false));
		feeder.accept(grammarAccess.getDependanceFinishAccess().getLinkWorkSequenceKindFinishParserRuleCall_1_0(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DependanceStart returns DependanceStart
	 *
	 * Constraint:
	 *     (predecessor=[WorkDefinition|ID] link=WorkSequenceKindStart)
	 * </pre>
	 */
	protected void sequence_DependanceStart(ISerializationContext context, DependanceStart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_START__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_START__PREDECESSOR));
			if (transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_START__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_START__LINK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1(), semanticObject.eGet(PDL2Package.Literals.DEPENDANCE_START__PREDECESSOR, false));
		feeder.accept(grammarAccess.getDependanceStartAccess().getLinkWorkSequenceKindStartParserRuleCall_1_0(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns Guidance
	 *     Guidance returns Guidance
	 *
	 * Constraint:
	 *     texte=STRING
	 * </pre>
	 */
	protected void sequence_Guidance(ISerializationContext context, Guidance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PDL2Package.Literals.GUIDANCE__TEXTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.GUIDANCE__TEXTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0(), semanticObject.getTexte());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Process returns Process
	 *
	 * Constraint:
	 *     (name=ID processElements+=ProcessElement*)
	 * </pre>
	 */
	protected void sequence_Process(ISerializationContext context, fr.n7.pDL2.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns WorkDefinition
	 *     WorkDefinition returns WorkDefinition
	 *
	 * Constraint:
	 *     (name=ID linksToPredecessors+=DependanceStart* linksToPredecessors+=DependanceFinish*)
	 * </pre>
	 */
	protected void sequence_WorkDefinition(ISerializationContext context, WorkDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     WorkSequenceKindFinish returns WorkSequenceKindFinish
	 *
	 * Constraint:
	 *     (Finished2Start='started' | Finished2Finish='finished')
	 * </pre>
	 */
	protected void sequence_WorkSequenceKindFinish(ISerializationContext context, WorkSequenceKindFinish semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     WorkSequenceKindStart returns WorkSequenceKindStart
	 *
	 * Constraint:
	 *     (Started2Start='started' | Started2Finish='finished')
	 * </pre>
	 */
	protected void sequence_WorkSequenceKindStart(ISerializationContext context, WorkSequenceKindStart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

/*
 * generated by Xtext 2.32.0
 */
package fr.n7.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PDL3GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProcessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.Process");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcessKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cResourcesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cProcessElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cProcessElementsResourcesParserRuleCall_5_0 = (RuleCall)cProcessElementsAssignment_5.eContents().get(0);
		private final Keyword cWorkdefinitionsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cProcessElementsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cProcessElementsWorkDefinitionsParserRuleCall_8_0 = (RuleCall)cProcessElementsAssignment_8.eContents().get(0);
		private final Keyword cResourceusagesKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cColonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cProcessElementsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cProcessElementsResourceUsagesParserRuleCall_11_0 = (RuleCall)cProcessElementsAssignment_11.eContents().get(0);
		private final Keyword cWorksequencesKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cColonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cProcessElementsAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cProcessElementsWorkSequencesParserRuleCall_14_0 = (RuleCall)cProcessElementsAssignment_14.eContents().get(0);
		
		//Process :
		//'process' ':' name=ID
		//'resources' ':' processElements+=Resources*
		// 'workdefinitions' ':' processElements+=WorkDefinitions*
		// 'resourceusages' ':' processElements+=ResourceUsages*
		// 'worksequences' ':' processElements+=WorkSequences*
		// ;
		@Override public ParserRule getRule() { return rule; }
		
		//'process' ':' name=ID
		//'resources' ':' processElements+=Resources*
		// 'workdefinitions' ':' processElements+=WorkDefinitions*
		// 'resourceusages' ':' processElements+=ResourceUsages*
		// 'worksequences' ':' processElements+=WorkSequences*
		public Group getGroup() { return cGroup; }
		
		//'process'
		public Keyword getProcessKeyword_0() { return cProcessKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'resources'
		public Keyword getResourcesKeyword_3() { return cResourcesKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//processElements+=Resources*
		public Assignment getProcessElementsAssignment_5() { return cProcessElementsAssignment_5; }
		
		//Resources
		public RuleCall getProcessElementsResourcesParserRuleCall_5_0() { return cProcessElementsResourcesParserRuleCall_5_0; }
		
		//'workdefinitions'
		public Keyword getWorkdefinitionsKeyword_6() { return cWorkdefinitionsKeyword_6; }
		
		//':'
		public Keyword getColonKeyword_7() { return cColonKeyword_7; }
		
		//processElements+=WorkDefinitions*
		public Assignment getProcessElementsAssignment_8() { return cProcessElementsAssignment_8; }
		
		//WorkDefinitions
		public RuleCall getProcessElementsWorkDefinitionsParserRuleCall_8_0() { return cProcessElementsWorkDefinitionsParserRuleCall_8_0; }
		
		//'resourceusages'
		public Keyword getResourceusagesKeyword_9() { return cResourceusagesKeyword_9; }
		
		//':'
		public Keyword getColonKeyword_10() { return cColonKeyword_10; }
		
		//processElements+=ResourceUsages*
		public Assignment getProcessElementsAssignment_11() { return cProcessElementsAssignment_11; }
		
		//ResourceUsages
		public RuleCall getProcessElementsResourceUsagesParserRuleCall_11_0() { return cProcessElementsResourceUsagesParserRuleCall_11_0; }
		
		//'worksequences'
		public Keyword getWorksequencesKeyword_12() { return cWorksequencesKeyword_12; }
		
		//':'
		public Keyword getColonKeyword_13() { return cColonKeyword_13; }
		
		//processElements+=WorkSequences*
		public Assignment getProcessElementsAssignment_14() { return cProcessElementsAssignment_14; }
		
		//WorkSequences
		public RuleCall getProcessElementsWorkSequencesParserRuleCall_14_0() { return cProcessElementsWorkSequencesParserRuleCall_14_0; }
	}
	public class ResourceUsagesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.ResourceUsages");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cResourceUsageParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ResourceUsages:
		//     ResourceUsage';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ResourceUsage';'
		public Group getGroup() { return cGroup; }
		
		//ResourceUsage
		public RuleCall getResourceUsageParserRuleCall_0() { return cResourceUsageParserRuleCall_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class ResourceUsageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.ResourceUsage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cWorkDefinitionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cWorkDefinitionWorkDefinitionCrossReference_0_0 = (CrossReference)cWorkDefinitionAssignment_0.eContents().get(0);
		private final RuleCall cWorkDefinitionWorkDefinitionIDTerminalRuleCall_0_0_1 = (RuleCall)cWorkDefinitionWorkDefinitionCrossReference_0_0.eContents().get(1);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cResourceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cResourceResourceCrossReference_2_0 = (CrossReference)cResourceAssignment_2.eContents().get(0);
		private final RuleCall cResourceResourceIDTerminalRuleCall_2_0_1 = (RuleCall)cResourceResourceCrossReference_2_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNeededAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNeededINTTerminalRuleCall_4_0 = (RuleCall)cNeededAssignment_4.eContents().get(0);
		
		//ResourceUsage:
		//     workDefinition=[WorkDefinition]':'resource=[Resource]'='needed=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//workDefinition=[WorkDefinition]':'resource=[Resource]'='needed=INT
		public Group getGroup() { return cGroup; }
		
		//workDefinition=[WorkDefinition]
		public Assignment getWorkDefinitionAssignment_0() { return cWorkDefinitionAssignment_0; }
		
		//[WorkDefinition]
		public CrossReference getWorkDefinitionWorkDefinitionCrossReference_0_0() { return cWorkDefinitionWorkDefinitionCrossReference_0_0; }
		
		//ID
		public RuleCall getWorkDefinitionWorkDefinitionIDTerminalRuleCall_0_0_1() { return cWorkDefinitionWorkDefinitionIDTerminalRuleCall_0_0_1; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//resource=[Resource]
		public Assignment getResourceAssignment_2() { return cResourceAssignment_2; }
		
		//[Resource]
		public CrossReference getResourceResourceCrossReference_2_0() { return cResourceResourceCrossReference_2_0; }
		
		//ID
		public RuleCall getResourceResourceIDTerminalRuleCall_2_0_1() { return cResourceResourceIDTerminalRuleCall_2_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//needed=INT
		public Assignment getNeededAssignment_4() { return cNeededAssignment_4; }
		
		//INT
		public RuleCall getNeededINTTerminalRuleCall_4_0() { return cNeededINTTerminalRuleCall_4_0; }
	}
	public class ResourcesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.Resources");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cResourceParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Resources:
		//    Resource';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Resource';'
		public Group getGroup() { return cGroup; }
		
		//Resource
		public RuleCall getResourceParserRuleCall_0() { return cResourceParserRuleCall_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class ResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.Resource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTotalAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTotalINTTerminalRuleCall_2_0 = (RuleCall)cTotalAssignment_2.eContents().get(0);
		
		//Resource:
		//    name=ID ':' total=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' total=INT
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//total=INT
		public Assignment getTotalAssignment_2() { return cTotalAssignment_2; }
		
		//INT
		public RuleCall getTotalINTTerminalRuleCall_2_0() { return cTotalINTTerminalRuleCall_2_0; }
	}
	public class WorkDefinitionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.WorkDefinitions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWorkDefinitionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//WorkDefinitions:
		//    WorkDefinition ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//WorkDefinition ';'
		public Group getGroup() { return cGroup; }
		
		//WorkDefinition
		public RuleCall getWorkDefinitionParserRuleCall_0() { return cWorkDefinitionParserRuleCall_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class WorkDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.WorkDefinition");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//WorkDefinition :
		//    name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class WorkSequencesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.WorkSequences");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWorkSequenceParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//WorkSequences:
		//    WorkSequence';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//WorkSequence';'
		public Group getGroup() { return cGroup; }
		
		//WorkSequence
		public RuleCall getWorkSequenceParserRuleCall_0() { return cWorkSequenceParserRuleCall_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class WorkSequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.WorkSequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLinkToPredecessorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cLinkToPredecessorWorkDefinitionCrossReference_0_0 = (CrossReference)cLinkToPredecessorAssignment_0.eContents().get(0);
		private final RuleCall cLinkToPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1 = (RuleCall)cLinkToPredecessorWorkDefinitionCrossReference_0_0.eContents().get(1);
		private final Assignment cLinkTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLinkTypeWorkSequenceKindEnumRuleCall_1_0 = (RuleCall)cLinkTypeAssignment_1.eContents().get(0);
		private final Assignment cLinkToSucessorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cLinkToSucessorWorkDefinitionCrossReference_2_0 = (CrossReference)cLinkToSucessorAssignment_2.eContents().get(0);
		private final RuleCall cLinkToSucessorWorkDefinitionIDTerminalRuleCall_2_0_1 = (RuleCall)cLinkToSucessorWorkDefinitionCrossReference_2_0.eContents().get(1);
		
		//WorkSequence :
		//    linkToPredecessor=[WorkDefinition] linkType=WorkSequenceKind linkToSucessor=[WorkDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//linkToPredecessor=[WorkDefinition] linkType=WorkSequenceKind linkToSucessor=[WorkDefinition]
		public Group getGroup() { return cGroup; }
		
		//linkToPredecessor=[WorkDefinition]
		public Assignment getLinkToPredecessorAssignment_0() { return cLinkToPredecessorAssignment_0; }
		
		//[WorkDefinition]
		public CrossReference getLinkToPredecessorWorkDefinitionCrossReference_0_0() { return cLinkToPredecessorWorkDefinitionCrossReference_0_0; }
		
		//ID
		public RuleCall getLinkToPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1() { return cLinkToPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1; }
		
		//linkType=WorkSequenceKind
		public Assignment getLinkTypeAssignment_1() { return cLinkTypeAssignment_1; }
		
		//WorkSequenceKind
		public RuleCall getLinkTypeWorkSequenceKindEnumRuleCall_1_0() { return cLinkTypeWorkSequenceKindEnumRuleCall_1_0; }
		
		//linkToSucessor=[WorkDefinition]
		public Assignment getLinkToSucessorAssignment_2() { return cLinkToSucessorAssignment_2; }
		
		//[WorkDefinition]
		public CrossReference getLinkToSucessorWorkDefinitionCrossReference_2_0() { return cLinkToSucessorWorkDefinitionCrossReference_2_0; }
		
		//ID
		public RuleCall getLinkToSucessorWorkDefinitionIDTerminalRuleCall_2_0_1() { return cLinkToSucessorWorkDefinitionIDTerminalRuleCall_2_0_1; }
	}
	
	public class WorkSequenceKindElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL3.WorkSequenceKind");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFinishToStartEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFinishToStartF2sKeyword_0_0 = (Keyword)cFinishToStartEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFinishToFinishEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFinishToFinishF2fKeyword_1_0 = (Keyword)cFinishToFinishEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cStartToStartEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cStartToStartS2sKeyword_2_0 = (Keyword)cStartToStartEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cStartToFinishEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cStartToFinishS2fKeyword_3_0 = (Keyword)cStartToFinishEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum WorkSequenceKind:
		//    FinishToStart='f2s'
		//    | FinishToFinish='f2f'
		//    | StartToStart='s2s'
		//    | StartToFinish='s2f'
		//;
		public EnumRule getRule() { return rule; }
		
		//FinishToStart='f2s'
		//| FinishToFinish='f2f'
		//| StartToStart='s2s'
		//| StartToFinish='s2f'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FinishToStart='f2s'
		public EnumLiteralDeclaration getFinishToStartEnumLiteralDeclaration_0() { return cFinishToStartEnumLiteralDeclaration_0; }
		
		//'f2s'
		public Keyword getFinishToStartF2sKeyword_0_0() { return cFinishToStartF2sKeyword_0_0; }
		
		//FinishToFinish='f2f'
		public EnumLiteralDeclaration getFinishToFinishEnumLiteralDeclaration_1() { return cFinishToFinishEnumLiteralDeclaration_1; }
		
		//'f2f'
		public Keyword getFinishToFinishF2fKeyword_1_0() { return cFinishToFinishF2fKeyword_1_0; }
		
		//StartToStart='s2s'
		public EnumLiteralDeclaration getStartToStartEnumLiteralDeclaration_2() { return cStartToStartEnumLiteralDeclaration_2; }
		
		//'s2s'
		public Keyword getStartToStartS2sKeyword_2_0() { return cStartToStartS2sKeyword_2_0; }
		
		//StartToFinish='s2f'
		public EnumLiteralDeclaration getStartToFinishEnumLiteralDeclaration_3() { return cStartToFinishEnumLiteralDeclaration_3; }
		
		//'s2f'
		public Keyword getStartToFinishS2fKeyword_3_0() { return cStartToFinishS2fKeyword_3_0; }
	}
	
	private final ProcessElements pProcess;
	private final ResourceUsagesElements pResourceUsages;
	private final ResourceUsageElements pResourceUsage;
	private final ResourcesElements pResources;
	private final ResourceElements pResource;
	private final WorkDefinitionsElements pWorkDefinitions;
	private final WorkDefinitionElements pWorkDefinition;
	private final WorkSequencesElements pWorkSequences;
	private final WorkSequenceElements pWorkSequence;
	private final WorkSequenceKindElements eWorkSequenceKind;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PDL3GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProcess = new ProcessElements();
		this.pResourceUsages = new ResourceUsagesElements();
		this.pResourceUsage = new ResourceUsageElements();
		this.pResources = new ResourcesElements();
		this.pResource = new ResourceElements();
		this.pWorkDefinitions = new WorkDefinitionsElements();
		this.pWorkDefinition = new WorkDefinitionElements();
		this.pWorkSequences = new WorkSequencesElements();
		this.pWorkSequence = new WorkSequenceElements();
		this.eWorkSequenceKind = new WorkSequenceKindElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.n7.PDL3".equals(grammar.getName())) {
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

	
	//Process :
	//'process' ':' name=ID
	//'resources' ':' processElements+=Resources*
	// 'workdefinitions' ':' processElements+=WorkDefinitions*
	// 'resourceusages' ':' processElements+=ResourceUsages*
	// 'worksequences' ':' processElements+=WorkSequences*
	// ;
	public ProcessElements getProcessAccess() {
		return pProcess;
	}
	
	public ParserRule getProcessRule() {
		return getProcessAccess().getRule();
	}
	
	//ResourceUsages:
	//     ResourceUsage';'
	//;
	public ResourceUsagesElements getResourceUsagesAccess() {
		return pResourceUsages;
	}
	
	public ParserRule getResourceUsagesRule() {
		return getResourceUsagesAccess().getRule();
	}
	
	//ResourceUsage:
	//     workDefinition=[WorkDefinition]':'resource=[Resource]'='needed=INT
	//;
	public ResourceUsageElements getResourceUsageAccess() {
		return pResourceUsage;
	}
	
	public ParserRule getResourceUsageRule() {
		return getResourceUsageAccess().getRule();
	}
	
	//Resources:
	//    Resource';'
	//;
	public ResourcesElements getResourcesAccess() {
		return pResources;
	}
	
	public ParserRule getResourcesRule() {
		return getResourcesAccess().getRule();
	}
	
	//Resource:
	//    name=ID ':' total=INT
	//;
	public ResourceElements getResourceAccess() {
		return pResource;
	}
	
	public ParserRule getResourceRule() {
		return getResourceAccess().getRule();
	}
	
	//WorkDefinitions:
	//    WorkDefinition ';'
	//;
	public WorkDefinitionsElements getWorkDefinitionsAccess() {
		return pWorkDefinitions;
	}
	
	public ParserRule getWorkDefinitionsRule() {
		return getWorkDefinitionsAccess().getRule();
	}
	
	//WorkDefinition :
	//    name=ID;
	public WorkDefinitionElements getWorkDefinitionAccess() {
		return pWorkDefinition;
	}
	
	public ParserRule getWorkDefinitionRule() {
		return getWorkDefinitionAccess().getRule();
	}
	
	//WorkSequences:
	//    WorkSequence';'
	//;
	public WorkSequencesElements getWorkSequencesAccess() {
		return pWorkSequences;
	}
	
	public ParserRule getWorkSequencesRule() {
		return getWorkSequencesAccess().getRule();
	}
	
	//WorkSequence :
	//    linkToPredecessor=[WorkDefinition] linkType=WorkSequenceKind linkToSucessor=[WorkDefinition];
	public WorkSequenceElements getWorkSequenceAccess() {
		return pWorkSequence;
	}
	
	public ParserRule getWorkSequenceRule() {
		return getWorkSequenceAccess().getRule();
	}
	
	//enum WorkSequenceKind:
	//    FinishToStart='f2s'
	//    | FinishToFinish='f2f'
	//    | StartToStart='s2s'
	//    | StartToFinish='s2f'
	//;
	public WorkSequenceKindElements getWorkSequenceKindAccess() {
		return eWorkSequenceKind;
	}
	
	public EnumRule getWorkSequenceKindRule() {
		return getWorkSequenceKindAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

/*
 * generated by Xtext 2.32.0
 */
grammar InternalPDL1;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.n7.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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
import fr.n7.services.PDL1GrammarAccess;

}

@parser::members {

 	private PDL1GrammarAccess grammarAccess;

    public InternalPDL1Parser(TokenStream input, PDL1GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Process";
   	}

   	@Override
   	protected PDL1GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProcess
entryRuleProcess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessRule()); }
	iv_ruleProcess=ruleProcess
	{ $current=$iv_ruleProcess.current; }
	EOF;

// Rule Process
ruleProcess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='process'
		{
			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProcessRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0());
				}
				lv_processElements_3_0=ruleProcessElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcessRule());
					}
					add(
						$current,
						"processElements",
						lv_processElements_3_0,
						"fr.n7.PDL1.ProcessElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleProcessElement
entryRuleProcessElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessElementRule()); }
	iv_ruleProcessElement=ruleProcessElement
	{ $current=$iv_ruleProcessElement.current; }
	EOF;

// Rule ProcessElement
ruleProcessElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
		}
		this_WorkDefinition_0=ruleWorkDefinition
		{
			$current = $this_WorkDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1());
		}
		this_WorkSequence_1=ruleWorkSequence
		{
			$current = $this_WorkSequence_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2());
		}
		this_Guidance_2=ruleGuidance
		{
			$current = $this_Guidance_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleWorkDefinition
entryRuleWorkDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkDefinitionRule()); }
	iv_ruleWorkDefinition=ruleWorkDefinition
	{ $current=$iv_ruleWorkDefinition.current; }
	EOF;

// Rule WorkDefinition
ruleWorkDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='wd'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleWorkSequence
entryRuleWorkSequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkSequenceRule()); }
	iv_ruleWorkSequence=ruleWorkSequence
	{ $current=$iv_ruleWorkSequence.current; }
	EOF;

// Rule WorkSequence
ruleWorkSequence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ws'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
				}
				lv_linkType_1_0=ruleWorkSequenceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
					}
					set(
						$current,
						"linkType",
						lv_linkType_1_0,
						"fr.n7.PDL1.WorkSequenceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
				}
			)
		)
		otherlv_4='to'
		{
			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0());
				}
			)
		)
	)
;

// Entry rule entryRuleGuidance
entryRuleGuidance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGuidanceRule()); }
	iv_ruleGuidance=ruleGuidance
	{ $current=$iv_ruleGuidance.current; }
	EOF;

// Rule Guidance
ruleGuidance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='note'
		{
			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
		}
		(
			(
				lv_texte_1_0=RULE_STRING
				{
					newLeafNode(lv_texte_1_0, grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGuidanceRule());
					}
					setWithLastConsumed(
						$current,
						"texte",
						lv_texte_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Rule WorkSequenceType
ruleWorkSequenceType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='s2s'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='f2s'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='s2f'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='f2f'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

/*
 * generated by Xtext 2.25.0
 */
grammar InternalDgen;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.mdd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDomainmodel
entryRuleDomainmodel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainmodelRule()); }
	iv_ruleDomainmodel=ruleDomainmodel
	{ $current=$iv_ruleDomainmodel.current; }
	EOF;

// Rule Domainmodel
ruleDomainmodel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0());
			}
			lv_elements_0_0=ruleType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDomainmodelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.mdd.Dgen.Type");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
		}
		this_DataType_0=ruleDataType
		{
			$current = $this_DataType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
		}
		this_Entity_1=ruleEntity
		{
			$current = $this_Entity_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTypeRule());
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

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getViewsViewsParserRuleCall_0_0());
				}
				lv_views_0_0=ruleViews
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"views",
						lv_views_0_0,
						"org.xtext.mdd.Dgen.Views");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='entity'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_3='extends'
			{
				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntityRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0());
					}
				)
			)
		)?
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0());
				}
				lv_features_6_0=ruleFeature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"features",
						lv_features_6_0,
						"org.xtext.mdd.Dgen.Feature");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_many_0_0='many'
				{
					newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed($current, "many", lv_many_0_0 != null, "many");
				}
			)
		)?
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_optional_2_0='?'
				{
					newLeafNode(lv_optional_2_0, grammarAccess.getFeatureAccess().getOptionalQuestionMarkKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed($current, "optional", lv_optional_2_0 != null, "?");
				}
			)
		)?
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getColonKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getTypeTypeCrossReference_4_0());
				}
			)
		)
	)
;

// Entry rule entryRuleViewGroup
entryRuleViewGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getViewGroupRule()); }
	iv_ruleViewGroup=ruleViewGroup
	{ $current=$iv_ruleViewGroup.current; }
	EOF;

// Rule ViewGroup
ruleViewGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getViewGroupAccess().getCommercialAtKeyword_0());
		}
		(
			(
				(
					lv_name_1_1='All'
					{
						newLeafNode(lv_name_1_1, grammarAccess.getViewGroupAccess().getNameAllKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getViewGroupRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_1, null);
					}
					    |
					lv_name_1_2='None'
					{
						newLeafNode(lv_name_1_2, grammarAccess.getViewGroupAccess().getNameNoneKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getViewGroupRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_2, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleViewOptions
entryRuleViewOptions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getViewOptionsRule()); }
	iv_ruleViewOptions=ruleViewOptions
	{ $current=$iv_ruleViewOptions.current; }
	EOF;

// Rule ViewOptions
ruleViewOptions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getViewOptionsAccess().getCommercialAtKeyword_0());
		}
		(
			(
				(
					lv_name_1_1='Create'
					{
						newLeafNode(lv_name_1_1, grammarAccess.getViewOptionsAccess().getNameCreateKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getViewOptionsRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_1, null);
					}
					    |
					lv_name_1_2='Read'
					{
						newLeafNode(lv_name_1_2, grammarAccess.getViewOptionsAccess().getNameReadKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getViewOptionsRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_2, null);
					}
					    |
					lv_name_1_3='Update'
					{
						newLeafNode(lv_name_1_3, grammarAccess.getViewOptionsAccess().getNameUpdateKeyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getViewOptionsRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_3, null);
					}
					    |
					lv_name_1_4='Delete'
					{
						newLeafNode(lv_name_1_4, grammarAccess.getViewOptionsAccess().getNameDeleteKeyword_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getViewOptionsRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_4, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleViews
entryRuleViews returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getViewsRule()); }
	iv_ruleViews=ruleViews
	{ $current=$iv_ruleViews.current; }
	EOF;

// Rule Views
ruleViews returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getViewsAccess().getViewGroupViewGroupParserRuleCall_0_0());
				}
				lv_viewGroup_0_0=ruleViewGroup
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getViewsRule());
					}
					set(
						$current,
						"viewGroup",
						lv_viewGroup_0_0,
						"org.xtext.mdd.Dgen.ViewGroup");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getViewsAccess().getViewOptionViewOptionsParserRuleCall_1_0());
				}
				lv_viewOption_1_0=ruleViewOptions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getViewsRule());
					}
					add(
						$current,
						"viewOption",
						lv_viewOption_1_0,
						"org.xtext.mdd.Dgen.ViewOptions");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

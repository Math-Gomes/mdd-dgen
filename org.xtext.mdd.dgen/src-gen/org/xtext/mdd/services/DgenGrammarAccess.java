/*
 * generated by Xtext 2.25.0
 */
package org.xtext.mdd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DgenGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DomainmodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdd.Dgen.Domainmodel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsTypeParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Domainmodel:
		//    (elements+=Type)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(elements+=Type)*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Type
		public RuleCall getElementsTypeParserRuleCall_0() { return cElementsTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdd.Dgen.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDataTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//    DataType | Entity;
		@Override public ParserRule getRule() { return rule; }
		
		//DataType | Entity
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DataType
		public RuleCall getDataTypeParserRuleCall_0() { return cDataTypeParserRuleCall_0; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdd.Dgen.DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//DataType:
		//    'datatype' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'datatype' name=ID
		public Group getGroup() { return cGroup; }
		
		//'datatype'
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdd.Dgen.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cViewsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cViewsViewsParserRuleCall_0_0 = (RuleCall)cViewsAssignment_0.eContents().get(0);
		private final Keyword cEntityKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSuperTypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_3_1_0 = (CrossReference)cSuperTypeAssignment_3_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityIDTerminalRuleCall_3_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_3_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cFeaturesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFeaturesFeatureParserRuleCall_5_0 = (RuleCall)cFeaturesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Entity:
		//    views=Views
		//    'entity' name=ID ('extends' superType=[Entity])? '{'
		//        (features+=Feature)+
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//views=Views
		//'entity' name=ID ('extends' superType=[Entity])? '{'
		//    (features+=Feature)+
		//'}'
		public Group getGroup() { return cGroup; }
		
		//views=Views
		public Assignment getViewsAssignment_0() { return cViewsAssignment_0; }
		
		//Views
		public RuleCall getViewsViewsParserRuleCall_0_0() { return cViewsViewsParserRuleCall_0_0; }
		
		//'entity'
		public Keyword getEntityKeyword_1() { return cEntityKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//('extends' superType=[Entity])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extends'
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }
		
		//superType=[Entity]
		public Assignment getSuperTypeAssignment_3_1() { return cSuperTypeAssignment_3_1; }
		
		//[Entity]
		public CrossReference getSuperTypeEntityCrossReference_3_1_0() { return cSuperTypeEntityCrossReference_3_1_0; }
		
		//ID
		public RuleCall getSuperTypeEntityIDTerminalRuleCall_3_1_0_1() { return cSuperTypeEntityIDTerminalRuleCall_3_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//(features+=Feature)+
		public Assignment getFeaturesAssignment_5() { return cFeaturesAssignment_5; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_5_0() { return cFeaturesFeatureParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdd.Dgen.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cManyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cManyManyKeyword_0_0 = (Keyword)cManyAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cOptionalAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cOptionalQuestionMarkKeyword_2_0 = (Keyword)cOptionalAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTypeTypeCrossReference_4_0 = (CrossReference)cTypeAssignment_4.eContents().get(0);
		private final RuleCall cTypeTypeIDTerminalRuleCall_4_0_1 = (RuleCall)cTypeTypeCrossReference_4_0.eContents().get(1);
		
		//Feature:
		//    (many?='many')? name=ID (optional?='?')? ':' type=[Type];
		@Override public ParserRule getRule() { return rule; }
		
		//(many?='many')? name=ID (optional?='?')? ':' type=[Type]
		public Group getGroup() { return cGroup; }
		
		//(many?='many')?
		public Assignment getManyAssignment_0() { return cManyAssignment_0; }
		
		//'many'
		public Keyword getManyManyKeyword_0_0() { return cManyManyKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(optional?='?')?
		public Assignment getOptionalAssignment_2() { return cOptionalAssignment_2; }
		
		//'?'
		public Keyword getOptionalQuestionMarkKeyword_2_0() { return cOptionalQuestionMarkKeyword_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//type=[Type]
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//[Type]
		public CrossReference getTypeTypeCrossReference_4_0() { return cTypeTypeCrossReference_4_0; }
		
		//ID
		public RuleCall getTypeTypeIDTerminalRuleCall_4_0_1() { return cTypeTypeIDTerminalRuleCall_4_0_1; }
	}
	public class ViewGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdd.Dgen.ViewGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNameAlternatives_1_0 = (Alternatives)cNameAssignment_1.eContents().get(0);
		private final Keyword cNameAllKeyword_1_0_0 = (Keyword)cNameAlternatives_1_0.eContents().get(0);
		private final Keyword cNameNoneKeyword_1_0_1 = (Keyword)cNameAlternatives_1_0.eContents().get(1);
		
		//ViewGroup:
		//    '@' name=('All' | 'None');
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name=('All' | 'None')
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name=('All' | 'None')
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//('All' | 'None')
		public Alternatives getNameAlternatives_1_0() { return cNameAlternatives_1_0; }
		
		//'All'
		public Keyword getNameAllKeyword_1_0_0() { return cNameAllKeyword_1_0_0; }
		
		//'None'
		public Keyword getNameNoneKeyword_1_0_1() { return cNameNoneKeyword_1_0_1; }
	}
	public class ViewOptionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdd.Dgen.ViewOptions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNameAlternatives_1_0 = (Alternatives)cNameAssignment_1.eContents().get(0);
		private final Keyword cNameCreateKeyword_1_0_0 = (Keyword)cNameAlternatives_1_0.eContents().get(0);
		private final Keyword cNameReadKeyword_1_0_1 = (Keyword)cNameAlternatives_1_0.eContents().get(1);
		private final Keyword cNameUpdateKeyword_1_0_2 = (Keyword)cNameAlternatives_1_0.eContents().get(2);
		private final Keyword cNameDeleteKeyword_1_0_3 = (Keyword)cNameAlternatives_1_0.eContents().get(3);
		
		//ViewOptions:
		//    '@' name=('Create' | 'Read' | 'Update' | 'Delete');
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name=('Create' | 'Read' | 'Update' | 'Delete')
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name=('Create' | 'Read' | 'Update' | 'Delete')
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//('Create' | 'Read' | 'Update' | 'Delete')
		public Alternatives getNameAlternatives_1_0() { return cNameAlternatives_1_0; }
		
		//'Create'
		public Keyword getNameCreateKeyword_1_0_0() { return cNameCreateKeyword_1_0_0; }
		
		//'Read'
		public Keyword getNameReadKeyword_1_0_1() { return cNameReadKeyword_1_0_1; }
		
		//'Update'
		public Keyword getNameUpdateKeyword_1_0_2() { return cNameUpdateKeyword_1_0_2; }
		
		//'Delete'
		public Keyword getNameDeleteKeyword_1_0_3() { return cNameDeleteKeyword_1_0_3; }
	}
	public class ViewsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mdd.Dgen.Views");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cViewGroupAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cViewGroupViewGroupParserRuleCall_0_0 = (RuleCall)cViewGroupAssignment_0.eContents().get(0);
		private final Assignment cViewOptionAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cViewOptionViewOptionsParserRuleCall_1_0 = (RuleCall)cViewOptionAssignment_1.eContents().get(0);
		
		//Views:
		//    (viewGroup=ViewGroup) | (viewOption+=ViewOptions)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(viewGroup=ViewGroup) | (viewOption+=ViewOptions)+
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//(viewGroup=ViewGroup)
		public Assignment getViewGroupAssignment_0() { return cViewGroupAssignment_0; }
		
		//ViewGroup
		public RuleCall getViewGroupViewGroupParserRuleCall_0_0() { return cViewGroupViewGroupParserRuleCall_0_0; }
		
		//(viewOption+=ViewOptions)+
		public Assignment getViewOptionAssignment_1() { return cViewOptionAssignment_1; }
		
		//ViewOptions
		public RuleCall getViewOptionViewOptionsParserRuleCall_1_0() { return cViewOptionViewOptionsParserRuleCall_1_0; }
	}
	
	
	private final DomainmodelElements pDomainmodel;
	private final TypeElements pType;
	private final DataTypeElements pDataType;
	private final EntityElements pEntity;
	private final FeatureElements pFeature;
	private final ViewGroupElements pViewGroup;
	private final ViewOptionsElements pViewOptions;
	private final ViewsElements pViews;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DgenGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomainmodel = new DomainmodelElements();
		this.pType = new TypeElements();
		this.pDataType = new DataTypeElements();
		this.pEntity = new EntityElements();
		this.pFeature = new FeatureElements();
		this.pViewGroup = new ViewGroupElements();
		this.pViewOptions = new ViewOptionsElements();
		this.pViews = new ViewsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.mdd.Dgen".equals(grammar.getName())) {
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

	
	//Domainmodel:
	//    (elements+=Type)*;
	public DomainmodelElements getDomainmodelAccess() {
		return pDomainmodel;
	}
	
	public ParserRule getDomainmodelRule() {
		return getDomainmodelAccess().getRule();
	}
	
	//Type:
	//    DataType | Entity;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//DataType:
	//    'datatype' name=ID;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//Entity:
	//    views=Views
	//    'entity' name=ID ('extends' superType=[Entity])? '{'
	//        (features+=Feature)+
	//    '}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Feature:
	//    (many?='many')? name=ID (optional?='?')? ':' type=[Type];
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//ViewGroup:
	//    '@' name=('All' | 'None');
	public ViewGroupElements getViewGroupAccess() {
		return pViewGroup;
	}
	
	public ParserRule getViewGroupRule() {
		return getViewGroupAccess().getRule();
	}
	
	//ViewOptions:
	//    '@' name=('Create' | 'Read' | 'Update' | 'Delete');
	public ViewOptionsElements getViewOptionsAccess() {
		return pViewOptions;
	}
	
	public ParserRule getViewOptionsRule() {
		return getViewOptionsAccess().getRule();
	}
	
	//Views:
	//    (viewGroup=ViewGroup) | (viewOption+=ViewOptions)+;
	public ViewsElements getViewsAccess() {
		return pViews;
	}
	
	public ParserRule getViewsRule() {
		return getViewsAccess().getRule();
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

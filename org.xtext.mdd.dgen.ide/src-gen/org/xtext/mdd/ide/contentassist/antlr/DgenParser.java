/*
 * generated by Xtext 2.25.0
 */
package org.xtext.mdd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.mdd.ide.contentassist.antlr.internal.InternalDgenParser;
import org.xtext.mdd.services.DgenGrammarAccess;

public class DgenParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DgenGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DgenGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getViewGroupAccess().getNameAlternatives_1_0(), "rule__ViewGroup__NameAlternatives_1_0");
			builder.put(grammarAccess.getViewOptionsAccess().getNameAlternatives_1_0(), "rule__ViewOptions__NameAlternatives_1_0");
			builder.put(grammarAccess.getViewsAccess().getAlternatives(), "rule__Views__Alternatives");
			builder.put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_3(), "rule__Entity__Group_3__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getViewGroupAccess().getGroup(), "rule__ViewGroup__Group__0");
			builder.put(grammarAccess.getViewOptionsAccess().getGroup(), "rule__ViewOptions__Group__0");
			builder.put(grammarAccess.getDomainmodelAccess().getElementsAssignment(), "rule__Domainmodel__ElementsAssignment");
			builder.put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getViewsAssignment_0(), "rule__Entity__ViewsAssignment_0");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
			builder.put(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1(), "rule__Entity__SuperTypeAssignment_3_1");
			builder.put(grammarAccess.getEntityAccess().getFeaturesAssignment_5(), "rule__Entity__FeaturesAssignment_5");
			builder.put(grammarAccess.getFeatureAccess().getManyAssignment_0(), "rule__Feature__ManyAssignment_0");
			builder.put(grammarAccess.getFeatureAccess().getNameAssignment_1(), "rule__Feature__NameAssignment_1");
			builder.put(grammarAccess.getFeatureAccess().getTypeAssignment_3(), "rule__Feature__TypeAssignment_3");
			builder.put(grammarAccess.getViewGroupAccess().getNameAssignment_1(), "rule__ViewGroup__NameAssignment_1");
			builder.put(grammarAccess.getViewOptionsAccess().getNameAssignment_1(), "rule__ViewOptions__NameAssignment_1");
			builder.put(grammarAccess.getViewsAccess().getViewGroupAssignment_0(), "rule__Views__ViewGroupAssignment_0");
			builder.put(grammarAccess.getViewsAccess().getViewOptionAssignment_1(), "rule__Views__ViewOptionAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DgenGrammarAccess grammarAccess;

	@Override
	protected InternalDgenParser createParser() {
		InternalDgenParser result = new InternalDgenParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DgenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DgenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

/*
 * generated by Xtext 2.21.0
 */
package de.fraunhofer.ipa.rossystem.parser.antlr;

import com.google.inject.Inject;
import de.fraunhofer.ipa.rossystem.parser.antlr.internal.InternalRosSystemParser;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class RosSystemParser extends AbstractAntlrParser {

	@Inject
	private RosSystemGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRosSystemParser createParser(XtextTokenStream stream) {
		return new InternalRosSystemParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RosSystem";
	}

	public RosSystemGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RosSystemGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

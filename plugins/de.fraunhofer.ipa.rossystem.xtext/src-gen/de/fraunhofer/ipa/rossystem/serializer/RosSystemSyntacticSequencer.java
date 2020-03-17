/*
 * generated by Xtext 2.21.0
 */
package de.fraunhofer.ipa.rossystem.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RosSystemSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RosSystemGrammarAccess grammarAccess;
	protected AbstractElementAlias match_RosSystem___ActionConnectionsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q;
	protected AbstractElementAlias match_RosSystem___ParametersKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q;
	protected AbstractElementAlias match_RosSystem___RosComponentsKeyword_5_0_LeftParenthesisKeyword_5_1_RightParenthesisKeyword_5_3__q;
	protected AbstractElementAlias match_RosSystem___ServiceConnectionsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q;
	protected AbstractElementAlias match_RosSystem___TopicConnectionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RosSystemGrammarAccess) access;
		match_RosSystem___ActionConnectionsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getActionConnectionsKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_8_3()));
		match_RosSystem___ParametersKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getParametersKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_9_3()));
		match_RosSystem___RosComponentsKeyword_5_0_LeftParenthesisKeyword_5_1_RightParenthesisKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getRosComponentsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_5_3()));
		match_RosSystem___ServiceConnectionsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7_3()));
		match_RosSystem___TopicConnectionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_RosSystem___ActionConnectionsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q.equals(syntax))
				emit_RosSystem___ActionConnectionsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RosSystem___ParametersKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q.equals(syntax))
				emit_RosSystem___ParametersKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RosSystem___RosComponentsKeyword_5_0_LeftParenthesisKeyword_5_1_RightParenthesisKeyword_5_3__q.equals(syntax))
				emit_RosSystem___RosComponentsKeyword_5_0_LeftParenthesisKeyword_5_1_RightParenthesisKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RosSystem___ServiceConnectionsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q.equals(syntax))
				emit_RosSystem___ServiceConnectionsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RosSystem___TopicConnectionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_RosSystem___TopicConnectionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('ActionConnections' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     Name=EString ('RosComponents' '(' ')')? ('TopicConnections' '{' '}')? ('ServiceConnections' '{' '}')? (ambiguity) 'Parameters' '{' Parameter+=Parameter
	 *     Name=EString ('RosComponents' '(' ')')? ('TopicConnections' '{' '}')? ('ServiceConnections' '{' '}')? (ambiguity) ('Parameters' '{' '}')? '}' (rule end)
	 *     RosComponent+=ComponentInterface ')' ('TopicConnections' '{' '}')? ('ServiceConnections' '{' '}')? (ambiguity) 'Parameters' '{' Parameter+=Parameter
	 *     RosComponent+=ComponentInterface ')' ('TopicConnections' '{' '}')? ('ServiceConnections' '{' '}')? (ambiguity) ('Parameters' '{' '}')? '}' (rule end)
	 *     ServiceConnections+=ServiceConnection '}' (ambiguity) 'Parameters' '{' Parameter+=Parameter
	 *     ServiceConnections+=ServiceConnection '}' (ambiguity) ('Parameters' '{' '}')? '}' (rule end)
	 *     TopicConnections+=TopicConnection '}' ('ServiceConnections' '{' '}')? (ambiguity) 'Parameters' '{' Parameter+=Parameter
	 *     TopicConnections+=TopicConnection '}' ('ServiceConnections' '{' '}')? (ambiguity) ('Parameters' '{' '}')? '}' (rule end)
	 */
	protected void emit_RosSystem___ActionConnectionsKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('Parameters' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     ActionConnections+=ActionConnection '}' (ambiguity) '}' (rule end)
	 *     Name=EString ('RosComponents' '(' ')')? ('TopicConnections' '{' '}')? ('ServiceConnections' '{' '}')? ('ActionConnections' '{' '}')? (ambiguity) '}' (rule end)
	 *     RosComponent+=ComponentInterface ')' ('TopicConnections' '{' '}')? ('ServiceConnections' '{' '}')? ('ActionConnections' '{' '}')? (ambiguity) '}' (rule end)
	 *     ServiceConnections+=ServiceConnection '}' ('ActionConnections' '{' '}')? (ambiguity) '}' (rule end)
	 *     TopicConnections+=TopicConnection '}' ('ServiceConnections' '{' '}')? ('ActionConnections' '{' '}')? (ambiguity) '}' (rule end)
	 */
	protected void emit_RosSystem___ParametersKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('RosComponents' '(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     Name=EString (ambiguity) 'TopicConnections' '{' TopicConnections+=TopicConnection
	 *     Name=EString (ambiguity) ('TopicConnections' '{' '}')? 'ServiceConnections' '{' ServiceConnections+=ServiceConnection
	 *     Name=EString (ambiguity) ('TopicConnections' '{' '}')? ('ServiceConnections' '{' '}')? 'ActionConnections' '{' ActionConnections+=ActionConnection
	 *     Name=EString (ambiguity) ('TopicConnections' '{' '}')? ('ServiceConnections' '{' '}')? ('ActionConnections' '{' '}')? 'Parameters' '{' Parameter+=Parameter
	 *     Name=EString (ambiguity) ('TopicConnections' '{' '}')? ('ServiceConnections' '{' '}')? ('ActionConnections' '{' '}')? ('Parameters' '{' '}')? '}' (rule end)
	 */
	protected void emit_RosSystem___RosComponentsKeyword_5_0_LeftParenthesisKeyword_5_1_RightParenthesisKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('ServiceConnections' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     Name=EString ('RosComponents' '(' ')')? ('TopicConnections' '{' '}')? (ambiguity) 'ActionConnections' '{' ActionConnections+=ActionConnection
	 *     Name=EString ('RosComponents' '(' ')')? ('TopicConnections' '{' '}')? (ambiguity) ('ActionConnections' '{' '}')? 'Parameters' '{' Parameter+=Parameter
	 *     Name=EString ('RosComponents' '(' ')')? ('TopicConnections' '{' '}')? (ambiguity) ('ActionConnections' '{' '}')? ('Parameters' '{' '}')? '}' (rule end)
	 *     RosComponent+=ComponentInterface ')' ('TopicConnections' '{' '}')? (ambiguity) 'ActionConnections' '{' ActionConnections+=ActionConnection
	 *     RosComponent+=ComponentInterface ')' ('TopicConnections' '{' '}')? (ambiguity) ('ActionConnections' '{' '}')? 'Parameters' '{' Parameter+=Parameter
	 *     RosComponent+=ComponentInterface ')' ('TopicConnections' '{' '}')? (ambiguity) ('ActionConnections' '{' '}')? ('Parameters' '{' '}')? '}' (rule end)
	 *     TopicConnections+=TopicConnection '}' (ambiguity) 'ActionConnections' '{' ActionConnections+=ActionConnection
	 *     TopicConnections+=TopicConnection '}' (ambiguity) ('ActionConnections' '{' '}')? 'Parameters' '{' Parameter+=Parameter
	 *     TopicConnections+=TopicConnection '}' (ambiguity) ('ActionConnections' '{' '}')? ('Parameters' '{' '}')? '}' (rule end)
	 */
	protected void emit_RosSystem___ServiceConnectionsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('TopicConnections' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     Name=EString ('RosComponents' '(' ')')? (ambiguity) 'ServiceConnections' '{' ServiceConnections+=ServiceConnection
	 *     Name=EString ('RosComponents' '(' ')')? (ambiguity) ('ServiceConnections' '{' '}')? 'ActionConnections' '{' ActionConnections+=ActionConnection
	 *     Name=EString ('RosComponents' '(' ')')? (ambiguity) ('ServiceConnections' '{' '}')? ('ActionConnections' '{' '}')? 'Parameters' '{' Parameter+=Parameter
	 *     Name=EString ('RosComponents' '(' ')')? (ambiguity) ('ServiceConnections' '{' '}')? ('ActionConnections' '{' '}')? ('Parameters' '{' '}')? '}' (rule end)
	 *     RosComponent+=ComponentInterface ')' (ambiguity) 'ServiceConnections' '{' ServiceConnections+=ServiceConnection
	 *     RosComponent+=ComponentInterface ')' (ambiguity) ('ServiceConnections' '{' '}')? 'ActionConnections' '{' ActionConnections+=ActionConnection
	 *     RosComponent+=ComponentInterface ')' (ambiguity) ('ServiceConnections' '{' '}')? ('ActionConnections' '{' '}')? 'Parameters' '{' Parameter+=Parameter
	 *     RosComponent+=ComponentInterface ')' (ambiguity) ('ServiceConnections' '{' '}')? ('ActionConnections' '{' '}')? ('Parameters' '{' '}')? '}' (rule end)
	 */
	protected void emit_RosSystem___TopicConnectionsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

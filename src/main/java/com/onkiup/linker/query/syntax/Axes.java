package com.onkiup.linker.query.syntax;

import java.util.Set;

import com.onkiup.linker.evaluator.api.Evaluator;
import com.onkiup.linker.evaluator.api.Invoker;
import com.onkiup.linker.parser.Rule;
import com.onkiup.linker.parser.annotation.IgnoreCase;
import com.onkiup.linker.parser.annotation.MatchTerminal;

@IgnoreCase
public enum Axes implements QueryElement, Invoker<Axes,Set<Rule>> {
  @MatchTerminal("ancestor::")
  ANCESTOR,
  @MatchTerminal("ancestor-or-self::")
  ANCESTOR_OR_SELF,
  @MatchTerminal("attribute::")
  ATTRIBUTE,
  @MatchTerminal("child::")
  CHILD,
  @MatchTerminal("descendant::")
  DESCENDANT,
  @MatchTerminal("descendant-or-self::")
  DESCENDANT_OR_SELF,
  @MatchTerminal("following::")
  FOLLOWING,
  @MatchTerminal("following-sibling::")
  FOLLOWING_SIBLING,
  @MatchTerminal("namespace::")
  NAMESPACE,
  @MatchTerminal("parent::")
  PARENT,
  @MatchTerminal("preceding::")
  PRECEEDING,
  @MatchTerminal("self::")
  SELF;

  @Override
  public Axes execute(Evaluator... evaluators) {

  }
}


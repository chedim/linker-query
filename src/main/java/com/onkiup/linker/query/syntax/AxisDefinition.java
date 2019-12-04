package com.onkiup.linker.query.syntax;

import com.onkiup.linker.parser.annotation.CapturePattern;
import com.onkiup.linker.query.util.Constants;


public class AxisDefinition implements QueryElement {
  
  @CapturePattern(Constants.PATTERN_NAME)
  private String name;

  public String name() {

  }
}


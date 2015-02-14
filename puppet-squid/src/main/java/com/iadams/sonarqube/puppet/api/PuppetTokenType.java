package com.iadams.sonarqube.puppet.api;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.TokenType;

/**
 * Created by iwarapter on 16/12/14.
 */
public enum PuppetTokenType implements TokenType {
    IDENTIFIER,
    VARIABLE,
    NUMERIC_LITERAL,
    REGULAR_EXPRESSION_LITERAL,
    EMPTY;

    public String getName() {
        return name();
    }

    public String getValue() {
        return name();
    }

    public boolean hasToBeSkippedFromAst(AstNode node) {
        return false;
    }

}

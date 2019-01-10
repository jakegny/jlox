package com.jakegny.lox;

public class RuntimeError extends RuntimeException {
    final Token token;

    RuntimeError(Token token, String message) {
        // TODO: mash in token to message?
        super(message);
        this.token = token;
    }
}

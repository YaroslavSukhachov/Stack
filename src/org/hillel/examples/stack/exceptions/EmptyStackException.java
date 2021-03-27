package org.hillel.examples.stack.exceptions;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException(String message) {
        super(message);
    }
}

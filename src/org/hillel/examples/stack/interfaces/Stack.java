package org.hillel.examples.stack.interfaces;

public interface Stack {
    void push(char element);
    char pop();
    char peek();

    boolean isEmpty();
    int capacity();
}

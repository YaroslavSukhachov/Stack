package org.hillel.examples.stack.interfaces;

import org.hillel.examples.stack.exceptions.EmptyStackException;

public interface Stack<T> {
    void push(T element);
    T pop();
    T peek();

    boolean isEmpty();
    int capacity();
}

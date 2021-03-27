package org.hillel.examples.stack.classes;

import org.hillel.examples.stack.exceptions.EmptyStackException;
import org.hillel.examples.stack.interfaces.Stack;

public class LinkedStack<T> implements Stack<T> {

    private StackNode<T> top;

    @Override
    public void push(T element) {
        StackNode stackNode = new StackNode(element);
        stackNode.setPrev(top);

        top = stackNode;
    }

    @Override
    public T pop() {
        checkIsEmpty();
        T result = top.getData();
        top = top.getPrev();

        return result;
    }

    @Override
    public T peek() {
        checkIsEmpty();
        return top.getData();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int capacity() {
        return 0;
    }

    private void checkIsEmpty() {
        if (isEmpty()) {
            throw new EmptyStackException("Стек пустой");
        }
    }
}

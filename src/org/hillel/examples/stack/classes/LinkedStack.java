package org.hillel.examples.stack.classes;

import org.hillel.examples.stack.interfaces.Stack;

public class LinkedStack implements Stack {

    private Node top;

    @Override
    public void push(char element) {
        Node node = new Node(element);
        node.setPrev(top);

        top = node;
    }

    @Override
    public char pop() {
        char result = top.getData();
        top = top.getPrev();

        return result;
    }

    @Override
    public char peek() {
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
}

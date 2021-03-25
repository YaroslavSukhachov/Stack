package org.hillel.examples.stack.classes;

import org.hillel.examples.stack.interfaces.Stack;

public class LinkedStack<T> implements Stack<T> {

    private Node<T> top;

    @Override
    public void push(T element) {
        Node node = new Node(element);
        node.setPrev(top);

        top = node;
    }

    @Override
    public T pop() {
        T result = top.getData();
        top = top.getPrev();

        return result;
    }

    @Override
    public T peek() {
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

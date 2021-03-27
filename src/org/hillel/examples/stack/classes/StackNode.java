package org.hillel.examples.stack.classes;

public class StackNode<T> {
    private T data;
    private StackNode prev;

    public StackNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StackNode getPrev() {
        return prev;
    }

    public void setPrev(StackNode prev) {
        this.prev = prev;
    }
}

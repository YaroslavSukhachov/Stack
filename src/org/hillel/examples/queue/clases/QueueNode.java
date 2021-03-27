package org.hillel.examples.queue.clases;

public class QueueNode<T> {
    private T data;
    private QueueNode<T> prev;
    private QueueNode<T> next;

    public QueueNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public QueueNode<T> getPrev() {
        return prev;
    }

    public void setPrev(QueueNode<T> prev) {
        this.prev = prev;
    }

    public QueueNode<T> getNext() {
        return next;
    }

    public void setNext(QueueNode<T> next) {
        this.next = next;
    }
}

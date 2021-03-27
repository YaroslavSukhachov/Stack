package org.hillel.examples.queue.interfaces;

public interface Queue<T> {
    void add(T element);
    T remove();

    boolean isEmpty();
}

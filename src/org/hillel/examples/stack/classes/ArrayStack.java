package org.hillel.examples.stack.classes;

import org.hillel.examples.stack.interfaces.Stack;

public class ArrayStack<T> implements Stack<T> {
    private Object[] elements;
    private int capacity;
    private int topIndex = -1;

    public ArrayStack() {
        capacity = 10;
        elements = new Object[capacity];
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        elements = new Object[this.capacity];
    }

    @Override
    public void push(T element) {
        checkCapacity(topIndex + 1);
        elements[++topIndex] = element;
    }

    @Override
    public T pop() {
        checkCapacity(topIndex - 1);
        return (T) elements[topIndex--];
    }

    @Override
    public T peek() {
        return (T) elements[topIndex];
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    private void checkCapacity(int size) {
        if (size == capacity) {
            increaseCapacity(size);
        } else if (size == capacity / 2) {
            decreaseCapacity(size);
        }
    }

    private void increaseCapacity(int size) {
        capacity *= 2;
        copyData();
    }

    private void decreaseCapacity(int size) {
        capacity -= capacity / 4;
        copyData();
    }

    private void copyData() {
        Object[] temp = elements;
        elements = new Object[capacity];

        for (int i = 0; i <= topIndex; i++) {
            elements[i] = temp[i];
        }
//            elements = Arrays.copyOf(elements, capacity);
    }
}

package org.hillel.examples;

import org.hillel.examples.stack.classes.LinkedStack;
import org.hillel.examples.stack.interfaces.Stack;

public class Main {

    public static void main(String[] args) {

//        Stack org.hillel.examples.stack = new ArrayStack(1);
        Stack stack = new LinkedStack();
//        System.out.println("capacity = " + org.hillel.examples.stack.capacity());

        String string = "Строка";
        for (char c : string.toCharArray()) {
            stack.push(c);
//            System.out.println("capacity = " + org.hillel.examples.stack.capacity());
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
//            System.out.println("capacity = " + org.hillel.examples.stack.capacity());
        }

    }
}

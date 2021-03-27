package org.hillel.examples;

import org.hillel.examples.homework.*;
import org.hillel.examples.queue.clases.LinkedQueue;
import org.hillel.examples.queue.exceptions.EmptyQueueException;
import org.hillel.examples.queue.interfaces.Queue;
import org.hillel.examples.stack.classes.LinkedStack;
import org.hillel.examples.stack.exceptions.EmptyStackException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(String.format("%2s", Integer.toBinaryString(1)).replace(" ", "0"));
        List<String> result = StringUtils.getStringsWithPoints("abcd");
        for (String line : result) {
            System.out.println(line);
        }

        String expression = "{[(1 + 2)] * (2 + 3)}";
        if (StringUtils.checkBrackets(expression)) {
            System.out.println("String is valid");
        } else {
            System.out.println("String is invalid");
        }

    }
}

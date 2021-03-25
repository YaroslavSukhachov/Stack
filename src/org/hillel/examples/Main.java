package org.hillel.examples;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

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

package org.hillel.examples;

import org.hillel.examples.stack.classes.LinkedStack;
import org.hillel.examples.stack.interfaces.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {

    public static List<String> getStringsWithPoints(String value) {
        List<String> result = new ArrayList<>();

        int maxDotsAmount = value.length() - 1;
        int allCombinationAmount = (int) Math.pow(2, maxDotsAmount);

        for (int i = 0; i < allCombinationAmount; i++) {
            String dotsPosition =
                    String.format("%" + maxDotsAmount + "s", Integer.toBinaryString(i))
                        .replace(" ", "0");

            StringBuilder line = new StringBuilder();
            for (int j = 0; j < value.length(); j++) {
                line.append(value.charAt(j)).append(j != maxDotsAmount && dotsPosition.charAt(j) == '1' ? "." : "");
            }

            result.add(line.toString());
        }

        return result;
    }

    public static boolean checkBrackets(String expression) {
        Stack<Character> stack = new LinkedStack<>();

        for (char c : expression.toCharArray()) {

            char tempBracket = ' ';
            switch (c) {
                case '(':
                case '[':
                case '{':
                case '<':
                    stack.push(c);
                    break;
                case ')':
                    tempBracket = '(';
                    break;
                case ']':
                    tempBracket = '[';
                    break;
                case '}':
                    tempBracket = '{';
                    break;
                case '>':
                    tempBracket = '<';
                    break;
            }

            if (!stack.isEmpty() && stack.peek() == tempBracket) {
                stack.pop();
            } else if (tempBracket != ' ') {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}

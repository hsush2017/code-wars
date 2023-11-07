package org.example;

import java.util.Stack;

public class SimpleStringExpansion {

    public String solve(String str) {
        Stack<Character> stack = toStack(str);

        return expand(stack);
    }

    private Stack<Character> toStack(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch != ')') {
                stack.push(ch);
            }
        }
        return stack;
    }

    private String expand(Stack<Character> stack) {
        StringBuilder result = new StringBuilder();
        boolean brace = false;

        while (!stack.isEmpty()) {
            Character ch = stack.pop();

            if (!brace) {
                if (ch != '(') {
                    result.insert(0, ch);
                } else {
                    brace = true;
                }
            } else {
                if (ch >= 48 && ch <= 57) {
                    result = expansion(ch - 48, result.toString());
                    brace = false;
                } else if (ch != '(') {
                    result.insert(0, ch);
                }
            }
        }

        return result.toString();
    }

    private StringBuilder expansion(int times, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }

        return sb;
    }
}

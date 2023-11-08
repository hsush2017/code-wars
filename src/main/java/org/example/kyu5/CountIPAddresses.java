package org.example.kyu5;

import java.util.Stack;

// https://www.codewars.com/kata/526989a41034285187000de4
public class CountIPAddresses {
    public long ipsBetween(String start, String end) {
        return count(end) - count(start);
    }

    private long count(String ip) {
        int cnt = 0;
        long result = 0;
        Stack<Integer> stack = convert(ip);

        while (!stack.isEmpty()) {
            result += (long) (Math.pow(256, cnt++) * stack.pop());
        }

        return result;
    }

    private Stack<Integer> convert(String start) {
        Stack<Integer> stack = new Stack<>();

        for (String s : start.split("\\.")) {
            stack.push(Integer.parseInt(s));
        }

        return stack;
    }
}

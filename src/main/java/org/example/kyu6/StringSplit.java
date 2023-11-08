package org.example.kyu6;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/515de9ae9dcfc28eb6000001
public class StringSplit {
    public String[] solution(String s) {
        if (s.length() % 2 > 0) {
            s += "_";
        }

        List<String> result = new ArrayList<>();
        while (!s.isEmpty()) {
            String subStr = s.substring(0, 2);
            s = s.replaceFirst(subStr, "");
            result.add(subStr);
        }

        return result.toArray(new String[0]);
    }
}

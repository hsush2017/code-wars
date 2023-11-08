package org.example.kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/59f4a0acbee84576800000af
public class PositionsAverage {
    public double posAverage(String s) {
        List<String> list = Arrays.stream(s.split(",")).map(String::trim).collect(Collectors.toList());
        int combinations = (list.size() * (list.size() - 1)) / 2;
        int cnt = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (j <= i) {
                    continue;
                }

                cnt += calculate(list.get(i), list.get(j));
            }
        }

        return ((cnt * 1D) / (list.get(0).length() * combinations)) * 100;
    }

    private int calculate(String str1, String str2) {
        int cnt = 0;
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == chars2[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}

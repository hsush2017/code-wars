package org.example.kyu5;

// https://www.codewars.com/kata/5282b48bb70058e4c4000fa7
public class HexToRGB {
    public int[] hexStringToRGB(String hex) {
        return new int[]{toRGB(hex.substring(1, 3)), toRGB(hex.substring(3, 5)), toRGB(hex.substring(5, 7))};
    }

    private int toRGB(String hex) {
        return 16 * toDecimal(hex.substring(0, 1)) + toDecimal(hex.substring(1, 2));
    }

    private int toDecimal(String s) {
        if (s.equalsIgnoreCase("A")) {
            return 10;
        } else if (s.equalsIgnoreCase("B")) {
            return 11;
        } else if (s.equalsIgnoreCase("C")) {
            return 12;
        } else if (s.equalsIgnoreCase("D")) {
            return 13;
        } else if (s.equalsIgnoreCase("E")) {
            return 14;
        } else if (s.equalsIgnoreCase("F")) {
            return 15;
        } else {
            return Integer.parseInt(s);
        }
    }
}

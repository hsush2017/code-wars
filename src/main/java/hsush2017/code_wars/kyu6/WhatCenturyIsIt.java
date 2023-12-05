package hsush2017.code_wars.kyu6;

// https://www.codewars.com/kata/52fb87703c1351ebd200081f
public class WhatCenturyIsIt {
    public String whatCentury(int year) {
        if (year % 100 == 0) {
            return year / 100 + "th";
        }

        int century = (year / 100) + 1;
        return century + toOrdinalNumber(century);
    }

    private String toOrdinalNumber(int n) {
        if (n < 10) {
            if (n == 1) {
                return "st";
            } else if (n == 2) {
                return "nd";
            } else if (n == 3) {
                return "rd";
            }
        }

        if (n > 20 && n < 100) {
            return toOrdinalNumber(n % 10);
        }

        return "th";
    }
}

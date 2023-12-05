package org.example.kyu5;

// https://www.codewars.com/kata/513e08acc600c94f01000001

public class RGBToHex {

    public String rgb(int r, int g, int b) {
        return toHex(r) + toHex(g) + toHex(b);
    }

    private String toHex(int n) {
        if (n < 0) {
            n = 0;
        } else if (n > 255) {
            n = 255;
        }

        return (Integer.toHexString(n / 16) + Integer.toHexString(n - (n / 16 * 16))).toUpperCase();
    }
}

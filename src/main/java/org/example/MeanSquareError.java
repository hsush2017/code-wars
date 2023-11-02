package org.example;

public class MeanSquareError {
    public double solution(int[] arr1, int[] arr2) {
        double value = 0D;
        for (int i = 0; i < arr1.length; i++) {
            value += Math.pow(Math.abs(arr1[i] - arr2[i]), 2);
        }

        return value / arr1.length;
    }
}

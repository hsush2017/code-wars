package org.example;

import java.util.stream.IntStream;

public class MeanSquareError {
    public double solution(int[] arr1, int[] arr2) {
        double sum = IntStream.range(0, arr1.length)
                .mapToDouble(i -> Math.pow(Math.abs(arr1[i] - arr2[i]), 2))
                .sum();

        return sum / arr1.length;
    }
}

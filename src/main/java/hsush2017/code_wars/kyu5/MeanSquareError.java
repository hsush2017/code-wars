package hsush2017.code_wars.kyu5;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/51edd51599a189fe7f000015
public class MeanSquareError {
    public double solution(int[] arr1, int[] arr2) {
        double sum = IntStream.range(0, arr1.length)
                .mapToDouble(i -> Math.pow(Math.abs(arr1[i] - arr2[i]), 2))
                .sum();

        return sum / arr1.length;
    }
}

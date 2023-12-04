package org.example.kyu6;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/550498447451fbbd7600041c
public class AreTheyTheSame {
    public boolean comp(int[] a, int[] b) {
        Set<Integer> setA = Arrays.stream(a).boxed().collect(Collectors.toSet());
        Set<Integer> setB = Arrays.stream(b).boxed().collect(Collectors.toSet());

        Set<Integer> sqrtSet = setB.stream().map(n -> (int) Math.sqrt(n)).collect(Collectors.toSet());

        return sqrtSet.containsAll(setA);
    }
}

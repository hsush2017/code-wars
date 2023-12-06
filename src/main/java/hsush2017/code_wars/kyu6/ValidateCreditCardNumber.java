package hsush2017.code_wars.kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/5418a1dd6d8216e18a0012b2/
public class ValidateCreditCardNumber {
    public boolean validate(String str) {
        List<Integer> list = str.chars().map(c -> c - 48).boxed().collect(Collectors.toList());
        List<Integer> doubleList = makeDouble(list);
        List<Integer> sumList = makeSum(doubleList);

        return sumList.stream().mapToInt(Integer::intValue).sum() % 10 == 0;
    }

    private List<Integer> makeDouble(List<Integer> list) {
        if (list.size() % 2 == 0) {
            return IntStream.range(0, list.size())
                    .mapToObj(i -> list.get(i) * (i % 2 == 0 ? 2 : 1))
                    .collect(Collectors.toList());
        } else {
            return IntStream.range(0, list.size())
                    .mapToObj(i -> list.get(i) * (i % 2 != 0 ? 2 : 1))
                    .collect(Collectors.toList());
        }
    }

    private List<Integer> makeSum(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            result.add(i, replace(list.get(i)));
        }

        return result;
    }

    private Integer replace(Integer n) {
        while (n > 9) {
            int tmp = n;
            int sum = 0;
            while (tmp >= 10) {
                sum += tmp / 10;
                tmp %= 10;
            }

            n = sum + (tmp % 10);
        }

        return n;
    }
}

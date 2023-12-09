package hsush2017.code_wars.kyu5;

import java.util.*;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/56f4ff45af5b1f8cd100067d/
public class SortOneThreeTwo {
    public int[] sort(final int[] array) {
        List<Number> numbers = Arrays.stream(array).boxed()
                .map(Number::new)
                .collect(Collectors.toList());

        return numbers.stream()
                .sorted(Comparator.comparing(n -> n.name))
                .mapToInt(n -> n.num)
                .toArray();
    }

    static class Number {
        static final Map<Integer, String> dictionary = new HashMap<>();

        static {
            dictionary.put(0, "zero");
            dictionary.put(1, "one");
            dictionary.put(2, "two");
            dictionary.put(3, "three");
            dictionary.put(4, "four");
            dictionary.put(5, "five");
            dictionary.put(6, "six");
            dictionary.put(7, "seven");
            dictionary.put(8, "eight");
            dictionary.put(9, "nine");
            dictionary.put(10, "ten");
            dictionary.put(11, "eleven");
            dictionary.put(12, "twelve");
            dictionary.put(13, "thirteen");
            dictionary.put(14, "fourteen");
            dictionary.put(15, "fifteen");
            dictionary.put(16, "sixteen");
            dictionary.put(17, "seventeen");
            dictionary.put(18, "eighteen");
            dictionary.put(19, "nineteen");
            dictionary.put(20, "twenty");
            dictionary.put(30, "thirty");
            dictionary.put(40, "forty");
            dictionary.put(50, "fifty");
            dictionary.put(60, "sixty");
            dictionary.put(70, "seventy");
            dictionary.put(80, "eighty");
            dictionary.put(90, "ninety");
        }

        final int num;
        final String name;

        public Number(int num) {
            this.num = num;
            this.name = toName(num);
        }

        private String toName(int num) {
            List<Integer> list = num == 0 ? Collections.singletonList(0) : toList(num);

            StringBuilder sb = new StringBuilder();

            if (list.size() == 3) {
                sb.append(dictionary.get(list.get(0))).append(" hundred");

                int remain = list.get(1) * 10 + list.get(2);
                if (remain > 0) {
                    sb.append(" ").append(
                            dictionary.containsKey(remain) ?
                                    dictionary.get(remain) :
                                    dictionary.get(list.get(1) * 10)).append(" ").append(list.get(2) == 0 ? "" : dictionary.get(list.get(2)));
                }
            } else if (list.size() == 2) {
                int value = list.get(0) * 10 + list.get(1);
                if (dictionary.containsKey(value)) {
                    sb.append(dictionary.get(value));
                } else {
                    sb.append(dictionary.get(list.get(0) * 10))
                            .append(" ")
                            .append(list.get(1) == 0 ? "" : dictionary.get(list.get(1)));
                }
            } else {
                sb.append(dictionary.get(list.get(0)));
            }

            return sb.toString();
        }

        private List<Integer> toList(int num) {
            List<Integer> list = new ArrayList<>();
            while (num > 0) {
                list.add(num % 10);
                num = num / 10;
            }

            Collections.reverse(list);

            return list;
        }
    }
}

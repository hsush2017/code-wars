package hsush2017.code_wars.kyu5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.codewars.com/kata/550f22f4d758534c1100025a
public class DirReduction {
    public String[] dirReduc(String[] arr) {
        return doWork(Arrays.asList(arr));
    }

    private String[] doWork(List<String> arr) {
        boolean recursive = false;
        List<String> list = new ArrayList<>();

        int i;
        for (i = 0; i < arr.size() - 1; ) {
            String current = arr.get(i);
            String next = arr.get(i + 1);

            if (!needle(current, next)) {
                list.add(current);
                i += 1;
            } else {
                i += 2;
                recursive = true;
            }
        }

        if(i == arr.size() - 1) {
            list.add(arr.get(arr.size() - 1));
        }



        if (recursive) {
            return doWork(list);
        }

        return list.toArray(new String[0]);
    }

    private boolean needle(String current, String next) {
        return "NORTH".equals(current) && "SOUTH".equals(next) ||
                "SOUTH".equals(current) && "NORTH".equals(next) ||
                "EAST".equals(current) && "WEST".equals(next) ||
                "WEST".equals(current) && "EAST".equals(next);
    }
}

package hsush2017.code_wars.kyu5;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5279f6fe5ab7f447890006a7
public class PickPeaks {
    public Map<String, List<Integer>> getPeaks(int[] arr) {
        LinkedHashSet<Peak> peaks = new LinkedHashSet<>();

        if (arr.length < 3) {
            return toMap(peaks);
        }

        for (int i = 1; i <= arr.length - 1; i++) {
            int left = left(arr, i);
            int right = right(arr, i);

            if (left != -1 && right != -1) {
                peaks.add(new Peak(i, arr[i], left, right));
            }
        }

        return toMap(peaks);
    }

    private int left(int[] arr, int peakIndex) {
        int index = -1;

        for (int i = peakIndex; i >= 0; i--) {
            if (arr[i] > arr[peakIndex] || (arr[i] == arr[peakIndex] && index != -1)) {
                return index;
            }

            if (arr[i] < arr[peakIndex]) {
                index = i;
            }
        }

        return index;
    }

    private int right(int[] arr, int peakIndex) {
        int index = -1;

        for (int i = peakIndex; i < arr.length; i++) {
            if (arr[i] > arr[peakIndex] || (arr[i] == arr[peakIndex] && index != -1)) {
                return index;
            }

            if (arr[i] < arr[peakIndex]) {
                index = i;
            }
        }

        return index;
    }

    private Map<String, List<Integer>> toMap(LinkedHashSet<Peak> set) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("pos", set.stream().map(p -> p.pos).collect(Collectors.toList()));
        map.put("peaks", set.stream().map(p -> p.value).collect(Collectors.toList()));

        return map;
    }

    static class Peak {
        int pos;
        int value;
        int left;
        int right;

        public Peak(int pos, int value, int left, int right) {
            this.pos = pos;
            this.value = value;
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Peak peak = (Peak) o;

            if (value != peak.value) return false;
            if (left != peak.left) return false;
            return right == peak.right;
        }

        @Override
        public int hashCode() {
            int result = value;
            result = 31 * result + left;
            result = 31 * result + right;
            return result;
        }
    }
}

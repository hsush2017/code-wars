package hsush2017.code_wars.kyu5;

import java.util.ArrayList;
import java.util.List;

//https://www.codewars.com/kata/5550d638a99ddb113e0000a2
public class JosephusPermutation {
    public <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> ans = new ArrayList<>();

        permutation(ans, items, k);

        return ans;
    }

    private <T> void permutation(List<T> ans, List<T> items, int k) {
        if (items.isEmpty()) {
            return;
        }

        int splitIndex;
        if (items.size() < k) {
            splitIndex = (k % items.size() == 0 ? items.size() : k % items.size()) - 1 ;
        } else {
            splitIndex = k - 1;
        }

        ans.add(items.get(splitIndex));

        List<T> newItems = new ArrayList<>();
        newItems.addAll(items.subList(splitIndex + 1, items.size()));
        newItems.addAll(items.subList(0, splitIndex));

        permutation(ans, newItems, k);
    }
}

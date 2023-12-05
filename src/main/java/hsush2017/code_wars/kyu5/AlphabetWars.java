package hsush2017.code_wars.kyu5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/59437bd7d8c9438fb5000004
public class AlphabetWars {
    public String alphabetWar(String battlefield) {
        if (!battlefield.contains("#")) {
            return battlefield.replace("[", "").replace("]", "");
        }

        List<Item> list = toList(battlefield);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isBomb()) {
                destroyLeft(list, i - 1);
                destroyRight(list, i + 1);
            }
        }

        return list.stream().filter(b -> b.heart > 0).map(b -> b.word).collect(Collectors.joining());
    }

    private void destroyRight(List<Item> list, int index) {
        while (index < list.size() && list.get(index).isBomb()) {
            index++;
        }

        if (index < list.size()) {
            list.get(index).hurt();
        }
    }

    private void destroyLeft(List<Item> list, int index) {
        while (index >= 0 && list.get(index).isBomb()) {
            index--;
        }

        if (index >= 0) {
            list.get(index).hurt();
        }
    }

    private List<Item> toList(String battlefield) {
        List<Item> list = new ArrayList<>();

        int i = 0;
        while (!battlefield.isEmpty()) {
            char ch = battlefield.charAt(0);

            if (ch == '#') {
                list.add(Item.createBomb());
                battlefield = battlefield.substring(i + 1);
            } else if (ch == '[') {
                String word = battlefield.substring(i + 1, battlefield.indexOf("]"));
                list.add(Item.createWord(word));
                battlefield = battlefield.substring(word.length() + 2);
            } else {
                battlefield = battlefield.substring(1);
            }
        }

        return list;
    }

    static class Item {
        final String word;
        int heart;

        public Item(String word, int heart) {
            this.word = word;
            this.heart = heart;
        }

        public static Item createBomb() {
            return new Item("#", -1);
        }

        public static Item createWord(String word) {
            return new Item(word, 2);
        }

        public boolean isBomb() {
            return word.equals("#");
        }

        public void hurt() {
            heart--;
        }
    }
}

package hsush2017.code_wars.kyu5;

// https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
public class HighestScoringWord {
    public String high(String s) {
        String[] words = s.split(" ");
        Integer[] scores = new Integer[words.length];

        for (int i = 0; i < words.length; i++) {
            scores[i] = toScore(words[i]);
        }

        int maxIndex = 0;
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxIndex = i;
            }
        }

        return words[maxIndex];
    }

    private int toScore(String word) {
        int score = 0;

        for (char ch : word.toCharArray()) {
            score += ch - 'a' + 1;
        }

        return score;
    }
}

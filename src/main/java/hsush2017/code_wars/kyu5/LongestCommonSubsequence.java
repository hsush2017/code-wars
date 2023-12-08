package hsush2017.code_wars.kyu5;

// https://www.codewars.com/kata/52756e5ad454534f220001ef
public class LongestCommonSubsequence {
    public String lcs(String x, String y) {
        char[] arrX = x.toCharArray();
        char[] arrY = y.toCharArray();

        String s1 = doLCS(arrX, arrY);
        String s2 = doLCS(arrY, arrX);

        return s1.length() > s2.length() ? s1 : s2;
    }

    private String doLCS(char[] arr1, char[] arr2) {
        StringBuilder result = new StringBuilder();
        int i2 = 0;

        for (char ch : arr1) {
            for (int j = i2; j < arr2.length; j++) {
                if (ch == arr2[j]) {
                    result.append(ch);
                    i2 = j + 1;
                    break;
                }
            }
        }

        return result.toString();
    }

}

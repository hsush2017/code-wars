package hsush2017.code_wars.kyu5;

import java.math.BigDecimal;
import java.util.Collections;

// https://www.codewars.com/kata/54a91a4883a7de5d7800009c
public class StringIncrementer {
    public String incrementString(String str) {
        String trailingNum = getTrailingNumber(str);
        String incrementNum = trailingNum.isEmpty() ? "1" : new BigDecimal(trailingNum).add(BigDecimal.ONE).toString();
        String alphabets = str.substring(0, str.length() - trailingNum.length());

        if (incrementNum.length() >= trailingNum.length()) {
            return alphabets + incrementNum;
        } else {
            String leadingZero = String.join("", Collections.nCopies(trailingNum.length() - incrementNum.length(), "0"));

            return alphabets + leadingZero + incrementNum;
        }
    }

    private String getTrailingNumber(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch < 48 || ch > 57) {
                break;
            }

            sb.append(ch);
        }

        return sb.reverse().toString();
    }
}

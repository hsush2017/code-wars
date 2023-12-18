package hsush2017.code_wars.kyu6;

// https://www.codewars.com/kata/630e55d6c8e178000e1badfc/

public class CombinationLock {
    public int degreesOfLock(int initial, int first, int second, int third) {
        int s1 = 360 * 2;
        int s2 = 9 * (initial < first ? 40 + initial - first : initial - first);
        int s3 = 360;
        int s4 = 9 * (second < first ? 40 + second - first : second - first);
        int s5 = 9 * (second < third ? 40 + second - third : second - third);

        return s1 + s2 + s3 + s4 + s5;
    }
}

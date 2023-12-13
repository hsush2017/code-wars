package hsush2017.code_wars.kyu5;

// https://www.codewars.com/kata/52685f7382004e774f0001f7
public class HumanReadableTime {
    public String makeReadable(int seconds) {
        int hour = seconds / 3600;
        int min = (seconds % 3600) / 60;
        int second = (seconds % 3600) % 60;

        return String.format("%02d", hour) + ":" + String.format("%02d", min) + ":" + String.format("%02d", second);
    }
}

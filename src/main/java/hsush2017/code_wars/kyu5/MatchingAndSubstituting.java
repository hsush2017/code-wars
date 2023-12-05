package hsush2017.code_wars.kyu5;

// https://www.codewars.com/kata/59de1e2fe50813a046000124
public class MatchingAndSubstituting {
    public String change(String s, String prog, String version) {
        String[] data = s.split(System.lineSeparator());

        if (!validVersion(data[5].split(": ")[1]) || !validPhone(data[3].split(": ")[1])) {
            return "ERROR: VERSION or PHONE";
        }

        data[0] = "Program: " + prog + " ";
        data[1] = "Author: g964 ";
        data[3] = "Phone: +1-503-555-0090 ";
        data[4] = "Date: 2019-01-01 ";
        if (!"2.0".equals(data[5].split(": ")[1])) {
            data[5] = "Version: " + version;
        }

        return data[0] + data[1] + data[3] + data[4] + data[5];
    }

    private boolean validVersion(String version) {
        return version.matches("\\d+.\\d+");
    }

    private boolean validPhone(String phone) {
        return phone.matches("\\+1-\\d{3}-\\d{3}-\\d{4}");
    }
}

package hsush2017.code_wars.kyu5;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class MatchingAndSubstitutingTest {
    private MatchingAndSubstituting sut;

    @Before
    public void setUp() throws Exception {
        sut = new MatchingAndSubstituting();
    }

    @Test
    public void test1() {
        String str = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha";
        String answer = sut.change(str, "Ladder", "1.1");

        Assertions.assertThat(answer).isEqualTo("Program: Ladder Author: g964 Phone: +1-503-555-0090 Date: 2019-01-01 Version: 1.1");
    }

    @Test
    public void test2() {
        String str = "Program title: Hammer\nAuthor: Tolkien\nCorporation: IB\nPhone: +1-503-555-0090\nDate: Tues March 29, 2017\nVersion: 2.0\nLevel: Release";
        String answer = sut.change(str, "Balance", "1.5.6");

        Assertions.assertThat(answer).isEqualTo("Program: Balance Author: g964 Phone: +1-503-555-0090 Date: 2019-01-01 Version: 2.0");
    }

    @Test
    public void test3() {
        String str = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-009\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha";
        String answer = sut.change(str, "Ladder", "1.1");

        Assertions.assertThat(answer).isEqualTo("ERROR: VERSION or PHONE");
    }
}
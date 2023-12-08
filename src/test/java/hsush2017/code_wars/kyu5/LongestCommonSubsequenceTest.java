package hsush2017.code_wars.kyu5;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonSubsequenceTest {
    private LongestCommonSubsequence sut;

    @Before
    public void setUp() throws Exception {
        sut = new LongestCommonSubsequence();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.lcs("abcdef", "abc")).isEqualTo("abc");
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.lcs("abcdef", "acf")).isEqualTo("acf");
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.lcs("132535365", "123456789")).isEqualTo("12356");
    }
}
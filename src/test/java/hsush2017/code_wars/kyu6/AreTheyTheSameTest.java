package hsush2017.code_wars.kyu6;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class AreTheyTheSameTest {
    private AreTheyTheSame sut;

    @Before
    public void setUp() throws Exception {
        sut = new AreTheyTheSame();
    }

    @Test
    public void test1() {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        Assertions.assertThat(sut.comp(a, b)).isTrue();
    }
}
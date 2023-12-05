package hsush2017.code_wars.kyu5;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class RGBToHexTest {
    private RGBToHex sut;

    @Before
    public void setUp() throws Exception {
        sut = new RGBToHex();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.rgb(0, 0, 0)).isEqualTo("000000");
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.rgb(1, 2, 3)).isEqualTo("010203");
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.rgb(255, 255, 255)).isEqualTo("FFFFFF");
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.rgb(254, 253, 252)).isEqualTo("FEFDFC");
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.rgb(-20, 275, 125)).isEqualTo("00FF7D");
    }
}
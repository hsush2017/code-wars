package org.example.kyu5;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class HexToRGBTest {
    private HexToRGB sut;

    @Before
    public void setUp() throws Exception {
        sut = new HexToRGB();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.hexStringToRGB("#111111")).isEqualTo(new int[]{17, 17, 17});
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.hexStringToRGB("#000000")).isEqualTo(new int[]{0, 0, 0});
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.hexStringToRGB("#FF9933")).isEqualTo(new int[]{255, 153, 51});
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.hexStringToRGB("#beaded")).isEqualTo(new int[]{190, 173, 237});
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.hexStringToRGB("#Fa3456")).isEqualTo(new int[]{250, 52, 86});
    }
}
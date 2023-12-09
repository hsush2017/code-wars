package hsush2017.code_wars.kyu5;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class SortOneThreeTwoTest {
    private SortOneThreeTwo sut;

    @Before
    public void setUp() throws Exception {
        sut = new SortOneThreeTwo();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.sort(new int[]{8, 8, 9, 9, 10, 10})).isEqualTo(new int[]{8, 8, 9, 9, 10, 10});
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.sort(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{4, 1, 3, 2});
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.sort(new int[]{9, 99, 999})).isEqualTo(new int[]{9, 999, 99});
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.sort(new int[]{854, 188})).isEqualTo(new int[]{854, 188});
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.sort(new int[]{0})).isEqualTo(new int[]{0});
    }

    @Test
    public void test6() {
        Assertions.assertThat(sut.sort(new int[]{805, 818})).isEqualTo(new int[]{818, 805});
    }

    @Test
    public void test7() {
        Assertions.assertThat(sut.sort(new int[]{800, 808})).isEqualTo(new int[]{800, 808});
    }

    @Test
    public void test8() {
        Assertions.assertThat(sut.sort(new int[]{497, 71})).isEqualTo(new int[]{497, 71});
    }

    @Test
    public void test9() {
        Assertions.assertThat(sut.sort(new int[]{508, 518})).isEqualTo(new int[]{508, 518});
    }
}
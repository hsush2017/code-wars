package hsush2017.code_wars.kyu6;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CombinationLockTest {
    private CombinationLock sut;

    @Before
    public void setUp() throws Exception {
        sut = new CombinationLock();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.degreesOfLock(0, 30, 0, 30)).isEqualTo(1350);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.degreesOfLock(5, 35, 5, 35)).isEqualTo(1350);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.degreesOfLock(0, 20, 0, 20)).isEqualTo(1620);
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.degreesOfLock(7, 27, 7, 27)).isEqualTo(1620);
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.degreesOfLock(0, 10, 0, 10)).isEqualTo(1890);
    }

    @Test
    public void test6() {
        Assertions.assertThat(sut.degreesOfLock(9, 19, 9, 19)).isEqualTo(1890);
    }

    @Test
    public void test7() {
        Assertions.assertThat(sut.degreesOfLock(5, 30, 39, 30)).isEqualTo(1377);
    }

    @Test
    public void test8() {
        Assertions.assertThat(sut.degreesOfLock(4, 24, 36, 18)).isEqualTo(1530);
    }
}
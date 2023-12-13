package hsush2017.code_wars.kyu5;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class HumanReadableTimeTest {
    private HumanReadableTime sut;

    @Before
    public void setUp() throws Exception {
        sut = new HumanReadableTime();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.makeReadable(0)).isEqualTo("00:00:00");
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.makeReadable(5)).isEqualTo("00:00:05");
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.makeReadable(60)).isEqualTo("00:01:00");
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.makeReadable(86399)).isEqualTo("23:59:59");
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.makeReadable(359999)).isEqualTo("99:59:59");
    }
}
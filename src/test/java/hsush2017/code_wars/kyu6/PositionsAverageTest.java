package hsush2017.code_wars.kyu6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionsAverageTest {
    private PositionsAverage sut;

    @Before
    public void setUp() throws Exception {
        sut = new PositionsAverage();
    }

    @Test
    public void test11() {
        double answer = sut.posAverage("6900690040, 4690606946, 9990494604");

        assertEquals(26.6666666667, answer, 0.001);
    }

    @Test
    public void test2() {
        double answer = sut.posAverage("4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444, 4444444");

        assertEquals(100, answer, 0.001);
    }

    @Test
    public void test1() {
        double answer = sut.posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490");

        assertEquals(29.2592592593, answer, 0.001);
    }
}
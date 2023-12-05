package hsush2017.code_wars.kyu6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StringSplitTest {
    private StringSplit sut;
    private String input;

    @Before
    public void setUp() {
        sut = new StringSplit();
    }

    @Test
    public void evenString() {
        input = "HelloWorld";

        assertEquals("Should handle even string", "[He, ll, oW, or, ld]", Arrays.toString(sut.solution(input)));
    }

    @Test
    public void testOddString() {
        input = "LovePizza";
        assertEquals("Should handle odd string", "[Lo, ve, Pi, zz, a_]", Arrays.toString(sut.solution(input)));
    }
}
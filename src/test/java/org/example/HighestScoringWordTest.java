package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestScoringWordTest {
    private HighestScoringWord sut;

    @Before
    public void setUp() {
        sut = new HighestScoringWord();
    }

    @Test
    public void sampleTests() {
        assertEquals("taxi", sut.high("man i need a taxi up to ubud"));
        assertEquals("volcano", sut.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", sut.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", sut.high("aa b"));
        assertEquals("b", sut.high("b aa"));
        assertEquals("bb", sut.high("bb d"));
        assertEquals("d", sut.high("d bb"));
        assertEquals("aaa", sut.high("aaa b"));
    }
}
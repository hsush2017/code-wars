package org.example.kyu5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleStringExpansionTest {
    private SimpleStringExpansion sut;

    @Before
    public void setUp() {
        sut = new SimpleStringExpansion();
    }

    @Test
    public void test1() {
        assertEquals("ababab", sut.solve("3(ab)"));
    }

    @Test
    public void test2() {
        assertEquals("abbbabbb", sut.solve("2(a3(b))"));
    }

    @Test
    public void test3() {
        assertEquals("bccbccbcc", sut.solve("3(b(2(c)))"));
    }

    @Test
    public void test4() {
        assertEquals("kabaccbaccbacc", sut.solve("k(a3(b(a2(c))))"));
    }
}
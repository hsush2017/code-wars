package org.example.kyu5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringIncrementerTest {
    private StringIncrementer sut;

    @Before
    public void setUp() {
        sut = new StringIncrementer();
    }

    @Test
    public void test1() {
        String answer = sut.incrementString("foobar000");

        assertEquals("foobar001", answer);
    }

    @Test
    public void test2() {
        String answer = sut.incrementString("foo");

        assertEquals("foo1", answer);
    }

    @Test
    public void test3() {
        String answer = sut.incrementString("foobar001");

        assertEquals("foobar002", answer);
    }

    @Test
    public void test4() {
        String answer = sut.incrementString("foobar99");

        assertEquals("foobar100", answer);
    }

    @Test
    public void test5() {
        String answer = sut.incrementString("foobar099");

        assertEquals("foobar100", answer);
    }

    @Test
    public void test6() {
        String answer = sut.incrementString("");

        assertEquals("1", answer);
    }

    @Test
    public void test7() {
        String answer = sut.incrementString("foobar00999");

        assertEquals("foobar01000", answer);
    }

    @Test
    public void test8() {
        String answer = sut.incrementString("fo99obar99");

        assertEquals("fo99obar100", answer);
    }

    @Test
    public void test9() {
        String answer = sut.incrementString("9(%4620583498453105237276");

        assertEquals("9(%4620583498453105237277", answer);
    }

    @Test
    public void test10() {
        String answer = sut.incrementString("2Ump%ec?M000000001580666922837855071858444");

        assertEquals("2Ump%ec?M000000001580666922837855071858445", answer);
    }
}
package org.example.kyu6;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class WhatCenturyIsItTest {
    private WhatCenturyIsIt sut;

    @Before
    public void setUp() throws Exception {
        sut = new WhatCenturyIsIt();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.whatCentury(1999)).isEqualTo("20th");
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.whatCentury(2011)).isEqualTo("21st");
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.whatCentury(2154)).isEqualTo("22nd");
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.whatCentury(2259)).isEqualTo("23rd");
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.whatCentury(1055)).isEqualTo("11th");
    }
}
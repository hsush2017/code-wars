package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountIPAddressesTest {
    private CountIPAddresses sut;

    @Before
    public void setUp() {
        sut = new CountIPAddresses();
    }

    @Test
    public void ipsBetween() throws Exception {
        assertEquals(50, sut.ipsBetween("10.0.0.0", "10.0.0.50"));
        assertEquals(246, sut.ipsBetween("20.0.0.10", "20.0.1.0"));
        assertEquals((1L << 32L) - 1L, sut.ipsBetween("0.0.0.0", "255.255.255.255"));
    }
}
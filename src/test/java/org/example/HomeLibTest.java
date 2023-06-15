package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HomeLibTest {
    HomeLib mHomeLib;

    @Before
    public void setUp() throws Exception {
        mHomeLib = new HomeLib();
        System.out.println("JUnit4 setup is running BEFORE each test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("JUnit4 tearDown is running AFTER each test");
    }

    @Test
    public void testSimpleSum() {

        int a = 4;
        int b = 3;
        int expectedSum = 7;
        int actualSub = mHomeLib.getSumOf(a, b);
        assertEquals(expectedSum, actualSub);
    }
}
package com.rd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rajith on 11/3/16.
 */
public class AppAnotherClassTest {

    private AppAnotherClass appAnotherClass;

    @Before
    public void setUp() throws Exception {
        appAnotherClass = new AppAnotherClass();
    }

    @Test
    public void testExecute() throws Exception {
        appAnotherClass.execute();
        assertTrue(true);
    }

    @Test
    public void testExecute1() throws Exception {
        appAnotherClass.execute1();
        assertTrue(true);
    }
}
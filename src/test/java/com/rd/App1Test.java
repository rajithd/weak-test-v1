package com.rd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by rajith on 11/4/16.
 */
public class App1Test {

    private App1 app1;

    @Before
    public void setUp() throws Exception {
        app1 = new App1();
    }

    @Test
    public void testExecute() throws Exception {
        app1.execute();
        assertTrue(true);
    }

}

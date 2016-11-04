package com.rd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by rajith on 11/4/16.
 */
public class App2Test {

    private App2 app2;

    @Before
    public void setUp() throws Exception {
        app2 = new App2();
    }

    @Test
    public void testExecute() throws Exception {
        app2.execute();
        assertTrue(true);
    }

}

package com.example.cse.samplecalculator_sdl_labfinal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void checkAdd() throws Exception{
        assertEquals("4.000", Model.Add("2","2"));
        assertEquals("9.000", Model.Add("5","4"));
    }

    @Test
    public void checkSub() throws Exception{
        assertEquals("0.000", Model.Subtract("2","2"));
        assertEquals("1.000", Model.Subtract("5","4"));
    }

    @Test
    public void checkMul() throws Exception{
        assertEquals("4.000", Model.Multiply("2","2"));
        assertEquals("45.000", Model.Multiply("5","9"));
    }

    @Test
    public void checkDiv() throws Exception{
        assertEquals("1.000", Model.Division("2","2"));
        assertEquals("2.500", Model.Division("5","2"));
    }
}
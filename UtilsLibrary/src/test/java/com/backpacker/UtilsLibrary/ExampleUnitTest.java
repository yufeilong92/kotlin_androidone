package com.backpacker.UtilsLibrary;

import com.backpacker.UtilsLibrary.java.TimeUtil;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void se(){
        Date date = new Date();
        System.out.println(""+date);
        boolean night = TimeUtil.isNight(new Date());
        System.out.println(""+night);
    }
}
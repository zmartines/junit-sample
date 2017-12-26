package ru.javastudy.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by retinka on 13.01.2016.
 */
public class SecondClassTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before SecondClassTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After SecondClassTest.class");
    }

    @Test
    public void someSecondTest() {
        System.out.println("someSecondTest");
    }
}

package ru.javastudy.junit;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by retinka on 13.01.2016.
 */
public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("");
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("");
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
        System.out.println("");
        System.out.println("initTest()");
        calculator = new Calculator();
    }

    @After
    public void afterTest() {
        System.out.println("afterTest()");
        calculator = null;
    }

    @Test
    public void testGetSum() throws Exception {
        System.out.println("testGetSum()");
        assertEquals(15, calculator.getSum(7,8));
    }

    @Test
    public void testGetDivide() throws Exception {
        System.out.println("testGetDivide()");
        assertEquals(20, calculator.getDivide(100,5));
    }

    @Test
    public void testGetMultiple() throws Exception {
        System.out.println("testGetMultiple()");
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        System.out.println("divisionWithException()");
        calculator.getDivide(15,0);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Test(timeout = 500)
    public void timeStampTest() {
        System.out.println("timeStampTest()");
        while (true);
    }
}
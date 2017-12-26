package ru.javastudy.junit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

/**
 * Created by retinka on 13.01.2016.
 */
public class MainTest {

    public static void main(String[] args) {
        System.out.println("start MainTest class");
        Result results = JUnitCore.runClasses(CalculatorTest.class);
        for (Failure failure : results.getFailures()) {
            System.out.println("Тест не пройден: " + failure);
        }

        System.out.println("");
        System.out.println("Second example in MainTest");
        JUnitCore core = new JUnitCore();
        core.addListener(new CalcTestListener());
        core.run(CalculatorTest.class);

        System.out.println("");
        System.out.println("Third example in MainTest");

        Result resultThird = JUnitCore.runClasses(SuiteTestClass.class);
        for (Failure failure : resultThird.getFailures()) {
            System.out.println("Тест не пройден: " + failure);
        }
    }
}
package ru.javastudy.junit;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/**
 * Created by retinka on 13.01.2016.
 */
public class CalcTestListener extends RunListener {

    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("CalcTestListener - test started: " + description);
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("CalcTestListener - test failure " + failure);
    }
}

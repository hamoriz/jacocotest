package com.test;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculatorTest {

    @Test
    public void calculatorTest() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(2, 3), is(5));
    }
}

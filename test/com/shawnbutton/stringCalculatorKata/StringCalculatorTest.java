package com.shawnbutton.stringCalculatorKata;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class StringCalculatorTest {

    @Test
    public void testThatEmptyStringReturnsZero() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(""), equalTo(0));
    }

    @Test
    public void testThatOneNumberReturnsTheSameNumber() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add("1"), equalTo(1));
        assertThat(calculator.add("12"), equalTo(12));
    }

    @Test
    public void testThatMultipleNumbersAreAdded() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add("1,2,3"), equalTo(6));
    }

    @Test
    public void testThatMultipleNumbersAreAddedWhenSeparatedByNewlineCharacters() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add("1\n2\n3,4"), equalTo(10));
    }

    @Test
    public void testThat_can_add_numbers_when_specifying_delimiter() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add("//;1;2;33;4"), equalTo(40));
    }

    @Test (expected=RuntimeException.class)
    public void testThat_trying_to_add_negative_throws_exception() {
        Calculator calculator = new Calculator();
        calculator.add("//;1;-2;33;4");
        fail();
    }






}
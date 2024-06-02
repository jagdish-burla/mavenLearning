package com.learning.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JenkinsCalculatorTest {

    @Test
    void testAddTest() {
        JenkinsCalculator jc = new JenkinsCalculator();
        assertEquals(10,jc.addNumbers(5,5));
    }

    @Test
    void testSubtractTest() {
        JenkinsCalculator jc = new JenkinsCalculator();
        assertEquals(0,jc.subtractNumbers(5,5));
    }
}
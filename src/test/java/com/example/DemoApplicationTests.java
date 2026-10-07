package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoApplicationTests {

    @Test
    void testAddition() {
        int num1 = 10;
        int num2 = 20;

        int result = num1 + num2;

        assertEquals(30, result);
    }
}

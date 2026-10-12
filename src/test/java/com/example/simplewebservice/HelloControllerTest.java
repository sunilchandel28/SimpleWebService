package com.example.simplewebservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

    private final HelloController helloController = new HelloController();

    @Test
    public void helloReturnsGreetingWithName() {
        String response = helloController.hello("Alice");

        assertEquals("Alice Hello !", response);
    }
}

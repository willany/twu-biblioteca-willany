package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WelcomeTest {

    Welcome welcome;

    @Before
    public void setUp() {
        welcome = new Welcome();

    }

    @Test
    public void WelcomeMessageTest(){
        assertEquals("Welcome to the TWUs library!", welcome.showWelcomeMessage());
    }
}

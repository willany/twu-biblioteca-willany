package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessagesTest {

    Messages message;

    @Before
    public void setUp() {
        message = new Messages();

    }

    @Test
    public void WelcomeMessageTest(){
        assertEquals("Welcome to the TWU's library!", message.showWelcomeMessage());
    }
}

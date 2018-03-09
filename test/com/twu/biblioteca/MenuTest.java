package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MenuTest {

    Menu menu = new Menu();
    Menu menu2 = new Menu();
    Painel painel = new Painel();

    @Before
    public void setUp() {
        menu.setCode(1);
        menu.setName("List Books");

        menu2.setCode(2);
        menu2.setName("Choose Books");
    }

    @Test
    public void menuTest(){
        assertEquals("List Books: 1", menu.toString());
        assertNotEquals("List Books: 1", menu2.toString());
    }

    @Test
    public void menuInvalidOptionTest(){
        assertEquals("Select a valid option!", painel.chooseAnOption(1));
    }

}

package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MenuTest {

    Menu menu1 = new Menu();
    Menu menu2 = new Menu();

    @Before
    public void setUp() {
        menu1.add("test 1");
        menu2.add("test 2");
    }

    @Test
    public void menuTest(){
        assertEquals("test 1", menu1.menuList());
        assertNotEquals("test 2", menu1.menuList());
    }


}

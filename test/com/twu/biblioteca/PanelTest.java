package com.twu.biblioteca;

import org.junit.Before;

public class PanelTest {

    Panel panel;
    Menu menuOptions;
    BookManagement bookManagement;

    @Before
    public void setUp() {
        menuOptions = new Menu();
        menuOptions.add("List Books");

        bookManagement = new BookManagement();
        bookManagement.add(new Book("test", "test", 1991));

        panel = new Panel(bookManagement, menuOptions);
        panel = new Panel(bookManagement, menuOptions);
    }

}
package com.twu.biblioteca;

public class LibraryApp {

    public static void main(String[] args) {
        Menu menuOptions = new Menu();
        menuOptions.add("List Books");
        menuOptions.add("Checkout Book");
        menuOptions.add("Return Book");

        BookManagement bookManagement = new BookManagement();
        bookManagement.add(new Book("test", "test", 1991));

        Panel panel = new Panel(bookManagement, menuOptions);

        panel.libraryStart();


    }
}

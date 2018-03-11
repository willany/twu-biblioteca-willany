package com.twu.biblioteca;

public class LibraryApp {

    public static void main(String[] args) {

        Messages message = new Messages();
        System .out.println(message.showWelcomeMessage());

        System.out.println("----------------------------------------\n");

        BookManagement bookManagement = new BookManagement();
        bookManagement.add(new Book("teste", "teste", 1991));

        bookManagement.listAll();


    }
}

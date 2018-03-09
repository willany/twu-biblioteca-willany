package com.twu.biblioteca;

import java.util.Iterator;
import java.util.List;

public class LibraryApp {

    public static void main(String[] args) {

        Messages message = new Messages();
        System .out.println(message.showWelcomeMessage());

        System.out.println("----------------------------------------\n");

        System.out.println("List of the available books \n");

        Books books = new Books();
        books.populateBook();

        List list_books = books.listAll();

        System.out.printf("%-20s %-20s %-20s\n","Book name", "Author name", "Year Published");

        for (int i = 0; i < books.listAll().size(); i++) {
            System.out.printf("%-20s %-20s %-20s\n", books.listAll().get(i).getName(), books.listAll().get(i).getAuthor(), books.listAll().get(i).getYear_published());
        }



    }
}

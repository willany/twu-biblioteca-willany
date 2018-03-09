package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Books {

    public static ArrayList<Book> books = new ArrayList();

    public static void populateBook(){
        books.add(new Book("All about Love", "Bell Hooks", 2000));
        books.add(new Book("Geek Love", "Katherine Dunn", 1989));
        books.add(new Book("The Handmaid's Tale", "Margaret Atwood", 1985));
    }

    public static ArrayList<Book> listAll(){
        populateBook();
        return books;
    }

}

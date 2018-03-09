package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Books {

    private ArrayList<Book> books = new ArrayList();

    public void populateBook(){
        books.add(new Book("All about Love", "Bell Hooks", 2000));
        books.add(new Book("Geek Love", "Katherine Dunn", 1989));
        books.add(new Book("Infinite Jest", "David Foster", 1985));
    }

    public ArrayList<Book> listAll(){
        return books;
    }

}

package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BookTest {

    Books books;
    ArrayList<Book> books_list = new ArrayList<>();

    @Before
    public void setUp() {
        books_list.add(new Book("All about Love", "Bell Hooks", 2000));
        books_list.add(new Book("Geek Love", "Katherine Dunn", 1989));
        books_list.add(new Book("The Handmaid's Tale", "Margaret Atwood", 1985));
    }

    @Test
    public void listBooksTest(){
      assertThat(books.listAll(), hasItems(new Book("All about Love", "Bell Hooks", 2000),
        new Book("Geek Love", "Katherine Dunn", 1989),
        new Book("The Handmaid's Tale", "Margaret Atwood", 1985)));


    }
}

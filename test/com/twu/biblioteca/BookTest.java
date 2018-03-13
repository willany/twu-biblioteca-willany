package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book_one;

    @Before
    public void setUp() {
        book_one = new Book("All about Love", "Bell Hooks", 2000);
    }

    @Test
    public void getNameTest(){
        assertEquals("All about Love", book_one.getName());
    }

    @Test
    public void getAuthorTest(){
        assertEquals("Bell Hooks", book_one.getAuthor());
    }

    @Test
    public void getYearPublishedTest(){
        assertEquals(2000, book_one.getYear_published());
    }

    @Test
    public void getDetailsTest(){
        assertEquals("All about Love       Bell Hooks           2000                 \n", book_one.details());
    }

}

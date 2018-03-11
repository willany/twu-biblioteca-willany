package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BookManagementTest {

    BookManagement bookManagement;
    ArrayList<Book> listbooksTest;
    Book bookOne;
    Book bookTwo;

    @Before
    public void setUp() {
        bookManagement = new BookManagement();
        listbooksTest = new ArrayList<>();
        bookOne = new Book("test name", "test author", 2018);
        bookTwo = new Book("test name", "test author", 2017);
    }

    @Test
    public void addNewBookTest(){
        bookManagement.add(bookOne);
        listbooksTest.add(bookOne);
        assertEquals(new HashSet<>(bookManagement.books), new HashSet<>(listbooksTest));

        listbooksTest.remove(bookOne);
        listbooksTest.add(bookTwo);
        assertNotEquals(new HashSet<>(bookManagement.books), new HashSet<>(listbooksTest));
    }

    @Test
    public void listBooksTest(){
//        assertEquals(bookManagement.printBooks(), );
    }

}
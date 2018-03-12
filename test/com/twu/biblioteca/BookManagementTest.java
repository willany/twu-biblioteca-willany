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
        bookManagement.add(bookOne);
    }

    @Test
    public void addNewBookTest(){
        listbooksTest.add(bookOne);
        assertEquals(new HashSet<>(bookManagement.getBookList()), new HashSet<>(listbooksTest));

        listbooksTest.remove(bookOne);
        listbooksTest.add(bookTwo);
        assertNotEquals(new HashSet<>(bookManagement.getBookList()), new HashSet<>(listbooksTest));
    }

    @Test
    public void listTest(){
        assertEquals(1, bookManagement.getBookList().size());
    }

    @Test
    public void columnHeadingsTest(){
        assertEquals("Title                Author               Year Published       \n", bookManagement.columnHeadings());
    }

    @Test
    public void printBooksTest(){
        assertEquals("test name            test author          2018                 \n", bookManagement.printBooks());
    }

    @Test
    public void checkoutBookTest(){
        assertEquals("Thank you! Enjoy the book.", bookManagement.checkoutBook(bookOne.getName()));
        assertEquals("That book is not available.", bookManagement.checkoutBook(bookOne.getName()));
    }

    @Test
    public void returnBookTest(){
        assertEquals("Thank you! Enjoy the book.", bookManagement.checkoutBook(bookOne.getName()));
        assertEquals("Thank you for returning the book.", bookManagement.checkinBook(bookOne.getName()));
        assertEquals("That is not a valid book to return.", bookManagement.checkinBook(bookOne.getName()));
    }


}
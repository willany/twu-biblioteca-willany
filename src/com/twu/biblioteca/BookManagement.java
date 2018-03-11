package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookManagement {
    List<Book> books  = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void listAll() {
        System.out.println("List of the books \n");
        System.out.printf("%-20s %-20s %-20s\n","Book name", "Author name", "Year Published");
        printBooks();
    }

    public void printBooks(){
        Iterator<Book> bookIterator = books.iterator();
        while(bookIterator.hasNext()){
            Book book = bookIterator.next();
            System.out.printf("%-20s %-20s %-20s\n",book.getName(), book.getAuthor(), book.getYear_published());
        }
    }

    public void remove(Book book) {
        books.remove(book);
    }
}

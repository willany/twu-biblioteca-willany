package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookManagement {
    private List<Book> books  = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public List<Book> getBookList(){
        return books;
    }

    public List<Book> getAvailableBook(){
        return books.stream().filter(book -> book.isAvailable()).collect(Collectors.toList());
    }

    public void listAll() {
        if (getAvailableBook().isEmpty()){
            System.out.println("No books available!");
        }else {
            System.out.println("List of the books \n");
            System.out.println(columnHeadings());
            System.out.println(printBooks());
        }
    }

    public String columnHeadings() {
        return String.format("%-20s %-20s %-20s %n", "Title", "Author", "Year Published");
    }

    public String printBooks(){
        String book_line = String.join("\n");
        for (Book book: getAvailableBook()) {
            book_line += book.details();
        }
        return book_line;
    }

    public String checkoutBook(String bookName) {
        if(isAvailable(bookName)) {
            changeBookStatus(bookName, false);
            return "Thank you! Enjoy the book.";
        }else {
            return "That book is not available.";
        }
    }

    public String checkInBook(String bookName) {
        if(!isAvailable(bookName)) {
            changeBookStatus(bookName, true);
            return "Thank you for returning the book.";
        }else {
            return "That is not a valid book to return.";
        }
    }

    public Boolean isAvailable(String name){
        Book book = getBookByName(getBookList(), name);
        return book.isAvailable();
    }

    public Boolean changeBookStatus(String bookName, Boolean status){
        Boolean result;
        Book book = getBookByName(getBookList(), bookName);
        if(book != null) {
            book.setAvailable(status);
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    private static Book getBookByName(List<Book> books, String name) {
        Book result = null;
        for (Book book : books) {
            if (name.equals(book.getName())) {
                result = book;
            }
        }
        return result;
    }

}

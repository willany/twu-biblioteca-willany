package com.twu.biblioteca;

import java.util.List;
import java.util.TreeSet;

public class Book {

    private String name;
    private String author;
    private int year_published;

    public Book(String name, String author, int year_published) {
        this.name = name;
        this.author = author;
        this.year_published = year_published;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear_published() {
        return year_published;
    }

    public void setYear_published(int year_published) {
        this.year_published = year_published;
    }


    //Test equal, override equals() and hashCode()
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Book.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Book other = (Book) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.author != other.author) {
            return false;
        }
        if (this.year_published != other.year_published) {
            return false;
        }
        return true;
    }


}

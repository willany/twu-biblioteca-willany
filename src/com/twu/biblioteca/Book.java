package com.twu.biblioteca;

public class Book {

    private String name;
    private String author;
    private int year_published;
    private boolean available = true;

    public Book(String name, String author, int year_published) {
        this.name = name;
        this.author = author;
        this.year_published = year_published;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear_published() {
        return year_published;
    }

    public void setYear_published(int year_published) {
        this.year_published = year_published;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String details() {
        return String.format("%-20s %-20s %-20s %n", name, author, year_published);
    }

}

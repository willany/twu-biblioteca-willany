package com.twu.movierental;

public class Movie {
    private String name;
    private int year;
    private String director;
    private int rating;
    private Boolean available = true;

    public Movie(String name, int year, String director, int rating){
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }
    public Movie(String name, int year, String director){
        this.name = name;
        this.year = year;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String details() {
        return String.format("%-25s %-20s %-20s %-20s ", name, year, director, rating);
    }
}

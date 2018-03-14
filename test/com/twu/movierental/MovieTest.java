package com.twu.movierental;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    Movie movie;
    Movie movieWithoutRating;


    @Before
    public void setUp() {
        movie = new Movie("Um amor para recordar", 2000, "Nicholas Sparks", 10);
        movieWithoutRating = new Movie("Ela é o cara", 2018, "Steven Robbins");
    }

    @Test
    public void validateMovieDetailsShouldHaveName(){
        assertEquals("Um amor para recordar", movie.getName());
        assertEquals("Ela é o cara", movieWithoutRating.getName());
    }

    @Test
    public void validateMovieDetailsShouldHaveYear(){
        assertEquals(2000, movie.getYear());
        assertEquals(2018, movieWithoutRating.getYear());
    }

    @Test
    public void validateMovieDetailsShouldHaveDirector(){
        assertEquals("Nicholas Sparks", movie.getDirector());
        assertEquals("Steven Robbins", movieWithoutRating.getDirector());
    }

    @Test
    public void validateMovieDetailsShouldHaveRating(){
        assertEquals(10, movie.getRating());
        assertEquals(0, movieWithoutRating.getRating());
    }

    @Test
    public void validateMovieDetails(){
        assertEquals("Um amor para recordar     2000                 Nicholas Sparks      10                   \n", movie.details());
        assertEquals("Ela é o cara              2016                 Steven Robbins       0                    \n", movieWithoutRating.details());
    }
    


}

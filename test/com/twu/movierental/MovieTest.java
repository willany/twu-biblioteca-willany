package com.twu.movierental;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Um amor para recordar", 2000, "Nicholas Sparks", 10);
    }

    @Test
    public void validateMovieDetailsShouldHaveName(){
        assertEquals("Um amor para recordar", movie.getName());
    }

    @Test
    public void validateMovieDetailsShouldHaveYear(){
        assertEquals(2000, movie.getYear());
    }

    @Test
    public void validateMovieDetailsShouldHaveDirector(){
        assertEquals("Nicholas Sparks", movie.getDirector());
    }

    @Test
    public void validateMovieDetailsShouldHaveRating(){
        assertEquals(10, movie.getRating());
    }
}

package com.twu.movierental;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MovieManagementTest {

    MovieManagement movieManagement;
    Movie movie;
    Movie movieWithoutRating;
    List<Movie> movies;

    @Before
    public void setUp() {
        movieManagement = new MovieManagement();
        movie = new Movie("Um amor para recordar", 2000, "Nicholas Sparks", 10);
        movieWithoutRating = new Movie("Ela é o cara", 2018, "Steven Robbins");
        movies.add(movie);
        movies.add(movieWithoutRating);
    }

    @Test
    public void validateListOfAvailableMovies(){
        assertEquals(2, movieManagement.listAvailableMovies().size());
    }
}

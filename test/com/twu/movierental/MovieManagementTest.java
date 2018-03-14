package com.twu.movierental;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class MovieManagementTest {

    MovieManagement movieManagement;
    MovieManagement movieManagementEmpty;
    Movie movie;
    Movie movieWithoutRating;

    @Before
    public void setUp() {
        movie = new Movie("Um amor para recordar", 2000, "Nicholas Sparks", 10);
        movieWithoutRating = new Movie("Ela é o cara", 2018, "Steven Robbins");
        movieManagement = new MovieManagement();
        movieManagement.add(movie);
        movieManagement.add(movieWithoutRating);
        movieManagementEmpty = new MovieManagement();
    }

    @Test
    public void validateListOfAvailableMovies(){
        assertEquals(2, movieManagement.listAvailableMovies().size());
        movie.setAvailable(false);
        assertEquals(1, movieManagement.listAvailableMovies().size());
    }

    @Test
    public void validateLisHeader(){
        assertEquals("Movie Name                Movie Year           Movie Director       Movie Rating         ", movieManagement.columnHeadings());
    }

    @Test
    public void validateListEmpty(){
        assertEquals("No movies available!", movieManagementEmpty.listAll());
    }

    @Test
    public void validateMovieList(){
        String expectedHeader = "Movie Name                Movie Year           Movie Director       Movie Rating         ";
        String expectedMovie1 = "Um amor para recordar     2000                 Nicholas Sparks      10                   ";
        String expectedMovie2 = "Ela é o cara              2018                 Steven Robbins       0                    ";
        String expected = String.join("\n", expectedHeader,expectedMovie1, expectedMovie2);
        assertEquals(expected, movieManagement.listAll());
    }
}

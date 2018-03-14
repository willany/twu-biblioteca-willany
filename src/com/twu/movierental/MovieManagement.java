package com.twu.movierental;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieManagement {

    private List<Movie> movies = new ArrayList();

    public void add(Movie movie){
        movies.add(movie);
    }

    public List<Movie> listAllMovies(){
        return movies;
    }

    public List<Movie> listAvailableMovies(){
        return listAllMovies().stream().filter(movie -> movie.isAvailable()).collect(Collectors.toList());
    }

}
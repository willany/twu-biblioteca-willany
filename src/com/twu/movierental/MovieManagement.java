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

    public String columnHeadings(){
        return String.format("%-25s %-20s %-20s %-20s ", "Movie Name", "Movie Year", "Movie Director", "Movie Rating");
    }

    public String listAll(){
        String result = "";
        if(listAvailableMovies().isEmpty()){
            result = "No movies available!";
        }else{
            result = printMovies();
        }

        return result;
    }

    public String printMovies(){
        String header = columnHeadings();
        String body = printLineMovies();
        return header + "\n" + body;
    }

    public String printLineMovies(){
        List<String> lines = new ArrayList<>();
        for (Movie movie: listAvailableMovies()) {
            lines.add(movie.details());
        }
        String movieLine = String.join("\n", lines);
        return movieLine;
    }

}

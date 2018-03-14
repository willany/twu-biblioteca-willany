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
        String result;
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

    public String checkout(String movieName){
        String result;
        if(isAvailable(movieName)){
            result = "Thank you! Enjoy the movie.";
            changeStatus(movieName, false);
        }else{
            result = "That movie is not available.";
        }
        return result;
    }

    public Boolean isAvailable(String movieName){
        Boolean result;
        Movie movie = getMovieByName(listAllMovies(), movieName);
        if(movie != null){
            result = movie.isAvailable();
        }else {
            result = false;
        }
        return result;
    }

    public Boolean changeStatus(String movieName, Boolean status){
        Movie movie = getMovieByName(listAllMovies(), movieName);
        if(movie != null) {
            movie.setAvailable(status);
            return true;
        }else{
            return false;
        }
    }

    public Movie getMovieByName(List<Movie> movies, String name) {
        Movie result = null;
        for (Movie movie : movies) {
            if (name.equals(movie.getName())) {
                result = movie;
            }
        }
        return result;
    }

}

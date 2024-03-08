package TicketBuyingApp;

import java.util.ArrayList;

public class Movie {
    private String movieName;
    private String movieDirector;

    public Movie(String movieName, String movieDirector) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }
    public String getMovieDirector() {
        return movieDirector;
    }
    public String displayMovieInfo() {
        return "Movie Name: "+movieName+" Directed by "+movieDirector;
    }
}

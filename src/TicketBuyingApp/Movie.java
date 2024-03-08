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
        if (movieName != null && !movieName.isEmpty()) {
            this.movieName = movieName;
        } else {
            throw new IllegalArgumentException("Movie name cannot be null or empty.");
        }
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieDirector(String movieDirector) {
        if (movieDirector != null && !movieDirector.isEmpty()) {
            this.movieDirector = movieDirector;
        } else {
            throw new IllegalArgumentException("Movie director cannot be null or empty.");
        }
    }
    public String getMovieDirector() {
        return movieDirector;
    }
    public String displayMovieInfo() {
        return "Movie Name: "+movieName+" Directed by "+movieDirector;
    }
}

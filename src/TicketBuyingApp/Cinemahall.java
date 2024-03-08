package TicketBuyingApp;

import java.util.ArrayList;

public abstract class Cinemahall {
    private ArrayList<Movie> movies;
    private ArrayList<Person> visitors;
    private int totalTickets;

    public Cinemahall() {
        movies = new ArrayList<>();
        visitors = new ArrayList<>();
    }

    public void addMovies(Movie movie) {
        movies.add(movie);
    }
    public void removeMovies(Movie movie) {
        movies.remove(movie);
    }
    public void addPerson(Person person) {
        visitors.add(person);
    }
    public void removePerson(Person person) {
        visitors.remove(person);
    }
    public ArrayList<Person> getVisitors() {
        return visitors;
    }
    public ArrayList<Movie> getMovies() {
        return movies;
    }
}

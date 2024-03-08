package TicketBuyingApp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Cinemahall {
    private ArrayList<Movie> movies;
    private ArrayList<Person> visitors;
    private int totalSeats;

    public Cinemahall() {
        movies = new ArrayList<>();
        visitors = new ArrayList<>();
//        this.totalSeats = totalSeats;
    }
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
    public int getTotalSeats() {
        return totalSeats;
    }

    public void addMovies(Movie movie) {
        movies.add(movie);
    }
    public void removieMovies(Movie movie) {
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

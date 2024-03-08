package TicketBuyingApp;

/*
In this project, I will create a class name Ticket so that I can handle all ticket related
issues. Then a movie class.
 */

public class Main {
    public static void main(String[] args) {
        Bashundhara_CH bashundhara = new Bashundhara_CH();
        Movie movie1 = new Movie("Spiderman", "Abu Sufian Shanto");
        Movie movie2 = new Movie("Superman", "Meaaw Meaaw");
        bashundhara.setTotalSeats(100);
        bashundhara.addMovies(movie1);
        bashundhara.addMovies(movie2);
        Person visitor1 = new Person("Arby", 23);
        bashundhara.addPerson(visitor1);
        System.out.println("Right now we have two movies ongoing. Below is the list: ");
        for(Movie movie : bashundhara.getMovies()) {
            int i = 1;
            System.out.println(i+". "+movie.displayMovieInfo());
        }


    }
}

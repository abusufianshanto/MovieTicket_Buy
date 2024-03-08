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
        //movie adding methods working here
        bashundhara.addMovies(movie1);
        bashundhara.addMovies(movie2);

        Person visitor1 = new Person("Arby", 23);
        //visitor adding methods working here
        bashundhara.addPerson(visitor1);

        System.out.println("Right now we have two movies ongoing. Below is the list: ");
        for(Movie movie : bashundhara.getMovies()) {
            System.out.println(""+movie.displayMovieInfo());
        }
        bashundhara.setTotalTickets(100);
        System.out.println(bashundhara.getTotalTickets());

        for(Person person : bashundhara.getVisitors()) {
            System.out.println(""+person.displayInfo());
        }


    }
}

package main;

import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Harry Potter");
        myMovie.setReleaseYear(2001);
        myMovie.setMinDuration(200);
        myMovie.setIncludedOnPlan(true);

        myMovie.showInfo();
        myMovie.rateMovie(8);
        myMovie.rateMovie(9.2);
        myMovie.rateMovie(10);
        
    }
}

package main;

import java.util.ArrayList;

import br.com.alura.screenmatch.calculation.FilterRecomendation;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Harry Potter");
        myMovie.setReleaseYear(2001);
        myMovie.setMinDuration(110);
        myMovie.setIncludedOnPlan(true);
        
        Movie Avatar = new Movie();
        Avatar.setName("Avatar");
        Avatar.setReleaseYear(2023);
        Avatar.setMinDuration(120);
        Avatar.setIncludedOnPlan(true);
        Avatar.rate(4);
        
        Serie theWalkingDead = new Serie();
        
        theWalkingDead.setName("The Walking Dead");
        theWalkingDead.setSeasons(16);
        theWalkingDead.setActive(true);
        theWalkingDead.setEpisodesPerSeason(22);
        theWalkingDead.setMinPerEpisode(50);
        theWalkingDead.setReleaseYear(2012);
        theWalkingDead.rate(9.2);
        
//        theWalkingDead.showInfo();      
        
        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(Avatar);
        calculator.include(theWalkingDead);
        
        System.out.println(calculator.getTotalTimeInMinutes() + "min");
        
        FilterRecomendation filterRecomendation = new FilterRecomendation();
        
//        filterRecomendation.filter(Avatar);
        
        Episode episode = new Episode();
        episode.setName("Test episode");
        episode.setNumber(14);
        episode.setTotalViews(400);
        episode.setSerie(theWalkingDead);
        filterRecomendation.filter(episode);
        
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(Avatar);
        System.out.println("List size: " + movieList.size());
        System.out.println("Get movie: " + movieList.get(0).getName());
        System.out.println(movieList);
    }
}

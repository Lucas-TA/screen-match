package br.com.alura.screenmatch.models;

public class Movie extends Title {
    private String director;
    
    public String getDirector() {
		return director;
	}
    public void setDirector(String director) {
		this.director = director;
	}
    
    @Override
	public void showInfo() {
    	System.out.println("Movie title: " + getName());
    	System.out.println("Release year: " + getReleaseYear());
    	System.out.println("Duration: " + getMinDuration());
    	System.out.println("Director: " + director);
	}
}
package br.com.alura.screenmatch.models;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean includedOnPlan;
    private double ratingSum;
    private int ratingTotal;
    private int minDuration;

    public void showInfo() {
    	System.out.println("Movie title: " + name);
    	System.out.println("Release year: " + releaseYear);
    }
    
    public void setName(String name) {
		this.name = name;
	}
    
    public void setReleaseYear(int releaseYear) {
  		this.releaseYear = releaseYear;
  	}
    
    public void setMinDuration(int minDuration) {
		this.minDuration = minDuration;
	}
    
    public void setIncludedOnPlan(boolean includedOnPlan) {
		this.includedOnPlan = includedOnPlan;
	}
    
    public String getName() {
		return name;
	}
    
    public int getReleaseYear() {
		return releaseYear;
	}
    
    public int getMinDuration() {
		return minDuration;
	}
  
    public int getRatingTotal() {
    	return ratingTotal;
    }
    
    public boolean getIncludedOnPlan() {
    	return includedOnPlan;
    }
    public void rateMovie(double rate) {
    	ratingSum += rate;
    	ratingTotal++;
    }
    
    public double getRatingAverage() {
    	return ratingSum / ratingTotal;
    }
    
}
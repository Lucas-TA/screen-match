public class Movie {
    String name;
    int releaseYear;
    boolean includedOnPlan;
    double ratingSum;
    int ratingTotal;
    int minDuration;

    void showInfo() {
    	System.out.println("Movie title: " + name);
    	System.out.println("Release year: " + releaseYear);
    }
    
    void rateMovie(double rate) {
    	ratingSum += rate;
    	ratingTotal++;
    }
    
    double getRatingMedia() {
    	return ratingSum / ratingTotal;
    }
    
}
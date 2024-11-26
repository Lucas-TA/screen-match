public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Harry Potter";
        myMovie.releaseYear = 2001;
        myMovie.minDuration = 200;
        myMovie.includedOnPlan = true;

        myMovie.showInfo();
        myMovie.rateMovie(8);
        myMovie.rateMovie(9.2);
        myMovie.rateMovie(10);
        
        System.out.println(myMovie.ratingSum);
        System.out.println(myMovie.ratingTotal);
        System.out.println(myMovie.getRatingMedia());
    }
}

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Harry Potter";
        myMovie.releaseYear = 2001;
        myMovie.minDuration = 200;
        myMovie.includedOnPlan = true;

        System.out.println(myMovie);
    }
}

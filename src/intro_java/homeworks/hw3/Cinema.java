package intro_java.homeworks.hw3;

public class Cinema {
    private Movie[] runningMovies;
    private int currentMovieIndex;

    public Cinema(int maxCapacity) {
        runningMovies = new Movie[maxCapacity];
    }

    public void addMovie(Movie movie) {
        if (currentMovieIndex >= runningMovies.length) {
            System.out.println("Cannot add more movies");
            return;
        }
        runningMovies[currentMovieIndex] = movie;
        currentMovieIndex++;
    }

    public Movie getTheBestMovie() {
        float maxRating = runningMovies[0].getRating();
        int maxRatingIndex = 0;
        for (int i = 0; i < runningMovies.length; i++) {
            Movie runningMovie = runningMovies[i];
            if (runningMovie == null) continue;
            if (maxRating < runningMovie.getRating()) {
                maxRating = runningMovie.getRating();
                maxRatingIndex = i;
            }
        }
        return runningMovies[maxRatingIndex];
    }
}

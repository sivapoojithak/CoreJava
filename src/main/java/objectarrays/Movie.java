package objectarrays;
import java.util.Arrays;
import java.util.Comparator;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    // Getter methods for the attributes (yearReleased, rating, budget, collectionAmount) go here

    // Comparator implementation to sort Movie by rating and profit
    public static class RatingProfitComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            if (movie1.rating != movie2.rating) {
                // Sort by rating in descending order
                return Double.compare(movie2.rating, movie1.rating);
            } else {
                // Sort by profit (collectionAmount - budget) in descending order
                return Double.compare(movie2.collectionAmount - movie2.budget, movie1.collectionAmount - movie1.budget);
            }
        }
    }

    // Comparator implementation to sort Movie by year released and rating
    public static class YearRatingComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            if (movie1.yearReleased != movie2.yearReleased) {
                // Sort by year released in ascending order
                return Integer.compare(movie1.yearReleased, movie2.yearReleased);
            } else {
                // If years are equal, sort by rating in descending order
                return Double.compare(movie2.rating, movie1.rating);
            }
        }
    }

    public static void main(String[] args) {
        // Create an array of movies
        Movie[] movies = {
                new Movie(2021, 9.5, 100000000, 200000000),
                new Movie(2023, 6.8, 80000000, 150000000),
                // Add more movies as needed
        };

        // Sort by rating and profit
        Arrays.sort(movies, new RatingProfitComparator());

        // Print sorted movies
        System.out.println("Sorted by rating and profit:");
        for (Movie movie : movies) {
            System.out.println(movie.yearReleased + " - Rating: " + movie.rating + " - Profit: " +
                    (movie.collectionAmount - movie.budget));
        }

        // Sort by year released and rating
        Arrays.sort(movies, new YearRatingComparator());

        // Print sorted movies
        System.out.println("\nSorted by year released and rating:");
        for (Movie movie : movies) {
            System.out.println(movie.yearReleased + " - Rating: " + movie.rating);
        }
    }
}

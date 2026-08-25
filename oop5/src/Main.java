import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create some movies
        Movie movie1 = new Movie("Inception", "Christopher Nolan", new ArrayList<String>());
        Movie movie2 = new Movie("The Shawshank Redemption", "Frank Darabont", new ArrayList<String>());

        // Add actors to the movies
        movie1.getActors().add("Leonardo DiCaprio");
        movie1.getActors().add("Ellen Page");
        movie2.getActors().add("Tim Robbins");
        movie2.getActors().add("Morgan Freeman");

        // Create and add reviews for the movies
        Review review1 = new Review("Great movie!", "John Doe", 9.5);
        Review review2 = new Review("One of the best movies ever!", "Jane Smith", 9.8);

        movie1.addReview(review1);
        movie1.addReview(review2);

        // Print movie information
        System.out.println("Movie 1: " + movie1.getTitle());
        System.out.println("Director: " + movie1.getDirector());
        System.out.println("Actors: " + movie1.getActors());
        System.out.println("Reviews: ");
        for (Review review : movie1.getReviews()) {
            System.out.println("Reviewer: " + review.getReviewerName());
            System.out.println("Rating: " + review.getRating());
            System.out.println("Review Text: " + review.getReviewText());
            System.out.println();
        }

        System.out.println("Movie 2: " + movie2.getTitle());
        System.out.println("Director: " + movie2.getDirector());
        System.out.println("Actors: " + movie2.getActors());
        System.out.println("No reviews yet for Movie 2.");
    }
}
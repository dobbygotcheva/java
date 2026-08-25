import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private ArrayList < String > actors;
    private ArrayList < Review > reviews;

    public Movie(String title, String director, ArrayList < String > actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList < Review > ();
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public ArrayList < Review > getReviews() {
        return this.reviews;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDirector() {
        return this.director;
    }

    public ArrayList < String > getActors() {
        return this.actors;
    }
}
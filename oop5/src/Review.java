class Review {
    private String reviewText;
    private String reviewerName;
    private double rating;

    public Review(String reviewText, String reviewerName, double rating) {
        this.reviewText = reviewText;
        this.reviewerName = reviewerName;
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public double getRating() {
        return rating;
    }
}
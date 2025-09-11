import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    String author;
    int publicationYear;
    private boolean borrowed;
    private double rating;
    private final List<String> reviews;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
        this.rating = 0.0;
        this.reviews = new ArrayList<>();


    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public  void borrowed() { borrowed = true; }
    public void returnBook() { borrowed = false; }

    public double getRating() { return rating; }
    public List<String> getReviews() { return reviews; }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating! Must be between 0 and 5.");
        }
    }

    // Reviews
    public void addReview(String review) {
        if (review != null && !review.trim().isEmpty()) {
            reviews.add(review);
        } else {
            System.out.println("Review cannot be empty.");
        }
    }
    @Override
    public String toString() {
        String status = borrowed ? "Borrowed" : "Available";
        return "Title: \"" + title + "\", Author: \"" + author +
                "\", Year: " + publicationYear +
                ", Rating: " + rating +
                ", Status: " + status;
    }

}


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
}


public class Book {
    String title;
    String author;
    int publicationYear;
    private boolean borrowed;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;

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
}


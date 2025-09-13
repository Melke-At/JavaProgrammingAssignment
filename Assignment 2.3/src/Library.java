import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private double rating;

    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
       // for (Book book : books)
        System.out.println("Library Catalog:");
        for(int i=0; i<books.size();i++){
            Book book = books.get(i);

            System.out.println((i+1)+". "+ " Title: \"" + book.getTitle() + " \", Author: \"" + book.getAuthor() + " \", Publication Year: " + book.publicationYear);

        }
    }

    public void findBooksByAuthor(String author) {
        /*boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }*/
        boolean found = false;

        for ( Book book : books){
              if (book.getAuthor().equalsIgnoreCase(author)) {

                  System.out.println(" Title: " + book.title + " Author: " + book.author + " Publication Year: " + book.publicationYear);

                  found = true;
              }
            }
          if(!found) {
              System.out.println("not found ");
          }
    }
   /* public void borrowBook(String title) {
        boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                System.out.println("You borrowed: \"" + book.getTitle() + "\" by " + book.getAuthor());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book titled \"" + title + "\" not found in the library.");
        }
    }*/

    public void borrowBook(String title) {
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                found = true;
                if (!book.isBorrowed()) {
                    book.borrowed();
                    System.out.println("You borrowed: \"" + book.getTitle() + "\" by " + book.getAuthor());
                } else {
                    System.out.println("Sorry, \"" + book.getTitle() + "\" is already borrowed.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Book titled \"" + title + "\" not found in the library.");
        }
    }

    public void returnBook(String title) {
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                found = true;
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("You returned: \"" + book.getTitle() + "\" by " + book.getAuthor());
                } else {
                    System.out.println("The book \"" + book.getTitle() + "\" was not borrowed.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Book titled \"" + title + "\" not found in the library.");
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return !book.isBorrowed();
            }
        }
        return false;
    }
    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating! Must be between 0 and 5.");
        }
    }
    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;
        int count = 0;

        for (Book book : books) {
            if (book.getRating() > 0) {
                totalRating += book.getRating();
                count++;
            }
        }

        return (count == 0) ? 0.0 : totalRating / count;
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewed = books.get(0);

        for (Book book : books) {
            if (book.getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = book;
            }
        }

        return mostReviewed;
    }


}

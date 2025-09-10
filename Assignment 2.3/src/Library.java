import java.util.ArrayList;

public class Library {

    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();

    }

    public void addBook(Book book) {
        books.add(book);

    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.title);
            System.out.println(book.author);
            System.out.println(book.publicationYear);
        }
    }

    public void findBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }
}
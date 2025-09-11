import java.util.ArrayList;


public class Library {

    private ArrayList<Book> books = new ArrayList<>();

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


}

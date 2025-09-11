
public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Fikir Eskemekabir ", " HadisAlemayehu", 1954);
        Book book2 = new Book("Oromay", "Bealu Girma", 1968);
        Book book3 = new Book("Yetekolefebet", "Dr. Mihiret Debebe", 2018);
        Book book4 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book5 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book6 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        book1.setRating(4.5);
        book1.addReview("Great introduction to Java!");
        book1.addReview("Very detailed and easy to follow.");
        book1.addReview("4");


        library.borrowBook("Oromay");
        library.borrowBook("Introduction to Java Programming");
        //library.displayBooks();
        library.findBooksByAuthor("Dr. Mihiret Debebe");
        library.findBooksByAuthor("Esat woy Abeba");
        library.findBooksByAuthor("Bealu Girma");
        library.findBooksByAuthor("Hadis Alemayehu ");

        //library.displayBooks();

        library.returnBook("Oromay");
        library.returnBook("Introduction to Java Programming");

        System.out.println(library.isBookAvailable("Introduction to Java Programming")); // false
        System.out.println(library.isBookAvailable("Nonexistent Book"));

        //library.displayBooks();

        library.borrowBook("Data Structures and Algorithms");
        //library.displayBooks();

        library.returnBook("Data Structures and Algorithms");
        //library.displayBooks();

        System.out.println("Is 'The Art of Fiction' available? " +
        library.isBookAvailable("The Art of Fiction"));

        System.out.println("\nBook Details:");
        System.out.println(book1);
        System.out.println("Reviews:");
        for (String review : book1.getReviews()) {
            System.out.println("- " + review);

        }
        library.displayBooks();

    }
}



public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Fikir Eskemekabir ", "Hadis Alemayehu ", 1954  ));
        library.addBook(new Book("Oromay", "Bealu Girma", 1968));
        library.addBook(new Book("Yetekolefebet", "Dr. Mihiret Debebe", 2018));
        library.addBook(new Book("Introduction to Java Programming", "John Smith", 2020));
        library.addBook(new Book("Data Structures and Algorithms", "Jane Doe", 2018));
        library.addBook(new Book("The Art of Fiction", "Alice Johnson", 2019));

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

        library.displayBooks();



    }

}


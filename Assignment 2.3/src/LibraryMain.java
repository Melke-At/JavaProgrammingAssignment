
public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Fikir Eskemekabir ", "Hadis Alemayehu ", 1954  ));
        library.addBook(new Book("Oromay", "Bealu Girma", 1968));
        library.addBook(new Book("Yetekolefebet", "Dr. Mihiret Debebe", 2018));

        library.displayBooks();


        library.findBooksByAuthor("Dr. Mihiret Debebe");
        library.findBooksByAuthor("Esat woy Abeba");
        library.findBooksByAuthor("Bealu Girma");
        //library.findBooksByAuthor("Hadis Alemayehu ");

    }

}


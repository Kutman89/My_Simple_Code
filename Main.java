package OOP;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Title", "Dostoyevsky", 1999);
        library.addBook(book1);
        library.LibraryInfo();
    }
}

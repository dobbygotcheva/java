import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList < Book > bookCollection = Book.getBookCollection();
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
        Book.removeBook(book1);
        System.out.println("\nAfter removing " + book1.getTitle() + ":");
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}
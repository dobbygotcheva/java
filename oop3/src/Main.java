public class Main{
    public static void main(String[] args){
        Library library=new Library();

        Book book1=new Book("Alice im wunderland", "Lewis Carol");
        Book book2=new Book("Der kleine Prinz", "Antoint do sent exupery");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in the library.");
        for(Book book: library.getBooks()){
            System.out.println("Title: "+book.getTitle()+", Author: "+book.getAuthor());
        }

        library.removeBook(book1);

        System.out.println("Books in the library after removing.");
        for(Book book: library.getBooks()){
            System.out.println("Title: "+book.getTitle()+", Author: "+book.getAuthor());
        }
    }
}
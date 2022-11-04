import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Book {
    public String bookName;
    public String ISBNNumber;
    public String author;
    public int quantity;
}

class BookStore {

    private static ArrayList<Book> arrayBooks = new ArrayList<Book>();
    private static LinkedList<Book> linkedListBooks = new LinkedList<Book>();

    public static void main(String args[]) {

        buyBookAsArrayList("Tutunamayanlar", "9754700117", "Oğuz Atay", 2);
        buyBookAsArrayList("Tehlikeli Oyunlar", "9754702098", "Oğuz Atay", 1);
        buyBookAsLinkedList("Oyunlarla Yaşayanlar", "9754702101", "Oğuz Atay", 4);

        for (int i = 0; i < arrayBooks.size(); i++) {
            System.out.printf("Book Name: %s\nAuthor: %s \nQuantity: %s\nISBN Number: %s\n", arrayBooks.get(i).bookName,
                    arrayBooks.get(i).author, arrayBooks.get(i).quantity, arrayBooks.get(i).ISBNNumber);
        }

        for (Book book : linkedListBooks) {
            System.out.printf("Book Name: %s\nAuthor: %s \nQuantity: %s\nISBN Number: %s\n", book.bookName,
                    book.author, book.quantity, book.ISBNNumber);
        }
    }

    public static void buyBookAsArrayList(String bookName, String ISBNNumber, String author, int quantity) {
        Book newBook = new Book();
        newBook.bookName = bookName;
        newBook.ISBNNumber = ISBNNumber;
        newBook.author = author;
        newBook.quantity = quantity;
        arrayBooks.add(newBook);
    }

    public static void buyBookAsLinkedList(String bookName, String ISBNNumber, String author, int quantity) {
        Book newBook = new Book();
        newBook.bookName = bookName;
        newBook.ISBNNumber = ISBNNumber;
        newBook.author = author;
        newBook.quantity = quantity;
        linkedListBooks.add(newBook);
    }

}
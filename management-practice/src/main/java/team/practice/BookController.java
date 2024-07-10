package team.practice;

import java.util.ArrayList;

public class BookController {

    private Library library;
    private BookView view;

    public BookController() {
        library = new Library();
        view = new BookView();
    }

    public void addBook(String title, String author, int isbn, boolean isForeignBook) {
        Book book = new Book(title, author,isbn,isForeignBook);
        library.addBook(book);
    }

    public void getBook() {

    }

    public void getBooks() {

    }

    public void updateBook() {

    }

    public void deleteBook() {

    }
}

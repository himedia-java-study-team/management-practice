package team.practice;

import java.util.ArrayList;

public class BookController {

    private Library library;
    private BookView view;

    public BookController() {
        library = new Library();
        view = new BookView();
    }

    public void addBook() {

    }

    public void getBook() {
        Book book = library.getBook(ibsn2);


    }

    public void getBooks() {
        library.getBookList();
    }

    public void updateBook() {

    }

    public void deleteBook() {
        library.deleteBook();
        view.displayBook();
    }
}

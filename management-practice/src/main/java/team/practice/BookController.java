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

    }

    public void getBooks() {
        library.getBookList();
    }

    public void updateBook(int isbn3, String title2) {
        library.updateBook(isbn3,title2);
        view.displayMessage(" 도서 수정이 완료 되었습니다! ");
    }

    public void deleteBook() {
        library.deleteBook();
        view.displayBook();
    }
}

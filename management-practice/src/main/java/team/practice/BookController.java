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
        Book book = library.getBook(ibsn2);


    }

    public void getBooks() {
        ArrayList<Book> books = library.getBookList();
        view.displayBookList(books);
    }

    public void updateBook(int isbn3, String title2) {
        library.updateBook(isbn3,title2);
        view.displayMessage(" 도서 수정이 완료 되었습니다! ");
    }

    public void deleteBook(int isbn) {
        Boolean isDeleteSucess = library.deleteBook(isbn);
        if (isDeleteSucess) {
            view.displayMessage("해당 도서 성공적으로 삭제완료.");
        }
    }
}

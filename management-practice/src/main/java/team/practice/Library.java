package team.practice;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook() {

    }

    public void getBook() {

    }

    public ArrayList<Book> getBookList() {
        return books;
    }

    public void updateBook() {

    }

    public Boolean deleteBook(int isbn) {
        for (Book b : books) {
            if (b.getIsbn() == isbn) {
                books.remove(b);
                return true;
            }
        }
        return false;
    }

}

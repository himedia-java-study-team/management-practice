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

    public Book updateBook(int isbn3, String title2) {
        for(Book b : books) {
            if(b.getIsbn() == isbn3);
            b.setTitle(title2);
            return b;
        }
        return null;
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

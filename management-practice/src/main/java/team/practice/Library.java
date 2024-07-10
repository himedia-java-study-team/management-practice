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

    public void getBookList() {

    }

    public Book updateBook(int isbn3, String title2) {
        for(Book b : books) {
            if(b.getIsbn() == isbn3);
            b.setTitle(title2);
            return b;
        }
        return null;
    }

    public void deleteBook() {

    }

}

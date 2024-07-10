package team.practice;

import java.util.ArrayList;

public class BookView {
    public void displayBook(Book book) {

        System.out.println(book);
    }

    public void displayBookList(ArrayList<Book> books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void displayMessage(String msg) {
            System.out.println(msg);
    }
}

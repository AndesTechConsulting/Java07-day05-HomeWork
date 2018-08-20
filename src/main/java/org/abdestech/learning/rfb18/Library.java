package org.abdestech.learning.rfb18;

import java.util.ArrayList;

/**
 * Created by Евгений on 20.08.2018.
 */
public class Library {

    ArrayList<String> bookList = new ArrayList<>();
    ArrayList<String> booksInStock = new ArrayList<>();
    ArrayList<String> booksNotInStock = new ArrayList<>();

    Library(){}

    public void addBookToBookList(String title){
        bookList.add(title);
        booksInStock.add(title);
    }


    public void getBookToRead(String title) {
        for (int i = 0; i < booksInStock.size(); i++) {
            if (booksInStock.get(i).equals(title)){
                booksInStock.remove(i);
                booksNotInStock.add(title);
            } else {
                System.out.println("Данной книги нет в наличии");
            }
        }
    }

    public void returnBook (String title) {
        for (int i = 0; i < booksNotInStock.size(); i++) {
            booksNotInStock.remove(booksNotInStock.get(i).equals(title));
            booksInStock.add(title);
        }
    }



    public void getListOfBooks() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
    }
}

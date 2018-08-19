package org.abdestech.learning.rfb18;

import java.util.ArrayList;
import java.util.List;


public class Library {

    List <Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
    }

    public void showLibrary(){
        for (Object l:library){
            System.out.println(l);
        }
    }
}
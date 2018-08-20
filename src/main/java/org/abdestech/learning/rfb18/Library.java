package org.abdestech.learning.rfb18;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> lib;

    public Library(ArrayList<Book> book){
        lib = book;
    }

    @Override
    public String toString() {
        return lib.toString();
    }
}

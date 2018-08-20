package org.abdestech.learning.rfb18;

import java.util.ArrayList;

public class Library  {

    private String LName, LAddress;
    private int volume;
    private int BkIndex = 0;
    ArrayList<Book> books;


    Library(String LName, String LAddress, int volume) {

        this.LName = LName;
        this.LAddress = LAddress;
        this.volume = volume;
        books = new ArrayList<>(this.volume);
    }

    Library(String LName, String LAddress) {

        this.LName = LName;
        this.LAddress = LAddress;
        volume = 100;
        books = new ArrayList<>(volume);
    }

    Library() {

        this.LName = "Ddemin's Library";
        this.LAddress = "Omsk city, Aviagorodok str, 9";
        volume = 10;
        books = new ArrayList<>(volume);
    }

    public String getLName() {

        return LName;
    }

    void setLName(String LName) {

        this.LName = LName;
    }

    public String getLAddress() {

        return LAddress;
    }

    void setLAddress(String LAddress) {

        this.LAddress = LAddress;
    }

    public boolean addBook(String BTitle, String BAuthor, int BYear) throws OutFromFutureException {
        books.add(BkIndex, new Book(BTitle, BAuthor, BYear));
        return true;
    }

}


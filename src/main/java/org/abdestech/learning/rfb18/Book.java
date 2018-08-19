package org.abdestech.learning.rfb18;

import java.net.IDN;

public class Book {
    private String author;
    private String title;
    private String year;
    private String ISBN;

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return super.toString();
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}

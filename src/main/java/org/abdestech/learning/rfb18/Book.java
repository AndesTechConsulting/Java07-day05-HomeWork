package org.abdestech.learning.rfb18;

public class Book {

    private String author;
    private String title;
    private int year;
    private String ISBN;

    public Book(String author, String title, int year, String ISBN){
        this.author = author;
        this.title = title;
        this.year = year;
        this.ISBN = ISBN;

    }

    public String getAuthor() {
        return author;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}

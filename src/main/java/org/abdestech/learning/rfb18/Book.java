package org.abdestech.learning.rfb18;

public class Book {
    private String author;
    private String title;
    private int year;
    private String ISBN;

    public Book(String author, String title, int year, String ISBN) {
       setAuthor(author);
       setTitle(title);
       setYear(year);
       setISBN(ISBN);
    }

    public String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    private void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "\nBook info: author - " + author + " title " + title + " year " + year + " ISBN " + ISBN;
    }
}

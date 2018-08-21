package org.abdestech.learning.rfb18;

public class Book {
    private String author;
    private String title;
    private String year;
    private String ISBN;

    public Book(String author, String title, String year, String ISBN) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setYear(year);
        this.setISBN(ISBN);
    }



    public String toString() {
        return author + ", "+title+", "+year+", "+ISBN;
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

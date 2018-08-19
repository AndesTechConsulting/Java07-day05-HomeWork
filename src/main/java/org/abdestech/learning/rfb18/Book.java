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


//корректно переопределить метод toString мне не удалось
    @Override
    public String toString() {
        return null;
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

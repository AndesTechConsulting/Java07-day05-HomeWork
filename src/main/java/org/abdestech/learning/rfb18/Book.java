package org.abdestech.learning.rfb18;

import java.util.Date;

public class Book {

    public String author;
    public String title;
    public Date year;
    public String ISBN;
    private Boolean isReserved = false;

    public Book(String author, String title, Date year, String ISBN) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getReserved() {
        return isReserved;
    }

    public void setReserved(Boolean reserved) {
        isReserved = reserved;
    }

    public String getTitle() {
        return title;
    }

    public Date getYear() {
        return year;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", ISBN='" + ISBN + '\'' +
                ", isReserved=" + isReserved +
                '}';
    }
}

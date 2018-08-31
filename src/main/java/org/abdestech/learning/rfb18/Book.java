package org.abdestech.learning.rfb18;

import java.util.UUID;



public class Book {

    private String author, title, ISBN;
    private short year;
    private String bookStatus;
//--------------------------------------------
    Book(){
        author = "No name";
        title = "[Empty]";
        ISBN = UUID.randomUUID().toString();
        year = Utils.currentYear();
        bookStatus = "Spoiled";

    }

  Book(String title, String author, int year, String bookStatus) throws OutFromFutureException{
        this.author = author;
        this.title = title;
        setYear(year);
        ISBN = UUID.randomUUID().toString();
        this.bookStatus = bookStatus;
    }
//---------------------------------------------
    public String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    void setYear (int y) throws OutFromFutureException{
        short year = (short) y;
        if ( Utils.currentYear() >= year) {
            this.year = year;
        } else {
            throw new OutFromFutureException(year);
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public String toString() {

        String str = ISBN + " / " +
                     author + ", " +
                     title + " " +
                     year;
        return str;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    boolean changeBookStatus(String newStatus) {
        if (newStatus != bookStatus) {
            bookStatus = newStatus;
            return true;
        } else {
            return false;
        }
    }

}


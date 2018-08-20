package org.abdestech.learning.rfb18;

import java.util.UUID;

class OutFromFutureException extends Exception {
    OutFromFutureException(short invalidYear) {
        System.out.println("Попытка определения для книги будущего года: " + invalidYear);
    }
}

public class Book {

    private String author, title, ISBN;
    private short year;

    Book(){
        author = "No name";
        title = "[Empty]";
        ISBN = UUID.randomUUID().toString();

        year = Utils.currentYear();
    }

    Book(String author, String title, int year) throws OutFromFutureException{
        this.author = author;
        this.title = title;
        setYear(year);
        ISBN = UUID.randomUUID().toString();
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

    public void setYear(int y) throws OutFromFutureException{
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

}


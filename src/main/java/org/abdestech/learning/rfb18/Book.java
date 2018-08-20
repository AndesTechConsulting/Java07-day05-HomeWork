package org.abdestech.learning.rfb18;

import java.util.UUID;

class OutFromFutureException extends Exception {

    private String message = "";

    OutFromFutureException(String message) {

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

    Book(String author, String title){
        author = "No name";
        title = "[Empty]";
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

    public void setYear(int y) {
        short year = (short) y;
        if ( Utils.currentYear() >= year) {
            this.year = year;
        } else {

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

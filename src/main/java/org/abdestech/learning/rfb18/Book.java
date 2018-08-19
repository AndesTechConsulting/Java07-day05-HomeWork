package org.abdestech.learning.rfb18;

import java.util.Calendar;

public class Book {

    private String author, title, ISBN;
    private short year;

    Book(){
        author = "No name";
        title = "[Empty]";
        ISBN =
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
        Calendar currentMoment = Calendar.getInstance();
        int currentYear = currentMoment.get(Calendar.YEAR);
        if (currentYear >= year) {
            this.year = year;
        } else {
            System.out.println("Невозможно назначить год издания книги больше текущего!");
        }
    }

    public String getISBN() {
        return ISBN;
    }

}

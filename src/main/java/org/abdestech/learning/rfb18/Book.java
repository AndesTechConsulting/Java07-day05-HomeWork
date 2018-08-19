package org.abdestech.learning.rfb18;

import java.util.Date;

public class Book {

    public String author;
    public String title;
    public int year;
    public String ISBN;


    public Book(String author, String title, int year, String ISBN) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.ISBN = ISBN;
    }

    public String getAuthor() {

        return author;
    }


    public String getTitle() {

        return title;
    }

    public int getYear() {

        return year;
    }

    public String getISBN() {

        return ISBN;
    }

    @Override
    public String toString() {
        return "Новая нига: " + "\n" +"Автор: " + author + "\n" + "Название: " + title + "\n" + "Год= " + year+ "\n" +"ISBN= " + ISBN
                +"\n"+"--------";

    }
}
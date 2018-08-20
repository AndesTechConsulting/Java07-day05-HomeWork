package org.abdestech.learning.rfb18;

/**
 * Created by Евгений on 20.08.2018.
 */
public class Book {

    private String title;
    private String author;
    private String year;
    private String ISBN;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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


    Book (String title, String author, String year, String ISBN) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setYear(year);
        this.setISBN(ISBN);
    }


    public void getBookInfo() {
        System.out.println("Название: " + getTitle() + "; Автор: " + getAuthor() + "; Год издания: "
                + getYear() + "; " + getISBN() + ".");
    }
}

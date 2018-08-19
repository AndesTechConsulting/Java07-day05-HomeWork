package org.abdestech.learning.rfb18;


import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {

    /*    Summator<Double> a1 = new Summator<Double>(12.0,22.1);
        a1.add();*/

        ArrayList<String> books = new ArrayList<String>();

        Library library = new Library();
        Book book =  new Book("Иванов", "Стихи", 1992, "100-222-333");
        Book book2 = new Book("Петров", "Поэмы", 1993 ,"214215-51r");
        library.addBook(book);
        library.addBook(book2);
        library.showLibrary();

    }
}

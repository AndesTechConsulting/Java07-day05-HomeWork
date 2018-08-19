package org.abdestech.learning.rfb18;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

   static ArrayList<Book> books = new ArrayList();


   //мы можем по одной вносить книги в картотеку через консоль...
    public static void addBooks () {
        books.ensureCapacity(0);
        Scanner bookIn = new Scanner(System.in);
        System.out.println("Введите количество книг, которые необходимо добавить");
        int bookQty = bookIn.nextInt();
        books.ensureCapacity(+bookQty);
        //если успею, поставить нормальную защиту от некорректного ввода
        if (bookQty<1){
            System.out.println("Количество книг меньше одной");
        }
         else
        for (int i=0; i<bookQty; i++) {
        System.out.println("Введите название книги");
        String bTitle = bookIn.next();
        System.out.println("Введите автора книги");
        String bAuthor = bookIn.next();
        System.out.println("Введите год написания книги");
        String bYear = bookIn.next();
        System.out.println("Введите ISBN книги");
        String bISBN = bookIn.next();
        books.add(new Book(bTitle,bAuthor,bYear, bISBN));}
        System.out.println("Книги добавлены");

        }
//... или быстро добвить нескольких книг
    public static void addSomeBooks() {
        books.ensureCapacity(+4);
        books.add(new Book ("Лев Николаевич Толстой", "Война и мир", "1867", "0001"));
        books.add(new Book ("Лев Николаевич Толстой", "Анна Каренина", "1873", "0002"));
        books.add(new Book ("Редьярд Киплинг", "Книга Джунглей", "1894", "0003"));
        books.add(new Book ("Эрнест Хэмингуэй", "Прощай, оружие!", "1929", "0004"));

    }




    }





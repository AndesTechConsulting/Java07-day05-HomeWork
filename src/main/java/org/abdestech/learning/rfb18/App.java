package org.abdestech.learning.rfb18;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws BookIsReservedException {

        /**
         *
         * Домашня работа на выходные дни.
         * TODO:
         *
         * 1. Создать обобщённый класс Summator
         *    складывающий 2 любых числа.
         *
         * 2. Создать классы Book и Library.
         *    Book должен содержать поля author, title, year, ISBN.
         *    В классе Book нужно переопределить метод toString.
         *    Класс Library должен уметь дабавлять произвольное
         *    количество книг; В качестве реализации хранилища использовать
         *    коллекцию ArrayList.
         *
         * 3. (Дополнительно, кто успеет)
         *    Интегрировать процесс работы с книгами: организовать выдачу, приём и
         *    учёт книг в Library. Генерировать исключение OutOfLibException,
         *    при попытке выдачи книги, которой нет в библиотеке. Генерировать исключение
         *    BookIsReservedException,
         *    при попытке выдачи книги, которая уже на руках или зарезервирована.
         *
         *
         * 4. В методе main проверить работу классов.
         *
         *
         */
        //Задание 1
        Summator<Double> summator = new Summator<>();
        System.out.println(summator.sum(424, 4444.2222 ));

        //Задание 2
        Book book =  new Book("www", "eee", Date.valueOf("1991-01-01"), "jdj3");
        System.out.println(book.toString());

        //Задание 3
        Library library = new Library();
        library.addBook(book);
        library.addBook(new Book("А. С. Пушкин", "Руслан и Людмила", Date.valueOf("1991-01-01"),"r213"));
        System.out.println("Before: " + library.getStorage());
        System.out.println();
        System.out.println("take a book, please: " + library.getRequiredBook("dfhg"));
        System.out.println();
        System.out.println("After: " + library.getStorage());
    }


}

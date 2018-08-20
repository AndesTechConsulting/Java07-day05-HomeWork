package org.abdestech.learning.rfb18;


import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            books.add(new Book("author" + i, "title" + i, 2000 + i, "123"));
        }

        System.out.println(books.toString());
        Library lib = new Library(books);

        System.out.println("-------------------------");
        System.out.println(lib.toString());

        Summator sum = new Summator();

        System.out.println("-------------------------");
        System.out.println(sum.calculate(100,200));
        System.out.println(sum.calculate(-100,200));
        System.out.println(sum.calculate(100.25,200.345));
        System.out.println(sum.calculate(100,-100));

        System.out.println("----------OR--------------");
        try {
            System.out.println(sum.calc((double)100,(double)200));
            System.out.println(sum.calc((byte)100,(byte)(-100)));
            System.out.println(sum.calc((float)100.25,(float)200.345));
            System.out.println(sum.calc(-100,200));
        }
        catch (ClassCastException ex){
            System.out.println("Cannot cast from one type to another" + ex.getMessage());
        }

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


    }
}

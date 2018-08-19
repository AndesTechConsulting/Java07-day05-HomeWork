package org.abdestech.learning.rfb18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {

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
         *    при попытке выдачи книги, которая уже на руках.
         *
         *
         * 4. В методе main проверить работу классов.
         *
         *
         */
//        Summator sum1 = new Summator(6000,455);
//        sum1.checkSum();
//        System.out.println("Сумма =" + sum1.getSum());
//        System.out.println("----------------------");
//проверка добавления книг в библиотеку
        //Library.addBooks();//метод для ручного ввода книг, закомментирован для ускорения проверки
        Library.addSomeBooks();
        System.out.println("В библиотеке "+Library.books.size()+" книг:");
        for(int i = 0; i < Library.books.size(); i++){
        System.out.println((Library.books.get(i).getAuthor() + ", \""+Library.books.get(i).getTitle()
        +"\", "+Library.books.get(i).getYear()+", "+Library.books.get(i).getISBN() ));
        }

    }

}


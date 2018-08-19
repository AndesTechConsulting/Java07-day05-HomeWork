package org.abdestech.learning.rfb18;


import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {

        Summator<Integer> a1 = new Summator<Integer>(12,22);
        a1.add();
        ArrayList<String> books = new ArrayList<String>();
        books.add("First");
        System.out.println(books.get(0));


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

         *
         */


    }
}

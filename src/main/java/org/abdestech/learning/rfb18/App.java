package org.abdestech.learning.rfb18;


public class App 
{
    public static void main(String[] args )
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
         *    при попытке выдачи книги, которой нет в библиотеке. Генерировать исключение
         *    BookIsReservedException,
         *    при попытке выдачи книги, которая уже на руках или зарезервирована.
         *
         *
         * 4. В методе main проверить работу классов.
         *
         *
         */


        Library lib1 = new Library();

        Book book1 = new Book("Война и мир", "Лев Толстой", "1869", "ISBN-374-23");
        lib1.addBookToBookList("book1");
        Book book2 = new Book("Мастер и Маргарита", "Михаил Булгаков", "1966", "ISBN-987-45");
        lib1.addBookToBookList("book2");



        lib1.getBookToRead("book1");
        lib1.getBookToRead("book1");

        lib1.returnBook("book1");
        lib1.getBookToRead("book1");


        lib1.getListOfBooks();
        book1.getBookInfo();
        book2.getBookInfo();


    }
}

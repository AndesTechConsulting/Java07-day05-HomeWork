package org.abdestech.learning.rfb18;


public class App 
{
    public static void main( String[] args )
    {
        Summator summator1 = new Summator(7.2331,8.2977);
        summator1.getResultSummator();
        System.out.println("---------------------------------------------");

        Book book1 = new Book("Лев Толстой","Война и мир",1869,"814-2-1111-46-32-1");
        Book book2 = new Book("Сергей Лукьяненко", "Черновик", 2005, "8884-22-2");
        Book book3 = new Book("Александр Пушкин", "Капитанская дочка", 1836,"844-21-4-775");
        Library library1 = new Library();
        library1.addLibraryList(book1);
        library1.addLibraryList(book2);
        library1.addLibraryList(book3);

        library1.viewLibrary();

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

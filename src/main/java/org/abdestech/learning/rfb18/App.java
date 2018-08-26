package org.abdestech.learning.rfb18;


public class App {
    public static void main(String[] args) {

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
            try {
                double result1 = Sumator.add(Integer.parseInt(args[0]),
                        Integer.parseInt(args[1]));
                System.out.println("Результат сложения " + args[0] + " + " + args[1] + " - >  " + result1);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Не передано ниодного числа ");
            }
            catch(NumberFormatException e) {
                    System.out.println("Введены нечисловые значения!");
            }
            Library fstLibrary = new Library("Greate Library", "Aviagorodok str, 9", 1000);
            try {
                fstLibrary.addBook("Парфюмер", "Патрик Зюскинд", 2016);
                fstLibrary.addBook("1984", "Оруэл", 1983);
                fstLibrary.addBook("Война и мир", "Л. Толстой", 1967);
                fstLibrary.addBook("Мёртвые души", "Н. Гоголь", 1989);
                fstLibrary.addBook("Мцыри", "М. Лермонтов", 2010);
                fstLibrary.addBook("Чайник для ПК", "Чайник", 2018);
                fstLibrary.addBook("Руководство пользователя гравитацией", "Некто Н", 2015);

            } catch (OutFromFutureException e) {

            }
            try {
                System.out.println(fstLibrary.books.size());
                fstLibrary.getBook("1984", "Оруэл", 1983);
                fstLibrary.getBook("Мёртвые души", "Н. Гоголь", 1989);
            } catch(OutOfLibException e) {

            } catch (SpoiledBookException e) {

            }
    }
}



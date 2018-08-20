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

            Book bk1 = new Book();
            bk1.setYear(2020);
    }
}



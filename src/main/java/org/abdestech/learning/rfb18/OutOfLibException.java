package org.abdestech.learning.rfb18;

public class OutOfLibException extends Exception {
    OutOfLibException() {
        System.out.println("Книга отсутствует в библиотеке");
    }
}

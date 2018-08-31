package org.abdestech.learning.rfb18;

public class OutFromFutureException extends Exception{
    OutFromFutureException(short years) {
        System.out.println("Указан год издания больше текущего: " + years);
    }
}


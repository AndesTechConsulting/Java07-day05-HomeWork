package org.abdestech.learning.rfb18;

public class SpoiledBookException extends Exception{
    SpoiledBookException () {
        System.out.println("Невозможна выдача испорченной книги!");
    }
}

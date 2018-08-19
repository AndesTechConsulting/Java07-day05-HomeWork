package org.abdestech.learning.rfb18;

public class Summator<T extends Number> {

    private T one;
    private T two;

    public <T extends Number> double sum(T one, T two){
        return one.doubleValue()+ two.doubleValue();
    }
}

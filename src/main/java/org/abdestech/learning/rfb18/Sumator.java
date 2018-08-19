package org.abdestech.learning.rfb18;

public class Sumator
{
    public static <T extends Number> double add(T number1, T number2)
    {
        return (number1.doubleValue()) + (number2.doubleValue());
    }

}

package org.abdestech.learning.rfb18;


import java.util.Scanner;

public class Summator<T> {
//заставить сумматор работать мне не удалось, прошу прокомментировать
    private double sum;
    private T value;

    public Summator(T value) {
        this.value = value;
    }

    Summator <Integer> sInt = new Summator<Integer>(42561313);
    Summator <Double> sDouble = new Summator<Double>(564.654);
    Summator <Long> sLong = new Summator<Long>((long)5613.3455);
    Summator <Float> sFloat = new Summator<Float>((float)231.52131);
    Summator<Byte>sByte = new Summator<Byte>((byte)125);
    Summator<Short>sShort = new Summator<Short>((short)32500);




    public void checkSum () {
        sum = sInt.value+sDouble.value+sLong.value+sFloat.value+sByte.value+sShort.value;
        System.out.println("Сумма всех чисел = " + sum);

    }



    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

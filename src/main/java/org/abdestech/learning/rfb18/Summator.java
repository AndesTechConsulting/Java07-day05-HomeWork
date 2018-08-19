package org.abdestech.learning.rfb18;

public class Summator {

    private double a;
    private double b;

    public Summator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void getResultSummator(){
        double res = a + b;
        System.out.println("Сумма двух чисел равна " + res);
    }


}

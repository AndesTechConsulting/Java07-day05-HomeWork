package org.abdestech.learning.rfb18;

public class Summator {

    private double a;
    private double b;

    public Summator(){}

    private void setA(double a) {
        this.a = a;
    }

    private void setB(double b) {
        this.b = b;
    }

    public double calculate(double a, double b){
        setA(a);
        setB(b);
        return a + b;
    }

    public static <T extends Number> double calc(T a, T b){
        return (double)a + (double)b;
    }
}

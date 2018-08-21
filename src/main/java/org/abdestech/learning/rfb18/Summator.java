package org.abdestech.learning.rfb18;




public class Summator<T> {
    private T a;
    private T b;
    private double sum;

    public Summator(T a, T b) {
        this.a = a;
        this.b = b;
    }


        public double checkSum (){
            this.sum = (Double) a+(Double) b;
            return sum;
        }





    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}

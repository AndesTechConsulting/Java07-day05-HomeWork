package org.abdestech.learning.rfb18;

public class Summator<T extends Number> {

        private T firstNumber;
        private T secondNumber;
        private T sum;

        Summator(T firstNumber, T secondNumber){
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }

        public T getFirstNumber(){

            return firstNumber;
        }
        public T getSecondNumber(){

            return secondNumber;
        }

    public void setFirstNumber(T firstNumber) {

            this.firstNumber = firstNumber;
    }

    public void setSecondNumber(T secondNumber) {

            this.secondNumber = secondNumber;
    }

    public void add (){
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
            System.out.println(firstNumber.intValue() + secondNumber.intValue());
        }
    }


package org.example;

public class Calculator {

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int divide(int number1, int number2) {
        if (number2 == 0) {
            throw new DivideByZero();
        }
        return number1 / number2;
    }

    public int sub(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

}

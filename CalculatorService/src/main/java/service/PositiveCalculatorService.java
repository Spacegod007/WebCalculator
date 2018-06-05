package service;

import domain.Calculator;

public class PositiveCalculatorService {

    public int add(int x, int y) throws NegativeNumberException {
        if (x < 0) {
            throw new NegativeNumberException("x is less then zero");
        } else if (y < 0) {
            throw new NegativeNumberException("y is less then zero");
        } else {
            return Calculator.add(x, y);
        }
    }

    public int minus(int x, int y) throws NegativeNumberException {
        if (x < 0) {
            throw new NegativeNumberException("x is less then zero");
        } else if (y < 0) {
            throw new NegativeNumberException("y is less then zero");
        } else if (x - y < 0) {
            throw new NegativeNumberException("result is less then zero");
        } else {
            return Calculator.minus(x, y);
        }
    }

    public int times(int x, int y) throws NegativeNumberException {
        if (x < 0) {
            throw new NegativeNumberException("x is less then zero");
        } else if (y < 0) {
            throw new NegativeNumberException("y is less then zero");
        } else {
            return Calculator.times(x, y);
        }
    }
}

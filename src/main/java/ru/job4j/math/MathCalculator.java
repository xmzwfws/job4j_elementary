package ru.job4j.math;
import ru.job4j.math.MathFunction;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
        + MathFunction.multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return MathFunction.minus(first, second)
        + MathFunction.divide(first, second);
    }

    public static double theSumOfAllTransaction(double first, double second) {
        return sumAndMultiply(first, second) + minusAndDivide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен " + sumAndMultiply(20, 30));
        System.out.println("Результат расчета равен " + minusAndDivide(30, 20));
        System.out.println("Результат расчета равен " + theSumOfAllTransaction(30, 20));
    }
}

package org.example;

import org.example.CalculatorOfComplexNumbers.ComplexCalculator;
import org.example.CalculatorOfComplexNumbers.ComplexNumber;

public class App {
    /**
     * Метод main является точкой входа в программу
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Создаем два комплексных числа
         */
        ComplexNumber num1 = new ComplexNumber(5, 10);
        ComplexNumber num2 = new ComplexNumber(5, 2);
/**
 * Создаем калькулятор комплексных чисел
 */
        ComplexCalculator calculator = new ComplexCalculator();
/**
 * Выполняем операции с комплексными числами
 */
        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);
/**
 * Выводим результаты операций на консоль
 */
        System.out.println("Сложение: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Умножение: " + product.getReal() + " + " + product.getImaginary() + "i");
        System.out.println("Деление: " + quotient.getReal() + " + " + quotient.getImaginary() + "i");
    }
}
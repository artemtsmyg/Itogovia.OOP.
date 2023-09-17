package org.example.CalculatorOfComplexNumbers;

import java.util.logging.Logger;


public class ComplexCalculator {
    private static final Logger LOGGER = Logger.getLogger(ComplexCalculator.class.getName());

    /**
     * Сложение двух комплексных чисел.
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат сложения.
     */
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        LOGGER.info("Выполняется сложение комплексных чисел: " + num1 + " и " + num2);
        return num1.add(num2);
    }

    /**
     * Умножение двух комплексных чисел.
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат умножения.
     */
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        LOGGER.info("Выполняется умножение комплексных чисел: " + num1 + " и " + num2);
        return num1.multiply(num2);
    }

    /**
     * Деление двух комплексных чисел.
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат деления.
     */
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        LOGGER.info("Выполняется деление комплексных чисел: " + num1 + " и " + num2);
        return num1.divide(num2);
    }
}
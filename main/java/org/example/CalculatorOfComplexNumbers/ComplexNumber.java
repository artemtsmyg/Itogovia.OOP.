package org.example.CalculatorOfComplexNumbers;

import java.util.logging.*;

/**
 * Класс, представляющий комплексное число.
 */
public class ComplexNumber {
    /**
     * Действительная часть комплексного числа
     */
    private double real;
    /**
     * Мнимая часть комплексного числа
     */
    private double imaginary;

    /**
     * Создает новый объект ComplexNumber с указанными действительной и мнимой частями
     * @param real
     * @param imaginary
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Получает действительную часть комплексного числа
     * @return
     */
    public double getReal() {
        return real;
    }

    /**
     * Получает мнимую часть комплексного числа
     * @return
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Сложение двух комплексных чисел.
     * @param other Другое комплексное число.
     * @return Результат сложения.
     */
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    /**
     * Умножение двух комплексных чисел.
     * @param other Другое комплексное число.
     * @return Результат умножения.
     */
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    /**
     * Деление двух комплексных чисел.
     * @param other Другое комплексное число.
     * @return Результат деления.
     */
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
}

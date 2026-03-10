package main.java.chapter2;

public class ComplexNumber {

    private double real;
    private double imaginary;

    private ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    private ComplexNumber(double real) {
        new ComplexNumber(real, 0);
    }

    public static ComplexNumber fromReal(double real) {
        return new ComplexNumber(real);
    }

    public static ComplexNumber fromRealAndImaginary(double real, double imaginary) {
        return new ComplexNumber(real, imaginary);
    }
}

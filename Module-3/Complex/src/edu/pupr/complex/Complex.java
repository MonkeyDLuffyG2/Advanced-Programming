package edu.pupr.complex;

import edu.pupr.businessException.BusinessException;

import java.util.Scanner;

/**
 * <p>Author: Luis E. Telemaco <br/>
 * Program: Complex.java <br/>
 * Date   : 11/16/2022 <br/>
 * Description: Class that manages simple arithmetic operations with complex numbers.<br/>
 * History: <br/>    11/16/2022 - File created. LTEM <br/>
 * </p>
 *
 */
public class Complex {
    private double realNumber;
    private double imaginaryNumber;

    /**
     * Complex() - Default constructor
     */
    public Complex() {
        this(0, 0);
    }

    /**
     * Complex() - Parameterized constructor of complex class.
     *
     * @param realNumber Real number
     * @param imaginaryNumber Imaginary number
     */
    public Complex(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    /**
     * getRealNumber() - Get the real part of the complex number.
     *
     * @return real part
     */
    public double getRealNumber() {
        return realNumber;
    }

    /**
     * setRealNumber() - Set or modify the real part of the complex number.
     * @param realNumber
     */
    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }

    /**
     * getImaginaryNumber() - Get the imaginary part of the complex number.
     * @return
     */
    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    /**
     * setImaginaryNumber- Set or modify the imaginary part of the complex number.
     * @param imaginaryNumber
     */
    public void setImaginaryNumber(double imaginaryNumber) {
        this.imaginaryNumber = imaginaryNumber;
    }

    /**
     * add() - Adds two complex numbers together.
     * @param aComplex
     * @return
     */
    public Complex add(Complex aComplex) {
        return new Complex(realNumber + aComplex.realNumber,
                imaginaryNumber + aComplex.imaginaryNumber);
    }

    /**
     * subtract() - Subtracts a complex number from another.
     * @param aComplex
     * @return
     */
    public Complex subtract(Complex aComplex) {
        return new Complex(realNumber - aComplex.realNumber,
                imaginaryNumber - aComplex.imaginaryNumber);
    }

    /**
     * multiply() - Multiplies two complex numbers.
     * @param aComplex
     * @return
     */
    public Complex multiply(Complex aComplex) {
        double real = realNumber * aComplex.realNumber -
                imaginaryNumber * aComplex.imaginaryNumber;
        double imaginary = realNumber * aComplex.imaginaryNumber +
                imaginaryNumber * aComplex.realNumber;

        return new Complex(real, imaginary);
    }

    /**
     * divide() - Divides two complex numbers.
     * @param aComplex
     * @return
     */
    public Complex divide(Complex aComplex) {
        double realPart = realNumber * aComplex.realNumber + imaginaryNumber * aComplex.imaginaryNumber;
        double imaginaryPart = imaginaryNumber * aComplex.realNumber - realNumber * aComplex.imaginaryNumber;

        double denominator = Math.pow(aComplex.realNumber, 2) + Math.pow(aComplex.imaginaryNumber, 2);

        realPart = realPart / denominator;
        imaginaryPart = imaginaryNumber / denominator;

        return new Complex(realPart, imaginaryPart);
    }

    /**
     * ask() - Accepts user inputs for the values of the complex number.
     * @throws BusinessException
     */
    public void ask() throws BusinessException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter real part: ");
        realNumber = input.nextDouble();

        System.out.print("Enter imaginary part: ");
        imaginaryNumber = input.nextDouble();

        if (realNumber == 5 && imaginaryNumber == 5) {
            throw new BusinessException("Complex (5 + 5i) is not valid!");
        }
    }

    /**
     * toString() - Formats the output of the Complex object.
     * @return
     */
    @Override
    public String toString() {
        return String.format("(%.2f + %.2fi)", getRealNumber(), getImaginaryNumber());
    }
}
package edu.pupr.complex;

import edu.pupr.businessException.BusinessException;

import java.util.InputMismatchException;

/**
 * <p>Author: Luis E. Telemaco
 * Program: ComplexDriver.java <br/>
 * Date   : 11/16/2022 <br/>
 * Description:	Main program used to test the Complex and Business Exception classes.<br/>
 * History:<br/>    11/16/2022 - File created. LTEM<br/>
 * </p>
 *
 */
public class ComplexDriver {

    public static void main(String[] args) {
        Complex A = new Complex(6, 9);
        Complex B = new Complex(5, 1);
        Complex C;
        boolean flag = true;

        C = A.add(B);
        System.out.printf("A = %s%n", A.toString());
        System.out.printf("B = %s%n", B);
        System.out.printf("A + B = %s%n", C);

        System.out.println();

        C = A.subtract(B);
        System.out.printf("A = %s%n", A);
        System.out.printf("B = %s%n", B);
        System.out.printf("A - B = %s%n", C);

        System.out.println();

        C = A.multiply(B);
        System.out.printf("A = %s%n", A);
        System.out.printf("B = %s%n", B);
        System.out.printf("A * B = %s%n", C);

        System.out.println();

        do {
            try {
                B.ask();
                flag = false;
            } catch (BusinessException businessException) {
                System.err.printf("Exception: %s\n", businessException);
            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Exception: You must enter a number");
            }
        } while(flag);
        System.out.println();

        C = A.subtract(B);
        System.out.printf("A = %s%n", A);
        System.out.printf("B = %s%n", B);
        System.out.printf("A - B = %s%n", C);

        flag = true;

        do {
            try {
                B.ask();
                C = A.divide(B);
                if (Double.isNaN(C.getRealNumber()))
                {
                    throw new ArithmeticException("Division by zero is not allowed!");
                }
                flag = false;
            } catch (BusinessException businessException) {
                System.err.printf("Exception: %s\n", businessException);
            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Exception: You must enter a number");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("Exception: %s\n", arithmeticException.getMessage());
            }
        } while(flag);
        System.out.println();

        System.out.printf("A = %s%n", A);
        System.out.printf("B = %s%n", B);
        System.out.printf("A / B = %s%n", C);
    }
}
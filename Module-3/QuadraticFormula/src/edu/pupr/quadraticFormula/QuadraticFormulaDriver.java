package edu.pupr.quadraticFormula;

import java.awt.desktop.QuitStrategy;
import java.util.InputMismatchException;

/**
 * Author: Luis E. Telemaco, #126779
 * Description: Main done to test the QuadraticFormula class and its exception handling.
 * History:     11/16/2022 - Created Program. LETM
 */
public class QuadraticFormulaDriver {
    /**
     * main() - main program that is used to test the QuadraticFormula class
     * @param args
     */
    public static void main(String[] args){
        boolean flag = true;

        do {
            try{
                QuadraticFormula quadraticFormula = new QuadraticFormula();

                quadraticFormula.askCoefficients();
                System.out.printf("Roots for %s = %s\n", quadraticFormula.showEquation(), quadraticFormula);
                flag = false;
            } catch(InputMismatchException inputMismatchException) {
                System.err.println("Exception: Not a valid number!");
            } catch(ArithmeticException arithmeticException){
                System.err.println("Exception: " + arithmeticException.getMessage());
            }
        }while (flag);
    }
}

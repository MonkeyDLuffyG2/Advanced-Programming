package edu.pupr.quadraticFormula;

import java.util.Scanner;

/**
 * <p>Author: Luis E. Telemaco, #126779 <br/>
 * Description: Program that calculates and displays the roots of a quadratic equation by using the quadratic formula.
 * It does so by accepting the coefficient inputs and containing validation for exceptions. <br/>
 * History:     11/16/2022 - Created Program. LETM <br/>
 * </p>
 */
public class QuadraticFormula {
    // ax^2 + bx + c = 0
    // Coefficients
    private int coefA;
    private int coefB;
    private int coefC;
    // Roots
    private double x1;
    private double x2;

    /**
     * QuadraticFormula() - default constructor that initializes the coefficient variables.
     */
    public QuadraticFormula(){
        this(-1,0,0);
    }

    /**
     * QuadraticFormula() - parameterized constructor that accepts values for the coefficient variables.
     * @param coefA
     * @param coefB
     * @param coefC
     */
    public QuadraticFormula(int coefA, int coefB, int coefC) {
        setCoefA(coefA);
        setCoefB(coefB);
        setCoefC(coefC);

        calculateRoots();
    }
    // Formula
    // (-b +- sqrt(b^2 - 4ac)/2a)

    /**
     * getCoefA() - a coefficient getter/accessor function.
     * @return
     */
    public int getCoefA() {
        return coefA;
    }

    /**
     * setCoefA() - a coefficient setter/mutator function.
     * @param coefA
     */
    public void setCoefA(int coefA) {
        if (coefA != 0)
        {
            this.coefA = coefA;
        } else {
            throw new ArithmeticException("\"a\" can't be zero!");
        }
    }

    /**
     * getCoefB() - b coefficient getter/accessor function.
     * @return
     */
    public int getCoefB() {
        return coefB;
    }

    /**
     * setCoefB() - b coefficient setter/mutator function.
     * @param coefB
     */
    public void setCoefB(int coefB) {
        this.coefB = coefB;
    }

    /**
     * getCoefC() - c coefficient getter/accessor function.
     * @return
     */
    public int getCoefC() {
        return coefC;
    }

    /**
     * setCoefC() - c coefficient setter/mutator function.
     * @param coefC
     */
    public void setCoefC(int coefC) {
        this.coefC = coefC;
    }

    /**
     * getX1() - x1 root getter/accessor function.
     * @return
     */
    public double getX1() {
        return x1;
    }

    /**
     * getX2() - x2 root getter/accessor function.
     * @return
     */
    public double getX2() {
        return x2;
    }

    /**
     * calculateDiscriminant() - function that calculates the discriminant.
     * @return
     */
    private double calculateDiscriminant(){
        return (coefB*coefB-4*coefA*coefC);
    }

    /**
     * calculateRoots() - function that calculates the roots by using the quadratic formula.
     */
    public void calculateRoots(){
        if (calculateDiscriminant() >= 0)
        {
            x1 = (-coefB + Math.sqrt(calculateDiscriminant()))/(2*coefA);
            x2 = (-coefB - Math.sqrt(calculateDiscriminant()))/(2*coefA);
        } else {
            throw new ArithmeticException("Imaginary results!");
        }
    }

    /**
     * askCoefficients() - function that receives user input for the coefficients of the quadratic equation
     */
    public void askCoefficients(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficients to calculate the roots");
        System.out.println("In the form of ax^2 + bx + c = 0");

        System.out.print("a = ");
        setCoefA(input.nextInt());

        System.out.print("b = ");
        setCoefB(input.nextInt());

        System.out.print("c = ");
        setCoefC(input.nextInt());

        calculateRoots();
    }

    /**
     * toString() - function that formats the output of the QuadraticEquation object
     * @return
     */
    @Override
    public String toString() {
        return String.format("%.2f, %.2f)", x1, x2);
    }

    /**
     * showEquation() - function that displays the quadratic equation with the coefficients that were received.
     * @return
     */
    public String showEquation(){

        return String.format("%dx^2 + %dx + %d = 0", getCoefA(), getCoefB(), getCoefC());
    }
}

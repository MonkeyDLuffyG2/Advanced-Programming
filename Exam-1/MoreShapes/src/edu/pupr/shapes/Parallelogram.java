package edu.pupr.shapes;

import java.util.Scanner;

/**
 *  Program: Parallelogram.java <br/>
 *  Author: Luis E. Telemaco <br/>
 *  Description: Class derived from the Shape class that stores the base and height of a parallelogram and calculates its area. <br/>
 *  History: <br/>
 *      12/10/2022 - File created. LETM <br/>
 */
public class Parallelogram extends Shape{
    private double base, height;

    /**
     * Parallelogram() - Default Constructor.
     */
    public Parallelogram() {
        super("Parallelogram");
        setBase(0.0);
        setHeight(0.0);
    }

    /**
     * Parallelogram() - Parameterized Constructor.
     * @param base
     * @param height
     */
    public Parallelogram(double base, double height) {
        super("Parallelogram");
        setBase(base);
        setHeight(height);
    }

    /**
     * getBase() - Getter/Accessor function that returns the value stored in the base variable.
     * @return side
     */
    public double getBase() {
        return base;
    }

    /**
     * setBase() - Setter/Mutator function that updates or stores a value in the base variable if it's not less than zero.
     * @param base
     */
    public void setBase(double base) {
        if (base < 0.0){
            throw new ArithmeticException("The base's value can't be a negative number.\n");
        }
        this.base = base;
    }

    /**
     * getHeight() - Getter/Accessor that returns the value stored in the height variable.
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * setHeight() - Setter/Mutator function that updates or stores a value in the height variable if it's not less than zero.
     * @param height
     */
    public void setHeight(double height) {
        if (height < 0.0){
            throw new ArithmeticException("The height's value can't be a negative number.\n");
        }
        this.height = height;
    }

    /**
     * toString() - Function that formats the output of the shape when printing it.
     * @return
     */
    @Override
    public String toString(){
        return String.format("%s of base %.2f and height %.2f has an area of %d.", super.getShapeName(), getBase(), getHeight(), calcArea());
    }

    /**
     * calcArea() - Function that calculates the area of the parallelogram and returns it as an int.
     * @return base * height
     */
    @Override
    public int calcArea() {
        return (int) (getBase() * getHeight());
    }

    /**
     * askMeasurements() - Function that will accept user input for the base and height and validate if the values entered are acceptable.
     */
    @Override
    public void askMeasurements() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the measurement of the base: ");
        setBase(input.nextDouble());
        System.out.print("Enter the measurement of the height: ");
        setHeight(input.nextDouble());
    }
}

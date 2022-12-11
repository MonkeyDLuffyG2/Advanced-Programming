package edu.pupr.shapes;

import java.util.Scanner;

/**
 *  Program: Rectangle.java <br/>
 *  Author: Luis E. Telemaco <br/>
 *  Description: Class derived from the Shape class that stores the length and width of a Rectangle and calculates its area. <br/>
 *  History: <br/>
 *      12/10/2022 - File created. LETM <br/>
 */
public class Rectangle extends Shape{
    private double length, width;

    /**
     * Rectangle() - Default Constructor.
     */
    public Rectangle() {
        super("Rectangle");
        setLength(0.0);
        setWidth(0.0);
    }

    /**
     * Rectangle() - Parameterized Constructor.
     * @param length
     * @param width
     */
    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    /**
     * getLength() - Getter/Accessor function that returns the value stored in the length variable.
     * @return side
     */
    public double getLength() {
        return length;
    }

    /**
     * setlength() - Setter/Mutator function that updates or stores a value in the length variable if it's not less than zero.
     * @param length
     */
    public void setLength(double length) {
        if (length < 0.0){
            throw new ArithmeticException("The length's value can't be a negative number.\n");
        }
        this.length = length;
    }

    /**
     * getWidth() - Getter/Accessor that returns the value stored in the width variable.
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * setWidth() - Setter/Mutator function that updates or stores a value in the width variable if it's not less than zero.
     * @param width
     */
    public void setWidth(double width) {
        if (width < 0.0){
            throw new ArithmeticException("The width's value can't be a negative number.\n");
        }
        this.width = width;
    }

    /**
     * toString() - Function that formats the output of the shape when printing it.
     * @return
     */
    @Override
    public String toString(){
        return String.format("%s of length %.2f and width %.2f has an area of %d.", super.getShapeName(), getLength(), getWidth(), calcArea());
    }

    /**
     * calcArea() - Function that calculates the area of the Rectangle and returns it as an int.
     * @return length * width
     */
    @Override
    public int calcArea() {
        return (int) (getLength() * getWidth());
    }

    /**
     * askMeasurements() - Function that will accept user input for the length and width and validate if the values entered are acceptable.
     */
    @Override
    public void askMeasurements() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the measurement of the length: ");
        setLength(input.nextDouble());
        System.out.print("Enter the measurement of the width: ");
        setWidth(input.nextDouble());
    }
}

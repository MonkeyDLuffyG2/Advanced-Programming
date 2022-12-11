package edu.pupr.shapes;

import java.util.Scanner;

/**
 *  Program: Circle.java <br/>
 *  Author: Luis E. Telemaco <br/>
 *  Description: Class derived from the Shape class that stores the radius of a circle and calculates its area. <br/>
 *  History: <br/>
 *      12/10/2022 - File created. LETM <br/>
 */
public class Circle extends Shape{
    private double radius;

    /**
     * Circle() - Default Constructor
     */
    public Circle(){
        super("Circle");
        setRadius(0.0);
    }

    /**
     * Circle() - Parameterized Constructor.
     * @param radius
     */
    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    /**
     * getRadius() - Getter/Accessor function that returns the value stored in the radius variable.
     * @return
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setRadius() - Setter/Mutator function that updates or stores a value in the radius variable if it's not less than zero.
     * @param radius
     */
    public void setRadius(double radius) {
        if (radius < 0.0) {
            throw new ArithmeticException("The radius value can't be a negative number.\n");
        }
        this.radius = radius;
    }

    /**
     * toString() - Function that formats the output of the shape when printing it.
     * @return
     */
    @Override
    public String toString(){
        return String.format("%s of radius %.2f has an area of %d.", super.getShapeName(), getRadius(), calcArea());
    }

    /**
     * calcArea() - Function that calculates the area of the circle and returns it as an int.
     * @return PI * radius^2
     */
    @Override
    public int calcArea(){
        final double PI = 3.1415;
        return (int) (PI * radius * radius);
    }

    /**
     * askMeasurements() - Function that will accept user input for the radius and validate if the value entered are acceptable.
     */
    @Override
    public void askMeasurements() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the measurement of the radius: ");
        setRadius(input.nextDouble());
    }
}

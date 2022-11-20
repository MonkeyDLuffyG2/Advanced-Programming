package edu.pupr.shapes;

import java.util.Scanner;

public class Triangle extends Shapes{
    private double base;
    private double height;

    public Triangle(){
        super("Triangle");
        setBase(0);
        setHeight(0);
    }

    public Triangle(double base, double height){
        super("Triangle");
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void askMeasurements() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the measure for the base: ");
       setBase(input.nextDouble());

        System.out.println("Enter the measure for the height: ");
        setHeight(input.nextDouble());

    }

    @Override
    public double calculateArea() {
        return getBase() * getHeight() / 2.0;
    }

    @Override
    public String toString(){
        return String.format("%s area %.2f", super.getFigureName(), calculateArea());
    }

    public void showInfo(){
        System.out.printf("The %s with base of size %.1f and height of size %.1f has an area of %.1f", getFigureName(), getBase(), getHeight(), calculateArea());
    }

    public static void main (String[] args){
        Triangle triangle = new Triangle();

        triangle.askMeasurements();
        triangle.showInfo();
    }
}

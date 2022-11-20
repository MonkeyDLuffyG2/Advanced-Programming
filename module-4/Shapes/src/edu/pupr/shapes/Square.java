package edu.pupr.shapes;

import java.util.Scanner;

public class Square extends Shapes{
    private double side;

    public Square(){
        this(0);
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public void askMeasurements() {

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the measure for the %s's side: ", getFigureName());
        setSide(input.nextDouble());

    }

    @Override
    public double calculateArea() {
        return getSide() * getSide();
    }

    public void showInfo(){
        System.out.printf("The %s with sides of size %.1f has an area of %.1f", getFigureName(), getSide(), calculateArea());
    }

    @Override
    public String toString(){
        return String.format("%s area %.2f", super.getFigureName(), calculateArea());
    }

    public static void main (String[] args){
        Square square = new Square();

        square.askMeasurements();
        square.showInfo();
    }
}

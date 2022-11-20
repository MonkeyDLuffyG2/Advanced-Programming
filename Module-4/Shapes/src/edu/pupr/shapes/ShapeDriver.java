package edu.pupr.shapes;

public class ShapeDriver {
    public static void main(String[] args){
        Shapes[] shapes = new Shapes[2];

        shapes[0] = new Triangle(3,2);
        shapes[1] = new Square(8);

        for (Shapes shape:shapes){
            System.out.println(shape);
        }

        System.out.println();

        for (Shapes shape:shapes){
            shape.askMeasurements();
        }

        System.out.println();

        for (Shapes shape:shapes){
            System.out.println(shape);
        }
    }
}

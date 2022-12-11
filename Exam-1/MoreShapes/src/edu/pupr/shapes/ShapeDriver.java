package edu.pupr.shapes;

public class ShapeDriver {
    public static void main(String[] args){
        final int NUMBER_OF_SHAPES = 3;
        Shape[] shapes = new Shape[NUMBER_OF_SHAPES];
        boolean flag = true;
        int counter = 0;

        shapes[0] = new Parallelogram();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();

        do {
            try{
                System.out.println(" ");
                shapes[counter].askMeasurements();
                counter++;
                if (counter == NUMBER_OF_SHAPES) flag = false;
            } catch(ArithmeticException arithmeticException){
                System.err.println("Exception: " + arithmeticException.getMessage());
            }
        } while(flag && counter < NUMBER_OF_SHAPES);

        System.out.println("Shapes Information");

        for (Shape shape: shapes) {
            System.out.println(shape);
        }
    }
}

package edu.pupr.shapes;

public class ShapeDriver {
    public static void main(String[] args){
        BasePoint[] shapes = new BasePoint[4];

        shapes[0] = new Circle(7, 8, 55);
        shapes[1] = new Square(5, 8, 18);
        shapes[2] = new Rectangle(4, 3, 43, 10);
        shapes[3] = new Oval(-8, -1, 15, 8);

        for (BasePoint shape:shapes) {
            shape.showInfo();
            System.out.println();
        }
    }
}

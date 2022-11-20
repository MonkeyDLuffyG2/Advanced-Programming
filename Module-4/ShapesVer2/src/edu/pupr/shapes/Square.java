package edu.pupr.shapes;

public class Square extends FigureOnePoint{
    public Square(double x, double y, double side) {
        super(x, y, side);
    }

    @Override
    public String type() {
        return "Square";
    }
}

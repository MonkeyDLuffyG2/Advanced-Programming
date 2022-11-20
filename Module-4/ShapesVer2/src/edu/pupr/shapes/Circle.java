package edu.pupr.shapes;

public class Circle extends FigureOnePoint{
    @Override
    public String type() {
        return "Circle";
    }

    public Circle(double x, double y, double radius) {
        super(x, y, radius);
    }
}

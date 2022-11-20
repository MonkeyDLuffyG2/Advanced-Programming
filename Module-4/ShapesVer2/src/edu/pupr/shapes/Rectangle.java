package edu.pupr.shapes;

public class Rectangle extends FigureTwoPoints{
    public Rectangle(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    public String type() {
        return "Rectangle";
    }
}

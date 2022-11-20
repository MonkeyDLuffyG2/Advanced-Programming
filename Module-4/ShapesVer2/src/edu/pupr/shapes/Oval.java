package edu.pupr.shapes;

public class Oval extends FigureTwoPoints{
    public Oval(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    public String type() {
        return "Oval";
    }
}

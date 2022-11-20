package edu.pupr.shapes;

public abstract class FigureOnePoint extends BasePoint {
    private double p1;

    public FigureOnePoint(double x, double y, double p1) {
        super(x, y);
        setP1(p1);
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    @Override
    public void showInfo() {
        super.showInfo();

        System.out.printf("\nProperty 1: p = %f", p1);
    }

    @Override
    public String type() {
        return null;
    }
}

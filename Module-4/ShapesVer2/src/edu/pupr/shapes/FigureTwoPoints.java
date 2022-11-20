package edu.pupr.shapes;

public abstract class FigureTwoPoints extends FigureOnePoint{
    private double p2;

    public FigureTwoPoints(double x, double y, double p1, double p2) {
        super(x, y, p1);
        this.p2 = p2;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    @Override
    public void showInfo() {
        super.showInfo();

        System.out.printf("\nProperty 2: p = %f", p2);
    }
}

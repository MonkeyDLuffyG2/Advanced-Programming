package edu.pupr.shapes;

public abstract class BasePoint {

   private double x;
   private double y;

    BasePoint(double x, double y){
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void showInfo(){
        System.out.printf("\nFigure: %s", type());
        System.out.printf("\nPosition: (%.2f, %.2f)", x, y);
    }

    public abstract String type();
}

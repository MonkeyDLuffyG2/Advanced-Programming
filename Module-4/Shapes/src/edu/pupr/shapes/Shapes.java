package edu.pupr.shapes;

public abstract class Shapes {
    private String figureName;

    public Shapes() {
        this("Not Defined");
    }

    public Shapes(String figureName){
        setFigureName(figureName);
    }

    public void setFigureName(String figureName)
    {
        this.figureName = figureName;
    }

    public String getFigureName(){
        return figureName;
    }

    public abstract void askMeasurements();
    public abstract double calculateArea();
}

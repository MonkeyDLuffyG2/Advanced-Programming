package edu.pupr.shapes;

/**
 *  Program: Shape.java <br/>
 *  Author: Luis E. Telemaco <br/>
 *  Description: Abstract class that accepts the name of a shape and is used as a building block for future classes.<br/>
 *  History: <br/>
 *      12/10/2022 - File created. LETM <br/>
 */
public abstract class Shape {
    private String shapeName;

    /**
     * Shape() - Default Constructor.
     */
    public Shape(){
        setShapeName("");
    }

    /**
     * Shape() - Parameterized constructor.
     * @param shapeName
     */
    public Shape(String shapeName) {
        setShapeName(shapeName);
    }

    /**
     * getShapeName() - Getter/Accessor function that returns the value stored in the shapeName variable.
     * @return shapeName
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * setShapeName() - Setter/Mutator function that updates or stores a value inside the shapeName variable.
     * @param shapeName
     */
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    /**
     * calcArea() - Abstract method that will calculate the area of the shapes to be derived from this base class.
     * @return
     */
    public abstract int calcArea();

    /**
     * askMeasurements() - Abstract method that will accept the user's inputs in the shapes to be derived from this base class.
     */
    public abstract void askMeasurements();

}

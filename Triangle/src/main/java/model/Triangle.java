package model;

public class Triangle {

    private double base;
    private double height;

    // default constructor with zero values
    public Triangle() {
        this(0, 0);
    }

    // constructor with base and height values
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // returns the base of the triangle
    public double getBase() {
        return base;
    }
    
    // sets the base of the triangle
    public void setBase(double base) {
        this.base = base;
    }
    
    // returns the height of the triangle
    public double getHeight(){
        return height;
    }
    
    // sets the height of the triangle
    public void setHeight(double height) {
        this.height = height;
    }
    
    // calculates the area of the triangle
    public double getArea(){
        return ((getBase() * getHeight()) / 2.0);
    } 
}


package com.EnusA.Prac3_2;

/**
 * Created by enusa on 2017/03/25.
 */
public class Triangle implements CalcArea {
    //AE
    private String name;
    private String colour;private double area;
    public Triangle(String nm, String clr){
        name =nm;
        colour = clr;
    }

    public double area(double breadth, double height) {
        return area = (height * (0.5*breadth));
    }
    //GM
    public String myString()
    {
        return ("Name of shape: " + name + "\nColour of shape: " + colour + "\nArea of shape: " + area);
    }
}

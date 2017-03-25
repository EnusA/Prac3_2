package com.EnusA.Prac3_2;


public class Square extends Shapes {
    //AE
    private String name;
    private String colour;
    private double area;
    public Square(String nm, String clr){
        name =nm;
        colour = clr;
    }

    @Override
    public double area(double length, double breadth) {
        return area =(length *breadth);
    }
    //GM
    public String myString()
    {
        return ("Name of shape: " + name + "\nColour of shape: " + colour + "\nArea of shape: " + area);
    }
}

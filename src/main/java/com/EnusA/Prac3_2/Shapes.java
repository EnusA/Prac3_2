package com.EnusA.Prac3_2;


public class Shapes implements CalcArea {
    //GM
    protected String name;
    protected String colour;
    //AE
    Shapes(){}
    public Shapes(String nm, String clr) {
        name = nm;
        colour = clr;
    }

    //GM
    public double area(double a, double b) {
        return (a+b);
    }
}

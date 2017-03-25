package com.EnusA.Prac3_2;


public class Prac3_2_main
{
    public static void main( String[] args )
    {
        //GM
        Square s = new Square("Square", "Blue");
        s.area(3, 2);
        System.out.println(s.myString());

        Triangle t = new Triangle("Triangle", "Red");
        t.area(3, 7);
        System.out.println(t.myString());
    }
}

package com.syntax.class21;

public class task1 {
            /*
            Create 1 class in which create a methods that will calculate the area
             (volume in case of box) of
        Rectangle
        Square
        Box
        Use separate class to test your code
             */
public static void area(double width, double height ){
    System.out.println(width*height);
}
   public static void area(double side) {
       System.out.println(side * side);
    }
   public static void area(double width, double height, double length ){
        System.out.println(width*height*length);
    }
}

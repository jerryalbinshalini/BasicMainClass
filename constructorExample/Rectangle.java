package com.constructorExample;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(){//No-Arguments Passded
        System.out.println("Non-Parametrized Constructor");
        //instance variable
        length=23;
        breadth=12;
//        System.out.println("Area of rectangle is:"+(length*breadth));
    }
    // non argument static keyword not used
    public  int calculateRectangle(){
        System.out.println("Area of rectangle is:"+(length*breadth));
        return length*breadth;

    }

}
class NonArgumentConstructor{
    public static void main(String[] args) {
//        new Rectangle();
        Rectangle rectangle=new Rectangle();
        rectangle.calculateRectangle();

    }
}
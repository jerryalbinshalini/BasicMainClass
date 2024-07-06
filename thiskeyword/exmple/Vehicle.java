package com.thiskeyword.exmple;

public class Vehicle {
    public static void main(String[] args){
       // Car car=new Car("Honda","Red",2345);
       // car.display();
        //default constructor calling:
        Car defcar=new Car();
        /*->1.arguments not passed so output are
        Car name:BMW
       Car name:null
      Car Color:null
       Car number:0
        2.   calling for default constructor to paramerter constructor
        output are Car name:BMW
         Car name:Honda
         Car Color:Gray
         Car number:456
         */
        defcar.display();

    }
}

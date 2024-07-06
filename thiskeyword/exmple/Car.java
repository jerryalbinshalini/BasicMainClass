package com.thiskeyword.exmple;

public class Car {
   static String name;
    String color;
    int number;
    //default constructor
    Car(){
        /*  calling for default constructor to paramerter constructor
        ,used for this keyword in first line */
        this("Honda","Gray",456);
        System.out.println("Default constructor");
    }
    Car(String name,String color,int number){
        this("Four");
        System.out.println("parametrize constructor");
       this. name=name;
        this.color=color;
        this.number=number;

    }
    Car(String seats){
        System.out.println("Seat number is:"+seats);
    }
    public  void getData(){
        System.out.println("I am data");
    }
    public  void display(){
        this.getData();
        String name="BMW";
        System.out.println("Car name:"+name);
        System.out.println("Car name:"+this.name);
        System.out.println("Car Color:"+color);
        System.out.println("Car number:"+number);
    }

}

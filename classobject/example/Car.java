package com.classobject.example;

public class Car {
    //state or properties
    String name;
    String color;
    int seat;
    //behaviour or method
    public void hondaCarDetails(){
        System.out.println(" Honda Car Details:");
    }
    public void bmwCarDetails(){
        System.out.println(" BMW Car Details:");
    }
    public void display(String name,String color,int seat){
        System.out.println("Car Name is:"+name+","+"Car Color is:"+color+","+"Car seat is:"+seat);
    }
}


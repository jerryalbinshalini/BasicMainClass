package com.singleinheritance.usingprivatevariable;

public class Cats extends Animal{


    private String color;
    Cats(String food, int noOfLegs, boolean vegitarian, String color){
        super(food,noOfLegs,vegitarian);
        this.color=color;

    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

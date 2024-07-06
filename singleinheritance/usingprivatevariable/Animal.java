package com.singleinheritance.usingprivatevariable;

//Code reuse is the most important benefit of inheritance because subclasses
// inherits the variables and methods of superclass.
//Private members of superclass are not directly accessible to subclass.
//but it can be indirectly accessible via getter and setter methods.

public class Animal {

    private String food;
    private int noOfLegs;
    private boolean vegitarien;
    public Animal(String food,int noOfLegs,boolean vegitarien){
        this.food=food;
        this.noOfLegs=noOfLegs;
        this.vegitarien=vegitarien;
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegitarien() {
        return vegitarien;
    }

    public void setVegitarien(boolean vegitarien) {
        this.vegitarien = vegitarien;
    }

}

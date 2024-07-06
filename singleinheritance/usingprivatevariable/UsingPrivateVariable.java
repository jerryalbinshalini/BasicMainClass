package com.singleinheritance.usingprivatevariable;

public class UsingPrivateVariable {
    public  static  void main(String[] args){
        Cats cat=new Cats("Milk",4,false,"white");
        System.out.println("Cat is vegitarien?:"+cat.isVegitarien());
        System.out.println("Cat eats Food is:"+cat.getFood());
        System.out.println("Number of legs in cat:"+cat.getNoOfLegs());
        System.out.println("Cat Color is:"+cat.getColor());
    }
}

package com.FinalKeyword.ExampleNew;

public class FinalVariableExample {
    public static void main(String[] args){
        FinalVariableExample finalVariableExample=new FinalVariableExample();
        finalVariableExample.calculateAreaOfCircle();
    }
   private  final double PI=3.14;





    int radius=4;
    int height=5;
    public void calculateAreaOfCircle(){
    //this.PI=4.5;

        System.out.println("Area of Circle is:"+(PI*radius*radius));
        System.out.println("cylinder"+(2*PI*radius*height));

    }
}

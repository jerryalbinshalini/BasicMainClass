package com.methodcreation;

public class MethodCreationExample {
    public static void main(String[] args) {
      /*  MethodCreationExample methodCreationExample=new MethodCreationExample();
        methodCreationExample.printName();
        */
//        printNameOne();
//        printNameTwo();
        addition(4,6);
        additionOne();
    }
    public void printName(){
        String name="shalini";
        System.out.println("My name is :"+name);
    }
    public static void printNameOne(){
        String name="shalini";
        System.out.println("My name is :"+name);
    }
    public static String printNameTwo(){
        String name="shalini";
        System.out.println("My name is :"+name);
        return name;
    }
    public static int addition(int numberOne,int numberTwo){
        int result=numberOne+numberTwo;
        System.out.println("Addition of two number is:"+(result));
        return result;
    }
    public static int additionOne(){
        int numberOne = 3,numberTwo=5;
        System.out.println("Addition of two number is:"+(numberOne+numberTwo));
        return numberOne+numberTwo;
    }


}

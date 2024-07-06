package com.methodcreation.example;

public class MethodCreationExample {
    public static void main(String[] args){
//        MethodCreationExample methodCreationExample=new MethodCreationExample();
//        methodCreationExample.printName();
//        methodCreationExample.printNameOne();
//        printNameTwo();
//        printNameThree("Abija");
        addTwoNumber(4,7);

    }
    public void printName(){
        String name="Abija";
        System.out.println("my name is:"+name);
    }
    public String printNameOne(){
        String name="Abija";
        System.out.println("my name is:"+name);
        return name;
    }
    public static String printNameTwo(){
        String name="Abija";
        System.out.println("my name is:"+name);
        return name;
    }
    public static String printNameThree(String name){

        System.out.println("my name is:"+name);
        return name;
    }
    public static int addTwoNumber(int numberOne,int numberTwo){

        System.out.println("Add of two number is:"+numberOne+numberTwo);
        return numberOne+numberTwo;
    }

}

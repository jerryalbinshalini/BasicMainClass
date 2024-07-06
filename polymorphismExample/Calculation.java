package com.polymorphismExample;

public class Calculation {
    int numberOne;
    int numberTwo;
    int numberThree;


    String name;

    public void addition(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        numberOne = 5;
        // numberOne=n;
        this.numberTwo = numberTwo;
        System.out.println("Addition of two number is:" + (numberOne + numberTwo));

    }

    public void addition(double numberOne, double numberTwo, int numberThree) {
        this.numberOne = (int) numberOne;//Type casting that means->assign a
        // one primitive datatype to another  primitive data type
        this.numberTwo = (int) numberTwo;
        this.numberThree = numberThree;
        System.out.println("Addition of three number is:" + (numberOne + numberTwo + numberThree));

    }

    //void ->no return type,String->return type
    public String addition(int numberOne, String name) {
        this.numberOne = numberOne;
        this.name = name;
        System.out.println("I am a number:" + (numberOne + name));
        return numberOne + name;

    }
}
class CompileTimePolymorphism{
    public  static void main(String[] args){
        Calculation calculation=new Calculation();

        // wrong way:System.out.println("Compile time Polymorphism Example:"+(calculation.addition(2,4))+"\n"+(calculation.addition(2,4,5))+"\n"+(calculation.addition(1,"elements")));
//        System.out.println("Compile");
        //calculation.addition(1,"shal");
//
        System.out.println("Compile time Polymorphism Example:"+
                calculation.addition(1,"elements"));
        calculation.addition(2,3);//2 is not consider,assign the numberOne value is 5;
        calculation.addition(2,3,4);

    }
}

//come in error
//    public void addition(int numberOne,String name){
//        this.numberOne=numberOne;
//        this.name=name;
//        System.out.println("I am a number:"+(numberOne+name));
////        return numberOne+name;
//
    //}



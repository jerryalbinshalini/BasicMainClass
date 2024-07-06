package com.abstractMethodandClass;

public abstract class Addition {
    abstract  int addOfTwoNumber(int number1,int number2);
    abstract int addOfThreeNumber(int number1,int number2,int number3);
    public void regularMethod(){

        System.out.println("I am regular method");
    }
}
class Calculation extends Addition{



    @Override
  int addOfTwoNumber(int number1, int number2) {
        return number1+number2;
    }

    @Override
    int addOfThreeNumber(int number1, int number2, int number3) {
        return number1+number2+number3;
    }
}
class Mainclass extends Calculation{
    public static void main(String[] args) {
        Mainclass mainclass=new Mainclass();
        System.out.println("Addof two numbers:"+mainclass.addOfTwoNumber(2,3)+
                ","+"Add of three numbers is:"+mainclass.addOfThreeNumber(3,4,5));
        mainclass.regularMethod();
    }



}

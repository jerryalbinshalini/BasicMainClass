package com.variableExample;

public class LocalVariable {
    public static void main(String[] args){
        //     getAdd();
//       addition(5,6);
//        new LocalVariable(5,6);
    }
 static int a=10;
  static int b=5;
   static void getAdd(){

        int result =a+b;
       System.out.println("Result is:"+result);
    }


    //method
   private static void addition(int firstNumber, int secondNumber){
        int result=firstNumber+secondNumber;
        System.out.println(result);

    }


    //constructor
    LocalVariable(int firstNumber,int secondNumber){
        int result=firstNumber+secondNumber;
        System.out.println(result);

    }

}

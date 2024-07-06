package com.dateandtimeExample.RecursionExample;

public class InfinitetimeCallExam {
    public static void main(String[] args){
        printHello();//method calling


    }
    static  void printHello(){
        System.out.println("Hello");
     printHello();
    }


}
//returntype methodName(){
//block of stmt
//methodName();///calling
//}
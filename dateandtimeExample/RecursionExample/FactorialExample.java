package com.dateandtimeExample.RecursionExample;

public class FactorialExample {
    static int factoialMethod(int number){
        if(number==1)
            return 1;
        else
            return (number*factoialMethod(number-1));//5*4*3*2*1

    }
    public static void main(String[] args){
        System.out.println("the factorial of given number is:"+factoialMethod(5));
    }
}
////returntype methodName(){
////code to executed
//methodName();
//}
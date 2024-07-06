package com.dateandtimeExample.RecursionExample;

public class RecursionExample {
    public static void main(String[] args) {
        callInfiniteTimePrintHello();
        callFiniteTimePrintHello();
        System.out.println(factorialMethod(5));

    }

    static void callInfiniteTimePrintHello() {
        System.out.println("Hello");
        callInfiniteTimePrintHello();

    }

    static int count = 0;

    static void callFiniteTimePrintHello() {

        count++;
        if (count <= 5) {
            System.out.println("Hello" + count);
            callFiniteTimePrintHello();
        }
    }

    static int factorialMethod(int number) {

        if (number == 1)
            return 1;
        else
            return (number * factorialMethod(number - 1));//5*4*3*2*1



    }
}
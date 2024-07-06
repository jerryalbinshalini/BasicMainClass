package com.dateandtimeExample.RecursionExample;

public class FibonacciSeriesExample {
    //static  int n=0;
    static int fibonacciMethod(int n) {
        // base case
        if (n <= 1) {
            return n;
        }
        // as f(n) = f(n-1) + f(n-2) definition of fibonacci number
        return fibonacciMethod(n - 1) + fibonacciMethod(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("Fibonacci series is: ");
        for (int i = 0; i <= 5; i++) {
            // getting each fibonacci term using recursive function
            System.out.println(fibonacciMethod(i) + " ");
        }
    }
}
/*
f(0)=0
f(1)=1
f(2)=2-0+2-1=2+-1=1
f(3)=3-1+3-1=2
f(4)=4-1+4-2
 */
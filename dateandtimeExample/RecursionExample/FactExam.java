package com.dateandtimeExample.RecursionExample;

public class FactExam {
    public static void main(String[] args) {
        factorial(5);
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
            //5*4*3*2*1*1
        }
    }
}

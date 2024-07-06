package com.dateandtimeExample.RecursionExample;

public class FinitetimeCallExam {
    public static void main (String[] args){

        printHello();
    }
    static int count=0;
    static  void printHello() {
        count++;
        if (count <= 5) {
            System.out.println("Hello" + count);
           printHello();
        }}

    }

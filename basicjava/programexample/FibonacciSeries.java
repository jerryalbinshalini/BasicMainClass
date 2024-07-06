package com.basicjava.programexample;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number, firstNumber=0, secondNumber = 0, thirdnumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of number:");
        number = scanner.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= number; i++)//0, 1 ,1,2,3,5
        {
            firstNumber = secondNumber;   //a=0 //a=1  //a=1//a=2
            secondNumber = thirdnumber;   //b=1 //b=1  //b=2//b=3
            thirdnumber = firstNumber + secondNumber;//c=0+1=1 //c=1+1=2//c=1+2=3//c=2+3=5
            System.out.print(firstNumber+" ");
        }
    }
}

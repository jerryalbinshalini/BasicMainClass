package com.basicjava.programexample;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
       int number= scanner.nextInt();
       int fact=1;
       for(int i=1;i<=number;i++){//5,4,3,2,1
           fact=fact*i;//1*1=1//1*2=2//2*3=6//6*4=24//24*5=120
           System.out.print("factorial of number is:"+number+"is"+fact);
       }

    }
}

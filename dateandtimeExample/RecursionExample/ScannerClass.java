package com.dateandtimeExample.RecursionExample;

import java.util.Scanner;

public class ScannerClass {
    public  static void main(String[] args){
      /*  Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name");
       String userName;
        userName = scanner.nextLine();//read
        System.out.println("u enter name is:"+userName);*/
       /* int a,b;
        double c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=Math.pow(a,b);
        System.out.println("Power = " + c);

        */
        scannerClass();
    }
    static void scannerClass(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is your name");
        String name=scanner.nextLine();
        System.out.println("What is your age:");
        int age=scanner.nextInt();
      scanner.nextLine();
       System.out.println("Enter your email Id:");
        String email=scanner.nextLine();
//        System.out.println("What is your age:");
//        int age=scanner.nextInt();
        System.out.println("My name is:"+name);
        System.out.println("My age is:"+age);
        System.out.println("My emailId is:"+email);



    }
}

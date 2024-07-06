package com.scannerclass;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        scannerMethods();
    }
    static void scannerMethods(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter user name:");
        String name=scanner.nextLine();

        System.out.println("Enter user Age:");
        int age=scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter user Email:");
        String email=scanner.nextLine();

        System.out.println("user name is:"+name);
        System.out.println("User Age is:"+age);
        System.out.println("User Email is:"+email);
    }
    /*
    ex.1.write a program to input the principal,rate,time.calculate
    simpleInterest and final amount
    formula: simpleinterest:(p*r*t)/100
    amount=simpleinterest+principal
     */
    /*
    2.write a program to input the student name and obtained by five marks
    calculate average of mark
     */
}

package com.basicjava.programexample;

import java.util.Scanner;

public class BasicProgramExample {
    public static void main(String[] args) {
        BasicProgramExample basicProgramExample = new BasicProgramExample();
       //basicProgramExample.usingswitchcaseCalculater();
//        basicProgramExample.swapingtwoNumbers();
        printTenprimeNumbers();



    }

 /*   private void usingswitchcaseCalculater() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two number:");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        System.out.println("Enter any operators(+,-,*,/)");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(numberOne + "+" + numberTwo + "=" + (numberOne + numberTwo));
                break;
            case '-':
                System.out.println(numberOne + "-" + numberTwo + "=" + (numberOne - numberTwo));
                break;
            case '*':
                System.out.println(numberOne + "*" + numberTwo + "=" + (numberOne * numberTwo));
                break;
            case '/':
                System.out.println(numberOne + "/" + numberTwo + "=" + (numberOne / numberTwo));
                break;
            default:
                System.out.println("You have enter wrong operator");

         }


    }

  */
    private void swapingtwoNumbers(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Two number:");
        int numberOne= scanner.nextInt();
        int numberTwo= scanner.nextInt();
        System.out.println("Before Swapping:"+numberOne+","+numberTwo);
       numberOne=numberOne+numberTwo;//10+5=15
       numberTwo=numberOne-numberTwo;//15-5=10
       numberOne=numberOne-numberTwo;//15-10=5
        System.out.println("After swapping:"+numberOne+","+numberTwo);
    }
    public static void printTenprimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  number:");
        int number = scanner.nextInt();
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                boolean isprime=false;
                break;
            }
        }
        if(prime==true){
            System.out.println(number+"is prime number");
        }
        else{
            System.out.println(number+"is not prime number");
        }
    }
}
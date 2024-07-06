package com.logicprogram;

import java.util.Scanner;



public class LogicProgram {
    public static void main(String[] args) {
//        toFindSmallNumbers();
//        displayNameOfDay();
//        toFindVowelOrConsonant();
//        toFindVowelOrConsonant();
//        sumOfNaturalNumber();
//        multipleOfFive();
//        printOddNumbers();
//        displayGrade();
//        printDirectionName();
        rupeePaiseConversion();

    }
    /*
    1.write a program to input two numbers and print the smaller of
    the two numbers
     */
    static void toFindSmallNumbers(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number:");//4
        int firstNumber=scanner.nextInt();
        System.out.println("Enter Second Number:");//2
        int secondNumber=scanner.nextInt();
        if(firstNumber<secondNumber){
            System.out.println("Small Number is:"+firstNumber);
        }
        else {
            System.out.println("Small Number is:"+secondNumber);
        }
    }
    /*Output
    Enter First Number:
            5
    Enter Second Number:
            6
    Small Number is:5*/
//    ..........................................................................
    /*2.write  a program to display the name of the day according to number
    entered by the user*/
     static void displayNameOfDay(){
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter the number 1 to 7:");
         int num=scanner.nextInt();
         if(num==1){
             System.out.println("Sunday");
         } else if (num==2) {
             System.out.println("Monday");
         }
         else if (num==3) {
             System.out.println("Tuesday");
         }
         else if (num==4) {
             System.out.println("wednesday");
         }
         else if (num==5) {
             System.out.println("Thursday");
         }
         else if (num==6){
             System.out.println("Friday");
         }
         else {
             System.out.println("Saturday");
         }
     }
     /*
     Output:
     Enter the number 1 to 7:
     5
     Thursday
      */
//    .....................................................
    /*
    3.write a program to input a letter and check whether it is an
    uppercase vowel,lowercase vowel or a consonant
     */
    static  void toFindVowelOrConsonant(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Character:");
       char ch=scanner.next().charAt(0);
        switch (ch){
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("uppercase letter");
                break;
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("lowercase letter");
                break;
            default:
                System.out.println("Consonant letter");

        }
    }
    /*
    output
    Enter the Character:
     b
    Consonant letter
     */
//    ...............................................................
    /*
    4.write a program to print the sum of all natural numbers up to 10
     */
    static void sumOfNaturalNumber(){
        int sum=0;
        for(int i=1;i<=10;i++){
             sum=sum+i;//1.sum=0+1=1;sum=1+2=3;sum=3+3=6

        }
        System.out.println("Sum of 10  natural number is:"+sum);
    }
    /* output:
    Sum of 10  natural number is:55*/
//    ..................................................................
    /*
    5.write a program to print the first 10 multiples of 5
     */
    static void multipleOfFive(){
        int mul=5;
        for(int i=1;i<=10;i++){
            int m=mul*i;
            System.out.println("multiples of five are:"+m);

        }
    }
//    ..............................................................
    /*
    6.a program to print the odd numbers from 1 to 10
     */
    static  void printOddNumbers(){
//        for(int i=1;i<=10;i=i+2){
//            System.out.println("odd numbers are"+i);
            for(int i=0;i<=10;i=i+2){
                System.out.println("even numbers are"+i);

//
        }
    }
  /* 7.write a program to input the mark obtained by a student .
    Display the grade obtained by the 80 and above the
   grade is"Distinction",60-79 grade is "First class"
   45-59 grade is "Second class",40-44 grade is "pass",Below 40 grade is "Fail"
   */
    static void displayGrade(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the mark:");
        int mark=scanner.nextInt();
        if(mark>=80){
            System.out.println("distinction");
        } else if (mark>=60) {
            System.out.println("First class");
        }
        else if (mark>=45) {
            System.out.println("second class");
        }
        else if (mark>=40) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

    }
    /*
    output
    enter the mark:
     34
    Fail
     */
//....................................................
    /*
    8.write a program to input a  th first letter of
    the direction and print the name of the direction
     */
static void printDirectionName(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the direction in first letter:");
    char firstLetter=scanner.next().charAt(0);
    switch (firstLetter){
        case 'E': case 'e':
            System.out.println("East");
            break;
        case 'S': case 's':
            System.out.println("South");
            break;
        case 'N': case 'n':
            System.out.println("North");
            break;
        case 'W': case 'w':
            System.out.println("West");
            break;
        default:
            System.out.println("Invalid choice");

    }
}
/*
output
Enter the direction in first letter:
e
East
 */
//    .............................................
    /*
    9.write a program using rupees to paise conversion
    and paise to rupee conversion

     */
static void rupeePaiseConversion(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter 1 for rupee to paise conversion");
    System.out.println("Enter 2 for  paise to rupee  conversion");
    System.out.println("Enter choice");
    int choice=scanner.nextInt();
    switch (choice){
        case 1:
            System.out.println("Enter rupee amount:");
            double r1=scanner.nextDouble();
            double p1=r1*100;
            System.out.println(r1+"Rupees -->"+p1+"Paise");
            break;
        case 2:
            System.out.println("Enter Paise amount:");
            double p2=scanner.nextDouble();
            double r2=p2/100;
            System.out.println(p2+"Paise -->"+r2+"Rupees");
            break;
        default:
            System.out.println("Incorrect choice");

    }

}
/*
output
Enter 1 for rupee to paise conversion
Enter 2 for  paise to rupee  conversion
Enter choice

1
Enter rupee amount:
1
1.0Rupees -->100.0Paise
Enter 1 for rupee to paise conversion
Enter 2 for  paise to rupee  conversion
Enter choice
2
Enter Paise amount:
100
100.0Paise -->1.0Rupees
 */
}

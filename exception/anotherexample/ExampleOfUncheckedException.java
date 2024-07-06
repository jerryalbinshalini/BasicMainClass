package com.exception.anotherexample;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ExampleOfUncheckedException {
    public static void main(String[] args) throws Exception{
//        arithmeticException();
//        arithmeticExcTryCatchExample();
//        arrayIndexOutOfRangeException();
//        arrayInde5xOutOfRangeExceptionTryCatch();
//        classCastException();
//        illegalArgumentException();
        numberFormatException();
//        throwKeywardExample();
//        throwsKeywordExample();

    }
    static  void arithmeticException(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int numberOne=scanner.nextInt();
        int numberTwo=scanner.nextInt();
        int result=numberOne/numberTwo;
        System.out.println(result);
    }
    //how to handle
    static void arithmeticExcTryCatchExample(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int numberOne=scanner.nextInt();
        int numberTwo=scanner.nextInt();
        try {
            int result=numberOne/numberTwo;
            System.out.println(result);
        }
        catch (Exception ex){
//            ex.printStackTrace();
            System.out.println("cannot divide by zero"+ex);

        }

    }
 static  void arrayIndexOutOfRangeException(){
        int arrayName []={1,2,3,4,5};
     System.out.println(Arrays.toString(arrayName));
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the index value");
     int enterArray=scanner.nextInt();
     System.out.println(arrayName[enterArray]);

 }
static void arrayIndexOutOfRangeExceptionTryCatch(){
        try {
            int arrayName []={1,2,3,4,5};
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the index value");
            int enterArray=scanner.nextInt();
            System.out.println(arrayName[enterArray]);
        }catch (Exception ex){
            System.out.println("This is a index out of range Exception:"+ex);
        }
}
 static void classCastException(){
     try {
       Object obj = "Hello";
      Integer number = (Integer) obj; // Attempting an incompatible cast
         System.out.println(number);
     } catch (Exception e) {
         System.out.println("ClassCastException occurred: " + e);
     }
 }
 static void illegalArgumentException(){
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Enter a positive number: ");
         int number = scanner.nextInt();

         if (number <= 0) {
             throw new IllegalArgumentException("Number must be positive");
         }

         System.out.println("You entered: " + number);
     } catch (Exception e) {
         System.out.println("IllegalArgumentException occurred: " + e);
     }
 }
 static void numberFormatException(){
     String numberString = "123ABC"; // Invalid number string

     try {
         int number = Integer.parseInt(numberString);
         System.out.println("Number: " + number);
     } catch (Exception e) {
         System.out.println("NumberFormatException occurred: " + e);
     }
 }
 static void throwKeywardExample(){
        Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the Age:");
         int age=scanner.nextInt();
         try {
             if(age<5){
                 throw  new Exception("Not allowed! Your age is less than 5");
             } else if (age>20) {
                 throw new Exception("Not allowed! Your age is greater than 20");
             }
             else {
                 System.out.println("Welcome!");

             }

         }catch (Exception ex){
             System.out.println("An exception is thrown");
             System.out.println(ex.getMessage());

         }

 }
 static void throwsKeywordExample()throws Exception {
     FileWriter fileWriter=new FileWriter("C:\\Users\\DELL\\Desktop\\throw.txt");
     fileWriter.write("Hello world");
     fileWriter.close();
     System.out.println("file not exits");
 }
}









class Person{
    String personName;

//    public String getPersonName() {
//        return personName;
//    }
//
//    public void setPersonName(String personName) {
//        this.personName = personName;
//    }
}
class NullPointerException{
    public static void main(String[] args) {

        try {
            Person person=null;
            String name= person.personName;
            person.personName="shalini";
            System.out.println(name);
            System.out.println(person.personName);

        }
        catch (Exception ex){
            System.out.println("person name is null so null pointer exception occur"+ex);
        }
    }
}
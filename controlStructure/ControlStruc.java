package com.controlStructure;

import java.util.Scanner;

public class ControlStruc {

    public static void main(String[] args) {
        //if
      /*  String name="shalini";
        if(name !=null && !name.isEmpty()){
            System.out.println("Validinput"+name);
        }
        */

        //if-else
     /*   String name=null;
        if(name !=null && !name.isEmpty()){
            System.out.println("Validinput"+name);
        }
        else {
            System.out.println("Invalid output");
        }
       */

        //if else if

      /* String name=null;
       if(name ==null || name.equals("null")){
           //compare two String,equalsIgnoreCase method ignore the casesensitivity(lower or upper)
           System.out.println("Nullinput");
       }
       else if (name.isEmpty()){
           System.out.println("name is Empty");
       }
        else {
            System.out.println("Valid input is:"+name);
       }
     */
        //while loop
        /*int num = 10;
        while (num > 0) {
           // num--;//post-increment
            System.out.println(num);

            // Update Section
            num--;
        }*/


        //do while
      /* int num = 10;
        do
        {
           // num--;
            System.out.println(num);

            // Update Section
            num--;
        } while (num > 0);*/


        //for loop
       /*
        for(int num=0;num<10;num++){//increment
            System.out.println(num);
            //for(int num=0;num>10;num--){//decrement
              //  System.out.println(num);
        }

        */
        //break
       /*int num = 0;
        while (num < 10) {
            System.out.println(num);
           ++num;
           if (num == 4) {
                break;
            }
        }*/


        //continue
      /* int num=0;
        while (num<10){
            ++num;
            if(num==4){
                continue;
            }
            System.out.println(num);
        }*/


        //Switch stmt
      /*  int day=4;
        switch (day){
            case 01:
                System.out.println("sunday");
                break;
            case 02:
                System.out.println("Monday");
                break;
            case 03:
                System.out.println("tuesday");
                break;
            case 04:
                System.out.println("wenesday");
                break;
            default:
                System.out.println("Enter correct value");
                break;



    }

       */
        //conditional operator?:
    /*    int mark=80;
        String result=mark>=40?"pass":"Try next";
        String result1=mark<=40?"pass":"Try next";
        System.out.println("Result:"+result1);
        System.out.println("Result is:"+result);

     */
        //if else
      /* int  num=10;
        if(num%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

       */
//else if
      /*  String name=null;
        if(name=="starbin"){
            System.out.println("my name is"+name);
        }
        else if (name==null) {
            System.out.println("name is null");

        }
        else if (name.isEmpty()) {
            System.out.println("Name is empty");

        }
        else{
            System.out.println("my name is not"+name);
        }

       */
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
       int i=scanner.nextInt();

        for( i=0;i<1000;i++){
            if(i==500){
                System.out.println("Hello world");
                break;
            }
        }
        System.out.println("Thanks");
*/ //hello world print program
     /*   Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=scanner.nextInt();//nextInt means read the int value from the user
        switch (number){
            case 1:
                System.out.println("Hi");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Hello World");
                System.out.println("Thanks");
                break;
            default:
                System.out.println("None of");
        }
    }*/


    //if stmt
        int a=1,b=10,c=5;
        if(a>b){
            System.out.println("a is greater");
        }
       else if(b>c){
            System.out.println("b is greater");
        }
       else if(c>a){
            System.out.println("c is greater");
        }
        else{
            System.out.println("Nothing");
        }
    }
}

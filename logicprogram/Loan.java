package com.logicprogram;

import java.util.Scanner;

//write a java program the class name is Loan .how to calculate
// interest and amount,where interest=(principal*rate*time),
// amount=principal+interest
//rate=15% up to 5 years,12% more than 5 and up to10 years,10% above 10 years
public class Loan {

    public static void main(String[] args) {

//        calculateInterest();
//        calculateDiscount();
//        displayGrade();
        calculateDigitNumber();
    }

    static void calculateInterest(){
        double principal,rate,interest,amount;
        int time;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the principal:");
        principal=scanner.nextDouble();
        System.out.println("Enter the time:");
        time=scanner.nextInt();

      if(time<=5) {
          rate = 0.15;
      }
       else if (time<=10) {
          rate = 0.12;
      }

      else {
          rate = 0.10;
      }
        interest=(principal*rate*time);
        amount=principal+interest;

        System.out.println("Interest is:"+interest);
        System.out.println("Amount is:"+amount);
    }
    //output
/*Enter the principal:
        500000
        Enter the time:
        3
        Interest is:225000.0
        Amount is:725000.0
*/

// write a program you calculate discount and amount,
//where price  Rs.5000 discount is no discount; Rs.5001 to 10000
//discount is 10%;Rs 10001 to 15,000 discount is 15%
//above Rs 15000 discount is 20%
//formula dicount%=(discound/price)*100
//(discount% *price)=discount
    public static void calculateDiscount(){
        double price,amount,discount;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of customer:");
        String name=scanner.nextLine();
        System.out.println("Enter the price:");
        price=scanner.nextDouble();
         if(price<=5000){
             discount=0;
             System.out.println("The discount is:"+discount);
         } else if (price<=10000) {
             discount=price*0.1;
             System.out.println("The discount is:"+discount);

         }
         else if (price<=15000) {
             discount=price*0.15;
             System.out.println("The discount is:"+discount);

         }
         else {
             discount=price*0.2;
             System.out.println("The discount is:"+discount);
         }
         amount=price-discount;
        System.out.println("Amount is:"+amount);
    }
    //output
//    Enter the name of customer:
//    shalini
//    Enter the price:
//            1080
//    The discount is:0.0
//    Amount is:1080.0
    /*3.write a java program to input the mark obtained by student
    if the grade is 80 and above display the grade is "Distinction"
    60-79 display the grade is "First class",45-59 display the grade is
    "Second class",40-44 display the grade is "pass",below 40 the grade is
    "fail"*/
    public static void displayGrade(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Marks:");
        int mark=scanner.nextInt();
        if(mark>=80){
            System.out.println("Distinction");
        } else if( (mark>=60) &(mark<=79) ){
            System.out.println("First Class");
        }
        else if ( (mark>=45) &(mark<=59) ) {
            System.out.println("Second Class");
        }
        else if ( (mark>=40) &(mark<=44) ) {
            System.out.println("Pass");
        }else   {
            System.out.println("Fail");
        }
    }
    //output
//    Enter the Marks:
//            68
//    First Class
    /*
    Write a program to input a number find out if the number
    entered by the user is a two,three,four digit number
    input:235
    oupt:235 is a three digits number
     */
    static void calculateDigitNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        long number=scanner.nextLong();
        if(number<=99){
            System.out.println(number+" "+"is a two digits number");
        } else if (number<=999) {
            System.out.println(number+" "+"is a three digits number");
        }
        else {
            System.out.println(number+" "+"is a four digits number");
        }
    }
}

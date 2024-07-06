package com.dateandtimeExample;


import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

public class StrTodateConver {
    public static void main(String[] args) throws Exception{
     //convert String to date
        String stringDate = "21-jul-1992";
    Date date = new SimpleDateFormat("dd-MMM-yyyy").parse(stringDate);
        System.out.println("String convert date is:"+stringDate);




//        How do you format a date in Java? like in the ddMMyyyy format?
//                How do you convert java.util.Date to java.sql.Date in Java JDBC?


        // get the dates 10 days before and after today
        //LocalDate localDate = LocalDate.now();
//        String strdate="14-03-2023";
        // this line error how to handle:
//        Date date= new SimpleDateFormat("dd-MM-yyyy").parse(strdate);
//        System.out.println("Current Date: "+date);
//        date.setDate(-10);
//        System.out.println("10 Days Before Today Date "+date);
//        date.setDate(10);
//        System.out.println("10 Days After Today Date "+date);
        //Get current system date and time
//        Date date=new Date();
//        System.out.println("current system time is:"+date.toString());
        // get day,month,year in given string
//        Scanner scanner=new Scanner(System.in);
//        String dt=scanner.next();
//        String dt = "2023-06-21";
    /*    LocalDate lDate = LocalDate.parse(dt);
        int d = lDate.getDayOfMonth();
        DayOfWeek dayweek =lDate.getDayOfWeek();
        //System.out.println("Day of week"+dayweek);
        Month m = lDate.getMonth();
        int y = lDate.getYear();
        System.out.println("Day  : " + dayweek);
        System.out.println("Month: " + m);
        System.out.println("Year : " + y);

     */
}
}

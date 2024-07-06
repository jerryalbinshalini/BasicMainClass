package com.formatted.date.time;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
//       dateFormatted();
//        stringToJavaDate();
//        timeStampDateFormate();
//        convertJavaDateTSqlDate();
        converSqlDateToJavaDate();

    }
    public  static  void dateFormatted(){
        Date nowdate=new Date();
        System.out.println(nowdate);
        SimpleDateFormat datenow=new SimpleDateFormat(" E yyyy.mm.dd 'at' hh:mm:ss a zzz");
        System.out.println(datenow.format(nowdate));
//        display time and date using $(doller)
        System.out.printf("%1$s %2$tB %2$td %2$ty","Due date:",nowdate);
        System.out.println();
//        display formatted date using <
        System.out.printf("%s %tB %<td %<ty","Due date:",nowdate);
        System.out.println();
//        display time date
        String str=String.format("current Date/Time:%tc",nowdate);
        System.out.println(str);
//        System.out.println();
    }
    public static void stringToJavaDate(){
        Date nowdate=new Date();
        String strDateFormat = "yyyy:mm:dd HH:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(nowdate));
    }
    public static void timeStampDateFormate(){
        Date nowdate=new Date();
       Timestamp tds=new Timestamp(nowdate.getTime());
        System.out.println(tds);
    }
    public static void convertJavaDateTSqlDate(){
        java.util.Date utilDate = new java.util.Date();
        System.out.println(utilDate);//javadate:Mon Aug 21 16:44:18 IST 2023
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println(sqlDate);//sqldate:2023-08-21
    }
    public  static void converSqlDateToJavaDate(){
       java.util.Date now=new Date();
        System.out.println("This is util date:"+now);
        java.sql.Date sqldate= new java.sql.Date(now.getTime());
        System.out.println("This is sql date:"+sqldate);
        java.util.Date nowutilDate = new java.util.Date(sqldate.getTime());
        System.out.println("Converted value of java.util.Date : "+nowutilDate);


    }
}

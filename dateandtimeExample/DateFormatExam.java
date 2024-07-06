package com.dateandtimeExample;


import java.text.SimpleDateFormat;
import java.util.Date;

//import java.text.SimpleDateFormat;
//import java.util.Date;
//
public class DateFormatExam {
    public static void main(String[] args){
        Date date=new Date();
        System.out.println(date);
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println(formatter);
//       SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter1 = new SimpleDateFormat("EEEEE MMMM yyy HH:mm:ss");
        String strDate= formatter1.format(date);
        System.out.println(strDate);

    }
}

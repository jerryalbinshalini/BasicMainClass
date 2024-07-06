package com.dateandtimeExample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

public class NewDateFormatter {
    public static void main(String[] args) {
//
//        stringDateToJavaDate();
//        stringDateToJavaDateLocalDateFormat();
        dateToString();

    }

    public static void stringDateToJavaDate() {
        try {
            String stringDate = "27/10/2023";
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
            System.out.println(stringDate + "\t" + date);
        } catch (Exception e) {
            e.printStackTrace();


        }
    }
    public static void stringDateToJavaDateLocalDateFormat(){

        try{
            String string = "30 August, 2021";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy");
            LocalDate localDate = LocalDate.parse(string, format);
            System.out.println(localDate);
          // If the String pattern is invalid
        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
            // If the String was unable to be parsed.
        }catch (DateTimeParseException ex){
            ex.printStackTrace();
        }

    }
    public static void dateToString(){
        String pattern = "dd/MM/yyyy HH:mm:ss";

// Create an instance of SimpleDateFormat used for formatting
// the string representation of date according to the chosen pattern
        DateFormat dateFormat = new SimpleDateFormat(pattern);

// Get the today date using Calendar object.
        Date today = Calendar.getInstance().getTime();
// Using DateFormat format method we can create a string
// representation of a date with the defined format.
        String todayasStringformat = dateFormat.format(today);

// Print the result!
        System.out.println("Today is: " + todayasStringformat);
    }
}
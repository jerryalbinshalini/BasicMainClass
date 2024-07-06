package com.stringmethod.exmp;

public class charatlengthex {
    String place;
    public static  void main(String[] args){
        System.out.println("need the charecter get from string using length method");
        charatlengthex obj=new charatlengthex();
       // obj.getlength("Trivandrum");
        //trim method->Remove whitespace from both sides of a string
       // obj.getlength("     Trivandrum   ");
        //touppercase()
       // obj.getlength("trivandrum");
        //tolowercase()
       // obj.getlength("TRIVANDRUM");
        //replace(oldchar,new char)
        obj.getlength("trivandrum");
    }
    //print for all charecter:->length()-1
    //print needed charecter:->length()-4->trivand
    public void getlength(String place){
        //for(int i=0;i<=place.length()-4;i++){
           // System.out.println(place.charAt(i));
        //..................   trim().........................
//            System.out.println("trim method");
//            System.out.println(place.trim());
            //..........uppercase()........
         //  System.out.println(place.toUpperCase());
        //..........toLowercase()........
        //System.out.println(place.toLowerCase());
        //.........replace(old char,new char)
        //System.out.println(place.replace('t','T'));
        //....replaceall()....
        //System.out.println(place.replaceAll("trivandrum","Chennai"));




        //}


    }
}

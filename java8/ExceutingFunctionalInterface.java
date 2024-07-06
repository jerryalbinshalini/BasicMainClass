package com.java8;

public class ExceutingFunctionalInterface   {
    public static void main(String[] args) {
        UsingFunctionalInterface usingFunctionalInterface=(int number)-> System.out.println("The square value is"+(number*number));
        UsingFunctionalInterface usingFunctionalInterfaceVolume=(int number)-> System.out.println("The volume of square is:"+(number*number*number));
        usingFunctionalInterface.square(4);//call parent class object
        usingFunctionalInterfaceVolume.square(5);
        usingFunctionalInterface.defaultAddMethod(3,5);//call parent class object
        UsingFunctionalInterface.staticMultiMethod(3,5);//call parent class name



    }


}

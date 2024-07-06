package com.enumexample;
//enum defined in outside the class
enum Colors{
    WHITE,RED,BLUE,YELLOW
}



public class EnumExample {
    //enum defined in inside the class
    enum Colors{
        WHITE,RED,BLUE,YELLOW
    }
    public static void main(String[] args){
       // Colors colors=Colors.BLUE;//enum constant are access using dot syntac
       // for-each loop using get the enum value
        for(Colors colors :Colors.values())//values() method is used to return the value of an enum
        System.out.print(colors);
        System.out.println();


        System.out.println(Colors.valueOf("RED"));//The valueOf() method returns the value of
        // given constant enum.
        System.out.println(Colors.valueOf("YELLOW").ordinal());//The ordinal() method returns the
        // index of the enum value.
    }
}

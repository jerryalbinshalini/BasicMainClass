package com.stringmethod.exmp.newstringmethod;

public class StringMetodeExample {
    public static void main(String[] args) {

//        concatMethod();
//        equalsmethod();
//        spiltMethod();
        stringComparisionMethod();
//        internMethod();
//        getDataType("hello");
//        containsMethod();
//        charAtMethod();
//        trimmethod();


    }

    public static void concatMethod() {
        String message = "Happy Birth Day";
        String messageTo = message.concat(" " + "Shibin");
        System.out.println(messageTo);
    }

    public static void equalsMethod(){
        String message = "Hello";
        String messageOne = "Hello";
        System.out.println("The given two strings are equal?:" + message.equals(messageOne));
    }

    public static void spiltMethod() {
        String message = "Welcome @To @ Networkz systems";
        System.out.println("Read the String are:");
        for (String readdata : message.split("@")) {
            System.out.println(readdata);
        }
        System.out.println("length of message string:" + message.length());
        System.out.println("Replace of message string in Welcome:" + message.replace("Welcome", "Hello"));
        System.out.println("Substrings are:" + message.substring(6));
    }

    public static void stringComparisionMethod() {
//        1.equals()...>true or false
//          2.==...>true or false
//          3.compareTo()..>s1=s2=0,s1>s2=+ve,s1<s2=-ve
        String stringOne = "Networks";
        String stringTwo = "networks";//n  o p q r s
        String stringThree = "pyworks";
        String stringFour = new String(stringOne);
//        Equals method
        System.out.println(stringOne.equals(stringTwo));
        System.out.println(stringTwo.equals(stringThree));
        System.out.println(stringOne.equalsIgnoreCase(stringTwo));//case sensitive
        System.out.println(stringOne.equals(stringFour));
////
//////        == method
       System.out.println(stringOne==stringTwo);
        System.out.println(stringOne==stringThree);
        System.out.println(stringOne==stringFour);

//  ASCII value of lowercase alphabets are from 97 to 122. And,
// the ASCII value of uppercase alphabets are from 65 to 90.

//        String stringOne = "Aetworks";
//        String stringTwo = "networks";//n  o p q r s
//        String stringThree = "pyworks";
//        String stringFour = new String(stringOne);

//      compareTo Method
        System.out.println(stringOne.compareTo(stringTwo));//n=14,a=1:14-1=13
        System.out.println(stringOne.compareTo(stringThree));//16-1=15
        System.out.println(stringOne.compareTo(stringFour));
        System.out.println(stringThree.compareTo(stringOne));

    }

    public static void internMethod() {
//        The method intern() creates an exact copy of a String
//        object in the heap memory and stores it in the String constant pool.
        String stringOne = new String("network");
        String stringTwo = new String("network");
        System.out.println(stringOne== stringTwo);//false
        stringOne = stringOne.intern();
        stringTwo = stringTwo.intern();
        System.out.println(stringOne == stringTwo);//true
    }
    public  static  void containsMethod(){
        String stringOne="Networkz Systems";
        if(stringOne.contains("Networkz")){
            System.out.println("String is found in stringOne");
        } else if (stringOne.contains("networkz")) {
            System.out.println("String is not found in stringOne");

        } else {
            System.out.println("end of the program");
        }
    }
    static void charAtMethod(){
        String stringOne="Networkz Systems";
        char indexOne=stringOne.charAt(4);
        char indexTwo=stringOne.charAt(7);
        char indexThree=stringOne.charAt(8);
        System.out.println(indexOne);
        System.out.println(indexTwo);
        System.out.println(indexThree);
        System.out.println(stringOne.charAt(9));

    }
    static void trimmethod(){
        String stringWithWhitespace = "   Hello, World!    ";

        // Trim the leading and trailing whitespace
        String trimmedString = stringWithWhitespace.trim();

        // Display the original and trimmed strings
        System.out.println("Original string: \"" + stringWithWhitespace + "\"");
        System.out.println("Trimmed string: \"" + trimmedString+"\"" );
//        System.out.println(trimmedString);
    }
    }

    /*private static  String getDataType(String value){
        if(value instanceof String) {
            System.out.println("String type");
            return "true";

        }
        else {
            System.out.println("Not String type");
            return "false";
        }

    }

     */


//}
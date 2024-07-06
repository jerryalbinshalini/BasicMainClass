package com.basicjava.programexample;

import java.util.Scanner;

public class ReverseStringandpalindrome {
    public static void main(String[] args) {
        ReverseStringandpalindrome reverseString = new ReverseStringandpalindrome();
        reverseString.stringPalindromorNot();
        //revers a string
     /*   Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=scanner.next();
        for (int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }

      */

    }

    private void stringPalindromorNot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String reverse = "";
        String number = scanner.nextLine();
       // int length = num.length();
        for ( int i = number.length() - 1; i >= 0; i-- )
            reverse = reverse + number.charAt(i);
        if (number.equals(reverse))
            System.out.println("The entered string " +number +" is a palindrome.");
        else
            System.out.println("The entered string " +number +"  not a palindrome.");
    }
    }



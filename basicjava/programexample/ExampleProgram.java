package com.basicjava.programexample;

import java.util.Scanner;

public class ExampleProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");
       String word = scanner.nextLine();

       word = word.replaceAll(" ", "");

        System.out.print("word without Spaces = " +word);

        }
        private void withoutspace(){
        try{

        }catch(Exception ex){
            ex.printStackTrace();

            }
        }
    }


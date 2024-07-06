package com.Arrays;

import java.util.Scanner;

public class SingleDimentionalArrays {
    public static void main(String[] args) {
//        SingleDimentionalArrays singleDimentionalArrays = new SingleDimentionalArrays();
//         singleDimentionalArrays.singleDimentionalArrays();
//        singleDimentionalArrays.twoDimentionalArrays();
        // singleDimentionalArrays.MultiplicationTable();
//         singleDimentionalArrays.TriangularFormMultiplicationTable();
        // singleDimentionalArrays.starPattern();
      //  singleDimentionalArrays.rightStarPattern();
       // singleDimentionalArrays.reverseString();
        //singleDimentionalArrays.pyramid();
//        singleDimentionalArrays();
        twoDimentionalArrays();
//        MultiplicationTable();
       //riangularFormMultiplicationTable();


    }

   private static void singleDimentionalArrays(){
          String variableName[]={"Hello","Hi","How","Are","You"};
          variableName[1]="sir";
          for(int i=0;i<5;i++){
              System.out.println(variableName[i]+" ");
          }
      }




  private static void twoDimentionalArrays() {
      int variableName[][] = {{1, 2, 3, 4},
                              {5, 6, 7,8}};
      System.out.println(variableName[0][1]);//2
      variableName[1][2] = 10;//7 instead 10
      System.out.println(variableName[1][2]);
      for (int i = 0; i < 2; i++) {//i=0;i<4;++i
          for (int j = 0; j < 4; j++)
              System.out.print(variableName[i][j] + " ");
          System.out.println();
      }


  }

    //To print a multiplication table for any number
    private static void MultiplicationTable(){
        System.out.println("Enter any Number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(number+"X"+i+"="+number*i);
        }
    }


    //To Print the Multiplication Table in Triangular Form
    private static void TriangularFormMultiplicationTable(){
        System.out.println("Enter any number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for(int i=1;i<=number;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
    //left stare pattern programe
  /*  private  void  starPattern(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("u have enter row");
        int row=scanner.nextInt();
        for (int i = 1; i <= row; i++)//1,2,3,4,5
        {
            for (int j = 1; i <= j; j++)//1
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

   */
    //right triangle pattern
  /*  private  void  rightStarPattern(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("u have enter row");
        int row=scanner.nextInt();
        for (int i = 1; i <= row; i++)//1,2,3,4,5
        {
            for (int j = row; j > i; j--)//1
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

   */
    //reverse a string
   /* private void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("u have enter word");
       String word = scanner.next();


        StringBuffer stringBuffer = new StringBuffer(word);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


    }

    */
      private void pyramid(){
          Scanner scanner = new Scanner(System.in);
          System.out.println("u have enter row");
          int row=scanner.nextInt();
          for(int i=0;i<row;i++){//0-5
              for(int j=row-i;j>0;--j){//5-0=5;5-1=4
                  System.out.print(" ");
              }
              for (int j=0; j<=i; j++ ){
                  System.out.print("* ");
              }
              System.out.println();
          }



      }
}





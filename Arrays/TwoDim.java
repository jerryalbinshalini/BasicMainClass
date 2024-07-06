package com.Arrays;

public class TwoDim {
    public static void main(String[] args) {
//        String variableName[]={"Hello","Hi","How","Are","You"};
//        variableName[1]="sir";
//        for(int i=1;i<variableName.length;i++){
//            System.out.print(variableName[i]+" ");
        int variableName[][] = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(variableName[1][1]);//6
        variableName[1][2] = 10;//7 instead 10
        System.out.println(variableName[1][2]);
        for (int i = 0; i < variableName.length; i++) {//i=0;i<4;++i
            for (int j = 0; j < variableName[i].length; j++)
                System.out.print(variableName[i][j] + " ");
            System.out.println();
        }
    }
}

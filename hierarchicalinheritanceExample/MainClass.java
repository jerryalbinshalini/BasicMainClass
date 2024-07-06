package com.hierarchicalinheritanceExample;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Information of Science Student is:");
      Science sc=new Science();
      sc.showStudent();
      sc.showScience(89,78);
        Arts art=new Arts();
        //art.showScience(134,67);
        art.showStudent();
        art.showArts(23,45);
        System.out.println("Information of Science Student is:");
    }
}

package com.FinalKeyword.ExampleNew;

public class FinalVariableStudent {
    public  static void  main(String[] args){
//     int AGE=29;
//     System.out.println(AGE);
//       AGE =49;
//        System.out.println(AGE+AGE);
//        AGE=34;
//        System.out.println(AGE);
      final int Age=223;
        System.out.println(Age);
      // int  Age=21;//eror
    }
}
class  AreaOfCircle {
    public  static  void main(String[] args){
        final double PI=3.14;
        int radius=4;
        int height=4;
        System.out.println("Area of circle is:"+(PI*radius*radius));
        System.out.println("Surface area of cylinder is:"+(2*PI*radius*height));


    }
}
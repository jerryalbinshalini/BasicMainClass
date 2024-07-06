package com.FinalKeyword.ExampleNew;

public class MethodMainClass extends FinalMethodExample {
    final void detail1(){
        System.out.println("hiiiiii");

    }
    public  static  void  main(String[] args){
//        MethodMainClass methodMainClass=new MethodMainClass();
//        methodMainClass.detail(4,5);
//        methodMainClass.detail1();
        FinalMethodExample finalMethodExample=new FinalMethodExample();
        finalMethodExample.detail(1,2);
    }
}

package com.superkeyword.example.shop.supervariable;

public class ShopTwo extends ShopOne {//derived class or child class
    String fanName="Havells";
    int fanNumber=12;
    void printDetail(){
//        System.out.println("ShopOne Fan name:"+super.fanName);
//        System.out.println("ShopOne Fan Number:"+super.fanNumber);
        System.out.println("ShopTwo Fan name:"+fanName);
        System.out.println("ShopTwo Fan Number:"+fanNumber);
       super.printDetail();


    }
}

package com.superkeyword.example.shop.supervariable;

public class PersonConstructor {
    String name;
    int age;
    String nationality;
    PersonConstructor(String name,int age,String nationality){
        this.name=name;
        this.age=age;
        this.nationality=nationality;
        System.out.println(" name is:"+name);
        System.out.println(" age is:"+age);
        System.out.println("nationality is:"+nationality);


    }
}

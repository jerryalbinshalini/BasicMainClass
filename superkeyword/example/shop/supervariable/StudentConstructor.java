package com.superkeyword.example.shop.supervariable;

public class StudentConstructor extends PersonConstructor{
  long mark;
    StudentConstructor(String name,int age,String nationality,long mark){
     super(name,age,nationality);
     this.mark=mark;
     System.out.println("Student marks:"+this.mark);



    }

}

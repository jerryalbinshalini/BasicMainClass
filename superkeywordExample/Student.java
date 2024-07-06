package com.superkeywordExample;

public class Student {
    String name;
    int id;
   String section;


    public void showStudent(String name,int id,String section){
        //System.out.println("showstudent() parametrized constructor called");
        this.name=name;
        this.id=id;
        this.section=section;
        System.out.println("Student name is:"+name);
        System.out.println("Student name is:"+id);
        System.out.println("Student name is:"+section);




    }
}

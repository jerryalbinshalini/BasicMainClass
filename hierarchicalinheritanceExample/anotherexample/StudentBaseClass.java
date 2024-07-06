package com.hierarchicalinheritanceExample.anotherexample;

public class StudentBaseClass {
    String rollNumber;
    String name;
    StudentBaseClass(String rollNumber,String name){
        this.rollNumber=rollNumber;
        this.name=name;

    }
    void studentDetails(){
        System.out.println(" Student Roll Number is:"+rollNumber);
        System.out.println("Student Name is:"+name);
    }
}

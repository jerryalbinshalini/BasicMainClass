package com.hierarchicalinheritanceExample.anotherexample;

public class ArtsDerivedClassTwo extends StudentBaseClass{
    String history;
    String geography;
    ArtsDerivedClassTwo(String rollNumber,String name,String history,String geography){
        super(rollNumber,name);
        this.history=history;
        this.geography=geography;

    }
    void artsDetails(){
        super.studentDetails();
        System.out.println("History marks:"+history);
        System.out.println("Geography marks:"+geography);
    }

}

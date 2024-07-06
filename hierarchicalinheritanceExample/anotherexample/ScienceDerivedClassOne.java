package com.hierarchicalinheritanceExample.anotherexample;

public class ScienceDerivedClassOne extends StudentBaseClass {
    String physics;
    String chemistry;
    ScienceDerivedClassOne(String rollNumber, String name, String physics, String chemistry){
        super(rollNumber,name);
        this.physics=physics;
        this.chemistry=chemistry;

    }
    void scienceDetail(){
        super.studentDetails();
        System.out.println("Physics mark is:"+physics);
        System.out.println("Chemistry mark is:"+chemistry);
    }
}

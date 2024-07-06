package com.hierarchicalinheritanceExample.anotherexample;

public class HierarchicalInheritance {
    public  static void  main(String[] args){
        System.out.println("Science Student Details:");
        ScienceDerivedClassOne scienceDerivedClassOne=
                new ScienceDerivedClassOne("1","shalini","200","198");
        scienceDerivedClassOne.scienceDetail();
        System.out.println(".......................");
        System.out.println("Arts Student Details:");
        ArtsDerivedClassTwo artsDerivedClassTwo=
                new ArtsDerivedClassTwo("2","Shalu","178","200");
        artsDerivedClassTwo.artsDetails();



    }
}

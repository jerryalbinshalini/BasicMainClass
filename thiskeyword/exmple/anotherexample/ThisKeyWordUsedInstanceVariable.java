package com.thiskeyword.exmple.anotherexample;

public class ThisKeyWordUsedInstanceVariable {
    String name;
    String place;
      ThisKeyWordUsedInstanceVariable(String name,String place){
        this.name=name;
        this.place=place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public static void main(String[] args) {
        ThisKeyWordUsedInstanceVariable obj=new ThisKeyWordUsedInstanceVariable("shalini","kkl");
        System.out.println("Name is"+obj.getName());
        System.out.println("Name is"+obj.getPlace());
    }
}

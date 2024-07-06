package com.thiskeyword.exmple.anotherexample;

public class ThisKeyWordUsedCallOverLoadedConstructor {
    String name;
    String place;
    ThisKeyWordUsedCallOverLoadedConstructor(){
        System.out.println("This is non argument Constructor");
    }
    ThisKeyWordUsedCallOverLoadedConstructor (String name,String place){
        this();
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
        ThisKeyWordUsedCallOverLoadedConstructor obj=new ThisKeyWordUsedCallOverLoadedConstructor("shalini","kkl");
        System.out.println("Name is"+obj.getName());
        System.out.println("Name is"+obj.getPlace());
    }
}

package com.stringmethod.exmp;

public class ToStringExample {
    int id;
    String name;
    String  place;
    //create method
   /* public void getDetails(int id,String name,String place){
       this. id=id;
       this.name=name;
       this.place=place;
       System.out.println("Id is:"+id+
               ","+"Name is:"+name+","+"Place is:"+place);
    }*/
    //constructor create...without toString()
    ToStringExample(int id,String name,String place){
        this. id=id;
        this.name=name;
        this.place=place;
        System.out.println("Id is:"+id+
                ","+"Name is:"+name+","+"Place is:"+place);}
    public String toString(){
        return id +""+name+""+place;
    }

    public static void main(String[] args){
       /* ToStringExample tostringexample=new ToStringExample();
        tostringexample.getDetails(23,"cvb","jkl");*/
        ToStringExample toStringExample=new ToStringExample(21,"ss","dfg");
        //System.out.println(toStringExample);
        toStringExample.toString();
    }
}

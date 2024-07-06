package com.main;

public class BasicMainClassV {
    public static  void main(String[] args){
        System.out.println("Void type method creation");
        BasicMainClassV obj=new BasicMainClassV();
      int Result=  obj.add(12,34);//40
        obj.div(Result);//23



    }
    public int add(int n1, int n2){
           int addition=n1+n2;
        System.out.println(addition);

        return addition;
    }
    public void div(int addition){
        int divider=addition/2;
        System.out.println(divider);
    }
}

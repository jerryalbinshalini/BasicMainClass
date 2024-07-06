package com.stringmethod.exmp;

public class ToStringMethod {
    String javaName;
    public ToStringMethod(String javaName) {
        this.javaName=javaName;
    }
    public String toString(){
        //return "javascript";
        return this.javaName;
    }

    public  static void main(String[] args){

        ToStringMethod toStringMethod=new ToStringMethod("Java");
        String string=new String("Python");
        System.out.println(toStringMethod);
        System.out.println(string);
    }
}

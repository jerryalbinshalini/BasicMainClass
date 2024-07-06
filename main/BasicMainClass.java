package com.main;

public class BasicMainClass {
    public static void main(String[] args){
        System.out.println("Hello world");
        BasicMainClass obj=new BasicMainClass();
        long addResult= obj.add(10,5);
        obj.sub(addResult);

    }
    public long add(long n1,long n2){
        long result=n1+n2;
        System.out.println(result);
        return result;
    }
    public long sub(long result){
        long total=result-2;
        System.out.println(total);
        return total;
    }
}

package com.multithreading;
class HiOne {
    public void show(){
        for(int i=1;i<5;i++){
            System.out.println("hi");
            try{
                Thread.sleep(500);
            }
            catch (Exception e){e.printStackTrace();}
        }
    }
}
class HelloOne{
    public void show(){
        for(int i=1;i<5;i++){
            System.out.println("hello");
            try{Thread.sleep(500);}
            catch (Exception e){e.printStackTrace();}
        }
    }
}
public class ThreadTryCatch {
    public static void main(String[] args) {
        HiOne hiOne=new HiOne();
        HelloOne helloOne=new HelloOne();
        hiOne.show();
        helloOne.show();
    }
}

package com.multithreading;
class HiOneEx extends Thread{
//    public void show(){
        public void run(){
        for(int i=1;i<5;i++){
            System.out.println("hi");
            try{
                Thread.sleep(500);}
            catch (Exception e)
            {e.printStackTrace();}
        }
    }
}
class HelloOneEX extends Thread{
//    public void show(){
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("hello");
            try{Thread.sleep(500);}
            catch (Exception e)
            {e.printStackTrace();}
        }
    }
}
public class ThreadExtend {
    public static void main(String[] args) {
        HiOneEx hiOneEx=new HiOneEx();
//        hiOneEx.show();
        HelloOneEX helloOneEX=new HelloOneEX();
//       helloOneEX.show();
        hiOneEx.start();
        try{Thread.sleep(10);}
        catch (Exception e)
        {e.printStackTrace();}
        helloOneEX.start();

    }
}

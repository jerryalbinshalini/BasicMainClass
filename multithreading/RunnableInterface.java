package com.multithreading;
class HiOneExRun implements Runnable{

    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("hi");
            try{
                Thread.sleep(500);}
            catch (Exception e){e.printStackTrace();}
        }
    }
}
class HelloOneEXRun implements Runnable{

    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("hello");
            try{Thread.sleep(500);}
            catch (Exception e){e.printStackTrace();}
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
      Runnable hiOneExRun=new HiOneExRun();
      Runnable helloOneEXRun=new HelloOneEXRun();
      Thread t1=new Thread(hiOneExRun);
      Thread t2=new Thread(helloOneEXRun);
      t1.start();
      try{Thread.sleep(10);
      } catch (Exception e){
          e.printStackTrace();
      }
      t2.start();

    }
}

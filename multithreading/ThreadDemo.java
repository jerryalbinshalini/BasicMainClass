package com.multithreading;
class Hi{
    public void show(){
        for(int i=1;i<5;i++){
            System.out.println("hi");
            try{Thread.sleep(500);}
            catch (Exception e){e.printStackTrace();}

        }
    }
}
class Hello{
    public void show(){
        for(int i=1;i<5;i++){
            System.out.println("hello");
            try{Thread.sleep(500);}
            catch (Exception e){e.printStackTrace();}

        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Hi hi=new Hi();
        Hello hello=new Hello();
        hi.show();
        hello.show();

    }
}

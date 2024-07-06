package com.multithreading.synchronisedkeyword;

import java.io.IOException;

//class Counter {
//    int count;
//    public synchronized  void increment(){
//        count++;
//    }
//}
//public class SynnDemo{
//    public static void main(String[] args) throws Exception {
//        Counter c=new Counter();
//        Thread t1=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=1;i<=1000;i++){
//                    c.increment();
//                }
//            }
//        });
//        Thread t2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=1;i<=1000;i++){
//                    c.increment();
//                }
//            }
//        });
//
//
////        c.increment();
////        c.increment();
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//        System.out.println("count"+c.count);
//    }
//}
//class Counter{
//    int count;
//    public synchronized void increment(){
//        count++;
//    }
//}
//public class SynnDemo {
//    public static void main(String[] args) throws Exception {
//        Counter c=new Counter();
//        Thread t1=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=1;i<=1000;i++){
//                    c.increment();
//                }
//            }
//        });
//        Thread t2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=1;i<=1000;i++){
//                    c.increment();
//                }
//            }
//        });
//        t1.start();
//        t2.start();
//        t1.join();
//
//        t2.join();
//        System.out.println("count is:"+c.count);
//
//    }
//}
class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class SynnDemo {
    public static void main(String[] args)throws Exception {
        Counter c=new Counter();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();/* join means wait for a thread to terminate*/
        t2.join();
        System.out.println("count is:"+c.count);

    }
}
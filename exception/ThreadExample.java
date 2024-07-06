package com.exception;

public class ThreadExample extends Thread {
    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        threadExample.start();
        System.out.println("Name of thread:" + threadExample.getName());
     /*   Thread thread=new Thread("hello");
        thread.start();
        System.out.println("name of thread is:"+thread.getName());

      */
       /* for (int i = 0; i < 250; i++) {
            System.out.println("Main Thread:" + i);
        }

    }

        */

    /* public void run(){
          System.out.println("Now thread is running by extends the parent class");
     }

     */
   /* public void run() {
        for (int i = 0; i < 150; i++) {
            System.out.println("run Thread:" + i);

        }
    }

    */
    //public void run();
    {
        try {
            for (int i = 0; i < 150; i++) {

            }

        }catch (Exception ex){
            ex.printStackTrace();

        }


    }
}}
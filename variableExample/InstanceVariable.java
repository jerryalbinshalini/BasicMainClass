package com.variableExample;

public class InstanceVariable {
    public  static  void  main(String[] args){
//         new InstanceVariable(120,68);
       InstanceVariable instanceVariable=new InstanceVariable(23,45);
          instanceVariable.nowPrintWeight();
//        run();

    }
    int height;
    int weight;
    InstanceVariable(int height,int weight){
       this.height=height;
        this.weight=weight;
        System.out.println(height+","+weight);

    }
    public static void run(){

        System.out.println("huff,,,puff");
    }
    public  void nowPrintWeight(){

        System.out.println("Now print weight is:"+weight);
    }

}

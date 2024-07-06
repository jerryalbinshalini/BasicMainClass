package com.enumexample;
class OuterDemo{
    private String name;
    private long salary;
  public void outerClassDetail(String name,long salary){
      System.out.println("I am outer class");
      System.out.println("Outer class details:"+name+","+salary);
    }
    class InnerDemo{
       public void innerClassDetail(String name,long salary){
            System.out.println("I am a inner class");
           System.out.println("Details:"+name+","+salary);
        }

    }
}

public class InnerClass {
    public  static void main(String[] args){

        // Instantiating the OuterDemo class
        OuterDemo outerDemo = new OuterDemo();
        outerDemo.outerClassDetail("shalini",400);
        // Instantiating the InnerDemo class
        OuterDemo.InnerDemo innerDemo = outerDemo.new InnerDemo();
        innerDemo.innerClassDetail("shalu",4000);

    }

}

package com.keyword;

public class ThisKeywordExample {
    int id;
    String name;
    ThisKeywordExample(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println(id+"\n"+name);
    }
    public  void display(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println(id+"\n"+name);
    }
}
class ThisExa{

    public static void main(String[] args) {
//        ThisKeywordExample thisKeywordExample=new ThisKeywordExample(1,"sibin");
//        new ThisKeywordExample(1,"sibin");
//        ThisKeywordExample thisKeywordExample=new ThisKeywordExample();
//        thisKeywordExample.display(1,"sibin");



    }
}
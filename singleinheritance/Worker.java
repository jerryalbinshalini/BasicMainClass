package com.singleinheritance;
//base class
public class Worker {
    int id;
    String name;
    long salary;
    public void showWorkerDetail(int id,String name,long salary){
     this.id=id;
     this.name=name;
     this.salary=salary;
        System.out.println("Id is:"+id);
        System.out.println("Name is:"+name);
        System.out.println("Salary is:"+salary);
    }
}

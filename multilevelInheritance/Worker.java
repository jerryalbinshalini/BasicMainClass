package com.multilevelInheritance;

public class Worker {
    protected int code;
   protected String name;
    protected int salary;

    Worker(int code,String name,int salary){
        this.code=code;
        this.name=name;
        this.salary=salary;
    }
    void workerDetail(){
        System.out.println("Worker Details");
        System.out.println("Code:"+100);
        System.out.println("Name:"+"shalini");
        System.out.println("Salary:"+3000);
    }

    }


package com.multilevelInheritance;

public class Manager extends Officer{
    protected  int da;
    Manager(int code,String name,int salary,int hrapercentage,int da){
        super(code,name,salary,hrapercentage);

    }
    public long getDaAmount(){
        return (salary/da);
    }
    public void managerDetail(){
        super.officerdetail();
        System.out.println("Manager Detail");
        System.out.println("Code:"+code);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("getHRA is:"+getHraAmount());
        System.out.println("Dearness Allowence is:"+getDaAmount());


    }


}

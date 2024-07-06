package com.multilevelInheritance;

public class Officer extends Worker {
    protected int hrapercentage;
    Officer(int code,String name,int salary,int hrapercentage){
        super(code,name,salary);
        this.hrapercentage=hrapercentage;
    }
    public long getHraAmount(){

        return (salary/hrapercentage);
    }
    void officerdetail(){
       super.workerDetail();
        System.out.println("Officer Detail:");
        System.out.println("Code:"+101);
        System.out.println("Name:"+"Shalu");
        System.out.println("Salary:"+4000);
        System.out.println("getHRA is:"+getHraAmount());
    }




}

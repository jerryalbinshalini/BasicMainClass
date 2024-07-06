package com.superkeywordExample;

public class TeachingStaf extends Student{
    String dress_code;
    float salary;
    public void teachingStaffdetail(String name,int id,String dress_code,float salary){
     // super(name,id);
        this.dress_code=dress_code;
        this.salary=salary;

        System.out.println("Staff name is:"+this.name);
        System.out.println("Staff id is:"+this.id);
        System.out.println("Staff dress code is:"+dress_code);
        System.out.println("Staff salary is:"+salary);


    }
}

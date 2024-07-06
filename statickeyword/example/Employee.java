package com.statickeyword.example;

public class Employee {
   private int employeeId;
 private String employeeName;
  private static String companeyName;
    //constructor using
    Employee(String employeeName){
        this.employeeId=setEmployeeId();
        this.employeeName=employeeName;
    }
    static int count=0;
   public  static int setEmployeeId()
    {
       count++;
        return count;
    }
    static void setCompanyName(String companey){

       companeyName=companey;
    }
    public void employeeInformation(){
        System.out.println("Employee name is:"+this.employeeName);
        System.out.println("Employee Id is:"+this.employeeId);
        System.out.println("Companey name is:"+companeyName);
        System.out.println("......................");
    }

}

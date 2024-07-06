package com.polymorphismExample.anotherexampleofcompiletimepoly;
class EmployeeClass{
     void printSalary(long salary){

         System.out.println("Salary without bonus:"+salary);
    }
    void printSalary(long salary,long bonus){
        System.out.println("Salary with bonus:"+(salary+bonus));
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
      EmployeeClass employeeClass=new EmployeeClass();
      employeeClass.printSalary(2000);
      employeeClass.printSalary(2000,1000);
    }
}

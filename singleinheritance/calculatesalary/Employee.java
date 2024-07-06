package com.singleinheritance.calculatesalary;

public class Employee {
    float salary;
    Employee(float salary){
        this.salary=salary;
    }
}
class Programmer extends Employee{
    float bonus;
    Programmer(float salary,float bonus){
        super(salary);
        this.bonus=bonus;
    }
    float  getTotalSalary(){
        return salary+bonus;
    }
}
class MainClass{
    public static void main(String[] args) {

        Programmer programmer=new Programmer(2000,1000);
        System.out.println("Total salary of Employee is:"+programmer.getTotalSalary());
    }
}

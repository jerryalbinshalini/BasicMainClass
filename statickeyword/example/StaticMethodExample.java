package com.statickeyword.example;

public class StaticMethodExample {
    public static void main(String[] args){
        Employee.setCompanyName("Menorah Tech");//without object
        Employee employeeone=new Employee("Shalini");
        Employee employeetwo=new Employee("Shalu");
        Employee employeethree=new Employee("lini");
        employeeone.employeeInformation();
        employeetwo.employeeInformation();
        employeethree.employeeInformation();
    }
}

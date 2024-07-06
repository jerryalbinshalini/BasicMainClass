package com.constructorExample.shibinnewconstructor;


class EmployeeDefault {
    String empName;
    String empAge;
    String empSalary;
    EmployeeDefault(String empName,String empAge,String empSalary){
        this.empName=empName;
        this.empAge=empAge;
        this.empSalary=empSalary;

        System.out.println("Employee Name is:"+empName);
        System.out.println("Employee Age is:"+empAge);
        System.out.println("Employee Salary is:"+empSalary);

    }
    public static void main(String[] args) {

        new EmployeeDefault("shibin","19","2000000");
    }
}
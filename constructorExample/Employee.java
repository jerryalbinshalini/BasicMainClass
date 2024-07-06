package com.constructorExample;

public class Employee {
    private String employeename;
    private int employeeid;
    private double employeesalary;
    Employee(){
        System.out.println("Non argument constructor");
        employeename="Shalini";
        employeeid=101;
        employeesalary=34892;
      System.out.println("Employee Name:"+employeename+","+"Employee Id:"+employeeid+","+"Employee Salary:"+employeesalary);

    }
    void employeeInformation() {
        System.out.println("Employee Name:" + employeename + "," + "Employee Id:" + employeeid + "," + "Employee Salary:" + employeesalary);
    }

}
class nonArgumentConstructor {
    public static void main(String[] args){
        new Employee();//non argument constructor calling
        Employee employee=new Employee();//method calling
        employee.employeeInformation();
    }
}
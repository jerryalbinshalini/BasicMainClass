package com.constructorExample.shibinnewconstructor;

public class DefaultEmployee {
    String EmpName,EmpAge,EmpSalary;



    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(String empAge) {
        EmpAge = empAge;
    }

    public String getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(String empSalary) {
        EmpSalary = empSalary;
    }
}
class DefaultConstructor{
    public static void main(String[] args) {
      DefaultEmployee defaultEmployee=new DefaultEmployee();
      defaultEmployee.setEmpName("shalini");
      defaultEmployee.setEmpAge("30");
      defaultEmployee.setEmpSalary("1000");
        System.out.println("EmployeeName is:"+defaultEmployee.getEmpName()
       +"," +"EmployeeAge is:"+defaultEmployee.getEmpAge()
                +","+"EmployeeSalary is:"+defaultEmployee.getEmpSalary());

    }
}

package com.thiskeyword.exmple.anotherexample;

public class Employee {
    String name;
    int age;

    public Employee(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void workOnAssignment()
    {
        // Working on assignment
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee getEmployee()
    {
        return this;
    }
    public static void main(String args[])
    {
        Employee e1=new Employee("John",20);
        Employee e1Copy=e1.getEmployee();
        System.out.println("Employee's name : "+e1Copy.getName());
        System.out.println("Employee's age : "+e1Copy.getAge());
    }
}

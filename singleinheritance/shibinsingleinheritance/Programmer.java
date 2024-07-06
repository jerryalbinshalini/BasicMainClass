package com.singleinheritance.shibinsingleinheritance;

public class Programmer {
    String id;
    String name;
    String age;
    Programmer(String id,String name,String age){
        this.id=id;
        this.name=name;
        this.age=age;
        System.out.println("Id is:"+id);
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);

    }
}
class Employee extends Programmer{
    String salary;
   Employee(String id,String name,String age,String salary){
       super(id,name,age);
       this.salary=salary;
       System.out.println("Salary  is:"+salary);

   }

}
class MainClass{
    public static void main(String[] args) {
//
        System.out.println("Employee Details");
        new Employee("12","Shalu","31","3000");
        new Programmer("2","livi","24");
    }
}

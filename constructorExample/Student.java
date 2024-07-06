package com.constructorExample;

public class Student {
    private String studentName;
    private  int studentRollNo;
    private String studentDressCode;
    Student(String studentName,int studentRollNo,String studentDressCode){
        this.studentName=studentName;
        this.studentRollNo=studentRollNo;
        this.studentDressCode=studentDressCode;
        System.out.println("Student Name is:"+studentName+
                ","+"Student Roll_No  is:"+studentRollNo+
                ","+"Student DressCode is"+studentDressCode);
    }
//   }
//    public  void studentDetails(){
//        System.out.println("Student Name is:"+studentName+
//                ","+"Student Roll_No i is:"+studentRollNo+
//                ","+"Student DressCode is:"+studentDresscode);
//    }
}
class ParametrizedConstrutor {
    public static void main(String[] args){
        //constructor call
        new Student("Shalu",23,"Uniform");
        //method call
//        Student student=new Student("SSS",43,"uniform");
//        student.studentDetails();
    }
}
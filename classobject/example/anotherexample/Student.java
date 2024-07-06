package com.classobject.example.anotherexample;

public class Student {
    String studentName;
    String studentRollNo;
    String studentDepartment;

  public void studentDetails(String studentName,String studentRollNo,String studentDepartment) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentDepartment = studentDepartment;
        System.out.println("Student name is:" + studentName);
        System.out.println("Student Rollno is:" + studentRollNo);
        System.out.println("Student department is:" + studentDepartment);
    }

    public String studentdetail1(String studentName,String studentRollNo,String studentDepartment) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentDepartment = studentDepartment;
        System.out.println("Student name is:" + studentName + "\n" + "Student Rollno is:" +
                studentRollNo + "\n" + "Student department is:" + studentDepartment);
        return studentName+studentRollNo+studentDepartment;

    }
    public static void main(String[] args) {
        Student student=new Student();
        student.studentDetails("shalini","23","ECE");
        student.studentdetail1("JerryAlbin","34","MCA");
    }
}
//class StudentMain{
//
//}
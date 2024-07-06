package com.encapsulationExample;

public class Student {
    private String studentName;
    private int studentRollNo;
    private int studentId;


    public String getStudentName() {

        return studentName;
    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }


    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRoll_No) {

        this.studentRollNo = studentRoll_No;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
class StudentMain{
    public static void main(String[] args) {
        Student student=new Student();
        //call setter method & write the value of variable
        student.setStudentName("shalini");
        student.setStudentRollNo(34);
        student.setStudentId(1234);
        //call the getter method &read the value of variable  print
        System.out.println("Student Name is:"+student.getStudentName()+","+
                "Student RollNo is:"+student.getStudentRollNo()+","+"Student Id is:"+student.getStudentId());
    }
}

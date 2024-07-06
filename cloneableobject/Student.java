package com.cloneableobject;

public class Student implements Cloneable{
    int studentId;
    String studentName;
    Student(int studentId,String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student studentOne=new Student(101,"shalini");
            Student studentTwo=(Student)studentOne.clone();
            System.out.println(studentOne.studentId+" "+studentOne.studentName);
            System.out.println(studentTwo.studentId+" "+studentTwo.studentName);

        }
        catch (CloneNotSupportedException c){
            c.printStackTrace();
        }
    }
}

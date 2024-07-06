package com.serializationanddeserialization.serializationexample.serialversionuid;

import java.io.*;

class EmployeeOne implements Serializable{
    private static final long serialVersionUID =2L;
    String employeeId;
    String employeeName;
    String employeeSalary;
    EmployeeOne(String employeeId,String employeeName,String employeeSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
public class SerialVersionUidExample {
    public static void main(String[] args) {
// Serialize the object to a file
        try {
            EmployeeOne employee = new EmployeeOne("10", "shalini","2000");
            FileOutputStream fileOut = new FileOutputStream("employeeOne.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
            System.out.println("Employee object serialized and saved to employeeOne.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Deserialize the object from the file
        try {
            FileInputStream fileIn = new FileInputStream("employeeOne.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
           EmployeeOne deserializedEmployee = (EmployeeOne) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized Employee object:");
            System.out.println("Id: " + deserializedEmployee.getEmployeeId());
            System.out.println("Name: " + deserializedEmployee.getEmployeeName());
            System.out.println("Salary: " + deserializedEmployee.getEmployeeSalary());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    }


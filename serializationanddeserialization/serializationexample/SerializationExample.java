package com.serializationanddeserialization.serializationexample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Employee implements Serializable{
    public String employeeName;
    public String employeeAddress;
    public  String employeeSalary;
    public  String employeeId;
}

public class SerializationExample {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.employeeName="shalini";
        employee.employeeAddress="KollemCode";
        employee.employeeSalary="40.5K";
        employee.employeeId="Asd104";
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/DELL/Desktop/re.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in as.txt file");

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

}


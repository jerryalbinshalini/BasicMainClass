package com.serializationanddeserialization.serializationexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Employee employee=null;
        try{
            FileInputStream fileInputStream=new FileInputStream("C:/Users/DELL/Desktop/re.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            employee=(Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        }

        finally{
            System.out.println("Employee Details:");
            System.out.println("Name of employee is:"+employee.employeeName);
            System.out.println("Address of employee is:"+employee.employeeAddress);
            System.out.println("Salary of employee is:"+employee.employeeSalary);
            System.out.println("Id of employee is:"+employee.employeeId);
        }
    }
}

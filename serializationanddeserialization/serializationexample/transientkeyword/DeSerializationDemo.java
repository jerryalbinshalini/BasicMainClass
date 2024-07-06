package com.serializationanddeserialization.serializationexample.transientkeyword;

import java.io.*;

public class DeSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DeSerializationDemo deSerializationDemo=new DeSerializationDemo();
        deSerializationDemo.readEmployeeObject();

    }
    private void readEmployeeObject()throws FileNotFoundException,
            ClassNotFoundException, IOException{
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
            fileInputStream=new FileInputStream("jer.txt");
            objectInputStream=new ObjectInputStream(fileInputStream);
            Employee employee=(Employee) objectInputStream.readObject();
            System.out.println("id is"+employee.getId());
            System.out.println("name is"+employee.getName());
            System.out.println("Age is"+employee.getAge());

            System.out.println("successfully read employee object to the file");
        }
        finally {
            if(objectInputStream !=null){
                objectInputStream.close();
        }

    }
}}

package com.serializationanddeserialization.serializationexample.transientkeyword;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        SerializationDemo serializationDemo=new SerializationDemo();
        serializationDemo.writeEmployeeObject();

    }
    private void writeEmployeeObject() throws FileNotFoundException , IOException {
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try{
          fileOutputStream=new FileOutputStream("jer.txt");
          objectOutputStream=new ObjectOutputStream(fileOutputStream);
          Employee employee=new Employee(101,"sha",30);
            System.out.println("id is"+employee.getId());
            System.out.println("name is"+employee.getName());
            System.out.println("Age is"+employee.getAge());
            objectOutputStream.writeObject(employee);
            System.out.println("successfully written employee object to the file");
        }
        finally {
            if(objectOutputStream !=null){
                objectOutputStream.close();
            }

        }
    }
}

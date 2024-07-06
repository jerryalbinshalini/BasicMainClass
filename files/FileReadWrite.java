package com.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FileReadWrite {
    public  static void main(String[] args){
//       FileReadWrite fileReadWrite=new FileReadWrite();
     //fileReadWrite.fileReaderjava7();
        //fileReadWrite.readFilejava8();
    // fileReadWrite.writeFile7();
//        fileReadWrite.writeFile8();
        //fileReadWrite.collectionUsingForEach();
//      fileReadWrite.createFile();
      //fileReadWrite.readFile();
//       createFile();
//        writeFile7();
        readFile();
//        writeFile8();
//        readFilejava8();


    }
   static void createFile(){
        File file=new File("C:/Users/DELL/Desktop/sharth.txt");
       try{
           if(file.createNewFile()){
               System.out.println("file is created:"+file.getName());
           }
           else {
               System.out.println("file already exist:");
           }

       }catch (IOException ex){
           System.out.println("An error occures"+ex);
//
       }
    }




  private void fileReaderjava7(){

        File file=new File("C:/Users/DELL/Desktop/fileReaderjava.txt");
        try (FileReader fileReader=new FileReader(file);
             BufferedReader bufferedReader=new BufferedReader(fileReader);)
        {
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String[] dataValues=line.split(",");
                System.out.println(line);
                System.out.println(dataValues[0]+":"+dataValues[1]+":"+dataValues[2]+":"+dataValues[3]);//error
                System.out.println(dataValues[0]+":"+dataValues[1]);


            }
        }catch (IOException e){
            e.printStackTrace();

        }
    }





   private static void readFilejava8(){
        Path filePath= Paths.get("C:/Users/DELL/Desktop/glance.txt");
        try (Stream<String> lines= Files.lines(filePath)) {
           // lines.forEach(System.out::println);
            lines.forEach(line ->System.out.println(line));

        }catch (IOException e){
            e.printStackTrace();

        }
         }


    static void readFile() {

        String fileName = "C:/Users/DELL/Desktop/sharth.txt";


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception ex){
            System.out.println("error occured:"+ex);;
        }
    }


 static void writeFile7(){
        String writeData="Hello ,Hi How Are uuuuu";
        try (FileWriter fileWriter = new FileWriter("C:/Users/DELL/Desktop/sharth.txt")){
            fileWriter.write(writeData);
//            System.out.println(writeData);

            System.out.println("write data successfully insert in pre text file");
            fileWriter.append("\n How about uuu");
            fileWriter.close();
        }catch (IOException e){
            System.out.println("Error Occured:"+e);

        }
    }






   private static void writeFile8() {
        String writeData="Hello ,Hi How Are uuuuu";
        Path filePath= Path.of("C:/Users/DELL/Desktop/glance.txt");
        // Writing into the file
        try {
            Files.writeString(filePath,writeData);
            // Reading the content of the file
            String storedata = Files.readString(filePath);
            // Printing the content inside the file
            System.out.println(storedata);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    private void collectionUsingForEach(){
        Map<String,Integer> fruitsList=new HashMap<>();
        fruitsList.put("Apple",1);
        fruitsList.put("Orange",2);
        fruitsList.put("Banana",3);
        fruitsList.put("Mango",4);
        System.out.println("Before java 8 list print using foreach loop");
        for (Map.Entry<String,Integer> entryobj:fruitsList.entrySet())

            System.out.println("Key is " + entryobj.getKey() +
                    ", Value is " + entryobj.getValue());
        System.out.println("After java 8 list print using foreach loop");

        fruitsList.forEach((keylist,listvalue)-> System.out.println("Key : " + keylist + ", Value : " + listvalue));//lampda expression
        //not support for method reference in hashmap
        //only support in arraylist and hashset
        System.out.println("method reference in java 8");









    }
}

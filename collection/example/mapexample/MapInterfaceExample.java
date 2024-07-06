package com.collection.example.mapexample;
/*
Map interface:Map in Java is an interface available in java.util package
and it stores the data in key and value pairs. It does not allow duplicate keys,
the Java map functions differently from the Collection interface.
Map interface implement the classes are:HashMap,LinkedHashMap,TreeMap
 */

import java.util.*;

public class MapInterfaceExample {
    public static void main(String[] args) {
//
//        mapinterface();
//        hashMapClass();
//        LinkedHashMap();
        treeMap();


    }

    private static void mapinterface() {
        Map studentDetails = new HashMap();
        studentDetails.put("Shalini", "105");
        studentDetails.put("Shalu", "102");
        studentDetails.put("Shal", "103");
        studentDetails.put("lini", "103");
        studentDetails.put("Shalini", "101");
        studentDetails.put("null", null);//allow null value

        System.out.println("Map Output:" + studentDetails);
        System.out.println("Entry set is:" + studentDetails.entrySet());
        System.out.println("Key set is:" + studentDetails.keySet());
        System.out.println("values  is:" + studentDetails.values());


    }


    private static void hashMapClass() {
        HashMap<Integer, String> fruitsList = new HashMap<Integer, String>();
        fruitsList.put(1, "Apple");//Key and values are object
        fruitsList.put(2, "Orange");
        fruitsList.put(3, "Mango");
        fruitsList.put(null, "Papaya");//can store n number of null value,
        // but only one in key,take last value
        fruitsList.put(null, "Grapes");
        System.out.println(fruitsList);

        //putAll()
        HashMap<Integer, String> fruitsListOne = new HashMap<Integer, String>();
        fruitsListOne.put(4, "Banana");
        fruitsListOne.put(5, "Kiwi");
        fruitsList.putAll(fruitsListOne);
        System.out.println("Add the element in another" + fruitsList);

        //iterating hashMap.Entry using for each loop

        for (HashMap.Entry<Integer, String> entryobj : fruitsList.entrySet())
            System.out.println("Key is " + entryobj.getKey() +
                    ", Value is " + entryobj.getValue());
        System.out.println("...................");
        //iterator while loop
        Iterator<Map.Entry<Integer, String>> iterator = fruitsList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key is:" + entry.getKey() + ",value is:" + entry.getValue());
        }
    }



   private static void LinkedHashMap() {
          LinkedHashMap<Integer, String> fruitsList = new LinkedHashMap<Integer, String>();
          fruitsList.put(1, "Apple");//Key and values are object
          fruitsList.put(2, "Orange");
          fruitsList.put(3, "Mango");
          fruitsList.put(4, "Papaya");
          fruitsList.put(5, "Grapes");
          fruitsList.put(null, "Grapes");//It may have one null key and multiple null values.
          fruitsList.put(null, "Potato");//print last assign entries(key,value)
          fruitsList.put(6, null);//duplicate null value are allow
          fruitsList.put(7, null);
          System.out.println(fruitsList);//insertion order

      }






      private static void treeMap () {
          TreeMap<Integer, String> fruitsList = new TreeMap<>();
          fruitsList.put(1, "Apple");//Key and values are object
          fruitsList.put(3, "Orange");
          fruitsList.put(2, "Mango");
          fruitsList.put(4, "Papaya");
          fruitsList.put(5, "Grapes");
        fruitsList.put(5,"Grapes");//TreeMap doesn't allow a null key
       fruitsList.put(5,"Potato");
          fruitsList.put(6, null);//may contain many null values.
          fruitsList.put(7, null);
          System.out.println(fruitsList);//sorting order(ascending order)
          System.out.println();


     }

}



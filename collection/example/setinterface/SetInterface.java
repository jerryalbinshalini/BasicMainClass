package com.collection.example.setinterface;

import java.util.*;

public class SetInterface {
    public static void main(String[] args){

//     ashSetClass();
//       linkedHashSet();
         treeSet();


    }

   private static void hashSetClass(){
       HashSet <String> hashset=new HashSet<String>();
        hashset.add("10");
        hashset.add("20");
        hashset.add("30");
        hashset.add("30");
        System.out.println("Objects are:"+hashset);
        //addall()
        Set<String> hashsetNew=new HashSet<String>();
        hashsetNew.add("40");
        hashsetNew.add("50");
        System.out.println("New Objects are:"+hashsetNew);
        hashsetNew.addAll(hashset);
        System.out.println("Add the object hashsetnew "+hashsetNew);
        //toArray() convert array to object
        Object[] objects= new Object[hashsetNew.size()];
        hashsetNew.toArray(objects);
        System.out.println("Array objects are");
        for (Object item:objects){
            System.out.print(item+",");
        }



    }


    private static  void linkedHashSet(){
        LinkedHashSet <String> hashset=new LinkedHashSet<String>();
        hashset.add("10");
        hashset.add("20");
        hashset.add("30");
        hashset.add("30");
        System.out.println("Objects are:"+hashset);
        //addall()
        Set<String> hashsetNew=new HashSet<String>();
        hashsetNew.add("40");
        hashsetNew.add("50");
        System.out.println("New Objects are:"+hashsetNew);
        hashsetNew.addAll(hashset);
        System.out.println("Add the object hashsetnew "+hashsetNew);
        //itertor()
        Iterator<String> iterator=hashset.iterator();
        while (iterator.hasNext()){
            System.out.println("iterating elements:"+iterator.next());
        }

    }


    private static void treeSet(){
       TreeSet hashset=new TreeSet();
        hashset.add("10");
        hashset.add("20");
        hashset.add("30");

      hashset.add("30");
       hashset.add(40);//classcastException
//     hashset.add(null);//nullpointerexception
        System.out.println("Objects are:"+hashset);

    }


}

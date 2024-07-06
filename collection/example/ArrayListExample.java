package com.collection.example;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
//        arrayListExample.usingArrayList();
        arrayListExample.linkedListExample();

    }

   /* private void usingArrayList() {
  ArrayList<String> cousedetails = new ArrayList<>();
        cousedetails.add("MCA");
        cousedetails.add("MBA");
        cousedetails.add("Mcom");

        System.out.println("CourseDetails:"+cousedetails);
        System.out.println(cousedetails.get(2));//get() method using specify the index position
      cousedetails.remove(2);
        System.out.println(cousedetails);//remove() method to remove an element by index*/

//for each loop
     /*  ArrayList<String> cousedetails = new ArrayList<>();
        cousedetails.add("MCA");
        cousedetails.add("MBA");
        cousedetails.add("Mcom");
        //insert the element at first position,based on zero index based system
        cousedetails.add(1,"Arts");
        //for each loop using get the elemments,for(datatypr item:array)
        for (String str:cousedetails){
            System.out.println(str);
        }

      */

        //iterator using
  /*    ArrayList<String> cousedetails = new ArrayList<>();
       cousedetails.add("MCA");
       cousedetails.add("MBA");
       cousedetails.add("Mcom");
       // Get the iterator
        Iterator<String> it = cousedetails.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Print the first item
        //System.out.println(it.hasNext());
        //System.out.println(it.next());
       // System.out.println(it.next());//second item print
      //System.out.println(it.hasNext());//true
        System.out.println(cousedetails.size());//number of elements in the list
//        System.out.println(cousedetails.get(2));//it returns the object of list pressent at the specified index
//        System.out.println(cousedetails.contains("Mcom"));//check the gvn obj present in the arrlist
        //present-true;absent-false
//        cousedetails.clear();
//        System.out.println(cousedetails);



//    }*/

    private void linkedListExample(){
       LinkedList<String> cousedetails = new LinkedList<>();
        cousedetails.add("MCA");
        cousedetails.add("MBA");
        cousedetails.add("Mcom");
        System.out.println(cousedetails);
//         addAll method
       /* LinkedList<String> subject=new LinkedList<>();
        subject.add("Tamil");
        subject.add("English");
        subject.add("Maths");
        cousedetails.addAll(subject);
        System.out.println(cousedetails);*/

        //addFirst(),addLast,offer
       /* cousedetails.addFirst("Hello");// add the given element at the start of LinkedList
        cousedetails.addLast("Mam");// add the given element at the end of LinkedList
        cousedetails.offer("How r uu");// add the given element at the end of LinkedList
        System.out.println(cousedetails);*/

        //iterator while loop
//        Iterator<String> itr = cousedetails.listIterator();
//        while(itr.hasNext()) {
//            System.out.print(itr.next()+" ");
        }


        /*contains()The contains(Object o) method is used to check whether the object o is
        present in LinkedList or not. It returns a boolean value.
        If an element exists, then it returns true otherwise false.
         */
       /* boolean isPresent=cousedetails.contains("Maths");
        if(isPresent){
            System.out.println("Maths is present in list");
        }
        else {
            System.out.println("Maths is not present in list");
        }*/

        //convert linkedList to ArrayList
//     List<String> cousedetailarry = new ArrayList<String>(cousedetails);
//
//        for (String array : cousedetailarry){//for each loop
//            System.out.print(array+" ");
//        }


//        System.out.println(cousedetails.get(2));//specify position
//        System.out.println(cousedetails.getFirst());//return; first element
//        System.out.println(cousedetails.getLast());//returns last element



    }

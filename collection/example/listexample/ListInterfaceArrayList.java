package com.collection.example.listexample;

import java.util.*;

public class ListInterfaceArrayList {
    public static void main(String[] args) {

//        implemetArrayListClass();
//        implementLinkedListClass();
        stackExample();

    }


  private static void implemetArrayListClass() {
     ArrayList<String> studentlist = new ArrayList<String>();
       studentlist.add(null);
       studentlist.add("Arun");
       studentlist.add("Asha");
       studentlist.add("Anu");
       studentlist.add("Hanna");
       studentlist.add(null);
       System.out.println(studentlist);
       //Another list creation
       List<String> studentlistone = new ArrayList<String>();
       studentlistone.add("shalu");
       studentlistone.add("shalini");
       studentlistone.add("lini");
       studentlistone.add("shal");
       System.out.println(studentlistone);
       //addAll()->using add the elements one to another
       studentlist.addAll(studentlistone);
       System.out.println(studentlist);
       //get() method returns the element present in specified index position.
       System.out.println(studentlist.get(4));//hanna
       //set() used to replace the element at the specified
       // position in this list with the specified element.
       System.out.println(studentlist.set(2, "Aric"));
       System.out.println(studentlist);
       //size() return the length of the list
       System.out.println(studentlist.size());
       //toArray() convert a list into an array
       // Create a new array of String type
       // size of array is same as the ArrayList
       String[] arr = new String[studentlistone.size()];
       // Convert ArrayList into an array
       studentlistone.toArray(arr);
       // print all elements of the array
       System.out.print("Array are: ");
       //for each loop syntax....for(data type item:array)
       for (String item : arr) {
            System.out.print(item + ", ");
       }
       System.out.println();
       //contains() used to checking if the specified element is exist in the given list or not
       System.out.println("contains method");
       if (studentlistone.contains("shalini")) {
            System.out.println("shalini present in list");
       } else if (studentlistone.contains("Ammu")) {
            System.out.println("not present in studentlistone");
       } else {
            System.out.println("shalini not present in list");
       }
       //iterator()used to retriving object one by one from collection.
       //it is a forwared direction,not backword direction
       Iterator<String> iterator = studentlistone.iterator();
       while (iterator.hasNext()) {//hasNext() used toThe hasNext() method helps us to
            // find the last element of the List. It checks if the List has the next element or not.
            // If the hasNext() method gets the element during traversing in the forward direction,
            // returns true, else returns false and terminate the execution.
            System.out.print(iterator.next());//The next() method perform the iteration
            // in forward order. It returns the next element in the List
       }
       System.out.println();
       //clone() used for copy the list(return to the object so typecasting is used)
       ArrayList studentlistThree = (ArrayList) studentlist.clone();
       System.out.println("cloned object:" + studentlistThree);
       //remove method()
       String removestring = studentlistone.remove(1);
       System.out.println("Remove the elements:" + removestring);
       studentlist.removeAll(studentlist);
       System.out.println("Remove all the elements:" + studentlist);
       //sublist()
       System.out.println("sublist" + studentlistone.subList(0, 3));
       //for each loop
        /*  ArrayList<String> studentlist = new ArrayList<String>();
        studentlist.add("Arun");
        studentlist.add("Asha");
        studentlist.add("Anu");
        studentlist.add("Hanna");
        System.out.println(studentlist);
        for(String list:studentlist){
            System.out.println(list);
        }
        //java 8 lampda expression
        studentlist.foreach(list->System.out.println(list));
        //method reference java 8
        studentlist.forEach(System.out::println);
}*/


}




public static void implementLinkedListClass(){
     LinkedList<String> studentlist = new LinkedList<>();
      studentlist.add(null);
        studentlist.add("Arun");
        studentlist.add("Asha");
        studentlist.add("Anu");
        studentlist.add("Hanna");
        studentlist.add(null);
        System.out.println(studentlist);
        //offer() used to element adds in the last position
      studentlist.offer("Harini");
        System.out.println("add the element in last using offer():"+studentlist);
        //offerFirst()
      studentlist.offerFirst("John");
      System.out.println("add the element in list using offerFirst():"+studentlist);
      //offerLast()
      studentlist.offerLast("Tamil");
      System.out.println("add the element in last using offerLast():"+studentlist);
      //peek()This method retrieves the elements, but does not remove
      System.out.println(" the element in last using peek():"+studentlist.peek());
      System.out.println("the element in last using peekFirst():"+studentlist.peekFirst());
      System.out.println(" the element in last using peekLast():"+studentlist.peekLast());
      //poll()This method retrieves and removes  the list of element
      System.out.println(" the element in last using poll():"+studentlist.poll());
      System.out.println(studentlist);
      System.out.println(" the element in last using pollFirst():"+studentlist.pollFirst());
      System.out.println(studentlist);
      System.out.println(" the element in last using pollLase():"+studentlist.pollLast());
      System.out.println(studentlist);
      //Arraylist method are same as LinkedList

    }



  private static void stackExample(){
     Stack<String> studentlist = new Stack<>();
      studentlist.add(null);
      studentlist.add("Arun");
      studentlist.add("Asha");
      studentlist.add("Anu");
      studentlist.add("Hanna");
//      studentlist.pop();//remove last element
//      studentlist.add(null);
      System.out.println(studentlist);
      studentlist.pop();
      studentlist.pop();
       studentlist.pop();
       studentlist.pop();
       studentlist.pop();
      System.out.println(studentlist.empty());
  }


   }


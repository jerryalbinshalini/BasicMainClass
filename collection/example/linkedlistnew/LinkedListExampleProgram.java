package com.collection.example.linkedlistnew;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExampleProgram {
    public static void main(String[] args) {
//       usingObjectArrayOfLinkedList();
        arrayListOfLinkedList();

    }
    static void usingObjectArrayOfLinkedList(){
        // We create a Linked List of String type.
        LinkedList<String> listOne = new LinkedList<String>();
        listOne.add("Apple");
        listOne.add("Mango");
        listOne.add("Orange");

        LinkedList<String> listTwo = new LinkedList<String>();
        listTwo.add("Banana");
        listTwo.add("Guva");

        // We create a Linked List of Integer type.
        LinkedList<Integer> listThree = new LinkedList<Integer>();
        listThree.add(1);
        listThree.add(2);
        listThree.add(3);
        // We can add all types of list into Object array.
        Object[] array = {listOne, listTwo, listThree};


        System.out.println("The array of Linked Lists using Object[] array:");
//        System.out.println();
        for(Object listobj : array)
        {
            System.out.println(listobj.toString());
        }
    }
    static void arrayListOfLinkedList(){
        // We create a Linked List of String type.
        LinkedList<String> listOne = new LinkedList<String>();
        listOne.add("milk");
        listOne.add("Rice");

        LinkedList<String> listTwo = new LinkedList<String>();
        listTwo.add("Pencil");
        listTwo.add("pen");

        ArrayList<LinkedList> arrayList = new ArrayList<LinkedList>();
        // we add the Linked Lists
        arrayList.add(listOne);
        arrayList.add(listTwo);
        System.out.println("The ArrayList of Linked List is: ");
        // Use the for each method to print each Linked list
        arrayList.forEach(System.out::println);
    }

}

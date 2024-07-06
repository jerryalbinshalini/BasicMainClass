package com.collection.example;

import java.util.*;

public class CollectionExample {
    public  static  void main(String[] args){
        CollectionExample collectionExample=new CollectionExample();
        collectionExample.usingListExample();
       // collectionExample.usingMapExample();
        //collectionExample.usingSetExample();
    }
   private void usingListExample(){
       List language=new ArrayList();
        language.add("English");
        language.add("Maths");
        language.add("Chemistry");
        language.add(1);
        language.add(1);

      // List languageName=new ArrayList();//base class
        ArrayList languageName=new ArrayList();//childclass
        languageName.add("Python");
        languageName.add("Java");
        languageName.add("C");
        languageName.add("C++");
        languageName.add("Html");
        languageName.add("Java");//it allows dupilicate value
       language.addAll(languageName);


        System.out.println("List Output:"+language);



    }
   /*private void usingMapExample() {
       HashMap studentDetails = new HashMap();
       studentDetails.put("Shalini", "101");
       studentDetails.put("Shalu", "102");
       studentDetails.put("lini", 103);
       studentDetails.put("Shal", "104");
       studentDetails.put("Shalini", "105");
       System.out.println("Map Output:"+studentDetails);
   }*/
  /*  private void usingSetExample() {
       HashSet courseDetails = new HashSet();
      courseDetails.add("MCA");
      courseDetails.add("Bse.Maths");
      courseDetails.add("Bse.Chemistry");
      courseDetails.add("Bsc.Physices");
      courseDetails.add("Bsc.Physices");

       System.out.println("Set Output:"+courseDetails);
   }*/

}

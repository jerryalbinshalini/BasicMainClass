package com.hierarchicalinheritanceExample;

public class Science extends Student {
  int physicesmark;
   int chemestrymark;
    public void showScience(int physicesmark,int chemestrymark){
        this.showStudent();
        System.out.println("Physices Mark:"+physicesmark);
        System.out.println("Chemestry Mark:"+chemestrymark);
    }

}

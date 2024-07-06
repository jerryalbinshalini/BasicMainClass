package com.optionaljava8;

import java.util.Arrays;
import java.util.List;

public class OptinalClass {
   static List<String> fruitsList= Arrays.asList("Apple","Mango","Orange","PineApple","Banana");

    public static void main(String[] args) {
        String fruitsname=getFruitsList("Apple");
        System.out.println(fruitsname);

    }
    private static String getFruitsList(String name){
       // List<String> fruitsList= Arrays.asList("Apple","Mango","Orange","PineApple","Banana");
        String foundlist=null;
        for(String fruitsname:fruitsList){
            if(fruitsname.startsWith("A")){
                foundlist= fruitsList.toString();
                break;
            }
        }
        return foundlist!=null?foundlist:"fruitlist not found";

    }

}

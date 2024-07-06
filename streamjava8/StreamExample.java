package com.streamjava8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args){
        StreamExample streamExample=new StreamExample();
       // streamExample.withoutStream();
        streamExample.withStream();

    }
    private void withoutStream(){
      HashMap<String,Integer> productlist=new HashMap();
       productlist.put("Apple",250);
       productlist.put("Banana",350);
       productlist.put("Mango",400);
       productlist.put("Orange",450);
        System.out.println("Orginal price:"+productlist);
        System.out.println("..............................");
        System.out.println("discount price:");
        // pass lambda expression to forEach()
        productlist.forEach((product, price) -> {

            // decrease value by 10%
            price = price - price * 10/100;
            System.out.print(product + "=" + price + " ");
        });
    }
    private void withStream(){
        HashMap<String,Integer> productlist=new HashMap();
        productlist.put("Apple",250);
        productlist.put("Banana",350);
        productlist.put("Mango",400);
        productlist.put("Orange",450);
        System.out.println("Orginal price:"+productlist);
        System.out.println("..............................");
        System.out.println("discount price:");
  List<Integer> discoundList=productlist.entrySet().stream()
               .filter(price->price.getValue() >250)
               .map(price->price.getValue()*10/100)
               .collect(Collectors.toList());
        System.out.println(discoundList);


    }
}

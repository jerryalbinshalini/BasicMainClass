package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class usingStream {
    public static void main(String[] args) {
        usingStream usingStream = new usingStream();
        usingStream.usingStreamJava7();

    }

    private void usingStreamJava7() {
        List<String> languageName = new ArrayList<>();
        languageName.add("java");
        languageName.add("core java");
        languageName.add("Advanced Java");
        languageName.add("angular");
        languageName.add("java SpringBoot");
        languageName.add("");
        languageName.add(null);
        languageName.add("Advanced SpringBoot");

       List<String>resultLanguageName=new ArrayList<>();
        for(String name:resultLanguageName)
            if(name!=null && !name.isEmpty() || name.contains("java")){
               resultLanguageName.add(name);

            }
        System.out.println(resultLanguageName);
        List<String>resultwithgreetingLanguageName=new ArrayList<>();
        for(String javaname:resultLanguageName){
            resultwithgreetingLanguageName.add(javaname+"Welcome");
              }
        System.out.println(resultwithgreetingLanguageName);
        }
}     //using stream
       /* List<String> resultlanguageName=languageName.stream()
                .filter(name->name!=null && !name.isEmpty() && name.contains("java"))
                .map(value->value+"Welcome")
                .collect(Collectors.toList());
        System.out.println(resultlanguageName);

        */
      /*  List<Integer> evennumberget= Arrays.asList(1,2,4,6,7,8,9);
        evennumberget.stream()
                .filter(number->number % 2==0)
                .map(product->product*2)
                //.forEach(System.out::println);
                .forEach(result-> System.out.println(result));

       */
     /*   List<Integer> evennumberget= Arrays.asList(1,2,4,6,7,8,9);
        evennumberget.stream()
                .filter(number->{
                   if(number % 2==0) {
                        return true;
                    }
                    else{
                        return false;
                    }
                })
               .map(product->{
                   return product*2;
               })
                //.forEach(System.out::println);
               .forEach(result-> System.out.println(result));


    }


      */


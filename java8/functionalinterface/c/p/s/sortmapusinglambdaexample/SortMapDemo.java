package com.java8.functionalinterface.c.p.s.sortmapusinglambdaexample;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("eight",8);
        map.put("four",4);
        map.put("ten",10);
        map.put("two",2);

        List<Map.Entry<String,Integer>>entries=new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
//                iterating
        for(Map.Entry<String,Integer>entry:entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

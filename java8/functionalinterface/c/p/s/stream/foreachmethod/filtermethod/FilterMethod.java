package com.java8.functionalinterface.c.p.s.stream.foreachmethod.filtermethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("shalini");
        list.add("stalin");
        list.add("shalu");
        list.add("lini");
//        normal method
        for (String itemobj : list) {
            if (itemobj.startsWith("s")) {
                System.out.println(itemobj);
            }
        }
//        stream method using list
        list.stream().filter(t->t.startsWith("s")).forEach((t-> System.out.println(t)));
//       stream method using map
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj-> System.out.println(obj));
    }
}
package com.java8.functionalinterface.c.p.s.stream.foreachmethod.filtermethod.realtimeexa.forandfilter;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Employee>getEmployee(){
        List<Employee>list=new ArrayList<>();
        list.add(new Employee(176,"shalini","IT",600000));
        list.add(new Employee(456,"shalu","CIVIL",900000));
        list.add(new Employee(777,"lini","ECE",500000));
        list.add(new Employee(870,"ammu","Mech",400000));
        list.add(new Employee(333,"Anchu","IT",1200000));
        return list;
    }
}

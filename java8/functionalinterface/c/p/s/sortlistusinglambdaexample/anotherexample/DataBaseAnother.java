package com.java8.functionalinterface.c.p.s.sortlistusinglambdaexample.anotherexample;

import com.java8.functionalinterface.c.p.s.stream.foreachmethod.filtermethod.realtimeexa.forandfilter.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataBaseAnother {
    public static List<EmployeeAnother> getEmployee(){
        List<EmployeeAnother>list=new ArrayList<>();
        list.add(new EmployeeAnother(176,"shalini","IT",600000));
        list.add(new EmployeeAnother(456,"shalu","CIVIL",900000));
        list.add(new EmployeeAnother(777,"lini","ECE",500000));
        list.add(new EmployeeAnother(870,"ammu","Mech",400000));
        list.add(new EmployeeAnother(333,"Anchu","IT",1200000));
        return list;
    }
}

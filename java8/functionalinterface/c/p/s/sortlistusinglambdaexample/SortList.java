package com.java8.functionalinterface.c.p.s.sortlistusinglambdaexample;

import com.java8.functionalinterface.c.p.s.stream.foreachmethod.filtermethod.realtimeexa.forandfilter.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<EmployeeList>employeeList=new ArrayList<>();
        employeeList.add(new EmployeeList(10, "Ramesh", "IT", 500000));
        employeeList.add(new EmployeeList(20, "Jerry", "ECE", 400000));
        employeeList.add(new EmployeeList(30, "Shalini", "MECH", 900000));
        employeeList.add(new EmployeeList(10, "Anchu", "CSE", 600000));
       //ascending order
        Collections.sort(employeeList,new MySortImpl());
        System.out.println(employeeList);


    }
}

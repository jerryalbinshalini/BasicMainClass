package com.java8.functionalinterface.c.p.s.sortlistusinglambdaexample.anotherexample;

import com.java8.functionalinterface.c.p.s.stream.foreachmethod.filtermethod.realtimeexa.forandfilter.DataBase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {
    public static void main(String[] args) {
        List<EmployeeAnother>employeeAnother= DataBaseAnother.getEmployee();
//        Collections.sort(employeeAnother,new MyComparatorImpl());
//        System.out.println(employeeAnother);
        //using directely through comparator functional interface
      /* Collections.sort(employeeAnother, new Comparator<EmployeeAnother>() {
            @Override
            public int compare(EmployeeAnother o1, EmployeeAnother o2) {
//                return (int)(o1.getSalary()-o2.getSalary());//ascending
                return (int)(o2.getSalary()-o1.getSalary());//descending

            }
        });
        System.out.println(employeeAnother);

       */


//        using lambda expression
       /* Collections.sort(employeeAnother,((o1, o2) -> (int) (o1.getSalary()-o2.getSalary())));
        System.out.println(employeeAnother);

        */


//        using stream api in lambda exp and method reference
       /* employeeAnother.stream().sorted(((o1, o2) -> (int)(o1.getSalary()-o2.getSalary())))
                .forEach(System.out::println);

        */


//        directly passing through method reference
        employeeAnother.stream().sorted(Comparator.comparing(emp->emp.getName()))
                .forEach(System.out::println);

    }
}

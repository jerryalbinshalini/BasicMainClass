package com.java8.functionalinterface.c.p.s.sortlistusinglambdaexample.anotherexample;

import java.util.Comparator;

public class MyComparatorImpl implements Comparator<EmployeeAnother> {


    @Override
    public int compare(EmployeeAnother o1, EmployeeAnother o2) {
        return (int)(o2.getSalary()-o1.getSalary());
    }

}

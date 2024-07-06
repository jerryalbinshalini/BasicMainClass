package com.java8.functionalinterface.c.p.s.sortlistusinglambdaexample;

import java.util.Comparator;

public class MySortImpl implements Comparator<EmployeeList> {

    @Override
    public int compare(EmployeeList o1, EmployeeList o2) {
        return (int)(o1.getSalary()-o2.getSalary());

    }
}

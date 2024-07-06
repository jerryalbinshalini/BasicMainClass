package com.java8.functionalinterface.c.p.s;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFilterMethod {
    public static void main(String[] args) {
        Predicate<Integer>predicate=t->t%2==0;
        System.out.println(predicate.test(4));
        List<Integer>listOne= Arrays.asList(1,2,3,4,5);
        listOne.stream().filter(predicate).forEach(t-> System.out.println("print the number"+t));
    }
}

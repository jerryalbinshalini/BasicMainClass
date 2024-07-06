package com.java8.functionalinterface.c.p.s;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Integer> {
    public boolean test(Integer t){
        if(t%2==0){
            System.out.println("The number is even number");
            return true;
        }
        else {
            System.out.println("the number is odd number");
            return false;
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate=new PredicateImpl();
        System.out.println(predicate.test(4));
    }
}

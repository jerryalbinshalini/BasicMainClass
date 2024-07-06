package com.java8.functionalinterface.c.p.s;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambdaExample {
    public static void main(String[] args) {
      Consumer<Integer>consumer=t-> System.out.println("The value of a is"+t);
        consumer.accept(10);

//........create  a list using forEach method{forEach is a consumer interface}
        List<String> fruitlist= Arrays.asList("apple","mango","Banana");
        fruitlist.stream().forEach(t-> System.out.println("The fruitsList are:"+fruitlist));




    }
}

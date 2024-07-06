package com.java8.functionalinterface.c.p.s.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {
    public static List<Customer> getAll(){
        return Stream.of(new Customer(1,"Anchu","anchu@gmail.com", Arrays.asList("2345678","56789432")),
                new Customer(2,"Ammu","ammu@gmail.com", Arrays.asList("5678432","5674321")),
                new Customer(3,"shalini","shalini@gmail.com", Arrays.asList("12345","545678432")),
                new Customer(4,"shalu","shalu@gmail.com", Arrays.asList("0978668","4563099"))
                        ).collect(Collectors.toList());

    }
}

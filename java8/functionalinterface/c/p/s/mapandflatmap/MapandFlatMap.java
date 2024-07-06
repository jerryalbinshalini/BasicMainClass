package com.java8.functionalinterface.c.p.s.mapandflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapandFlatMap {
    public static void main(String[] args) {
        List<Customer> customers=CustomerDatabase.getAll();
//        list<customer> convert list<string> - data transformation
//        mapping:customer->customer.getemail()
//        customer->customer.getemail() is called one to one mapping
        List<String> emails=customers.stream().map(customer->customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

//        customer->customer.getPhoneNumbers() is called one to many mapping
        List<List<String>>phoneNumbers=customers.stream().map(customer->customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);
//        list<customer> convert list<string> - data flattering
//        mapping:customer->customer.getPhoneNumbers()
//        customer->customer.getPhoneNumbers() is called one to many mapping

        List<String>phones=customers.stream().flatMap(customer->customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}

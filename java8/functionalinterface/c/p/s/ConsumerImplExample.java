package com.java8.functionalinterface.c.p.s;

import java.util.function.Consumer;

public class ConsumerImplExample implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("The value of a is:"+t);

    }

    public static void main(String[] args) {
       /* ConsumerImplExample consumerExample=new ConsumerImplExample();
        consumerExample.accept(10);*/
        //another calling
        Consumer<Integer>consumer=new ConsumerImplExample();
        consumer.accept(10);

    }


}
//void accept(T t)
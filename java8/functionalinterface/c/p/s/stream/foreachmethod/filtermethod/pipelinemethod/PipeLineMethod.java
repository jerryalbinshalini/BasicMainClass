package com.java8.functionalinterface.c.p.s.stream.foreachmethod.filtermethod.pipelinemethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PipeLineMethod {
    public static void main(String[] args) {
        //stream pipeline flow
        //1.source of data
        List<Integer>integerList= Arrays.asList(1,2,3,4,5,6);
        //2.convert source into a java stream
        Stream<Integer>integerStream=integerList.stream();
        //3.non terminal operatin
        Stream<Integer>fileStream=integerStream.filter(ele->ele>3);
        //4.\non terminal operatin
        Stream<Integer>computedStream=fileStream.map(n->n*n);
        //5.terminal operation
        computedStream.forEach(a-> System.out.println(a));
    }
}

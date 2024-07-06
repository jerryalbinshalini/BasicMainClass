package com.optionaljava8;

import java.util.Optional;

public class OptionalExampleOne {
    //https://www.javaguides.net/2018/07/java-8-optional-class-with-examples.html
//https://www.java67.com/2018/06/java-8-optional-example-ispresent-orElse-get.html
        public static void main(String[] args) {
            OptionalExampleOne optionalExampleOne=new OptionalExampleOne();
           // optionalExampleOne.isPresentMethod();
            optionalExampleOne.orElsemethod();


        }
        private void isPresentMethod(){
            String email = "shalini@gmail.com";

            Optional<String> stringOptional = Optional.ofNullable(email);

            if(stringOptional.isPresent()){
                System.out.println(stringOptional.get());

            }else{
                System.out.println("no value present");
            }
        }

        private  void orElsemethod(){
           String email = null;
            //String email = "shalini@gmail.com";

            Optional<String> stringOptional = Optional.ofNullable(email);
            String defaultOptional = stringOptional.orElse("shalu@gmail.com");
            System.out.println(defaultOptional);
        }
    }


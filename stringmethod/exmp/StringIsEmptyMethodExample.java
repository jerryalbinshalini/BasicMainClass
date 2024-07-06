package com.stringmethod.exmp;

public class StringIsEmptyMethodExample {
    public static void main(String[] args){
        boolean flag=false;
        System.out.println("flag"+flag);
        System.out.println("Not flag"+!flag);
//        String firstName="shalini";
//        String secondName=null;

//        String firstName="Lini";
//        String secondName="shalini";

//        String firstName="";
//        String secondName="shalini";

        String firstName=null;
        String secondName=null;



//        System.out.println(firstName.isEmpty());
//        System.out.println(firstName.isBlank());
        if((firstName==null || firstName.isEmpty()) && (secondName!=null && !secondName.isEmpty())){
            System.out.println("u enter first name");
        }
        else if ((firstName!=null && firstName.isEmpty()) && (secondName==null || secondName.isEmpty())) {
            System.out.println("u enter second name");
        } else if ((firstName!=null && firstName.isEmpty()) && (secondName!=null && secondName.isEmpty())) {
            System.out.println("fullname:"+(firstName+secondName));

        }else if ((firstName==null || firstName.isEmpty()) && (secondName==null || secondName.isEmpty())) {
            System.out.println("u enter both name");

        }

//        String firstName=null;
//        String secondName=null;


//        //firstname is not null
//        if((firstName!=null && !firstName.isEmpty()) && (secondName==null || secondName.isEmpty()))
//        {
//            System.out.println("U enter second name");
//        } else if ((firstName!=null || !firstName.isEmpty()) && (secondName!=null || secondName.isEmpty())) {
//            System.out.println("Full Name is:"+(firstName+secondName));
//
//
//        } else if ((firstName==null || firstName.isEmpty()) && (secondName!=null || !secondName.isEmpty())){
//            System.out.println("u enter firstname");
//
//        }
//
//
//        else if ((firstName==null || firstName.isEmpty()) && (secondName==null || secondName.isEmpty())){
//            System.out.println("U enter first & second number");
//        }:

    }
}

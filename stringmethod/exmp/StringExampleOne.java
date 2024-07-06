package com.stringmethod.exmp;

public class StringExampleOne {
    String firstName,secondName;
    public static void  main(String[] args){
        System.out.println("String based Example Pro");
        StringExampleOne obj= new StringExampleOne();
        obj.concatenateName(null,"");//
    }
    public void concatenateName(String firstName,String secondName){
        String fullName=firstName+secondName;
        //firstName is equal to null means come in nullpointer exception,not equal to null means else block executed
        if(firstName!=null&&secondName==null&&secondName.isEmpty()){
            System.out.println("FullName:"+fullName);

        }
        else{
            System.out.println("plz enter the firstName");
        }
    }
}

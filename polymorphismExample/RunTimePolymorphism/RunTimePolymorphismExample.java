package com.polymorphismExample.RunTimePolymorphism;

public class RunTimePolymorphismExample {
    public static void main(String[] args){
        RedmiMobile redmiMobile=new RedmiMobile();
        System.out.println("Sumsung Mobile Details:");
        redmiMobile.mobileDetails("Sumsung","Android",42,4.00);
        System.out.println("RedMi Mobile Details:");
        redmiMobile.mobileDetails("Redmi","Android",50,3.5);
        System.out.println("Apple Mobile Detail:");
        redmiMobile.mobileDetails("Apple","IOS",128,8);


//        SamsungMobile samsungMobile=new SamsungMobile();
//        samsungMobile.mobileDetails("ee","4",45,4.5);

    }


}

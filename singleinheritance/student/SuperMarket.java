package com.singleinheritance.student;

public class SuperMarket {
    static String  ownerName="ABIN";
    int numberOfEmployees;
    int numberOfDeliveryBoys;
    SuperMarket(int numberOfEmployees,int numberOfDeliveryBoys){
        this.numberOfEmployees=numberOfEmployees;
        this.numberOfDeliveryBoys=numberOfDeliveryBoys;
        //optinal
        System.out.println("SuperMarketDetails:"+numberOfEmployees+
                ","+numberOfDeliveryBoys+","+ownerName);

    }
//    public void message(int numberOfEmployees,int numberOfDeliveryBoys){
//        System.out.println("SuperMarketDetails:"+numberOfEmployees+
//                ","+numberOfDeliveryBoys+ownerName);
//    }
}

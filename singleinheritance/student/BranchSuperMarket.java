package com.singleinheritance.student;

public class BranchSuperMarket extends SuperMarket {
    //int numberOfWomenEmployee;




    BranchSuperMarket(int numberOfEmployees,int numberOfDeliveryBoys,int numberOfWomenEmployee){
              super( numberOfEmployees,numberOfDeliveryBoys);
        System.out.println("BranchSuperMarketDetails:"+numberOfEmployees+
                ","+numberOfDeliveryBoys+","+numberOfWomenEmployee+","+ownerName);

    }


    }





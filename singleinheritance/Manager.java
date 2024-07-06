package com.singleinheritance;

public class Manager extends Officer{
//    int da;
    public void showManagerDetails(){
//        this.showOfficerDetails(60000);
        this.showWorkerDetail(3,"ammu",3000);
        long da=salary*2;
        System.out.println("DA is:"+da);
    }
}
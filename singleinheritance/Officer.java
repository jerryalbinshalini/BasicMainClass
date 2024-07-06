package com.singleinheritance;
//derived class
public class Officer extends Worker{
//    long hra=salary*(4/100);

    public  void showOfficerDetails(){
      super.showWorkerDetail(12,"dd",8000);
        long hra=salary*4;
        System.out.println("hra is:"+hra);
    }



}

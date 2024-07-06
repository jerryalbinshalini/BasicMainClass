package com.multilevelInheritance;

public class EmployeeMainClass {
    public  static void main(String[] args){
//        Officer officer=new Officer(101,"Shalu",2000,4);
//         officer.officerdetail();
         Manager manager=new Manager(104,"Hans",5000,4,2);
         manager.managerDetail();
        //officer.getHraAmount();
        //officer.workerDetail();



    }
}

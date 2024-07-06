package com.variableExample;
//class emp

public class StaticVariable {
    public static void main(String[] args) {
    StaticVariable shalinidetail=new StaticVariable(1,"Shalini",3000);
        StaticVariable linidetail=new StaticVariable(2,"Lini",4000);
//      StaticVariable shaludetail=new StaticVariable(3,"Shalu",5000,"sss");
        shalinidetail.displayEmpDetail();
        linidetail.displayEmpDetail();
//        shaludetail.displayEmpDetail();
    }
    int id;
    String name;
    int salary;
   static String ceo="shalini";
    StaticVariable(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
//        this.ceo=ceo;

    }
    public  void displayEmpDetail(){
        System.out.println("Emp ID is:"+this.id+";"+"Emp NAME is:"+this.name+";"+"Emp SALARY is:"+this.salary+";"+"CEO NAME is:"+this.ceo);
    }
}

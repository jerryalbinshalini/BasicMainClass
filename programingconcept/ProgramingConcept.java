package com.programingconcept;

public class ProgramingConcept {
    public static void main(String[] args) {
        ProgramingConcept programingConcept=new ProgramingConcept();
       // programingConcept.ifExample();
       // programingConcept.ifElseExample();
        //programingConcept.elseIfExample();
        //programingConcept.switchExample();
       // programingConcept.whileExample();
        //programingConcept.doWhileExample();
       // programingConcept.forLoopExample();
       // programingConcept.conditionalTernaryOperator();
        //programingConcept.breakStatementExample();
//        programingConcept.continueStatement();
        programingConcept.nestedIfElse();


    }
    public void ifExample(){
        int aValue=12;
        int bValue=25;
        int cValue=26;
        if(aValue>bValue){
            System.out.println("aValue is greater");
        }
        if(bValue>cValue){
            System.out.println("bValue is greater");
        }
        if(cValue>aValue){
            System.out.println("cValue is greater");
        }

    }
    public void ifElseExample(){
        int number=5;
        if(number%2==0){
            System.out.println("the given number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
    }
    public void elseIfExample(){
        String browser="chrome";
        if(browser=="safri"){
            System.out.println("browser name is safri");
        } else if (browser=="Edge") {
            System.out.println("browser name is Edge");

        }
        else if (browser=="chrome") {
            System.out.println("browser name is chrome");

        }
        else {
            System.out.println("nothing");
        }

    }
    public void switchExample(){
        String name="shalini";
        switch (name){
            case "shalu":
                System.out.println("my name is shalu");
                break;
            case "lini":
                System.out.println("my name is lini");
                break;
            case "sobith":
                System.out.println("my name is sobith");
                break;
            default:
                System.out.println("my name is shalini");
        }
    }
    public void nestedIfElse(){
        String name="Shalini",newName="Jerry Albin";
        if(name!=newName){
            if(newName!=name){
                System.out.println("My name is:"+name+" "+newName);
            }

        }
    }
    public void whileExample(){
        int num=10;
        while (num>0){
           // num--;
            System.out.println("The value of number is:"+num);
            num--;
        }
    }
    public void doWhileExample(){
        int num = 10;
        do
        {
            // num--;
            System.out.println(num);

            // Update Section
            num--;
        } while (num > 0);

    }
    public void forLoopExample(){
        //for(int num=0;num<10;num++){//increment
            //System.out.println(num);
            //System.out.print(num);
            for(int num=10;num>0;num--){//decrement
              System.out.println(num);
        }

    }
    public void conditionalTernaryOperator(){
        int mark=80;
        String resultOne=mark>=40?"pass":"fail";
        System.out.println("Result is:"+resultOne);
        String resultTwo=mark<40?"pass":"fail";
        System.out.println("Result is:"+resultTwo);

    }
    public void breakStatementExample(){
        for(int i=1;i<10;i++){
            System.out.print(i);
            if(i==5){
                break;
            }
        }

    }
    public void continueStatement(){
        for(int i=0;i<10;i++){

            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }

}

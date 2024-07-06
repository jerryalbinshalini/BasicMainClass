package com.constructorExample;

public class Person {
    private String personName;
    private int adtherNumber;
    private String voteIdNumber;
    private boolean isEligible;
    Person(String personName,String voteIdNumber){
        this.personName=personName;
        this.voteIdNumber=voteIdNumber;
        System.out.println("Person Name is:"+personName+","
                +"Person VoteIdNumber is:"+voteIdNumber);

    }
    Person(String personName,int adtherNumber,String voteIdNumber,boolean isEligible){
        this.personName=personName;
        this.adtherNumber=adtherNumber;
        this.voteIdNumber=voteIdNumber;
        this.isEligible=isEligible;
        System.out.println("Person Name is:"+personName+","
                +"Person AdtherNumber is:"+adtherNumber+","
                +"Person VoteIdNumber is:"+voteIdNumber+","
                + "Person Eligible for Vote:"+isEligible);


    }

    public static void main(String[] args) {
        new Person("sibin Raji","As34567D");
        new Person("shibin",566,"4567Ind",true);
    }
}

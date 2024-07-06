package com.statickeyword.example;

public class BankAccount {
    //static keyword using variable
    static String IFSC_CODE="SBI1000034567";//for constant variable
    String customerName;
    String accountNumber;
    long balence;
    BankAccount(String customerName,String accountNumber,long balence){
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.balence=balence;
        System.out.println("Customer Name is:"+customerName+
                ","+"Customer Account Number is:"+accountNumber+
                ","+"Customer Balence Details :"+balence+
                ","+"Bank IFSC CODE Is:"+IFSC_CODE);



    }
    public void displayBankDetails(){
        System.out.println("Customer Name is:"+customerName+
                ","+"Customer Account Number is:"+accountNumber+
                ","+"Customer Balence Details :"+balence+
                ","+"Bank IFSC CODE Is:"+IFSC_CODE);

    }

}

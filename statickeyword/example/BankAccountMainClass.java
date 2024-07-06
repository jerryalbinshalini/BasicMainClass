package com.statickeyword.example;

public class BankAccountMainClass {
    public static void main(String[] args){
        //new BankAccount("Shalini","12345678",2500);//without object
        BankAccount bankAccount=new BankAccount("asd","212345",900);
        bankAccount.displayBankDetails();
    }
}

package com.generictypes;

public class GenericClassExample {
    public static void main(String[] args) {
       BankAccount<String> obj1= new BankAccount<>("shalini");
       BankAccount<Integer>obj2= new BankAccount<>(4);
       obj1.display();
       obj2.display();

    }
}
class BankAccount<T>{
    T t1;
    BankAccount(T t1){

        this.t1=t1;
    }
    public void display(){

        System.out.println(t1);
    }
}
package com.generictypes.genericmethod;



public class GenericMethodExample {
    public static void main(String[] args) {
        BankAccountMethod<String> obj1= new BankAccountMethod<>("shalini");
        BankAccountMethod<Integer>obj2= new BankAccountMethod<>(4);
        Integer[] money1={100,20,40,500};
        Double [] money2={10.45,23.45,100.89};
        obj1.depositMoney(money1);
        obj2.depositMoney(money2);
    }
}
class BankAccountMethod<T>{
    T variableT;
    BankAccountMethod(T variableT){

        this.variableT=variableT;
    }
    public <T> void depositMoney(T[] variableMoney){
        for (T i:variableMoney){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
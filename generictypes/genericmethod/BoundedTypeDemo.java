package com.generictypes.genericmethod;
class BankAccountBoundType<T extends Number>{
    public void display(T[] t1){
        for (T i:t1){
            System.out.print(i+" ");
        }
    }
}

public class BoundedTypeDemo {
    public static void main(String[] args) {
        /*BankAccountBoundType<Integer>bankAccountBoundType=new BankAccountBoundType<>();
        Integer[] m1={100,200,300};
        bankAccountBoundType.display(m1);
       Double[] m2={10.2,23.4,34.8};
       bankAccountBoundType.display(m2);//error

         */
       /* BankAccountBoundType<Number>bankAccountBoundType=new BankAccountBoundType<>();
        Integer[] m1={100,200,300};
        bankAccountBoundType.display(m1);
        Double[] m2={10.2,23.4,34.8};
        bankAccountBoundType.display(m2);

        */
        /*BankAccountBoundType<Number>bankAccountBoundType=new BankAccountBoundType<>();
        Integer[] m1={100,200,300};
        bankAccountBoundType.display(m1);
       String[]s1={"hi","hello"};
        bankAccountBoundType.display(s1);//error becz string is not a sub class of Number

         */
    }
}

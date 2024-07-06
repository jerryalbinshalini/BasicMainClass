package com.hybridinheritance.singlemultipleinheritance;

public class DerivedClassD extends DerivedClassB implements InterfaceClassC {


    @Override
    public void multiplication() {
        int multiResult=numberThree*100;
        System.out.println("Multiplication of two number is:"+multiResult);
    }


}

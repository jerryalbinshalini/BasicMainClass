package com.basicjava.programexample;

public class SwapTwoNumber {
    public static void main(String[] args) {
        SwapTwoNumber swapTwoNumber=new SwapTwoNumber();
        swapTwoNumber.swapping(2,4,6);

    }
    private void swapping(int firstnumbe,int secondnumber,int thirdNumber){
        int swapNumber;
        swapNumber=firstnumbe;
        firstnumbe=secondnumber;
        secondnumber=thirdNumber;
        thirdNumber=swapNumber;
        System.out.println("value of firstnumber is"+firstnumbe+
                "value of second number is:"+secondnumber+
                "value of third number is:"+thirdNumber);


    }
}

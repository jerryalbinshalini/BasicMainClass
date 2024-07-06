package com.enumexample;
enum Days{
    SUNDAY,MONDAY,TUESDAY,WENESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class SwitchStamentUsingEnum {
    public static void main(String[] args){
        Days days=Days.MONDAY;
        switch (days){
            case SUNDAY:
            System.out.println("I am sunday");
            break;
            case MONDAY:
                System.out.println("I am monday"+days.ordinal());
                break;
            case TUESDAY:
                System.out.println("I am tuesday");
                break;
            default:
                System.out.println("None");
                break;

        }

    }



}

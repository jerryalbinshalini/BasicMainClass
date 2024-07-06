package com.multipleInterfaceExample;

public class  Vehicle implements VehicleOne,VehicleTwo{

    @Override
    public void calculateDistance() {
        int calculatedistance=speed*100;
        System.out.println("Vehicle travel distance is:"+calculatedistance);

    }

    @Override
    public void calculateSpeed() {
        int calculatespeed=distance/12;
        System.out.println("Vehicle travel speed is:"+calculatespeed);

    }
}
class MultipleInheritanceExample {
    public static void main(String[] args){
        Vehicle vehicle=new Vehicle();
        vehicle.calculateDistance();
        vehicle.calculateSpeed();
    }
}

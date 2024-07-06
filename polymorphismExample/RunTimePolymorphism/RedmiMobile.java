package com.polymorphismExample.RunTimePolymorphism;

public class RedmiMobile extends SamsungMobile {//child class
  public void mobileDetails(String devicename, String version, int devicestorage, double ram) {
        this.devicename = devicename;
        this.version = version;
        this.devicestorage = devicestorage;
        this.ram = ram;

        System.out.println("Mobile Name:" + devicename +
                "Mobile Version:" + version +
                "MobileStorage" + devicestorage +
                "Mobile Ram" + ram);

    }
}
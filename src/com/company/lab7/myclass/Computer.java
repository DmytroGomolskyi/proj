package com.company.lab7.myclass;

public class Computer extends Device {
    int diagonal;

    @Override
    public void turnOn() {
        System.out.println("the computer is on");
    }
        public void turnOff(String model) {
            System.out.println("the " + model + " is turned off");
    }
}

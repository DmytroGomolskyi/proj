package com.company.lab7.myclass;

import java.util.Objects;

public class Device {
    private String name;
    private int ElectroConsumption;
    public int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return ElectroConsumption == device.ElectroConsumption &&
                Objects.equals(name, device.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ElectroConsumption);
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", ElectroConsumption=" + ElectroConsumption +
                '}';
    }
    public void turnOn(){
        System.out.println("the device is on");
    }
    public void turnOff(){
        System.out.println("the device is turned off");
    }
}

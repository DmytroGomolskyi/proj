package com.company.lab10;

public class Car {

    private String name;
    private int maxSpeed;

    public String getName(){
        return name;
    }

    public void setName(String a){
        name = a;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }

        public Car(String n,int s){
            name=n;
            maxSpeed=s;

        }

    }


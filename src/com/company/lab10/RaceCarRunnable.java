package com.company.lab10;

import java.util.concurrent.ThreadLocalRandom;

public class RaceCarRunnable  extends Car implements Runnable{
    private int passed;
    private int distance;
    private boolean isFinish;

    public int getPassed(){
        return passed;
    }
    public int getDistance(){
        return distance;
    }
    public RaceCarRunnable(String n, int s,int d) {
        super(n, s);
        distance=d;
    }
    public double getRandomSpeed(){
        return ThreadLocalRandom.current().nextInt(getMaxSpeed()/2, getMaxSpeed());
       // return getMaxSpeed()/2+(Math.random()*getMaxSpeed()/2);
    }

    public static void main(String[] args) {
       RaceCarRunnable raceCar=new RaceCarRunnable("Mers",250,200);
      // System.out.println(raceCar.getName()+"=>speed :"+getRandomSpeed()+"; progress :"+getPassed()+"/"+getDistance());
      //  raceCar.getPassed();
        Thread car = new Thread(raceCar);
        car.start();

    }


    @Override
    public void run() {
        while (!isFinish)
        {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double carSpeed=getRandomSpeed();
        passed+=carSpeed*1000/3600;
        if (passed>=distance){
            isFinish=true;
        }
        System.out.println(getName()+"=>speed :"+getRandomSpeed()+"; progress :"+passed+"/"+getDistance());

    }
    }



}

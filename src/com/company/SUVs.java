package com.company;

public class SUVs extends Car {

    private String powertrain;

    public SUVs(){
    }

    public SUVs(String brand,String model, String color, int year, String lisense, String vinNumber, boolean isRunning,InsideColor insideColor, int mileage){
    super(brand, model, color, year, lisense, vinNumber, isRunning, insideColor, mileage);
        this.brand=brand;
        this.vinNumber=vinNumber;
        this.model=model;
        this.color=color;
        this.year=year;
        this.lisense=lisense;
        this.isRunning=isRunning;
        this.Insidecolor = insideColor;
        this.mileage = mileage;
    }

    public void move(){
        System.out.println("I am SUVs and I drive off-road!");
    }

    public void stop(){
        System.out.println("I am SUVs and I fast stopped");
    }

    public void headlightsOn(){
        System.out.println("The head lights on!");
    }

    public void setPowertrain(String powertrain){this.powertrain=powertrain;}

    public String getPowertrain(){return powertrain;}

    public void setMileage(int mileage){this.mileage=mileage;}

    public int getMileage(){return mileage;}



}

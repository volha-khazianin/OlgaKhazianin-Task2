package com.company;

public class Sedan extends Car{

    private int numberOfSeats ;

    public Sedan(){
    }

    public Sedan(String brand,String model, String color, int year, String lisense, String vinNumber, boolean isRunning,InsideColor insideColor,int mileage){
        super(brand, model, color, year, lisense, vinNumber, isRunning, insideColor, mileage);
        this.brand=brand;
        this.vinNumber=vinNumber;
        this.model=model;
        this.color=color;
        this.year=year;
        this.lisense=lisense;
        this.isRunning=isRunning;
        this.Insidecolor = insideColor;
        this.mileage=mileage;

    }

    public void move(){
        System.out.println("I am Sedan and I'm move!");
    }

    public void move(int distance){
        mileage=mileage+distance;
        System.out.println(mileage);
    }


    public void stop(){
        System.out.println("I am Sedan and I stopped");
    }

    public void boardingPassenger(){
        System.out.println("All passengers got into the car!");
    }

    public void setNumberOfSeats(int numberOfSeats){this.numberOfSeats=numberOfSeats;}

    public int getNumberOfSeats (){return numberOfSeats;}

    public void setMileage(int mileage){this.mileage=mileage;}

    public int getMileage(){return mileage;}
}

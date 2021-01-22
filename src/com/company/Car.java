package com.company;

import javafx.beans.binding.StringBinding;

import java.util.Objects;

public class Car implements Movable {

    protected String brand;
    protected String model;
    protected String color;
    protected int year;
    protected String lisense;
    protected String vinNumber;
    protected boolean isRunning;
    protected InsideColor Insidecolor;
    protected int mileage;

    public Car(){
    }

    public Car(String brand,String model, String color, int year, String lisense, String vinNumber, boolean isRunning,InsideColor insideColor, int mileage){
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

  @Override

    public String toString(){
          StringBuilder stringBuilder = new StringBuilder("Car: ");
          stringBuilder.append("mileage "+mileage+", ");
          stringBuilder.append("brand is "+brand+", ");
          stringBuilder.append("model is " + model+", ");
          stringBuilder.append("color is " +color+", ");
          stringBuilder.append("year is "+year+", " );
          stringBuilder.append("lisense is "+lisense+", ");
          stringBuilder.append("vinNumber is "+vinNumber+", ");
          stringBuilder.append("isRunning is "+isRunning+", ");
          stringBuilder.append("Insidecolor is "+Insidecolor+"!");
          stringBuilder.append("mileage "+mileage+", ");
          return stringBuilder.toString();
  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && isRunning == car.isRunning && mileage == car.mileage && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(lisense, car.lisense) && Objects.equals(vinNumber, car.vinNumber) && Insidecolor == car.Insidecolor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, year, lisense, vinNumber, isRunning, Insidecolor, mileage);
    }

    public void move(){
        System.out.println("I can move!");
    }

    protected void stop(){
        System.out.println("The car stopped!");
    }

    public String getBrand(){ return brand; }

    public void setBrand(String brand){ this.brand=brand; }

    public String getModel (){return model; }

    public void  setModel(String model){this.model=model; }

    public int getYear(){return year; }

    public void setYear(int year){this.year=year;}

    public String getLisense(){return lisense; }

    public void  setLisense(String lisense){this.lisense=lisense;}

    public String getColor(){return color; }

    public void  setColor(String color){this.color=color; }

    public String getVinNumber(){return vinNumber;}

    public void setVinNumber(String vinNumber){this.vinNumber=vinNumber;}

    public void isRunning(boolean isRunning){this.isRunning=isRunning; }

}

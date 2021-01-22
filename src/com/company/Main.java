package com.company;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Mitsubishi", "Eclipse Cross", "white", 2020, "12FGT67", "111111111111", true, InsideColor.GREY, 10000);
        System.out.println(myCar.toString());
        myCar.move();
        myCar.stop();

        Sedan sedan1 = new Sedan("Hyundai","Elantra","Grey", 2020, "XZ11XZ22", "13WDS9D99929", true, InsideColor.BLACK, 1000);
        System.out.println(sedan1.toString());
        sedan1.move();
        sedan1.stop();
        sedan1.boardingPassenger();
        sedan1.move(15);

        SUVs suvs1 = new SUVs("Jeep", "Patrion", "Black",2015,"SD556FD", "fekf30985tjg9292", true,InsideColor.WHITE, 10);
        System.out.println(suvs1.toString());
        suvs1.move();
        suvs1.stop();
        suvs1.headlightsOn();

        Movable passengerPlane = new Airplane();
        passengerPlane.move();

        Airplane cargoAirplane = new Airplane();
        cargoAirplane.move();
        cargoAirplane.fly();



    }
}

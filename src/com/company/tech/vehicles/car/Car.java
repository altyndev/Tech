package com.company.tech.vehicles.car;

import com.company.tech.vehicles.Vehicles;

import java.time.LocalDate;

public class Car extends Vehicles {
    private String bodyType;
    private String gearboxType;

    public Car() {

    }

    public Car(String nameCompony, String nameModel, LocalDate dateOfManufacturer,
               String manufacturerCountry, short horsePower, String enginesType,
               String bodyType, String gearboxType) {
        super(nameCompony, nameModel, dateOfManufacturer, manufacturerCountry, horsePower, enginesType);
        this.bodyType = bodyType;
        this.gearboxType = gearboxType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    @Override
    public void of() {
        System.out.println(getNameModel() + " заглушить");
    }

    @Override
    public void on() {
        System.out.println(getNameModel() + " заводить");
    }

    @Override
    public String toString() {
        return "\t\tМашина" +
                super.toString() +
                "\nТип кузова " + bodyType +
                "\nТип коробки передач" + gearboxType;
    }
}

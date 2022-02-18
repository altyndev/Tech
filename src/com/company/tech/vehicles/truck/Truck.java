package com.company.tech.vehicles.truck;

import com.company.tech.vehicles.Vehicles;

import java.time.LocalDate;

public class Truck extends Vehicles {
    private String typesOfTractor;
    private short weight;

    public Truck() {

    }

    public Truck(String nameCompony, String nameModel, LocalDate dateOfManufacturer,
                 String manufacturerCountry, short horsePower, String enginesType,
                 String typesOfTractor, short weight) {
        super(nameCompony, nameModel, dateOfManufacturer, manufacturerCountry, horsePower, enginesType);
        this.typesOfTractor = typesOfTractor;
        this.weight = weight;
    }

    public String getTypesOfTractor() {
        return typesOfTractor;
    }

    public void setTypesOfTractor(String typesOfTractor) {
        this.typesOfTractor = typesOfTractor;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
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
        return "\t\tТроктор" +
                super.toString() +
                "\nВид трактора " + typesOfTractor +
                "\nМасса " + weight;
    }
}

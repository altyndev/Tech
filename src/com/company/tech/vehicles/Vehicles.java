package com.company.tech.vehicles;

import com.company.tech.Tech;

import java.time.LocalDate;

public abstract class Vehicles extends Tech {
    private short horsePower;
    private String enginesType;

    public Vehicles() {

    }

    public Vehicles(String nameCompony, String nameModel, LocalDate dateOfManufacturer,
                    String manufacturerCountry, short horsePower, String enginesType) {
        super(nameCompony, nameModel, dateOfManufacturer, manufacturerCountry);
        this.horsePower = horsePower;
        this.enginesType = enginesType;
    }

    public short getHorsPower() {
        return horsePower;
    }

    public void setHorsPower(short horsPower) {
        this.horsePower = horsPower;
    }

    public String getEnginesType() {
        return enginesType;
    }

    public void setEnginesType(String enginesType) {
        this.enginesType = enginesType;
    }

    @Override
    public String toString() {
        return "\t\tТранспорт\n" +
                super.toString() +
                horsePower + " лошадиных сил" +
                "\nТип двигатель" + enginesType;
    }
}


package com.company.tech.military.equipment;

import com.company.tech.Tech;

import java.time.LocalDate;

public abstract class MilitaryEquipment extends Tech {
    private String country;
    private byte rateOfFire;

    public MilitaryEquipment() {

    }

    public MilitaryEquipment(String nameCompony, String nameModel, LocalDate dateOfManufacturer,
                             String manufacturerCountry, String country, byte rateOfFire) {
        super(nameCompony, nameModel, dateOfManufacturer, manufacturerCountry);
        this.country = country;
        this.rateOfFire = rateOfFire;
    }

    public MilitaryEquipment(String country, byte rateOfFire) {
        this.country = country;
        this.rateOfFire = rateOfFire;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public byte getRateOfFire() {
        return rateOfFire;
    }

    public void setRateOfFire(byte rateOfFire) {
        this.rateOfFire = rateOfFire;
    }

    @Override
    public String toString() {
        return "\t\tВоенная техника\n" +
                super.toString() +
                country + "покупает военную технику\n"  +
                 rateOfFire +" пуля в минуту\n";
    }
}

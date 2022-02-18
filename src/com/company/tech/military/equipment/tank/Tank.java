package com.company.tech.military.equipment.tank;

import com.company.tech.military.equipment.MilitaryEquipment;

import java.time.LocalDate;

public class Tank extends MilitaryEquipment {
    private String tankType;
    private byte accommodation;

    public Tank() {

    }

    public Tank(String nameCompony, String nameModel, LocalDate dateOfManufacturer,
                String manufacturerCountry, String country, byte rateOfFire, String tankType, byte accommodation) {
        super(nameCompony, nameModel, dateOfManufacturer, manufacturerCountry, country, rateOfFire);
        this.tankType = tankType;
        this.accommodation = accommodation;
    }

    public String getTankType() {
        return tankType;
    }

    public void setTankType(String tankType) {
        this.tankType = tankType;
    }

    public byte getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(byte accommodation) {
        this.accommodation = accommodation;
    }

    @Override
    public void of() {
        System.out.println(getNameModel() + " не открывать огонь");
    }

    @Override
    public void on() {
        System.out.println(getNameModel() + " открыть огонь");
    }

    @Override
    public String toString() {
        return "\t\tТанк" +
                super.toString() +
                "\nТип танка" + tankType + "\n" +
                accommodation + " человек помещается";
    }
}

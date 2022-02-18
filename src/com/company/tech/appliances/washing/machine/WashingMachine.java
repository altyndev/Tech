package com.company.tech.appliances.washing.machine;

import com.company.tech.appliances.Appliances;

import java.time.LocalDate;

public class WashingMachine extends Appliances {
    private short revolutionPerMinute;
    private byte loadingVolume;

    public WashingMachine() {

    }

    public WashingMachine(String nameCompony, String nameModel, LocalDate dateOfManufacturer,
                          String manufacturerCountry, byte guarantee, short currentConsumption,
                          short revolutionPerMinute, byte loadingVolume) {
        super(nameCompony, nameModel, dateOfManufacturer, manufacturerCountry, guarantee, currentConsumption);
        this.revolutionPerMinute = revolutionPerMinute;
        this.loadingVolume = loadingVolume;
    }

    public short getRevolutionPerMinute() {
        return revolutionPerMinute;
    }

    public void setRevolutionPerMinute(short revolutionPerMinute) {
        this.revolutionPerMinute = revolutionPerMinute;
    }

    public byte getLoadingVolume() {
        return loadingVolume;
    }

    public void setLoadingVolume(byte loadingVolume) {
        this.loadingVolume = loadingVolume;
    }

    @Override
    public void of() {
        System.out.println(getNameModel() + "Отключен");
    }

    @Override
    public void on() {
        System.out.println(getNameModel() + " Включен");
    }

    @Override
    public String toString() {
        return "\t\tСтиральная машина\n" +
                super.toString() +
                revolutionPerMinute + " оборот в минуту" +
                "\nОбьем загрузки до " + loadingVolume + "кг";
    }
}

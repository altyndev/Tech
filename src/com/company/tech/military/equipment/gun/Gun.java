package com.company.tech.military.equipment.gun;

import com.company.tech.military.equipment.MilitaryEquipment;

import java.time.LocalDate;

public class Gun extends MilitaryEquipment {
    private String weaponType;
    private String firearms;

    public Gun() {

    }


    public Gun(String nameCompony, String nameModel, LocalDate dateOfManufacturer,
               String manufacturerCountry, String country, byte rateOfFire,
               String weaponType, String firearms) {
        super(nameCompony, nameModel, dateOfManufacturer, manufacturerCountry, country, rateOfFire);
        this.weaponType = weaponType;
        this.firearms = firearms;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getFirearms() {
        return firearms;
    }

    public void setFirearms(String firearms) {
        this.firearms = firearms;
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
        return "\t\tПистолет" +
                super.toString() +
                "\nТип пистолета оружия " + weaponType +
                "\nВид пистолета " + firearms;
    }
}

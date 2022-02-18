package com.company.tech.appliances.fridge;

import com.company.tech.appliances.Appliances;

import java.time.LocalDate;

public class Fridge extends Appliances {

    private String typeFridge;
    private byte degree;

    public Fridge() {

    }

    public Fridge(String nameCompony, String nameModel, LocalDate dateOfManufacturer,
                  String manufacturerCountry, byte guarantee, short currentConsumption,
                  String typeFridge, byte degree) {
        super(nameCompony, nameModel, dateOfManufacturer, manufacturerCountry, guarantee, currentConsumption);
        this.typeFridge = typeFridge;
        this.degree = degree;
    }

    public String getTypeFridge() {
        return typeFridge;
    }

    public void setTypeFridge(String typeFridge) {
        this.typeFridge = typeFridge;
    }

    public byte getDegree() {
        return degree;
    }

    public void setDegree(byte degree) {
        this.degree = degree;
    }

    @Override
    public void of() {
        System.out.println(getNameModel() + " Отключен");
    }

    @Override
    public void on() {
        System.out.println(getNameModel() + " Включен");
    }

    @Override
    public String toString() {
        return "\t\tХолодильник" +
                super.toString() +
                "\nТип холодилника: " + typeFridge +
                "\nТемператера до +" + degree + "градус цельсия";
    }
}

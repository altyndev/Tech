package com.company.tech.appliances;

import com.company.tech.Tech;

import java.time.LocalDate;

public abstract class Appliances extends Tech {
    private byte guarantee;
    private short currentConsumption;

    public Appliances(String nameCompony, String nameModel, LocalDate dateOfManufacturer,
                      String manufacturerCountry, byte guarantee, short currentConsumption) {
        super(nameCompony, nameModel, dateOfManufacturer, manufacturerCountry);
        this.guarantee = guarantee;
        this.currentConsumption = currentConsumption;
    }

    public Appliances() {
    }

    public byte getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(byte guarantee) {
        this.guarantee = guarantee;
    }

    public short getCurrentConsumption() {
        return currentConsumption;
    }

    public void setCurrentConsumption(short currentConsumption) {
        this.currentConsumption = currentConsumption;
    }

    @Override
    public String toString() {
        return "\t\tБытовая техника" +
                super.toString() +
                "\nГарантия: " + guarantee +
                " лет\nПотребление электроэнергии: " + currentConsumption + "кВт.";
    }
}

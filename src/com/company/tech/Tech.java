package com.company.tech;

import java.time.LocalDate;

public abstract class Tech {
    private String nameCompony;
    private String nameModel;
    private LocalDate dateOfManufacturer;
    private String manufacturerCountry;

    public Tech() {
    }

    public Tech(String nameCompony, String nameModel, LocalDate dateOfManufacturer, String manufacturerCountry) {
        this.nameCompony = nameCompony;
        this.nameModel = nameModel;
        this.dateOfManufacturer = dateOfManufacturer;
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getNameCompony() {
        return nameCompony;
    }

    public void setNameCompony(String nameCompony) {
        this.nameCompony = nameCompony;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public LocalDate getDateOfManufacturer() {
        return dateOfManufacturer;
    }

    public void setDateOfManufacturer(LocalDate dateOfManufacturer) {
        this.dateOfManufacturer = dateOfManufacturer;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

     public abstract void of();

    public abstract void on();

    @Override
    public String toString() {
        return "\nНазвание компании: " + nameCompony +
                "\nМодел: " + nameModel +
                "\nДата произвотства: " + dateOfManufacturer +
                "\nСтрана производитель: " + manufacturerCountry;
    }
}

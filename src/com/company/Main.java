package com.company;

import com.company.tech.Tech;
import com.company.tech.appliances.Appliances;
import com.company.tech.appliances.fridge.Fridge;
import com.company.tech.appliances.washing.machine.WashingMachine;
import com.company.tech.military.equipment.MilitaryEquipment;
import com.company.tech.military.equipment.gun.Gun;
import com.company.tech.military.equipment.tank.Tank;
import com.company.tech.vehicles.Vehicles;
import com.company.tech.vehicles.car.Car;
import com.company.tech.vehicles.truck.Truck;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Tech fridge = new Fridge("Beko", "HarvestFresh B5RCNK403ZW",
                LocalDate.of(2020, 8, 12), "Россия", (byte) 6,
                (short) 291, "Однокамерный", (byte) 7);

        Appliances fridge1 = new Fridge("SAMSUNG", "RB37K63412C",
                LocalDate.of(2019, 4, 26), "Польша", (byte) 5,
                (short) 320, "Двухкамерный", (byte) 8);

        Fridge fridge2 = new Fridge("Midea", "MRC518SFNGW",
                LocalDate.of(2019, 3, 2), "Китай",
                (byte) 5, (short) 322, "Трехкамерный", (byte) 9);

        Tech washingMachine = new WashingMachine("Indesit", "IWUB 4105 (CIS)",
                LocalDate.of(2021, 3, 7), "Польша", (byte) 8,
                (short) 242, (short) 1000, (byte) 6);

        Appliances washingMachine1 = new WashingMachine("Bosch", "WLR245H3OE",
                LocalDate.of(2021, 5, 3), "Германия", (byte) 10,
                (short) 380, (short) 1200, (byte) 7);

        WashingMachine washingMachine2 = new WashingMachine("LG", "F2M5HS6S",
                LocalDate.of(2020, 12, 20), "Южная Корея",
                (byte) 8, (short) 330, (short) 800, (byte) 3);

        Tech gun = new Gun("Beretta", "92FS",
                LocalDate.of(1916, 7, 24), "Италия",
                "Кыргызстын", (byte) 15, "Гражданская", "Огнестрельная");

        MilitaryEquipment gun1 = new Gun("Sarsilmaz", "K2",
                LocalDate.of(2002, 4, 3), "Турция",
                "Кыргызстан", (byte) 32, "Военная", "Огнестрельная");

        Gun gun2 = new Gun("Grisan", "Yavuz 16",
                LocalDate.of(2009, 4, 8), "Турция",
                "Кыргызстан", (byte) 28, "Военная", "Огнестрельная");

        Tech tank = new Tank("Henschel-Werke", "Tiger I",
                LocalDate.of(1942, 8, 26), "Германия",
                "Кыргызстан", (byte) 3, "Разведывательный танк", (byte) 3);

        MilitaryEquipment tank1 = new Tank("Cadillac", "M24 Cheffe",
                LocalDate.of(1945, 9, 24), "США",
                "Кыргызстан", (byte) 4, "Общевойсковой танк", (byte) 5);

        Tank tank2 = new Tank("Skoda-Works", "Hetzer",
                LocalDate.of(1944, 3, 14), "Чехия",
                "Кыргызстан", (byte) 3, "Оперативный танк", (byte) 4);

        Tech car = new Car("Honda", "Fit",
                LocalDate.of(2003, 9, 28), "Япония", (short) 250,
                "Бензиновый", "Кембект", "Автомат");

        Vehicles car1 = new Car("AUDI", "A6",
                LocalDate.of(2008, 12, 23), "Германия", (short) 240,
                "Бензиновый", "Сидан", "Механик");

        Car car2 = new Car("Mercedes-Benz", "Sprinter",
                LocalDate.of(2003, 11, 11), "Германия", (short) 350,
                "Дизельный", "Фургон", "Типтроник");

        Tech truck = new Truck("Belarus", "БЕЛАРУС 321",
                LocalDate.of(2021, 1, 29), "Беларусь",
                (short) 450, "Дизельный", "Сельскохозайственное", (short) 1450);

        Vehicles truck1 = new Truck("Belarus", "БЕЛАРУС 320П04",
                LocalDate.of(2020, 9, 1), "Беларусь",
                (short) 490, "Дизельный", "Сельскохозайственное", (short) 1750);

        Truck truck2 = new Truck("Belarus", "л-82.2",
                LocalDate.of(2009, 7, 30), "Беларусь", (short) 450,
                "Дизельный", "Лесохозяйственный", (short) 1850);

        Tech[] technics = {fridge, fridge1, fridge2, washingMachine, washingMachine1, washingMachine2,
                gun, gun1, gun2, tank, tank1, tank2, car, car1, car2, truck, truck1, truck2};
        for (Tech tech : technics) {
            System.out.println(tech);
            tech.of();
            tech.on();
            System.out.println("___________________________________________________________________________");
        }
    }
}

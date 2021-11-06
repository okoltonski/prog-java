package com.company;

import com.animals.Animal;
import com.devices.Car;

public class Main {

    public static void main(String[] args) {

        //Audi
        Car audi = new Car("audi", "A5", 2016);
        audi.color = "czarne";
        audi.value = 150000.0;

        //BMW
        Car bmw = new Car("bmw", "X5", 2016);
        bmw.color = "czerwone";
        bmw.value = 100000.0;

        //Human1
        Human me = new Human();
        me.firstName = "Oskar";
        me.lastName = "Kołtoński";
        me.age = 21;

        //Human2
        Human grzesiek = new Human();
        grzesiek.firstName = "Grzegorz";
        grzesiek.lastName = "Brzęczyszczykiewicz";
        grzesiek.age = 34;


        //Dog
        Animal dog = new Animal("pies", "Fafik", 7, 12, true);

        //Cat
        Animal cat = new Animal("kot", "Stefan", 5, 3, true);


        System.out.println();

        //Dog introduction
        System.out.println("nazwa " + dog.name);
        System.out.println("gatunek " + dog.species);
        System.out.println("waga " + dog.weight);
        System.out.println("wiek " + dog.age);
        System.out.print("żyje? ");
        if (dog.alive) {
            System.out.println("tak");
        }

        System.out.println();

        //Cat introduction
        System.out.println("nazwa " + cat.name);
        System.out.println("gatunek " + cat.species);
        System.out.println("waga " + cat.weight);
        System.out.println("wiek " + cat.age);
        System.out.print("żyje? ");
        if (dog.alive) {
            System.out.println("tak");
        }
        System.out.println();

        //Human1 introduction
        System.out.println("Jestem " + me.firstName + " " + me.lastName + " i mam " + me.age + " lat.");
        System.out.println("Zarabiam " + me.getSalary() + "zł.");
        if (me.getCar() != null) {
            System.out.println("Mam auto marki " + me.getCar().producer + " " + me.getCar().model + " z " + me.getCar().yearOfProduction + " roku.");
            System.out.println("Moje auto jest " + me.getCar().color);
        } else {
            System.out.println("Brak samochodu");
        }
        //Human1 salary
        me.setSalary(1000);
        System.out.println();

        //Human1 car
        me.setCar(audi);

        System.out.println();
        System.out.println();

        //Human2 introduction
        System.out.println("Jestem " + grzesiek.firstName + " " + grzesiek.lastName + " i mam " + grzesiek.age + " lat.");
        System.out.println("Zarabiam " + grzesiek.getSalary() + "zł.");
        if (me.getCar() != null) {
            System.out.println("Mam auto marki " + grzesiek.getCar().producer + " " + grzesiek.getCar().model + " z " + grzesiek.getCar().yearOfProduction + " roku.");
            System.out.println("Moje auto jest " + grzesiek.getCar().color);
        } else {
            System.out.println("Brak samochodu");
        }
        //Human2 salary
        grzesiek.setSalary(1000);
        System.out.println();

        //Human2 car
        grzesiek.setCar(bmw);

        System.out.println();
        System.out.println();

        //Feeding & walking
        dog.feed();
        dog.takeForAWalk();

        System.out.println();

        //Setting salary
        grzesiek.setSalary(300000);

        System.out.println();

        //Task 3/4
        System.out.println("Historia pobranych informacji o wynagrodzeniu i jej wartości");
        grzesiek.getHistory();

        System.out.println();

        //Task 5
        grzesiek.getCar();

        System.out.println();

        //Task 6
        System.out.println(audi.equals(bmw));
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(audi.hashCode());

        //WASHING MACHINE
        //Device washingMachine = new Device("Bosh", "ABC", 2021);

        //Sprzedaż audi
        audi.sale(me, grzesiek, 20000.0);
    }
}
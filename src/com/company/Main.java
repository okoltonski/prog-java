package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //Audi
        Car audi = new Car();
        audi.color = "czarne";
        audi.model = "A5";
        audi.producer = "audi";
        audi.yearOfProduction = 2016;
        audi.value = 150000.0;

        //BMW
        Car bmw = new Car();
        bmw.color = "czerwone";
        bmw.model = "X5";
        bmw.producer = "BMW";
        bmw.yearOfProduction = 2020;
        bmw.value = 100000.0;

        //Human1
        Human me = new Human();
        me.firstName = "Oskar";
        me.lastName = "Kołtoński";
        me.age = 21;
        me.setSalary(1000);
        me.setCar(audi);

        //Human2
        Human grzesiek = new Human();
        grzesiek.firstName = "Grzegorz";
        grzesiek.lastName = "Brzęczyszczykiewicz";
        grzesiek.age = 34;
        grzesiek.setSalary(1000);
        grzesiek.setCar(bmw);

        //Dog
        Animal dog = new Animal("pies");
        dog.name = "Fafik";
        dog.age = 7;

        //Cat
        Animal cat = new Animal("kot");
        cat.name = "Stefan";
        cat.age = 4;

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

        System.out.println("");
        System.out.println("");

        //Feeding & walking
        dog.feed();
        dog.takeForAWalk();

        //Setting salary
        grzesiek.setSalary(3000);

        //Task 3/4
        System.out.println("Historia pobranych informacji o wynagrodzeniu i jej wartości");
        grzesiek.getHistory();

        //Task 5
        grzesiek.getCar();
    }
}
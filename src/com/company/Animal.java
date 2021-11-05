package com.company;

public class Animal {
    String species;
    String name;
    Integer weight;
    Integer age;
    Boolean alive;
    String petIsDeadMessage = "Zwierzak jest martwy!";

    Animal(String species) {
        this.species = species;
        this.alive = true;
        if (this.species == "pies") {
            this.weight = 12;
        } else if (this.species == "kot") {
            this.weight = 3;
        } else {
            this.weight = 1;
        }
    }

    void feed() {
        if (!this.alive) {
            System.out.println(petIsDeadMessage);
            return;
        }
        this.weight = this.weight + 1;
        System.out.println("Nakarmiono zwierzaka (+1), waga: " + this.weight);
    }

    void takeForAWalk() {
        if (this.weight <= 0 || !this.alive) {
            System.out.println("Nie możesz wyprowadzić martwego zwięrzecia!");
            return;
        }
        if (this.weight - 1 <= 0) {
            System.out.println("Twój zwierzak umarł na spacerze!");
            this.alive = false;
            this.weight = this.weight - 1;
            return;
        }
        this.weight = this.weight - 1;
        System.out.println("Wyprowadzasz zwierzę " + this.name + " na spacer.");
    }
}

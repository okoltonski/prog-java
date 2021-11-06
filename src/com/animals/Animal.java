//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.animals;

public class Animal {
    public String species;
    public String name;
    public Integer weight;
    public Integer age;
    public Boolean alive;
    public String petIsDeadMessage = "Zwierzak jest martwy!";

    public Animal(String species, String name, Integer weight, Integer age, Boolean alive) {
        this.species = species;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.alive = alive;
        this.petIsDeadMessage = petIsDeadMessage;

        this.alive = true;
        if (this.species == "pies") {
            this.weight = 12;
        } else if (this.species == "kot") {
            this.weight = 3;
        } else {
            this.weight = 1;
        }
    }


    //FEED
    public void feed() {
        if (!this.alive) {
            System.out.println(this.petIsDeadMessage);
        } else {
            this.weight = this.weight + 1;
            System.out.println("Nakarmiono zwierzaka (+1), waga: " + this.weight);
        }
    }


    //TAKE FOR A WALK
    public void takeForAWalk() {
        if (this.weight > 0 && this.alive) {
            if (this.weight - 1 <= 0) {
                System.out.println("Twój zwierzak umarł na spacerze!");
                this.alive = false;
                this.weight = this.weight - 1;
            } else {
                this.weight = this.weight - 1;
                System.out.println("Wyprowadzasz zwierzę " + this.name + " na spacer.");
            }
        } else {
            System.out.println("Nie możesz wyprowadzić martwego zwięrzecia!");
        }
    }
}

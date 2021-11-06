//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.devices;

import com.Saleable;
import com.company.Human;

import java.awt.font.TextHitInfo;

public class Car extends Device implements Saleable {
    public String color;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręć kluczyk");
    }

    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("Sorry nie stać cię!");
        } else if (seller.getCar() == null || !seller.getCar().equals((this))) {
            System.out.println("Sprzedający nie ma konkretnego samochodu.");
        } else {
            seller.cash += price;
            buyer.cash -= price;

            seller.brand = null;
            buyer.brand = this;
            System.out.println("Transakcja sie udala.");
        }
    }
}

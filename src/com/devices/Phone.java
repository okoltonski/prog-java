//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.devices;

import com.Saleable;
import com.company.Human;

public class Phone extends Device implements Saleable {
    public Integer screenSize;
    public String os;
    public Integer yearOfProduction;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Tapnij dwa razy na ekran");
    }

    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Sprzedane!");
    }
}

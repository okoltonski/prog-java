package com.devices;

public abstract class Device {
    final public String model;
    public Integer yearOfProduction;
    final public String producer;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

}

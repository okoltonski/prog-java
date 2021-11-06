package com;

import com.company.Human;

public interface Saleable {
    public default void sale(Human seller, Human buyer, Double price) {

    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import com.devices.Car;
import com.devices.Phone;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    public double salary;
    public Car brand;
    List<String> history = new ArrayList();
    public double cash;
    public Phone phone;

    public Human() {
    }

    public void getHistory() {
        Iterator var1 = this.history.iterator();

        while (var1.hasNext()) {
            String oneItem = (String) var1.next();
            System.out.println(oneItem);
        }

    }

    public double getSalary() {
        String date = Calendar.getInstance().getTime().toString();
        Double salary = this.salary;
        this.history.add(date + " " + salary);
        return this.salary;
    }

    public void setSalary(double salary) {
        if (!(salary >= 0.0)) {
            System.out.println("Nowa ilość wynagrodzenia nie możesz być mniejsza niż 0!");
        } else {
            System.out.println("Od dzisiaj " + this.firstName + " zarabia " + salary);
            System.out.println("");
            System.out.println("Nowe wynagrodzenie zostało pomyślnie wysłane do systemu księgowego");
            System.out.println("Pani Hania zaprasza do odebrania aneksu do umowy");
            System.out.println("ZUS i US juz dowiedzieli się o zmianie wypłaty, nie próbuj ich oszukiwać :)");
            this.salary = salary;
        }
    }

    public Car getCar() {
        return this.brand;
    }

    public void setCar(Car brand) {
        if (this.salary >= brand.value) {
            System.out.println("Udało się kupić samochód za gotówkę!");
            this.brand = brand;
        } else if (this.salary > brand.value / 12.0D) {
            System.out.println("Udało ci się kupić samochód na kredyt (no trudno)");
            this.brand = brand;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę nierobie! Nie stać cię na to auto!");
        }
    }
}

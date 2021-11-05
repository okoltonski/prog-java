package com.company;

import com.devices.Car;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private double salary;
    private Car brand;
    List<String> history = new ArrayList<String>();

    public Human() {
    }

    public void getHistory() {
        for (String oneItem : this.history) {
            System.out.println(oneItem);
        }
    }

    public double getSalary() {
        String date = (String) Calendar.getInstance().getTime().toString();
        Double salary = this.salary;
        history.add(date + " " + salary);

        return this.salary;
    }

    public void setSalary(double salary) {
        if (!(salary >= 0)) {
            System.out.println("Nowa ilość wynagrodzenia nie możesz być mniejsza niż 0!");
            return;
        }

        System.out.println("Od dzisiaj " + this.firstName + " zarabia " + salary);
        System.out.println("");
        System.out.println("Nowe wynagrodzenie zostało pomyślnie wysłane do systemu księgowego");
        System.out.println("Pani Hania zaprasza do odebrania aneksu do umowy");
        System.out.println("ZUS i US juz dowiedzieli się o zmianie wypłaty, nie próbuj ich oszukiwać :)");

        this.salary = salary;
    }

    public Car getCar(){
        return this.brand;
    }

    public void setCar(Car brand){
        if(this.salary>=brand.value){
            System.out.println("Udało się kupić samochód za gotówkę!");
            this.brand = brand;
            return;
        }
        else if(this.salary>(brand.value/12)){
            System.out.println("Udało ci się kupić samochód na kredyt (no trudno)");
            this.brand = brand;
            return;
        }
        else{
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę nierobie!");
            return;
        }
    }
}
package com.company.model;

public class Accountant extends Person {

    public Accountant(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

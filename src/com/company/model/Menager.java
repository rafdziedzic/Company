package com.company.model;

public class Menager extends Person {

    public Menager(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Menager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

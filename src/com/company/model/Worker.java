package com.company.model;

public class Worker extends Person {
    protected String menagerName;

    public Worker(String name, String surname, String menagerName) {
        super(name, surname);
        this.menagerName = menagerName;
    }

    public String getMenagerName() {
        return menagerName;
    }

    public void setMenagerName(String menagerName) {
        this.menagerName = menagerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        return menagerName != null ? menagerName.equals(worker.menagerName) : worker.menagerName == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (menagerName != null ? menagerName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Menager Name='" + menagerName + '\'' +
                '}';
    }
}

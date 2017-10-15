package com.company.dao;

import com.company.model.Accountant;
import com.company.model.Menager;
import com.company.model.Worker;

public interface Dao {
    void addWorker(Worker worker);

    void addAccountant(Accountant accountant);

    void addMenager(Menager menager);

    void searchByName(String name);

    boolean findMenagerByName(String name);
}

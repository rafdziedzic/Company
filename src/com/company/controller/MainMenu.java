package com.company.controller;

import com.company.daoImpl.DaoRepository;
import com.company.model.Accountant;
import com.company.model.Menager;
import com.company.model.Worker;

import java.util.Scanner;

public class MainMenu {

    static DaoRepository daoRepository = new DaoRepository();


    public static void run() {
        menu();
        Scanner scanner = new Scanner(System.in);
        int variable;
        do {
            variable = scanner.nextInt();
            switch (variable) {
                case 1:
                    addWorker();
                    menu();
                    break;
                case 2:
                    addAccountant();
                    menu();
                    break;
                case 3:
                    addMenager();
                    menu();
                    break;
                case 4:
                    showAll();
                    menu();
                    break;
                case 5:
                    searchByName();
                    menu();
                    break;
            }
        } while (!(variable == 6));
    }

    private static void showAll() {
        System.out.println("Workers : ");
        System.out.println(daoRepository.getListWorker().toString());
        System.out.println("Accountants : ");
        System.out.println(daoRepository.listAccountant.toString());
        System.out.println("Menagers : ");
        System.out.println(daoRepository.listMenager.toString());
    }


    private static void searchByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the manager a name");
        String name = scanner.next();
        daoRepository.searchByName(name);
    }

    private static void addMenager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Menager");
        String name;
        String surname;
        System.out.println("Give Name");
        name = scanner.nextLine();
        System.out.println("Give Surname");
        surname = scanner.nextLine();
        Menager menager = new Menager(name, surname);
        daoRepository.addMenager(menager);
    }

    private static void addAccountant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Worker");
        String name;
        String surname;
        System.out.println("Give Name");
        name = scanner.nextLine();
        System.out.println("Give Surname");
        surname = scanner.nextLine();
        Accountant accountant = new Accountant(name, surname);
        daoRepository.addAccountant(accountant);
    }

    private static void addWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Worker");
        String name;
        String surname;
        String menagerName;
        System.out.println("Give Name");
        name = scanner.nextLine();
        System.out.println("Give Surname");
        surname = scanner.nextLine();
        System.out.println("Give Menager Name");
        menagerName = scanner.nextLine();

        if (daoRepository.findMenagerByName(menagerName)) {
            Worker worker = new Worker(name, surname, menagerName);
            daoRepository.addWorker(worker);
        } else {
            System.out.println("There is no manager in the database, Add Menager");
        }
    }

    private static void menu() {
        System.out.println("Select what do you want to do ? ");
        System.out.println("1 - Add Worker");
        System.out.println("2 - Add Accountant");
        System.out.println("3 - Add Menager");
        System.out.println("4 - Show All employees");
        System.out.println("5 - List of employees of manager");
        System.out.println("6 - Close the program");
    }
}

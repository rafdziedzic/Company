package com.company;

import com.company.controller.MainMenu;

public class Main {

    /**
     * In our company we employ linear staff, accountants and card manager
     * Each managerial employee has a certain number of line workers subject to him.
     * We would like our system to allow:
     * List all company employees and,
     * Display all employees of each manager
     */

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.run();
    }
}

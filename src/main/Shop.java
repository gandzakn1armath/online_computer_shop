package main;

import database.LocalData;
import models.Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        main();
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        printSections();
        int section = scanner.nextInt();
        switch (section) {
            case 1:
                computers();
                break;
            case 2:
            case 3:
            default:
                main();


        }
    }

    public static void printSections() {
        System.out.println("Բարի գալուստ <<ՀԱՄԱԿԱՐԳԻՉՆԵՐԻ ԱՇԽԱՐՀ>>" + "\n" +
                "============   Բաժիններ  ============" + "\n" +
                "1. Համակարգիչներ" + "\n" +
                "2․ Զամբյուղ" + "\n" +
                "3. Հետադարձ կապ" + "\n" +
                " Ընտրեք բաժինը (Օր․՝ 1 + Enter)" + "\n" +
                "============   Բաժիններ  ============" + "\n");
    }

    public static void printComputerSections() {
        System.out.println(
                "============   Համակարգիչներ  ============" + "\n" +
                        "1. Asus" + "\n" +
                        "2․ Lenovo" + "\n" +
                        "3. Hp" + "\n" +
                        "4. Acer" + "\n" +
                        "5. Apple" + "\n" +
                        "6. Dell" + "\n" +
                        "============   Համակարգիչներ  ============" + "\n");
    }

    public static void computers() {
        Scanner scanner = new Scanner(System.in);
        printComputerSections();
        int section = scanner.nextInt();
        switch (section) {
            case 1 -> asus();
            case 2 -> lenovo();
            case 3 -> hp();
            case 4 -> acer();
            case 5 -> apple();
            case 6 -> dell();
        }
    }

    public static void asus() {
        ArrayList<Computer> asus = LocalData.getAsus();
        for (int i = 0; i < asus.size(); i++) {
            System.out.println(i + 1 + "." + asus.get(i).toString() + "\n");
        }
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > asus.size()) {
            System.out.println("Մուտքագրել մինչև " + asus.size() + "-ը\n");
            asus();
        } else {
            System.out.println(asus.get(number).printAll());
        }


    }

    public static void lenovo() {
        ArrayList<Computer> lenovo = LocalData.getLenovo();
        for (int i = 0; i < lenovo.size(); i++) {
            System.out.println(i + 1 + "." + lenovo.get(i).toString() + "\n");
        }
    }

    public static void hp() {
        ArrayList<Computer> hp = LocalData.getHp();
        for (int i = 0; i < hp.size(); i++) {
            System.out.println(i + 1 + "." + hp.get(i).toString() + "\n");
        }
    }

    public static void acer() {
        ArrayList<Computer> acer = LocalData.getAcer();
        for (int i = 0; i < acer.size(); i++) {
            System.out.println(i + 1 + "." + acer.get(i).toString() + "\n");
        }
    }

    public static void apple() {
        ArrayList<Computer> apple = LocalData.getApple();
        for (int i = 0; i < apple.size(); i++) {
            System.out.println(i + 1 + "." + apple.get(i).toString() + "\n");
        }
    }

    public static void dell() {
        ArrayList<Computer> dell = LocalData.getDell();
        for (int i = 0; i < dell.size(); i++) {
            System.out.println(i + 1 + "." + dell.get(i).toString() + "\n");
        }
    }


}




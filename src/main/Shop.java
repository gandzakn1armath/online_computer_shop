package main;

import database.LocalData;
import models.Computer;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSections();
        int section = scanner.nextInt();
        switch (section) {
            case 1:
                computers();
            case 2:
            case 3:
                break;

        }
    }

    public static void printSections() {
        System.out.println("Բարի գալուստ <<ՀԱՄԱԿԱՐԳԻՉՆԵՐԻ ԱՇԽԱՐՀ>>" + "\n" +
                "============   Բաժիններ  ============" + "\n" +
                "1. Համակարգիչներ" + "\n" +
                "2․ Զամբյուղ" + "\n" +
                "1. Հետադարձ կապ" + "\n" +
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
        for (Computer asus : LocalData.getAsus()) {
            System.out.println(asus.toString());
        }
    }

    public static void lenovo() {
        for (Computer lenovo : LocalData.getLenovo()) {
            System.out.println(lenovo.toString());
        }
    }

    public static void hp() {
        for (Computer hp : LocalData.getHp()) {
            System.out.println(hp.toString());
        }
    }

    public static void acer() {
        for (Computer acer : LocalData.getAcer()) {
            System.out.println(acer.toString());
        }
    }

    public static void apple() {
        for (Computer apple : LocalData.getApple()) {
            System.out.println(apple.toString());
        }
    }

    public static void dell() {
        for (Computer dell : LocalData.getDell()) {
            System.out.println(dell.toString());
        }
    }


}




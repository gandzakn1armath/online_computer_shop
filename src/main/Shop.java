package main;

import database.LocalData;
import models.Brand;
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

    public static void printTitle(String text){
        String title =  "============   " + text.toUpperCase() + "  ============";
        for (int i = 0; i < title.length(); i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println(title);
        for (int i = 0; i < title.length(); i++) {
            System.out.print("=");
        }
        System.out.println("");
    }

    public static void printSections() {
        System.out.println("Բարի գալուստ <<ՀԱՄԱԿԱՐԳԻՉՆԵՐԻ ԱՇԽԱՐՀ>>" + "\n" +
                "============   Բաժիններ  ============" + "\n" +
                "1. Համակարգիչներ" + "\n" +
                "2․ Զամբյուղ" + "\n" +
                "3. Հետադարձ կապ" + "\n" +
                " Ընտրեք բաժինը (Օր․՝ 1 + Enter)" + "\n" +
                "=====================================" + "\n");
    }

    public static void computers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============   Համակարգիչներ  ============");
        ArrayList<Brand> brands = LocalData.getBrandData();
        for (int i = 0; i < brands.size(); i++) {
            System.out.println((i + 1) + ". " + brands.get(i).getName());
        }
        System.out.println("==========================================");
        int section = scanner.nextInt();


        if (section > 0 && section <= brands.size()) {
            section = section - 1;
            getComputers(brands.get(section));

        } else {
            computers();
        }
    }



    public static void getComputers(Brand brand) {
        int count = 0;
        printTitle(brand.getName());
        ArrayList<Computer> comps = new ArrayList<>();
        ArrayList<Computer> computers = LocalData.getComputers();
        for (int i = 0; i < computers.size(); i++) {
            Computer computer = computers.get(i);
            if (computer.getBrand().equals(brand)) {
                comps.add(computer);
                count = count + 1;
                System.out.println(count + ". " + computer.toString());
            }
        }
    }
    public static void computerSection(){

    }
}




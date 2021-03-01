package main;

import database.LocalData;
import models.Brand;
import models.Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private static final ArrayList<Computer> carts = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            printSections();
            Scanner scanner = new Scanner(System.in);
            int section = scanner.nextInt();
            switch (section) {
                case 1:
                    computers();
                    break;
                case 2:
                    cart();
                    break;
                case 3:
                    Feedback();
                    break;
                default:

            }
        }
    }

    public static void cart() {
        while (true) {
            double price = 0;
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < carts.size(); i++) {
                System.out.println((i + 1) + ". " + carts.get(i));
                price = price + carts.get(i).getPrice();
            }
            System.out.println("" + "\n" +
                    "Ընդհանուր գումար - " + price + "\n" +
                    "Ընտրել համակարգիչը \n" + "\n" +
                    "0․ Հետ գնալ" + "\n");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else if (number > 0 && number <= carts.size()) {
                purchase(number);
            }
        }
    }

    public static void purchase(int number) {
        number = number - 1;
        while (true) {
            System.out.println(carts.get(number).printAll());
            Scanner scanner = new Scanner(System.in);
            System.out.println("" + "\n" +
                    "1. Ձևակերպել " + "\n" +
                    "2. Ջնջել զամբյուղից" + "\n" +
                    "0․ Հետ գնալ" + "\n");
            int section = scanner.nextInt();
            if (section == 0) {
                break;
            } else if (section == 1) {
                System.out.println("Գնված է \n");
                carts.remove(number);
                break;
            } else if (section == 2) {
                carts.remove(number);
                break;
            }
        }
    }


    public static void printTitle(String text) {
        String title = "============   " + text.toUpperCase() + "  ============";
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

    public static void PrintFeedBackText() {
        System.out.println("Բարի գալուստ <<ՀԱՄԱԿԱՐԳԻՉՆԵՐԻ ԱՇԽԱՐՀ>>" + "\n" +
                "============   Հետադարձ կապ  ============" + "\n" +
                "Հեռախոսահամար 077-543-059" + "\n" +
                "Էլ․հասցե spartak.virabyan@yandex.ru" + "\n" + "\n" +
                "0․ Հետ գնալ" + "\n" +
                " Ընտրեք բաժինը (Օր․՝ 1 + Enter)" + "\n" +
                "=====================================" + "\n");
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

    public static void printCartSections() {
        System.out.println("" + "\n" +
                "Ցանկանում ե՞ք գնել" + "\n" +
                "1. Ավելացնել Զամբյուղ" + "\n" +
                "0․ Հետ գնալ" + "\n");
    }

    public static void Feedback() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            PrintFeedBackText();
            int section = scanner.nextInt();
            if (section == 0) {
                break;
            }
        }
    }

    public static void computers() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("============   Համակարգիչներ  ============");
            ArrayList<Brand> brands = LocalData.getBrandData();
            for (int i = 0; i < brands.size(); i++) {
                System.out.println((i + 1) + ". " + brands.get(i).getName());
            }
            System.out.println("0. Հետ գնալ");
            System.out.println("==========================================");
            int section = scanner.nextInt();


            if (section > 0 && section <= brands.size()) {
                section = section - 1;
                getComputers(brands.get(section));

            } else if (section == 0) {
                break;
            }
        }
    }


    public static void getComputers(Brand brand) {
        while (true) {
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
            System.out.println("0. Հետ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            number = number - 1;
            for (int i = 0; i < comps.size(); i++) {
                if (number == i) {
                    System.out.println(comps.get(number).printAll());
                    addCompToCart(comps.get(number));
                } else if (number > comps.size()) {
                    System.out.println("Մուտքագրել մինչև " + comps.size() + " թիվը");
                }
            }
        }
    }

    public static void addCompToCart(Computer computer) {
        while (true) {
            printCartSections();
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == 1) {
                carts.add(computer);
                System.out.println(carts.toString());
                System.out.println("Ավելացված է");
                break;
            } else if (number == 0) {
                break;
            }
        }

    }


}






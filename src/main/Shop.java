package main;

import database.LocalData;
import models.Brand;
import models.Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private static final ArrayList<Computer> carts = new ArrayList<>();

    public static void main(String[] args) {
        printTitle("Welcome to Computers World");
        while (true) {
            printSections();
            Scanner scanner = new Scanner(System.in);
            int section = scanner.nextInt();
            if (section == 0)
                break;
            switch (section) {
                case 1:
                    search();
                    break;
                case 2:
                    computers();
                    break;
                case 3:
                    cart();
                    break;
                case 4:
                    feedback();
                    break;
                default:
            }
        }
    }

    public static void search() {
        printTitle("Search");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine().toLowerCase();
        int count = 0;
        ArrayList<Computer> computers = LocalData.getComputers();
        String brand = null;
        for (int i = 0; i < computers.size(); i++) {
            brand = computers.get(i).getBrand().getName().toLowerCase();
            if (brand.equals(search) || (brand.charAt(0) == search.charAt(0) &&
                    brand.charAt(1) == search.charAt(1))) {
                count = count + 1;
                System.out.println(count + ". " + computers.get(i));
            }
        }


    }


    public static void cart() {
        while (true) {
            if (carts.size() == 0) {
                System.out.println("Cart is empty \n");
                break;
            }
            printTitle("Cart");
            int price = 0;
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < carts.size(); i++) {
                System.out.println((i + 1) + ". " + carts.get(i));
                price = price + carts.get(i).getPrice();
            }
            System.out.println("" + "\n" +
                    "Total - " + price + "\n" +
                    "\nChoose computer (1 + Enter)" + "\n" +
                    "Enter the amount to buy them all (300000 + Enter)" + "\n" +
                    "0․ Back" + "\n==========================================");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else if (number > 0 && number <= carts.size()) {
                purchase(number);
            } else if (number == price) {
                System.out.println("=====  All computers is bought  =====\n");
                carts.clear();
                break;
            }
        }
    }

    public static void purchase(int number) {
        number = number - 1;
        while (true) {
            printTitle(carts.get(number).getBrand().getName() + " " + carts.get(number).getModel());
            System.out.println(carts.get(number).printAll());
            Scanner scanner = new Scanner(System.in);
            printPurchaseText();
            printBack();
            int section = scanner.nextInt();
            if (section == 0) {
                break;
            } else if (section == 1) {
                System.out.println(carts.get(number).getBrand().getName() + " " +
                        carts.get(number).getModel() + " is bought");
                carts.remove(number);
                break;
            } else if (section == 2) {
                System.out.println(carts.get(number).getBrand().getName() + " " +
                        carts.get(number).getModel() + " is deleted");
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
    public static void printPurchaseText(){
        System.out.println("" + "\n" +
                "1. Formulate " + "\n" +
                "2. Delete from cart");
    }
    public static void PrintFeedBackText() {
        printTitle("Feedback");
        System.out.println(
                "PhoneNumber 077-543-059" + "\n" +
                        "E-mail spartak.virabyan@yandex.ru");
    }

    public static void printSections() {
        printTitle("Sections");
        System.out.println("1. Search" + "\n" +
                "2. Computers" + "\n" +
                "3․ Cart" + "\n" +
                "4. Feedback" + "\n" +
                "0. Exit" + "\n" +
                "\nChoose section (1 + Enter)" + "\n" +
                "=====================================" + "\n");
    }

    public static void printCartSections() {
        System.out.println(
                "\nDo you want to buy it?" + "\n" +
                        "1. Add to cart");
    }
    public static void printBack(){
        System.out.println("\nChoose section (1 + Enter)" + "\n" +
                "0. Back" + "\n"
                + "==========================================");
    }

    public static void feedback() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            PrintFeedBackText();
            printBack();
            int section = scanner.nextInt();
            if (section == 0) {
                break;
            }
        }
    }

    public static void computers() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            printTitle("Computers");
            ArrayList<Brand> brands = LocalData.getBrandData();
            for (int i = 0; i < brands.size(); i++) {
                System.out.println((i + 1) + ". " + brands.get(i).getName());
            }
            printBack();
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
            printBack();
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            number = number - 1;
            for (int i = 0; i < comps.size(); i++) {
                if (number == i) {
                    printTitle(comps.get(number).getBrand().getName() + " " + comps.get(number).getModel());
                    System.out.println(comps.get(number).printAll());
                    addCompToCart(comps.get(number));
                } else if (number > comps.size()) {
                    System.out.println("Enter before " + comps.size());
                }
            }
        }
    }

    public static void addCompToCart(Computer computer) {
        while (true) {
            printCartSections();
            printBack();
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == 1) {
                carts.add(computer);
                System.out.println(carts.toString());
                System.out.println(computer.getBrand().getName() + " " + computer.getModel() + " is added to cart");
                break;
            } else if (number == 0) {
                break;
            }
        }

    }
}






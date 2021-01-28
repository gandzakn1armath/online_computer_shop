package main;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSections();
        int section = scanner.nextInt();
        switch (section){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;

        }
    }
    public static void printSections(){
        System.out.println("Բարի գալուստ <<ՀԱՄԱԿԱՐԳԻՉՆԵՐԻ ԱՇԽԱՐՀ>>"+"\n"+
                "============   Բաժիններ  ============"+"\n"+
                "1. Համակարգիչներ"+"\n"+
                "2․ Զամբյուղ"+"\n"+
                "1. Հետադարձ կապ"+"\n"+
                " Ընտրեք բաժինը (Օր․՝ 1 + Enter)"+"\n");
    }
}

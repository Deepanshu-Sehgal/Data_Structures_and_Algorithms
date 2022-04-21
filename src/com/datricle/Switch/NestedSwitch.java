package com.datricle.Switch;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID) {
            case 1 -> {
                System.out.println("Deep sehgal");
            }
            case 2 -> {
                System.out.println("Rahul rana");
            }
            case 3 -> {
                System.out.println("Emp id number 3");
                switch (department) {
                    case "IT" -> System.out.println("It Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No valid Department");
                }
            }
            default -> System.out.println("no emp id valid");
        }
    }
}

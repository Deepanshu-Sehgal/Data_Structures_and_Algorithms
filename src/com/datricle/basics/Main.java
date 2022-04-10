package com.datricle.basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name = input.nextLine();
        System.out.println("Hey "+name);
    }
}

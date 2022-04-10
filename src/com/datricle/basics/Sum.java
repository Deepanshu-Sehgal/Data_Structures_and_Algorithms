package com.datricle.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2 = input.nextInt();
        System.out.println("the sum is : " + (num1 + num2));

    }
}

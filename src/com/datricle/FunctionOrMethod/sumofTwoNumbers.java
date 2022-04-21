package com.datricle.FunctionOrMethod;

import java.util.Scanner;

public class sumofTwoNumbers {

    public static void main(String[] args) {
        //sum();
        System.out.println(sumTwo());
    }

    static int sumTwo() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        return sum;
    }

    /*static void sum() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }*/
}


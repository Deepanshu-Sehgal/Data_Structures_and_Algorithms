package com.datricle.FunctionOrMethod;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //System.out.println(isPrime(n));

        for (int i = 100; i < 1000; i++) {
            if (isArmStrong(i))
                System.out.print(i + " ");
        }
    }

    //print all the armStrong Numbers
    static boolean isArmStrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;

    }


}

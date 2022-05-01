package com.datricle.Array;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int[] arr = new int[5];
       *//* arr[0] = 23;
        arr[1] = 29;
        arr[2] = 230;
        arr[3] = 253;
        arr[4] = 233;

        System.out.println(arr[3]);*//*

        //input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int j : arr) {
            System.out.print(j + " "); //here num represents element of the array
        }*/

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}

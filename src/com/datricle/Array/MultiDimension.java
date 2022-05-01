package com.datricle.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr2D = {
                {1, 2, 3}, //0th index
                {4, 5}, //1st index
                {6, 7, 8, 9} // 2nd index ->
                // arr2D[2] = {6,7,8,9} and if arr2D[2][0] = {6}
        };


        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
/*        //output
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }*/

        /*//output
        for (int row = 0; row < arr.length; row++) {
                System.out.print(Arrays.toString(arr[row]));
        }*/

        //output
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

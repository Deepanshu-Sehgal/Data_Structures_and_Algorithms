package com.datricle.Array;

import java.util.Arrays;


public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 123, 33, 64, 59, 698, 798, 86, 944, 40};

        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, 4));
    }

    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}

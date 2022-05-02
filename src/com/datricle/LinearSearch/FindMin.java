package com.datricle.LinearSearch;

public class FindMin {

    public static void main(String[] args) {
        int[] nums = {23, 45, 6, 47, 86, 97};
        System.out.println(min(nums));
    }

    static int min(int[] arr) {
        if (arr.length == 0) return -1;

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }
}


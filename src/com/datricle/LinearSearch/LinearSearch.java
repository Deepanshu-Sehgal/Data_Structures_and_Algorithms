package com.datricle.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {23,45,76,47,86,97};
        int target = 47;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
        int ans2 = linearSearch2(nums,target);
        System.out.println(ans2);
        boolean ans3 = linearSearch3(nums,target);
        System.out.println(ans3);
    }

    //search in the array:return the index if item found otherwise if item not found return -1
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //run for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        //this line will execute if none of the return statement above have executed hence the target not found
        return false;
    }
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        //run for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        //this line will execute if none of the return statement above have executed hence the target not found
        return Integer.MAX_VALUE;
    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is == target
            int element = arr[i];
            if (element == target){
                return i;
            }
        }

        //this line will execute if none of the return statement above have executed hence the target not found
        return -1;
    }
}

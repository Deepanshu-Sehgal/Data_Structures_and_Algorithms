package com.datricle.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23,45,76,47,86,97};
        int target = 43;
        int ans = linearSearch(nums,target,2,4);
        System.out.println(ans);
        boolean ans3 = linearSearch3(nums,target,2,4);
        System.out.println(ans3);
    }

    static int linearSearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }

        //run for loop
        for (int i = start; i < end; i++) {
            //check for element at every index if it is == target
            int element = arr[i];
            if (element == target){
                return i;
            }
        }

        //this line will execute if none of the return statement above have executed hence the target not found
        return -1;
    }

    static boolean linearSearch3(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return false;
        }

        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        //run for loop


        //this line will execute if none of the return statement above have executed hence the target not found
        return false;
    }
}

package com.datricle.BinarySearch;

public class BinarySearch {
    /*
    1: find the middle element
    2: target element > mid element => search in the right else search in left
    3: if the mid element is = target element => Ans
    */
    public static void main(String[] args) {
        int[] arr = {-18, -2, -1, 0, 2, 4, 7, 8, 9, 12, 14, 45, 67, 89};
        int ans = binarySearch(arr, 11);
        System.out.println(ans);
    }

    //return index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; // might be posslible that (start + end)
            // exceeds the range of integer

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans
                return mid;
            }
        }
        return -1;
    }
}

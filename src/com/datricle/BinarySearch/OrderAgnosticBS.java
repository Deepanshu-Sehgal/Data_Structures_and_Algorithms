package com.datricle.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -2, -1, 0, 2, 4, 7, 8, 9, 12, 14, 45, 67, 89};
        int ans = orderAgnosticBs(arr, 12 );
        System.out.println(ans);
    }

    static int orderAgnosticBs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in asc or des
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; // might be posslible that (start + end)
            // exceeds the range of integer
            int mid = start + (end - start) / 2; // mid element

            // mid = target give ans
            if (arr[mid] == target) return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

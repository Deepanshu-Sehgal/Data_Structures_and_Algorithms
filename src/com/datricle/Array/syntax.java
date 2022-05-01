package com.datricle.Array;

public class syntax {
    public static void main(String[] args) {
        /* int[] rollNo = new int[5];
        int[] rollNo2 = {23, 34, 56, 67, 78};*/

        int[] ros; //declaration of array. ros is getting defined the stack
        ros = new int[5]; // initialisation: actually here object is being created in the heap memory

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);


    }
}
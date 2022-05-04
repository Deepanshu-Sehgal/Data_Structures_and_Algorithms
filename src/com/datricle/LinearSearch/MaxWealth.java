package com.datricle.LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int sum = 0;
            for (int account : person) {
                sum = sum + account;
            }
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;

    }

    /*public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;

    }*/
}

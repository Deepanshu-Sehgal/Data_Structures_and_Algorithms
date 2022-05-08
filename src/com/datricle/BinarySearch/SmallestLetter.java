package com.datricle.BinarySearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(Smallest_letter(letters,target));
    }

    static char Smallest_letter(char[] letter, int target) {
        int start = 0;
        int end = letter.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2; // might be posslible that (start + end)
            // exceeds the range of integer

            int mid = start + (end - start) / 2;
            if (target < letter[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }
}

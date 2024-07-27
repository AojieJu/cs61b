/*
Given two strings needle and haystack, return the index of the first occurrence
of needle in haystack, or -1 if needle is not part of haystack.
 */

public class Solution28 {
    public int strStr(String haystack, String needle) {
        // Edge case: if needle is empty, return 0
        if (needle.length() == 0) {
            return 0;
        }

        // Edge case: if needle is longer than haystack, return -1
        if (needle.length() > haystack.length()) {
            return -1;
        }

        // Iterate through haystack up to the point where needle can fully fit
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring matches needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Return the start index of the first occurrence
            }
        }

        // If no match found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Solution28 solution = new Solution28();

        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Output: " + solution.strStr(haystack1, needle1));  // Output: 0

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Output: " + solution.strStr(haystack2, needle2));  // Output: -1
    }
}

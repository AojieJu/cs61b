/*
Given a string s, find the length of the longest substring without repeating characters.
 */

import java.util.HashSet; //Store the unique characters in the current window.
import java.util.Set;

public class Solution3 {
        public int lengthOfLongestSubstring(String s) {
            // Initialize the set to store unique characters
            Set<Character> set = new HashSet<>();
            // Initialize the left pointer, maxLength, and currentLength
            int left = 0; //left pointer
            int maxLength = 0;

            // Iterate over the string with the right pointer
            for (int right = 0; right < s.length(); right++) {
                // If the character is in the set, remove characters from the left until it is not
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                // Add the current character to the set
                set.add(s.charAt(right));
                // Update the maximum length of the substring
                maxLength = Math.max(maxLength, right - left + 1);
            }

            // Return the maximum length of the substring
            return maxLength;
        }

        public static void main(String[] args) {
            Solution3 solution = new Solution3();

            // Example 1
            String s1 = "abcabcbb";
            System.out.println("Longest Substring Without Repeating Characters: " + solution.lengthOfLongestSubstring(s1));  // Output: 3

            // Example 2
            String s2 = "bbbbb";
            System.out.println("Longest Substring Without Repeating Characters: " + solution.lengthOfLongestSubstring(s2));  // Output: 1

            // Example 3
            String s3 = "pwwkew";
            System.out.println("Longest Substring Without Repeating Characters: " + solution.lengthOfLongestSubstring(s3));  // Output: 3
        }
    }


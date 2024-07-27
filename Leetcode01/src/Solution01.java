/*
 Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.
 You may assume that each input would have exactly one solution,
 and you may not use the same element twice.
 You can return the answer in any order.
*/

import java.util.HashMap; //Import the "Hashmap" class from the "java.util" package.
// The collection that stores key-value pairs.
import java.util.Map; //Defines the structure and behavior of key-value pairs.

    public class Solution01 { // Defines the solution of this question as a class.
        public int[] twoSum(int[] nums, int target) {
            // Create a hash map to store the number and its index
            Map<Integer, Integer> map = new HashMap<>();

            // Iterate through the array
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                // Check if the complement exists in the map
                if (map.containsKey(complement)) {
                    // Return the indices of the two numbers
                    return new int[] { map.get(complement), i };
                }

                // Add the number and its index to the map
                map.put(nums[i], i);
            }

            // If no solution is found, return an empty array
            throw new IllegalArgumentException("No two sum solution");
        }

        public static void main(String[] args) {
            Solution01 solution = new Solution01();

            // Example 1
            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            int[] result1 = solution.twoSum(nums1, target1);
            System.out.println("Indices: " + result1[0] + ", " + result1[1]);  // Output: Indices: 0, 1

            // Example 2
            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            int[] result2 = solution.twoSum(nums2, target2);
            System.out.println("Indices: " + result2[0] + ", " + result2[1]);  // Output: Indices: 1, 2

            // Example 3
            int[] nums3 = {3, 3};
            int target3 = 6;
            int[] result3 = solution.twoSum(nums3, target3);
            System.out.println("Indices: " + result3[0] + ", " + result3[1]);  // Output: Indices: 0, 1
        }
    }



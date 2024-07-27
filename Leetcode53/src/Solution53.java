/* Given an integer array nums, find the contiguous subarray (containing at least one
number) which has the largest sum and return its sum.
*/

/* Solution: Using Kadane's Algorithm. Time complexity: O(n). Iterate through the array,
keeping track of the maximum sum of the subarray that ends at the current position. Each
step to decide whether adding next element to the existing subarray or start a new subarray
with the current element as the only member.
 */

public class Solution53 {
    public int maxSubArray(int[] nums) {
        // Initialize the maxSum to the first element
        // and currentSum to the first element
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update the currentSum to be the maximum of the current element
            // or the current element plus the currentSum
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the maxSum to be the maximum of maxSum and currentSum
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum sum of any subarray found
        return maxSum;
    }

    public static void main(String[] args) {
        Solution53 solution = new Solution53();

        // Example 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums1));  // Output: 6

        // Example 2
        int[] nums2 = {1};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums2));  // Output: 1

        // Example 3
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums3));  // Output: 23
    }
}

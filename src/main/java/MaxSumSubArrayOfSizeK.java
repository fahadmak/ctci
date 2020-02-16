public class MaxSumSubArrayOfSizeK {
    public static int findMaxSumSubArray(int k, int[] arr) {
        // Given an array of positive numbers and a positive number ‘k’,
        // find the maximum sum of any contiguous subarray of size ‘k’.
        // Input: [2, 1, 5, 1, 3, 2], k=3
        // Output: 9
        // Explanation: Subarray with maximum sum is [5, 1, 3].
        int start = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            if (end - start >= k - 1) {
                maxSum = Math.max(maxSum, sum);
                sum -= arr[start];
                start++;
            }
        }
        return maxSum;
    }
}

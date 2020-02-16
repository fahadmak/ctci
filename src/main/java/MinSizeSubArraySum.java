public class MinSizeSubArraySum {

    // Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous
    // subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
    // Input: [2, 1, 5, 2, 3, 2], S=7
    // Output: 2
    // Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].

    public static int findMinSubArray(int S, int[] arr) {
        int start = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum >= S) {
                minSum = Math.min(minSum, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        return minSum;
    }
}

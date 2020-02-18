import java.util.HashMap;

public class ReplacingOnes {
    // Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s,
    // find the length of the longest contiguous subarray having all 1s.

    //Input: Array=[0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1], k=2
    //Output: 6
    //Explanation: Replace the '0' at index 5 and 8 to have the longest contiguous subarray of 1s having length 6.

    public static int findLength(int[] arr, int k) {
        int start = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int countOnes = 0;
        for (int end = 0; end < arr.length; end++) {
            if (arr[end] == 1) countOnes++;
            if (end - start + 1 - countOnes > k) {
                if (arr[start] == 1)
                    countOnes--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}

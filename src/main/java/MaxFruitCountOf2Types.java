import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {

    // Given an array of characters where each character represents a fruit tree, you are given two baskets and your
    // goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have
    // only one type of fruit.

    // Input: Fruit=['A', 'B', 'C', 'A', 'C']
    // Output: 3
    // Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']

    public static int findLength(char[] arr) {
        int start = 0;
        int maxSum = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < arr.length; end++) {
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);
            if (map.size() == 2) maxSum = Math.max(maxSum, end - start + 1);
            while (map.size() > 2) {
                map.put(arr[start], map.get(arr[start]) - 1);
                if (map.get(arr[start]) == 0) map.remove(arr[start]);
                start++;
            }
        }
        return maxSum;
    }
}

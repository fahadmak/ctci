import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {

    // Given a string, find the length of the longest substring which has no repeating characters.
    // Input: String="aabccbb"
    // Output: 3
    // Explanation: The longest substring without any repeating characters is "abc".

    public static int findLength(String str) {
        int start = 0;
        int maxLength = Integer.MIN_VALUE;

        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);
            while (map.get(str.charAt(end)) >= 2) {
                map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}

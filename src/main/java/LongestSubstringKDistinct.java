import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
    // Given a string, find the length of the longest substring in it with no more than K distinct characters.
    // Input: String="araaci", K=2
    // Output: 4
    // Explanation: The longest substring with no more than '2' distinct characters is "araa".
    public static int findLength(String str, int k) {
        int start = 0;
        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);
            if (map.size() == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }

            while (map.size() > k) {
                map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
                if (map.get(str.charAt(start)) == 0) map.remove(str.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}

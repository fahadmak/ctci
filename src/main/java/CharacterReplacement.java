import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {

    // Given a string with lowercase letters only, if you are allowed to replace no more than ‘k’
    // letters with any letter, find the length of the longest substring having the same letters after replacement.

    // Input: String="aabccbb", k=2
    // Output: 5
    // Explanation: Replace the two 'c' with 'b' to have a longest repeating substring "bbbbb".

    public static int findLength(String str, int k) {
        int start = 0;
        int maxRepeatingFrequency = Integer.MIN_VALUE;
        int maxLength = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < str.length(); end++) {
            map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);
            maxRepeatingFrequency = Math.max(maxRepeatingFrequency, map.get(str.charAt(end)));

            if (end - start + 1 - maxRepeatingFrequency > k) {
                map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}

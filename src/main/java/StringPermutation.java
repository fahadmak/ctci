import java.util.HashMap;
import java.util.Map;

public class StringPermutation {
    // Given a string and a pattern, find out if the string contains any permutation of the pattern.
    // Input: String="oidbcaf", Pattern="abc"
    // Output: true
    public static boolean findPermutation(String str, String pattern) {
        int start = 0;
        int matched = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : pattern.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int end = 0; end < str.length(); end++) {
            if (map.containsKey(str.charAt(end))) {
                map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) - 1);
                if (map.get(str.charAt(end)) == 0)
                    matched++;
            }

            if (matched == pattern.length()) {
                return true;
            }

            if (end - start  + 1 >= pattern.length()) {
                if (map.containsKey(str.charAt(start))) {
                    map.put(str.charAt(start), map.get(str.charAt(start)) + 1);
                    matched--;
                }
                start++;
            }
        }
        return false;
    }
}

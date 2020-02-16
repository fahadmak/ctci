import java.util.HashMap;
import java.util.Map;

class Anagram {

    // Given a string and a pattern, find the smallest substring in the given string which
    // has all the characters of the given pattern.

    // Input: String="abdabca", Pattern="abc"
    // Output: "abc"
    // Explanation: The smallest substring having all characters of the pattern is "abc".

    public static String findSubstring(String str, String pattern) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c: pattern.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int minLength = Integer.MAX_VALUE;
        char endChar, startChar;
        int matched = 0;
        int length = 0;
        int minStart = 0, minEnd = 0;
        for (int end = 0; end < str.length(); end++) {
            endChar = str.charAt(end);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) >= 0) {
                    matched++;
                }
            }
            while (matched == pattern.length()) {
                length = end - start + 1;
                if (minLength > length) {
                    minLength = length;
                    minStart = start;
                }

                startChar = str.charAt(start);
                if (map.containsKey(startChar)) {
                    if (map.get(startChar) == 0) matched--;
                    map.put(startChar, map.get(startChar) + 1);
                }
                start++;
            }


        }
        return str.substring(minStart, minStart + length);
    }
}

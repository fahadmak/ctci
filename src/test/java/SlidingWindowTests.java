import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlidingWindowTests {

    @Test
    void findLengthOfLongestSubstringWithKDistinctElements() {
        assertEquals(4, LongestSubstringKDistinct.findLength("araaci", 2));
        assertEquals(2, LongestSubstringKDistinct.findLength("araaci", 1));
        assertEquals(5, LongestSubstringKDistinct.findLength("cbbebi", 3));
    }

    @Test
    void findMaxSumSubArray() {
        assertEquals(9, MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2}));
    }

    @Test
    void findMaxNumberOfFruits() {
        assertEquals(3, MaxFruitCountOf2Types.findLength(new char[] {'A', 'B', 'C', 'A', 'C'}));
        assertEquals(5, MaxFruitCountOf2Types.findLength(new char[] {'A', 'B', 'C', 'B', 'B', 'C'}));
    }

    @Test
    void findMinSubArray() {
        assertEquals(2, MinSizeSubArraySum.findMinSubArray(7, new int[] {2, 1, 5, 2, 3, 2}));
        assertEquals(1, MinSizeSubArraySum.findMinSubArray(7, new int[] {2, 1, 5, 2, 8}));
        assertEquals(3, MinSizeSubArraySum.findMinSubArray(8, new int[] {3, 4, 1, 1, 6}));
    }

    @Test
    void findLengthNoRepeatSubstring() {
        assertEquals(3, NoRepeatSubstring.findLength("aabccbb"));
        assertEquals(2, NoRepeatSubstring.findLength("abbbb"));
    }

    @Test
    void findLengthCharacterReplacement() {
        assertEquals(5, CharacterReplacement.findLength("aabccbb", 2));
        assertEquals(4, CharacterReplacement.findLength("abbcb", 1));
        assertEquals(3, CharacterReplacement.findLength("abccde", 1));
    }

    @Test
    void findSubstring() {
        assertEquals("abc", Anagram.findSubstring("abdabca", "abc"));
        assertEquals("abdec", Anagram.findSubstring("aabdec", "abc"));
    }
}


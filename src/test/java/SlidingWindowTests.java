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
    void findMinSubArray() {
        assertEquals(2, MinSizeSubArraySum.findMinSubArray(7, new int[] {2, 1, 5, 2, 3, 2}));
        assertEquals(1, MinSizeSubArraySum.findMinSubArray(7, new int[] {2, 1, 5, 2, 8}));
        assertEquals(3, MinSizeSubArraySum.findMinSubArray(8, new int[] {3, 4, 1, 1, 6}));
    }
    @Test
    void findSubstring() {
        assertEquals("abc", Anagram.findSubstring("abdabca", "abc"));
        assertEquals("abdec", Anagram.findSubstring("aabdec", "abc"));
    }
}


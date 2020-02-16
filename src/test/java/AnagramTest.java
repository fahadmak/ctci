import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {
    @Test
    void testfindSubstring () {
        assertEquals("abc", Anagram.findSubstring("abdabca", "abc"));
        assertEquals("abdec", Anagram.findSubstring("aabdec", "abc"));
    }
}

package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckAnagramTest {

    @Test
    public void testAreAnagrams() {
        // Test case 1: Anagrams with the same letters
        assertTrue(CheckAnagram.areAnagrams("listen", "silent"));

        // Test case 2: Anagrams with different letter case
        assertTrue(CheckAnagram.areAnagrams("Triangle", "integral"));

        // Test case 3: Non-anagrams
        assertFalse(CheckAnagram.areAnagrams("hello", "world"));

        // Test case 4: Anagrams with spaces
        assertTrue(CheckAnagram.areAnagrams("  debit card ", "bad credit"));

        // Test case 5: Anagrams with special characters
        assertTrue(CheckAnagram.areAnagrams("astronomer", "moon starer"));
    }
}

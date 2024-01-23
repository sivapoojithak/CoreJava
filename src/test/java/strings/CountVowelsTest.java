package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountVowelsTest {

    @Test
    public void testCountVowels() {
        // Test case 1: String with all vowels
        assertEquals(5, CountVowels.countVowels("aeiou"));

        // Test case 2: String with mixed case vowels
        assertEquals(5, CountVowels.countVowels("AeIoU"));

        // Test case 3: String with no vowels
        assertEquals(0, CountVowels.countVowels("rhythm"));

        // Test case 4: String with spaces and vowels
        assertEquals(3, CountVowels.countVowels("hello world"));

        // Test case 5: Empty string
        assertEquals(0, CountVowels.countVowels(""));

        // Test case 6: String with special characters
        assertEquals(4, CountVowels.countVowels("Good Morning!"));
    }
}

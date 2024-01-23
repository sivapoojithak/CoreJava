package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckStringRotationTest {

    @Test
    public void testIsRotation() {
        // Test case 1: Rotated string
        assertTrue(CheckStringRotation.isRotation("abcd", "cdab"));

        // Test case 2: Not a rotation
        assertFalse(CheckStringRotation.isRotation("hello", "world"));

        // Test case 3: Empty strings
        assertFalse(CheckStringRotation.isRotation("", ""));

        // Test case 4: Same string
        assertTrue(CheckStringRotation.isRotation("abc", "abc"));

        // Test case 5: Different lengths
        assertFalse(CheckStringRotation.isRotation("abc", "abcd"));

        // Test case 6: Case-sensitive rotation
        assertTrue(CheckStringRotation.isRotation("AbCdEf", "EfAbCd"));

        // Test case 7: Rotation with spaces
        assertTrue(CheckStringRotation.isRotation("openai", "aiopen"));
    }
}

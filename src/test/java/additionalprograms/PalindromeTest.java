package additionalprograms;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome(3223));
        assertFalse(Palindrome.isPalindrome(2345));
    }
}
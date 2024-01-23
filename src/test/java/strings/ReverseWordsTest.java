package strings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() {

        assertEquals("avaJ EE2J esreveR eM", ReverseWords.reverseWords("Java J2EE Reverse Me"));
    }

    @Test
    public void testReverseWordsWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        String result = ReverseWords.reverseWords(input);

        assertEquals(expectedOutput, result);
    }

}

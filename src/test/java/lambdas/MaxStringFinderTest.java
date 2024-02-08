package lambdas;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class MaxStringFinderTest {

    @Test
    public void testFindMax() {
        List<String> input = Arrays.asList("apple", "banana", "orange", "grapes", "kiwi");
        String expected = "orange";
        assertEquals(expected, MaxStringFinder.findMax(input));
    }

    @Test
    public void testFindMaxWithEmptyList() {
        List<String> input = Arrays.asList();
        String expected = null;
        assertEquals(expected, MaxStringFinder.findMax(input));
    }

    @Test
    public void testFindMaxWithSingleElement() {
        List<String> input = Arrays.asList("apple");
        String expected = "apple";
        assertEquals(expected, MaxStringFinder.findMax(input));
    }

    @Test
    public void testFindMaxWithSameLengthStrings() {
        List<String> input = Arrays.asList("banana", "kiwi", "apple", "orange");
        String expected = "orange";
        assertEquals(expected, MaxStringFinder.findMax(input));
    }
}


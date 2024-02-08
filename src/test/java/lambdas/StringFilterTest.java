package lambdas;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;


public class StringFilterTest {

    @Test
    public void testFilterStringsStartingWithA() {
        List<String> input = Arrays.asList("Apple", "Banana", "Orange", "Apricot", "Grapes");
        List<String> expected = Arrays.asList("Banana", "Orange", "Grapes");
        assertEquals(expected, StringFilter.filterStringsStartingWithA(input));
    }

    @Test
    public void testFilterStringsStartingWithACaseInsensitive() {
        List<String> input = Arrays.asList("apple", "banana", "orange", "apricot", "grapes");
        List<String> expected = Arrays.asList("banana", "orange", "grapes");
        assertEquals(expected, StringFilter.filterStringsStartingWithA(input));
    }

    @Test
    public void testFilterStringsWithNoStringsStartingWithA() {
        List<String> input = Arrays.asList("Banana", "Orange", "Grapes");
        List<String> expected = Arrays.asList("Banana", "Orange", "Grapes");
        assertEquals(expected, StringFilter.filterStringsStartingWithA(input));
    }

    @Test
    public void testFilterStringsWithEmptyList() {
        List<String> input = Arrays.asList();
        List<String> expected = Arrays.asList();
        assertEquals(expected, StringFilter.filterStringsStartingWithA(input));
    }
}


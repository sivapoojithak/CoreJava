package lambdas;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringArraySorterTest {

    @Test
    public void testSortStrings() {
        String[] input = {"banana", "apple", "orange", "grape", "kiwi", "pear"};
        String[] expected = {"pear", "kiwi", "apple", "grape", "orange", "banana"};
        assertArrayEquals(expected, StringArraySorter.sortStrings(input));
    }

    @Test
    public void testSortStringsWithSameLength() {
        String[] input = {"banana", "apple", "grape", "orange"};
        String[] expected = {"apple", "grape", "orange", "banana"};
        assertArrayEquals(expected, StringArraySorter.sortStrings(input));
    }

    @Test
    public void testSortStringsWithEmptyArray() {
        String[] input = {};
        String[] expected = {};
        assertArrayEquals(expected, StringArraySorter.sortStrings(input));
    }

    @Test
    public void testSortStringsWithSingleElement() {
        String[] input = {"apple"};
        String[] expected = {"apple"};
        assertArrayEquals(expected, StringArraySorter.sortStrings(input));
    }
}


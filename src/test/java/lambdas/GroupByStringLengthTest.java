package lambdas;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupByStringLengthTest {

    @Test
    public void testGroupByLength() {
        List<String> input = Arrays.asList("apple", "banana", "orange", "kiwi", "grape", "pear");
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(5, Arrays.asList("apple", "grape"));
        expected.put(6, Arrays.asList("banana", "orange"));
        expected.put(4, Arrays.asList("kiwi", "pear"));

        assertEquals(expected, GroupByStringLength.groupByLength(input));
    }

    @Test
    public void testGroupByLengthWithEmptyList() {
        List<String> input = Arrays.asList();
        Map<Integer, List<String>> expected = new HashMap<>();
        assertEquals(expected, GroupByStringLength.groupByLength(input));
    }

    @Test
    public void testGroupByLengthWithSingleElement() {
        List<String> input = Arrays.asList("apple");
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(5, Arrays.asList("apple"));
        assertEquals(expected, GroupByStringLength.groupByLength(input));
    }

    @Test
    public void testGroupByLengthWithStringsOfSameLength() {
        List<String> input = Arrays.asList("cat", "dog", "cow");
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(3, Arrays.asList("cat", "dog", "cow"));
        assertEquals(expected, GroupByStringLength.groupByLength(input));
    }
}


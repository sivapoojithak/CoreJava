package lambdas;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class NumberProcessorTest {

    @Test
    public void testFilterAndDouble() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expected = Arrays.asList(2, 6, 10, 14, 18);
        assertEquals(expected, NumberProcessor.filterAndDouble(input));
    }

    @Test
    public void testFilterAndDoubleWithNoOddNumbers() {
        List<Integer> input = Arrays.asList(2, 4, 6, 8);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, NumberProcessor.filterAndDouble(input));
    }

    @Test
    public void testFilterAndDoubleWithEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, NumberProcessor.filterAndDouble(input));
    }
}


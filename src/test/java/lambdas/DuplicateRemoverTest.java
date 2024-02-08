package lambdas;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class DuplicateRemoverTest {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 7, 8);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(expected, DuplicateRemover.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, DuplicateRemover.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithSingleElement() {
        List<Integer> input = Arrays.asList(1);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, DuplicateRemover.removeDuplicates(input));
    }

    @Test
    public void testRemoveDuplicatesWithAllDuplicates() {
        List<Integer> input = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, DuplicateRemover.removeDuplicates(input));
    }
}


package lambdas;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class StringCapitalizerTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] inputArray = {"apple", "Banana", "orange", "grape"};

        String[] result = StringCapitalizer.capitalizeAndSort(inputArray);

        String[] expected = {"Apple", "Banana", "Grape", "Orange"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCapitalizeAndSortWithNullAndEmptyStrings() {
        String[] inputArray = {"apple", "", null, "grape"};

        String[] result = StringCapitalizer.capitalizeAndSort(inputArray);

        String[] expected = {"Apple", "Grape"};
        assertArrayEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCapitalizeAndSortWithNullInput() {
        String[] result = StringCapitalizer.capitalizeAndSort(null);
    }
}


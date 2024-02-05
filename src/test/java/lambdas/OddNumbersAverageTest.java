package lambdas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddNumbersAverageTest {

    @Test
    public void testCalculateAverageOfSquaresOfOddNumbers() {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double result = OddNumbersAverage.calculateAverageOfSquaresOfOddNumbers(inputArray);

        double expected = ((1 * 1) + (3 * 3) + (5 * 5) + (7 * 7) + (9 * 9)) / 5.0;
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testCalculateAverageOfSquaresOfOddNumbersWithNoOddNumbers() {
        int[] inputArray = {2, 4, 6, 8, 10};

        double result = OddNumbersAverage.calculateAverageOfSquaresOfOddNumbers(inputArray);

        assertEquals(0.0, result, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverageOfSquaresOfOddNumbersWithNullInput() {
        double result = OddNumbersAverage.calculateAverageOfSquaresOfOddNumbers(null);
    }
}


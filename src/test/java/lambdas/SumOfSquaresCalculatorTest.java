package lambdas;


import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;


public class SumOfSquaresCalculatorTest {

    @Test
    public void testSumOfSquares() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        int expected = 1 + 4 + 9 + 16 + 25;
        assertEquals(expected, SumOfSquaresCalculator.sumOfSquares(input));
    }

    @Test
    public void testSumOfSquaresWithNegativeNumbers() {
        List<Integer> input = Arrays.asList(-1, 2, -3, 4, -5);
        int expected = 4 + 16;
        assertEquals(expected, SumOfSquaresCalculator.sumOfSquares(input));
    }

    @Test
    public void testSumOfSquaresWithEmptyList() {
        List<Integer> input = Arrays.asList();
        int expected = 0;
        assertEquals(expected, SumOfSquaresCalculator.sumOfSquares(input));
    }
}


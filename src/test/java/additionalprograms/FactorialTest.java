package additionalprograms;

import org.junit.Test;
import static org.junit.Assert.*;
public class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        int number = 5;
        long expectedFactorial = 120; // Expected factorial of 5
        long factorial = Factorial.checkFactorial(number);
        assertEquals(expectedFactorial, factorial);
    }

    @Test
    public void testCalculateFactorialZero() {
        int number = 0;
        long expectedFactorial = 1; // Expected factorial of 0
        long factorial = Factorial.checkFactorial(number);
        assertEquals(expectedFactorial, factorial);
    }
}

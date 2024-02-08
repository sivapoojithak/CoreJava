package lambdas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationExecutorTest {

    @Test
    public void testAddition() {
        MathOperationExecutor executor = new MathOperationExecutor();
        MathOperation addition = (a, b) -> a + b;
        int result = executor.operate(addition, 5, 3);
        assertEquals(8, result);
    }
}


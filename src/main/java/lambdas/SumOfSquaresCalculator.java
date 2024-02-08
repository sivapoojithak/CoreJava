package lambdas;

import java.util.List;

public class SumOfSquaresCalculator {
    public static int sumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)
                .mapToInt(n -> n * n)
                .sum();
    }
}


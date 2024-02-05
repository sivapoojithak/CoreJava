package lambdas;

public class OddNumbersAverage {

    public static double calculateAverageOfSquaresOfOddNumbers(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        int sumOfSquares = 0;
        int count = 0;

        for (int num : numbers) {
            if (num % 2 != 0) {  // Check if the number is odd
                sumOfSquares += num * num;
                count++;
            }
        }
        if (count == 0) {
            return 0.0;  // Avoid division by zero
        }
        return (double) sumOfSquares / count;
    }
}


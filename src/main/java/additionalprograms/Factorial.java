package additionalprograms;

public class Factorial {
    public static long checkFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * checkFactorial(num-1); // Recursive call
        }
    }
}

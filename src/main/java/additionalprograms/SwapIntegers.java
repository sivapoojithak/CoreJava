package additionalprograms;

public class SwapIntegers {

    public static void swapIntegerValues(int x, int y) {
        System.out.println("Before swapping: x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}


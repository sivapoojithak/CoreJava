package arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 0, 5, 0, 7, 9, 8, 3};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        moveZerosToEnd(numbers);
        System.out.println("Array after moving 0's to the end: " + Arrays.toString(numbers));
    }
    private static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex++] = num;
            }
        }
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }
}

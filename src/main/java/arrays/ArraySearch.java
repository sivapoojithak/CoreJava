package arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] array = {8, 9, 25, 18, 3, 6};
        int target = 25;

        System.out.println("Original Array:");
        printArray(array);

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("\n" + target + " found at index " + index);
        } else {
            System.out.println("\n" + target + " not found in the array");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {5,8,2,9,4,15,12,19};
        int[] reverse = new int[numbers.length];
        int i;

        for(i=numbers.length-1;i>=0;i--) {
            reverse[numbers.length - 1 - i] = numbers[i];
            System.out.print(reverse[numbers.length - 1 - i] + " ");
        }
    }
}
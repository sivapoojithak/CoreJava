package arrays;
public class ArrayClass {

    public static void main(String[] args) {
        int[] numbers = {5,8,2,9,4,15,12,19};
        int i, max=numbers[0], min=numbers[0];

        for(i=1;i<numbers.length;i++) {
            if(numbers[i]>max) {
                max= numbers[i];
            }else if(numbers[i]<min) {
                min= numbers[i];
            }
        }
        System.out.println("The largest number in an array is: " + max);
        System.out.println("The smallest number in an array is: " + min);
    }
}

package additionalprograms;

public class Palindrome {

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int r = num % 10;
            reversed = reversed * 10 + r;
            num /= 10;
        }
        if(original == reversed) {
            System.out.println(reversed + " is a palindrome");
        } else {
            System.out.println(reversed + " is not a palindrome");
        }
        return original == reversed;
    }
}

package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public String removeDuplicates(String input) {
        // Use a LinkedHashSet to maintain the order of characters while removing duplicates
        Set<Character> charSet = new LinkedHashSet<>();

        // Iterate through the characters in the input string
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        // Build the result string without duplicates
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }

    public void printOutput(String input) {
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}


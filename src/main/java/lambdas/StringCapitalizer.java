package lambdas;

import java.util.Arrays;

public class StringCapitalizer {

    public static String[] capitalizeAndSort(String[] input) {
        if (input == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        // Capitalize the first letter of each string
        String[] capitalizedArray = Arrays.stream(input)
                .filter(s -> s != null && !s.isEmpty())
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .toArray(String[]::new);

        // Sort the array alphabetically
        Arrays.sort(capitalizedArray);

        return capitalizedArray;
    }
}


package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class StringArraySorter {
    public static String[] sortStrings(String[] arr) {
        Arrays.sort(arr, Comparator.comparing(String::length).thenComparing((a, b) -> {
            if (a.length() == b.length()) {
                return Character.compare(b.charAt(b.length() - 1), a.charAt(a.length() - 1));
            }
            return 0;
        }));
        return arr;
    }
}


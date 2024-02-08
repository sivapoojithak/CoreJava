package lambdas;

import java.util.List;
import java.util.Optional;

public class MaxStringFinder {
    public static String findMax(List<String> strings) {
        Optional<String> maxString = strings.stream()
                .max(String::compareTo); // natural ordering comparator
        return maxString.orElse(null);
    }
}


package lambdas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStringLength {
    public static Map<Integer, List<String>> groupByLength(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}


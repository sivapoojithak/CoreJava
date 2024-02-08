package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringFilter {
    public static List<String> filterStringsStartingWithA(List<String> list) {
        Predicate<String> startsWithA = str -> str.startsWith("A") || str.startsWith("a");
        List<String> filteredList = new ArrayList<>();
        for (String str : list) {
            if (!startsWithA.test(str)) {
                filteredList.add(str);
            }
        }
        return filteredList;
    }
}


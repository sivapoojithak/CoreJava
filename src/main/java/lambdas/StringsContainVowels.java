package lambdas;

import java.util.ArrayList;
import java.util.List;

public class StringsContainVowels {

    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static List<String> stringsWithVowels(String[] strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            int numVowels = countVowels(str);
            if (numVowels > 0) {
                result.add(str + " - " + numVowels);
            }
            System.out.println(result);
        }
        return result;
    }
}

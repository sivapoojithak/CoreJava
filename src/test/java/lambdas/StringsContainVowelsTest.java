package lambdas;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class StringsContainVowelsTest {

    @Test
    public void testCountVowels() {
        assertEquals(2, StringsContainVowels.countVowels("hello"));
        assertEquals(1, StringsContainVowels.countVowels("world"));
        assertEquals(1, StringsContainVowels.countVowels("python"));
        assertEquals(2, StringsContainVowels.countVowels("ai"));
        assertEquals(0, StringsContainVowels.countVowels(""));
    }

    @Test
    public void testStringsWithVowels() {
        String[] strings = {"hello", "world", "python", "ai", "GPT"};
        List<String> result = StringsContainVowels.stringsWithVowels(strings);
        List<String> expected = new ArrayList<>();
        expected.add("hello - 2");
        expected.add("world - 1");
        expected.add("python - 1");
        expected.add("ai - 2");

        assertEquals(expected, result);
    }
}

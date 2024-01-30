package lists;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class ArrayListToArrayTest {
    @Test
    public void testConvertArrayListToArray() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Call the method to convert ArrayList to Array
        String[] resultArray = ArrayListToArray.convertArrayListToArray(stringList);

        // Define the expected Array
        String[] expectedArray = {"Apple", "Banana", "Orange"};

        // Assert that the result matches the expected Array
        assertArrayEquals(expectedArray, resultArray);
    }
}

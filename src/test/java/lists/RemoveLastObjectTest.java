package lists;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
public class RemoveLastObjectTest {

    @Test
    public void testRemoveLastElement() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Create an instance of the class to test
        RemoveLastObject removeLastObject = new RemoveLastObject();

        // Test removing the last element
        RemoveLastObject.removeLastObject(stringList);
        assertEquals("[Apple, Banana, Orange]", stringList.toString());

        // Test removing the last element from an empty list
        stringList.clear();
        RemoveLastObject.removeLastObject(stringList);
        assertEquals("[]", stringList.toString());
    }
}

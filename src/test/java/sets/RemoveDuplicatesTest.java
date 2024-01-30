package sets;
import org.junit.Test;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates remover = new RemoveDuplicates();

        // Test case 1: Remove duplicates from "programming"
        remover.printOutput("programming");

        // Test case 2: Remove duplicates from "hello world"
        remover.printOutput("hello world");

        // Test case 3: Remove duplicates from an empty string
        remover.printOutput("");
    }
}



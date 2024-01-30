package sets;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class StringSetHandlerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testStringSetHandler() {
        StringSetHandler handler = new StringSetHandler();

        // Test adding strings
        handler.addString("Apple");
        handler.addString("Banana");
        handler.addString("Cherry");

        // Test iterating using Iterator
        handler.iterateUsingIterator();
        assertEquals("Iterating using Iterator:\nApple\nBanana\nCherry\n", outContent.toString());

        // Reset the output content
        outContent.reset();

        // Test iterating using for loop
        handler.iterateUsingForLoop();
        assertEquals("\nIterating using for loop:\nApple\nBanana\nCherry\n", outContent.toString());

        // Reset the output content
        outContent.reset();

        // Test iterating using enhanced for loop
        handler.iterateUsingEnhancedForLoop();
        assertEquals("\nIterating using enhanced for loop:\nApple\nBanana\nCherry\n", outContent.toString());
    }
}
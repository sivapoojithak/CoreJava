package sets;

import java.util.HashSet;
import java.util.Iterator;

public class StringSetHandler {
    private HashSet<String> stringSet;

    // Constructor
    public StringSetHandler() {
        this.stringSet = new HashSet<>();
    }

    // Method to add a string to the set
    public void addString(String element) {
        stringSet.add(element);
    }

    // Method to iterate through the set using Iterator
    public void iterateUsingIterator() {
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }

    // Method to iterate through the set using for loop
    public void iterateUsingForLoop() {
        System.out.println("\nIterating using for loop:");
        Object[] stringArray = stringSet.toArray();
        for (int i = 0; i < stringArray.length; i++) {
            String element = (String) stringArray[i];
            System.out.println(element);
        }
    }

    // Method to iterate through the set using enhanced for loop
    public void iterateUsingEnhancedForLoop() {
        System.out.println("\nIterating using enhanced for loop:");
        for (String element : stringSet) {
            System.out.println(element);
        }
    }
}

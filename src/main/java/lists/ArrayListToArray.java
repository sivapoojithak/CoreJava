package lists;

import java.util.ArrayList;

public class ArrayListToArray {
    public static String[] convertArrayListToArray(ArrayList<String> list) {
        // Convert ArrayList to Array
        return list.toArray(new String[0]);
    }
}

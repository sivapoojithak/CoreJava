package lists;

import java.util.ArrayList;

public class RemoveLastObject {
    public static void removeLastObject(ArrayList<String> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }
}

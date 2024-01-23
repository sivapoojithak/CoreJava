package strings;

public class CheckStringRotation {

    // Function to check if one string is a rotation of another
    public static boolean isRotation(String s1, String s2) {
        // Check if lengths are different or if either string is empty
        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // Concatenate the first string with itself
        String concatenatedString = s1 + s1;

        // Check if the second string is a substring of the concatenated string
        return concatenatedString.contains(s2);
    }
}


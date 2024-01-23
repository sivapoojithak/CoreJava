package strings;

public class ReverseWords {

    // Function to reverse each word in a sentence
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        // Remove the trailing space
        return reversedSentence.toString().trim();
    }
}

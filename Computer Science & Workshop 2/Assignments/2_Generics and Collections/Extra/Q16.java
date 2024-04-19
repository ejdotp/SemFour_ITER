//Q16. In given large string, find the most occurring words in the string.Hint:-a. Create a Hashtable which will keep track of <word, frequency>b. Iterate through the string and keep track of word frequency by inserting into Hash-Table.c. When we have a new word, we will insert it into the Hashtable with frequency 1. For all repetition of the word, we will increase the frequency.d. We can keep track of the most occurring words whenever we are increasing the frequency we can see if this is the most occurring word or not.

import java.util.Hashtable;

public class Q16 {
    public static void main(String[] args) {

        String str = "This is a test string to find the most occurring words in the string. "
                + "This is a test string to find the most occurring words in the string. "
                + "This is a test string to find the most occurring words in the string.";

        Hashtable<String, Integer> table = new Hashtable<>();

        for (String word : str.split(" ")) {

            if (table.containsKey(word)) {

                int count = table.get(word);

                table.put(word, count + 1);
            } else {

                table.put(word, 1);
            }
        }
        int maxCount = 0;
        String maxWord = "";
        for (String word : table.keySet()) {
            if (table.get(word) > maxCount) {
                maxCount = table.get(word);
                maxWord = word;
            }
        }

        System.out.println("Most occurring word: " + maxWord + " with frequency: " + maxCount);
    }
}

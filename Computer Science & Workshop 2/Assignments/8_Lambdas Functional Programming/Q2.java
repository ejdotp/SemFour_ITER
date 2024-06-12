// Q2. Write a program that sorts a list of strings based on theirlengths in
// descending order. Define a custom comparator usingalambda expression that
// compares strings based on their lengths. Usethe custom comparator to sort the
// list of strings in descending orderof length.

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("India");
        strings.add("Canada");
        strings.add("RKL");
        strings.add("BBSR");
        strings.add("UnitedKingdom");
        strings.add("Fig");
        strings.add("Nepal");

        // Define a custom comparator using a lambda expression
        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());

        // Sort the list of strings in descending order of length
        Collections.sort(strings, lengthComparator);

        // Print the sorted list
        System.out.println("Strings sorted by length in descending order:");
        for (String str : strings) 
            System.out.println(str);
    }
}

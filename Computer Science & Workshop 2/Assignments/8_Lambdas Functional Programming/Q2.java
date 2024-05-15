// Q2. Write a program that sorts a list of strings based on theirlengths in
// descending order. Define a custom comparator usingalambda expression that
// compares strings based on their lengths. Usethe custom comparator to sort the
// list of strings in descending orderof length.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface StringComparator {
    int compareStrings(String str1, String str2);
}

public class Q2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("black");
        strings.add("Monday");
        strings.add("mathematics");
        strings.add("computer");
        strings.add("kiwi");
        StringComparator lengthComparator = (str1, str2) -> Integer.compare(str2.length(), str1.length());
        Collections.sort(strings, (str1, str2) -> lengthComparator.compareStrings(str1, str2));
        System.out.println("Sorted list of strings in descendingorder of length:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

// Output:
// Sorted list of strings in descending order of length:
// mathematics
// computer
// Monday
// black
// kiwi
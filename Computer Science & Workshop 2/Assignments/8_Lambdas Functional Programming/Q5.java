// Q5. Write a program that reads a list of strings, converts themtouppercase,
// filters out the strings starting with a vowel, and thenprints the remaining
// strings.

import java.util.*;
import java.util.stream.Collectors;

class StringTransformation {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "melon");

        List<String> transformedStrings = strings.stream()
                .map(String::toUpperCase) // Convert to uppercase
                .filter(str -> !str.matches("^[AEIOU].*")) // Filter out strings starting with a vowel
                .collect(Collectors.toList()); // Collect the remaining strings into a list
                
        System.out.println("Transformed strings:");
        transformedStrings.forEach(System.out::println); // Print the remaining strings
    }
}

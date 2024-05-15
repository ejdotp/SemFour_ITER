// Q5. Write a program that reads a list of strings, converts themtouppercase,
// filters out the strings starting with a vowel, and thenprints the remaining
// strings.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> strings = new ArrayList<>();
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            String upperStr = str.toUpperCase();
            if (!startsWithVowel(upperStr)) {
                result.add(upperStr);
            }
        }
        System.out.println("Filtered strings:");
        for (String str : result) {
            System.out.println(str);
        }
        scanner.close();
    }

    private static boolean startsWithVowel(String str) {
        if (str.isEmpty())
            return false;
        char firstChar = str.charAt(0);
        return firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U';
    }
}

// Output:

// Enter the
// number of strings:5
// Enter the strings:
// apple banana
// orange grape
// umbrella Filtered strings:
// BANANA
// GRAPE
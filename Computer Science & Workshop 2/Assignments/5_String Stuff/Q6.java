//6.Case Conversion and Comparison: Prompt the user to input two strings. Convert both strings to lowercase and uppercase. Compare the converted strings to check case-insensitive equality. Display the converted strings and the result of the comparison.  

import java.util.Scanner;

class CaseConversionAndComparison
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input two strings
        System.out.print("Enter the first string: ");
        String S1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String S2 = scanner.nextLine();
        
        // Convert both strings to lowercase and uppercase
        String S1Lower = S1.toLowerCase();
        String S2Lower = S2.toLowerCase();
        String S1Upper = S1.toUpperCase();
        String S2Upper = S2.toUpperCase();
        
        // Compare the converted strings for case-insensitive equality
        boolean equalIgnoreCase = S1Lower.equals(S2Lower);
        
        // Display the converted strings and the result of the comparison
        System.out.println("\nOriginal strings:");
        System.out.println("String 1: " + S1);
        System.out.println("String 2: " + S2);
        
        System.out.println("\nLowercase conversion:");
        System.out.println("String 1: " + S1Lower);
        System.out.println("String 2: " + S2Lower);
        
        System.out.println("\nUppercase conversion:");
        System.out.println("String 1: " + S1Upper);
        System.out.println("String 2: " + S2Upper);
        
        System.out.println("\nCase-insensitive equality:");
        System.out.println("Strings are equal (ignoring case): " + equalIgnoreCase);
        
        scanner.close();
    }
}

/*Enter the first string: AbCdEf
Enter the second string: aBcDeF

Original strings:
String 1: AbCdEf
String 2: aBcDeF

Lowercase conversion:
String 1: abcdef
String 2: abcdef

Uppercase conversion:
String 1: ABCDEF
String 2: ABCDEF

Case-insensitive equality:
Strings are equal (ignoring case): true */
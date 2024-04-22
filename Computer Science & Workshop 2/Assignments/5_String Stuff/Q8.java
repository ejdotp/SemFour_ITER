/*8.String Concatenation and Character Retrieval: Take two strings from the user. Concatenate them using the string method and the + operator, 
then display both results. Ask the user for an index number, then display the character at that index.  */

import java.util.Scanner;

class Q8forsure
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two strings
        System.out.print("Enter the first string: ");
        String first = sc.nextLine();

        System.out.print("Enter the second string: ");
        String second = sc.nextLine();

        // Concatenate the strings using the string method
        String Methoded = first.concat(second);

        // Concatenate the strings using the + operator
        String Operated = first + second;

        // Display both results
        System.out.println("\nConcatenated string using the string method: " + Methoded);
        System.out.println("Concatenated string using the + operator: " + Operated);

        // Ask the user for an index number
        System.out.print("\nEnter an index number to retrieve a character: ");
        int index = sc.nextInt();

        // Display the character at the specified index
        System.out.println("Character at index " + index + ": " + Methoded.charAt(index) + " and " + Operated.charAt(index));

        sc.close();
    }
}

/*Enter the first string: abc
Enter the second string: 123

Concatenated string using the string method: abc123
Concatenated string using the + operator: abc123

Enter an index number to retrieve a character: 2
Character at index 2: c and c */


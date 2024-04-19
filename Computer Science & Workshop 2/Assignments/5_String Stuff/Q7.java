//7.Character Array and Search: Ask for a string from the user. Convert the string to a character array. Prompt the user to enter a character to search in the string. Find the first and last occurrences of the character. Display the character array and the positions found (if any).  

import java.util.Scanner;
class CharacterArraySearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Prompt the user to enter a character to search
        System.out.print("Enter a character to search in the string: ");
        char searchChar = sc.next().charAt(0);

        // Find the first occurrence of the character
        int firstOccurrence = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                firstOccurrence = i;
                break;
            }
        }

        // Find the last occurrence of the character
        int lastOccurrence = -1;
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == searchChar) {
                lastOccurrence = i;
                break;
            }
        }

        // Display the character array
        System.out.println("\nCharacter Array:");
        System.out.println(charArray);

        // Display the positions found (if any)
        if (firstOccurrence != -1 && lastOccurrence != -1) {
            System.out.println("\nFirst occurrence of '" + searchChar + "' at position: " + firstOccurrence);
            System.out.println("Last occurrence of '" + searchChar + "' at position: " + lastOccurrence);
        } else {
            System.out.println("\nThe character '" + searchChar + "' was not found in the string.");
        }

        sc.close();
    }
}

/*Enter a string: abbbbaaggsvvadshd
Enter a character to search in the string: a

Character Array:
abbbbaaggsvvadshd

First occurrence of 'a' at position: 0
Last occurrence of 'a' at position: 12 */


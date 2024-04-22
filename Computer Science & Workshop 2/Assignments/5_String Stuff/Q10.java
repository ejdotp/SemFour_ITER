 //10. Interactive String Explorer: Prompt the user for a string. Display a menu with options to perform various operations: convert to lowercase/uppercase, search for a character/index, or concatenate with another string. Based on user selection, perform the appropriate string operation and show the result.  

import java.util.Scanner;

class StringExplorer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        Boolean fax = true;

        while (fax) {
            // Display menu options
            System.out.println("\nString Explorer Menu:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Get character at index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Convert to lowercase
                    String lowercaseString = inputString.toLowerCase();
                    System.out.println("Result: " + lowercaseString);
                    break;
                case 2:
                    // Convert to uppercase
                    String uppercaseString = inputString.toUpperCase();
                    System.out.println("Result: " + uppercaseString);
                    break;
                case 3:
                    // Search for a character
                    System.out.print("Enter a character to search for: ");
                    char searchChar = sc.next().charAt(0);
                    int charIndex = inputString.indexOf(searchChar);
                    if (charIndex != -1) {
                        System.out.println("Character '" + searchChar + "' found at index: " + charIndex);
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    // Get character at index
                    System.out.print("Enter an index to retrieve the character: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < inputString.length()) {
                        char characterAtIndex = inputString.charAt(index);
                        System.out.println("Character at index " + index + ": " + characterAtIndex);
                    } else {
                        System.out.println("Invalid index. Please enter a valid index within the range of the string.");
                    }
                    break;
                case 5:
                    // Concatenate with another string
                    System.out.print("Enter another string to concatenate: ");
                    String anotherString = sc.next();
                    String concatenatedString = inputString.concat(anotherString);
                    System.out.println("Result after concatenation: " + concatenatedString);
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting...");
                    fax = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }
    }
}

/*Enter a string: AbCdEfGhIjKlMnOpQrStUvWxYz

String Explorer Menu:
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter your choice: 1
Result: abcdefghijklmnopqrstuvwxyz

String Explorer Menu:
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter your choice: 2
Result: ABCDEFGHIJKLMNOPQRSTUVWXYZ

String Explorer Menu:
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter your choice: 3
Enter a character to search for: e
Character 'e' not found in the string.

String Explorer Menu:
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter your choice: 4
Enter an index to retrieve the character: 4
Character at index 4: E

String Explorer Menu:
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter your choice: 5
Enter another string to concatenate: 123456789
Result after concatenation: AbCdEfGhIjKlMnOpQrStUvWxYz123456789

String Explorer Menu:
1. Convert to lowercase
2. Convert to uppercase
3. Search for a character
4. Get character at index
5. Concatenate with another string
6. Exit
Enter your choice: 6
Exiting...*/
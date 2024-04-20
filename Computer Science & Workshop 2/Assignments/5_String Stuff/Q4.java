//4.Create a Java program that uses StringBuilder to perform a series of text manipulations
//on a user-provided string. The program should allow users to:
//a.Add a substring at a specified position.
//b.Remove a range of characters from the string.
//c.Modify a character at a specified index.
//d.Concatenate another string at the end.
//e.Display the current string after each operation.
//The program should repeatedly prompt the user to choose an operation until they decide
//to exit. After each operation, it should display the modified string, demonstrating
//the mutable nature of StringBuilder.

import java.util.Scanner;

class TextManipulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        StringBuilder text = new StringBuilder(inputString);
        Boolean ForReals = true;
        
        while (ForReals)
        {
            System.out.println("Text Manipulation Menu:");
            System.out.println("1. Add substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter substring to add: ");
                    String substring = " "+sc.nextLine();
                    System.out.print("Enter position to add at: ");
                    int position = sc.nextInt();
                    text.insert(position, substring);
                    break;
                case 2:
                    System.out.print("Enter start index of range to remove: ");
                    int startIndex = sc.nextInt();
                    System.out.print("Enter end index of range to remove: ");
                    int endIndex = sc.nextInt();
                    text.delete(startIndex, endIndex);
                    break;
                case 3:
                    System.out.print("Enter index to modify: ");
                    int modifyIndex = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter new character: ");
                    char newChar = sc.nextLine().charAt(0);
                    text.setCharAt(modifyIndex, newChar);
                    break;
                case 4:
                    System.out.print("Enter string to concatenate: ");
                    String concatString = " "+sc.nextLine();
                    text.append(concatString);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    ForReals = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            
            System.out.println("Current string: " + text);
            System.out.println();
        }
    }
}

/*
Enter a string: Jake Peralta is an Amazing Human Being and Genius
Text Manipulation Menu:
1. Add substring at a specified position
2. Remove a range of characters
3. Modify a character at a specified index
4. Concatenate another string at the end
5. Exit
Enter your choice: 1
Enter substring to add: defs
Enter position to add at: 15
Current string: Jake Peralta is defs an Amazing Human Being and Genius

Text Manipulation Menu:
1. Add substring at a specified position
2. Remove a range of characters
3. Modify a character at a specified index
4. Concatenate another string at the end
5. Exit
Enter your choice: 2
Enter start index of range to remove: 17
Enter end index of range to remove: 20
Current string: Jake Peralta is an Amazing Human Being and Genius

Text Manipulation Menu:
1. Add substring at a specified position
2. Remove a range of characters
3. Modify a character at a specified index
4. Concatenate another string at the end
5. Exit
Enter your choice: 3
Enter index to modify: 17
Enter new character: s 
Current string: Jake Peralta is as Amazing Human Being and Genius

Text Manipulation Menu:
1. Add substring at a specified position
2. Remove a range of characters
3. Modify a character at a specified index
4. Concatenate another string at the end
5. Exit
Enter your choice: 4
Enter string to concatenate: for reals
Current string: Jake Peralta is a n Amazing Human Being and Genius for reals

Text Manipulation Menu:
1. Add substring at a specified position
2. Remove a range of characters
3. Modify a character at a specified index
4. Concatenate another string at the end
5. Exit
Enter your choice: 5
Exiting...
Current string: Jake Peralta is a n Amazing Human Being and Geniusfor reals
 */
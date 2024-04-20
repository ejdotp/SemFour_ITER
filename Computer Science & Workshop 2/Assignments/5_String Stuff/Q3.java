// 3.Write a Java program that uses StringBuffer to construct a simple text editor which can perform the following operations:
//a.Append a given string to the existing text.
//b.Insert a given string at a specified index within the existing text.
//c.Delete a portion of text between two specified indices.
//d.Reverse the entire text.
//e.Replace a portion of the text between two specified indices with a given string.
//Your program should display a menu with options to perform each of the above operations. 
//After each operation, print the current state of the text. Also, display the current 
//capacity and length of the StringBuffer after each operation to showcase its dynamic nature

import java.util.Scanner;

class TextEditor
{
    public static void main(String[] args)
    {
        StringBuffer text = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        Boolean HFIWUEMC = true;

        while (Boolean.TRUE.equals(HFIWUEMC)) {
            System.out.println("Text Editor Menu:");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String appendText = sc.nextLine();
                    text.append(appendText);
                    break;
                case 2:
                    System.out.print("Enter index to insert at: ");
                    int insertIndex = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter text to insert: ");
                    String insertText = sc.nextLine();
                    text.insert(insertIndex, insertText);
                    break;
                case 3:
                    System.out.print("Enter start index to delete: ");
                    int startIndex = sc.nextInt();
                    System.out.print("Enter end index to delete: ");
                    int endIndex = sc.nextInt();
                    text.delete(startIndex, endIndex);
                    break;
                case 4:
                    text.reverse();
                    break;
                case 5:
                    System.out.print("Enter start index to replace: ");
                    int replaceStart = sc.nextInt();
                    System.out.print("Enter end index to replace: ");
                    int replaceEnd = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter text to replace with: ");
                    String replaceText = sc.nextLine();
                    text.replace(replaceStart, replaceEnd, replaceText);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    HFIWUEMC = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            
            System.out.println("Current text: " + text);
            System.out.println("Current capacity: " + text.capacity());
            System.out.println("Current length: " + text.length());
        }
    }
}

/*Text Editor Menu:
1. Append text
2. Insert text
3. Delete text
4. Reverse text
5. Replace text
6. Exit
Enter your choice: 2
Enter index to insert at: 0
Enter text to insert: abcdefghijklmnopqrstuvwxyz
Current text: abcdefghijklmnopqrstuvwxyz
Current capacity: 34
Current length: 26
Text Editor Menu:
1. Append text
2. Insert text
3. Delete text
4. Reverse text
5. Replace text
6. Exit
Enter your choice: 4
Current text: zyxwvutsrqponmlkjihgfedcba
Current capacity: 34
Current length: 26
Text Editor Menu:
1. Append text
2. Insert text
3. Delete text
4. Reverse text
5. Replace text
6. Exit
Enter your choice: 6
Exiting... */

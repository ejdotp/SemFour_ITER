/*Rename a File: Develop a Java application that renames a specified file.
The program should request the current file name and the new file name
from the user, renaming the file accordingly and confirming the action
upon completion */  

import java.io.File;
import java.util.Scanner;

class RenameFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the current file name
        System.out.print("Enter the current file name: ");
        String currentFileName = sc.nextLine();

        // Create a File object for the current file
        File currentFile = new File(currentFileName);

        // Check if the current file exists
        if (!currentFile.exists()) {
            System.out.println("Error: The specified file does not exist.");
            System.exit(1);
        }

        // Prompt the user for the new file name
        System.out.print("Enter the new file name: ");
        String newFileName = sc.nextLine();

        // Create a File object for the new file
        File newFile = new File(newFileName);

        // Check if the new file already exists
        if (newFile.exists()) {
            System.out.println("Error: The specified new file name already exists.");
            System.exit(1);
        }

        // Rename the file
        boolean isRenamed = currentFile.renameTo(newFile);

        // Check if the file was successfully renamed
        if (isRenamed) {
            System.out.println("File has been successfully renamed to '" + newFileName + "'.");
        } else {
            System.out.println("Error: Failed to rename the file.");
        }
        sc.close();
    }
}

/*Enter the current file name: abc.txt
Enter the new file name: cba.txt
File has been successfully renamed to 'cba.txt'. */
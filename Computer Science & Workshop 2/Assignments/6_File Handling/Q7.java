/*Copy File Content: Write a Java program that copies the content from one file (source)
to another (destination). The program should prompt the user for both source and destination
file paths and perform the copy operation, ensuring that it doesn't overwrite an existing
file without user confirmation. */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the source file path
        System.out.print("Enter the source file path: ");
        String sourceFilePath = sc.nextLine();

        // Create a File object for the source file
        File sourceFile = new File(sourceFilePath);

        // Check if the source file exists
        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("Error: The specified source file does not exist.");
            System.exit(1);
        }

        // Prompt the user for the destination file path
        System.out.print("Enter the destination file path: ");
        String destinationFilePath = sc.nextLine();

        // Create a File object for the destination file
        File destinationFile = new File(destinationFilePath);

        // Check if the destination file exists
        if (destinationFile.exists()) {
            // Ask for confirmation before overwriting the destination file
            System.out.print("Warning: The destination file already exists. Do you want to overwrite it? (yes/no): ");
            String overwriteChoice = sc.nextLine();
            if (!overwriteChoice.equalsIgnoreCase("yes")) {
                System.out.println("Operation aborted. Destination file was not overwritten.");
                System.exit(0);
            }
        }

        // Perform the copy operation
        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied successfully from '" + sourceFilePath + "' to '" + destinationFilePath + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }

        sc.close();
    }
}

/*Recursive Directory Listing: Write a Java program that recursively lists
all files and subdirectories within a given directory. The program should
prompt the user for the directory path and then display a structured list
of all contents, including files and directories nested within any
subdirectories. */  

import java.io.File;
import java.util.Scanner;

class RecursiveDirectoryListing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the directory path
        System.out.print("Enter the directory path: ");
        String directoryPath = sc.nextLine();

        // Create a File object for the specified directory
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Error: The specified directory does not exist.");
            System.exit(1);
        }

        // Display directory listing
        System.out.println("Directory listing for " + directoryPath + ":");
        listFilesAndSubdirectories(directory, 0);

        sc.close();
    }

    // Recursive method to list files and subdirectories
    private static void listFilesAndSubdirectories(File directory, int depth) {
        // Get all files and subdirectories within the directory
        File[] filesAndDirs = directory.listFiles();

        // Iterate over the files and subdirectories
        for (File fileOrDir : filesAndDirs) {
            // Print indentation based on depth
            for (int i = 0; i < depth; i++) {
                System.out.print("  ");
            }

            // Print file or directory name
            System.out.println(fileOrDir.getName());

            // Recursive call for subdirectories
            if (fileOrDir.isDirectory()) {
                listFilesAndSubdirectories(fileOrDir, depth + 1);
            }
        }
    }
}

/*Enter the directory path: D:\SemFour_ITER\Computer Science & Workshop 2
Directory listing for D:\SemFour_ITER\Computer Science & Workshop 2:
Assignments
  1_Object Oriented
    Assignment 1.pdf
    .
    .
    .
Class Lectures
  12_Object Oriented Programming
    1_Encapsulation
      TestEncapsulation.java
    2_Inheritance
      Heirarchial.java
      .
      .
      .*/
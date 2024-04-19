/*List Files and Directories: Write a program in Java that asks the user for a directory
path and then lists all files and subdirectories in that directory. If the directory does
not exist, the program should inform the user.*/

import java.io.File;
import java.util.Scanner;

class ListFilesAndDirectories
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a directory path
        System.out.print("Enter the directory path: ");
        String directoryPath = sc.nextLine();

        // Create a File object for the specified directory
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Error: The specified directory does not exist.");
        }
        else{
            // List all files and subdirectories in the specified directory
            File[] filesAndDirs = directory.listFiles();
            System.out.println("Files and subdirectories inside are:");
            for (File file : filesAndDirs) {
                if (file.isFile()) {
                    System.out.println("[File] " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("[Directory] " + file.getName());
                }
            }
        }
        sc.close();
    }
}

/*Enter the directory path: D:\SemFour_ITER\Computer Science & Workshop 2\Assignments
Files and subdirectories inside are:
[Directory] 1_Object Oriented
[Directory] 2_Generics and Collections
[Directory] 3_Error Handling
[Directory] 4_Garbage Collection
[Directory] 5_String Stuff
[Directory] 6_File Handling*/

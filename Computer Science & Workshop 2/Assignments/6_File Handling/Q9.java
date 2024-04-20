/*Display File Metadata: Create a Java program that displays metadata of
a specified file. The user should be able to input the file name, and the
program should output the file size, last modified date, and other
available attributes */  

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class FileMetadata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the file name
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        // Create a File object for the specified file
        File file = new File(fileName);

        // Check if the file exists
        if (!file.exists()) {
            System.out.println("Error: The specified file does not exist.");
            System.exit(1);
        }

        // Display file metadata
        System.out.println("File Metadata:");
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Last Modified: " + formatDate(file.lastModified()));
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is File: " + file.isFile());

        sc.close();
    }

    // Method to format date
    private static String formatDate(long milliseconds) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(milliseconds);
    }
}

/*Enter the file name: cba.txt
File Metadata:
Name: cba.txt
Path: D:\SemFour_ITER\cba.txt
Size: 0 bytes
Last Modified: 19-04-2024
Readable: true
Writable: true
Executable: true
Is Directory: false
Is File: true */


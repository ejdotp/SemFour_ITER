/*Filter and List Specific File Types: Create a Java application that lists all
the ".txt" files in a given directory. The program should prompt the user for the
directory path and then display a list of all text files found in that directory. */  

import java.io.File;
import java.util.Scanner;

class ListTextFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a directory path
        System.out.print("Enter the directory path: ");
        String directoryPath = sc.nextLine();

        // Create a File object for the specified directory
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (!directory.exists() || !directory.isDirectory())
            System.out.println("Error: The specified directory does not exist.");
        else{
            // List all ".txt" files in the specified directory
            File[] files = directory.listFiles();
            System.out.println("Text files in " + directoryPath + ":");
            for (File file : files)
                if (file.isFile() && file.getName().endsWith(".txt"))
                    System.out.println(file.getName());
        } 
        sc.close();
    }
}

/*Enter the directory path: D:\SemFour_ITER
Text files in D:\SemFour_ITER:
diary.txt
myfile.txt */

/*Delete a Specific File: Write a Java program where the user can enter the name of a file
to be deleted from the system. The program should check if the file exists and delete it,
providing a confirmation message upon successful deletion or an error messageif the file
does not exist */

import java.io.File;
import java.util.Scanner;

class DeleteFile
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the name of the file to be deleted
        System.out.print("Enter the name of the file to be deleted: ");
        String fileName = sc.nextLine();

        // Create a File object for the specified file
        File fileToDelete = new File(fileName);

        // Check if the file exists
        if (fileToDelete.exists()) {
            // Attempt to delete the file
            boolean isDeleted = fileToDelete.delete();
            if (isDeleted)
                System.out.println("File '" + fileName + "' has been successfully deleted.");
            else
                System.out.println("Error: Failed to delete the file '" + fileName + "'.");
        } else {
            System.out.println("Error: The file '" + fileName + "' does not exist.");
        }
        sc.close();
    }
}

/*Enter the name of the file to be deleted: myfile.txt
File 'myfile.txt' has been successfully deleted. */


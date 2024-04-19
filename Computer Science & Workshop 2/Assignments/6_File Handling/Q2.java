/*Read from a File: Write a Java application that opens the "diary.txt" file created in the 
previous question and displays its content on the console. The program should handle cases 
where the file does not exist by displaying an appropriate error message.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadDiaryFile
{
    public static void main(String[] args)
    {
        // Create a File object for the diary file
        File diaryFile = new File("diary.txt");

        // Check if the file exists
        if (!diaryFile.exists()) {
            System.out.println("Error: diary file does not exist.");
        }
        else{
            try {
                // Create a Scanner object to read from the diary file
                Scanner sc = new Scanner(diaryFile);

                // Display the content of the file
                System.out.println("Diary entries:");
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }

                // Close the sc
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error: diary file not found.");
                e.printStackTrace();
            }
        }
    }
}

/*Diary entries:
19-04-2024: Secret Secret Secret */

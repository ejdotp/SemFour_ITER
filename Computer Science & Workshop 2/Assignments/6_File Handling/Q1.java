/*Create and Write to a File: Write a Java program that prompts the user for a
diary entry, then creates a file named "diary.txt" and writes the current
date followed by the user's entry into this file. Ensure the program checks
if the file already exists and informs the user, to avoid overwriting any
previous content.*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DiaryEntry {
    public static void main(String[] args) {
        
        String entry = "Secret Secret Secret"; //input

        // Get the current date
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(currentDate);

        // Create a File object for the diary file
        File diaryFile = new File("diary.txt");

        // Check if the file already exists
        if (diaryFile.exists())
            System.out.println("Warning: diary file already exists. Appending to existing file.");
        else{
            try {
                // Create a FileWriter object to write to the diary file
                FileWriter writer = new FileWriter(diaryFile); //will override
                // FileWriter writer = new FileWriter(diaryFile, true); append mode, wont override
                // FileWriter writer = new FileWriter(diaryFile, false); will also override

                // Write the date and the user's entry to the file
                writer.write(formattedDate + ": " + entry + "\n");

                // Close the writer
                writer.close();

                System.out.println("Diary entry has been saved to diary.txt.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the diary file.");
                e.printStackTrace();
            }
        }
    }
}

//Diary entry has been saved to diary.txt.

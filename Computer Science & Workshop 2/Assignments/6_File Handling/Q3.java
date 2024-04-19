/*Append Content to an Existing File: Write a Java program that adds a new diary entry to the 
"diary.txt" file without overwriting its existing content. The program should ask the user 
for the new entry and append it to the file along with a timestamp*/  

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class AppendToDiaryFile
{
    public static void main(String[] args)
    {
        System.out.print("Enter your new diary entry: More Secrets!");
        String newEntry = "More Secrets!"; //input

        // Get the current date and time
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(currentDate);

        // Create a FileWriter object to append to the diary file
        try {
            FileWriter writer = new FileWriter("diary.txt", true);

            // Write the timestamp and the new entry to the file
            writer.write("\n" + formattedDate + ": " + newEntry);

            // Close the writer
            writer.close();

            System.out.println("\nNew diary entry has been added to diary.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the diary file.");
            e.printStackTrace();
        }
    }
}

//Enter your new diary entry: More Secrets!
//New diary entry has been added to diary.txt.


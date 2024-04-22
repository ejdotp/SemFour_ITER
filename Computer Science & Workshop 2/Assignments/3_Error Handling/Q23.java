/* Write a program that reads data from a file and performs some processing. Handle
checked IOException by using try-catch block to catch and handle the exception. */

import java.io.*;

public class Q23 {
    public static void main(String[] args) {
        
        try {
            FileInputStream file = new FileInputStream(new File("Q.txt"));
            int i = file.read();
            if(i!=-1) {
                System.out.print("File is readable");
               
            }
        }
        catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

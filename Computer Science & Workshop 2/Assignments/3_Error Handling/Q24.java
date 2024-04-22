/* Write a Java program to demonstrate a checked exception (e.g.,
FileNotFoundException) being thrown and caught using try-catch block. */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Question24 {
        public static void main(String[] args) {

        File file = new File("myfile.txt");
        try {
            if(!file.exists())
                throw new FileNotFoundException();
        }
        catch (FileNotFoundException e) {
            //System.out.println("File not found: " + file.getName());
            e.printStackTrace();
        }
    }
}
